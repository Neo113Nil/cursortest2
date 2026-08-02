package com.vk.qrcode;

import android.app.Activity;
import com.vk.qrcode.QRStatsTracker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.cme0;
import xsna.epx;
import xsna.izs;
import xsna.s3q0;
import xsna.xwk;

/* compiled from: QRViewUtils.kt */
/* loaded from: classes5.dex */
public final /* synthetic */ class p extends FunctionReferenceImpl implements izs<String, s3q0> {
    final /* synthetic */ Activity $context;
    final /* synthetic */ cme0 $parser;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(Activity activity, cme0 cme0Var) {
        super(1, epx.a.class, "processUrl", "forText$processUrl(Landroid/app/Activity;Lcom/vk/qrcode/QRParser;Ljava/lang/String;)V", 0);
        this.$context = activity;
        this.$parser = cme0Var;
    }

    @Override // xsna.izs
    public final s3q0 invoke(String str) {
        Activity activity = this.$context;
        cme0 cme0Var = this.$parser;
        d dVar = d.b;
        xwk.d().e().a(activity, str);
        d.a(cme0Var);
        QRStatsTracker qRStatsTracker = QRStatsTracker.a;
        QRStatsTracker.a(QRStatsTracker.Action.OPEN_LINK_FROM_TEXT);
        return s3q0.a;
    }
}
