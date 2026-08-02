package ai.verisoul.sdk.helpers.settings;

import Gb.c;
import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lai/verisoul/sdk/helpers/settings/SettingsData;", "", "globalData", "Lai/verisoul/sdk/helpers/settings/SettingsGlobalData;", "secureData", "Lai/verisoul/sdk/helpers/settings/SettingsSecureData;", "(Lai/verisoul/sdk/helpers/settings/SettingsGlobalData;Lai/verisoul/sdk/helpers/settings/SettingsSecureData;)V", "getGlobalData", "()Lai/verisoul/sdk/helpers/settings/SettingsGlobalData;", "getSecureData", "()Lai/verisoul/sdk/helpers/settings/SettingsSecureData;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class SettingsData {

    @c("globalData")
    @NotNull
    private final SettingsGlobalData globalData;

    @c("secureData")
    @NotNull
    private final SettingsSecureData secureData;

    public SettingsData(@NotNull SettingsGlobalData globalData, @NotNull SettingsSecureData secureData) {
        Intrinsics.checkNotNullParameter(globalData, "globalData");
        Intrinsics.checkNotNullParameter(secureData, "secureData");
        this.globalData = globalData;
        this.secureData = secureData;
    }

    public static /* synthetic */ SettingsData copy$default(SettingsData settingsData, SettingsGlobalData settingsGlobalData, SettingsSecureData settingsSecureData, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            settingsGlobalData = settingsData.globalData;
        }
        if ((i10 & 2) != 0) {
            settingsSecureData = settingsData.secureData;
        }
        return settingsData.copy(settingsGlobalData, settingsSecureData);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final SettingsGlobalData getGlobalData() {
        return this.globalData;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final SettingsSecureData getSecureData() {
        return this.secureData;
    }

    @NotNull
    public final SettingsData copy(@NotNull SettingsGlobalData globalData, @NotNull SettingsSecureData secureData) {
        Intrinsics.checkNotNullParameter(globalData, "globalData");
        Intrinsics.checkNotNullParameter(secureData, "secureData");
        return new SettingsData(globalData, secureData);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SettingsData)) {
            return false;
        }
        SettingsData settingsData = (SettingsData) other;
        return Intrinsics.areEqual(this.globalData, settingsData.globalData) && Intrinsics.areEqual(this.secureData, settingsData.secureData);
    }

    @NotNull
    public final SettingsGlobalData getGlobalData() {
        return this.globalData;
    }

    @NotNull
    public final SettingsSecureData getSecureData() {
        return this.secureData;
    }

    public int hashCode() {
        return (this.globalData.hashCode() * 31) + this.secureData.hashCode();
    }

    @NotNull
    public String toString() {
        return "SettingsData(globalData=" + this.globalData + ", secureData=" + this.secureData + ")";
    }
}
