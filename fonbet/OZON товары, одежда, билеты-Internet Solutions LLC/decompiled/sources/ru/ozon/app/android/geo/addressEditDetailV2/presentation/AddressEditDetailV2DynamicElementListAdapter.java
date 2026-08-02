package ru.ozon.app.android.geo.addressEditDetailV2.presentation;

import Ej.b;
import Sc.o;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.i;
import androidx.recyclerview.widget.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.rv.atom.AtomItemViewHolder;
import ru.ozon.app.android.checkoutgeo.checkout.views.checkoutCellList.CheckoutCellListVH;
import ru.ozon.app.android.checkoutgeo.checkout.views.checkoutCellList.CheckoutCellListView;
import ru.ozon.app.android.geo.R$id;
import ru.ozon.app.android.geo.addressEditDetailV2.presentation.AddressEditDetailV2DynamicElementVO;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.Atom;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.ButtonV3Holder;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0000\u0018\u0000 !2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001!B\u001b\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ=\u0010\u000f\u001a\u00020\u000e*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\n2\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001e\u0010\u001fR \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010 ¨\u0006\""}, d2 = {"Lru/ozon/app/android/geo/addressEditDetailV2/presentation/AddressEditDetailV2DynamicElementListAdapter;", "Landroidx/recyclerview/widget/t;", "Lru/ozon/app/android/geo/addressEditDetailV2/presentation/AddressEditDetailV2DynamicElementVO;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/uni/atoms/af/Atom;", "onAction", "Lru/ozon/uni/atoms/af/Atom$AtomConfiguration;", "configuration", "Lru/ozon/app/android/atoms/rv/atom/AtomItemViewHolder;", "createVH", "(Lru/ozon/uni/atoms/af/Atom;Lkotlin/jvm/functions/Function1;Lru/ozon/uni/atoms/af/Atom$AtomConfiguration;)Lru/ozon/app/android/atoms/rv/atom/AtomItemViewHolder;", "Landroid/view/ViewGroup$MarginLayoutParams;", "createDefaultMarginLayoutParams", "()Landroid/view/ViewGroup$MarginLayoutParams;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$C;", "position", "getItemViewType", "(I)I", "holder", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$C;I)V", "Lkotlin/jvm/functions/Function1;", "Companion", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AddressEditDetailV2DynamicElementListAdapter extends t<AddressEditDetailV2DynamicElementVO, RecyclerView.C> {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private static final int DP_16 = UiExtKt.toPx(16);
    private static final int DP_8 = UiExtKt.toPx(8);

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/geo/addressEditDetailV2/presentation/AddressEditDetailV2DynamicElementListAdapter$Companion;", "", "<init>", "()V", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AddressEditDetailV2DynamicElementListAdapter(@NotNull Function1<? super AtomAction, Unit> actionHandler) {
        super(new i.d<AddressEditDetailV2DynamicElementVO>() { // from class: ru.ozon.app.android.geo.addressEditDetailV2.presentation.AddressEditDetailV2DynamicElementListAdapter.1
            @Override // androidx.recyclerview.widget.i.d
            public boolean areContentsTheSame(AddressEditDetailV2DynamicElementVO oldItem, AddressEditDetailV2DynamicElementVO newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return Intrinsics.d(oldItem, newItem);
            }

            @Override // androidx.recyclerview.widget.i.d
            public boolean areItemsTheSame(AddressEditDetailV2DynamicElementVO oldItem, AddressEditDetailV2DynamicElementVO newItem) {
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

    static /* synthetic */ AtomItemViewHolder createVH$default(AddressEditDetailV2DynamicElementListAdapter addressEditDetailV2DynamicElementListAdapter, Atom atom, Function1 function1, Atom.AtomConfiguration atomConfiguration, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            atomConfiguration = null;
        }
        return addressEditDetailV2DynamicElementListAdapter.createVH(atom, function1, atomConfiguration);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int getItemViewType(int position) {
        AddressEditDetailV2DynamicElementType addressEditDetailV2DynamicElementType;
        AddressEditDetailV2DynamicElementVO item = getItem(position);
        if (item instanceof AddressEditDetailV2DynamicElementVO.Button) {
            addressEditDetailV2DynamicElementType = AddressEditDetailV2DynamicElementType.BUTTON;
        } else {
            if (!(item instanceof AddressEditDetailV2DynamicElementVO.CheckoutCellList)) {
                throw new o();
            }
            addressEditDetailV2DynamicElementType = AddressEditDetailV2DynamicElementType.CHECKOUT_CELL_LIST;
        }
        return addressEditDetailV2DynamicElementType.getId();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull RecyclerView.C holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        AddressEditDetailV2DynamicElementVO item = getItem(position);
        if (holder instanceof AtomItemViewHolder) {
            if (item instanceof AddressEditDetailV2DynamicElementVO.Button) {
                ((AtomItemViewHolder) holder).bind((AtomDTO) ((AddressEditDetailV2DynamicElementVO.Button) item).getButton());
            }
        } else if ((holder instanceof CheckoutCellListVH) && (item instanceof AddressEditDetailV2DynamicElementVO.CheckoutCellList)) {
            ((CheckoutCellListVH) holder).bind(((AddressEditDetailV2DynamicElementVO.CheckoutCellList) item).getCheckoutCellList());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public RecyclerView.C onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        if (viewType != AddressEditDetailV2DynamicElementType.BUTTON.getId()) {
            if (viewType != AddressEditDetailV2DynamicElementType.CHECKOUT_CELL_LIST.getId()) {
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
        AtomItemViewHolder createVH$default = createVH$default(this, new ButtonV3Holder(context, (String) null).withAction((Function1<? super AtomAction, Unit>) this.actionHandler), this.actionHandler, null, 2, null);
        createVH$default.itemView.setId(R$id.buttonAtom);
        View view = createVH$default.itemView;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Intrinsics.g(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int i11 = DP_16;
        marginLayoutParams.setMarginEnd(i11);
        marginLayoutParams.setMarginStart(i11);
        marginLayoutParams.topMargin = DP_8;
        view.setLayoutParams(marginLayoutParams);
        return createVH$default;
    }
}
