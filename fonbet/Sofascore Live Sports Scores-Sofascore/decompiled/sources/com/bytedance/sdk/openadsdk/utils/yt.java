package com.bytedance.sdk.openadsdk.utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.sf;
import com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity;
import defpackage.da4;
import defpackage.ea4;
import java.util.HashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class yt {
    public static boolean pcc(Context context, String str, com.bytedance.sdk.openadsdk.core.model.of ofVar, String str2, boolean z) {
        if (!(context instanceof Activity)) {
            Activity sf = com.bytedance.sdk.openadsdk.core.dax.pcc().vj().sf();
            if (sf != null && pcc(sf)) {
                context = sf;
            }
        } else if (!pcc((Activity) context)) {
            context = null;
        }
        if (context == null) {
            context = com.bytedance.sdk.openadsdk.core.lu.pcc();
        }
        if (context == null) {
            return false;
        }
        kun.pcc(ofVar);
        if (!com.bytedance.sdk.component.utils.lu.pcc(str)) {
            com.bytedance.sdk.openadsdk.oo.gm.pcc(sf(str2, 5, ofVar));
            return false;
        }
        String sf2 = com.bytedance.sdk.openadsdk.core.model.of.sf(context, ofVar);
        if (TextUtils.isEmpty(sf2)) {
            return sf(context, str, ofVar, str2, z);
        }
        try {
            da4 da4Var = new da4();
            da4Var.f(false);
            da4Var.e();
            try {
                ea4 a = da4Var.a();
                if (!(context instanceof Activity)) {
                    a.a.addFlags(268435456);
                }
                com.bytedance.sdk.openadsdk.core.pcc.pcc.pcc(context, sf2, a, Uri.parse(str));
                if (context instanceof TTBaseActivity) {
                    ((TTBaseActivity) context).gm(true);
                }
                com.bytedance.sdk.openadsdk.dax.pcc.sf sf3 = sf(str2, 100, ofVar);
                sf3.pcc(true);
                sf3.sf(8);
                com.bytedance.sdk.openadsdk.oo.gm.pcc(sf3);
                return true;
            } catch (Throwable th) {
                String message = th.getMessage();
                com.bytedance.sdk.component.utils.lo.gm("OpenUtils", message);
                com.bytedance.sdk.openadsdk.dax.pcc.sf sf4 = sf(str2, 13, ofVar);
                sf4.gm(message);
                com.bytedance.sdk.openadsdk.oo.gm.pcc(sf4);
                sf(context, str, ofVar, str2, true);
                return true;
            }
        } catch (Throwable th2) {
            String message2 = th2.getMessage();
            com.bytedance.sdk.component.utils.lo.gm("OpenUtils", message2);
            com.bytedance.sdk.openadsdk.dax.pcc.sf sf5 = sf(str2, 12, ofVar);
            sf5.gm(message2);
            com.bytedance.sdk.openadsdk.oo.gm.pcc(sf5);
            return sf(context, str, ofVar, str2, z);
        }
    }

    private static boolean sf(Context context, String str, final com.bytedance.sdk.openadsdk.core.model.of ofVar, final String str2, boolean z) {
        Intent intent = new Intent("android.intent.action.VIEW");
        try {
            intent.setData(Uri.parse(str));
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            return com.bytedance.sdk.component.utils.sf.pcc(context, intent, new sf.InterfaceC0055sf() { // from class: com.bytedance.sdk.openadsdk.utils.yt.1
                @Override // com.bytedance.sdk.component.utils.sf.InterfaceC0055sf
                public void pcc(Throwable th) {
                    String message = th.getMessage();
                    com.bytedance.sdk.openadsdk.dax.pcc.sf sf = yt.sf(str2, 7, ofVar);
                    sf.gm(message);
                    sf.sf(2);
                    com.bytedance.sdk.openadsdk.oo.gm.pcc(sf);
                }

                @Override // com.bytedance.sdk.component.utils.sf.InterfaceC0055sf
                public void pcc() {
                    com.bytedance.sdk.openadsdk.dax.pcc.sf sf = yt.sf(str2, 100, ofVar);
                    sf.pcc(true);
                    sf.sf(2);
                    com.bytedance.sdk.openadsdk.oo.gm.pcc(sf);
                }
            }, z);
        } catch (Throwable th) {
            String message = th.getMessage();
            com.bytedance.sdk.openadsdk.dax.pcc.sf sf = sf(str2, 6, ofVar);
            sf.gm(message);
            sf.sf(2);
            com.bytedance.sdk.openadsdk.oo.gm.pcc(sf);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.bytedance.sdk.openadsdk.dax.pcc.sf sf(String str, int i, com.bytedance.sdk.openadsdk.core.model.of ofVar) {
        com.bytedance.sdk.openadsdk.dax.pcc.sf sfVar = new com.bytedance.sdk.openadsdk.dax.pcc.sf();
        sfVar.pcc(str);
        sfVar.pcc(ofVar);
        sfVar.sf(kun.pcc(ofVar));
        sfVar.pcc(i);
        sfVar.pcc(false);
        sfVar.sf(ofVar.az());
        return sfVar;
    }

    public static boolean pcc(Context context, String str, com.bytedance.sdk.openadsdk.core.model.of ofVar, String str2) {
        if (context instanceof Activity) {
            if (!pcc((Activity) context)) {
                context = null;
            }
        } else {
            Activity sf = com.bytedance.sdk.openadsdk.core.dax.pcc().vj().sf();
            if (sf != null && pcc(sf)) {
                context = sf;
            }
        }
        if (context == null) {
            context = com.bytedance.sdk.openadsdk.core.lu.pcc();
        }
        Context context2 = context;
        if (context2 == null || !pcc(str)) {
            return false;
        }
        new Intent("android.intent.action.VIEW").setData(Uri.parse(str));
        HashMap hashMap = new HashMap();
        hashMap.put("deeplink_url", str);
        hashMap.put("jsb_deeplink", 1);
        return com.bytedance.sdk.openadsdk.fum.pcc.pcc.pcc.pcc(context2, str, ofVar, kun.sf(ofVar), hashMap, true);
    }

    public static boolean pcc(String str) {
        return !TextUtils.isEmpty(str);
    }

    public static boolean pcc(Activity activity) {
        return (activity == null || activity.isDestroyed() || activity.isFinishing()) ? false : true;
    }
}
