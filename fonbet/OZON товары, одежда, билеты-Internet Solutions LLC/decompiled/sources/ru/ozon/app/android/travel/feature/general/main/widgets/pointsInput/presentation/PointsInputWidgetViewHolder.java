package ru.ozon.app.android.travel.feature.general.main.widgets.pointsInput.presentation;

import Sc.InterfaceC4008j;
import android.net.Uri;
import android.view.View;
import android.widget.LinearLayout;
import androidx.core.view.Y;
import com.google.android.gms.actions.SearchIntents;
import d20.AbstractC6065b;
import d20.InterfaceC6068e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.network.utils.UriExtKt;
import ru.ozon.app.android.travel.feature.general.main.widgets.pointsInput.view.PointsInputView;
import ru.ozon.app.android.travel.utils.DebouncedTextWatcher;
import ru.ozon.app.android.utils.LazyUtilsKt;
import v10.C10183a;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0016\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001e\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010(\u001a\u0004\u0018\u00010%8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0014\u0010*\u001a\u00020\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010\u001d¨\u0006+"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/pointsInput/presentation/PointsInputWidgetViewHolder;", "Ld20/b;", "Lru/ozon/app/android/travel/feature/general/main/widgets/pointsInput/presentation/PointsInputVO;", "Ll10/i;", "container", "Ld20/e;", "Landroid/widget/LinearLayout;", "viewFactory", "<init>", "(Ll10/i;Ld20/e;)V", "", SearchIntents.EXTRA_QUERY, "", "onQueryChanged", "(Ljava/lang/String;)V", "getSearchUrl", "(Ljava/lang/String;)Ljava/lang/String;", "onWidgetCreated", "()V", "item", "bind", "(Lru/ozon/app/android/travel/feature/general/main/widgets/pointsInput/presentation/PointsInputVO;)V", "onWidgetDestroyed", "parent", "Landroid/widget/LinearLayout;", "Landroid/view/View;", "view$delegate", "LSc/j;", "getView", "()Landroid/view/View;", "view", "Ll10/b;", "controller", "Ll10/b;", "Lru/ozon/app/android/travel/utils/DebouncedTextWatcher;", "debouncedTextWatcher", "Lru/ozon/app/android/travel/utils/DebouncedTextWatcher;", "Lru/ozon/app/android/travel/feature/general/main/widgets/pointsInput/view/PointsInputView;", "getContainerView", "()Lru/ozon/app/android/travel/feature/general/main/widgets/pointsInput/view/PointsInputView;", "containerView", "getMetricView", "metricView", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PointsInputWidgetViewHolder extends AbstractC6065b<PointsInputVO> {

    @NotNull
    private final InterfaceC7851b controller;

    @NotNull
    private final DebouncedTextWatcher debouncedTextWatcher;

    @NotNull
    private final LinearLayout parent;

    /* renamed from: view$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j view;

    public PointsInputWidgetViewHolder(@NotNull i container, @NotNull InterfaceC6068e<LinearLayout> viewFactory) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(viewFactory, "viewFactory");
        this.parent = C10183a.o(container.Y());
        this.view = LazyUtilsKt.unsafeLazy(new PointsInputWidgetViewHolder$view$2(viewFactory, this));
        this.controller = container.M();
        this.debouncedTextWatcher = new DebouncedTextWatcher(0L, null, new PointsInputWidgetViewHolder$debouncedTextWatcher$1(this), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PointsInputView getContainerView() {
        View view = getView();
        if (view instanceof PointsInputView) {
            return (PointsInputView) view;
        }
        return null;
    }

    private final String getSearchUrl(String query) {
        PointsInputVO boundData = getBoundData();
        if (boundData == null) {
            return null;
        }
        String builder = UriExtKt.replaceQueryParameter(Uri.parse(boundData.getPageUrl()), boundData.getQueryParamName(), query).toString();
        Intrinsics.checkNotNullExpressionValue(builder, "toString(...)");
        return ru.ozon.app.android.utils.UriExtKt.removeSchema(builder);
    }

    private final View getView() {
        return (View) this.view.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onQueryChanged(String query) {
        String searchUrl;
        if (query != null) {
            PointsInputVO boundData = getBoundData();
            if (query.equals(boundData != null ? boundData.getQuery() : null)) {
                query = null;
            }
            if (query == null || (searchUrl = getSearchUrl(query)) == null) {
                return;
            }
            InterfaceC7851b.a.e(this.controller, searchUrl, null, null, 6);
        }
    }

    @Override // d20.AbstractC6065b
    @NotNull
    public View getMetricView() {
        return getView();
    }

    @Override // d20.AbstractC6065b
    public void onWidgetCreated() {
        this.parent.addView(getView());
        PointsInputView containerView = getContainerView();
        if (containerView != null) {
            containerView.addSearchQueryTextWatcher(this.debouncedTextWatcher);
        }
    }

    @Override // d20.AbstractC6065b
    public void onWidgetDestroyed() {
        this.parent.removeView(getView());
        PointsInputView containerView = getContainerView();
        if (containerView != null) {
            containerView.removeSearchQueryTextWatcher(this.debouncedTextWatcher);
        }
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull PointsInputVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        final PointsInputView containerView = getContainerView();
        if (containerView != null) {
            containerView.bind(item);
            int i11 = Y.f42258g;
            if (!containerView.isLaidOut() || containerView.isLayoutRequested()) {
                containerView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: ru.ozon.app.android.travel.feature.general.main.widgets.pointsInput.presentation.PointsInputWidgetViewHolder$bind$lambda$1$$inlined$doOnLayout$1
                    @Override // android.view.View.OnLayoutChangeListener
                    public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                        Intrinsics.checkNotNullParameter(view, "view");
                        view.removeOnLayoutChangeListener(this);
                        PointsInputView.this.toggleKeyboard();
                    }
                });
            } else {
                containerView.toggleKeyboard();
            }
        }
    }
}
