package g6;

import android.os.Handler;
import com.facebook.GraphRequest;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class V {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f47012a;

    /* renamed from: b, reason: collision with root package name */
    public final GraphRequest f47013b;

    /* renamed from: c, reason: collision with root package name */
    public final long f47014c;

    /* renamed from: d, reason: collision with root package name */
    public long f47015d;

    /* renamed from: e, reason: collision with root package name */
    public long f47016e;

    /* renamed from: f, reason: collision with root package name */
    public long f47017f;

    public V(Handler handler, GraphRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f47012a = handler;
        this.f47013b = request;
        this.f47014c = C4331C.A();
    }

    public final void a(long j10) {
        long j11 = this.f47015d + j10;
        this.f47015d = j11;
        if (j11 >= this.f47016e + this.f47014c || j11 >= this.f47017f) {
            c();
        }
    }

    public final void b(long j10) {
        this.f47017f += j10;
    }

    public final void c() {
        if (this.f47015d > this.f47016e) {
            this.f47013b.o();
        }
    }
}
