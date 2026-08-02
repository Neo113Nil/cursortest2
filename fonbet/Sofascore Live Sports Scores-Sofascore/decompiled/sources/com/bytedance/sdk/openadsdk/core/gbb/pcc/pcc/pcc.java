package com.bytedance.sdk.openadsdk.core.gbb.pcc.pcc;

import android.content.Context;
import android.graphics.Point;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.bytedance.sdk.openadsdk.core.gbb.gm.pcc;
import com.bytedance.sdk.openadsdk.core.gbb.pcc.pcc.vj;
import java.io.IOException;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class pcc {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static com.bytedance.sdk.openadsdk.core.gbb.gm pcc(Context context, XmlPullParser xmlPullParser) throws IOException, XmlPullParserException {
        float f;
        com.bytedance.sdk.openadsdk.core.gbb.gm gmVar;
        vj.pcc pccVar;
        int i;
        char c;
        if (context == null) {
            vj.pcc(xmlPullParser);
            return null;
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        int i2 = displayMetrics.widthPixels;
        int i3 = displayMetrics.heightPixels;
        float f2 = displayMetrics.density;
        int i4 = (int) (i2 / f2);
        int i5 = (int) (i3 / f2);
        float f3 = Float.MIN_VALUE;
        com.bytedance.sdk.openadsdk.core.gbb.gm gmVar2 = null;
        while (true) {
            int i6 = 3;
            if (xmlPullParser.getEventType() == 3 && xmlPullParser.getName().equals("CompanionAds")) {
                return gmVar2;
            }
            xmlPullParser.next();
            int i7 = 2;
            if (xmlPullParser.getEventType() == 2 && xmlPullParser.getName().equals("Companion")) {
                String str = vj.qf;
                int sf = vj.sf(xmlPullParser.getAttributeValue(str, "width"));
                int sf2 = vj.sf(xmlPullParser.getAttributeValue(str, "height"));
                if (sf < 300 || sf2 < 250) {
                    f = f3;
                    gmVar = gmVar2;
                    vj.pcc(xmlPullParser);
                } else {
                    vj.pcc pccVar2 = new vj.pcc();
                    while (true) {
                        if (xmlPullParser.getEventType() != i6 || !xmlPullParser.getName().equals("Companion")) {
                            int i8 = sf2;
                            int i9 = sf;
                            xmlPullParser.next();
                            if (xmlPullParser.getEventType() == i7) {
                                String name = xmlPullParser.getName();
                                name.getClass();
                                float f4 = f3;
                                com.bytedance.sdk.openadsdk.core.gbb.gm gmVar3 = gmVar2;
                                char c2 = 65535;
                                switch (name.hashCode()) {
                                    case -375340334:
                                        if (name.equals("IFrameResource")) {
                                            c = 0;
                                            c2 = c;
                                            break;
                                        }
                                        break;
                                    case -348198615:
                                        if (name.equals("CompanionClickThrough")) {
                                            c = 1;
                                            c2 = c;
                                            break;
                                        }
                                        break;
                                    case 611554000:
                                        if (name.equals("TrackingEvents")) {
                                            c2 = 2;
                                            break;
                                        }
                                        break;
                                    case 676623548:
                                        if (name.equals("StaticResource")) {
                                            c2 = 3;
                                            break;
                                        }
                                        break;
                                    case 1877773523:
                                        if (name.equals("CompanionClickTracking")) {
                                            c = 4;
                                            c2 = c;
                                            break;
                                        }
                                        break;
                                    case 1928285401:
                                        if (name.equals("HTMLResource")) {
                                            c = 5;
                                            c2 = c;
                                            break;
                                        }
                                        break;
                                }
                                switch (c2) {
                                    case 0:
                                        vj.pcc pccVar3 = pccVar2;
                                        i = 2;
                                        Point pcc = com.bytedance.sdk.openadsdk.core.gbb.gm.pcc.pcc(context, i9, i8, pcc.sf.HTML_RESOURCE);
                                        int i10 = pcc.x;
                                        int i11 = pcc.y;
                                        pcc.sf sfVar = pcc.sf.IFRAME_RESOURCE;
                                        pcc.EnumC0071pcc enumC0071pcc = pcc.EnumC0071pcc.NONE;
                                        float pcc2 = com.bytedance.sdk.openadsdk.core.gbb.gm.pcc(i4, i5, i10, i11, sfVar, enumC0071pcc);
                                        String sf3 = vj.sf(xmlPullParser, "IFrameResource");
                                        if (!TextUtils.isEmpty(sf3) && pcc2 > pccVar3.qf && pcc2 > f4) {
                                            pccVar3.qf = pcc2;
                                            pccVar3.pcc(sf3, enumC0071pcc, sfVar);
                                            pccVar2 = pccVar3;
                                            i7 = i;
                                            sf = i9;
                                            sf2 = i8;
                                            f3 = f4;
                                            gmVar2 = gmVar3;
                                            i6 = 3;
                                            break;
                                        } else {
                                            vj.pcc(xmlPullParser, "IFrameResource", 3);
                                            pccVar2 = pccVar3;
                                            i6 = 3;
                                            i7 = 2;
                                            sf = i9;
                                            sf2 = i8;
                                            f3 = f4;
                                            gmVar2 = gmVar3;
                                            break;
                                        }
                                        break;
                                    case 1:
                                        i = 2;
                                        pccVar2.oo = vj.sf(xmlPullParser, "CompanionClickThrough");
                                        i7 = i;
                                        sf = i9;
                                        sf2 = i8;
                                        f3 = f4;
                                        gmVar2 = gmVar3;
                                        i6 = 3;
                                        break;
                                    case 2:
                                        pccVar = pccVar2;
                                        while (true) {
                                            if (xmlPullParser.next() == 3 && xmlPullParser.getName().equals("TrackingEvents")) {
                                                sf = i9;
                                                pccVar2 = pccVar;
                                                sf2 = i8;
                                                f3 = f4;
                                                gmVar2 = gmVar3;
                                                i6 = 3;
                                                i7 = 2;
                                                break;
                                            } else if (xmlPullParser.getEventType() == 2 && xmlPullParser.getName().equals("Tracking")) {
                                                pccVar.sf(vj.sf(xmlPullParser, "Tracking"));
                                            }
                                        }
                                        break;
                                    case 3:
                                        pccVar = pccVar2;
                                        pcc.EnumC0071pcc enumC0071pcc2 = pcc.EnumC0071pcc.NONE;
                                        String lowerCase = xmlPullParser.getAttributeValue(vj.qf, "creativeType").toLowerCase();
                                        Set<String> set = com.bytedance.sdk.openadsdk.core.gbb.gm.pcc.pcc;
                                        pcc.EnumC0071pcc enumC0071pcc3 = set.contains(lowerCase) ? pcc.EnumC0071pcc.IMAGE : pcc.EnumC0071pcc.JAVASCRIPT;
                                        pcc.sf sfVar2 = pcc.sf.STATIC_RESOURCE;
                                        Point pcc3 = com.bytedance.sdk.openadsdk.core.gbb.gm.pcc.pcc(context, i9, i8, sfVar2);
                                        float pcc4 = com.bytedance.sdk.openadsdk.core.gbb.gm.pcc(i4, i5, pcc3.x, pcc3.y, sfVar2, enumC0071pcc3);
                                        String sf4 = (set.contains(lowerCase) || com.bytedance.sdk.openadsdk.core.gbb.gm.pcc.sf.contains(lowerCase)) ? vj.sf(xmlPullParser, "StaticResource") : null;
                                        if (pcc4 >= pccVar.qf && pcc4 > f4 && !TextUtils.isEmpty(sf4)) {
                                            pccVar.qf = pcc4;
                                            pccVar.pcc(sf4, enumC0071pcc3, sfVar2);
                                            sf = i9;
                                            pccVar2 = pccVar;
                                            sf2 = i8;
                                            f3 = f4;
                                            gmVar2 = gmVar3;
                                            i6 = 3;
                                            i7 = 2;
                                            break;
                                        } else {
                                            vj.pcc(xmlPullParser, "StaticResource", 3);
                                            sf = i9;
                                            pccVar2 = pccVar;
                                            sf2 = i8;
                                            f3 = f4;
                                            i7 = 2;
                                            i6 = 3;
                                            gmVar2 = gmVar3;
                                            break;
                                        }
                                        break;
                                    case 4:
                                        pccVar2.pcc(vj.sf(xmlPullParser, "CompanionClickTracking"));
                                        sf = i9;
                                        sf2 = i8;
                                        f3 = f4;
                                        gmVar2 = gmVar3;
                                        i6 = 3;
                                        i7 = 2;
                                        break;
                                    case 5:
                                        pcc.sf sfVar3 = pcc.sf.HTML_RESOURCE;
                                        Point pcc5 = com.bytedance.sdk.openadsdk.core.gbb.gm.pcc.pcc(context, i9, i8, sfVar3);
                                        int i12 = pcc5.x;
                                        int i13 = pcc5.y;
                                        pcc.EnumC0071pcc enumC0071pcc4 = pcc.EnumC0071pcc.NONE;
                                        pccVar = pccVar2;
                                        float pcc6 = com.bytedance.sdk.openadsdk.core.gbb.gm.pcc(i4, i5, i12, i13, sfVar3, enumC0071pcc4);
                                        String sf5 = vj.sf(xmlPullParser, "HTMLResource");
                                        if (!TextUtils.isEmpty(sf5) && pcc6 > pccVar.qf && pcc6 > f4) {
                                            pccVar.qf = pcc6;
                                            pccVar.pcc(sf5, enumC0071pcc4, sfVar3);
                                            sf = i9;
                                            pccVar2 = pccVar;
                                            sf2 = i8;
                                            f3 = f4;
                                            gmVar2 = gmVar3;
                                            i6 = 3;
                                            i7 = 2;
                                            break;
                                        } else {
                                            vj.pcc(xmlPullParser, "HTMLResource", 3);
                                            sf = i9;
                                            pccVar2 = pccVar;
                                            sf2 = i8;
                                            f3 = f4;
                                            gmVar2 = gmVar3;
                                            i7 = 2;
                                            i6 = 3;
                                            break;
                                        }
                                        break;
                                    default:
                                        vj.pcc(xmlPullParser);
                                        pccVar = pccVar2;
                                        sf = i9;
                                        pccVar2 = pccVar;
                                        sf2 = i8;
                                        f3 = f4;
                                        gmVar2 = gmVar3;
                                        i6 = 3;
                                        i7 = 2;
                                        break;
                                }
                            } else {
                                sf = i9;
                                sf2 = i8;
                            }
                        } else if (!TextUtils.isEmpty(pccVar2.pcc) && pccVar2.qf >= f3) {
                            com.bytedance.sdk.openadsdk.core.gbb.gm gmVar4 = new com.bytedance.sdk.openadsdk.core.gbb.gm(sf, sf2, pccVar2.sf, pccVar2.gm, pccVar2.pcc, pccVar2.vj, pccVar2.wh, pccVar2.oo);
                            f3 = pccVar2.qf;
                            gmVar2 = gmVar4;
                        }
                    }
                }
            } else {
                f = f3;
                gmVar = gmVar2;
            }
            f3 = f;
            gmVar2 = gmVar;
        }
    }
}
