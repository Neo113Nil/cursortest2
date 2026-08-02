package com.unity3d.ads.core.data.datasource;

import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import defpackage.gz8;
import defpackage.jp5;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lcom/unity3d/ads/core/data/datasource/AndroidKnownStore;", "", HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME, "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getPackageName", "()Ljava/lang/String;", "GOOGLE", "GOOGLE_MARKET", "AMAZON", "SAMSUNG", "XIAOMI", "HUAWEI", "OPPO", "VIVO", "UNKNOWN", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AndroidKnownStore {
    private static final /* synthetic */ jp5 $ENTRIES;
    private static final /* synthetic */ AndroidKnownStore[] $VALUES;

    @NotNull
    private final String packageName;
    public static final AndroidKnownStore GOOGLE = new AndroidKnownStore("GOOGLE", 0, "com.android.vending");
    public static final AndroidKnownStore GOOGLE_MARKET = new AndroidKnownStore("GOOGLE_MARKET", 1, "com.google.market");
    public static final AndroidKnownStore AMAZON = new AndroidKnownStore("AMAZON", 2, "com.amazon.venezia");
    public static final AndroidKnownStore SAMSUNG = new AndroidKnownStore("SAMSUNG", 3, "com.sec.android.app.samsungapps");
    public static final AndroidKnownStore XIAOMI = new AndroidKnownStore("XIAOMI", 4, "com.xiaomi.market");
    public static final AndroidKnownStore HUAWEI = new AndroidKnownStore("HUAWEI", 5, "com.huawei.appmarket");
    public static final AndroidKnownStore OPPO = new AndroidKnownStore("OPPO", 6, "com.oppo.market");
    public static final AndroidKnownStore VIVO = new AndroidKnownStore("VIVO", 7, "com.bbk.appstore");
    public static final AndroidKnownStore UNKNOWN = new AndroidKnownStore("UNKNOWN", 8, "unknown");

    private static final /* synthetic */ AndroidKnownStore[] $values() {
        return new AndroidKnownStore[]{GOOGLE, GOOGLE_MARKET, AMAZON, SAMSUNG, XIAOMI, HUAWEI, OPPO, VIVO, UNKNOWN};
    }

    static {
        AndroidKnownStore[] $values = $values();
        $VALUES = $values;
        $ENTRIES = gz8.G($values);
    }

    private AndroidKnownStore(String str, int i, String str2) {
        this.packageName = str2;
    }

    @NotNull
    public static jp5 getEntries() {
        return $ENTRIES;
    }

    public static AndroidKnownStore valueOf(String str) {
        return (AndroidKnownStore) Enum.valueOf(AndroidKnownStore.class, str);
    }

    public static AndroidKnownStore[] values() {
        return (AndroidKnownStore[]) $VALUES.clone();
    }

    @NotNull
    public final String getPackageName() {
        return this.packageName;
    }
}
