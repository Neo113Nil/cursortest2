package com.facebook.ads.redexgen.core;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: com.facebook.ads.redexgen.X.4o, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C14524o extends BroadcastReceiver {
    public final /* synthetic */ C14534p A00;

    public C14524o(C14534p c14534p) {
        this.A00 = c14534p;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        int A00;
        A00 = C14534p.A00(context);
        if (C5C.A02 >= 31 && A00 == 5) {
            C14504m.A02(context, this.A00);
        } else {
            this.A00.A07(A00);
        }
    }
}
