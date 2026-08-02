package defpackage;

import android.graphics.Rect;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.same.report.h;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class vlb {
    public static final wj9 a = wj9.J("w", h.b, "ip", "op", "fr", "v", "layers", "assets", "fonts", "chars", "markers");
    public static final wj9 b = wj9.J("id", "layers", "w", h.b, TtmlNode.TAG_P, "u");
    public static final wj9 c = wj9.J("list");
    public static final wj9 d = wj9.J("cm", "tm", DownloadCommon.DOWNLOAD_REPORT_DOWNLOAD_RATE);

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0045. Please report as an issue. */
    public static plb a(lha lhaVar) {
        plb plbVar;
        float f;
        plb plbVar2;
        plb plbVar3;
        int i;
        float f2;
        plb plbVar4;
        float f3;
        float f4;
        int i2;
        float c2 = vik.c();
        nkb nkbVar = new nkb((Object) null);
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        zwh zwhVar = new zwh(0);
        plb plbVar5 = new plb();
        lhaVar.k();
        int i3 = 0;
        int i4 = 0;
        float f5 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        float f6 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        float f7 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        while (lhaVar.t()) {
            switch (lhaVar.e0(a)) {
                case 0:
                    plbVar = plbVar5;
                    i3 = (int) lhaVar.H();
                    plbVar5 = plbVar;
                    break;
                case 1:
                    plbVar = plbVar5;
                    i4 = (int) lhaVar.H();
                    plbVar5 = plbVar;
                    break;
                case 2:
                    plbVar = plbVar5;
                    f6 = (float) lhaVar.H();
                    plbVar5 = plbVar;
                    break;
                case 3:
                    f = c2;
                    plbVar2 = plbVar5;
                    f5 = ((float) lhaVar.H()) - 0.01f;
                    plbVar5 = plbVar2;
                    c2 = f;
                    break;
                case 4:
                    f = c2;
                    plbVar2 = plbVar5;
                    f7 = (float) lhaVar.H();
                    plbVar5 = plbVar2;
                    c2 = f;
                    break;
                case 5:
                    f = c2;
                    plbVar3 = plbVar5;
                    i = i4;
                    f2 = f6;
                    String[] split = lhaVar.T().split("\\.");
                    int parseInt = Integer.parseInt(split[0]);
                    int parseInt2 = Integer.parseInt(split[1]);
                    int parseInt3 = Integer.parseInt(split[2]);
                    if (parseInt < 4 || (parseInt <= 4 && (parseInt2 < 4 || (parseInt2 <= 4 && parseInt3 < 0)))) {
                        plbVar3.a("Lottie only supports bodymovin >= 4.4.0");
                    }
                    plbVar5 = plbVar3;
                    i4 = i;
                    f6 = f2;
                    c2 = f;
                    break;
                case 6:
                    f = c2;
                    plb plbVar6 = plbVar5;
                    i = i4;
                    f2 = f6;
                    lhaVar.h();
                    int i5 = 0;
                    while (lhaVar.t()) {
                        plb plbVar7 = plbVar6;
                        mla a2 = nla.a(lhaVar, plbVar7);
                        if (a2.e == 3) {
                            i5++;
                        }
                        arrayList.add(a2);
                        nkbVar.g(a2, a2.d);
                        if (i5 > 4) {
                            ajb.b("You have " + i5 + " images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.");
                        }
                        plbVar6 = plbVar7;
                    }
                    plbVar3 = plbVar6;
                    lhaVar.m();
                    plbVar5 = plbVar3;
                    i4 = i;
                    f6 = f2;
                    c2 = f;
                    break;
                case 7:
                    f = c2;
                    i = i4;
                    f2 = f6;
                    lhaVar.h();
                    while (lhaVar.t()) {
                        ArrayList arrayList3 = new ArrayList();
                        nkb nkbVar2 = new nkb((Object) null);
                        lhaVar.k();
                        String str = null;
                        String str2 = null;
                        String str3 = null;
                        int i6 = 0;
                        int i7 = 0;
                        while (lhaVar.t()) {
                            int e0 = lhaVar.e0(b);
                            if (e0 != 0) {
                                if (e0 == 1) {
                                    lhaVar.h();
                                    while (lhaVar.t()) {
                                        mla a3 = nla.a(lhaVar, plbVar5);
                                        nkbVar2.g(a3, a3.d);
                                        arrayList3.add(a3);
                                        plbVar5 = plbVar5;
                                    }
                                    plbVar4 = plbVar5;
                                    lhaVar.m();
                                } else if (e0 == 2) {
                                    i6 = lhaVar.M();
                                } else if (e0 == 3) {
                                    i7 = lhaVar.M();
                                } else if (e0 == 4) {
                                    str2 = lhaVar.T();
                                } else if (e0 != 5) {
                                    lhaVar.f0();
                                    lhaVar.g0();
                                    plbVar4 = plbVar5;
                                } else {
                                    str3 = lhaVar.T();
                                }
                                plbVar5 = plbVar4;
                            } else {
                                str = lhaVar.T();
                            }
                        }
                        plb plbVar8 = plbVar5;
                        lhaVar.n();
                        if (str2 != null) {
                            hashMap2.put(str, new lmb(i6, i7, str, str2, str3));
                        } else {
                            hashMap.put(str, arrayList3);
                        }
                        plbVar5 = plbVar8;
                    }
                    lhaVar.m();
                    plbVar3 = plbVar5;
                    plbVar5 = plbVar3;
                    i4 = i;
                    f6 = f2;
                    c2 = f;
                    break;
                case 8:
                    f = c2;
                    i = i4;
                    float f8 = f6;
                    lhaVar.k();
                    while (lhaVar.t()) {
                        if (lhaVar.e0(c) != 0) {
                            lhaVar.f0();
                            lhaVar.g0();
                        } else {
                            lhaVar.h();
                            while (lhaVar.t()) {
                                wj9 wj9Var = ag8.a;
                                lhaVar.k();
                                String str4 = null;
                                String str5 = null;
                                String str6 = null;
                                while (lhaVar.t()) {
                                    int e02 = lhaVar.e0(ag8.a);
                                    if (e02 != 0) {
                                        float f9 = f8;
                                        if (e02 == 1) {
                                            str5 = lhaVar.T();
                                        } else if (e02 == 2) {
                                            str6 = lhaVar.T();
                                        } else if (e02 != 3) {
                                            lhaVar.f0();
                                            lhaVar.g0();
                                        } else {
                                            lhaVar.H();
                                        }
                                        f8 = f9;
                                    } else {
                                        str4 = lhaVar.T();
                                    }
                                }
                                lhaVar.n();
                                hashMap3.put(str5, new of8(str4, str5, str6));
                                f8 = f8;
                            }
                            lhaVar.m();
                        }
                    }
                    f2 = f8;
                    lhaVar.n();
                    plbVar3 = plbVar5;
                    plbVar5 = plbVar3;
                    i4 = i;
                    f6 = f2;
                    c2 = f;
                    break;
                case 9:
                    f = c2;
                    i = i4;
                    f3 = f6;
                    lhaVar.h();
                    while (lhaVar.t()) {
                        wj9 wj9Var2 = rf8.a;
                        ArrayList arrayList4 = new ArrayList();
                        lhaVar.k();
                        double d2 = 0.0d;
                        char c3 = 0;
                        String str7 = null;
                        String str8 = null;
                        while (lhaVar.t()) {
                            int e03 = lhaVar.e0(rf8.a);
                            if (e03 == 0) {
                                c3 = lhaVar.T().charAt(0);
                            } else if (e03 == 1) {
                                lhaVar.H();
                            } else if (e03 == 2) {
                                d2 = lhaVar.H();
                            } else if (e03 == 3) {
                                str7 = lhaVar.T();
                            } else if (e03 == 4) {
                                str8 = lhaVar.T();
                            } else if (e03 != 5) {
                                lhaVar.f0();
                                lhaVar.g0();
                            } else {
                                lhaVar.k();
                                while (lhaVar.t()) {
                                    if (lhaVar.e0(rf8.b) != 0) {
                                        lhaVar.f0();
                                        lhaVar.g0();
                                    } else {
                                        lhaVar.h();
                                        while (lhaVar.t()) {
                                            arrayList4.add((fbh) hp3.a(lhaVar, plbVar5));
                                        }
                                        lhaVar.m();
                                    }
                                }
                                lhaVar.n();
                            }
                        }
                        lhaVar.n();
                        qf8 qf8Var = new qf8(arrayList4, c3, d2, str7, str8);
                        zwhVar.d(qf8Var.hashCode(), qf8Var);
                    }
                    lhaVar.m();
                    f2 = f3;
                    plbVar3 = plbVar5;
                    plbVar5 = plbVar3;
                    i4 = i;
                    f6 = f2;
                    c2 = f;
                    break;
                case 10:
                    lhaVar.h();
                    while (lhaVar.t()) {
                        lhaVar.k();
                        String str9 = null;
                        float f10 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        float f11 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        while (lhaVar.t()) {
                            int e04 = lhaVar.e0(d);
                            if (e04 != 0) {
                                f4 = c2;
                                if (e04 == 1) {
                                    i2 = i4;
                                    f6 = f6;
                                    f10 = (float) lhaVar.H();
                                } else if (e04 != 2) {
                                    lhaVar.f0();
                                    lhaVar.g0();
                                } else {
                                    i2 = i4;
                                    f6 = f6;
                                    f11 = (float) lhaVar.H();
                                }
                                i4 = i2;
                            } else {
                                f4 = c2;
                                str9 = lhaVar.T();
                            }
                            c2 = f4;
                        }
                        lhaVar.n();
                        arrayList2.add(new yub(str9, f10, f11));
                        f6 = f6;
                        i4 = i4;
                        c2 = c2;
                    }
                    f = c2;
                    i = i4;
                    f3 = f6;
                    lhaVar.m();
                    f2 = f3;
                    plbVar3 = plbVar5;
                    plbVar5 = plbVar3;
                    i4 = i;
                    f6 = f2;
                    c2 = f;
                    break;
                default:
                    lhaVar.f0();
                    lhaVar.g0();
                    f = c2;
                    plbVar3 = plbVar5;
                    i = i4;
                    f2 = f6;
                    plbVar5 = plbVar3;
                    i4 = i;
                    f6 = f2;
                    c2 = f;
                    break;
            }
        }
        float f12 = c2;
        plb plbVar9 = plbVar5;
        Rect rect = new Rect(0, 0, (int) (i3 * f12), (int) (i4 * f12));
        float c4 = vik.c();
        plbVar9.k = rect;
        plbVar9.l = f6;
        plbVar9.m = f5;
        plbVar9.n = f7;
        plbVar9.j = arrayList;
        plbVar9.i = nkbVar;
        plbVar9.c = hashMap;
        plbVar9.d = hashMap2;
        plbVar9.e = c4;
        plbVar9.h = zwhVar;
        plbVar9.f = hashMap3;
        plbVar9.g = arrayList2;
        return plbVar9;
    }
}
