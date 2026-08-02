package d8;

import java.util.Arrays;

/* renamed from: d8.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC4028d {
    NONE(null),
    ONLY_ME("only_me"),
    FRIENDS("friends"),
    EVERYONE("everyone");


    /* renamed from: a, reason: collision with root package name */
    public final String f45065a;

    EnumC4028d(String str) {
        this.f45065a = str;
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static EnumC4028d[] valuesCustom() {
        EnumC4028d[] valuesCustom = values();
        return (EnumC4028d[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
    }

    public final String b() {
        return this.f45065a;
    }
}
