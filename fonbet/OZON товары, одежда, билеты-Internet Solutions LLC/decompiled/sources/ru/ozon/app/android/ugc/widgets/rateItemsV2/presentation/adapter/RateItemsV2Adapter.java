package ru.ozon.app.android.ugc.widgets.rateItemsV2.presentation.adapter;

import Sc.o;
import Ve.C4636t5;
import WZ.l;
import Xc.a;
import Xc.b;
import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.J;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import fd.InterfaceC6511n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jk0.d;
import jk0.j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.data.ReviewGalleryV2DTO;
import ru.ozon.app.android.ugc.databinding.WidgetRateItemsV2ProductItemBinding;
import ru.ozon.app.android.ugc.databinding.WidgetRateItemsV2ReviewsItemBinding;
import ru.ozon.app.android.ugc.widgets.rateItemsV2.presentation.RateItemsV2VO;
import ru.ozon.app.android.ugc.widgets.rateItemsV2.presentation.view.ProductItemViewHolder;
import ru.ozon.app.android.ugc.widgets.rateItemsV2.presentation.view.ReviewsItemViewHolder;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0015\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002Z[BM\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J-\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00102\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001d\u0010\u001fJ\u0017\u0010 \u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u0010H\u0016¢\u0006\u0004\b \u0010!J\u001d\u0010$\u001a\u00020\u00072\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u001aH\u0007¢\u0006\u0004\b$\u0010%J\u0015\u0010'\u001a\u00020\u00072\u0006\u0010&\u001a\u00020\"¢\u0006\u0004\b'\u0010(J)\u0010,\u001a\u00020\u00072\u0006\u0010*\u001a\u00020)2\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\"0\u0005¢\u0006\u0004\b,\u0010-J\u001f\u0010.\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u00102\b\u0010&\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b.\u0010/J\u0015\u00100\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0010¢\u0006\u0004\b0\u00101J\u0015\u00104\u001a\u00020\u00072\u0006\u00103\u001a\u000202¢\u0006\u0004\b4\u00105J\u0017\u00106\u001a\u0004\u0018\u00010\"2\u0006\u0010\u0019\u001a\u00020\u0010¢\u0006\u0004\b6\u00107J1\u0010;\u001a\u00020\u00072\"\u0010:\u001a\u001e\u0012\u0004\u0012\u00020)\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0006\u0012\u0004\u0018\u000109\u0012\u0004\u0012\u00020\u000708¢\u0006\u0004\b;\u0010<J'\u0010>\u001a\u00020\u00072\u0018\u0010:\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u00070=¢\u0006\u0004\b>\u0010?J\u0015\u0010B\u001a\u00020\u00072\u0006\u0010A\u001a\u00020@¢\u0006\u0004\bB\u0010CR \u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010DR \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010DR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010ER\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010FR\u001a\u0010H\u001a\b\u0012\u0004\u0012\u00020\"0G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010J\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR4\u0010L\u001a \u0012\u0004\u0012\u00020)\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0006\u0012\u0004\u0018\u000109\u0012\u0004\u0012\u00020\u0007\u0018\u0001088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR*\u0010N\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u0007\u0018\u00010=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010OR*\u0010P\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bP\u0010F\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR$\u0010V\u001a\u00020@2\u0006\u0010U\u001a\u00020@8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bV\u0010W\u001a\u0004\bX\u0010Y¨\u0006\\"}, d2 = {"Lru/ozon/app/android/ugc/widgets/rateItemsV2/presentation/adapter/RateItemsV2Adapter;", "Ljk0/d;", "Ljk0/j;", "Landroidx/lifecycle/J;", "lifecycleOwner", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "ignoreItemActionHandler", "LWZ/l;", "tokenizedAnalytics", "Lkotlin/Function0;", "onTimerFinish", "<init>", "(Landroidx/lifecycle/J;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;LWZ/l;Lkotlin/jvm/functions/Function0;)V", "", "getItemCount", "()I", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Ljk0/j;", "holder", "position", "", "", "payloads", "onBindViewHolder", "(Ljk0/j;ILjava/util/List;)V", "(Ljk0/j;I)V", "getItemViewType", "(I)I", "Lru/ozon/app/android/ugc/widgets/rateItemsV2/presentation/RateItemsV2VO$RateItemVO;", "items", "submitList", "(Ljava/util/List;)V", "item", "addItem", "(Lru/ozon/app/android/ugc/widgets/rateItemsV2/presentation/RateItemsV2VO$RateItemVO;)V", "", "sku", "update", "updateItem", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "replaceItem", "(ILru/ozon/app/android/ugc/widgets/rateItemsV2/presentation/RateItemsV2VO$RateItemVO;)V", "removeItem", "(I)V", "", "productId", "removeItemByProductId", "(J)V", "getItem", "(I)Lru/ozon/app/android/ugc/widgets/rateItemsV2/presentation/RateItemsV2VO$RateItemVO;", "Lkotlin/Function3;", "Lru/ozon/app/android/ugc/widgets/rateItemsV2/presentation/RateItemsV2VO$RateItemVO$RateProductItemVO;", "clickListener", "setRatingCLickListener", "(Lfd/n;)V", "Lkotlin/Function2;", "setCellCLickListener", "(Lkotlin/jvm/functions/Function2;)V", "", "enabled", "setCompactMode", "(Z)V", "Lkotlin/jvm/functions/Function1;", "LWZ/l;", "Lkotlin/jvm/functions/Function0;", "", "rateItems", "Ljava/util/List;", "itemHeight", "I", "ratingClickListener", "Lfd/n;", "cellClickListener", "Lkotlin/jvm/functions/Function2;", "onItemAnimationComplete", "getOnItemAnimationComplete", "()Lkotlin/jvm/functions/Function0;", "setOnItemAnimationComplete", "(Lkotlin/jvm/functions/Function0;)V", AppMeasurementSdk.ConditionalUserProperty.VALUE, "compactMode", "Z", "getCompactMode", "()Z", "RatedPayload", "RateItemType", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class RateItemsV2Adapter extends d<j> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;
    private Function2<? super AtomAction, ? super String, Unit> cellClickListener;
    private boolean compactMode;

    @NotNull
    private final Function1<AtomAction, Unit> ignoreItemActionHandler;
    private final int itemHeight;
    private Function0<Unit> onItemAnimationComplete;

    @NotNull
    private final Function0<Unit> onTimerFinish;

    @NotNull
    private final List<RateItemsV2VO.RateItemVO> rateItems;
    private InterfaceC6511n<? super String, ? super Integer, ? super RateItemsV2VO.RateItemVO.RateProductItemVO, Unit> ratingClickListener;

    @NotNull
    private final l tokenizedAnalytics;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/ugc/widgets/rateItemsV2/presentation/adapter/RateItemsV2Adapter$RateItemType;", "", "<init>", "(Ljava/lang/String;I)V", ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO.PRODUCT_NAME, "REVIEWS", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class RateItemType {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ RateItemType[] $VALUES;
        public static final RateItemType PRODUCT = new RateItemType(ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO.PRODUCT_NAME, 0);
        public static final RateItemType REVIEWS = new RateItemType("REVIEWS", 1);

        private static final /* synthetic */ RateItemType[] $values() {
            return new RateItemType[]{PRODUCT, REVIEWS};
        }

        static {
            RateItemType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private RateItemType(String str, int i11) {
        }

        public static RateItemType valueOf(String str) {
            return (RateItemType) Enum.valueOf(RateItemType.class, str);
        }

        public static RateItemType[] values() {
            return (RateItemType[]) $VALUES.clone();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/ugc/widgets/rateItemsV2/presentation/adapter/RateItemsV2Adapter$RatedPayload;", "", "<init>", "()V", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class RatedPayload {

        @NotNull
        public static final RatedPayload INSTANCE = new RatedPayload();

        private RatedPayload() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RateItemsV2Adapter(@NotNull J lifecycleOwner, @NotNull Function1<? super AtomAction, Unit> actionHandler, @NotNull Function1<? super AtomAction, Unit> ignoreItemActionHandler, @NotNull l tokenizedAnalytics, @NotNull Function0<Unit> onTimerFinish) {
        super(lifecycleOwner, null, 2, null);
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(ignoreItemActionHandler, "ignoreItemActionHandler");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(onTimerFinish, "onTimerFinish");
        this.actionHandler = actionHandler;
        this.ignoreItemActionHandler = ignoreItemActionHandler;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.onTimerFinish = onTimerFinish;
        this.rateItems = new ArrayList();
        this.itemHeight = ResourceExtKt.toPx(94);
    }

    public final void addItem(@NotNull RateItemsV2VO.RateItemVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.rateItems.add(item);
        notifyItemInserted(C7714v.P(this.rateItems));
    }

    public final boolean getCompactMode() {
        return this.compactMode;
    }

    public final RateItemsV2VO.RateItemVO getItem(int position) {
        return (RateItemsV2VO.RateItemVO) C7714v.Q(position, this.rateItems);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* renamed from: getItemCount */
    public int getShimmersCount() {
        return this.rateItems.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int getItemViewType(int position) {
        RateItemsV2VO.RateItemVO rateItemVO = this.rateItems.get(position);
        if (rateItemVO instanceof RateItemsV2VO.RateItemVO.RateProductItemVO) {
            return RateItemType.PRODUCT.ordinal();
        }
        if (rateItemVO instanceof RateItemsV2VO.RateItemVO.RateReviewsItemVO) {
            return RateItemType.REVIEWS.ordinal();
        }
        throw new o();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public j onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        LayoutInflater a11 = C4636t5.a(parent, "parent");
        if (viewType == RateItemType.PRODUCT.ordinal()) {
            WidgetRateItemsV2ProductItemBinding inflate = WidgetRateItemsV2ProductItemBinding.inflate(a11);
            Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
            inflate.getConstraintLayout().setLayoutParams(new ConstraintLayout.b(-1, this.itemHeight));
            return new ProductItemViewHolder(inflate, this.ratingClickListener, this.actionHandler, this.onTimerFinish, this.onItemAnimationComplete, this.tokenizedAnalytics, this.cellClickListener, this.ignoreItemActionHandler);
        }
        if (viewType != RateItemType.REVIEWS.ordinal()) {
            throw new IllegalStateException("incorrect view type");
        }
        WidgetRateItemsV2ReviewsItemBinding inflate2 = WidgetRateItemsV2ReviewsItemBinding.inflate(a11);
        Intrinsics.checkNotNullExpressionValue(inflate2, "inflate(...)");
        return new ReviewsItemViewHolder(inflate2, this.actionHandler, this.tokenizedAnalytics);
    }

    public final void removeItem(int position) {
        if (position < 0 || position >= this.rateItems.size()) {
            return;
        }
        this.rateItems.remove(position);
        notifyItemRemoved(position);
    }

    public final void removeItemByProductId(long productId) {
        Iterator<RateItemsV2VO.RateItemVO> it = this.rateItems.iterator();
        int i11 = 0;
        while (true) {
            if (!it.hasNext()) {
                i11 = -1;
                break;
            }
            RateItemsV2VO.RateItemVO next = it.next();
            RateItemsV2VO.RateItemVO.RateProductItemVO rateProductItemVO = next instanceof RateItemsV2VO.RateItemVO.RateProductItemVO ? (RateItemsV2VO.RateItemVO.RateProductItemVO) next : null;
            if (Intrinsics.d(rateProductItemVO != null ? rateProductItemVO.getSku() : null, String.valueOf(productId))) {
                break;
            } else {
                i11++;
            }
        }
        if (i11 >= 0) {
            removeItem(i11);
        }
    }

    public final void replaceItem(int position, RateItemsV2VO.RateItemVO item) {
        if (position < 0 || position >= this.rateItems.size() || item == null) {
            return;
        }
        this.rateItems.set(position, item);
        notifyItemChanged(position);
    }

    public final void setCellCLickListener(@NotNull Function2<? super AtomAction, ? super String, Unit> clickListener) {
        Intrinsics.checkNotNullParameter(clickListener, "clickListener");
        this.cellClickListener = clickListener;
    }

    public final void setCompactMode(boolean enabled) {
        if (this.compactMode == enabled) {
            return;
        }
        this.compactMode = enabled;
    }

    public final void setOnItemAnimationComplete(Function0<Unit> function0) {
        this.onItemAnimationComplete = function0;
    }

    public final void setRatingCLickListener(@NotNull InterfaceC6511n<? super String, ? super Integer, ? super RateItemsV2VO.RateItemVO.RateProductItemVO, Unit> clickListener) {
        Intrinsics.checkNotNullParameter(clickListener, "clickListener");
        this.ratingClickListener = clickListener;
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void submitList(@NotNull List<? extends RateItemsV2VO.RateItemVO> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.compactMode = false;
        this.rateItems.clear();
        this.rateItems.addAll(items);
        notifyDataSetChanged();
    }

    public final void updateItem(@NotNull String sku, @NotNull Function1<? super RateItemsV2VO.RateItemVO, ? extends RateItemsV2VO.RateItemVO> update) {
        Intrinsics.checkNotNullParameter(sku, "sku");
        Intrinsics.checkNotNullParameter(update, "update");
        Iterator<RateItemsV2VO.RateItemVO> it = this.rateItems.iterator();
        int i11 = 0;
        while (true) {
            if (!it.hasNext()) {
                i11 = -1;
                break;
            }
            RateItemsV2VO.RateItemVO next = it.next();
            RateItemsV2VO.RateItemVO.RateProductItemVO rateProductItemVO = next instanceof RateItemsV2VO.RateItemVO.RateProductItemVO ? (RateItemsV2VO.RateItemVO.RateProductItemVO) next : null;
            if (Intrinsics.d(rateProductItemVO != null ? rateProductItemVO.getSku() : null, sku)) {
                break;
            } else {
                i11++;
            }
        }
        if (i11 == -1) {
            return;
        }
        List<RateItemsV2VO.RateItemVO> list = this.rateItems;
        list.set(i11, update.invoke(list.get(i11)));
        notifyItemChanged(i11, RatedPayload.INSTANCE);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.C c11, int i11, List list) {
        onBindViewHolder((j) c11, i11, (List<? extends Object>) list);
    }

    public void onBindViewHolder(@NotNull j holder, int position, @NotNull List<? extends Object> payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        if (payloads.contains(RatedPayload.INSTANCE)) {
            ProductItemViewHolder productItemViewHolder = holder instanceof ProductItemViewHolder ? (ProductItemViewHolder) holder : null;
            if (productItemViewHolder != null) {
                RateItemsV2VO.RateItemVO rateItemVO = this.rateItems.get(position);
                Intrinsics.g(rateItemVO, "null cannot be cast to non-null type ru.ozon.app.android.ugc.widgets.rateItemsV2.presentation.RateItemsV2VO.RateItemVO.RateProductItemVO");
                productItemViewHolder.updateItemReference((RateItemsV2VO.RateItemVO.RateProductItemVO) rateItemVO);
                return;
            }
            return;
        }
        super.onBindViewHolder((RateItemsV2Adapter) holder, position, (List<Object>) payloads);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull j holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        RateItemsV2VO.RateItemVO item = getItem(position);
        if (holder instanceof ReviewsItemViewHolder) {
            Intrinsics.g(item, "null cannot be cast to non-null type ru.ozon.app.android.ugc.widgets.rateItemsV2.presentation.RateItemsV2VO.RateItemVO.RateReviewsItemVO");
            ((ReviewsItemViewHolder) holder).bind((RateItemsV2VO.RateItemVO.RateReviewsItemVO) item);
        } else if (holder instanceof ProductItemViewHolder) {
            ProductItemViewHolder productItemViewHolder = (ProductItemViewHolder) holder;
            productItemViewHolder.updateCompactMode(this.compactMode);
            Intrinsics.g(item, "null cannot be cast to non-null type ru.ozon.app.android.ugc.widgets.rateItemsV2.presentation.RateItemsV2VO.RateItemVO.RateProductItemVO");
            productItemViewHolder.bind((RateItemsV2VO.RateItemVO.RateProductItemVO) item);
        }
    }
}
