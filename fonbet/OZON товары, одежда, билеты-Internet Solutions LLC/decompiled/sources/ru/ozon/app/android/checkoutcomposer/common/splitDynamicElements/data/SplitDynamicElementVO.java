package ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data;

import B0.C2454a;
import Ep.a;
import G.g;
import Ns.b;
import T7.P;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.cart.ui.tooltip.CartTooltipVO;
import ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.FormBuilderBlockVO;
import ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data.DynamicElementDTO;
import ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.presentation.SplitDynamicElementsAdapter;
import ru.ozon.app.android.checkoutgeo.checkout.views.checkoutCellList.CheckoutCellListDTO;
import ru.ozon.app.android.common.progressivemolecula.presentation.ProgressiveTextWidgetVO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.controls.tag.TagButtonDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\t\b\t\n\u000b\f\r\u000e\u000f\u0010B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\t\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/common/splitDynamicElements/data/SplitDynamicElementVO;", "", "<init>", "()V", "elementType", "Lru/ozon/app/android/checkoutcomposer/common/splitDynamicElements/presentation/SplitDynamicElementsAdapter$ElementType;", "getElementType", "()Lru/ozon/app/android/checkoutcomposer/common/splitDynamicElements/presentation/SplitDynamicElementsAdapter$ElementType;", "Form", "LogosCarousel", "AtomElement", "VerticalSpacer", "Separator", "ProgressiveTextElement", "ProductsBlock", "CheckoutCellListElement", "TagListElement", "Lru/ozon/app/android/checkoutcomposer/common/splitDynamicElements/data/SplitDynamicElementVO$AtomElement;", "Lru/ozon/app/android/checkoutcomposer/common/splitDynamicElements/data/SplitDynamicElementVO$CheckoutCellListElement;", "Lru/ozon/app/android/checkoutcomposer/common/splitDynamicElements/data/SplitDynamicElementVO$Form;", "Lru/ozon/app/android/checkoutcomposer/common/splitDynamicElements/data/SplitDynamicElementVO$LogosCarousel;", "Lru/ozon/app/android/checkoutcomposer/common/splitDynamicElements/data/SplitDynamicElementVO$ProductsBlock;", "Lru/ozon/app/android/checkoutcomposer/common/splitDynamicElements/data/SplitDynamicElementVO$ProgressiveTextElement;", "Lru/ozon/app/android/checkoutcomposer/common/splitDynamicElements/data/SplitDynamicElementVO$Separator;", "Lru/ozon/app/android/checkoutcomposer/common/splitDynamicElements/data/SplitDynamicElementVO$TagListElement;", "Lru/ozon/app/android/checkoutcomposer/common/splitDynamicElements/data/SplitDynamicElementVO$VerticalSpacer;", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class SplitDynamicElementVO {

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/common/splitDynamicElements/data/SplitDynamicElementVO$AtomElement;", "Lru/ozon/app/android/checkoutcomposer/common/splitDynamicElements/data/SplitDynamicElementVO;", "Lru/ozon/app/android/checkoutcomposer/common/splitDynamicElements/presentation/SplitDynamicElementsAdapter$ElementType;", "elementType", "Lru/ozon/uni/atoms/data/AtomDTO;", "atom", "<init>", "(Lru/ozon/app/android/checkoutcomposer/common/splitDynamicElements/presentation/SplitDynamicElementsAdapter$ElementType;Lru/ozon/uni/atoms/data/AtomDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/checkoutcomposer/common/splitDynamicElements/presentation/SplitDynamicElementsAdapter$ElementType;", "getElementType", "()Lru/ozon/app/android/checkoutcomposer/common/splitDynamicElements/presentation/SplitDynamicElementsAdapter$ElementType;", "Lru/ozon/uni/atoms/data/AtomDTO;", "getAtom", "()Lru/ozon/uni/atoms/data/AtomDTO;", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AtomElement extends SplitDynamicElementVO {
        public static final int $stable = AtomDTO.$stable;

        @NotNull
        private final AtomDTO atom;

        @NotNull
        private final SplitDynamicElementsAdapter.ElementType elementType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AtomElement(@NotNull SplitDynamicElementsAdapter.ElementType elementType, @NotNull AtomDTO atom) {
            super(null);
            Intrinsics.checkNotNullParameter(elementType, "elementType");
            Intrinsics.checkNotNullParameter(atom, "atom");
            this.elementType = elementType;
            this.atom = atom;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AtomElement)) {
                return false;
            }
            AtomElement atomElement = (AtomElement) other;
            return this.elementType == atomElement.elementType && Intrinsics.d(this.atom, atomElement.atom);
        }

        @NotNull
        public final AtomDTO getAtom() {
            return this.atom;
        }

        @Override // ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data.SplitDynamicElementVO
        @NotNull
        public SplitDynamicElementsAdapter.ElementType getElementType() {
            return this.elementType;
        }

        public int hashCode() {
            return this.atom.hashCode() + (this.elementType.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "AtomElement(elementType=" + this.elementType + ", atom=" + this.atom + ")";
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/common/splitDynamicElements/data/SplitDynamicElementVO$CheckoutCellListElement;", "Lru/ozon/app/android/checkoutcomposer/common/splitDynamicElements/data/SplitDynamicElementVO;", "Lru/ozon/app/android/checkoutcomposer/common/splitDynamicElements/presentation/SplitDynamicElementsAdapter$ElementType;", "elementType", "Lru/ozon/app/android/checkoutgeo/checkout/views/checkoutCellList/CheckoutCellListDTO;", "checkoutCellList", "<init>", "(Lru/ozon/app/android/checkoutcomposer/common/splitDynamicElements/presentation/SplitDynamicElementsAdapter$ElementType;Lru/ozon/app/android/checkoutgeo/checkout/views/checkoutCellList/CheckoutCellListDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/checkoutcomposer/common/splitDynamicElements/presentation/SplitDynamicElementsAdapter$ElementType;", "getElementType", "()Lru/ozon/app/android/checkoutcomposer/common/splitDynamicElements/presentation/SplitDynamicElementsAdapter$ElementType;", "Lru/ozon/app/android/checkoutgeo/checkout/views/checkoutCellList/CheckoutCellListDTO;", "getCheckoutCellList", "()Lru/ozon/app/android/checkoutgeo/checkout/views/checkoutCellList/CheckoutCellListDTO;", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CheckoutCellListElement extends SplitDynamicElementVO {

        @NotNull
        private final CheckoutCellListDTO checkoutCellList;

        @NotNull
        private final SplitDynamicElementsAdapter.ElementType elementType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CheckoutCellListElement(@NotNull SplitDynamicElementsAdapter.ElementType elementType, @NotNull CheckoutCellListDTO checkoutCellList) {
            super(null);
            Intrinsics.checkNotNullParameter(elementType, "elementType");
            Intrinsics.checkNotNullParameter(checkoutCellList, "checkoutCellList");
            this.elementType = elementType;
            this.checkoutCellList = checkoutCellList;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CheckoutCellListElement)) {
                return false;
            }
            CheckoutCellListElement checkoutCellListElement = (CheckoutCellListElement) other;
            return this.elementType == checkoutCellListElement.elementType && Intrinsics.d(this.checkoutCellList, checkoutCellListElement.checkoutCellList);
        }

        @NotNull
        public final CheckoutCellListDTO getCheckoutCellList() {
            return this.checkoutCellList;
        }

        @Override // ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data.SplitDynamicElementVO
        @NotNull
        public SplitDynamicElementsAdapter.ElementType getElementType() {
            return this.elementType;
        }

        public int hashCode() {
            return this.checkoutCellList.hashCode() + (this.elementType.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "CheckoutCellListElement(elementType=" + this.elementType + ", checkoutCellList=" + this.checkoutCellList + ")";
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/common/splitDynamicElements/data/SplitDynamicElementVO$Form;", "Lru/ozon/app/android/checkoutcomposer/common/splitDynamicElements/data/SplitDynamicElementVO;", "Lru/ozon/app/android/checkoutcomposer/common/splitDynamicElements/presentation/SplitDynamicElementsAdapter$ElementType;", "elementType", "", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO;", "formBlocks", "<init>", "(Lru/ozon/app/android/checkoutcomposer/common/splitDynamicElements/presentation/SplitDynamicElementsAdapter$ElementType;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/checkoutcomposer/common/splitDynamicElements/presentation/SplitDynamicElementsAdapter$ElementType;", "getElementType", "()Lru/ozon/app/android/checkoutcomposer/common/splitDynamicElements/presentation/SplitDynamicElementsAdapter$ElementType;", "Ljava/util/List;", "getFormBlocks", "()Ljava/util/List;", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Form extends SplitDynamicElementVO {

        @NotNull
        private final SplitDynamicElementsAdapter.ElementType elementType;

        @NotNull
        private final List<FormBuilderBlockVO> formBlocks;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Form(@NotNull SplitDynamicElementsAdapter.ElementType elementType, @NotNull List<FormBuilderBlockVO> formBlocks) {
            super(null);
            Intrinsics.checkNotNullParameter(elementType, "elementType");
            Intrinsics.checkNotNullParameter(formBlocks, "formBlocks");
            this.elementType = elementType;
            this.formBlocks = formBlocks;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Form)) {
                return false;
            }
            Form form = (Form) other;
            return this.elementType == form.elementType && Intrinsics.d(this.formBlocks, form.formBlocks);
        }

        @Override // ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data.SplitDynamicElementVO
        @NotNull
        public SplitDynamicElementsAdapter.ElementType getElementType() {
            return this.elementType;
        }

        @NotNull
        public final List<FormBuilderBlockVO> getFormBlocks() {
            return this.formBlocks;
        }

        public int hashCode() {
            return this.formBlocks.hashCode() + (this.elementType.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "Form(elementType=" + this.elementType + ", formBlocks=" + this.formBlocks + ")";
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001eB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/common/splitDynamicElements/data/SplitDynamicElementVO$LogosCarousel;", "Lru/ozon/app/android/checkoutcomposer/common/splitDynamicElements/data/SplitDynamicElementVO;", "Lru/ozon/app/android/checkoutcomposer/common/splitDynamicElements/presentation/SplitDynamicElementsAdapter$ElementType;", "elementType", "", "Lru/ozon/app/android/checkoutcomposer/common/splitDynamicElements/data/SplitDynamicElementVO$LogosCarousel$LogosElement;", "elements", "", "scrollPosition", "<init>", "(Lru/ozon/app/android/checkoutcomposer/common/splitDynamicElements/presentation/SplitDynamicElementsAdapter$ElementType;Ljava/util/List;Ljava/lang/Integer;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/checkoutcomposer/common/splitDynamicElements/presentation/SplitDynamicElementsAdapter$ElementType;", "getElementType", "()Lru/ozon/app/android/checkoutcomposer/common/splitDynamicElements/presentation/SplitDynamicElementsAdapter$ElementType;", "Ljava/util/List;", "getElements", "()Ljava/util/List;", "Ljava/lang/Integer;", "getScrollPosition", "()Ljava/lang/Integer;", "LogosElement", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class LogosCarousel extends SplitDynamicElementVO {

        @NotNull
        private final SplitDynamicElementsAdapter.ElementType elementType;

        @NotNull
        private final List<LogosElement> elements;
        private final Integer scrollPosition;

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t\u0012\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0003\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001d\u0010\u001cR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b\u001f\u0010 R%\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\f\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0018\u001a\u0004\b\r\u0010\u0019¨\u0006$"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/common/splitDynamicElements/data/SplitDynamicElementVO$LogosCarousel$LogosElement;", "", "", "isSelected", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "action", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "isSelectable", "<init>", "(ZLru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "()Z", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "Ljava/util/Map;", "getTrackingInfo", "()Ljava/util/Map;", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class LogosElement {
            private final AtomActionDTO action;
            private final boolean isSelectable;
            private final boolean isSelected;
            private final TextDTO subtitle;

            @NotNull
            private final TextDTO title;
            private final Map<String, TokenizedTrackingInfo> trackingInfo;

            public LogosElement(boolean z11, @NotNull TextDTO title, TextDTO textDTO, AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map, boolean z12) {
                Intrinsics.checkNotNullParameter(title, "title");
                this.isSelected = z11;
                this.title = title;
                this.subtitle = textDTO;
                this.action = atomActionDTO;
                this.trackingInfo = map;
                this.isSelectable = z12;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof LogosElement)) {
                    return false;
                }
                LogosElement logosElement = (LogosElement) other;
                return this.isSelected == logosElement.isSelected && Intrinsics.d(this.title, logosElement.title) && Intrinsics.d(this.subtitle, logosElement.subtitle) && Intrinsics.d(this.action, logosElement.action) && Intrinsics.d(this.trackingInfo, logosElement.trackingInfo) && this.isSelectable == logosElement.isSelectable;
            }

            public final AtomActionDTO getAction() {
                return this.action;
            }

            public final TextDTO getSubtitle() {
                return this.subtitle;
            }

            @NotNull
            public final TextDTO getTitle() {
                return this.title;
            }

            public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
                return this.trackingInfo;
            }

            public int hashCode() {
                int a11 = b.a(this.title, Boolean.hashCode(this.isSelected) * 31, 31);
                TextDTO textDTO = this.subtitle;
                int hashCode = (a11 + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
                AtomActionDTO atomActionDTO = this.action;
                int hashCode2 = (hashCode + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
                Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                return Boolean.hashCode(this.isSelectable) + ((hashCode2 + (map != null ? map.hashCode() : 0)) * 31);
            }

            /* renamed from: isSelectable, reason: from getter */
            public final boolean getIsSelectable() {
                return this.isSelectable;
            }

            /* renamed from: isSelected, reason: from getter */
            public final boolean getIsSelected() {
                return this.isSelected;
            }

            @NotNull
            public String toString() {
                return "LogosElement(isSelected=" + this.isSelected + ", title=" + this.title + ", subtitle=" + this.subtitle + ", action=" + this.action + ", trackingInfo=" + this.trackingInfo + ", isSelectable=" + this.isSelectable + ")";
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LogosCarousel(@NotNull SplitDynamicElementsAdapter.ElementType elementType, @NotNull List<LogosElement> elements, Integer num) {
            super(null);
            Intrinsics.checkNotNullParameter(elementType, "elementType");
            Intrinsics.checkNotNullParameter(elements, "elements");
            this.elementType = elementType;
            this.elements = elements;
            this.scrollPosition = num;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LogosCarousel)) {
                return false;
            }
            LogosCarousel logosCarousel = (LogosCarousel) other;
            return this.elementType == logosCarousel.elementType && Intrinsics.d(this.elements, logosCarousel.elements) && Intrinsics.d(this.scrollPosition, logosCarousel.scrollPosition);
        }

        @Override // ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data.SplitDynamicElementVO
        @NotNull
        public SplitDynamicElementsAdapter.ElementType getElementType() {
            return this.elementType;
        }

        @NotNull
        public final List<LogosElement> getElements() {
            return this.elements;
        }

        public final Integer getScrollPosition() {
            return this.scrollPosition;
        }

        public int hashCode() {
            int b11 = g.b(this.elementType.hashCode() * 31, 31, this.elements);
            Integer num = this.scrollPosition;
            return b11 + (num == null ? 0 : num.hashCode());
        }

        @NotNull
        public String toString() {
            SplitDynamicElementsAdapter.ElementType elementType = this.elementType;
            List<LogosElement> list = this.elements;
            Integer num = this.scrollPosition;
            StringBuilder sb2 = new StringBuilder("LogosCarousel(elementType=");
            sb2.append(elementType);
            sb2.append(", elements=");
            sb2.append(list);
            sb2.append(", scrollPosition=");
            return a.c(sb2, num, ")");
        }
    }

    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000e¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b$\u0010#R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010%\u001a\u0004\b&\u0010'R\u001f\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010(\u001a\u0004\b)\u0010*R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010+\u001a\u0004\b,\u0010-R%\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u0011\u0010.\u001a\u0004\b/\u00100¨\u00061"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/common/splitDynamicElements/data/SplitDynamicElementVO$ProductsBlock;", "Lru/ozon/app/android/checkoutcomposer/common/splitDynamicElements/data/SplitDynamicElementVO;", "Lru/ozon/app/android/checkoutcomposer/common/splitDynamicElements/presentation/SplitDynamicElementsAdapter$ElementType;", "elementType", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "badge", "", "Lru/ozon/app/android/checkoutcomposer/common/splitDynamicElements/data/DynamicElementDTO$ProductsBlockDTO$PromotedProduct;", "promotedProducts", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "action", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "<init>", "(Lru/ozon/app/android/checkoutcomposer/common/splitDynamicElements/presentation/SplitDynamicElementsAdapter$ElementType;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Ljava/util/List;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/checkoutcomposer/common/splitDynamicElements/presentation/SplitDynamicElementsAdapter$ElementType;", "getElementType", "()Lru/ozon/app/android/checkoutcomposer/common/splitDynamicElements/presentation/SplitDynamicElementsAdapter$ElementType;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "Ljava/util/List;", "getPromotedProducts", "()Ljava/util/List;", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "Ljava/util/Map;", "getTrackingInfo", "()Ljava/util/Map;", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ProductsBlock extends SplitDynamicElementVO {
        private final AtomActionDTO action;
        private final BadgeDTO badge;

        @NotNull
        private final SplitDynamicElementsAdapter.ElementType elementType;
        private final List<DynamicElementDTO.ProductsBlockDTO.PromotedProduct> promotedProducts;

        @NotNull
        private final TextDTO subtitle;

        @NotNull
        private final TextDTO title;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ProductsBlock(@NotNull SplitDynamicElementsAdapter.ElementType elementType, @NotNull TextDTO title, @NotNull TextDTO subtitle, BadgeDTO badgeDTO, List<DynamicElementDTO.ProductsBlockDTO.PromotedProduct> list, AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map) {
            super(null);
            Intrinsics.checkNotNullParameter(elementType, "elementType");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            this.elementType = elementType;
            this.title = title;
            this.subtitle = subtitle;
            this.badge = badgeDTO;
            this.promotedProducts = list;
            this.action = atomActionDTO;
            this.trackingInfo = map;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ProductsBlock)) {
                return false;
            }
            ProductsBlock productsBlock = (ProductsBlock) other;
            return this.elementType == productsBlock.elementType && Intrinsics.d(this.title, productsBlock.title) && Intrinsics.d(this.subtitle, productsBlock.subtitle) && Intrinsics.d(this.badge, productsBlock.badge) && Intrinsics.d(this.promotedProducts, productsBlock.promotedProducts) && Intrinsics.d(this.action, productsBlock.action) && Intrinsics.d(this.trackingInfo, productsBlock.trackingInfo);
        }

        public final AtomActionDTO getAction() {
            return this.action;
        }

        public final BadgeDTO getBadge() {
            return this.badge;
        }

        @Override // ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data.SplitDynamicElementVO
        @NotNull
        public SplitDynamicElementsAdapter.ElementType getElementType() {
            return this.elementType;
        }

        public final List<DynamicElementDTO.ProductsBlockDTO.PromotedProduct> getPromotedProducts() {
            return this.promotedProducts;
        }

        @NotNull
        public final TextDTO getSubtitle() {
            return this.subtitle;
        }

        @NotNull
        public final TextDTO getTitle() {
            return this.title;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int a11 = b.a(this.subtitle, b.a(this.title, this.elementType.hashCode() * 31, 31), 31);
            BadgeDTO badgeDTO = this.badge;
            int hashCode = (a11 + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31;
            List<DynamicElementDTO.ProductsBlockDTO.PromotedProduct> list = this.promotedProducts;
            int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
            AtomActionDTO atomActionDTO = this.action;
            int hashCode3 = (hashCode2 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return hashCode3 + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            SplitDynamicElementsAdapter.ElementType elementType = this.elementType;
            TextDTO textDTO = this.title;
            TextDTO textDTO2 = this.subtitle;
            BadgeDTO badgeDTO = this.badge;
            List<DynamicElementDTO.ProductsBlockDTO.PromotedProduct> list = this.promotedProducts;
            AtomActionDTO atomActionDTO = this.action;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            StringBuilder sb2 = new StringBuilder("ProductsBlock(elementType=");
            sb2.append(elementType);
            sb2.append(", title=");
            sb2.append(textDTO);
            sb2.append(", subtitle=");
            sb2.append(textDTO2);
            sb2.append(", badge=");
            sb2.append(badgeDTO);
            sb2.append(", promotedProducts=");
            sb2.append(list);
            sb2.append(", action=");
            sb2.append(atomActionDTO);
            sb2.append(", trackingInfo=");
            return P.f(sb2, map, ")");
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/common/splitDynamicElements/data/SplitDynamicElementVO$ProgressiveTextElement;", "Lru/ozon/app/android/checkoutcomposer/common/splitDynamicElements/data/SplitDynamicElementVO;", "Lru/ozon/app/android/checkoutcomposer/common/splitDynamicElements/presentation/SplitDynamicElementsAdapter$ElementType;", "elementType", "Lru/ozon/app/android/common/progressivemolecula/presentation/ProgressiveTextWidgetVO$ProgressiveTextVO;", "progressiveText", "<init>", "(Lru/ozon/app/android/checkoutcomposer/common/splitDynamicElements/presentation/SplitDynamicElementsAdapter$ElementType;Lru/ozon/app/android/common/progressivemolecula/presentation/ProgressiveTextWidgetVO$ProgressiveTextVO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/checkoutcomposer/common/splitDynamicElements/presentation/SplitDynamicElementsAdapter$ElementType;", "getElementType", "()Lru/ozon/app/android/checkoutcomposer/common/splitDynamicElements/presentation/SplitDynamicElementsAdapter$ElementType;", "Lru/ozon/app/android/common/progressivemolecula/presentation/ProgressiveTextWidgetVO$ProgressiveTextVO;", "getProgressiveText", "()Lru/ozon/app/android/common/progressivemolecula/presentation/ProgressiveTextWidgetVO$ProgressiveTextVO;", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ProgressiveTextElement extends SplitDynamicElementVO {

        @NotNull
        private final SplitDynamicElementsAdapter.ElementType elementType;

        @NotNull
        private final ProgressiveTextWidgetVO.ProgressiveTextVO progressiveText;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ProgressiveTextElement(@NotNull SplitDynamicElementsAdapter.ElementType elementType, @NotNull ProgressiveTextWidgetVO.ProgressiveTextVO progressiveText) {
            super(null);
            Intrinsics.checkNotNullParameter(elementType, "elementType");
            Intrinsics.checkNotNullParameter(progressiveText, "progressiveText");
            this.elementType = elementType;
            this.progressiveText = progressiveText;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ProgressiveTextElement)) {
                return false;
            }
            ProgressiveTextElement progressiveTextElement = (ProgressiveTextElement) other;
            return this.elementType == progressiveTextElement.elementType && Intrinsics.d(this.progressiveText, progressiveTextElement.progressiveText);
        }

        @Override // ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data.SplitDynamicElementVO
        @NotNull
        public SplitDynamicElementsAdapter.ElementType getElementType() {
            return this.elementType;
        }

        @NotNull
        public final ProgressiveTextWidgetVO.ProgressiveTextVO getProgressiveText() {
            return this.progressiveText;
        }

        public int hashCode() {
            return this.progressiveText.hashCode() + (this.elementType.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "ProgressiveTextElement(elementType=" + this.elementType + ", progressiveText=" + this.progressiveText + ")";
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0019\u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u001a\u0010\u000e¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/common/splitDynamicElements/data/SplitDynamicElementVO$Separator;", "Lru/ozon/app/android/checkoutcomposer/common/splitDynamicElements/data/SplitDynamicElementVO;", "Lru/ozon/app/android/checkoutcomposer/common/splitDynamicElements/presentation/SplitDynamicElementsAdapter$ElementType;", "elementType", "", "color", "leftInset", "rightInset", "<init>", "(Lru/ozon/app/android/checkoutcomposer/common/splitDynamicElements/presentation/SplitDynamicElementsAdapter$ElementType;III)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/checkoutcomposer/common/splitDynamicElements/presentation/SplitDynamicElementsAdapter$ElementType;", "getElementType", "()Lru/ozon/app/android/checkoutcomposer/common/splitDynamicElements/presentation/SplitDynamicElementsAdapter$ElementType;", "I", "getColor", "getLeftInset", "getRightInset", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Separator extends SplitDynamicElementVO {
        private final int color;

        @NotNull
        private final SplitDynamicElementsAdapter.ElementType elementType;
        private final int leftInset;
        private final int rightInset;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Separator(@NotNull SplitDynamicElementsAdapter.ElementType elementType, int i11, int i12, int i13) {
            super(null);
            Intrinsics.checkNotNullParameter(elementType, "elementType");
            this.elementType = elementType;
            this.color = i11;
            this.leftInset = i12;
            this.rightInset = i13;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Separator)) {
                return false;
            }
            Separator separator = (Separator) other;
            return this.elementType == separator.elementType && this.color == separator.color && this.leftInset == separator.leftInset && this.rightInset == separator.rightInset;
        }

        public final int getColor() {
            return this.color;
        }

        @Override // ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data.SplitDynamicElementVO
        @NotNull
        public SplitDynamicElementsAdapter.ElementType getElementType() {
            return this.elementType;
        }

        public final int getLeftInset() {
            return this.leftInset;
        }

        public final int getRightInset() {
            return this.rightInset;
        }

        public int hashCode() {
            return Integer.hashCode(this.rightInset) + C2454a.a(this.leftInset, C2454a.a(this.color, this.elementType.hashCode() * 31, 31), 31);
        }

        @NotNull
        public String toString() {
            SplitDynamicElementsAdapter.ElementType elementType = this.elementType;
            int i11 = this.color;
            int i12 = this.leftInset;
            int i13 = this.rightInset;
            StringBuilder sb2 = new StringBuilder("Separator(elementType=");
            sb2.append(elementType);
            sb2.append(", color=");
            sb2.append(i11);
            sb2.append(", leftInset=");
            return J0.P.a(i12, i13, ", rightInset=", ")", sb2);
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u001a\u001bB\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/common/splitDynamicElements/data/SplitDynamicElementVO$TagListElement;", "Lru/ozon/app/android/checkoutcomposer/common/splitDynamicElements/data/SplitDynamicElementVO;", "Lru/ozon/app/android/checkoutcomposer/common/splitDynamicElements/presentation/SplitDynamicElementsAdapter$ElementType;", "elementType", "", "Lru/ozon/app/android/checkoutcomposer/common/splitDynamicElements/data/SplitDynamicElementVO$TagListElement$TagItem;", "tags", "<init>", "(Lru/ozon/app/android/checkoutcomposer/common/splitDynamicElements/presentation/SplitDynamicElementsAdapter$ElementType;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/checkoutcomposer/common/splitDynamicElements/presentation/SplitDynamicElementsAdapter$ElementType;", "getElementType", "()Lru/ozon/app/android/checkoutcomposer/common/splitDynamicElements/presentation/SplitDynamicElementsAdapter$ElementType;", "Ljava/util/List;", "getTags", "()Ljava/util/List;", "TagItem", "Tooltip", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TagListElement extends SplitDynamicElementVO {

        @NotNull
        private final SplitDynamicElementsAdapter.ElementType elementType;

        @NotNull
        private final List<TagItem> tags;

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/common/splitDynamicElements/data/SplitDynamicElementVO$TagListElement$TagItem;", "", "Lru/ozon/uni/atoms/data/controls/tag/TagButtonDTO;", "button", "Lru/ozon/app/android/checkoutcomposer/common/splitDynamicElements/data/SplitDynamicElementVO$TagListElement$Tooltip;", "tooltip", "<init>", "(Lru/ozon/uni/atoms/data/controls/tag/TagButtonDTO;Lru/ozon/app/android/checkoutcomposer/common/splitDynamicElements/data/SplitDynamicElementVO$TagListElement$Tooltip;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/controls/tag/TagButtonDTO;", "getButton", "()Lru/ozon/uni/atoms/data/controls/tag/TagButtonDTO;", "Lru/ozon/app/android/checkoutcomposer/common/splitDynamicElements/data/SplitDynamicElementVO$TagListElement$Tooltip;", "getTooltip", "()Lru/ozon/app/android/checkoutcomposer/common/splitDynamicElements/data/SplitDynamicElementVO$TagListElement$Tooltip;", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class TagItem {

            @NotNull
            private final TagButtonDTO button;
            private final Tooltip tooltip;

            public TagItem(@NotNull TagButtonDTO button, Tooltip tooltip) {
                Intrinsics.checkNotNullParameter(button, "button");
                this.button = button;
                this.tooltip = tooltip;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof TagItem)) {
                    return false;
                }
                TagItem tagItem = (TagItem) other;
                return Intrinsics.d(this.button, tagItem.button) && Intrinsics.d(this.tooltip, tagItem.tooltip);
            }

            @NotNull
            public final TagButtonDTO getButton() {
                return this.button;
            }

            public final Tooltip getTooltip() {
                return this.tooltip;
            }

            public int hashCode() {
                int hashCode = this.button.hashCode() * 31;
                Tooltip tooltip = this.tooltip;
                return hashCode + (tooltip == null ? 0 : tooltip.hashCode());
            }

            @NotNull
            public String toString() {
                return "TagItem(button=" + this.button + ", tooltip=" + this.tooltip + ")";
            }
        }

        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u000fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\u0019\u001a\u0004\b\u001c\u0010\u001b¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/common/splitDynamicElements/data/SplitDynamicElementVO$TagListElement$Tooltip;", "", "Lru/ozon/app/android/cart/ui/tooltip/CartTooltipVO;", "tooltip", "", "index", "", "closeTimeout", "showDelay", "<init>", "(Lru/ozon/app/android/cart/ui/tooltip/CartTooltipVO;ILjava/lang/Long;Ljava/lang/Long;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/cart/ui/tooltip/CartTooltipVO;", "getTooltip", "()Lru/ozon/app/android/cart/ui/tooltip/CartTooltipVO;", "I", "getIndex", "Ljava/lang/Long;", "getCloseTimeout", "()Ljava/lang/Long;", "getShowDelay", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Tooltip {
            private final Long closeTimeout;
            private final int index;
            private final Long showDelay;

            @NotNull
            private final CartTooltipVO tooltip;

            public Tooltip(@NotNull CartTooltipVO tooltip, int i11, Long l11, Long l12) {
                Intrinsics.checkNotNullParameter(tooltip, "tooltip");
                this.tooltip = tooltip;
                this.index = i11;
                this.closeTimeout = l11;
                this.showDelay = l12;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Tooltip)) {
                    return false;
                }
                Tooltip tooltip = (Tooltip) other;
                return Intrinsics.d(this.tooltip, tooltip.tooltip) && this.index == tooltip.index && Intrinsics.d(this.closeTimeout, tooltip.closeTimeout) && Intrinsics.d(this.showDelay, tooltip.showDelay);
            }

            public final Long getCloseTimeout() {
                return this.closeTimeout;
            }

            public final Long getShowDelay() {
                return this.showDelay;
            }

            @NotNull
            public final CartTooltipVO getTooltip() {
                return this.tooltip;
            }

            public int hashCode() {
                int a11 = C2454a.a(this.index, this.tooltip.hashCode() * 31, 31);
                Long l11 = this.closeTimeout;
                int hashCode = (a11 + (l11 == null ? 0 : l11.hashCode())) * 31;
                Long l12 = this.showDelay;
                return hashCode + (l12 != null ? l12.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                return "Tooltip(tooltip=" + this.tooltip + ", index=" + this.index + ", closeTimeout=" + this.closeTimeout + ", showDelay=" + this.showDelay + ")";
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TagListElement(@NotNull SplitDynamicElementsAdapter.ElementType elementType, @NotNull List<TagItem> tags) {
            super(null);
            Intrinsics.checkNotNullParameter(elementType, "elementType");
            Intrinsics.checkNotNullParameter(tags, "tags");
            this.elementType = elementType;
            this.tags = tags;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TagListElement)) {
                return false;
            }
            TagListElement tagListElement = (TagListElement) other;
            return this.elementType == tagListElement.elementType && Intrinsics.d(this.tags, tagListElement.tags);
        }

        @Override // ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data.SplitDynamicElementVO
        @NotNull
        public SplitDynamicElementsAdapter.ElementType getElementType() {
            return this.elementType;
        }

        @NotNull
        public final List<TagItem> getTags() {
            return this.tags;
        }

        public int hashCode() {
            return this.tags.hashCode() + (this.elementType.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "TagListElement(elementType=" + this.elementType + ", tags=" + this.tags + ")";
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\f¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/common/splitDynamicElements/data/SplitDynamicElementVO$VerticalSpacer;", "Lru/ozon/app/android/checkoutcomposer/common/splitDynamicElements/data/SplitDynamicElementVO;", "Lru/ozon/app/android/checkoutcomposer/common/splitDynamicElements/presentation/SplitDynamicElementsAdapter$ElementType;", "elementType", "", "spacing", "<init>", "(Lru/ozon/app/android/checkoutcomposer/common/splitDynamicElements/presentation/SplitDynamicElementsAdapter$ElementType;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/checkoutcomposer/common/splitDynamicElements/presentation/SplitDynamicElementsAdapter$ElementType;", "getElementType", "()Lru/ozon/app/android/checkoutcomposer/common/splitDynamicElements/presentation/SplitDynamicElementsAdapter$ElementType;", "I", "getSpacing", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class VerticalSpacer extends SplitDynamicElementVO {

        @NotNull
        private final SplitDynamicElementsAdapter.ElementType elementType;
        private final int spacing;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public VerticalSpacer(@NotNull SplitDynamicElementsAdapter.ElementType elementType, int i11) {
            super(null);
            Intrinsics.checkNotNullParameter(elementType, "elementType");
            this.elementType = elementType;
            this.spacing = i11;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof VerticalSpacer)) {
                return false;
            }
            VerticalSpacer verticalSpacer = (VerticalSpacer) other;
            return this.elementType == verticalSpacer.elementType && this.spacing == verticalSpacer.spacing;
        }

        @Override // ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data.SplitDynamicElementVO
        @NotNull
        public SplitDynamicElementsAdapter.ElementType getElementType() {
            return this.elementType;
        }

        public final int getSpacing() {
            return this.spacing;
        }

        public int hashCode() {
            return Integer.hashCode(this.spacing) + (this.elementType.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "VerticalSpacer(elementType=" + this.elementType + ", spacing=" + this.spacing + ")";
        }
    }

    public /* synthetic */ SplitDynamicElementVO(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @NotNull
    public abstract SplitDynamicElementsAdapter.ElementType getElementType();

    private SplitDynamicElementVO() {
    }
}
