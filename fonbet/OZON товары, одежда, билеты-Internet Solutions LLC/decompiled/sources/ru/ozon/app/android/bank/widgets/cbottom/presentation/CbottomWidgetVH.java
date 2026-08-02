package ru.ozon.app.android.bank.widgets.cbottom.presentation;

import E30.i;
import W10.c;
import WZ.l;
import WZ.m;
import WZ.t;
import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.bank.widgets.cbottom.view.CbottomWidgetView;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B+\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u00022\n\u0010\u0012\u001a\u00060\u0010j\u0002`\u0011H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J)\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001cR\u0018\u0010\b\u001a\u00060\u0006j\u0002`\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001dR\u0016\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R \u0010#\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00130!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lru/ozon/app/android/bank/widgets/cbottom/presentation/CbottomWidgetVH;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/bank/widgets/cbottom/presentation/CbottomWidgetVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Lru/ozon/app/android/bank/widgets/cbottom/presentation/CbottomWidgetViewModel;", "viewModel", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "Lru/ozon/app/android/composer/ComposerReferences;", "ref", "Landroid/view/View;", "containerView", "<init>", "(Lru/ozon/app/android/bank/widgets/cbottom/presentation/CbottomWidgetViewModel;LWZ/l;Lru/ozon/app/android/composer/ComposerReferences;Landroid/view/View;)V", "item", "Ll20/d;", "Lru/ozon/composer/network/widget/item/WidgetInfo;", "info", "", "bind", "(Lru/ozon/app/android/bank/widgets/cbottom/presentation/CbottomWidgetVO;Ll20/d;)V", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/bank/widgets/cbottom/presentation/CbottomWidgetVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Lru/ozon/app/android/bank/widgets/cbottom/presentation/CbottomWidgetViewModel;", "LWZ/l;", "Lru/ozon/app/android/bank/widgets/cbottom/view/CbottomWidgetView;", "holder", "Lru/ozon/app/android/bank/widgets/cbottom/view/CbottomWidgetView;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "ozonbank_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CbottomWidgetVH extends k<CbottomWidgetVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;
    private final CbottomWidgetView holder;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final CbottomWidgetViewModel viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CbottomWidgetVH(@NotNull CbottomWidgetViewModel viewModel, @NotNull l tokenizedAnalytics, @NotNull ComposerReferences ref, @NotNull View containerView) {
        super(containerView);
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(ref, "ref");
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        this.viewModel = viewModel;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.holder = containerView instanceof CbottomWidgetView ? (CbottomWidgetView) containerView : null;
        this.actionHandler = new ActionHandler.Builder(ref, this).buildHandler();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull CbottomWidgetVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.viewModel.init(item, this.actionHandler);
        CbottomWidgetView cbottomWidgetView = this.holder;
        if (cbottomWidgetView != null) {
            cbottomWidgetView.bindState(CbottomWidgetView.CbottomWidgetViewState.INSTANCE.create(item.getId(), item.getCbottomItems(), item.getBackgroundColor(), i.b(item.getWidgetPadding()), item.getBackgroundRadius(), i.b(item.getWidgetMargin())));
        }
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull CbottomWidgetVO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        super.trackView((CbottomWidgetVH) item, trackingData, viewedPond);
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            m.c(this.tokenizedAnalytics, tokenizedEvent, null);
        }
    }
}
