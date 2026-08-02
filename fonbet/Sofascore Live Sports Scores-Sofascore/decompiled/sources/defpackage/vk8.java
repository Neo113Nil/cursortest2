package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class vk8 {
    public static final vk8 a;
    public static final vk8 b;
    public static final /* synthetic */ vk8[] c;

    static {
        vk8 vk8Var = new vk8("FIRST", 0);
        a = vk8Var;
        vk8 vk8Var2 = new vk8("SECOND", 1);
        b = vk8Var2;
        c = new vk8[]{vk8Var, vk8Var2};
    }

    public static vk8 valueOf(String str) {
        return (vk8) Enum.valueOf(vk8.class, str);
    }

    public static vk8[] values() {
        return (vk8[]) c.clone();
    }
}
