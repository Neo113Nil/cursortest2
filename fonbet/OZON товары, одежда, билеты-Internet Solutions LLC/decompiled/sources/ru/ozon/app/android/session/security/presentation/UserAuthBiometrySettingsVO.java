package ru.ozon.app.android.session.security.presentation;

import Ak.C2436a;
import D40.a;
import G.g;
import Kk.C3532b;
import g.C6594f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0013\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002BA\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u0005¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\u0012R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001f\u0010\u0012R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b\t\u0010!R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\u000e\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001d\u001a\u0004\b(\u0010\u0012¨\u0006)"}, d2 = {"Lru/ozon/app/android/session/security/presentation/UserAuthBiometrySettingsVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "", "isSelected", "Lru/ozon/app/android/session/security/presentation/PermissionSettingVO;", "permission", "Lru/ozon/app/android/session/security/presentation/ToggleSettingVO;", "toggle", "analyticTag", "<init>", "(JLjava/lang/String;Ljava/lang/String;ZLru/ozon/app/android/session/security/presentation/PermissionSettingVO;Lru/ozon/app/android/session/security/presentation/ToggleSettingVO;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getTitle", "getSubtitle", "Z", "()Z", "Lru/ozon/app/android/session/security/presentation/PermissionSettingVO;", "getPermission", "()Lru/ozon/app/android/session/security/presentation/PermissionSettingVO;", "Lru/ozon/app/android/session/security/presentation/ToggleSettingVO;", "getToggle", "()Lru/ozon/app/android/session/security/presentation/ToggleSettingVO;", "getAnalyticTag", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class UserAuthBiometrySettingsVO implements c {

    @NotNull
    private final String analyticTag;
    private final long id;
    private final boolean isSelected;

    @NotNull
    private final PermissionSettingVO permission;
    private final String subtitle;

    @NotNull
    private final String title;

    @NotNull
    private final ToggleSettingVO toggle;

    public UserAuthBiometrySettingsVO(long j11, @NotNull String title, String str, boolean z11, @NotNull PermissionSettingVO permission, @NotNull ToggleSettingVO toggle, @NotNull String analyticTag) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(permission, "permission");
        Intrinsics.checkNotNullParameter(toggle, "toggle");
        Intrinsics.checkNotNullParameter(analyticTag, "analyticTag");
        this.id = j11;
        this.title = title;
        this.subtitle = str;
        this.isSelected = z11;
        this.permission = permission;
        this.toggle = toggle;
        this.analyticTag = analyticTag;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserAuthBiometrySettingsVO)) {
            return false;
        }
        UserAuthBiometrySettingsVO userAuthBiometrySettingsVO = (UserAuthBiometrySettingsVO) other;
        return this.id == userAuthBiometrySettingsVO.id && Intrinsics.d(this.title, userAuthBiometrySettingsVO.title) && Intrinsics.d(this.subtitle, userAuthBiometrySettingsVO.subtitle) && this.isSelected == userAuthBiometrySettingsVO.isSelected && Intrinsics.d(this.permission, userAuthBiometrySettingsVO.permission) && Intrinsics.d(this.toggle, userAuthBiometrySettingsVO.toggle) && Intrinsics.d(this.analyticTag, userAuthBiometrySettingsVO.analyticTag);
    }

    @NotNull
    public final String getAnalyticTag() {
        return this.analyticTag;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final ToggleSettingVO getToggle() {
        return this.toggle;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int a11 = g.a(Long.hashCode(this.id) * 31, 31, this.title);
        String str = this.subtitle;
        return this.analyticTag.hashCode() + ((this.toggle.hashCode() + ((this.permission.hashCode() + C3532b.a((a11 + (str == null ? 0 : str.hashCode())) * 31, 31, this.isSelected)) * 31)) * 31);
    }

    /* renamed from: isSelected, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        String str = this.title;
        String str2 = this.subtitle;
        boolean z11 = this.isSelected;
        PermissionSettingVO permissionSettingVO = this.permission;
        ToggleSettingVO toggleSettingVO = this.toggle;
        String str3 = this.analyticTag;
        StringBuilder c11 = C2436a.c(j11, "UserAuthBiometrySettingsVO(id=", ", title=", str);
        a.g(", subtitle=", str2, ", isSelected=", c11, z11);
        c11.append(", permission=");
        c11.append(permissionSettingVO);
        c11.append(", toggle=");
        c11.append(toggleSettingVO);
        return C6594f.a(", analyticTag=", str3, ")", c11);
    }
}
