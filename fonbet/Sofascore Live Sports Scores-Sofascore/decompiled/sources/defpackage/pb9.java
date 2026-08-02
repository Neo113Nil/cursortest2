package defpackage;

import com.sofascore.model.firebase.AdType;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class pb9 extends ub9 {
    public final int b;
    public final AdType.Banner c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pb9(int i, AdType.Banner banner) {
        super(i);
        banner.getClass();
        this.b = i;
        this.c = banner;
    }

    @Override // defpackage.ub9
    public final int a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pb9)) {
            return false;
        }
        pb9 pb9Var = (pb9) obj;
        return this.b == pb9Var.b && this.c == pb9Var.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + (Integer.hashCode(this.b) * 31);
    }

    public final String toString() {
        return "AdBannerItem(type=" + this.b + ", bannerType=" + this.c + ")";
    }
}
