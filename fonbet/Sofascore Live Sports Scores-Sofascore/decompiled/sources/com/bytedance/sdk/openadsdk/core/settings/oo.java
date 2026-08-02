package com.bytedance.sdk.openadsdk.core.settings;

import android.text.TextUtils;
import androidx.annotation.Keep;
import com.bytedance.sdk.openadsdk.core.lu;
import com.bytedance.sdk.openadsdk.utils.kun;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.OnSuccessListener;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class oo {
    private static String gm = null;
    private static volatile int oo = 0;
    private static volatile String pcc = "";
    private static volatile String sf = "";

    public static String gm() {
        if (oo != 0) {
            return sf;
        }
        pcc();
        return sf;
    }

    public static String oo() {
        if (TextUtils.isEmpty(gm)) {
            gm = lu.pcc().getPackageManager().getInstallerPackageName(kun.wh());
        }
        String str = gm;
        if (str != null) {
            return str;
        }
        gm = "";
        return "";
    }

    public static void pcc() {
        try {
            AppSet.getClient(lu.pcc()).getAppSetIdInfo().addOnSuccessListener(new OnSuccessListener<AppSetIdInfo>() { // from class: com.bytedance.sdk.openadsdk.core.settings.AppSetIdAndScope$1
                @Override // com.google.android.gms.tasks.OnSuccessListener
                @Keep
                public void onSuccess(AppSetIdInfo appSetIdInfo) {
                    String unused = oo.pcc = Integer.toString(appSetIdInfo.getScope());
                    String unused2 = oo.sf = appSetIdInfo.getId();
                    int unused3 = oo.oo = 1;
                }
            });
        } catch (Throwable unused) {
            oo = 2;
        }
    }

    public static String sf() {
        if (oo != 0) {
            return pcc;
        }
        pcc();
        return pcc;
    }
}
