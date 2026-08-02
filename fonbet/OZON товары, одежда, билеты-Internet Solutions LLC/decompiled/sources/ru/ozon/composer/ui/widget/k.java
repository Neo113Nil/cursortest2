package ru.ozon.composer.ui.widget;

import Sc.InterfaceC3999a;
import WZ.t;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import androidx.lifecycle.J;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import h20.InterfaceC6786a;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import m10.C8042d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;

@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u00032\u00020\u0004B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010JA\u0010\u0017\u001a\u00020\u000e2\u001a\u0010\u0015\u001a\u0016\u0012\u0004\u0012\u00020\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u0013\u0018\u00010\u00112\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J)\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ=\u0010$\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u00142\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010!\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fH\u0000¢\u0006\u0004\b\"\u0010#J'\u0010'\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u00142\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\u001d\u001a\u00020\u001cH\u0000¢\u0006\u0004\b%\u0010&J\u0011\u0010(\u001a\u0004\u0018\u00018\u0000H\u0007¢\u0006\u0004\b(\u0010)J\u0017\u0010.\u001a\u00020\u000e2\u0006\u0010+\u001a\u00020*H\u0000¢\u0006\u0004\b,\u0010-J\u001f\u0010$\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\nH$¢\u0006\u0004\b$\u0010/J'\u0010$\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b$\u0010\u0010J)\u00100\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\u000eH\u0016¢\u0006\u0004\b2\u00103J\u0017\u00106\u001a\u00020\u000e2\u0006\u00105\u001a\u000204H\u0014¢\u0006\u0004\b6\u00107J\u000f\u00108\u001a\u00020\u000eH\u0016¢\u0006\u0004\b8\u00103J\u000f\u00109\u001a\u00020\u000eH\u0016¢\u0006\u0004\b9\u00103J\u0017\u0010:\u001a\u00020\u000e2\u0006\u00105\u001a\u000204H\u0014¢\u0006\u0004\b:\u00107J\u0017\u0010=\u001a\u00020\u000e2\u0006\u0010<\u001a\u00020;H\u0016¢\u0006\u0004\b=\u0010>J\u0015\u0010@\u001a\u00020\u000e2\u0006\u0010?\u001a\u00020\u0014¢\u0006\u0004\b@\u0010AJ\u001b\u0010C\u001a\u0004\u0018\u00018\u0001\"\b\b\u0001\u0010B*\u00020 H\u0004¢\u0006\u0004\bC\u0010DJ)\u0010E\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\bE\u0010\u0010J\u0017\u0010H\u001a\u00020G2\u0006\u0010F\u001a\u00020;H\u0002¢\u0006\u0004\bH\u0010IR.\u0010L\u001a\u0004\u0018\u00010J2\b\u0010K\u001a\u0004\u0018\u00010J8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\bL\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR(\u0010R\u001a\u0004\u0018\u00018\u00002\b\u0010K\u001a\u0004\u0018\u00018\u00008\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bT\u0010)R(\u0010?\u001a\u0004\u0018\u00010\u00142\b\u0010K\u001a\u0004\u0018\u00010\u00148\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b?\u0010U\u001a\u0004\bV\u0010WR$\u0010\u001b\u001a\u00020\u001a2\u0006\u0010K\u001a\u00020\u001a8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001b\u0010X\u001a\u0004\bY\u0010ZR@\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\u0014\u0010K\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00118\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0016\u0010[\u001a\u0004\b\\\u0010]RL\u0010\u0015\u001a\u0016\u0012\u0004\u0012\u00020\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u0013\u0018\u00010\u00112\u001a\u0010K\u001a\u0016\u0012\u0004\u0012\u00020\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u0013\u0018\u00010\u00118\u0004@BX\u0084\u000e¢\u0006\f\n\u0004\b\u0015\u0010[\u001a\u0004\b^\u0010]R\u0016\u0010_\u001a\u00020;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010`R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010aR\u0018\u0010+\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010bR\u0014\u0010d\u001a\u00020c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010eR\u0018\u0010!\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010fR\u0011\u0010j\u001a\u00020g8F¢\u0006\u0006\u001a\u0004\bh\u0010iR\u0011\u0010n\u001a\u00020k8F¢\u0006\u0006\u001a\u0004\bl\u0010m¨\u0006o"}, d2 = {"Lru/ozon/composer/ui/widget/k;", "Ll20/c;", "I", "Ljk0/j;", "Lkk0/a;", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "item", "Ll20/d;", "info", "", "payload", "", "bindItem", "(Ll20/c;Ll20/d;Ljava/lang/Object;)V", "", "", "", "Lru/ozon/composer/ui/widget/l;", "nestedWidgets", "nestedPages", "bindPlaceholders", "(Ljava/util/Map;Ljava/util/Map;)V", "widgetViewItem", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "bindTrackingData", "(Lru/ozon/composer/ui/widget/l;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Lh20/a;", "widgetViewModel", "bind$composer_recycler_ui_release", "(Lru/ozon/composer/ui/widget/l;Ll20/c;Lru/ozon/composer/ui/widget/f;Lh20/a;Ljava/lang/Object;)V", "bind", "bindData$composer_recycler_ui_release", "(Lru/ozon/composer/ui/widget/l;Ll20/c;Lru/ozon/composer/ui/widget/f;)V", "bindData", "getBoundedData", "()Ll20/c;", "LW10/a;", "composerWidgetTracker", "setComposerWidgetTracker$composer_recycler_ui_release", "(LW10/a;)V", "setComposerWidgetTracker", "(Ll20/c;Ll20/d;)V", "trackView", "(Ll20/c;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "onAttach", "()V", "Landroidx/lifecycle/J;", "lifecycle", "onAttachViewModel", "(Landroidx/lifecycle/J;)V", "onViewInVisibleBounds", "onDetach", "onDetachViewModel", "", "offset", "updateVerticalOffset", "(J)V", "viewItem", "track", "(Lru/ozon/composer/ui/widget/l;)V", "T", "getWidgetViewModel", "()Lh20/a;", "bindInternal", "coordinateY", "LWZ/e;", "widgetCoordinateYModifier", "(J)LWZ/e;", "Lm10/d;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "bindingAdapter", "Lm10/d;", "getBindingAdapter", "()Lm10/d;", "setBindingAdapter$composer_recycler_ui_release", "(Lm10/d;)V", "boundData", "Ll20/c;", "getBoundData", "Lru/ozon/composer/ui/widget/l;", "getViewItem", "()Lru/ozon/composer/ui/widget/l;", "LW10/c;", "getTrackingData", "()LW10/c;", "Ljava/util/Map;", "getNestedPages", "()Ljava/util/Map;", "getNestedWidgets", "viewCoordinateY", "J", "Lru/ozon/composer/ui/widget/f;", "LW10/a;", "Lh20/c;", "vmLifecycleOwner", "Lh20/c;", "Lh20/a;", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "context", "Landroid/content/res/Resources;", "getResources", "()Landroid/content/res/Resources;", "resources", "composer-recycler-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class k<I extends l20.c> extends jk0.j implements kk0.a {
    private C8042d bindingAdapter;
    private I boundData;
    private W10.a composerWidgetTracker;
    private Map<String, String> nestedPages;
    private Map<String, ? extends List<l>> nestedWidgets;

    @NotNull
    private W10.c trackingData;
    private long viewCoordinateY;
    private l viewItem;
    private f viewedPond;

    @NotNull
    private final h20.c vmLifecycleOwner;
    private InterfaceC6786a widgetViewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(@NotNull View view) {
        super(view);
        W10.c cVar;
        Intrinsics.checkNotNullParameter(view, "view");
        cVar = W10.c.f33193d;
        this.trackingData = cVar;
        this.viewCoordinateY = Long.MIN_VALUE;
        this.vmLifecycleOwner = new h20.c();
    }

    public static /* synthetic */ void bind$composer_recycler_ui_release$default(k kVar, l lVar, l20.c cVar, f fVar, InterfaceC6786a interfaceC6786a, Object obj, int i11, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: bind");
        }
        if ((i11 & 16) != 0) {
            obj = null;
        }
        kVar.bind$composer_recycler_ui_release(lVar, cVar, fVar, interfaceC6786a, obj);
    }

    private final void bindInternal(I item, l20.d info, Object payload) {
        this.itemView.setTag(R.id.tag_key_widget_name, info.c().i());
        onDetachViewModel(this.vmLifecycleOwner);
        this.vmLifecycleOwner.a();
        if (payload == null) {
            bind(item, info);
        } else {
            bind(item, info, payload);
        }
        onAttachViewModel(this.vmLifecycleOwner);
    }

    public static /* synthetic */ void bindItem$default(k kVar, l20.c cVar, l20.d dVar, Object obj, int i11, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: bindItem");
        }
        if ((i11 & 4) != 0) {
            obj = null;
        }
        kVar.bindItem(cVar, dVar, obj);
    }

    private final WZ.e widgetCoordinateYModifier(final long coordinateY) {
        return new WZ.e() { // from class: ru.ozon.composer.ui.widget.j
            @Override // WZ.e
            public final WZ.g modifyParams(UZ.a aVar, WZ.g gVar) {
                WZ.g widgetCoordinateYModifier$lambda$5;
                widgetCoordinateYModifier$lambda$5 = k.widgetCoordinateYModifier$lambda$5(coordinateY, (UZ.d) aVar, gVar);
                return widgetCoordinateYModifier$lambda$5;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WZ.g widgetCoordinateYModifier$lambda$5(long j11, UZ.a aVar, WZ.g params) {
        Intrinsics.checkNotNullParameter(aVar, "<unused var>");
        Intrinsics.checkNotNullParameter(params, "params");
        LinkedHashMap a11 = WZ.h.a(params.b());
        a11.put("coordinateY", Long.valueOf(j11));
        return WZ.g.a(params, a11, null, 2);
    }

    protected abstract void bind(@NotNull I item, @NotNull l20.d info);

    protected void bind(@NotNull I item, @NotNull l20.d info, @NotNull Object payload) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(payload, "payload");
        bind(item, info);
    }

    public final void bind$composer_recycler_ui_release(@NotNull l widgetViewItem, @NotNull I item, @NotNull f viewedPond, InterfaceC6786a widgetViewModel, Object payload) {
        Intrinsics.checkNotNullParameter(widgetViewItem, "widgetViewItem");
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(viewedPond, "viewedPond");
        this.widgetViewModel = widgetViewModel;
        bindData$composer_recycler_ui_release(widgetViewItem, item, viewedPond);
        bindInternal(item, widgetViewItem.c(), payload);
    }

    public final void bindData$composer_recycler_ui_release(@NotNull l widgetViewItem, @NotNull I item, @NotNull f viewedPond) {
        Intrinsics.checkNotNullParameter(widgetViewItem, "widgetViewItem");
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(viewedPond, "viewedPond");
        this.boundData = item;
        this.viewItem = widgetViewItem;
        this.nestedPages = widgetViewItem.h();
        this.nestedWidgets = widgetViewItem.g();
        this.trackingData = widgetViewItem.n();
        this.viewedPond = viewedPond;
    }

    @InterfaceC3999a
    public final void bindItem(@NotNull I item, @NotNull l20.d info, Object payload) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.boundData = item;
        bindInternal(item, info, payload);
    }

    @InterfaceC3999a
    public final void bindPlaceholders(Map<String, ? extends List<l>> nestedWidgets, Map<String, String> nestedPages) {
        this.nestedPages = nestedPages;
        this.nestedWidgets = nestedWidgets;
    }

    @InterfaceC3999a
    public final void bindTrackingData(@NotNull l widgetViewItem, @NotNull W10.c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(widgetViewItem, "widgetViewItem");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        this.viewItem = widgetViewItem;
        this.trackingData = trackingData;
        this.viewedPond = viewedPond;
    }

    public final C8042d getBindingAdapter() {
        return this.bindingAdapter;
    }

    public final I getBoundData() {
        return this.boundData;
    }

    @InterfaceC3999a
    public final I getBoundedData() {
        return this.boundData;
    }

    @NotNull
    public final Context getContext() {
        Context context = this.itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return context;
    }

    public final Map<String, String> getNestedPages() {
        return this.nestedPages;
    }

    protected final Map<String, List<l>> getNestedWidgets() {
        return this.nestedWidgets;
    }

    @NotNull
    public final Resources getResources() {
        Resources resources = getContext().getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        return resources;
    }

    @NotNull
    public final W10.c getTrackingData() {
        return this.trackingData;
    }

    public final l getViewItem() {
        return this.viewItem;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final <T extends InterfaceC6786a> T getWidgetViewModel() {
        T t2;
        try {
            t2 = (T) this.widgetViewModel;
        } catch (ClassCastException unused) {
        }
        if (t2 != null) {
            return t2;
        }
        return null;
    }

    @Override // jk0.j
    public void onAttach() {
        super.onAttach();
        if (this.vmLifecycleOwner.c()) {
            return;
        }
        this.vmLifecycleOwner.a();
        onAttachViewModel(this.vmLifecycleOwner);
    }

    protected void onAttachViewModel(@NotNull J lifecycle) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
    }

    @Override // jk0.j
    public void onDetach() {
        super.onDetach();
        this.vmLifecycleOwner.b();
        onDetachViewModel(this.vmLifecycleOwner);
    }

    protected void onDetachViewModel(@NotNull J lifecycle) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
    }

    @Override // jk0.j, lk0.b
    public void onViewInVisibleBounds() {
        super.onViewInVisibleBounds();
        l lVar = this.viewItem;
        if (lVar != null) {
            track(lVar);
        }
        I i11 = this.boundData;
        if (i11 != null) {
            trackView(i11, this.trackingData, this.viewedPond);
        }
    }

    public final void setBindingAdapter$composer_recycler_ui_release(C8042d c8042d) {
        this.bindingAdapter = c8042d;
    }

    public final void setComposerWidgetTracker$composer_recycler_ui_release(@NotNull W10.a composerWidgetTracker) {
        Intrinsics.checkNotNullParameter(composerWidgetTracker, "composerWidgetTracker");
        this.composerWidgetTracker = composerWidgetTracker;
    }

    public final void track(@NotNull l viewItem) {
        Intrinsics.checkNotNullParameter(viewItem, "viewItem");
        W10.a aVar = this.composerWidgetTracker;
        if (aVar != null) {
            W10.d o11 = viewItem.o();
            t m11 = viewItem.m();
            long j11 = this.viewCoordinateY;
            Long valueOf = Long.valueOf(j11);
            if (j11 == Long.MIN_VALUE) {
                valueOf = null;
            }
            aVar.a(o11, m11, valueOf != null ? widgetCoordinateYModifier(valueOf.longValue()) : null);
        }
    }

    public void trackView(@NotNull I item, @NotNull W10.c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
    }

    @Override // kk0.a
    public void updateVerticalOffset(long offset) {
        this.viewCoordinateY = offset;
    }
}
