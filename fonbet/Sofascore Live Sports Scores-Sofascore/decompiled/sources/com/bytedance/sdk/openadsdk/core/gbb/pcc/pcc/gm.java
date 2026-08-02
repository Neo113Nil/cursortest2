package com.bytedance.sdk.openadsdk.core.gbb.pcc.pcc;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.gbb.gm.pcc;
import com.bytedance.sdk.openadsdk.core.gbb.pcc.pcc.vj;
import com.bytedance.sdk.openadsdk.core.gbb.sf.gm;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class gm {
    private static List<com.bytedance.sdk.openadsdk.core.gbb.sf.gm> gm(XmlPullParser xmlPullParser) throws IOException, XmlPullParserException {
        return pcc(xmlPullParser, false);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static com.bytedance.sdk.openadsdk.core.gbb.sf pcc(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        com.bytedance.sdk.openadsdk.core.gbb.sf sfVar;
        com.bytedance.sdk.openadsdk.core.gbb.sf sfVar2;
        int i;
        int i2;
        int i3;
        com.bytedance.sdk.openadsdk.core.gbb.sf sfVar3 = null;
        while (true) {
            int i4 = 3;
            if (xmlPullParser.getEventType() == 3 && xmlPullParser.getName().equals("Icons")) {
                return sfVar3;
            }
            xmlPullParser.next();
            int i5 = 2;
            if (xmlPullParser.getEventType() == 2 && xmlPullParser.getName().equals("Icon")) {
                String str = vj.qf;
                int sf = vj.sf(xmlPullParser.getAttributeValue(str, "width"));
                int sf2 = vj.sf(xmlPullParser.getAttributeValue(str, "height"));
                if (sf <= 0 || sf > 300 || sf2 <= 0 || sf2 > 300) {
                    sfVar = sfVar3;
                    vj.pcc(xmlPullParser);
                } else {
                    int pcc = com.bytedance.sdk.openadsdk.core.gbb.sf.pcc.pcc(xmlPullParser.getAttributeValue(str, "offset"));
                    int pcc2 = com.bytedance.sdk.openadsdk.core.gbb.sf.pcc.pcc(xmlPullParser.getAttributeValue(str, IronSourceConstants.EVENTS_DURATION));
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    vj.pcc pccVar = null;
                    String str2 = null;
                    while (true) {
                        if (xmlPullParser.next() != i4 || !xmlPullParser.getName().equals("Icon")) {
                            ArrayList arrayList3 = arrayList;
                            ArrayList arrayList4 = arrayList2;
                            if (xmlPullParser.getEventType() == i5) {
                                String name = xmlPullParser.getName();
                                name.getClass();
                                sfVar2 = sfVar3;
                                i = pcc2;
                                switch (name) {
                                    case "IconViewTracking":
                                        i2 = 3;
                                        i3 = 2;
                                        arrayList4.add(new gm.pcc(vj.sf(xmlPullParser, "IconViewTracking")).pcc());
                                        break;
                                    case "IFrameResource":
                                        i2 = 3;
                                        i3 = 2;
                                        if (pccVar == null) {
                                            pccVar = new vj.pcc(vj.sf(xmlPullParser, "IFrameResource"), pcc.EnumC0071pcc.NONE, pcc.sf.IFRAME_RESOURCE);
                                            break;
                                        }
                                        vj.pcc(xmlPullParser);
                                        break;
                                    case "StaticResource":
                                        i2 = 3;
                                        i3 = 2;
                                        pcc.EnumC0071pcc enumC0071pcc = pcc.EnumC0071pcc.NONE;
                                        String lowerCase = xmlPullParser.getAttributeValue(vj.qf, "creativeType").toLowerCase();
                                        Set<String> set = com.bytedance.sdk.openadsdk.core.gbb.gm.pcc.pcc;
                                        pccVar = new vj.pcc((set.contains(lowerCase) || com.bytedance.sdk.openadsdk.core.gbb.gm.pcc.sf.contains(lowerCase)) ? vj.sf(xmlPullParser, "StaticResource") : null, set.contains(lowerCase) ? pcc.EnumC0071pcc.IMAGE : pcc.EnumC0071pcc.JAVASCRIPT, pcc.sf.STATIC_RESOURCE);
                                        break;
                                    case "IconClicks":
                                        while (true) {
                                            i2 = 3;
                                            if (xmlPullParser.next() == 3 && xmlPullParser.getName().equals("IconClicks")) {
                                                i3 = 2;
                                                break;
                                            } else if (xmlPullParser.getEventType() == 2) {
                                                if (xmlPullParser.getName().equals("IconClickThrough")) {
                                                    str2 = vj.sf(xmlPullParser, "IconClickThrough");
                                                } else if (xmlPullParser.getName().equals("IconClickTracking")) {
                                                    arrayList3.add(new gm.pcc(vj.sf(xmlPullParser, "IconClickTracking")).pcc());
                                                }
                                            }
                                        }
                                        break;
                                    case "HTMLResource":
                                        if (pccVar == null || pccVar.gm == pcc.sf.IFRAME_RESOURCE) {
                                            pccVar = new vj.pcc(vj.sf(xmlPullParser, "HTMLResource"), pcc.EnumC0071pcc.NONE, pcc.sf.HTML_RESOURCE);
                                            sfVar3 = sfVar2;
                                            pcc2 = i;
                                            i4 = 3;
                                            i5 = 2;
                                            break;
                                        }
                                        i2 = 3;
                                        i3 = 2;
                                        vj.pcc(xmlPullParser);
                                        break;
                                    default:
                                        i2 = 3;
                                        i3 = 2;
                                        vj.pcc(xmlPullParser);
                                        break;
                                }
                                arrayList = arrayList3;
                                arrayList2 = arrayList4;
                            } else {
                                sfVar2 = sfVar3;
                                i = pcc2;
                                i2 = i4;
                                i3 = i5;
                            }
                            i4 = i2;
                            i5 = i3;
                            sfVar3 = sfVar2;
                            pcc2 = i;
                            arrayList = arrayList3;
                            arrayList2 = arrayList4;
                        } else if (pccVar != null && (sfVar3 == null || TextUtils.isEmpty(sfVar3.vj()))) {
                            sfVar3 = new com.bytedance.sdk.openadsdk.core.gbb.sf(sf, sf2, pcc, pcc2, pccVar.sf, pccVar.gm, pccVar.pcc, arrayList, arrayList2, str2);
                            vj.pcc(xmlPullParser, "Icons", i4);
                        }
                    }
                }
            } else {
                sfVar = sfVar3;
            }
            sfVar3 = sfVar;
        }
    }

    public static double sf(XmlPullParser xmlPullParser) throws IOException, XmlPullParserException {
        if (vj.sf(xmlPullParser, "Duration").split(":").length != 3) {
            return 0.0d;
        }
        try {
            return (Integer.parseInt(r2[1].trim()) * 60) + (Integer.parseInt(r2[0].trim()) * 3600) + Float.parseFloat(r2[2].trim());
        } catch (Exception unused) {
            return 0.0d;
        }
    }

    private static String pcc(XmlPullParser xmlPullParser, int i, double d, com.bytedance.sdk.openadsdk.core.gbb.pcc pccVar) throws IOException, XmlPullParserException {
        double d2 = Double.NEGATIVE_INFINITY;
        String str = null;
        int i2 = Integer.MIN_VALUE;
        int i3 = Integer.MIN_VALUE;
        while (true) {
            if (xmlPullParser.next() == 3 && xmlPullParser.getName().equals("MediaFiles")) {
                break;
            }
            if (xmlPullParser.getEventType() == 2 && xmlPullParser.getName().equals("MediaFile")) {
                String str2 = vj.qf;
                String attributeValue = xmlPullParser.getAttributeValue(str2, "type");
                int sf = vj.sf(xmlPullParser.getAttributeValue(str2, "width"));
                int sf2 = vj.sf(xmlPullParser.getAttributeValue(str2, "height"));
                int sf3 = vj.sf(xmlPullParser.getAttributeValue(str2, "bitrate"));
                String sf4 = vj.sf(xmlPullParser, "MediaFile");
                if (sf > 0 && sf2 > 0 && com.bytedance.sdk.openadsdk.core.gbb.gm.oo.pcc.contains(attributeValue) && !TextUtils.isEmpty(sf4)) {
                    double pcc = com.bytedance.sdk.openadsdk.core.gbb.gm.oo.pcc(i, d, sf, sf2, sf3, attributeValue);
                    if (pcc > d2) {
                        str = sf4;
                        d2 = pcc;
                        i2 = sf;
                        i3 = sf2;
                    }
                }
            }
        }
        if (!TextUtils.isEmpty(str)) {
            pccVar.oo(str);
            pccVar.pcc(i2);
            pccVar.sf(i3);
        }
        return str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0050, code lost:
    
        if (r2.equals("Icons") == false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void pcc(XmlPullParser xmlPullParser, com.bytedance.sdk.openadsdk.core.gbb.pcc pccVar, int i, double d) throws IOException, XmlPullParserException {
        boolean z = false;
        while (true) {
            char c = 3;
            if (xmlPullParser.next() != 3 || !xmlPullParser.getName().equals("Linear")) {
                if (xmlPullParser.getEventType() == 2) {
                    if (z && TextUtils.isEmpty(pccVar.qf())) {
                        vj.pcc(xmlPullParser);
                    }
                    String name = xmlPullParser.getName();
                    name.getClass();
                    switch (name.hashCode()) {
                        case -2049897434:
                            if (name.equals("VideoClicks")) {
                                c = 0;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1927368268:
                            if (name.equals("Duration")) {
                                c = 1;
                                break;
                            }
                            c = 65535;
                            break;
                        case -385055469:
                            if (name.equals("MediaFiles")) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        case 70476538:
                            break;
                        case 611554000:
                            if (name.equals("TrackingEvents")) {
                                c = 4;
                                break;
                            }
                            c = 65535;
                            break;
                        default:
                            c = 65535;
                            break;
                    }
                    switch (c) {
                        case 0:
                            pcc(xmlPullParser, pccVar);
                            break;
                        case 1:
                            pccVar.pcc(sf(xmlPullParser));
                            break;
                        case 2:
                            pcc(xmlPullParser, i, d, pccVar);
                            z = true;
                            break;
                        case 3:
                            com.bytedance.sdk.openadsdk.core.gbb.sf pcc = pcc(xmlPullParser);
                            if (pcc != null && pccVar.sf() == null) {
                                pccVar.pcc(pcc);
                                break;
                            }
                            break;
                        case 4:
                            pcc(xmlPullParser, pccVar.pcc());
                            break;
                        default:
                            vj.pcc(xmlPullParser);
                            break;
                    }
                }
            } else {
                return;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x00b0, code lost:
    
        if (r0.equals(com.mbridge.msdk.foundation.entity.CampaignEx.JSON_NATIVE_VIDEO_UNMUTE) == false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void pcc(XmlPullParser xmlPullParser, com.bytedance.sdk.openadsdk.core.gbb.oo ooVar) throws IOException, XmlPullParserException {
        while (true) {
            char c = 3;
            if (xmlPullParser.next() == 3 && xmlPullParser.getName().equals("TrackingEvents")) {
                return;
            }
            if (xmlPullParser.getEventType() == 2) {
                if ("Tracking".equals(xmlPullParser.getName())) {
                    String attributeValue = xmlPullParser.getAttributeValue(vj.qf, "event");
                    if (TextUtils.isEmpty(attributeValue)) {
                        vj.pcc(xmlPullParser, "Tracking", 3);
                    } else {
                        attributeValue.getClass();
                        switch (attributeValue.hashCode()) {
                            case -1638835128:
                                if (attributeValue.equals(CampaignEx.JSON_NATIVE_VIDEO_MIDPOINT)) {
                                    c = 0;
                                    break;
                                }
                                c = 65535;
                                break;
                            case -1337830390:
                                if (attributeValue.equals("thirdQuartile")) {
                                    c = 1;
                                    break;
                                }
                                c = 65535;
                                break;
                            case -934426579:
                                if (attributeValue.equals(CampaignEx.JSON_NATIVE_VIDEO_RESUME)) {
                                    c = 2;
                                    break;
                                }
                                c = 65535;
                                break;
                            case -840405966:
                                break;
                            case -599445191:
                                if (attributeValue.equals(CampaignEx.JSON_NATIVE_VIDEO_COMPLETE)) {
                                    c = 4;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 3363353:
                                if (attributeValue.equals(CampaignEx.JSON_NATIVE_VIDEO_MUTE)) {
                                    c = 5;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 3532159:
                                if (attributeValue.equals("skip")) {
                                    c = 6;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 94756344:
                                if (attributeValue.equals(CampaignEx.JSON_NATIVE_VIDEO_CLOSE)) {
                                    c = 7;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 106440182:
                                if (attributeValue.equals(CampaignEx.JSON_NATIVE_VIDEO_PAUSE)) {
                                    c = '\b';
                                    break;
                                }
                                c = 65535;
                                break;
                            case 109757538:
                                if (attributeValue.equals("start")) {
                                    c = '\t';
                                    break;
                                }
                                c = 65535;
                                break;
                            case 560220243:
                                if (attributeValue.equals("firstQuartile")) {
                                    c = '\n';
                                    break;
                                }
                                c = 65535;
                                break;
                            case 1778167540:
                                if (attributeValue.equals("creativeView")) {
                                    c = 11;
                                    break;
                                }
                                c = 65535;
                                break;
                            default:
                                c = 65535;
                                break;
                        }
                        switch (c) {
                            case 0:
                                ooVar.pcc(vj.sf(xmlPullParser, "Tracking"), 0.5f);
                                break;
                            case 1:
                                ooVar.pcc(vj.sf(xmlPullParser, "Tracking"), 0.75f);
                                break;
                            case 2:
                                ooVar.gm(pcc(xmlPullParser, true));
                                break;
                            case 3:
                                ooVar.tmg(pcc(xmlPullParser, true));
                                break;
                            case 4:
                                ooVar.oo(gm(xmlPullParser));
                                break;
                            case 5:
                                ooVar.vh(pcc(xmlPullParser, true));
                                break;
                            case 6:
                                ooVar.wh(gm(xmlPullParser));
                                break;
                            case 7:
                                ooVar.vj(gm(xmlPullParser));
                                break;
                            case '\b':
                                ooVar.sf(pcc(xmlPullParser, true));
                                break;
                            case '\t':
                            case 11:
                                ooVar.pcc(vj.sf(xmlPullParser, "Tracking"), 0L);
                                break;
                            case '\n':
                                ooVar.pcc(vj.sf(xmlPullParser, "Tracking"), 0.25f);
                                break;
                        }
                    }
                } else if (xmlPullParser.getEventType() == 4) {
                    xmlPullParser.nextTag();
                } else {
                    vj.pcc(xmlPullParser);
                }
            }
        }
    }

    private static void pcc(XmlPullParser xmlPullParser, com.bytedance.sdk.openadsdk.core.gbb.pcc pccVar) throws IOException, XmlPullParserException {
        while (true) {
            if (xmlPullParser.next() == 3 && xmlPullParser.getName().equals("VideoClicks")) {
                return;
            }
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                name.getClass();
                if (name.equals("ClickThrough")) {
                    pccVar.gm(vj.sf(xmlPullParser, "ClickThrough"));
                } else if (!name.equals("ClickTracking")) {
                    vj.pcc(xmlPullParser);
                } else {
                    pccVar.pcc().qf(vj.pcc(xmlPullParser, "ClickTracking"));
                }
            }
        }
    }

    private static List<com.bytedance.sdk.openadsdk.core.gbb.sf.gm> pcc(XmlPullParser xmlPullParser, boolean z) throws IOException, XmlPullParserException {
        return vj.pcc(xmlPullParser, "Tracking", z);
    }
}
