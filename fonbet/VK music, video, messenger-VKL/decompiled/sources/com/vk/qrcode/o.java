package com.vk.qrcode;

import android.app.Activity;
import android.view.View;
import com.vk.qrcode.QRTypes$SmsQrAction;
import xsna.av20;
import xsna.cme0;
import xsna.gbz;
import xsna.wmg;

/* compiled from: QRViewUtils.kt */
/* loaded from: classes5.dex */
public final class o implements av20.b<QRTypes$SmsQrAction.b> {
    public final /* synthetic */ Activity a;
    public final /* synthetic */ cme0 b;

    /* compiled from: QRViewUtils.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[QRTypes$SmsQrAction.FieldType.values().length];
            try {
                iArr[QRTypes$SmsQrAction.FieldType.PHONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public o(Activity activity, cme0 cme0Var) {
        this.a = activity;
        this.b = cme0Var;
    }

    @Override // xsna.av20.b
    public final void a(View view, Object obj, int i, wmg wmgVar) {
        QRTypes$SmsQrAction.b bVar = (QRTypes$SmsQrAction.b) obj;
        if (a.$EnumSwitchMapping$0[bVar.b.ordinal()] == 1) {
            gbz.a(this.a, "tel:" + bVar.a);
        }
        d dVar = d.b;
        d.a(this.b);
    }
}
