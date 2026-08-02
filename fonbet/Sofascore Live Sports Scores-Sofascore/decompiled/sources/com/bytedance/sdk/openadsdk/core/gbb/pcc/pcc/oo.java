package com.bytedance.sdk.openadsdk.core.gbb.pcc.pcc;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.gbb.ork;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class oo {
    public static Set<ork> pcc(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        ork pcc;
        if (xmlPullParser == null) {
            return new HashSet();
        }
        HashSet hashSet = new HashSet();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if ("Verification".equals(xmlPullParser.getName())) {
                    String attributeValue = xmlPullParser.getAttributeValue(vj.qf, "vendor");
                    String str = null;
                    String str2 = null;
                    String str3 = null;
                    while (true) {
                        if (xmlPullParser.getEventType() != 3 || !"Verification".equals(xmlPullParser.getName())) {
                            xmlPullParser.next();
                            if (xmlPullParser.getEventType() == 2) {
                                String name = xmlPullParser.getName();
                                name.getClass();
                                switch (name) {
                                    case "Tracking":
                                        if (!"verificationNotExecuted".equals(xmlPullParser.getAttributeValue(vj.qf, "event"))) {
                                            break;
                                        } else {
                                            str3 = vj.sf(xmlPullParser, "Tracking");
                                            break;
                                        }
                                    case "JavaScriptResource":
                                        if (!CampaignEx.KEY_OMID.equals(xmlPullParser.getAttributeValue(vj.qf, "apiFramework"))) {
                                            break;
                                        } else {
                                            str = vj.sf(xmlPullParser, "JavaScriptResource");
                                            break;
                                        }
                                    case "VerificationParameters":
                                        str2 = vj.sf(xmlPullParser, "VerificationParameters");
                                        break;
                                }
                            }
                        } else if (!TextUtils.isEmpty(str) && (pcc = ork.pcc(str, attributeValue, str2, str3)) != null) {
                            hashSet.add(pcc);
                        }
                    }
                } else {
                    vj.pcc(xmlPullParser);
                }
            }
        }
        return hashSet;
    }
}
