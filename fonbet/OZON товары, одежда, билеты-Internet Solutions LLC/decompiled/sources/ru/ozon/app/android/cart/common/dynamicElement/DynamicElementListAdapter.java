package ru.ozon.app.android.cart.common.dynamicElement;

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
import ru.ozon.app.android.atoms.data.badge.MultilineBadge;
import ru.ozon.app.android.atoms.data.badge.TimerBadge;
import ru.ozon.app.android.atoms.data.disclaimer.DisclaimerAtom;
import ru.ozon.app.android.atoms.data.price.PriceWithTitle;
import ru.ozon.app.android.atoms.rv.atom.AtomItemViewHolder;
import ru.ozon.app.android.atoms.v3.holders.disclaimer.DisclaimerHolder;
import ru.ozon.app.android.atoms.v3.holders.multilineBadge.MultilineBadgeHolder;
import ru.ozon.app.android.atoms.v3.holders.priceWithTitle.PriceWithTitleHolder;
import ru.ozon.app.android.atoms.v3.holders.timerBadge.TimerBadgeHolder;
import ru.ozon.app.android.cart.UtilsKt;
import ru.ozon.app.android.cart.common.dynamicElement.DynamicElementVO;
import ru.ozon.app.android.cart.common.dynamicElement.atom.AtomItemPreCreateViewVH;
import ru.ozon.app.android.cart.common.dynamicElement.badges.BadgesViewVH;
import ru.ozon.app.android.cart.common.dynamicElement.cell.CellWithSubtitle24IconVH;
import ru.ozon.app.android.cart.common.dynamicElement.priceList.PriceListVH;
import ru.ozon.app.android.cart.common.dynamicElement.progressiveText.ProgressiveTextVH;
import ru.ozon.app.android.cart.common.dynamicElement.verticalSpacer.CartSplitVerticalSpacerView;
import ru.ozon.app.android.cart.common.dynamicElement.verticalSpacer.VerticalSpacerPreCreateViewVH;
import ru.ozon.app.android.cart.feature.R$id;
import ru.ozon.app.android.common.progressivemolecula.view.ProgressiveTextView;
import ru.ozon.app.android.uikit.view.atoms.cells.subtitled.CellWithSubtitle24IconView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.price.Price;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import ru.ozon.uni.atoms.v3.containers.SingleAtom;
import ru.ozon.uni.atoms.v3.holders.price.PriceAtomHolder;
import ru.ozon.uni.atoms.v3.holders.price.PriceHolder;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolder;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001b\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\f\u001a\u00020\u000b*\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001a¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/cart/common/dynamicElement/DynamicElementListAdapter;", "Landroidx/recyclerview/widget/t;", "Lru/ozon/app/android/cart/common/dynamicElement/DynamicElementVO;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/cart/common/dynamicElement/DynamicElementVO$Atom;", "Lru/ozon/app/android/cart/common/dynamicElement/DynamicElementType;", "dynamicElementTypeOfAtom", "(Lru/ozon/app/android/cart/common/dynamicElement/DynamicElementVO$Atom;)Lru/ozon/app/android/cart/common/dynamicElement/DynamicElementType;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$C;", "position", "getItemViewType", "(I)I", "holder", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$C;I)V", "Lkotlin/jvm/functions/Function1;", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class DynamicElementListAdapter extends t<DynamicElementVO, RecyclerView.C> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DynamicElementListAdapter(@NotNull Function1<? super AtomAction, Unit> actionHandler) {
        super(new i.d<DynamicElementVO>() { // from class: ru.ozon.app.android.cart.common.dynamicElement.DynamicElementListAdapter.1
            @Override // androidx.recyclerview.widget.i.d
            public boolean areContentsTheSame(DynamicElementVO oldItem, DynamicElementVO newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return Intrinsics.d(oldItem, newItem);
            }

            @Override // androidx.recyclerview.widget.i.d
            public boolean areItemsTheSame(DynamicElementVO oldItem, DynamicElementVO newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return oldItem.getClass().equals(newItem.getClass());
            }
        });
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        this.actionHandler = actionHandler;
    }

    private final DynamicElementType dynamicElementTypeOfAtom(DynamicElementVO.Atom atom) {
        AtomDTO atom2 = atom.getAtom();
        return atom2 instanceof TextAtom ? DynamicElementType.TEXT_ATOM : atom2 instanceof Price ? DynamicElementType.PRICE_ATOM : atom2 instanceof PriceWithTitle ? DynamicElementType.PRICE_WITH_TITLE_ATOM : atom2 instanceof PriceDTO ? DynamicElementType.PRICE_V2_ATOM : atom2 instanceof MultilineBadge ? DynamicElementType.MULTILINE_BADGE_ATOM : atom2 instanceof TimerBadge ? DynamicElementType.TIMER_ATOM : atom2 instanceof DisclaimerAtom ? DynamicElementType.ANNOTATION_ATOM : DynamicElementType.ATOM;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int getItemViewType(int position) {
        DynamicElementType dynamicElementType;
        DynamicElementVO item = getItem(position);
        if (item instanceof DynamicElementVO.Atom) {
            dynamicElementType = dynamicElementTypeOfAtom((DynamicElementVO.Atom) item);
        } else if (item instanceof DynamicElementVO.VerticalSpacer) {
            dynamicElementType = DynamicElementType.VERTICAL_SPACER;
        } else if (item instanceof DynamicElementVO.Badges) {
            dynamicElementType = DynamicElementType.BADGES;
        } else if (item instanceof DynamicElementVO.CellWithSubtitle24Icon) {
            dynamicElementType = DynamicElementType.CELL_WITH_SUBTITLE_24_ICON;
        } else if (item instanceof DynamicElementVO.PriceList) {
            dynamicElementType = DynamicElementType.PRICE_LIST;
        } else {
            if (!(item instanceof DynamicElementVO.ProgressiveText)) {
                throw new o();
            }
            dynamicElementType = DynamicElementType.PROGRESSIVE_TEXT;
        }
        return dynamicElementType.getId();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull RecyclerView.C holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        DynamicElementVO item = getItem(position);
        if (holder instanceof AtomItemViewHolder) {
            if (item instanceof DynamicElementVO.Atom) {
                ((AtomItemViewHolder) holder).bind(((DynamicElementVO.Atom) item).getAtom());
                return;
            }
            return;
        }
        if (holder instanceof AtomItemPreCreateViewVH) {
            if (item instanceof DynamicElementVO.Atom) {
                ((AtomItemPreCreateViewVH) holder).bind((DynamicElementVO.Atom) item);
                return;
            }
            return;
        }
        if (holder instanceof VerticalSpacerPreCreateViewVH) {
            if (item instanceof DynamicElementVO.VerticalSpacer) {
                ((VerticalSpacerPreCreateViewVH) holder).bind((DynamicElementVO.VerticalSpacer) item);
                return;
            }
            return;
        }
        if (holder instanceof BadgesViewVH) {
            if (item instanceof DynamicElementVO.Badges) {
                ((BadgesViewVH) holder).bind((DynamicElementVO.Badges) item);
            }
        } else if (holder instanceof CellWithSubtitle24IconVH) {
            if (item instanceof DynamicElementVO.CellWithSubtitle24Icon) {
                ((CellWithSubtitle24IconVH) holder).bind((DynamicElementVO.CellWithSubtitle24Icon) item);
            }
        } else if (holder instanceof ProgressiveTextVH) {
            if (item instanceof DynamicElementVO.ProgressiveText) {
                ((ProgressiveTextVH) holder).bind((DynamicElementVO.ProgressiveText) item);
            }
        } else if ((holder instanceof PriceListVH) && (item instanceof DynamicElementVO.PriceList)) {
            ((PriceListVH) holder).bind((DynamicElementVO.PriceList) item);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public RecyclerView.C onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        if (viewType == DynamicElementType.TEXT_ATOM.getId()) {
            Intrinsics.f(context);
            AtomItemViewHolder createVH$default = DynamicElementFactoriesKt.createVH$default(new TextAtomHolder(context, (String) null), this.actionHandler, null, 2, null);
            createVH$default.itemView.setId(R$id.textAtom);
            return createVH$default;
        }
        if (viewType == DynamicElementType.PRICE_ATOM.getId()) {
            Intrinsics.f(context);
            AtomItemViewHolder createVH$default2 = DynamicElementFactoriesKt.createVH$default(new PriceHolder(context, (String) null), this.actionHandler, null, 2, null);
            createVH$default2.itemView.setId(R$id.priceAtom);
            return createVH$default2;
        }
        if (viewType == DynamicElementType.PRICE_WITH_TITLE_ATOM.getId()) {
            Intrinsics.f(context);
            AtomItemViewHolder createVH$default3 = DynamicElementFactoriesKt.createVH$default(new PriceWithTitleHolder(context, (String) null), this.actionHandler, null, 2, null);
            createVH$default3.itemView.setId(R$id.priceWithTitleAtom);
            return createVH$default3;
        }
        if (viewType == DynamicElementType.PRICE_V2_ATOM.getId()) {
            Intrinsics.f(context);
            AtomItemViewHolder createVH$default4 = DynamicElementFactoriesKt.createVH$default(new PriceAtomHolder(context, (String) null), this.actionHandler, null, 2, null);
            createVH$default4.itemView.setId(R$id.priceV2Atom);
            return createVH$default4;
        }
        if (viewType == DynamicElementType.MULTILINE_BADGE_ATOM.getId()) {
            Intrinsics.f(context);
            return DynamicElementFactoriesKt.createVH$default(new MultilineBadgeHolder(context, (String) null), this.actionHandler, null, 2, null);
        }
        if (viewType == DynamicElementType.TIMER_ATOM.getId()) {
            Intrinsics.f(context);
            return DynamicElementFactoriesKt.createVH(new TimerBadgeHolder(context, (String) null), this.actionHandler, new ViewGroup.MarginLayoutParams(-2, -2));
        }
        if (viewType == DynamicElementType.ANNOTATION_ATOM.getId()) {
            Intrinsics.f(context);
            return DynamicElementFactoriesKt.createVH$default(new DisclaimerHolder(context, (String) null), this.actionHandler, null, 2, null);
        }
        if (viewType == DynamicElementType.ATOM.getId()) {
            Intrinsics.f(context);
            View i11 = q.f64554a.i(N.b(SingleAtom.class), context);
            if (i11 == null) {
                i11 = new SingleAtom(context, null, 0, 0, 14, null);
            }
            SingleAtom singleAtom = (SingleAtom) i11;
            singleAtom.setLayoutParams(UtilsKt.createDefaultMarginLayoutParams());
            return new AtomItemPreCreateViewVH(singleAtom, this.actionHandler);
        }
        if (viewType == DynamicElementType.VERTICAL_SPACER.getId()) {
            Intrinsics.f(context);
            View i12 = q.f64554a.i(N.b(CartSplitVerticalSpacerView.class), context);
            if (i12 == null) {
                i12 = new CartSplitVerticalSpacerView(context, null, 0, 6, null);
            }
            ((CartSplitVerticalSpacerView) i12).setLayoutParams(UtilsKt.createDefaultMarginLayoutParams());
            return new VerticalSpacerPreCreateViewVH(i12);
        }
        if (viewType == DynamicElementType.BADGES.getId()) {
            Intrinsics.f(context);
            return new BadgesViewVH(context, this.actionHandler);
        }
        if (viewType == DynamicElementType.PRICE_LIST.getId()) {
            Intrinsics.f(context);
            PriceListVH priceListVH = new PriceListVH(context);
            priceListVH.itemView.setId(R$id.priceList);
            return priceListVH;
        }
        if (viewType == DynamicElementType.CELL_WITH_SUBTITLE_24_ICON.getId()) {
            Intrinsics.f(context);
            View i13 = q.f64554a.i(N.b(CellWithSubtitle24IconView.class), context);
            if (i13 == null) {
                i13 = new CellWithSubtitle24IconView(context, null, 0, 6, null);
            }
            CellWithSubtitle24IconView cellWithSubtitle24IconView = (CellWithSubtitle24IconView) i13;
            cellWithSubtitle24IconView.setLayoutParams(UtilsKt.createDefaultMarginLayoutParams());
            return new CellWithSubtitle24IconVH(cellWithSubtitle24IconView, this.actionHandler);
        }
        if (viewType != DynamicElementType.PROGRESSIVE_TEXT.getId()) {
            throw new IllegalArgumentException(b.a(viewType, "Wrong viewType: "));
        }
        Intrinsics.f(context);
        View i14 = q.f64554a.i(N.b(ProgressiveTextView.class), context);
        if (i14 == null) {
            i14 = new ProgressiveTextView(context, null, 0, 6, null);
        }
        ProgressiveTextView progressiveTextView = (ProgressiveTextView) i14;
        progressiveTextView.setLayoutParams(UtilsKt.createDefaultMarginLayoutParams());
        return new ProgressiveTextVH(progressiveTextView, this.actionHandler);
    }
}
