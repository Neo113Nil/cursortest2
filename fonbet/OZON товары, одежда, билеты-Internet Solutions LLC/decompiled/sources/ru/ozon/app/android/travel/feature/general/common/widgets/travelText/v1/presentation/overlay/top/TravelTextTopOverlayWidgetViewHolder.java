package ru.ozon.app.android.travel.feature.general.common.widgets.travelText.v1.presentation.overlay.top;

import Sc.InterfaceC4008j;
import android.view.View;
import android.widget.LinearLayout;
import d20.AbstractC6065b;
import d20.InterfaceC6068e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.common.widgets.travelText.v1.presentation.TravelTextBinder;
import ru.ozon.app.android.travel.feature.general.common.widgets.travelText.v1.presentation.TravelTextVO;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import v10.C10183a;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B%\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0013R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001b\u0010\u001c\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001b¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/travelText/v1/presentation/overlay/top/TravelTextTopOverlayWidgetViewHolder;", "Ld20/b;", "Lru/ozon/app/android/travel/feature/general/common/widgets/travelText/v1/presentation/TravelTextVO;", "Ll10/i;", "container", "Lru/ozon/app/android/travel/feature/general/common/widgets/travelText/v1/presentation/TravelTextBinder;", "binder", "Ld20/e;", "Landroid/widget/LinearLayout;", "viewFactory", "<init>", "(Ll10/i;Lru/ozon/app/android/travel/feature/general/common/widgets/travelText/v1/presentation/TravelTextBinder;Ld20/e;)V", "", "onWidgetCreated", "()V", "onWidgetDestroyed", "item", "bind", "(Lru/ozon/app/android/travel/feature/general/common/widgets/travelText/v1/presentation/TravelTextVO;)V", "Ll10/i;", "Lru/ozon/app/android/travel/feature/general/common/widgets/travelText/v1/presentation/TravelTextBinder;", "parent", "Landroid/widget/LinearLayout;", "Landroid/view/View;", "view$delegate", "LSc/j;", "getView", "()Landroid/view/View;", "view", "getMetricView", "metricView", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelTextTopOverlayWidgetViewHolder extends AbstractC6065b<TravelTextVO> {

    @NotNull
    private final TravelTextBinder binder;

    @NotNull
    private final i container;

    @NotNull
    private final LinearLayout parent;

    /* renamed from: view$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j view;

    public TravelTextTopOverlayWidgetViewHolder(@NotNull i container, @NotNull TravelTextBinder binder, @NotNull InterfaceC6068e<LinearLayout> viewFactory) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(binder, "binder");
        Intrinsics.checkNotNullParameter(viewFactory, "viewFactory");
        this.container = container;
        this.binder = binder;
        this.parent = C10183a.o(container.Y());
        this.view = LazyUtilsKt.unsafeLazy(new TravelTextTopOverlayWidgetViewHolder$view$2(viewFactory, this));
    }

    private final View getView() {
        return (View) this.view.getValue();
    }

    @Override // d20.AbstractC6065b
    @NotNull
    public View getMetricView() {
        return getView();
    }

    @Override // d20.AbstractC6065b
    public void onWidgetCreated() {
        this.parent.addView(getView());
        View view = getView();
        TextAtomView textAtomView = view instanceof TextAtomView ? (TextAtomView) view : null;
        if (textAtomView != null) {
            this.binder.init(textAtomView, this.container, this);
        }
    }

    @Override // d20.AbstractC6065b
    public void onWidgetDestroyed() {
        this.parent.removeView(getView());
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull TravelTextVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.binder.bind(item);
    }
}
