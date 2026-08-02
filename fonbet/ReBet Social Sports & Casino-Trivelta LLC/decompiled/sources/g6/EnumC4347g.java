package g6;

import java.util.Arrays;

/* renamed from: g6.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC4347g {
    NONE(false),
    FACEBOOK_APPLICATION_WEB(true),
    FACEBOOK_APPLICATION_NATIVE(true),
    FACEBOOK_APPLICATION_SERVICE(true),
    WEB_VIEW(true),
    CHROME_CUSTOM_TAB(true),
    TEST_USER(true),
    CLIENT_TOKEN(true),
    DEVICE_AUTH(true),
    INSTAGRAM_APPLICATION_WEB(true),
    INSTAGRAM_CUSTOM_CHROME_TAB(true),
    INSTAGRAM_WEB_VIEW(true);


    /* renamed from: a, reason: collision with root package name */
    public final boolean f47080a;

    EnumC4347g(boolean z10) {
        this.f47080a = z10;
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static EnumC4347g[] valuesCustom() {
        EnumC4347g[] valuesCustom = values();
        return (EnumC4347g[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
    }

    public final boolean b() {
        return this.f47080a;
    }
}
