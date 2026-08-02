package ru.ozon.app.android.pdp.widgets.installmentPurchaseV5.data;

import C.o0;
import Cm.e;
import Co.a;
import D3.g;
import De.C2859b;
import Ns.b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature;
import ru.ozon.uni.atoms.data.common.CommonAtomIconDTO;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0081\b\u0018\u00002\u00020\u0001:\u0004\u001a\u001b\u001c\u001dB#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0007HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/pdp/widgets/installmentPurchaseV5/data/InstallmentPurchaseV5DTO;", "", "titleBlock", "Lru/ozon/app/android/pdp/widgets/installmentPurchaseV5/data/InstallmentPurchaseV5DTO$TitleBlock;", "contentBlock", "Lru/ozon/app/android/pdp/widgets/installmentPurchaseV5/data/InstallmentPurchaseV5DTO$ContentBlock;", "background", "", "<init>", "(Lru/ozon/app/android/pdp/widgets/installmentPurchaseV5/data/InstallmentPurchaseV5DTO$TitleBlock;Lru/ozon/app/android/pdp/widgets/installmentPurchaseV5/data/InstallmentPurchaseV5DTO$ContentBlock;Ljava/lang/String;)V", "getTitleBlock", "()Lru/ozon/app/android/pdp/widgets/installmentPurchaseV5/data/InstallmentPurchaseV5DTO$TitleBlock;", "getContentBlock", "()Lru/ozon/app/android/pdp/widgets/installmentPurchaseV5/data/InstallmentPurchaseV5DTO$ContentBlock;", "getBackground", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "TitleBlock", "ContentBlock", "SingleCreditProduct", "CreditProductsList", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class InstallmentPurchaseV5DTO {
    public static final int $stable = 8;
    private final String background;

    @NotNull
    private final ContentBlock contentBlock;
    private final TitleBlock titleBlock;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0017B\u001f\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/pdp/widgets/installmentPurchaseV5/data/InstallmentPurchaseV5DTO$CreditProductsList;", "", "creditProducts", "", "Lru/ozon/app/android/pdp/widgets/installmentPurchaseV5/data/InstallmentPurchaseV5DTO$CreditProductsList$CreditProduct;", "common", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "<init>", "(Ljava/util/List;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;)V", "getCreditProducts", "()Ljava/util/List;", "getCommon", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "CreditProduct", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class CreditProductsList {
        public static final int $stable = 8;
        private final CommonControlSettings common;

        @NotNull
        private final List<CreditProduct> creditProducts;

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\fHÆ\u0003JM\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\nHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006'"}, d2 = {"Lru/ozon/app/android/pdp/widgets/installmentPurchaseV5/data/InstallmentPurchaseV5DTO$CreditProductsList$CreditProduct;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "subtitle", "button", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "icon", "Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;", "background", "", "common", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;Ljava/lang/String;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "getButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getIcon", "()Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;", "getBackground", "()Ljava/lang/String;", "getCommon", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class CreditProduct {
            public static final int $stable = CommonAtomIconDTO.$stable;
            private final String background;

            @NotNull
            private final ButtonV3DTO button;
            private final CommonControlSettings common;
            private final CommonAtomIconDTO icon;
            private final TextDTO subtitle;

            @NotNull
            private final TextDTO title;

            public CreditProduct(@NotNull TextDTO title, TextDTO textDTO, @NotNull ButtonV3DTO button, CommonAtomIconDTO commonAtomIconDTO, String str, CommonControlSettings commonControlSettings) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(button, "button");
                this.title = title;
                this.subtitle = textDTO;
                this.button = button;
                this.icon = commonAtomIconDTO;
                this.background = str;
                this.common = commonControlSettings;
            }

            public static /* synthetic */ CreditProduct copy$default(CreditProduct creditProduct, TextDTO textDTO, TextDTO textDTO2, ButtonV3DTO buttonV3DTO, CommonAtomIconDTO commonAtomIconDTO, String str, CommonControlSettings commonControlSettings, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    textDTO = creditProduct.title;
                }
                if ((i11 & 2) != 0) {
                    textDTO2 = creditProduct.subtitle;
                }
                if ((i11 & 4) != 0) {
                    buttonV3DTO = creditProduct.button;
                }
                if ((i11 & 8) != 0) {
                    commonAtomIconDTO = creditProduct.icon;
                }
                if ((i11 & 16) != 0) {
                    str = creditProduct.background;
                }
                if ((i11 & 32) != 0) {
                    commonControlSettings = creditProduct.common;
                }
                String str2 = str;
                CommonControlSettings commonControlSettings2 = commonControlSettings;
                return creditProduct.copy(textDTO, textDTO2, buttonV3DTO, commonAtomIconDTO, str2, commonControlSettings2);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final TextDTO getTitle() {
                return this.title;
            }

            /* renamed from: component2, reason: from getter */
            public final TextDTO getSubtitle() {
                return this.subtitle;
            }

            @NotNull
            /* renamed from: component3, reason: from getter */
            public final ButtonV3DTO getButton() {
                return this.button;
            }

            /* renamed from: component4, reason: from getter */
            public final CommonAtomIconDTO getIcon() {
                return this.icon;
            }

            /* renamed from: component5, reason: from getter */
            public final String getBackground() {
                return this.background;
            }

            /* renamed from: component6, reason: from getter */
            public final CommonControlSettings getCommon() {
                return this.common;
            }

            @NotNull
            public final CreditProduct copy(@NotNull TextDTO title, TextDTO subtitle, @NotNull ButtonV3DTO button, CommonAtomIconDTO icon, String background, CommonControlSettings common) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(button, "button");
                return new CreditProduct(title, subtitle, button, icon, background, common);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof CreditProduct)) {
                    return false;
                }
                CreditProduct creditProduct = (CreditProduct) other;
                return Intrinsics.d(this.title, creditProduct.title) && Intrinsics.d(this.subtitle, creditProduct.subtitle) && Intrinsics.d(this.button, creditProduct.button) && Intrinsics.d(this.icon, creditProduct.icon) && Intrinsics.d(this.background, creditProduct.background) && Intrinsics.d(this.common, creditProduct.common);
            }

            public final String getBackground() {
                return this.background;
            }

            @NotNull
            public final ButtonV3DTO getButton() {
                return this.button;
            }

            public final CommonControlSettings getCommon() {
                return this.common;
            }

            public final CommonAtomIconDTO getIcon() {
                return this.icon;
            }

            public final TextDTO getSubtitle() {
                return this.subtitle;
            }

            @NotNull
            public final TextDTO getTitle() {
                return this.title;
            }

            public int hashCode() {
                int hashCode = this.title.hashCode() * 31;
                TextDTO textDTO = this.subtitle;
                int c11 = C2859b.c(this.button, (hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31, 31);
                CommonAtomIconDTO commonAtomIconDTO = this.icon;
                int hashCode2 = (c11 + (commonAtomIconDTO == null ? 0 : commonAtomIconDTO.hashCode())) * 31;
                String str = this.background;
                int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
                CommonControlSettings commonControlSettings = this.common;
                return hashCode3 + (commonControlSettings != null ? commonControlSettings.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                TextDTO textDTO = this.title;
                TextDTO textDTO2 = this.subtitle;
                ButtonV3DTO buttonV3DTO = this.button;
                CommonAtomIconDTO commonAtomIconDTO = this.icon;
                String str = this.background;
                CommonControlSettings commonControlSettings = this.common;
                StringBuilder g10 = g.g("CreditProduct(title=", textDTO, ", subtitle=", textDTO2, ", button=");
                g10.append(buttonV3DTO);
                g10.append(", icon=");
                g10.append(commonAtomIconDTO);
                g10.append(", background=");
                g10.append(str);
                g10.append(", common=");
                g10.append(commonControlSettings);
                g10.append(")");
                return g10.toString();
            }
        }

        public CreditProductsList(@NotNull List<CreditProduct> creditProducts, CommonControlSettings commonControlSettings) {
            Intrinsics.checkNotNullParameter(creditProducts, "creditProducts");
            this.creditProducts = creditProducts;
            this.common = commonControlSettings;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ CreditProductsList copy$default(CreditProductsList creditProductsList, List list, CommonControlSettings commonControlSettings, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                list = creditProductsList.creditProducts;
            }
            if ((i11 & 2) != 0) {
                commonControlSettings = creditProductsList.common;
            }
            return creditProductsList.copy(list, commonControlSettings);
        }

        @NotNull
        public final List<CreditProduct> component1() {
            return this.creditProducts;
        }

        /* renamed from: component2, reason: from getter */
        public final CommonControlSettings getCommon() {
            return this.common;
        }

        @NotNull
        public final CreditProductsList copy(@NotNull List<CreditProduct> creditProducts, CommonControlSettings common) {
            Intrinsics.checkNotNullParameter(creditProducts, "creditProducts");
            return new CreditProductsList(creditProducts, common);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CreditProductsList)) {
                return false;
            }
            CreditProductsList creditProductsList = (CreditProductsList) other;
            return Intrinsics.d(this.creditProducts, creditProductsList.creditProducts) && Intrinsics.d(this.common, creditProductsList.common);
        }

        public final CommonControlSettings getCommon() {
            return this.common;
        }

        @NotNull
        public final List<CreditProduct> getCreditProducts() {
            return this.creditProducts;
        }

        public int hashCode() {
            int hashCode = this.creditProducts.hashCode() * 31;
            CommonControlSettings commonControlSettings = this.common;
            return hashCode + (commonControlSettings == null ? 0 : commonControlSettings.hashCode());
        }

        @NotNull
        public String toString() {
            return "CreditProductsList(creditProducts=" + this.creditProducts + ", common=" + this.common + ")";
        }
    }

    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0002=>Bm\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0005HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0011\u00100\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u0010\u00104\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0002\u0010(J\u000b\u00105\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\u0088\u0001\u00106\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÆ\u0001¢\u0006\u0002\u00107J\u0013\u00108\u001a\u0002092\b\u0010:\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010;\u001a\u00020\u0013HÖ\u0001J\t\u0010<\u001a\u00020\rHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\n\n\u0002\u0010)\u001a\u0004\b'\u0010(R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+¨\u0006?"}, d2 = {"Lru/ozon/app/android/pdp/widgets/installmentPurchaseV5/data/InstallmentPurchaseV5DTO$SingleCreditProduct;", "", "leftBlock", "Lru/ozon/app/android/pdp/widgets/installmentPurchaseV5/data/InstallmentPurchaseV5DTO$SingleCreditProduct$LeftBlock;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "subtitle", "chevronIcon", "Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;", "badges", "", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "background", "", "bottomBlock", "Lru/ozon/app/android/pdp/widgets/installmentPurchaseV5/data/InstallmentPurchaseV5DTO$SingleCreditProduct$BottomBlock;", "onboarding", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "shimmerAnimationTimer", "", "common", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "<init>", "(Lru/ozon/app/android/pdp/widgets/installmentPurchaseV5/data/InstallmentPurchaseV5DTO$SingleCreditProduct$LeftBlock;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;Ljava/util/List;Ljava/lang/String;Lru/ozon/app/android/pdp/widgets/installmentPurchaseV5/data/InstallmentPurchaseV5DTO$SingleCreditProduct$BottomBlock;Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;Ljava/lang/Integer;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;)V", "getLeftBlock", "()Lru/ozon/app/android/pdp/widgets/installmentPurchaseV5/data/InstallmentPurchaseV5DTO$SingleCreditProduct$LeftBlock;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "getChevronIcon", "()Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;", "getBadges", "()Ljava/util/List;", "getBackground", "()Ljava/lang/String;", "getBottomBlock", "()Lru/ozon/app/android/pdp/widgets/installmentPurchaseV5/data/InstallmentPurchaseV5DTO$SingleCreditProduct$BottomBlock;", "getOnboarding", "()Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "getShimmerAnimationTimer", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCommon", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "(Lru/ozon/app/android/pdp/widgets/installmentPurchaseV5/data/InstallmentPurchaseV5DTO$SingleCreditProduct$LeftBlock;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;Ljava/util/List;Ljava/lang/String;Lru/ozon/app/android/pdp/widgets/installmentPurchaseV5/data/InstallmentPurchaseV5DTO$SingleCreditProduct$BottomBlock;Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;Ljava/lang/Integer;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;)Lru/ozon/app/android/pdp/widgets/installmentPurchaseV5/data/InstallmentPurchaseV5DTO$SingleCreditProduct;", "equals", "", "other", "hashCode", "toString", "LeftBlock", "BottomBlock", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class SingleCreditProduct {
        public static final int $stable = 8;
        private final String background;
        private final List<BadgeDTO> badges;
        private final BottomBlock bottomBlock;
        private final CommonAtomIconDTO chevronIcon;
        private final CommonControlSettings common;

        @NotNull
        private final LeftBlock leftBlock;
        private final OnBoardingDTO onboarding;
        private final Integer shimmerAnimationTimer;
        private final TextDTO subtitle;

        @NotNull
        private final TextDTO title;

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/pdp/widgets/installmentPurchaseV5/data/InstallmentPurchaseV5DTO$SingleCreditProduct$BottomBlock;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "background", "", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/String;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getBackground", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class BottomBlock {
            public static final int $stable = 0;
            private final String background;

            @NotNull
            private final TextDTO title;

            public BottomBlock(@NotNull TextDTO title, String str) {
                Intrinsics.checkNotNullParameter(title, "title");
                this.title = title;
                this.background = str;
            }

            public static /* synthetic */ BottomBlock copy$default(BottomBlock bottomBlock, TextDTO textDTO, String str, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    textDTO = bottomBlock.title;
                }
                if ((i11 & 2) != 0) {
                    str = bottomBlock.background;
                }
                return bottomBlock.copy(textDTO, str);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final TextDTO getTitle() {
                return this.title;
            }

            /* renamed from: component2, reason: from getter */
            public final String getBackground() {
                return this.background;
            }

            @NotNull
            public final BottomBlock copy(@NotNull TextDTO title, String background) {
                Intrinsics.checkNotNullParameter(title, "title");
                return new BottomBlock(title, background);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof BottomBlock)) {
                    return false;
                }
                BottomBlock bottomBlock = (BottomBlock) other;
                return Intrinsics.d(this.title, bottomBlock.title) && Intrinsics.d(this.background, bottomBlock.background);
            }

            public final String getBackground() {
                return this.background;
            }

            @NotNull
            public final TextDTO getTitle() {
                return this.title;
            }

            public int hashCode() {
                int hashCode = this.title.hashCode() * 31;
                String str = this.background;
                return hashCode + (str == null ? 0 : str.hashCode());
            }

            @NotNull
            public String toString() {
                return "BottomBlock(title=" + this.title + ", background=" + this.background + ")";
            }
        }

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/pdp/widgets/installmentPurchaseV5/data/InstallmentPurchaseV5DTO$SingleCreditProduct$LeftBlock;", "", "background", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "icon", "Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;)V", "getBackground", "()Ljava/lang/String;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getIcon", "()Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class LeftBlock {
            public static final int $stable = CommonAtomIconDTO.$stable;
            private final String background;
            private final CommonAtomIconDTO icon;

            @NotNull
            private final TextDTO title;

            public LeftBlock(String str, @NotNull TextDTO title, CommonAtomIconDTO commonAtomIconDTO) {
                Intrinsics.checkNotNullParameter(title, "title");
                this.background = str;
                this.title = title;
                this.icon = commonAtomIconDTO;
            }

            public static /* synthetic */ LeftBlock copy$default(LeftBlock leftBlock, String str, TextDTO textDTO, CommonAtomIconDTO commonAtomIconDTO, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = leftBlock.background;
                }
                if ((i11 & 2) != 0) {
                    textDTO = leftBlock.title;
                }
                if ((i11 & 4) != 0) {
                    commonAtomIconDTO = leftBlock.icon;
                }
                return leftBlock.copy(str, textDTO, commonAtomIconDTO);
            }

            /* renamed from: component1, reason: from getter */
            public final String getBackground() {
                return this.background;
            }

            @NotNull
            /* renamed from: component2, reason: from getter */
            public final TextDTO getTitle() {
                return this.title;
            }

            /* renamed from: component3, reason: from getter */
            public final CommonAtomIconDTO getIcon() {
                return this.icon;
            }

            @NotNull
            public final LeftBlock copy(String background, @NotNull TextDTO title, CommonAtomIconDTO icon) {
                Intrinsics.checkNotNullParameter(title, "title");
                return new LeftBlock(background, title, icon);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof LeftBlock)) {
                    return false;
                }
                LeftBlock leftBlock = (LeftBlock) other;
                return Intrinsics.d(this.background, leftBlock.background) && Intrinsics.d(this.title, leftBlock.title) && Intrinsics.d(this.icon, leftBlock.icon);
            }

            public final String getBackground() {
                return this.background;
            }

            public final CommonAtomIconDTO getIcon() {
                return this.icon;
            }

            @NotNull
            public final TextDTO getTitle() {
                return this.title;
            }

            public int hashCode() {
                String str = this.background;
                int a11 = b.a(this.title, (str == null ? 0 : str.hashCode()) * 31, 31);
                CommonAtomIconDTO commonAtomIconDTO = this.icon;
                return a11 + (commonAtomIconDTO != null ? commonAtomIconDTO.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                String str = this.background;
                TextDTO textDTO = this.title;
                CommonAtomIconDTO commonAtomIconDTO = this.icon;
                StringBuilder b11 = a.b("LeftBlock(background=", textDTO, str, ", title=", ", icon=");
                b11.append(commonAtomIconDTO);
                b11.append(")");
                return b11.toString();
            }
        }

        public SingleCreditProduct(@NotNull LeftBlock leftBlock, @NotNull TextDTO title, TextDTO textDTO, CommonAtomIconDTO commonAtomIconDTO, List<BadgeDTO> list, String str, BottomBlock bottomBlock, OnBoardingDTO onBoardingDTO, Integer num, CommonControlSettings commonControlSettings) {
            Intrinsics.checkNotNullParameter(leftBlock, "leftBlock");
            Intrinsics.checkNotNullParameter(title, "title");
            this.leftBlock = leftBlock;
            this.title = title;
            this.subtitle = textDTO;
            this.chevronIcon = commonAtomIconDTO;
            this.badges = list;
            this.background = str;
            this.bottomBlock = bottomBlock;
            this.onboarding = onBoardingDTO;
            this.shimmerAnimationTimer = num;
            this.common = commonControlSettings;
        }

        public static /* synthetic */ SingleCreditProduct copy$default(SingleCreditProduct singleCreditProduct, LeftBlock leftBlock, TextDTO textDTO, TextDTO textDTO2, CommonAtomIconDTO commonAtomIconDTO, List list, String str, BottomBlock bottomBlock, OnBoardingDTO onBoardingDTO, Integer num, CommonControlSettings commonControlSettings, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                leftBlock = singleCreditProduct.leftBlock;
            }
            if ((i11 & 2) != 0) {
                textDTO = singleCreditProduct.title;
            }
            if ((i11 & 4) != 0) {
                textDTO2 = singleCreditProduct.subtitle;
            }
            if ((i11 & 8) != 0) {
                commonAtomIconDTO = singleCreditProduct.chevronIcon;
            }
            if ((i11 & 16) != 0) {
                list = singleCreditProduct.badges;
            }
            if ((i11 & 32) != 0) {
                str = singleCreditProduct.background;
            }
            if ((i11 & 64) != 0) {
                bottomBlock = singleCreditProduct.bottomBlock;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                onBoardingDTO = singleCreditProduct.onboarding;
            }
            if ((i11 & 256) != 0) {
                num = singleCreditProduct.shimmerAnimationTimer;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
                commonControlSettings = singleCreditProduct.common;
            }
            Integer num2 = num;
            CommonControlSettings commonControlSettings2 = commonControlSettings;
            BottomBlock bottomBlock2 = bottomBlock;
            OnBoardingDTO onBoardingDTO2 = onBoardingDTO;
            List list2 = list;
            String str2 = str;
            return singleCreditProduct.copy(leftBlock, textDTO, textDTO2, commonAtomIconDTO, list2, str2, bottomBlock2, onBoardingDTO2, num2, commonControlSettings2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final LeftBlock getLeftBlock() {
            return this.leftBlock;
        }

        /* renamed from: component10, reason: from getter */
        public final CommonControlSettings getCommon() {
            return this.common;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final TextDTO getTitle() {
            return this.title;
        }

        /* renamed from: component3, reason: from getter */
        public final TextDTO getSubtitle() {
            return this.subtitle;
        }

        /* renamed from: component4, reason: from getter */
        public final CommonAtomIconDTO getChevronIcon() {
            return this.chevronIcon;
        }

        public final List<BadgeDTO> component5() {
            return this.badges;
        }

        /* renamed from: component6, reason: from getter */
        public final String getBackground() {
            return this.background;
        }

        /* renamed from: component7, reason: from getter */
        public final BottomBlock getBottomBlock() {
            return this.bottomBlock;
        }

        /* renamed from: component8, reason: from getter */
        public final OnBoardingDTO getOnboarding() {
            return this.onboarding;
        }

        /* renamed from: component9, reason: from getter */
        public final Integer getShimmerAnimationTimer() {
            return this.shimmerAnimationTimer;
        }

        @NotNull
        public final SingleCreditProduct copy(@NotNull LeftBlock leftBlock, @NotNull TextDTO title, TextDTO subtitle, CommonAtomIconDTO chevronIcon, List<BadgeDTO> badges, String background, BottomBlock bottomBlock, OnBoardingDTO onboarding, Integer shimmerAnimationTimer, CommonControlSettings common) {
            Intrinsics.checkNotNullParameter(leftBlock, "leftBlock");
            Intrinsics.checkNotNullParameter(title, "title");
            return new SingleCreditProduct(leftBlock, title, subtitle, chevronIcon, badges, background, bottomBlock, onboarding, shimmerAnimationTimer, common);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SingleCreditProduct)) {
                return false;
            }
            SingleCreditProduct singleCreditProduct = (SingleCreditProduct) other;
            return Intrinsics.d(this.leftBlock, singleCreditProduct.leftBlock) && Intrinsics.d(this.title, singleCreditProduct.title) && Intrinsics.d(this.subtitle, singleCreditProduct.subtitle) && Intrinsics.d(this.chevronIcon, singleCreditProduct.chevronIcon) && Intrinsics.d(this.badges, singleCreditProduct.badges) && Intrinsics.d(this.background, singleCreditProduct.background) && Intrinsics.d(this.bottomBlock, singleCreditProduct.bottomBlock) && Intrinsics.d(this.onboarding, singleCreditProduct.onboarding) && Intrinsics.d(this.shimmerAnimationTimer, singleCreditProduct.shimmerAnimationTimer) && Intrinsics.d(this.common, singleCreditProduct.common);
        }

        public final String getBackground() {
            return this.background;
        }

        public final List<BadgeDTO> getBadges() {
            return this.badges;
        }

        public final BottomBlock getBottomBlock() {
            return this.bottomBlock;
        }

        public final CommonAtomIconDTO getChevronIcon() {
            return this.chevronIcon;
        }

        public final CommonControlSettings getCommon() {
            return this.common;
        }

        @NotNull
        public final LeftBlock getLeftBlock() {
            return this.leftBlock;
        }

        public final OnBoardingDTO getOnboarding() {
            return this.onboarding;
        }

        public final Integer getShimmerAnimationTimer() {
            return this.shimmerAnimationTimer;
        }

        public final TextDTO getSubtitle() {
            return this.subtitle;
        }

        @NotNull
        public final TextDTO getTitle() {
            return this.title;
        }

        public int hashCode() {
            int a11 = b.a(this.title, this.leftBlock.hashCode() * 31, 31);
            TextDTO textDTO = this.subtitle;
            int hashCode = (a11 + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
            CommonAtomIconDTO commonAtomIconDTO = this.chevronIcon;
            int hashCode2 = (hashCode + (commonAtomIconDTO == null ? 0 : commonAtomIconDTO.hashCode())) * 31;
            List<BadgeDTO> list = this.badges;
            int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
            String str = this.background;
            int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
            BottomBlock bottomBlock = this.bottomBlock;
            int hashCode5 = (hashCode4 + (bottomBlock == null ? 0 : bottomBlock.hashCode())) * 31;
            OnBoardingDTO onBoardingDTO = this.onboarding;
            int hashCode6 = (hashCode5 + (onBoardingDTO == null ? 0 : onBoardingDTO.hashCode())) * 31;
            Integer num = this.shimmerAnimationTimer;
            int hashCode7 = (hashCode6 + (num == null ? 0 : num.hashCode())) * 31;
            CommonControlSettings commonControlSettings = this.common;
            return hashCode7 + (commonControlSettings != null ? commonControlSettings.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            LeftBlock leftBlock = this.leftBlock;
            TextDTO textDTO = this.title;
            TextDTO textDTO2 = this.subtitle;
            CommonAtomIconDTO commonAtomIconDTO = this.chevronIcon;
            List<BadgeDTO> list = this.badges;
            String str = this.background;
            BottomBlock bottomBlock = this.bottomBlock;
            OnBoardingDTO onBoardingDTO = this.onboarding;
            Integer num = this.shimmerAnimationTimer;
            CommonControlSettings commonControlSettings = this.common;
            StringBuilder sb2 = new StringBuilder("SingleCreditProduct(leftBlock=");
            sb2.append(leftBlock);
            sb2.append(", title=");
            sb2.append(textDTO);
            sb2.append(", subtitle=");
            sb2.append(textDTO2);
            sb2.append(", chevronIcon=");
            sb2.append(commonAtomIconDTO);
            sb2.append(", badges=");
            e.i(", background=", str, ", bottomBlock=", sb2, list);
            sb2.append(bottomBlock);
            sb2.append(", onboarding=");
            sb2.append(onBoardingDTO);
            sb2.append(", shimmerAnimationTimer=");
            sb2.append(num);
            sb2.append(", common=");
            sb2.append(commonControlSettings);
            sb2.append(")");
            return sb2.toString();
        }
    }

    public InstallmentPurchaseV5DTO(TitleBlock titleBlock, @NotNull ContentBlock contentBlock, String str) {
        Intrinsics.checkNotNullParameter(contentBlock, "contentBlock");
        this.titleBlock = titleBlock;
        this.contentBlock = contentBlock;
        this.background = str;
    }

    public static /* synthetic */ InstallmentPurchaseV5DTO copy$default(InstallmentPurchaseV5DTO installmentPurchaseV5DTO, TitleBlock titleBlock, ContentBlock contentBlock, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            titleBlock = installmentPurchaseV5DTO.titleBlock;
        }
        if ((i11 & 2) != 0) {
            contentBlock = installmentPurchaseV5DTO.contentBlock;
        }
        if ((i11 & 4) != 0) {
            str = installmentPurchaseV5DTO.background;
        }
        return installmentPurchaseV5DTO.copy(titleBlock, contentBlock, str);
    }

    /* renamed from: component1, reason: from getter */
    public final TitleBlock getTitleBlock() {
        return this.titleBlock;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final ContentBlock getContentBlock() {
        return this.contentBlock;
    }

    /* renamed from: component3, reason: from getter */
    public final String getBackground() {
        return this.background;
    }

    @NotNull
    public final InstallmentPurchaseV5DTO copy(TitleBlock titleBlock, @NotNull ContentBlock contentBlock, String background) {
        Intrinsics.checkNotNullParameter(contentBlock, "contentBlock");
        return new InstallmentPurchaseV5DTO(titleBlock, contentBlock, background);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InstallmentPurchaseV5DTO)) {
            return false;
        }
        InstallmentPurchaseV5DTO installmentPurchaseV5DTO = (InstallmentPurchaseV5DTO) other;
        return Intrinsics.d(this.titleBlock, installmentPurchaseV5DTO.titleBlock) && Intrinsics.d(this.contentBlock, installmentPurchaseV5DTO.contentBlock) && Intrinsics.d(this.background, installmentPurchaseV5DTO.background);
    }

    public final String getBackground() {
        return this.background;
    }

    @NotNull
    public final ContentBlock getContentBlock() {
        return this.contentBlock;
    }

    public final TitleBlock getTitleBlock() {
        return this.titleBlock;
    }

    public int hashCode() {
        TitleBlock titleBlock = this.titleBlock;
        int hashCode = (this.contentBlock.hashCode() + ((titleBlock == null ? 0 : titleBlock.hashCode()) * 31)) * 31;
        String str = this.background;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        TitleBlock titleBlock = this.titleBlock;
        ContentBlock contentBlock = this.contentBlock;
        String str = this.background;
        StringBuilder sb2 = new StringBuilder("InstallmentPurchaseV5DTO(titleBlock=");
        sb2.append(titleBlock);
        sb2.append(", contentBlock=");
        sb2.append(contentBlock);
        sb2.append(", background=");
        return o0.c(sb2, str, ")");
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000f\u001a\u00020\u0001HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0004HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/pdp/widgets/installmentPurchaseV5/data/InstallmentPurchaseV5DTO$ContentBlock;", "", "content", "horizontalPaddings", "Lru/ozon/uni/atoms/data/common/Paddings;", "topPadding", "bottomPadding", "<init>", "(Ljava/lang/Object;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;)V", "getContent", "()Ljava/lang/Object;", "getHorizontalPaddings", "()Lru/ozon/uni/atoms/data/common/Paddings;", "getTopPadding", "getBottomPadding", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ContentBlock {
        public static final int $stable = 8;

        @NotNull
        private final Paddings bottomPadding;

        @NotNull
        private final Object content;

        @NotNull
        private final Paddings horizontalPaddings;

        @NotNull
        private final Paddings topPadding;

        public ContentBlock(@ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "singleCreditProduct", type = SingleCreditProduct.class), @ProtoOneOfSignature(name = "creditProductsList", type = CreditProductsList.class)}) @NotNull @ProtoOneOf(label = "type") Object content, @NotNull Paddings horizontalPaddings, @NotNull Paddings topPadding, @NotNull Paddings bottomPadding) {
            Intrinsics.checkNotNullParameter(content, "content");
            Intrinsics.checkNotNullParameter(horizontalPaddings, "horizontalPaddings");
            Intrinsics.checkNotNullParameter(topPadding, "topPadding");
            Intrinsics.checkNotNullParameter(bottomPadding, "bottomPadding");
            this.content = content;
            this.horizontalPaddings = horizontalPaddings;
            this.topPadding = topPadding;
            this.bottomPadding = bottomPadding;
        }

        public static /* synthetic */ ContentBlock copy$default(ContentBlock contentBlock, Object obj, Paddings paddings, Paddings paddings2, Paddings paddings3, int i11, Object obj2) {
            if ((i11 & 1) != 0) {
                obj = contentBlock.content;
            }
            if ((i11 & 2) != 0) {
                paddings = contentBlock.horizontalPaddings;
            }
            if ((i11 & 4) != 0) {
                paddings2 = contentBlock.topPadding;
            }
            if ((i11 & 8) != 0) {
                paddings3 = contentBlock.bottomPadding;
            }
            return contentBlock.copy(obj, paddings, paddings2, paddings3);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final Object getContent() {
            return this.content;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final Paddings getHorizontalPaddings() {
            return this.horizontalPaddings;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final Paddings getTopPadding() {
            return this.topPadding;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final Paddings getBottomPadding() {
            return this.bottomPadding;
        }

        @NotNull
        public final ContentBlock copy(@ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "singleCreditProduct", type = SingleCreditProduct.class), @ProtoOneOfSignature(name = "creditProductsList", type = CreditProductsList.class)}) @NotNull @ProtoOneOf(label = "type") Object content, @NotNull Paddings horizontalPaddings, @NotNull Paddings topPadding, @NotNull Paddings bottomPadding) {
            Intrinsics.checkNotNullParameter(content, "content");
            Intrinsics.checkNotNullParameter(horizontalPaddings, "horizontalPaddings");
            Intrinsics.checkNotNullParameter(topPadding, "topPadding");
            Intrinsics.checkNotNullParameter(bottomPadding, "bottomPadding");
            return new ContentBlock(content, horizontalPaddings, topPadding, bottomPadding);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ContentBlock)) {
                return false;
            }
            ContentBlock contentBlock = (ContentBlock) other;
            return Intrinsics.d(this.content, contentBlock.content) && this.horizontalPaddings == contentBlock.horizontalPaddings && this.topPadding == contentBlock.topPadding && this.bottomPadding == contentBlock.bottomPadding;
        }

        @NotNull
        public final Paddings getBottomPadding() {
            return this.bottomPadding;
        }

        @NotNull
        public final Object getContent() {
            return this.content;
        }

        @NotNull
        public final Paddings getHorizontalPaddings() {
            return this.horizontalPaddings;
        }

        @NotNull
        public final Paddings getTopPadding() {
            return this.topPadding;
        }

        public int hashCode() {
            return this.bottomPadding.hashCode() + GR.b.b(this.topPadding, GR.b.b(this.horizontalPaddings, this.content.hashCode() * 31, 31), 31);
        }

        @NotNull
        public String toString() {
            Object obj = this.content;
            Paddings paddings = this.horizontalPaddings;
            Paddings paddings2 = this.topPadding;
            Paddings paddings3 = this.bottomPadding;
            StringBuilder sb2 = new StringBuilder("ContentBlock(content=");
            sb2.append(obj);
            sb2.append(", horizontalPaddings=");
            sb2.append(paddings);
            sb2.append(", topPadding=");
            return GR.b.e(sb2, paddings2, ", bottomPadding=", paddings3, ")");
        }

        public /* synthetic */ ContentBlock(Object obj, Paddings paddings, Paddings paddings2, Paddings paddings3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(obj, (i11 & 2) != 0 ? Paddings.PADDING_300 : paddings, (i11 & 4) != 0 ? Paddings.PADDING_300 : paddings2, (i11 & 8) != 0 ? Paddings.PADDING_350 : paddings3);
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003J5\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, d2 = {"Lru/ozon/app/android/pdp/widgets/installmentPurchaseV5/data/InstallmentPurchaseV5DTO$TitleBlock;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "badge", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "topPadding", "Lru/ozon/uni/atoms/data/common/Paddings;", "common", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getTopPadding", "()Lru/ozon/uni/atoms/data/common/Paddings;", "getCommon", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TitleBlock {
        public static final int $stable = 0;
        private final BadgeDTO badge;
        private final CommonControlSettings common;

        @NotNull
        private final TextDTO title;

        @NotNull
        private final Paddings topPadding;

        public TitleBlock(@NotNull TextDTO title, BadgeDTO badgeDTO, @NotNull Paddings topPadding, CommonControlSettings commonControlSettings) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(topPadding, "topPadding");
            this.title = title;
            this.badge = badgeDTO;
            this.topPadding = topPadding;
            this.common = commonControlSettings;
        }

        public static /* synthetic */ TitleBlock copy$default(TitleBlock titleBlock, TextDTO textDTO, BadgeDTO badgeDTO, Paddings paddings, CommonControlSettings commonControlSettings, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textDTO = titleBlock.title;
            }
            if ((i11 & 2) != 0) {
                badgeDTO = titleBlock.badge;
            }
            if ((i11 & 4) != 0) {
                paddings = titleBlock.topPadding;
            }
            if ((i11 & 8) != 0) {
                commonControlSettings = titleBlock.common;
            }
            return titleBlock.copy(textDTO, badgeDTO, paddings, commonControlSettings);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextDTO getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final BadgeDTO getBadge() {
            return this.badge;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final Paddings getTopPadding() {
            return this.topPadding;
        }

        /* renamed from: component4, reason: from getter */
        public final CommonControlSettings getCommon() {
            return this.common;
        }

        @NotNull
        public final TitleBlock copy(@NotNull TextDTO title, BadgeDTO badge, @NotNull Paddings topPadding, CommonControlSettings common) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(topPadding, "topPadding");
            return new TitleBlock(title, badge, topPadding, common);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TitleBlock)) {
                return false;
            }
            TitleBlock titleBlock = (TitleBlock) other;
            return Intrinsics.d(this.title, titleBlock.title) && Intrinsics.d(this.badge, titleBlock.badge) && this.topPadding == titleBlock.topPadding && Intrinsics.d(this.common, titleBlock.common);
        }

        public final BadgeDTO getBadge() {
            return this.badge;
        }

        public final CommonControlSettings getCommon() {
            return this.common;
        }

        @NotNull
        public final TextDTO getTitle() {
            return this.title;
        }

        @NotNull
        public final Paddings getTopPadding() {
            return this.topPadding;
        }

        public int hashCode() {
            int hashCode = this.title.hashCode() * 31;
            BadgeDTO badgeDTO = this.badge;
            int b11 = GR.b.b(this.topPadding, (hashCode + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31, 31);
            CommonControlSettings commonControlSettings = this.common;
            return b11 + (commonControlSettings != null ? commonControlSettings.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "TitleBlock(title=" + this.title + ", badge=" + this.badge + ", topPadding=" + this.topPadding + ", common=" + this.common + ")";
        }

        public /* synthetic */ TitleBlock(TextDTO textDTO, BadgeDTO badgeDTO, Paddings paddings, CommonControlSettings commonControlSettings, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(textDTO, badgeDTO, (i11 & 4) != 0 ? Paddings.PADDING_500 : paddings, commonControlSettings);
        }
    }
}
