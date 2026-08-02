package ru.ozon.app.android.fresh.feature.b2b.widgets.statusBanner.presentation;

import Ae.B0;
import Ae.C0;
import Ae.C2399j;
import Ae.E0;
import Ae.M0;
import Ae.O0;
import Ae.x0;
import androidx.lifecycle.w0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.feature.b2b.widgets.statusBanner.data.StatusBannerRepository;
import ru.ozon.app.android.uikit.R$string;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.uni.atoms.data.common.CommonAtomIconDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import ru.ozon.uni.core.UniColors;
import xe.C10727i;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00110\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001f\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/statusBanner/presentation/StatusBannerViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/statusBanner/data/StatusBannerRepository;", "statusBannerRepository", "<init>", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/statusBanner/data/StatusBannerRepository;)V", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "getDefaultNotificationDTO", "()Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "", "actionName", "bannerId", "", "closeStatusBanner", "(Ljava/lang/String;Ljava/lang/String;)V", "Lru/ozon/app/android/fresh/feature/b2b/widgets/statusBanner/data/StatusBannerRepository;", "LAe/x0;", "", "_shouldShowBanner", "LAe/x0;", "LAe/M0;", "shouldShowBanner", "LAe/M0;", "getShouldShowBanner", "()LAe/M0;", "LAe/w0;", "_notificationBar", "LAe/w0;", "LAe/B0;", "notificationBar", "LAe/B0;", "getNotificationBar", "()LAe/B0;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class StatusBannerViewModel extends w0 {

    @NotNull
    private final Ae.w0<NotificationDTO> _notificationBar;

    @NotNull
    private final x0<Boolean> _shouldShowBanner;

    @NotNull
    private final B0<NotificationDTO> notificationBar;

    @NotNull
    private final M0<Boolean> shouldShowBanner;

    @NotNull
    private final StatusBannerRepository statusBannerRepository;

    public StatusBannerViewModel(@NotNull StatusBannerRepository statusBannerRepository) {
        Intrinsics.checkNotNullParameter(statusBannerRepository, "statusBannerRepository");
        this.statusBannerRepository = statusBannerRepository;
        x0<Boolean> a11 = O0.a(Boolean.TRUE);
        this._shouldShowBanner = a11;
        this.shouldShowBanner = C2399j.b(a11);
        C0 b11 = E0.b(1, 0, null, 6);
        this._notificationBar = b11;
        this.notificationBar = C2399j.a(b11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final NotificationDTO getDefaultNotificationDTO() {
        return new NotificationDTO(StringProvider.getString(R$string.error_common_error_technical_error_title), null, null, null, new NotificationDTO.LeftContent(new IconDTO(IconDTO.IconSize.SIZE_500, null, IconDTO.IconShape.SQUIRCLE, null, new CommonAtomIconDTO("ic_m_exclamation_filled", UniColors.GRAPHIC_WARNING_PRIMARY.getToken()), null, UniColors.BG_SECONDARY_INVERTED.getToken(), null, null, null, null, null, null, null, null, null, IconDTO.FitType.FIT_CENTER, 65450, null), NotificationDTO.Alignment.CENTER), null, null, null, null, null, 1006, null);
    }

    public final void closeStatusBanner(@NotNull String actionName, @NotNull String bannerId) {
        Intrinsics.checkNotNullParameter(actionName, "actionName");
        Intrinsics.checkNotNullParameter(bannerId, "bannerId");
        C10727i.c(androidx.lifecycle.x0.a(this), null, null, new StatusBannerViewModel$closeStatusBanner$1(this, actionName, bannerId, null), 3);
    }

    @NotNull
    public final B0<NotificationDTO> getNotificationBar() {
        return this.notificationBar;
    }

    @NotNull
    public final M0<Boolean> getShouldShowBanner() {
        return this.shouldShowBanner;
    }
}
