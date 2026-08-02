package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class wmk {
    public static final wmk a;
    public static final wmk b;
    public static final /* synthetic */ wmk[] c;

    static {
        wmk wmkVar = new wmk("Lsq2", 0);
        a = wmkVar;
        wmk wmkVar2 = new wmk("Impulse", 1);
        b = wmkVar2;
        c = new wmk[]{wmkVar, wmkVar2};
    }

    public static wmk valueOf(String str) {
        return (wmk) Enum.valueOf(wmk.class, str);
    }

    public static wmk[] values() {
        return (wmk[]) c.clone();
    }
}
