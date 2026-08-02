package ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormVariantPicker;

import BP.a;
import Xc.b;
import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.i;
import androidx.recyclerview.widget.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.utils.ContextExtKt;
import ru.ozon.app.android.pdp.utils.CornersConfig;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.ugc.R$id;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormVariantPicker.VariantPickerVO;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.cell.CellView;
import ru.ozon.uni.atoms.v3.holders.cell.CellHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import ru.ozon.uni.core.R$color;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\b\u0001\u0018\u00002\u0016\u0012\u0004\u0012\u00020\u0002\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u00030\u0001:\u0003\u0017\u0018\u0019B\u001b\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ'\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u00032\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0012\u001a\u00020\u00062\u000e\u0010\u0010\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u00032\u0006\u0010\u0011\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0014\u0010\u0015R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0016¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormVariantPicker/VariantsListAdapter;", "Landroidx/recyclerview/widget/t;", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormVariantPicker/VariantPickerVO$VariantPickerItem;", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormVariantPicker/PickerViewHolder;", "Lkotlin/Function1;", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormVariantPicker/VariantPickerVO$VariantPickerItem$Variant;", "", "onSelect", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormVariantPicker/PickerViewHolder;", "holder", "position", "onBindViewHolder", "(Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormVariantPicker/PickerViewHolder;I)V", "getItemViewType", "(I)I", "Lkotlin/jvm/functions/Function1;", "TitleViewHolder", "VariantViewHolder", "ViewType", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class VariantsListAdapter extends t<VariantPickerVO.VariantPickerItem, PickerViewHolder<? extends VariantPickerVO.VariantPickerItem>> {

    @NotNull
    private final Function1<VariantPickerVO.VariantPickerItem.Variant, Unit> onSelect;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\rH\u0016R\u0014\u0010\u0003\u001a\u00020\u0004X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormVariantPicker/VariantsListAdapter$TitleViewHolder;", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormVariantPicker/PickerViewHolder;", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormVariantPicker/VariantPickerVO$VariantPickerItem$Header;", "containerView", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "<init>", "(Lru/ozon/uni/android/atom/text/TextAtomV2View;)V", "getContainerView", "()Lru/ozon/uni/android/atom/text/TextAtomV2View;", "bind", "", "item", "position", "", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class TitleViewHolder extends PickerViewHolder<VariantPickerVO.VariantPickerItem.Header> {
        public static final int $stable = TextAtomV2View.$stable;

        @NotNull
        private final TextAtomV2View containerView;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TitleViewHolder(@NotNull TextAtomV2View containerView) {
            super(containerView);
            Intrinsics.checkNotNullParameter(containerView, "containerView");
            this.containerView = containerView;
        }

        public void bind(@NotNull VariantPickerVO.VariantPickerItem.Header item, int position) {
            Intrinsics.checkNotNullParameter(item, "item");
            TextHolderKt.bind$default(getContainerView(), item.getVariantsHeader(), null, 2, null);
        }

        @NotNull
        protected TextAtomV2View getContainerView() {
            return this.containerView;
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\tH\u0016R\u0014\u0010\u0003\u001a\u00020\u0004X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormVariantPicker/VariantsListAdapter$VariantViewHolder;", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormVariantPicker/PickerViewHolder;", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormVariantPicker/VariantPickerVO$VariantPickerItem$Variant;", "containerView", "Lru/ozon/uni/android/cell/CellView;", "onSelect", "Lkotlin/Function1;", "", "lastPosition", "", "<init>", "(Lru/ozon/uni/android/cell/CellView;Lkotlin/jvm/functions/Function1;I)V", "getContainerView", "()Lru/ozon/uni/android/cell/CellView;", "bind", "item", "position", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class VariantViewHolder extends PickerViewHolder<VariantPickerVO.VariantPickerItem.Variant> {
        public static final int $stable = CellView.$stable;

        @NotNull
        private final CellView containerView;
        private final int lastPosition;

        @NotNull
        private final Function1<VariantPickerVO.VariantPickerItem.Variant, Unit> onSelect;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public VariantViewHolder(@NotNull CellView containerView, @NotNull Function1<? super VariantPickerVO.VariantPickerItem.Variant, Unit> onSelect, int i11) {
            super(containerView);
            Intrinsics.checkNotNullParameter(containerView, "containerView");
            Intrinsics.checkNotNullParameter(onSelect, "onSelect");
            this.containerView = containerView;
            this.onSelect = onSelect;
            this.lastPosition = i11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void bind$lambda$1$lambda$0(VariantViewHolder variantViewHolder, VariantPickerVO.VariantPickerItem.Variant variant, View view) {
            variantViewHolder.onSelect.invoke(variant);
        }

        public void bind(@NotNull VariantPickerVO.VariantPickerItem.Variant item, int position) {
            ShapeDrawable createRoundRectShape$default;
            Intrinsics.checkNotNullParameter(item, "item");
            CellView containerView = getContainerView();
            CellHolderKt.bind$default(containerView, item.getVariantCell(), null, 2, null);
            if (position == 1) {
                Context context = containerView.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                createRoundRectShape$default = ContextExtKt.createRoundRectShape$default(context, Dimens.INSTANCE.getDPF_16(), CornersConfig.TOP, R$color.bg_secondary, 0, null, 24, null);
            } else if (position == this.lastPosition) {
                containerView.setHasSeparator(false);
                Context context2 = containerView.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                createRoundRectShape$default = ContextExtKt.createRoundRectShape$default(context2, Dimens.INSTANCE.getDPF_16(), CornersConfig.BOTTOM, R$color.bg_secondary, 0, null, 24, null);
            } else {
                Context context3 = containerView.getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                createRoundRectShape$default = ContextExtKt.createRoundRectShape$default(context3, Dimens.INSTANCE.getDPF_16(), CornersConfig.NONE, R$color.bg_secondary, 0, null, 24, null);
            }
            containerView.setBackground(createRoundRectShape$default);
            containerView.getRightBlock().setVisibility(item.getIsSelected() ? 0 : 8);
            containerView.getCenterBlock().setOnClickListener(new a(9, this, item));
        }

        @NotNull
        protected CellView getContainerView() {
            return this.containerView;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormVariantPicker/VariantsListAdapter$ViewType;", "", "<init>", "(Ljava/lang/String;I)V", "TITLE_VIEW_TYPE", "LIST_VIEW_TYPE", "INVALID_TYPE", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class ViewType {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ ViewType[] $VALUES;
        public static final ViewType TITLE_VIEW_TYPE = new ViewType("TITLE_VIEW_TYPE", 0);
        public static final ViewType LIST_VIEW_TYPE = new ViewType("LIST_VIEW_TYPE", 1);
        public static final ViewType INVALID_TYPE = new ViewType("INVALID_TYPE", 2);

        private static final /* synthetic */ ViewType[] $values() {
            return new ViewType[]{TITLE_VIEW_TYPE, LIST_VIEW_TYPE, INVALID_TYPE};
        }

        static {
            ViewType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private ViewType(String str, int i11) {
        }

        public static ViewType valueOf(String str) {
            return (ViewType) Enum.valueOf(ViewType.class, str);
        }

        public static ViewType[] values() {
            return (ViewType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public VariantsListAdapter(@NotNull Function1<? super VariantPickerVO.VariantPickerItem.Variant, Unit> onSelect) {
        super(new i.d<VariantPickerVO.VariantPickerItem>() { // from class: ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormVariantPicker.VariantsListAdapter.1
            @Override // androidx.recyclerview.widget.i.d
            public boolean areContentsTheSame(VariantPickerVO.VariantPickerItem oldItem, VariantPickerVO.VariantPickerItem newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                if ((oldItem instanceof VariantPickerVO.VariantPickerItem.Variant) && (newItem instanceof VariantPickerVO.VariantPickerItem.Variant)) {
                    return Intrinsics.d(oldItem, newItem);
                }
                if ((oldItem instanceof VariantPickerVO.VariantPickerItem.Header) && (newItem instanceof VariantPickerVO.VariantPickerItem.Header)) {
                    return Intrinsics.d(oldItem, newItem);
                }
                return false;
            }

            @Override // androidx.recyclerview.widget.i.d
            public boolean areItemsTheSame(VariantPickerVO.VariantPickerItem oldItem, VariantPickerVO.VariantPickerItem newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                if ((oldItem instanceof VariantPickerVO.VariantPickerItem.Variant) && (newItem instanceof VariantPickerVO.VariantPickerItem.Variant)) {
                    return Intrinsics.d(((VariantPickerVO.VariantPickerItem.Variant) oldItem).getId(), ((VariantPickerVO.VariantPickerItem.Variant) newItem).getId());
                }
                if ((oldItem instanceof VariantPickerVO.VariantPickerItem.Header) && (newItem instanceof VariantPickerVO.VariantPickerItem.Header)) {
                    return Intrinsics.d(((VariantPickerVO.VariantPickerItem.Header) oldItem).getVariantsHeader(), ((VariantPickerVO.VariantPickerItem.Header) newItem).getVariantsHeader());
                }
                return false;
            }
        });
        Intrinsics.checkNotNullParameter(onSelect, "onSelect");
        this.onSelect = onSelect;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int getItemViewType(int position) {
        VariantPickerVO.VariantPickerItem variantPickerItem = getCurrentList().get(position);
        return variantPickerItem instanceof VariantPickerVO.VariantPickerItem.Header ? ViewType.TITLE_VIEW_TYPE.ordinal() : variantPickerItem instanceof VariantPickerVO.VariantPickerItem.Variant ? ViewType.LIST_VIEW_TYPE.ordinal() : ViewType.INVALID_TYPE.ordinal();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull PickerViewHolder<? extends VariantPickerVO.VariantPickerItem> holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        VariantPickerVO.VariantPickerItem item = getItem(position);
        if (holder instanceof TitleViewHolder) {
            Intrinsics.g(item, "null cannot be cast to non-null type ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormVariantPicker.VariantPickerVO.VariantPickerItem.Header");
            ((TitleViewHolder) holder).bind((VariantPickerVO.VariantPickerItem.Header) item, position);
        } else if (holder instanceof VariantViewHolder) {
            Intrinsics.g(item, "null cannot be cast to non-null type ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormVariantPicker.VariantPickerVO.VariantPickerItem.Variant");
            ((VariantViewHolder) holder).bind((VariantPickerVO.VariantPickerItem.Variant) item, position);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public PickerViewHolder<? extends VariantPickerVO.VariantPickerItem> onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (viewType == ViewType.TITLE_VIEW_TYPE.ordinal()) {
            Context context = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            TextAtomV2View textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
            LinearLayout.LayoutParams a11 = Im.a.a(textAtomV2View, R$id.reviewVariantsListTitle, -2, -2);
            Dimens dimens = Dimens.INSTANCE;
            a11.topMargin = dimens.getDP_16();
            a11.bottomMargin = dimens.getDP_16();
            textAtomV2View.setLayoutParams(a11);
            return new TitleViewHolder(textAtomV2View);
        }
        if (viewType != ViewType.LIST_VIEW_TYPE.ordinal()) {
            throw new IllegalArgumentException("invalid viewType");
        }
        Context context2 = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        CellView cellView = new CellView(context2, null, 0, 0, null, 30, null);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        Dimens dimens2 = Dimens.INSTANCE;
        layoutParams.setMarginStart(dimens2.getDP_16());
        layoutParams.setMarginEnd(dimens2.getDP_16());
        cellView.setLayoutParams(layoutParams);
        return new VariantViewHolder(cellView, this.onSelect, getCurrentList().size() - 1);
    }
}
