package ru.ozon.app.android.session.security.presentation;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.session.security.data.PermissionSetting;
import ru.ozon.app.android.session.security.data.ToggleSetting;
import ru.ozon.app.android.session.security.data.UserAuthBiometrySettingsDTO;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\t\b\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000b\u001a\u00020\u000e*\u00020\rH\u0002¢\u0006\u0004\b\u000b\u0010\u000fJ\u0013\u0010\u000b\u001a\u00020\u0011*\u00020\u0010H\u0002¢\u0006\u0004\b\u000b\u0010\u0012J*\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0013\u001a\u00020\u00022\n\u0010\u0015\u001a\u00060\u0003j\u0002`\u0014H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/session/security/presentation/UserAuthBiometrySettingsMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/session/security/data/UserAuthBiometrySettingsDTO;", "Ll20/d;", "", "Lru/ozon/app/android/session/security/presentation/UserAuthBiometrySettingsVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "", "id", "toVO", "(Lru/ozon/app/android/session/security/data/UserAuthBiometrySettingsDTO;J)Lru/ozon/app/android/session/security/presentation/UserAuthBiometrySettingsVO;", "Lru/ozon/app/android/session/security/data/PermissionSetting;", "Lru/ozon/app/android/session/security/presentation/PermissionSettingVO;", "(Lru/ozon/app/android/session/security/data/PermissionSetting;)Lru/ozon/app/android/session/security/presentation/PermissionSettingVO;", "Lru/ozon/app/android/session/security/data/ToggleSetting;", "Lru/ozon/app/android/session/security/presentation/ToggleSettingVO;", "(Lru/ozon/app/android/session/security/data/ToggleSetting;)Lru/ozon/app/android/session/security/presentation/ToggleSettingVO;", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/session/security/data/UserAuthBiometrySettingsDTO;Ll20/d;)Ljava/util/List;", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class UserAuthBiometrySettingsMapper implements Function2<UserAuthBiometrySettingsDTO, d, List<? extends UserAuthBiometrySettingsVO>> {
    private final UserAuthBiometrySettingsVO toVO(UserAuthBiometrySettingsDTO userAuthBiometrySettingsDTO, long j11) {
        return new UserAuthBiometrySettingsVO(j11, userAuthBiometrySettingsDTO.getTitle(), userAuthBiometrySettingsDTO.getSubtitle(), userAuthBiometrySettingsDTO.isEnabled(), toVO(userAuthBiometrySettingsDTO.getPermission()), toVO(userAuthBiometrySettingsDTO.getToggle()), userAuthBiometrySettingsDTO.getAnalyticTag());
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<UserAuthBiometrySettingsVO> invoke(@NotNull UserAuthBiometrySettingsDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(toVO(state, widgetInfo.d().hashCode()));
    }

    private final PermissionSettingVO toVO(PermissionSetting permissionSetting) {
        return new PermissionSettingVO(permissionSetting.getTitle(), permissionSetting.getSubtitle(), permissionSetting.getSuccessMessage());
    }

    private final ToggleSettingVO toVO(ToggleSetting toggleSetting) {
        return new ToggleSettingVO(toggleSetting.getSuccessOn(), toggleSetting.getSuccessOff(), toggleSetting.getFailureOn(), toggleSetting.getFailureOff());
    }
}
