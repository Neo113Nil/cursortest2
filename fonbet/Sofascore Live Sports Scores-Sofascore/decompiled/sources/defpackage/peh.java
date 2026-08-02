package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class peh {
    public static final peh a;
    public static final peh b;
    public static final /* synthetic */ peh[] c;

    static {
        peh pehVar = new peh("GENERAL", 0);
        a = pehVar;
        peh pehVar2 = new peh("FALLBACK", 1);
        b = pehVar2;
        c = new peh[]{pehVar, pehVar2};
    }

    public static peh valueOf(String str) {
        return (peh) Enum.valueOf(peh.class, str);
    }

    public static peh[] values() {
        return (peh[]) c.clone();
    }
}
