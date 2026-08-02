package ru.ozon.app.android.widgets.debug.transparenttopwidget;

import android.view.View;
import android.view.ViewGroup;
import d20.AbstractC6065b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\f\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0010R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/widgets/debug/transparenttopwidget/TransparentPlaceholderViewHolder;", "Ld20/b;", "Lru/ozon/app/android/widgets/debug/transparenttopwidget/TransparentPlaceholderVO;", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "view", "<init>", "(Landroid/view/ViewGroup;Landroid/view/View;)V", "", "onWidgetCreated", "()V", "onWidgetDestroyed", "item", "bind", "(Lru/ozon/app/android/widgets/debug/transparenttopwidget/TransparentPlaceholderVO;)V", "Landroid/view/ViewGroup;", "Landroid/view/View;", "metricView", "getMetricView", "()Landroid/view/View;", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TransparentPlaceholderViewHolder extends AbstractC6065b<TransparentPlaceholderVO> {

    @NotNull
    private final View metricView;

    @NotNull
    private final ViewGroup parent;

    @NotNull
    private final View view;

    public TransparentPlaceholderViewHolder(@NotNull ViewGroup parent, @NotNull View view) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(view, "view");
        this.parent = parent;
        this.view = view;
        this.metricView = view;
    }

    @Override // d20.AbstractC6065b
    @NotNull
    public View getMetricView() {
        return this.metricView;
    }

    @Override // d20.AbstractC6065b
    public void onWidgetCreated() {
        super.onWidgetCreated();
        this.parent.addView(this.view);
    }

    @Override // d20.AbstractC6065b
    public void onWidgetDestroyed() {
        super.onWidgetDestroyed();
        this.parent.removeView(this.view);
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull TransparentPlaceholderVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        View view = this.view;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = ResourceExtKt.toPx(item.getHeight());
        view.setLayoutParams(layoutParams);
    }
}
