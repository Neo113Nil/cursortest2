package ru.ozon.app.android.fresh.checkout.widgets.inputForm.presentation;

import Am.C2438a;
import B0.C2454a;
import De.C2859b;
import Ek.a;
import G.g;
import J0.P;
import N3.C3660k;
import Pk0.i;
import WZ.t;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.data.HammersV3BodyDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.android.textArea.TextAreaView;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u000201B;\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010JP\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010*\u001a\u0004\b+\u0010,R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010-\u001a\u0004\b.\u0010/¨\u00062"}, d2 = {"Lru/ozon/app/android/fresh/checkout/widgets/inputForm/presentation/InputFormVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/app/android/fresh/checkout/widgets/inputForm/presentation/InputFormVO$TextArea;", SelectionItemFormDTO.TEXT_AREA_FIELD_NAME, "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "button", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/app/android/fresh/checkout/widgets/inputForm/presentation/InputFormVO$Spacers;", "spacers", "LWZ/t;", "tokenizedEvent", "<init>", "(JLru/ozon/app/android/fresh/checkout/widgets/inputForm/presentation/InputFormVO$TextArea;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/fresh/checkout/widgets/inputForm/presentation/InputFormVO$Spacers;LWZ/t;)V", "copy", "(JLru/ozon/app/android/fresh/checkout/widgets/inputForm/presentation/InputFormVO$TextArea;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/fresh/checkout/widgets/inputForm/presentation/InputFormVO$Spacers;LWZ/t;)Lru/ozon/app/android/fresh/checkout/widgets/inputForm/presentation/InputFormVO;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/fresh/checkout/widgets/inputForm/presentation/InputFormVO$TextArea;", "getTextArea", "()Lru/ozon/app/android/fresh/checkout/widgets/inputForm/presentation/InputFormVO$TextArea;", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/app/android/fresh/checkout/widgets/inputForm/presentation/InputFormVO$Spacers;", "getSpacers", "()Lru/ozon/app/android/fresh/checkout/widgets/inputForm/presentation/InputFormVO$Spacers;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "TextArea", "Spacers", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class InputFormVO implements c {

    @NotNull
    private final ButtonV3DTO button;
    private final long id;

    @NotNull
    private final Spacers spacers;

    @NotNull
    private final TextArea textArea;
    private final TextDTO title;
    private final t tokenizedEvent;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0016\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0017\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0018\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0019\u0010\u000fR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u001a\u0010\u000f¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/fresh/checkout/widgets/inputForm/presentation/InputFormVO$Spacers;", "", "", "bottom", "left", "right", "topTitle", "topButton", "topTextArea", "<init>", "(IIIIII)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getBottom", "getLeft", "getRight", "getTopTitle", "getTopButton", "getTopTextArea", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Spacers {
        private final int bottom;
        private final int left;
        private final int right;
        private final int topButton;
        private final int topTextArea;
        private final int topTitle;

        public Spacers(int i11, int i12, int i13, int i14, int i15, int i16) {
            this.bottom = i11;
            this.left = i12;
            this.right = i13;
            this.topTitle = i14;
            this.topButton = i15;
            this.topTextArea = i16;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Spacers)) {
                return false;
            }
            Spacers spacers = (Spacers) other;
            return this.bottom == spacers.bottom && this.left == spacers.left && this.right == spacers.right && this.topTitle == spacers.topTitle && this.topButton == spacers.topButton && this.topTextArea == spacers.topTextArea;
        }

        public final int getBottom() {
            return this.bottom;
        }

        public final int getLeft() {
            return this.left;
        }

        public final int getRight() {
            return this.right;
        }

        public final int getTopButton() {
            return this.topButton;
        }

        public final int getTopTextArea() {
            return this.topTextArea;
        }

        public final int getTopTitle() {
            return this.topTitle;
        }

        public int hashCode() {
            return Integer.hashCode(this.topTextArea) + C2454a.a(this.topButton, C2454a.a(this.topTitle, C2454a.a(this.right, C2454a.a(this.left, Integer.hashCode(this.bottom) * 31, 31), 31), 31), 31);
        }

        @NotNull
        public String toString() {
            int i11 = this.bottom;
            int i12 = this.left;
            int i13 = this.right;
            int i14 = this.topTitle;
            int i15 = this.topButton;
            int i16 = this.topTextArea;
            StringBuilder a11 = C2438a.a("Spacers(bottom=", i11, ", left=", ", right=", i12);
            a.f(i13, i14, ", topTitle=", ", topButton=", a11);
            return P.a(i15, i16, ", topTextArea=", ")", a11);
        }
    }

    public InputFormVO(long j11, @NotNull TextArea textArea, @NotNull ButtonV3DTO button, TextDTO textDTO, @NotNull Spacers spacers, t tVar) {
        Intrinsics.checkNotNullParameter(textArea, "textArea");
        Intrinsics.checkNotNullParameter(button, "button");
        Intrinsics.checkNotNullParameter(spacers, "spacers");
        this.id = j11;
        this.textArea = textArea;
        this.button = button;
        this.title = textDTO;
        this.spacers = spacers;
        this.tokenizedEvent = tVar;
    }

    public static /* synthetic */ InputFormVO copy$default(InputFormVO inputFormVO, long j11, TextArea textArea, ButtonV3DTO buttonV3DTO, TextDTO textDTO, Spacers spacers, t tVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = inputFormVO.id;
        }
        long j12 = j11;
        if ((i11 & 2) != 0) {
            textArea = inputFormVO.textArea;
        }
        TextArea textArea2 = textArea;
        if ((i11 & 4) != 0) {
            buttonV3DTO = inputFormVO.button;
        }
        ButtonV3DTO buttonV3DTO2 = buttonV3DTO;
        if ((i11 & 8) != 0) {
            textDTO = inputFormVO.title;
        }
        TextDTO textDTO2 = textDTO;
        if ((i11 & 16) != 0) {
            spacers = inputFormVO.spacers;
        }
        Spacers spacers2 = spacers;
        if ((i11 & 32) != 0) {
            tVar = inputFormVO.tokenizedEvent;
        }
        return inputFormVO.copy(j12, textArea2, buttonV3DTO2, textDTO2, spacers2, tVar);
    }

    @NotNull
    public final InputFormVO copy(long id2, @NotNull TextArea textArea, @NotNull ButtonV3DTO button, TextDTO title, @NotNull Spacers spacers, t tokenizedEvent) {
        Intrinsics.checkNotNullParameter(textArea, "textArea");
        Intrinsics.checkNotNullParameter(button, "button");
        Intrinsics.checkNotNullParameter(spacers, "spacers");
        return new InputFormVO(id2, textArea, button, title, spacers, tokenizedEvent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InputFormVO)) {
            return false;
        }
        InputFormVO inputFormVO = (InputFormVO) other;
        return this.id == inputFormVO.id && Intrinsics.d(this.textArea, inputFormVO.textArea) && Intrinsics.d(this.button, inputFormVO.button) && Intrinsics.d(this.title, inputFormVO.title) && Intrinsics.d(this.spacers, inputFormVO.spacers) && Intrinsics.d(this.tokenizedEvent, inputFormVO.tokenizedEvent);
    }

    @NotNull
    public final ButtonV3DTO getButton() {
        return this.button;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final Spacers getSpacers() {
        return this.spacers;
    }

    @NotNull
    public final TextArea getTextArea() {
        return this.textArea;
    }

    public final TextDTO getTitle() {
        return this.title;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int c11 = C2859b.c(this.button, (this.textArea.hashCode() + (Long.hashCode(this.id) * 31)) * 31, 31);
        TextDTO textDTO = this.title;
        int hashCode = (this.spacers.hashCode() + ((c11 + (textDTO == null ? 0 : textDTO.hashCode())) * 31)) * 31;
        t tVar = this.tokenizedEvent;
        return hashCode + (tVar != null ? tVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "InputFormVO(id=" + this.id + ", textArea=" + this.textArea + ", button=" + this.button + ", title=" + this.title + ", spacers=" + this.spacers + ", tokenizedEvent=" + this.tokenizedEvent + ")";
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJV\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001a\u0010\u0011R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\u0013R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001d\u0010\u0013R\u0017\u0010\b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b\u001e\u0010\u0013R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0018\u001a\u0004\b\u001f\u0010\u0011R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010 \u001a\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lru/ozon/app/android/fresh/checkout/widgets/inputForm/presentation/InputFormVO$TextArea;", "", "", HammersV3BodyDTO.PLACEHOLDER, AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "maxInputLength", "minRows", "maxRows", "caption", "Lru/ozon/uni/android/textArea/TextAreaView$Status;", "status", "<init>", "(Ljava/lang/String;Ljava/lang/String;IIILjava/lang/String;Lru/ozon/uni/android/textArea/TextAreaView$Status;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;IIILjava/lang/String;Lru/ozon/uni/android/textArea/TextAreaView$Status;)Lru/ozon/app/android/fresh/checkout/widgets/inputForm/presentation/InputFormVO$TextArea;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPlaceholder", "getValue", "I", "getMaxInputLength", "getMinRows", "getMaxRows", "getCaption", "Lru/ozon/uni/android/textArea/TextAreaView$Status;", "getStatus", "()Lru/ozon/uni/android/textArea/TextAreaView$Status;", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TextArea {

        @NotNull
        private final String caption;
        private final int maxInputLength;
        private final int maxRows;
        private final int minRows;

        @NotNull
        private final String placeholder;

        @NotNull
        private final TextAreaView.Status status;

        @NotNull
        private final String value;

        public TextArea(@NotNull String placeholder, @NotNull String value, int i11, int i12, int i13, @NotNull String caption, @NotNull TextAreaView.Status status) {
            Intrinsics.checkNotNullParameter(placeholder, "placeholder");
            Intrinsics.checkNotNullParameter(value, "value");
            Intrinsics.checkNotNullParameter(caption, "caption");
            Intrinsics.checkNotNullParameter(status, "status");
            this.placeholder = placeholder;
            this.value = value;
            this.maxInputLength = i11;
            this.minRows = i12;
            this.maxRows = i13;
            this.caption = caption;
            this.status = status;
        }

        public static /* synthetic */ TextArea copy$default(TextArea textArea, String str, String str2, int i11, int i12, int i13, String str3, TextAreaView.Status status, int i14, Object obj) {
            if ((i14 & 1) != 0) {
                str = textArea.placeholder;
            }
            if ((i14 & 2) != 0) {
                str2 = textArea.value;
            }
            if ((i14 & 4) != 0) {
                i11 = textArea.maxInputLength;
            }
            if ((i14 & 8) != 0) {
                i12 = textArea.minRows;
            }
            if ((i14 & 16) != 0) {
                i13 = textArea.maxRows;
            }
            if ((i14 & 32) != 0) {
                str3 = textArea.caption;
            }
            if ((i14 & 64) != 0) {
                status = textArea.status;
            }
            String str4 = str3;
            TextAreaView.Status status2 = status;
            int i15 = i13;
            int i16 = i11;
            return textArea.copy(str, str2, i16, i12, i15, str4, status2);
        }

        @NotNull
        public final TextArea copy(@NotNull String placeholder, @NotNull String value, int maxInputLength, int minRows, int maxRows, @NotNull String caption, @NotNull TextAreaView.Status status) {
            Intrinsics.checkNotNullParameter(placeholder, "placeholder");
            Intrinsics.checkNotNullParameter(value, "value");
            Intrinsics.checkNotNullParameter(caption, "caption");
            Intrinsics.checkNotNullParameter(status, "status");
            return new TextArea(placeholder, value, maxInputLength, minRows, maxRows, caption, status);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TextArea)) {
                return false;
            }
            TextArea textArea = (TextArea) other;
            return Intrinsics.d(this.placeholder, textArea.placeholder) && Intrinsics.d(this.value, textArea.value) && this.maxInputLength == textArea.maxInputLength && this.minRows == textArea.minRows && this.maxRows == textArea.maxRows && Intrinsics.d(this.caption, textArea.caption) && this.status == textArea.status;
        }

        @NotNull
        public final String getCaption() {
            return this.caption;
        }

        public final int getMaxInputLength() {
            return this.maxInputLength;
        }

        public final int getMaxRows() {
            return this.maxRows;
        }

        public final int getMinRows() {
            return this.minRows;
        }

        @NotNull
        public final String getPlaceholder() {
            return this.placeholder;
        }

        @NotNull
        public final TextAreaView.Status getStatus() {
            return this.status;
        }

        @NotNull
        public final String getValue() {
            return this.value;
        }

        public int hashCode() {
            return this.status.hashCode() + g.a(C2454a.a(this.maxRows, C2454a.a(this.minRows, C2454a.a(this.maxInputLength, g.a(this.placeholder.hashCode() * 31, 31, this.value), 31), 31), 31), 31, this.caption);
        }

        @NotNull
        public String toString() {
            String str = this.placeholder;
            String str2 = this.value;
            int i11 = this.maxInputLength;
            int i12 = this.minRows;
            int i13 = this.maxRows;
            String str3 = this.caption;
            TextAreaView.Status status = this.status;
            StringBuilder d11 = C3660k.d("TextArea(placeholder=", str, ", value=", str2, ", maxInputLength=");
            a.f(i11, i12, ", minRows=", ", maxRows=", d11);
            i.c(i13, ", caption=", str3, ", status=", d11);
            d11.append(status);
            d11.append(")");
            return d11.toString();
        }

        public /* synthetic */ TextArea(String str, String str2, int i11, int i12, int i13, String str3, TextAreaView.Status status, int i14, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, i11, i12, i13, (i14 & 32) != 0 ? "" : str3, (i14 & 64) != 0 ? TextAreaView.Status.NEUTRAL : status);
        }
    }
}
