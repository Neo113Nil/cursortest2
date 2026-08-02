package com.vk.qrcode;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.vk.qrcode.QRTypes$AddressBookQRAction;
import com.vkontakte.android.R;
import xsna.av20;
import xsna.cme0;
import xsna.wmg;
import xsna.xwk;

/* compiled from: QRViewUtils.kt */
/* loaded from: classes5.dex */
public final class f implements av20.b<QRTypes$AddressBookQRAction.a> {
    public final /* synthetic */ Activity a;
    public final /* synthetic */ cme0 b;

    /* compiled from: QRViewUtils.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[QRTypes$AddressBookQRAction.FieldType.values().length];
            try {
                iArr[QRTypes$AddressBookQRAction.FieldType.PHONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[QRTypes$AddressBookQRAction.FieldType.EMAIL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[QRTypes$AddressBookQRAction.FieldType.SITE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public f(Activity activity, cme0 cme0Var) {
        this.a = activity;
        this.b = cme0Var;
    }

    @Override // xsna.av20.b
    public final void a(View view, Object obj, int i, wmg wmgVar) {
        QRTypes$AddressBookQRAction.a aVar = (QRTypes$AddressBookQRAction.a) obj;
        String str = aVar.a;
        int i2 = a.$EnumSwitchMapping$0[aVar.c.ordinal()];
        Activity activity = this.a;
        if (i2 == 1) {
            activity.startActivity(new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse("tel:" + str)));
        } else if (i2 == 2) {
            activity.startActivity(Intent.createChooser(new Intent("android.intent.action.SENDTO", Uri.parse("mailto:" + str)), activity.getString(R.string.send_email)));
        } else if (i2 == 3) {
            xwk.d().e().a(activity, str);
        }
        d dVar = d.b;
        d.a(this.b);
    }
}
