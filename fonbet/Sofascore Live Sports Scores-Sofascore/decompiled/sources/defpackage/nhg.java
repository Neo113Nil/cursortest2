package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class nhg {
    public static final nhg a;
    public static final nhg b;
    public static final nhg c;
    public static final nhg d;
    public static final nhg e;
    public static final /* synthetic */ nhg[] f;

    static {
        nhg nhgVar = new nhg("LOADING", 0);
        a = nhgVar;
        nhg nhgVar2 = new nhg("READY", 1);
        b = nhgVar2;
        nhg nhgVar3 = new nhg("PLAYING", 2);
        c = nhgVar3;
        nhg nhgVar4 = new nhg("PAUSED", 3);
        d = nhgVar4;
        nhg nhgVar5 = new nhg("COMPLETED", 4);
        e = nhgVar5;
        f = new nhg[]{nhgVar, nhgVar2, nhgVar3, nhgVar4, nhgVar5};
    }

    public static nhg valueOf(String str) {
        return (nhg) Enum.valueOf(nhg.class, str);
    }

    public static nhg[] values() {
        return (nhg[]) f.clone();
    }
}
