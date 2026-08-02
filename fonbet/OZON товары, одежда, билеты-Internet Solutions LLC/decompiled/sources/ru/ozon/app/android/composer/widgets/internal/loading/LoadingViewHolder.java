package ru.ozon.app.android.composer.widgets.internal.loading;

import Sc.InterfaceC4008j;
import android.content.res.ColorStateList;
import android.view.View;
import android.widget.ProgressBar;
import g20.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.utils.AppType;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\t\b\u0001\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0013\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00022\n\u0010\u0012\u001a\u00060\u0010j\u0002`\u0011H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0015\u0010\u000eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0016R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0017R\u001d\u0010\u001d\u001a\u0004\u0018\u00010\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010 \u001a\u0004\u0018\u00010\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u001f\u0010\u001c¨\u0006!"}, d2 = {"Lru/ozon/app/android/composer/widgets/internal/loading/LoadingViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lg20/b;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "itemView", "LIh/b;", "pagePerformanceTracker", "Lru/ozon/app/android/utils/AppType;", "appType", "<init>", "(Landroid/view/View;LIh/b;Lru/ozon/app/android/utils/AppType;)V", "", "setSelectLoaderColor", "()V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lg20/b;Ll20/d;)V", "onViewInVisibleBounds", "LIh/b;", "Lru/ozon/app/android/utils/AppType;", "", "selectLoaderColor$delegate", "LSc/j;", "getSelectLoaderColor", "()Ljava/lang/Integer;", "selectLoaderColor", "backgroundColor$delegate", "getBackgroundColor", "backgroundColor", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LoadingViewHolder extends k<b> {

    @NotNull
    private final AppType appType;

    /* renamed from: backgroundColor$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j backgroundColor;

    @NotNull
    private final Ih.b pagePerformanceTracker;

    /* renamed from: selectLoaderColor$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j selectLoaderColor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoadingViewHolder(@NotNull View itemView, @NotNull Ih.b pagePerformanceTracker, @NotNull AppType appType) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        Intrinsics.checkNotNullParameter(pagePerformanceTracker, "pagePerformanceTracker");
        Intrinsics.checkNotNullParameter(appType, "appType");
        this.pagePerformanceTracker = pagePerformanceTracker;
        this.appType = appType;
        this.selectLoaderColor = LazyUtilsKt.unsafeLazy(new LoadingViewHolder$selectLoaderColor$2(this));
        this.backgroundColor = LazyUtilsKt.unsafeLazy(new LoadingViewHolder$backgroundColor$2(this));
    }

    private final Integer getBackgroundColor() {
        return (Integer) this.backgroundColor.getValue();
    }

    private final Integer getSelectLoaderColor() {
        return (Integer) this.selectLoaderColor.getValue();
    }

    private final void setSelectLoaderColor() {
        Integer selectLoaderColor = getSelectLoaderColor();
        if (selectLoaderColor != null) {
            int intValue = selectLoaderColor.intValue();
            View view = this.itemView;
            ProgressBar progressBar = view instanceof ProgressBar ? (ProgressBar) view : null;
            if (progressBar != null) {
                progressBar.setIndeterminateTintList(ColorStateList.valueOf(intValue));
            }
        }
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j, lk0.b
    public void onViewInVisibleBounds() {
        super.onViewInVisibleBounds();
        this.pagePerformanceTracker.h();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull b item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        if (this.appType == AppType.SELECT) {
            setSelectLoaderColor();
        }
        Integer backgroundColor = getBackgroundColor();
        if (backgroundColor != null) {
            this.itemView.setBackgroundColor(backgroundColor.intValue());
        } else {
            this.itemView.setBackground(null);
        }
    }
}
