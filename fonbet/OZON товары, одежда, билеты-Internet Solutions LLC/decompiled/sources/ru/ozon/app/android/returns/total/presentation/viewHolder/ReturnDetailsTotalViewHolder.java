package ru.ozon.app.android.returns.total.presentation.viewHolder;

import Vg.d;
import W10.c;
import WZ.l;
import WZ.t;
import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.core.content.res.g;
import androidx.core.graphics.drawable.a;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7705l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.action.custom.CustomActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.platform.customActionHandlers.composerActionAndRedirect.handler.ComposerActionAndRedirectActionHandler;
import ru.ozon.app.android.platform.customActionHandlers.composerActionWithAction.ComposerActionWithActionHandler;
import ru.ozon.app.android.returns.total.presentation.view.ReturnDetailsTotalView;
import ru.ozon.app.android.returns.total.presentation.viewObject.ReturnDetailsTotalVO;
import ru.ozon.app.android.returns.ui.R$drawable;
import ru.ozon.app.android.returns.ui.molecules.balance.presentaion.recyclerView.ReturnBalanceTotalRowsListAdapter;
import ru.ozon.app.android.returns.ui.molecules.balance.viewObject.BalanceDetailsBlock;
import ru.ozon.app.android.returns.ui.molecules.balance.viewObject.BalanceRow;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\u0010\t\u001a\u00060\u0007j\u0002`\b\u0012\n\u0010\f\u001a\u00060\nj\u0002`\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0012\u001a\u00020\u0011*\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\b\u0001\u0010\u0015\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001cH\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ3\u0010&\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u00022\n\u0010\"\u001a\u00060 j\u0002`!2\u000e\u0010%\u001a\n\u0018\u00010#j\u0004\u0018\u0001`$H\u0016¢\u0006\u0004\b&\u0010'R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010(R\u0018\u0010\f\u001a\u00060\nj\u0002`\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010)R\"\u0010-\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020,0+0*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R \u00101\u001a\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\u00110/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00104\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00106\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00105¨\u00067"}, d2 = {"Lru/ozon/app/android/returns/total/presentation/viewHolder/ReturnDetailsTotalViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/returns/total/presentation/viewObject/ReturnDetailsTotalVO;", "Lru/ozon/app/android/returns/total/presentation/view/ReturnDetailsTotalView;", "returnDetailsTotalView", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "<init>", "(Lru/ozon/app/android/returns/total/presentation/view/ReturnDetailsTotalView;Lru/ozon/app/android/composer/ComposerReferences;LVg/d;LWZ/l;)V", "Lru/ozon/app/android/returns/ui/molecules/balance/viewObject/BalanceDetailsBlock;", "refundDetailsBlock", "", "bindRefundDetailsBlock", "(Lru/ozon/app/android/returns/total/presentation/view/ReturnDetailsTotalView;Lru/ozon/app/android/returns/ui/molecules/balance/viewObject/BalanceDetailsBlock;)V", "", "drawableId", "", "colorToken", "Landroid/graphics/drawable/Drawable;", "drawableWithColor", "(ILjava/lang/String;)Landroid/graphics/drawable/Drawable;", "item", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/returns/total/presentation/viewObject/ReturnDetailsTotalVO;Ll20/d;)V", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "Lru/ozon/app/android/tools/ViewedPond;", "viewedPond", "trackView", "(Lru/ozon/app/android/returns/total/presentation/viewObject/ReturnDetailsTotalVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Lru/ozon/app/android/returns/total/presentation/view/ReturnDetailsTotalView;", "LWZ/l;", "", "Ljava/lang/Class;", "Lru/ozon/app/android/action/custom/CustomActionHandler;", "customActionHandlers", "Ljava/util/Set;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/returns/ui/molecules/balance/presentaion/recyclerView/ReturnBalanceTotalRowsListAdapter;", "adapter", "Lru/ozon/app/android/returns/ui/molecules/balance/presentaion/recyclerView/ReturnBalanceTotalRowsListAdapter;", "refundDetailsAdapter", "details_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ReturnDetailsTotalViewHolder extends k<ReturnDetailsTotalVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final ReturnBalanceTotalRowsListAdapter adapter;

    @NotNull
    private final Set<Class<? extends CustomActionHandler>> customActionHandlers;

    @NotNull
    private final ReturnBalanceTotalRowsListAdapter refundDetailsAdapter;

    @NotNull
    private final ReturnDetailsTotalView returnDetailsTotalView;

    @NotNull
    private final l tokenizedAnalytics;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReturnDetailsTotalViewHolder(@NotNull ReturnDetailsTotalView returnDetailsTotalView, @NotNull ComposerReferences refs, @NotNull d customActionHandlersStoreFactory, @NotNull l tokenizedAnalytics) {
        super(returnDetailsTotalView);
        Intrinsics.checkNotNullParameter(returnDetailsTotalView, "returnDetailsTotalView");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.returnDetailsTotalView = returnDetailsTotalView;
        this.tokenizedAnalytics = tokenizedAnalytics;
        Class[] elements = {ComposerActionWithActionHandler.class, ComposerActionAndRedirectActionHandler.class};
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.customActionHandlers = C7705l.j0(elements);
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(refs, this).customActionHandlers(new ReturnDetailsTotalViewHolder$actionHandler$1(customActionHandlersStoreFactory, this)).buildHandler();
        this.actionHandler = buildHandler;
        ReturnBalanceTotalRowsListAdapter returnBalanceTotalRowsListAdapter = new ReturnBalanceTotalRowsListAdapter(buildHandler);
        this.adapter = returnBalanceTotalRowsListAdapter;
        ReturnBalanceTotalRowsListAdapter returnBalanceTotalRowsListAdapter2 = new ReturnBalanceTotalRowsListAdapter(buildHandler);
        this.refundDetailsAdapter = returnBalanceTotalRowsListAdapter2;
        returnDetailsTotalView.getRowsRecyclerView().setAdapter(returnBalanceTotalRowsListAdapter);
        returnDetailsTotalView.getRefundDetailsRowsRecyclerView().setAdapter(returnBalanceTotalRowsListAdapter2);
    }

    private final void bindRefundDetailsBlock(ReturnDetailsTotalView returnDetailsTotalView, BalanceDetailsBlock balanceDetailsBlock) {
        List<BalanceRow> rows;
        if (balanceDetailsBlock == null || (rows = balanceDetailsBlock.getRows()) == null || !(!rows.isEmpty())) {
            ViewExtKt.gone(returnDetailsTotalView.getRefundDetailsRowsLinerLayout());
            return;
        }
        ViewExtKt.show(returnDetailsTotalView.getRefundDetailsRowsLinerLayout());
        returnDetailsTotalView.getRefundDetailsRowsLinerLayout().setBackground(drawableWithColor(R$drawable.bg_total_all_rounded, balanceDetailsBlock.getBackgroundColor()));
        TextHolderKt.bindOrGone(returnDetailsTotalView.getRefundDetailsTitleTav(), balanceDetailsBlock.getTitle(), this.actionHandler);
        this.refundDetailsAdapter.submitList(balanceDetailsBlock.getRows());
    }

    private final Drawable drawableWithColor(int drawableId, String colorToken) {
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = this.itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Integer parseColor = styleParser.parseColor(context, colorToken);
        if (parseColor == null) {
            return null;
        }
        int intValue = parseColor.intValue();
        Drawable d11 = g.d(this.itemView.getContext().getResources(), drawableId, this.itemView.getContext().getTheme());
        if (d11 == null) {
            return null;
        }
        Intrinsics.checkNotNullExpressionValue(d11, "wrap(...)");
        a.i(d11, intValue);
        return d11;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull ReturnDetailsTotalVO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        ReturnDetailsTotalView returnDetailsTotalView = this.returnDetailsTotalView;
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = this.itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Integer parseColor = styleParser.parseColor(context, item.getBackgroundColor());
        if (parseColor != null) {
            returnDetailsTotalView.setBackgroundColor(parseColor.intValue());
        }
        bindRefundDetailsBlock(returnDetailsTotalView, item.getRefundDetailsBlock());
        ViewExtKt.showOrGone(returnDetailsTotalView.getRowsRecyclerView(), Boolean.valueOf(!item.getRows().isEmpty()));
        this.adapter.submitList(item.getRows());
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull ReturnDetailsTotalVO item, @NotNull c trackingData, f viewedPond) {
        Map<String, TokenizedTrackingInfo> trackingInfo;
        t mapToTokenizedEvent$default;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        super.trackView((ReturnDetailsTotalViewHolder) item, trackingData, viewedPond);
        CommonControlSettings common = item.getCommon();
        if (common == null || (trackingInfo = common.getTrackingInfo()) == null || (mapToTokenizedEvent$default = TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, Long.valueOf(item.getId()), null, 2, null)) == null) {
            return;
        }
        TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, mapToTokenizedEvent$default, null, 2, null);
    }
}
