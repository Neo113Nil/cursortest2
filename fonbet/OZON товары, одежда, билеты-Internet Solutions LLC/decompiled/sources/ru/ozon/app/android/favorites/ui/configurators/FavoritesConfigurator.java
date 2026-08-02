package ru.ozon.app.android.favorites.ui.configurators;

import A00.a;
import Ae.C;
import Ae.C2399j;
import Ae.C2408n0;
import Ae.I;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Ae.M0;
import Ae.O0;
import Ae.x0;
import Sc.o;
import Sc.s;
import a00.h;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5427n;
import androidx.lifecycle.J;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ConfiguratorReferences;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.favorites.domain.favoritemanager.FavoriteManager;
import ru.ozon.app.android.favorites.domain.favoritemanager.model.FavoriteAdd;
import ru.ozon.app.android.favorites.domain.favoritemanager.model.FavoriteEvent;
import ru.ozon.app.android.favorites.domain.favoritemanager.model.FavoriteRemove;
import ru.ozon.app.android.favorites.ui.configurators.FavoritesConfigurator;
import ru.ozon.app.android.favorites.ui.screen.update.TileFavoriteUpdate;
import xe.C10727i;
import xe.M;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b'\u0018\u00002\u00020\u0001:\u0001\u0012B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H&¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/favorites/ui/configurators/FavoritesConfigurator;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$PageConfigurator;", "Lru/ozon/app/android/favorites/domain/favoritemanager/FavoriteManager;", "favoriteManager", "<init>", "(Lru/ozon/app/android/favorites/domain/favoritemanager/FavoriteManager;)V", "", "LA00/a$J$a;", "events", "", "fetchUpdateFavorites", "(Ljava/util/List;)V", "Landroidx/lifecycle/J;", "owner", "onCreate", "(Landroidx/lifecycle/J;)V", "onStart", "Lru/ozon/app/android/favorites/domain/favoritemanager/FavoriteManager;", "FavoriteEventViewModel", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class FavoritesConfigurator extends ComposerScreenConfig.PageConfigurator {

    @NotNull
    private final FavoriteManager favoriteManager;

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR \u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R#\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/favorites/ui/configurators/FavoritesConfigurator$FavoriteEventViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/favorites/domain/favoritemanager/FavoriteManager;", "favoriteManager", "<init>", "(Lru/ozon/app/android/favorites/domain/favoritemanager/FavoriteManager;)V", "Lru/ozon/app/android/favorites/domain/favoritemanager/model/FavoriteEvent;", "favoriteEvent", "", "handleEvent", "(Lru/ozon/app/android/favorites/domain/favoritemanager/model/FavoriteEvent;)V", "dropEvents", "()V", "Lru/ozon/app/android/favorites/domain/favoritemanager/FavoriteManager;", "LAe/x0;", "", "LA00/a$J$a;", "_updatesFlow", "LAe/x0;", "LAe/h;", "updatesFlow", "LAe/h;", "getUpdatesFlow", "()LAe/h;", "getUpdates", "()Ljava/util/List;", "updates", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes12.dex */
    static final class FavoriteEventViewModel extends w0 {

        @NotNull
        private final x0<List<a.J.InterfaceC0007a>> _updatesFlow;

        @NotNull
        private final FavoriteManager favoriteManager;

        @NotNull
        private final InterfaceC2395h<List<a.J.InterfaceC0007a>> updatesFlow;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
        @e(c = "ru.ozon.app.android.favorites.ui.configurators.FavoritesConfigurator$FavoriteEventViewModel$1", f = "FavoritesConfigurator.kt", l = {70}, m = "invokeSuspend")
        /* renamed from: ru.ozon.app.android.favorites.ui.configurators.FavoritesConfigurator$FavoriteEventViewModel$1, reason: invalid class name */
        static final class AnonymousClass1 extends j implements Function2<M, d<? super Unit>, Object> {
            int label;

            @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/favorites/domain/favoritemanager/model/FavoriteEvent;"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @e(c = "ru.ozon.app.android.favorites.ui.configurators.FavoritesConfigurator$FavoriteEventViewModel$1$1", f = "FavoritesConfigurator.kt", l = {}, m = "invokeSuspend")
            /* renamed from: ru.ozon.app.android.favorites.ui.configurators.FavoritesConfigurator$FavoriteEventViewModel$1$1, reason: invalid class name and collision with other inner class name */
            static final class C17671 extends j implements Function2<FavoriteEvent, d<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ FavoriteEventViewModel this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C17671(FavoriteEventViewModel favoriteEventViewModel, d<? super C17671> dVar) {
                    super(2, dVar);
                    this.this$0 = favoriteEventViewModel;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final d<Unit> create(Object obj, d<?> dVar) {
                    C17671 c17671 = new C17671(this.this$0, dVar);
                    c17671.L$0 = obj;
                    return c17671;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                    this.this$0.handleEvent((FavoriteEvent) this.L$0);
                    return Unit.f71690a;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(FavoriteEvent favoriteEvent, d<? super Unit> dVar) {
                    return ((C17671) create(favoriteEvent, dVar)).invokeSuspend(Unit.f71690a);
                }
            }

            AnonymousClass1(d<? super AnonymousClass1> dVar) {
                super(2, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final d<Unit> create(Object obj, d<?> dVar) {
                return FavoriteEventViewModel.this.new AnonymousClass1(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.label;
                if (i11 == 0) {
                    s.b(obj);
                    C2408n0 c2408n0 = new C2408n0(FavoriteEventViewModel.this.favoriteManager.onFavoriteChangeFlow(), new C17671(FavoriteEventViewModel.this, null));
                    this.label = 1;
                    if (C2399j.g(c2408n0, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                }
                return Unit.f71690a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, d<? super Unit> dVar) {
                return ((AnonymousClass1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }
        }

        public FavoriteEventViewModel(@NotNull FavoriteManager favoriteManager) {
            Intrinsics.checkNotNullParameter(favoriteManager, "favoriteManager");
            this.favoriteManager = favoriteManager;
            x0<List<a.J.InterfaceC0007a>> a11 = O0.a(K.f71697a);
            this._updatesFlow = a11;
            final M0 b11 = C2399j.b(a11);
            this.updatesFlow = new InterfaceC2395h<List<? extends a.J.InterfaceC0007a>>() { // from class: ru.ozon.app.android.favorites.ui.configurators.FavoritesConfigurator$FavoriteEventViewModel$special$$inlined$filter$1

                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                /* renamed from: ru.ozon.app.android.favorites.ui.configurators.FavoritesConfigurator$FavoriteEventViewModel$special$$inlined$filter$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements InterfaceC2397i {
                    final /* synthetic */ InterfaceC2397i $this_unsafeFlow;

                    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                    @e(c = "ru.ozon.app.android.favorites.ui.configurators.FavoritesConfigurator$FavoriteEventViewModel$special$$inlined$filter$1$2", f = "FavoritesConfigurator.kt", l = {50}, m = "emit")
                    /* renamed from: ru.ozon.app.android.favorites.ui.configurators.FavoritesConfigurator$FavoriteEventViewModel$special$$inlined$filter$1$2$1, reason: invalid class name */
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
                                    if (!((List) obj).isEmpty()) {
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
                public Object collect(InterfaceC2397i<? super List<? extends a.J.InterfaceC0007a>> interfaceC2397i, d dVar) {
                    Object collect = InterfaceC2395h.this.collect(new AnonymousClass2(interfaceC2397i), dVar);
                    return collect == Wc.a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
                }
            };
            C10727i.c(androidx.lifecycle.x0.a(this), null, null, new AnonymousClass1(null), 3);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void handleEvent(FavoriteEvent favoriteEvent) {
            TileFavoriteUpdate tileFavoriteUpdate;
            List<a.J.InterfaceC0007a> value;
            ArrayList W02;
            if (favoriteEvent instanceof FavoriteAdd) {
                tileFavoriteUpdate = new TileFavoriteUpdate(((FavoriteAdd) favoriteEvent).getSku(), true);
            } else {
                if (!(favoriteEvent instanceof FavoriteRemove)) {
                    throw new o();
                }
                tileFavoriteUpdate = new TileFavoriteUpdate(((FavoriteRemove) favoriteEvent).getSku(), false);
            }
            x0<List<a.J.InterfaceC0007a>> x0Var = this._updatesFlow;
            do {
                value = x0Var.getValue();
                W02 = C7714v.W0(value);
                W02.add(tileFavoriteUpdate);
            } while (!x0Var.b(value, W02));
        }

        public final void dropEvents() {
            x0<List<a.J.InterfaceC0007a>> x0Var = this._updatesFlow;
            while (!x0Var.b(x0Var.getValue(), K.f71697a)) {
            }
        }

        @NotNull
        public final List<a.J.InterfaceC0007a> getUpdates() {
            return this._updatesFlow.getValue();
        }

        @NotNull
        public final InterfaceC2395h<List<a.J.InterfaceC0007a>> getUpdatesFlow() {
            return this.updatesFlow;
        }
    }

    public FavoritesConfigurator(@NotNull FavoriteManager favoriteManager) {
        Intrinsics.checkNotNullParameter(favoriteManager, "favoriteManager");
        this.favoriteManager = favoriteManager;
    }

    public abstract void fetchUpdateFavorites(@NotNull List<? extends a.J.InterfaceC0007a> events);

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onCreate(@NotNull J owner) {
        h viewModelOwnerProvider;
        FavoriteEventViewModel favoriteEventViewModel;
        Intrinsics.checkNotNullParameter(owner, "owner");
        ConfiguratorReferences references = getReferences();
        if (references == null || (viewModelOwnerProvider = references.getViewModelOwnerProvider()) == null || (favoriteEventViewModel = (FavoriteEventViewModel) new z0(viewModelOwnerProvider.a(), new z0.c() { // from class: ru.ozon.app.android.favorites.ui.configurators.FavoritesConfigurator$onCreate$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                FavoriteManager favoriteManager;
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                favoriteManager = FavoritesConfigurator.this.favoriteManager;
                return new FavoritesConfigurator.FavoriteEventViewModel(favoriteManager);
            }
        }).a(FavoriteEventViewModel.class)) == null) {
            return;
        }
        C2399j.C(C5427n.a(new C(new C2408n0(new I(favoriteEventViewModel.getUpdatesFlow()), new FavoritesConfigurator$onCreate$1(favoriteEventViewModel, this, null)), new FavoritesConfigurator$onCreate$2(null)), owner.getLifecycle(), AbstractC5434v.b.STARTED), androidx.lifecycle.K.a(owner));
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStart(@NotNull J owner) {
        h viewModelOwnerProvider;
        FavoriteEventViewModel favoriteEventViewModel;
        Intrinsics.checkNotNullParameter(owner, "owner");
        ConfiguratorReferences references = getReferences();
        if (references == null || (viewModelOwnerProvider = references.getViewModelOwnerProvider()) == null || (favoriteEventViewModel = (FavoriteEventViewModel) new z0(viewModelOwnerProvider.a(), new z0.c() { // from class: ru.ozon.app.android.favorites.ui.configurators.FavoritesConfigurator$onStart$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                FavoriteManager favoriteManager;
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                favoriteManager = FavoritesConfigurator.this.favoriteManager;
                return new FavoritesConfigurator.FavoriteEventViewModel(favoriteManager);
            }
        }).a(FavoriteEventViewModel.class)) == null) {
            return;
        }
        fetchUpdateFavorites(favoriteEventViewModel.getUpdates());
        favoriteEventViewModel.dropEvents();
    }
}
