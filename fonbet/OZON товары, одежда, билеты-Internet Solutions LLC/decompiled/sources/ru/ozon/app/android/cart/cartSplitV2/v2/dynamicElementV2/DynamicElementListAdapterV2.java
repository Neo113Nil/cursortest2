package ru.ozon.app.android.cart.cartSplitV2.v2.dynamicElementV2;

import Ej.b;
import Sc.o;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.i;
import androidx.recyclerview.widget.t;
import gk0.q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.disclaimer.DisclaimerAtom;
import ru.ozon.app.android.atoms.rv.atom.AtomItemViewHolder;
import ru.ozon.app.android.atoms.v3.holders.disclaimer.DisclaimerHolder;
import ru.ozon.app.android.atoms.v3.molecules.DisclaimerContainer;
import ru.ozon.app.android.cart.UtilsKt;
import ru.ozon.app.android.cart.cartSplitV2.v2.dynamicElementV2.DynamicElementVOV2;
import ru.ozon.app.android.cart.cartSplitV2.v2.dynamicElementV2.badges.BadgesViewVHV2;
import ru.ozon.app.android.cart.cartSplitV2.v2.dynamicElementV2.priceList.PriceListVHV2;
import ru.ozon.app.android.cart.cartSplitV2.v2.dynamicElementV2.progressiveText.ProgressiveTextVHV2;
import ru.ozon.app.android.cart.cartSplitV2.v2.dynamicElementV2.verticalSpacer.CartSplitVerticalSpacerViewV2;
import ru.ozon.app.android.cart.cartSplitV2.v2.dynamicElementV2.verticalSpacer.VerticalSpacerVHV2;
import ru.ozon.app.android.cart.feature.R$id;
import ru.ozon.app.android.common.progressivemolecula.view.ProgressiveTextView;
import ru.ozon.uni.android.atom.price.ui.PriceAtomView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.cell.CellView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.v3.holders.cell.CellHolder;
import ru.ozon.uni.atoms.v3.holders.price.PriceAtomHolder;
import ru.ozon.uni.atoms.v3.holders.text.TextHolder;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001b\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\f\u001a\u00020\u000b*\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001a¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/v2/dynamicElementV2/DynamicElementListAdapterV2;", "Landroidx/recyclerview/widget/t;", "Lru/ozon/app/android/cart/cartSplitV2/v2/dynamicElementV2/DynamicElementVOV2;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/cart/cartSplitV2/v2/dynamicElementV2/DynamicElementVOV2$Atom;", "Lru/ozon/app/android/cart/cartSplitV2/v2/dynamicElementV2/DynamicElementTypeV2;", "dynamicElementTypeOfAtomV2", "(Lru/ozon/app/android/cart/cartSplitV2/v2/dynamicElementV2/DynamicElementVOV2$Atom;)Lru/ozon/app/android/cart/cartSplitV2/v2/dynamicElementV2/DynamicElementTypeV2;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$C;", "position", "getItemViewType", "(I)I", "holder", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$C;I)V", "Lkotlin/jvm/functions/Function1;", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class DynamicElementListAdapterV2 extends t<DynamicElementVOV2, RecyclerView.C> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DynamicElementListAdapterV2(@NotNull Function1<? super AtomAction, Unit> actionHandler) {
        super(new i.d<DynamicElementVOV2>() { // from class: ru.ozon.app.android.cart.cartSplitV2.v2.dynamicElementV2.DynamicElementListAdapterV2.1
            @Override // androidx.recyclerview.widget.i.d
            public boolean areContentsTheSame(DynamicElementVOV2 oldItem, DynamicElementVOV2 newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return Intrinsics.d(oldItem, newItem);
            }

            @Override // androidx.recyclerview.widget.i.d
            public boolean areItemsTheSame(DynamicElementVOV2 oldItem, DynamicElementVOV2 newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return oldItem.getClass().equals(newItem.getClass());
            }
        });
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        this.actionHandler = actionHandler;
    }

    private final DynamicElementTypeV2 dynamicElementTypeOfAtomV2(DynamicElementVOV2.Atom atom) {
        AtomDTO atom2 = atom.getAtom();
        if (atom2 instanceof TextDTO) {
            return DynamicElementTypeV2.TEXT_V2_ATOM;
        }
        if (atom2 instanceof PriceDTO) {
            return DynamicElementTypeV2.PRICE_V2_ATOM;
        }
        if (atom2 instanceof CellDTO) {
            return DynamicElementTypeV2.CELL_V2_ATOM;
        }
        if (atom2 instanceof DisclaimerAtom) {
            return DynamicElementTypeV2.ANNOTATION_ATOM;
        }
        throw new IllegalArgumentException("Unsupported atom: " + atom.getAtom());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int getItemViewType(int position) {
        DynamicElementTypeV2 dynamicElementTypeV2;
        DynamicElementVOV2 item = getItem(position);
        if (item instanceof DynamicElementVOV2.Atom) {
            dynamicElementTypeV2 = dynamicElementTypeOfAtomV2((DynamicElementVOV2.Atom) item);
        } else if (item instanceof DynamicElementVOV2.VerticalSpacer) {
            dynamicElementTypeV2 = DynamicElementTypeV2.VERTICAL_SPACER;
        } else if (item instanceof DynamicElementVOV2.Badges) {
            dynamicElementTypeV2 = DynamicElementTypeV2.BADGES;
        } else if (item instanceof DynamicElementVOV2.ProgressiveText) {
            dynamicElementTypeV2 = DynamicElementTypeV2.PROGRESSIVE_TEXT;
        } else {
            if (!(item instanceof DynamicElementVOV2.PriceList)) {
                throw new o();
            }
            dynamicElementTypeV2 = ((DynamicElementVOV2.PriceList) item).getIsFlexModeEnabled() ? DynamicElementTypeV2.PRICE_FLEX_LIST : DynamicElementTypeV2.PRICE_LIST;
        }
        return dynamicElementTypeV2.getId();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull RecyclerView.C holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        DynamicElementVOV2 item = getItem(position);
        if (holder instanceof AtomItemViewHolder) {
            if (item instanceof DynamicElementVOV2.Atom) {
                ((AtomItemViewHolder) holder).bind(((DynamicElementVOV2.Atom) item).getAtom());
                return;
            }
            return;
        }
        if (holder instanceof VerticalSpacerVHV2) {
            if (item instanceof DynamicElementVOV2.VerticalSpacer) {
                ((VerticalSpacerVHV2) holder).bind((DynamicElementVOV2.VerticalSpacer) item);
            }
        } else if (holder instanceof BadgesViewVHV2) {
            if (item instanceof DynamicElementVOV2.Badges) {
                ((BadgesViewVHV2) holder).bind((DynamicElementVOV2.Badges) item);
            }
        } else if (holder instanceof ProgressiveTextVHV2) {
            if (item instanceof DynamicElementVOV2.ProgressiveText) {
                ((ProgressiveTextVHV2) holder).bind((DynamicElementVOV2.ProgressiveText) item);
            }
        } else if ((holder instanceof PriceListVHV2) && (item instanceof DynamicElementVOV2.PriceList)) {
            ((PriceListVHV2) holder).bind((DynamicElementVOV2.PriceList) item);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public RecyclerView.C onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        if (viewType == DynamicElementTypeV2.TEXT_V2_ATOM.getId()) {
            Intrinsics.f(context);
            View i11 = q.f64554a.i(N.b(TextAtomV2View.class), context);
            if (i11 == null) {
                i11 = new TextAtomV2View(context, null, 0, 6, null);
            }
            TextAtomV2View textAtomV2View = (TextAtomV2View) i11;
            textAtomV2View.setId(R$id.textAtom);
            return DynamicElementFactoriesV2Kt.createVHV2$default(new TextHolder(textAtomV2View, (String) null), this.actionHandler, null, 2, null);
        }
        if (viewType == DynamicElementTypeV2.PRICE_V2_ATOM.getId()) {
            Intrinsics.f(context);
            View i12 = q.f64554a.i(N.b(PriceAtomView.class), context);
            if (i12 == null) {
                i12 = new PriceAtomView(context, null, 0, 6, null);
            }
            PriceAtomView priceAtomView = (PriceAtomView) i12;
            priceAtomView.setId(R$id.priceV2Atom);
            return DynamicElementFactoriesV2Kt.createVHV2$default(new PriceAtomHolder(priceAtomView, (String) null), this.actionHandler, null, 2, null);
        }
        if (viewType == DynamicElementTypeV2.CELL_V2_ATOM.getId()) {
            Intrinsics.f(context);
            View i13 = q.f64554a.i(N.b(CellView.class), context);
            if (i13 == null) {
                i13 = new CellView(context, null, 0, 0, null, 30, null);
            }
            CellView cellView = (CellView) i13;
            cellView.setId(R$id.cellAtom);
            return DynamicElementFactoriesV2Kt.createVHV2$default(new CellHolder(cellView, (String) null), this.actionHandler, null, 2, null);
        }
        if (viewType == DynamicElementTypeV2.ANNOTATION_ATOM.getId()) {
            Intrinsics.f(context);
            View i14 = q.f64554a.i(N.b(DisclaimerContainer.class), context);
            if (i14 == null) {
                i14 = new DisclaimerContainer(context, null, 0, 6, null);
            }
            return DynamicElementFactoriesV2Kt.createVHV2$default(new DisclaimerHolder((DisclaimerContainer) i14, (String) null), this.actionHandler, null, 2, null);
        }
        if (viewType == DynamicElementTypeV2.VERTICAL_SPACER.getId()) {
            Intrinsics.f(context);
            CartSplitVerticalSpacerViewV2 cartSplitVerticalSpacerViewV2 = new CartSplitVerticalSpacerViewV2(context, null, 0, 6, null);
            cartSplitVerticalSpacerViewV2.setLayoutParams(UtilsKt.createDefaultMarginLayoutParams());
            return new VerticalSpacerVHV2(cartSplitVerticalSpacerViewV2);
        }
        if (viewType == DynamicElementTypeV2.BADGES.getId()) {
            Intrinsics.f(context);
            return new BadgesViewVHV2(context, this.actionHandler);
        }
        if (viewType == DynamicElementTypeV2.PRICE_LIST.getId()) {
            Intrinsics.f(context);
            PriceListVHV2 priceListVHV2 = new PriceListVHV2(context, false);
            priceListVHV2.itemView.setId(R$id.priceList);
            return priceListVHV2;
        }
        if (viewType == DynamicElementTypeV2.PRICE_FLEX_LIST.getId()) {
            Intrinsics.f(context);
            PriceListVHV2 priceListVHV22 = new PriceListVHV2(context, true);
            priceListVHV22.itemView.setId(R$id.priceList);
            return priceListVHV22;
        }
        if (viewType != DynamicElementTypeV2.PROGRESSIVE_TEXT.getId()) {
            throw new IllegalArgumentException(b.a(viewType, "Wrong viewType: "));
        }
        Intrinsics.f(context);
        ProgressiveTextView progressiveTextView = new ProgressiveTextView(context, null, 0, 6, null);
        progressiveTextView.setLayoutParams(UtilsKt.createDefaultMarginLayoutParams());
        return new ProgressiveTextVHV2(progressiveTextView, this.actionHandler);
    }
}
