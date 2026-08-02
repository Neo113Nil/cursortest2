package ru.ozon.app.android.checkoutcomposer.splitDetailV2.presentation;

import Vg.d;
import W10.c;
import WZ.l;
import WZ.t;
import android.content.Context;
import android.content.res.Resources;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.checkout.databinding.WidgetSplitDetailsV2Binding;
import ru.ozon.app.android.checkoutcomposer.splitDetailV2.presentation.SplitDetailV2VO;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.uikit.R$drawable;
import ru.ozon.app.android.uikit.recycler.RecyclerViewExtKt;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;
import ru.ozon.uni.atoms.data.cell.CommonCellSettingsKt;
import ru.ozon.uni.atoms.v3.containers.SingleAtom;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B/\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\u0010\n\u001a\u00060\bj\u0002`\t\u0012\n\u0010\r\u001a\u00060\u000bj\u0002`\f¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u00022\n\u0010\u0013\u001a\u00060\u0011j\u0002`\u0012H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J)\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001dR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001eR#\u0010!\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00140\u001f8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006("}, d2 = {"Lru/ozon/app/android/checkoutcomposer/splitDetailV2/presentation/SplitDetailV2VH;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/checkoutcomposer/splitDetailV2/presentation/SplitDetailV2VO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Lru/ozon/app/android/checkout/databinding/WidgetSplitDetailsV2Binding;", "binding", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "<init>", "(Lru/ozon/app/android/checkout/databinding/WidgetSplitDetailsV2Binding;Lru/ozon/app/android/composer/ComposerReferences;LVg/d;LWZ/l;)V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "", "bind", "(Lru/ozon/app/android/checkoutcomposer/splitDetailV2/presentation/SplitDetailV2VO;Ll20/d;)V", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/checkoutcomposer/splitDetailV2/presentation/SplitDetailV2VO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Lru/ozon/app/android/checkout/databinding/WidgetSplitDetailsV2Binding;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "getActionHandler", "()Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/checkoutcomposer/splitDetailV2/presentation/SplitsAdapter;", "splitsAdapter", "Lru/ozon/app/android/checkoutcomposer/splitDetailV2/presentation/SplitsAdapter;", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class SplitDetailV2VH extends k<SplitDetailV2VO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final WidgetSplitDetailsV2Binding binding;

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private final SplitsAdapter splitsAdapter;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SplitDetailV2VH(@NotNull WidgetSplitDetailsV2Binding binding, @NotNull ComposerReferences refs, @NotNull d customActionHandlersStoreFactory, @NotNull l tokenizedAnalytics) {
        super(r0);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        LinearLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
        this.refs = refs;
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(refs, this).customActionHandlers(new SplitDetailV2VH$actionHandler$1(customActionHandlersStoreFactory)).buildHandler();
        this.actionHandler = buildHandler;
        SplitsAdapter splitsAdapter = new SplitsAdapter(buildHandler, tokenizedAnalytics, refs.getContainer().g());
        this.splitsAdapter = splitsAdapter;
        RecyclerView recyclerView = binding.splitsRV;
        recyclerView.setAdapter(splitsAdapter);
        recyclerView.setItemAnimator(null);
        RecyclerView.o layoutManager = recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager != null) {
            RecyclerView splitsRV = binding.splitsRV;
            Intrinsics.checkNotNullExpressionValue(splitsRV, "splitsRV");
            Context context = recyclerView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            RecyclerViewExtKt.setupSeparatorItemDecoration(splitsRV, context, R$drawable.line_divider, linearLayoutManager.getOrientation(), true);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull SplitDetailV2VO item, @NotNull l20.d info) {
        CommonCellSettings.LayoutPadding topPadding;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        WidgetSplitDetailsV2Binding widgetSplitDetailsV2Binding = this.binding;
        if (item.getHeader() != null) {
            SingleAtom headerSA = widgetSplitDetailsV2Binding.headerSA;
            Intrinsics.checkNotNullExpressionValue(headerSA, "headerSA");
            ViewExtKt.show(headerSA);
            SingleAtom.bind$default(widgetSplitDetailsV2Binding.headerSA, item.getHeader(), false, 2, null);
        } else {
            SingleAtom headerSA2 = widgetSplitDetailsV2Binding.headerSA;
            Intrinsics.checkNotNullExpressionValue(headerSA2, "headerSA");
            ViewExtKt.gone(headerSA2);
        }
        this.splitsAdapter.submitList(item.getSplits());
        LinearLayout constraintLayout = widgetSplitDetailsV2Binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        Resources resources = getResources();
        SplitDetailV2VO.Split.Settings settings = item.getSettings();
        ViewExtKt.updatePadding$default(constraintLayout, 0, (int) resources.getDimension((settings == null || (topPadding = settings.getTopPadding()) == null) ? CommonCellSettingsKt.getPadding700() : topPadding.getCellLayoutPadding()), 0, 0, 13, null);
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull SplitDetailV2VO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        super.trackView((SplitDetailV2VH) item, trackingData, viewedPond);
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.refs.getTokenizedAnalytics(), tokenizedEvent, null, 2, null);
        }
    }
}
