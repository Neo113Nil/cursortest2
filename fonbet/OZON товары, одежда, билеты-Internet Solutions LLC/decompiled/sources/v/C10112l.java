package v;

import I0.C3173b;
import android.hardware.camera2.TotalCaptureResult;
import androidx.concurrent.futures.b;
import v.C10132s;

/* renamed from: v.l, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final /* synthetic */ class C10112l implements b.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C10132s f101283a;

    @Override // androidx.concurrent.futures.b.c
    public final Object c(final b.a aVar) {
        final C10132s c10132s = this.f101283a;
        c10132s.getClass();
        c10132s.f101339c.execute(new Runnable() { // from class: v.m
            @Override // java.lang.Runnable
            public final void run() {
                final C10132s c10132s2 = C10132s.this;
                final long R11 = c10132s2.R();
                I.k.j(aVar, androidx.concurrent.futures.b.a(new b.c() { // from class: v.o
                    @Override // androidx.concurrent.futures.b.c
                    public final Object c(final b.a aVar2) {
                        C10132s c10132s3 = C10132s.this;
                        c10132s3.getClass();
                        final long j11 = R11;
                        c10132s3.t(new C10132s.c() { // from class: v.p
                            @Override // v.C10132s.c
                            public final boolean a(TotalCaptureResult totalCaptureResult) {
                                if (!C10132s.L(totalCaptureResult, j11)) {
                                    return false;
                                }
                                aVar2.c(null);
                                return true;
                            }
                        });
                        return C3173b.b(j11, "waitForSessionUpdateId:");
                    }
                }));
            }
        });
        return "updateSessionConfigAsync";
    }
}
