package ru.ozon.app.android.session.sessionList.presentation;

import Xc.a;
import Xc.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/session/sessionList/presentation/SessionListEvent;", "", "ShowLoadingOverlay", "HideLoadingOverlay", "ShowError", "ShowLogoutOnAllDialog", "NavigateToHome", "CloseScreen", "Lru/ozon/app/android/session/sessionList/presentation/SessionListEvent$CloseScreen;", "Lru/ozon/app/android/session/sessionList/presentation/SessionListEvent$HideLoadingOverlay;", "Lru/ozon/app/android/session/sessionList/presentation/SessionListEvent$NavigateToHome;", "Lru/ozon/app/android/session/sessionList/presentation/SessionListEvent$ShowError;", "Lru/ozon/app/android/session/sessionList/presentation/SessionListEvent$ShowLoadingOverlay;", "Lru/ozon/app/android/session/sessionList/presentation/SessionListEvent$ShowLogoutOnAllDialog;", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface SessionListEvent {

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/session/sessionList/presentation/SessionListEvent$CloseScreen;", "Lru/ozon/app/android/session/sessionList/presentation/SessionListEvent;", "message", "", "<init>", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class CloseScreen implements SessionListEvent {
        private final String message;

        public CloseScreen(String str) {
            this.message = str;
        }

        public final String getMessage() {
            return this.message;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/session/sessionList/presentation/SessionListEvent$HideLoadingOverlay;", "Lru/ozon/app/android/session/sessionList/presentation/SessionListEvent;", "<init>", "()V", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class HideLoadingOverlay implements SessionListEvent {

        @NotNull
        public static final HideLoadingOverlay INSTANCE = new HideLoadingOverlay();

        private HideLoadingOverlay() {
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/session/sessionList/presentation/SessionListEvent$NavigateToHome;", "Lru/ozon/app/android/session/sessionList/presentation/SessionListEvent;", "message", "", "<init>", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class NavigateToHome implements SessionListEvent {
        private final String message;

        public NavigateToHome(String str) {
            this.message = str;
        }

        public final String getMessage() {
            return this.message;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/session/sessionList/presentation/SessionListEvent$ShowError;", "Lru/ozon/app/android/session/sessionList/presentation/SessionListEvent;", "<init>", "()V", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ShowError implements SessionListEvent {

        @NotNull
        public static final ShowError INSTANCE = new ShowError();

        private ShowError() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/session/sessionList/presentation/SessionListEvent$ShowLoadingOverlay;", "Lru/ozon/app/android/session/sessionList/presentation/SessionListEvent;", "<init>", "()V", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ShowLoadingOverlay implements SessionListEvent {

        @NotNull
        public static final ShowLoadingOverlay INSTANCE = new ShowLoadingOverlay();

        private ShowLoadingOverlay() {
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0016B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/session/sessionList/presentation/SessionListEvent$ShowLogoutOnAllDialog;", "Lru/ozon/app/android/session/sessionList/presentation/SessionListEvent;", "action", "Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "subtitle", "confirmActionText", "cancelActionText", "theme", "Lru/ozon/app/android/session/sessionList/presentation/SessionListEvent$ShowLogoutOnAllDialog$DialogTheme;", "<init>", "(Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/session/sessionList/presentation/SessionListEvent$ShowLogoutOnAllDialog$DialogTheme;)V", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getConfirmActionText", "getCancelActionText", "getTheme", "()Lru/ozon/app/android/session/sessionList/presentation/SessionListEvent$ShowLogoutOnAllDialog$DialogTheme;", "DialogTheme", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ShowLogoutOnAllDialog implements SessionListEvent {
        public static final int $stable = AtomAction.ComposerAction.$stable;

        @NotNull
        private final AtomAction.ComposerAction action;

        @NotNull
        private final String cancelActionText;

        @NotNull
        private final String confirmActionText;
        private final String subtitle;

        @NotNull
        private final DialogTheme theme;

        @NotNull
        private final String title;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/session/sessionList/presentation/SessionListEvent$ShowLogoutOnAllDialog$DialogTheme;", "", "<init>", "(Ljava/lang/String;I)V", "PRIMARY", "DELETE", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class DialogTheme {
            private static final /* synthetic */ a $ENTRIES;
            private static final /* synthetic */ DialogTheme[] $VALUES;
            public static final DialogTheme PRIMARY = new DialogTheme("PRIMARY", 0);
            public static final DialogTheme DELETE = new DialogTheme("DELETE", 1);

            private static final /* synthetic */ DialogTheme[] $values() {
                return new DialogTheme[]{PRIMARY, DELETE};
            }

            static {
                DialogTheme[] $values = $values();
                $VALUES = $values;
                $ENTRIES = b.a($values);
            }

            private DialogTheme(String str, int i11) {
            }

            public static DialogTheme valueOf(String str) {
                return (DialogTheme) Enum.valueOf(DialogTheme.class, str);
            }

            public static DialogTheme[] values() {
                return (DialogTheme[]) $VALUES.clone();
            }
        }

        public ShowLogoutOnAllDialog(@NotNull AtomAction.ComposerAction action, @NotNull String title, String str, @NotNull String confirmActionText, @NotNull String cancelActionText, @NotNull DialogTheme theme) {
            Intrinsics.checkNotNullParameter(action, "action");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(confirmActionText, "confirmActionText");
            Intrinsics.checkNotNullParameter(cancelActionText, "cancelActionText");
            Intrinsics.checkNotNullParameter(theme, "theme");
            this.action = action;
            this.title = title;
            this.subtitle = str;
            this.confirmActionText = confirmActionText;
            this.cancelActionText = cancelActionText;
            this.theme = theme;
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
        public final DialogTheme getTheme() {
            return this.theme;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }
    }
}
