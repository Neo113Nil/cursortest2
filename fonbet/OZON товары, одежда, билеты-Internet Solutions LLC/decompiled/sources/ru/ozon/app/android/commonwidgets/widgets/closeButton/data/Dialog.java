package ru.ozon.app.android.commonwidgets.widgets.closeButton.data;

import G.g;
import N3.C3660k;
import V.e;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u001d\u001eB'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/closeButton/data/Dialog;", "", "text", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "submitButton", "Lru/ozon/app/android/commonwidgets/widgets/closeButton/data/Dialog$SubmitButton;", "cancelButton", "Lru/ozon/app/android/commonwidgets/widgets/closeButton/data/Dialog$CancelButton;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/commonwidgets/widgets/closeButton/data/Dialog$SubmitButton;Lru/ozon/app/android/commonwidgets/widgets/closeButton/data/Dialog$CancelButton;)V", "getText", "()Ljava/lang/String;", "getTitle", "getSubmitButton", "()Lru/ozon/app/android/commonwidgets/widgets/closeButton/data/Dialog$SubmitButton;", "getCancelButton", "()Lru/ozon/app/android/commonwidgets/widgets/closeButton/data/Dialog$CancelButton;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "CancelButton", "SubmitButton", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class Dialog {

    @NotNull
    private final CancelButton cancelButton;

    @NotNull
    private final SubmitButton submitButton;

    @NotNull
    private final String text;

    @NotNull
    private final String title;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/closeButton/data/Dialog$CancelButton;", "", "theme", "", "text", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getTheme", "()Ljava/lang/String;", "getText", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CancelButton {

        @NotNull
        private final String text;

        @NotNull
        private final String theme;

        public CancelButton(@NotNull String theme, @NotNull String text) {
            Intrinsics.checkNotNullParameter(theme, "theme");
            Intrinsics.checkNotNullParameter(text, "text");
            this.theme = theme;
            this.text = text;
        }

        public static /* synthetic */ CancelButton copy$default(CancelButton cancelButton, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = cancelButton.theme;
            }
            if ((i11 & 2) != 0) {
                str2 = cancelButton.text;
            }
            return cancelButton.copy(str, str2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getTheme() {
            return this.theme;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getText() {
            return this.text;
        }

        @NotNull
        public final CancelButton copy(@NotNull String theme, @NotNull String text) {
            Intrinsics.checkNotNullParameter(theme, "theme");
            Intrinsics.checkNotNullParameter(text, "text");
            return new CancelButton(theme, text);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CancelButton)) {
                return false;
            }
            CancelButton cancelButton = (CancelButton) other;
            return Intrinsics.d(this.theme, cancelButton.theme) && Intrinsics.d(this.text, cancelButton.text);
        }

        @NotNull
        public final String getText() {
            return this.text;
        }

        @NotNull
        public final String getTheme() {
            return this.theme;
        }

        public int hashCode() {
            return this.text.hashCode() + (this.theme.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return e.a("CancelButton(theme=", this.theme, ", text=", this.text, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/closeButton/data/Dialog$SubmitButton;", "", "theme", "Lru/ozon/app/android/commonwidgets/widgets/closeButton/data/Theme;", "text", "", "<init>", "(Lru/ozon/app/android/commonwidgets/widgets/closeButton/data/Theme;Ljava/lang/String;)V", "getTheme", "()Lru/ozon/app/android/commonwidgets/widgets/closeButton/data/Theme;", "getText", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SubmitButton {

        @NotNull
        private final String text;

        @NotNull
        private final Theme theme;

        public SubmitButton(@NotNull Theme theme, @NotNull String text) {
            Intrinsics.checkNotNullParameter(theme, "theme");
            Intrinsics.checkNotNullParameter(text, "text");
            this.theme = theme;
            this.text = text;
        }

        public static /* synthetic */ SubmitButton copy$default(SubmitButton submitButton, Theme theme, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                theme = submitButton.theme;
            }
            if ((i11 & 2) != 0) {
                str = submitButton.text;
            }
            return submitButton.copy(theme, str);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final Theme getTheme() {
            return this.theme;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getText() {
            return this.text;
        }

        @NotNull
        public final SubmitButton copy(@NotNull Theme theme, @NotNull String text) {
            Intrinsics.checkNotNullParameter(theme, "theme");
            Intrinsics.checkNotNullParameter(text, "text");
            return new SubmitButton(theme, text);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SubmitButton)) {
                return false;
            }
            SubmitButton submitButton = (SubmitButton) other;
            return this.theme == submitButton.theme && Intrinsics.d(this.text, submitButton.text);
        }

        @NotNull
        public final String getText() {
            return this.text;
        }

        @NotNull
        public final Theme getTheme() {
            return this.theme;
        }

        public int hashCode() {
            return this.text.hashCode() + (this.theme.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "SubmitButton(theme=" + this.theme + ", text=" + this.text + ")";
        }
    }

    public Dialog(@NotNull String text, @NotNull String title, @NotNull SubmitButton submitButton, @NotNull CancelButton cancelButton) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(submitButton, "submitButton");
        Intrinsics.checkNotNullParameter(cancelButton, "cancelButton");
        this.text = text;
        this.title = title;
        this.submitButton = submitButton;
        this.cancelButton = cancelButton;
    }

    public static /* synthetic */ Dialog copy$default(Dialog dialog, String str, String str2, SubmitButton submitButton, CancelButton cancelButton, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = dialog.text;
        }
        if ((i11 & 2) != 0) {
            str2 = dialog.title;
        }
        if ((i11 & 4) != 0) {
            submitButton = dialog.submitButton;
        }
        if ((i11 & 8) != 0) {
            cancelButton = dialog.cancelButton;
        }
        return dialog.copy(str, str2, submitButton, cancelButton);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final SubmitButton getSubmitButton() {
        return this.submitButton;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final CancelButton getCancelButton() {
        return this.cancelButton;
    }

    @NotNull
    public final Dialog copy(@NotNull String text, @NotNull String title, @NotNull SubmitButton submitButton, @NotNull CancelButton cancelButton) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(submitButton, "submitButton");
        Intrinsics.checkNotNullParameter(cancelButton, "cancelButton");
        return new Dialog(text, title, submitButton, cancelButton);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Dialog)) {
            return false;
        }
        Dialog dialog = (Dialog) other;
        return Intrinsics.d(this.text, dialog.text) && Intrinsics.d(this.title, dialog.title) && Intrinsics.d(this.submitButton, dialog.submitButton) && Intrinsics.d(this.cancelButton, dialog.cancelButton);
    }

    @NotNull
    public final CancelButton getCancelButton() {
        return this.cancelButton;
    }

    @NotNull
    public final SubmitButton getSubmitButton() {
        return this.submitButton;
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.cancelButton.hashCode() + ((this.submitButton.hashCode() + g.a(this.text.hashCode() * 31, 31, this.title)) * 31);
    }

    @NotNull
    public String toString() {
        String str = this.text;
        String str2 = this.title;
        SubmitButton submitButton = this.submitButton;
        CancelButton cancelButton = this.cancelButton;
        StringBuilder d11 = C3660k.d("Dialog(text=", str, ", title=", str2, ", submitButton=");
        d11.append(submitButton);
        d11.append(", cancelButton=");
        d11.append(cancelButton);
        d11.append(")");
        return d11.toString();
    }
}
