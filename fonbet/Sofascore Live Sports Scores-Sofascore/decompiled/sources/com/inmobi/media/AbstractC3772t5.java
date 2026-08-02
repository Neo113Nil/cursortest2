package com.inmobi.media;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import com.inmobi.media.core.config.models.TelemetryConfig;
import defpackage.dmi;
import java.net.URISyntaxException;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.t5, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3772t5 {
    public static int a(Context context, String str, Eh eh, String str2, InterfaceC3880x9 interfaceC3880x9) {
        context.getClass();
        str.getClass();
        eh.getClass();
        str2.getClass();
        if (interfaceC3880x9 != null) {
            ((C3906y9) interfaceC3880x9).c("DeeplinkHandler", "In appLinkOrDeepLinkHandled");
        }
        if (str.length() == 0) {
            if (interfaceC3880x9 == null) {
                return 2;
            }
            ((C3906y9) interfaceC3880x9).c("DeeplinkHandler", "AppLink url is Empty or null");
            return 2;
        }
        try {
            List a = F3.a(context, str);
            if (a.isEmpty()) {
                if (interfaceC3880x9 != null) {
                    ((C3906y9) interfaceC3880x9).c("DeeplinkHandler", " Resolve Info Empty");
                }
                return b(context, str, eh, str2, interfaceC3880x9);
            }
            if (interfaceC3880x9 != null) {
                ((C3906y9) interfaceC3880x9).c("DeeplinkHandler", dmi.q("Resolve Info ", ((ResolveInfo) a.get(0)).activityInfo.name));
            }
            return a(context, str, (ResolveInfo) a.get(0), eh, str2, interfaceC3880x9);
        } catch (URISyntaxException unused) {
            if (interfaceC3880x9 == null) {
                return 5;
            }
            ((C3906y9) interfaceC3880x9).b("DeeplinkHandler", "URISyntaxException for url: ".concat(str));
            return 5;
        }
    }

    public static int b(Context context, String str, Eh eh, String str2, InterfaceC3880x9 interfaceC3880x9) {
        try {
            return F3.a(context, str, eh, str2);
        } catch (ActivityNotFoundException unused) {
            return a(context, str, null, eh, str2, interfaceC3880x9);
        } catch (NullPointerException unused2) {
            return a(context, str, null, eh, str2, interfaceC3880x9);
        } catch (SecurityException unused3) {
            if (interfaceC3880x9 != null) {
                ((C3906y9) interfaceC3880x9).b("DeeplinkHandler", "SecurityException");
            }
            return 12;
        } catch (URISyntaxException unused4) {
            if (interfaceC3880x9 != null) {
                ((C3906y9) interfaceC3880x9).b("DeeplinkHandler", "uriSyntaxException");
            }
            return 5;
        } catch (Exception e) {
            if (interfaceC3880x9 != null) {
                ((C3906y9) interfaceC3880x9).b("DeeplinkHandler", "Exception: " + e);
            }
            return 9;
        }
    }

    public static boolean a(String str, Context context, Eh eh, InterfaceC3880x9 interfaceC3880x9) {
        str.getClass();
        context.getClass();
        eh.getClass();
        F5.a.getClass();
        if (!F5.t() || !eh.a() || !((TelemetryConfig) AbstractC3435g4.a.a(TelemetryConfig.class)).getLpConfig().getUniversalLinkEnabled()) {
            return false;
        }
        try {
            Uri parse = Uri.parse(str);
            parse.getClass();
            Intent intent = new Intent("android.intent.action.VIEW", parse);
            intent.addCategory("android.intent.category.BROWSABLE");
            intent.setFlags(268436992);
            context.getClass();
            context.startActivity(intent);
            if (interfaceC3880x9 == null) {
                return true;
            }
            ((C3906y9) interfaceC3880x9).a("DeeplinkHandler", "openDefaultApplication: SUCCESS");
            return true;
        } catch (ActivityNotFoundException unused) {
            if (interfaceC3880x9 != null) {
                ((C3906y9) interfaceC3880x9).b("DeeplinkHandler", "openDefaultApplication: ActivityNotFoundException");
            }
            return false;
        } catch (NullPointerException unused2) {
            if (interfaceC3880x9 != null) {
                ((C3906y9) interfaceC3880x9).b("DeeplinkHandler", "openDefaultApplication: NullPointerException");
            }
            return false;
        }
    }

    public static int a(Context context, String str, ResolveInfo resolveInfo, Eh eh, String str2, InterfaceC3880x9 interfaceC3880x9) {
        try {
            return F3.a(context, str, resolveInfo, eh, str2);
        } catch (ActivityNotFoundException unused) {
            if (interfaceC3880x9 != null) {
                ((C3906y9) interfaceC3880x9).b("DeeplinkHandler", dmi.q("ActivityNotFoundException for url: ", str));
            }
            return 6;
        } catch (NullPointerException unused2) {
            if (interfaceC3880x9 != null) {
                ((C3906y9) interfaceC3880x9).b("DeeplinkHandler", dmi.q("NullPointerException for url: ", str));
            }
            return 13;
        } catch (SecurityException unused3) {
            if (interfaceC3880x9 != null) {
                ((C3906y9) interfaceC3880x9).b("DeeplinkHandler", dmi.q("SecurityException for url: ", str));
            }
            return 12;
        } catch (URISyntaxException unused4) {
            if (interfaceC3880x9 != null) {
                ((C3906y9) interfaceC3880x9).b("DeeplinkHandler", dmi.q("URISyntaxException for url: ", str));
            }
            return 5;
        } catch (Exception e) {
            if (interfaceC3880x9 != null) {
                ((C3906y9) interfaceC3880x9).b("DeeplinkHandler", "Exception: " + e);
            }
            return 9;
        }
    }
}
