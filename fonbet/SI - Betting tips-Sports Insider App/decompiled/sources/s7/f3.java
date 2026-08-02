package s7;

import android.os.Looper;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class f3 extends z {

    /* renamed from: c, reason: collision with root package name */
    public com.google.android.gms.internal.measurement.h0 f22764c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f22765d;

    /* renamed from: e, reason: collision with root package name */
    public final r7.a f22766e;

    /* renamed from: f, reason: collision with root package name */
    public final io.sentry.android.replay.gestures.c f22767f;

    /* renamed from: g, reason: collision with root package name */
    public final io.sentry.util.network.b f22768g;

    public f3(f1 f1Var) {
        super(f1Var);
        this.f22765d = true;
        this.f22766e = new r7.a(9, this);
        this.f22767f = new io.sentry.android.replay.gestures.c(this);
        this.f22768g = new io.sentry.util.network.b(this);
    }

    @Override // s7.z
    public final boolean m() {
        return false;
    }

    public final void n() {
        j();
        if (this.f22764c == null) {
            this.f22764c = new com.google.android.gms.internal.measurement.h0(Looper.getMainLooper(), 0);
        }
    }
}
