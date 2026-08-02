package com.facebook.ads.redexgen.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Zu, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC2232Zu implements View.OnClickListener {
    public static String[] A03 = {"qTn7FHoQ", "BapBypyKyXgi02nUaikHNoU7eY2sLlHG", "hAbogJy7", "1kKCdLvWKNxoPSiH", "Xjk6qTkQoY8vuVUP", "RHy2P55wnjv0LaFNgRpD8dXF", "4s2GzZI6q8xqZAbl0Skgz3P6Lr2GKXBU", "B9Ul8cdGX1dUct8fF9ORVNarLvr0UfHM"};
    public final /* synthetic */ C1946Ok A00;
    public final /* synthetic */ C2219Zh A01;
    public final /* synthetic */ C2233Zv A02;

    public ViewOnClickListenerC2232Zu(C2233Zv c2233Zv, C2219Zh c2219Zh, C1946Ok c1946Ok) {
        this.A02 = c2233Zv;
        this.A01 = c2219Zh;
        this.A00 = c1946Ok;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC2217Zf interfaceC2217Zf;
        if (WU.A02(this)) {
            return;
        }
        try {
            this.A01.A01();
            interfaceC2217Zf = this.A02.A02;
            interfaceC2217Zf.AF4(this.A00);
        } catch (Throwable th) {
            WU.A00(th, this);
            String[] strArr = A03;
            if (strArr[3].length() != strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A03;
            strArr2[3] = "Wxfvm9MNAlg6MGh9";
            strArr2[4] = "9MWDJcBk5PnwUytH";
        }
    }
}
