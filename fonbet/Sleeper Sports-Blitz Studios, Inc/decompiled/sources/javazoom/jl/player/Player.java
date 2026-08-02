package javazoom.jl.player;

import java.io.InputStream;
import javazoom.jl.decoder.Bitstream;
import javazoom.jl.decoder.BitstreamException;
import javazoom.jl.decoder.Decoder;
import javazoom.jl.decoder.Header;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.decoder.SampleBuffer;

/* loaded from: classes9.dex */
public class Player {
    private AudioDevice audio;
    private Bitstream bitstream;
    private boolean closed;
    private boolean complete;
    private Decoder decoder;
    private int frame;
    private int lastPosition;

    public Player(InputStream inputStream) throws JavaLayerException {
        this(inputStream, null);
    }

    public Player(InputStream inputStream, AudioDevice audioDevice) throws JavaLayerException {
        this.frame = 0;
        this.closed = false;
        this.complete = false;
        this.lastPosition = 0;
        this.bitstream = new Bitstream(inputStream);
        this.decoder = new Decoder();
        if (audioDevice != null) {
            this.audio = audioDevice;
        } else {
            this.audio = FactoryRegistry.systemRegistry().createAudioDevice();
        }
        this.audio.open(this.decoder);
    }

    public void play() throws JavaLayerException {
        play(Integer.MAX_VALUE);
    }

    public boolean play(int i) throws JavaLayerException {
        AudioDevice audioDevice;
        boolean z = true;
        while (true) {
            int i2 = i - 1;
            if (i <= 0 || !z) {
                break;
            }
            z = decodeFrame();
            i = i2;
        }
        if (z || (audioDevice = this.audio) == null) {
            return z;
        }
        audioDevice.flush();
        synchronized (this) {
            this.complete = !this.closed;
            close();
        }
        return z;
    }

    public synchronized void close() {
        AudioDevice audioDevice = this.audio;
        if (audioDevice != null) {
            this.closed = true;
            this.audio = null;
            audioDevice.close();
            this.lastPosition = audioDevice.getPosition();
            try {
                this.bitstream.close();
            } catch (BitstreamException unused) {
            }
        }
    }

    public synchronized boolean isComplete() {
        return this.complete;
    }

    public int getPosition() {
        int i = this.lastPosition;
        AudioDevice audioDevice = this.audio;
        return audioDevice != null ? audioDevice.getPosition() : i;
    }

    protected boolean decodeFrame() throws JavaLayerException {
        Header readFrame;
        try {
            if (this.audio == null || (readFrame = this.bitstream.readFrame()) == null) {
                return false;
            }
            SampleBuffer sampleBuffer = (SampleBuffer) this.decoder.decodeFrame(readFrame, this.bitstream);
            synchronized (this) {
                AudioDevice audioDevice = this.audio;
                if (audioDevice != null) {
                    audioDevice.write(sampleBuffer.getBuffer(), 0, sampleBuffer.getBufferLength());
                }
            }
            this.bitstream.closeFrame();
            return true;
        } catch (RuntimeException e) {
            throw new JavaLayerException("Exception decoding audio frame", e);
        }
    }
}
