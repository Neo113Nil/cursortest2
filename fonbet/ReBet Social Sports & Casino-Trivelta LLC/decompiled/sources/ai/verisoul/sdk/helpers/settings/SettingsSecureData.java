package ai.verisoul.sdk.helpers.settings;

import Gb.c;
import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J;\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001c"}, d2 = {"Lai/verisoul/sdk/helpers/settings/SettingsSecureData;", "", "accessibilityEnabled", "", "androidId", "", "defaultInputMethod", "rttCallingMode", "touchExplorationEnabled", "(ILjava/lang/String;Ljava/lang/String;II)V", "getAccessibilityEnabled", "()I", "getAndroidId", "()Ljava/lang/String;", "getDefaultInputMethod", "getRttCallingMode", "getTouchExplorationEnabled", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class SettingsSecureData {

    @c("accessibilityEnabled")
    private final int accessibilityEnabled;

    @c("androidId")
    @NotNull
    private final String androidId;

    @c("defaultInputMethod")
    @NotNull
    private final String defaultInputMethod;

    @c("rttCallingMode")
    private final int rttCallingMode;

    @c("touchExplorationEnabled")
    private final int touchExplorationEnabled;

    public SettingsSecureData(int i10, @NotNull String androidId, @NotNull String defaultInputMethod, int i11, int i12) {
        Intrinsics.checkNotNullParameter(androidId, "androidId");
        Intrinsics.checkNotNullParameter(defaultInputMethod, "defaultInputMethod");
        this.accessibilityEnabled = i10;
        this.androidId = androidId;
        this.defaultInputMethod = defaultInputMethod;
        this.rttCallingMode = i11;
        this.touchExplorationEnabled = i12;
    }

    public static /* synthetic */ SettingsSecureData copy$default(SettingsSecureData settingsSecureData, int i10, String str, String str2, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i10 = settingsSecureData.accessibilityEnabled;
        }
        if ((i13 & 2) != 0) {
            str = settingsSecureData.androidId;
        }
        if ((i13 & 4) != 0) {
            str2 = settingsSecureData.defaultInputMethod;
        }
        if ((i13 & 8) != 0) {
            i11 = settingsSecureData.rttCallingMode;
        }
        if ((i13 & 16) != 0) {
            i12 = settingsSecureData.touchExplorationEnabled;
        }
        int i14 = i12;
        String str3 = str2;
        return settingsSecureData.copy(i10, str, str3, i11, i14);
    }

    /* renamed from: component1, reason: from getter */
    public final int getAccessibilityEnabled() {
        return this.accessibilityEnabled;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getAndroidId() {
        return this.androidId;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getDefaultInputMethod() {
        return this.defaultInputMethod;
    }

    /* renamed from: component4, reason: from getter */
    public final int getRttCallingMode() {
        return this.rttCallingMode;
    }

    /* renamed from: component5, reason: from getter */
    public final int getTouchExplorationEnabled() {
        return this.touchExplorationEnabled;
    }

    @NotNull
    public final SettingsSecureData copy(int accessibilityEnabled, @NotNull String androidId, @NotNull String defaultInputMethod, int rttCallingMode, int touchExplorationEnabled) {
        Intrinsics.checkNotNullParameter(androidId, "androidId");
        Intrinsics.checkNotNullParameter(defaultInputMethod, "defaultInputMethod");
        return new SettingsSecureData(accessibilityEnabled, androidId, defaultInputMethod, rttCallingMode, touchExplorationEnabled);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SettingsSecureData)) {
            return false;
        }
        SettingsSecureData settingsSecureData = (SettingsSecureData) other;
        return this.accessibilityEnabled == settingsSecureData.accessibilityEnabled && Intrinsics.areEqual(this.androidId, settingsSecureData.androidId) && Intrinsics.areEqual(this.defaultInputMethod, settingsSecureData.defaultInputMethod) && this.rttCallingMode == settingsSecureData.rttCallingMode && this.touchExplorationEnabled == settingsSecureData.touchExplorationEnabled;
    }

    public final int getAccessibilityEnabled() {
        return this.accessibilityEnabled;
    }

    @NotNull
    public final String getAndroidId() {
        return this.androidId;
    }

    @NotNull
    public final String getDefaultInputMethod() {
        return this.defaultInputMethod;
    }

    public final int getRttCallingMode() {
        return this.rttCallingMode;
    }

    public final int getTouchExplorationEnabled() {
        return this.touchExplorationEnabled;
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.accessibilityEnabled) * 31) + this.androidId.hashCode()) * 31) + this.defaultInputMethod.hashCode()) * 31) + Integer.hashCode(this.rttCallingMode)) * 31) + Integer.hashCode(this.touchExplorationEnabled);
    }

    @NotNull
    public String toString() {
        return "SettingsSecureData(accessibilityEnabled=" + this.accessibilityEnabled + ", androidId=" + this.androidId + ", defaultInputMethod=" + this.defaultInputMethod + ", rttCallingMode=" + this.rttCallingMode + ", touchExplorationEnabled=" + this.touchExplorationEnabled + ")";
    }
}
