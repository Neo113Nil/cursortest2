package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class rze {
    public static final rze a;
    public static final rze b;
    public static final rze c;
    public static final /* synthetic */ rze[] d;

    static {
        rze rzeVar = new rze("Unknown", 0);
        a = rzeVar;
        rze rzeVar2 = new rze("Dispatching", 1);
        b = rzeVar2;
        rze rzeVar3 = new rze("NotDispatching", 2);
        c = rzeVar3;
        d = new rze[]{rzeVar, rzeVar2, rzeVar3};
    }

    public static rze valueOf(String str) {
        return (rze) Enum.valueOf(rze.class, str);
    }

    public static rze[] values() {
        return (rze[]) d.clone();
    }
}
