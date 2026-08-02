package ru.ozon.app.android.pdp.ui.configurators.comparison.configurator;

import Ae.B0;
import Ae.C;
import Ae.C2399j;
import Ae.C2408n0;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Pc.a;
import Sc.s;
import a00.C4911f;
import android.content.Intent;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ConfiguratorReferences;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.pdp.ui.configurators.comparison.Refresh;
import ru.ozon.app.android.pdp.ui.configurators.comparison.RefreshObject;
import ru.ozon.app.android.pdp.ui.configurators.comparison.viewModel.AddToComparisonViewModel;
import ru.ozon.app.android.pdp.ui.configurators.comparison.viewModel.ComparisonRefreshViewModel;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 &2\u00020\u0001:\u0001&B%\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000e\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u0015\u0010\u0010J)\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00162\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001f\u0010\u001eR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010 R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010 R\u0016\u0010!\u001a\u00020\u00038\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010#\u001a\u00020\u00058\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010\u0013\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010%¨\u0006'"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/comparison/configurator/ComparisonConfigurator;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$PageConfigurator;", "LPc/a;", "Lru/ozon/app/android/pdp/ui/configurators/comparison/viewModel/AddToComparisonViewModel;", "addToComparisonViewModelProvider", "Lru/ozon/app/android/pdp/ui/configurators/comparison/viewModel/ComparisonRefreshViewModel;", "refreshViewModelProvider", "<init>", "(LPc/a;LPc/a;)V", "Landroid/content/Intent;", "data", "", "onProductDeleted", "(Landroid/content/Intent;)V", "onListDeleted", "onAddedCharacteristic", "()V", "markPreviousPageToBeRefreshed", "", "shouldRefresh", "()Z", "onComposerInitialized", "", "requestCode", "resultCode", "onActivityResult", "(IILandroid/content/Intent;)V", "Landroidx/lifecycle/J;", "owner", "onCreate", "(Landroidx/lifecycle/J;)V", "onResume", "LPc/a;", "comparisonViewModel", "Lru/ozon/app/android/pdp/ui/configurators/comparison/viewModel/AddToComparisonViewModel;", "refreshViewModel", "Lru/ozon/app/android/pdp/ui/configurators/comparison/viewModel/ComparisonRefreshViewModel;", "Z", "Companion", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ComparisonConfigurator extends ComposerScreenConfig.PageConfigurator {

    @NotNull
    private final a<AddToComparisonViewModel> addToComparisonViewModelProvider;
    private AddToComparisonViewModel comparisonViewModel;
    private ComparisonRefreshViewModel refreshViewModel;

    @NotNull
    private final a<ComparisonRefreshViewModel> refreshViewModelProvider;
    private boolean shouldRefresh;
    public static final int $stable = 8;

    public ComparisonConfigurator(@NotNull a<AddToComparisonViewModel> addToComparisonViewModelProvider, @NotNull a<ComparisonRefreshViewModel> refreshViewModelProvider) {
        Intrinsics.checkNotNullParameter(addToComparisonViewModelProvider, "addToComparisonViewModelProvider");
        Intrinsics.checkNotNullParameter(refreshViewModelProvider, "refreshViewModelProvider");
        this.addToComparisonViewModelProvider = addToComparisonViewModelProvider;
        this.refreshViewModelProvider = refreshViewModelProvider;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void markPreviousPageToBeRefreshed() {
        C4911f ownerContainer;
        ComponentCallbacksC5392m targetFragment;
        ConfiguratorReferences references = getReferences();
        if (references == null || (ownerContainer = references.getOwnerContainer()) == null || (targetFragment = ownerContainer.j().getTargetFragment()) == null) {
            return;
        }
        targetFragment.onActivityResult(9019, -1, null);
    }

    private final void onAddedCharacteristic() {
        InterfaceC7851b controller;
        ConfiguratorReferences references = getReferences();
        if (references == null || (controller = references.getController()) == null) {
            return;
        }
        InterfaceC7851b.a.a(controller, null, null, null, null, 15);
    }

    private final void onListDeleted(Intent data) {
        String stringExtra;
        if (data == null || (stringExtra = data.getStringExtra("encodeData")) == null) {
            return;
        }
        AddToComparisonViewModel addToComparisonViewModel = this.comparisonViewModel;
        if (addToComparisonViewModel != null) {
            C2399j.C(new C(new C2408n0(addToComparisonViewModel.deleteComparisonList(stringExtra), new ComparisonConfigurator$onListDeleted$1(this, null)), new ComparisonConfigurator$onListDeleted$2(null)), K.a(getOwner()));
        } else {
            Intrinsics.n("comparisonViewModel");
            throw null;
        }
    }

    private final void onProductDeleted(Intent data) {
        String stringExtra;
        if (data == null || (stringExtra = data.getStringExtra("API_REQUEST_PARAMS")) == null) {
            return;
        }
        AddToComparisonViewModel addToComparisonViewModel = this.comparisonViewModel;
        if (addToComparisonViewModel != null) {
            C2399j.C(new C(new C2408n0(addToComparisonViewModel.removeFromComparison(stringExtra), new ComparisonConfigurator$onProductDeleted$1(this, null)), new ComparisonConfigurator$onProductDeleted$2(null)), K.a(getOwner()));
        } else {
            Intrinsics.n("comparisonViewModel");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean shouldRefresh() {
        C4911f ownerContainer;
        J f7;
        AbstractC5434v lifecycle;
        ConfiguratorReferences references = getReferences();
        return ((references == null || (ownerContainer = references.getOwnerContainer()) == null || (f7 = ownerContainer.f()) == null || (lifecycle = f7.getLifecycle()) == null) ? null : lifecycle.b()) != AbstractC5434v.b.RESUMED;
    }

    @Override // ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig.PageConfigurator
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        InterfaceC7851b controller;
        if (resultCode != -1) {
            return;
        }
        switch (requestCode) {
            case 9019:
                ConfiguratorReferences references = getReferences();
                if (references != null && (controller = references.getController()) != null) {
                    InterfaceC7851b.a.a(controller, null, null, null, null, 15);
                }
                markPreviousPageToBeRefreshed();
                break;
            case 9020:
                onProductDeleted(data);
                break;
            case 9021:
                onAddedCharacteristic();
                break;
            case 9022:
                onListDeleted(data);
                break;
        }
    }

    @Override // ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig.PageConfigurator
    protected void onComposerInitialized() {
        ConfiguratorReferences references = getReferences();
        if (references == null) {
            return;
        }
        this.refreshViewModel = (ComparisonRefreshViewModel) new z0(references.getViewModelOwnerProvider().b(), new z0.c() { // from class: ru.ozon.app.android.pdp.ui.configurators.comparison.configurator.ComparisonConfigurator$onComposerInitialized$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                a aVar;
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                aVar = ComparisonConfigurator.this.refreshViewModelProvider;
                ComparisonRefreshViewModel comparisonRefreshViewModel = (ComparisonRefreshViewModel) aVar.get();
                Intrinsics.g(comparisonRefreshViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return comparisonRefreshViewModel;
            }
        }).a(ComparisonRefreshViewModel.class);
        this.comparisonViewModel = (AddToComparisonViewModel) new z0(references.getViewModelOwnerProvider().a(), new z0.c() { // from class: ru.ozon.app.android.pdp.ui.configurators.comparison.configurator.ComparisonConfigurator$onComposerInitialized$$inlined$viewModel$2
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                a aVar;
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                aVar = ComparisonConfigurator.this.addToComparisonViewModelProvider;
                AddToComparisonViewModel addToComparisonViewModel = (AddToComparisonViewModel) aVar.get();
                Intrinsics.g(addToComparisonViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return addToComparisonViewModel;
            }
        }).a(AddToComparisonViewModel.class);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onCreate(@NotNull J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        final B0<Refresh> observeRefreshState = RefreshObject.INSTANCE.observeRefreshState();
        C2399j.C(new C(new C2408n0(new InterfaceC2395h<Refresh>() { // from class: ru.ozon.app.android.pdp.ui.configurators.comparison.configurator.ComparisonConfigurator$onCreate$$inlined$filter$1

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* renamed from: ru.ozon.app.android.pdp.ui.configurators.comparison.configurator.ComparisonConfigurator$onCreate$$inlined$filter$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements InterfaceC2397i {
                final /* synthetic */ InterfaceC2397i $this_unsafeFlow;

                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @e(c = "ru.ozon.app.android.pdp.ui.configurators.comparison.configurator.ComparisonConfigurator$onCreate$$inlined$filter$1$2", f = "ComparisonConfigurator.kt", l = {50}, m = "emit")
                /* renamed from: ru.ozon.app.android.pdp.ui.configurators.comparison.configurator.ComparisonConfigurator$onCreate$$inlined$filter$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends c {
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(d dVar) {
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
                public final Object emit(Object obj, d dVar) {
                    AnonymousClass1 anonymousClass1;
                    int i11;
                    if (dVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) dVar;
                        int i12 = anonymousClass1.label;
                        if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                            anonymousClass1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                            Object obj2 = anonymousClass1.result;
                            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                            i11 = anonymousClass1.label;
                            if (i11 != 0) {
                                s.b(obj2);
                                InterfaceC2397i interfaceC2397i = this.$this_unsafeFlow;
                                Refresh refresh = (Refresh) obj;
                                if ((refresh instanceof Refresh.ComparisonDiff) && ((Refresh.ComparisonDiff) refresh).getIsInComparison()) {
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
                    Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                    i11 = anonymousClass1.label;
                    if (i11 != 0) {
                    }
                    return Unit.f71690a;
                }
            }

            @Override // Ae.InterfaceC2395h
            public Object collect(InterfaceC2397i<? super Refresh> interfaceC2397i, d dVar) {
                Object collect = InterfaceC2395h.this.collect(new AnonymousClass2(interfaceC2397i), dVar);
                return collect == Wc.a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
            }
        }, new ComparisonConfigurator$onCreate$2(this, null)), new ComparisonConfigurator$onCreate$3(null)), K.a(owner));
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onResume(@NotNull J owner) {
        InterfaceC7851b controller;
        Intrinsics.checkNotNullParameter(owner, "owner");
        if (this.shouldRefresh) {
            ConfiguratorReferences references = getReferences();
            if (references != null && (controller = references.getController()) != null) {
                InterfaceC7851b.a.a(controller, null, null, null, null, 15);
            }
            this.shouldRefresh = false;
        }
    }
}
