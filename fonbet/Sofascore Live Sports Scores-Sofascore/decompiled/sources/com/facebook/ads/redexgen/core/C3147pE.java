package com.facebook.ads.redexgen.core;

import android.content.Context;

@Deprecated
/* renamed from: com.facebook.ads.redexgen.X.pE, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C3147pE implements C5Y {
    public final Context A00;
    public final C5Y A01;
    public final InterfaceC14835t A02;

    public C3147pE(Context context, InterfaceC14835t interfaceC14835t, C5Y c5y) {
        this.A00 = context.getApplicationContext();
        this.A02 = interfaceC14835t;
        this.A01 = c5y;
    }

    public C3147pE(Context context, String str, InterfaceC14835t interfaceC14835t) {
        this(context, interfaceC14835t, new AO().A01(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.C5Y
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final AP A5I() {
        AP ap = new AP(this.A00, this.A01.A5I());
        if (this.A02 != null) {
            ap.A43(this.A02);
        }
        return ap;
    }
}
