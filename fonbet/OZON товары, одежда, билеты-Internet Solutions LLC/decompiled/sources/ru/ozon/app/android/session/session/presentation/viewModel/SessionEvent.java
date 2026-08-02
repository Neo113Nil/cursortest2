package ru.ozon.app.android.session.session.presentation.viewModel;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/session/session/presentation/viewModel/SessionEvent;", "", "ShowLoadingOverlay", "HideLoadingOverlay", "ShowError", "ShowLogoutDialog", "NavigateToSessionList", "Lru/ozon/app/android/session/session/presentation/viewModel/SessionEvent$HideLoadingOverlay;", "Lru/ozon/app/android/session/session/presentation/viewModel/SessionEvent$NavigateToSessionList;", "Lru/ozon/app/android/session/session/presentation/viewModel/SessionEvent$ShowError;", "Lru/ozon/app/android/session/session/presentation/viewModel/SessionEvent$ShowLoadingOverlay;", "Lru/ozon/app/android/session/session/presentation/viewModel/SessionEvent$ShowLogoutDialog;", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface SessionEvent {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/session/session/presentation/viewModel/SessionEvent$HideLoadingOverlay;", "Lru/ozon/app/android/session/session/presentation/viewModel/SessionEvent;", "<init>", "()V", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class HideLoadingOverlay implements SessionEvent {

        @NotNull
        public static final HideLoadingOverlay INSTANCE = new HideLoadingOverlay();

        private HideLoadingOverlay() {
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/session/session/presentation/viewModel/SessionEvent$NavigateToSessionList;", "Lru/ozon/app/android/session/session/presentation/viewModel/SessionEvent;", "message", "", "<init>", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class NavigateToSessionList implements SessionEvent {
        private final String message;

        public NavigateToSessionList(String str) {
            this.message = str;
        }

        public final String getMessage() {
            return this.message;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/session/session/presentation/viewModel/SessionEvent$ShowError;", "Lru/ozon/app/android/session/session/presentation/viewModel/SessionEvent;", "<init>", "()V", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ShowError implements SessionEvent {

        @NotNull
        public static final ShowError INSTANCE = new ShowError();

        private ShowError() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/session/session/presentation/viewModel/SessionEvent$ShowLoadingOverlay;", "Lru/ozon/app/android/session/session/presentation/viewModel/SessionEvent;", "<init>", "()V", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ShowLoadingOverlay implements SessionEvent {

        @NotNull
        public static final ShowLoadingOverlay INSTANCE = new ShowLoadingOverlay();

        private ShowLoadingOverlay() {
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000e¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/session/session/presentation/viewModel/SessionEvent$ShowLogoutDialog;", "Lru/ozon/app/android/session/session/presentation/viewModel/SessionEvent;", "action", "Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "subtitle", "confirmActionText", "cancelActionText", "<init>", "(Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getConfirmActionText", "getCancelActionText", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ShowLogoutDialog implements SessionEvent {
        public static final int $stable = AtomAction.ComposerAction.$stable;

        @NotNull
        private final AtomAction.ComposerAction action;

        @NotNull
        private final String cancelActionText;

        @NotNull
        private final String confirmActionText;
        private final String subtitle;

        @NotNull
        private final String title;

        public ShowLogoutDialog(@NotNull AtomAction.ComposerAction action, @NotNull String title, String str, @NotNull String confirmActionText, @NotNull String cancelActionText) {
            Intrinsics.checkNotNullParameter(action, "action");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(confirmActionText, "confirmActionText");
            Intrinsics.checkNotNullParameter(cancelActionText, "cancelActionText");
            this.action = action;
            this.title = title;
            this.subtitle = str;
            this.confirmActionText = confirmActionText;
            this.cancelActionText = cancelActionText;
        }

        @NotNull
        public final AtomAction.ComposerAction getAction() {
            return this.action;
        }

        @NotNull
        public final String getCancelActionText() {
            return this.cancelActionText;
        }

        @NotNull
        public final String getConfirmActionText() {
            return this.confirmActionText;
        }

        public final String getSubtitle() {
            return this.subtitle;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }
    }
}
