package com.facebook.ads.redexgen.core;

import android.view.View;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.bf, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC2341bf implements View.OnClickListener {
    public final /* synthetic */ C2344bi A00;

    public ViewOnClickListenerC2341bf(C2344bi c2344bi) {
        this.A00 = c2344bi;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC2343bh interfaceC2343bh;
        AbstractC2187Yb abstractC2187Yb;
        List list;
        C1689Ek c1689Ek;
        C1689Ek c1689Ek2;
        C1689Ek c1689Ek3;
        AbstractC2187Yb abstractC2187Yb2;
        if (WU.A02(this)) {
            return;
        }
        try {
            interfaceC2343bh = this.A00.A05;
            interfaceC2343bh.AEm();
            abstractC2187Yb = this.A00.A00;
            if (abstractC2187Yb != null) {
                abstractC2187Yb2 = this.A00.A00;
                YB.A0L(abstractC2187Yb2);
            }
            list = this.A00.A07;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                YB.A0O((View) it.next(), 0);
            }
            YB.A0J(this.A00);
            c1689Ek = this.A00.A06;
            if (c1689Ek == null) {
                return;
            }
            c1689Ek2 = this.A00.A06;
            YB.A0O(c1689Ek2, 0);
            c1689Ek3 = this.A00.A06;
            c1689Ek3.A0e(EnumC2539et.A02, 14);
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
