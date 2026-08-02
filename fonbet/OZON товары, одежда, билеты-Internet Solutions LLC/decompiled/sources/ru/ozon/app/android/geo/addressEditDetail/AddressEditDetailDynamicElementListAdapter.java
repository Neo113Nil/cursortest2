package ru.ozon.app.android.geo.addressEditDetail;

import Ej.b;
import Sc.o;
import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.i;
import androidx.recyclerview.widget.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.af.holders.ButtonAtomHolder;
import ru.ozon.app.android.atoms.af.holders.ButtonBaseAtom;
import ru.ozon.app.android.atoms.af.holders.ButtonSecondaryAtom;
import ru.ozon.app.android.atoms.af.holders.HeaderAtom;
import ru.ozon.app.android.atoms.atom2.ButtonAtom;
import ru.ozon.app.android.atoms.atom2.TextAtom;
import ru.ozon.app.android.atoms.data.deprecated.CommonButton;
import ru.ozon.app.android.atoms.data.deprecated.CommonText;
import ru.ozon.app.android.atoms.data.deprecated.Header;
import ru.ozon.app.android.atoms.rv.atom.AtomItemViewHolder;
import ru.ozon.app.android.checkoutgeo.checkout.views.checkoutCellList.CheckoutCellListVH;
import ru.ozon.app.android.checkoutgeo.checkout.views.checkoutCellList.CheckoutCellListView;
import ru.ozon.app.android.geo.R$id;
import ru.ozon.app.android.geo.addressEditDetail.AddressEditDetailDynamicElementVO;
import ru.ozon.uni.atoms.af.Atom;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.deprecated.Button;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolder;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001b\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\f\u001a\u00020\u000b*\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ=\u0010\u0013\u001a\u00020\u0012*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u000e2\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00042\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010\"\u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\"\u0010#R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010$¨\u0006%"}, d2 = {"Lru/ozon/app/android/geo/addressEditDetail/AddressEditDetailDynamicElementListAdapter;", "Landroidx/recyclerview/widget/t;", "Lru/ozon/app/android/geo/addressEditDetail/AddressEditDetailDynamicElementVO;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/geo/addressEditDetail/AddressEditDetailDynamicElementVO$Atom;", "Lru/ozon/app/android/geo/addressEditDetail/AddressEditDetailDynamicElementType;", "dynamicElementTypeOfAtom", "(Lru/ozon/app/android/geo/addressEditDetail/AddressEditDetailDynamicElementVO$Atom;)Lru/ozon/app/android/geo/addressEditDetail/AddressEditDetailDynamicElementType;", "Lru/ozon/uni/atoms/af/Atom;", "onAction", "Lru/ozon/uni/atoms/af/Atom$AtomConfiguration;", "configuration", "Lru/ozon/app/android/atoms/rv/atom/AtomItemViewHolder;", "createVH", "(Lru/ozon/uni/atoms/af/Atom;Lkotlin/jvm/functions/Function1;Lru/ozon/uni/atoms/af/Atom$AtomConfiguration;)Lru/ozon/app/android/atoms/rv/atom/AtomItemViewHolder;", "Landroid/view/ViewGroup$MarginLayoutParams;", "createDefaultMarginLayoutParams", "()Landroid/view/ViewGroup$MarginLayoutParams;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$C;", "position", "getItemViewType", "(I)I", "holder", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$C;I)V", "Lkotlin/jvm/functions/Function1;", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AddressEditDetailDynamicElementListAdapter extends t<AddressEditDetailDynamicElementVO, RecyclerView.C> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AddressEditDetailDynamicElementListAdapter(@NotNull Function1<? super AtomAction, Unit> actionHandler) {
        super(new i.d<AddressEditDetailDynamicElementVO>() { // from class: ru.ozon.app.android.geo.addressEditDetail.AddressEditDetailDynamicElementListAdapter.1
            @Override // androidx.recyclerview.widget.i.d
            public boolean areContentsTheSame(AddressEditDetailDynamicElementVO oldItem, AddressEditDetailDynamicElementVO newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return Intrinsics.d(oldItem, newItem);
            }

            @Override // androidx.recyclerview.widget.i.d
            public boolean areItemsTheSame(AddressEditDetailDynamicElementVO oldItem, AddressEditDetailDynamicElementVO newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return oldItem.getClass().equals(newItem.getClass());
            }
        });
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        this.actionHandler = actionHandler;
    }

    private final ViewGroup.MarginLayoutParams createDefaultMarginLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    private final AtomItemViewHolder createVH(Atom<?, ?> atom, Function1<? super AtomAction, Unit> function1, Atom.AtomConfiguration atomConfiguration) {
        atom.getContainerView().setLayoutParams(createDefaultMarginLayoutParams());
        atom.setOnAtomAction(function1);
        return new AtomItemViewHolder(atom, atomConfiguration, null);
    }

    private final AddressEditDetailDynamicElementType dynamicElementTypeOfAtom(AddressEditDetailDynamicElementVO.Atom atom) {
        AtomDTO atom2 = atom.getAtom();
        return atom2 instanceof Header ? AddressEditDetailDynamicElementType.HEADER_ATOM : atom2 instanceof CommonText.TextMedium ? AddressEditDetailDynamicElementType.TEXT_MEDIUM_ATOM : atom2 instanceof CommonText.TextSmall ? AddressEditDetailDynamicElementType.TEXT_SMALL_ATOM : atom2 instanceof Button ? AddressEditDetailDynamicElementType.BUTTON_ATOM : atom2 instanceof CommonButton.ButtonSecondary ? AddressEditDetailDynamicElementType.BUTTON_SECONDARY_ATOM : AddressEditDetailDynamicElementType.ATOM;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int getItemViewType(int position) {
        AddressEditDetailDynamicElementType addressEditDetailDynamicElementType;
        AddressEditDetailDynamicElementVO item = getItem(position);
        if (item instanceof AddressEditDetailDynamicElementVO.Atom) {
            addressEditDetailDynamicElementType = dynamicElementTypeOfAtom((AddressEditDetailDynamicElementVO.Atom) item);
        } else {
            if (!(item instanceof AddressEditDetailDynamicElementVO.CheckoutCellList)) {
                throw new o();
            }
            addressEditDetailDynamicElementType = AddressEditDetailDynamicElementType.CHECKOUT_CELL_LIST;
        }
        return addressEditDetailDynamicElementType.getId();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull RecyclerView.C holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        AddressEditDetailDynamicElementVO item = getItem(position);
        if (holder instanceof AtomItemViewHolder) {
            if (item instanceof AddressEditDetailDynamicElementVO.Atom) {
                ((AtomItemViewHolder) holder).bind(((AddressEditDetailDynamicElementVO.Atom) item).getAtom());
            }
        } else if ((holder instanceof CheckoutCellListVH) && (item instanceof AddressEditDetailDynamicElementVO.CheckoutCellList)) {
            ((CheckoutCellListVH) holder).bind(((AddressEditDetailDynamicElementVO.CheckoutCellList) item).getCheckoutCellList());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public RecyclerView.C onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        if (viewType == AddressEditDetailDynamicElementType.HEADER_ATOM.getId()) {
            Intrinsics.f(context);
            AtomItemViewHolder createVH = createVH(new HeaderAtom(context, (String) null).withAction(this.actionHandler), this.actionHandler, new HeaderAtom.Configuration(0, 0, 0, 8, null, null, null, 5, false, null, 887, null));
            createVH.itemView.setId(R$id.headerAtom);
            return createVH;
        }
        if (viewType == AddressEditDetailDynamicElementType.TEXT_SMALL_ATOM.getId()) {
            Intrinsics.f(context);
            AtomItemViewHolder createVH2 = createVH(new TextAtomHolder(context, (String) null).withAction((Function1<? super AtomAction, Unit>) this.actionHandler), this.actionHandler, new TextAtom.Configuration(0, 0, 0, 0, 0, 0, 6, null, 0, false, false, 8, null, null, 0, 0, null, null, null, 522175, null));
            createVH2.itemView.setId(R$id.textSmallAtom);
            return createVH2;
        }
        if (viewType == AddressEditDetailDynamicElementType.TEXT_MEDIUM_ATOM.getId()) {
            Intrinsics.f(context);
            AtomItemViewHolder createVH3 = createVH(new TextAtomHolder(context, (String) null).withAction((Function1<? super AtomAction, Unit>) this.actionHandler), this.actionHandler, new TextAtom.Configuration(0, 0, 0, 0, 0, 0, 6, null, 0, false, false, 8, null, null, 0, 0, null, null, null, 522175, null));
            createVH3.itemView.setId(R$id.textMediumAtom);
            return createVH3;
        }
        if (viewType == AddressEditDetailDynamicElementType.BUTTON_ATOM.getId()) {
            Intrinsics.f(context);
            AtomItemViewHolder createVH4 = createVH(new ButtonAtomHolder(context, (String) null).withAction(this.actionHandler), this.actionHandler, new ButtonAtom.Configuration(0, 0, 8, 0, 11, null));
            createVH4.itemView.setId(R$id.buttonAtom);
            return createVH4;
        }
        if (viewType != AddressEditDetailDynamicElementType.BUTTON_SECONDARY_ATOM.getId()) {
            if (viewType != AddressEditDetailDynamicElementType.CHECKOUT_CELL_LIST.getId()) {
                throw new IllegalArgumentException(b.a(viewType, "Wrong viewType: "));
            }
            Context context2 = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            CheckoutCellListView checkoutCellListView = new CheckoutCellListView(context2, null, 0, false, 14, null);
            checkoutCellListView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            CheckoutCellListVH checkoutCellListVH = new CheckoutCellListVH(checkoutCellListView, this.actionHandler);
            checkoutCellListVH.itemView.setId(R$id.checkoutCellList);
            return checkoutCellListVH;
        }
        Intrinsics.f(context);
        AtomItemViewHolder createVH5 = createVH(new ButtonSecondaryAtom(context, (String) null).withAction(this.actionHandler), this.actionHandler, new ButtonBaseAtom.Configuration(0, 0, 8, 0, false, 0, null, 123, null));
        createVH5.itemView.setId(R$id.buttonSecondaryAtom);
        return createVH5;
    }
}
