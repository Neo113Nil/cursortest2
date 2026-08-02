package lb;

import android.app.Application;
import android.content.Context;
import com.google.android.gms.common.api.internal.ComponentCallbacks2C3122c;
import com.google.android.gms.internal.p002firebaseauthapi.zzahv;
import eb.C4196f;

/* loaded from: classes3.dex */
public final class X {

    /* renamed from: a, reason: collision with root package name */
    public volatile int f55720a;

    /* renamed from: b, reason: collision with root package name */
    public final C5435n f55721b;

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f55722c;

    public X(C4196f c4196f) {
        this(c4196f.l(), new C5435n(c4196f));
    }

    public final void b() {
        this.f55721b.b();
    }

    public final void c(zzahv zzahvVar) {
        if (zzahvVar == null) {
            return;
        }
        long zza = zzahvVar.zza();
        if (zza <= 0) {
            zza = 3600;
        }
        long zzb = zzahvVar.zzb() + (zza * 1000);
        C5435n c5435n = this.f55721b;
        c5435n.f55768b = zzb;
        c5435n.f55769c = -1L;
        if (e()) {
            this.f55721b.c();
        }
    }

    public final boolean e() {
        return this.f55720a > 0 && !this.f55722c;
    }

    public X(Context context, C5435n c5435n) {
        this.f55722c = false;
        this.f55720a = 0;
        this.f55721b = c5435n;
        ComponentCallbacks2C3122c.c((Application) context.getApplicationContext());
        ComponentCallbacks2C3122c.b().a(new a0(this));
    }
}
