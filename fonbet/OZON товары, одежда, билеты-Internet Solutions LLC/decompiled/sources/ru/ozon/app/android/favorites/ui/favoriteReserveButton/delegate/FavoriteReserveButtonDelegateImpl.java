package ru.ozon.app.android.favorites.ui.favoriteReserveButton.delegate;

import A00.a;
import Ae.C2399j;
import Ae.C2408n0;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Sc.s;
import Ve.C4598rp;
import android.view.ViewGroup;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.K;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.favorites.data.favoriteReserveButton.FavoriteReserveButtonMolecule;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.model.AnalyticData;
import ru.ozon.app.android.favorites.ui.favoriteReserveButton.FavoriteReserveButtonViewModel;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.flashbar.factory.FlashbarFactory;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.ButtonV3HolderKt;
import xe.B0;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0011J9\u0010\u0018\u001a\u00020\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ)\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001eR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R$\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010!R\u0018\u0010\n\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\"R\u0018\u0010$\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010&\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010%R\u0016\u0010(\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010*\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010)R\u001c\u0010,\u001a\n +*\u0004\u0018\u00010\u00050\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-¨\u0006."}, d2 = {"Lru/ozon/app/android/favorites/ui/favoriteReserveButton/delegate/FavoriteReserveButtonDelegateImpl;", "Lru/ozon/app/android/favorites/ui/favoriteReserveButton/delegate/FavoriteReserveButtonDelegate;", "Lru/ozon/app/android/composer/ComposerReferences;", "composerReferences", "LPc/a;", "Lru/ozon/app/android/favorites/ui/favoriteReserveButton/FavoriteReserveButtonViewModel;", "viewModelProvider", "<init>", "(Lru/ozon/app/android/composer/ComposerReferences;LPc/a;)V", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/model/AnalyticData;", "analyticData", "", "createActionHandler", "(Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/model/AnalyticData;)V", "Lru/ozon/app/android/favorites/data/favoriteReserveButton/FavoriteReserveButtonMolecule;", "molecule", "resubscribe", "(Lru/ozon/app/android/favorites/data/favoriteReserveButton/FavoriteReserveButtonMolecule;)V", "rebindButton", "Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "view", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "bindDataOrGone", "(Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;Lru/ozon/app/android/favorites/data/favoriteReserveButton/FavoriteReserveButtonMolecule;Lkotlin/jvm/functions/Function1;)V", "showError", "()V", "bindFavoriteReserveButtonOrGone", "(Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;Lru/ozon/app/android/favorites/data/favoriteReserveButton/FavoriteReserveButtonMolecule;Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/model/AnalyticData;)V", "Lru/ozon/app/android/composer/ComposerReferences;", "moleculeView", "Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/model/AnalyticData;", "Lxe/B0;", "stateJob", "Lxe/B0;", "actionJob", "", "processingAction", "Z", "needUpdateLocalState", "kotlin.jvm.PlatformType", "viewModel", "Lru/ozon/app/android/favorites/ui/favoriteReserveButton/FavoriteReserveButtonViewModel;", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class FavoriteReserveButtonDelegateImpl implements FavoriteReserveButtonDelegate {
    private Function1<? super AtomAction, Unit> actionHandler;
    private B0 actionJob;
    private AnalyticData analyticData;

    @NotNull
    private final ComposerReferences composerReferences;
    private ButtonV3View moleculeView;
    private boolean needUpdateLocalState;
    private boolean processingAction;
    private B0 stateJob;
    private final FavoriteReserveButtonViewModel viewModel;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LA00/a$u;", "it", "", "<anonymous>", "(LA00/a$u;)V"}, k = 3, mv = {2, 0, 0})
    @e(c = "ru.ozon.app.android.favorites.ui.favoriteReserveButton.delegate.FavoriteReserveButtonDelegateImpl$1", f = "FavoriteReserveButtonDelegateImpl.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.favorites.ui.favoriteReserveButton.delegate.FavoriteReserveButtonDelegateImpl$1, reason: invalid class name */
    static final class AnonymousClass1 extends j implements Function2<a.u, d<? super Unit>, Object> {
        int label;

        AnonymousClass1(d<? super AnonymousClass1> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return FavoriteReserveButtonDelegateImpl.this.new AnonymousClass1(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(a.u uVar, d<? super Unit> dVar) {
            return ((AnonymousClass1) create(uVar, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            FavoriteReserveButtonDelegateImpl.this.needUpdateLocalState = true;
            return Unit.f71690a;
        }
    }

    public FavoriteReserveButtonDelegateImpl(@NotNull ComposerReferences composerReferences, @NotNull final Pc.a<FavoriteReserveButtonViewModel> viewModelProvider) {
        Intrinsics.checkNotNullParameter(composerReferences, "composerReferences");
        Intrinsics.checkNotNullParameter(viewModelProvider, "viewModelProvider");
        this.composerReferences = composerReferences;
        this.viewModel = (FavoriteReserveButtonViewModel) new z0(composerReferences.getViewModelOwnerProvider().a(), new z0.c() { // from class: ru.ozon.app.android.favorites.ui.favoriteReserveButton.delegate.FavoriteReserveButtonDelegateImpl$special$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                FavoriteReserveButtonViewModel favoriteReserveButtonViewModel = (FavoriteReserveButtonViewModel) Pc.a.this.get();
                Intrinsics.g(favoriteReserveButtonViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return favoriteReserveButtonViewModel;
            }
        }).a(FavoriteReserveButtonViewModel.class);
        final InterfaceC2395h<a> eventsFlow = composerReferences.getController().getEventsFlow();
        C4598rp.f(composerReferences, new C2408n0(new InterfaceC2395h<Object>() { // from class: ru.ozon.app.android.favorites.ui.favoriteReserveButton.delegate.FavoriteReserveButtonDelegateImpl$special$$inlined$filterIsInstance$1

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* renamed from: ru.ozon.app.android.favorites.ui.favoriteReserveButton.delegate.FavoriteReserveButtonDelegateImpl$special$$inlined$filterIsInstance$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements InterfaceC2397i {
                final /* synthetic */ InterfaceC2397i $this_unsafeFlow;

                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @e(c = "ru.ozon.app.android.favorites.ui.favoriteReserveButton.delegate.FavoriteReserveButtonDelegateImpl$special$$inlined$filterIsInstance$1$2", f = "FavoriteReserveButtonDelegateImpl.kt", l = {50}, m = "emit")
                /* renamed from: ru.ozon.app.android.favorites.ui.favoriteReserveButton.delegate.FavoriteReserveButtonDelegateImpl$special$$inlined$filterIsInstance$1$2$1, reason: invalid class name */
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
                                if (obj instanceof a.u) {
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
            public Object collect(InterfaceC2397i<? super Object> interfaceC2397i, d dVar) {
                Object collect = InterfaceC2395h.this.collect(new AnonymousClass2(interfaceC2397i), dVar);
                return collect == Wc.a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
            }
        }, new AnonymousClass1(null)));
    }

    private final void bindDataOrGone(ButtonV3View view, FavoriteReserveButtonMolecule molecule, Function1<? super AtomAction, Unit> actionHandler) {
        if (view != null) {
            ButtonV3HolderKt.bindOrGone(view, molecule != null ? molecule.getReserveButton() : null, actionHandler);
        }
    }

    private final void createActionHandler(AnalyticData analyticData) {
        this.actionHandler = new ActionHandler.Builder(this.composerReferences, FavoriteReserveButtonDelegateImpl$createActionHandler$1.INSTANCE, new FavoriteReserveButtonDelegateImpl$createActionHandler$2(analyticData), new FavoriteReserveButtonDelegateImpl$createActionHandler$3(analyticData)).onComposerAction(new FavoriteReserveButtonDelegateImpl$createActionHandler$4(this, analyticData)).buildHandler();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void rebindButton(FavoriteReserveButtonMolecule molecule) {
        bindDataOrGone(this.moleculeView, molecule, this.actionHandler);
    }

    private final void resubscribe(FavoriteReserveButtonMolecule molecule) {
        Long extractWishlistId;
        B0 b02 = this.stateJob;
        if (b02 != null) {
            b02.j(null);
        }
        B0 b03 = this.actionJob;
        if (b03 != null) {
            b03.j(null);
        }
        if (molecule != null && (extractWishlistId = molecule.extractWishlistId()) != null) {
            long longValue = extractWishlistId.longValue();
            Long extractSku = molecule.extractSku();
            String extractUniqId = molecule.extractUniqId();
            if ((extractSku == null ? extractUniqId : extractSku) != null) {
                if (this.needUpdateLocalState) {
                    this.viewModel.updateLocalState(extractSku, longValue, molecule, extractUniqId);
                    this.needUpdateLocalState = false;
                }
                this.stateJob = C2399j.C(new C2408n0(this.viewModel.observeReservedState(extractSku, longValue, extractUniqId), new FavoriteReserveButtonDelegateImpl$resubscribe$1(this, extractSku, longValue, extractUniqId, null)), K.a(this.composerReferences.getContainer().f()));
                this.actionJob = C2399j.C(new C2408n0(this.viewModel.observeActionEvents(extractSku, longValue, extractUniqId), new FavoriteReserveButtonDelegateImpl$resubscribe$2(this, null)), K.a(this.composerReferences.getContainer().f()));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showError() {
        ViewGroup rootView;
        ComponentCallbacksC5392m c11 = this.composerReferences.getContainer().c();
        if (c11 == null || (rootView = ContextExtKt.getRootView(c11)) == null) {
            return;
        }
        FlashbarFactory.createDefaultError$default(FlashbarFactory.INSTANCE, rootView, null, null, null, null, null, this.composerReferences.getContainer().g(), 62, null).show();
    }

    @Override // ru.ozon.app.android.favorites.ui.favoriteReserveButton.delegate.FavoriteReserveButtonDelegate
    public void bindFavoriteReserveButtonOrGone(@NotNull ButtonV3View view, FavoriteReserveButtonMolecule molecule, @NotNull AnalyticData analyticData) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(analyticData, "analyticData");
        this.moleculeView = view;
        this.analyticData = analyticData;
        createActionHandler(analyticData);
        bindDataOrGone(view, molecule, this.actionHandler);
        resubscribe(molecule);
    }
}
