package defpackage;

import java.util.HashMap;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class xci {
    public static final xci a;
    public static final xci b;
    public static final xci c;
    public static final HashMap d;
    public static final /* synthetic */ xci[] e;

    static {
        xci xciVar = new xci("SPREAD", 0);
        a = xciVar;
        xci xciVar2 = new xci("SPREAD_INSIDE", 1);
        b = xciVar2;
        xci xciVar3 = new xci("PACKED", 2);
        c = xciVar3;
        e = new xci[]{xciVar, xciVar2, xciVar3};
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        d = hashMap2;
        hashMap.put("packed", xciVar3);
        hashMap.put("spread_inside", xciVar2);
        hashMap.put("spread", xciVar);
        ljg.s(2, 1, "packed", "spread_inside", hashMap2);
        hashMap2.put("spread", 0);
    }

    public static int a(String str) {
        HashMap hashMap = d;
        if (hashMap.containsKey(str)) {
            return ((Integer) hashMap.get(str)).intValue();
        }
        return -1;
    }

    public static xci valueOf(String str) {
        return (xci) Enum.valueOf(xci.class, str);
    }

    public static xci[] values() {
        return (xci[]) e.clone();
    }
}
