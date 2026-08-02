package defpackage;

import androidx.appcompat.widget.b;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ic0 extends en8 {
    public final /* synthetic */ pc0 j;
    public final /* synthetic */ b k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ic0(b bVar, b bVar2, pc0 pc0Var) {
        super(bVar2);
        this.k = bVar;
        this.j = pc0Var;
    }

    @Override // defpackage.en8
    public final wfh b() {
        return this.j;
    }

    @Override // defpackage.en8
    public final boolean c() {
        b bVar = this.k;
        if (bVar.getInternalPopup().a()) {
            return true;
        }
        bVar.f.k(bVar.getTextDirection(), bVar.getTextAlignment());
        return true;
    }
}
