package ru.ozon.app.android.fresh.checkout.widgets.paymentInfoV2.presentation.dynamicElements;

import Sc.o;
import Xc.a;
import Xc.b;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.i;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.K;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.checkout.R$id;
import ru.ozon.app.android.fresh.checkout.ui.molecules.checkoutCellList.presentation.FreshCellListVH;
import ru.ozon.app.android.fresh.checkout.ui.molecules.checkoutCellList.presentation.FreshCellListView;
import ru.ozon.app.android.fresh.checkout.widgets.paymentInfoV2.presentation.FreshPaymentInfoVO;
import ru.ozon.app.android.fresh.checkout.widgets.paymentInfoV2.presentation.dynamicElements.diffutil.DynamicElementsDiffUtilCallback;
import ru.ozon.app.android.fresh.checkout.widgets.paymentInfoV2.presentation.view.ButtonContainerView;
import ru.ozon.app.android.uikit.view.atoms.cells.subtitled.CellWithSubtitleCheckboxRadioView;
import ru.ozon.app.android.uikit.view.atoms.cells.subtitled.CellWithSubtitleToggleView;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.containers.SingleAtom;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u0000 \u001f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001f B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u001a\u001a\u00020\u00052\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017¢\u0006\u0004\b\u001a\u0010\u001bR \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001cR\u001c\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"Lru/ozon/app/android/fresh/checkout/widgets/paymentInfoV2/presentation/dynamicElements/DynamicElementDiffUtilAdapter;", "Landroidx/recyclerview/widget/RecyclerView$g;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$C;", "position", "getItemViewType", "(I)I", "holder", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$C;I)V", "getItemCount", "()I", "", "Lru/ozon/app/android/fresh/checkout/widgets/paymentInfoV2/presentation/FreshPaymentInfoVO$DynamicElementVO;", "list", "submitItems", "(Ljava/util/List;)V", "Lkotlin/jvm/functions/Function1;", "items", "Ljava/util/List;", "Companion", "ElementType", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DynamicElementDiffUtilAdapter extends RecyclerView.g<RecyclerView.C> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private List<? extends FreshPaymentInfoVO.DynamicElementVO> items;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final int separatorViewHeight = ResourceExtKt.toPx(0.5d);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/fresh/checkout/widgets/paymentInfoV2/presentation/dynamicElements/DynamicElementDiffUtilAdapter$Companion;", "", "<init>", "()V", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/fresh/checkout/widgets/paymentInfoV2/presentation/dynamicElements/DynamicElementDiffUtilAdapter$ElementType;", "", "id", "", "<init>", "(Ljava/lang/String;II)V", "getId", "()I", "ATOM", "VERTICAL_SPACER", "SEPARATOR", "CELL_WITH_SUBTITLE_CHECKBOX_RADIO", "CELL_WITH_SUBTITLE_TOGGLE", "CHECKOUT_CELL_LIST", "BUTTON", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ElementType {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ ElementType[] $VALUES;
        private final int id;
        public static final ElementType ATOM = new ElementType("ATOM", 0, 1);
        public static final ElementType VERTICAL_SPACER = new ElementType("VERTICAL_SPACER", 1, 2);
        public static final ElementType SEPARATOR = new ElementType("SEPARATOR", 2, 3);
        public static final ElementType CELL_WITH_SUBTITLE_CHECKBOX_RADIO = new ElementType("CELL_WITH_SUBTITLE_CHECKBOX_RADIO", 3, 4);
        public static final ElementType CELL_WITH_SUBTITLE_TOGGLE = new ElementType("CELL_WITH_SUBTITLE_TOGGLE", 4, 5);
        public static final ElementType CHECKOUT_CELL_LIST = new ElementType("CHECKOUT_CELL_LIST", 5, 6);
        public static final ElementType BUTTON = new ElementType("BUTTON", 6, 7);

        private static final /* synthetic */ ElementType[] $values() {
            return new ElementType[]{ATOM, VERTICAL_SPACER, SEPARATOR, CELL_WITH_SUBTITLE_CHECKBOX_RADIO, CELL_WITH_SUBTITLE_TOGGLE, CHECKOUT_CELL_LIST, BUTTON};
        }

        static {
            ElementType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private ElementType(String str, int i11, int i12) {
            this.id = i12;
        }

        public static ElementType valueOf(String str) {
            return (ElementType) Enum.valueOf(ElementType.class, str);
        }

        public static ElementType[] values() {
            return (ElementType[]) $VALUES.clone();
        }

        public final int getId() {
            return this.id;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DynamicElementDiffUtilAdapter(@NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        this.actionHandler = actionHandler;
        this.items = K.f71697a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* renamed from: getItemCount */
    public int getShimmersCount() {
        return this.items.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int getItemViewType(int position) {
        FreshPaymentInfoVO.DynamicElementVO dynamicElementVO = this.items.get(position);
        if (dynamicElementVO instanceof FreshPaymentInfoVO.DynamicElementVO.Atom) {
            return ElementType.ATOM.getId();
        }
        if (dynamicElementVO instanceof FreshPaymentInfoVO.DynamicElementVO.VerticalSpacer) {
            return ElementType.VERTICAL_SPACER.getId();
        }
        if (dynamicElementVO instanceof FreshPaymentInfoVO.DynamicElementVO.Separator) {
            return ElementType.SEPARATOR.getId();
        }
        if (dynamicElementVO instanceof FreshPaymentInfoVO.DynamicElementVO.CellWithSubtitleCheckboxRadio) {
            return ElementType.CELL_WITH_SUBTITLE_CHECKBOX_RADIO.getId();
        }
        if (dynamicElementVO instanceof FreshPaymentInfoVO.DynamicElementVO.CellWithSubtitleToggle) {
            return ElementType.CELL_WITH_SUBTITLE_TOGGLE.getId();
        }
        if (dynamicElementVO instanceof FreshPaymentInfoVO.DynamicElementVO.CheckoutCellList) {
            return ElementType.CHECKOUT_CELL_LIST.getId();
        }
        if (dynamicElementVO instanceof FreshPaymentInfoVO.DynamicElementVO.Button) {
            return ElementType.BUTTON.getId();
        }
        throw new o();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull RecyclerView.C holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        FreshPaymentInfoVO.DynamicElementVO dynamicElementVO = this.items.get(position);
        if (holder instanceof AtomVH) {
            if (dynamicElementVO instanceof FreshPaymentInfoVO.DynamicElementVO.Atom) {
                ((AtomVH) holder).bind(((FreshPaymentInfoVO.DynamicElementVO.Atom) dynamicElementVO).getAtom());
                return;
            }
            return;
        }
        if (holder instanceof VerticalSpacerVH) {
            if (dynamicElementVO instanceof FreshPaymentInfoVO.DynamicElementVO.VerticalSpacer) {
                ((VerticalSpacerVH) holder).bind((FreshPaymentInfoVO.DynamicElementVO.VerticalSpacer) dynamicElementVO);
                return;
            }
            return;
        }
        if (holder instanceof CellWithSubtitleCheckboxRadioVH) {
            if (dynamicElementVO instanceof FreshPaymentInfoVO.DynamicElementVO.CellWithSubtitleCheckboxRadio) {
                ((CellWithSubtitleCheckboxRadioVH) holder).bind(((FreshPaymentInfoVO.DynamicElementVO.CellWithSubtitleCheckboxRadio) dynamicElementVO).getAtom());
            }
        } else if (holder instanceof CellWithSubtitleToggleVH) {
            if (dynamicElementVO instanceof FreshPaymentInfoVO.DynamicElementVO.CellWithSubtitleToggle) {
                ((CellWithSubtitleToggleVH) holder).bind(((FreshPaymentInfoVO.DynamicElementVO.CellWithSubtitleToggle) dynamicElementVO).getAtom());
            }
        } else if (holder instanceof FreshCellListVH) {
            if (dynamicElementVO instanceof FreshPaymentInfoVO.DynamicElementVO.CheckoutCellList) {
                ((FreshCellListVH) holder).bind(((FreshPaymentInfoVO.DynamicElementVO.CheckoutCellList) dynamicElementVO).getCheckoutCellList());
            }
        } else if ((holder instanceof ButtonVH) && (dynamicElementVO instanceof FreshPaymentInfoVO.DynamicElementVO.Button)) {
            ((ButtonVH) holder).bind(((FreshPaymentInfoVO.DynamicElementVO.Button) dynamicElementVO).getButton());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public RecyclerView.C onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (viewType == ElementType.ATOM.getId()) {
            Context context = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            SingleAtom singleAtom = new SingleAtom(context, null, 0, 0, 14, null);
            singleAtom.setId(R$id.itemSa);
            singleAtom.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            return new AtomVH(singleAtom, this.actionHandler);
        }
        if (viewType == ElementType.VERTICAL_SPACER.getId()) {
            View view = new View(parent.getContext());
            view.setId(R$id.spacerV);
            view.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            return new VerticalSpacerVH(view);
        }
        if (viewType == ElementType.SEPARATOR.getId()) {
            View view2 = new View(parent.getContext());
            view2.setId(R$id.separatorV);
            view2.setLayoutParams(new ViewGroup.LayoutParams(-1, separatorViewHeight));
            Context context2 = view2.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            view2.setBackgroundColor(ThemeExtKt.themeColor(context2, R$attr.oz_semantic_separator));
            return new SeparatorVH(view2);
        }
        if (viewType == ElementType.CELL_WITH_SUBTITLE_CHECKBOX_RADIO.getId()) {
            Context context3 = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            CellWithSubtitleCheckboxRadioView cellWithSubtitleCheckboxRadioView = new CellWithSubtitleCheckboxRadioView(context3, null, 0, 6, null);
            cellWithSubtitleCheckboxRadioView.setId(R$id.cellV);
            cellWithSubtitleCheckboxRadioView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            return new CellWithSubtitleCheckboxRadioVH(cellWithSubtitleCheckboxRadioView, this.actionHandler);
        }
        if (viewType == ElementType.CELL_WITH_SUBTITLE_TOGGLE.getId()) {
            Context context4 = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
            CellWithSubtitleToggleView cellWithSubtitleToggleView = new CellWithSubtitleToggleView(context4, null, 0, 6, null);
            cellWithSubtitleToggleView.setId(R$id.cellV);
            cellWithSubtitleToggleView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            return new CellWithSubtitleToggleVH(cellWithSubtitleToggleView, this.actionHandler);
        }
        if (viewType == ElementType.CHECKOUT_CELL_LIST.getId()) {
            Context context5 = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
            FreshCellListView freshCellListView = new FreshCellListView(context5, null, 0, 6, null);
            freshCellListView.setId(R$id.checkoutCellList);
            freshCellListView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            return new FreshCellListVH(freshCellListView, this.actionHandler);
        }
        if (viewType != ElementType.BUTTON.getId()) {
            throw new IllegalArgumentException(Ej.b.a(viewType, "Wrong viewType: "));
        }
        Context context6 = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context6, "getContext(...)");
        ButtonContainerView buttonContainerView = new ButtonContainerView(context6, null, 0, 6, null);
        buttonContainerView.setId(R$id.buttonContainer);
        buttonContainerView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        return new ButtonVH(buttonContainerView, this.actionHandler);
    }

    public final void submitItems(@NotNull List<? extends FreshPaymentInfoVO.DynamicElementVO> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        i.c a11 = i.a(new DynamicElementsDiffUtilCallback(list, this.items), true);
        Intrinsics.checkNotNullExpressionValue(a11, "calculateDiff(...)");
        this.items = list;
        a11.c(this);
    }
}
