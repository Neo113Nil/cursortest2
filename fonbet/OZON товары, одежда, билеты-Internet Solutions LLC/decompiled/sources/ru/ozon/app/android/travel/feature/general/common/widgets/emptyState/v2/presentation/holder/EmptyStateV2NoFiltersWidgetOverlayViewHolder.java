package ru.ozon.app.android.travel.feature.general.common.widgets.emptyState.v2.presentation.holder;

import Sc.InterfaceC4008j;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import d20.AbstractC6065b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.travel.feature.general.common.widgets.emptyState.v2.presentation.EmptyStateV2WidgetVO;
import ru.ozon.app.android.travel.molecules.view.emptyState.v2.EmptyStateV2View;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R \u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\n0\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001b\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\tR\u001c\u0010\u001e\u001a\n \u001d*\u0004\u0018\u00010\u001c0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010#\u001a\u00020 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/emptyState/v2/presentation/holder/EmptyStateV2NoFiltersWidgetOverlayViewHolder;", "Ld20/b;", "Lru/ozon/app/android/travel/feature/general/common/widgets/emptyState/v2/presentation/EmptyStateV2WidgetVO;", "Ll10/i;", "composerContainer", "<init>", "(Ll10/i;)V", "Lru/ozon/app/android/travel/molecules/view/emptyState/v2/EmptyStateV2View;", "createView", "()Lru/ozon/app/android/travel/molecules/view/emptyState/v2/EmptyStateV2View;", "", "onWidgetCreated", "()V", "onWidgetDestroyed", "item", "bind", "(Lru/ozon/app/android/travel/feature/general/common/widgets/emptyState/v2/presentation/EmptyStateV2WidgetVO;)V", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Landroid/view/ViewGroup;", "root", "Landroid/view/ViewGroup;", "view$delegate", "LSc/j;", "getView", "view", "Landroid/content/Context;", "kotlin.jvm.PlatformType", "context", "Landroid/content/Context;", "Landroid/view/View;", "getMetricView", "()Landroid/view/View;", "metricView", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class EmptyStateV2NoFiltersWidgetOverlayViewHolder extends AbstractC6065b<EmptyStateV2WidgetVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;
    private final Context context;

    @NotNull
    private final ViewGroup root;

    /* renamed from: view$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j view;

    public EmptyStateV2NoFiltersWidgetOverlayViewHolder(@NotNull i composerContainer) {
        Intrinsics.checkNotNullParameter(composerContainer, "composerContainer");
        this.actionHandler = new ActionHandler.Builder(composerContainer, this).buildHandler();
        this.root = composerContainer.Z();
        this.view = LazyUtilsKt.unsafeLazy(new EmptyStateV2NoFiltersWidgetOverlayViewHolder$view$2(this));
        this.context = composerContainer.L();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final EmptyStateV2View createView() {
        Context context = this.root.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        EmptyStateV2View emptyStateV2View = new EmptyStateV2View(context);
        emptyStateV2View.setFocusable(true);
        emptyStateV2View.setClickable(true);
        CoordinatorLayout.f fVar = new CoordinatorLayout.f(-1, -1);
        fVar.i(new AppBarLayout.ScrollingViewBehavior());
        emptyStateV2View.setLayoutParams(fVar);
        return emptyStateV2View;
    }

    private final EmptyStateV2View getView() {
        return (EmptyStateV2View) this.view.getValue();
    }

    @Override // d20.AbstractC6065b
    @NotNull
    public View getMetricView() {
        return getView();
    }

    @Override // d20.AbstractC6065b
    public void onWidgetCreated() {
        super.onWidgetCreated();
        this.root.addView(getView());
    }

    @Override // d20.AbstractC6065b
    public void onWidgetDestroyed() {
        super.onWidgetDestroyed();
        this.root.removeView(getView());
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull EmptyStateV2WidgetVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        getView().bind(item.getEmptyState(), this.actionHandler);
        getView().setButtonsBottomPosition(item.getIsButtonsAtBottom());
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = this.context;
        Intrinsics.checkNotNullExpressionValue(context, "context");
        getView().setBackgroundColor(styleParser.parseColor(context, item.getBackgroundColor(), UniColors.LAYER_FLOOR_1.getResId()));
    }
}
