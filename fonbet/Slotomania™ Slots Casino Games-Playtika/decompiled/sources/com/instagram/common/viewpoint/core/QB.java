package com.instagram.common.viewpoint.core;

/* loaded from: assets/audience_network/classes2.dex */
public class QB extends AbstractRunnableC1182Wc {
    public final /* synthetic */ ViewOnSystemUiVisibilityChangeListenerC1226Xx A00;

    public QB(ViewOnSystemUiVisibilityChangeListenerC1226Xx viewOnSystemUiVisibilityChangeListenerC1226Xx) {
        this.A00 = viewOnSystemUiVisibilityChangeListenerC1226Xx;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC1182Wc
    public final void A07() {
        this.A00.A02(false);
    }
}
