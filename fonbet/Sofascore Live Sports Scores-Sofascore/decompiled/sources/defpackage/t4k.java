package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class t4k {
    public static final t4k a;
    public static final t4k b;
    public static final t4k c;
    public static final /* synthetic */ t4k[] d;

    static {
        t4k t4kVar = new t4k("NO_DATA", 0);
        a = t4kVar;
        t4k t4kVar2 = new t4k("LIMITED_DATA", 1);
        b = t4kVar2;
        t4k t4kVar3 = new t4k("ENOUGH_DATA", 2);
        c = t4kVar3;
        d = new t4k[]{t4kVar, t4kVar2, t4kVar3};
    }

    public static t4k valueOf(String str) {
        return (t4k) Enum.valueOf(t4k.class, str);
    }

    public static t4k[] values() {
        return (t4k[]) d.clone();
    }
}
