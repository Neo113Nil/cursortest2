package ru.ozon.app.android.marketing.widgets.wannaDiscountV2.data;

import Ak.C2436a;
import B90.C2619v;
import Bl.b;
import E0.C2942q;
import G.g;
import HY.a;
import I0.C3173b;
import J0.C3349u1;
import N3.C3660k;
import Pk0.c;
import V.e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.atoms.data.cells.CellAtom;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.data.HammersV3BodyDTO;
import ru.ozon.app.android.session.deleteAccount.data.DeleteAccountApiResponse;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.price.Price;
import ru.ozon.uni.atoms.data.tag.TagV3Atom;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0081\b\u0018\u00002\u00020\u0001:\u0004>?@ABm\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0015¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0006HÆ\u0003J\t\u00100\u001a\u00020\bHÆ\u0003J\t\u00101\u001a\u00020\nHÆ\u0003J\u000f\u00102\u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\t\u00104\u001a\u00020\u0011HÆ\u0003J\t\u00105\u001a\u00020\u0013HÆ\u0003J\u0017\u00106\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0015HÆ\u0003J\u0083\u0001\u00107\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\u0016\b\u0002\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0015HÆ\u0001J\u0013\u00108\u001a\u0002092\b\u0010:\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010;\u001a\u00020<HÖ\u0001J\t\u0010=\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u001f\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,¨\u0006B"}, d2 = {"Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/data/WannaDiscountV2DTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "subtitle", "infoButton", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "sendButton", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "priceBlock", "Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/data/WannaDiscountV2DTO$PriceBlock;", "discounts", "", "Lru/ozon/uni/atoms/data/tag/TagV3Atom$TagAtom;", "seller", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitle40Icon;", "priceInput", "Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/data/WannaDiscountV2DTO$PriceInputBlock;", "quantityInput", "Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/data/WannaDiscountV2DTO$QuantityInputBlock;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/data/WannaDiscountV2DTO$PriceBlock;Ljava/util/List;Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitle40Icon;Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/data/WannaDiscountV2DTO$PriceInputBlock;Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/data/WannaDiscountV2DTO$QuantityInputBlock;Ljava/util/Map;)V", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getSubtitle", "getInfoButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "getSendButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "getPriceBlock", "()Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/data/WannaDiscountV2DTO$PriceBlock;", "getDiscounts", "()Ljava/util/List;", "getSeller", "()Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitle40Icon;", "getPriceInput", "()Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/data/WannaDiscountV2DTO$PriceInputBlock;", "getQuantityInput", "()Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/data/WannaDiscountV2DTO$QuantityInputBlock;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "", "other", "hashCode", "", "toString", "InputBlock", "PriceInputBlock", "QuantityInputBlock", "PriceBlock", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class WannaDiscountV2DTO {
    public static final int $stable = 8;

    @NotNull
    private final List<TagV3Atom.TagAtom> discounts;

    @NotNull
    private final ButtonV3Atom.SmallIconButton infoButton;

    @NotNull
    private final PriceBlock priceBlock;

    @NotNull
    private final PriceInputBlock priceInput;

    @NotNull
    private final QuantityInputBlock quantityInput;
    private final CellAtom.CellAtomWithSubtitle.CellWithSubtitle40Icon seller;

    @NotNull
    private final ButtonV3Atom.LargeButton sendButton;

    @NotNull
    private final TextAtom subtitle;

    @NotNull
    private final TextAtom title;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001aB#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003J+\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\n\"\u0004\b\f\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/data/WannaDiscountV2DTO$InputBlock;", "", HammersV3BodyDTO.PLACEHOLDER, "", AppMeasurementSdk.ConditionalUserProperty.VALUE, DeleteAccountApiResponse.Error.TYPE_VALIDATION, "Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/data/WannaDiscountV2DTO$InputBlock$ValidationInfo;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/data/WannaDiscountV2DTO$InputBlock$ValidationInfo;)V", "getPlaceholder", "()Ljava/lang/String;", "getValue", "setValue", "(Ljava/lang/String;)V", "getValidation", "()Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/data/WannaDiscountV2DTO$InputBlock$ValidationInfo;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "ValidationInfo", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class InputBlock {
        public static final int $stable = 8;

        @NotNull
        private final String placeholder;
        private final ValidationInfo validation;
        private String value;

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/data/WannaDiscountV2DTO$InputBlock$ValidationInfo;", "", "maxLength", "", "errorText", "", "<init>", "(JLjava/lang/String;)V", "getMaxLength", "()J", "getErrorText", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ValidationInfo {
            public static final int $stable = 0;

            @NotNull
            private final String errorText;
            private final long maxLength;

            public ValidationInfo(long j11, @NotNull String errorText) {
                Intrinsics.checkNotNullParameter(errorText, "errorText");
                this.maxLength = j11;
                this.errorText = errorText;
            }

            public static /* synthetic */ ValidationInfo copy$default(ValidationInfo validationInfo, long j11, String str, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    j11 = validationInfo.maxLength;
                }
                if ((i11 & 2) != 0) {
                    str = validationInfo.errorText;
                }
                return validationInfo.copy(j11, str);
            }

            /* renamed from: component1, reason: from getter */
            public final long getMaxLength() {
                return this.maxLength;
            }

            @NotNull
            /* renamed from: component2, reason: from getter */
            public final String getErrorText() {
                return this.errorText;
            }

            @NotNull
            public final ValidationInfo copy(long maxLength, @NotNull String errorText) {
                Intrinsics.checkNotNullParameter(errorText, "errorText");
                return new ValidationInfo(maxLength, errorText);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ValidationInfo)) {
                    return false;
                }
                ValidationInfo validationInfo = (ValidationInfo) other;
                return this.maxLength == validationInfo.maxLength && Intrinsics.d(this.errorText, validationInfo.errorText);
            }

            @NotNull
            public final String getErrorText() {
                return this.errorText;
            }

            public final long getMaxLength() {
                return this.maxLength;
            }

            public int hashCode() {
                return this.errorText.hashCode() + (Long.hashCode(this.maxLength) * 31);
            }

            @NotNull
            public String toString() {
                StringBuilder c11 = C2436a.c(this.maxLength, "ValidationInfo(maxLength=", ", errorText=", this.errorText);
                c11.append(")");
                return c11.toString();
            }
        }

        public InputBlock(@NotNull String placeholder, String str, ValidationInfo validationInfo) {
            Intrinsics.checkNotNullParameter(placeholder, "placeholder");
            this.placeholder = placeholder;
            this.value = str;
            this.validation = validationInfo;
        }

        public static /* synthetic */ InputBlock copy$default(InputBlock inputBlock, String str, String str2, ValidationInfo validationInfo, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = inputBlock.placeholder;
            }
            if ((i11 & 2) != 0) {
                str2 = inputBlock.value;
            }
            if ((i11 & 4) != 0) {
                validationInfo = inputBlock.validation;
            }
            return inputBlock.copy(str, str2, validationInfo);
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
        public final ValidationInfo getValidation() {
            return this.validation;
        }

        @NotNull
        public final InputBlock copy(@NotNull String placeholder, String value, ValidationInfo validation) {
            Intrinsics.checkNotNullParameter(placeholder, "placeholder");
            return new InputBlock(placeholder, value, validation);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InputBlock)) {
                return false;
            }
            InputBlock inputBlock = (InputBlock) other;
            return Intrinsics.d(this.placeholder, inputBlock.placeholder) && Intrinsics.d(this.value, inputBlock.value) && Intrinsics.d(this.validation, inputBlock.validation);
        }

        @NotNull
        public final String getPlaceholder() {
            return this.placeholder;
        }

        public final ValidationInfo getValidation() {
            return this.validation;
        }

        public final String getValue() {
            return this.value;
        }

        public int hashCode() {
            int hashCode = this.placeholder.hashCode() * 31;
            String str = this.value;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            ValidationInfo validationInfo = this.validation;
            return hashCode2 + (validationInfo != null ? validationInfo.hashCode() : 0);
        }

        public final void setValue(String str) {
            this.value = str;
        }

        @NotNull
        public String toString() {
            String str = this.placeholder;
            String str2 = this.value;
            ValidationInfo validationInfo = this.validation;
            StringBuilder d11 = C3660k.d("InputBlock(placeholder=", str, ", value=", str2, ", validation=");
            d11.append(validationInfo);
            d11.append(")");
            return d11.toString();
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/data/WannaDiscountV2DTO$PriceBlock;", "", "description", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "backgroundColor", "", "price", "Lru/ozon/uni/atoms/data/price/Price;", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/lang/String;Lru/ozon/uni/atoms/data/price/Price;)V", "getDescription", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getBackgroundColor", "()Ljava/lang/String;", "getPrice", "()Lru/ozon/uni/atoms/data/price/Price;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PriceBlock {
        public static final int $stable = Price.$stable | TextAtom.$stable;

        @NotNull
        private final String backgroundColor;

        @NotNull
        private final TextAtom description;

        @NotNull
        private final Price price;

        public PriceBlock(@NotNull TextAtom description, @NotNull String backgroundColor, @NotNull Price price) {
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
            Intrinsics.checkNotNullParameter(price, "price");
            this.description = description;
            this.backgroundColor = backgroundColor;
            this.price = price;
        }

        public static /* synthetic */ PriceBlock copy$default(PriceBlock priceBlock, TextAtom textAtom, String str, Price price, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textAtom = priceBlock.description;
            }
            if ((i11 & 2) != 0) {
                str = priceBlock.backgroundColor;
            }
            if ((i11 & 4) != 0) {
                price = priceBlock.price;
            }
            return priceBlock.copy(textAtom, str, price);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextAtom getDescription() {
            return this.description;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final Price getPrice() {
            return this.price;
        }

        @NotNull
        public final PriceBlock copy(@NotNull TextAtom description, @NotNull String backgroundColor, @NotNull Price price) {
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
            Intrinsics.checkNotNullParameter(price, "price");
            return new PriceBlock(description, backgroundColor, price);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PriceBlock)) {
                return false;
            }
            PriceBlock priceBlock = (PriceBlock) other;
            return Intrinsics.d(this.description, priceBlock.description) && Intrinsics.d(this.backgroundColor, priceBlock.backgroundColor) && Intrinsics.d(this.price, priceBlock.price);
        }

        @NotNull
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        @NotNull
        public final TextAtom getDescription() {
            return this.description;
        }

        @NotNull
        public final Price getPrice() {
            return this.price;
        }

        public int hashCode() {
            return this.price.hashCode() + g.a(this.description.hashCode() * 31, 31, this.backgroundColor);
        }

        @NotNull
        public String toString() {
            TextAtom textAtom = this.description;
            String str = this.backgroundColor;
            Price price = this.price;
            StringBuilder d11 = b.d("PriceBlock(description=", ", backgroundColor=", str, ", price=", textAtom);
            d11.append(price);
            d11.append(")");
            return d11.toString();
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001bB\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/data/WannaDiscountV2DTO$PriceInputBlock;", "", "input", "Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/data/WannaDiscountV2DTO$InputBlock;", "minPrice", "", "error", "Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/data/WannaDiscountV2DTO$PriceInputBlock$PriceError;", "<init>", "(Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/data/WannaDiscountV2DTO$InputBlock;DLru/ozon/app/android/marketing/widgets/wannaDiscountV2/data/WannaDiscountV2DTO$PriceInputBlock$PriceError;)V", "getInput", "()Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/data/WannaDiscountV2DTO$InputBlock;", "getMinPrice", "()D", "getError", "()Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/data/WannaDiscountV2DTO$PriceInputBlock$PriceError;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "PriceError", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class PriceInputBlock {
        public static final int $stable = 8;

        @NotNull
        private final PriceError error;

        @NotNull
        private final InputBlock input;
        private final double minPrice;

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/data/WannaDiscountV2DTO$PriceInputBlock$PriceError;", "", "require", "", "empty", "max", "maxDiscount", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getRequire", "()Ljava/lang/String;", "getEmpty", "getMax", "getMaxDiscount", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class PriceError {
            public static final int $stable = 0;

            @NotNull
            private final String empty;

            @NotNull
            private final String max;

            @NotNull
            private final String maxDiscount;

            @NotNull
            private final String require;

            public PriceError(@NotNull String require, @NotNull String empty, @NotNull String max, @NotNull String maxDiscount) {
                Intrinsics.checkNotNullParameter(require, "require");
                Intrinsics.checkNotNullParameter(empty, "empty");
                Intrinsics.checkNotNullParameter(max, "max");
                Intrinsics.checkNotNullParameter(maxDiscount, "maxDiscount");
                this.require = require;
                this.empty = empty;
                this.max = max;
                this.maxDiscount = maxDiscount;
            }

            public static /* synthetic */ PriceError copy$default(PriceError priceError, String str, String str2, String str3, String str4, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = priceError.require;
                }
                if ((i11 & 2) != 0) {
                    str2 = priceError.empty;
                }
                if ((i11 & 4) != 0) {
                    str3 = priceError.max;
                }
                if ((i11 & 8) != 0) {
                    str4 = priceError.maxDiscount;
                }
                return priceError.copy(str, str2, str3, str4);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final String getRequire() {
                return this.require;
            }

            @NotNull
            /* renamed from: component2, reason: from getter */
            public final String getEmpty() {
                return this.empty;
            }

            @NotNull
            /* renamed from: component3, reason: from getter */
            public final String getMax() {
                return this.max;
            }

            @NotNull
            /* renamed from: component4, reason: from getter */
            public final String getMaxDiscount() {
                return this.maxDiscount;
            }

            @NotNull
            public final PriceError copy(@NotNull String require, @NotNull String empty, @NotNull String max, @NotNull String maxDiscount) {
                Intrinsics.checkNotNullParameter(require, "require");
                Intrinsics.checkNotNullParameter(empty, "empty");
                Intrinsics.checkNotNullParameter(max, "max");
                Intrinsics.checkNotNullParameter(maxDiscount, "maxDiscount");
                return new PriceError(require, empty, max, maxDiscount);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof PriceError)) {
                    return false;
                }
                PriceError priceError = (PriceError) other;
                return Intrinsics.d(this.require, priceError.require) && Intrinsics.d(this.empty, priceError.empty) && Intrinsics.d(this.max, priceError.max) && Intrinsics.d(this.maxDiscount, priceError.maxDiscount);
            }

            @NotNull
            public final String getEmpty() {
                return this.empty;
            }

            @NotNull
            public final String getMax() {
                return this.max;
            }

            @NotNull
            public final String getMaxDiscount() {
                return this.maxDiscount;
            }

            @NotNull
            public final String getRequire() {
                return this.require;
            }

            public int hashCode() {
                return this.maxDiscount.hashCode() + g.a(g.a(this.require.hashCode() * 31, 31, this.empty), 31, this.max);
            }

            @NotNull
            public String toString() {
                String str = this.require;
                String str2 = this.empty;
                return C3173b.c(C3660k.d("PriceError(require=", str, ", empty=", str2, ", max="), this.max, ", maxDiscount=", this.maxDiscount, ")");
            }
        }

        public PriceInputBlock(@NotNull InputBlock input, double d11, @NotNull PriceError error) {
            Intrinsics.checkNotNullParameter(input, "input");
            Intrinsics.checkNotNullParameter(error, "error");
            this.input = input;
            this.minPrice = d11;
            this.error = error;
        }

        public static /* synthetic */ PriceInputBlock copy$default(PriceInputBlock priceInputBlock, InputBlock inputBlock, double d11, PriceError priceError, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                inputBlock = priceInputBlock.input;
            }
            if ((i11 & 2) != 0) {
                d11 = priceInputBlock.minPrice;
            }
            if ((i11 & 4) != 0) {
                priceError = priceInputBlock.error;
            }
            return priceInputBlock.copy(inputBlock, d11, priceError);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final InputBlock getInput() {
            return this.input;
        }

        /* renamed from: component2, reason: from getter */
        public final double getMinPrice() {
            return this.minPrice;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final PriceError getError() {
            return this.error;
        }

        @NotNull
        public final PriceInputBlock copy(@NotNull InputBlock input, double minPrice, @NotNull PriceError error) {
            Intrinsics.checkNotNullParameter(input, "input");
            Intrinsics.checkNotNullParameter(error, "error");
            return new PriceInputBlock(input, minPrice, error);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PriceInputBlock)) {
                return false;
            }
            PriceInputBlock priceInputBlock = (PriceInputBlock) other;
            return Intrinsics.d(this.input, priceInputBlock.input) && Double.compare(this.minPrice, priceInputBlock.minPrice) == 0 && Intrinsics.d(this.error, priceInputBlock.error);
        }

        @NotNull
        public final PriceError getError() {
            return this.error;
        }

        @NotNull
        public final InputBlock getInput() {
            return this.input;
        }

        public final double getMinPrice() {
            return this.minPrice;
        }

        public int hashCode() {
            return this.error.hashCode() + Pk0.g.a(this.input.hashCode() * 31, 31, this.minPrice);
        }

        @NotNull
        public String toString() {
            return "PriceInputBlock(input=" + this.input + ", minPrice=" + this.minPrice + ", error=" + this.error + ")";
        }
    }

    public WannaDiscountV2DTO(@NotNull TextAtom title, @NotNull TextAtom subtitle, @NotNull ButtonV3Atom.SmallIconButton infoButton, @NotNull ButtonV3Atom.LargeButton sendButton, @NotNull PriceBlock priceBlock, @NotNull List<TagV3Atom.TagAtom> discounts, CellAtom.CellAtomWithSubtitle.CellWithSubtitle40Icon cellWithSubtitle40Icon, @NotNull PriceInputBlock priceInput, @NotNull QuantityInputBlock quantityInput, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(infoButton, "infoButton");
        Intrinsics.checkNotNullParameter(sendButton, "sendButton");
        Intrinsics.checkNotNullParameter(priceBlock, "priceBlock");
        Intrinsics.checkNotNullParameter(discounts, "discounts");
        Intrinsics.checkNotNullParameter(priceInput, "priceInput");
        Intrinsics.checkNotNullParameter(quantityInput, "quantityInput");
        this.title = title;
        this.subtitle = subtitle;
        this.infoButton = infoButton;
        this.sendButton = sendButton;
        this.priceBlock = priceBlock;
        this.discounts = discounts;
        this.seller = cellWithSubtitle40Icon;
        this.priceInput = priceInput;
        this.quantityInput = quantityInput;
        this.trackingInfo = map;
    }

    public static /* synthetic */ WannaDiscountV2DTO copy$default(WannaDiscountV2DTO wannaDiscountV2DTO, TextAtom textAtom, TextAtom textAtom2, ButtonV3Atom.SmallIconButton smallIconButton, ButtonV3Atom.LargeButton largeButton, PriceBlock priceBlock, List list, CellAtom.CellAtomWithSubtitle.CellWithSubtitle40Icon cellWithSubtitle40Icon, PriceInputBlock priceInputBlock, QuantityInputBlock quantityInputBlock, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textAtom = wannaDiscountV2DTO.title;
        }
        if ((i11 & 2) != 0) {
            textAtom2 = wannaDiscountV2DTO.subtitle;
        }
        if ((i11 & 4) != 0) {
            smallIconButton = wannaDiscountV2DTO.infoButton;
        }
        if ((i11 & 8) != 0) {
            largeButton = wannaDiscountV2DTO.sendButton;
        }
        if ((i11 & 16) != 0) {
            priceBlock = wannaDiscountV2DTO.priceBlock;
        }
        if ((i11 & 32) != 0) {
            list = wannaDiscountV2DTO.discounts;
        }
        if ((i11 & 64) != 0) {
            cellWithSubtitle40Icon = wannaDiscountV2DTO.seller;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            priceInputBlock = wannaDiscountV2DTO.priceInput;
        }
        if ((i11 & 256) != 0) {
            quantityInputBlock = wannaDiscountV2DTO.quantityInput;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
            map = wannaDiscountV2DTO.trackingInfo;
        }
        QuantityInputBlock quantityInputBlock2 = quantityInputBlock;
        Map map2 = map;
        CellAtom.CellAtomWithSubtitle.CellWithSubtitle40Icon cellWithSubtitle40Icon2 = cellWithSubtitle40Icon;
        PriceInputBlock priceInputBlock2 = priceInputBlock;
        PriceBlock priceBlock2 = priceBlock;
        List list2 = list;
        return wannaDiscountV2DTO.copy(textAtom, textAtom2, smallIconButton, largeButton, priceBlock2, list2, cellWithSubtitle40Icon2, priceInputBlock2, quantityInputBlock2, map2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextAtom getTitle() {
        return this.title;
    }

    public final Map<String, TokenizedTrackingInfo> component10() {
        return this.trackingInfo;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final TextAtom getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final ButtonV3Atom.SmallIconButton getInfoButton() {
        return this.infoButton;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final ButtonV3Atom.LargeButton getSendButton() {
        return this.sendButton;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final PriceBlock getPriceBlock() {
        return this.priceBlock;
    }

    @NotNull
    public final List<TagV3Atom.TagAtom> component6() {
        return this.discounts;
    }

    /* renamed from: component7, reason: from getter */
    public final CellAtom.CellAtomWithSubtitle.CellWithSubtitle40Icon getSeller() {
        return this.seller;
    }

    @NotNull
    /* renamed from: component8, reason: from getter */
    public final PriceInputBlock getPriceInput() {
        return this.priceInput;
    }

    @NotNull
    /* renamed from: component9, reason: from getter */
    public final QuantityInputBlock getQuantityInput() {
        return this.quantityInput;
    }

    @NotNull
    public final WannaDiscountV2DTO copy(@NotNull TextAtom title, @NotNull TextAtom subtitle, @NotNull ButtonV3Atom.SmallIconButton infoButton, @NotNull ButtonV3Atom.LargeButton sendButton, @NotNull PriceBlock priceBlock, @NotNull List<TagV3Atom.TagAtom> discounts, CellAtom.CellAtomWithSubtitle.CellWithSubtitle40Icon seller, @NotNull PriceInputBlock priceInput, @NotNull QuantityInputBlock quantityInput, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(infoButton, "infoButton");
        Intrinsics.checkNotNullParameter(sendButton, "sendButton");
        Intrinsics.checkNotNullParameter(priceBlock, "priceBlock");
        Intrinsics.checkNotNullParameter(discounts, "discounts");
        Intrinsics.checkNotNullParameter(priceInput, "priceInput");
        Intrinsics.checkNotNullParameter(quantityInput, "quantityInput");
        return new WannaDiscountV2DTO(title, subtitle, infoButton, sendButton, priceBlock, discounts, seller, priceInput, quantityInput, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WannaDiscountV2DTO)) {
            return false;
        }
        WannaDiscountV2DTO wannaDiscountV2DTO = (WannaDiscountV2DTO) other;
        return Intrinsics.d(this.title, wannaDiscountV2DTO.title) && Intrinsics.d(this.subtitle, wannaDiscountV2DTO.subtitle) && Intrinsics.d(this.infoButton, wannaDiscountV2DTO.infoButton) && Intrinsics.d(this.sendButton, wannaDiscountV2DTO.sendButton) && Intrinsics.d(this.priceBlock, wannaDiscountV2DTO.priceBlock) && Intrinsics.d(this.discounts, wannaDiscountV2DTO.discounts) && Intrinsics.d(this.seller, wannaDiscountV2DTO.seller) && Intrinsics.d(this.priceInput, wannaDiscountV2DTO.priceInput) && Intrinsics.d(this.quantityInput, wannaDiscountV2DTO.quantityInput) && Intrinsics.d(this.trackingInfo, wannaDiscountV2DTO.trackingInfo);
    }

    @NotNull
    public final List<TagV3Atom.TagAtom> getDiscounts() {
        return this.discounts;
    }

    @NotNull
    public final ButtonV3Atom.SmallIconButton getInfoButton() {
        return this.infoButton;
    }

    @NotNull
    public final PriceBlock getPriceBlock() {
        return this.priceBlock;
    }

    @NotNull
    public final PriceInputBlock getPriceInput() {
        return this.priceInput;
    }

    @NotNull
    public final QuantityInputBlock getQuantityInput() {
        return this.quantityInput;
    }

    public final CellAtom.CellAtomWithSubtitle.CellWithSubtitle40Icon getSeller() {
        return this.seller;
    }

    @NotNull
    public final ButtonV3Atom.LargeButton getSendButton() {
        return this.sendButton;
    }

    @NotNull
    public final TextAtom getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final TextAtom getTitle() {
        return this.title;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int b11 = g.b((this.priceBlock.hashCode() + Tl.b.a(this.sendButton, C3349u1.d(this.infoButton, C2619v.b(this.title.hashCode() * 31, 31, this.subtitle), 31), 31)) * 31, 31, this.discounts);
        CellAtom.CellAtomWithSubtitle.CellWithSubtitle40Icon cellWithSubtitle40Icon = this.seller;
        int hashCode = (this.quantityInput.hashCode() + ((this.priceInput.hashCode() + ((b11 + (cellWithSubtitle40Icon == null ? 0 : cellWithSubtitle40Icon.hashCode())) * 31)) * 31)) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        TextAtom textAtom = this.title;
        TextAtom textAtom2 = this.subtitle;
        ButtonV3Atom.SmallIconButton smallIconButton = this.infoButton;
        ButtonV3Atom.LargeButton largeButton = this.sendButton;
        PriceBlock priceBlock = this.priceBlock;
        List<TagV3Atom.TagAtom> list = this.discounts;
        CellAtom.CellAtomWithSubtitle.CellWithSubtitle40Icon cellWithSubtitle40Icon = this.seller;
        PriceInputBlock priceInputBlock = this.priceInput;
        QuantityInputBlock quantityInputBlock = this.quantityInput;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder a11 = a.a("WannaDiscountV2DTO(title=", textAtom, ", subtitle=", textAtom2, ", infoButton=");
        a11.append(smallIconButton);
        a11.append(", sendButton=");
        a11.append(largeButton);
        a11.append(", priceBlock=");
        a11.append(priceBlock);
        a11.append(", discounts=");
        a11.append(list);
        a11.append(", seller=");
        a11.append(cellWithSubtitle40Icon);
        a11.append(", priceInput=");
        a11.append(priceInputBlock);
        a11.append(", quantityInput=");
        a11.append(quantityInputBlock);
        a11.append(", trackingInfo=");
        a11.append(map);
        a11.append(")");
        return a11.toString();
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\"B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\bHÆ\u0003J\t\u0010\u001a\u001a\u00020\nHÆ\u0003J;\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\n2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006#"}, d2 = {"Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/data/WannaDiscountV2DTO$QuantityInputBlock;", "", "input", "Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/data/WannaDiscountV2DTO$InputBlock;", "userQuantityMin", "", "userQuantityMax", "error", "Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/data/WannaDiscountV2DTO$QuantityInputBlock$QuantityError;", "quantityFieldDisabled", "", "<init>", "(Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/data/WannaDiscountV2DTO$InputBlock;JJLru/ozon/app/android/marketing/widgets/wannaDiscountV2/data/WannaDiscountV2DTO$QuantityInputBlock$QuantityError;Z)V", "getInput", "()Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/data/WannaDiscountV2DTO$InputBlock;", "getUserQuantityMin", "()J", "getUserQuantityMax", "getError", "()Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/data/WannaDiscountV2DTO$QuantityInputBlock$QuantityError;", "getQuantityFieldDisabled", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "", "QuantityError", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class QuantityInputBlock {
        public static final int $stable = 8;

        @NotNull
        private final QuantityError error;

        @NotNull
        private final InputBlock input;
        private final boolean quantityFieldDisabled;
        private final long userQuantityMax;
        private final long userQuantityMin;

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/data/WannaDiscountV2DTO$QuantityInputBlock$QuantityError;", "", "empty", "", "max", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getEmpty", "()Ljava/lang/String;", "getMax", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class QuantityError {
            public static final int $stable = 0;

            @NotNull
            private final String empty;

            @NotNull
            private final String max;

            public QuantityError(@NotNull String empty, @NotNull String max) {
                Intrinsics.checkNotNullParameter(empty, "empty");
                Intrinsics.checkNotNullParameter(max, "max");
                this.empty = empty;
                this.max = max;
            }

            public static /* synthetic */ QuantityError copy$default(QuantityError quantityError, String str, String str2, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = quantityError.empty;
                }
                if ((i11 & 2) != 0) {
                    str2 = quantityError.max;
                }
                return quantityError.copy(str, str2);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final String getEmpty() {
                return this.empty;
            }

            @NotNull
            /* renamed from: component2, reason: from getter */
            public final String getMax() {
                return this.max;
            }

            @NotNull
            public final QuantityError copy(@NotNull String empty, @NotNull String max) {
                Intrinsics.checkNotNullParameter(empty, "empty");
                Intrinsics.checkNotNullParameter(max, "max");
                return new QuantityError(empty, max);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof QuantityError)) {
                    return false;
                }
                QuantityError quantityError = (QuantityError) other;
                return Intrinsics.d(this.empty, quantityError.empty) && Intrinsics.d(this.max, quantityError.max);
            }

            @NotNull
            public final String getEmpty() {
                return this.empty;
            }

            @NotNull
            public final String getMax() {
                return this.max;
            }

            public int hashCode() {
                return this.max.hashCode() + (this.empty.hashCode() * 31);
            }

            @NotNull
            public String toString() {
                return e.a("QuantityError(empty=", this.empty, ", max=", this.max, ")");
            }
        }

        public QuantityInputBlock(@NotNull InputBlock input, long j11, long j12, @NotNull QuantityError error, boolean z11) {
            Intrinsics.checkNotNullParameter(input, "input");
            Intrinsics.checkNotNullParameter(error, "error");
            this.input = input;
            this.userQuantityMin = j11;
            this.userQuantityMax = j12;
            this.error = error;
            this.quantityFieldDisabled = z11;
        }

        public static /* synthetic */ QuantityInputBlock copy$default(QuantityInputBlock quantityInputBlock, InputBlock inputBlock, long j11, long j12, QuantityError quantityError, boolean z11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                inputBlock = quantityInputBlock.input;
            }
            if ((i11 & 2) != 0) {
                j11 = quantityInputBlock.userQuantityMin;
            }
            if ((i11 & 4) != 0) {
                j12 = quantityInputBlock.userQuantityMax;
            }
            if ((i11 & 8) != 0) {
                quantityError = quantityInputBlock.error;
            }
            if ((i11 & 16) != 0) {
                z11 = quantityInputBlock.quantityFieldDisabled;
            }
            long j13 = j12;
            return quantityInputBlock.copy(inputBlock, j11, j13, quantityError, z11);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final InputBlock getInput() {
            return this.input;
        }

        /* renamed from: component2, reason: from getter */
        public final long getUserQuantityMin() {
            return this.userQuantityMin;
        }

        /* renamed from: component3, reason: from getter */
        public final long getUserQuantityMax() {
            return this.userQuantityMax;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final QuantityError getError() {
            return this.error;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getQuantityFieldDisabled() {
            return this.quantityFieldDisabled;
        }

        @NotNull
        public final QuantityInputBlock copy(@NotNull InputBlock input, long userQuantityMin, long userQuantityMax, @NotNull QuantityError error, boolean quantityFieldDisabled) {
            Intrinsics.checkNotNullParameter(input, "input");
            Intrinsics.checkNotNullParameter(error, "error");
            return new QuantityInputBlock(input, userQuantityMin, userQuantityMax, error, quantityFieldDisabled);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof QuantityInputBlock)) {
                return false;
            }
            QuantityInputBlock quantityInputBlock = (QuantityInputBlock) other;
            return Intrinsics.d(this.input, quantityInputBlock.input) && this.userQuantityMin == quantityInputBlock.userQuantityMin && this.userQuantityMax == quantityInputBlock.userQuantityMax && Intrinsics.d(this.error, quantityInputBlock.error) && this.quantityFieldDisabled == quantityInputBlock.quantityFieldDisabled;
        }

        @NotNull
        public final QuantityError getError() {
            return this.error;
        }

        @NotNull
        public final InputBlock getInput() {
            return this.input;
        }

        public final boolean getQuantityFieldDisabled() {
            return this.quantityFieldDisabled;
        }

        public final long getUserQuantityMax() {
            return this.userQuantityMax;
        }

        public final long getUserQuantityMin() {
            return this.userQuantityMin;
        }

        public int hashCode() {
            return Boolean.hashCode(this.quantityFieldDisabled) + ((this.error.hashCode() + c.a(c.a(this.input.hashCode() * 31, 31, this.userQuantityMin), 31, this.userQuantityMax)) * 31);
        }

        @NotNull
        public String toString() {
            InputBlock inputBlock = this.input;
            long j11 = this.userQuantityMin;
            long j12 = this.userQuantityMax;
            QuantityError quantityError = this.error;
            boolean z11 = this.quantityFieldDisabled;
            StringBuilder sb2 = new StringBuilder("QuantityInputBlock(input=");
            sb2.append(inputBlock);
            sb2.append(", userQuantityMin=");
            sb2.append(j11);
            C2942q.f(sb2, ", userQuantityMax=", j12, ", error=");
            sb2.append(quantityError);
            sb2.append(", quantityFieldDisabled=");
            sb2.append(z11);
            sb2.append(")");
            return sb2.toString();
        }

        public /* synthetic */ QuantityInputBlock(InputBlock inputBlock, long j11, long j12, QuantityError quantityError, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(inputBlock, j11, j12, quantityError, (i11 & 16) != 0 ? false : z11);
        }
    }
}
