package com.vk.qrcode;

import android.app.Activity;
import android.view.View;
import com.vk.qrcode.QRTypes$EmailQrAction;
import xsna.av20;
import xsna.cme0;
import xsna.rwi;
import xsna.wmg;

/* compiled from: QRViewUtils.kt */
/* loaded from: classes5.dex */
public final class m implements av20.b<QRTypes$EmailQrAction.b> {
    public final /* synthetic */ Activity a;
    public final /* synthetic */ cme0 b;

    /* compiled from: QRViewUtils.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[QRTypes$EmailQrAction.FieldType.values().length];
            try {
                iArr[QRTypes$EmailQrAction.FieldType.EMAIL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public m(Activity activity, cme0 cme0Var) {
        this.a = activity;
        this.b = cme0Var;
    }

    @Override // xsna.av20.b
    public final void a(View view, Object obj, int i, wmg wmgVar) {
        QRTypes$EmailQrAction.b bVar = (QRTypes$EmailQrAction.b) obj;
        if (a.$EnumSwitchMapping$0[bVar.b.ordinal()] == 1) {
            rwi.d().j().a(this.a, "mailto:" + bVar.a);
        }
        d dVar = d.b;
        d.a(this.b);
    }
}
