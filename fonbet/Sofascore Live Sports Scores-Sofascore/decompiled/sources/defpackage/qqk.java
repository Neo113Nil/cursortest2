package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class qqk {
    public static final qqk a;
    public static final qqk b;
    public static final qqk c;
    public static final qqk d;
    public static final /* synthetic */ qqk[] e;

    static {
        qqk qqkVar = new qqk("NOT_LOADING", 0);
        a = qqkVar;
        qqk qqkVar2 = new qqk("LOADING", 1);
        b = qqkVar2;
        qqk qqkVar3 = new qqk("READY", 2);
        c = qqkVar3;
        qqk qqkVar4 = new qqk("REPLAY", 3);
        d = qqkVar4;
        e = new qqk[]{qqkVar, qqkVar2, qqkVar3, qqkVar4};
    }

    public static qqk valueOf(String str) {
        return (qqk) Enum.valueOf(qqk.class, str);
    }

    public static qqk[] values() {
        return (qqk[]) e.clone();
    }
}
