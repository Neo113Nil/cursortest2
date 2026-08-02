package defpackage;

import java.util.ArrayList;
import java.util.Objects;
import javax.xml.xpath.XPathExpressionException;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class lkg {
    public final String a;
    public final ArrayList b;
    public final ArrayList c;
    public final String d;

    public lkg(String str, String str2, ArrayList arrayList, ArrayList arrayList2) {
        this.a = str;
        this.b = new ArrayList(arrayList);
        this.c = new ArrayList(arrayList2);
        this.d = str2;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:0|1|2|3|(12:5|6|7|8|(3:10|(6:13|(4:21|22|(2:17|18)(1:20)|19)|15|(0)(0)|19|11)|25)|27|28|29|(4:32|(2:34|35)(1:37)|36|30)|38|39|(2:41|42)(1:44))|49|6|7|8|(0)|27|28|29|(1:30)|38|39|(0)(0)) */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0033 A[Catch: XPathExpressionException -> 0x0067, TryCatch #2 {XPathExpressionException -> 0x0067, blocks: (B:8:0x0027, B:10:0x0033, B:11:0x003e, B:13:0x0044, B:17:0x0061), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0061 A[Catch: XPathExpressionException -> 0x0067, TRY_ENTER, TRY_LEAVE, TryCatch #2 {XPathExpressionException -> 0x0067, blocks: (B:8:0x0027, B:10:0x0033, B:11:0x003e, B:13:0x0044, B:17:0x0061), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0064 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0078 A[Catch: XPathExpressionException -> 0x0088, TryCatch #3 {XPathExpressionException -> 0x0088, blocks: (B:29:0x006c, B:30:0x0072, B:32:0x0078, B:34:0x0082), top: B:28:0x006c }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0094 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static lkg a(Node node) {
        String str;
        ArrayList arrayList;
        NodeList a;
        NodeList a2;
        mkg mkgVar;
        NodeList a3;
        String b = elg.b(node, "vendor");
        try {
            a3 = elg.a(node, "./VerificationParameters");
        } catch (XPathExpressionException unused) {
        }
        if (a3.getLength() > 0) {
            str = a3.item(0).getTextContent().trim();
            ArrayList arrayList2 = new ArrayList();
            a2 = elg.a(node, "./TrackingEvents");
            if (a2.getLength() > 0) {
                NodeList a4 = elg.a(a2.item(0), "./Tracking");
                for (int i = 0; i < a4.getLength(); i++) {
                    Node item = a4.item(i);
                    String b2 = elg.b(item, "event");
                    if (b2 != null) {
                        try {
                            mkgVar = new mkg(b2, item.getTextContent().trim());
                        } catch (Exception unused2) {
                        }
                        if (mkgVar == null) {
                            arrayList2.add(mkgVar);
                        }
                    }
                    mkgVar = null;
                    if (mkgVar == null) {
                    }
                }
            }
            arrayList = new ArrayList();
            a = elg.a(node, "./JavaScriptResource|./JavascriptResource|./ExecutableResource");
            for (int i2 = 0; i2 < a.getLength(); i2++) {
                nkg a5 = nkg.a(a.item(i2));
                if (a5 != null) {
                    arrayList.add(a5);
                }
            }
            if (arrayList.size() <= 0) {
                return new lkg(b, str, arrayList, arrayList2);
            }
            return null;
        }
        str = null;
        ArrayList arrayList22 = new ArrayList();
        a2 = elg.a(node, "./TrackingEvents");
        if (a2.getLength() > 0) {
        }
        arrayList = new ArrayList();
        a = elg.a(node, "./JavaScriptResource|./JavascriptResource|./ExecutableResource");
        while (i2 < a.getLength()) {
        }
        if (arrayList.size() <= 0) {
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lkg)) {
            return false;
        }
        lkg lkgVar = (lkg) obj;
        return Objects.equals(this.a, lkgVar.a) && this.b.equals(lkgVar.b) && this.c.equals(lkgVar.c) && Objects.equals(this.d, lkgVar.d);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c, this.d);
    }
}
