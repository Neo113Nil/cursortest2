package defpackage;

import android.webkit.URLUtil;
import java.util.Objects;
import org.w3c.dom.Node;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class nkg {
    public final int a;
    public final String b;
    public final String c;
    public final boolean d;
    public final String e;

    public nkg(String str, String str2, boolean z, int i, String str3) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = z;
        this.e = str3;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0053, code lost:
    
        if (r9.equals("JavascriptResource") == false) goto L9;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static nkg a(Node node) {
        boolean parseBoolean;
        String nodeName;
        String trim = node.getTextContent().trim();
        String b = elg.b(node, "apiFramework");
        String b2 = elg.b(node, "browserOptional");
        boolean z = false;
        if (b2 != null) {
            try {
                parseBoolean = Boolean.parseBoolean(b2);
            } catch (NumberFormatException unused) {
            }
            String b3 = elg.b(node, "type");
            nodeName = node.getNodeName();
            nodeName.getClass();
            int i = 2;
            switch (nodeName.hashCode()) {
                case -1731723077:
                    break;
                case 1047690904:
                    if (nodeName.equals("ExecutableResource")) {
                        z = true;
                        break;
                    }
                    z = -1;
                    break;
                case 1561251035:
                    if (nodeName.equals("JavaScriptResource")) {
                        z = 2;
                        break;
                    }
                    z = -1;
                    break;
                default:
                    z = -1;
                    break;
            }
            switch (z) {
                case false:
                case true:
                    i = 1;
                    break;
                case true:
                    break;
                default:
                    return null;
            }
            if (trim.length() <= 0 && URLUtil.isValidUrl(trim)) {
                return new nkg(trim, b, parseBoolean, i, b3);
            }
        }
        parseBoolean = false;
        String b32 = elg.b(node, "type");
        nodeName = node.getNodeName();
        nodeName.getClass();
        int i2 = 2;
        switch (nodeName.hashCode()) {
            case -1731723077:
                break;
            case 1047690904:
                break;
            case 1561251035:
                break;
        }
        switch (z) {
        }
        return trim.length() <= 0 ? null : null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nkg)) {
            return false;
        }
        nkg nkgVar = (nkg) obj;
        String str = nkgVar.e;
        String str2 = nkgVar.c;
        if (this.d != nkgVar.d || this.a != nkgVar.a || !this.b.equals(nkgVar.b)) {
            return false;
        }
        String str3 = this.c;
        if ((str3 == null || str2 == null || !str3.equals(str2)) && !(str3 == null && str2 == null)) {
            return false;
        }
        String str4 = this.e;
        if (str4 == null || str == null || !str4.equals(str)) {
            return str4 == null && str == null;
        }
        return true;
    }

    public final int hashCode() {
        Boolean valueOf = Boolean.valueOf(this.d);
        int i = this.a;
        return Objects.hash(i == 0 ? null : Integer.valueOf(i - 1), this.b, this.c, valueOf, this.e);
    }
}
