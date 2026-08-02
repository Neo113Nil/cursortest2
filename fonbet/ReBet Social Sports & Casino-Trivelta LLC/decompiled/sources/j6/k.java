package j6;

import java.util.Arrays;

/* loaded from: classes2.dex */
public enum k {
    USER_DATA("user_data"),
    APP_DATA("app_data"),
    CUSTOM_DATA("custom_data"),
    CUSTOM_EVENTS("custom_events");


    /* renamed from: a, reason: collision with root package name */
    public final String f53760a;

    k(String str) {
        this.f53760a = str;
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static k[] valuesCustom() {
        k[] valuesCustom = values();
        return (k[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
    }

    public final String b() {
        return this.f53760a;
    }
}
