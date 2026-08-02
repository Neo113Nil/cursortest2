package lb;

import com.google.android.gms.common.api.internal.ComponentCallbacks2C3122c;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class a0 implements ComponentCallbacks2C3122c.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ X f55734a;

    public a0(X x10) {
        Objects.requireNonNull(x10);
        this.f55734a = x10;
    }

    @Override // com.google.android.gms.common.api.internal.ComponentCallbacks2C3122c.a
    public final void a(boolean z10) {
        boolean e10;
        C5435n c5435n;
        if (z10) {
            this.f55734a.f55722c = true;
            this.f55734a.b();
            return;
        }
        this.f55734a.f55722c = false;
        e10 = this.f55734a.e();
        if (e10) {
            c5435n = this.f55734a.f55721b;
            c5435n.c();
        }
    }
}
