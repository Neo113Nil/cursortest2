package javazoom.jl.player.advanced;

import java.io.InputStream;
import javazoom.jl.decoder.Bitstream;
import javazoom.jl.decoder.BitstreamException;
import javazoom.jl.decoder.Decoder;
import javazoom.jl.decoder.Header;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.decoder.SampleBuffer;
import javazoom.jl.player.AudioDevice;
import javazoom.jl.player.FactoryRegistry;

/* loaded from: classes9.dex */
public class AdvancedPlayer {
    private AudioDevice audio;
    private Bitstream bitstream;
    private boolean closed;
    private boolean complete;
    private Decoder decoder;
    private int lastPosition;
    private PlaybackListener listener;

    public AdvancedPlayer(InputStream inputStream) throws JavaLayerException {
        this(inputStream, null);
    }

    public AdvancedPlayer(InputStream inputStream, AudioDevice audioDevice) throws JavaLayerException {
        this.closed = false;
        this.complete = false;
        this.lastPosition = 0;
        this.bitstream = new Bitstream(inputStream);
        if (audioDevice != null) {
            this.audio = audioDevice;
        } else {
            this.audio = FactoryRegistry.systemRegistry().createAudioDevice();
        }
        AudioDevice audioDevice2 = this.audio;
        Decoder decoder = new Decoder();
        this.decoder = decoder;
        audioDevice2.open(decoder);
    }

    public void play() throws JavaLayerException {
        play(Integer.MAX_VALUE);
    }

    public boolean play(int i) throws JavaLayerException {
        PlaybackListener playbackListener = this.listener;
        if (playbackListener != null) {
            playbackListener.playbackStarted(createEvent(PlaybackEvent.STARTED));
        }
        boolean z = true;
        while (true) {
            int i2 = i - 1;
            if (i <= 0 || !z) {
                break;
            }
            z = decodeFrame();
            i = i2;
        }
        AudioDevice audioDevice = this.audio;
        if (audioDevice != null) {
            audioDevice.flush();
            synchronized (this) {
                this.complete = true ^ this.closed;
                close();
            }
            PlaybackListener playbackListener2 = this.listener;
            if (playbackListener2 != null) {
                playbackListener2.playbackFinished(createEvent(audioDevice, PlaybackEvent.STOPPED));
                return z;
            }
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

    protected boolean skipFrame() throws JavaLayerException {
        if (this.bitstream.readFrame() == null) {
            return false;
        }
        this.bitstream.closeFrame();
        return true;
    }

    public boolean play(int i, int i2) throws JavaLayerException {
        boolean z = true;
        int i3 = i;
        while (true) {
            int i4 = i3 - 1;
            if (i3 <= 0 || !z) {
                break;
            }
            z = skipFrame();
            i3 = i4;
        }
        return play(i2 - i);
    }

    private PlaybackEvent createEvent(int i) {
        return createEvent(this.audio, i);
    }

    private PlaybackEvent createEvent(AudioDevice audioDevice, int i) {
        return new PlaybackEvent(this, i, audioDevice.getPosition());
    }

    public void setPlayBackListener(PlaybackListener playbackListener) {
        this.listener = playbackListener;
    }

    public PlaybackListener getPlayBackListener() {
        return this.listener;
    }

    public void stop() {
        this.listener.playbackFinished(createEvent(PlaybackEvent.STOPPED));
        close();
    }
}
