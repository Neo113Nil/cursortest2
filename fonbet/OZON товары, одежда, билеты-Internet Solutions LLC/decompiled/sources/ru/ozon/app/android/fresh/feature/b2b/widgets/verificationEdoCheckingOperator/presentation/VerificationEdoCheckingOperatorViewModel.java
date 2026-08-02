package ru.ozon.app.android.fresh.feature.b2b.widgets.verificationEdoCheckingOperator.presentation;

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
import ru.ozon.app.android.fresh.feature.b2b.widgets.verificationEdoCheckingOperator.data.VerificationEdoRepository;
import ru.ozon.app.android.uikit.R$string;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.uni.atoms.data.common.CommonAtomIconDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import ru.ozon.uni.core.UniColors;
import xe.C10727i;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010R\u001c\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001f\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001d\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001a0\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/verificationEdoCheckingOperator/presentation/VerificationEdoCheckingOperatorViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/verificationEdoCheckingOperator/data/VerificationEdoRepository;", "repository", "<init>", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/verificationEdoCheckingOperator/data/VerificationEdoRepository;)V", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "getDefaultNotificationDTO", "()Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "", "actionName", "position", "type", "", "createVerificationRequest", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lru/ozon/app/android/fresh/feature/b2b/widgets/verificationEdoCheckingOperator/data/VerificationEdoRepository;", "LAe/w0;", "_notificationBar", "LAe/w0;", "LAe/B0;", "notificationBar", "LAe/B0;", "getNotificationBar", "()LAe/B0;", "LAe/x0;", "", "_verificationStarted", "LAe/x0;", "LAe/M0;", "verificationStarted", "LAe/M0;", "getVerificationStarted", "()LAe/M0;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class VerificationEdoCheckingOperatorViewModel extends w0 {

    @NotNull
    private final Ae.w0<NotificationDTO> _notificationBar;

    @NotNull
    private final x0<Boolean> _verificationStarted;

    @NotNull
    private final B0<NotificationDTO> notificationBar;

    @NotNull
    private final VerificationEdoRepository repository;

    @NotNull
    private final M0<Boolean> verificationStarted;

    public VerificationEdoCheckingOperatorViewModel(@NotNull VerificationEdoRepository repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.repository = repository;
        C0 b11 = E0.b(1, 0, null, 6);
        this._notificationBar = b11;
        this.notificationBar = C2399j.a(b11);
        x0<Boolean> a11 = O0.a(Boolean.FALSE);
        this._verificationStarted = a11;
        this.verificationStarted = C2399j.b(a11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final NotificationDTO getDefaultNotificationDTO() {
        return new NotificationDTO(StringProvider.getString(R$string.error_common_error_technical_error_title), null, null, null, new NotificationDTO.LeftContent(new IconDTO(IconDTO.IconSize.SIZE_500, null, IconDTO.IconShape.SQUIRCLE, null, new CommonAtomIconDTO("ic_m_exclamation_filled", UniColors.GRAPHIC_WARNING_PRIMARY.getToken()), null, UniColors.BG_SECONDARY_INVERTED.getToken(), null, null, null, null, null, null, null, null, null, IconDTO.FitType.FIT_CENTER, 65450, null), NotificationDTO.Alignment.CENTER), null, null, null, null, null, 1006, null);
    }

    public final void createVerificationRequest(@NotNull String actionName, @NotNull String position, String type) {
        Intrinsics.checkNotNullParameter(actionName, "actionName");
        Intrinsics.checkNotNullParameter(position, "position");
        C10727i.c(androidx.lifecycle.x0.a(this), null, null, new VerificationEdoCheckingOperatorViewModel$createVerificationRequest$1(this, actionName, position, type, null), 3);
    }

    @NotNull
    public final B0<NotificationDTO> getNotificationBar() {
        return this.notificationBar;
    }

    @NotNull
    public final M0<Boolean> getVerificationStarted() {
        return this.verificationStarted;
    }
}
