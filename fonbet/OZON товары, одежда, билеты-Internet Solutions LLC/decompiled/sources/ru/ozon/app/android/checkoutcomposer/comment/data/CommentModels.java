package ru.ozon.app.android.checkoutcomposer.comment.data;

import V.e;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u001c\u001dB%\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\bHÆ\u0003J-\u0010\u0014\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/comment/data/CommentModels;", "", "info", "", "Lru/ozon/uni/atoms/data/AtomDTO;", "input", "Lru/ozon/app/android/checkoutcomposer/comment/data/CommentModels$Input;", "button", "Lru/ozon/app/android/checkoutcomposer/comment/data/CommentModels$Button;", "<init>", "(Ljava/util/List;Lru/ozon/app/android/checkoutcomposer/comment/data/CommentModels$Input;Lru/ozon/app/android/checkoutcomposer/comment/data/CommentModels$Button;)V", "getInfo", "()Ljava/util/List;", "getInput", "()Lru/ozon/app/android/checkoutcomposer/comment/data/CommentModels$Input;", "getButton", "()Lru/ozon/app/android/checkoutcomposer/comment/data/CommentModels$Button;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Input", "Button", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class CommentModels {
    public static final int $stable = 8;

    @NotNull
    private final Button button;

    @NotNull
    private final List<AtomDTO> info;

    @NotNull
    private final Input input;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/comment/data/CommentModels$Button;", "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "text", "", "<init>", "(Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/lang/String;)V", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getText", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Button {
        public static final int $stable = 0;

        @NotNull
        private final AtomActionDTO action;

        @NotNull
        private final String text;

        public Button(@NotNull AtomActionDTO action, @NotNull String text) {
            Intrinsics.checkNotNullParameter(action, "action");
            Intrinsics.checkNotNullParameter(text, "text");
            this.action = action;
            this.text = text;
        }

        public static /* synthetic */ Button copy$default(Button button, AtomActionDTO atomActionDTO, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                atomActionDTO = button.action;
            }
            if ((i11 & 2) != 0) {
                str = button.text;
            }
            return button.copy(atomActionDTO, str);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getText() {
            return this.text;
        }

        @NotNull
        public final Button copy(@NotNull AtomActionDTO action, @NotNull String text) {
            Intrinsics.checkNotNullParameter(action, "action");
            Intrinsics.checkNotNullParameter(text, "text");
            return new Button(action, text);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Button)) {
                return false;
            }
            Button button = (Button) other;
            return Intrinsics.d(this.action, button.action) && Intrinsics.d(this.text, button.text);
        }

        @NotNull
        public final AtomActionDTO getAction() {
            return this.action;
        }

        @NotNull
        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            return this.text.hashCode() + (this.action.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "Button(action=" + this.action + ", text=" + this.text + ")";
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/comment/data/CommentModels$Input;", "", "hint", "", "text", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getHint", "()Ljava/lang/String;", "getText", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Input {
        public static final int $stable = 0;

        @NotNull
        private final String hint;
        private final String text;

        public Input(@NotNull String hint, String str) {
            Intrinsics.checkNotNullParameter(hint, "hint");
            this.hint = hint;
            this.text = str;
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

        /* renamed from: component2, reason: from getter */
        public final String getText() {
            return this.text;
        }

        @NotNull
        public final Input copy(@NotNull String hint, String text) {
            Intrinsics.checkNotNullParameter(hint, "hint");
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

        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            int hashCode = this.hint.hashCode() * 31;
            String str = this.text;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        @NotNull
        public String toString() {
            return e.a("Input(hint=", this.hint, ", text=", this.text, ")");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CommentModels(@NotNull List<? extends AtomDTO> info, @NotNull Input input, @NotNull Button button) {
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(button, "button");
        this.info = info;
        this.input = input;
        this.button = button;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CommentModels copy$default(CommentModels commentModels, List list, Input input, Button button, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = commentModels.info;
        }
        if ((i11 & 2) != 0) {
            input = commentModels.input;
        }
        if ((i11 & 4) != 0) {
            button = commentModels.button;
        }
        return commentModels.copy(list, input, button);
    }

    @NotNull
    public final List<AtomDTO> component1() {
        return this.info;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final Input getInput() {
        return this.input;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final Button getButton() {
        return this.button;
    }

    @NotNull
    public final CommentModels copy(@NotNull List<? extends AtomDTO> info, @NotNull Input input, @NotNull Button button) {
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(button, "button");
        return new CommentModels(info, input, button);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommentModels)) {
            return false;
        }
        CommentModels commentModels = (CommentModels) other;
        return Intrinsics.d(this.info, commentModels.info) && Intrinsics.d(this.input, commentModels.input) && Intrinsics.d(this.button, commentModels.button);
    }

    @NotNull
    public final Button getButton() {
        return this.button;
    }

    @NotNull
    public final List<AtomDTO> getInfo() {
        return this.info;
    }

    @NotNull
    public final Input getInput() {
        return this.input;
    }

    public int hashCode() {
        return this.button.hashCode() + ((this.input.hashCode() + (this.info.hashCode() * 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "CommentModels(info=" + this.info + ", input=" + this.input + ", button=" + this.button + ")";
    }
}
