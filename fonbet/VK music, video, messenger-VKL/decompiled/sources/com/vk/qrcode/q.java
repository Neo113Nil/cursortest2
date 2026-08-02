package com.vk.qrcode;

import android.app.Activity;
import com.vk.qrcode.QRStatsTracker;
import xsna.cme0;
import xsna.dy0;
import xsna.hz20;
import xsna.xwk;

/* compiled from: QRViewUtils.kt */
/* loaded from: classes5.dex */
public final class q implements hz20 {
    public final /* synthetic */ String b;
    public final /* synthetic */ dy0 c;
    public final /* synthetic */ Activity d;
    public final /* synthetic */ cme0 e;

    public q(String str, dy0 dy0Var, Activity activity, cme0 cme0Var) {
        this.b = str;
        this.c = dy0Var;
        this.d = activity;
        this.e = cme0Var;
    }

    @Override // xsna.hz20
    public final void a(int i) {
        if (i == -2) {
            this.c.invoke();
        } else {
            if (i != -1) {
                return;
            }
            xwk.d().e().a(this.d, this.b);
            d.a(this.e);
            QRStatsTracker qRStatsTracker = QRStatsTracker.a;
            QRStatsTracker.a(QRStatsTracker.Action.OPEN_LINK_FROM_TEXT);
        }
    }
}
