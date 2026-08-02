package d20;

import android.view.View;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.J;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.l;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000 I*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u0001JB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\r\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\f\u0010\u000bJ\u0017\u0010\u0012\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0014\u001a\u00020\tH\u0000¢\u0006\u0004\b\u0013\u0010\u0005J\u000f\u0010\u0015\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0015\u0010\u0005J\u000f\u0010\u0016\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0016\u0010\u0005J\u0017\u0010\u0017\u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u0000H&¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0019\u0010\u0005J'\u0010\u001e\u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\tH\u0016¢\u0006\u0004\b \u0010\u0005J\u000f\u0010!\u001a\u00020\tH\u0016¢\u0006\u0004\b!\u0010\u0005J\u001f\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\"\u0010\u000bJ\u0017\u0010\u001e\u001a\u00020\t2\u0006\u0010$\u001a\u00020#H\u0000¢\u0006\u0004\b%\u0010&R\u001a\u0010(\u001a\u00020'8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u001a\u0010-\u001a\u00020,8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R(\u00102\u001a\u0004\u0018\u00018\u00002\b\u00101\u001a\u0004\u0018\u00018\u00008\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R(\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u00101\u001a\u0004\u0018\u00010\u00068\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0007\u00106\u001a\u0004\b7\u00108R$\u0010\u001b\u001a\u00020\u001a2\u0006\u00101\u001a\u00020\u001a8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001b\u00109\u001a\u0004\b:\u0010;R@\u0010>\u001a\u0010\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00020=\u0018\u00010<2\u0014\u00101\u001a\u0010\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00020=\u0018\u00010<8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010ARL\u0010C\u001a\u0016\u0012\u0004\u0012\u00020=\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060B\u0018\u00010<2\u001a\u00101\u001a\u0016\u0012\u0004\u0012\u00020=\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060B\u0018\u00010<8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bC\u0010?\u001a\u0004\bD\u0010AR\u0016\u0010H\u001a\u0004\u0018\u00010E8&X¦\u0004¢\u0006\u0006\u001a\u0004\bF\u0010G¨\u0006K"}, d2 = {"Ld20/b;", "Ll20/c;", "I", "Landroidx/lifecycle/J;", "<init>", "()V", "Lru/ozon/composer/ui/widget/l;", "viewItem", "item", "", "preBind", "(Lru/ozon/composer/ui/widget/l;Ll20/c;)V", "dispatchCreate$composer_recycler_ui_release", "dispatchCreate", "Landroidx/lifecycle/v$a;", "event", "dispatchLifecycleEvent$composer_recycler_ui_release", "(Landroidx/lifecycle/v$a;)V", "dispatchLifecycleEvent", "dispatchDestroy$composer_recycler_ui_release", "dispatchDestroy", "addView", "removeView", "bind", "(Ll20/c;)V", "onWidgetCreated", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Ll20/c;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "onRefresh", "onWidgetDestroyed", "bind$composer_recycler_ui_release", "Ll10/i;", "container", "trackView$composer_recycler_ui_release", "(Ll10/i;)V", "Ld20/c;", "lifecycleOwner", "Ld20/c;", "getLifecycleOwner$composer_recycler_ui_release", "()Ld20/c;", "Landroidx/lifecycle/v;", "lifecycle", "Landroidx/lifecycle/v;", "getLifecycle", "()Landroidx/lifecycle/v;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "boundData", "Ll20/c;", "getBoundData", "()Ll20/c;", "Lru/ozon/composer/ui/widget/l;", "getViewItem", "()Lru/ozon/composer/ui/widget/l;", "LW10/c;", "getTrackingData", "()LW10/c;", "", "", "nestedPages", "Ljava/util/Map;", "getNestedPages", "()Ljava/util/Map;", "", "nestedWidgets", "getNestedWidgets", "Landroid/view/View;", "getMetricView", "()Landroid/view/View;", "metricView", "Companion", "b", "composer-recycler-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: d20.b, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC6065b<I extends l20.c> implements J {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    private static final AbstractC6065b UNSPECIFIED = new a();
    private I boundData;

    @NotNull
    private final AbstractC5434v lifecycle;

    @NotNull
    private final C6066c lifecycleOwner;
    private Map<String, String> nestedPages;
    private Map<String, ? extends List<l>> nestedWidgets;

    @NotNull
    private W10.c trackingData;
    private l viewItem;

    /* renamed from: d20.b$a */
    public static final class a extends AbstractC6065b {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // d20.AbstractC6065b
        public final void bind(l20.c cVar) {
            Void item = (Void) cVar;
            Intrinsics.checkNotNullParameter(item, "item");
        }

        @Override // d20.AbstractC6065b
        public final View getMetricView() {
            return null;
        }

        public final String toString() {
            return "UnspecifiedOverlayWidgetHolder";
        }
    }

    /* renamed from: d20.b$b, reason: collision with other inner class name and from kotlin metadata */
    public static final class Companion {
        @NotNull
        public static AbstractC6065b a() {
            AbstractC6065b abstractC6065b = AbstractC6065b.UNSPECIFIED;
            Intrinsics.g(abstractC6065b, "null cannot be cast to non-null type ru.ozon.composer.ui.widget.overlay.holder.OverlayWidgetHolder<I of ru.ozon.composer.ui.widget.overlay.holder.OverlayWidgetHolder.Companion.unspecified>");
            return abstractC6065b;
        }
    }

    public AbstractC6065b() {
        W10.c cVar;
        C6066c c6066c = new C6066c();
        this.lifecycleOwner = c6066c;
        this.lifecycle = c6066c.getLifecycle();
        cVar = W10.c.f33193d;
        this.trackingData = cVar;
    }

    private final void preBind(l viewItem, I item) {
        this.viewItem = viewItem;
        this.boundData = item;
        this.trackingData = viewItem.n();
        this.nestedPages = viewItem.h();
        this.nestedWidgets = viewItem.g();
    }

    public void addView() {
    }

    public abstract void bind(@NotNull I item);

    public final void bind$composer_recycler_ui_release(@NotNull l viewItem, @NotNull I item) {
        Intrinsics.checkNotNullParameter(viewItem, "viewItem");
        Intrinsics.checkNotNullParameter(item, "item");
        preBind(viewItem, item);
        bind(item);
    }

    public final void dispatchCreate$composer_recycler_ui_release(@NotNull l viewItem, @NotNull I item) {
        Intrinsics.checkNotNullParameter(viewItem, "viewItem");
        Intrinsics.checkNotNullParameter(item, "item");
        preBind(viewItem, item);
        onWidgetCreated();
        addView();
    }

    public final void dispatchDestroy$composer_recycler_ui_release() {
        removeView();
        onWidgetDestroyed();
    }

    public final void dispatchLifecycleEvent$composer_recycler_ui_release(@NotNull AbstractC5434v.a event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.lifecycleOwner.a(event);
    }

    public final I getBoundData() {
        return this.boundData;
    }

    @Override // androidx.lifecycle.J
    @NotNull
    public AbstractC5434v getLifecycle() {
        return this.lifecycle;
    }

    @NotNull
    /* renamed from: getLifecycleOwner$composer_recycler_ui_release, reason: from getter */
    public final C6066c getLifecycleOwner() {
        return this.lifecycleOwner;
    }

    public abstract View getMetricView();

    public final Map<String, String> getNestedPages() {
        return this.nestedPages;
    }

    public final Map<String, List<l>> getNestedWidgets() {
        return this.nestedWidgets;
    }

    @NotNull
    public final W10.c getTrackingData() {
        return this.trackingData;
    }

    public final l getViewItem() {
        return this.viewItem;
    }

    public void onRefresh() {
    }

    public void onWidgetCreated() {
    }

    public void onWidgetDestroyed() {
    }

    public void removeView() {
    }

    public void trackView(@NotNull I item, @NotNull W10.c trackingData, @NotNull f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        Intrinsics.checkNotNullParameter(viewedPond, "viewedPond");
    }

    public final void trackView$composer_recycler_ui_release(@NotNull i container) {
        Intrinsics.checkNotNullParameter(container, "container");
        l lVar = this.viewItem;
        if (lVar != null) {
            container.f0().a(lVar.o(), lVar.m(), null);
        }
        I i11 = this.boundData;
        if (i11 != null) {
            trackView(i11, this.trackingData, container.c0());
        }
    }
}
