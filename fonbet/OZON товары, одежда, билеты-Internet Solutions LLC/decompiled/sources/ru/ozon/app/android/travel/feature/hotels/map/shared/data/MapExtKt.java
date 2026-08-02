package ru.ozon.app.android.travel.feature.hotels.map.shared.data;

import Le0.z;
import Ne0.e;
import Sc.s;
import Wc.a;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import ce0.InterfaceC5817a;
import java.util.List;
import kd.InterfaceC7663b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.map.storage.TravelGeoProvidersStorage;
import ru.ozon.mapsdk.OzonMapView;
import ve0.b;
import we0.C10551g;
import we0.i;
import we0.j;
import we0.m;
import we0.n;
import we0.u;
import we0.w;

@Metadata(d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a3\u0010\u000b\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00032\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007H\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u0013\u0010\u000e\u001a\u00020\u0001*\u00020\rH\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001b\u0010\u0012\u001a\u00020\t*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0013\u0010\u0015\u001a\u00020\u0001*\u00020\u0014H\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0013\u0010\u0018\u001a\u00020\u0017*\u00020\u0014H\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0019\u0010\u001c\u001a\u00020\u0017*\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u0013\u0010\u001c\u001a\u00020\u0017*\u00020\u001eH\u0000¢\u0006\u0004\b\u001c\u0010\u001f\u001a\u0019\u0010!\u001a\u00020 *\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0000¢\u0006\u0004\b!\u0010\"\u001a\u0013\u0010!\u001a\u00020 *\u00020#H\u0000¢\u0006\u0004\b!\u0010$\u001a\u0013\u0010'\u001a\u00020&*\u00020%H\u0000¢\u0006\u0004\b'\u0010(\u001a/\u0010,\u001a\u00020\b*\u00020\u00172\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u001b0)2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u001b0)H\u0000¢\u0006\u0004\b,\u0010-\u001a5\u0010.\u001a\u00020\b*\b\u0012\u0004\u0012\u00020\u00170\u001a2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u001b0)2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u001b0)H\u0000¢\u0006\u0004\b.\u0010/\u001a\u001b\u00103\u001a\u000200*\u0002002\u0006\u00102\u001a\u000201H\u0000¢\u0006\u0004\b3\u00104\u001a'\u00107\u001a\b\u0012\u0004\u0012\u00020\u001b0)*\b\u0012\u0004\u0012\u00020\u001b0)2\u0006\u00106\u001a\u000205H\u0000¢\u0006\u0004\b7\u00108\u001a\u001f\u0010:\u001a\u0004\u0018\u00010\u00012\f\u00109\u001a\b\u0012\u0004\u0012\u00020\u00170\u001aH\u0002¢\u0006\u0004\b:\u0010;\u001a\u001f\u0010?\u001a\u00020=2\u0006\u0010<\u001a\u00020\u00102\u0006\u0010>\u001a\u00020=H\u0002¢\u0006\u0004\b?\u0010@\u001a@\u0010J\u001a\u00020\t*\u00020\u00102\u0006\u0010B\u001a\u00020A2\b\u0010C\u001a\u0004\u0018\u00010\u00172\u0006\u0010E\u001a\u00020D2\u0006\u0010G\u001a\u00020F2\b\b\u0002\u0010I\u001a\u00020HH\u0080@¢\u0006\u0004\bJ\u0010K\"\u0014\u0010L\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010M\"\u0018\u0010P\u001a\u000205*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bN\u0010O\"\u0018\u0010\u0004\u001a\u00020\u0003*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010R\"\u0018\u0010U\u001a\u00020\r*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bS\u0010T\"\u001e\u0010Y\u001a\b\u0012\u0004\u0012\u00020V0\u001a*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bW\u0010X\"\u001e\u0010*\u001a\b\u0012\u0004\u0012\u00020\u001b0)*\u00020\r8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bZ\u0010[\"\u001e\u0010+\u001a\b\u0012\u0004\u0012\u00020\u001b0)*\u00020\r8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\\\u0010[¨\u0006]"}, d2 = {"Lve0/b;", "Lwe0/n;", "bounds", "Lwe0/g;", "position", "(Lve0/b;Lwe0/n;)Lwe0/g;", "cameraPosition", "Lkotlin/Function1;", "", "", "completionCallback", "move", "(Lve0/b;Lwe0/g;Lkotlin/jvm/functions/Function1;)V", "Lwe0/i;", "toBounds", "(Lwe0/i;)Lwe0/n;", "Lru/ozon/mapsdk/OzonMapView;", "controller", "updateActiveZone", "(Lru/ozon/mapsdk/OzonMapView;Lve0/b;)V", "Lru/ozon/app/android/travel/feature/hotels/map/shared/data/BoundingBoxV2;", "toLatLngBounds", "(Lru/ozon/app/android/travel/feature/hotels/map/shared/data/BoundingBoxV2;)Lwe0/n;", "Lwe0/m;", "getCenter", "(Lru/ozon/app/android/travel/feature/hotels/map/shared/data/BoundingBoxV2;)Lwe0/m;", "", "", "toLatLng", "(Ljava/util/List;)Lwe0/m;", "", "([D)Lwe0/m;", "Landroid/graphics/PointF;", "toPointF", "(Ljava/util/List;)Landroid/graphics/PointF;", "Lru/ozon/app/android/travel/feature/hotels/map/shared/data/PointDTO;", "(Lru/ozon/app/android/travel/feature/hotels/map/shared/data/PointDTO;)Landroid/graphics/PointF;", "Landroid/view/View;", "Landroid/graphics/Bitmap;", "getBitmap", "(Landroid/view/View;)Landroid/graphics/Bitmap;", "Lkd/b;", "latitudeRange", "longitudeRange", "isInVisibleArea", "(Lwe0/m;Lkd/b;Lkd/b;)Z", "hasIntersection", "(Ljava/util/List;Lkd/b;Lkd/b;)Z", "", "", "bitPosition", "writeTrueAtPosition", "(JI)J", "", "expandPercent", "expandRange", "(Lkd/b;F)Lkd/b;", "polygonPath", "findRectForPolygon", "(Ljava/util/List;)Lwe0/n;", "view", "Lwe0/j;", "padding", "getCheckedCameraVisibleAreaPadding", "(Lru/ozon/mapsdk/OzonMapView;Lwe0/j;)Lwe0/j;", "Lru/ozon/app/android/travel/map/storage/TravelGeoProvidersStorage;", "storage", "locationPoint", "Landroid/content/Context;", "context", "", "miniAppName", "LNe0/e;", "librePlacemarkImplementation", "initMapForTravel", "(Lru/ozon/mapsdk/OzonMapView;Lru/ozon/app/android/travel/map/storage/TravelGeoProvidersStorage;Lwe0/m;Landroid/content/Context;Ljava/lang/String;LNe0/e;Lkotlin/coroutines/d;)Ljava/lang/Object;", "EMPTY_AREA_PADDING", "Lwe0/j;", "getZoom", "(Lve0/b;)F", "zoom", "getPosition", "(Lve0/b;)Lwe0/g;", "getVisibleArea", "(Lve0/b;)Lwe0/i;", "visibleArea", "Lwe0/u;", "getPlacemarks", "(Lve0/b;)Ljava/util/List;", "placemarks", "getLatitudeRange", "(Lwe0/i;)Lkd/b;", "getLongitudeRange", "map_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MapExtKt {

    @NotNull
    private static final j EMPTY_AREA_PADDING = new j(0, 0, 0, 0);

    @NotNull
    public static final InterfaceC7663b<Double> expandRange(@NotNull InterfaceC7663b<Double> interfaceC7663b, float f7) {
        Intrinsics.checkNotNullParameter(interfaceC7663b, "<this>");
        double doubleValue = (interfaceC7663b.e().doubleValue() - interfaceC7663b.getStart().doubleValue()) * f7;
        return h.k(interfaceC7663b.getStart().doubleValue() - doubleValue, interfaceC7663b.e().doubleValue() + doubleValue);
    }

    private static final n findRectForPolygon(List<m> list) {
        if (list.isEmpty()) {
            return null;
        }
        double latitude = list.get(0).getLatitude();
        double longitude = list.get(0).getLongitude();
        double d11 = longitude;
        double d12 = d11;
        double d13 = latitude;
        for (m mVar : list) {
            if (mVar.getLatitude() > d13) {
                d13 = mVar.getLatitude();
            }
            if (mVar.getLatitude() < latitude) {
                latitude = mVar.getLatitude();
            }
            if (mVar.getLongitude() > d12) {
                d12 = mVar.getLongitude();
            }
            if (mVar.getLongitude() < d11) {
                d11 = mVar.getLongitude();
            }
        }
        return new n(new m(latitude, d11), new m(d13, d12));
    }

    @NotNull
    public static final Bitmap getBitmap(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.measure(0, 0);
        Bitmap createBitmap = Bitmap.createBitmap(view.getMeasuredWidth(), view.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
        view.draw(canvas);
        return createBitmap;
    }

    @NotNull
    public static final m getCenter(@NotNull BoundingBoxV2 boundingBoxV2) {
        Intrinsics.checkNotNullParameter(boundingBoxV2, "<this>");
        n latLngBounds = toLatLngBounds(boundingBoxV2);
        double d11 = 2;
        return new m((latLngBounds.a().getLatitude() + latLngBounds.b().getLatitude()) / d11, (latLngBounds.b().getLongitude() + latLngBounds.a().getLongitude()) / d11);
    }

    private static final j getCheckedCameraVisibleAreaPadding(OzonMapView ozonMapView, j jVar) {
        int measuredWidth = ozonMapView.getMeasuredWidth();
        int g10 = jVar.g();
        if (g10 >= 0 && g10 <= measuredWidth) {
            int measuredHeight = ozonMapView.getMeasuredHeight();
            int e11 = jVar.e();
            if (e11 >= 0 && e11 <= measuredHeight) {
                return jVar;
            }
        }
        return EMPTY_AREA_PADDING;
    }

    @NotNull
    public static final InterfaceC7663b<Double> getLatitudeRange(@NotNull i iVar) {
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        return h.k(iVar.d().getLatitude(), iVar.f().getLatitude());
    }

    @NotNull
    public static final InterfaceC7663b<Double> getLongitudeRange(@NotNull i iVar) {
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        return h.k(iVar.f().getLongitude(), iVar.g().getLongitude());
    }

    @NotNull
    public static final List<u> getPlacemarks(@NotNull b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        return bVar.b().a();
    }

    @NotNull
    public static final C10551g getPosition(@NotNull b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        return bVar.g().getCurrentPosition();
    }

    @NotNull
    public static final i getVisibleArea(@NotNull b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        return bVar.g().getVisibleArea();
    }

    public static final float getZoom(@NotNull b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        return bVar.g().getCurrentPosition().e();
    }

    public static final boolean hasIntersection(@NotNull List<m> list, @NotNull InterfaceC7663b<Double> latitudeRange, @NotNull InterfaceC7663b<Double> longitudeRange) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(latitudeRange, "latitudeRange");
        Intrinsics.checkNotNullParameter(longitudeRange, "longitudeRange");
        n findRectForPolygon = findRectForPolygon(list);
        return findRectForPolygon != null && findRectForPolygon.a().getLongitude() >= longitudeRange.getStart().doubleValue() && findRectForPolygon.b().getLongitude() <= longitudeRange.e().doubleValue() && findRectForPolygon.a().getLatitude() >= latitudeRange.getStart().doubleValue() && findRectForPolygon.b().getLatitude() <= latitudeRange.e().doubleValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x007b, code lost:
    
        if (r7.j((ru.ozon.mapsdk.common.geoproxy.data.model.GeoProviderConfig) r13, null, r8, r0) == r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0065, code lost:
    
        if (r13 == r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x009d, code lost:
    
        if (r7.i(null, ru.ozon.mapsdk.common.geoproxy.model.ActualBXTab.NONE, r6, r11, r0) == r1) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object initMapForTravel(@NotNull OzonMapView ozonMapView, @NotNull TravelGeoProvidersStorage travelGeoProvidersStorage, m mVar, @NotNull Context context, @NotNull String str, @NotNull final e eVar, @NotNull d<? super Unit> dVar) {
        MapExtKt$initMapForTravel$1 mapExtKt$initMapForTravel$1;
        int i11;
        if (dVar instanceof MapExtKt$initMapForTravel$1) {
            mapExtKt$initMapForTravel$1 = (MapExtKt$initMapForTravel$1) dVar;
            int i12 = mapExtKt$initMapForTravel$1.label;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                mapExtKt$initMapForTravel$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = mapExtKt$initMapForTravel$1.result;
                Object obj2 = a.COROUTINE_SUSPENDED;
                i11 = mapExtKt$initMapForTravel$1.label;
                if (i11 != 0) {
                    s.b(obj);
                    if (mVar == null || !(travelGeoProvidersStorage.isNewStorage() || Intrinsics.d(str, "travel"))) {
                        String appName = travelGeoProvidersStorage.isNewStorage() ? travelGeoProvidersStorage.getAppName() : null;
                        w wVar = new w(eVar) { // from class: ru.ozon.app.android.travel.feature.hotels.map.shared.data.MapExtKt$initMapForTravel$3
                            private final z libreSettings;

                            {
                                this.libreSettings = new z(eVar) { // from class: ru.ozon.app.android.travel.feature.hotels.map.shared.data.MapExtKt$initMapForTravel$3$libreSettings$1
                                    private final e librePlacemarkImplementation;

                                    {
                                        this.librePlacemarkImplementation = eVar;
                                    }

                                    @Override // Le0.z
                                    public e getLibrePlacemarkImplementation() {
                                        return this.librePlacemarkImplementation;
                                    }
                                };
                            }

                            @Override // we0.w
                            public z getLibreSettings() {
                                return this.libreSettings;
                            }
                        };
                        mapExtKt$initMapForTravel$1.label = 3;
                        int i13 = OzonMapView.f97534l;
                    } else {
                        mapExtKt$initMapForTravel$1.L$0 = ozonMapView;
                        mapExtKt$initMapForTravel$1.L$1 = eVar;
                        mapExtKt$initMapForTravel$1.label = 1;
                        obj = travelGeoProvidersStorage.getProviderByPoint(mVar, context, mapExtKt$initMapForTravel$1);
                    }
                    return obj2;
                }
                if (i11 != 1) {
                    if (i11 == 2) {
                        s.b(obj);
                        return Unit.f71690a;
                    }
                    if (i11 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                    return Unit.f71690a;
                }
                eVar = (e) mapExtKt$initMapForTravel$1.L$1;
                ozonMapView = (OzonMapView) mapExtKt$initMapForTravel$1.L$0;
                s.b(obj);
                w wVar2 = new w(eVar) { // from class: ru.ozon.app.android.travel.feature.hotels.map.shared.data.MapExtKt$initMapForTravel$2
                    private final z libreSettings;

                    {
                        this.libreSettings = new z(eVar) { // from class: ru.ozon.app.android.travel.feature.hotels.map.shared.data.MapExtKt$initMapForTravel$2$libreSettings$1
                            private final e librePlacemarkImplementation;

                            {
                                this.librePlacemarkImplementation = eVar;
                            }

                            @Override // Le0.z
                            public e getLibrePlacemarkImplementation() {
                                return this.librePlacemarkImplementation;
                            }
                        };
                    }

                    @Override // we0.w
                    public z getLibreSettings() {
                        return this.libreSettings;
                    }
                };
                mapExtKt$initMapForTravel$1.L$0 = null;
                mapExtKt$initMapForTravel$1.L$1 = null;
                mapExtKt$initMapForTravel$1.label = 2;
                int i14 = OzonMapView.f97534l;
            }
        }
        mapExtKt$initMapForTravel$1 = new MapExtKt$initMapForTravel$1(dVar);
        Object obj3 = mapExtKt$initMapForTravel$1.result;
        Object obj22 = a.COROUTINE_SUSPENDED;
        i11 = mapExtKt$initMapForTravel$1.label;
        if (i11 != 0) {
        }
    }

    public static Object initMapForTravel$default(OzonMapView ozonMapView, TravelGeoProvidersStorage travelGeoProvidersStorage, m mVar, Context context, String str, e eVar, d dVar, int i11, Object obj) {
        if ((i11 & 16) != 0) {
            eVar = new e.a();
        }
        return initMapForTravel(ozonMapView, travelGeoProvidersStorage, mVar, context, str, eVar, dVar);
    }

    public static final boolean isInVisibleArea(@NotNull m mVar, @NotNull InterfaceC7663b<Double> latitudeRange, @NotNull InterfaceC7663b<Double> longitudeRange) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(latitudeRange, "latitudeRange");
        Intrinsics.checkNotNullParameter(longitudeRange, "longitudeRange");
        return longitudeRange.c(Double.valueOf(mVar.getLongitude())) && latitudeRange.c(Double.valueOf(mVar.getLatitude()));
    }

    public static final void move(@NotNull b bVar, @NotNull C10551g cameraPosition, Function1<? super Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(cameraPosition, "cameraPosition");
        bVar.g().b(cameraPosition, 0.05f, function1);
    }

    @NotNull
    public static final C10551g position(@NotNull b bVar, @NotNull n bounds) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        return bVar.g().c(bounds);
    }

    @NotNull
    public static final n toBounds(@NotNull i iVar) {
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        return new n(new m(iVar.d().getLatitude(), iVar.d().getLongitude()), new m(iVar.g().getLatitude(), iVar.g().getLongitude()));
    }

    @NotNull
    public static final m toLatLng(@NotNull List<Double> list) {
        Double d11;
        Intrinsics.checkNotNullParameter(list, "<this>");
        int size = list.size();
        Double valueOf = Double.valueOf(0.0d);
        if (size > 0) {
            d11 = list.get(0);
        } else {
            Lm0.a.f17149a.e("Wrong map coordinate, you should check coordinate with [0,0]", new Object[0]);
            d11 = valueOf;
        }
        double doubleValue = d11.doubleValue();
        if (1 < list.size()) {
            valueOf = list.get(1);
        } else {
            Lm0.a.f17149a.e("Wrong map coordinate, you should check coordinate with [0,0]", new Object[0]);
        }
        return new m(doubleValue, valueOf.doubleValue());
    }

    @NotNull
    public static final n toLatLngBounds(@NotNull BoundingBoxV2 boundingBoxV2) {
        Intrinsics.checkNotNullParameter(boundingBoxV2, "<this>");
        return new n(toLatLng(boundingBoxV2.getSouthWest()), toLatLng(boundingBoxV2.getNorthEast()));
    }

    @NotNull
    public static final PointF toPointF(@NotNull List<Double> list) {
        Double d11;
        Intrinsics.checkNotNullParameter(list, "<this>");
        int size = list.size();
        Double valueOf = Double.valueOf(0.0d);
        if (size > 0) {
            d11 = list.get(0);
        } else {
            Lm0.a.f17149a.e("Wrong map coordinate, you should check coordinate with [0,0]", new Object[0]);
            d11 = valueOf;
        }
        float doubleValue = (float) d11.doubleValue();
        if (1 < list.size()) {
            valueOf = list.get(1);
        } else {
            Lm0.a.f17149a.e("Wrong map coordinate, you should check coordinate with [0,0]", new Object[0]);
        }
        return new PointF(doubleValue, (float) valueOf.doubleValue());
    }

    public static final void updateActiveZone(@NotNull OzonMapView ozonMapView, @NotNull b controller) {
        Intrinsics.checkNotNullParameter(ozonMapView, "<this>");
        Intrinsics.checkNotNullParameter(controller, "controller");
        Rect focusRect = new Rect(0, 0, ozonMapView.getWidth(), ozonMapView.getHeight());
        InterfaceC5817a g10 = controller.g();
        int measuredWidth = ozonMapView.getMeasuredWidth();
        int measuredHeight = ozonMapView.getMeasuredHeight();
        Intrinsics.checkNotNullParameter(focusRect, "focusRect");
        g10.a(getCheckedCameraVisibleAreaPadding(ozonMapView, new j(focusRect.left, focusRect.top, measuredWidth - focusRect.right, measuredHeight - focusRect.bottom)));
    }

    public static final long writeTrueAtPosition(long j11, int i11) {
        return j11 | (1 << (42 - i11));
    }

    @NotNull
    public static final m toLatLng(@NotNull double[] dArr) {
        double d11;
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        double d12 = 0.0d;
        if (dArr.length > 0) {
            d11 = dArr[0];
        } else {
            Lm0.a.f17149a.e("Wrong map coordinate, you should check coordinate with [0,0]", new Object[0]);
            d11 = 0.0d;
        }
        if (1 < dArr.length) {
            d12 = dArr[1];
        } else {
            Lm0.a.f17149a.e("Wrong map coordinate, you should check coordinate with [0,0]", new Object[0]);
        }
        return new m(d11, d12);
    }

    @NotNull
    public static final PointF toPointF(@NotNull PointDTO pointDTO) {
        Intrinsics.checkNotNullParameter(pointDTO, "<this>");
        return new PointF(pointDTO.getX(), pointDTO.getY());
    }
}
