package ru.ozon.app.android.cart.cartSplitV2.v2.dynamicElementV2;

import B0.C2454a;
import J0.P;
import K00.b;
import Kk.C3532b;
import T7.E;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.common.progressivemolecula.presentation.ProgressiveTextWidgetVO;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/v2/dynamicElementV2/DynamicElementVOV2;", "", "<init>", "()V", "Atom", "VerticalSpacer", "Badges", "PriceList", "ProgressiveText", "Lru/ozon/app/android/cart/cartSplitV2/v2/dynamicElementV2/DynamicElementVOV2$Atom;", "Lru/ozon/app/android/cart/cartSplitV2/v2/dynamicElementV2/DynamicElementVOV2$Badges;", "Lru/ozon/app/android/cart/cartSplitV2/v2/dynamicElementV2/DynamicElementVOV2$PriceList;", "Lru/ozon/app/android/cart/cartSplitV2/v2/dynamicElementV2/DynamicElementVOV2$ProgressiveText;", "Lru/ozon/app/android/cart/cartSplitV2/v2/dynamicElementV2/DynamicElementVOV2$VerticalSpacer;", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class DynamicElementVOV2 {

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B#\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0018\u0010\u000eR\u001a\u0010\u0007\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u0019\u0010\u000e¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/v2/dynamicElementV2/DynamicElementVOV2$Atom;", "Lru/ozon/app/android/cart/cartSplitV2/v2/dynamicElementV2/DynamicElementVOV2;", "Lru/ozon/app/android/cart/cartSplitV2/v2/dynamicElementV2/SpacingDynamicElement;", "Lru/ozon/uni/atoms/data/AtomDTO;", "atom", "", "aboveSpace", "belowSpace", "<init>", "(Lru/ozon/uni/atoms/data/AtomDTO;II)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/AtomDTO;", "getAtom", "()Lru/ozon/uni/atoms/data/AtomDTO;", "I", "getAboveSpace", "getBelowSpace", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Atom extends DynamicElementVOV2 implements SpacingDynamicElement {
        public static final int $stable = AtomDTO.$stable;
        private final int aboveSpace;

        @NotNull
        private final AtomDTO atom;
        private final int belowSpace;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Atom(@NotNull AtomDTO atom, int i11, int i12) {
            super(null);
            Intrinsics.checkNotNullParameter(atom, "atom");
            this.atom = atom;
            this.aboveSpace = i11;
            this.belowSpace = i12;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Atom)) {
                return false;
            }
            Atom atom = (Atom) other;
            return Intrinsics.d(this.atom, atom.atom) && this.aboveSpace == atom.aboveSpace && this.belowSpace == atom.belowSpace;
        }

        @Override // ru.ozon.app.android.cart.cartSplitV2.v2.dynamicElementV2.SpacingDynamicElement
        public int getAboveSpace() {
            return this.aboveSpace;
        }

        @NotNull
        public final AtomDTO getAtom() {
            return this.atom;
        }

        @Override // ru.ozon.app.android.cart.cartSplitV2.v2.dynamicElementV2.SpacingDynamicElement
        public int getBelowSpace() {
            return this.belowSpace;
        }

        public int hashCode() {
            return Integer.hashCode(this.belowSpace) + C2454a.a(this.aboveSpace, this.atom.hashCode() * 31, 31);
        }

        @NotNull
        public String toString() {
            AtomDTO atomDTO = this.atom;
            int i11 = this.aboveSpace;
            int i12 = this.belowSpace;
            StringBuilder sb2 = new StringBuilder("Atom(atom=");
            sb2.append(atomDTO);
            sb2.append(", aboveSpace=");
            sb2.append(i11);
            sb2.append(", belowSpace=");
            return b.e(i12, ")", sb2);
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B)\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u0019\u0010\u000fR\u001a\u0010\b\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u0018\u001a\u0004\b\u001a\u0010\u000f¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/v2/dynamicElementV2/DynamicElementVOV2$Badges;", "Lru/ozon/app/android/cart/cartSplitV2/v2/dynamicElementV2/DynamicElementVOV2;", "Lru/ozon/app/android/cart/cartSplitV2/v2/dynamicElementV2/SpacingDynamicElement;", "", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "elements", "", "aboveSpace", "belowSpace", "<init>", "(Ljava/util/List;II)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getElements", "()Ljava/util/List;", "I", "getAboveSpace", "getBelowSpace", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Badges extends DynamicElementVOV2 implements SpacingDynamicElement {
        private final int aboveSpace;
        private final int belowSpace;

        @NotNull
        private final List<BadgeDTO> elements;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Badges(@NotNull List<BadgeDTO> elements, int i11, int i12) {
            super(null);
            Intrinsics.checkNotNullParameter(elements, "elements");
            this.elements = elements;
            this.aboveSpace = i11;
            this.belowSpace = i12;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Badges)) {
                return false;
            }
            Badges badges = (Badges) other;
            return Intrinsics.d(this.elements, badges.elements) && this.aboveSpace == badges.aboveSpace && this.belowSpace == badges.belowSpace;
        }

        @Override // ru.ozon.app.android.cart.cartSplitV2.v2.dynamicElementV2.SpacingDynamicElement
        public int getAboveSpace() {
            return this.aboveSpace;
        }

        @Override // ru.ozon.app.android.cart.cartSplitV2.v2.dynamicElementV2.SpacingDynamicElement
        public int getBelowSpace() {
            return this.belowSpace;
        }

        @NotNull
        public final List<BadgeDTO> getElements() {
            return this.elements;
        }

        public int hashCode() {
            return Integer.hashCode(this.belowSpace) + C2454a.a(this.aboveSpace, this.elements.hashCode() * 31, 31);
        }

        @NotNull
        public String toString() {
            List<BadgeDTO> list = this.elements;
            int i11 = this.aboveSpace;
            int i12 = this.belowSpace;
            StringBuilder sb2 = new StringBuilder("Badges(elements=");
            sb2.append(list);
            sb2.append(", aboveSpace=");
            sb2.append(i11);
            sb2.append(", belowSpace=");
            return b.e(i12, ")", sb2);
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B1\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u0007\u0010\u001aR\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\u001b\u001a\u0004\b\u001c\u0010\u0011R\u001a\u0010\n\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u001b\u001a\u0004\b\u001d\u0010\u0011¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/v2/dynamicElementV2/DynamicElementVOV2$PriceList;", "Lru/ozon/app/android/cart/cartSplitV2/v2/dynamicElementV2/DynamicElementVOV2;", "Lru/ozon/app/android/cart/cartSplitV2/v2/dynamicElementV2/SpacingDynamicElement;", "", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "list", "", "isFlexModeEnabled", "", "aboveSpace", "belowSpace", "<init>", "(Ljava/util/List;ZII)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getList", "()Ljava/util/List;", "Z", "()Z", "I", "getAboveSpace", "getBelowSpace", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PriceList extends DynamicElementVOV2 implements SpacingDynamicElement {
        private final int aboveSpace;
        private final int belowSpace;
        private final boolean isFlexModeEnabled;

        @NotNull
        private final List<PriceDTO> list;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PriceList(@NotNull List<PriceDTO> list, boolean z11, int i11, int i12) {
            super(null);
            Intrinsics.checkNotNullParameter(list, "list");
            this.list = list;
            this.isFlexModeEnabled = z11;
            this.aboveSpace = i11;
            this.belowSpace = i12;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PriceList)) {
                return false;
            }
            PriceList priceList = (PriceList) other;
            return Intrinsics.d(this.list, priceList.list) && this.isFlexModeEnabled == priceList.isFlexModeEnabled && this.aboveSpace == priceList.aboveSpace && this.belowSpace == priceList.belowSpace;
        }

        @Override // ru.ozon.app.android.cart.cartSplitV2.v2.dynamicElementV2.SpacingDynamicElement
        public int getAboveSpace() {
            return this.aboveSpace;
        }

        @Override // ru.ozon.app.android.cart.cartSplitV2.v2.dynamicElementV2.SpacingDynamicElement
        public int getBelowSpace() {
            return this.belowSpace;
        }

        @NotNull
        public final List<PriceDTO> getList() {
            return this.list;
        }

        public int hashCode() {
            return Integer.hashCode(this.belowSpace) + C2454a.a(this.aboveSpace, C3532b.a(this.list.hashCode() * 31, 31, this.isFlexModeEnabled), 31);
        }

        /* renamed from: isFlexModeEnabled, reason: from getter */
        public final boolean getIsFlexModeEnabled() {
            return this.isFlexModeEnabled;
        }

        @NotNull
        public String toString() {
            List<PriceDTO> list = this.list;
            boolean z11 = this.isFlexModeEnabled;
            int i11 = this.aboveSpace;
            int i12 = this.belowSpace;
            StringBuilder sb2 = new StringBuilder("PriceList(list=");
            sb2.append(list);
            sb2.append(", isFlexModeEnabled=");
            sb2.append(z11);
            sb2.append(", aboveSpace=");
            return P.a(i11, i12, ", belowSpace=", ")", sb2);
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B#\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0018\u0010\u000eR\u001a\u0010\u0007\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u0019\u0010\u000e¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/v2/dynamicElementV2/DynamicElementVOV2$ProgressiveText;", "Lru/ozon/app/android/cart/cartSplitV2/v2/dynamicElementV2/DynamicElementVOV2;", "Lru/ozon/app/android/cart/cartSplitV2/v2/dynamicElementV2/SpacingDynamicElement;", "Lru/ozon/app/android/common/progressivemolecula/presentation/ProgressiveTextWidgetVO$ProgressiveTextVO;", "progressiveText", "", "aboveSpace", "belowSpace", "<init>", "(Lru/ozon/app/android/common/progressivemolecula/presentation/ProgressiveTextWidgetVO$ProgressiveTextVO;II)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/common/progressivemolecula/presentation/ProgressiveTextWidgetVO$ProgressiveTextVO;", "getProgressiveText", "()Lru/ozon/app/android/common/progressivemolecula/presentation/ProgressiveTextWidgetVO$ProgressiveTextVO;", "I", "getAboveSpace", "getBelowSpace", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ProgressiveText extends DynamicElementVOV2 implements SpacingDynamicElement {
        private final int aboveSpace;
        private final int belowSpace;

        @NotNull
        private final ProgressiveTextWidgetVO.ProgressiveTextVO progressiveText;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ProgressiveText(@NotNull ProgressiveTextWidgetVO.ProgressiveTextVO progressiveText, int i11, int i12) {
            super(null);
            Intrinsics.checkNotNullParameter(progressiveText, "progressiveText");
            this.progressiveText = progressiveText;
            this.aboveSpace = i11;
            this.belowSpace = i12;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ProgressiveText)) {
                return false;
            }
            ProgressiveText progressiveText = (ProgressiveText) other;
            return Intrinsics.d(this.progressiveText, progressiveText.progressiveText) && this.aboveSpace == progressiveText.aboveSpace && this.belowSpace == progressiveText.belowSpace;
        }

        @Override // ru.ozon.app.android.cart.cartSplitV2.v2.dynamicElementV2.SpacingDynamicElement
        public int getAboveSpace() {
            return this.aboveSpace;
        }

        @Override // ru.ozon.app.android.cart.cartSplitV2.v2.dynamicElementV2.SpacingDynamicElement
        public int getBelowSpace() {
            return this.belowSpace;
        }

        @NotNull
        public final ProgressiveTextWidgetVO.ProgressiveTextVO getProgressiveText() {
            return this.progressiveText;
        }

        public int hashCode() {
            return Integer.hashCode(this.belowSpace) + C2454a.a(this.aboveSpace, this.progressiveText.hashCode() * 31, 31);
        }

        @NotNull
        public String toString() {
            ProgressiveTextWidgetVO.ProgressiveTextVO progressiveTextVO = this.progressiveText;
            int i11 = this.aboveSpace;
            int i12 = this.belowSpace;
            StringBuilder sb2 = new StringBuilder("ProgressiveText(progressiveText=");
            sb2.append(progressiveTextVO);
            sb2.append(", aboveSpace=");
            sb2.append(i11);
            sb2.append(", belowSpace=");
            return b.e(i12, ")", sb2);
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\n¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/v2/dynamicElementV2/DynamicElementVOV2$VerticalSpacer;", "Lru/ozon/app/android/cart/cartSplitV2/v2/dynamicElementV2/DynamicElementVOV2;", "", "spacing", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getSpacing", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class VerticalSpacer extends DynamicElementVOV2 {
        private final int spacing;

        public VerticalSpacer(int i11) {
            super(null);
            this.spacing = i11;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof VerticalSpacer) && this.spacing == ((VerticalSpacer) other).spacing;
        }

        public final int getSpacing() {
            return this.spacing;
        }

        public int hashCode() {
            return Integer.hashCode(this.spacing);
        }

        @NotNull
        public String toString() {
            return E.a(this.spacing, "VerticalSpacer(spacing=", ")");
        }
    }

    public /* synthetic */ DynamicElementVOV2(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private DynamicElementVOV2() {
    }
}
