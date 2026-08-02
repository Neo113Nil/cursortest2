package com.socure.docv.capturesdk.common.network.model.stepup.modules;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ModuleResponse.kt */
@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000bJ2\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\r\u0010\u000b¨\u0006\u0018"}, d2 = {"Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/Config;", "", "imageThemeColor", "", "progressBar", "", "removeIdCheckLogo", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getImageThemeColor", "()Ljava/lang/String;", "getProgressBar", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getRemoveIdCheckLogo", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/Config;", "equals", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class Config {
    public static final int $stable = 0;
    private final String imageThemeColor;
    private final Boolean progressBar;
    private final Boolean removeIdCheckLogo;

    public static /* synthetic */ Config copy$default(Config config, String str, Boolean bool, Boolean bool2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = config.imageThemeColor;
        }
        if ((i & 2) != 0) {
            bool = config.progressBar;
        }
        if ((i & 4) != 0) {
            bool2 = config.removeIdCheckLogo;
        }
        return config.copy(str, bool, bool2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getImageThemeColor() {
        return this.imageThemeColor;
    }

    /* renamed from: component2, reason: from getter */
    public final Boolean getProgressBar() {
        return this.progressBar;
    }

    /* renamed from: component3, reason: from getter */
    public final Boolean getRemoveIdCheckLogo() {
        return this.removeIdCheckLogo;
    }

    public final Config copy(String imageThemeColor, Boolean progressBar, Boolean removeIdCheckLogo) {
        return new Config(imageThemeColor, progressBar, removeIdCheckLogo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Config)) {
            return false;
        }
        Config config = (Config) other;
        return Intrinsics.areEqual(this.imageThemeColor, config.imageThemeColor) && Intrinsics.areEqual(this.progressBar, config.progressBar) && Intrinsics.areEqual(this.removeIdCheckLogo, config.removeIdCheckLogo);
    }

    public int hashCode() {
        String str = this.imageThemeColor;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.progressBar;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.removeIdCheckLogo;
        return hashCode2 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public String toString() {
        return "Config(imageThemeColor=" + this.imageThemeColor + ", progressBar=" + this.progressBar + ", removeIdCheckLogo=" + this.removeIdCheckLogo + ")";
    }

    public Config(String str, Boolean bool, Boolean bool2) {
        this.imageThemeColor = str;
        this.progressBar = bool;
        this.removeIdCheckLogo = bool2;
    }

    public final String getImageThemeColor() {
        return this.imageThemeColor;
    }

    public final Boolean getProgressBar() {
        return this.progressBar;
    }

    public final Boolean getRemoveIdCheckLogo() {
        return this.removeIdCheckLogo;
    }
}
