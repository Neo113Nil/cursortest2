package n0;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;
import org.jetbrains.annotations.NotNull;

/* renamed from: n0.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C8399t {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f76221a;

    /* renamed from: b, reason: collision with root package name */
    private final int f76222b;

    /* renamed from: c, reason: collision with root package name */
    private long f76223c = 0;

    /* renamed from: d, reason: collision with root package name */
    private EdgeEffect f76224d;

    /* renamed from: e, reason: collision with root package name */
    private EdgeEffect f76225e;

    /* renamed from: f, reason: collision with root package name */
    private EdgeEffect f76226f;

    /* renamed from: g, reason: collision with root package name */
    private EdgeEffect f76227g;

    /* renamed from: h, reason: collision with root package name */
    private EdgeEffect f76228h;

    /* renamed from: i, reason: collision with root package name */
    private EdgeEffect f76229i;

    /* renamed from: j, reason: collision with root package name */
    private EdgeEffect f76230j;

    /* renamed from: k, reason: collision with root package name */
    private EdgeEffect f76231k;

    public C8399t(@NotNull Context context, int i11) {
        this.f76221a = context;
        this.f76222b = i11;
    }

    private final EdgeEffect e() {
        int i11 = Build.VERSION.SDK_INT;
        Context context = this.f76221a;
        EdgeEffect a11 = i11 >= 31 ? C8381b.f76147a.a(context, null) : new C8362C(context);
        a11.setColor(this.f76222b);
        if (!Z1.q.c(this.f76223c, 0L)) {
            long j11 = this.f76223c;
            a11.setSize((int) (j11 >> 32), (int) (j11 & 4294967295L));
        }
        return a11;
    }

    private static boolean w(EdgeEffect edgeEffect) {
        if (edgeEffect == null) {
            return false;
        }
        return !((Build.VERSION.SDK_INT >= 31 ? C8381b.f76147a.b(edgeEffect) : 0.0f) == 0.0f);
    }

    public final void A(long j11) {
        this.f76223c = j11;
        EdgeEffect edgeEffect = this.f76224d;
        if (edgeEffect != null) {
            edgeEffect.setSize((int) (j11 >> 32), (int) (j11 & 4294967295L));
        }
        EdgeEffect edgeEffect2 = this.f76225e;
        if (edgeEffect2 != null) {
            edgeEffect2.setSize((int) (j11 >> 32), (int) (j11 & 4294967295L));
        }
        EdgeEffect edgeEffect3 = this.f76226f;
        if (edgeEffect3 != null) {
            edgeEffect3.setSize((int) (j11 & 4294967295L), (int) (j11 >> 32));
        }
        EdgeEffect edgeEffect4 = this.f76227g;
        if (edgeEffect4 != null) {
            edgeEffect4.setSize((int) (j11 & 4294967295L), (int) (j11 >> 32));
        }
        EdgeEffect edgeEffect5 = this.f76228h;
        if (edgeEffect5 != null) {
            edgeEffect5.setSize((int) (j11 >> 32), (int) (j11 & 4294967295L));
        }
        EdgeEffect edgeEffect6 = this.f76229i;
        if (edgeEffect6 != null) {
            edgeEffect6.setSize((int) (j11 >> 32), (int) (j11 & 4294967295L));
        }
        EdgeEffect edgeEffect7 = this.f76230j;
        if (edgeEffect7 != null) {
            edgeEffect7.setSize((int) (j11 & 4294967295L), (int) (j11 >> 32));
        }
        EdgeEffect edgeEffect8 = this.f76231k;
        if (edgeEffect8 != null) {
            edgeEffect8.setSize((int) (4294967295L & j11), (int) (j11 >> 32));
        }
    }

    @NotNull
    public final EdgeEffect f() {
        EdgeEffect edgeEffect = this.f76225e;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect e11 = e();
        this.f76225e = e11;
        return e11;
    }

    @NotNull
    public final EdgeEffect g() {
        EdgeEffect edgeEffect = this.f76229i;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect e11 = e();
        this.f76229i = e11;
        return e11;
    }

    @NotNull
    public final EdgeEffect h() {
        EdgeEffect edgeEffect = this.f76226f;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect e11 = e();
        this.f76226f = e11;
        return e11;
    }

    @NotNull
    public final EdgeEffect i() {
        EdgeEffect edgeEffect = this.f76230j;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect e11 = e();
        this.f76230j = e11;
        return e11;
    }

    @NotNull
    public final EdgeEffect j() {
        EdgeEffect edgeEffect = this.f76227g;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect e11 = e();
        this.f76227g = e11;
        return e11;
    }

    @NotNull
    public final EdgeEffect k() {
        EdgeEffect edgeEffect = this.f76231k;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect e11 = e();
        this.f76231k = e11;
        return e11;
    }

    @NotNull
    public final EdgeEffect l() {
        EdgeEffect edgeEffect = this.f76224d;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect e11 = e();
        this.f76224d = e11;
        return e11;
    }

    @NotNull
    public final EdgeEffect m() {
        EdgeEffect edgeEffect = this.f76228h;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect e11 = e();
        this.f76228h = e11;
        return e11;
    }

    public final boolean n() {
        if (this.f76225e == null) {
            return false;
        }
        return !r0.isFinished();
    }

    public final boolean o() {
        return w(this.f76229i);
    }

    public final boolean p() {
        return w(this.f76225e);
    }

    public final boolean q() {
        if (this.f76226f == null) {
            return false;
        }
        return !r0.isFinished();
    }

    public final boolean r() {
        return w(this.f76230j);
    }

    public final boolean s() {
        return w(this.f76226f);
    }

    public final boolean t() {
        if (this.f76227g == null) {
            return false;
        }
        return !r0.isFinished();
    }

    public final boolean u() {
        return w(this.f76231k);
    }

    public final boolean v() {
        return w(this.f76227g);
    }

    public final boolean x() {
        if (this.f76224d == null) {
            return false;
        }
        return !r0.isFinished();
    }

    public final boolean y() {
        return w(this.f76228h);
    }

    public final boolean z() {
        return w(this.f76224d);
    }
}
