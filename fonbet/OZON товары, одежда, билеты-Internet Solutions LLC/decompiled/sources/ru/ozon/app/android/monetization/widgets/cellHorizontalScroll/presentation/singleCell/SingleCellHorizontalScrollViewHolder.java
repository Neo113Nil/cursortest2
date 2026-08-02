package ru.ozon.app.android.monetization.widgets.cellHorizontalScroll.presentation.singleCell;

import Tg.b;
import Ug.a;
import Vg.e;
import W10.c;
import WZ.l;
import WZ.m;
import WZ.t;
import android.content.Context;
import android.widget.FrameLayout;
import androidx.core.view.G;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.monetization.widgets.cellHorizontalScroll.presentation.multiCell.nested.NestedHorizontalCellWrapper;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.atoms.data.TestInfo;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0011\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J)\u0010\u001b\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001dR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001eR \u0010!\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\r0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lru/ozon/app/android/monetization/widgets/cellHorizontalScroll/presentation/singleCell/SingleCellHorizontalScrollViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/monetization/widgets/cellHorizontalScroll/presentation/singleCell/SingleCellHorizontalScrollVI;", "Ll10/i;", "container", "Landroid/widget/FrameLayout;", "rootContainer", "LWZ/l;", "tokenizedAnalytics", "LUg/a;", "actionHandlerComponentApi", "<init>", "(Ll10/i;Landroid/widget/FrameLayout;LWZ/l;LUg/a;)V", "", "setRootLocatorIfExists", "()Lkotlin/Unit;", "onViewInVisibleBounds", "()V", "item", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/monetization/widgets/cellHorizontalScroll/presentation/singleCell/SingleCellHorizontalScrollVI;Ll20/d;)V", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/monetization/widgets/cellHorizontalScroll/presentation/singleCell/SingleCellHorizontalScrollVI;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Landroid/widget/FrameLayout;", "LWZ/l;", "Lkotlin/Function1;", "LTg/b;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/monetization/widgets/cellHorizontalScroll/presentation/multiCell/nested/NestedHorizontalCellWrapper;", "cellWrapper", "Lru/ozon/app/android/monetization/widgets/cellHorizontalScroll/presentation/multiCell/nested/NestedHorizontalCellWrapper;", "monetization_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class SingleCellHorizontalScrollViewHolder extends k<SingleCellHorizontalScrollVI> {

    @NotNull
    private final Function1<b, Unit> actionHandler;

    @NotNull
    private final NestedHorizontalCellWrapper cellWrapper;

    @NotNull
    private final FrameLayout rootContainer;

    @NotNull
    private final l tokenizedAnalytics;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleCellHorizontalScrollViewHolder(@NotNull i container, @NotNull FrameLayout rootContainer, @NotNull l tokenizedAnalytics, @NotNull a actionHandlerComponentApi) {
        super(rootContainer);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(rootContainer, "rootContainer");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(actionHandlerComponentApi, "actionHandlerComponentApi");
        this.rootContainer = rootContainer;
        this.tokenizedAnalytics = tokenizedAnalytics;
        Function1<b, Unit> b11 = new e.a(container.Q(), container.a0(), new SingleCellHorizontalScrollViewHolder$actionHandler$1(this), actionHandlerComponentApi).b();
        this.actionHandler = b11;
        Context context = rootContainer.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        NestedHorizontalCellWrapper nestedHorizontalCellWrapper = new NestedHorizontalCellWrapper(context, true, b11);
        rootContainer.addView(nestedHorizontalCellWrapper);
        this.cellWrapper = nestedHorizontalCellWrapper;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Unit setRootLocatorIfExists() {
        TestInfo testInfo;
        String automatizationId;
        SingleCellHorizontalScrollVI boundData = getBoundData();
        if (boundData == null || (testInfo = boundData.getTestInfo()) == null || (automatizationId = testInfo.getAutomatizationId()) == null) {
            return null;
        }
        this.rootContainer.setContentDescription(automatizationId);
        return Unit.f71690a;
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j, lk0.b
    public void onViewInVisibleBounds() {
        super.onViewInVisibleBounds();
        setRootLocatorIfExists();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull SingleCellHorizontalScrollVI item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        final FrameLayout frameLayout = this.rootContainer;
        G.a(frameLayout, new Runnable() { // from class: ru.ozon.app.android.monetization.widgets.cellHorizontalScroll.presentation.singleCell.SingleCellHorizontalScrollViewHolder$bind$$inlined$doOnPreDraw$1
            @Override // java.lang.Runnable
            public final void run() {
                this.setRootLocatorIfExists();
            }
        });
        this.cellWrapper.bind(item.getCell());
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull SingleCellHorizontalScrollVI item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            m.c(this.tokenizedAnalytics, tokenizedEvent, null);
        }
    }
}
