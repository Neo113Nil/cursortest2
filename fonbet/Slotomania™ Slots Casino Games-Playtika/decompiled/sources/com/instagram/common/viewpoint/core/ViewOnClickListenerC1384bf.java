package com.instagram.common.viewpoint.core;

import android.view.View;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.bf, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC1384bf implements View.OnClickListener {
    public final /* synthetic */ C1387bi A00;

    public ViewOnClickListenerC1384bf(C1387bi c1387bi) {
        this.A00 = c1387bi;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC1386bh interfaceC1386bh;
        AbstractC1230Yb abstractC1230Yb;
        List list;
        C0732Ek c0732Ek;
        C0732Ek c0732Ek2;
        C0732Ek c0732Ek3;
        AbstractC1230Yb abstractC1230Yb2;
        if (WU.A02(this)) {
            return;
        }
        try {
            interfaceC1386bh = this.A00.A05;
            interfaceC1386bh.AEm();
            abstractC1230Yb = this.A00.A00;
            if (abstractC1230Yb != null) {
                abstractC1230Yb2 = this.A00.A00;
                YB.A0L(abstractC1230Yb2);
            }
            list = this.A00.A07;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                YB.A0O((View) it.next(), 0);
            }
            YB.A0J(this.A00);
            c0732Ek = this.A00.A06;
            if (c0732Ek == null) {
                return;
            }
            c0732Ek2 = this.A00.A06;
            YB.A0O(c0732Ek2, 0);
            c0732Ek3 = this.A00.A06;
            c0732Ek3.A0e(EnumC1582et.A02, 14);
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
