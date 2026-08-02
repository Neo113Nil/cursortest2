package com.bytedance.sdk.openadsdk.core.gbb.pcc.pcc;

import android.content.Context;
import android.text.TextUtils;
import android.util.Xml;
import com.bytedance.sdk.openadsdk.core.gbb.gm.pcc;
import com.bytedance.sdk.openadsdk.core.gbb.ork;
import com.bytedance.sdk.openadsdk.core.gbb.pcc.sf;
import com.bytedance.sdk.openadsdk.core.gbb.sf.gm;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import defpackage.zzl;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class vj extends com.bytedance.sdk.openadsdk.core.gbb.pcc.sf {
    public static final String qf = null;

    public vj(Context context, int i, int i2) {
        super(context, i, i2);
    }

    private void gm(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.gbb.sf.gm.pcc(com.bytedance.sdk.openadsdk.core.gbb.sf.gm.pcc((of) null, (List<com.bytedance.sdk.openadsdk.core.gbb.sf.gm>) Collections.singletonList(new gm.pcc(str).pcc()), this.pcc > 0 ? com.bytedance.sdk.openadsdk.core.gbb.pcc.pcc.NO_ADS_VAST_RESPONSE : com.bytedance.sdk.openadsdk.core.gbb.pcc.pcc.UNDEFINED_ERROR, -1L, (String) null, (String) null), (gm.sf) null);
    }

    private com.bytedance.sdk.openadsdk.core.gbb.pcc pcc(XmlPullParser xmlPullParser, List<com.bytedance.sdk.openadsdk.core.gbb.sf.gm> list) throws IOException, XmlPullParserException {
        XmlPullParser xmlPullParser2;
        List<com.bytedance.sdk.openadsdk.core.gbb.sf.gm> list2;
        XmlPullParser xmlPullParser3;
        List<com.bytedance.sdk.openadsdk.core.gbb.sf.gm> list3;
        xmlPullParser.require(2, qf, "VAST");
        boolean z = false;
        String str = null;
        while (xmlPullParser.next() != 1) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if ("Error".equals(name)) {
                    str = sf(xmlPullParser, name);
                } else {
                    if (!"Ad".equals(name)) {
                        xmlPullParser2 = xmlPullParser;
                        list2 = list;
                        pcc(xmlPullParser2);
                    } else if (pcc(xmlPullParser.getAttributeValue(qf, "sequence"))) {
                        while (true) {
                            if (xmlPullParser.next() == 3 && "Ad".equals(xmlPullParser.getName())) {
                                xmlPullParser2 = xmlPullParser;
                                list2 = list;
                                z = true;
                                break;
                            }
                            if (xmlPullParser.getEventType() == 2) {
                                String name2 = xmlPullParser.getName();
                                if ("InLine".equals(name2)) {
                                    xmlPullParser3 = xmlPullParser;
                                    list3 = list;
                                    com.bytedance.sdk.openadsdk.core.gbb.pcc pcc2 = sf.pcc(this.sf, xmlPullParser3, list3, this.gm, this.oo);
                                    if (pcc2 != null) {
                                        if (!TextUtils.isEmpty(pcc2.qf())) {
                                            return pcc2;
                                        }
                                        this.vj = -6;
                                        return null;
                                    }
                                } else {
                                    xmlPullParser3 = xmlPullParser;
                                    list3 = list;
                                    if ("Wrapper".equals(name2)) {
                                        com.bytedance.sdk.openadsdk.core.gbb.pcc sf = sf(xmlPullParser3, list3);
                                        if (sf != null) {
                                            return sf;
                                        }
                                    } else {
                                        pcc(xmlPullParser3);
                                    }
                                }
                                xmlPullParser = xmlPullParser3;
                                list = list3;
                            }
                        }
                    } else {
                        pcc(xmlPullParser);
                        z = true;
                    }
                    xmlPullParser = xmlPullParser2;
                    list = list2;
                }
            }
        }
        if (!z) {
            this.vj = -4;
            gm(str);
        }
        if (this.vj == 0) {
            this.vj = -5;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:81:0x00d2, code lost:
    
        continue;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2, types: [com.bytedance.sdk.openadsdk.core.gbb.pcc] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private com.bytedance.sdk.openadsdk.core.gbb.pcc sf(XmlPullParser xmlPullParser, List<com.bytedance.sdk.openadsdk.core.gbb.sf.gm> list) throws XmlPullParserException, IOException {
        ?? r16;
        String name;
        File file = null;
        if (this.pcc >= 5) {
            pcc(xmlPullParser);
            return null;
        }
        com.bytedance.sdk.openadsdk.core.gbb.oo ooVar = new com.bytedance.sdk.openadsdk.core.gbb.oo();
        String str = null;
        com.bytedance.sdk.openadsdk.core.gbb.gm gmVar = null;
        Set<ork> set = null;
        while (true) {
            if (xmlPullParser.getEventType() == 3 && "Wrapper".equals(xmlPullParser.getName())) {
                com.bytedance.sdk.openadsdk.core.gbb.pcc pcc2 = pcc(str, file, list);
                if (pcc2 != null) {
                    if (pcc2.gm() == null) {
                        pcc2.pcc(gmVar);
                    }
                    pcc2.pcc().pcc(ooVar);
                    if (set != null) {
                        pcc2.pcc(set);
                    }
                }
                return pcc2;
            }
            xmlPullParser.next();
            if (xmlPullParser.getEventType() == 2) {
                name = xmlPullParser.getName();
                name.getClass();
                r16 = file;
                switch (name) {
                    case "VASTAdTagURI":
                        String pcc3 = pcc(sf(xmlPullParser, "VASTAdTagURI"), list);
                        if (TextUtils.isEmpty(pcc3)) {
                            pcc(xmlPullParser, "Wrapper", 3);
                            this.vj = -2;
                            return r16;
                        }
                        str = pcc3;
                        continue;
                    case "Error":
                        list.add(new gm.pcc(sf(xmlPullParser, "Error")).pcc());
                        continue;
                    case "TrackingEvents":
                        gm.pcc(xmlPullParser, ooVar);
                        continue;
                    case "CompanionAds":
                        gmVar = com.bytedance.sdk.openadsdk.core.gbb.pcc.pcc.pcc.pcc(this.sf, xmlPullParser);
                        continue;
                    case "ClickTracking":
                        ooVar.qf(pcc(xmlPullParser, "ClickTracking"));
                        continue;
                    case "Impression":
                        ooVar.pcc(pcc(xmlPullParser, name));
                        continue;
                }
                while (true) {
                    if (xmlPullParser.getEventType() != 3 || !"Extensions".equals(xmlPullParser.getName())) {
                        xmlPullParser.next();
                        if (xmlPullParser.getEventType() == 2 && "AdVerifications".equals(xmlPullParser.getName())) {
                            set = oo.pcc(xmlPullParser);
                        }
                    }
                }
            } else {
                r16 = file;
            }
            file = r16;
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class pcc {
        pcc.sf gm;
        String oo;
        String pcc;
        pcc.EnumC0071pcc sf;
        final List<com.bytedance.sdk.openadsdk.core.gbb.sf.gm> vj = new ArrayList();
        final List<com.bytedance.sdk.openadsdk.core.gbb.sf.gm> wh = new ArrayList();
        float qf = Float.MIN_VALUE;

        public pcc(String str, pcc.EnumC0071pcc enumC0071pcc, pcc.sf sfVar) {
            pcc(str, enumC0071pcc, sfVar);
        }

        public void pcc(String str) {
            this.vj.add(new gm.pcc(str).pcc());
        }

        public void sf(String str) {
            this.wh.add(new gm.pcc(str).pcc());
        }

        public void pcc(String str, pcc.EnumC0071pcc enumC0071pcc, pcc.sf sfVar) {
            this.pcc = str;
            this.sf = enumC0071pcc;
            this.gm = sfVar;
        }

        public pcc() {
        }
    }

    private void pcc(com.bytedance.sdk.openadsdk.core.gbb.pcc pccVar) {
        sf.pcc pccVar2 = this.wh;
        if (pccVar2 == null) {
            pccVar2 = new sf.pcc();
            this.wh = pccVar2;
        }
        pccVar2.pcc = this.vj;
        pccVar2.sf = this.pcc;
        if (pccVar != null) {
            pccVar2.gm = pccVar.pcc().sf.size() <= 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x005e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.bytedance.sdk.openadsdk.core.gbb.pcc.sf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public com.bytedance.sdk.openadsdk.core.gbb.pcc pcc(String str, File file, List<com.bytedance.sdk.openadsdk.core.gbb.sf.gm> list) {
        InputStream inputStream;
        this.vj = 0;
        InputStream inputStream2 = null;
        if (this.sf == null) {
            this.vj = -1;
            return null;
        }
        if (TextUtils.isEmpty(str) && file == null) {
            this.vj = -2;
            return null;
        }
        try {
            if (!TextUtils.isEmpty(str)) {
                inputStream = new ByteArrayInputStream(str.getBytes(C.UTF8_NAME));
            } else {
                inputStream = new FileInputStream(file);
            }
            try {
                try {
                    XmlPullParser newPullParser = Xml.newPullParser();
                    newPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", false);
                    newPullParser.setInput(inputStream, C.UTF8_NAME);
                    newPullParser.nextTag();
                    com.bytedance.sdk.openadsdk.core.gbb.pcc pcc2 = pcc(newPullParser, list);
                    pcc(pcc2);
                    try {
                        inputStream.close();
                    } catch (IOException unused) {
                    }
                    return pcc2;
                } catch (Exception unused2) {
                    this.vj = -3;
                    pcc((com.bytedance.sdk.openadsdk.core.gbb.pcc) null);
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException unused3) {
                        }
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                inputStream2 = inputStream;
                if (inputStream2 != null) {
                    try {
                        inputStream2.close();
                    } catch (IOException unused4) {
                    }
                }
                throw th;
            }
        } catch (Exception unused5) {
            inputStream = null;
        } catch (Throwable th2) {
            th = th2;
            if (inputStream2 != null) {
            }
            throw th;
        }
    }

    public static List<com.bytedance.sdk.openadsdk.core.gbb.sf.gm> pcc(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        return pcc(xmlPullParser, str, false);
    }

    public static List<com.bytedance.sdk.openadsdk.core.gbb.sf.gm> pcc(XmlPullParser xmlPullParser, String str, boolean z) throws IOException, XmlPullParserException {
        return pcc(sf(xmlPullParser, str), z);
    }

    public static void pcc(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        if (xmlPullParser.getEventType() != 2) {
            zzl.s();
            return;
        }
        int i = 1;
        while (i != 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }

    public static void pcc(XmlPullParser xmlPullParser, String str, int i) throws XmlPullParserException, IOException {
        while (xmlPullParser.getEventType() != 1) {
            if (str.equals(xmlPullParser.getName()) && xmlPullParser.getEventType() == i) {
                return;
            } else {
                xmlPullParser.next();
            }
        }
    }

    private static List<com.bytedance.sdk.openadsdk.core.gbb.sf.gm> pcc(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return new ArrayList();
        }
        return Collections.singletonList(new gm.pcc(str).pcc(z).pcc());
    }

    public static String sf(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        String str2;
        String str3 = qf;
        xmlPullParser.require(2, str3, str);
        if (xmlPullParser.next() == 4) {
            str2 = xmlPullParser.getText().trim();
            xmlPullParser.nextTag();
        } else {
            str2 = "";
        }
        xmlPullParser.require(3, str3, str);
        return str2;
    }

    public static int sf(String str) {
        if (TextUtils.isEmpty(str)) {
            return Integer.MIN_VALUE;
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return Integer.MIN_VALUE;
        }
    }
}
