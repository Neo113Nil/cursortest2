package ru.ozon.app.android.composer.widgets.v2.overlay;

import Sc.InterfaceC3999a;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.G;
import androidx.lifecycle.J;
import hi.InterfaceC6958a;
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
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u0000*\f\b\u0000\u0010\u0003*\u00060\u0001j\u0002`\u0002*\u0010\b\u0001\u0010\u0006*\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004*\n\b\u0002\u0010\b*\u0004\u0018\u00010\u0007*\b\b\u0003\u0010\t*\u00020\u00052\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\nB\u0007¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ-\u0010!\u001a\u00028\u00012\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00110\u001fH&¢\u0006\u0004\b!\u0010\"J'\u0010%\u001a\u00020\u00132\u0006\u0010$\u001a\u00020#2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0010\u001a\u00020\u000fH&¢\u0006\u0004\b%\u0010&J'\u0010\u0017\u001a\u00020\u00132\u0006\u0010'\u001a\u00028\u00012\u0006\u0010(\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH&¢\u0006\u0004\b\u0017\u0010)J'\u0010*\u001a\u00020\u00132\u0006\u0010$\u001a\u00020#2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0010\u001a\u00020\u000fH&¢\u0006\u0004\b*\u0010&J\u001d\u0010+\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b+\u0010,J\u001d\u0010-\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b-\u0010,J5\u0010/\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010.\u001a\u00020\u000f2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00110\u001f2\u0006\u0010(\u001a\u00020\u0011H\u0016¢\u0006\u0004\b/\u00100J+\u00105\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00028\u00032\u0006\u00102\u001a\u0002012\n\b\u0002\u00104\u001a\u0004\u0018\u000103H\u0016¢\u0006\u0004\b5\u00106R>\u0010:\u001a\u001e\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u00028\u000107j\u000e\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u00028\u0001`98\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R2\u0010A\u001a\u001e\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u00020@07j\u000e\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u00020@`98\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010;¨\u0006B"}, d2 = {"Lru/ozon/app/android/composer/widgets/v2/overlay/MultiplyNoUIViewMapper2;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "C", "Lru/ozon/composer/ui/widget/k;", "Ll20/c;", "Holder", "", "S", "I", "Lru/ozon/app/android/composer/widgets/v2/overlay/NoUIViewMapper2;", "<init>", "()V", "Ll10/i;", "container", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "Lru/ozon/composer/ui/widget/l;", "item", "", "dispatchConstructLayout", "(Ll10/i;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/composer/ui/widget/l;)V", "viewObject", "bind", "(Ll10/i;Lru/ozon/composer/ui/widget/l;Lru/ozon/app/android/composer/ComposerReferences;)V", "Landroid/view/ViewGroup;", "composerRootView", "destroyHolder", "(Landroid/view/ViewGroup;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/composer/ui/widget/l;)V", "dispatchDestroy", "(Lru/ozon/composer/ui/widget/l;)V", "Lj10/h;", "viewItemHelper", "createHolder", "(Landroid/view/ViewGroup;Lru/ozon/app/android/composer/ComposerReferences;Lj10/h;)Lru/ozon/composer/ui/widget/k;", "Landroid/view/View;", "view", "addView", "(Landroid/view/View;Landroid/view/ViewGroup;Lru/ozon/app/android/composer/ComposerReferences;)V", "holder", "widgetViewItem", "(Lru/ozon/composer/ui/widget/k;Lru/ozon/composer/ui/widget/l;Lru/ozon/app/android/composer/ComposerReferences;)V", "removeView", "setItem", "(Ll10/i;Lru/ozon/composer/ui/widget/l;)V", "removeItem", "refs", "onContainerInitialized", "(Landroid/view/ViewGroup;Lru/ozon/app/android/composer/ComposerReferences;Lj10/h;Lru/ozon/composer/ui/widget/l;)V", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Ll20/c;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "holders", "Ljava/util/HashMap;", "getHolders", "()Ljava/util/HashMap;", "setHolders", "(Ljava/util/HashMap;)V", "Lru/ozon/app/android/composer/widgets/base/ComposerLifecycleOwner;", "lifecycles", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class MultiplyNoUIViewMapper2<C extends InterfaceC6958a, Holder extends k<? extends c>, S, I extends c> extends NoUIViewMapper2<C, S, I> {

    @NotNull
    private HashMap<Long, Holder> holders = new HashMap<>();

    @NotNull
    private HashMap<Long, ComposerLifecycleOwner> lifecycles = new HashMap<>();

    private final void bind(i container, l viewObject, ComposerReferences references) {
        Holder holder = this.holders.get(Long.valueOf(viewObject.f()));
        if (holder != null) {
            holder.bindPlaceholders(viewObject.g(), viewObject.h());
            holder.bindTrackingData(viewObject, viewObject.n(), container.c0());
            bind((MultiplyNoUIViewMapper2<C, Holder, S, I>) holder, viewObject, references);
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
        final MultiplyNoUIViewMapper2<C, Holder, S, I> multiplyNoUIViewMapper2;
        final ComposerReferences composerReferences;
        final l lVar;
        final ViewGroup Z11 = container.Z();
        h.a<l> q11 = container.J().q();
        if (this.lifecycles.get(Long.valueOf(item.f())) == null) {
            final ComposerLifecycleOwner composerLifecycleOwner = new ComposerLifecycleOwner();
            this.lifecycles.put(Long.valueOf(item.f()), composerLifecycleOwner);
            final AbstractC5434v lifecycle = references.getContainer().g().getLifecycle();
            multiplyNoUIViewMapper2 = this;
            composerReferences = references;
            lVar = item;
            lifecycle.a(new G() { // from class: ru.ozon.app.android.composer.widgets.v2.overlay.MultiplyNoUIViewMapper2$dispatchConstructLayout$1
                @Override // androidx.lifecycle.G
                public void onStateChanged(J source, AbstractC5434v.a event) {
                    Intrinsics.checkNotNullParameter(source, "source");
                    Intrinsics.checkNotNullParameter(event, "event");
                    ComposerLifecycleOwner.this.handleLifecycleEvent(event);
                    if (event != AbstractC5434v.a.ON_RESUME) {
                        if (event == AbstractC5434v.a.ON_DESTROY) {
                            multiplyNoUIViewMapper2.destroyHolder(Z11, composerReferences, lVar);
                            lifecycle.e(this);
                            return;
                        }
                        return;
                    }
                    container.f0().a(lVar.o(), lVar.m(), null);
                    c e11 = lVar.e();
                    if (e11 != null) {
                        multiplyNoUIViewMapper2.trackView(e11, lVar.n(), container.c0());
                    }
                }
            });
            onContainerInitialized(Z11, composerReferences, q11, lVar);
        } else {
            multiplyNoUIViewMapper2 = this;
            composerReferences = references;
            lVar = item;
        }
        Holder createHolder = createHolder(Z11, composerReferences, q11);
        multiplyNoUIViewMapper2.holders.put(Long.valueOf(lVar.f()), createHolder);
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
