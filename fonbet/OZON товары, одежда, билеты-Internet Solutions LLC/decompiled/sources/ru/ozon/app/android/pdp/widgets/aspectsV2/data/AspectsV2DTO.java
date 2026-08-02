package ru.ozon.app.android.pdp.widgets.aspectsV2.data;

import B90.C2618u;
import Bk.C2638a;
import G.g;
import H3.c;
import I1.w;
import Lc.a;
import N3.C3660k;
import Xc.b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature;
import ru.ozon.uni.atoms.data.badge.Badge;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001:\u0004\u001d\u001e\u001f B!\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ.\u0010\r\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\f¨\u0006!"}, d2 = {"Lru/ozon/app/android/pdp/widgets/aspectsV2/data/AspectsV2DTO;", "", "", "Lru/ozon/app/android/pdp/widgets/aspectsV2/data/AspectsV2DTO$AspectV2;", "aspects", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "applyButton", "<init>", "(Ljava/util/List;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;)V", "component1", "()Ljava/util/List;", "component2", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "copy", "(Ljava/util/List;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;)Lru/ozon/app/android/pdp/widgets/aspectsV2/data/AspectsV2DTO;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getAspects", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "getApplyButton", "AspectV2", "VariantV2", "VariantType", "State", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class AspectsV2DTO {
    public static final int $stable = 8;
    private final ButtonV3Atom.LargeButton applyButton;
    private final List<AspectV2> aspects;

    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b$\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001;Bm\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\u000f\u0010-\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u0010\u00103\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0002\u0010(J\u0088\u0001\u00104\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÆ\u0001¢\u0006\u0002\u00105J\u0013\u00106\u001a\u00020\u00142\b\u00107\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00108\u001a\u000209HÖ\u0001J\t\u0010:\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\n\n\u0002\u0010)\u001a\u0004\b'\u0010(¨\u0006<"}, d2 = {"Lru/ozon/app/android/pdp/widgets/aspectsV2/data/AspectsV2DTO$AspectV2;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "subtitle", "type", "variants", "", "Lru/ozon/app/android/pdp/widgets/aspectsV2/data/AspectsV2DTO$VariantV2;", "moreVariantsButton", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;", "additionalButton", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButtonWithIcon;", "titleAtom", "Lru/ozon/uni/atoms/data/text/TextDTO;", "additionalButtonAtom", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", CommentV3DTO.FOOTER_FIELD_NAME, "Lru/ozon/app/android/pdp/widgets/aspectsV2/data/AspectsV2DTO$AspectV2$Footer;", "shouldRefreshToTop", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButtonWithIcon;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/app/android/pdp/widgets/aspectsV2/data/AspectsV2DTO$AspectV2$Footer;Ljava/lang/Boolean;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getType", "getVariants", "()Ljava/util/List;", "getMoreVariantsButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;", "getAdditionalButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButtonWithIcon;", "getTitleAtom", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getAdditionalButtonAtom", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getFooter", "()Lru/ozon/app/android/pdp/widgets/aspectsV2/data/AspectsV2DTO$AspectV2$Footer;", "getShouldRefreshToTop", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButtonWithIcon;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/app/android/pdp/widgets/aspectsV2/data/AspectsV2DTO$AspectV2$Footer;Ljava/lang/Boolean;)Lru/ozon/app/android/pdp/widgets/aspectsV2/data/AspectsV2DTO$AspectV2;", "equals", "other", "hashCode", "", "toString", "Footer", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class AspectV2 {
        public static final int $stable = 8;
        private final ButtonV3Atom.SmallBorderlessButtonWithIcon additionalButton;
        private final ButtonV3DTO additionalButtonAtom;
        private final Footer footer;
        private final ButtonV3Atom.LargeBorderlessButton moreVariantsButton;
        private final Boolean shouldRefreshToTop;
        private final String subtitle;
        private final String title;
        private final TextDTO titleAtom;

        @NotNull
        private final String type;

        @NotNull
        private final List<VariantV2> variants;

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/pdp/widgets/aspectsV2/data/AspectsV2DTO$AspectV2$Footer;", "", "leftTextBlock", "Lru/ozon/uni/atoms/data/text/TextDTO;", "rightTextBlock", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;)V", "getLeftTextBlock", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getRightTextBlock", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Footer {
            public static final int $stable = 0;
            private final TextDTO leftTextBlock;
            private final TextDTO rightTextBlock;

            public Footer(TextDTO textDTO, TextDTO textDTO2) {
                this.leftTextBlock = textDTO;
                this.rightTextBlock = textDTO2;
            }

            public static /* synthetic */ Footer copy$default(Footer footer, TextDTO textDTO, TextDTO textDTO2, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    textDTO = footer.leftTextBlock;
                }
                if ((i11 & 2) != 0) {
                    textDTO2 = footer.rightTextBlock;
                }
                return footer.copy(textDTO, textDTO2);
            }

            /* renamed from: component1, reason: from getter */
            public final TextDTO getLeftTextBlock() {
                return this.leftTextBlock;
            }

            /* renamed from: component2, reason: from getter */
            public final TextDTO getRightTextBlock() {
                return this.rightTextBlock;
            }

            @NotNull
            public final Footer copy(TextDTO leftTextBlock, TextDTO rightTextBlock) {
                return new Footer(leftTextBlock, rightTextBlock);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Footer)) {
                    return false;
                }
                Footer footer = (Footer) other;
                return Intrinsics.d(this.leftTextBlock, footer.leftTextBlock) && Intrinsics.d(this.rightTextBlock, footer.rightTextBlock);
            }

            public final TextDTO getLeftTextBlock() {
                return this.leftTextBlock;
            }

            public final TextDTO getRightTextBlock() {
                return this.rightTextBlock;
            }

            public int hashCode() {
                TextDTO textDTO = this.leftTextBlock;
                int hashCode = (textDTO == null ? 0 : textDTO.hashCode()) * 31;
                TextDTO textDTO2 = this.rightTextBlock;
                return hashCode + (textDTO2 != null ? textDTO2.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                return a.b("Footer(leftTextBlock=", this.leftTextBlock, ", rightTextBlock=", this.rightTextBlock, ")");
            }
        }

        public AspectV2(String str, String str2, @NotNull String type, @NotNull List<VariantV2> variants, ButtonV3Atom.LargeBorderlessButton largeBorderlessButton, ButtonV3Atom.SmallBorderlessButtonWithIcon smallBorderlessButtonWithIcon, TextDTO textDTO, ButtonV3DTO buttonV3DTO, Footer footer, Boolean bool) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(variants, "variants");
            this.title = str;
            this.subtitle = str2;
            this.type = type;
            this.variants = variants;
            this.moreVariantsButton = largeBorderlessButton;
            this.additionalButton = smallBorderlessButtonWithIcon;
            this.titleAtom = textDTO;
            this.additionalButtonAtom = buttonV3DTO;
            this.footer = footer;
            this.shouldRefreshToTop = bool;
        }

        public static /* synthetic */ AspectV2 copy$default(AspectV2 aspectV2, String str, String str2, String str3, List list, ButtonV3Atom.LargeBorderlessButton largeBorderlessButton, ButtonV3Atom.SmallBorderlessButtonWithIcon smallBorderlessButtonWithIcon, TextDTO textDTO, ButtonV3DTO buttonV3DTO, Footer footer, Boolean bool, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = aspectV2.title;
            }
            if ((i11 & 2) != 0) {
                str2 = aspectV2.subtitle;
            }
            if ((i11 & 4) != 0) {
                str3 = aspectV2.type;
            }
            if ((i11 & 8) != 0) {
                list = aspectV2.variants;
            }
            if ((i11 & 16) != 0) {
                largeBorderlessButton = aspectV2.moreVariantsButton;
            }
            if ((i11 & 32) != 0) {
                smallBorderlessButtonWithIcon = aspectV2.additionalButton;
            }
            if ((i11 & 64) != 0) {
                textDTO = aspectV2.titleAtom;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                buttonV3DTO = aspectV2.additionalButtonAtom;
            }
            if ((i11 & 256) != 0) {
                footer = aspectV2.footer;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
                bool = aspectV2.shouldRefreshToTop;
            }
            Footer footer2 = footer;
            Boolean bool2 = bool;
            TextDTO textDTO2 = textDTO;
            ButtonV3DTO buttonV3DTO2 = buttonV3DTO;
            ButtonV3Atom.LargeBorderlessButton largeBorderlessButton2 = largeBorderlessButton;
            ButtonV3Atom.SmallBorderlessButtonWithIcon smallBorderlessButtonWithIcon2 = smallBorderlessButtonWithIcon;
            return aspectV2.copy(str, str2, str3, list, largeBorderlessButton2, smallBorderlessButtonWithIcon2, textDTO2, buttonV3DTO2, footer2, bool2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component10, reason: from getter */
        public final Boolean getShouldRefreshToTop() {
            return this.shouldRefreshToTop;
        }

        /* renamed from: component2, reason: from getter */
        public final String getSubtitle() {
            return this.subtitle;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final String getType() {
            return this.type;
        }

        @NotNull
        public final List<VariantV2> component4() {
            return this.variants;
        }

        /* renamed from: component5, reason: from getter */
        public final ButtonV3Atom.LargeBorderlessButton getMoreVariantsButton() {
            return this.moreVariantsButton;
        }

        /* renamed from: component6, reason: from getter */
        public final ButtonV3Atom.SmallBorderlessButtonWithIcon getAdditionalButton() {
            return this.additionalButton;
        }

        /* renamed from: component7, reason: from getter */
        public final TextDTO getTitleAtom() {
            return this.titleAtom;
        }

        /* renamed from: component8, reason: from getter */
        public final ButtonV3DTO getAdditionalButtonAtom() {
            return this.additionalButtonAtom;
        }

        /* renamed from: component9, reason: from getter */
        public final Footer getFooter() {
            return this.footer;
        }

        @NotNull
        public final AspectV2 copy(String title, String subtitle, @NotNull String type, @NotNull List<VariantV2> variants, ButtonV3Atom.LargeBorderlessButton moreVariantsButton, ButtonV3Atom.SmallBorderlessButtonWithIcon additionalButton, TextDTO titleAtom, ButtonV3DTO additionalButtonAtom, Footer footer, Boolean shouldRefreshToTop) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(variants, "variants");
            return new AspectV2(title, subtitle, type, variants, moreVariantsButton, additionalButton, titleAtom, additionalButtonAtom, footer, shouldRefreshToTop);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AspectV2)) {
                return false;
            }
            AspectV2 aspectV2 = (AspectV2) other;
            return Intrinsics.d(this.title, aspectV2.title) && Intrinsics.d(this.subtitle, aspectV2.subtitle) && Intrinsics.d(this.type, aspectV2.type) && Intrinsics.d(this.variants, aspectV2.variants) && Intrinsics.d(this.moreVariantsButton, aspectV2.moreVariantsButton) && Intrinsics.d(this.additionalButton, aspectV2.additionalButton) && Intrinsics.d(this.titleAtom, aspectV2.titleAtom) && Intrinsics.d(this.additionalButtonAtom, aspectV2.additionalButtonAtom) && Intrinsics.d(this.footer, aspectV2.footer) && Intrinsics.d(this.shouldRefreshToTop, aspectV2.shouldRefreshToTop);
        }

        public final ButtonV3Atom.SmallBorderlessButtonWithIcon getAdditionalButton() {
            return this.additionalButton;
        }

        public final ButtonV3DTO getAdditionalButtonAtom() {
            return this.additionalButtonAtom;
        }

        public final Footer getFooter() {
            return this.footer;
        }

        public final ButtonV3Atom.LargeBorderlessButton getMoreVariantsButton() {
            return this.moreVariantsButton;
        }

        public final Boolean getShouldRefreshToTop() {
            return this.shouldRefreshToTop;
        }

        public final String getSubtitle() {
            return this.subtitle;
        }

        public final String getTitle() {
            return this.title;
        }

        public final TextDTO getTitleAtom() {
            return this.titleAtom;
        }

        @NotNull
        public final String getType() {
            return this.type;
        }

        @NotNull
        public final List<VariantV2> getVariants() {
            return this.variants;
        }

        public int hashCode() {
            String str = this.title;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.subtitle;
            int b11 = g.b(g.a((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.type), 31, this.variants);
            ButtonV3Atom.LargeBorderlessButton largeBorderlessButton = this.moreVariantsButton;
            int hashCode2 = (b11 + (largeBorderlessButton == null ? 0 : largeBorderlessButton.hashCode())) * 31;
            ButtonV3Atom.SmallBorderlessButtonWithIcon smallBorderlessButtonWithIcon = this.additionalButton;
            int hashCode3 = (hashCode2 + (smallBorderlessButtonWithIcon == null ? 0 : smallBorderlessButtonWithIcon.hashCode())) * 31;
            TextDTO textDTO = this.titleAtom;
            int hashCode4 = (hashCode3 + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
            ButtonV3DTO buttonV3DTO = this.additionalButtonAtom;
            int hashCode5 = (hashCode4 + (buttonV3DTO == null ? 0 : buttonV3DTO.hashCode())) * 31;
            Footer footer = this.footer;
            int hashCode6 = (hashCode5 + (footer == null ? 0 : footer.hashCode())) * 31;
            Boolean bool = this.shouldRefreshToTop;
            return hashCode6 + (bool != null ? bool.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.title;
            String str2 = this.subtitle;
            String str3 = this.type;
            List<VariantV2> list = this.variants;
            ButtonV3Atom.LargeBorderlessButton largeBorderlessButton = this.moreVariantsButton;
            ButtonV3Atom.SmallBorderlessButtonWithIcon smallBorderlessButtonWithIcon = this.additionalButton;
            TextDTO textDTO = this.titleAtom;
            ButtonV3DTO buttonV3DTO = this.additionalButtonAtom;
            Footer footer = this.footer;
            Boolean bool = this.shouldRefreshToTop;
            StringBuilder d11 = C3660k.d("AspectV2(title=", str, ", subtitle=", str2, ", type=");
            w.d(str3, ", variants=", ", moreVariantsButton=", d11, list);
            d11.append(largeBorderlessButton);
            d11.append(", additionalButton=");
            d11.append(smallBorderlessButtonWithIcon);
            d11.append(", titleAtom=");
            d11.append(textDTO);
            d11.append(", additionalButtonAtom=");
            d11.append(buttonV3DTO);
            d11.append(", footer=");
            d11.append(footer);
            d11.append(", shouldRefreshToTop=");
            d11.append(bool);
            d11.append(")");
            return d11.toString();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/pdp/widgets/aspectsV2/data/AspectsV2DTO$State;", "", "<init>", "(Ljava/lang/String;I)V", "INVALID", "SELECT", "DEFAULT", "OOS", "SELECT_OOS", "PARTIALLY_DISABLED", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class State {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ State[] $VALUES;
        public static final State INVALID = new State("INVALID", 0);
        public static final State SELECT = new State("SELECT", 1);
        public static final State DEFAULT = new State("DEFAULT", 2);
        public static final State OOS = new State("OOS", 3);
        public static final State SELECT_OOS = new State("SELECT_OOS", 4);
        public static final State PARTIALLY_DISABLED = new State("PARTIALLY_DISABLED", 5);

        private static final /* synthetic */ State[] $values() {
            return new State[]{INVALID, SELECT, DEFAULT, OOS, SELECT_OOS, PARTIALLY_DISABLED};
        }

        static {
            State[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private State(String str, int i11) {
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\n\u0004\u0005\u0006\u0007\b\t\n\u000b\f\rB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\n\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/pdp/widgets/aspectsV2/data/AspectsV2DTO$VariantType;", "", "<init>", "()V", "Text", "TextIcon", "Color", "ImageTitle", "Tiles", "Image", "Markdown", "Media", "Pack", "Size", "Lru/ozon/app/android/pdp/widgets/aspectsV2/data/AspectsV2DTO$VariantType$Color;", "Lru/ozon/app/android/pdp/widgets/aspectsV2/data/AspectsV2DTO$VariantType$Image;", "Lru/ozon/app/android/pdp/widgets/aspectsV2/data/AspectsV2DTO$VariantType$ImageTitle;", "Lru/ozon/app/android/pdp/widgets/aspectsV2/data/AspectsV2DTO$VariantType$Markdown;", "Lru/ozon/app/android/pdp/widgets/aspectsV2/data/AspectsV2DTO$VariantType$Media;", "Lru/ozon/app/android/pdp/widgets/aspectsV2/data/AspectsV2DTO$VariantType$Pack;", "Lru/ozon/app/android/pdp/widgets/aspectsV2/data/AspectsV2DTO$VariantType$Size;", "Lru/ozon/app/android/pdp/widgets/aspectsV2/data/AspectsV2DTO$VariantType$Text;", "Lru/ozon/app/android/pdp/widgets/aspectsV2/data/AspectsV2DTO$VariantType$TextIcon;", "Lru/ozon/app/android/pdp/widgets/aspectsV2/data/AspectsV2DTO$VariantType$Tiles;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class VariantType {
        public static final int $stable = 0;

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\n\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0004HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/pdp/widgets/aspectsV2/data/AspectsV2DTO$VariantType$Color;", "Lru/ozon/app/android/pdp/widgets/aspectsV2/data/AspectsV2DTO$VariantType;", "colors", "", "", "<init>", "(Ljava/util/List;)V", "getColors", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Color extends VariantType {
            public static final int $stable = 8;
            private final List<String> colors;

            public Color(List<String> list) {
                super(null);
                this.colors = list;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Color copy$default(Color color, List list, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    list = color.colors;
                }
                return color.copy(list);
            }

            public final List<String> component1() {
                return this.colors;
            }

            @NotNull
            public final Color copy(List<String> colors) {
                return new Color(colors);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Color) && Intrinsics.d(this.colors, ((Color) other).colors);
            }

            public final List<String> getColors() {
                return this.colors;
            }

            public int hashCode() {
                List<String> list = this.colors;
                if (list == null) {
                    return 0;
                }
                return list.hashCode();
            }

            @NotNull
            public String toString() {
                return c.a("Color(colors=", ")", this.colors);
            }
        }

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/pdp/widgets/aspectsV2/data/AspectsV2DTO$VariantType$ImageTitle;", "Lru/ozon/app/android/pdp/widgets/aspectsV2/data/AspectsV2DTO$VariantType;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "imageUrl", "", "colors", "", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/lang/String;Ljava/util/List;)V", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getImageUrl", "()Ljava/lang/String;", "getColors", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ImageTitle extends VariantType {
            public static final int $stable = 8;
            private final List<String> colors;
            private final String imageUrl;

            @NotNull
            private final TextAtom title;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ImageTitle(@NotNull TextAtom title, String str, List<String> list) {
                super(null);
                Intrinsics.checkNotNullParameter(title, "title");
                this.title = title;
                this.imageUrl = str;
                this.colors = list;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ ImageTitle copy$default(ImageTitle imageTitle, TextAtom textAtom, String str, List list, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    textAtom = imageTitle.title;
                }
                if ((i11 & 2) != 0) {
                    str = imageTitle.imageUrl;
                }
                if ((i11 & 4) != 0) {
                    list = imageTitle.colors;
                }
                return imageTitle.copy(textAtom, str, list);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final TextAtom getTitle() {
                return this.title;
            }

            /* renamed from: component2, reason: from getter */
            public final String getImageUrl() {
                return this.imageUrl;
            }

            public final List<String> component3() {
                return this.colors;
            }

            @NotNull
            public final ImageTitle copy(@NotNull TextAtom title, String imageUrl, List<String> colors) {
                Intrinsics.checkNotNullParameter(title, "title");
                return new ImageTitle(title, imageUrl, colors);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ImageTitle)) {
                    return false;
                }
                ImageTitle imageTitle = (ImageTitle) other;
                return Intrinsics.d(this.title, imageTitle.title) && Intrinsics.d(this.imageUrl, imageTitle.imageUrl) && Intrinsics.d(this.colors, imageTitle.colors);
            }

            public final List<String> getColors() {
                return this.colors;
            }

            public final String getImageUrl() {
                return this.imageUrl;
            }

            @NotNull
            public final TextAtom getTitle() {
                return this.title;
            }

            public int hashCode() {
                int hashCode = this.title.hashCode() * 31;
                String str = this.imageUrl;
                int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                List<String> list = this.colors;
                return hashCode2 + (list != null ? list.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                TextAtom textAtom = this.title;
                String str = this.imageUrl;
                return C2618u.h(Bl.b.d("ImageTitle(title=", ", imageUrl=", str, ", colors=", textAtom), this.colors, ")");
            }
        }

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/pdp/widgets/aspectsV2/data/AspectsV2DTO$VariantType$Markdown;", "Lru/ozon/app/android/pdp/widgets/aspectsV2/data/AspectsV2DTO$VariantType;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "subtitle", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;)V", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getSubtitle", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Markdown extends VariantType {
            public static final int $stable = TextAtom.$stable;
            private final TextAtom subtitle;

            @NotNull
            private final TextAtom title;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Markdown(@NotNull TextAtom title, TextAtom textAtom) {
                super(null);
                Intrinsics.checkNotNullParameter(title, "title");
                this.title = title;
                this.subtitle = textAtom;
            }

            public static /* synthetic */ Markdown copy$default(Markdown markdown, TextAtom textAtom, TextAtom textAtom2, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    textAtom = markdown.title;
                }
                if ((i11 & 2) != 0) {
                    textAtom2 = markdown.subtitle;
                }
                return markdown.copy(textAtom, textAtom2);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final TextAtom getTitle() {
                return this.title;
            }

            /* renamed from: component2, reason: from getter */
            public final TextAtom getSubtitle() {
                return this.subtitle;
            }

            @NotNull
            public final Markdown copy(@NotNull TextAtom title, TextAtom subtitle) {
                Intrinsics.checkNotNullParameter(title, "title");
                return new Markdown(title, subtitle);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Markdown)) {
                    return false;
                }
                Markdown markdown = (Markdown) other;
                return Intrinsics.d(this.title, markdown.title) && Intrinsics.d(this.subtitle, markdown.subtitle);
            }

            public final TextAtom getSubtitle() {
                return this.subtitle;
            }

            @NotNull
            public final TextAtom getTitle() {
                return this.title;
            }

            public int hashCode() {
                int hashCode = this.title.hashCode() * 31;
                TextAtom textAtom = this.subtitle;
                return hashCode + (textAtom == null ? 0 : textAtom.hashCode());
            }

            @NotNull
            public String toString() {
                return Co.a.a("Markdown(title=", this.title, ", subtitle=", this.subtitle, ")");
            }
        }

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J7\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/pdp/widgets/aspectsV2/data/AspectsV2DTO$VariantType$Media;", "Lru/ozon/app/android/pdp/widgets/aspectsV2/data/AspectsV2DTO$VariantType;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "imageUrl", "", "price", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "subtitle", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/lang/String;Lru/ozon/uni/atoms/data/price/PriceDTO;Lru/ozon/uni/atoms/data/texts/TextAtom;)V", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getImageUrl", "()Ljava/lang/String;", "getPrice", "()Lru/ozon/uni/atoms/data/price/PriceDTO;", "getSubtitle", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Media extends VariantType {
            public static final int $stable;
            private final String imageUrl;
            private final PriceDTO price;
            private final TextAtom subtitle;

            @NotNull
            private final TextAtom title;

            static {
                int i11 = TextAtom.$stable;
                $stable = i11 | PriceDTO.$stable | i11;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Media(@NotNull TextAtom title, String str, PriceDTO priceDTO, TextAtom textAtom) {
                super(null);
                Intrinsics.checkNotNullParameter(title, "title");
                this.title = title;
                this.imageUrl = str;
                this.price = priceDTO;
                this.subtitle = textAtom;
            }

            public static /* synthetic */ Media copy$default(Media media, TextAtom textAtom, String str, PriceDTO priceDTO, TextAtom textAtom2, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    textAtom = media.title;
                }
                if ((i11 & 2) != 0) {
                    str = media.imageUrl;
                }
                if ((i11 & 4) != 0) {
                    priceDTO = media.price;
                }
                if ((i11 & 8) != 0) {
                    textAtom2 = media.subtitle;
                }
                return media.copy(textAtom, str, priceDTO, textAtom2);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final TextAtom getTitle() {
                return this.title;
            }

            /* renamed from: component2, reason: from getter */
            public final String getImageUrl() {
                return this.imageUrl;
            }

            /* renamed from: component3, reason: from getter */
            public final PriceDTO getPrice() {
                return this.price;
            }

            /* renamed from: component4, reason: from getter */
            public final TextAtom getSubtitle() {
                return this.subtitle;
            }

            @NotNull
            public final Media copy(@NotNull TextAtom title, String imageUrl, PriceDTO price, TextAtom subtitle) {
                Intrinsics.checkNotNullParameter(title, "title");
                return new Media(title, imageUrl, price, subtitle);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Media)) {
                    return false;
                }
                Media media = (Media) other;
                return Intrinsics.d(this.title, media.title) && Intrinsics.d(this.imageUrl, media.imageUrl) && Intrinsics.d(this.price, media.price) && Intrinsics.d(this.subtitle, media.subtitle);
            }

            public final String getImageUrl() {
                return this.imageUrl;
            }

            public final PriceDTO getPrice() {
                return this.price;
            }

            public final TextAtom getSubtitle() {
                return this.subtitle;
            }

            @NotNull
            public final TextAtom getTitle() {
                return this.title;
            }

            public int hashCode() {
                int hashCode = this.title.hashCode() * 31;
                String str = this.imageUrl;
                int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                PriceDTO priceDTO = this.price;
                int hashCode3 = (hashCode2 + (priceDTO == null ? 0 : priceDTO.hashCode())) * 31;
                TextAtom textAtom = this.subtitle;
                return hashCode3 + (textAtom != null ? textAtom.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                TextAtom textAtom = this.title;
                String str = this.imageUrl;
                PriceDTO priceDTO = this.price;
                TextAtom textAtom2 = this.subtitle;
                StringBuilder d11 = Bl.b.d("Media(title=", ", imageUrl=", str, ", price=", textAtom);
                d11.append(priceDTO);
                d11.append(", subtitle=");
                d11.append(textAtom2);
                d11.append(")");
                return d11.toString();
            }
        }

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/pdp/widgets/aspectsV2/data/AspectsV2DTO$VariantType$Size;", "Lru/ozon/app/android/pdp/widgets/aspectsV2/data/AspectsV2DTO$VariantType;", "text", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;)V", "getText", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Size extends VariantType {
            public static final int $stable = TextAtom.$stable;

            @NotNull
            private final TextAtom text;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Size(@NotNull TextAtom text) {
                super(null);
                Intrinsics.checkNotNullParameter(text, "text");
                this.text = text;
            }

            public static /* synthetic */ Size copy$default(Size size, TextAtom textAtom, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    textAtom = size.text;
                }
                return size.copy(textAtom);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final TextAtom getText() {
                return this.text;
            }

            @NotNull
            public final Size copy(@NotNull TextAtom text) {
                Intrinsics.checkNotNullParameter(text, "text");
                return new Size(text);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Size) && Intrinsics.d(this.text, ((Size) other).text);
            }

            @NotNull
            public final TextAtom getText() {
                return this.text;
            }

            public int hashCode() {
                return this.text.hashCode();
            }

            @NotNull
            public String toString() {
                return "Size(text=" + this.text + ")";
            }
        }

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/pdp/widgets/aspectsV2/data/AspectsV2DTO$VariantType$Text;", "Lru/ozon/app/android/pdp/widgets/aspectsV2/data/AspectsV2DTO$VariantType;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "subtitle", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;)V", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getSubtitle", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Text extends VariantType {
            public static final int $stable = TextAtom.$stable;
            private final TextAtom subtitle;

            @NotNull
            private final TextAtom title;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Text(@NotNull TextAtom title, TextAtom textAtom) {
                super(null);
                Intrinsics.checkNotNullParameter(title, "title");
                this.title = title;
                this.subtitle = textAtom;
            }

            public static /* synthetic */ Text copy$default(Text text, TextAtom textAtom, TextAtom textAtom2, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    textAtom = text.title;
                }
                if ((i11 & 2) != 0) {
                    textAtom2 = text.subtitle;
                }
                return text.copy(textAtom, textAtom2);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final TextAtom getTitle() {
                return this.title;
            }

            /* renamed from: component2, reason: from getter */
            public final TextAtom getSubtitle() {
                return this.subtitle;
            }

            @NotNull
            public final Text copy(@NotNull TextAtom title, TextAtom subtitle) {
                Intrinsics.checkNotNullParameter(title, "title");
                return new Text(title, subtitle);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Text)) {
                    return false;
                }
                Text text = (Text) other;
                return Intrinsics.d(this.title, text.title) && Intrinsics.d(this.subtitle, text.subtitle);
            }

            public final TextAtom getSubtitle() {
                return this.subtitle;
            }

            @NotNull
            public final TextAtom getTitle() {
                return this.title;
            }

            public int hashCode() {
                int hashCode = this.title.hashCode() * 31;
                TextAtom textAtom = this.subtitle;
                return hashCode + (textAtom == null ? 0 : textAtom.hashCode());
            }

            @NotNull
            public String toString() {
                return Co.a.a("Text(title=", this.title, ", subtitle=", this.subtitle, ")");
            }
        }

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/pdp/widgets/aspectsV2/data/AspectsV2DTO$VariantType$TextIcon;", "Lru/ozon/app/android/pdp/widgets/aspectsV2/data/AspectsV2DTO$VariantType;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "icon", "Lru/ozon/uni/atoms/data/button/Icon;", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/button/Icon;)V", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getIcon", "()Lru/ozon/uni/atoms/data/button/Icon;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class TextIcon extends VariantType {
            public static final int $stable = Icon.$stable | TextAtom.$stable;
            private final Icon icon;

            @NotNull
            private final TextAtom title;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TextIcon(@NotNull TextAtom title, Icon icon) {
                super(null);
                Intrinsics.checkNotNullParameter(title, "title");
                this.title = title;
                this.icon = icon;
            }

            public static /* synthetic */ TextIcon copy$default(TextIcon textIcon, TextAtom textAtom, Icon icon, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    textAtom = textIcon.title;
                }
                if ((i11 & 2) != 0) {
                    icon = textIcon.icon;
                }
                return textIcon.copy(textAtom, icon);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final TextAtom getTitle() {
                return this.title;
            }

            /* renamed from: component2, reason: from getter */
            public final Icon getIcon() {
                return this.icon;
            }

            @NotNull
            public final TextIcon copy(@NotNull TextAtom title, Icon icon) {
                Intrinsics.checkNotNullParameter(title, "title");
                return new TextIcon(title, icon);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof TextIcon)) {
                    return false;
                }
                TextIcon textIcon = (TextIcon) other;
                return Intrinsics.d(this.title, textIcon.title) && Intrinsics.d(this.icon, textIcon.icon);
            }

            public final Icon getIcon() {
                return this.icon;
            }

            @NotNull
            public final TextAtom getTitle() {
                return this.title;
            }

            public int hashCode() {
                int hashCode = this.title.hashCode() * 31;
                Icon icon = this.icon;
                return hashCode + (icon == null ? 0 : icon.hashCode());
            }

            @NotNull
            public String toString() {
                return "TextIcon(title=" + this.title + ", icon=" + this.icon + ")";
            }
        }

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/pdp/widgets/aspectsV2/data/AspectsV2DTO$VariantType$Tiles;", "Lru/ozon/app/android/pdp/widgets/aspectsV2/data/AspectsV2DTO$VariantType;", "imageUrl", "", "price", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/price/PriceDTO;)V", "getImageUrl", "()Ljava/lang/String;", "getPrice", "()Lru/ozon/uni/atoms/data/price/PriceDTO;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Tiles extends VariantType {
            public static final int $stable = PriceDTO.$stable;
            private final String imageUrl;
            private final PriceDTO price;

            public Tiles(String str, PriceDTO priceDTO) {
                super(null);
                this.imageUrl = str;
                this.price = priceDTO;
            }

            public static /* synthetic */ Tiles copy$default(Tiles tiles, String str, PriceDTO priceDTO, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = tiles.imageUrl;
                }
                if ((i11 & 2) != 0) {
                    priceDTO = tiles.price;
                }
                return tiles.copy(str, priceDTO);
            }

            /* renamed from: component1, reason: from getter */
            public final String getImageUrl() {
                return this.imageUrl;
            }

            /* renamed from: component2, reason: from getter */
            public final PriceDTO getPrice() {
                return this.price;
            }

            @NotNull
            public final Tiles copy(String imageUrl, PriceDTO price) {
                return new Tiles(imageUrl, price);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Tiles)) {
                    return false;
                }
                Tiles tiles = (Tiles) other;
                return Intrinsics.d(this.imageUrl, tiles.imageUrl) && Intrinsics.d(this.price, tiles.price);
            }

            public final String getImageUrl() {
                return this.imageUrl;
            }

            public final PriceDTO getPrice() {
                return this.price;
            }

            public int hashCode() {
                String str = this.imageUrl;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                PriceDTO priceDTO = this.price;
                return hashCode + (priceDTO != null ? priceDTO.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                return "Tiles(imageUrl=" + this.imageUrl + ", price=" + this.price + ")";
            }
        }

        public /* synthetic */ VariantType(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u000eJ8\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0006\u0010\u000e¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/pdp/widgets/aspectsV2/data/AspectsV2DTO$VariantType$Image;", "Lru/ozon/app/android/pdp/widgets/aspectsV2/data/AspectsV2DTO$VariantType;", "imageUrl", "", "colors", "", "isApparel", "", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;)V", "getImageUrl", "()Ljava/lang/String;", "getColors", "()Ljava/util/List;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;)Lru/ozon/app/android/pdp/widgets/aspectsV2/data/AspectsV2DTO$VariantType$Image;", "equals", "other", "", "hashCode", "", "toString", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Image extends VariantType {
            public static final int $stable = 8;
            private final List<String> colors;
            private final String imageUrl;
            private final Boolean isApparel;

            public /* synthetic */ Image(String str, List list, Boolean bool, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, list, (i11 & 4) != 0 ? Boolean.FALSE : bool);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Image copy$default(Image image, String str, List list, Boolean bool, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = image.imageUrl;
                }
                if ((i11 & 2) != 0) {
                    list = image.colors;
                }
                if ((i11 & 4) != 0) {
                    bool = image.isApparel;
                }
                return image.copy(str, list, bool);
            }

            /* renamed from: component1, reason: from getter */
            public final String getImageUrl() {
                return this.imageUrl;
            }

            public final List<String> component2() {
                return this.colors;
            }

            /* renamed from: component3, reason: from getter */
            public final Boolean getIsApparel() {
                return this.isApparel;
            }

            @NotNull
            public final Image copy(String imageUrl, List<String> colors, Boolean isApparel) {
                return new Image(imageUrl, colors, isApparel);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Image)) {
                    return false;
                }
                Image image = (Image) other;
                return Intrinsics.d(this.imageUrl, image.imageUrl) && Intrinsics.d(this.colors, image.colors) && Intrinsics.d(this.isApparel, image.isApparel);
            }

            public final List<String> getColors() {
                return this.colors;
            }

            public final String getImageUrl() {
                return this.imageUrl;
            }

            public int hashCode() {
                String str = this.imageUrl;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                List<String> list = this.colors;
                int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
                Boolean bool = this.isApparel;
                return hashCode2 + (bool != null ? bool.hashCode() : 0);
            }

            public final Boolean isApparel() {
                return this.isApparel;
            }

            @NotNull
            public String toString() {
                String str = this.imageUrl;
                List<String> list = this.colors;
                return D3.g.d(Tl.b.f("Image(imageUrl=", str, ", colors=", ", isApparel=", list), this.isApparel, ")");
            }

            public Image(String str, List<String> list, Boolean bool) {
                super(null);
                this.imageUrl = str;
                this.colors = list;
                this.isApparel = bool;
            }
        }

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0010J<\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0007\u0010\u0010¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/pdp/widgets/aspectsV2/data/AspectsV2DTO$VariantType$Pack;", "Lru/ozon/app/android/pdp/widgets/aspectsV2/data/AspectsV2DTO$VariantType;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "subtitle", "badge", "Lru/ozon/uni/atoms/data/badge/Badge;", "isBadgeTop", "", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/badge/Badge;Ljava/lang/Boolean;)V", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getSubtitle", "getBadge", "()Lru/ozon/uni/atoms/data/badge/Badge;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "copy", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/badge/Badge;Ljava/lang/Boolean;)Lru/ozon/app/android/pdp/widgets/aspectsV2/data/AspectsV2DTO$VariantType$Pack;", "equals", "other", "", "hashCode", "", "toString", "", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Pack extends VariantType {
            public static final int $stable;
            private final Badge badge;
            private final Boolean isBadgeTop;
            private final TextAtom subtitle;

            @NotNull
            private final TextAtom title;

            static {
                int i11 = Badge.$stable;
                int i12 = TextAtom.$stable;
                $stable = i11 | i12 | i12;
            }

            public /* synthetic */ Pack(TextAtom textAtom, TextAtom textAtom2, Badge badge, Boolean bool, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this(textAtom, textAtom2, badge, (i11 & 8) != 0 ? Boolean.TRUE : bool);
            }

            public static /* synthetic */ Pack copy$default(Pack pack, TextAtom textAtom, TextAtom textAtom2, Badge badge, Boolean bool, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    textAtom = pack.title;
                }
                if ((i11 & 2) != 0) {
                    textAtom2 = pack.subtitle;
                }
                if ((i11 & 4) != 0) {
                    badge = pack.badge;
                }
                if ((i11 & 8) != 0) {
                    bool = pack.isBadgeTop;
                }
                return pack.copy(textAtom, textAtom2, badge, bool);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final TextAtom getTitle() {
                return this.title;
            }

            /* renamed from: component2, reason: from getter */
            public final TextAtom getSubtitle() {
                return this.subtitle;
            }

            /* renamed from: component3, reason: from getter */
            public final Badge getBadge() {
                return this.badge;
            }

            /* renamed from: component4, reason: from getter */
            public final Boolean getIsBadgeTop() {
                return this.isBadgeTop;
            }

            @NotNull
            public final Pack copy(@NotNull TextAtom title, TextAtom subtitle, Badge badge, Boolean isBadgeTop) {
                Intrinsics.checkNotNullParameter(title, "title");
                return new Pack(title, subtitle, badge, isBadgeTop);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Pack)) {
                    return false;
                }
                Pack pack = (Pack) other;
                return Intrinsics.d(this.title, pack.title) && Intrinsics.d(this.subtitle, pack.subtitle) && Intrinsics.d(this.badge, pack.badge) && Intrinsics.d(this.isBadgeTop, pack.isBadgeTop);
            }

            public final Badge getBadge() {
                return this.badge;
            }

            public final TextAtom getSubtitle() {
                return this.subtitle;
            }

            @NotNull
            public final TextAtom getTitle() {
                return this.title;
            }

            public int hashCode() {
                int hashCode = this.title.hashCode() * 31;
                TextAtom textAtom = this.subtitle;
                int hashCode2 = (hashCode + (textAtom == null ? 0 : textAtom.hashCode())) * 31;
                Badge badge = this.badge;
                int hashCode3 = (hashCode2 + (badge == null ? 0 : badge.hashCode())) * 31;
                Boolean bool = this.isBadgeTop;
                return hashCode3 + (bool != null ? bool.hashCode() : 0);
            }

            public final Boolean isBadgeTop() {
                return this.isBadgeTop;
            }

            @NotNull
            public String toString() {
                TextAtom textAtom = this.title;
                TextAtom textAtom2 = this.subtitle;
                Badge badge = this.badge;
                Boolean bool = this.isBadgeTop;
                StringBuilder a11 = HY.a.a("Pack(title=", textAtom, ", subtitle=", textAtom2, ", badge=");
                a11.append(badge);
                a11.append(", isBadgeTop=");
                a11.append(bool);
                a11.append(")");
                return a11.toString();
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Pack(@NotNull TextAtom title, TextAtom textAtom, Badge badge, Boolean bool) {
                super(null);
                Intrinsics.checkNotNullParameter(title, "title");
                this.title = title;
                this.subtitle = textAtom;
                this.badge = badge;
                this.isBadgeTop = bool;
            }
        }

        private VariantType() {
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\u0017\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003J\t\u0010\u001b\u001a\u00020\u000bHÆ\u0003JI\u0010\u001c\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u001f\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006#"}, d2 = {"Lru/ozon/app/android/pdp/widgets/aspectsV2/data/AspectsV2DTO$VariantV2;", "", "variant", "Lru/ozon/app/android/pdp/widgets/aspectsV2/data/AspectsV2DTO$VariantType;", "refreshDeeplink", "", "deeplink", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "state", "Lru/ozon/app/android/pdp/widgets/aspectsV2/data/AspectsV2DTO$State;", "<init>", "(Lru/ozon/app/android/pdp/widgets/aspectsV2/data/AspectsV2DTO$VariantType;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lru/ozon/app/android/pdp/widgets/aspectsV2/data/AspectsV2DTO$State;)V", "getVariant", "()Lru/ozon/app/android/pdp/widgets/aspectsV2/data/AspectsV2DTO$VariantType;", "getRefreshDeeplink", "()Ljava/lang/String;", "getDeeplink", "getTrackingInfo", "()Ljava/util/Map;", "getState", "()Lru/ozon/app/android/pdp/widgets/aspectsV2/data/AspectsV2DTO$State;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class VariantV2 {
        public static final int $stable = 8;

        @NotNull
        private final String deeplink;

        @NotNull
        private final String refreshDeeplink;

        @NotNull
        private final State state;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        @NotNull
        private final VariantType variant;

        public VariantV2(@ProtoOneOfSignature.Container({@ProtoOneOfSignature(fieldName = "text", name = "TEXT", type = VariantType.Text.class), @ProtoOneOfSignature(fieldName = "textIcon", name = "TEXT_ICON", type = VariantType.TextIcon.class), @ProtoOneOfSignature(fieldName = "color", name = "COLOR", type = VariantType.Color.class), @ProtoOneOfSignature(fieldName = "imageTitle", name = "IMAGE_WITH_TITLE", type = VariantType.ImageTitle.class), @ProtoOneOfSignature(fieldName = "markdown", name = "MARKDOWN", type = VariantType.Markdown.class), @ProtoOneOfSignature(fieldName = "image", name = "IMAGE", type = VariantType.Image.class), @ProtoOneOfSignature(fieldName = "tiles", name = "TILE", type = VariantType.Tiles.class), @ProtoOneOfSignature(fieldName = "media", name = "MEDIA", type = VariantType.Media.class), @ProtoOneOfSignature(fieldName = "pack", name = "PACK", type = VariantType.Pack.class), @ProtoOneOfSignature(fieldName = "size", name = "SIZE", type = VariantType.Size.class)}) @NotNull @ProtoOneOf(label = "type") VariantType variant, @NotNull String refreshDeeplink, @NotNull String deeplink, Map<String, TokenizedTrackingInfo> map, @NotNull State state) {
            Intrinsics.checkNotNullParameter(variant, "variant");
            Intrinsics.checkNotNullParameter(refreshDeeplink, "refreshDeeplink");
            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
            Intrinsics.checkNotNullParameter(state, "state");
            this.variant = variant;
            this.refreshDeeplink = refreshDeeplink;
            this.deeplink = deeplink;
            this.trackingInfo = map;
            this.state = state;
        }

        public static /* synthetic */ VariantV2 copy$default(VariantV2 variantV2, VariantType variantType, String str, String str2, Map map, State state, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                variantType = variantV2.variant;
            }
            if ((i11 & 2) != 0) {
                str = variantV2.refreshDeeplink;
            }
            if ((i11 & 4) != 0) {
                str2 = variantV2.deeplink;
            }
            if ((i11 & 8) != 0) {
                map = variantV2.trackingInfo;
            }
            if ((i11 & 16) != 0) {
                state = variantV2.state;
            }
            State state2 = state;
            String str3 = str2;
            return variantV2.copy(variantType, str, str3, map, state2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final VariantType getVariant() {
            return this.variant;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getRefreshDeeplink() {
            return this.refreshDeeplink;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final String getDeeplink() {
            return this.deeplink;
        }

        public final Map<String, TokenizedTrackingInfo> component4() {
            return this.trackingInfo;
        }

        @NotNull
        /* renamed from: component5, reason: from getter */
        public final State getState() {
            return this.state;
        }

        @NotNull
        public final VariantV2 copy(@ProtoOneOfSignature.Container({@ProtoOneOfSignature(fieldName = "text", name = "TEXT", type = VariantType.Text.class), @ProtoOneOfSignature(fieldName = "textIcon", name = "TEXT_ICON", type = VariantType.TextIcon.class), @ProtoOneOfSignature(fieldName = "color", name = "COLOR", type = VariantType.Color.class), @ProtoOneOfSignature(fieldName = "imageTitle", name = "IMAGE_WITH_TITLE", type = VariantType.ImageTitle.class), @ProtoOneOfSignature(fieldName = "markdown", name = "MARKDOWN", type = VariantType.Markdown.class), @ProtoOneOfSignature(fieldName = "image", name = "IMAGE", type = VariantType.Image.class), @ProtoOneOfSignature(fieldName = "tiles", name = "TILE", type = VariantType.Tiles.class), @ProtoOneOfSignature(fieldName = "media", name = "MEDIA", type = VariantType.Media.class), @ProtoOneOfSignature(fieldName = "pack", name = "PACK", type = VariantType.Pack.class), @ProtoOneOfSignature(fieldName = "size", name = "SIZE", type = VariantType.Size.class)}) @NotNull @ProtoOneOf(label = "type") VariantType variant, @NotNull String refreshDeeplink, @NotNull String deeplink, Map<String, TokenizedTrackingInfo> trackingInfo, @NotNull State state) {
            Intrinsics.checkNotNullParameter(variant, "variant");
            Intrinsics.checkNotNullParameter(refreshDeeplink, "refreshDeeplink");
            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
            Intrinsics.checkNotNullParameter(state, "state");
            return new VariantV2(variant, refreshDeeplink, deeplink, trackingInfo, state);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof VariantV2)) {
                return false;
            }
            VariantV2 variantV2 = (VariantV2) other;
            return Intrinsics.d(this.variant, variantV2.variant) && Intrinsics.d(this.refreshDeeplink, variantV2.refreshDeeplink) && Intrinsics.d(this.deeplink, variantV2.deeplink) && Intrinsics.d(this.trackingInfo, variantV2.trackingInfo) && this.state == variantV2.state;
        }

        @NotNull
        public final String getDeeplink() {
            return this.deeplink;
        }

        @NotNull
        public final String getRefreshDeeplink() {
            return this.refreshDeeplink;
        }

        @NotNull
        public final State getState() {
            return this.state;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        @NotNull
        public final VariantType getVariant() {
            return this.variant;
        }

        public int hashCode() {
            int a11 = g.a(g.a(this.variant.hashCode() * 31, 31, this.refreshDeeplink), 31, this.deeplink);
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return this.state.hashCode() + ((a11 + (map == null ? 0 : map.hashCode())) * 31);
        }

        @NotNull
        public String toString() {
            VariantType variantType = this.variant;
            String str = this.refreshDeeplink;
            String str2 = this.deeplink;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            State state = this.state;
            StringBuilder sb2 = new StringBuilder("VariantV2(variant=");
            sb2.append(variantType);
            sb2.append(", refreshDeeplink=");
            sb2.append(str);
            sb2.append(", deeplink=");
            C2638a.e(sb2, str2, ", trackingInfo=", map, ", state=");
            sb2.append(state);
            sb2.append(")");
            return sb2.toString();
        }
    }

    public AspectsV2DTO(List<AspectV2> list, ButtonV3Atom.LargeButton largeButton) {
        this.aspects = list;
        this.applyButton = largeButton;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AspectsV2DTO copy$default(AspectsV2DTO aspectsV2DTO, List list, ButtonV3Atom.LargeButton largeButton, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = aspectsV2DTO.aspects;
        }
        if ((i11 & 2) != 0) {
            largeButton = aspectsV2DTO.applyButton;
        }
        return aspectsV2DTO.copy(list, largeButton);
    }

    public final List<AspectV2> component1() {
        return this.aspects;
    }

    /* renamed from: component2, reason: from getter */
    public final ButtonV3Atom.LargeButton getApplyButton() {
        return this.applyButton;
    }

    @NotNull
    public final AspectsV2DTO copy(List<AspectV2> aspects, ButtonV3Atom.LargeButton applyButton) {
        return new AspectsV2DTO(aspects, applyButton);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AspectsV2DTO)) {
            return false;
        }
        AspectsV2DTO aspectsV2DTO = (AspectsV2DTO) other;
        return Intrinsics.d(this.aspects, aspectsV2DTO.aspects) && Intrinsics.d(this.applyButton, aspectsV2DTO.applyButton);
    }

    public final ButtonV3Atom.LargeButton getApplyButton() {
        return this.applyButton;
    }

    public final List<AspectV2> getAspects() {
        return this.aspects;
    }

    public int hashCode() {
        List<AspectV2> list = this.aspects;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        ButtonV3Atom.LargeButton largeButton = this.applyButton;
        return hashCode + (largeButton != null ? largeButton.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "AspectsV2DTO(aspects=" + this.aspects + ", applyButton=" + this.applyButton + ")";
    }
}
