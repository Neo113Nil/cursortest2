package ru.ozon.app.android.travel.feature.general.common.offline;

import Ae.C2399j;
import Ae.C2408n0;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Ae.M0;
import De.C2862e;
import Sc.s;
import Wc.a;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.emptyscreen.OfflineWidget;
import ru.ozon.app.android.emptyscreen.OfflineWidgetsProvider;
import ru.ozon.app.android.travel.data.storage.offline.OfflineTravelStorage;
import ru.ozon.app.android.travel.data.storage.offline.OfflineTravelWidget;
import ru.ozon.app.android.utils.dispatcherprovider.CoroutineDispatcherProvider;
import xe.H0;
import xe.M;
import xe.N;
import xe.X0;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000b0\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/offline/TravelOfflineWidgetsProviderImpl;", "Lru/ozon/app/android/emptyscreen/OfflineWidgetsProvider;", "Lru/ozon/app/android/travel/data/storage/offline/OfflineTravelStorage;", "offlineWidgetsStorage", "Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;", "coroutineDispatcherProvider", "<init>", "(Lru/ozon/app/android/travel/data/storage/offline/OfflineTravelStorage;Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;)V", "", "Lru/ozon/app/android/travel/data/storage/offline/OfflineTravelWidget;", "items", "Lru/ozon/app/android/emptyscreen/OfflineWidget;", "mapState", "(Ljava/util/List;)Ljava/util/List;", "provideWidgets", "()Ljava/util/List;", "Lxe/M;", "coroutineScope", "Lxe/M;", "widgets", "Ljava/util/List;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TravelOfflineWidgetsProviderImpl implements OfflineWidgetsProvider {

    @NotNull
    private final M coroutineScope;

    @NotNull
    private volatile List<OfflineWidget> widgets;

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, d2 = {"<anonymous>", "", "mappedWidgets", "", "Lru/ozon/app/android/emptyscreen/OfflineWidget;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @e(c = "ru.ozon.app.android.travel.feature.general.common.offline.TravelOfflineWidgetsProviderImpl$2", f = "TravelOfflineWidgetsProviderImpl.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.travel.feature.general.common.offline.TravelOfflineWidgetsProviderImpl$2, reason: invalid class name */
    static final class AnonymousClass2 extends j implements Function2<List<? extends OfflineWidget>, d<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        AnonymousClass2(d<? super AnonymousClass2> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            AnonymousClass2 anonymousClass2 = TravelOfflineWidgetsProviderImpl.this.new AnonymousClass2(dVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(List<? extends OfflineWidget> list, d<? super Unit> dVar) {
            return invoke2((List<OfflineWidget>) list, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            TravelOfflineWidgetsProviderImpl.this.widgets = (List) this.L$0;
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(List<OfflineWidget> list, d<? super Unit> dVar) {
            return ((AnonymousClass2) create(list, dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    public TravelOfflineWidgetsProviderImpl(@NotNull OfflineTravelStorage offlineWidgetsStorage, @NotNull CoroutineDispatcherProvider coroutineDispatcherProvider) {
        Intrinsics.checkNotNullParameter(offlineWidgetsStorage, "offlineWidgetsStorage");
        Intrinsics.checkNotNullParameter(coroutineDispatcherProvider, "coroutineDispatcherProvider");
        C2862e a11 = N.a(CoroutineContext.Element.a.d(coroutineDispatcherProvider.getMain(), (H0) X0.b()));
        this.coroutineScope = a11;
        this.widgets = K.f71697a;
        final M0<List<OfflineTravelWidget>> offlineStateObservable = offlineWidgetsStorage.getOfflineStateObservable();
        C2399j.C(new C2408n0(C2399j.B(new InterfaceC2395h<List<? extends OfflineWidget>>() { // from class: ru.ozon.app.android.travel.feature.general.common.offline.TravelOfflineWidgetsProviderImpl$special$$inlined$map$1

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* renamed from: ru.ozon.app.android.travel.feature.general.common.offline.TravelOfflineWidgetsProviderImpl$special$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements InterfaceC2397i {
                final /* synthetic */ InterfaceC2397i $this_unsafeFlow;
                final /* synthetic */ TravelOfflineWidgetsProviderImpl receiver$inlined;

                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @e(c = "ru.ozon.app.android.travel.feature.general.common.offline.TravelOfflineWidgetsProviderImpl$special$$inlined$map$1$2", f = "TravelOfflineWidgetsProviderImpl.kt", l = {50}, m = "emit")
                /* renamed from: ru.ozon.app.android.travel.feature.general.common.offline.TravelOfflineWidgetsProviderImpl$special$$inlined$map$1$2$1, reason: invalid class name */
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

                public AnonymousClass2(InterfaceC2397i interfaceC2397i, TravelOfflineWidgetsProviderImpl travelOfflineWidgetsProviderImpl) {
                    this.$this_unsafeFlow = interfaceC2397i;
                    this.receiver$inlined = travelOfflineWidgetsProviderImpl;
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
                    List mapState;
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
                                mapState = this.receiver$inlined.mapState((List) obj);
                                anonymousClass1.label = 1;
                                if (interfaceC2397i.emit(mapState, anonymousClass1) == aVar) {
                                    return aVar;
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
            public Object collect(InterfaceC2397i<? super List<? extends OfflineWidget>> interfaceC2397i, d dVar) {
                Object collect = InterfaceC2395h.this.collect(new AnonymousClass2(interfaceC2397i, this), dVar);
                return collect == a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
            }
        }, coroutineDispatcherProvider.getDefault()), new AnonymousClass2(null)), a11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<OfflineWidget> mapState(List<OfflineTravelWidget> items) {
        List<OfflineTravelWidget> list = items;
        ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
        for (OfflineTravelWidget offlineTravelWidget : list) {
            arrayList.add(new OfflineWidget(offlineTravelWidget.getVertical(), offlineTravelWidget.getName(), offlineTravelWidget.getVersion(), offlineTravelWidget.getStateJson()));
        }
        return arrayList;
    }

    @Override // ru.ozon.app.android.emptyscreen.OfflineWidgetsProvider
    @NotNull
    public List<OfflineWidget> provideWidgets() {
        return this.widgets;
    }
}
