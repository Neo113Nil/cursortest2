package ru.ozon.app.android.travel.pageconfigurator.route;

import A00.a;
import Ae.C2399j;
import Ae.C2408n0;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Pc.a;
import Sc.o;
import Sc.s;
import android.net.Uri;
import androidx.appcompat.app.x;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.G;
import androidx.lifecycle.K;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.material.bottomsheet.b;
import i10.h;
import i10.l;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.composer.ConfiguratorReferences;
import ru.ozon.app.android.composer.universalscreen.view.BottomSheetComposerFragment;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.travel.actionhandler.deeplinkRoute.event.DeeplinkRouteEvent;
import ru.ozon.app.android.travel.actionhandler.deeplinkRoute.event.DeeplinkRouteEventReceiver;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u001b\u0010\u000f\u001a\u00020\t2\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0017\u0010\u000bJ\u0017\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0013\u0010\u001d\u001a\u00020\t*\u00020\u001cH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\t2\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\tH\u0014¢\u0006\u0004\b#\u0010\u000bR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010$R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010%R\u0018\u0010&\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0018\u0010(\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010,\u001a\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+¨\u0006-"}, d2 = {"Lru/ozon/app/android/travel/pageconfigurator/route/MapInfoDeeplinkRouteConfigurator;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$PageConfigurator;", "LPc/a;", "Lru/ozon/app/android/travel/pageconfigurator/route/MapInfoDeeplinkRouteViewModel;", "viewModelProvider", "Lru/ozon/app/android/travel/actionhandler/deeplinkRoute/event/DeeplinkRouteEventReceiver;", "deeplinkRouteEventReceiver", "<init>", "(LPc/a;Lru/ozon/app/android/travel/actionhandler/deeplinkRoute/event/DeeplinkRouteEventReceiver;)V", "", "subscribeRouteEvents", "()V", "subscribeLoadCompletedEvents", "LA00/a$o;", "event", "cachePage", "(LA00/a$o;)V", "Lru/ozon/app/android/travel/actionhandler/deeplinkRoute/event/DeeplinkRouteEvent;", "handleRouteEvent", "(Lru/ozon/app/android/travel/actionhandler/deeplinkRoute/event/DeeplinkRouteEvent;)V", "Lru/ozon/app/android/travel/actionhandler/deeplinkRoute/event/DeeplinkRouteEvent$Push;", "handleRouteEventPush", "(Lru/ozon/app/android/travel/actionhandler/deeplinkRoute/event/DeeplinkRouteEvent$Push;)V", "handleRouteEventPop", "", "refreshUrl", "refresh", "(Ljava/lang/String;)V", "Landroidx/fragment/app/G;", "closeAllBottomSheets", "(Landroidx/fragment/app/G;)V", "Landroidx/fragment/app/m;", "fragment", "closeIfBottomSheet", "(Landroidx/fragment/app/m;)V", "onComposerInitialized", "LPc/a;", "Lru/ozon/app/android/travel/actionhandler/deeplinkRoute/event/DeeplinkRouteEventReceiver;", "currentUrl", "Ljava/lang/String;", "_viewModel", "Lru/ozon/app/android/travel/pageconfigurator/route/MapInfoDeeplinkRouteViewModel;", "getViewModel", "()Lru/ozon/app/android/travel/pageconfigurator/route/MapInfoDeeplinkRouteViewModel;", "viewModel", "pageconfigurator_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class MapInfoDeeplinkRouteConfigurator extends ComposerScreenConfig.PageConfigurator {
    private MapInfoDeeplinkRouteViewModel _viewModel;
    private String currentUrl;

    @NotNull
    private final DeeplinkRouteEventReceiver deeplinkRouteEventReceiver;

    @NotNull
    private final a<MapInfoDeeplinkRouteViewModel> viewModelProvider;

    public MapInfoDeeplinkRouteConfigurator(@NotNull a<MapInfoDeeplinkRouteViewModel> viewModelProvider, @NotNull DeeplinkRouteEventReceiver deeplinkRouteEventReceiver) {
        Intrinsics.checkNotNullParameter(viewModelProvider, "viewModelProvider");
        Intrinsics.checkNotNullParameter(deeplinkRouteEventReceiver, "deeplinkRouteEventReceiver");
        this.viewModelProvider = viewModelProvider;
        this.deeplinkRouteEventReceiver = deeplinkRouteEventReceiver;
    }

    private final void cachePage(a.o<?> event) {
        this.currentUrl = event.f().f().c();
    }

    private final void closeAllBottomSheets(G g10) {
        List<ComponentCallbacksC5392m> r02 = g10.r0();
        Intrinsics.checkNotNullExpressionValue(r02, "getFragments(...)");
        Iterator<T> it = r02.iterator();
        while (it.hasNext()) {
            closeIfBottomSheet((ComponentCallbacksC5392m) it.next());
        }
    }

    private final void closeIfBottomSheet(ComponentCallbacksC5392m fragment) {
        if ((fragment instanceof BottomSheetComposerFragment) || (fragment instanceof b)) {
            ((x) fragment).dismissAllowingStateLoss();
        }
    }

    private final MapInfoDeeplinkRouteViewModel getViewModel() {
        MapInfoDeeplinkRouteViewModel mapInfoDeeplinkRouteViewModel = this._viewModel;
        if (mapInfoDeeplinkRouteViewModel != null) {
            return mapInfoDeeplinkRouteViewModel;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    private final void handleRouteEvent(DeeplinkRouteEvent event) {
        if (event instanceof DeeplinkRouteEvent.Push) {
            handleRouteEventPush((DeeplinkRouteEvent.Push) event);
        } else {
            if (!(event instanceof DeeplinkRouteEvent.Pop)) {
                throw new o();
            }
            handleRouteEventPop();
        }
    }

    private final void handleRouteEventPop() {
        ComposerNavigator navigator;
        String popRoute = getViewModel().popRoute();
        if (popRoute != null) {
            refresh(popRoute);
            return;
        }
        ConfiguratorReferences references = getReferences();
        if (references == null || (navigator = references.getNavigator()) == null) {
            return;
        }
        navigator.popBackStack();
    }

    private final void handleRouteEventPush(DeeplinkRouteEvent.Push event) {
        Uri parse;
        String encodedQuery;
        String encodedQuery2;
        G d11 = getContainer().d();
        if (d11 != null) {
            closeAllBottomSheets(d11);
        }
        String str = this.currentUrl;
        if (str == null || (parse = Uri.parse(str)) == null || (encodedQuery = parse.getEncodedQuery()) == null || (encodedQuery2 = Uri.parse(event.getRefreshUrl()).getEncodedQuery()) == null || encodedQuery.equals(encodedQuery2)) {
            return;
        }
        String str2 = this.currentUrl;
        if (str2 != null) {
            getViewModel().pushRoute(str2);
        }
        refresh(event.getRefreshUrl());
    }

    private final void refresh(String refreshUrl) {
        InterfaceC7851b controller;
        ConfiguratorReferences references = getReferences();
        if (references == null || (controller = references.getController()) == null) {
            return;
        }
        InterfaceC7851b.a.a(controller, refreshUrl, null, null, new h.b(null, new l.a.b(0L, null, 3), 1), 6);
    }

    private final void subscribeLoadCompletedEvents() {
        InterfaceC7851b controller;
        final InterfaceC2395h<A00.a> eventsFlow;
        ConfiguratorReferences references = getReferences();
        if (references == null || (controller = references.getController()) == null || (eventsFlow = controller.getEventsFlow()) == null) {
            return;
        }
        C2399j.C(new C2408n0(new InterfaceC2395h<Object>() { // from class: ru.ozon.app.android.travel.pageconfigurator.route.MapInfoDeeplinkRouteConfigurator$subscribeLoadCompletedEvents$$inlined$filterIsInstance$1

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* renamed from: ru.ozon.app.android.travel.pageconfigurator.route.MapInfoDeeplinkRouteConfigurator$subscribeLoadCompletedEvents$$inlined$filterIsInstance$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements InterfaceC2397i {
                final /* synthetic */ InterfaceC2397i $this_unsafeFlow;

                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @e(c = "ru.ozon.app.android.travel.pageconfigurator.route.MapInfoDeeplinkRouteConfigurator$subscribeLoadCompletedEvents$$inlined$filterIsInstance$1$2", f = "MapInfoDeeplinkRouteConfigurator.kt", l = {50}, m = "emit")
                /* renamed from: ru.ozon.app.android.travel.pageconfigurator.route.MapInfoDeeplinkRouteConfigurator$subscribeLoadCompletedEvents$$inlined$filterIsInstance$1$2$1, reason: invalid class name */
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
                                if (obj instanceof a.o) {
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
        }, new MapInfoDeeplinkRouteConfigurator$subscribeLoadCompletedEvents$1(this)), K.a(getOwner()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object subscribeLoadCompletedEvents$cachePage(MapInfoDeeplinkRouteConfigurator mapInfoDeeplinkRouteConfigurator, a.o oVar, d dVar) {
        mapInfoDeeplinkRouteConfigurator.cachePage(oVar);
        return Unit.f71690a;
    }

    private final void subscribeRouteEvents() {
        C2399j.C(new C2408n0(this.deeplinkRouteEventReceiver.getEventsFlow(), new MapInfoDeeplinkRouteConfigurator$subscribeRouteEvents$1(this)), K.a(getOwner()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object subscribeRouteEvents$handleRouteEvent(MapInfoDeeplinkRouteConfigurator mapInfoDeeplinkRouteConfigurator, DeeplinkRouteEvent deeplinkRouteEvent, d dVar) {
        mapInfoDeeplinkRouteConfigurator.handleRouteEvent(deeplinkRouteEvent);
        return Unit.f71690a;
    }

    @Override // ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig.PageConfigurator
    protected void onComposerInitialized() {
        MapInfoDeeplinkRouteViewModel mapInfoDeeplinkRouteViewModel;
        a00.h viewModelOwnerProvider;
        ConfiguratorReferences references = getReferences();
        if (references == null || (viewModelOwnerProvider = references.getViewModelOwnerProvider()) == null) {
            mapInfoDeeplinkRouteViewModel = null;
        } else {
            final Pc.a<MapInfoDeeplinkRouteViewModel> aVar = this.viewModelProvider;
            mapInfoDeeplinkRouteViewModel = (MapInfoDeeplinkRouteViewModel) new z0(viewModelOwnerProvider.a(), new z0.c() { // from class: ru.ozon.app.android.travel.pageconfigurator.route.MapInfoDeeplinkRouteConfigurator$onComposerInitialized$$inlined$viewModel$1
                @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
                public <T extends w0> T create(Class<T> modelClass) {
                    Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                    MapInfoDeeplinkRouteViewModel mapInfoDeeplinkRouteViewModel2 = (MapInfoDeeplinkRouteViewModel) Pc.a.this.get();
                    Intrinsics.g(mapInfoDeeplinkRouteViewModel2, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                    return mapInfoDeeplinkRouteViewModel2;
                }
            }).a(MapInfoDeeplinkRouteViewModel.class);
        }
        this._viewModel = mapInfoDeeplinkRouteViewModel;
        subscribeRouteEvents();
        subscribeLoadCompletedEvents();
    }
}
