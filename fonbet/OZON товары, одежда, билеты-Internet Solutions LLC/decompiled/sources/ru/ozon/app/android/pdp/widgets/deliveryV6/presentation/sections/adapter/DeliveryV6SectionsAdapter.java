package ru.ozon.app.android.pdp.widgets.deliveryV6.presentation.sections.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import androidx.lifecycle.J;
import j.C7232a;
import jk0.i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.R$id;
import ru.ozon.app.android.pdp.widgets.deliveryV6.presentation.sections.adapter.DeliveryV6SectionItem;
import ru.ozon.app.android.pdp.widgets.deliveryV6.presentation.sections.adapter.view.DeliveryV6PickupButtonView;
import ru.ozon.app.android.pdp.widgets.deliveryV6.presentation.sections.adapter.view.DeliveryV6SectionCellDefaultView;
import ru.ozon.app.android.pdp.widgets.deliveryV6.presentation.sections.adapter.view.DeliveryV6SectionHeaderView;
import ru.ozon.app.android.pdp.widgets.deliveryV6.presentation.sections.adapter.viewHolder.DeliveryV6SectionCellDefaultViewHolder;
import ru.ozon.app.android.pdp.widgets.deliveryV6.presentation.sections.adapter.viewHolder.DeliveryV6SectionCellWithIconViewHolder;
import ru.ozon.app.android.pdp.widgets.deliveryV6.presentation.sections.adapter.viewHolder.DeliveryV6SectionHeaderViewHolder;
import ru.ozon.app.android.pdp.widgets.deliveryV6.presentation.sections.adapter.viewHolder.DeliveryV6SectionPickupViewHolder;
import ru.ozon.app.android.pdp.widgets.deliveryV6.presentation.sections.adapter.viewHolder.DeliveryV6SectionSeparatorViewHolder;
import ru.ozon.app.android.pdp.widgets.deliveryV6.presentation.sections.adapter.viewHolder.DeliveryV6SectionVerticalSpaceViewHolder;
import ru.ozon.app.android.pdp.widgets.deliveryV6.presentation.sections.adapter.viewHolder.DeliveryV6SectionViewHolder;
import ru.ozon.app.android.pdp.widgets.sellerV4.presentation.SellerV4DisclosureViewFactory;
import ru.ozon.app.android.uikit.R$drawable;
import ru.ozon.app.android.uikit.view.discount.ProgressiveDiscountViewKt;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.containers.SingleAtom;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0001\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0019\u001aB#\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0016\u0010\u0017R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0018¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/pdp/widgets/deliveryV6/presentation/sections/adapter/DeliveryV6SectionsAdapter;", "Ljk0/i;", "Lru/ozon/app/android/pdp/widgets/deliveryV6/presentation/sections/adapter/DeliveryV6SectionItem;", "Lru/ozon/app/android/pdp/widgets/deliveryV6/presentation/sections/adapter/viewHolder/DeliveryV6SectionViewHolder;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "onAction", "Landroidx/lifecycle/J;", "lifecycleOwner", "<init>", "(Lkotlin/jvm/functions/Function1;Landroidx/lifecycle/J;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/pdp/widgets/deliveryV6/presentation/sections/adapter/viewHolder/DeliveryV6SectionViewHolder;", "holder", "position", "onBindViewHolder", "(Lru/ozon/app/android/pdp/widgets/deliveryV6/presentation/sections/adapter/viewHolder/DeliveryV6SectionViewHolder;I)V", "getItemViewType", "(I)I", "Lkotlin/jvm/functions/Function1;", "Companion", "ViewType", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DeliveryV6SectionsAdapter extends i<DeliveryV6SectionItem, DeliveryV6SectionViewHolder> {

    @NotNull
    private final Function1<AtomAction, Unit> onAction;
    private static final float dpF12 = ResourceExtKt.toPxF(12);
    private static final float dpF10 = ResourceExtKt.toPxF(10);

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\b\t\n\u000b\f\rB\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0006\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/pdp/widgets/deliveryV6/presentation/sections/adapter/DeliveryV6SectionsAdapter$ViewType;", "", "type", "", "<init>", "(I)V", "getType", "()I", "Separator", "VerticalSpace", "SectionHeader", "CellWithIcon", "CellDefault", "Pickup", "Lru/ozon/app/android/pdp/widgets/deliveryV6/presentation/sections/adapter/DeliveryV6SectionsAdapter$ViewType$CellDefault;", "Lru/ozon/app/android/pdp/widgets/deliveryV6/presentation/sections/adapter/DeliveryV6SectionsAdapter$ViewType$CellWithIcon;", "Lru/ozon/app/android/pdp/widgets/deliveryV6/presentation/sections/adapter/DeliveryV6SectionsAdapter$ViewType$Pickup;", "Lru/ozon/app/android/pdp/widgets/deliveryV6/presentation/sections/adapter/DeliveryV6SectionsAdapter$ViewType$SectionHeader;", "Lru/ozon/app/android/pdp/widgets/deliveryV6/presentation/sections/adapter/DeliveryV6SectionsAdapter$ViewType$Separator;", "Lru/ozon/app/android/pdp/widgets/deliveryV6/presentation/sections/adapter/DeliveryV6SectionsAdapter$ViewType$VerticalSpace;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class ViewType {
        private final int type;

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/pdp/widgets/deliveryV6/presentation/sections/adapter/DeliveryV6SectionsAdapter$ViewType$CellDefault;", "Lru/ozon/app/android/pdp/widgets/deliveryV6/presentation/sections/adapter/DeliveryV6SectionsAdapter$ViewType;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class CellDefault extends ViewType {

            @NotNull
            public static final CellDefault INSTANCE = new CellDefault();

            private CellDefault() {
                super(5, null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof CellDefault);
            }

            public int hashCode() {
                return -1819917600;
            }

            @NotNull
            public String toString() {
                return "CellDefault";
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/pdp/widgets/deliveryV6/presentation/sections/adapter/DeliveryV6SectionsAdapter$ViewType$CellWithIcon;", "Lru/ozon/app/android/pdp/widgets/deliveryV6/presentation/sections/adapter/DeliveryV6SectionsAdapter$ViewType;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class CellWithIcon extends ViewType {

            @NotNull
            public static final CellWithIcon INSTANCE = new CellWithIcon();

            private CellWithIcon() {
                super(4, null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof CellWithIcon);
            }

            public int hashCode() {
                return 2126755232;
            }

            @NotNull
            public String toString() {
                return "CellWithIcon";
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/pdp/widgets/deliveryV6/presentation/sections/adapter/DeliveryV6SectionsAdapter$ViewType$Pickup;", "Lru/ozon/app/android/pdp/widgets/deliveryV6/presentation/sections/adapter/DeliveryV6SectionsAdapter$ViewType;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Pickup extends ViewType {

            @NotNull
            public static final Pickup INSTANCE = new Pickup();

            private Pickup() {
                super(6, null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof Pickup);
            }

            public int hashCode() {
                return -1116126853;
            }

            @NotNull
            public String toString() {
                return "Pickup";
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/pdp/widgets/deliveryV6/presentation/sections/adapter/DeliveryV6SectionsAdapter$ViewType$SectionHeader;", "Lru/ozon/app/android/pdp/widgets/deliveryV6/presentation/sections/adapter/DeliveryV6SectionsAdapter$ViewType;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class SectionHeader extends ViewType {

            @NotNull
            public static final SectionHeader INSTANCE = new SectionHeader();

            private SectionHeader() {
                super(3, null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof SectionHeader);
            }

            public int hashCode() {
                return 298093043;
            }

            @NotNull
            public String toString() {
                return "SectionHeader";
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/pdp/widgets/deliveryV6/presentation/sections/adapter/DeliveryV6SectionsAdapter$ViewType$Separator;", "Lru/ozon/app/android/pdp/widgets/deliveryV6/presentation/sections/adapter/DeliveryV6SectionsAdapter$ViewType;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Separator extends ViewType {

            @NotNull
            public static final Separator INSTANCE = new Separator();

            private Separator() {
                super(1, null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof Separator);
            }

            public int hashCode() {
                return -43722874;
            }

            @NotNull
            public String toString() {
                return "Separator";
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/pdp/widgets/deliveryV6/presentation/sections/adapter/DeliveryV6SectionsAdapter$ViewType$VerticalSpace;", "Lru/ozon/app/android/pdp/widgets/deliveryV6/presentation/sections/adapter/DeliveryV6SectionsAdapter$ViewType;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class VerticalSpace extends ViewType {

            @NotNull
            public static final VerticalSpace INSTANCE = new VerticalSpace();

            private VerticalSpace() {
                super(2, null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof VerticalSpace);
            }

            public int hashCode() {
                return 1156353873;
            }

            @NotNull
            public String toString() {
                return "VerticalSpace";
            }
        }

        public /* synthetic */ ViewType(int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(i11);
        }

        public final int getType() {
            return this.type;
        }

        private ViewType(int i11) {
            this.type = i11;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DeliveryV6SectionsAdapter(@NotNull Function1<? super AtomAction, Unit> onAction, @NotNull J lifecycleOwner) {
        super(new DeliveryV6SectionDiffUtil(), lifecycleOwner, null, 4, null);
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        this.onAction = onAction;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int getItemViewType(int position) {
        return getItem(position).getViewType().getType();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull DeliveryV6SectionViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        DeliveryV6SectionItem item = getItem(position);
        if (holder instanceof DeliveryV6SectionSeparatorViewHolder) {
            return;
        }
        if (holder instanceof DeliveryV6SectionVerticalSpaceViewHolder) {
            Intrinsics.g(item, "null cannot be cast to non-null type ru.ozon.app.android.pdp.widgets.deliveryV6.presentation.sections.adapter.DeliveryV6SectionItem.VerticalSpace");
            ((DeliveryV6SectionVerticalSpaceViewHolder) holder).bind((DeliveryV6SectionItem.VerticalSpace) item);
            return;
        }
        if (holder instanceof DeliveryV6SectionHeaderViewHolder) {
            Intrinsics.g(item, "null cannot be cast to non-null type ru.ozon.app.android.pdp.widgets.deliveryV6.presentation.sections.adapter.DeliveryV6SectionItem.SectionHeader");
            ((DeliveryV6SectionHeaderViewHolder) holder).bind((DeliveryV6SectionItem.SectionHeader) item);
            return;
        }
        if (holder instanceof DeliveryV6SectionCellWithIconViewHolder) {
            Intrinsics.g(item, "null cannot be cast to non-null type ru.ozon.app.android.pdp.widgets.deliveryV6.presentation.sections.adapter.DeliveryV6SectionItem.CellSingleAtom");
            ((DeliveryV6SectionCellWithIconViewHolder) holder).bind((DeliveryV6SectionItem.CellSingleAtom) item);
        } else if (holder instanceof DeliveryV6SectionCellDefaultViewHolder) {
            Intrinsics.g(item, "null cannot be cast to non-null type ru.ozon.app.android.pdp.widgets.deliveryV6.presentation.sections.adapter.DeliveryV6SectionItem.CellDefault");
            ((DeliveryV6SectionCellDefaultViewHolder) holder).bind((DeliveryV6SectionItem.CellDefault) item);
        } else if (holder instanceof DeliveryV6SectionPickupViewHolder) {
            Intrinsics.g(item, "null cannot be cast to non-null type ru.ozon.app.android.pdp.widgets.deliveryV6.presentation.sections.adapter.DeliveryV6SectionItem.Pickup");
            ((DeliveryV6SectionPickupViewHolder) holder).bind((DeliveryV6SectionItem.Pickup) item);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public DeliveryV6SectionViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (viewType == ViewType.Separator.INSTANCE.getType()) {
            View view = new View(parent.getContext());
            view.setId(R$id.deliveryV6SectionSeparator);
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, ProgressiveDiscountViewKt.getDp1());
            SellerV4DisclosureViewFactory sellerV4DisclosureViewFactory = SellerV4DisclosureViewFactory.INSTANCE;
            marginLayoutParams.setMargins(sellerV4DisclosureViewFactory.getDp50(), sellerV4DisclosureViewFactory.getDp16(), 0, 0);
            view.setLayoutParams(marginLayoutParams);
            Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            view.setBackgroundColor(ThemeExtKt.themeColor(context, R$attr.graphicNeutral));
            return new DeliveryV6SectionSeparatorViewHolder(view);
        }
        if (viewType == ViewType.VerticalSpace.INSTANCE.getType()) {
            Space space = new Space(parent.getContext());
            space.setId(R$id.deliveryV6SectionVerticalSpace);
            space.setLayoutParams(new ViewGroup.LayoutParams(-1, ProgressiveDiscountViewKt.getDp8()));
            return new DeliveryV6SectionVerticalSpaceViewHolder(space);
        }
        if (viewType == ViewType.SectionHeader.INSTANCE.getType()) {
            Context context2 = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            DeliveryV6SectionHeaderView deliveryV6SectionHeaderView = new DeliveryV6SectionHeaderView(context2);
            deliveryV6SectionHeaderView.setId(R$id.deliveryV6SectionSectionHeader);
            deliveryV6SectionHeaderView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            return new DeliveryV6SectionHeaderViewHolder(deliveryV6SectionHeaderView);
        }
        if (viewType == ViewType.CellWithIcon.INSTANCE.getType()) {
            Context context3 = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            SingleAtom singleAtom = new SingleAtom(context3, null, 0, 0, 14, null);
            singleAtom.setId(R$id.deliveryV6SectionCellWithIcon);
            ViewGroup.MarginLayoutParams marginLayoutParams2 = new ViewGroup.MarginLayoutParams(-1, -2);
            marginLayoutParams2.leftMargin = SellerV4DisclosureViewFactory.INSTANCE.getDp52();
            singleAtom.setLayoutParams(marginLayoutParams2);
            return new DeliveryV6SectionCellWithIconViewHolder(singleAtom, this.onAction);
        }
        if (viewType == ViewType.CellDefault.INSTANCE.getType()) {
            Context context4 = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
            DeliveryV6SectionCellDefaultView deliveryV6SectionCellDefaultView = new DeliveryV6SectionCellDefaultView(context4);
            deliveryV6SectionCellDefaultView.setId(R$id.deliveryV6SectionCellDefault);
            ViewGroup.MarginLayoutParams marginLayoutParams3 = new ViewGroup.MarginLayoutParams(-1, -2);
            marginLayoutParams3.leftMargin = SellerV4DisclosureViewFactory.INSTANCE.getDp52();
            marginLayoutParams3.topMargin = ProgressiveDiscountViewKt.getDp8();
            deliveryV6SectionCellDefaultView.setLayoutParams(marginLayoutParams3);
            return new DeliveryV6SectionCellDefaultViewHolder(deliveryV6SectionCellDefaultView, this.onAction);
        }
        if (viewType != ViewType.Pickup.INSTANCE.getType()) {
            throw new IllegalArgumentException("View type " + viewType + " for " + N.b(DeliveryV6SectionsAdapter.class) + " not found");
        }
        Context context5 = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
        DeliveryV6PickupButtonView deliveryV6PickupButtonView = new DeliveryV6PickupButtonView(context5);
        deliveryV6PickupButtonView.setId(R$id.deliveryV6SectionPickup);
        deliveryV6PickupButtonView.setRadius(dpF12);
        deliveryV6PickupButtonView.setCardElevation(dpF10);
        deliveryV6PickupButtonView.setForeground(C7232a.a(parent.getContext(), R$drawable.selector_standard));
        ViewGroup.MarginLayoutParams marginLayoutParams4 = new ViewGroup.MarginLayoutParams(-1, -2);
        SellerV4DisclosureViewFactory sellerV4DisclosureViewFactory2 = SellerV4DisclosureViewFactory.INSTANCE;
        marginLayoutParams4.leftMargin = sellerV4DisclosureViewFactory2.getDp36();
        marginLayoutParams4.topMargin = sellerV4DisclosureViewFactory2.getDp16();
        marginLayoutParams4.rightMargin = sellerV4DisclosureViewFactory2.getDp16();
        marginLayoutParams4.bottomMargin = sellerV4DisclosureViewFactory2.getDp16();
        deliveryV6PickupButtonView.setLayoutParams(marginLayoutParams4);
        return new DeliveryV6SectionPickupViewHolder(deliveryV6PickupButtonView, this.onAction);
    }
}
