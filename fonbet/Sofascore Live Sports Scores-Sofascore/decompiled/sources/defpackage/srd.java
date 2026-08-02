package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class srd {
    public static final srd a;
    public static final srd b;
    public static final srd c;
    public static final /* synthetic */ srd[] d;

    static {
        srd srdVar = new srd("Team", 0);
        a = srdVar;
        srd srdVar2 = new srd("Player", 1);
        b = srdVar2;
        srd srdVar3 = new srd("League", 2);
        c = srdVar3;
        d = new srd[]{srdVar, srdVar2, srdVar3};
    }

    public static srd valueOf(String str) {
        return (srd) Enum.valueOf(srd.class, str);
    }

    public static srd[] values() {
        return (srd[]) d.clone();
    }
}
