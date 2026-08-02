package ru.ozon.id.logout.data;

import B0.A0;
import G.g;
import N3.C3660k;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u001bB'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u001c"}, d2 = {"Lru/ozon/id/logout/data/ConfirmTrustedDeviceDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "subtitle", "submitButton", "Lru/ozon/id/logout/data/ConfirmTrustedDeviceDTO$Button;", "cancelButton", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/id/logout/data/ConfirmTrustedDeviceDTO$Button;Lru/ozon/id/logout/data/ConfirmTrustedDeviceDTO$Button;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getSubmitButton", "()Lru/ozon/id/logout/data/ConfirmTrustedDeviceDTO$Button;", "getCancelButton", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "Button", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ConfirmTrustedDeviceDTO {

    @NotNull
    private final Button cancelButton;

    @NotNull
    private final Button submitButton;

    @NotNull
    private final String subtitle;

    @NotNull
    private final String title;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0015B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/id/logout/data/ConfirmTrustedDeviceDTO$Button;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "action", "Lru/ozon/id/logout/data/ConfirmTrustedDeviceDTO$Button$Action;", "<init>", "(Ljava/lang/String;Lru/ozon/id/logout/data/ConfirmTrustedDeviceDTO$Button$Action;)V", "getTitle", "()Ljava/lang/String;", "getAction", "()Lru/ozon/id/logout/data/ConfirmTrustedDeviceDTO$Button$Action;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "Action", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class Button {

        @NotNull
        private final Action action;

        @NotNull
        private final String title;

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lru/ozon/id/logout/data/ConfirmTrustedDeviceDTO$Button$Action;", "", "link", "", "<init>", "(Ljava/lang/String;)V", "getLink", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Action {

            @NotNull
            private final String link;

            public Action(@NotNull String link) {
                Intrinsics.checkNotNullParameter(link, "link");
                this.link = link;
            }

            public static /* synthetic */ Action copy$default(Action action, String str, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = action.link;
                }
                return action.copy(str);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final String getLink() {
                return this.link;
            }

            @NotNull
            public final Action copy(@NotNull String link) {
                Intrinsics.checkNotNullParameter(link, "link");
                return new Action(link);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Action) && Intrinsics.d(this.link, ((Action) other).link);
            }

            @NotNull
            public final String getLink() {
                return this.link;
            }

            public int hashCode() {
                return this.link.hashCode();
            }

            @NotNull
            public String toString() {
                return A0.b("Action(link=", this.link, ")");
            }
        }

        public Button(@NotNull String title, @NotNull Action action) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(action, "action");
            this.title = title;
            this.action = action;
        }

        public static /* synthetic */ Button copy$default(Button button, String str, Action action, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = button.title;
            }
            if ((i11 & 2) != 0) {
                action = button.action;
            }
            return button.copy(str, action);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final Action getAction() {
            return this.action;
        }

        @NotNull
        public final Button copy(@NotNull String title, @NotNull Action action) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(action, "action");
            return new Button(title, action);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Button)) {
                return false;
            }
            Button button = (Button) other;
            return Intrinsics.d(this.title, button.title) && Intrinsics.d(this.action, button.action);
        }

        @NotNull
        public final Action getAction() {
            return this.action;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            return this.action.hashCode() + (this.title.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "Button(title=" + this.title + ", action=" + this.action + ")";
        }
    }

    public ConfirmTrustedDeviceDTO(@NotNull String title, @NotNull String subtitle, @NotNull Button submitButton, @NotNull Button cancelButton) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(submitButton, "submitButton");
        Intrinsics.checkNotNullParameter(cancelButton, "cancelButton");
        this.title = title;
        this.subtitle = subtitle;
        this.submitButton = submitButton;
        this.cancelButton = cancelButton;
    }

    public static /* synthetic */ ConfirmTrustedDeviceDTO copy$default(ConfirmTrustedDeviceDTO confirmTrustedDeviceDTO, String str, String str2, Button button, Button button2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = confirmTrustedDeviceDTO.title;
        }
        if ((i11 & 2) != 0) {
            str2 = confirmTrustedDeviceDTO.subtitle;
        }
        if ((i11 & 4) != 0) {
            button = confirmTrustedDeviceDTO.submitButton;
        }
        if ((i11 & 8) != 0) {
            button2 = confirmTrustedDeviceDTO.cancelButton;
        }
        return confirmTrustedDeviceDTO.copy(str, str2, button, button2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final Button getSubmitButton() {
        return this.submitButton;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final Button getCancelButton() {
        return this.cancelButton;
    }

    @NotNull
    public final ConfirmTrustedDeviceDTO copy(@NotNull String title, @NotNull String subtitle, @NotNull Button submitButton, @NotNull Button cancelButton) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(submitButton, "submitButton");
        Intrinsics.checkNotNullParameter(cancelButton, "cancelButton");
        return new ConfirmTrustedDeviceDTO(title, subtitle, submitButton, cancelButton);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConfirmTrustedDeviceDTO)) {
            return false;
        }
        ConfirmTrustedDeviceDTO confirmTrustedDeviceDTO = (ConfirmTrustedDeviceDTO) other;
        return Intrinsics.d(this.title, confirmTrustedDeviceDTO.title) && Intrinsics.d(this.subtitle, confirmTrustedDeviceDTO.subtitle) && Intrinsics.d(this.submitButton, confirmTrustedDeviceDTO.submitButton) && Intrinsics.d(this.cancelButton, confirmTrustedDeviceDTO.cancelButton);
    }

    @NotNull
    public final Button getCancelButton() {
        return this.cancelButton;
    }

    @NotNull
    public final Button getSubmitButton() {
        return this.submitButton;
    }

    @NotNull
    public final String getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.cancelButton.hashCode() + ((this.submitButton.hashCode() + g.a(this.title.hashCode() * 31, 31, this.subtitle)) * 31);
    }

    @NotNull
    public String toString() {
        String str = this.title;
        String str2 = this.subtitle;
        Button button = this.submitButton;
        Button button2 = this.cancelButton;
        StringBuilder d11 = C3660k.d("ConfirmTrustedDeviceDTO(title=", str, ", subtitle=", str2, ", submitButton=");
        d11.append(button);
        d11.append(", cancelButton=");
        d11.append(button2);
        d11.append(")");
        return d11.toString();
    }
}
