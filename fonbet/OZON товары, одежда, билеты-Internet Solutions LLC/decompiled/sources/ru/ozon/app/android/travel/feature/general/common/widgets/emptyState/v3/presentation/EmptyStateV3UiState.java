package ru.ozon.app.android.travel.feature.general.common.widgets.emptyState.v3.presentation;

import Kk.C3532b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u000e\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u001cB3\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ<\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0005\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u000eR\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010\u0018\u001a\u0004\b\b\u0010\u0019¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/emptyState/v3/presentation/EmptyStateV3UiState;", "", "Lru/ozon/app/android/travel/feature/general/common/widgets/emptyState/v3/presentation/EmptyStateV3UiState$Action;", "action", "", "isButtonLoaderVisible", "", "buttonId", "isError", "<init>", "(Lru/ozon/app/android/travel/feature/general/common/widgets/emptyState/v3/presentation/EmptyStateV3UiState$Action;ZLjava/lang/String;Z)V", "copy", "(Lru/ozon/app/android/travel/feature/general/common/widgets/emptyState/v3/presentation/EmptyStateV3UiState$Action;ZLjava/lang/String;Z)Lru/ozon/app/android/travel/feature/general/common/widgets/emptyState/v3/presentation/EmptyStateV3UiState;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/travel/feature/general/common/widgets/emptyState/v3/presentation/EmptyStateV3UiState$Action;", "getAction", "()Lru/ozon/app/android/travel/feature/general/common/widgets/emptyState/v3/presentation/EmptyStateV3UiState$Action;", "Z", "()Z", "Ljava/lang/String;", "getButtonId", "Action", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class EmptyStateV3UiState {
    public static final int $stable = NotificationDTO.$stable | AtomAction.$stable;
    private final Action action;
    private final String buttonId;
    private final boolean isButtonLoaderVisible;
    private final boolean isError;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/emptyState/v3/presentation/EmptyStateV3UiState$Action;", "", "Lru/ozon/uni/atoms/af/AtomAction;", "atomAction", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "notification", "<init>", "(Lru/ozon/uni/atoms/af/AtomAction;Lru/ozon/uni/atoms/data/notification/NotificationDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/af/AtomAction;", "getAtomAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "getNotification", "()Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Action {
        public static final int $stable = NotificationDTO.$stable | AtomAction.$stable;

        @NotNull
        private final AtomAction atomAction;
        private final NotificationDTO notification;

        public Action(@NotNull AtomAction atomAction, NotificationDTO notificationDTO) {
            Intrinsics.checkNotNullParameter(atomAction, "atomAction");
            this.atomAction = atomAction;
            this.notification = notificationDTO;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Action)) {
                return false;
            }
            Action action = (Action) other;
            return Intrinsics.d(this.atomAction, action.atomAction) && Intrinsics.d(this.notification, action.notification);
        }

        @NotNull
        public final AtomAction getAtomAction() {
            return this.atomAction;
        }

        public final NotificationDTO getNotification() {
            return this.notification;
        }

        public int hashCode() {
            int hashCode = this.atomAction.hashCode() * 31;
            NotificationDTO notificationDTO = this.notification;
            return hashCode + (notificationDTO == null ? 0 : notificationDTO.hashCode());
        }

        @NotNull
        public String toString() {
            return "Action(atomAction=" + this.atomAction + ", notification=" + this.notification + ")";
        }
    }

    public EmptyStateV3UiState() {
        this(null, false, null, false, 15, null);
    }

    public static /* synthetic */ EmptyStateV3UiState copy$default(EmptyStateV3UiState emptyStateV3UiState, Action action, boolean z11, String str, boolean z12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            action = emptyStateV3UiState.action;
        }
        if ((i11 & 2) != 0) {
            z11 = emptyStateV3UiState.isButtonLoaderVisible;
        }
        if ((i11 & 4) != 0) {
            str = emptyStateV3UiState.buttonId;
        }
        if ((i11 & 8) != 0) {
            z12 = emptyStateV3UiState.isError;
        }
        return emptyStateV3UiState.copy(action, z11, str, z12);
    }

    @NotNull
    public final EmptyStateV3UiState copy(Action action, boolean isButtonLoaderVisible, String buttonId, boolean isError) {
        return new EmptyStateV3UiState(action, isButtonLoaderVisible, buttonId, isError);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EmptyStateV3UiState)) {
            return false;
        }
        EmptyStateV3UiState emptyStateV3UiState = (EmptyStateV3UiState) other;
        return Intrinsics.d(this.action, emptyStateV3UiState.action) && this.isButtonLoaderVisible == emptyStateV3UiState.isButtonLoaderVisible && Intrinsics.d(this.buttonId, emptyStateV3UiState.buttonId) && this.isError == emptyStateV3UiState.isError;
    }

    public final Action getAction() {
        return this.action;
    }

    public final String getButtonId() {
        return this.buttonId;
    }

    public int hashCode() {
        Action action = this.action;
        int a11 = C3532b.a((action == null ? 0 : action.hashCode()) * 31, 31, this.isButtonLoaderVisible);
        String str = this.buttonId;
        return Boolean.hashCode(this.isError) + ((a11 + (str != null ? str.hashCode() : 0)) * 31);
    }

    /* renamed from: isButtonLoaderVisible, reason: from getter */
    public final boolean getIsButtonLoaderVisible() {
        return this.isButtonLoaderVisible;
    }

    /* renamed from: isError, reason: from getter */
    public final boolean getIsError() {
        return this.isError;
    }

    @NotNull
    public String toString() {
        return "EmptyStateV3UiState(action=" + this.action + ", isButtonLoaderVisible=" + this.isButtonLoaderVisible + ", buttonId=" + this.buttonId + ", isError=" + this.isError + ")";
    }

    public EmptyStateV3UiState(Action action, boolean z11, String str, boolean z12) {
        this.action = action;
        this.isButtonLoaderVisible = z11;
        this.buttonId = str;
        this.isError = z12;
    }

    public /* synthetic */ EmptyStateV3UiState(Action action, boolean z11, String str, boolean z12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : action, (i11 & 2) != 0 ? false : z11, (i11 & 4) != 0 ? null : str, (i11 & 8) != 0 ? false : z12);
    }
}
