package com.bytedance.adsdk.pcc.sf.oo;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public enum gm implements vj {
    QUESTION("?", 0),
    COLON(":", 0),
    DOUBLE_AMP("&&", 1),
    DOUBLE_BAR("||", 1),
    EQ("==", 2),
    GT(">", 2),
    LT("<", 2),
    LT_EQ("<=", 2),
    GT_EQ(">=", 2),
    NOT_EQ("!=", 2),
    PLUS("+", 3),
    MINUS("-", 3),
    MULTI("*", 4),
    DIVISION("/", 4),
    MOD("%", 4);

    private final int gpj;
    private final String lu;
    private static final Map<String, gm> dax = new HashMap(128);
    private static final Set<gm> nac = new HashSet();

    static {
        for (gm gmVar : values()) {
            dax.put(gmVar.pcc(), gmVar);
            nac.add(gmVar);
        }
    }

    gm(String str, int i) {
        this.lu = str;
        this.gpj = i;
    }

    public static gm pcc(String str) {
        return dax.get(str);
    }

    public int sf() {
        return this.gpj;
    }

    public static boolean pcc(vj vjVar) {
        return vjVar instanceof gm;
    }

    public String pcc() {
        return this.lu;
    }
}
