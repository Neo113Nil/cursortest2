package com.inmobi.media;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.SystemClock;
import android.webkit.URLUtil;
import com.appsflyer.sdk_base.referrer.Payload;
import com.inmobi.ads.rendering.InMobiInAppBrowserActivity;
import com.inmobi.media.ads.network.common.model.InlineParams;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import defpackage.ba4;
import defpackage.da4;
import defpackage.dmi;
import defpackage.fc6;
import defpackage.ku3;
import defpackage.ljg;
import defpackage.lnb;
import defpackage.lqj;
import defpackage.p2g;
import defpackage.tub;
import defpackage.u2g;
import defpackage.w2g;
import defpackage.zzl;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.net.URISyntaxException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.hb, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3468hb {
    public static final /* synthetic */ int j = 0;
    public final Context a;
    public final C3494ib b;
    public final C3500ii c;
    public final Ya d;
    public final Eh e;
    public final C3597mb f;
    public final InterfaceC3880x9 g;
    public final WeakReference h;
    public int i;

    public C3468hb(Context context, C3494ib c3494ib, C3500ii c3500ii, Ya ya, Eh eh, C3597mb c3597mb, InterfaceC3880x9 interfaceC3880x9, WeakReference weakReference) {
        context.getClass();
        c3494ib.getClass();
        eh.getClass();
        this.a = context;
        this.b = c3494ib;
        this.c = c3500ii;
        this.d = ya;
        this.e = eh;
        this.f = c3597mb;
        this.g = interfaceC3880x9;
        this.h = weakReference;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0199, code lost:
    
        if (r0.equals("DEFAULT") == false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x013f, code lost:
    
        if (r0.equals("IN_NATIVE") == false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01ab, code lost:
    
        r0 = r15.g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01ad, code lost:
    
        if (r0 == null) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01af, code lost:
    
        ((com.inmobi.media.C3906y9) r0).c(com.mbridge.msdk.foundation.entity.CampaignEx.JSON_KEY_HB, "default - internal native");
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01b6, code lost:
    
        r0 = c(r16, r17, r18, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0179, code lost:
    
        if (r0.equals("EX_NATIVE") == false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0183, code lost:
    
        r0 = r15.g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0185, code lost:
    
        if (r0 == null) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0187, code lost:
    
        ((com.inmobi.media.C3906y9) r0).c(com.mbridge.msdk.foundation.entity.CampaignEx.JSON_KEY_HB, "open external native");
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x018e, code lost:
    
        r0 = e(r16, r17, r18, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0180, code lost:
    
        if (r0.equals("SKSTORE") == false) goto L101;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x024a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C3442gb a(String str, String str2, String str3, C3571lb c3571lb, boolean z) {
        C3571lb c3571lb2;
        InterfaceC3880x9 interfaceC3880x9;
        InterfaceC3880x9 interfaceC3880x92;
        int c;
        InterfaceC3880x9 interfaceC3880x93;
        C3597mb c3597mb;
        str.getClass();
        InterfaceC3880x9 interfaceC3880x94 = this.g;
        if (interfaceC3880x94 != null) {
            ((C3906y9) interfaceC3880x94).c(CampaignEx.JSON_KEY_HB, dmi.q("processing URL - ", str3));
        }
        if (!z) {
            if (c3571lb != null) {
                c3571lb2 = c3571lb;
            } else if (!this.b.a && (c3597mb = this.f) != null) {
                String a = AbstractC3339cb.a(str3);
                int i = this.i + 1;
                this.i = i;
                c3571lb2 = new C3571lb(c3597mb, a, i, SystemClock.elapsedRealtime());
            }
            a(Za.LPClickStart, c3571lb2, (Integer) null);
            if (str3 != null || str3.length() == 0) {
                C3571lb c3571lb3 = c3571lb2;
                interfaceC3880x9 = this.g;
                if (interfaceC3880x9 != null) {
                    ((C3906y9) interfaceC3880x9).c(CampaignEx.JSON_KEY_HB, "url is empty");
                }
                a(Za.LPStartFailed, c3571lb3, (Integer) 2);
                b(str, str2, str3);
                return new C3442gb(3, 2);
            }
            Uri parse = Uri.parse(str3);
            String scheme = parse.getScheme();
            if (scheme == null || scheme.length() == 0) {
                C3571lb c3571lb4 = c3571lb2;
                InterfaceC3880x9 interfaceC3880x95 = this.g;
                if (interfaceC3880x95 != null) {
                    ((C3906y9) interfaceC3880x95).c(CampaignEx.JSON_KEY_HB, "url scheme is empty");
                }
                a(Za.LPStartFailed, c3571lb4, (Integer) 4);
                b(str, str2, str3);
                return new C3442gb(3, 4);
            }
            if (Intrinsics.c(this.b.b, "SKSTORE") && !z) {
                InterfaceC3880x9 interfaceC3880x96 = this.g;
                if (interfaceC3880x96 != null) {
                    ((C3906y9) interfaceC3880x96).c(CampaignEx.JSON_KEY_HB, "inline installer");
                }
                return a(str, str2, str3, (String) null, c3571lb2);
            }
            C3571lb c3571lb5 = c3571lb2;
            if (Intrinsics.c(parse.getScheme(), "inmobinativebrowser")) {
                InterfaceC3880x9 interfaceC3880x97 = this.g;
                if (interfaceC3880x97 != null) {
                    ((C3906y9) interfaceC3880x97).c(CampaignEx.JSON_KEY_HB, "inmobi native browser scheme");
                }
                return b(str, str2, str3, c3571lb5);
            }
            if (Intrinsics.c(parse.getScheme(), "inmobideeplink")) {
                InterfaceC3880x9 interfaceC3880x98 = this.g;
                if (interfaceC3880x98 != null) {
                    ((C3906y9) interfaceC3880x98).c(CampaignEx.JSON_KEY_HB, "inmobi deeplink scheme");
                }
                return a(str, str2, str3, c3571lb5);
            }
            if (J1.a(this.a, str3, this.e, str, this.g) || AbstractC3772t5.a(str3, this.a, this.e, this.g)) {
                InterfaceC3880x9 interfaceC3880x99 = this.g;
                if (interfaceC3880x99 != null) {
                    ((C3906y9) interfaceC3880x99).c(CampaignEx.JSON_KEY_HB, "appstore link");
                }
                c(str, str2, str3);
                if (c3571lb5 != null) {
                    c3571lb5.f = "EX_NATIVE";
                }
                a(Za.LPStartSuccess, c3571lb5, (Integer) null);
                return new C3442gb(1);
            }
            if (!F3.a(parse)) {
                int a2 = AbstractC3772t5.a(this.a, str3, this.e, str, this.g);
                if (c3571lb5 != null) {
                    c3571lb5.f = "EX_NATIVE";
                }
                if (a2 == 0 || a2 == 1) {
                    a(Za.LPStartSuccess, c3571lb5, (Integer) null);
                    c(str, str2, str3);
                    InterfaceC3880x9 interfaceC3880x910 = this.g;
                    if (interfaceC3880x910 != null) {
                        ((C3906y9) interfaceC3880x910).c(CampaignEx.JSON_KEY_HB, "Deeplink url handled successfully");
                    }
                    return new C3442gb(1);
                }
                InterfaceC3880x9 interfaceC3880x911 = this.g;
                if (interfaceC3880x911 != null) {
                    ((C3906y9) interfaceC3880x911).c(CampaignEx.JSON_KEY_HB, "In processOpenRequest else");
                }
                b(str, str2, str3);
                a(Za.LPBrowserOpenFailed, c3571lb5, Integer.valueOf(a2));
                return new C3442gb(2, Integer.valueOf(a2));
            }
            InterfaceC3880x9 interfaceC3880x912 = this.g;
            if (interfaceC3880x912 != null) {
                ((C3906y9) interfaceC3880x912).c(CampaignEx.JSON_KEY_HB, "http link");
            }
            C3494ib c3494ib = this.b;
            if (c3494ib.a) {
                return new C3442gb(0);
            }
            String str4 = c3494ib.b;
            switch (str4.hashCode()) {
                case -2032180703:
                    break;
                case -1420186263:
                    break;
                case -702637789:
                    break;
                case 112775115:
                    if (str4.equals("IN_CUSTOM")) {
                        InterfaceC3880x9 interfaceC3880x913 = this.g;
                        if (interfaceC3880x913 != null) {
                            ((C3906y9) interfaceC3880x913).c(CampaignEx.JSON_KEY_HB, "open internal custom");
                        }
                        InterfaceC3880x9 interfaceC3880x914 = this.g;
                        if (interfaceC3880x914 != null) {
                            ((C3906y9) interfaceC3880x914).a(CampaignEx.JSON_KEY_HB, "In processOpenInternalCustomRequest");
                        }
                        c = a(str3, str, c3571lb5);
                        if ((c == 0 || c == 1) && (interfaceC3880x93 = this.g) != null) {
                            ((C3906y9) interfaceC3880x93).c(CampaignEx.JSON_KEY_HB, "Internal Custom handled successfully");
                            break;
                        }
                    }
                    interfaceC3880x92 = this.g;
                    if (interfaceC3880x92 != null) {
                        ((C3906y9) interfaceC3880x92).c(CampaignEx.JSON_KEY_HB, "invalid scheme - open internal native");
                    }
                    c = c(str, str2, str3, c3571lb5);
                    break;
                case 409244785:
                    break;
                default:
                    interfaceC3880x92 = this.g;
                    if (interfaceC3880x92 != null) {
                    }
                    c = c(str, str2, str3, c3571lb5);
                    break;
            }
            if (c == 0 || c == 1) {
                return new C3442gb(1);
            }
            if (c3571lb5 != null) {
                c3571lb5.f = this.b.b;
            }
            a(Za.LPBrowserOpenFailed, c3571lb5, Integer.valueOf(c));
            return new C3442gb(2, Integer.valueOf(c));
        }
        c3571lb2 = null;
        a(Za.LPClickStart, c3571lb2, (Integer) null);
        if (str3 != null) {
        }
        C3571lb c3571lb32 = c3571lb2;
        interfaceC3880x9 = this.g;
        if (interfaceC3880x9 != null) {
        }
        a(Za.LPStartFailed, c3571lb32, (Integer) 2);
        b(str, str2, str3);
        return new C3442gb(3, 2);
    }

    public final C3442gb b(String str, String str2, String str3, C3571lb c3571lb) {
        InterfaceC3880x9 interfaceC3880x9 = this.g;
        if (interfaceC3880x9 != null) {
            ((C3906y9) interfaceC3880x9).c(CampaignEx.JSON_KEY_HB, "In processInMobiNativeBrowserScheme");
        }
        String queryParameter = Uri.parse(str3).getQueryParameter("url");
        if (queryParameter == null || queryParameter.length() == 0) {
            Ya ya = this.d;
            if (ya != null) {
                ya.a(str2, "Invalid URL", str);
            }
            InterfaceC3880x9 interfaceC3880x92 = this.g;
            if (interfaceC3880x92 != null) {
                ((C3906y9) interfaceC3880x92).c(CampaignEx.JSON_KEY_HB, "InMobiNativeBrowserScheme url is Empty or null");
            }
            a(Za.LPStartFailed, c3571lb, (Integer) 8001);
            return new C3442gb(3, 8001);
        }
        if (c3571lb != null) {
            c3571lb.f = "EX_NATIVE";
        }
        boolean a = AbstractC3772t5.a(str3, this.a, this.e, this.g);
        InterfaceC3880x9 interfaceC3880x93 = this.g;
        if (interfaceC3880x93 != null) {
            ((C3906y9) interfaceC3880x93).c(CampaignEx.JSON_KEY_HB, "openDefaultApplication result = " + a + " for url = " + str3);
        }
        if (a) {
            a(Za.LPStartSuccess, c3571lb, (Integer) null);
            c(str, str2, str3);
            InterfaceC3880x9 interfaceC3880x94 = this.g;
            if (interfaceC3880x94 != null) {
                ((C3906y9) interfaceC3880x94).c(CampaignEx.JSON_KEY_HB, "InmobiNativeBrowser scheme url handled successfully");
            }
            return new C3442gb(1);
        }
        InterfaceC3880x9 interfaceC3880x95 = this.g;
        if (interfaceC3880x95 != null) {
            ((C3906y9) interfaceC3880x95).c(CampaignEx.JSON_KEY_HB, "Trying appLinkOrDeepLinkHandled with urlEndpoint = ".concat(queryParameter));
        }
        int a2 = AbstractC3772t5.a(this.a, queryParameter, this.e, str, this.g);
        if (a2 == 0 || a2 == 1) {
            a(Za.LPStartSuccess, c3571lb, (Integer) null);
            c(str, str2, str3);
            InterfaceC3880x9 interfaceC3880x96 = this.g;
            if (interfaceC3880x96 != null) {
                ((C3906y9) interfaceC3880x96).c(CampaignEx.JSON_KEY_HB, "InmobiNativeBrowser scheme url handled successfully");
            }
            return new C3442gb(1);
        }
        Ya ya2 = this.d;
        if (ya2 != null) {
            ya2.a(str2, "Invalid URL", str);
        }
        InterfaceC3880x9 interfaceC3880x97 = this.g;
        if (interfaceC3880x97 != null) {
            ((C3906y9) interfaceC3880x97).c(CampaignEx.JSON_KEY_HB, ljg.j(a2, "processedResult = "));
        }
        InterfaceC3880x9 interfaceC3880x98 = this.g;
        if (interfaceC3880x98 != null) {
            ((C3906y9) interfaceC3880x98).c(CampaignEx.JSON_KEY_HB, "InmobiNativeBrowser scheme url handling failed");
        }
        a(Za.LPBrowserOpenFailed, c3571lb, Integer.valueOf(a2));
        return new C3442gb(2, Integer.valueOf(a2));
    }

    public final int c(String str, String str2, String str3, C3571lb c3571lb) {
        InterfaceC3880x9 interfaceC3880x9 = this.g;
        if (interfaceC3880x9 != null) {
            ((C3906y9) interfaceC3880x9).a(CampaignEx.JSON_KEY_HB, "In processInternalNativeRequest");
        }
        try {
            return d(str, str2, str3, c3571lb);
        } catch (Exception e) {
            Ya ya = this.d;
            if (ya != null) {
                ya.a(str2, "Unexpected error", "open");
            }
            Xb.a((byte) 1, "InMobi", "Failed to open URL SDK encountered unexpected error");
            InterfaceC3880x9 interfaceC3880x92 = this.g;
            if (interfaceC3880x92 == null) {
                return 9;
            }
            ((C3906y9) interfaceC3880x92).b(CampaignEx.JSON_KEY_HB, dmi.q("SDK encountered unexpected error in handling open() request from creative ", e.getMessage()));
            return 9;
        }
    }

    public final int d(String str, String str2, String str3, C3571lb c3571lb) {
        String a;
        str.getClass();
        InterfaceC3880x9 interfaceC3880x9 = this.g;
        if (interfaceC3880x9 != null) {
            ((C3906y9) interfaceC3880x9).c(CampaignEx.JSON_KEY_HB, dmi.q("processOpenCCTRequest - url - ", str3));
        }
        if (c3571lb != null) {
            c3571lb.f = "IN_NATIVE";
        }
        if (str3 == null || (kotlin.text.c.v(str3, "http", false) && !URLUtil.isValidUrl(str3))) {
            InterfaceC3880x9 interfaceC3880x92 = this.g;
            if (interfaceC3880x92 != null) {
                ((C3906y9) interfaceC3880x92).c(CampaignEx.JSON_KEY_HB, fc6.n(str, " called with invalid url (", str3, ")"));
            }
            Ya ya = this.d;
            if (ya != null) {
                ya.a(str2, "Invalid URL", str);
            }
            a(Za.LPStartFailed, c3571lb, (Integer) 3);
            return 3;
        }
        String a2 = AbstractC3643o5.a(this.a);
        try {
            try {
                boolean z = this.b.c;
                if (a2 != null && z) {
                    Y2 y2 = new Y2(str3, null, this.a, this.c, this.e, c3571lb, str);
                    C3591m5 c3591m5 = y2.e;
                    Context context = y2.f;
                    if (c3591m5.a == null && context != null && (a = AbstractC3643o5.a(context)) != null) {
                        C3539k5 c3539k5 = new C3539k5(c3591m5);
                        c3591m5.b = c3539k5;
                        ba4.a(context, a, c3539k5);
                    }
                    InterfaceC3880x9 interfaceC3880x93 = this.g;
                    if (interfaceC3880x93 != null) {
                        ((C3906y9) interfaceC3880x93).c(CampaignEx.JSON_KEY_HB, "Default and Internal Native handled successfully");
                    }
                    return 0;
                }
                InterfaceC3880x9 interfaceC3880x94 = this.g;
                if (interfaceC3880x94 != null) {
                    ((C3906y9) interfaceC3880x94).a(CampaignEx.JSON_KEY_HB, "ChromeCustomTab fallback to Embedded");
                }
                if (c3571lb != null) {
                    c3571lb.f = "IN_CUSTOM";
                }
                return a(str3, str, c3571lb);
            } catch (Exception e) {
                InterfaceC3880x9 interfaceC3880x95 = this.g;
                if (interfaceC3880x95 != null) {
                    ((C3906y9) interfaceC3880x95).a(CampaignEx.JSON_KEY_HB, "Exception occurred while opening External ", e);
                }
                return 9;
            }
        } catch (Exception unused) {
            int a3 = F3.a(this.a, str3, this.e, str);
            if (a3 != 0 && a3 != 1) {
                return a3;
            }
            c(str, str2, str3);
            if (c3571lb != null) {
                c3571lb.f = "EX_NATIVE";
            }
            a(Za.LPStartSuccess, c3571lb, (Integer) null);
            return a3;
        }
    }

    public final int e(String str, String str2, String str3, C3571lb c3571lb) {
        InterfaceC3880x9 interfaceC3880x9 = this.g;
        if (interfaceC3880x9 != null) {
            ((C3906y9) interfaceC3880x9).a(CampaignEx.JSON_KEY_HB, "In processOpenExternalNativeRequest");
        }
        int a = AbstractC3772t5.a(this.a, str3, this.e, str, this.g);
        if (a != 0 && a != 1) {
            return d(str, str2, str3, c3571lb);
        }
        if (c3571lb != null) {
            c3571lb.f = "EX_NATIVE";
        }
        a(Za.LPStartSuccess, c3571lb, (Integer) null);
        c(str, str2, str3);
        InterfaceC3880x9 interfaceC3880x92 = this.g;
        if (interfaceC3880x92 == null) {
            return 0;
        }
        ((C3906y9) interfaceC3880x92).c(CampaignEx.JSON_KEY_HB, "External Native handled successfully");
        return 0;
    }

    public final void f(String str, String str2, String str3, C3571lb c3571lb) {
        String str4;
        try {
            int a = F3.a(this.a, str2, this.e, "openExternal");
            if (a != 0 && a != 1) {
                a(Za.LPBrowserOpenFailed, c3571lb, Integer.valueOf(a));
                Ya ya = this.d;
                if (ya != null) {
                    try {
                        str4 = URLEncoder.encode(str2, com.mbridge.msdk.playercommon.exoplayer2.C.UTF8_NAME);
                        str4.getClass();
                    } catch (UnsupportedEncodingException unused) {
                        str4 = str2;
                    }
                    ya.a(str, "Cannot resolve URI (" + str4 + ")", "openExternal");
                    return;
                }
                return;
            }
            a(Za.LPStartSuccess, c3571lb, (Integer) null);
            c("openExternal", str, str2);
        } catch (ActivityNotFoundException e) {
            a(this, str, str2, str3, c3571lb, e);
        } catch (NullPointerException e2) {
            a(this, str, str2, str3, c3571lb, e2);
        } catch (URISyntaxException e3) {
            a(this, str, str2, str3, c3571lb, e3);
        } catch (Exception e4) {
            a(Za.LPBrowserOpenFailed, c3571lb, (Integer) 9);
            Ya ya2 = this.d;
            if (ya2 != null) {
                ya2.a(str, "Unexpected error", "openExternal");
            }
            Xb.a((byte) 1, CampaignEx.JSON_KEY_HB, "Could not open URL SDK encountered an unexpected error");
            InterfaceC3880x9 interfaceC3880x9 = this.g;
            if (interfaceC3880x9 != null) {
                ((C3906y9) interfaceC3880x9).b(CampaignEx.JSON_KEY_HB, dmi.q("SDK encountered unexpected error in handling openExternal() request from creative ", e4.getMessage()));
            }
        }
    }

    public /* synthetic */ C3468hb(Context context, C3494ib c3494ib, C3806ud c3806ud, Eh eh, C3597mb c3597mb, InterfaceC3880x9 interfaceC3880x9, int i) {
        this(context, c3494ib, null, (i & 8) != 0 ? null : c3806ud, eh, c3597mb, interfaceC3880x9, null);
    }

    public final void c(String str, String str2, String str3) {
        Ya ya = this.d;
        if (ya != null) {
            ya.a();
        }
        Ya ya2 = this.d;
        if (ya2 != null) {
            ya2.b(str, str2, str3);
        }
    }

    public final void b(String str, String str2, String str3) {
        InterfaceC3880x9 interfaceC3880x9 = this.g;
        if (interfaceC3880x9 != null) {
            ((C3906y9) interfaceC3880x9).c(CampaignEx.JSON_KEY_HB, dmi.r(str, " called with invalid url (", str3, ")"));
        }
        Ya ya = this.d;
        if (ya != null) {
            ya.a(str2, "Invalid URL", str);
        }
    }

    public static /* synthetic */ C3442gb a(C3468hb c3468hb, String str, String str2, String str3, C3571lb c3571lb, int i) {
        if ((i & 8) != 0) {
            c3571lb = null;
        }
        return c3468hb.a(str, str2, str3, c3571lb, (i & 16) == 0);
    }

    public final boolean a(String str, String str2, C3571lb c3571lb, U2 u2) {
        String a;
        try {
            if (!this.b.d || u2 == null) {
                return false;
            }
            String a2 = AbstractC3643o5.a(this.a);
            if (a2 != null) {
                try {
                    boolean b = Uf.b(Uf.a(R5.g()));
                    Class cls = Integer.TYPE;
                    if (b) {
                        da4.class.getDeclaredMethod("d", cls);
                    } else {
                        da4.class.getDeclaredMethod("b", cls);
                    }
                    Y2 y2 = new Y2(str2, u2, this.a, this.c, this.e, c3571lb, str);
                    C3591m5 c3591m5 = y2.e;
                    Context context = y2.f;
                    if (c3591m5.a == null && context != null && (a = AbstractC3643o5.a(context)) != null) {
                        C3539k5 c3539k5 = new C3539k5(c3591m5);
                        c3591m5.b = c3539k5;
                        ba4.a(context, a, c3539k5);
                        return true;
                    }
                    return true;
                } catch (Error | Exception unused) {
                }
            }
            InterfaceC3880x9 interfaceC3880x9 = this.g;
            if (interfaceC3880x9 == null) {
                return false;
            }
            ((C3906y9) interfaceC3880x9).c(CampaignEx.JSON_KEY_HB, "Partial tabs not supported: packageName - " + a2);
            return false;
        } catch (Exception e) {
            InterfaceC3880x9 interfaceC3880x92 = this.g;
            if (interfaceC3880x92 == null) {
                return false;
            }
            ((C3906y9) interfaceC3880x92).c(CampaignEx.JSON_KEY_HB, dmi.q("Error while opening partial tab: ", e.getMessage()));
            return false;
        }
    }

    public final int a(String str, String str2, String str3, C3571lb c3571lb, U2 u2) {
        str.getClass();
        if (str3 != null && str3.length() != 0) {
            Uri parse = Uri.parse(str3);
            String scheme = parse.getScheme();
            if (scheme != null && scheme.length() != 0) {
                if (Intrinsics.c(parse.getScheme(), "inmobinativebrowser")) {
                    b(str, str2, str3, c3571lb);
                    return 2;
                }
                if (Intrinsics.c(parse.getScheme(), "inmobideeplink")) {
                    return a(str, str2, str3, c3571lb).a == 1 ? 2 : 4;
                }
                if (J1.a(this.a, str3, this.e, str, this.g) | AbstractC3772t5.a(str3, this.a, this.e, this.g)) {
                    c(str, str2, str3);
                    if (c3571lb != null) {
                        c3571lb.f = "EX_NATIVE";
                    }
                    a(Za.LPStartSuccess, c3571lb, (Integer) null);
                    return 2;
                }
                if (F3.a(parse) && a(str, str3, c3571lb, u2)) {
                    return 5;
                }
                if (F3.a(parse)) {
                    return 3;
                }
                int a = AbstractC3772t5.a(this.a, str3, this.e, str, this.g);
                if (c3571lb != null) {
                    c3571lb.f = "EX_NATIVE";
                }
                if (a != 0 && a != 1) {
                    InterfaceC3880x9 interfaceC3880x9 = this.g;
                    if (interfaceC3880x9 != null) {
                        ((C3906y9) interfaceC3880x9).b(CampaignEx.JSON_KEY_HB, "CustomExpand handling failed");
                    }
                    a(Za.LPCompleteFailed, c3571lb, (Integer) null);
                    return 4;
                }
                c(str, str2, str3);
                a(Za.LPStartSuccess, c3571lb, (Integer) null);
                InterfaceC3880x9 interfaceC3880x92 = this.g;
                if (interfaceC3880x92 != null) {
                    ((C3906y9) interfaceC3880x92).c(CampaignEx.JSON_KEY_HB, "Deeplink url handled successfully");
                }
                return 2;
            }
            b(str, str2, str3);
            a(Za.LPStartFailed, c3571lb, (Integer) 4);
            return 1;
        }
        b(str, str2, str3);
        a(Za.LPStartFailed, c3571lb, (Integer) 2);
        return 1;
    }

    public final C3442gb a(String str, String str2, String str3, C3571lb c3571lb) {
        InterfaceC3880x9 interfaceC3880x9 = this.g;
        if (interfaceC3880x9 != null) {
            ((C3906y9) interfaceC3880x9).a(CampaignEx.JSON_KEY_HB, "In processInMobiDeepLinkScheme");
        }
        Uri parse = Uri.parse(str3);
        int a = a(str, parse.getQueryParameter("primaryUrl"), parse.getQueryParameter("primaryTrackingUrl"));
        if (a != 0 && a != 1) {
            int a2 = a(str, parse.getQueryParameter("fallbackUrl"), parse.getQueryParameter("fallbackTrackingUrl"));
            if (c3571lb != null) {
                c3571lb.f = "EX_NATIVE";
            }
            if (a2 != 0 && a2 != 1) {
                Ya ya = this.d;
                if (ya != null) {
                    ya.a(str2, "Invalid URL", str);
                }
                InterfaceC3880x9 interfaceC3880x92 = this.g;
                if (interfaceC3880x92 != null) {
                    ((C3906y9) interfaceC3880x92).c(CampaignEx.JSON_KEY_HB, "InMobiDeepLinkScheme Fallback Url handling failed");
                }
                a(Za.LPBrowserOpenFailed, c3571lb, Integer.valueOf(a2));
                return new C3442gb(2, Integer.valueOf(a2));
            }
            InterfaceC3880x9 interfaceC3880x93 = this.g;
            if (interfaceC3880x93 != null) {
                ((C3906y9) interfaceC3880x93).c(CampaignEx.JSON_KEY_HB, "InMobiDeepLinkScheme Fallback Url handled successfully");
            }
            a(Za.LPStartSuccess, c3571lb, (Integer) null);
            c(str, str2, str3);
            return new C3442gb(1);
        }
        InterfaceC3880x9 interfaceC3880x94 = this.g;
        if (interfaceC3880x94 != null) {
            ((C3906y9) interfaceC3880x94).c(CampaignEx.JSON_KEY_HB, "InMobiDeepLinkScheme Primary Url handled successfully");
        }
        if (c3571lb != null) {
            c3571lb.f = "EX_NATIVE";
        }
        a(Za.LPStartSuccess, c3571lb, (Integer) null);
        c(str, str2, str3);
        return new C3442gb(1);
    }

    public final int a(String str, String str2, String str3) {
        InterfaceC3880x9 interfaceC3880x9 = this.g;
        if (interfaceC3880x9 != null) {
            ((C3906y9) interfaceC3880x9).c(CampaignEx.JSON_KEY_HB, fc6.n("inMobiDeepLinkSchemeUrlHandled - url - ", str2, " trackingUrl ", str3));
        }
        if (str2 != null && str2.length() != 0) {
            if (AbstractC3772t5.a(str2, this.a, this.e, this.g)) {
                if (N3.a(str3)) {
                    E3 e3 = E3.a;
                    str3.getClass();
                    InterfaceC3880x9 interfaceC3880x92 = this.g;
                    str3.getClass();
                    E3.a(str3, true, interfaceC3880x92);
                } else {
                    InterfaceC3880x9 interfaceC3880x93 = this.g;
                    if (interfaceC3880x93 != null) {
                        ((C3906y9) interfaceC3880x93).b(CampaignEx.JSON_KEY_HB, "InMobiDeepLinkScheme scheme tracking url handling is invalid ");
                    }
                }
                InterfaceC3880x9 interfaceC3880x94 = this.g;
                if (interfaceC3880x94 != null) {
                    ((C3906y9) interfaceC3880x94).c(CampaignEx.JSON_KEY_HB, "InMobiDeepLinkScheme scheme applink/http url handled successfully");
                }
                return 0;
            }
            int a = AbstractC3772t5.a(this.a, str2, this.e, str, this.g);
            if (a != 0 && a != 1) {
                InterfaceC3880x9 interfaceC3880x95 = this.g;
                if (interfaceC3880x95 != null) {
                    ((C3906y9) interfaceC3880x95).c(CampaignEx.JSON_KEY_HB, "InMobiDeepLinkScheme scheme applink/http url handling failed");
                }
                return a;
            }
            if (N3.a(str3)) {
                E3 e32 = E3.a;
                str3.getClass();
                InterfaceC3880x9 interfaceC3880x96 = this.g;
                str3.getClass();
                E3.a(str3, true, interfaceC3880x96);
            } else {
                InterfaceC3880x9 interfaceC3880x97 = this.g;
                if (interfaceC3880x97 != null) {
                    ((C3906y9) interfaceC3880x97).b(CampaignEx.JSON_KEY_HB, "InMobiDeepLinkScheme scheme tracking url handling is invalid ");
                }
            }
            InterfaceC3880x9 interfaceC3880x98 = this.g;
            if (interfaceC3880x98 != null) {
                ((C3906y9) interfaceC3880x98).c(CampaignEx.JSON_KEY_HB, "InMobiDeepLinkScheme scheme applink/http url handled successfully");
            }
            return 0;
        }
        InterfaceC3880x9 interfaceC3880x99 = this.g;
        if (interfaceC3880x99 == null) {
            return 2;
        }
        ((C3906y9) interfaceC3880x99).b(CampaignEx.JSON_KEY_HB, "InMobiDeepLinkScheme url is Empty or null");
        return 2;
    }

    public final int a(String str, String str2, C3571lb c3571lb) {
        C3571lb c3571lb2;
        C3571lb c3571lb3;
        str.getClass();
        str2.getClass();
        if (c3571lb != null) {
            c3571lb.f = "IN_CUSTOM";
        }
        if (str.length() == 0) {
            InterfaceC3880x9 interfaceC3880x9 = this.g;
            if (interfaceC3880x9 != null) {
                ((C3906y9) interfaceC3880x9).b(CampaignEx.JSON_KEY_HB, "processOpenEmbeddedRequest failed due to empty URL");
            }
            a(Za.LPStartFailed, c3571lb, (Integer) null);
            return 2;
        }
        Uri parse = Uri.parse(str);
        parse.getClass();
        if (F3.a(parse)) {
            Intent intent = new Intent(this.a, (Class<?>) InMobiInAppBrowserActivity.class);
            intent.putExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_ACTIVITY_TYPE", 100);
            intent.putExtra("com.inmobi.ads.rendering.InMobiAdActivity.IN_APP_BROWSER_URL", str);
            intent.putExtra("viewTouchTimestamp", this.e.getViewTouchTimestamp());
            if (c3571lb != null) {
                c3571lb2 = C3571lb.a(c3571lb);
                Za za = Za.LPClickStart;
                c3571lb2.e = 2;
                Unit unit = Unit.a;
            } else {
                c3571lb2 = null;
            }
            intent.putExtra("lpTelemetryControlInfo", c3571lb2);
            if (c3571lb != null) {
                c3571lb3 = C3571lb.a(c3571lb);
                Za za2 = Za.LPClickStart;
                c3571lb3.e = 2;
                Unit unit2 = Unit.a;
            } else {
                c3571lb3 = null;
            }
            intent.putExtra("lpTelemetryControlInfo", c3571lb3);
            InterfaceC3880x9 interfaceC3880x92 = this.g;
            if (interfaceC3880x92 != null) {
                String C = fc6.C();
                HashMap hashMap = Y8.a;
                String str3 = C.toString();
                str3.getClass();
                Y8.a.put(str3, new WeakReference(interfaceC3880x92));
                intent.putExtra("loggerCacheKey", C.toString());
            }
            Ya ya = this.d;
            if (ya != null) {
                ya.a(intent);
            }
            a(Za.LPStartSuccess, c3571lb, (Integer) null);
            Ya ya2 = this.d;
            if (ya2 == null) {
                return 1;
            }
            ya2.b(null, null, str);
            return 1;
        }
        InterfaceC3880x9 interfaceC3880x93 = this.g;
        if (interfaceC3880x93 == null) {
            return 10;
        }
        ((C3906y9) interfaceC3880x93).b(CampaignEx.JSON_KEY_HB, "Embedded request unable to handle ".concat(str));
        return 10;
    }

    public final C3442gb a(String str, String str2, String str3, String str4, C3571lb c3571lb) {
        Activity activity;
        AbstractC3416fb c3365db;
        GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi;
        str.getClass();
        InterfaceC3880x9 interfaceC3880x9 = this.g;
        if (interfaceC3880x9 != null) {
            ((C3906y9) interfaceC3880x9).a(CampaignEx.JSON_KEY_HB, fc6.n("inline installer called with clickThroughUrl: ", str3, ", inlineInstallUrl: ", str4));
        }
        if (c3571lb != null) {
            c3571lb.f = "SKSTORE";
        }
        InlineParams inlineParams = this.b.e;
        if (inlineParams == null) {
            c3365db = new C3365db(8700);
        } else {
            WeakReference weakReference = this.h;
            if (weakReference == null || (gestureDetectorOnGestureListenerC3889xi = (GestureDetectorOnGestureListenerC3889xi) weakReference.get()) == null) {
                activity = null;
            } else {
                activity = gestureDetectorOnGestureListenerC3889xi.getFullScreenActivity();
                if (activity == null) {
                    activity = gestureDetectorOnGestureListenerC3889xi.getBannerHolderActivity().get();
                }
            }
            String targetBundleId = inlineParams.getTargetBundleId();
            String url = N3.a(str4) ? str4 : inlineParams.getUrl();
            if (targetBundleId == null || targetBundleId.length() == 0) {
                c3365db = new C3365db(8702);
            } else if (activity == null) {
                c3365db = new C3365db(8704);
            } else if (url != null && url.length() != 0) {
                String uri = Uri.parse(url).buildUpon().appendQueryParameter("id", targetBundleId).build().toString();
                uri.getClass();
                c3365db = new C3390eb(activity, uri);
            } else {
                c3365db = new C3365db(2);
            }
        }
        if (c3365db instanceof C3390eb) {
            return a(str, str2, c3571lb, str3, (C3390eb) c3365db, inlineParams != null ? inlineParams.getPingMode() : 2);
        }
        if (c3365db instanceof C3365db) {
            return a(str3, str, str2, c3571lb, ((C3365db) c3365db).a);
        }
        zzl.b();
        return null;
    }

    public final C3442gb a(String str, String str2, String str3, C3571lb c3571lb, int i) {
        InterfaceC3880x9 interfaceC3880x9 = this.g;
        if (interfaceC3880x9 != null) {
            ((C3906y9) interfaceC3880x9).a(CampaignEx.JSON_KEY_HB, dmi.q("Executing inline installer fallback flow for URL: ", str));
        }
        a(i, c3571lb);
        if (c3571lb != null) {
            c3571lb.f = "EX_NATIVE";
        }
        if (str != null && str.length() != 0) {
            if (J1.a(this.a, str, this.e, str2, this.g)) {
                a(Za.LPStartSuccess, c3571lb, (Integer) null);
                c(str2, str3, str);
                return new C3442gb(1);
            }
            if (AbstractC3772t5.a(str, this.a, this.e, this.g)) {
                a(Za.LPStartSuccess, c3571lb, (Integer) null);
                c(str2, str3, str);
                return new C3442gb(1);
            }
            int e = e(str2, str3, str, c3571lb);
            if (e != 0 && e != 1) {
                a(Za.LPBrowserOpenFailed, c3571lb, Integer.valueOf(e));
                Ya ya = this.d;
                if (ya != null) {
                    ya.a(str3, "Launch failed", str2);
                }
                return new C3442gb(2, Integer.valueOf(e));
            }
            return new C3442gb(1);
        }
        a(Za.LPBrowserOpenFailed, c3571lb, (Integer) 2);
        Ya ya2 = this.d;
        if (ya2 != null) {
            ya2.a(str3, "Launch failed", str2);
        }
        return new C3442gb(2, 2);
    }

    public final C3442gb a(String str, String str2, C3571lb c3571lb, String str3, C3390eb c3390eb, int i) {
        InterfaceC3880x9 interfaceC3880x9 = this.g;
        if (interfaceC3880x9 != null) {
            ((C3906y9) interfaceC3880x9).a(CampaignEx.JSON_KEY_HB, dmi.q("Executing inline installer flow for URL: ", str3));
        }
        int a = F3.a(c3390eb);
        if (a != 0 && a != 1) {
            InterfaceC3880x9 interfaceC3880x92 = this.g;
            if (interfaceC3880x92 != null) {
                ((C3906y9) interfaceC3880x92).a(CampaignEx.JSON_KEY_HB, dmi.l(a, "Inline installer launch failed; executing fallback for URL: ", str3, ", errorCode: "));
            }
            return a(str3, str, str2, c3571lb, a);
        }
        if (str3 != null) {
            InterfaceC3880x9 interfaceC3880x93 = this.g;
            if (interfaceC3880x93 != null) {
                ((C3906y9) interfaceC3880x93).a(CampaignEx.JSON_KEY_HB, "Inline installer launch succeeded for URL: ".concat(str3));
            }
            if (i != 0) {
                if (i != 1) {
                    E3 e3 = E3.a;
                    Ug.a(Rg.REGULAR, new C3874x3(str3, true, this.g, null));
                } else {
                    E3 e32 = E3.a;
                    E3.a(str3, true, this.g);
                }
            }
        }
        a(Za.LPStartSuccess, c3571lb, (Integer) null);
        Ya ya = this.d;
        if (ya != null) {
            ya.b(str, str2, str3);
        }
        return new C3442gb(1);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0065 A[Catch: all -> 0x0009, TryCatch #0 {all -> 0x0009, blocks: (B:2:0x0000, B:4:0x0004, B:7:0x000e, B:9:0x0023, B:11:0x0065, B:13:0x006b, B:14:0x006f, B:16:0x0081, B:17:0x0091, B:28:0x000c), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023 A[Catch: all -> 0x0009, TryCatch #0 {all -> 0x0009, blocks: (B:2:0x0000, B:4:0x0004, B:7:0x000e, B:9:0x0023, B:11:0x0065, B:13:0x006b, B:14:0x006f, B:16:0x0081, B:17:0x0091, B:28:0x000c), top: B:1:0x0000 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(int i, C3571lb c3571lb) {
        Object u2gVar;
        Throwable a;
        InterfaceC3880x9 interfaceC3880x9;
        C3597mb c3597mb;
        try {
            p2g p2gVar = w2g.b;
        } catch (Throwable th) {
            p2g p2gVar2 = w2g.b;
            u2gVar = new u2g(th);
        }
        if (c3571lb != null) {
            c3597mb = c3571lb.a;
            if (c3597mb == null) {
            }
            LinkedHashMap i2 = tub.i(new Pair(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i)));
            if (c3597mb != null) {
                i2.put("plType", c3597mb.c);
                i2.put("impressionId", c3597mb.b);
                i2.put("plId", Long.valueOf(c3597mb.a));
                i2.put("adType", c3597mb.d);
                i2.put("markupType", c3597mb.e);
                i2.put("creativeType", c3597mb.f);
                i2.put("metadataBlob", c3597mb.g);
                i2.put("isRewarded", Boolean.valueOf(c3597mb.h));
            }
            if (c3571lb != null) {
                String str = c3571lb.f;
                if (str == null) {
                    str = c3571lb.a.i;
                }
                i2.put("trigger", str);
                i2.put("urlType", c3571lb.b);
                long j2 = c3571lb.d;
                if (j2 != 0) {
                    ku3 ku3Var = Hl.a;
                    i2.put(Payload.LATENCY, Long.valueOf(SystemClock.elapsedRealtime() - j2));
                }
            }
            i2.put("networkType", F5.g());
            C3839vk c3839vk = C3839vk.a;
            C3839vk.b("InlineInstallFailed", i2, EnumC3943zk.SDK);
            u2gVar = Unit.a;
            a = w2g.a(u2gVar);
            if (a != null || (interfaceC3880x9 = this.g) == null) {
            }
            ((C3906y9) interfaceC3880x9).b(CampaignEx.JSON_KEY_HB, dmi.q("Failed to submit inline install failed telemetry: ", a.getMessage()));
            return;
        }
        c3597mb = this.f;
        LinkedHashMap i22 = tub.i(new Pair(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i)));
        if (c3597mb != null) {
        }
        if (c3571lb != null) {
        }
        i22.put("networkType", F5.g());
        C3839vk c3839vk2 = C3839vk.a;
        C3839vk.b("InlineInstallFailed", i22, EnumC3943zk.SDK);
        u2gVar = Unit.a;
        a = w2g.a(u2gVar);
        if (a != null) {
        }
    }

    public static final void a(C3468hb c3468hb, String str, String str2, String str3, C3571lb c3571lb, Exception exc) {
        InterfaceC3880x9 interfaceC3880x9 = c3468hb.g;
        if (interfaceC3880x9 != null) {
            ((C3906y9) interfaceC3880x9).b(CampaignEx.JSON_KEY_HB, dmi.q("Error message in processing openExternal: ", exc.getMessage()));
        }
        Ya ya = c3468hb.d;
        if (ya != null) {
            try {
                String encode = URLEncoder.encode(str2, com.mbridge.msdk.playercommon.exoplayer2.C.UTF8_NAME);
                encode.getClass();
                str2 = encode;
            } catch (UnsupportedEncodingException unused) {
            }
            ya.a(str, lnb.o("Cannot resolve URI (", str2, ")"), "openExternal");
        }
        if (str3 != null) {
            c3468hb.f(str, str3, null, c3571lb);
        }
    }

    public final void a(Za za, C3571lb c3571lb, Integer num) {
        za.getClass();
        AbstractC3339cb.a(za, c3571lb, num, new lqj(this, 29));
    }

    public static final Unit a(C3468hb c3468hb, String str, Map map) {
        str.getClass();
        map.getClass();
        Ya ya = c3468hb.d;
        if (ya != null) {
            ya.a(str, map);
        }
        return Unit.a;
    }
}
