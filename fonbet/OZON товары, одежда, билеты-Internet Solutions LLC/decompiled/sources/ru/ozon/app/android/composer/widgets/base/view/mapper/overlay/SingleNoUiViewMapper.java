package ru.ozon.app.android.composer.widgets.base.view.mapper.overlay;

import Sc.InterfaceC3999a;
import U7.d;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.G;
import androidx.lifecycle.J;
import androidx.lifecycle.L;
import j10.h;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import l10.e;
import l10.i;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.base.view.mapper.overlay.SingleNoUiViewMapper;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.l;

@InterfaceC3999a
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u0000*\n\b\u0000\u0010\u0002*\u0004\u0018\u00010\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00052\u00020\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0013\u0010\u0011J\u000f\u0010\u0014\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0014\u0010\bJ\u001d\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\r¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\r¢\u0006\u0004\b\u0018\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\u001b\u0010\u001aJ'\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ+\u0010$\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00028\u00012\u0006\u0010!\u001a\u00020 2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\b$\u0010%J'\u0010&\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b&\u0010\u0011J-\u0010&\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\f\u001a\u00020\u000b2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\r0'H\u0017¢\u0006\u0004\b&\u0010)J5\u0010&\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\f\u001a\u00020\u000b2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\r0'2\u0006\u0010\u0012\u001a\u00020\rH\u0017¢\u0006\u0004\b&\u0010*J'\u0010+\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b+\u0010\u0011J-\u0010+\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010,\u001a\u00020\u000b2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\r0'H\u0017¢\u0006\u0004\b+\u0010)J5\u0010+\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010,\u001a\u00020\u000b2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\r0'2\u0006\u0010\u0012\u001a\u00020\rH\u0017¢\u0006\u0004\b+\u0010*J\u001f\u0010.\u001a\u00020-2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\f\u001a\u00020\u000bH\u0017¢\u0006\u0004\b.\u0010/J'\u00100\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\rH\u0016¢\u0006\u0004\b0\u00101R\u0016\u00103\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u00105R\u001a\u00107\u001a\b\u0012\u0004\u0012\u00020\r068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u001a\u00109\u001a\b\u0012\u0004\u0012\u00020\r068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u00108R\u0014\u0010=\u001a\u00020:8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b;\u0010<¨\u0006>"}, d2 = {"Lru/ozon/app/android/composer/widgets/base/view/mapper/overlay/SingleNoUiViewMapper;", "", "S", "Ll20/c;", "I", "Lru/ozon/app/android/composer/widgets/base/view/mapper/overlay/NoUIViewMapper;", "Landroidx/lifecycle/J;", "<init>", "()V", "Ll10/i;", "container", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "Lru/ozon/composer/ui/widget/l;", "viewItem", "", "dispatchConstructLayout", "(Ll10/i;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/composer/ui/widget/l;)V", "widgetViewItem", "dispatchRemove", "dispatchDestroy", "item", "setItem", "(Ll10/i;Lru/ozon/composer/ui/widget/l;)V", "removeItem", "beforeChange", "(Ll10/i;)V", "afterChange", "Landroid/view/ViewGroup;", "composerRootView", "bind", "(Landroid/view/ViewGroup;Lru/ozon/composer/ui/widget/l;Lru/ozon/app/android/composer/ComposerReferences;)V", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Ll20/c;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "constructLayout", "Lj10/h;", "viewItemHelper", "(Landroid/view/ViewGroup;Lru/ozon/app/android/composer/ComposerReferences;Lj10/h;)V", "(Landroid/view/ViewGroup;Lru/ozon/app/android/composer/ComposerReferences;Lj10/h;Lru/ozon/composer/ui/widget/l;)V", "onContainerInitialized", "refs", "", "handleRemove", "(Landroid/view/ViewGroup;Lru/ozon/app/android/composer/ComposerReferences;)Z", "removeView", "(Landroid/view/ViewGroup;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/composer/ui/widget/l;)V", "Landroidx/lifecycle/L;", "registry", "Landroidx/lifecycle/L;", "Lru/ozon/composer/ui/widget/l;", "", "items", "Ljava/util/List;", "removes", "Landroidx/lifecycle/v;", "getLifecycle", "()Landroidx/lifecycle/v;", "lifecycle", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class SingleNoUiViewMapper<S, I extends c> extends NoUIViewMapper<S, I> implements J {
    private l item;

    @NotNull
    private L registry = new L(this);

    @NotNull
    private final List<l> items = new ArrayList();

    @NotNull
    private final List<l> removes = new ArrayList();

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void afterChange$lambda$0(i iVar, l lVar, SingleNoUiViewMapper singleNoUiViewMapper, ComposerReferences composerReferences, J j11, AbstractC5434v.a event) {
        Intrinsics.checkNotNullParameter(j11, "<unused var>");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event == AbstractC5434v.a.ON_RESUME) {
            iVar.f0().a(lVar.o(), lVar.m(), null);
            c e11 = lVar.e();
            if (e11 != null) {
                singleNoUiViewMapper.trackView(e11, lVar.n(), iVar.c0());
            }
        }
        if (event != AbstractC5434v.a.ON_DESTROY) {
            singleNoUiViewMapper.registry.h(event);
        } else {
            singleNoUiViewMapper.dispatchRemove(iVar, composerReferences, lVar);
        }
    }

    private final void dispatchConstructLayout(i container, ComposerReferences references, l viewItem) {
        onContainerInitialized(container, references, viewItem);
        constructLayout(container, references, viewItem);
    }

    private final void dispatchDestroy() {
        this.registry.h(AbstractC5434v.a.ON_DESTROY);
        this.registry = new L(this);
    }

    private final void dispatchRemove(i container, ComposerReferences references, l widgetViewItem) {
        if (this.registry.b().a(AbstractC5434v.b.CREATED)) {
            removeView(container.Z(), references, widgetViewItem);
            dispatchDestroy();
        }
        this.item = null;
    }

    @Override // c20.s
    protected void afterChange(@NotNull final i container) {
        Intrinsics.checkNotNullParameter(container, "container");
        ViewGroup Z11 = container.Z();
        e V11 = container.V();
        Intrinsics.g(V11, "null cannot be cast to non-null type ru.ozon.app.android.composer.ComposerReferences");
        final ComposerReferences composerReferences = (ComposerReferences) V11;
        if (this.items.isEmpty()) {
            l lVar = this.item;
            if (this.removes.isEmpty() || lVar == null) {
                return;
            }
            dispatchRemove(container, composerReferences, lVar);
            return;
        }
        final l lVar2 = (l) C7714v.K(this.items);
        if (this.registry.b() == AbstractC5434v.b.INITIALIZED) {
            dispatchConstructLayout(container, composerReferences, lVar2);
            final AbstractC5434v c11 = d.c(composerReferences);
            final G g10 = new G() { // from class: Qr.a
                @Override // androidx.lifecycle.G
                public final void onStateChanged(J j11, AbstractC5434v.a aVar) {
                    SingleNoUiViewMapper.afterChange$lambda$0(i.this, lVar2, this, composerReferences, j11, aVar);
                }
            };
            c11.a(g10);
            final L l11 = this.registry;
            if (l11.b() == AbstractC5434v.b.DESTROYED) {
                c11.e(g10);
            } else {
                l11.a(new DefaultLifecycleObserver() { // from class: ru.ozon.app.android.composer.widgets.base.view.mapper.overlay.SingleNoUiViewMapper$afterChange$$inlined$whenDestroyed$1
                    @Override // androidx.lifecycle.DefaultLifecycleObserver
                    public void onDestroy(J owner) {
                        Intrinsics.checkNotNullParameter(owner, "owner");
                        c11.e(g10);
                        AbstractC5434v.this.e(this);
                    }
                });
            }
        }
        if (Intrinsics.d(this.item, lVar2)) {
            return;
        }
        bind(Z11, lVar2, composerReferences);
        this.item = lVar2;
    }

    @Override // c20.s
    public final void beforeChange(@NotNull i container) {
        Intrinsics.checkNotNullParameter(container, "container");
        this.items.clear();
        this.removes.clear();
    }

    public void bind(@NotNull ViewGroup composerRootView, @NotNull l widgetViewItem, @NotNull ComposerReferences references) {
        Intrinsics.checkNotNullParameter(composerRootView, "composerRootView");
        Intrinsics.checkNotNullParameter(widgetViewItem, "widgetViewItem");
        Intrinsics.checkNotNullParameter(references, "references");
    }

    @InterfaceC3999a
    public void constructLayout(@NotNull ViewGroup composerRootView, @NotNull ComposerReferences references, @NotNull h<l> viewItemHelper) {
        Intrinsics.checkNotNullParameter(composerRootView, "composerRootView");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(viewItemHelper, "viewItemHelper");
    }

    @Override // androidx.lifecycle.J
    @NotNull
    public AbstractC5434v getLifecycle() {
        return this.registry;
    }

    @InterfaceC3999a
    public boolean handleRemove(@NotNull ViewGroup composerRootView, @NotNull ComposerReferences references) {
        Intrinsics.checkNotNullParameter(composerRootView, "composerRootView");
        Intrinsics.checkNotNullParameter(references, "references");
        return false;
    }

    @InterfaceC3999a
    public void onContainerInitialized(@NotNull ViewGroup composerRootView, @NotNull ComposerReferences refs, @NotNull h<l> viewItemHelper) {
        Intrinsics.checkNotNullParameter(composerRootView, "composerRootView");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(viewItemHelper, "viewItemHelper");
    }

    @Override // c20.s
    public final void removeItem(@NotNull i container, @NotNull l item) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(item, "item");
        this.removes.add(item);
    }

    public void removeView(@NotNull ViewGroup composerRootView, @NotNull ComposerReferences references, @NotNull l widgetViewItem) {
        Intrinsics.checkNotNullParameter(composerRootView, "composerRootView");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(widgetViewItem, "widgetViewItem");
        handleRemove(composerRootView, references);
    }

    @Override // c20.s
    public final void setItem(@NotNull i container, @NotNull l item) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(item, "item");
        this.items.add(item);
    }

    public void trackView(@NotNull I item, @NotNull W10.c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
    }

    public void constructLayout(@NotNull i container, @NotNull ComposerReferences references, @NotNull l viewItem) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(viewItem, "viewItem");
        constructLayout(container.Z(), references, container.J().q(), viewItem);
    }

    public void onContainerInitialized(@NotNull i container, @NotNull ComposerReferences references, @NotNull l viewItem) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(viewItem, "viewItem");
        onContainerInitialized(container.Z(), references, container.J().q(), viewItem);
    }

    @InterfaceC3999a
    public void constructLayout(@NotNull ViewGroup composerRootView, @NotNull ComposerReferences references, @NotNull h<l> viewItemHelper, @NotNull l widgetViewItem) {
        Intrinsics.checkNotNullParameter(composerRootView, "composerRootView");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(viewItemHelper, "viewItemHelper");
        Intrinsics.checkNotNullParameter(widgetViewItem, "widgetViewItem");
        constructLayout(composerRootView, references, viewItemHelper);
    }

    @InterfaceC3999a
    public void onContainerInitialized(@NotNull ViewGroup composerRootView, @NotNull ComposerReferences refs, @NotNull h<l> viewItemHelper, @NotNull l widgetViewItem) {
        Intrinsics.checkNotNullParameter(composerRootView, "composerRootView");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(viewItemHelper, "viewItemHelper");
        Intrinsics.checkNotNullParameter(widgetViewItem, "widgetViewItem");
        onContainerInitialized(composerRootView, refs, viewItemHelper);
    }
}
