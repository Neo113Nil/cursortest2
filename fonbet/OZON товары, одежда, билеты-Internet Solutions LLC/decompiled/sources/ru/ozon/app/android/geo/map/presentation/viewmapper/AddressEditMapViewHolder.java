package ru.ozon.app.android.geo.map.presentation.viewmapper;

import A00.a;
import Ae.C2399j;
import Ae.C2408n0;
import Ae.InterfaceC2395h;
import Fy.C3065c;
import Sc.o;
import Sc.s;
import Vg.d;
import W10.c;
import WZ.t;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.C;
import androidx.fragment.app.r;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5427n;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import androidx.lifecycle.W;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import d20.AbstractC6065b;
import io.reactivex.AbstractC7094b;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import l10.i;
import nc.InterfaceC8487b;
import org.jetbrains.annotations.NotNull;
import qc.InterfaceC9019a;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.extensions.TraceApiKt;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.composer.universalscreen.view.ComposerFragment;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.delivery.customActionsHandlers.updateSelectedMapTab.UpdateSelectedMapTabEvent;
import ru.ozon.app.android.geo.common.AnalyticsExtensionsKt;
import ru.ozon.app.android.geo.map.DetailsSheetManager;
import ru.ozon.app.android.geo.map.clusterization.ClusterizationLoadingService;
import ru.ozon.app.android.geo.map.clusterization.MapClusterizationProvider;
import ru.ozon.app.android.geo.map.clusterization.PinsState;
import ru.ozon.app.android.geo.map.data.AddressEditMapDTO;
import ru.ozon.app.android.geo.map.data.AddressEditMapRequest;
import ru.ozon.app.android.geo.map.data.AddressEditMapRequestKt;
import ru.ozon.app.android.geo.map.data.GeoConfigData;
import ru.ozon.app.android.geo.map.performance.MapPerformanceAnalyticsManager;
import ru.ozon.app.android.geo.map.performance.MapPerformanceAnalyticsSender;
import ru.ozon.app.android.geo.map.presentation.AddressEditMapVO;
import ru.ozon.app.android.geo.map.presentation.AddressEditMapVOWithPayloads;
import ru.ozon.app.android.geo.map.presentation.viewmapper.AddressEditMapViewHolder;
import ru.ozon.app.android.geo.map.presentation.viewmodel.AddressEditMapState;
import ru.ozon.app.android.geo.map.presentation.viewmodel.AddressEditMapViewModel;
import ru.ozon.app.android.mapcommon.map.OzonMapController;
import ru.ozon.app.android.mapcommon.map.model.CameraPositionModel;
import ru.ozon.app.android.mapcommon.map.provider.map.OzonMapProvider;
import ru.ozon.app.android.mapcommon.mapcommon.MapUpdateManager;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.abtool.FeatureService;
import ru.ozon.app.android.utils.WhenExtKt;
import ru.ozon.app.android.yandexsearchsheet.ShowYandexSearchSheetAction;
import ru.ozon.app.android.yandexsearchsheet.YandexSearchSheetFragment;
import ru.ozon.app.android.yandexsearchsheet.YandexSearchSheetSharedViewModel;
import ru.ozon.mapsdk.common.geoproxy.data.model.GeoProviderConfig;
import ru.ozon.mapsdk.common.geoproxy.model.PreferredProvider;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.B0;

@Metadata(d1 = {"\u0000\u0080\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0004°\u0001¿\u0001\b\u0000\u0018\u0000 Æ\u00012\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002Æ\u0001B{\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\u0010\r\u001a\u00060\u000bj\u0002`\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020#2\u0006\u0010\"\u001a\u00020\u0002H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020#H\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020#H\u0016¢\u0006\u0004\b(\u0010'J\u000f\u0010)\u001a\u00020#H\u0016¢\u0006\u0004\b)\u0010'J\r\u0010*\u001a\u00020#¢\u0006\u0004\b*\u0010'J\u000f\u0010+\u001a\u00020#H\u0002¢\u0006\u0004\b+\u0010'J\u000f\u0010,\u001a\u00020#H\u0002¢\u0006\u0004\b,\u0010'J\u000f\u0010-\u001a\u00020#H\u0002¢\u0006\u0004\b-\u0010'J\u0019\u00100\u001a\u00020#2\b\u0010/\u001a\u0004\u0018\u00010.H\u0002¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020#H\u0002¢\u0006\u0004\b2\u0010'J\u0017\u00105\u001a\u00020#2\u0006\u00104\u001a\u000203H\u0002¢\u0006\u0004\b5\u00106J\u0017\u00108\u001a\u00020#2\u0006\u00107\u001a\u00020\u001eH\u0002¢\u0006\u0004\b8\u00109J\u0017\u0010<\u001a\u00020#2\u0006\u0010;\u001a\u00020:H\u0002¢\u0006\u0004\b<\u0010=J\u0017\u0010@\u001a\u00020#2\u0006\u0010?\u001a\u00020>H\u0002¢\u0006\u0004\b@\u0010AJ\u0017\u0010B\u001a\u00020#2\u0006\u0010?\u001a\u00020>H\u0002¢\u0006\u0004\bB\u0010AJ\u0017\u0010E\u001a\u00020#2\u0006\u0010D\u001a\u00020CH\u0002¢\u0006\u0004\bE\u0010FJ\u0017\u0010I\u001a\u00020#2\u0006\u0010H\u001a\u00020GH\u0002¢\u0006\u0004\bI\u0010JJ\u0017\u0010L\u001a\u00020#2\u0006\u0010D\u001a\u00020KH\u0002¢\u0006\u0004\bL\u0010MJ\u0017\u0010P\u001a\u00020#2\u0006\u0010O\u001a\u00020NH\u0002¢\u0006\u0004\bP\u0010QJ\u000f\u0010R\u001a\u00020#H\u0002¢\u0006\u0004\bR\u0010'J\u0017\u0010T\u001a\u00020#2\u0006\u00104\u001a\u00020SH\u0002¢\u0006\u0004\bT\u0010UJ\u0017\u0010W\u001a\u00020#2\u0006\u00104\u001a\u00020VH\u0002¢\u0006\u0004\bW\u0010XJ\u0017\u0010Z\u001a\u00020#2\u0006\u00104\u001a\u00020YH\u0002¢\u0006\u0004\bZ\u0010[J\u0017\u0010]\u001a\u00020#2\u0006\u00104\u001a\u00020\\H\u0002¢\u0006\u0004\b]\u0010^JK\u0010f\u001a\u00020#2\u0006\u0010`\u001a\u00020_2(\b\u0002\u0010d\u001a\"\u0012\u0004\u0012\u00020_\u0012\u0004\u0012\u00020b\u0018\u00010aj\u0010\u0012\u0004\u0012\u00020_\u0012\u0004\u0012\u00020b\u0018\u0001`c2\b\b\u0002\u0010e\u001a\u00020\u001eH\u0002¢\u0006\u0004\bf\u0010gJ\u0017\u0010i\u001a\u00020#2\u0006\u00104\u001a\u00020hH\u0002¢\u0006\u0004\bi\u0010jJ\u0017\u0010k\u001a\u00020#2\u0006\u0010`\u001a\u00020_H\u0002¢\u0006\u0004\bk\u0010lJ\u000f\u0010m\u001a\u00020#H\u0002¢\u0006\u0004\bm\u0010'J\u0017\u0010o\u001a\u00020#2\u0006\u00104\u001a\u00020nH\u0002¢\u0006\u0004\bo\u0010pJ\u0017\u0010r\u001a\u00020#2\u0006\u0010q\u001a\u00020\u0002H\u0002¢\u0006\u0004\br\u0010%J\u0017\u0010t\u001a\u00020#2\u0006\u00104\u001a\u00020sH\u0002¢\u0006\u0004\bt\u0010uJ\u000f\u0010v\u001a\u00020#H\u0002¢\u0006\u0004\bv\u0010'J\u0017\u0010x\u001a\u00020#2\u0006\u00104\u001a\u00020wH\u0002¢\u0006\u0004\bx\u0010yJ\u000f\u0010z\u001a\u00020#H\u0002¢\u0006\u0004\bz\u0010'J\u0017\u0010|\u001a\u00020#2\u0006\u0010D\u001a\u00020{H\u0002¢\u0006\u0004\b|\u0010}J\u0018\u0010\u007f\u001a\u00020#2\u0006\u0010D\u001a\u00020~H\u0002¢\u0006\u0005\b\u007f\u0010\u0080\u0001J\u001c\u0010\u0083\u0001\u001a\u00020#2\b\u0010\u0082\u0001\u001a\u00030\u0081\u0001H\u0002¢\u0006\u0006\b\u0083\u0001\u0010\u0084\u0001J'\u0010\u0088\u0001\u001a\u00020#2\n\u0010\u0086\u0001\u001a\u0005\u0018\u00010\u0085\u00012\u0007\u0010\u0087\u0001\u001a\u00020\u001eH\u0002¢\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001J\u001b\u0010\u008a\u0001\u001a\u00020#2\u0007\u0010\"\u001a\u00030\u0085\u0001H\u0002¢\u0006\u0006\b\u008a\u0001\u0010\u008b\u0001J\u001b\u0010\u008c\u0001\u001a\u00020#2\u0007\u0010\"\u001a\u00030\u0085\u0001H\u0002¢\u0006\u0006\b\u008c\u0001\u0010\u008b\u0001J\u0013\u0010\u008e\u0001\u001a\u00030\u008d\u0001H\u0002¢\u0006\u0006\b\u008e\u0001\u0010\u008f\u0001J\u0013\u0010\u0091\u0001\u001a\u00030\u0090\u0001H\u0002¢\u0006\u0006\b\u0091\u0001\u0010\u0092\u0001J\u0011\u0010\u0093\u0001\u001a\u00020#H\u0002¢\u0006\u0005\b\u0093\u0001\u0010'R\u0015\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0004\u0010\u0094\u0001R\u0015\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0006\u0010\u0095\u0001R\u0015\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\b\u0010\u0096\u0001R\u0015\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\n\u0010\u0097\u0001R\u0019\u0010\r\u001a\u00060\u000bj\u0002`\f8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\r\u0010\u0098\u0001R\u0015\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u000f\u0010\u0099\u0001R\u0015\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0011\u0010\u009a\u0001R3\u0010/\u001a\u0004\u0018\u00010.2\t\u0010\u009b\u0001\u001a\u0004\u0018\u00010.8\u0006@FX\u0086\u000e¢\u0006\u0016\n\u0005\b/\u0010\u009c\u0001\u001a\u0006\b\u009d\u0001\u0010\u009e\u0001\"\u0005\b\u009f\u0001\u00101R\u001c\u0010¡\u0001\u001a\u0005\u0018\u00010 \u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¡\u0001\u0010¢\u0001R\u0019\u0010£\u0001\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b£\u0001\u0010¤\u0001R\"\u00105\u001a\u000f\u0012\u0004\u0012\u00020n\u0012\u0004\u0012\u00020#0¥\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b5\u0010¦\u0001R\u0018\u0010¨\u0001\u001a\u00030§\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¨\u0001\u0010©\u0001R\u0018\u0010«\u0001\u001a\u00030ª\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b«\u0001\u0010¬\u0001R\u0018\u0010®\u0001\u001a\u00030\u00ad\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b®\u0001\u0010¯\u0001R\u0018\u0010±\u0001\u001a\u00030°\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b±\u0001\u0010²\u0001R\u001e\u0010´\u0001\u001a\t\u0012\u0004\u0012\u00020N0³\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b´\u0001\u0010µ\u0001R\u001e\u0010¶\u0001\u001a\t\u0012\u0004\u0012\u0002030³\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¶\u0001\u0010µ\u0001R\u001e\u0010·\u0001\u001a\t\u0012\u0004\u0012\u00020\u001e0³\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b·\u0001\u0010µ\u0001R\u001e\u0010¸\u0001\u001a\t\u0012\u0004\u0012\u00020:0³\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¸\u0001\u0010µ\u0001R\u001e\u0010¹\u0001\u001a\t\u0012\u0004\u0012\u00020C0³\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¹\u0001\u0010µ\u0001R\u0019\u0010º\u0001\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bº\u0001\u0010¤\u0001R\u001c\u0010¼\u0001\u001a\u0005\u0018\u00010»\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¼\u0001\u0010½\u0001R\u001c\u0010\u0086\u0001\u001a\u0005\u0018\u00010\u0085\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0086\u0001\u0010¾\u0001R\u0018\u0010À\u0001\u001a\u00030¿\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÀ\u0001\u0010Á\u0001R\u0018\u0010Å\u0001\u001a\u00030Â\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bÃ\u0001\u0010Ä\u0001¨\u0006Ç\u0001"}, d2 = {"Lru/ozon/app/android/geo/map/presentation/viewmapper/AddressEditMapViewHolder;", "Ld20/b;", "Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO;", "Ll10/i;", "container", "Lru/ozon/app/android/geo/map/presentation/viewmodel/AddressEditMapViewModel;", "viewModel", "Lru/ozon/app/android/yandexsearchsheet/YandexSearchSheetSharedViewModel;", "yandexSearchSheetSharedViewModel", "Lru/ozon/app/android/composer/ComposerNavigator;", "navigator", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "Lru/ozon/app/android/mapcommon/mapcommon/MapUpdateManager;", "mapUpdateManager", "Lru/ozon/app/android/geo/map/clusterization/ClusterizationLoadingService;", "clusterizationLoadingService", "Lru/ozon/app/android/geo/map/performance/MapPerformanceAnalyticsSender;", "mapPerformanceAnalyticsSender", "Lru/ozon/app/android/geo/map/DetailsSheetManager;", "detailsSheetManager", "Lru/ozon/app/android/mapcommon/map/provider/map/OzonMapProvider;", "ozonMapProvider", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "Lru/ozon/app/android/network/abtool/FeatureService;", "featureService", "LBZ/e;", "miniAppConfigHolder", "", "isSelectApp", "<init>", "(Ll10/i;Lru/ozon/app/android/geo/map/presentation/viewmodel/AddressEditMapViewModel;Lru/ozon/app/android/yandexsearchsheet/YandexSearchSheetSharedViewModel;Lru/ozon/app/android/composer/ComposerNavigator;LVg/d;Lru/ozon/app/android/mapcommon/mapcommon/MapUpdateManager;Lru/ozon/app/android/geo/map/clusterization/ClusterizationLoadingService;Lru/ozon/app/android/geo/map/performance/MapPerformanceAnalyticsSender;Lru/ozon/app/android/geo/map/DetailsSheetManager;Lru/ozon/app/android/mapcommon/map/provider/map/OzonMapProvider;Lru/ozon/app/android/network/abtool/FeatureChecker;Lru/ozon/app/android/network/abtool/FeatureService;LBZ/e;Z)V", "item", "", "bind", "(Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO;)V", "onWidgetCreated", "()V", "onWidgetDestroyed", "onRefresh", "prepareToClusterization", "onStart", "observeClusterization", "setView", "Lru/ozon/app/android/geo/map/data/GeoConfigData;", "configData", "initMap", "(Lru/ozon/app/android/geo/map/data/GeoConfigData;)V", "dispose", "Lru/ozon/app/android/geo/map/presentation/viewmodel/AddressEditMapViewModel$Action;", "action", "actionHandler", "(Lru/ozon/app/android/geo/map/presentation/viewmodel/AddressEditMapViewModel$Action;)V", "show", "loaderHandler", "(Z)V", "Lru/ozon/app/android/geo/map/presentation/viewmodel/AddressEditMapViewModel$BannerState;", "bannerState", "bannerHandler", "(Lru/ozon/app/android/geo/map/presentation/viewmodel/AddressEditMapViewModel$BannerState;)V", "Landroid/view/ViewGroup;", "composerRootView", "showLoader", "(Landroid/view/ViewGroup;)V", "hideLoader", "LA00/a;", "event", "busEventHandler", "(LA00/a;)V", "Lru/ozon/app/android/geo/map/clusterization/PinsState;", "state", "handleClusterizationState", "(Lru/ozon/app/android/geo/map/clusterization/PinsState;)V", "LA00/a$J$a;", "sendMapUpdateEvent", "(LA00/a$J$a;)V", "Lru/ozon/app/android/geo/map/presentation/AddressEditMapVOWithPayloads;", "pageWithPayloads", "mapStateHandler", "(Lru/ozon/app/android/geo/map/presentation/AddressEditMapVOWithPayloads;)V", "handleStartCameraMoving", "Lru/ozon/app/android/geo/map/presentation/viewmodel/AddressEditMapViewModel$Action$MapMove;", "handleActionMove", "(Lru/ozon/app/android/geo/map/presentation/viewmodel/AddressEditMapViewModel$Action$MapMove;)V", "Lru/ozon/app/android/geo/map/presentation/viewmodel/AddressEditMapViewModel$Action$SelectorClicked;", "handleActionSelector", "(Lru/ozon/app/android/geo/map/presentation/viewmodel/AddressEditMapViewModel$Action$SelectorClicked;)V", "Lru/ozon/app/android/geo/map/presentation/viewmodel/AddressEditMapViewModel$Action$PinClicked;", "handleActionPinClick", "(Lru/ozon/app/android/geo/map/presentation/viewmodel/AddressEditMapViewModel$Action$PinClicked;)V", "Lru/ozon/app/android/geo/map/presentation/viewmodel/AddressEditMapViewModel$Action$ClusterClicked;", "handleActionClusterClick", "(Lru/ozon/app/android/geo/map/presentation/viewmodel/AddressEditMapViewModel$Action$ClusterClicked;)V", "", ImagesContract.URL, "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "params", "useMapInfoParameters", "updatePage", "(Ljava/lang/String;Ljava/util/HashMap;Z)V", "Lru/ozon/app/android/geo/map/presentation/viewmodel/AddressEditMapViewModel$Action$MoveToLocation;", "handleMovement", "(Lru/ozon/app/android/geo/map/presentation/viewmodel/AddressEditMapViewModel$Action$MoveToLocation;)V", "handleClusterPinClick", "(Ljava/lang/String;)V", "handleRequestLocation", "Lru/ozon/uni/atoms/af/AtomAction;", "handleOnAtomAction", "(Lru/ozon/uni/atoms/af/AtomAction;)V", "page", "handleLocationMarkersViewEvents", "Lru/ozon/app/android/geo/map/presentation/viewmodel/AddressEditMapViewModel$Action$LocationException;", "handleLocationException", "(Lru/ozon/app/android/geo/map/presentation/viewmodel/AddressEditMapViewModel$Action$LocationException;)V", "handleActionBack", "Lru/ozon/app/android/geo/map/presentation/viewmodel/AddressEditMapViewModel$Action$ShowUserCurrentLocationPin;", "handleShowUserCurrentLocationPin", "(Lru/ozon/app/android/geo/map/presentation/viewmodel/AddressEditMapViewModel$Action$ShowUserCurrentLocationPin;)V", "onRefreshingDone", "LA00/a$J;", "onUpdate", "(LA00/a$J;)V", "Lru/ozon/app/android/delivery/customActionsHandlers/updateSelectedMapTab/UpdateSelectedMapTabEvent;", "changeSelectedTab", "(Lru/ozon/app/android/delivery/customActionsHandlers/updateSelectedMapTab/UpdateSelectedMapTabEvent;)V", "Lru/ozon/app/android/yandexsearchsheet/ShowYandexSearchSheetAction;", "showYandexSearchSheetAction", "showYandexSearchSheet", "(Lru/ozon/app/android/yandexsearchsheet/ShowYandexSearchSheetAction;)V", "LWZ/t;", "tokenizedEvent", "fromLocationButton", "onDefineCurrentLocationAction", "(LWZ/t;Z)V", "trackClick", "(LWZ/t;)V", "trackView", "Lru/ozon/app/android/yandexsearchsheet/YandexSearchSheetFragment$Data$MapInfoRequest;", "createMapInfoRequest", "()Lru/ozon/app/android/yandexsearchsheet/YandexSearchSheetFragment$Data$MapInfoRequest;", "Lru/ozon/app/android/geo/map/presentation/viewmapper/AddressEditMapViewListener;", "initializeMapListener", "()Lru/ozon/app/android/geo/map/presentation/viewmapper/AddressEditMapViewListener;", "handleSystemBackPressed", "Ll10/i;", "Lru/ozon/app/android/geo/map/presentation/viewmodel/AddressEditMapViewModel;", "Lru/ozon/app/android/yandexsearchsheet/YandexSearchSheetSharedViewModel;", "Lru/ozon/app/android/composer/ComposerNavigator;", "LVg/d;", "Lru/ozon/app/android/mapcommon/mapcommon/MapUpdateManager;", "Lru/ozon/app/android/geo/map/clusterization/ClusterizationLoadingService;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "Lru/ozon/app/android/geo/map/data/GeoConfigData;", "getConfigData", "()Lru/ozon/app/android/geo/map/data/GeoConfigData;", "setConfigData", "Lnc/b;", "initMapDisposable", "Lnc/b;", "isFirstInit", "Z", "Lkotlin/Function1;", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/geo/map/presentation/viewmapper/AddressEditMapViewWrapper;", "addressEditMapViewWrapper", "Lru/ozon/app/android/geo/map/presentation/viewmapper/AddressEditMapViewWrapper;", "Lru/ozon/app/android/mapcommon/map/OzonMapController;", "mapController", "Lru/ozon/app/android/mapcommon/map/OzonMapController;", "Lru/ozon/app/android/geo/map/clusterization/MapClusterizationProvider;", "mapClusterizationProvider", "Lru/ozon/app/android/geo/map/clusterization/MapClusterizationProvider;", "ru/ozon/app/android/geo/map/presentation/viewmapper/AddressEditMapViewHolder$viewObserver$1", "viewObserver", "Lru/ozon/app/android/geo/map/presentation/viewmapper/AddressEditMapViewHolder$viewObserver$1;", "Landroidx/lifecycle/W;", "mapStateObserver", "Landroidx/lifecycle/W;", "actionObserver", "loaderObserver", "bannerObserver", "eventHandlerObserver", "needRequestPermission", "Lxe/B0;", "clusterizationJob", "Lxe/B0;", "LWZ/t;", "ru/ozon/app/android/geo/map/presentation/viewmapper/AddressEditMapViewHolder$onBackPressedCallback$1", "onBackPressedCallback", "Lru/ozon/app/android/geo/map/presentation/viewmapper/AddressEditMapViewHolder$onBackPressedCallback$1;", "Landroid/view/View;", "getMetricView", "()Landroid/view/View;", "metricView", "Companion", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AddressEditMapViewHolder extends AbstractC6065b<AddressEditMapVO> {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final W<AddressEditMapViewModel.Action> actionObserver;

    @NotNull
    private final AddressEditMapViewWrapper addressEditMapViewWrapper;

    @NotNull
    private final W<AddressEditMapViewModel.BannerState> bannerObserver;
    private B0 clusterizationJob;

    @NotNull
    private final ClusterizationLoadingService clusterizationLoadingService;
    private GeoConfigData configData;

    @NotNull
    private final i container;

    @NotNull
    private final d customActionHandlersStoreFactory;

    @NotNull
    private final W<a> eventHandlerObserver;
    private InterfaceC8487b initMapDisposable;
    private boolean isFirstInit;

    @NotNull
    private final W<Boolean> loaderObserver;

    @NotNull
    private final MapClusterizationProvider mapClusterizationProvider;

    @NotNull
    private final OzonMapController mapController;

    @NotNull
    private final W<AddressEditMapVOWithPayloads> mapStateObserver;

    @NotNull
    private final MapUpdateManager mapUpdateManager;

    @NotNull
    private final ComposerNavigator navigator;
    private boolean needRequestPermission;

    @NotNull
    private final AddressEditMapViewHolder$onBackPressedCallback$1 onBackPressedCallback;
    private t tokenizedEvent;

    @NotNull
    private final AddressEditMapViewModel viewModel;

    @NotNull
    private final AddressEditMapViewHolder$viewObserver$1 viewObserver;

    @NotNull
    private final YandexSearchSheetSharedViewModel yandexSearchSheetSharedViewModel;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.geo.map.presentation.viewmapper.AddressEditMapViewHolder$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function0<Unit> {
        AnonymousClass1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            AddressEditMapViewHolder.this.viewModel.onBackPressed();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/yandexsearchsheet/ShowYandexSearchSheetAction;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @e(c = "ru.ozon.app.android.geo.map.presentation.viewmapper.AddressEditMapViewHolder$2", f = "AddressEditMapViewHolder.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.geo.map.presentation.viewmapper.AddressEditMapViewHolder$2, reason: invalid class name */
    static final class AnonymousClass2 extends j implements Function2<ShowYandexSearchSheetAction, kotlin.coroutines.d<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        AnonymousClass2(kotlin.coroutines.d<? super AnonymousClass2> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            AnonymousClass2 anonymousClass2 = AddressEditMapViewHolder.this.new AnonymousClass2(dVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            AddressEditMapViewHolder.this.showYandexSearchSheet((ShowYandexSearchSheetAction) this.L$0);
            return Unit.f71690a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ShowYandexSearchSheetAction showYandexSearchSheetAction, kotlin.coroutines.d<? super Unit> dVar) {
            return ((AnonymousClass2) create(showYandexSearchSheetAction, dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LA00/a$J$a;", "it", "", "<anonymous>", "(LA00/a$J$a;)V"}, k = 3, mv = {2, 0, 0})
    @e(c = "ru.ozon.app.android.geo.map.presentation.viewmapper.AddressEditMapViewHolder$3", f = "AddressEditMapViewHolder.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.geo.map.presentation.viewmapper.AddressEditMapViewHolder$3, reason: invalid class name */
    static final class AnonymousClass3 extends j implements Function2<a.J.InterfaceC0007a, kotlin.coroutines.d<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        AnonymousClass3(kotlin.coroutines.d<? super AnonymousClass3> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            AnonymousClass3 anonymousClass3 = AddressEditMapViewHolder.this.new AnonymousClass3(dVar);
            anonymousClass3.L$0 = obj;
            return anonymousClass3;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(a.J.InterfaceC0007a interfaceC0007a, kotlin.coroutines.d<? super Unit> dVar) {
            return ((AnonymousClass3) create(interfaceC0007a, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            AddressEditMapViewHolder.this.sendMapUpdateEvent((a.J.InterfaceC0007a) this.L$0);
            return Unit.f71690a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lru/ozon/app/android/geo/map/presentation/viewmapper/AddressEditMapViewHolder$Companion;", "", "<init>", "()V", "MAP_INFO", "", "PICKUP", "COURIER", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [ru.ozon.app.android.geo.map.presentation.viewmapper.AddressEditMapViewHolder$viewObserver$1] */
    /* JADX WARN: Type inference failed for: r5v15, types: [ru.ozon.app.android.geo.map.presentation.viewmapper.AddressEditMapViewHolder$onBackPressedCallback$1] */
    public AddressEditMapViewHolder(@NotNull i container, @NotNull AddressEditMapViewModel viewModel, @NotNull YandexSearchSheetSharedViewModel yandexSearchSheetSharedViewModel, @NotNull ComposerNavigator navigator, @NotNull d customActionHandlersStoreFactory, @NotNull MapUpdateManager mapUpdateManager, @NotNull ClusterizationLoadingService clusterizationLoadingService, @NotNull MapPerformanceAnalyticsSender mapPerformanceAnalyticsSender, @NotNull DetailsSheetManager detailsSheetManager, @NotNull OzonMapProvider ozonMapProvider, @NotNull FeatureChecker featureChecker, @NotNull FeatureService featureService, @NotNull BZ.e miniAppConfigHolder, boolean z11) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(yandexSearchSheetSharedViewModel, "yandexSearchSheetSharedViewModel");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        Intrinsics.checkNotNullParameter(mapUpdateManager, "mapUpdateManager");
        Intrinsics.checkNotNullParameter(clusterizationLoadingService, "clusterizationLoadingService");
        Intrinsics.checkNotNullParameter(mapPerformanceAnalyticsSender, "mapPerformanceAnalyticsSender");
        Intrinsics.checkNotNullParameter(detailsSheetManager, "detailsSheetManager");
        Intrinsics.checkNotNullParameter(ozonMapProvider, "ozonMapProvider");
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        Intrinsics.checkNotNullParameter(featureService, "featureService");
        Intrinsics.checkNotNullParameter(miniAppConfigHolder, "miniAppConfigHolder");
        this.container = container;
        this.viewModel = viewModel;
        this.yandexSearchSheetSharedViewModel = yandexSearchSheetSharedViewModel;
        this.navigator = navigator;
        this.customActionHandlersStoreFactory = customActionHandlersStoreFactory;
        this.mapUpdateManager = mapUpdateManager;
        this.clusterizationLoadingService = clusterizationLoadingService;
        this.isFirstInit = true;
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(container, this).configureBottomSheet(new ComposerScreenConfig.BottomSheetConfig(ComposerFragment.DisplayMode.BOTTOM_SHEET_FULL, false, false, null, 0, false, false, false, false, false, false, 2046, null)).customActionHandlers(new AddressEditMapViewHolder$actionHandler$1(this)).buildHandler();
        this.actionHandler = buildHandler;
        Context L11 = container.L();
        Intrinsics.checkNotNullExpressionValue(L11, "<get-context>(...)");
        AddressEditMapViewWrapper addressEditMapViewWrapper = new AddressEditMapViewWrapper(L11, detailsSheetManager, container, ozonMapProvider, featureChecker, featureService, new MapPerformanceAnalyticsManager(mapPerformanceAnalyticsSender, container), new AddressEditMapViewHolder$addressEditMapViewWrapper$1(this), this, buildHandler, miniAppConfigHolder, z11);
        this.addressEditMapViewWrapper = addressEditMapViewWrapper;
        OzonMapController mapController = addressEditMapViewWrapper.getMapController();
        this.mapController = mapController;
        Context L12 = container.L();
        Intrinsics.checkNotNullExpressionValue(L12, "<get-context>(...)");
        this.mapClusterizationProvider = new MapClusterizationProvider(L12, mapController, new AddressEditMapViewHolder$mapClusterizationProvider$1(this), new AddressEditMapViewHolder$mapClusterizationProvider$2(this), new AddressEditMapViewHolder$mapClusterizationProvider$3(this));
        this.viewObserver = new DefaultLifecycleObserver() { // from class: ru.ozon.app.android.geo.map.presentation.viewmapper.AddressEditMapViewHolder$viewObserver$1
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onDestroy(J owner) {
                OzonMapController ozonMapController;
                Intrinsics.checkNotNullParameter(owner, "owner");
                ozonMapController = AddressEditMapViewHolder.this.mapController;
                ozonMapController.onDestroy();
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onResume(J owner) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                AddressEditMapViewHolder.this.viewModel.defineLocationIfPermissionChanged();
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onStart(J owner) {
                AddressEditMapViewWrapper addressEditMapViewWrapper2;
                Intrinsics.checkNotNullParameter(owner, "owner");
                addressEditMapViewWrapper2 = AddressEditMapViewHolder.this.addressEditMapViewWrapper;
                addressEditMapViewWrapper2.onStart();
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onStop(J owner) {
                AddressEditMapViewWrapper addressEditMapViewWrapper2;
                Intrinsics.checkNotNullParameter(owner, "owner");
                addressEditMapViewWrapper2 = AddressEditMapViewHolder.this.addressEditMapViewWrapper;
                addressEditMapViewWrapper2.onStop();
            }
        };
        this.mapStateObserver = new AddressEditMapViewHolder$mapStateObserver$1(this);
        AddressEditMapViewHolder$actionObserver$1 addressEditMapViewHolder$actionObserver$1 = new AddressEditMapViewHolder$actionObserver$1(this);
        this.actionObserver = addressEditMapViewHolder$actionObserver$1;
        AddressEditMapViewHolder$loaderObserver$1 addressEditMapViewHolder$loaderObserver$1 = new AddressEditMapViewHolder$loaderObserver$1(this);
        this.loaderObserver = addressEditMapViewHolder$loaderObserver$1;
        AddressEditMapViewHolder$bannerObserver$1 addressEditMapViewHolder$bannerObserver$1 = new AddressEditMapViewHolder$bannerObserver$1(this);
        this.bannerObserver = addressEditMapViewHolder$bannerObserver$1;
        AddressEditMapViewHolder$eventHandlerObserver$1 addressEditMapViewHolder$eventHandlerObserver$1 = new AddressEditMapViewHolder$eventHandlerObserver$1(this);
        this.eventHandlerObserver = addressEditMapViewHolder$eventHandlerObserver$1;
        this.onBackPressedCallback = new C() { // from class: ru.ozon.app.android.geo.map.presentation.viewmapper.AddressEditMapViewHolder$onBackPressedCallback$1
            {
                super(true);
            }

            @Override // androidx.activity.C
            public void handleOnBackPressed() {
                AddressEditMapViewHolder.this.handleSystemBackPressed();
            }
        };
        viewModel.getAction().observe(this, addressEditMapViewHolder$actionObserver$1);
        viewModel.getLoader().observe(this, addressEditMapViewHolder$loaderObserver$1);
        viewModel.getBannerState().observe(this, addressEditMapViewHolder$bannerObserver$1);
        container.M().getEvents().observe(this, addressEditMapViewHolder$eventHandlerObserver$1);
        addressEditMapViewWrapper.setOnBackPressed(new AnonymousClass1());
        InterfaceC2395h<ShowYandexSearchSheetAction> action = yandexSearchSheetSharedViewModel.getAction();
        AbstractC5434v lifecycle = getLifecycle();
        AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
        C2399j.C(new C2408n0(C5427n.a(action, lifecycle, bVar), new AnonymousClass2(null)), K.a(this));
        C2399j.C(new C2408n0(C5427n.a(mapUpdateManager.getEventsFlow(), getLifecycle(), bVar), new AnonymousClass3(null)), K.a(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void actionHandler(AddressEditMapViewModel.Action action) {
        if (action instanceof AddressEditMapViewModel.Action.MapMove) {
            handleActionMove((AddressEditMapViewModel.Action.MapMove) action);
        } else if (action instanceof AddressEditMapViewModel.Action.SelectorClicked) {
            handleActionSelector((AddressEditMapViewModel.Action.SelectorClicked) action);
        } else if (action instanceof AddressEditMapViewModel.Action.PinClicked) {
            handleActionPinClick((AddressEditMapViewModel.Action.PinClicked) action);
        } else if (action instanceof AddressEditMapViewModel.Action.ClusterClicked) {
            handleActionClusterClick((AddressEditMapViewModel.Action.ClusterClicked) action);
        } else if (action instanceof AddressEditMapViewModel.Action.MoveToLocation) {
            handleMovement((AddressEditMapViewModel.Action.MoveToLocation) action);
        } else if (action instanceof AddressEditMapViewModel.Action.LocationException) {
            handleLocationException((AddressEditMapViewModel.Action.LocationException) action);
        } else if (action instanceof AddressEditMapViewModel.Action.AtomAction) {
            handleOnAtomAction(((AddressEditMapViewModel.Action.AtomAction) action).getAction());
        } else if (action instanceof AddressEditMapViewModel.Action.ShowUserCurrentLocationPin) {
            handleShowUserCurrentLocationPin((AddressEditMapViewModel.Action.ShowUserCurrentLocationPin) action);
        } else if (Intrinsics.d(action, AddressEditMapViewModel.Action.RequestLocationPermission.INSTANCE)) {
            handleRequestLocation();
        } else if (Intrinsics.d(action, AddressEditMapViewModel.Action.Back.INSTANCE)) {
            handleActionBack();
        } else if (Intrinsics.d(action, AddressEditMapViewModel.Action.StartCameraMoving.INSTANCE)) {
            handleStartCameraMoving();
        } else if (Intrinsics.d(action, AddressEditMapViewModel.Action.HidePvzSheet.INSTANCE)) {
            this.addressEditMapViewWrapper.hideDetailsSheet();
        } else {
            if (!Intrinsics.d(action, AddressEditMapViewModel.Action.PrepareToClusterization.INSTANCE)) {
                throw new o();
            }
            prepareToClusterization();
        }
        WhenExtKt.getExhaustive(Unit.f71690a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bannerHandler(AddressEditMapViewModel.BannerState bannerState) {
        this.addressEditMapViewWrapper.handleBannerState(bannerState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void busEventHandler(a event) {
        if (event instanceof a.J) {
            onUpdate((a.J) event);
        } else if (event instanceof a.C2370k) {
            onRefreshingDone();
        }
    }

    private final void changeSelectedTab(UpdateSelectedMapTabEvent event) {
        String selectedTab = event.getSelectedTab();
        this.addressEditMapViewWrapper.changeSelectedTab(event.getLink(), Intrinsics.d(selectedTab, "pickup") ? AddressEditMapDTO.Selector.Type.TYPE_PICKUP_POINT : Intrinsics.d(selectedTab, "courier") ? AddressEditMapDTO.Selector.Type.TYPE_COURIER : AddressEditMapDTO.Selector.Type.TYPE_INVALID);
    }

    private final YandexSearchSheetFragment.Data.MapInfoRequest createMapInfoRequest() {
        String sessionId = this.viewModel.getSessionId();
        List<String> preferredProvider = this.mapController.getPreferredProvider(PreferredProvider.Type.REVGEOCODE);
        if (preferredProvider == null) {
            preferredProvider = kotlin.collections.K.f71697a;
        }
        List<String> list = preferredProvider;
        List<String> preferredProvider2 = this.mapController.getPreferredProvider(PreferredProvider.Type.GEOCODE);
        if (preferredProvider2 == null) {
            preferredProvider2 = kotlin.collections.K.f71697a;
        }
        return new YandexSearchSheetFragment.Data.MapInfoRequest(new YandexSearchSheetFragment.Data.MapInfoRequest.MapInfo(sessionId, new YandexSearchSheetFragment.Data.MapInfoRequest.PreferredGeoProviders(preferredProvider2, list, null, 4, null)));
    }

    private final void dispose() {
        this.viewModel.getAction().removeObserver(this.actionObserver);
        this.viewModel.getLoader().removeObserver(this.loaderObserver);
        this.container.M().getEvents().removeObserver(this.eventHandlerObserver);
    }

    private final void handleActionBack() {
        t tVar = this.tokenizedEvent;
        if (tVar != null) {
            TokenizedAnalyticsExtensionsKt.processClickEvents$default(this.container.X(), tVar, null, 2, null);
        }
        this.navigator.popBackStack();
    }

    private final void handleActionClusterClick(AddressEditMapViewModel.Action.ClusterClicked action) {
        String url = action.getUrl();
        AddressEditMapRequest request = action.getRequest();
        updatePage$default(this, url, request != null ? AddressEditMapRequestKt.toRequest(request) : null, false, 4, null);
        t event = action.getEvent();
        if (event != null) {
            trackClick(event);
        }
    }

    private final void handleActionMove(AddressEditMapViewModel.Action.MapMove action) {
        if (action.getIsMoveToUserLocation()) {
            this.addressEditMapViewWrapper.clearUserPin();
        }
        String url = action.getUrl();
        AddressEditMapRequest request = action.getRequest();
        updatePage$default(this, url, request != null ? AddressEditMapRequestKt.toRequest(request) : null, false, 4, null);
    }

    private final void handleActionPinClick(AddressEditMapViewModel.Action.PinClicked action) {
        String url = action.getUrl();
        AddressEditMapRequest request = action.getRequest();
        updatePage$default(this, url, request != null ? AddressEditMapRequestKt.toRequest(request) : null, false, 4, null);
        t event = action.getEvent();
        if (event != null) {
            trackClick(event);
        }
    }

    private final void handleActionSelector(final AddressEditMapViewModel.Action.SelectorClicked action) {
        this.viewModel.hideBanner();
        GeoProviderConfig geoProviderConfig = this.viewModel.getGeoProviderConfig(action.getType());
        if (geoProviderConfig == null) {
            return;
        }
        this.addressEditMapViewWrapper.onInitializeMap();
        AbstractC7094b initMap$default = OzonMapController.DefaultImpls.initMap$default(this.mapController, null, geoProviderConfig, this.viewModel.getSessionId(), true, true, 1, null);
        InterfaceC9019a interfaceC9019a = new InterfaceC9019a() { // from class: Fy.a
            @Override // qc.InterfaceC9019a
            public final void run() {
                AddressEditMapViewHolder.handleActionSelector$lambda$5(AddressEditMapViewHolder.this, action);
            }
        };
        DM.i iVar = new DM.i(new AddressEditMapViewHolder$handleActionSelector$2(Lm0.a.f17149a), 1);
        initMap$default.getClass();
        uc.i iVar2 = new uc.i(iVar, interfaceC9019a);
        initMap$default.a(iVar2);
        this.initMapDisposable = iVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleActionSelector$lambda$5(AddressEditMapViewHolder addressEditMapViewHolder, AddressEditMapViewModel.Action.SelectorClicked selectorClicked) {
        addressEditMapViewHolder.onStart();
        String url = selectorClicked.getUrl();
        AddressEditMapRequest request = selectorClicked.getRequest();
        addressEditMapViewHolder.updatePage(url, request != null ? AddressEditMapRequestKt.toRequest(request) : null, false);
        t event = selectorClicked.getEvent();
        if (event != null) {
            addressEditMapViewHolder.trackClick(event);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleClusterPinClick(String url) {
        CameraPositionModel cameraPosition$default = OzonMapController.DefaultImpls.getCameraPosition$default(this.mapController, null, 1, null);
        if (cameraPosition$default != null) {
            this.viewModel.onPinClickedAction(url, cameraPosition$default.getZoom(), null, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleClusterizationState(PinsState state) {
        if (state instanceof PinsState.Success) {
            this.mapClusterizationProvider.clusterize(((PinsState.Success) state).getPins());
        } else if (state instanceof PinsState.Error) {
            Lm0.a.f17149a.e(((PinsState.Error) state).getThrowable());
        }
    }

    private final void handleLocationException(AddressEditMapViewModel.Action.LocationException action) {
        this.addressEditMapViewWrapper.showLocationDisabledRestriction(action.getException());
    }

    private final void handleLocationMarkersViewEvents(AddressEditMapVO page) {
        AddressEditMapVO.LocationMarker userLocationMarker;
        t tokenizedEvent;
        if (page.getViewPort() == null || !this.viewModel.checkUserLocationIncludedInViewport(page.getViewPort()) || (userLocationMarker = page.getUserLocationMarker()) == null || (tokenizedEvent = userLocationMarker.getTokenizedEvent()) == null) {
            return;
        }
        trackView(tokenizedEvent);
    }

    private final void handleMovement(AddressEditMapViewModel.Action.MoveToLocation action) {
        AddressEditMapViewWrapper addressEditMapViewWrapper = this.addressEditMapViewWrapper;
        AddressEditMapVO editMapVO = action.getEditMapVO();
        AddressEditMapVO.ViewPort viewPort = editMapVO != null ? editMapVO.getViewPort() : null;
        AddressEditMapVO editMapVO2 = action.getEditMapVO();
        AddressEditMapViewWrapper.moveToPoint$default(addressEditMapViewWrapper, viewPort, editMapVO2 != null ? new AddressEditMapState.CameraState(editMapVO2.getCenterPin(), editMapVO2.getViewPort(), editMapVO2.getMapObjects(), false) : null, null, null, 12, null);
    }

    private final void handleOnAtomAction(AtomAction action) {
        this.actionHandler.invoke(action);
    }

    private final void handleRequestLocation() {
        if (this.needRequestPermission) {
            AddressEditMapViewWrapper.requestLocationPermission$default(this.addressEditMapViewWrapper, false, 1, null);
        }
    }

    private final void handleShowUserCurrentLocationPin(AddressEditMapViewModel.Action.ShowUserCurrentLocationPin action) {
        this.addressEditMapViewWrapper.showUserLocationPinIfNeed(action.getMarkerLocation());
    }

    private final void handleStartCameraMoving() {
        this.addressEditMapViewWrapper.scheduleSlideDown();
        this.container.M().a();
        this.viewModel.startBannerTimer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleSystemBackPressed() {
        t tVar = this.tokenizedEvent;
        if (tVar != null) {
            AnalyticsExtensionsKt.processEventsSystemBack$default(this.container.X(), tVar, null, 2, null);
        }
        this.navigator.popBackStack();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void hideLoader(ViewGroup composerRootView) {
        ViewGroup composerProgressBar = ComposerViewExtensionKt.composerProgressBar(composerRootView);
        if (composerProgressBar != null) {
            ViewExtKt.gone(composerProgressBar);
        }
    }

    private final void initMap(GeoConfigData configData) {
        GeoProviderConfig geoProviderConfig;
        if (configData == null || (geoProviderConfig = configData.getGeoProviderConfig()) == null) {
            return;
        }
        AbstractC7094b initMap$default = OzonMapController.DefaultImpls.initMap$default(this.mapController, new AddressEditMapViewHolder$initMap$1$1(this), geoProviderConfig, configData.getSessionId(), false, true, 8, null);
        InterfaceC9019a interfaceC9019a = new InterfaceC9019a() { // from class: Fy.b
            @Override // qc.InterfaceC9019a
            public final void run() {
                AddressEditMapViewHolder.initMap$lambda$2$lambda$0(AddressEditMapViewHolder.this);
            }
        };
        C3065c c3065c = new C3065c(new AddressEditMapViewHolder$initMap$1$3(Lm0.a.f17149a), 0);
        initMap$default.getClass();
        uc.i iVar = new uc.i(c3065c, interfaceC9019a);
        initMap$default.a(iVar);
        this.initMapDisposable = iVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initMap$lambda$2$lambda$0(AddressEditMapViewHolder addressEditMapViewHolder) {
        addressEditMapViewHolder.onStart();
        addressEditMapViewHolder.setView();
    }

    private final AddressEditMapViewListener initializeMapListener() {
        return new AddressEditMapViewListener() { // from class: ru.ozon.app.android.geo.map.presentation.viewmapper.AddressEditMapViewHolder$initializeMapListener$1
            @Override // ru.ozon.app.android.geo.map.presentation.viewmapper.AddressEditMapViewListener
            public void onBannerLoaded(long hintDelayMs) {
                AddressEditMapViewHolder.this.viewModel.startHintTimer(hintDelayMs);
            }

            @Override // ru.ozon.app.android.geo.map.presentation.viewmapper.AddressEditMapViewListener
            public void onCameraCentered() {
                MapClusterizationProvider mapClusterizationProvider;
                mapClusterizationProvider = AddressEditMapViewHolder.this.mapClusterizationProvider;
                mapClusterizationProvider.onCameraCentered();
            }

            @Override // ru.ozon.app.android.geo.map.presentation.viewmapper.AddressEditMapViewListener
            public void onCameraEndMoveAction(AddressEditMapVO.Coordinate center, AddressEditMapVO.ViewPort viewport, float zoom) {
                MapClusterizationProvider mapClusterizationProvider;
                Intrinsics.checkNotNullParameter(center, "center");
                mapClusterizationProvider = AddressEditMapViewHolder.this.mapClusterizationProvider;
                mapClusterizationProvider.onCameraEndMoveAction();
                AddressEditMapViewHolder.this.viewModel.onCameraEndMoveAction(center, viewport, zoom);
            }

            @Override // ru.ozon.app.android.geo.map.presentation.viewmapper.AddressEditMapViewListener
            public void onCameraStartMoveAction() {
                AddressEditMapViewHolder.this.viewModel.onCameraStartMoveAction();
            }

            @Override // ru.ozon.app.android.geo.map.presentation.viewmapper.AddressEditMapViewListener
            public void onClusterClickedAction(String link, AddressEditMapVO.ViewPort viewport, float zoom, t event) {
                AddressEditMapViewHolder.this.viewModel.onClusterClickedAction(link, viewport, zoom, event);
            }

            @Override // ru.ozon.app.android.geo.map.presentation.viewmapper.AddressEditMapViewListener
            public void onCurrentLocationAction(t tokenizedEvent, boolean fromLocationButton) {
                AddressEditMapViewHolder.this.onDefineCurrentLocationAction(tokenizedEvent, fromLocationButton);
            }

            @Override // ru.ozon.app.android.geo.map.presentation.viewmapper.AddressEditMapViewListener
            public void onPinClickedAction(String link, float zoom, AddressEditMapVO.ViewPort viewport, t tokenizedEvent) {
                AddressEditMapViewHolder.this.viewModel.onPinClickedAction(link, zoom, viewport, tokenizedEvent);
            }

            @Override // ru.ozon.app.android.geo.map.presentation.viewmapper.AddressEditMapViewListener
            public void onSearchAction(AddressEditMapVO.MapIcon.SearchIcon.SearchDialogOptions options, c trackingData) {
                YandexSearchSheetSharedViewModel yandexSearchSheetSharedViewModel;
                Intrinsics.checkNotNullParameter(options, "options");
                ShowYandexSearchSheetAction showYandexSearchSheetAction = new ShowYandexSearchSheetAction(new YandexSearchSheetFragment.Data("", options.getTitle(), options.getPlaceholder(), options.getQuery(), options.getSearchOptions(), null, null, null, null, null, 992, null), 1001, trackingData);
                yandexSearchSheetSharedViewModel = AddressEditMapViewHolder.this.yandexSearchSheetSharedViewModel;
                yandexSearchSheetSharedViewModel.showYandexSearchSheet(showYandexSearchSheetAction);
                t event = options.getEvent();
                if (event != null) {
                    AddressEditMapViewHolder.this.trackClick(event);
                }
            }

            @Override // ru.ozon.app.android.geo.map.presentation.viewmapper.AddressEditMapViewListener
            public void onSelectorPressed(String url, float zoom, AddressEditMapVO.ViewPort viewport, t tokenizedEvent, AddressEditMapDTO.Selector.Type type) {
                Intrinsics.checkNotNullParameter(url, "url");
                Intrinsics.checkNotNullParameter(type, "type");
                AddressEditMapViewHolder.this.viewModel.onSelectorButtonPressed(url, zoom, viewport, tokenizedEvent, type);
            }

            @Override // ru.ozon.app.android.geo.map.presentation.viewmapper.AddressEditMapViewListener
            public void selectPinFromBannerAction(String url, Float zoom, AddressEditMapVO.ViewPort viewport, t tokenizedEvent) {
                if (url == null || zoom == null) {
                    return;
                }
                AddressEditMapViewHolder.this.viewModel.onSelectPinFromBannerAction(url, zoom.floatValue(), viewport, tokenizedEvent);
                if (tokenizedEvent != null) {
                    AddressEditMapViewHolder.this.trackClick(tokenizedEvent);
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void loaderHandler(boolean show) {
        if (show) {
            this.addressEditMapViewWrapper.showLoader();
        } else {
            this.addressEditMapViewWrapper.hideLoader();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void mapStateHandler(AddressEditMapVOWithPayloads pageWithPayloads) {
        this.needRequestPermission = pageWithPayloads.getPage().getGeolocationOnInit();
        AddressEditMapViewWrapper addressEditMapViewWrapper = this.addressEditMapViewWrapper;
        addressEditMapViewWrapper.bindState(pageWithPayloads);
        addressEditMapViewWrapper.hideLoader();
        t event = pageWithPayloads.getPage().getEvent();
        if (event != null) {
            trackView(event);
        }
        this.viewModel.defineLocationIfNeeded(pageWithPayloads.getPage());
        handleLocationMarkersViewEvents(pageWithPayloads.getPage());
    }

    private final void observeClusterization() {
        B0 b02 = this.clusterizationJob;
        if (b02 != null) {
            b02.j(null);
        }
        this.clusterizationJob = C2399j.C(new C2408n0(this.clusterizationLoadingService.pinsFlow(), new AddressEditMapViewHolder$observeClusterization$1(this, null)), K.a(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onDefineCurrentLocationAction(t tokenizedEvent, boolean fromLocationButton) {
        this.needRequestPermission = true;
        this.viewModel.onDefineCurrentLocationAction(fromLocationButton);
        if (tokenizedEvent != null) {
            trackClick(tokenizedEvent);
        }
    }

    private final void onRefreshingDone() {
        this.addressEditMapViewWrapper.scheduleSlideUp();
    }

    private final void onStart() {
        this.addressEditMapViewWrapper.setupMapController();
        this.addressEditMapViewWrapper.onStart();
        this.addressEditMapViewWrapper.scheduleSlideUp();
        this.addressEditMapViewWrapper.startAnalyticsObserve();
        observeClusterization();
    }

    private final void onUpdate(a.J event) {
        a.J.InterfaceC0007a d11 = event.d();
        if (d11 instanceof UpdateSelectedMapTabEvent) {
            changeSelectedTab((UpdateSelectedMapTabEvent) d11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendMapUpdateEvent(a.J.InterfaceC0007a event) {
        this.container.M().update(event);
    }

    private final void setView() {
        this.addressEditMapViewWrapper.setMapListener(initializeMapListener());
        getLifecycle().a(this.viewObserver);
        this.viewModel.getMapState().observe(this, this.mapStateObserver);
        handleRequestLocation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showLoader(ViewGroup composerRootView) {
        ViewGroup composerProgressBar = ComposerViewExtensionKt.composerProgressBar(composerRootView);
        if (composerProgressBar != null) {
            ViewExtKt.show(composerProgressBar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showYandexSearchSheet(ShowYandexSearchSheetAction showYandexSearchSheetAction) {
        this.viewModel.hideBanner();
        YandexSearchSheetFragment.INSTANCE.show(ShowYandexSearchSheetAction.copy$default(showYandexSearchSheetAction, YandexSearchSheetFragment.Data.copy$default(showYandexSearchSheetAction.getSearchSheetData(), null, null, null, null, null, null, createMapInfoRequest(), this.viewModel.getContextLocationUid(), this.viewModel.getCurrentGeoProviderConfig(), this.mapController.getAnalyticsModuleState(), 31, null), 0, null, 6, null), this.container.K().h(), this.container.K().i());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void trackClick(t item) {
        TokenizedAnalyticsExtensionsKt.processClickEvents$default(this.container.X(), item, null, 2, null);
    }

    private final void trackView(t item) {
        TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.container.X(), item, null, 2, null);
    }

    private final void updatePage(String url, HashMap<String, Object> params, boolean useMapInfoParameters) {
        this.container.M().a();
        TraceApiKt.beginDebugTrace("mapTotal", 1);
        TraceApiKt.beginDebugTrace("mapRequest", 1);
        if (useMapInfoParameters && params != null) {
            params.put("mapInfo", createMapInfoRequest().getMapInfo());
        }
        InterfaceC7851b.a.e(this.container.M(), url, params, null, 4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void updatePage$default(AddressEditMapViewHolder addressEditMapViewHolder, String str, HashMap hashMap, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            hashMap = null;
        }
        if ((i11 & 4) != 0) {
            z11 = true;
        }
        addressEditMapViewHolder.updatePage(str, hashMap, z11);
    }

    @Override // d20.AbstractC6065b
    @NotNull
    public View getMetricView() {
        return this.addressEditMapViewWrapper.getAddressEditMapView();
    }

    @Override // d20.AbstractC6065b
    public void onRefresh() {
        this.addressEditMapViewWrapper.scheduleSlideDown();
    }

    @Override // d20.AbstractC6065b
    public void onWidgetCreated() {
        androidx.activity.J onBackPressedDispatcher;
        super.onWidgetCreated();
        this.addressEditMapViewWrapper.attachToContainer();
        r a11 = this.container.Q().a();
        if (a11 == null || (onBackPressedDispatcher = a11.getOnBackPressedDispatcher()) == null) {
            return;
        }
        onBackPressedDispatcher.h(this, this.onBackPressedCallback);
    }

    @Override // d20.AbstractC6065b
    public void onWidgetDestroyed() {
        super.onWidgetDestroyed();
        this.addressEditMapViewWrapper.removeFromContainer();
        InterfaceC8487b interfaceC8487b = this.initMapDisposable;
        if (interfaceC8487b != null) {
            interfaceC8487b.dispose();
        }
        this.mapController.dispose();
        this.mapController.clear();
        dispose();
        this.yandexSearchSheetSharedViewModel.setMapViewCreated(false);
        B0 b02 = this.clusterizationJob;
        if (b02 != null) {
            b02.j(null);
        }
        remove();
    }

    public final void prepareToClusterization() {
        this.addressEditMapViewWrapper.startClusterizationAnimation();
    }

    public final void setConfigData(GeoConfigData geoConfigData) {
        if (Intrinsics.d(this.configData, geoConfigData)) {
            return;
        }
        initMap(geoConfigData);
        this.configData = geoConfigData;
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull AddressEditMapVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.tokenizedEvent = item.getEvent();
        this.viewModel.bind(item, this.isFirstInit);
        this.isFirstInit = false;
        this.mapClusterizationProvider.configureMapClusterization(item);
    }
}
