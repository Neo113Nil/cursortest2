package com.bytedance.sdk.openadsdk.core.gbb.pcc.pcc;

import android.content.Context;
import android.text.TextUtils;
import java.io.IOException;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class sf {
    public static com.bytedance.sdk.openadsdk.core.gbb.pcc pcc(Context context, XmlPullParser xmlPullParser, List<com.bytedance.sdk.openadsdk.core.gbb.sf.gm> list, int i, double d) throws IOException, XmlPullParserException {
        String name;
        xmlPullParser.require(2, vj.qf, "InLine");
        com.bytedance.sdk.openadsdk.core.gbb.pcc pccVar = new com.bytedance.sdk.openadsdk.core.gbb.pcc();
        while (true) {
            if (xmlPullParser.next() == 3 && "InLine".equals(xmlPullParser.getName())) {
                pccVar.pcc().ork(list);
                return pccVar;
            }
            if (xmlPullParser.getEventType() == 2) {
                name = xmlPullParser.getName();
                name.getClass();
                switch (name) {
                    case "AdVerifications":
                        pccVar.pcc(oo.pcc(xmlPullParser));
                        context = context;
                        break;
                    case "Creatives":
                        if (TextUtils.isEmpty(pccVar.qf()) || pccVar.gm() == null) {
                            while (xmlPullParser.next() != 3) {
                                if (xmlPullParser.getEventType() == 2) {
                                    if ("Creative".equals(xmlPullParser.getName())) {
                                        pcc(context, xmlPullParser, pccVar, i, d);
                                    } else {
                                        vj.pcc(xmlPullParser);
                                    }
                                }
                            }
                            context = context;
                            xmlPullParser = xmlPullParser;
                            i = i;
                            d = d;
                            break;
                        }
                        vj.pcc(xmlPullParser);
                        context = context;
                        xmlPullParser = xmlPullParser;
                        i = i;
                        d = d;
                        break;
                    case "Description":
                        pccVar.sf(vj.sf(xmlPullParser, name));
                        break;
                    case "Error":
                        list.addAll(vj.pcc(xmlPullParser, name));
                        break;
                    case "Extensions":
                        while (true) {
                            if (xmlPullParser.getEventType() == 3 && "Extensions".equals(xmlPullParser.getName())) {
                                context = context;
                                xmlPullParser = xmlPullParser;
                                i = i;
                                d = d;
                                break;
                            } else {
                                xmlPullParser.next();
                                if (xmlPullParser.getEventType() == 2 && "AdVerifications".equals(xmlPullParser.getName())) {
                                    pccVar.pcc(oo.pcc(xmlPullParser));
                                }
                            }
                        }
                        break;
                    case "AdTitle":
                        pccVar.pcc(vj.sf(xmlPullParser, name));
                        break;
                    case "Impression":
                        pccVar.pcc().pcc(vj.pcc(xmlPullParser, name));
                        break;
                    default:
                        vj.pcc(xmlPullParser);
                        context = context;
                        xmlPullParser = xmlPullParser;
                        i = i;
                        d = d;
                        break;
                }
            }
        }
    }

    public static void pcc(Context context, XmlPullParser xmlPullParser, com.bytedance.sdk.openadsdk.core.gbb.pcc pccVar, int i, double d) throws IOException, XmlPullParserException {
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if ("Linear".equals(xmlPullParser.getName()) && TextUtils.isEmpty(pccVar.qf())) {
                    gm.pcc(xmlPullParser, pccVar, i, d);
                } else if ("CompanionAds".equals(xmlPullParser.getName()) && pccVar.gm() == null) {
                    pccVar.pcc(pcc.pcc(context, xmlPullParser));
                } else {
                    vj.pcc(xmlPullParser);
                }
            }
        }
    }
}
