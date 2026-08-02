package com.socure.docv.capturesdk.models;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: StartSessionModel.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/socure/docv/capturesdk/models/ConfigModel;", "", "imageThemeColor", "", "progressBar", "", "removeIdCheckLogo", "(Ljava/lang/String;ZZ)V", "getImageThemeColor", "()Ljava/lang/String;", "getProgressBar", "()Z", "getRemoveIdCheckLogo", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class ConfigModel {
    public static final int $stable = 0;
    private final String imageThemeColor;
    private final boolean progressBar;
    private final boolean removeIdCheckLogo;

    public static /* synthetic */ ConfigModel copy$default(ConfigModel configModel, String str, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = configModel.imageThemeColor;
        }
        if ((i & 2) != 0) {
            z = configModel.progressBar;
        }
        if ((i & 4) != 0) {
            z2 = configModel.removeIdCheckLogo;
        }
        return configModel.copy(str, z, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getImageThemeColor() {
        return this.imageThemeColor;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getProgressBar() {
        return this.progressBar;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getRemoveIdCheckLogo() {
        return this.removeIdCheckLogo;
    }

    public final ConfigModel copy(String imageThemeColor, boolean progressBar, boolean removeIdCheckLogo) {
        Intrinsics.checkNotNullParameter(imageThemeColor, "imageThemeColor");
        return new ConfigModel(imageThemeColor, progressBar, removeIdCheckLogo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConfigModel)) {
            return false;
        }
        ConfigModel configModel = (ConfigModel) other;
        return Intrinsics.areEqual(this.imageThemeColor, configModel.imageThemeColor) && this.progressBar == configModel.progressBar && this.removeIdCheckLogo == configModel.removeIdCheckLogo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.imageThemeColor.hashCode() * 31;
        boolean z = this.progressBar;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        boolean z2 = this.removeIdCheckLogo;
        return i2 + (z2 ? 1 : z2 ? 1 : 0);
    }

    public String toString() {
        return "ConfigModel(imageThemeColor=" + this.imageThemeColor + ", progressBar=" + this.progressBar + ", removeIdCheckLogo=" + this.removeIdCheckLogo + ")";
    }

    public ConfigModel(String imageThemeColor, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(imageThemeColor, "imageThemeColor");
        this.imageThemeColor = imageThemeColor;
        this.progressBar = z;
        this.removeIdCheckLogo = z2;
    }

    public final String getImageThemeColor() {
        return this.imageThemeColor;
    }

    public final boolean getProgressBar() {
        return this.progressBar;
    }

    public final boolean getRemoveIdCheckLogo() {
        return this.removeIdCheckLogo;
    }
}
