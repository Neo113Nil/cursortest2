package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.Gl, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0784Gl implements InterfaceC1229Ya {
    public final /* synthetic */ AbstractC0782Gj A00;

    public C0784Gl(AbstractC0782Gj abstractC0782Gj) {
        this.A00 = abstractC0782Gj;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1229Ya
    public final void ACl(AbstractC1230Yb abstractC1230Yb) {
        if (abstractC1230Yb.getToolbarActionMode() == 8) {
            this.A00.A0g();
            return;
        }
        this.A00.A07.A04(VH.A07, null);
        if (this.A00.A0l()) {
            return;
        }
        this.A00.A05.A0F().AB0();
        this.A00.A0A.A4j(this.A00.A0B.A7w());
    }
}
