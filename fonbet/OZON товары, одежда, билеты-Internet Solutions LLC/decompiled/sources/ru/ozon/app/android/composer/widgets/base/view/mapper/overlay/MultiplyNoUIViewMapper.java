package ru.ozon.app.android.composer.widgets.base.view.mapper.overlay;

import Sc.InterfaceC3999a;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.G;
import androidx.lifecycle.J;
import j10.h;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l10.e;
import l10.i;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.base.ComposerLifecycleOwner;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.composer.ui.widget.l;

@InterfaceC3999a
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u0000*\u0010\b\u0000\u0010\u0003*\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0001*\n\b\u0001\u0010\u0005*\u0004\u0018\u00010\u0004*\b\b\u0002\u0010\u0006*\u00020\u00022\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0007B\u0007¢\u0006\u0004\b\b\u0010\tJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ-\u0010\u001e\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\r\u001a\u00020\f2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001cH&¢\u0006\u0004\b\u001e\u0010\u001fJ'\u0010\"\u001a\u00020\u00102\u0006\u0010!\u001a\u00020 2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\"\u0010#J'\u0010\u0014\u001a\u00020\u00102\u0006\u0010$\u001a\u00028\u00002\u0006\u0010%\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\u0014\u0010&J'\u0010'\u001a\u00020\u00102\u0006\u0010!\u001a\u00020 2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b'\u0010#J\u001d\u0010(\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b(\u0010)J\u001d\u0010*\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b*\u0010)J5\u0010,\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010+\u001a\u00020\f2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001c2\u0006\u0010%\u001a\u00020\u000eH\u0016¢\u0006\u0004\b,\u0010-J+\u00102\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00028\u00022\u0006\u0010/\u001a\u00020.2\n\b\u0002\u00101\u001a\u0004\u0018\u000100H\u0016¢\u0006\u0004\b2\u00103R>\u00107\u001a\u001e\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00028\u000004j\u000e\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00028\u0000`68\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R2\u0010>\u001a\u001e\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020=04j\u000e\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020=`68\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u00108¨\u0006?"}, d2 = {"Lru/ozon/app/android/composer/widgets/base/view/mapper/overlay/MultiplyNoUIViewMapper;", "Lru/ozon/composer/ui/widget/k;", "Ll20/c;", "Holder", "", "S", "I", "Lru/ozon/app/android/composer/widgets/base/view/mapper/overlay/NoUIViewMapper;", "<init>", "()V", "Ll10/i;", "container", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "Lru/ozon/composer/ui/widget/l;", "item", "", "dispatchConstructLayout", "(Ll10/i;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/composer/ui/widget/l;)V", "viewObject", "bind", "(Ll10/i;Lru/ozon/composer/ui/widget/l;Lru/ozon/app/android/composer/ComposerReferences;)V", "Landroid/view/ViewGroup;", "composerRootView", "destroyHolder", "(Landroid/view/ViewGroup;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/composer/ui/widget/l;)V", "dispatchDestroy", "(Lru/ozon/composer/ui/widget/l;)V", "Lj10/h;", "viewItemHelper", "createHolder", "(Landroid/view/ViewGroup;Lru/ozon/app/android/composer/ComposerReferences;Lj10/h;)Lru/ozon/composer/ui/widget/k;", "Landroid/view/View;", "view", "addView", "(Landroid/view/View;Landroid/view/ViewGroup;Lru/ozon/app/android/composer/ComposerReferences;)V", "holder", "widgetViewItem", "(Lru/ozon/composer/ui/widget/k;Lru/ozon/composer/ui/widget/l;Lru/ozon/app/android/composer/ComposerReferences;)V", "removeView", "setItem", "(Ll10/i;Lru/ozon/composer/ui/widget/l;)V", "removeItem", "refs", "onContainerInitialized", "(Landroid/view/ViewGroup;Lru/ozon/app/android/composer/ComposerReferences;Lj10/h;Lru/ozon/composer/ui/widget/l;)V", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Ll20/c;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "holders", "Ljava/util/HashMap;", "getHolders", "()Ljava/util/HashMap;", "setHolders", "(Ljava/util/HashMap;)V", "Lru/ozon/app/android/composer/widgets/base/ComposerLifecycleOwner;", "lifecycles", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class MultiplyNoUIViewMapper<Holder extends k<? extends c>, S, I extends c> extends NoUIViewMapper<S, I> {

    @NotNull
    private HashMap<Long, Holder> holders = new HashMap<>();

    @NotNull
    private HashMap<Long, ComposerLifecycleOwner> lifecycles = new HashMap<>();

    private final void bind(i container, l viewObject, ComposerReferences references) {
        Holder holder = this.holders.get(Long.valueOf(viewObject.f()));
        if (holder != null) {
            holder.bindPlaceholders(viewObject.g(), viewObject.h());
            holder.bindTrackingData(viewObject, viewObject.n(), container.c0());
            bind((MultiplyNoUIViewMapper<Holder, S, I>) holder, viewObject, references);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void destroyHolder(ViewGroup composerRootView, ComposerReferences references, l viewObject) {
        Holder remove = this.holders.remove(Long.valueOf(viewObject.f()));
        if (remove != null) {
            View itemView = remove.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            removeView(itemView, composerRootView, references);
        }
        dispatchDestroy(viewObject);
    }

    private final void dispatchConstructLayout(final i container, ComposerReferences references, l item) {
        final MultiplyNoUIViewMapper<Holder, S, I> multiplyNoUIViewMapper;
        final ComposerReferences composerReferences;
        final l lVar;
        final ViewGroup Z11 = container.Z();
        h.a<l> q11 = container.J().q();
        if (this.lifecycles.get(Long.valueOf(item.f())) == null) {
            final ComposerLifecycleOwner composerLifecycleOwner = new ComposerLifecycleOwner();
            this.lifecycles.put(Long.valueOf(item.f()), composerLifecycleOwner);
            final AbstractC5434v lifecycle = references.getContainer().g().getLifecycle();
            multiplyNoUIViewMapper = this;
            composerReferences = references;
            lVar = item;
            lifecycle.a(new G() { // from class: ru.ozon.app.android.composer.widgets.base.view.mapper.overlay.MultiplyNoUIViewMapper$dispatchConstructLayout$1
                @Override // androidx.lifecycle.G
                public void onStateChanged(J source, AbstractC5434v.a event) {
                    Intrinsics.checkNotNullParameter(source, "source");
                    Intrinsics.checkNotNullParameter(event, "event");
                    ComposerLifecycleOwner.this.handleLifecycleEvent(event);
                    if (event != AbstractC5434v.a.ON_RESUME) {
                        if (event == AbstractC5434v.a.ON_DESTROY) {
                            multiplyNoUIViewMapper.destroyHolder(Z11, composerReferences, lVar);
                            lifecycle.e(this);
                            return;
                        }
                        return;
                    }
                    container.f0().a(lVar.o(), lVar.m(), null);
                    c e11 = lVar.e();
                    if (e11 != null) {
                        multiplyNoUIViewMapper.trackView(e11, lVar.n(), container.c0());
                    }
                }
            });
            onContainerInitialized(Z11, composerReferences, q11, lVar);
        } else {
            multiplyNoUIViewMapper = this;
            composerReferences = references;
            lVar = item;
        }
        Holder createHolder = createHolder(Z11, composerReferences, q11);
        multiplyNoUIViewMapper.holders.put(Long.valueOf(lVar.f()), createHolder);
        View itemView = createHolder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        addView(itemView, Z11, composerReferences);
    }

    private final void dispatchDestroy(l viewObject) {
        ComposerLifecycleOwner remove = this.lifecycles.remove(Long.valueOf(viewObject.f()));
        if (remove != null) {
            remove.handleLifecycleEvent(AbstractC5434v.a.ON_DESTROY);
        }
    }

    public abstract void addView(@NotNull View view, @NotNull ViewGroup composerRootView, @NotNull ComposerReferences references);

    public abstract void bind(@NotNull Holder holder, @NotNull l widgetViewItem, @NotNull ComposerReferences references);

    @NotNull
    public abstract Holder createHolder(@NotNull ViewGroup composerRootView, @NotNull ComposerReferences references, @NotNull h<l> viewItemHelper);

    public void onContainerInitialized(@NotNull ViewGroup composerRootView, @NotNull ComposerReferences refs, @NotNull h<l> viewItemHelper, @NotNull l widgetViewItem) {
        Intrinsics.checkNotNullParameter(composerRootView, "composerRootView");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(viewItemHelper, "viewItemHelper");
        Intrinsics.checkNotNullParameter(widgetViewItem, "widgetViewItem");
    }

    @Override // c20.s
    public final void removeItem(@NotNull i container, @NotNull l item) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(item, "item");
        ViewGroup Z11 = container.Z();
        e V11 = container.V();
        Intrinsics.g(V11, "null cannot be cast to non-null type ru.ozon.app.android.composer.ComposerReferences");
        destroyHolder(Z11, (ComposerReferences) V11, item);
    }

    public abstract void removeView(@NotNull View view, @NotNull ViewGroup composerRootView, @NotNull ComposerReferences references);

    @Override // c20.s
    public final void setItem(@NotNull i container, @NotNull l item) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(item, "item");
        ViewGroup Z11 = container.Z();
        e V11 = container.V();
        Intrinsics.g(V11, "null cannot be cast to non-null type ru.ozon.app.android.composer.ComposerReferences");
        ComposerReferences composerReferences = (ComposerReferences) V11;
        Holder holder = this.holders.get(Long.valueOf(item.f()));
        if (holder == null) {
            dispatchConstructLayout(container, composerReferences, item);
            bind(container, item, composerReferences);
            return;
        }
        View itemView = holder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        removeView(itemView, Z11, composerReferences);
        View itemView2 = holder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView2, "itemView");
        addView(itemView2, Z11, composerReferences);
        if (Intrinsics.d(holder.getBoundedData(), item.d())) {
            return;
        }
        bind(container, item, composerReferences);
    }

    public void trackView(@NotNull I item, @NotNull W10.c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
    }
}
