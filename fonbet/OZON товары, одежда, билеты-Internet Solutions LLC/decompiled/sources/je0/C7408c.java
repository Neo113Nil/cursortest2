package je0;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import le0.C7944a;
import org.jetbrains.annotations.NotNull;
import ru.ozon.mapsdk.common.geoproxy.data.ComposerGeoProxyApi;
import ru.ozon.mapsdk.common.geoproxy.data.GeoProxyApi;
import ru.ozon.mapsdk.common.geoproxy.data.composermodels.ComposerLatLng;
import ru.ozon.mapsdk.common.geoproxy.data.composermodels.GeoProvidersV2Params;
import ru.ozon.mapsdk.common.geoproxy.data.composermodels.MapKeysParams;
import ru.ozon.mapsdk.common.geoproxy.data.composermodels.SuggestParams;
import ru.ozon.mapsdk.common.geoproxy.data.model.CountriesResponse;
import ru.ozon.mapsdk.common.geoproxy.data.model.GeocodeSuggestResponse;
import ru.ozon.mapsdk.common.geoproxy.data.model.MapKeysResponse;
import we0.m;

/* renamed from: je0.c, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C7408c {

    /* renamed from: a, reason: collision with root package name */
    private final ComposerGeoProxyApi f69956a;

    /* renamed from: b, reason: collision with root package name */
    private final GeoProxyApi f69957b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C7944a f69958c;

    public C7408c() {
        this(null, null, 3);
    }

    public final Object a(@NotNull String str, String str2, Double d11, Double d12, @NotNull kotlin.coroutines.d dVar) {
        GeoProxyApi geoProxyApi = this.f69957b;
        if (geoProxyApi != null) {
            return geoProxyApi.geoProvidersV2(str, str2, d11, d12, null, dVar);
        }
        ComposerGeoProxyApi composerGeoProxyApi = this.f69956a;
        Intrinsics.f(composerGeoProxyApi);
        return composerGeoProxyApi.geoProvidersV2(new GeoProvidersV2Params(str, str2, new ComposerLatLng(d11, d12), null), dVar);
    }

    public final Object b(@NotNull kotlin.coroutines.d<? super CountriesResponse> dVar) {
        GeoProxyApi geoProxyApi = this.f69957b;
        if (geoProxyApi != null) {
            return geoProxyApi.getDisallowedCountries(dVar);
        }
        ComposerGeoProxyApi composerGeoProxyApi = this.f69956a;
        Intrinsics.f(composerGeoProxyApi);
        return composerGeoProxyApi.getDisallowedCountries(dVar);
    }

    public final Object c(@NotNull String str, @NotNull kotlin.coroutines.d<? super MapKeysResponse> dVar) {
        GeoProxyApi geoProxyApi = this.f69957b;
        if (geoProxyApi != null) {
            return geoProxyApi.getMapKeys(str, dVar);
        }
        ComposerGeoProxyApi composerGeoProxyApi = this.f69956a;
        Intrinsics.f(composerGeoProxyApi);
        return composerGeoProxyApi.getMapKeys(new MapKeysParams(str), dVar);
    }

    public final Object d(@NotNull String str, @NotNull String str2, int i11, String str3, He0.b bVar, String str4, @NotNull List<String> list, String str5, @NotNull kotlin.coroutines.d<? super GeocodeSuggestResponse> dVar) {
        Double d11;
        String str6;
        String str7;
        int i12;
        String str8;
        String str9;
        List<String> list2;
        String str10;
        kotlin.coroutines.d<? super GeocodeSuggestResponse> dVar2;
        m a11;
        m a12;
        m b11;
        m b12;
        He0.b a13 = this.f69958c.a(bVar);
        SuggestParams.BBOX bbox = null;
        GeoProxyApi geoProxyApi = this.f69957b;
        if (geoProxyApi == null) {
            ComposerGeoProxyApi composerGeoProxyApi = this.f69956a;
            Intrinsics.f(composerGeoProxyApi);
            List<String> list3 = list;
            if (list3.isEmpty()) {
                list3 = null;
            }
            List<String> list4 = list3;
            if (a13 != null) {
                ComposerLatLng.Companion companion = ComposerLatLng.INSTANCE;
                bbox = new SuggestParams.BBOX(companion.formLatLng(a13.b()), companion.formLatLng(a13.a()));
            }
            return composerGeoProxyApi.suggest(new SuggestParams(str, str2, i11, str3, list4, bbox, str5, str4), dVar);
        }
        Double d12 = (a13 == null || (b12 = a13.b()) == null) ? null : new Double(b12.getLatitude());
        Double d13 = (a13 == null || (b11 = a13.b()) == null) ? null : new Double(b11.getLongitude());
        Double d14 = (a13 == null || (a12 = a13.a()) == null) ? null : new Double(a12.getLatitude());
        if (a13 == null || (a11 = a13.a()) == null) {
            d11 = null;
            str6 = str;
            str7 = str2;
            i12 = i11;
            str8 = str3;
            str9 = str4;
            list2 = list;
            str10 = str5;
            dVar2 = dVar;
        } else {
            d11 = new Double(a11.getLongitude());
            str7 = str2;
            i12 = i11;
            str8 = str3;
            str9 = str4;
            list2 = list;
            str10 = str5;
            dVar2 = dVar;
            str6 = str;
        }
        return geoProxyApi.suggest(str6, str7, i12, str8, list2, d12, d13, d14, d11, str9, str10, dVar2);
    }

    public C7408c(ComposerGeoProxyApi composerGeoProxyApi, GeoProxyApi geoProxyApi, int i11) {
        composerGeoProxyApi = (i11 & 1) != 0 ? null : composerGeoProxyApi;
        geoProxyApi = (i11 & 2) != 0 ? null : geoProxyApi;
        this.f69956a = composerGeoProxyApi;
        this.f69957b = geoProxyApi;
        this.f69958c = new C7944a();
        if (geoProxyApi == null && composerGeoProxyApi == null) {
            throw new Exception("One of implimentation net api must be provided");
        }
    }
}
