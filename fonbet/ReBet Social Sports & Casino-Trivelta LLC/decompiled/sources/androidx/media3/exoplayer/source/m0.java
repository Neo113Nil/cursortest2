package androidx.media3.exoplayer.source;

import com.google.common.collect.AbstractC3445z;
import e1.AbstractC4156x;

/* loaded from: classes.dex */
public final class m0 {

    /* renamed from: d, reason: collision with root package name */
    public static final m0 f21830d = new m0(new b1.P[0]);

    /* renamed from: e, reason: collision with root package name */
    public static final String f21831e = e1.Z.K0(0);

    /* renamed from: a, reason: collision with root package name */
    public final int f21832a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC3445z f21833b;

    /* renamed from: c, reason: collision with root package name */
    public int f21834c;

    public m0(b1.P... pArr) {
        this.f21833b = AbstractC3445z.q(pArr);
        this.f21832a = pArr.length;
        e();
    }

    public b1.P b(int i10) {
        return (b1.P) this.f21833b.get(i10);
    }

    public AbstractC3445z c() {
        return AbstractC3445z.o(com.google.common.collect.L.k(this.f21833b, new Ra.f() { // from class: androidx.media3.exoplayer.source.l0
            @Override // Ra.f
            public final Object apply(Object obj) {
                Integer valueOf;
                valueOf = Integer.valueOf(((b1.P) obj).f24397c);
                return valueOf;
            }
        }));
    }

    public int d(b1.P p10) {
        int indexOf = this.f21833b.indexOf(p10);
        if (indexOf >= 0) {
            return indexOf;
        }
        return -1;
    }

    public final void e() {
        int i10 = 0;
        while (i10 < this.f21833b.size()) {
            int i11 = i10 + 1;
            for (int i12 = i11; i12 < this.f21833b.size(); i12++) {
                if (((b1.P) this.f21833b.get(i10)).equals(this.f21833b.get(i12))) {
                    AbstractC4156x.e("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i10 = i11;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m0.class == obj.getClass()) {
            m0 m0Var = (m0) obj;
            if (this.f21832a == m0Var.f21832a && this.f21833b.equals(m0Var.f21833b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        if (this.f21834c == 0) {
            this.f21834c = this.f21833b.hashCode();
        }
        return this.f21834c;
    }

    public String toString() {
        return this.f21833b.toString();
    }
}
