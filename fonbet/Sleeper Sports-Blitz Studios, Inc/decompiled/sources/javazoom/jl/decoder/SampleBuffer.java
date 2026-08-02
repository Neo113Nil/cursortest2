package javazoom.jl.decoder;

/* loaded from: classes9.dex */
public class SampleBuffer extends Obuffer {
    private short[] buffer = new short[Obuffer.OBUFFERSIZE];
    private int[] bufferp = new int[2];
    private int channels;
    private int frequency;

    @Override // javazoom.jl.decoder.Obuffer
    public void close() {
    }

    @Override // javazoom.jl.decoder.Obuffer
    public void set_stop_flag() {
    }

    @Override // javazoom.jl.decoder.Obuffer
    public void write_buffer(int i) {
    }

    public SampleBuffer(int i, int i2) {
        this.channels = i2;
        this.frequency = i;
        for (int i3 = 0; i3 < i2; i3++) {
            this.bufferp[i3] = (short) i3;
        }
    }

    public int getChannelCount() {
        return this.channels;
    }

    public int getSampleFrequency() {
        return this.frequency;
    }

    public short[] getBuffer() {
        return this.buffer;
    }

    public int getBufferLength() {
        return this.bufferp[0];
    }

    @Override // javazoom.jl.decoder.Obuffer
    public void append(int i, short s) {
        short[] sArr = this.buffer;
        int[] iArr = this.bufferp;
        int i2 = iArr[i];
        sArr[i2] = s;
        iArr[i] = i2 + this.channels;
    }

    @Override // javazoom.jl.decoder.Obuffer
    public void appendSamples(int i, float[] fArr) {
        int i2 = this.bufferp[i];
        int i3 = 0;
        while (i3 < 32) {
            int i4 = i3 + 1;
            float f = fArr[i3];
            float f2 = 32767.0f;
            if (f <= 32767.0f) {
                f2 = -32767.0f;
                if (f >= -32767.0f) {
                    this.buffer[i2] = (short) f;
                    i2 += this.channels;
                    i3 = i4;
                }
            }
            f = f2;
            this.buffer[i2] = (short) f;
            i2 += this.channels;
            i3 = i4;
        }
        this.bufferp[i] = i2;
    }

    @Override // javazoom.jl.decoder.Obuffer
    public void clear_buffer() {
        for (int i = 0; i < this.channels; i++) {
            this.bufferp[i] = (short) i;
        }
    }
}
