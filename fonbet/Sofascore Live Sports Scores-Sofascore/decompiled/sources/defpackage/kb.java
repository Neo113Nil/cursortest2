package defpackage;

import com.sofascore.results.R;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public enum kb implements lb {
    Inactive(R.drawable.ic_star_empty, R.color.neutral_default),
    Active(R.drawable.ic_star, R.color.primary_default);

    public final int a;
    public final int b;

    kb(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.lb
    public final int d() {
        return this.a;
    }

    @Override // defpackage.lb
    public final int getColor() {
        return this.b;
    }
}
