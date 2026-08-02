package ru.ozon.app.android.fresh.checkout.widgets.inputForm.data;

import B3.p;
import De.C2859b;
import Ef0.c;
import GR.b;
import Lh.a;
import N3.C3660k;
import T7.P;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.data.HammersV3BodyDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001:\u0002&'BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0017\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000bHÆ\u0003JM\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000bHÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001f\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006("}, d2 = {"Lru/ozon/app/android/fresh/checkout/widgets/inputForm/data/InputFormDTO;", "", SelectionItemFormDTO.TEXT_AREA_FIELD_NAME, "Lru/ozon/app/android/fresh/checkout/widgets/inputForm/data/InputFormDTO$TextArea;", "button", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "spacers", "Lru/ozon/app/android/fresh/checkout/widgets/inputForm/data/InputFormDTO$Spacers;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/app/android/fresh/checkout/widgets/inputForm/data/InputFormDTO$TextArea;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/fresh/checkout/widgets/inputForm/data/InputFormDTO$Spacers;Ljava/util/Map;)V", "getTextArea", "()Lru/ozon/app/android/fresh/checkout/widgets/inputForm/data/InputFormDTO$TextArea;", "getButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSpacers", "()Lru/ozon/app/android/fresh/checkout/widgets/inputForm/data/InputFormDTO$Spacers;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "TextArea", "Spacers", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class InputFormDTO {
    public static final int $stable = 8;

    @NotNull
    private final ButtonV3DTO button;
    private final Spacers spacers;

    @NotNull
    private final TextArea textArea;
    private final TextDTO title;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003JQ\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006 "}, d2 = {"Lru/ozon/app/android/fresh/checkout/widgets/inputForm/data/InputFormDTO$Spacers;", "", "bottom", "Lru/ozon/uni/atoms/data/common/Paddings;", "left", "right", "topTitle", "topButton", "topTextArea", "<init>", "(Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;)V", "getBottom", "()Lru/ozon/uni/atoms/data/common/Paddings;", "getLeft", "getRight", "getTopTitle", "getTopButton", "getTopTextArea", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Spacers {
        public static final int $stable = 0;
        private final Paddings bottom;
        private final Paddings left;
        private final Paddings right;
        private final Paddings topButton;
        private final Paddings topTextArea;
        private final Paddings topTitle;

        public Spacers(Paddings paddings, Paddings paddings2, Paddings paddings3, Paddings paddings4, Paddings paddings5, Paddings paddings6) {
            this.bottom = paddings;
            this.left = paddings2;
            this.right = paddings3;
            this.topTitle = paddings4;
            this.topButton = paddings5;
            this.topTextArea = paddings6;
        }

        public static /* synthetic */ Spacers copy$default(Spacers spacers, Paddings paddings, Paddings paddings2, Paddings paddings3, Paddings paddings4, Paddings paddings5, Paddings paddings6, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                paddings = spacers.bottom;
            }
            if ((i11 & 2) != 0) {
                paddings2 = spacers.left;
            }
            if ((i11 & 4) != 0) {
                paddings3 = spacers.right;
            }
            if ((i11 & 8) != 0) {
                paddings4 = spacers.topTitle;
            }
            if ((i11 & 16) != 0) {
                paddings5 = spacers.topButton;
            }
            if ((i11 & 32) != 0) {
                paddings6 = spacers.topTextArea;
            }
            Paddings paddings7 = paddings5;
            Paddings paddings8 = paddings6;
            return spacers.copy(paddings, paddings2, paddings3, paddings4, paddings7, paddings8);
        }

        /* renamed from: component1, reason: from getter */
        public final Paddings getBottom() {
            return this.bottom;
        }

        /* renamed from: component2, reason: from getter */
        public final Paddings getLeft() {
            return this.left;
        }

        /* renamed from: component3, reason: from getter */
        public final Paddings getRight() {
            return this.right;
        }

        /* renamed from: component4, reason: from getter */
        public final Paddings getTopTitle() {
            return this.topTitle;
        }

        /* renamed from: component5, reason: from getter */
        public final Paddings getTopButton() {
            return this.topButton;
        }

        /* renamed from: component6, reason: from getter */
        public final Paddings getTopTextArea() {
            return this.topTextArea;
        }

        @NotNull
        public final Spacers copy(Paddings bottom, Paddings left, Paddings right, Paddings topTitle, Paddings topButton, Paddings topTextArea) {
            return new Spacers(bottom, left, right, topTitle, topButton, topTextArea);
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

        public final Paddings getBottom() {
            return this.bottom;
        }

        public final Paddings getLeft() {
            return this.left;
        }

        public final Paddings getRight() {
            return this.right;
        }

        public final Paddings getTopButton() {
            return this.topButton;
        }

        public final Paddings getTopTextArea() {
            return this.topTextArea;
        }

        public final Paddings getTopTitle() {
            return this.topTitle;
        }

        public int hashCode() {
            Paddings paddings = this.bottom;
            int hashCode = (paddings == null ? 0 : paddings.hashCode()) * 31;
            Paddings paddings2 = this.left;
            int hashCode2 = (hashCode + (paddings2 == null ? 0 : paddings2.hashCode())) * 31;
            Paddings paddings3 = this.right;
            int hashCode3 = (hashCode2 + (paddings3 == null ? 0 : paddings3.hashCode())) * 31;
            Paddings paddings4 = this.topTitle;
            int hashCode4 = (hashCode3 + (paddings4 == null ? 0 : paddings4.hashCode())) * 31;
            Paddings paddings5 = this.topButton;
            int hashCode5 = (hashCode4 + (paddings5 == null ? 0 : paddings5.hashCode())) * 31;
            Paddings paddings6 = this.topTextArea;
            return hashCode5 + (paddings6 != null ? paddings6.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            Paddings paddings = this.bottom;
            Paddings paddings2 = this.left;
            Paddings paddings3 = this.right;
            Paddings paddings4 = this.topTitle;
            Paddings paddings5 = this.topButton;
            Paddings paddings6 = this.topTextArea;
            StringBuilder b11 = p.b("Spacers(bottom=", paddings, ", left=", paddings2, ", right=");
            a.e(b11, paddings3, ", topTitle=", paddings4, ", topButton=");
            return b.e(b11, paddings5, ", topTextArea=", paddings6, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000fJH\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0011\u0010\u000fR\u0015\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0012\u0010\u000f¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/fresh/checkout/widgets/inputForm/data/InputFormDTO$TextArea;", "", HammersV3BodyDTO.PLACEHOLDER, "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "maxInputLength", "", "minRows", "maxRows", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getPlaceholder", "()Ljava/lang/String;", "getValue", "getMaxInputLength", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMinRows", "getMaxRows", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lru/ozon/app/android/fresh/checkout/widgets/inputForm/data/InputFormDTO$TextArea;", "equals", "", "other", "hashCode", "toString", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TextArea {
        public static final int $stable = 0;
        private final Integer maxInputLength;
        private final Integer maxRows;
        private final Integer minRows;

        @NotNull
        private final String placeholder;
        private final String value;

        public TextArea(@NotNull String placeholder, String str, Integer num, Integer num2, Integer num3) {
            Intrinsics.checkNotNullParameter(placeholder, "placeholder");
            this.placeholder = placeholder;
            this.value = str;
            this.maxInputLength = num;
            this.minRows = num2;
            this.maxRows = num3;
        }

        public static /* synthetic */ TextArea copy$default(TextArea textArea, String str, String str2, Integer num, Integer num2, Integer num3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = textArea.placeholder;
            }
            if ((i11 & 2) != 0) {
                str2 = textArea.value;
            }
            if ((i11 & 4) != 0) {
                num = textArea.maxInputLength;
            }
            if ((i11 & 8) != 0) {
                num2 = textArea.minRows;
            }
            if ((i11 & 16) != 0) {
                num3 = textArea.maxRows;
            }
            Integer num4 = num3;
            Integer num5 = num;
            return textArea.copy(str, str2, num5, num2, num4);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getPlaceholder() {
            return this.placeholder;
        }

        /* renamed from: component2, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        /* renamed from: component3, reason: from getter */
        public final Integer getMaxInputLength() {
            return this.maxInputLength;
        }

        /* renamed from: component4, reason: from getter */
        public final Integer getMinRows() {
            return this.minRows;
        }

        /* renamed from: component5, reason: from getter */
        public final Integer getMaxRows() {
            return this.maxRows;
        }

        @NotNull
        public final TextArea copy(@NotNull String placeholder, String value, Integer maxInputLength, Integer minRows, Integer maxRows) {
            Intrinsics.checkNotNullParameter(placeholder, "placeholder");
            return new TextArea(placeholder, value, maxInputLength, minRows, maxRows);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TextArea)) {
                return false;
            }
            TextArea textArea = (TextArea) other;
            return Intrinsics.d(this.placeholder, textArea.placeholder) && Intrinsics.d(this.value, textArea.value) && Intrinsics.d(this.maxInputLength, textArea.maxInputLength) && Intrinsics.d(this.minRows, textArea.minRows) && Intrinsics.d(this.maxRows, textArea.maxRows);
        }

        public final Integer getMaxInputLength() {
            return this.maxInputLength;
        }

        public final Integer getMaxRows() {
            return this.maxRows;
        }

        public final Integer getMinRows() {
            return this.minRows;
        }

        @NotNull
        public final String getPlaceholder() {
            return this.placeholder;
        }

        public final String getValue() {
            return this.value;
        }

        public int hashCode() {
            int hashCode = this.placeholder.hashCode() * 31;
            String str = this.value;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            Integer num = this.maxInputLength;
            int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.minRows;
            int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
            Integer num3 = this.maxRows;
            return hashCode4 + (num3 != null ? num3.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.placeholder;
            String str2 = this.value;
            Integer num = this.maxInputLength;
            Integer num2 = this.minRows;
            Integer num3 = this.maxRows;
            StringBuilder d11 = C3660k.d("TextArea(placeholder=", str, ", value=", str2, ", maxInputLength=");
            c.e(d11, num, ", minRows=", num2, ", maxRows=");
            return Ep.a.c(d11, num3, ")");
        }
    }

    public InputFormDTO(@NotNull TextArea textArea, @NotNull ButtonV3DTO button, TextDTO textDTO, Spacers spacers, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(textArea, "textArea");
        Intrinsics.checkNotNullParameter(button, "button");
        this.textArea = textArea;
        this.button = button;
        this.title = textDTO;
        this.spacers = spacers;
        this.trackingInfo = map;
    }

    public static /* synthetic */ InputFormDTO copy$default(InputFormDTO inputFormDTO, TextArea textArea, ButtonV3DTO buttonV3DTO, TextDTO textDTO, Spacers spacers, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textArea = inputFormDTO.textArea;
        }
        if ((i11 & 2) != 0) {
            buttonV3DTO = inputFormDTO.button;
        }
        if ((i11 & 4) != 0) {
            textDTO = inputFormDTO.title;
        }
        if ((i11 & 8) != 0) {
            spacers = inputFormDTO.spacers;
        }
        if ((i11 & 16) != 0) {
            map = inputFormDTO.trackingInfo;
        }
        Map map2 = map;
        TextDTO textDTO2 = textDTO;
        return inputFormDTO.copy(textArea, buttonV3DTO, textDTO2, spacers, map2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextArea getTextArea() {
        return this.textArea;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final ButtonV3DTO getButton() {
        return this.button;
    }

    /* renamed from: component3, reason: from getter */
    public final TextDTO getTitle() {
        return this.title;
    }

    /* renamed from: component4, reason: from getter */
    public final Spacers getSpacers() {
        return this.spacers;
    }

    public final Map<String, TokenizedTrackingInfo> component5() {
        return this.trackingInfo;
    }

    @NotNull
    public final InputFormDTO copy(@NotNull TextArea textArea, @NotNull ButtonV3DTO button, TextDTO title, Spacers spacers, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(textArea, "textArea");
        Intrinsics.checkNotNullParameter(button, "button");
        return new InputFormDTO(textArea, button, title, spacers, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InputFormDTO)) {
            return false;
        }
        InputFormDTO inputFormDTO = (InputFormDTO) other;
        return Intrinsics.d(this.textArea, inputFormDTO.textArea) && Intrinsics.d(this.button, inputFormDTO.button) && Intrinsics.d(this.title, inputFormDTO.title) && Intrinsics.d(this.spacers, inputFormDTO.spacers) && Intrinsics.d(this.trackingInfo, inputFormDTO.trackingInfo);
    }

    @NotNull
    public final ButtonV3DTO getButton() {
        return this.button;
    }

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

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int c11 = C2859b.c(this.button, this.textArea.hashCode() * 31, 31);
        TextDTO textDTO = this.title;
        int hashCode = (c11 + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
        Spacers spacers = this.spacers;
        int hashCode2 = (hashCode + (spacers == null ? 0 : spacers.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode2 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        TextArea textArea = this.textArea;
        ButtonV3DTO buttonV3DTO = this.button;
        TextDTO textDTO = this.title;
        Spacers spacers = this.spacers;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder sb2 = new StringBuilder("InputFormDTO(textArea=");
        sb2.append(textArea);
        sb2.append(", button=");
        sb2.append(buttonV3DTO);
        sb2.append(", title=");
        sb2.append(textDTO);
        sb2.append(", spacers=");
        sb2.append(spacers);
        sb2.append(", trackingInfo=");
        return P.f(sb2, map, ")");
    }
}
