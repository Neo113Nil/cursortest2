package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class k3e {
    public static final k3e a;
    public static final k3e b;
    public static final k3e c;
    public static final /* synthetic */ k3e[] d;

    static {
        k3e k3eVar = new k3e("NONE", 0);
        a = k3eVar;
        k3e k3eVar2 = new k3e("ZERO", 1);
        b = k3eVar2;
        k3e k3eVar3 = new k3e("SPACE", 2);
        c = k3eVar3;
        d = new k3e[]{k3eVar, k3eVar2, k3eVar3};
    }

    public static k3e valueOf(String str) {
        return (k3e) Enum.valueOf(k3e.class, str);
    }

    public static k3e[] values() {
        return (k3e[]) d.clone();
    }
}
