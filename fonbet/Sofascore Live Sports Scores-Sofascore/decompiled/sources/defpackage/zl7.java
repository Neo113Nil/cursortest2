package defpackage;

import com.sofascore.results.R;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class zl7 implements am7 {
    public final bm7 a;
    public final ul7 b = new ul7(R.color.n_lv_3, R.color.surface_1, R.color.surface_1, R.color.n_lv_3);

    public zl7(bm7 bm7Var) {
        this.a = bm7Var;
    }

    @Override // defpackage.am7
    public final int a() {
        return R.string.unavailable;
    }

    @Override // defpackage.am7
    public final ul7 b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zl7) && this.a == ((zl7) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Unavailable(reason=" + this.a + ")";
    }
}
