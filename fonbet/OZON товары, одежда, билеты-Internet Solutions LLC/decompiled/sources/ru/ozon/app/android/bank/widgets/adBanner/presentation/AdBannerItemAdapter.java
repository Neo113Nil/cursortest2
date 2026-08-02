package ru.ozon.app.android.bank.widgets.adBanner.presentation;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import gk0.q;
import java.util.List;
import jk0.j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.K;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.bank.widgets.adBanner.data.AnalyticEventType;
import ru.ozon.app.android.platform.rv.looped.LoopedAdapter;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\t\b\u0000\u0018\u0000 ,2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001,B=\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00070\t¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ'\u0010 \u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u0017H\u0016¢\u0006\u0004\b \u0010!R&\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\"R \u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00070\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010#R6\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00020$2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00020$8\u0016@WX\u0096\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+¨\u0006-"}, d2 = {"Lru/ozon/app/android/bank/widgets/adBanner/presentation/AdBannerItemAdapter;", "Lru/ozon/app/android/platform/rv/looped/LoopedAdapter;", "Lru/ozon/app/android/bank/widgets/adBanner/presentation/AdBannerItemVO;", "Lru/ozon/app/android/bank/widgets/adBanner/presentation/AdBannerViewHolder;", "viewHolder", "Lkotlin/Function2;", "Lru/ozon/app/android/bank/widgets/adBanner/data/AnalyticEventType;", "", "trackAnalyticEvent", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "<init>", "(Lru/ozon/app/android/bank/widgets/adBanner/presentation/AdBannerViewHolder;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;)V", "Landroid/view/ViewGroup;", "parent", "Lru/ozon/app/android/bank/widgets/adBanner/presentation/AdBannerItemView;", "createView", "(Landroid/view/ViewGroup;)Lru/ozon/app/android/bank/widgets/adBanner/presentation/AdBannerItemView;", "Landroid/content/Context;", "context", "createAdBannerItemView", "(Landroid/content/Context;)Lru/ozon/app/android/bank/widgets/adBanner/presentation/AdBannerItemView;", "", "viewType", "Lru/ozon/app/android/bank/widgets/adBanner/presentation/AdBannerItemViewHolder;", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/bank/widgets/adBanner/presentation/AdBannerItemViewHolder;", "Ljk0/j;", "holder", "item", "position", "onBind", "(Ljk0/j;Lru/ozon/app/android/bank/widgets/adBanner/presentation/AdBannerItemVO;I)V", "Lkotlin/jvm/functions/Function2;", "Lkotlin/jvm/functions/Function1;", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "items", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "setItems", "(Ljava/util/List;)V", "Companion", "ozonbank_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AdBannerItemAdapter extends LoopedAdapter<AdBannerItemVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private List<AdBannerItemVO> items;

    @NotNull
    private final Function2<AdBannerItemVO, AnalyticEventType, Unit> trackAnalyticEvent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AdBannerItemAdapter(@NotNull AdBannerViewHolder viewHolder, @NotNull Function2<? super AdBannerItemVO, ? super AnalyticEventType, Unit> trackAnalyticEvent, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        super(viewHolder, 2);
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(trackAnalyticEvent, "trackAnalyticEvent");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        this.trackAnalyticEvent = trackAnalyticEvent;
        this.actionHandler = actionHandler;
        this.items = K.f71697a;
    }

    private final AdBannerItemView createAdBannerItemView(Context context) {
        AdBannerItemView adBannerItemView = (AdBannerItemView) q.f64554a.i(N.b(AdBannerItemView.class), context);
        return adBannerItemView == null ? new AdBannerItemView(context, null, 0, 6, null) : adBannerItemView;
    }

    private final AdBannerItemView createView(ViewGroup parent) {
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        AdBannerItemView createAdBannerItemView = createAdBannerItemView(context);
        createAdBannerItemView.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        return createAdBannerItemView;
    }

    @Override // ru.ozon.app.android.platform.rv.looped.LoopedAdapter
    @NotNull
    public List<AdBannerItemVO> getItems() {
        return this.items;
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public void setItems(@NotNull List<AdBannerItemVO> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (Intrinsics.d(this.items, value)) {
            return;
        }
        this.items = value;
        notifyDataSetChanged();
    }

    @Override // ru.ozon.app.android.platform.rv.looped.LoopedAdapter
    public void onBind(@NotNull j holder, @NotNull AdBannerItemVO item, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        ((AdBannerItemViewHolder) holder).bind(item);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public AdBannerItemViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new AdBannerItemViewHolder(createView(parent), this.trackAnalyticEvent, this.actionHandler);
    }
}
