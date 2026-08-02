package ru.ozon.app.android.pdp.widgets.delivery.v5.presentation;

import WZ.l;
import WZ.t;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.K;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.app.android.pdp.widgets.delivery.presentation.DeliveryAdapter;
import ru.ozon.app.android.pdp.widgets.delivery.presentation.DeliveryAdapterItem;
import ru.ozon.app.android.pdp.widgets.delivery.presentation.DeliverySection;
import ru.ozon.app.android.pdp.widgets.delivery.presentation.ItemAnimator;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0011R \u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u000e0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/pdp/widgets/delivery/v5/presentation/DeliveryV5WidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/pdp/widgets/delivery/v5/presentation/DeliveryV5Vo;", "Landroidx/recyclerview/widget/RecyclerView;", "recycler", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "handlersInhibitor", "<init>", "(Landroidx/recyclerview/widget/RecyclerView;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/composer/throttle/HandlersInhibitor;)V", "item", "Ll20/d;", "info", "", "bind", "(Lru/ozon/app/android/pdp/widgets/delivery/v5/presentation/DeliveryV5Vo;Ll20/d;)V", "Lru/ozon/app/android/composer/ComposerReferences;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "onAction", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/pdp/widgets/delivery/presentation/DeliveryAdapter;", "adapter", "Lru/ozon/app/android/pdp/widgets/delivery/presentation/DeliveryAdapter;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DeliveryV5WidgetViewHolder extends k<DeliveryV5Vo> {
    public static final int $stable = ComposerReferences.$stable;

    @NotNull
    private final DeliveryAdapter adapter;

    @NotNull
    private final Function1<AtomAction, Unit> onAction;

    @NotNull
    private final ComposerReferences refs;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeliveryV5WidgetViewHolder(@NotNull RecyclerView recycler, @NotNull ComposerReferences refs, @NotNull HandlersInhibitor handlersInhibitor) {
        super(recycler);
        Intrinsics.checkNotNullParameter(recycler, "recycler");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(handlersInhibitor, "handlersInhibitor");
        this.refs = refs;
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(refs, this).enableClickThrottling(handlersInhibitor).buildHandler();
        this.onAction = buildHandler;
        DeliveryAdapter deliveryAdapter = new DeliveryAdapter(buildHandler, this);
        this.adapter = deliveryAdapter;
        recycler.setAdapter(deliveryAdapter);
        recycler.setItemAnimator(new ItemAnimator());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull DeliveryV5Vo item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        if (item.getIsHidden()) {
            this.adapter.submitList(K.f71697a);
            return;
        }
        List<DeliveryAdapterItem> currentList = this.adapter.getCurrentList();
        Intrinsics.checkNotNullExpressionValue(currentList, "getCurrentList(...)");
        if (!currentList.isEmpty()) {
            List<DeliveryAdapterItem> list = currentList;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (!(((DeliveryAdapterItem) it.next()) instanceof DeliveryAdapterItem.Placeholder)) {
                        if (item.getSections().isEmpty()) {
                            return;
                        }
                    }
                }
            }
        }
        this.adapter.submitList(item.getDeliveryItems());
        List<DeliverySection> sections = item.getSections();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it2 = sections.iterator();
        while (true) {
            t tVar = null;
            if (!it2.hasNext()) {
                break;
            }
            DeliverySection deliverySection = (DeliverySection) it2.next();
            if (deliverySection instanceof DeliverySection.Variant) {
                tVar = ((DeliverySection.Variant) deliverySection).getVariant().getTokenizedEvent();
            } else if (deliverySection instanceof DeliverySection.Pickup) {
                tVar = ((DeliverySection.Pickup) deliverySection).getPickupButton().getTokenizedEvent();
            }
            if (tVar != null) {
                arrayList.add(tVar);
            }
        }
        l tokenizedAnalytics = this.refs.getTokenizedAnalytics();
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(tokenizedAnalytics, (t) it3.next(), null, 2, null);
        }
    }
}
