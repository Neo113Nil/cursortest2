package defpackage;

import java.util.HashMap;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class yci {
    public static final HashMap a;
    public static final /* synthetic */ yci[] b;

    /* JADX INFO: Fake field, exist only in values array */
    yci EF0;

    static {
        yci yciVar = new yci("NONE", 0);
        yci yciVar2 = new yci("CHAIN", 1);
        yci yciVar3 = new yci("ALIGNED", 2);
        b = new yci[]{yciVar, yciVar2, yciVar3};
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        a = hashMap2;
        hashMap.put("none", yciVar);
        hashMap.put("chain", yciVar2);
        hashMap.put("aligned", yciVar3);
        ljg.s(0, 3, "none", "chain", hashMap2);
        hashMap2.put("aligned", 2);
    }

    public static yci valueOf(String str) {
        return (yci) Enum.valueOf(yci.class, str);
    }

    public static yci[] values() {
        return (yci[]) b.clone();
    }
}
