package ru.ozon.app.android.ordertracking.v4.presentation.rv;

import Ae.M0;
import Ae.O0;
import Ae.x0;
import Sc.o;
import Sc.r;
import Sc.s;
import Ve.C4636t5;
import WZ.l;
import android.content.Context;
import android.text.TextPaint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import gk0.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jk0.i;
import jk0.j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.csma.orderTracking.data.BarcodeTimerManager;
import ru.ozon.app.android.ordertracking.R$layout;
import ru.ozon.app.android.ordertracking.databinding.ItemOrderTrackingV4AllOrdersBinding;
import ru.ozon.app.android.ordertracking.databinding.ItemOrderTrackingV4BarcodeBinding;
import ru.ozon.app.android.ordertracking.databinding.ItemOrderTrackingV4OrderBinding;
import ru.ozon.app.android.ordertracking.v4.presentation.model.AllOrdersVO;
import ru.ozon.app.android.ordertracking.v4.presentation.model.BarcodeVO;
import ru.ozon.app.android.ordertracking.v4.presentation.model.OrderTrackingItemVO;
import ru.ozon.app.android.ordertracking.v4.presentation.model.OrderVO;
import ru.ozon.app.android.storage.startupArgs.StartupArgsService;
import ru.ozon.app.android.utils.AppType;
import ru.ozon.app.android.utils.TextUtilsKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import xe.C10727i;

@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u0000 L2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001LBY\u0012\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u0002`\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001b\u001a\u00020\u00062\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010!\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"J/\u0010&\u001a\u00020\u00062\u000e\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020#2\u000e\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020#H\u0016¢\u0006\u0004\b&\u0010'J\u001f\u0010*\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u00032\u0006\u0010)\u001a\u00020\u001fH\u0016¢\u0006\u0004\b*\u0010+J\u0017\u0010,\u001a\u00020\u001f2\u0006\u0010)\u001a\u00020\u001fH\u0016¢\u0006\u0004\b,\u0010-J\u001b\u00100\u001a\u00020\u00062\f\u0010/\u001a\b\u0012\u0004\u0012\u00020.0#¢\u0006\u0004\b0\u00101R$\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u0002`\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00102R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u00103R\u0016\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u00104R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u00105R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u00106R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u00107R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u00108R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u00109R(\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00060:8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\u001a\u0010B\u001a\b\u0012\u0004\u0012\u00020\u001f0A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u001d\u0010E\u001a\b\u0012\u0004\u0012\u00020\u001f0D8\u0006¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010HR\u0016\u0010J\u001a\u00020I8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010K¨\u0006M"}, d2 = {"Lru/ozon/app/android/ordertracking/v4/presentation/rv/OrderTrackingV4ItemsAdapter;", "Ljk0/i;", "Lru/ozon/app/android/ordertracking/v4/presentation/model/OrderTrackingItemVO;", "Ljk0/j;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "Lru/ozon/app/android/action/BuildedActionHandler;", "actionHandler", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "Lru/ozon/app/android/csma/orderTracking/data/BarcodeTimerManager;", "barcodeTimerManager", "Lru/ozon/app/android/storage/startupArgs/StartupArgsService;", "startupArgsService", "LWZ/l;", "tokenizedAnalytics", "Landroidx/lifecycle/J;", "lifecycleOwner", "Lru/ozon/app/android/utils/AppType;", "appType", "Landroid/content/Context;", "activityContext", "<init>", "(Lkotlin/jvm/functions/Function1;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/csma/orderTracking/data/BarcodeTimerManager;Lru/ozon/app/android/storage/startupArgs/StartupArgsService;LWZ/l;Landroidx/lifecycle/J;Lru/ozon/app/android/utils/AppType;Landroid/content/Context;)V", "Lru/ozon/app/android/ordertracking/v4/presentation/model/AllOrdersVO;", "vo", "calculateOffsets", "(Lru/ozon/app/android/ordertracking/v4/presentation/model/AllOrdersVO;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Ljk0/j;", "", "previousList", "currentList", "onCurrentListChanged", "(Ljava/util/List;Ljava/util/List;)V", "holder", "position", "onBindViewHolder", "(Ljk0/j;I)V", "getItemViewType", "(I)I", "Lru/ozon/app/android/ordertracking/v4/presentation/model/OrderVO;", "orders", "updateOrderItems", "(Ljava/util/List;)V", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/csma/orderTracking/data/BarcodeTimerManager;", "Lru/ozon/app/android/storage/startupArgs/StartupArgsService;", "LWZ/l;", "Landroidx/lifecycle/J;", "Lru/ozon/app/android/utils/AppType;", "Landroid/content/Context;", "Lkotlin/Function0;", "afterTimerCallback", "Lkotlin/jvm/functions/Function0;", "getAfterTimerCallback", "()Lkotlin/jvm/functions/Function0;", "setAfterTimerCallback", "(Lkotlin/jvm/functions/Function0;)V", "LAe/x0;", "_lastItemSizeFlow", "LAe/x0;", "LAe/M0;", "lastItemSizeFlow", "LAe/M0;", "getLastItemSizeFlow", "()LAe/M0;", "", "hasOnlyOneOrder", "Z", "Companion", "orderTracking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class OrderTrackingV4ItemsAdapter extends i<OrderTrackingItemVO, j> {

    @NotNull
    private final x0<Integer> _lastItemSizeFlow;

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final Context activityContext;

    @NotNull
    private Function0<Unit> afterTimerCallback;

    @NotNull
    private final AppType appType;
    private final BarcodeTimerManager barcodeTimerManager;
    private boolean hasOnlyOneOrder;

    @NotNull
    private final M0<Integer> lastItemSizeFlow;

    @NotNull
    private final J lifecycleOwner;

    @NotNull
    private final ComposerReferences references;

    @NotNull
    private final StartupArgsService startupArgsService;

    @NotNull
    private final l tokenizedAnalytics;
    private static final int ALL_ORDERS_BTN_INNER_PADDING = UiExtKt.toPx(8);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OrderTrackingV4ItemsAdapter(@NotNull Function1<? super AtomAction, Unit> actionHandler, @NotNull ComposerReferences references, BarcodeTimerManager barcodeTimerManager, @NotNull StartupArgsService startupArgsService, @NotNull l tokenizedAnalytics, @NotNull J lifecycleOwner, @NotNull AppType appType, @NotNull Context activityContext) {
        super(OrdersDiffUtilCallback.INSTANCE, lifecycleOwner, null, 4, null);
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(startupArgsService, "startupArgsService");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(activityContext, "activityContext");
        this.actionHandler = actionHandler;
        this.references = references;
        this.barcodeTimerManager = barcodeTimerManager;
        this.startupArgsService = startupArgsService;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.lifecycleOwner = lifecycleOwner;
        this.appType = appType;
        this.activityContext = activityContext;
        this.afterTimerCallback = OrderTrackingV4ItemsAdapter$afterTimerCallback$1.INSTANCE;
        x0<Integer> a11 = O0.a(0);
        this._lastItemSizeFlow = a11;
        this.lastItemSizeFlow = a11;
    }

    private final void calculateOffsets(AllOrdersVO vo) {
        Object a11;
        int i11;
        Integer measureTextWidth;
        if (vo == null) {
            return;
        }
        try {
            r.Companion companion = r.INSTANCE;
            IconDTO.IconSize size = vo.getIcon().getSize();
            int i12 = 0;
            if (size != null) {
                int px = UiExtKt.toPx(size.getSize());
                IconDTO.IconSize size2 = vo.getIcon().getSize();
                int px2 = px + (size2 != null ? UiExtKt.toPx(size2.getPadding()) : 0);
                IconDTO.IconSize size3 = vo.getIcon().getSize();
                i11 = px2 + (size3 != null ? UiExtKt.toPx(size3.getBorderWidth()) : 0);
            } else {
                i11 = 0;
            }
            TextPaint textPaint = new TextPaint();
            TextDTO text = vo.getText();
            int intValue = (text == null || (measureTextWidth = TextUtilsKt.measureTextWidth(text, this.activityContext, textPaint)) == null) ? 0 : measureTextWidth.intValue();
            if (this.appType != AppType.SELECT) {
                i12 = ALL_ORDERS_BTN_INNER_PADDING * 2;
            }
            if (i11 < intValue) {
                i11 = intValue;
            }
            a11 = Integer.valueOf(i11 + i12);
        } catch (Throwable th2) {
            r.Companion companion2 = r.INSTANCE;
            a11 = s.a(th2);
        }
        if (a11 instanceof r.b) {
            return;
        }
        C10727i.c(K.a(this.lifecycleOwner), null, null, new OrderTrackingV4ItemsAdapter$calculateOffsets$2$1(this, ((Number) a11).intValue(), null), 3);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int getItemViewType(int position) {
        OrderTrackingItemVO item = getItem(position);
        if (item instanceof OrderVO) {
            return 1;
        }
        if (item instanceof BarcodeVO) {
            return 2;
        }
        if (item instanceof AllOrdersVO) {
            return 3;
        }
        throw new o();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public j onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        ItemOrderTrackingV4OrderBinding inflate;
        ItemOrderTrackingV4BarcodeBinding inflate2;
        ItemOrderTrackingV4AllOrdersBinding inflate3;
        LayoutInflater a11 = C4636t5.a(parent, "parent");
        if (viewType == 1) {
            View h11 = q.f64554a.h(R$layout.item_order_tracking_v4_order);
            if (h11 == null || (inflate = ItemOrderTrackingV4OrderBinding.bind(h11)) == null) {
                inflate = ItemOrderTrackingV4OrderBinding.inflate(a11, parent, false);
                Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
            }
            return new OrderTrackingV4OrderViewHolder(this.actionHandler, this.afterTimerCallback, inflate, this.references, this.startupArgsService, this.lastItemSizeFlow);
        }
        if (viewType == 2) {
            View h12 = q.f64554a.h(R$layout.item_order_tracking_v4_barcode);
            if (h12 == null || (inflate2 = ItemOrderTrackingV4BarcodeBinding.bind(h12)) == null) {
                inflate2 = ItemOrderTrackingV4BarcodeBinding.inflate(a11, parent, false);
                Intrinsics.checkNotNullExpressionValue(inflate2, "inflate(...)");
            }
            return new OrderTrackingV4BarcodeViewHolder(this.actionHandler, this.barcodeTimerManager, inflate2, this.tokenizedAnalytics);
        }
        if (viewType != 3) {
            throw new IllegalStateException("incorrect view type");
        }
        View h13 = q.f64554a.h(R$layout.item_order_tracking_v4_all_orders);
        if (h13 == null || (inflate3 = ItemOrderTrackingV4AllOrdersBinding.bind(h13)) == null) {
            inflate3 = ItemOrderTrackingV4AllOrdersBinding.inflate(a11, parent, false);
            Intrinsics.checkNotNullExpressionValue(inflate3, "inflate(...)");
        }
        return new OrderTrackingV4AllOrdersViewHolder(this.actionHandler, inflate3);
    }

    @Override // androidx.recyclerview.widget.t
    public void onCurrentListChanged(@NotNull List<? extends OrderTrackingItemVO> previousList, @NotNull List<? extends OrderTrackingItemVO> currentList) {
        Object obj;
        Intrinsics.checkNotNullParameter(previousList, "previousList");
        Intrinsics.checkNotNullParameter(currentList, "currentList");
        List<? extends OrderTrackingItemVO> list = currentList;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (obj2 instanceof OrderVO) {
                arrayList.add(obj2);
            }
        }
        boolean z11 = arrayList.size() == 1;
        this.hasOnlyOneOrder = z11;
        if (z11) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (obj instanceof AllOrdersVO) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            calculateOffsets((AllOrdersVO) obj);
        }
    }

    public final void setAfterTimerCallback(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.afterTimerCallback = function0;
    }

    public final void updateOrderItems(@NotNull List<OrderVO> orders) {
        Intrinsics.checkNotNullParameter(orders, "orders");
        List<OrderTrackingItemVO> currentList = getCurrentList();
        Intrinsics.checkNotNullExpressionValue(currentList, "getCurrentList(...)");
        ArrayList arrayList = new ArrayList();
        for (Object obj : currentList) {
            if (obj instanceof BarcodeVO) {
                arrayList.add(obj);
            }
        }
        ArrayList p02 = C7714v.p0(orders, arrayList);
        List<OrderTrackingItemVO> currentList2 = getCurrentList();
        Intrinsics.checkNotNullExpressionValue(currentList2, "getCurrentList(...)");
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : currentList2) {
            if (obj2 instanceof AllOrdersVO) {
                arrayList2.add(obj2);
            }
        }
        submitList(C7714v.p0(arrayList2, p02));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull j holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        OrderTrackingItemVO item = getItem(position);
        if (holder instanceof OrderTrackingV4OrderViewHolder) {
            boolean z11 = position >= 1 && (getItem(position - 1) instanceof BarcodeVO);
            Intrinsics.g(item, "null cannot be cast to non-null type ru.ozon.app.android.ordertracking.v4.presentation.model.OrderVO");
            ((OrderTrackingV4OrderViewHolder) holder).bind((OrderVO) item, z11, this.hasOnlyOneOrder);
        } else if (holder instanceof OrderTrackingV4BarcodeViewHolder) {
            Intrinsics.g(item, "null cannot be cast to non-null type ru.ozon.app.android.ordertracking.v4.presentation.model.BarcodeVO");
            ((OrderTrackingV4BarcodeViewHolder) holder).bind((BarcodeVO) item);
        } else if (holder instanceof OrderTrackingV4AllOrdersViewHolder) {
            Intrinsics.g(item, "null cannot be cast to non-null type ru.ozon.app.android.ordertracking.v4.presentation.model.AllOrdersVO");
            ((OrderTrackingV4AllOrdersViewHolder) holder).bind((AllOrdersVO) item);
        }
    }
}
