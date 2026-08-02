package javazoom.jl.converter;

import javazoom.jl.decoder.Obuffer;

/* loaded from: classes9.dex */
public class WaveFileObuffer extends Obuffer {
    private short[] buffer;
    private short[] bufferp;
    private int channels;
    short[] myBuffer = new short[2];
    private WaveFile outWave;

    @Override // javazoom.jl.decoder.Obuffer
    public void clear_buffer() {
    }

    @Override // javazoom.jl.decoder.Obuffer
    public void set_stop_flag() {
    }

    public WaveFileObuffer(int i, int i2, String str) {
        if (str == null) {
            throw new NullPointerException("FileName");
        }
        this.buffer = new short[Obuffer.OBUFFERSIZE];
        this.bufferp = new short[2];
        this.channels = i;
        for (int i3 = 0; i3 < i; i3++) {
            this.bufferp[i3] = (short) i3;
        }
        WaveFile waveFile = new WaveFile();
        this.outWave = waveFile;
        waveFile.OpenForWrite(str, i2, (short) 16, (short) this.channels);
    }

    @Override // javazoom.jl.decoder.Obuffer
    public void append(int i, short s) {
        short[] sArr = this.buffer;
        short[] sArr2 = this.bufferp;
        sArr[sArr2[i]] = s;
        sArr2[i] = (short) (sArr2[i] + this.channels);
    }

    @Override // javazoom.jl.decoder.Obuffer
    public void write_buffer(int i) {
        this.outWave.WriteData(this.buffer, this.bufferp[0]);
        for (int i2 = 0; i2 < this.channels; i2++) {
            this.bufferp[i2] = (short) i2;
        }
    }

    @Override // javazoom.jl.decoder.Obuffer
    public void close() {
        this.outWave.Close();
    }
}
