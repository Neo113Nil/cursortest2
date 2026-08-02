package defpackage;

import org.w3c.dom.Node;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class xkg implements alg {
    public static final /* synthetic */ int d = 0;
    public String a;
    public String b;
    public boolean c;

    public xkg(Node node) {
        String nodeValue = node.getAttributes().getNamedItem("event").getNodeValue();
        this.a = nodeValue;
        if (node.getAttributes().getNamedItem("offset") != null) {
            node.getAttributes().getNamedItem("offset").getNodeValue();
        }
        this.b = node.getTextContent().trim();
        this.c = e(nodeValue);
    }

    public static boolean e(String str) {
        kig kigVar;
        kig[] values = kig.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                kigVar = null;
                break;
            }
            kigVar = values[i];
            if (kigVar.a.equalsIgnoreCase(str)) {
                break;
            }
            i++;
        }
        jig a = jig.a(str);
        if (kig.u.contains(kigVar) || jig.c.contains(a)) {
            return true;
        }
        if (!kig.t.contains(kigVar) && !jig.b.contains(a)) {
            fjg.c().f(1);
        }
        return false;
    }

    @Override // defpackage.fkg
    public final String a() {
        return this.b;
    }

    @Override // defpackage.alg
    public final long b() {
        return 0L;
    }

    @Override // defpackage.fkg
    public final String c() {
        return this.a;
    }

    @Override // defpackage.fkg
    public final boolean d() {
        return this.c;
    }
}
