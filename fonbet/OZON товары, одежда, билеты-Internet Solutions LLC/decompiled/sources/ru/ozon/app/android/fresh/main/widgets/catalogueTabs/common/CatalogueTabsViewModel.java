package ru.ozon.app.android.fresh.main.widgets.catalogueTabs.common;

import Ae.C2399j;
import Ae.C2408n0;
import Ae.I0;
import Ae.InterfaceC2397i;
import Ae.M0;
import Ae.O0;
import Ae.x0;
import Sc.o;
import Wc.a;
import android.view.View;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.w0;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import h20.InterfaceC6786a;
import h3.C6788a;
import j10.InterfaceC7238a;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data.DynamicElementDTO;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.fresh.main.widgets.catalogueTabs.common.CatalogTabsScrollState;
import ru.ozon.app.android.fresh.main.widgets.catalogueTabs.common.scroll.CatalogTabsScrollEventListener;
import ru.ozon.app.android.fresh.main.widgets.catalogueTabs.common.scroll.CatalogueTabsScrollController;
import ru.ozon.app.android.fresh.main.widgets.catalogueTabs.common.scroll.ScrollTabAnchor;
import ru.ozon.composer.ui.widget.l;
import xe.B0;
import xe.C10727i;

@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u00032\u00020\u0004B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ=\u0010\u0014\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J)\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0019\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ)\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0019\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001c\u0010\u001bJ\u001f\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ*\u0010#\u001a\u00020\u0013*\b\u0012\u0004\u0012\u00020 0\u001f2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020 H\u0082@¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0013H\u0016¢\u0006\u0004\b%\u0010&J\u0015\u0010(\u001a\u00020\u00132\u0006\u0010'\u001a\u00020\u0017¢\u0006\u0004\b(\u0010)J\u0015\u0010,\u001a\u00020\u00132\u0006\u0010+\u001a\u00020*¢\u0006\u0004\b,\u0010-J\u001b\u00101\u001a\u00020\u00132\f\u00100\u001a\b\u0012\u0004\u0012\u00020/0.¢\u0006\u0004\b1\u00102J\r\u00103\u001a\u00020\u0013¢\u0006\u0004\b3\u0010&J%\u0010\u0014\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010+\u001a\u00020*¢\u0006\u0004\b\u0014\u00104J%\u0010\u0014\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u00106\u001a\u000205¢\u0006\u0004\b\u0014\u00107J\u0015\u00108\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b8\u00109J7\u0010<\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010:\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010;\u001a\u00020\u00172\b\b\u0002\u0010\u0019\u001a\u00020\t¢\u0006\u0004\b<\u0010=J\r\u0010>\u001a\u00020\u0013¢\u0006\u0004\b>\u0010&J&\u0010B\u001a\u00020\u00132\u0006\u0010;\u001a\u00020\u00172\f\u0010A\u001a\b\u0012\u0004\u0012\u00020@0?H\u0096\u0001¢\u0006\u0004\bB\u0010CJ \u0010E\u001a\u00020\u00132\u0006\u0010D\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\tH\u0096\u0001¢\u0006\u0004\bE\u0010\u001eJ\u0018\u0010G\u001a\u00020\u00132\u0006\u0010F\u001a\u00020 H\u0096A¢\u0006\u0004\bG\u0010HR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010IR\u0018\u0010K\u001a\u0004\u0018\u00010J8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u001a\u0010N\u001a\b\u0012\u0004\u0012\u00020\u00170M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u001a\u0010P\u001a\b\u0012\u0004\u0012\u00020 0M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010OR\u001a\u0010Q\u001a\b\u0012\u0004\u0012\u00020 0M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010OR\u001d\u0010F\u001a\b\u0012\u0004\u0012\u00020 0R8\u0006¢\u0006\f\n\u0004\bF\u0010S\u001a\u0004\bT\u0010UR\u0016\u0010V\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010WR\u0016\u0010X\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010WR\u0017\u0010Z\u001a\b\u0012\u0004\u0012\u00020\u00170R8F¢\u0006\u0006\u001a\u0004\bY\u0010U¨\u0006["}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/common/CatalogueTabsViewModel;", "Landroidx/lifecycle/w0;", "Lh20/a;", "Lru/ozon/app/android/composer/viewmodel/ComposerWidgetViewModel;", "", "Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/common/CatalogTabsController;", "catalogTabsController", "<init>", "(Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/common/CatalogTabsController;)V", "", "widgetScrollKey", "stableOffsetPx", "Lj10/a;", "Lru/ozon/composer/ui/widget/l;", "composerStore", "Ll10/b;", "composerController", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "scrollToWidget", "(IILj10/a;Ll10/b;Landroidx/recyclerview/widget/RecyclerView;)V", "newPosition", "", "isSelectedTabChanged", "offset", "updateNonStickyScrolling", "(IZI)V", "updateStickyScrolling", "forceUpdateScrollPositionIfNecessary", "(II)V", "LAe/i;", "Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/common/CatalogTabsScrollState;", "stickyState", "nonStickyState", "mergeStates", "(LAe/i;Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/common/CatalogTabsScrollState;Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/common/CatalogTabsScrollState;Lkotlin/coroutines/d;)Ljava/lang/Object;", "onCleared", "()V", "isVisible", "updateStickyVisibility", "(Z)V", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "setComposerRefs", "(Lru/ozon/app/android/composer/ComposerReferences;)V", "", "Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/common/scroll/ScrollTabAnchor;", DynamicElementDTO.TABS, "initTabs", "(Ljava/util/List;)V", "onUserClickedTab", "(IILru/ozon/app/android/composer/ComposerReferences;)V", "Ll10/i;", "container", "(IILl10/i;)V", "attachRecyclerListener", "(Landroidx/recyclerview/widget/RecyclerView;)V", "scrollPositionPx", "isSticky", "updateScrollingState", "(IIZZI)V", "restoreScrollState", "Ljava/lang/ref/WeakReference;", "Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/common/scroll/CatalogTabsScrollEventListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "registerTabsScrollListener", "(ZLjava/lang/ref/WeakReference;)V", "position", "forceScrollToPosition", "scrollState", "sendScrollState", "(Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/common/CatalogTabsScrollState;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/common/CatalogTabsController;", "Lxe/B0;", "scrollToWidgetJob", "Lxe/B0;", "LAe/x0;", "_stickyVisibleState", "LAe/x0;", "_stickyScrollingState", "_nonStickyScrollingState", "LAe/M0;", "LAe/M0;", "getScrollState", "()LAe/M0;", "nonStickyScrollPositionPx", "I", "stickyScrollPositionPx", "getStickyVisibleState", "stickyVisibleState", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CatalogueTabsViewModel extends w0 implements InterfaceC6786a {
    private final /* synthetic */ CatalogueTabsScrollController $$delegate_0;

    @NotNull
    private final x0<CatalogTabsScrollState> _nonStickyScrollingState;

    @NotNull
    private final x0<CatalogTabsScrollState> _stickyScrollingState;

    @NotNull
    private final x0<Boolean> _stickyVisibleState;

    @NotNull
    private final CatalogTabsController catalogTabsController;
    private int nonStickyScrollPositionPx;

    @NotNull
    private final M0<CatalogTabsScrollState> scrollState;
    private B0 scrollToWidgetJob;
    private int stickyScrollPositionPx;

    public CatalogueTabsViewModel(@NotNull CatalogTabsController catalogTabsController) {
        Intrinsics.checkNotNullParameter(catalogTabsController, "catalogTabsController");
        this.$$delegate_0 = CatalogueTabsScrollController.INSTANCE;
        this.catalogTabsController = catalogTabsController;
        this._stickyVisibleState = O0.a(Boolean.FALSE);
        CatalogTabsScrollState.Idle idle = CatalogTabsScrollState.Idle.INSTANCE;
        x0<CatalogTabsScrollState> a11 = O0.a(idle);
        this._stickyScrollingState = a11;
        x0<CatalogTabsScrollState> a12 = O0.a(idle);
        this._nonStickyScrollingState = a12;
        C2408n0 c2408n0 = new C2408n0(C2399j.j(a11, a12, new CatalogueTabsViewModel$scrollState$1(this, null)), new CatalogueTabsViewModel$scrollState$2(this));
        C6788a a13 = androidx.lifecycle.x0.a(this);
        int i11 = I0.f818a;
        this.scrollState = C2399j.M(c2408n0, a13, I0.a.c(), idle);
    }

    private final void forceUpdateScrollPositionIfNecessary(int newPosition, int offset) {
        if (this.stickyScrollPositionPx != this.nonStickyScrollPositionPx) {
            C10727i.c(androidx.lifecycle.x0.a(this), null, null, new CatalogueTabsViewModel$forceUpdateScrollPositionIfNecessary$1(this, offset, newPosition, null), 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object mergeStates(InterfaceC2397i<? super CatalogTabsScrollState> interfaceC2397i, CatalogTabsScrollState catalogTabsScrollState, CatalogTabsScrollState catalogTabsScrollState2, d<? super Unit> dVar) {
        boolean z11 = catalogTabsScrollState instanceof CatalogTabsScrollState.OrdinaryScrolling;
        if (z11 && (catalogTabsScrollState2 instanceof CatalogTabsScrollState.TransformScrolling)) {
            if (this.scrollState.getValue().getFinalTab() == catalogTabsScrollState.getFinalTab() && catalogTabsScrollState2.getFinalTab() == catalogTabsScrollState.getFinalTab()) {
                Object emit = interfaceC2397i.emit(CatalogTabsScrollState.TransformScrolling.copy$default((CatalogTabsScrollState.TransformScrolling) catalogTabsScrollState2, 0, 0, false, 1, null), dVar);
                return emit == a.COROUTINE_SUSPENDED ? emit : Unit.f71690a;
            }
            if (this.scrollState.getValue().getFinalTab() == catalogTabsScrollState.getFinalTab()) {
                return Unit.f71690a;
            }
            if (this.scrollState.getValue().getFinalTab() == catalogTabsScrollState2.getFinalTab() && !this.scrollState.getValue().getWasSelectedTabChanged()) {
                Object emit2 = interfaceC2397i.emit(CatalogTabsScrollState.TransformScrolling.copy$default((CatalogTabsScrollState.TransformScrolling) catalogTabsScrollState2, 0, 0, true, 1, null), dVar);
                return emit2 == a.COROUTINE_SUSPENDED ? emit2 : Unit.f71690a;
            }
            if (this.scrollState.getValue().getFinalTab() == 0) {
                Object emit3 = interfaceC2397i.emit(CatalogTabsScrollState.TransformScrolling.copy$default((CatalogTabsScrollState.TransformScrolling) catalogTabsScrollState2, 0, ((CatalogTabsScrollState.OrdinaryScrolling) catalogTabsScrollState).getDestinationTab(), false, 5, null), dVar);
                return emit3 == a.COROUTINE_SUSPENDED ? emit3 : Unit.f71690a;
            }
            Object emit4 = interfaceC2397i.emit(catalogTabsScrollState, dVar);
            return emit4 == a.COROUTINE_SUSPENDED ? emit4 : Unit.f71690a;
        }
        if (!z11 || !(catalogTabsScrollState2 instanceof CatalogTabsScrollState.Idle)) {
            boolean z12 = catalogTabsScrollState instanceof CatalogTabsScrollState.TransformScrolling;
            if (z12 && (catalogTabsScrollState2 instanceof CatalogTabsScrollState.TransformScrolling)) {
                if (catalogTabsScrollState.getFinalTab() == catalogTabsScrollState2.getFinalTab() && this.scrollState.getValue().getFinalTab() != catalogTabsScrollState.getFinalTab()) {
                    Object emit5 = interfaceC2397i.emit(catalogTabsScrollState, dVar);
                    return emit5 == a.COROUTINE_SUSPENDED ? emit5 : Unit.f71690a;
                }
            } else if (z12 && (catalogTabsScrollState2 instanceof CatalogTabsScrollState.Idle) && this.scrollState.getValue().getFinalTab() != catalogTabsScrollState.getFinalTab()) {
                Object emit6 = interfaceC2397i.emit(new CatalogTabsScrollState.OrdinaryScrolling(((CatalogTabsScrollState.TransformScrolling) catalogTabsScrollState).getOffset(), catalogTabsScrollState.getFinalTab(), true), dVar);
                return emit6 == a.COROUTINE_SUSPENDED ? emit6 : Unit.f71690a;
            }
        } else if (this.scrollState.getValue().getFinalTab() != catalogTabsScrollState.getFinalTab()) {
            Object emit7 = interfaceC2397i.emit(catalogTabsScrollState, dVar);
            return emit7 == a.COROUTINE_SUSPENDED ? emit7 : Unit.f71690a;
        }
        return Unit.f71690a;
    }

    private final void updateNonStickyScrolling(int newPosition, boolean isSelectedTabChanged, int offset) {
        CatalogTabsScrollState value = this._nonStickyScrollingState.getValue();
        if (!isSelectedTabChanged || value.getFinalTab() == newPosition || (value instanceof CatalogTabsScrollState.OrdinaryScrolling)) {
            forceUpdateScrollPositionIfNecessary(newPosition, offset);
        } else {
            this._nonStickyScrollingState.setValue(new CatalogTabsScrollState.TransformScrolling(offset, newPosition, true));
        }
    }

    private final void updateStickyScrolling(int newPosition, boolean isSelectedTabChanged, int offset) {
        CatalogTabsScrollState transformScrolling;
        x0<CatalogTabsScrollState> x0Var = this._stickyScrollingState;
        CatalogTabsScrollState value = x0Var.getValue();
        if (value instanceof CatalogTabsScrollState.Idle) {
            if (!isSelectedTabChanged || value.getFinalTab() == newPosition) {
                return;
            } else {
                transformScrolling = newPosition == 0 ? new CatalogTabsScrollState.OrdinaryScrolling(offset, newPosition, true) : new CatalogTabsScrollState.TransformScrolling(offset, newPosition, true);
            }
        } else {
            if (!(value instanceof CatalogTabsScrollState.TransformScrolling) && !(value instanceof CatalogTabsScrollState.OrdinaryScrolling)) {
                throw new o();
            }
            if (!isSelectedTabChanged || value.getFinalTab() == newPosition) {
                forceUpdateScrollPositionIfNecessary(newPosition, offset);
                return;
            }
            transformScrolling = ((value instanceof CatalogTabsScrollState.TransformScrolling) && ((CatalogTabsScrollState.TransformScrolling) value).getDestinationTab() == 0) ? new CatalogTabsScrollState.TransformScrolling(offset, newPosition, true) : new CatalogTabsScrollState.OrdinaryScrolling(offset, newPosition, true);
        }
        x0Var.setValue(transformScrolling);
    }

    public final void attachRecyclerListener(@NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        this.catalogTabsController.attachRecyclerListener(recyclerView);
    }

    public void forceScrollToPosition(int position, int offset) {
        this.$$delegate_0.forceScrollToPosition(position, offset);
    }

    @NotNull
    public final M0<CatalogTabsScrollState> getScrollState() {
        return this.scrollState;
    }

    @NotNull
    public final M0<Boolean> getStickyVisibleState() {
        return C2399j.b(this._stickyVisibleState);
    }

    public final void initTabs(@NotNull List<? extends ScrollTabAnchor> tabs) {
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        this.catalogTabsController.initTabs(tabs);
    }

    @Override // androidx.lifecycle.w0
    public void onCleared() {
        this.catalogTabsController.cancel();
    }

    public final void onUserClickedTab() {
        this.catalogTabsController.onUserClickedTab();
    }

    public void registerTabsScrollListener(boolean isSticky, @NotNull WeakReference<CatalogTabsScrollEventListener> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.$$delegate_0.registerTabsScrollListener(isSticky, listener);
    }

    public final void restoreScrollState() {
        if (this.scrollState.getValue() instanceof CatalogTabsScrollState.Idle) {
            return;
        }
        forceScrollToPosition(this.scrollState.getValue().getFinalTab(), this.scrollState.getValue().getOffsetX());
    }

    public final void scrollToWidget(int widgetScrollKey, int stableOffsetPx, @NotNull ComposerReferences refs) {
        View view;
        RecyclerView composerRecyclerView;
        Intrinsics.checkNotNullParameter(refs, "refs");
        InterfaceC7238a<l> composerStore = ((RetainComposerComponentApi) refs.getComponent(RetainComposerComponentApi.class)).getComposerStore();
        InterfaceC7851b controller = refs.getController();
        ComponentCallbacksC5392m c11 = refs.getContainer().c();
        if (c11 == null || (view = c11.getView()) == null || (composerRecyclerView = ComposerViewExtensionKt.composerRecyclerView(view)) == null) {
            return;
        }
        scrollToWidget(widgetScrollKey, stableOffsetPx, composerStore, controller, composerRecyclerView);
    }

    public Object sendScrollState(@NotNull CatalogTabsScrollState catalogTabsScrollState, @NotNull d<? super Unit> dVar) {
        return this.$$delegate_0.sendScrollState(catalogTabsScrollState, dVar);
    }

    public final void setComposerRefs(@NotNull ComposerReferences refs) {
        Intrinsics.checkNotNullParameter(refs, "refs");
        this.catalogTabsController.setComposerRefs(refs);
    }

    public final void updateScrollingState(int newPosition, int scrollPositionPx, boolean isSelectedTabChanged, boolean isSticky, int offset) {
        if (isSticky) {
            this.stickyScrollPositionPx = scrollPositionPx;
            updateStickyScrolling(newPosition, isSelectedTabChanged, offset);
        } else {
            this.nonStickyScrollPositionPx = scrollPositionPx;
            updateNonStickyScrolling(newPosition, isSelectedTabChanged, offset);
        }
    }

    public final void updateStickyVisibility(boolean isVisible) {
        this._stickyVisibleState.setValue(Boolean.valueOf(isVisible));
    }

    public final void scrollToWidget(int widgetScrollKey, int stableOffsetPx, @NotNull i container) {
        View view;
        RecyclerView composerRecyclerView;
        Intrinsics.checkNotNullParameter(container, "container");
        InterfaceC7238a<l> r11 = container.J().r();
        InterfaceC7851b M11 = container.M();
        ComponentCallbacksC5392m c11 = container.Q().c();
        if (c11 == null || (view = c11.getView()) == null || (composerRecyclerView = ComposerViewExtensionKt.composerRecyclerView(view)) == null) {
            return;
        }
        scrollToWidget(widgetScrollKey, stableOffsetPx, r11, M11, composerRecyclerView);
    }

    private final void scrollToWidget(int widgetScrollKey, int stableOffsetPx, InterfaceC7238a<l> composerStore, InterfaceC7851b composerController, RecyclerView recyclerView) {
        B0 b02 = this.scrollToWidgetJob;
        if (b02 != null) {
            b02.j(null);
        }
        this.scrollToWidgetJob = C10727i.c(androidx.lifecycle.x0.a(this), null, null, new CatalogueTabsViewModel$scrollToWidget$3(widgetScrollKey, recyclerView, stableOffsetPx, composerController, composerStore, null), 3);
    }
}
