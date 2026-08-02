package com.instagram.common.viewpoint.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Yy, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC1253Yy implements View.OnClickListener {
    public static String[] A01 = {"F6joGwlDI8iHbOzAisWUuE", "maTihVjplMt3yFJVJjmC0KmpbmehhX2e", "XpTxCcWpZPP2y4C0a9j2n0d0MxBWLTpI", "sgfvA1KSqWI8KtEvB6m8ZyDvc5DWsN6n", "pzMBgxyxqMiPYS0J7CYt5msvRsH6xIdq", "11mnBsf4lSYjVT8AEBIdPT", "UMn24MW5IHqIwX55a9EJeoGY4QyDeK8V", "me7LrSnqK6vn3rCyE1y3nY3eC8Lw1mdr"};
    public final /* synthetic */ C05396g A00;

    public ViewOnClickListenerC1253Yy(C05396g c05396g) {
        this.A00 = c05396g;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ViewOnClickListenerC0702Dg viewOnClickListenerC0702Dg;
        if (WU.A02(this)) {
            return;
        }
        try {
            viewOnClickListenerC0702Dg = this.A00.A0A;
            viewOnClickListenerC0702Dg.onClick(view);
        } catch (Throwable th) {
            WU.A00(th, this);
            if (A01[3].charAt(5) != '1') {
                throw new RuntimeException();
            }
            A01[1] = "W3cGemgA1Z9oaIj4IYerUOiD4w2U2gjw";
        }
    }
}
