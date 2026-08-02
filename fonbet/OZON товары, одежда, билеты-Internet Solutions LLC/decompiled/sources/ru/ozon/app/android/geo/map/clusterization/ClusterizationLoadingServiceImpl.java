package ru.ozon.app.android.geo.map.clusterization;

import Ae.C2399j;
import Ae.M0;
import Ae.O0;
import Ae.x0;
import He.b;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.geo.map.clusterization.PinsState;
import xe.B0;
import xe.C10720e0;
import xe.C10727i;
import xe.H0;
import xe.J;
import xe.L;
import xe.M;
import xe.N;
import xe.X0;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B!\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u001a\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0096\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0018R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0019R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001aR\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\f0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lru/ozon/app/android/geo/map/clusterization/ClusterizationLoadingServiceImpl;", "Lru/ozon/app/android/geo/map/clusterization/ClusterizationLoadingService;", "Lru/ozon/app/android/geo/map/clusterization/BitmapProviderDelegate;", "Lru/ozon/app/android/geo/map/clusterization/ClusterizationRepository;", "repository", "Lru/ozon/app/android/geo/map/clusterization/ClusterizationPinsDecoder;", "decoder", "Lru/ozon/app/android/geo/map/clusterization/MapPlacemarkFactory;", "mapPlacemarkFactory", "<init>", "(Lru/ozon/app/android/geo/map/clusterization/ClusterizationRepository;Lru/ozon/app/android/geo/map/clusterization/ClusterizationPinsDecoder;Lru/ozon/app/android/geo/map/clusterization/MapPlacemarkFactory;)V", "LAe/M0;", "Lru/ozon/app/android/geo/map/clusterization/PinsState;", "pinsFlow", "()LAe/M0;", "", "loadPins", "()V", "clear", "", "cacheKey", "Lru/ozon/app/android/geo/map/clusterization/BitmapContainer;", "getBitmap", "(I)Lru/ozon/app/android/geo/map/clusterization/BitmapContainer;", "Lru/ozon/app/android/geo/map/clusterization/ClusterizationRepository;", "Lru/ozon/app/android/geo/map/clusterization/ClusterizationPinsDecoder;", "Lru/ozon/app/android/geo/map/clusterization/MapPlacemarkFactory;", "LAe/x0;", "_pinsFlow", "LAe/x0;", "Lxe/B0;", "loadJob", "Lxe/B0;", "Lxe/M;", "coroutineScope", "Lxe/M;", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ClusterizationLoadingServiceImpl implements ClusterizationLoadingService, BitmapProviderDelegate {
    private final /* synthetic */ BitmapProviderDelegateImpl $$delegate_0;

    @NotNull
    private final x0<PinsState> _pinsFlow;

    @NotNull
    private final M coroutineScope;

    @NotNull
    private final ClusterizationPinsDecoder decoder;
    private B0 loadJob;

    @NotNull
    private final MapPlacemarkFactory mapPlacemarkFactory;

    @NotNull
    private final ClusterizationRepository repository;

    public ClusterizationLoadingServiceImpl(@NotNull ClusterizationRepository repository, @NotNull ClusterizationPinsDecoder decoder, @NotNull MapPlacemarkFactory mapPlacemarkFactory) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(mapPlacemarkFactory, "mapPlacemarkFactory");
        this.$$delegate_0 = new BitmapProviderDelegateImpl(mapPlacemarkFactory);
        this.repository = repository;
        this.decoder = decoder;
        this.mapPlacemarkFactory = mapPlacemarkFactory;
        this._pinsFlow = O0.a(PinsState.Loading.INSTANCE);
        B0 b11 = X0.b();
        C10720e0 c10720e0 = C10720e0.f105451a;
        CoroutineContext d11 = CoroutineContext.Element.a.d(b.f10879b, (H0) b11);
        Intrinsics.checkNotNullExpressionValue("ClusterizationLoadingServiceImpl", "getSimpleName(...)");
        this.coroutineScope = N.a(d11.plus(new L("ClusterizationLoadingServiceImpl")).plus(new ClusterizationLoadingServiceImpl$special$$inlined$CoroutineExceptionHandler$1(J.f105405n0)));
    }

    @Override // ru.ozon.app.android.geo.map.clusterization.ClusterizationLoadingService
    public void clear() {
        B0 b02 = this.loadJob;
        if (b02 != null) {
            b02.j(null);
        }
        this._pinsFlow.setValue(PinsState.Loading.INSTANCE);
    }

    @Override // ru.ozon.app.android.geo.map.clusterization.BitmapProviderDelegate
    public BitmapContainer getBitmap(int cacheKey) {
        return this.$$delegate_0.getBitmap(cacheKey);
    }

    @Override // ru.ozon.app.android.geo.map.clusterization.ClusterizationLoadingService
    public void loadPins() {
        B0 b02 = this.loadJob;
        if (b02 != null) {
            b02.j(null);
        }
        this.loadJob = C10727i.c(this.coroutineScope, null, null, new ClusterizationLoadingServiceImpl$loadPins$1(this, null), 3);
    }

    @Override // ru.ozon.app.android.geo.map.clusterization.ClusterizationLoadingService
    @NotNull
    public M0<PinsState> pinsFlow() {
        return C2399j.b(this._pinsFlow);
    }
}
