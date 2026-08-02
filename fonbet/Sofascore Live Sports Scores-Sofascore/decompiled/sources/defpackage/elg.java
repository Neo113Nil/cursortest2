package defpackage;

import java.io.StringWriter;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathFactory;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class elg {
    public static final XPath a = XPathFactory.newInstance().newXPath();
    public static final Transformer b;

    static {
        try {
            b = TransformerFactory.newInstance().newTransformer();
        } catch (TransformerConfigurationException e) {
            e.printStackTrace();
        }
    }

    public static synchronized NodeList a(Node node, String str) {
        NodeList nodeList;
        synchronized (elg.class) {
            nodeList = (NodeList) a.compile(str).evaluate(node, XPathConstants.NODESET);
        }
        return nodeList;
    }

    public static String b(Node node, String str) {
        Node namedItem = node.getAttributes().getNamedItem(str);
        if (namedItem != null) {
            return namedItem.getNodeValue();
        }
        return null;
    }

    public static String[] c(Node node, String str, boolean z) {
        NodeList a2 = a(node, (z ? "./" : ".//").concat(str));
        int length = a2.getLength();
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            strArr[i] = a2.item(i).getTextContent().trim();
        }
        return strArr;
    }

    public static String d(Node node) {
        StringWriter stringWriter = new StringWriter();
        try {
            Transformer transformer = b;
            transformer.setOutputProperty("omit-xml-declaration", "yes");
            transformer.transform(new DOMSource(node), new StreamResult(stringWriter));
        } catch (Throwable unused) {
            System.out.println("nodeToString Transformer Exception");
        }
        return stringWriter.toString();
    }
}
