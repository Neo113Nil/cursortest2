package ru.ozon.app.android.account.orders.orderfilters.presentation;

import FM.a;
import a00.C4911f;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.orders.orderfilters.presentation.OrderFiltersVO;
import ru.ozon.app.android.composer.R$string;
import ru.ozon.app.android.cs_orders.databinding.WidgetOrderFiltersBinding;
import ru.ozon.app.android.cscore.orderlist.configurators.OrderFiltersConfiguratorKt;
import ru.ozon.app.android.uikit.dialog.sort.SortItem;
import ru.ozon.app.android.uikit.dialog.sort.SortsBottomSheetDialog;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.extensions.view.TextViewExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B#\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0013\u001a\u00020\f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0012\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0015\u0010\u000eJ\u001f\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0017H\u0014¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001bR\u0018\u0010\u0007\u001a\u00060\u0005j\u0002`\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001cR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001dR\u0016\u0010\u0016\u001a\u00020\u00028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0016\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, d2 = {"Lru/ozon/app/android/account/orders/orderfilters/presentation/OrderFiltersViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/account/orders/orderfilters/presentation/OrderFiltersVO;", "Lru/ozon/app/android/cs_orders/databinding/WidgetOrderFiltersBinding;", "binding", "La00/f;", "Lru/ozon/app/android/composer/OwnerContainer;", "container", "Ll10/b;", "bus", "<init>", "(Lru/ozon/app/android/cs_orders/databinding/WidgetOrderFiltersBinding;La00/f;Ll10/b;)V", "", "updateSortViews", "()V", "", "Lru/ozon/app/android/account/orders/orderfilters/presentation/OrderFiltersVO$YearVO;", "years", "clickedYear", "refreshPage", "(Ljava/util/List;Lru/ozon/app/android/account/orders/orderfilters/presentation/OrderFiltersVO$YearVO;)V", "showSortsBottomSheetDialog", "item", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/account/orders/orderfilters/presentation/OrderFiltersVO;Ll20/d;)V", "Lru/ozon/app/android/cs_orders/databinding/WidgetOrderFiltersBinding;", "La00/f;", "Ll10/b;", "Lru/ozon/app/android/account/orders/orderfilters/presentation/OrderFiltersVO;", "Lru/ozon/app/android/account/orders/orderfilters/presentation/YearsAdapter;", "yearsAdapter", "Lru/ozon/app/android/account/orders/orderfilters/presentation/YearsAdapter;", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class OrderFiltersViewHolder extends k<OrderFiltersVO> {

    @NotNull
    private final WidgetOrderFiltersBinding binding;

    @NotNull
    private final InterfaceC7851b bus;

    @NotNull
    private final C4911f container;
    private OrderFiltersVO item;

    @NotNull
    private final YearsAdapter yearsAdapter;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "clickedYear", "Lru/ozon/app/android/account/orders/orderfilters/presentation/OrderFiltersVO$YearVO;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.account.orders.orderfilters.presentation.OrderFiltersViewHolder$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function1<OrderFiltersVO.YearVO, Unit> {
        AnonymousClass2() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(OrderFiltersVO.YearVO yearVO) {
            invoke2(yearVO);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(OrderFiltersVO.YearVO clickedYear) {
            int i11;
            Object obj;
            boolean z11;
            Intrinsics.checkNotNullParameter(clickedYear, "clickedYear");
            OrderFiltersVO orderFiltersVO = OrderFiltersViewHolder.this.item;
            if (orderFiltersVO == null) {
                Intrinsics.n("item");
                throw null;
            }
            List<OrderFiltersVO.YearVO> years = orderFiltersVO.getYears();
            ArrayList arrayList = new ArrayList(C7714v.z(years, 10));
            for (OrderFiltersVO.YearVO yearVO : years) {
                if (Intrinsics.d(yearVO, clickedYear)) {
                    z11 = !yearVO.getIsSelected();
                    i11 = 6;
                    obj = null;
                } else {
                    i11 = 6;
                    obj = null;
                    z11 = false;
                }
                arrayList.add(OrderFiltersVO.YearVO.copy$default(yearVO, z11, null, null, i11, obj));
            }
            OrderFiltersViewHolder.this.refreshPage(arrayList, clickedYear);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public OrderFiltersViewHolder(@NotNull WidgetOrderFiltersBinding binding, @NotNull C4911f container, @NotNull InterfaceC7851b bus) {
        super(r0);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(bus, "bus");
        ConstraintLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
        this.container = container;
        this.bus = bus;
        binding.sortTv.setOnClickListener(new a(this, 8));
        YearsAdapter yearsAdapter = new YearsAdapter(new AnonymousClass2());
        this.yearsAdapter = yearsAdapter;
        binding.yearsRv.setAdapter(yearsAdapter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void refreshPage(List<OrderFiltersVO.YearVO> years, OrderFiltersVO.YearVO clickedYear) {
        Object obj;
        String generateOrderFilterUrl;
        OrderFiltersVO orderFiltersVO = this.item;
        if (orderFiltersVO == null) {
            Intrinsics.n("item");
            throw null;
        }
        Iterator<T> it = orderFiltersVO.getSorts().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((OrderFiltersVO.SortVO) obj).getIsSelected()) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        OrderFiltersVO.SortVO sortVO = (OrderFiltersVO.SortVO) obj;
        String deeplink = sortVO != null ? sortVO.getDeeplink() : null;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : years) {
            if (((OrderFiltersVO.YearVO) obj2).getIsSelected()) {
                arrayList.add(obj2);
            }
        }
        OrderFiltersVO orderFiltersVO2 = this.item;
        if (orderFiltersVO2 == null) {
            Intrinsics.n("item");
            throw null;
        }
        if (orderFiltersVO2.getSorts().isEmpty()) {
            OrderFiltersVO.YearVO yearVO = (OrderFiltersVO.YearVO) C7714v.M(arrayList);
            if (yearVO == null || (generateOrderFilterUrl = yearVO.getDeeplink()) == null) {
                generateOrderFilterUrl = clickedYear.getDeeplink();
            }
        } else {
            ArrayList arrayList2 = new ArrayList(C7714v.z(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((OrderFiltersVO.YearVO) it2.next()).getDeeplink());
            }
            generateOrderFilterUrl = OrderFiltersConfiguratorKt.generateOrderFilterUrl(deeplink, arrayList2);
        }
        InterfaceC7851b.a.a(this.bus, generateOrderFilterUrl, null, null, null, 14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showSortsBottomSheetDialog() {
        OrderFiltersVO orderFiltersVO = this.item;
        if (orderFiltersVO == null) {
            Intrinsics.n("item");
            throw null;
        }
        if (orderFiltersVO.getSorts().isEmpty()) {
            return;
        }
        SortsBottomSheetDialog.Companion companion = SortsBottomSheetDialog.INSTANCE;
        OrderFiltersVO orderFiltersVO2 = this.item;
        if (orderFiltersVO2 == null) {
            Intrinsics.n("item");
            throw null;
        }
        List<OrderFiltersVO.SortVO> sorts = orderFiltersVO2.getSorts();
        ArrayList arrayList = new ArrayList(C7714v.z(sorts, 10));
        for (OrderFiltersVO.SortVO sortVO : sorts) {
            arrayList.add(new SortItem(sortVO.getName(), sortVO.getIsSelected()));
        }
        String string = StringProvider.getString(R$string.common_widget_order_filters_show_android);
        Intent intent = new Intent();
        OrderFiltersVO orderFiltersVO3 = this.item;
        if (orderFiltersVO3 == null) {
            Intrinsics.n("item");
            throw null;
        }
        List<OrderFiltersVO.SortVO> sorts2 = orderFiltersVO3.getSorts();
        ArrayList arrayList2 = new ArrayList(C7714v.z(sorts2, 10));
        Iterator<T> it = sorts2.iterator();
        while (it.hasNext()) {
            arrayList2.add(((OrderFiltersVO.SortVO) it.next()).getDeeplink());
        }
        intent.putExtra("ru.ozon.app.android.commonwidgets.widgets.sortsbottomsheetdialog.KEY_SORTS_DEEPLINK_ARRAY", (String[]) arrayList2.toArray(new String[0]));
        OrderFiltersVO orderFiltersVO4 = this.item;
        if (orderFiltersVO4 == null) {
            Intrinsics.n("item");
            throw null;
        }
        List<OrderFiltersVO.YearVO> years = orderFiltersVO4.getYears();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : years) {
            if (((OrderFiltersVO.YearVO) obj).getIsSelected()) {
                arrayList3.add(obj);
            }
        }
        ArrayList arrayList4 = new ArrayList(C7714v.z(arrayList3, 10));
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            arrayList4.add(((OrderFiltersVO.YearVO) it2.next()).getDeeplink());
        }
        intent.putExtra("ru.ozon.app.android.commonwidgets.widgets.sortsbottomsheetdialog.KEY_YEARS_DEEPLINK_ARRAY", (String[]) arrayList4.toArray(new String[0]));
        SortsBottomSheetDialog newInstance = companion.newInstance(arrayList, intent, string);
        newInstance.setTargetFragment(this.container.c(), 34255);
        newInstance.show(this.container.k(), "SortsBottomSheetDialog");
    }

    private final void updateSortViews() {
        Object obj;
        OrderFiltersVO orderFiltersVO = this.item;
        if (orderFiltersVO == null) {
            Intrinsics.n("item");
            throw null;
        }
        boolean isEmpty = orderFiltersVO.getSorts().isEmpty();
        boolean z11 = !isEmpty;
        TextView sortTv = this.binding.sortTv;
        Intrinsics.checkNotNullExpressionValue(sortTv, "sortTv");
        ViewExtKt.showOrGone(sortTv, Boolean.valueOf(z11));
        TextView titleTv = this.binding.titleTv;
        Intrinsics.checkNotNullExpressionValue(titleTv, "titleTv");
        ViewExtKt.showOrGone(titleTv, Boolean.valueOf(z11));
        View divider = this.binding.divider;
        Intrinsics.checkNotNullExpressionValue(divider, "divider");
        ViewExtKt.showOrGone(divider, Boolean.valueOf(z11));
        if (isEmpty) {
            return;
        }
        TextView sortTv2 = this.binding.sortTv;
        Intrinsics.checkNotNullExpressionValue(sortTv2, "sortTv");
        OrderFiltersVO orderFiltersVO2 = this.item;
        if (orderFiltersVO2 == null) {
            Intrinsics.n("item");
            throw null;
        }
        Iterator<T> it = orderFiltersVO2.getSorts().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((OrderFiltersVO.SortVO) obj).getIsSelected()) {
                    break;
                }
            }
        }
        OrderFiltersVO.SortVO sortVO = (OrderFiltersVO.SortVO) obj;
        TextViewExtKt.setTextOrGone(sortTv2, sortVO != null ? sortVO.getName() : null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull OrderFiltersVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.item = item;
        updateSortViews();
        List<OrderFiltersVO.YearVO> years = item.getYears();
        RecyclerView yearsRv = this.binding.yearsRv;
        Intrinsics.checkNotNullExpressionValue(yearsRv, "yearsRv");
        ViewExtKt.showOrGone(yearsRv, Boolean.valueOf(!years.isEmpty()));
        this.yearsAdapter.setYears(years);
    }
}
