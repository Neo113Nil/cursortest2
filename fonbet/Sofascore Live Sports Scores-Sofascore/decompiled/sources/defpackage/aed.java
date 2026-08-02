package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class aed {
    public static final aed a;
    public static final aed b;
    public static final /* synthetic */ aed[] c;

    static {
        aed aedVar = new aed("Width", 0);
        a = aedVar;
        aed aedVar2 = new aed("Height", 1);
        b = aedVar2;
        c = new aed[]{aedVar, aedVar2};
    }

    public static aed valueOf(String str) {
        return (aed) Enum.valueOf(aed.class, str);
    }

    public static aed[] values() {
        return (aed[]) c.clone();
    }
}
