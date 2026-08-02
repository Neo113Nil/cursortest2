package javazoom.jl.decoder;

import kotlin.jvm.internal.ShortCompanionObject;

/* loaded from: classes9.dex */
public abstract class Obuffer {
    public static final int MAXCHANNELS = 2;
    public static final int OBUFFERSIZE = 2304;

    private final short clip(float f) {
        return f > 32767.0f ? ShortCompanionObject.MAX_VALUE : f < -32768.0f ? ShortCompanionObject.MIN_VALUE : (short) f;
    }

    public abstract void append(int i, short s);

    public abstract void clear_buffer();

    public abstract void close();

    public abstract void set_stop_flag();

    public abstract void write_buffer(int i);

    public void appendSamples(int i, float[] fArr) {
        for (int i2 = 0; i2 < 32; i2++) {
            append(i, clip(fArr[i2]));
        }
    }
}
