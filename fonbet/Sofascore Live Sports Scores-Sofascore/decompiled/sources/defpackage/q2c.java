package defpackage;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public interface q2c {
    void C(int i, boolean z);

    void D(int i, d74 d74Var, long j);

    void F(z3c z3cVar, Handler handler);

    void c(Bundle bundle);

    void d(int i, int i2, int i3, long j);

    MediaFormat e();

    void flush();

    ByteBuffer h(int i);

    void i(Surface surface);

    void l(int i, long j);

    int m();

    int n(MediaCodec.BufferInfo bufferInfo);

    ByteBuffer o(int i);

    void release();

    void setVideoScalingMode(int i);
}
