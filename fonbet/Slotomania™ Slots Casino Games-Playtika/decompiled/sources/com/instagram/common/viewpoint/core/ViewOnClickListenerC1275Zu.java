package com.instagram.common.viewpoint.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Zu, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC1275Zu implements View.OnClickListener {
    public static String[] A03 = {"qTn7FHoQ", "BapBypyKyXgi02nUaikHNoU7eY2sLlHG", "hAbogJy7", "1kKCdLvWKNxoPSiH", "Xjk6qTkQoY8vuVUP", "RHy2P55wnjv0LaFNgRpD8dXF", "4s2GzZI6q8xqZAbl0Skgz3P6Lr2GKXBU", "B9Ul8cdGX1dUct8fF9ORVNarLvr0UfHM"};
    public final /* synthetic */ C0989Ok A00;
    public final /* synthetic */ C1262Zh A01;
    public final /* synthetic */ C1276Zv A02;

    public ViewOnClickListenerC1275Zu(C1276Zv c1276Zv, C1262Zh c1262Zh, C0989Ok c0989Ok) {
        this.A02 = c1276Zv;
        this.A01 = c1262Zh;
        this.A00 = c0989Ok;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC1260Zf interfaceC1260Zf;
        if (WU.A02(this)) {
            return;
        }
        try {
            this.A01.A01();
            interfaceC1260Zf = this.A02.A02;
            interfaceC1260Zf.AF4(this.A00);
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
