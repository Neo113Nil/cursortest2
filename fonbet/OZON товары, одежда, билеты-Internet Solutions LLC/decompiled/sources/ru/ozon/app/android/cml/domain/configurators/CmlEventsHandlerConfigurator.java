package ru.ozon.app.android.cml.domain.configurators;

import A00.e;
import Ae.B0;
import Ae.C2399j;
import Ae.C2408n0;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import M10.d;
import Sc.s;
import Wc.a;
import android.view.View;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import i10.h;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.c;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cml.domain.refresh.CmlEventsController;
import ru.ozon.app.android.cml.domain.refresh.CmlRefreshReason;
import ru.ozon.app.android.composer.ConfiguratorReferences;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000eR\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/cml/domain/configurators/CmlEventsHandlerConfigurator;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$PageConfigurator;", "Lru/ozon/app/android/cml/domain/refresh/CmlEventsController;", "cmlEventsController", "<init>", "(Lru/ozon/app/android/cml/domain/refresh/CmlEventsController;)V", "", "refreshWithSaveScroll", "()V", "onComposerInitialized", "Landroidx/lifecycle/J;", "owner", "onStart", "(Landroidx/lifecycle/J;)V", "Lru/ozon/app/android/cml/domain/refresh/CmlEventsController;", "", "needRefreshOnStart", "Z", "Landroidx/recyclerview/widget/RecyclerView;", "getRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "cml_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CmlEventsHandlerConfigurator extends ComposerScreenConfig.PageConfigurator {

    @NotNull
    private final CmlEventsController cmlEventsController;
    private boolean needRefreshOnStart;

    public CmlEventsHandlerConfigurator(@NotNull CmlEventsController cmlEventsController) {
        Intrinsics.checkNotNullParameter(cmlEventsController, "cmlEventsController");
        this.cmlEventsController = cmlEventsController;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RecyclerView getRecyclerView() {
        View view;
        View rootView;
        ComponentCallbacksC5392m c11 = getContainer().c();
        if (c11 == null || (view = c11.getView()) == null || (rootView = view.getRootView()) == null) {
            return null;
        }
        return ComposerViewExtensionKt.composerRecyclerViewOrNull(rootView);
    }

    private final void refreshWithSaveScroll() {
        InterfaceC7851b controller;
        final AbstractC5434v lifecycle = getContainer().g().getLifecycle();
        if (!lifecycle.b().a(AbstractC5434v.b.RESUMED)) {
            lifecycle.a(new DefaultLifecycleObserver() { // from class: ru.ozon.app.android.cml.domain.configurators.CmlEventsHandlerConfigurator$refreshWithSaveScroll$$inlined$whenResumed$1
                @Override // androidx.lifecycle.DefaultLifecycleObserver
                public void onDestroy(J owner) {
                    Intrinsics.checkNotNullParameter(owner, "owner");
                    AbstractC5434v.this.e(this);
                }

                @Override // androidx.lifecycle.DefaultLifecycleObserver
                public void onResume(J owner) {
                    InterfaceC7851b controller2;
                    Intrinsics.checkNotNullParameter(owner, "owner");
                    RecyclerView recyclerView = this.getRecyclerView();
                    if (recyclerView != null) {
                        if (!recyclerView.isLaidOut() || recyclerView.isLayoutRequested()) {
                            recyclerView.addOnLayoutChangeListener(new CmlEventsHandlerConfigurator$refreshWithSaveScroll$lambda$3$$inlined$doOnLayout$1(this));
                        } else {
                            RecyclerView recyclerView2 = this.getRecyclerView();
                            e b11 = recyclerView2 != null ? d.b(recyclerView2) : null;
                            if (b11 == null) {
                                e.a aVar = new e.a();
                                aVar.g(0);
                                b11 = aVar.b();
                            }
                            h.b bVar = new h.b(b11);
                            ConfiguratorReferences references = this.getReferences();
                            if (references != null && (controller2 = references.getController()) != null) {
                                InterfaceC7851b.a.a(controller2, null, null, null, bVar, 7);
                            }
                        }
                    }
                    AbstractC5434v.this.e(this);
                }
            });
            return;
        }
        RecyclerView recyclerView = getRecyclerView();
        if (recyclerView != null) {
            if (!recyclerView.isLaidOut() || recyclerView.isLayoutRequested()) {
                recyclerView.addOnLayoutChangeListener(new CmlEventsHandlerConfigurator$refreshWithSaveScroll$lambda$3$$inlined$doOnLayout$1(this));
                return;
            }
            RecyclerView recyclerView2 = getRecyclerView();
            e b11 = recyclerView2 != null ? d.b(recyclerView2) : null;
            if (b11 == null) {
                e.a aVar = new e.a();
                aVar.g(0);
                b11 = aVar.b();
            }
            h.b bVar = new h.b(b11);
            ConfiguratorReferences references = getReferences();
            if (references == null || (controller = references.getController()) == null) {
                return;
            }
            InterfaceC7851b.a.a(controller, null, null, null, bVar, 7);
        }
    }

    @Override // ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig.PageConfigurator
    protected void onComposerInitialized() {
        super.onComposerInitialized();
        final B0<CmlRefreshReason> cmlEventsSharedFlow = this.cmlEventsController.getCmlEventsSharedFlow();
        C2399j.C(new C2408n0(new InterfaceC2395h<CmlRefreshReason>() { // from class: ru.ozon.app.android.cml.domain.configurators.CmlEventsHandlerConfigurator$onComposerInitialized$$inlined$filter$1

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* renamed from: ru.ozon.app.android.cml.domain.configurators.CmlEventsHandlerConfigurator$onComposerInitialized$$inlined$filter$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements InterfaceC2397i {
                final /* synthetic */ InterfaceC2397i $this_unsafeFlow;

                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.app.android.cml.domain.configurators.CmlEventsHandlerConfigurator$onComposerInitialized$$inlined$filter$1$2", f = "CmlEventsHandlerConfigurator.kt", l = {50}, m = "emit")
                /* renamed from: ru.ozon.app.android.cml.domain.configurators.CmlEventsHandlerConfigurator$onComposerInitialized$$inlined$filter$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends c {
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(kotlin.coroutines.d dVar) {
                        super(dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= LinearLayoutManager.INVALID_OFFSET;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(InterfaceC2397i interfaceC2397i) {
                    this.$this_unsafeFlow = interfaceC2397i;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
                @Override // Ae.InterfaceC2397i
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, kotlin.coroutines.d dVar) {
                    AnonymousClass1 anonymousClass1;
                    int i11;
                    if (dVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) dVar;
                        int i12 = anonymousClass1.label;
                        if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                            anonymousClass1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                            Object obj2 = anonymousClass1.result;
                            a aVar = a.COROUTINE_SUSPENDED;
                            i11 = anonymousClass1.label;
                            if (i11 != 0) {
                                s.b(obj2);
                                InterfaceC2397i interfaceC2397i = this.$this_unsafeFlow;
                                if (((CmlRefreshReason) obj) == CmlRefreshReason.DRAFT_NAME_CHANGED) {
                                    anonymousClass1.label = 1;
                                    if (interfaceC2397i.emit(obj, anonymousClass1) == aVar) {
                                        return aVar;
                                    }
                                }
                            } else {
                                if (i11 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                s.b(obj2);
                            }
                            return Unit.f71690a;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(dVar);
                    Object obj22 = anonymousClass1.result;
                    a aVar2 = a.COROUTINE_SUSPENDED;
                    i11 = anonymousClass1.label;
                    if (i11 != 0) {
                    }
                    return Unit.f71690a;
                }
            }

            @Override // Ae.InterfaceC2395h
            public Object collect(InterfaceC2397i<? super CmlRefreshReason> interfaceC2397i, kotlin.coroutines.d dVar) {
                Object collect = InterfaceC2395h.this.collect(new AnonymousClass2(interfaceC2397i), dVar);
                return collect == a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
            }
        }, new CmlEventsHandlerConfigurator$onComposerInitialized$2(this, null)), K.a(getOwner()));
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStart(@NotNull J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        if (this.needRefreshOnStart) {
            refreshWithSaveScroll();
            this.needRefreshOnStart = false;
        }
    }
}
