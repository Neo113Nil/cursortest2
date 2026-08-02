package defpackage;

import java.util.HashMap;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class j53 {
    public static final j53 a;
    public static final HashMap b;
    public static final /* synthetic */ j53[] c;

    /* JADX INFO: Fake field, exist only in values array */
    j53 EF0;

    static {
        j53 j53Var = new j53("X86_32", 0);
        j53 j53Var2 = new j53("X86_64", 1);
        j53 j53Var3 = new j53("ARM_UNKNOWN", 2);
        j53 j53Var4 = new j53("PPC", 3);
        j53 j53Var5 = new j53("PPC64", 4);
        j53 j53Var6 = new j53("ARMV6", 5);
        j53 j53Var7 = new j53("ARMV7", 6);
        j53 j53Var8 = new j53("UNKNOWN", 7);
        a = j53Var8;
        j53 j53Var9 = new j53("ARMV7S", 8);
        j53 j53Var10 = new j53("ARM64", 9);
        c = new j53[]{j53Var, j53Var2, j53Var3, j53Var4, j53Var5, j53Var6, j53Var7, j53Var8, j53Var9, j53Var10};
        HashMap hashMap = new HashMap(4);
        b = hashMap;
        hashMap.put("armeabi-v7a", j53Var7);
        hashMap.put("armeabi", j53Var6);
        hashMap.put("arm64-v8a", j53Var10);
        hashMap.put("x86", j53Var);
    }

    public static j53 valueOf(String str) {
        return (j53) Enum.valueOf(j53.class, str);
    }

    public static j53[] values() {
        return (j53[]) c.clone();
    }
}
