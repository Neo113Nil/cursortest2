package ru.ozon.app.android.checkoutcomposer.discountcode.data;

import V.e;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0016\u0017B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/discountcode/data/DiscountCodeDTO;", "", "input", "Lru/ozon/app/android/checkoutcomposer/discountcode/data/DiscountCodeDTO$Input;", "button", "Lru/ozon/app/android/checkoutcomposer/discountcode/data/DiscountCodeDTO$Button;", "<init>", "(Lru/ozon/app/android/checkoutcomposer/discountcode/data/DiscountCodeDTO$Input;Lru/ozon/app/android/checkoutcomposer/discountcode/data/DiscountCodeDTO$Button;)V", "getInput", "()Lru/ozon/app/android/checkoutcomposer/discountcode/data/DiscountCodeDTO$Input;", "getButton", "()Lru/ozon/app/android/checkoutcomposer/discountcode/data/DiscountCodeDTO$Button;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Input", "Button", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class DiscountCodeDTO {
    public static final int $stable = 0;

    @NotNull
    private final Button button;

    @NotNull
    private final Input input;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/discountcode/data/DiscountCodeDTO$Button;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;)V", "getTitle", "()Ljava/lang/String;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Button {
        public static final int $stable = 0;

        @NotNull
        private final AtomActionDTO action;

        @NotNull
        private final String title;

        public Button(@NotNull String title, @NotNull AtomActionDTO action) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(action, "action");
            this.title = title;
            this.action = action;
        }

        public static /* synthetic */ Button copy$default(Button button, String str, AtomActionDTO atomActionDTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = button.title;
            }
            if ((i11 & 2) != 0) {
                atomActionDTO = button.action;
            }
            return button.copy(str, atomActionDTO);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        @NotNull
        public final Button copy(@NotNull String title, @NotNull AtomActionDTO action) {
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
        public final AtomActionDTO getAction() {
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

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/discountcode/data/DiscountCodeDTO$Input;", "", "hint", "", "text", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getHint", "()Ljava/lang/String;", "getText", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Input {
        public static final int $stable = 0;

        @NotNull
        private final String hint;

        @NotNull
        private final String text;

        public Input(@NotNull String hint, @NotNull String text) {
            Intrinsics.checkNotNullParameter(hint, "hint");
            Intrinsics.checkNotNullParameter(text, "text");
            this.hint = hint;
            this.text = text;
        }

        public static /* synthetic */ Input copy$default(Input input, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = input.hint;
            }
            if ((i11 & 2) != 0) {
                str2 = input.text;
            }
            return input.copy(str, str2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getHint() {
            return this.hint;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getText() {
            return this.text;
        }

        @NotNull
        public final Input copy(@NotNull String hint, @NotNull String text) {
            Intrinsics.checkNotNullParameter(hint, "hint");
            Intrinsics.checkNotNullParameter(text, "text");
            return new Input(hint, text);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Input)) {
                return false;
            }
            Input input = (Input) other;
            return Intrinsics.d(this.hint, input.hint) && Intrinsics.d(this.text, input.text);
        }

        @NotNull
        public final String getHint() {
            return this.hint;
        }

        @NotNull
        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            return this.text.hashCode() + (this.hint.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return e.a("Input(hint=", this.hint, ", text=", this.text, ")");
        }
    }

    public DiscountCodeDTO(@NotNull Input input, @NotNull Button button) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(button, "button");
        this.input = input;
        this.button = button;
    }

    public static /* synthetic */ DiscountCodeDTO copy$default(DiscountCodeDTO discountCodeDTO, Input input, Button button, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            input = discountCodeDTO.input;
        }
        if ((i11 & 2) != 0) {
            button = discountCodeDTO.button;
        }
        return discountCodeDTO.copy(input, button);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final Input getInput() {
        return this.input;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final Button getButton() {
        return this.button;
    }

    @NotNull
    public final DiscountCodeDTO copy(@NotNull Input input, @NotNull Button button) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(button, "button");
        return new DiscountCodeDTO(input, button);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DiscountCodeDTO)) {
            return false;
        }
        DiscountCodeDTO discountCodeDTO = (DiscountCodeDTO) other;
        return Intrinsics.d(this.input, discountCodeDTO.input) && Intrinsics.d(this.button, discountCodeDTO.button);
    }

    @NotNull
    public final Button getButton() {
        return this.button;
    }

    @NotNull
    public final Input getInput() {
        return this.input;
    }

    public int hashCode() {
        return this.button.hashCode() + (this.input.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "DiscountCodeDTO(input=" + this.input + ", button=" + this.button + ")";
    }
}
