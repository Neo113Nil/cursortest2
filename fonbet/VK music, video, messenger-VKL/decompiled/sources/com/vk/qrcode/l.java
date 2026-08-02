package com.vk.qrcode;

import android.app.Activity;
import com.vk.qrcode.QRStatsTracker;
import com.vk.qrcode.QRTypes$EmailQrAction;
import xsna.cme0;
import xsna.hz20;
import xsna.rwi;
import xsna.sw50;

/* compiled from: QRViewUtils.kt */
/* loaded from: classes5.dex */
public final class l implements hz20 {
    public final /* synthetic */ QRTypes$EmailQrAction b;
    public final /* synthetic */ Activity c;
    public final /* synthetic */ cme0 d;

    public l(QRTypes$EmailQrAction qRTypes$EmailQrAction, Activity activity, cme0 cme0Var) {
        this.b = qRTypes$EmailQrAction;
        this.c = activity;
        this.d = cme0Var;
    }

    @Override // xsna.hz20
    public final void a(int i) {
        QRTypes$EmailQrAction.a aVar = this.b.c;
        if (aVar == null) {
            aVar = null;
        }
        sw50.c j = rwi.d().j();
        QRTypes$EmailQrAction.b bVar = aVar.a;
        String str = bVar != null ? bVar.a : null;
        if (str == null) {
            str = "";
        }
        QRTypes$EmailQrAction.b bVar2 = aVar.b;
        String str2 = bVar2 != null ? bVar2.a : null;
        QRTypes$EmailQrAction.b bVar3 = aVar.c;
        j.c(this.c, str, str2, bVar3 != null ? bVar3.a : null);
        QRStatsTracker qRStatsTracker = QRStatsTracker.a;
        QRStatsTracker.a(QRStatsTracker.Action.SEND_EMAIL);
        d dVar = d.b;
        d.a(this.d);
    }
}
