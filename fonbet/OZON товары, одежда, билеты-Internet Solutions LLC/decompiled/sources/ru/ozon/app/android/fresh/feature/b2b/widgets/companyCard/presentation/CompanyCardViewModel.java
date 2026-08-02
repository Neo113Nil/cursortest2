package ru.ozon.app.android.fresh.feature.b2b.widgets.companyCard.presentation;

import Ae.B0;
import Ae.C0;
import Ae.E0;
import Kk.c;
import Nh.a;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.feature.b2b.widgets.companyCard.data.CompanyCardRepository;
import ru.ozon.app.android.uikit.R$string;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.common.CommonAtomIconDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import ru.ozon.uni.core.UniColors;
import xe.C10727i;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0001\u0018\u00002\u00020\u0001:\u0001\u001eB\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000eR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00100\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\"\u0010\u0018\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/companyCard/presentation/CompanyCardViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/companyCard/data/CompanyCardRepository;", "repository", "<init>", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/companyCard/data/CompanyCardRepository;)V", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "getDefaultNotificationDTO", "()Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;", "action", "", "onComposerAction", "(Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;)Z", "Lru/ozon/app/android/fresh/feature/b2b/widgets/companyCard/data/CompanyCardRepository;", "LAe/w0;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/companyCard/presentation/CompanyCardViewModel$Action;", "_actions", "LAe/w0;", "LAe/B0;", "actions", "LAe/B0;", "getActions", "()LAe/B0;", "shouldUpdate", "Z", "getShouldUpdate", "()Z", "setShouldUpdate", "(Z)V", "Action", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CompanyCardViewModel extends w0 {

    @NotNull
    private final Ae.w0<Action> _actions;

    @NotNull
    private final B0<Action> actions;

    @NotNull
    private final CompanyCardRepository repository;
    private boolean shouldUpdate;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/companyCard/presentation/CompanyCardViewModel$Action;", "", "PerformAction", "ShowNotification", "Lru/ozon/app/android/fresh/feature/b2b/widgets/companyCard/presentation/CompanyCardViewModel$Action$PerformAction;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/companyCard/presentation/CompanyCardViewModel$Action$ShowNotification;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Action {

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/companyCard/presentation/CompanyCardViewModel$Action$PerformAction;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/companyCard/presentation/CompanyCardViewModel$Action;", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "<init>", "(Lru/ozon/uni/atoms/af/AtomAction;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class PerformAction implements Action {
            public static final int $stable = AtomAction.$stable;

            @NotNull
            private final AtomAction action;

            public PerformAction(@NotNull AtomAction action) {
                Intrinsics.checkNotNullParameter(action, "action");
                this.action = action;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof PerformAction) && Intrinsics.d(this.action, ((PerformAction) other).action);
            }

            @NotNull
            public final AtomAction getAction() {
                return this.action;
            }

            public int hashCode() {
                return this.action.hashCode();
            }

            @NotNull
            public String toString() {
                return c.e("PerformAction(action=", ")", this.action);
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/companyCard/presentation/CompanyCardViewModel$Action$ShowNotification;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/companyCard/presentation/CompanyCardViewModel$Action;", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "notification", "<init>", "(Lru/ozon/uni/atoms/data/notification/NotificationDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "getNotification", "()Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ShowNotification implements Action {
            public static final int $stable = NotificationDTO.$stable;

            @NotNull
            private final NotificationDTO notification;

            public ShowNotification(@NotNull NotificationDTO notification) {
                Intrinsics.checkNotNullParameter(notification, "notification");
                this.notification = notification;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ShowNotification) && Intrinsics.d(this.notification, ((ShowNotification) other).notification);
            }

            @NotNull
            public final NotificationDTO getNotification() {
                return this.notification;
            }

            public int hashCode() {
                return this.notification.hashCode();
            }

            @NotNull
            public String toString() {
                return a.e("ShowNotification(notification=", ")", this.notification);
            }
        }
    }

    public CompanyCardViewModel(@NotNull CompanyCardRepository repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.repository = repository;
        C0 b11 = E0.b(0, 0, null, 7);
        this._actions = b11;
        this.actions = b11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final NotificationDTO getDefaultNotificationDTO() {
        return new NotificationDTO(StringProvider.getString(R$string.error_common_error_technical_error_title), null, null, null, new NotificationDTO.LeftContent(new IconDTO(IconDTO.IconSize.SIZE_500, null, IconDTO.IconShape.SQUIRCLE, null, new CommonAtomIconDTO("ic_m_exclamation_filled", UniColors.GRAPHIC_WARNING_PRIMARY.getToken()), null, UniColors.BG_SECONDARY_INVERTED.getToken(), null, null, null, null, null, null, null, null, null, IconDTO.FitType.FIT_CENTER, 65450, null), NotificationDTO.Alignment.CENTER), null, null, null, null, null, 1006, null);
    }

    @NotNull
    public final B0<Action> getActions() {
        return this.actions;
    }

    public final boolean getShouldUpdate() {
        return this.shouldUpdate;
    }

    public final boolean onComposerAction(@NotNull AtomAction.ComposerAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (!Intrinsics.d(action.getActionName(), "b2bCheckCanEmailChange")) {
            return false;
        }
        C10727i.c(x0.a(this), null, null, new CompanyCardViewModel$onComposerAction$1(this, action, null), 3);
        return true;
    }

    public final void setShouldUpdate(boolean z11) {
        this.shouldUpdate = z11;
    }
}
