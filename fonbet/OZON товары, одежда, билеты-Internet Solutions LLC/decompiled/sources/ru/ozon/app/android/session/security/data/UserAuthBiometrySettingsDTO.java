package ru.ozon.app.android.session.security.data;

import Kk.C3532b;
import N3.C3660k;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0003¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001a\u001a\u00020\bHÆ\u0003J\t\u0010\u001b\u001a\u00020\nHÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003JG\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u00062\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000f¨\u0006#"}, d2 = {"Lru/ozon/app/android/session/security/data/UserAuthBiometrySettingsDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "subtitle", "isEnabled", "", "permission", "Lru/ozon/app/android/session/security/data/PermissionSetting;", "toggle", "Lru/ozon/app/android/session/security/data/ToggleSetting;", "analyticTag", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLru/ozon/app/android/session/security/data/PermissionSetting;Lru/ozon/app/android/session/security/data/ToggleSetting;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "()Z", "getPermission", "()Lru/ozon/app/android/session/security/data/PermissionSetting;", "getToggle", "()Lru/ozon/app/android/session/security/data/ToggleSetting;", "getAnalyticTag", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class UserAuthBiometrySettingsDTO {
    public static final int $stable = 0;

    @NotNull
    private final String analyticTag;
    private final boolean isEnabled;

    @NotNull
    private final PermissionSetting permission;
    private final String subtitle;

    @NotNull
    private final String title;

    @NotNull
    private final ToggleSetting toggle;

    public UserAuthBiometrySettingsDTO(@NotNull String title, String str, boolean z11, @NotNull PermissionSetting permission, @NotNull ToggleSetting toggle, @NotNull String analyticTag) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(permission, "permission");
        Intrinsics.checkNotNullParameter(toggle, "toggle");
        Intrinsics.checkNotNullParameter(analyticTag, "analyticTag");
        this.title = title;
        this.subtitle = str;
        this.isEnabled = z11;
        this.permission = permission;
        this.toggle = toggle;
        this.analyticTag = analyticTag;
    }

    public static /* synthetic */ UserAuthBiometrySettingsDTO copy$default(UserAuthBiometrySettingsDTO userAuthBiometrySettingsDTO, String str, String str2, boolean z11, PermissionSetting permissionSetting, ToggleSetting toggleSetting, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = userAuthBiometrySettingsDTO.title;
        }
        if ((i11 & 2) != 0) {
            str2 = userAuthBiometrySettingsDTO.subtitle;
        }
        if ((i11 & 4) != 0) {
            z11 = userAuthBiometrySettingsDTO.isEnabled;
        }
        if ((i11 & 8) != 0) {
            permissionSetting = userAuthBiometrySettingsDTO.permission;
        }
        if ((i11 & 16) != 0) {
            toggleSetting = userAuthBiometrySettingsDTO.toggle;
        }
        if ((i11 & 32) != 0) {
            str3 = userAuthBiometrySettingsDTO.analyticTag;
        }
        ToggleSetting toggleSetting2 = toggleSetting;
        String str4 = str3;
        return userAuthBiometrySettingsDTO.copy(str, str2, z11, permissionSetting, toggleSetting2, str4);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsEnabled() {
        return this.isEnabled;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final PermissionSetting getPermission() {
        return this.permission;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final ToggleSetting getToggle() {
        return this.toggle;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final String getAnalyticTag() {
        return this.analyticTag;
    }

    @NotNull
    public final UserAuthBiometrySettingsDTO copy(@NotNull String title, String subtitle, boolean isEnabled, @NotNull PermissionSetting permission, @NotNull ToggleSetting toggle, @NotNull String analyticTag) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(permission, "permission");
        Intrinsics.checkNotNullParameter(toggle, "toggle");
        Intrinsics.checkNotNullParameter(analyticTag, "analyticTag");
        return new UserAuthBiometrySettingsDTO(title, subtitle, isEnabled, permission, toggle, analyticTag);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserAuthBiometrySettingsDTO)) {
            return false;
        }
        UserAuthBiometrySettingsDTO userAuthBiometrySettingsDTO = (UserAuthBiometrySettingsDTO) other;
        return Intrinsics.d(this.title, userAuthBiometrySettingsDTO.title) && Intrinsics.d(this.subtitle, userAuthBiometrySettingsDTO.subtitle) && this.isEnabled == userAuthBiometrySettingsDTO.isEnabled && Intrinsics.d(this.permission, userAuthBiometrySettingsDTO.permission) && Intrinsics.d(this.toggle, userAuthBiometrySettingsDTO.toggle) && Intrinsics.d(this.analyticTag, userAuthBiometrySettingsDTO.analyticTag);
    }

    @NotNull
    public final String getAnalyticTag() {
        return this.analyticTag;
    }

    @NotNull
    public final PermissionSetting getPermission() {
        return this.permission;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final ToggleSetting getToggle() {
        return this.toggle;
    }

    public int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        String str = this.subtitle;
        return this.analyticTag.hashCode() + ((this.toggle.hashCode() + ((this.permission.hashCode() + C3532b.a((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.isEnabled)) * 31)) * 31);
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    @NotNull
    public String toString() {
        String str = this.title;
        String str2 = this.subtitle;
        boolean z11 = this.isEnabled;
        PermissionSetting permissionSetting = this.permission;
        ToggleSetting toggleSetting = this.toggle;
        String str3 = this.analyticTag;
        StringBuilder d11 = C3660k.d("UserAuthBiometrySettingsDTO(title=", str, ", subtitle=", str2, ", isEnabled=");
        d11.append(z11);
        d11.append(", permission=");
        d11.append(permissionSetting);
        d11.append(", toggle=");
        d11.append(toggleSetting);
        d11.append(", analyticTag=");
        d11.append(str3);
        d11.append(")");
        return d11.toString();
    }
}
