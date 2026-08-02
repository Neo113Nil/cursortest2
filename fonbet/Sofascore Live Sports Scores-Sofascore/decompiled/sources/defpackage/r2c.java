package defpackage;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public interface r2c {
    void C(ArrayList arrayList);

    void D(ArrayList arrayList);

    void c(Bundle bundle);

    void d(int i, int i2, int i3, long j);

    MediaFormat e();

    void f(int i, d74 d74Var, long j, int i2);

    void flush();

    ByteBuffer h(int i);

    void i(Surface surface);

    void l(int i, long j);

    int m();

    int n(MediaCodec.BufferInfo bufferInfo);

    ByteBuffer o(int i);

    default boolean q(e3c e3cVar) {
        return false;
    }

    void release();

    void s(z3c z3cVar, Handler handler);

    void setVideoScalingMode(int i);

    void t();

    void x(int i);

    default void z(yq5 yq5Var) {
        yq5Var.run();
    }
}
