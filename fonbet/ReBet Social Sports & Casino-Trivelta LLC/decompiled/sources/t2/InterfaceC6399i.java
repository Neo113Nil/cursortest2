package t2;

import android.media.MediaCodec;
import android.media.metrics.LogSessionId;
import android.view.Surface;
import java.nio.ByteBuffer;

/* renamed from: t2.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC6399i {

    /* renamed from: t2.i$a */
    public interface a {
        InterfaceC6399i a(androidx.media3.common.a aVar, LogSessionId logSessionId);

        InterfaceC6399i b(androidx.media3.common.a aVar, Surface surface, boolean z10, LogSessionId logSessionId);
    }

    /* renamed from: t2.i$b */
    public interface b {
        boolean a();

        InterfaceC6399i b(androidx.media3.common.a aVar, LogSessionId logSessionId);

        boolean c();

        InterfaceC6399i d(androidx.media3.common.a aVar, LogSessionId logSessionId);
    }

    boolean b();

    void c(k1.f fVar);

    Surface d();

    androidx.media3.common.a e();

    boolean f(k1.f fVar);

    void g(long j10);

    String getName();

    androidx.media3.common.a getOutputFormat();

    MediaCodec.BufferInfo h();

    void i(boolean z10);

    ByteBuffer j();

    int k();

    androidx.media3.common.a l();

    void release();

    void signalEndOfInputStream();
}
