package javazoom.jl.player;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javazoom.jl.decoder.JavaLayerException;

/* loaded from: classes9.dex */
public class JavaSoundAudioDevice extends AudioDeviceBase {
    private SourceDataLine source = null;
    private AudioFormat fmt = null;
    private byte[] byteBuf = new byte[4096];

    @Override // javazoom.jl.player.AudioDeviceBase
    protected void openImpl() throws JavaLayerException {
    }

    protected void setAudioFormat(AudioFormat audioFormat) {
        this.fmt = audioFormat;
    }

    protected AudioFormat getAudioFormat() {
        if (this.fmt == null) {
            this.fmt = new AudioFormat(r0.getOutputFrequency(), 16, getDecoder().getOutputChannels(), true, false);
        }
        return this.fmt;
    }

    protected DataLine.Info getSourceLineInfo() {
        return new DataLine.Info(SourceDataLine.class, getAudioFormat());
    }

    public void open(AudioFormat audioFormat) throws JavaLayerException {
        if (isOpen()) {
            return;
        }
        setAudioFormat(audioFormat);
        openImpl();
        setOpen(true);
    }

    protected void createSource() throws JavaLayerException {
        try {
            SourceDataLine line = AudioSystem.getLine(getSourceLineInfo());
            if (line instanceof SourceDataLine) {
                SourceDataLine sourceDataLine = line;
                this.source = sourceDataLine;
                sourceDataLine.open(this.fmt);
                this.source.start();
            }
            e = null;
        } catch (RuntimeException e) {
            e = e;
        } catch (LineUnavailableException e2) {
            e = e2;
        } catch (LinkageError e3) {
            e = e3;
        }
        if (this.source == null) {
            throw new JavaLayerException("cannot obtain source audio line", e);
        }
    }

    public int millisecondsToBytes(AudioFormat audioFormat, int i) {
        return (int) ((i * ((audioFormat.getSampleRate() * audioFormat.getChannels()) * audioFormat.getSampleSizeInBits())) / 8000.0d);
    }

    @Override // javazoom.jl.player.AudioDeviceBase
    protected void closeImpl() {
        SourceDataLine sourceDataLine = this.source;
        if (sourceDataLine != null) {
            sourceDataLine.close();
        }
    }

    @Override // javazoom.jl.player.AudioDeviceBase
    protected void writeImpl(short[] sArr, int i, int i2) throws JavaLayerException {
        if (this.source == null) {
            createSource();
        }
        this.source.write(toByteArray(sArr, i, i2), 0, i2 * 2);
    }

    protected byte[] getByteArray(int i) {
        if (this.byteBuf.length < i) {
            this.byteBuf = new byte[i + 1024];
        }
        return this.byteBuf;
    }

    protected byte[] toByteArray(short[] sArr, int i, int i2) {
        byte[] byteArray = getByteArray(i2 * 2);
        int i3 = 0;
        while (true) {
            int i4 = i2 - 1;
            if (i2 <= 0) {
                return byteArray;
            }
            int i5 = i + 1;
            short s = sArr[i];
            int i6 = i3 + 1;
            byteArray[i3] = (byte) s;
            i3 += 2;
            byteArray[i6] = (byte) (s >>> 8);
            i = i5;
            i2 = i4;
        }
    }

    @Override // javazoom.jl.player.AudioDeviceBase
    protected void flushImpl() {
        SourceDataLine sourceDataLine = this.source;
        if (sourceDataLine != null) {
            sourceDataLine.drain();
        }
    }

    @Override // javazoom.jl.player.AudioDevice
    public int getPosition() {
        SourceDataLine sourceDataLine = this.source;
        if (sourceDataLine != null) {
            return (int) (sourceDataLine.getMicrosecondPosition() / 1000);
        }
        return 0;
    }

    public void test() throws JavaLayerException {
        try {
            open(new AudioFormat(22050.0f, 16, 1, true, false));
            write(new short[2205], 0, 2205);
            flush();
            close();
        } catch (RuntimeException e) {
            throw new JavaLayerException("Device test failed: " + e);
        }
    }
}
