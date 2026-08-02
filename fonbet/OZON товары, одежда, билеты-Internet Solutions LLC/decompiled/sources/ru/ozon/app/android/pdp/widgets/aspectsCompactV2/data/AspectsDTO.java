package ru.ozon.app.android.pdp.widgets.aspectsCompactV2.data;

import G.g;
import GR.b;
import I1.w;
import Kk.C3532b;
import N3.C3660k;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.badge.Badge;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.price.Price;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001:\u0003\u001d\u001e\u001fB!\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ.\u0010\r\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\f¨\u0006 "}, d2 = {"Lru/ozon/app/android/pdp/widgets/aspectsCompactV2/data/AspectsDTO;", "", "", "Lru/ozon/app/android/pdp/widgets/aspectsCompactV2/data/AspectsDTO$Aspect;", "aspects", "Lru/ozon/app/android/pdp/widgets/aspectsCompactV2/data/AspectsDTO$AspectButton;", "applyButton", "<init>", "(Ljava/util/List;Lru/ozon/app/android/pdp/widgets/aspectsCompactV2/data/AspectsDTO$AspectButton;)V", "component1", "()Ljava/util/List;", "component2", "()Lru/ozon/app/android/pdp/widgets/aspectsCompactV2/data/AspectsDTO$AspectButton;", "copy", "(Ljava/util/List;Lru/ozon/app/android/pdp/widgets/aspectsCompactV2/data/AspectsDTO$AspectButton;)Lru/ozon/app/android/pdp/widgets/aspectsCompactV2/data/AspectsDTO;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getAspects", "Lru/ozon/app/android/pdp/widgets/aspectsCompactV2/data/AspectsDTO$AspectButton;", "getApplyButton", "AspectButton", "Aspect", "Variant", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class AspectsDTO {
    public static final int $stable = 8;
    private final AspectButton applyButton;
    private final List<Aspect> aspects;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\nHÆ\u0003JQ\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015¨\u0006$"}, d2 = {"Lru/ozon/app/android/pdp/widgets/aspectsCompactV2/data/AspectsDTO$Aspect;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "subtitle", "type", "variants", "", "Lru/ozon/app/android/pdp/widgets/aspectsCompactV2/data/AspectsDTO$Variant;", "moreVariantsButton", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;", "additionalButton", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getType", "getVariants", "()Ljava/util/List;", "getMoreVariantsButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;", "getAdditionalButton", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Aspect {
        public static final int $stable = 8;
        private final ButtonV3Atom.LargeBorderlessButton additionalButton;
        private final ButtonV3Atom.LargeBorderlessButton moreVariantsButton;
        private final String subtitle;

        @NotNull
        private final String title;

        @NotNull
        private final String type;

        @NotNull
        private final List<Variant> variants;

        public Aspect(@NotNull String title, String str, @NotNull String type, @NotNull List<Variant> variants, ButtonV3Atom.LargeBorderlessButton largeBorderlessButton, ButtonV3Atom.LargeBorderlessButton largeBorderlessButton2) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(variants, "variants");
            this.title = title;
            this.subtitle = str;
            this.type = type;
            this.variants = variants;
            this.moreVariantsButton = largeBorderlessButton;
            this.additionalButton = largeBorderlessButton2;
        }

        public static /* synthetic */ Aspect copy$default(Aspect aspect, String str, String str2, String str3, List list, ButtonV3Atom.LargeBorderlessButton largeBorderlessButton, ButtonV3Atom.LargeBorderlessButton largeBorderlessButton2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = aspect.title;
            }
            if ((i11 & 2) != 0) {
                str2 = aspect.subtitle;
            }
            if ((i11 & 4) != 0) {
                str3 = aspect.type;
            }
            if ((i11 & 8) != 0) {
                list = aspect.variants;
            }
            if ((i11 & 16) != 0) {
                largeBorderlessButton = aspect.moreVariantsButton;
            }
            if ((i11 & 32) != 0) {
                largeBorderlessButton2 = aspect.additionalButton;
            }
            ButtonV3Atom.LargeBorderlessButton largeBorderlessButton3 = largeBorderlessButton;
            ButtonV3Atom.LargeBorderlessButton largeBorderlessButton4 = largeBorderlessButton2;
            return aspect.copy(str, str2, str3, list, largeBorderlessButton3, largeBorderlessButton4);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
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
        public final List<Variant> component4() {
            return this.variants;
        }

        /* renamed from: component5, reason: from getter */
        public final ButtonV3Atom.LargeBorderlessButton getMoreVariantsButton() {
            return this.moreVariantsButton;
        }

        /* renamed from: component6, reason: from getter */
        public final ButtonV3Atom.LargeBorderlessButton getAdditionalButton() {
            return this.additionalButton;
        }

        @NotNull
        public final Aspect copy(@NotNull String title, String subtitle, @NotNull String type, @NotNull List<Variant> variants, ButtonV3Atom.LargeBorderlessButton moreVariantsButton, ButtonV3Atom.LargeBorderlessButton additionalButton) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(variants, "variants");
            return new Aspect(title, subtitle, type, variants, moreVariantsButton, additionalButton);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Aspect)) {
                return false;
            }
            Aspect aspect = (Aspect) other;
            return Intrinsics.d(this.title, aspect.title) && Intrinsics.d(this.subtitle, aspect.subtitle) && Intrinsics.d(this.type, aspect.type) && Intrinsics.d(this.variants, aspect.variants) && Intrinsics.d(this.moreVariantsButton, aspect.moreVariantsButton) && Intrinsics.d(this.additionalButton, aspect.additionalButton);
        }

        public final ButtonV3Atom.LargeBorderlessButton getAdditionalButton() {
            return this.additionalButton;
        }

        public final ButtonV3Atom.LargeBorderlessButton getMoreVariantsButton() {
            return this.moreVariantsButton;
        }

        public final String getSubtitle() {
            return this.subtitle;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        @NotNull
        public final String getType() {
            return this.type;
        }

        @NotNull
        public final List<Variant> getVariants() {
            return this.variants;
        }

        public int hashCode() {
            int hashCode = this.title.hashCode() * 31;
            String str = this.subtitle;
            int b11 = g.b(g.a((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.type), 31, this.variants);
            ButtonV3Atom.LargeBorderlessButton largeBorderlessButton = this.moreVariantsButton;
            int hashCode2 = (b11 + (largeBorderlessButton == null ? 0 : largeBorderlessButton.hashCode())) * 31;
            ButtonV3Atom.LargeBorderlessButton largeBorderlessButton2 = this.additionalButton;
            return hashCode2 + (largeBorderlessButton2 != null ? largeBorderlessButton2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.title;
            String str2 = this.subtitle;
            String str3 = this.type;
            List<Variant> list = this.variants;
            ButtonV3Atom.LargeBorderlessButton largeBorderlessButton = this.moreVariantsButton;
            ButtonV3Atom.LargeBorderlessButton largeBorderlessButton2 = this.additionalButton;
            StringBuilder d11 = C3660k.d("Aspect(title=", str, ", subtitle=", str2, ", type=");
            w.d(str3, ", variants=", ", moreVariantsButton=", d11, list);
            d11.append(largeBorderlessButton);
            d11.append(", additionalButton=");
            d11.append(largeBorderlessButton2);
            d11.append(")");
            return d11.toString();
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/pdp/widgets/aspectsCompactV2/data/AspectsDTO$AspectButton;", "", "type", "", "button", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "addToCartButton", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$AddToCartAtom$AddToCartButton;", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$AddToCartAtom$AddToCartButton;)V", "getType", "()Ljava/lang/String;", "getButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "getAddToCartButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$AddToCartAtom$AddToCartButton;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AspectButton {
        public static final int $stable = ButtonV3Atom.AddToCartAtom.AddToCartButton.$stable | ButtonV3Atom.LargeButton.$stable;
        private final ButtonV3Atom.AddToCartAtom.AddToCartButton addToCartButton;
        private final ButtonV3Atom.LargeButton button;

        @NotNull
        private final String type;

        public AspectButton(@NotNull String type, ButtonV3Atom.LargeButton largeButton, ButtonV3Atom.AddToCartAtom.AddToCartButton addToCartButton) {
            Intrinsics.checkNotNullParameter(type, "type");
            this.type = type;
            this.button = largeButton;
            this.addToCartButton = addToCartButton;
        }

        public static /* synthetic */ AspectButton copy$default(AspectButton aspectButton, String str, ButtonV3Atom.LargeButton largeButton, ButtonV3Atom.AddToCartAtom.AddToCartButton addToCartButton, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = aspectButton.type;
            }
            if ((i11 & 2) != 0) {
                largeButton = aspectButton.button;
            }
            if ((i11 & 4) != 0) {
                addToCartButton = aspectButton.addToCartButton;
            }
            return aspectButton.copy(str, largeButton, addToCartButton);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getType() {
            return this.type;
        }

        /* renamed from: component2, reason: from getter */
        public final ButtonV3Atom.LargeButton getButton() {
            return this.button;
        }

        /* renamed from: component3, reason: from getter */
        public final ButtonV3Atom.AddToCartAtom.AddToCartButton getAddToCartButton() {
            return this.addToCartButton;
        }

        @NotNull
        public final AspectButton copy(@NotNull String type, ButtonV3Atom.LargeButton button, ButtonV3Atom.AddToCartAtom.AddToCartButton addToCartButton) {
            Intrinsics.checkNotNullParameter(type, "type");
            return new AspectButton(type, button, addToCartButton);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AspectButton)) {
                return false;
            }
            AspectButton aspectButton = (AspectButton) other;
            return Intrinsics.d(this.type, aspectButton.type) && Intrinsics.d(this.button, aspectButton.button) && Intrinsics.d(this.addToCartButton, aspectButton.addToCartButton);
        }

        public final ButtonV3Atom.AddToCartAtom.AddToCartButton getAddToCartButton() {
            return this.addToCartButton;
        }

        public final ButtonV3Atom.LargeButton getButton() {
            return this.button;
        }

        @NotNull
        public final String getType() {
            return this.type;
        }

        public int hashCode() {
            int hashCode = this.type.hashCode() * 31;
            ButtonV3Atom.LargeButton largeButton = this.button;
            int hashCode2 = (hashCode + (largeButton == null ? 0 : largeButton.hashCode())) * 31;
            ButtonV3Atom.AddToCartAtom.AddToCartButton addToCartButton = this.addToCartButton;
            return hashCode2 + (addToCartButton != null ? addToCartButton.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "AspectButton(type=" + this.type + ", button=" + this.button + ", addToCartButton=" + this.addToCartButton + ")";
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b'\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0087\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0005\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0005HÆ\u0003J\t\u0010/\u001a\u00020\u0005HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u00102\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010!J\u0011\u00103\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\fHÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\t\u00106\u001a\u00020\u0005HÆ\u0003J\t\u00107\u001a\u00020\u0013HÆ\u0003J\u0017\u00108\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015HÆ\u0003J¦\u0001\u00109\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u00132\u0016\b\u0002\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015HÆ\u0001¢\u0006\u0002\u0010:J\u0013\u0010;\u001a\u00020\u00132\b\u0010<\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010=\u001a\u00020>HÖ\u0001J\t\u0010?\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001aR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001cR\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\"\u001a\u0004\b \u0010!R\u0019\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0011\u0010\u0011\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001cR\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010*R\u001f\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,¨\u0006@"}, d2 = {"Lru/ozon/app/android/pdp/widgets/aspectsCompactV2/data/AspectsDTO$Variant;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "refreshDeeplink", "", "deeplink", "subtitle", "image", "aspectRatio", "", "colors", "", "badge", "Lru/ozon/uni/atoms/data/badge/Badge;", "price", "Lru/ozon/uni/atoms/data/price/Price;", "status", "isSelected", "", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;Ljava/lang/Float;Ljava/util/List;Lru/ozon/uni/atoms/data/badge/Badge;Lru/ozon/uni/atoms/data/price/Price;Ljava/lang/String;ZLjava/util/Map;)V", "getTitle", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getRefreshDeeplink", "()Ljava/lang/String;", "getDeeplink", "getSubtitle", "getImage", "getAspectRatio", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getColors", "()Ljava/util/List;", "getBadge", "()Lru/ozon/uni/atoms/data/badge/Badge;", "getPrice", "()Lru/ozon/uni/atoms/data/price/Price;", "getStatus", "()Z", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "(Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;Ljava/lang/Float;Ljava/util/List;Lru/ozon/uni/atoms/data/badge/Badge;Lru/ozon/uni/atoms/data/price/Price;Ljava/lang/String;ZLjava/util/Map;)Lru/ozon/app/android/pdp/widgets/aspectsCompactV2/data/AspectsDTO$Variant;", "equals", "other", "hashCode", "", "toString", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Variant {
        public static final int $stable = 8;
        private final Float aspectRatio;
        private final Badge badge;
        private final List<String> colors;

        @NotNull
        private final String deeplink;
        private final String image;
        private final boolean isSelected;
        private final Price price;

        @NotNull
        private final String refreshDeeplink;

        @NotNull
        private final String status;
        private final OzonSpannableString subtitle;

        @NotNull
        private final OzonSpannableString title;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        public Variant(@NotNull OzonSpannableString title, @NotNull String refreshDeeplink, @NotNull String deeplink, OzonSpannableString ozonSpannableString, String str, Float f7, List<String> list, Badge badge, Price price, @NotNull String status, boolean z11, Map<String, TokenizedTrackingInfo> map) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(refreshDeeplink, "refreshDeeplink");
            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
            Intrinsics.checkNotNullParameter(status, "status");
            this.title = title;
            this.refreshDeeplink = refreshDeeplink;
            this.deeplink = deeplink;
            this.subtitle = ozonSpannableString;
            this.image = str;
            this.aspectRatio = f7;
            this.colors = list;
            this.badge = badge;
            this.price = price;
            this.status = status;
            this.isSelected = z11;
            this.trackingInfo = map;
        }

        public static /* synthetic */ Variant copy$default(Variant variant, OzonSpannableString ozonSpannableString, String str, String str2, OzonSpannableString ozonSpannableString2, String str3, Float f7, List list, Badge badge, Price price, String str4, boolean z11, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                ozonSpannableString = variant.title;
            }
            if ((i11 & 2) != 0) {
                str = variant.refreshDeeplink;
            }
            if ((i11 & 4) != 0) {
                str2 = variant.deeplink;
            }
            if ((i11 & 8) != 0) {
                ozonSpannableString2 = variant.subtitle;
            }
            if ((i11 & 16) != 0) {
                str3 = variant.image;
            }
            if ((i11 & 32) != 0) {
                f7 = variant.aspectRatio;
            }
            if ((i11 & 64) != 0) {
                list = variant.colors;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                badge = variant.badge;
            }
            if ((i11 & 256) != 0) {
                price = variant.price;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
                str4 = variant.status;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
                z11 = variant.isSelected;
            }
            if ((i11 & 2048) != 0) {
                map = variant.trackingInfo;
            }
            boolean z12 = z11;
            Map map2 = map;
            Price price2 = price;
            String str5 = str4;
            List list2 = list;
            Badge badge2 = badge;
            String str6 = str3;
            Float f11 = f7;
            return variant.copy(ozonSpannableString, str, str2, ozonSpannableString2, str6, f11, list2, badge2, price2, str5, z12, map2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final OzonSpannableString getTitle() {
            return this.title;
        }

        @NotNull
        /* renamed from: component10, reason: from getter */
        public final String getStatus() {
            return this.status;
        }

        /* renamed from: component11, reason: from getter */
        public final boolean getIsSelected() {
            return this.isSelected;
        }

        public final Map<String, TokenizedTrackingInfo> component12() {
            return this.trackingInfo;
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

        /* renamed from: component4, reason: from getter */
        public final OzonSpannableString getSubtitle() {
            return this.subtitle;
        }

        /* renamed from: component5, reason: from getter */
        public final String getImage() {
            return this.image;
        }

        /* renamed from: component6, reason: from getter */
        public final Float getAspectRatio() {
            return this.aspectRatio;
        }

        public final List<String> component7() {
            return this.colors;
        }

        /* renamed from: component8, reason: from getter */
        public final Badge getBadge() {
            return this.badge;
        }

        /* renamed from: component9, reason: from getter */
        public final Price getPrice() {
            return this.price;
        }

        @NotNull
        public final Variant copy(@NotNull OzonSpannableString title, @NotNull String refreshDeeplink, @NotNull String deeplink, OzonSpannableString subtitle, String image, Float aspectRatio, List<String> colors, Badge badge, Price price, @NotNull String status, boolean isSelected, Map<String, TokenizedTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(refreshDeeplink, "refreshDeeplink");
            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
            Intrinsics.checkNotNullParameter(status, "status");
            return new Variant(title, refreshDeeplink, deeplink, subtitle, image, aspectRatio, colors, badge, price, status, isSelected, trackingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Variant)) {
                return false;
            }
            Variant variant = (Variant) other;
            return Intrinsics.d(this.title, variant.title) && Intrinsics.d(this.refreshDeeplink, variant.refreshDeeplink) && Intrinsics.d(this.deeplink, variant.deeplink) && Intrinsics.d(this.subtitle, variant.subtitle) && Intrinsics.d(this.image, variant.image) && Intrinsics.d(this.aspectRatio, variant.aspectRatio) && Intrinsics.d(this.colors, variant.colors) && Intrinsics.d(this.badge, variant.badge) && Intrinsics.d(this.price, variant.price) && Intrinsics.d(this.status, variant.status) && this.isSelected == variant.isSelected && Intrinsics.d(this.trackingInfo, variant.trackingInfo);
        }

        public final Float getAspectRatio() {
            return this.aspectRatio;
        }

        public final Badge getBadge() {
            return this.badge;
        }

        public final List<String> getColors() {
            return this.colors;
        }

        @NotNull
        public final String getDeeplink() {
            return this.deeplink;
        }

        public final String getImage() {
            return this.image;
        }

        public final Price getPrice() {
            return this.price;
        }

        @NotNull
        public final String getRefreshDeeplink() {
            return this.refreshDeeplink;
        }

        @NotNull
        public final String getStatus() {
            return this.status;
        }

        public final OzonSpannableString getSubtitle() {
            return this.subtitle;
        }

        @NotNull
        public final OzonSpannableString getTitle() {
            return this.title;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int a11 = g.a(g.a(this.title.hashCode() * 31, 31, this.refreshDeeplink), 31, this.deeplink);
            OzonSpannableString ozonSpannableString = this.subtitle;
            int hashCode = (a11 + (ozonSpannableString == null ? 0 : ozonSpannableString.hashCode())) * 31;
            String str = this.image;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            Float f7 = this.aspectRatio;
            int hashCode3 = (hashCode2 + (f7 == null ? 0 : f7.hashCode())) * 31;
            List<String> list = this.colors;
            int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
            Badge badge = this.badge;
            int hashCode5 = (hashCode4 + (badge == null ? 0 : badge.hashCode())) * 31;
            Price price = this.price;
            int a12 = C3532b.a(g.a((hashCode5 + (price == null ? 0 : price.hashCode())) * 31, 31, this.status), 31, this.isSelected);
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return a12 + (map != null ? map.hashCode() : 0);
        }

        public final boolean isSelected() {
            return this.isSelected;
        }

        @NotNull
        public String toString() {
            OzonSpannableString ozonSpannableString = this.title;
            String str = this.refreshDeeplink;
            String str2 = this.deeplink;
            OzonSpannableString ozonSpannableString2 = this.subtitle;
            String str3 = this.image;
            Float f7 = this.aspectRatio;
            List<String> list = this.colors;
            Badge badge = this.badge;
            Price price = this.price;
            String str4 = this.status;
            boolean z11 = this.isSelected;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            StringBuilder f11 = b.f("Variant(title=", ozonSpannableString, ", refreshDeeplink=", str, ", deeplink=");
            B6.b.c(str2, ", subtitle=", ", image=", f11, ozonSpannableString2);
            f11.append(str3);
            f11.append(", aspectRatio=");
            f11.append(f7);
            f11.append(", colors=");
            f11.append(list);
            f11.append(", badge=");
            f11.append(badge);
            f11.append(", price=");
            f11.append(price);
            f11.append(", status=");
            f11.append(str4);
            f11.append(", isSelected=");
            f11.append(z11);
            f11.append(", trackingInfo=");
            f11.append(map);
            f11.append(")");
            return f11.toString();
        }
    }

    public AspectsDTO(List<Aspect> list, AspectButton aspectButton) {
        this.aspects = list;
        this.applyButton = aspectButton;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AspectsDTO copy$default(AspectsDTO aspectsDTO, List list, AspectButton aspectButton, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = aspectsDTO.aspects;
        }
        if ((i11 & 2) != 0) {
            aspectButton = aspectsDTO.applyButton;
        }
        return aspectsDTO.copy(list, aspectButton);
    }

    public final List<Aspect> component1() {
        return this.aspects;
    }

    /* renamed from: component2, reason: from getter */
    public final AspectButton getApplyButton() {
        return this.applyButton;
    }

    @NotNull
    public final AspectsDTO copy(List<Aspect> aspects, AspectButton applyButton) {
        return new AspectsDTO(aspects, applyButton);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AspectsDTO)) {
            return false;
        }
        AspectsDTO aspectsDTO = (AspectsDTO) other;
        return Intrinsics.d(this.aspects, aspectsDTO.aspects) && Intrinsics.d(this.applyButton, aspectsDTO.applyButton);
    }

    public final AspectButton getApplyButton() {
        return this.applyButton;
    }

    public final List<Aspect> getAspects() {
        return this.aspects;
    }

    public int hashCode() {
        List<Aspect> list = this.aspects;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        AspectButton aspectButton = this.applyButton;
        return hashCode + (aspectButton != null ? aspectButton.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "AspectsDTO(aspects=" + this.aspects + ", applyButton=" + this.applyButton + ")";
    }
}
