package ru.ozon.app.android.marketing.widgets.pdpCouponListV2.presentation;

import W10.c;
import WZ.t;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.x;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.marketing.databinding.WidgetPdpCouponListV2Binding;
import ru.ozon.app.android.marketing.widgets.pdpCouponListV2.presentation.adapter.PdpCouponListV2Adapter;
import ru.ozon.app.android.marketing.widgets.pdpCouponListV2.presentation.adapter.PdpCouponListV2ItemDecorator;
import ru.ozon.app.android.marketing.widgets.pdpCouponListV2.presentation.model.PdpCouponItemListV2VO;
import ru.ozon.app.android.marketing.widgets.pdpCouponListV2.presentation.model.PdpCouponListV2VO;
import ru.ozon.app.android.storefrontcommonwidgets.core.appType.AppTypeResolver;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.flashbar.factory.FlashbarFactory;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;
import ru.ozon.uni.core.R$drawable;

@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0016\u001a\u00020\f2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001b\u0010\u001aJ3\u0010\"\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u00022\n\u0010\u001e\u001a\u00060\u001cj\u0002`\u001d2\u000e\u0010!\u001a\n\u0018\u00010\u001fj\u0004\u0018\u0001` H\u0016¢\u0006\u0004\b\"\u0010#J#\u0010'\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u00022\n\u0010&\u001a\u00060$j\u0002`%H\u0014¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010+R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010,R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010-R \u00100\u001a\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\f0.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00103\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00106\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107¨\u00068"}, d2 = {"Lru/ozon/app/android/marketing/widgets/pdpCouponListV2/presentation/PdpCouponListV2ViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/marketing/widgets/pdpCouponListV2/presentation/model/PdpCouponListV2VO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/app/android/marketing/widgets/pdpCouponListV2/presentation/PdpCouponListV2ViewModel;", "viewModel", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/marketing/widgets/pdpCouponListV2/presentation/PdpCouponListV2ViewModel;)V", "", "observeViewModel", "()V", "", "message", "showTooltip", "(Ljava/lang/String;)V", "", "Lru/ozon/app/android/marketing/widgets/pdpCouponListV2/presentation/model/PdpCouponItemListV2VO;", "coupons", "onListUpdated", "(Ljava/util/List;)V", "item", "onCouponApplyClick", "(Lru/ozon/app/android/marketing/widgets/pdpCouponListV2/presentation/model/PdpCouponItemListV2VO;)V", "onHighlightClick", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "Lru/ozon/app/android/tools/ViewedPond;", "viewedPond", "trackView", "(Lru/ozon/app/android/marketing/widgets/pdpCouponListV2/presentation/model/PdpCouponListV2VO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/marketing/widgets/pdpCouponListV2/presentation/model/PdpCouponListV2VO;Ll20/d;)V", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/marketing/widgets/pdpCouponListV2/presentation/PdpCouponListV2ViewModel;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/marketing/databinding/WidgetPdpCouponListV2Binding;", "binding", "Lru/ozon/app/android/marketing/databinding/WidgetPdpCouponListV2Binding;", "Lru/ozon/app/android/marketing/widgets/pdpCouponListV2/presentation/adapter/PdpCouponListV2Adapter;", "couponsAdapter", "Lru/ozon/app/android/marketing/widgets/pdpCouponListV2/presentation/adapter/PdpCouponListV2Adapter;", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PdpCouponListV2ViewHolder extends k<PdpCouponListV2VO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final WidgetPdpCouponListV2Binding binding;

    @NotNull
    private final View containerView;

    @NotNull
    private final PdpCouponListV2Adapter couponsAdapter;

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private final PdpCouponListV2ViewModel viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PdpCouponListV2ViewHolder(@NotNull View containerView, @NotNull ComposerReferences refs, @NotNull PdpCouponListV2ViewModel viewModel) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        this.containerView = containerView;
        this.refs = refs;
        this.viewModel = viewModel;
        this.actionHandler = new ActionHandler.Builder(refs, this).buildHandler();
        WidgetPdpCouponListV2Binding bind = WidgetPdpCouponListV2Binding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        PdpCouponListV2Adapter pdpCouponListV2Adapter = new PdpCouponListV2Adapter(refs.getContainer().g(), refs.getTokenizedAnalytics(), new PdpCouponListV2ViewHolder$couponsAdapter$1(this), new PdpCouponListV2ViewHolder$couponsAdapter$2(this));
        RecyclerView recyclerView = bind.pdpCouponList;
        new x().attachToRecyclerView(recyclerView);
        recyclerView.setAdapter(pdpCouponListV2Adapter);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(recyclerView.getContext());
        linearLayoutManager.setOrientation(0);
        recyclerView.setLayoutManager(linearLayoutManager);
        AppTypeResolver appTypeResolver = AppTypeResolver.INSTANCE;
        Context context = recyclerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int i11 = appTypeResolver.isSelect(context) ? R$color.layer_floor_1 : R$color.layer_floor_0;
        Context context2 = recyclerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        recyclerView.setBackgroundColor(ResourceExtKt.color(context2, i11));
        recyclerView.addItemDecoration(new PdpCouponListV2ItemDecorator());
        this.couponsAdapter = pdpCouponListV2Adapter;
        observeViewModel();
    }

    private final void observeViewModel() {
        this.viewModel.getTooltip().observe(this.refs.getContainer().g(), new PdpCouponListV2ViewHolder$sam$androidx_lifecycle_Observer$0(new PdpCouponListV2ViewHolder$observeViewModel$1(this)));
        this.viewModel.getRefreshTrigger().observe(this.refs.getContainer().g(), new PdpCouponListV2ViewHolder$sam$androidx_lifecycle_Observer$0(new PdpCouponListV2ViewHolder$observeViewModel$2(this)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onCouponApplyClick(PdpCouponItemListV2VO item) {
        if (item.getPromocode().getAction() == null) {
            this.viewModel.onCouponApplyClicked(item);
        } else {
            this.actionHandler.invoke(AtomActionMapperKt.toAtomAction(item.getPromocode().getAction(), item.getPromocode().getTrackingInfo()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onHighlightClick(PdpCouponItemListV2VO item) {
        AtomActionDTO action;
        AtomAction atomAction;
        PdpCouponItemListV2VO.CouponAction couponAction = item.getCouponAction();
        if (couponAction == null || (action = couponAction.getAction()) == null || (atomAction = AtomActionMapperKt.toAtomAction(action, item.getCouponAction().getTrackingInfo())) == null) {
            return;
        }
        this.actionHandler.invoke(atomAction);
    }

    private final void onListUpdated(List<PdpCouponItemListV2VO> coupons) {
        this.couponsAdapter.setItems(coupons);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showTooltip(String message) {
        ViewGroup rootView;
        FlashbarFactory flashbarFactory = FlashbarFactory.INSTANCE;
        ComponentCallbacksC5392m c11 = this.refs.getContainer().c();
        if (c11 == null || (rootView = ContextExtKt.getRootView(c11)) == null) {
            return;
        }
        FlashbarFactory.create$default(flashbarFactory, rootView, null, OzonSpannableStringKt.toOzonSpannableString(message), null, null, Integer.valueOf(R$drawable.ic_m_danger_filled), null, null, null, null, null, null, null, 3000L, null, null, this.refs.getContainer().g(), 57306, null).show();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull PdpCouponListV2VO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        onListUpdated(item.getCoupons());
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull PdpCouponListV2VO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.refs.getTokenizedAnalytics(), tokenizedEvent, null, 2, null);
        }
    }
}
