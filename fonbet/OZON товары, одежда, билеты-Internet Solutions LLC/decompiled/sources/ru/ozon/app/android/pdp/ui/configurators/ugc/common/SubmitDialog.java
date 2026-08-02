package ru.ozon.app.android.pdp.ui.configurators.ugc.common;

import G.g;
import N3.C3660k;
import Xc.a;
import Xc.b;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001bB'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/ugc/common/SubmitDialog;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "text", "submitButton", "Lru/ozon/app/android/pdp/ui/configurators/ugc/common/SubmitDialog$ButtonConfig;", "cancelButton", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/pdp/ui/configurators/ugc/common/SubmitDialog$ButtonConfig;Lru/ozon/app/android/pdp/ui/configurators/ugc/common/SubmitDialog$ButtonConfig;)V", "getTitle", "()Ljava/lang/String;", "getText", "getSubmitButton", "()Lru/ozon/app/android/pdp/ui/configurators/ugc/common/SubmitDialog$ButtonConfig;", "getCancelButton", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "ButtonConfig", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class SubmitDialog {
    public static final int $stable = 0;

    @NotNull
    private final ButtonConfig cancelButton;

    @NotNull
    private final ButtonConfig submitButton;

    @NotNull
    private final String text;

    @NotNull
    private final String title;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0015B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/ugc/common/SubmitDialog$ButtonConfig;", "", "style", "Lru/ozon/app/android/pdp/ui/configurators/ugc/common/SubmitDialog$ButtonConfig$Style;", "text", "", "<init>", "(Lru/ozon/app/android/pdp/ui/configurators/ugc/common/SubmitDialog$ButtonConfig$Style;Ljava/lang/String;)V", "getStyle", "()Lru/ozon/app/android/pdp/ui/configurators/ugc/common/SubmitDialog$ButtonConfig$Style;", "getText", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "Style", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class ButtonConfig {
        public static final int $stable = 0;

        @NotNull
        private final Style style;

        @NotNull
        private final String text;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/ugc/common/SubmitDialog$ButtonConfig$Style;", "", "<init>", "(Ljava/lang/String;I)V", "INVALID", "APPLY", "CANCEL", "REMOVE", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Style {
            private static final /* synthetic */ a $ENTRIES;
            private static final /* synthetic */ Style[] $VALUES;
            public static final Style INVALID = new Style("INVALID", 0);
            public static final Style APPLY = new Style("APPLY", 1);
            public static final Style CANCEL = new Style("CANCEL", 2);
            public static final Style REMOVE = new Style("REMOVE", 3);

            private static final /* synthetic */ Style[] $values() {
                return new Style[]{INVALID, APPLY, CANCEL, REMOVE};
            }

            static {
                Style[] $values = $values();
                $VALUES = $values;
                $ENTRIES = b.a($values);
            }

            private Style(String str, int i11) {
            }

            public static Style valueOf(String str) {
                return (Style) Enum.valueOf(Style.class, str);
            }

            public static Style[] values() {
                return (Style[]) $VALUES.clone();
            }
        }

        public ButtonConfig(@NotNull Style style, @NotNull String text) {
            Intrinsics.checkNotNullParameter(style, "style");
            Intrinsics.checkNotNullParameter(text, "text");
            this.style = style;
            this.text = text;
        }

        public static /* synthetic */ ButtonConfig copy$default(ButtonConfig buttonConfig, Style style, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                style = buttonConfig.style;
            }
            if ((i11 & 2) != 0) {
                str = buttonConfig.text;
            }
            return buttonConfig.copy(style, str);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final Style getStyle() {
            return this.style;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getText() {
            return this.text;
        }

        @NotNull
        public final ButtonConfig copy(@NotNull Style style, @NotNull String text) {
            Intrinsics.checkNotNullParameter(style, "style");
            Intrinsics.checkNotNullParameter(text, "text");
            return new ButtonConfig(style, text);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ButtonConfig)) {
                return false;
            }
            ButtonConfig buttonConfig = (ButtonConfig) other;
            return this.style == buttonConfig.style && Intrinsics.d(this.text, buttonConfig.text);
        }

        @NotNull
        public final Style getStyle() {
            return this.style;
        }

        @NotNull
        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            return this.text.hashCode() + (this.style.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "ButtonConfig(style=" + this.style + ", text=" + this.text + ")";
        }
    }

    public SubmitDialog(@NotNull String title, @NotNull String text, @NotNull ButtonConfig submitButton, @NotNull ButtonConfig cancelButton) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(submitButton, "submitButton");
        Intrinsics.checkNotNullParameter(cancelButton, "cancelButton");
        this.title = title;
        this.text = text;
        this.submitButton = submitButton;
        this.cancelButton = cancelButton;
    }

    public static /* synthetic */ SubmitDialog copy$default(SubmitDialog submitDialog, String str, String str2, ButtonConfig buttonConfig, ButtonConfig buttonConfig2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = submitDialog.title;
        }
        if ((i11 & 2) != 0) {
            str2 = submitDialog.text;
        }
        if ((i11 & 4) != 0) {
            buttonConfig = submitDialog.submitButton;
        }
        if ((i11 & 8) != 0) {
            buttonConfig2 = submitDialog.cancelButton;
        }
        return submitDialog.copy(str, str2, buttonConfig, buttonConfig2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final ButtonConfig getSubmitButton() {
        return this.submitButton;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final ButtonConfig getCancelButton() {
        return this.cancelButton;
    }

    @NotNull
    public final SubmitDialog copy(@NotNull String title, @NotNull String text, @NotNull ButtonConfig submitButton, @NotNull ButtonConfig cancelButton) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(submitButton, "submitButton");
        Intrinsics.checkNotNullParameter(cancelButton, "cancelButton");
        return new SubmitDialog(title, text, submitButton, cancelButton);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SubmitDialog)) {
            return false;
        }
        SubmitDialog submitDialog = (SubmitDialog) other;
        return Intrinsics.d(this.title, submitDialog.title) && Intrinsics.d(this.text, submitDialog.text) && Intrinsics.d(this.submitButton, submitDialog.submitButton) && Intrinsics.d(this.cancelButton, submitDialog.cancelButton);
    }

    @NotNull
    public final ButtonConfig getCancelButton() {
        return this.cancelButton;
    }

    @NotNull
    public final ButtonConfig getSubmitButton() {
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
        return this.cancelButton.hashCode() + ((this.submitButton.hashCode() + g.a(this.title.hashCode() * 31, 31, this.text)) * 31);
    }

    @NotNull
    public String toString() {
        String str = this.title;
        String str2 = this.text;
        ButtonConfig buttonConfig = this.submitButton;
        ButtonConfig buttonConfig2 = this.cancelButton;
        StringBuilder d11 = C3660k.d("SubmitDialog(title=", str, ", text=", str2, ", submitButton=");
        d11.append(buttonConfig);
        d11.append(", cancelButton=");
        d11.append(buttonConfig2);
        d11.append(")");
        return d11.toString();
    }
}
