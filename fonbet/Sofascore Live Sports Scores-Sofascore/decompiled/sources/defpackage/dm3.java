package defpackage;

import android.content.Context;
import android.content.res.XmlResourceParser;
import android.util.SparseArray;
import android.util.Xml;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.IOException;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class dm3 {
    public final ConstraintLayout a;
    public int b = -1;
    public int c = -1;
    public final SparseArray d = new SparseArray();
    public final SparseArray e = new SparseArray();

    public dm3(Context context, ConstraintLayout constraintLayout, int i) {
        String str;
        this.a = constraintLayout;
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            bm3 bm3Var = null;
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                a(context, xml);
                                break;
                            } else {
                                break;
                            }
                        case 80204913:
                            if (name.equals("State")) {
                                bm3 bm3Var2 = new bm3(context, xml);
                                this.d.put(bm3Var2.a, bm3Var2);
                                bm3Var = bm3Var2;
                                break;
                            } else {
                                break;
                            }
                        case 1382829617:
                            str = "StateSet";
                            name.equals(str);
                            break;
                        case 1657696882:
                            str = "layoutDescription";
                            name.equals(str);
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                cm3 cm3Var = new cm3(context, xml);
                                if (bm3Var != null) {
                                    bm3Var.b.add(cm3Var);
                                    break;
                                } else {
                                    break;
                                }
                            } else {
                                break;
                            }
                    }
                }
            }
        } catch (IOException | XmlPullParserException unused) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:124:0x01f7, code lost:
    
        continue;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00f7 A[Catch: IOException | XmlPullParserException -> 0x01fd, IOException | XmlPullParserException -> 0x01fd, TryCatch #0 {IOException | XmlPullParserException -> 0x01fd, blocks: (B:17:0x0056, B:26:0x01f7, B:26:0x01f7, B:27:0x0068, B:28:0x0076, B:31:0x007b, B:39:0x0085, B:42:0x009f, B:45:0x008e, B:49:0x0097, B:52:0x00ad, B:55:0x00bc, B:55:0x00bc, B:57:0x00c4, B:57:0x00c4, B:60:0x00ce, B:60:0x00ce, B:64:0x00f7, B:64:0x00f7, B:67:0x00fe, B:67:0x00fe, B:68:0x0116, B:68:0x0116, B:70:0x00d7, B:70:0x00d7, B:72:0x00df, B:72:0x00df, B:75:0x00ed, B:75:0x00ed, B:78:0x0117, B:78:0x0117, B:80:0x011f, B:80:0x011f, B:83:0x012d, B:83:0x012d, B:86:0x0137, B:86:0x0137, B:89:0x0142, B:89:0x0142, B:90:0x015a, B:90:0x015a, B:92:0x015b, B:92:0x015b, B:95:0x0165, B:95:0x0165, B:98:0x0170, B:98:0x0170, B:99:0x0188, B:99:0x0188, B:101:0x0189, B:101:0x0189, B:103:0x0191, B:103:0x0191, B:106:0x019a, B:106:0x019a, B:109:0x01a4, B:109:0x01a4, B:112:0x01ae, B:112:0x01ae, B:113:0x01c6, B:113:0x01c6, B:115:0x01c7, B:115:0x01c7, B:118:0x01d1, B:118:0x01d1, B:121:0x01db, B:121:0x01db, B:122:0x01f3, B:122:0x01f3, B:125:0x01f4, B:125:0x01f4), top: B:16:0x0056 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00fe A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Context context, XmlResourceParser xmlResourceParser) {
        int eventType;
        hm3 hm3Var;
        mm3 mm3Var = new mm3();
        int attributeCount = xmlResourceParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            String attributeName = xmlResourceParser.getAttributeName(i);
            String attributeValue = xmlResourceParser.getAttributeValue(i);
            if (attributeName != null && attributeValue != null && "id".equals(attributeName)) {
                int identifier = attributeValue.contains("/") ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName()) : -1;
                if (identifier == -1 && attributeValue.length() > 1) {
                    identifier = Integer.parseInt(attributeValue.substring(1));
                }
                try {
                    eventType = xmlResourceParser.getEventType();
                    hm3Var = null;
                } catch (IOException | XmlPullParserException unused) {
                }
                while (eventType != 1) {
                    if (eventType == 0) {
                        xmlResourceParser.getName();
                    } else if (eventType == 2) {
                        String name = xmlResourceParser.getName();
                        switch (name.hashCode()) {
                            case -2025855158:
                                if (name.equals("Layout")) {
                                    if (hm3Var == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    hm3Var.d.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                } else {
                                    continue;
                                }
                            case -1984451626:
                                if (name.equals("Motion")) {
                                    if (hm3Var == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    hm3Var.c.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                } else {
                                    continue;
                                }
                            case -1962203927:
                                if (name.equals("ConstraintOverride")) {
                                    hm3Var = mm3.i(context, Xml.asAttributeSet(xmlResourceParser), true);
                                    break;
                                } else {
                                    break;
                                }
                            case -1269513683:
                                if (name.equals("PropertySet")) {
                                    if (hm3Var == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    hm3Var.b.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                } else {
                                    continue;
                                }
                            case -1238332596:
                                if (name.equals("Transform")) {
                                    if (hm3Var == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    hm3Var.e.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                } else {
                                    continue;
                                }
                            case -71750448:
                                if (name.equals("Guideline")) {
                                    hm3Var = mm3.i(context, Xml.asAttributeSet(xmlResourceParser), false);
                                    hm3Var.d.a = true;
                                    break;
                                } else {
                                    break;
                                }
                            case 366511058:
                                if (!name.equals("CustomMethod")) {
                                    continue;
                                }
                                if (hm3Var != null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                }
                                ol3.a(context, xmlResourceParser, hm3Var.f);
                                break;
                            case 1331510167:
                                if (name.equals("Barrier")) {
                                    hm3Var = mm3.i(context, Xml.asAttributeSet(xmlResourceParser), false);
                                    hm3Var.d.h0 = 1;
                                    break;
                                } else {
                                    break;
                                }
                            case 1791837707:
                                if (!name.equals("CustomAttribute")) {
                                    continue;
                                } else if (hm3Var != null) {
                                }
                                break;
                            case 1803088381:
                                if (name.equals("Constraint")) {
                                    hm3Var = mm3.i(context, Xml.asAttributeSet(xmlResourceParser), false);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (eventType == 3) {
                        String lowerCase = xmlResourceParser.getName().toLowerCase(Locale.ROOT);
                        switch (lowerCase.hashCode()) {
                            case -2075718416:
                                if (!lowerCase.equals("guideline")) {
                                    break;
                                }
                                mm3Var.b.put(Integer.valueOf(hm3Var.a), hm3Var);
                                hm3Var = null;
                                break;
                            case -190376483:
                                if (lowerCase.equals("constraint")) {
                                    mm3Var.b.put(Integer.valueOf(hm3Var.a), hm3Var);
                                    hm3Var = null;
                                    break;
                                } else {
                                    break;
                                }
                            case 426575017:
                                if (lowerCase.equals("constraintoverride")) {
                                    mm3Var.b.put(Integer.valueOf(hm3Var.a), hm3Var);
                                    hm3Var = null;
                                    break;
                                } else {
                                    break;
                                }
                            case 2146106725:
                                if (lowerCase.equals("constraintset")) {
                                    this.e.put(identifier, mm3Var);
                                    return;
                                }
                                break;
                        }
                    }
                    eventType = xmlResourceParser.next();
                }
                this.e.put(identifier, mm3Var);
                return;
            }
        }
    }
}
