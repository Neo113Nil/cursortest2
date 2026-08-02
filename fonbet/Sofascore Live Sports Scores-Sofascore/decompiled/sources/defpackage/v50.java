package defpackage;

import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class v50 implements z50 {
    public final s50 a;
    public final s50 b;

    public v50(s50 s50Var, s50 s50Var2) {
        this.a = s50Var;
        this.b = s50Var2;
    }

    @Override // defpackage.z50
    public final o41 g() {
        return new myh(this.a.g(), this.b.g());
    }

    @Override // defpackage.z50
    public final List h() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }

    @Override // defpackage.z50
    public final boolean isStatic() {
        return this.a.isStatic() && this.b.isStatic();
    }
}
