package ru.ozon.app.android.travel.feature.general.order.widgets.orderNavBar.view;

import android.content.Context;
import android.widget.FrameLayout;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.utils.placeholder.NestedWidgetsManager;
import ru.ozon.app.android.travel.utils.placeholder.Placeholder;
import ru.ozon.app.android.travel.utils.placeholder.PlaceholderParser;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.composer.ui.widget.l;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\rJ-\u0010\u0012\u001a\u00020\t2\u001c\u0010\u0011\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\t0\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J/\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\t2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R`\u0010'\u001aN\u0012\u0004\u0012\u00020\u0010\u0012\u001c\u0012\u001a\u0012\b\u0012\u00060#j\u0002`$0\"j\f\u0012\b\u0012\u00060#j\u0002`$`%0!j&\u0012\u0004\u0012\u00020\u0010\u0012\u001c\u0012\u001a\u0012\b\u0012\u00060#j\u0002`$0\"j\f\u0012\b\u0012\u00060#j\u0002`$`%`&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010*\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0018\u0010-\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R.\u0010\u0011\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\t\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010/¨\u00060"}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/orderNavBar/view/OrderNavBarContentPlaceholderView;", "Landroid/widget/FrameLayout;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Ll10/i;", "container", "", "setupNestedWidgetManager", "(Ll10/i;)V", "onWidgetCreated", "()V", "onWidgetDestroyed", "Lkotlin/Function2;", "", "onPlaceholderSizeChanged", "setOnSizeChangeListener", "(Lkotlin/jvm/functions/Function2;)V", "width", "height", "oldw", "oldh", "onSizeChanged", "(IIII)V", "Lru/ozon/composer/ui/widget/l;", "viewItem", "bind", "(Lru/ozon/composer/ui/widget/l;)V", "Lru/ozon/app/android/travel/utils/placeholder/PlaceholderParser;", "placeholderParser", "Lru/ozon/app/android/travel/utils/placeholder/PlaceholderParser;", "Ljava/util/HashMap;", "Lru/ozon/composer/ui/widget/k;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Lkotlin/collections/HashMap;", "currentViewHolders", "Ljava/util/HashMap;", "Lru/ozon/app/android/travel/utils/placeholder/Placeholder;", "currentPlaceholder", "Lru/ozon/app/android/travel/utils/placeholder/Placeholder;", "Lru/ozon/app/android/travel/utils/placeholder/NestedWidgetsManager;", "nestedWidgetsManager", "Lru/ozon/app/android/travel/utils/placeholder/NestedWidgetsManager;", "Lkotlin/jvm/functions/Function2;", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OrderNavBarContentPlaceholderView extends FrameLayout {

    @NotNull
    private Placeholder currentPlaceholder;

    @NotNull
    private final HashMap<Integer, k<c>> currentViewHolders;
    private NestedWidgetsManager nestedWidgetsManager;
    private Function2<? super Integer, ? super Integer, Unit> onPlaceholderSizeChanged;

    @NotNull
    private final PlaceholderParser placeholderParser;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderNavBarContentPlaceholderView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.placeholderParser = new PlaceholderParser("content");
        this.currentViewHolders = new HashMap<>();
        this.currentPlaceholder = Placeholder.INSTANCE.getEMPTY();
    }

    public final void bind(l viewItem) {
        Placeholder parsePlaceholders = this.placeholderParser.parsePlaceholders(viewItem, this.currentPlaceholder);
        this.currentPlaceholder = parsePlaceholders;
        NestedWidgetsManager nestedWidgetsManager = this.nestedWidgetsManager;
        if (nestedWidgetsManager != null) {
            nestedWidgetsManager.addNestedWidgets(parsePlaceholders, this.currentViewHolders);
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int width, int height, int oldw, int oldh) {
        Function2<? super Integer, ? super Integer, Unit> function2 = this.onPlaceholderSizeChanged;
        if (function2 != null) {
            function2.invoke(null, Integer.valueOf(height));
        }
        super.onSizeChanged(width, height, oldw, oldh);
    }

    public void onWidgetCreated() {
        NestedWidgetsManager nestedWidgetsManager = this.nestedWidgetsManager;
        if (nestedWidgetsManager != null) {
            nestedWidgetsManager.setContainer(this);
        }
    }

    public void onWidgetDestroyed() {
        NestedWidgetsManager nestedWidgetsManager = this.nestedWidgetsManager;
        if (nestedWidgetsManager != null) {
            nestedWidgetsManager.detachNestedViewHolders(this.currentViewHolders);
        }
    }

    public void setOnSizeChangeListener(@NotNull Function2<? super Integer, ? super Integer, Unit> onPlaceholderSizeChanged) {
        Intrinsics.checkNotNullParameter(onPlaceholderSizeChanged, "onPlaceholderSizeChanged");
        this.onPlaceholderSizeChanged = onPlaceholderSizeChanged;
    }

    public void setupNestedWidgetManager(@NotNull i container) {
        Intrinsics.checkNotNullParameter(container, "container");
        this.nestedWidgetsManager = new NestedWidgetsManager(container, container.d0(), container.c0());
    }
}
