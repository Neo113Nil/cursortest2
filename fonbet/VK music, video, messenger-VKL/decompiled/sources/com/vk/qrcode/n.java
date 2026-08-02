package com.vk.qrcode;

import android.app.Activity;
import com.vk.qrcode.QRStatsTracker;
import com.vk.qrcode.QRTypes$SmsQrAction;
import xsna.cme0;
import xsna.hz20;
import xsna.rwi;
import xsna.sw50;

/* compiled from: QRViewUtils.kt */
/* loaded from: classes5.dex */
public final class n implements hz20 {
    public final /* synthetic */ QRTypes$SmsQrAction b;
    public final /* synthetic */ Activity c;
    public final /* synthetic */ cme0 d;

    public n(QRTypes$SmsQrAction qRTypes$SmsQrAction, Activity activity, cme0 cme0Var) {
        this.b = qRTypes$SmsQrAction;
        this.c = activity;
        this.d = cme0Var;
    }

    @Override // xsna.hz20
    public final void a(int i) {
        QRTypes$SmsQrAction.a aVar = this.b.c;
        if (aVar == null) {
            aVar = null;
        }
        sw50.c j = rwi.d().j();
        QRTypes$SmsQrAction.b bVar = aVar.a;
        j.b(this.c, bVar != null ? bVar.a : null, aVar.b.a);
        QRStatsTracker qRStatsTracker = QRStatsTracker.a;
        QRStatsTracker.a(QRStatsTracker.Action.SEND_SMS);
        d dVar = d.b;
        d.a(this.d);
    }
}
