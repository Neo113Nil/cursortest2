package j6;

import java.util.Arrays;

/* loaded from: classes2.dex */
public enum n {
    EVENT("event"),
    ACTION_SOURCE("action_source"),
    APP("app"),
    MOBILE_APP_INSTALL("MobileAppInstall"),
    INSTALL_EVENT_TIME("install_timestamp");


    /* renamed from: a, reason: collision with root package name */
    public final String f53803a;

    n(String str) {
        this.f53803a = str;
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static n[] valuesCustom() {
        n[] valuesCustom = values();
        return (n[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
    }

    public final String b() {
        return this.f53803a;
    }
}
