package defpackage;

import org.w3c.dom.Node;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class okg extends ikg {
    public final String l;
    public int m;

    public okg(Node node) {
        super(node);
        this.m = 0;
        String[] c = elg.c(node, "VASTAdTagURI", false);
        this.l = c.length > 0 ? c[0] : null;
    }
}
