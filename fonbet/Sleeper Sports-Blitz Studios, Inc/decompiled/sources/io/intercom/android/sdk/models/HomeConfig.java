package io.intercom.android.sdk.models;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ConfigModules.kt */
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÇ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0012\u001a\u00020\u0013H×\u0001J\t\u0010\u0014\u001a\u00020\u0015H×\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lio/intercom/android/sdk/models/HomeConfig;", "", "header", "Lio/intercom/android/sdk/models/HeaderConfig;", "openConfig", "Lio/intercom/android/sdk/models/OpenConfig;", "<init>", "(Lio/intercom/android/sdk/models/HeaderConfig;Lio/intercom/android/sdk/models/OpenConfig;)V", "getHeader", "()Lio/intercom/android/sdk/models/HeaderConfig;", "getOpenConfig", "()Lio/intercom/android/sdk/models/OpenConfig;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class HomeConfig {
    public static final int $stable = 8;

    @SerializedName("header")
    private final HeaderConfig header;

    @SerializedName("open_config")
    private final OpenConfig openConfig;

    /* JADX WARN: Multi-variable type inference failed */
    public HomeConfig() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ HomeConfig copy$default(HomeConfig homeConfig, HeaderConfig headerConfig, OpenConfig openConfig, int i, Object obj) {
        if ((i & 1) != 0) {
            headerConfig = homeConfig.header;
        }
        if ((i & 2) != 0) {
            openConfig = homeConfig.openConfig;
        }
        return homeConfig.copy(headerConfig, openConfig);
    }

    /* renamed from: component1, reason: from getter */
    public final HeaderConfig getHeader() {
        return this.header;
    }

    /* renamed from: component2, reason: from getter */
    public final OpenConfig getOpenConfig() {
        return this.openConfig;
    }

    public final HomeConfig copy(HeaderConfig header, OpenConfig openConfig) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(openConfig, "openConfig");
        return new HomeConfig(header, openConfig);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HomeConfig)) {
            return false;
        }
        HomeConfig homeConfig = (HomeConfig) other;
        return Intrinsics.areEqual(this.header, homeConfig.header) && Intrinsics.areEqual(this.openConfig, homeConfig.openConfig);
    }

    public int hashCode() {
        return (this.header.hashCode() * 31) + this.openConfig.hashCode();
    }

    public String toString() {
        return "HomeConfig(header=" + this.header + ", openConfig=" + this.openConfig + ')';
    }

    public HomeConfig(HeaderConfig header, OpenConfig openConfig) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(openConfig, "openConfig");
        this.header = header;
        this.openConfig = openConfig;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ HomeConfig(HeaderConfig headerConfig, OpenConfig openConfig, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(headerConfig, openConfig);
        if ((i & 1) != 0) {
            headerConfig = new HeaderConfig(null, null, false, 7, null);
        }
        if ((i & 2) != 0) {
            openConfig = new OpenConfig(null, null, null, 7, null);
        }
    }

    public final HeaderConfig getHeader() {
        return this.header;
    }

    public final OpenConfig getOpenConfig() {
        return this.openConfig;
    }
}
