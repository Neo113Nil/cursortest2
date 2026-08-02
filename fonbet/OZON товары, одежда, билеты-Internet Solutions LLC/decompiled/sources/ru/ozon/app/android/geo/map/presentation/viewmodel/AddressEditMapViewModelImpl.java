package ru.ozon.app.android.geo.map.presentation.viewmodel;

import An.b;
import Bc.j;
import Bc.r;
import DM.e;
import DM.f;
import DM.g;
import DM.h;
import DM.i;
import Fy.C3065c;
import L9.c;
import Lm0.a;
import WZ.t;
import android.content.Context;
import androidx.lifecycle.V;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import com.google.android.gms.common.internal.ImagesContract;
import io.reactivex.p;
import io.reactivex.u;
import io.reactivex.y;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import mc.C8125a;
import nc.C8486a;
import nc.InterfaceC8487b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.geo.map.clusterization.ClusterizationLoadingService;
import ru.ozon.app.android.geo.map.data.AddressEditMapDTO;
import ru.ozon.app.android.geo.map.data.AddressEditMapRequest;
import ru.ozon.app.android.geo.map.data.AddressEditMapRequestKt;
import ru.ozon.app.android.geo.map.data.CurrentLocation;
import ru.ozon.app.android.geo.map.data.MapRequest;
import ru.ozon.app.android.geo.map.presentation.AddressEditMapMapperKt;
import ru.ozon.app.android.geo.map.presentation.AddressEditMapVO;
import ru.ozon.app.android.geo.map.presentation.AddressEditMapVOWithPayloads;
import ru.ozon.app.android.geo.map.presentation.utils.AddressEditMapGeoProviderDelegate;
import ru.ozon.app.android.geo.map.presentation.utils.AddressEditMapGeoProviderDelegateImpl;
import ru.ozon.app.android.geo.map.presentation.viewmodel.AddressEditMapViewModel;
import ru.ozon.app.android.geoprovider.GeoProviderRepository;
import ru.ozon.app.android.location.AreaLocalStore;
import ru.ozon.app.android.location.LocationRepository;
import ru.ozon.app.android.location.NoLastLocationException;
import ru.ozon.app.android.location.NoPermissionException;
import ru.ozon.app.android.mapcommon.map.model.CoordinateModel;
import ru.ozon.app.android.mapcommon.mapcommon.LastLocationRepository;
import ru.ozon.app.android.pdp.widgets.richContent.data.RichContentDTO;
import ru.ozon.app.android.utils.StringExtKt;
import ru.ozon.app.android.utils.rx.RxExtKt;
import ru.ozon.mapsdk.common.geoproxy.data.model.GeoProviderConfig;
import sc.C9656b;
import vc.l;
import xe.B0;
import xe.C10727i;

@Metadata(d1 = {"\u0000ö\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0003\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0000\u0018\u0000 ¨\u00012\u00020\u00012\u00020\u00022\u00020\u0003:\u0002¨\u0001B9\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001d\u0010\u001aJ)\u0010$\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\u001e2\b\u0010!\u001a\u0004\u0018\u00010 2\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b$\u0010%J3\u0010*\u001a\u00020\u00162\u0006\u0010'\u001a\u00020&2\u0006\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 2\b\u0010)\u001a\u0004\u0018\u00010(H\u0016¢\u0006\u0004\b*\u0010+J5\u0010-\u001a\u00020\u00162\b\u0010,\u001a\u0004\u0018\u00010&2\u0006\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 2\b\u0010)\u001a\u0004\u0018\u00010(H\u0016¢\u0006\u0004\b-\u0010+J5\u0010.\u001a\u00020\u00162\b\u0010,\u001a\u0004\u0018\u00010&2\b\u0010!\u001a\u0004\u0018\u00010 2\u0006\u0010#\u001a\u00020\"2\b\u0010)\u001a\u0004\u0018\u00010(H\u0016¢\u0006\u0004\b.\u0010/J\u0017\u00100\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b0\u0010\u001cJ\u000f\u00101\u001a\u00020\u0016H\u0016¢\u0006\u0004\b1\u0010\u001aJ;\u00104\u001a\u00020\u00162\u0006\u0010'\u001a\u00020&2\u0006\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 2\b\u0010)\u001a\u0004\u0018\u00010(2\u0006\u00103\u001a\u000202H\u0016¢\u0006\u0004\b4\u00105J\u0017\u00107\u001a\u00020\u00162\u0006\u00106\u001a\u00020\u0014H\u0016¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020\u0016H\u0014¢\u0006\u0004\b9\u0010\u001aJ\u0017\u0010<\u001a\u00020\u00162\u0006\u0010;\u001a\u00020:H\u0016¢\u0006\u0004\b<\u0010=J\u0017\u0010>\u001a\u00020\u00142\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b>\u0010?J\u001f\u0010B\u001a\u00020\u00142\u0006\u0010A\u001a\u00020@2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\bB\u0010CJ\u0017\u0010F\u001a\u00020\u00162\u0006\u0010E\u001a\u00020DH\u0016¢\u0006\u0004\bF\u0010GJ\u000f\u0010H\u001a\u00020\u0016H\u0016¢\u0006\u0004\bH\u0010\u001aJ\u000f\u0010I\u001a\u00020\u0016H\u0016¢\u0006\u0004\bI\u0010\u001aJ\u0017\u0010K\u001a\u00020\u00162\u0006\u0010J\u001a\u00020\u0014H\u0016¢\u0006\u0004\bK\u00108J&\u0010P\u001a\u00020\u00162\u0006\u0010M\u001a\u00020L2\f\u0010O\u001a\b\u0012\u0004\u0012\u00020\u00160NH\u0096\u0001¢\u0006\u0004\bP\u0010QJ\u001a\u0010S\u001a\u0004\u0018\u00010R2\u0006\u00103\u001a\u000202H\u0096\u0001¢\u0006\u0004\bS\u0010TJ\u0010\u0010U\u001a\u00020\u0016H\u0096\u0001¢\u0006\u0004\bU\u0010\u001aJ)\u0010V\u001a\u00020\u00162\u0006\u0010'\u001a\u00020&2\b\u0010!\u001a\u0004\u0018\u00010 2\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\bV\u0010WJ3\u0010X\u001a\u00020\u00162\u0006\u0010'\u001a\u00020&2\b\u0010!\u001a\u0004\u0018\u00010 2\u0006\u0010#\u001a\u00020\"2\b\u0010)\u001a\u0004\u0018\u00010(H\u0002¢\u0006\u0004\bX\u0010/J3\u0010Y\u001a\u00020\u00162\u0006\u0010'\u001a\u00020&2\b\u0010!\u001a\u0004\u0018\u00010 2\u0006\u0010#\u001a\u00020\"2\b\u0010)\u001a\u0004\u0018\u00010(H\u0002¢\u0006\u0004\bY\u0010/J!\u0010[\u001a\u00020Z2\b\u0010!\u001a\u0004\u0018\u00010 2\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b[\u0010\\J\u0019\u0010]\u001a\u0004\u0018\u00010&2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b]\u0010^J\u001f\u0010b\u001a\u00020\u00142\u0006\u0010`\u001a\u00020_2\u0006\u0010a\u001a\u00020_H\u0002¢\u0006\u0004\bb\u0010cJ\u001b\u0010e\u001a\u00020\u00162\n\b\u0002\u0010d\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\be\u0010\u001cJ\u0019\u0010f\u001a\u00020\u00162\b\u0010d\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\bf\u0010\u001cJ\u0017\u0010g\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\bg\u0010\u001cJ\u0017\u0010j\u001a\u00020\u00162\u0006\u0010i\u001a\u00020hH\u0002¢\u0006\u0004\bj\u0010kJ\u0017\u0010l\u001a\u00020\u00162\u0006\u0010i\u001a\u00020hH\u0002¢\u0006\u0004\bl\u0010kJ\u0017\u0010g\u001a\u00020\u00162\u0006\u0010m\u001a\u00020@H\u0002¢\u0006\u0004\bg\u0010nJ\u0017\u0010q\u001a\u00020\u00162\u0006\u0010p\u001a\u00020oH\u0002¢\u0006\u0004\bq\u0010rJ\u000f\u0010s\u001a\u00020\u0016H\u0002¢\u0006\u0004\bs\u0010\u001aJ\u000f\u0010t\u001a\u00020\u0016H\u0002¢\u0006\u0004\bt\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010uR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010vR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010wR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010xR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010yR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010zR!\u0010}\u001a\b\u0012\u0004\u0012\u00020|0{8\u0016X\u0096\u0004¢\u0006\r\n\u0004\b}\u0010~\u001a\u0005\b\u007f\u0010\u0080\u0001R$\u0010\u0081\u0001\u001a\b\u0012\u0004\u0012\u00020_0{8\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\b\u0081\u0001\u0010~\u001a\u0006\b\u0082\u0001\u0010\u0080\u0001R$\u0010\u0083\u0001\u001a\b\u0012\u0004\u0012\u00020\u00140{8\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\b\u0083\u0001\u0010~\u001a\u0006\b\u0084\u0001\u0010\u0080\u0001R%\u0010\u0086\u0001\u001a\t\u0012\u0005\u0012\u00030\u0085\u00010{8\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\b\u0086\u0001\u0010~\u001a\u0006\b\u0087\u0001\u0010\u0080\u0001R\u0018\u0010\u0089\u0001\u001a\u00030\u0088\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u008a\u0001R\u001e\u0010\u008c\u0001\u001a\t\u0012\u0004\u0012\u00020_0\u008b\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008c\u0001\u0010\u008d\u0001R\u0019\u0010\u008e\u0001\u001a\u00020D8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008e\u0001\u0010\u008f\u0001R\u001c\u0010\u0091\u0001\u001a\u0005\u0018\u00010\u0090\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0091\u0001\u0010\u0092\u0001R\u0019\u0010\u0093\u0001\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0093\u0001\u0010\u0094\u0001R\u001c\u0010\u0096\u0001\u001a\u0005\u0018\u00010\u0095\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0096\u0001\u0010\u0097\u0001R\u001c\u0010\u0098\u0001\u001a\u0005\u0018\u00010\u0095\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0098\u0001\u0010\u0097\u0001R\u0019\u0010\u0099\u0001\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0099\u0001\u0010\u0094\u0001R\u0019\u0010\u009a\u0001\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009a\u0001\u0010\u0094\u0001R#\u0010\u009f\u0001\u001a\u0004\u0018\u00010R8\u0016@\u0016X\u0096\u000f¢\u0006\u0010\u001a\u0006\b\u009b\u0001\u0010\u009c\u0001\"\u0006\b\u009d\u0001\u0010\u009e\u0001R#\u0010¤\u0001\u001a\u0004\u0018\u00010&8\u0016@\u0016X\u0096\u000f¢\u0006\u0010\u001a\u0006\b \u0001\u0010¡\u0001\"\u0006\b¢\u0001\u0010£\u0001R!\u0010§\u0001\u001a\u00020&8\u0016@\u0016X\u0096\u000f¢\u0006\u0010\u001a\u0006\b¥\u0001\u0010¡\u0001\"\u0006\b¦\u0001\u0010£\u0001¨\u0006©\u0001"}, d2 = {"Lru/ozon/app/android/geo/map/presentation/viewmodel/AddressEditMapViewModelImpl;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/geo/map/presentation/viewmodel/AddressEditMapViewModel;", "Lru/ozon/app/android/geo/map/presentation/utils/AddressEditMapGeoProviderDelegate;", "Lru/ozon/app/android/location/LocationRepository;", "locationRepository", "Lru/ozon/app/android/location/AreaLocalStore;", "areaLocalStore", "Lru/ozon/app/android/geo/map/presentation/viewmodel/AddressEditMapStateReducer;", "addressEditMapStateReducer", "Lru/ozon/app/android/geoprovider/GeoProviderRepository;", "geoProviderRepository", "Lru/ozon/app/android/mapcommon/mapcommon/LastLocationRepository;", "lastLocationRepository", "Lru/ozon/app/android/geo/map/clusterization/ClusterizationLoadingService;", "clusterizationLoadingService", "<init>", "(Lru/ozon/app/android/location/LocationRepository;Lru/ozon/app/android/location/AreaLocalStore;Lru/ozon/app/android/geo/map/presentation/viewmodel/AddressEditMapStateReducer;Lru/ozon/app/android/geoprovider/GeoProviderRepository;Lru/ozon/app/android/mapcommon/mapcommon/LastLocationRepository;Lru/ozon/app/android/geo/map/clusterization/ClusterizationLoadingService;)V", "Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO;", "page", "", "isFirstInit", "", "bind", "(Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO;Z)V", "defineLocationIfPermissionChanged", "()V", "defineLocationIfNeeded", "(Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO;)V", "onCameraStartMoveAction", "Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$Coordinate;", RichContentDTO.ALIGN_CENTER, "Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$ViewPort;", "viewport", "", "zoom", "onCameraEndMoveAction", "(Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$Coordinate;Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$ViewPort;F)V", "", ImagesContract.URL, "LWZ/t;", "tokenizedEvent", "onSelectPinFromBannerAction", "(Ljava/lang/String;FLru/ozon/app/android/geo/map/presentation/AddressEditMapVO$ViewPort;LWZ/t;)V", "link", "onPinClickedAction", "onClusterClickedAction", "(Ljava/lang/String;Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$ViewPort;FLWZ/t;)V", "showUserCurrentLocationPin", "onBackPressed", "Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$Selector$Type;", "type", "onSelectorButtonPressed", "(Ljava/lang/String;FLru/ozon/app/android/geo/map/presentation/AddressEditMapVO$ViewPort;LWZ/t;Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$Selector$Type;)V", "fromLocationButton", "onDefineCurrentLocationAction", "(Z)V", "onCleared", "", "resultCode", "onLocationEnabledResult", "(I)V", "checkUserLocationIncludedInViewport", "(Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$ViewPort;)Z", "Lru/ozon/app/android/mapcommon/map/model/CoordinateModel;", "location", "checkLocationIncludedInViewport", "(Lru/ozon/app/android/mapcommon/map/model/CoordinateModel;Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$ViewPort;)Z", "", "hintDelayMs", "startHintTimer", "(J)V", "startBannerTimer", "hideBanner", "initialState", "startClusterizationIfNeeded", "Landroid/content/Context;", "context", "Lkotlin/Function0;", "doOnComplete", "fetchGeoProviders", "(Landroid/content/Context;Lkotlin/jvm/functions/Function0;)V", "Lru/ozon/mapsdk/common/geoproxy/data/model/GeoProviderConfig;", "getGeoProviderConfig", "(Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$Selector$Type;)Lru/ozon/mapsdk/common/geoproxy/data/model/GeoProviderConfig;", "clearGeoProviderJob", "requestOnMapMove", "(Ljava/lang/String;Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$ViewPort;F)V", "requestOnPinClicked", "requestOnClusterClicked", "Lru/ozon/app/android/geo/map/data/AddressEditMapRequest;", "makeRequestParams", "(Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$ViewPort;F)Lru/ozon/app/android/geo/map/data/AddressEditMapRequest;", "transformLink", "(Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$Coordinate;)Ljava/lang/String;", "Lru/ozon/app/android/geo/map/presentation/viewmodel/AddressEditMapViewModel$Action;", "prevEvent", "currentEvent", "areItemsTheSame", "(Lru/ozon/app/android/geo/map/presentation/viewmodel/AddressEditMapViewModel$Action;Lru/ozon/app/android/geo/map/presentation/viewmodel/AddressEditMapViewModel$Action;)Z", "editMapVO", "defineAndMoveToUserLocation", "fetchAndMoveToLastLocation", "defineUserLocation", "Lru/ozon/app/android/geo/map/presentation/viewmodel/AddressEditMapViewModel$Action$MoveToLocation;", "it", "moveToUserLocation", "(Lru/ozon/app/android/geo/map/presentation/viewmodel/AddressEditMapViewModel$Action$MoveToLocation;)V", "moveToLocation", "point", "(Lru/ozon/app/android/mapcommon/map/model/CoordinateModel;)V", "", "error", "onErrorUserLocation", "(Ljava/lang/Throwable;)V", "checkLocationSettings", "updateGeolocationEnabled", "Lru/ozon/app/android/location/LocationRepository;", "Lru/ozon/app/android/location/AreaLocalStore;", "Lru/ozon/app/android/geo/map/presentation/viewmodel/AddressEditMapStateReducer;", "Lru/ozon/app/android/geoprovider/GeoProviderRepository;", "Lru/ozon/app/android/mapcommon/mapcommon/LastLocationRepository;", "Lru/ozon/app/android/geo/map/clusterization/ClusterizationLoadingService;", "Landroidx/lifecycle/V;", "Lru/ozon/app/android/geo/map/presentation/AddressEditMapVOWithPayloads;", "mapState", "Landroidx/lifecycle/V;", "getMapState", "()Landroidx/lifecycle/V;", "action", "getAction", "loader", "getLoader", "Lru/ozon/app/android/geo/map/presentation/viewmodel/AddressEditMapViewModel$BannerState;", "bannerState", "getBannerState", "Lnc/a;", "compositeDisposable", "Lnc/a;", "LL9/c;", "queryInput", "LL9/c;", "debounceValue", "J", "Lru/ozon/app/android/geo/map/data/CurrentLocation;", "lastLocation", "Lru/ozon/app/android/geo/map/data/CurrentLocation;", "initialLocationIsDefined", "Z", "Lxe/B0;", "hintJob", "Lxe/B0;", "bannerJob", "isGeoLocationEnabled", "clusterizationIsStarted", "getCurrentGeoProviderConfig", "()Lru/ozon/mapsdk/common/geoproxy/data/model/GeoProviderConfig;", "setCurrentGeoProviderConfig", "(Lru/ozon/mapsdk/common/geoproxy/data/model/GeoProviderConfig;)V", "currentGeoProviderConfig", "getContextLocationUid", "()Ljava/lang/String;", "setContextLocationUid", "(Ljava/lang/String;)V", "contextLocationUid", "getSessionId", "setSessionId", "sessionId", "Companion", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AddressEditMapViewModelImpl extends w0 implements AddressEditMapViewModel, AddressEditMapGeoProviderDelegate {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private final /* synthetic */ AddressEditMapGeoProviderDelegateImpl $$delegate_0;

    @NotNull
    private final V<AddressEditMapViewModel.Action> action;

    @NotNull
    private final AddressEditMapStateReducer addressEditMapStateReducer;

    @NotNull
    private final AreaLocalStore areaLocalStore;
    private B0 bannerJob;

    @NotNull
    private final V<AddressEditMapViewModel.BannerState> bannerState;
    private boolean clusterizationIsStarted;

    @NotNull
    private final ClusterizationLoadingService clusterizationLoadingService;

    @NotNull
    private final C8486a compositeDisposable;
    private long debounceValue;

    @NotNull
    private final GeoProviderRepository geoProviderRepository;
    private B0 hintJob;
    private boolean initialLocationIsDefined;
    private boolean isGeoLocationEnabled;
    private CurrentLocation lastLocation;

    @NotNull
    private final LastLocationRepository lastLocationRepository;

    @NotNull
    private final V<Boolean> loader;

    @NotNull
    private final LocationRepository locationRepository;

    @NotNull
    private final V<AddressEditMapVOWithPayloads> mapState;

    @NotNull
    private final c<AddressEditMapViewModel.Action> queryInput;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.geo.map.presentation.viewmodel.AddressEditMapViewModelImpl$1, reason: invalid class name */
    /* synthetic */ class AnonymousClass1 extends C7735q implements Function2<AddressEditMapViewModel.Action, AddressEditMapViewModel.Action, Boolean> {
        AnonymousClass1(Object obj) {
            super(2, obj, AddressEditMapViewModelImpl.class, "areItemsTheSame", "areItemsTheSame(Lru/ozon/app/android/geo/map/presentation/viewmodel/AddressEditMapViewModel$Action;Lru/ozon/app/android/geo/map/presentation/viewmodel/AddressEditMapViewModel$Action;)Z", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Boolean invoke(AddressEditMapViewModel.Action p02, AddressEditMapViewModel.Action p12) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            Intrinsics.checkNotNullParameter(p12, "p1");
            return Boolean.valueOf(((AddressEditMapViewModelImpl) this.receiver).areItemsTheSame(p02, p12));
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a&\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00000\u0000 \u0004*\u0012\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00030\u00032\u000b\u0010\u0002\u001a\u00070\u0000¢\u0006\u0002\b\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lru/ozon/app/android/geo/map/presentation/viewmodel/AddressEditMapViewModel$Action;", "Lkotlin/jvm/internal/EnhancedNullability;", "action", "Lio/reactivex/u;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/geo/map/presentation/viewmodel/AddressEditMapViewModel$Action;)Lio/reactivex/u;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.geo.map.presentation.viewmodel.AddressEditMapViewModelImpl$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function1<AddressEditMapViewModel.Action, u<AddressEditMapViewModel.Action>> {
        AnonymousClass2() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final u<AddressEditMapViewModel.Action> invoke(AddressEditMapViewModel.Action action) {
            Intrinsics.checkNotNullParameter(action, "action");
            return p.just(action).delay(AddressEditMapViewModelImpl.this.debounceValue, TimeUnit.MILLISECONDS);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/geo/map/presentation/viewmodel/AddressEditMapViewModel$Action;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/geo/map/presentation/viewmodel/AddressEditMapViewModel$Action;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.geo.map.presentation.viewmodel.AddressEditMapViewModelImpl$3, reason: invalid class name */
    static final class AnonymousClass3 extends AbstractC7737t implements Function1<AddressEditMapViewModel.Action, Unit> {
        AnonymousClass3() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(AddressEditMapViewModel.Action action) {
            invoke2(action);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(AddressEditMapViewModel.Action action) {
            AddressEditMapViewModelImpl.this.getAction().setValue(action);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.geo.map.presentation.viewmodel.AddressEditMapViewModelImpl$4, reason: invalid class name */
    /* synthetic */ class AnonymousClass4 extends C7735q implements Function1<Throwable, Unit> {
        AnonymousClass4(Object obj) {
            super(1, obj, a.b.class, "e", "e(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            invoke2(th2);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th2) {
            ((a.b) this.receiver).e(th2);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lru/ozon/app/android/geo/map/presentation/viewmodel/AddressEditMapViewModelImpl$Companion;", "", "<init>", "()V", "DEFAULT_TIMEOUT", "", "DECREASE_ZOOM_VALUE", "", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public AddressEditMapViewModelImpl(@NotNull LocationRepository locationRepository, @NotNull AreaLocalStore areaLocalStore, @NotNull AddressEditMapStateReducer addressEditMapStateReducer, @NotNull GeoProviderRepository geoProviderRepository, @NotNull LastLocationRepository lastLocationRepository, @NotNull ClusterizationLoadingService clusterizationLoadingService) {
        Intrinsics.checkNotNullParameter(locationRepository, "locationRepository");
        Intrinsics.checkNotNullParameter(areaLocalStore, "areaLocalStore");
        Intrinsics.checkNotNullParameter(addressEditMapStateReducer, "addressEditMapStateReducer");
        Intrinsics.checkNotNullParameter(geoProviderRepository, "geoProviderRepository");
        Intrinsics.checkNotNullParameter(lastLocationRepository, "lastLocationRepository");
        Intrinsics.checkNotNullParameter(clusterizationLoadingService, "clusterizationLoadingService");
        this.$$delegate_0 = new AddressEditMapGeoProviderDelegateImpl(areaLocalStore, geoProviderRepository);
        this.locationRepository = locationRepository;
        this.areaLocalStore = areaLocalStore;
        this.addressEditMapStateReducer = addressEditMapStateReducer;
        this.geoProviderRepository = geoProviderRepository;
        this.lastLocationRepository = lastLocationRepository;
        this.clusterizationLoadingService = clusterizationLoadingService;
        this.mapState = new V<>();
        this.action = new V<>();
        this.loader = new V<>();
        this.bannerState = new V<>(AddressEditMapViewModel.BannerState.SHOW_BANNER);
        C8486a c8486a = new C8486a();
        this.compositeDisposable = c8486a;
        c<AddressEditMapViewModel.Action> c11 = c.c();
        Intrinsics.checkNotNullExpressionValue(c11, "create(...)");
        this.queryInput = c11;
        int i11 = 1;
        InterfaceC8487b subscribe = c11.distinctUntilChanged(new b(new AnonymousClass1(this))).debounce(new h(new AnonymousClass2(), i11)).observeOn(C8125a.a()).subscribe(new GH.a(new AnonymousClass3(), i11), new i(new AnonymousClass4(a.f17149a), 3));
        Intrinsics.checkNotNullExpressionValue(subscribe, "subscribe(...)");
        RxExtKt.plusAssign(c8486a, subscribe);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _init_$lambda$0(Function2 function2, Object p02, Object p12) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        Intrinsics.checkNotNullParameter(p12, "p1");
        return ((Boolean) function2.invoke(p02, p12)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u _init_$lambda$1(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return (u) function1.invoke(p02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean areItemsTheSame(AddressEditMapViewModel.Action prevEvent, AddressEditMapViewModel.Action currentEvent) {
        if (currentEvent.getForce()) {
            return false;
        }
        return Intrinsics.d(prevEvent, currentEvent);
    }

    private final void checkLocationSettings() {
        C8486a c8486a = this.compositeDisposable;
        l lVar = new l(this.locationRepository.checkLocationSettings().k(Mc.a.b()), C8125a.a());
        y requestSingleLocation$default = LocationRepository.DefaultImpls.requestSingleLocation$default(this.locationRepository, false, 1, null);
        C9656b.c(requestSingleLocation$default, "next is null");
        InterfaceC8487b h11 = new r(new Bc.c(requestSingleLocation$default, lVar), new e(AddressEditMapViewModelImpl$checkLocationSettings$1.INSTANCE, 2)).h(new f(new AddressEditMapViewModelImpl$checkLocationSettings$2(this), 2), new g(new AddressEditMapViewModelImpl$checkLocationSettings$3(this), 1));
        Intrinsics.checkNotNullExpressionValue(h11, "subscribe(...)");
        RxExtKt.plusAssign(c8486a, h11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AddressEditMapViewModel.Action.MoveToLocation checkLocationSettings$lambda$14(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return (AddressEditMapViewModel.Action.MoveToLocation) function1.invoke(p02);
    }

    private final void defineAndMoveToUserLocation(AddressEditMapVO editMapVO) {
        updateGeolocationEnabled();
        if (this.locationRepository.hasLocationPermission()) {
            fetchAndMoveToLastLocation(editMapVO);
        } else {
            getAction().setValue(AddressEditMapViewModel.Action.RequestLocationPermission.INSTANCE);
        }
    }

    static /* synthetic */ void defineAndMoveToUserLocation$default(AddressEditMapViewModelImpl addressEditMapViewModelImpl, AddressEditMapVO addressEditMapVO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            addressEditMapVO = null;
        }
        addressEditMapViewModelImpl.defineAndMoveToUserLocation(addressEditMapVO);
    }

    private final void defineUserLocation(AddressEditMapVO page) {
        updateGeolocationEnabled();
        if (!this.isGeoLocationEnabled) {
            getAction().setValue(AddressEditMapViewModel.Action.RequestLocationPermission.INSTANCE);
            return;
        }
        C8486a c8486a = this.compositeDisposable;
        InterfaceC8487b h11 = new r(LocationRepository.DefaultImpls.getLastLocation$default(this.locationRepository, false, 1, null).j(Mc.a.b()), new GH.b(AddressEditMapViewModelImpl$defineUserLocation$1.INSTANCE, 1)).h(new C3065c(new AddressEditMapViewModelImpl$defineUserLocation$2(this, page), 1), new Gy.a(new AddressEditMapViewModelImpl$defineUserLocation$3(this), 0));
        Intrinsics.checkNotNullExpressionValue(h11, "subscribe(...)");
        RxExtKt.plusAssign(c8486a, h11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CoordinateModel defineUserLocation$lambda$11(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return (CoordinateModel) function1.invoke(p02);
    }

    private final void fetchAndMoveToLastLocation(AddressEditMapVO editMapVO) {
        C8486a c8486a = this.compositeDisposable;
        InterfaceC8487b h11 = new j(new r(new j(LocationRepository.DefaultImpls.getLastLocation$default(this.locationRepository, false, 1, null).j(Mc.a.b()).g(C8125a.a()), new Gy.b(new AddressEditMapViewModelImpl$fetchAndMoveToLastLocation$1(this), 0)), new Gy.c(new AddressEditMapViewModelImpl$fetchAndMoveToLastLocation$2(editMapVO), 0)), new BO.b(new AddressEditMapViewModelImpl$fetchAndMoveToLastLocation$3(this), 2)).h(new DM.c(new AddressEditMapViewModelImpl$fetchAndMoveToLastLocation$4(getAction()), 1), new Fw.b(new AddressEditMapViewModelImpl$fetchAndMoveToLastLocation$5(this), 1));
        Intrinsics.checkNotNullExpressionValue(h11, "subscribe(...)");
        RxExtKt.plusAssign(c8486a, h11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AddressEditMapViewModel.Action.MoveToLocation fetchAndMoveToLastLocation$lambda$7(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return (AddressEditMapViewModel.Action.MoveToLocation) function1.invoke(p02);
    }

    private final AddressEditMapRequest makeRequestParams(AddressEditMapVO.ViewPort viewport, float zoom) {
        updateGeolocationEnabled();
        return new AddressEditMapRequest(new MapRequest(viewport, Float.valueOf(zoom - 1.0f), Boolean.valueOf(this.isGeoLocationEnabled), false, 8, null), this.lastLocation);
    }

    private final void moveToLocation(AddressEditMapViewModel.Action.MoveToLocation it) {
        String transformLink = transformLink(AddressEditMapMapperKt.toVO(it.getPoint()));
        if (transformLink == null) {
            return;
        }
        updateGeolocationEnabled();
        c<AddressEditMapViewModel.Action> cVar = this.queryInput;
        AddressEditMapVO editMapVO = it.getEditMapVO();
        cVar.accept(new AddressEditMapViewModel.Action.MapMove(transformLink, new AddressEditMapRequest(new MapRequest(editMapVO != null ? editMapVO.getViewPort() : null, null, Boolean.valueOf(this.isGeoLocationEnabled), true, 2, null), this.lastLocation), Boolean.TRUE, true));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void moveToUserLocation(AddressEditMapViewModel.Action.MoveToLocation it) {
        defineUserLocation(it.getPoint());
        moveToLocation(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onErrorUserLocation(Throwable error) {
        if (error instanceof NoPermissionException) {
            getAction().postValue(AddressEditMapViewModel.Action.RequestLocationPermission.INSTANCE);
        } else if (error instanceof NoLastLocationException) {
            checkLocationSettings();
        }
    }

    private final void requestOnClusterClicked(String url, AddressEditMapVO.ViewPort viewport, float zoom, t tokenizedEvent) {
        if (kotlin.text.h.K(url)) {
            return;
        }
        this.queryInput.accept(new AddressEditMapViewModel.Action.ClusterClicked(url, makeRequestParams(viewport, zoom), tokenizedEvent));
    }

    private final void requestOnMapMove(String url, AddressEditMapVO.ViewPort viewport, float zoom) {
        if (kotlin.text.h.K(url)) {
            return;
        }
        this.queryInput.accept(new AddressEditMapViewModel.Action.MapMove(url, makeRequestParams(viewport, zoom), null, false, 12, null));
    }

    private final void requestOnPinClicked(String url, AddressEditMapVO.ViewPort viewport, float zoom, t tokenizedEvent) {
        if (kotlin.text.h.K(url)) {
            return;
        }
        this.queryInput.accept(new AddressEditMapViewModel.Action.PinClicked(url, makeRequestParams(viewport, zoom), tokenizedEvent));
    }

    private final String transformLink(AddressEditMapVO.Coordinate center) {
        AddressEditMapVO page;
        String linkTplDragCenter;
        AddressEditMapVOWithPayloads value = getMapState().getValue();
        if (value == null || (page = value.getPage()) == null || (linkTplDragCenter = page.getLinkTplDragCenter()) == null) {
            return null;
        }
        return StringExtKt.replace(linkTplDragCenter, new Pair("__lat__", String.valueOf(center.getLatitude())), new Pair("__lng__", String.valueOf(center.getLongitude())));
    }

    private final void updateGeolocationEnabled() {
        this.isGeoLocationEnabled = this.locationRepository.hasLocationPermission() && this.locationRepository.isLocationEnabled();
    }

    @Override // ru.ozon.app.android.geo.map.presentation.viewmodel.AddressEditMapViewModel
    public void bind(@NotNull AddressEditMapVO page, boolean isFirstInit) {
        Integer debounceDelay;
        Intrinsics.checkNotNullParameter(page, "page");
        AddressEditMapVO.MetaInfo metaInfo = page.getMetaInfo();
        this.debounceValue = (metaInfo == null || (debounceDelay = metaInfo.getDebounceDelay()) == null) ? 300L : debounceDelay.intValue();
        AddressEditMapStateReducer addressEditMapStateReducer = this.addressEditMapStateReducer;
        AddressEditMapVOWithPayloads value = getMapState().getValue();
        getMapState().postValue(new AddressEditMapVOWithPayloads(page, addressEditMapStateReducer.reduceToPayloads(value != null ? value.getPage() : null, page, isFirstInit)));
    }

    public boolean checkLocationIncludedInViewport(@NotNull CoordinateModel location, @NotNull AddressEditMapVO.ViewPort viewport) {
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(viewport, "viewport");
        return location.getLatitude() >= viewport.getLeftBottom().getLatitude() && location.getLatitude() <= viewport.getRightTop().getLatitude() && location.getLongitude() >= viewport.getLeftBottom().getLongitude() && location.getLongitude() <= viewport.getRightTop().getLongitude();
    }

    @Override // ru.ozon.app.android.geo.map.presentation.viewmodel.AddressEditMapViewModel
    public boolean checkUserLocationIncludedInViewport(@NotNull AddressEditMapVO.ViewPort viewport) {
        CoordinateModel point;
        Intrinsics.checkNotNullParameter(viewport, "viewport");
        CurrentLocation currentLocation = this.lastLocation;
        if (currentLocation == null || (point = AddressEditMapRequestKt.toPoint(currentLocation)) == null) {
            return false;
        }
        return checkLocationIncludedInViewport(point, viewport);
    }

    public void clearGeoProviderJob() {
        this.$$delegate_0.clearGeoProviderJob();
    }

    @Override // ru.ozon.app.android.geo.map.presentation.viewmodel.AddressEditMapViewModel
    public void defineLocationIfNeeded(@NotNull AddressEditMapVO page) {
        Intrinsics.checkNotNullParameter(page, "page");
        showUserCurrentLocationPin(page);
        if (!page.getGeolocationOnInit() || this.initialLocationIsDefined) {
            return;
        }
        this.initialLocationIsDefined = true;
    }

    @Override // ru.ozon.app.android.geo.map.presentation.viewmodel.AddressEditMapViewModel
    public void defineLocationIfPermissionChanged() {
        if (this.initialLocationIsDefined && this.isGeoLocationEnabled != this.locationRepository.hasLocationPermission() && this.locationRepository.isLocationEnabled()) {
            updateGeolocationEnabled();
            if (this.isGeoLocationEnabled) {
                defineAndMoveToUserLocation$default(this, null, 1, null);
            }
        }
    }

    public void fetchGeoProviders(@NotNull Context context, @NotNull Function0<Unit> doOnComplete) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(doOnComplete, "doOnComplete");
        this.$$delegate_0.fetchGeoProviders(context, doOnComplete);
    }

    @Override // ru.ozon.app.android.geo.map.presentation.utils.AddressEditMapGeoProviderDelegate
    public String getContextLocationUid() {
        return this.$$delegate_0.getContextLocationUid();
    }

    @Override // ru.ozon.app.android.geo.map.presentation.utils.AddressEditMapGeoProviderDelegate
    public GeoProviderConfig getCurrentGeoProviderConfig() {
        return this.$$delegate_0.getCurrentGeoProviderConfig();
    }

    @Override // ru.ozon.app.android.geo.map.presentation.utils.AddressEditMapGeoProviderDelegate
    public GeoProviderConfig getGeoProviderConfig(@NotNull AddressEditMapDTO.Selector.Type type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return this.$$delegate_0.getGeoProviderConfig(type);
    }

    @Override // ru.ozon.app.android.geo.map.presentation.utils.AddressEditMapGeoProviderDelegate
    @NotNull
    public String getSessionId() {
        return this.$$delegate_0.getSessionId();
    }

    @Override // ru.ozon.app.android.geo.map.presentation.viewmodel.AddressEditMapViewModel
    public void hideBanner() {
        B0 b02 = this.hintJob;
        if (b02 != null) {
            b02.j(null);
        }
        B0 b03 = this.bannerJob;
        if (b03 != null) {
            b03.j(null);
        }
        getBannerState().setValue(AddressEditMapViewModel.BannerState.HIDE_BANNER);
    }

    @Override // ru.ozon.app.android.geo.map.presentation.viewmodel.AddressEditMapViewModel
    public void onBackPressed() {
        getAction().postValue(AddressEditMapViewModel.Action.Back.INSTANCE);
    }

    @Override // ru.ozon.app.android.geo.map.presentation.viewmodel.AddressEditMapViewModel
    public void onCameraEndMoveAction(@NotNull AddressEditMapVO.Coordinate center, AddressEditMapVO.ViewPort viewport, float zoom) {
        Intrinsics.checkNotNullParameter(center, "center");
        String transformLink = transformLink(center);
        if (transformLink == null) {
            return;
        }
        requestOnMapMove(transformLink, viewport, zoom);
    }

    @Override // ru.ozon.app.android.geo.map.presentation.viewmodel.AddressEditMapViewModel
    public void onCameraStartMoveAction() {
        this.queryInput.accept(AddressEditMapViewModel.Action.StartCameraMoving.INSTANCE);
    }

    @Override // androidx.lifecycle.w0
    protected void onCleared() {
        super.onCleared();
        this.clusterizationLoadingService.clear();
        this.compositeDisposable.d();
        clearGeoProviderJob();
    }

    @Override // ru.ozon.app.android.geo.map.presentation.viewmodel.AddressEditMapViewModel
    public void onClusterClickedAction(String link, AddressEditMapVO.ViewPort viewport, float zoom, t tokenizedEvent) {
        if (link == null) {
            return;
        }
        requestOnClusterClicked(link, viewport, zoom, tokenizedEvent);
    }

    @Override // ru.ozon.app.android.geo.map.presentation.viewmodel.AddressEditMapViewModel
    public void onDefineCurrentLocationAction(boolean fromLocationButton) {
        if (fromLocationButton) {
            this.locationRepository.disableMockLocation();
            hideBanner();
        }
        defineAndMoveToUserLocation$default(this, null, 1, null);
        getAction().setValue(AddressEditMapViewModel.Action.HidePvzSheet.INSTANCE);
    }

    @Override // ru.ozon.app.android.geo.map.presentation.viewmodel.AddressEditMapViewModel
    public void onLocationEnabledResult(int resultCode) {
        if (resultCode == -1) {
            defineAndMoveToUserLocation$default(this, null, 1, null);
        }
    }

    @Override // ru.ozon.app.android.geo.map.presentation.viewmodel.AddressEditMapViewModel
    public void onPinClickedAction(String link, float zoom, AddressEditMapVO.ViewPort viewport, t tokenizedEvent) {
        hideBanner();
        if (link == null) {
            return;
        }
        requestOnPinClicked(link, viewport, zoom, tokenizedEvent);
    }

    @Override // ru.ozon.app.android.geo.map.presentation.viewmodel.AddressEditMapViewModel
    public void onSelectPinFromBannerAction(@NotNull String url, float zoom, AddressEditMapVO.ViewPort viewport, t tokenizedEvent) {
        Intrinsics.checkNotNullParameter(url, "url");
        hideBanner();
        requestOnPinClicked(url, viewport, zoom, tokenizedEvent);
    }

    @Override // ru.ozon.app.android.geo.map.presentation.viewmodel.AddressEditMapViewModel
    public void onSelectorButtonPressed(@NotNull String url, float zoom, AddressEditMapVO.ViewPort viewport, t tokenizedEvent, @NotNull AddressEditMapDTO.Selector.Type type) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(type, "type");
        getLoader().postValue(Boolean.TRUE);
        this.queryInput.accept(new AddressEditMapViewModel.Action.SelectorClicked(url, makeRequestParams(viewport, zoom), tokenizedEvent, type));
    }

    @Override // ru.ozon.app.android.geo.map.presentation.utils.AddressEditMapGeoProviderDelegate
    public void setContextLocationUid(String str) {
        this.$$delegate_0.setContextLocationUid(str);
    }

    public void showUserCurrentLocationPin(@NotNull AddressEditMapVO page) {
        Intrinsics.checkNotNullParameter(page, "page");
        if (this.locationRepository.isNeedUseMockLocation()) {
            return;
        }
        if (this.lastLocation == null) {
            defineUserLocation(page);
            return;
        }
        V<AddressEditMapViewModel.Action> action = getAction();
        AddressEditMapVO.LocationMarker userLocationMarker = page.getUserLocationMarker();
        if (userLocationMarker == null) {
            return;
        }
        action.setValue(new AddressEditMapViewModel.Action.ShowUserCurrentLocationPin(userLocationMarker));
    }

    @Override // ru.ozon.app.android.geo.map.presentation.viewmodel.AddressEditMapViewModel
    public void startBannerTimer() {
        this.bannerJob = C10727i.c(x0.a(this), null, null, new AddressEditMapViewModelImpl$startBannerTimer$1(this, null), 3);
    }

    public void startClusterizationIfNeeded(boolean initialState) {
        if (this.clusterizationIsStarted) {
            return;
        }
        this.clusterizationIsStarted = true;
        this.clusterizationLoadingService.loadPins();
        this.queryInput.accept(AddressEditMapViewModel.Action.PrepareToClusterization.INSTANCE);
    }

    @Override // ru.ozon.app.android.geo.map.presentation.viewmodel.AddressEditMapViewModel
    public void startHintTimer(long hintDelayMs) {
        this.hintJob = C10727i.c(x0.a(this), null, null, new AddressEditMapViewModelImpl$startHintTimer$1(hintDelayMs, this, null), 3);
    }

    @Override // ru.ozon.app.android.geo.map.presentation.viewmodel.AddressEditMapViewModel
    @NotNull
    public V<AddressEditMapViewModel.Action> getAction() {
        return this.action;
    }

    @Override // ru.ozon.app.android.geo.map.presentation.viewmodel.AddressEditMapViewModel
    @NotNull
    public V<AddressEditMapViewModel.BannerState> getBannerState() {
        return this.bannerState;
    }

    @Override // ru.ozon.app.android.geo.map.presentation.viewmodel.AddressEditMapViewModel
    @NotNull
    public V<Boolean> getLoader() {
        return this.loader;
    }

    @Override // ru.ozon.app.android.geo.map.presentation.viewmodel.AddressEditMapViewModel
    @NotNull
    public V<AddressEditMapVOWithPayloads> getMapState() {
        return this.mapState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void defineUserLocation(CoordinateModel point) {
        this.lastLocation = new CurrentLocation(point.getLatitude(), point.getLongitude());
    }
}
