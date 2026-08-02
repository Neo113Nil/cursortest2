package defpackage;

import android.util.Pair;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import javax.xml.namespace.QName;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class ikg {
    public String a;
    public final String b;
    public final String c;
    public final String d;
    public rkg[] g;
    public igf[] h;
    public lm8 i;
    public ArrayList j;
    public ArrayList e = new ArrayList();
    public ArrayList f = new ArrayList();
    public ArrayList k = new ArrayList();

    public ikg(Node node) {
        lm8 lm8Var;
        ArrayList arrayList;
        zkg zkgVar;
        lm8 lm8Var2;
        int i;
        int i2 = 0;
        this.g = new rkg[0];
        this.h = new igf[0];
        this.j = new ArrayList();
        this.a = elg.b(node, "sequence");
        this.b = elg.b(node, "id");
        Node item = elg.a(node, "./Wrapper | ./InLine").item(0);
        int i3 = 1;
        for (String str : elg.c(item, "Impression", true)) {
            if (str != null && !str.isEmpty()) {
                this.e.add(str);
            }
        }
        this.f.addAll(Arrays.asList(elg.c(item, "Error", true)));
        String[] c = elg.c(item, "AdSystem", false);
        this.c = c.length > 0 ? c[0] : null;
        String[] c2 = elg.c(item, "AdTitle", false);
        this.d = c2.length > 0 ? c2[0] : null;
        ArrayList arrayList2 = new ArrayList();
        NodeList a = elg.a(item, "./Creatives/Creative");
        for (int i4 = 0; i4 < a.getLength(); i4++) {
            NodeList a2 = elg.a(a.item(i4), "./Linear");
            if (a2.getLength() > 0) {
                Node item2 = a2.item(0);
                rkg rkgVar = new rkg(item2.getParentNode());
                rkgVar.h = new vkg[0];
                String[] c3 = elg.c(item2, "ClickThrough", false);
                if (c3.length > 0) {
                    rkgVar.c = c3[0];
                }
                NodeList a3 = elg.a(item2, ".//Tracking");
                for (int i5 = 0; i5 < a3.getLength(); i5++) {
                    ((ArrayList) rkgVar.a).add(new xkg(a3.item(i5)));
                }
                ((ArrayList) rkgVar.b).addAll(Arrays.asList(elg.c(item2, "ClickTracking", false)));
                String[] c4 = elg.c(item2, "Duration", false);
                if (c4.length > 0) {
                    rkgVar.e = c4[0];
                }
                String[] c5 = elg.c(item2, "AdParameters", false);
                if (c5.length > 0) {
                    rkgVar.g = c5[0];
                }
                Node namedItem = item2.getAttributes().getNamedItem("skipoffset");
                if (namedItem != null) {
                    rkgVar.f = namedItem.getNodeValue();
                }
                NodeList a4 = elg.a(item2, "./MediaFiles/MediaFile");
                ArrayList arrayList3 = new ArrayList();
                for (int i6 = 0; i6 < a4.getLength(); i6++) {
                    vkg vkgVar = new vkg(a4.item(i6));
                    String str2 = vkgVar.g;
                    if (str2 != null && str2.length() > 0 && vkgVar.a()) {
                        arrayList3.add(vkgVar);
                    }
                }
                NodeList a5 = elg.a(item2, "./MediaFiles/InteractiveCreativeFile");
                for (int i7 = 0; i7 < a5.getLength(); i7++) {
                    vkg vkgVar2 = new vkg(a5.item(i7));
                    String str3 = vkgVar2.g;
                    if (str3 != null && str3.length() > 0) {
                        String str4 = vkgVar2.b;
                        if ("application/x-javascript".equalsIgnoreCase(str4) || ("application/javascript".equalsIgnoreCase(str4) && "VPAID".equals(vkgVar2.f))) {
                            arrayList3.add(vkgVar2);
                        }
                    }
                }
                rkgVar.h = (vkg[]) arrayList3.toArray(new vkg[0]);
                arrayList2.add(rkgVar);
            }
        }
        this.g = (rkg[]) arrayList2.toArray(new rkg[0]);
        int length = elg.a(item, "./Creatives/Creative/NonLinearAds/NonLinear").getLength();
        igf[] igfVarArr = new igf[length];
        for (int i8 = 0; i8 < length; i8++) {
            igfVarArr[i8] = new igf(i3);
        }
        this.h = igfVarArr;
        NodeList a6 = elg.a(item, "./Extensions");
        if (a6.getLength() > 0) {
            Node item3 = a6.item(0);
            lm8Var = new lm8();
            lm8Var.a = null;
            lm8Var.b = new ArrayList();
            try {
                lm8Var.a(item3);
            } catch (XPathExpressionException unused) {
            }
        } else {
            lm8Var = null;
        }
        this.i = lm8Var;
        NodeList a7 = elg.a(item, "./Creatives/Creative/CompanionAds/Companion");
        int length2 = a7.getLength();
        pkg[] pkgVarArr = new pkg[length2];
        int i9 = 0;
        while (i9 < length2) {
            Node parentNode = a7.item(i9).getParentNode();
            pkg pkgVar = new pkg(parentNode.getParentNode());
            elg.b(parentNode, "id");
            elg.b(parentNode, "adSlotID");
            NodeList a8 = elg.a(parentNode, ".//Tracking");
            for (int i10 = i2; i10 < a8.getLength(); i10++) {
                ((ArrayList) pkgVar.a).add(new xkg(a8.item(i10)));
            }
            try {
                String b = elg.b(parentNode, "width");
                if (b != null) {
                    Integer.parseInt(b);
                }
            } catch (Exception unused2) {
            }
            try {
                String b2 = elg.b(parentNode, "height");
                if (b2 != null) {
                    Integer.parseInt(b2);
                }
            } catch (Exception unused3) {
            }
            try {
                String b3 = elg.b(parentNode, "assetWidth");
                if (b3 != null) {
                    Integer.parseInt(b3);
                }
            } catch (Exception unused4) {
            }
            try {
                String b4 = elg.b(parentNode, "assetHeight");
                if (b4 != null) {
                    Integer.parseInt(b4);
                }
            } catch (Exception unused5) {
            }
            String[] c6 = elg.c(parentNode, "CompanionClickThrough", false);
            if (c6.length > 0) {
                pkgVar.c = c6[0];
            }
            ((ArrayList) pkgVar.b).addAll(Arrays.asList(elg.c(parentNode, "CompanionClickTracking", false)));
            String[] c7 = elg.c(parentNode, "AdParameters", false);
            if (c7.length > 0) {
                String str5 = c7[0];
            }
            XPath newXPath = XPathFactory.newInstance().newXPath();
            XPathExpression compile = newXPath.compile(".//StaticResource");
            QName qName = XPathConstants.NODESET;
            NodeList nodeList = (NodeList) compile.evaluate(parentNode, qName);
            if (nodeList.getLength() > 0) {
                i = 0;
                nodeList.item(0).getTextContent().getClass();
                elg.b(nodeList.item(0), "creativeType");
            } else {
                i = 0;
            }
            NodeList nodeList2 = (NodeList) newXPath.compile(".//HTMLResource").evaluate(parentNode, qName);
            if (nodeList2.getLength() > 0) {
                nodeList2.item(i).getTextContent().getClass();
            }
            NodeList nodeList3 = (NodeList) newXPath.compile(".//IframeResource").evaluate(parentNode, qName);
            if (nodeList3.getLength() > 0) {
                nodeList3.item(i).getTextContent().getClass();
            }
            pkgVarArr[i9] = pkgVar;
            i9++;
            i2 = 0;
        }
        ArrayList arrayList4 = new ArrayList();
        NodeList a9 = elg.a(item, "./AdVerifications");
        if (a9.getLength() > 0) {
            NodeList a10 = elg.a(a9.item(0), "./Verification");
            for (int i11 = 0; i11 < a10.getLength(); i11++) {
                lkg a11 = lkg.a(a10.item(i11));
                if (a11 != null) {
                    arrayList4.add(a11);
                }
            }
        }
        this.j = arrayList4;
        if (arrayList4.size() == 0 && (lm8Var2 = this.i) != null) {
            this.j = lm8Var2.b;
        }
        ArrayList arrayList5 = this.k;
        lm8 lm8Var3 = this.i;
        ArrayList arrayList6 = new ArrayList();
        NodeList a12 = elg.a(item, "./ViewableImpression");
        if (a12.getLength() > 0) {
            NodeList childNodes = a12.item(0).getChildNodes();
            int length3 = childNodes.getLength();
            for (int i12 = 0; i12 < length3; i12++) {
                Node item4 = childNodes.item(i12);
                String nodeName = item4.getNodeName();
                zkg zkgVar2 = lig.c.contains(lig.a(nodeName)) ? new zkg(nodeName, item4.getTextContent().trim()) : null;
                if (zkgVar2 != null) {
                    arrayList6.add(zkgVar2);
                }
            }
        }
        if (lm8Var3 != null && (arrayList = lm8Var3.a) != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                xkg xkgVar = (xkg) it.next();
                if (jig.d.contains(jig.a(xkgVar.a))) {
                    lig ligVar = lig.VIEWABLE;
                    zkgVar = new zkg("Viewable", xkgVar.b);
                } else {
                    zkgVar = null;
                }
                if (zkgVar != null) {
                    arrayList6.add(zkgVar);
                }
            }
        }
        arrayList5.addAll(arrayList6);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x00e4, code lost:
    
        r4 = r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0139  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ikg a(Node node, pgg pggVar) {
        jkg jkgVar;
        NodeList childNodes = node.getChildNodes();
        int length = childNodes.getLength();
        int i = 0;
        while (true) {
            ikg ikgVar = null;
            ikgVar = null;
            wkg wkgVar = null;
            ikgVar = null;
            if (i >= length) {
                break;
            }
            String nodeName = childNodes.item(i).getNodeName();
            if ("InLine".equals(nodeName)) {
                try {
                    if (elg.a(node, ".//Creative").getLength() == 0) {
                        throw new wkg("The <Creatives> or <Creative> tags are missing or malformed in the VAST response.", qkg.g);
                    }
                    jkg jkgVar2 = new jkg(node);
                    try {
                        rkg[] rkgVarArr = jkgVar2.g;
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        int i2 = 0;
                        while (true) {
                            boolean z = true;
                            if (i2 >= rkgVarArr.length) {
                                break;
                            }
                            if (rkgVarArr[i2].h.length == 0) {
                                qkg qkgVar = qkg.s;
                                wkgVar = new wkg("The <MediaFiles> tag of a Linear creative is missing or does not contain any valid <MediaFile> in the VAST response.", qkgVar);
                                arrayList2.add(new Pair(qkgVar, elg.d(node)));
                                z = false;
                            }
                            String str = rkgVarArr[i2].e;
                            if (z && (str == null || str.length() == 0)) {
                                arrayList2.add(new Pair(qkg.x, elg.d(node)));
                            }
                            if (z) {
                                arrayList.add(rkgVarArr[i2]);
                            }
                            i2++;
                        }
                        if (arrayList2.size() > 0) {
                            if (arrayList.size() == 0 && wkgVar != null) {
                                arrayList2.remove(arrayList2.size() - 1);
                            }
                            Iterator it = arrayList2.iterator();
                            while (it.hasNext()) {
                                Pair pair = (Pair) it.next();
                                sha.G(pggVar, (qkg) pair.first, (String) pair.second);
                            }
                        }
                        if (arrayList.size() == 0 && wkgVar != null) {
                            throw wkgVar;
                        }
                        rkg[] rkgVarArr2 = (rkg[]) arrayList.toArray(new rkg[arrayList.size()]);
                        jkgVar2.g = rkgVarArr2;
                        jkgVar = jkgVar2;
                        if (rkgVarArr2.length == 0) {
                            if (jkgVar2.h.length > 0) {
                                throw new wkg("Occurs when the client-side component receive a NonLinear creative when expecting a Linear.", qkg.j);
                            }
                            jkgVar = jkgVar2;
                        }
                    } catch (XPathExpressionException e) {
                        e = e;
                        ikgVar = jkgVar2;
                        e.printStackTrace();
                        if (ikgVar != null) {
                        }
                    }
                } catch (XPathExpressionException e2) {
                    e = e2;
                }
            } else if ("Wrapper".equals(nodeName)) {
                try {
                    okg okgVar = new okg(node);
                    String str2 = okgVar.l;
                    if (str2 == null || str2.length() == 0) {
                        throw new wkg("The <VASTAdTagURI> tag is missing in the VAST response.", qkg.n);
                    }
                    jkgVar = okgVar;
                } catch (XPathExpressionException unused) {
                    if (ikgVar != null) {
                        throw new wkg("The <Inline> and <Wrapper> tags are missing in the VAST response.", qkg.f);
                    }
                    if (ikgVar.c == null) {
                        sha.G(pggVar, qkg.v, elg.d(node));
                    }
                    if (ikgVar.d == null) {
                        sha.G(pggVar, qkg.w, elg.d(node));
                    }
                    return ikgVar;
                }
            } else {
                i++;
            }
        }
    }

    public final void b(okg okgVar) {
        this.e.addAll(okgVar.e);
        this.f.addAll(okgVar.f);
        this.k.addAll(okgVar.k);
        this.j.addAll(okgVar.j);
        int i = 1;
        if (this.g.length == 0) {
            this.g = new rkg[]{r3};
            rkg rkgVar = new rkg();
            rkgVar.a = new ArrayList();
            rkgVar.b = new ArrayList();
            rkgVar.d = new ArrayList();
            rkgVar.h = new vkg[0];
        }
        int length = this.g.length;
        int length2 = okgVar.g.length;
        for (int i2 = 0; i2 < length; i2++) {
            rkg rkgVar2 = this.g[i2];
            for (int i3 = 0; i3 < length2; i3++) {
                ((ArrayList) rkgVar2.b).addAll((ArrayList) okgVar.g[i3].b);
                ((ArrayList) rkgVar2.a).addAll((ArrayList) okgVar.g[i3].a);
            }
        }
        lm8 lm8Var = okgVar.i;
        if (lm8Var != null) {
            lm8 lm8Var2 = this.i;
            if (lm8Var2 != null) {
                ArrayList arrayList = lm8Var.a;
                ArrayList arrayList2 = lm8Var2.a;
                if (arrayList == null) {
                    lm8Var.a = arrayList2;
                } else if (arrayList2 != null) {
                    arrayList.addAll(arrayList2);
                }
            }
            this.i = lm8Var;
        }
        if (this.h.length == 0) {
            this.h = new igf[]{new igf(i)};
        }
    }

    public final String toString() {
        return " VAST ad id:" + this.b + " seqId:" + this.a;
    }
}
