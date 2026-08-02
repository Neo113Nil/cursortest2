package com.inmobi.media;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import defpackage.dmi;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public abstract class J1 {
    public static boolean a(Context context, String str, Eh eh, String str2, InterfaceC3880x9 interfaceC3880x9) {
        context.getClass();
        str.getClass();
        eh.getClass();
        str2.getClass();
        if (interfaceC3880x9 != null) {
            ((C3906y9) interfaceC3880x9).c("AppstoreLinkHandler", "In appStoreLinkHandled");
        }
        str.getClass();
        if (str.length() != 0) {
            Uri parse = Uri.parse(str);
            if ("market".equals(parse.getScheme()) || "play.google.com".equals(parse.getHost()) || "market.android.com".equals(parse.getHost())) {
                Uri parse2 = Uri.parse(str);
                if (context != null) {
                    try {
                        context.getPackageManager().getPackageInfo("com.android.vending", 0);
                        if (!eh.c()) {
                            eh.a("EX_" + str2);
                            return false;
                        }
                        try {
                            Intent intent = new Intent("android.intent.action.VIEW", parse2);
                            intent.setPackage("com.android.vending");
                            intent.addFlags(268435456);
                            context.startActivity(intent);
                            if (interfaceC3880x9 != null) {
                                ((C3906y9) interfaceC3880x9).c("AppstoreLinkHandler", "Playstore link handled successfully");
                            }
                            return true;
                        } catch (IllegalArgumentException e) {
                            if (interfaceC3880x9 != null) {
                                ((C3906y9) interfaceC3880x9).c("AppstoreLinkHandler", dmi.q("IllegalArgumentException: Processing appStoreLinkHandling: ", e.getMessage()));
                            }
                            return false;
                        } catch (Exception e2) {
                            if (interfaceC3880x9 != null) {
                                ((C3906y9) interfaceC3880x9).c("AppstoreLinkHandler", dmi.q("ActivityNotFoundException: Processing appStoreLinkHandling: ", e2.getMessage()));
                            }
                            return false;
                        }
                    } catch (PackageManager.NameNotFoundException e3) {
                        e3.printStackTrace();
                    }
                }
                int a = AbstractC3772t5.a(context, str, eh, str2, interfaceC3880x9);
                if (a != 0 && a != 1) {
                    return false;
                }
                if (interfaceC3880x9 != null) {
                    ((C3906y9) interfaceC3880x9).c("AppstoreLinkHandler", "Playstore link handled successfully");
                }
                return true;
            }
        }
        return false;
    }
}
