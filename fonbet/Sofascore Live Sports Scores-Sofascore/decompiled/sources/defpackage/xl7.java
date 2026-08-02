package defpackage;

import com.sofascore.results.R;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class xl7 implements am7 {
    public final boolean a;
    public final ul7 b = new ul7(R.color.surface_1, R.color.n_lv_1, R.color.n_lv_1, R.color.surface_1);

    public xl7(boolean z) {
        this.a = z;
    }

    @Override // defpackage.am7
    public final int a() {
        return R.string.active;
    }

    @Override // defpackage.am7
    public final ul7 b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xl7) && this.a == ((xl7) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return bf3.l("Active(canBeDeactivated=", ")", this.a);
    }
}
