package ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation;

import Ae.C;
import Ae.C2399j;
import Ae.C2408n0;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import De.C2862e;
import Sc.o;
import Sc.s;
import android.os.Parcelable;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import fd.InterfaceC6511n;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.favorites.domain.favoritemanager.FavoriteManager;
import ru.ozon.app.android.favorites.domain.favoritemanager.model.FavoriteAdd;
import ru.ozon.app.android.favorites.domain.favoritemanager.model.FavoriteEvent;
import ru.ozon.app.android.favorites.domain.favoritemanager.model.FavoriteRemove;
import ru.ozon.app.android.travel.feature.hotels.map.shared.presentation.DistrictsVO;
import ru.ozon.app.android.travel.feature.hotels.map.shared.presentation.DistrictsVOKt;
import ru.ozon.app.android.travel.feature.hotels.map.shared.presentation.ThrowableExtKt;
import ru.ozon.app.android.travel.feature.hotels.map.shared.presentation.polygons.PolygonsRepository;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.data.HotelsMapInfoV4DTO;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.HotelsMapInfoV4VO;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.MapAction;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.MapEvent;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.analytics.AnalyticsHelper;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.pins.PinManager;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.pins.ViewedPinsStorage;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.polygons.PolygonsManager;
import ru.ozon.app.android.travel.pageconfigurator.fullScreen.WindowInsetsWrapper;
import ru.ozon.app.android.utils.dispatcherprovider.CoroutineDispatcherProvider;
import ru.ozon.uni.atoms.af.AtomAction;
import we0.i;
import we0.n;
import xe.B0;
import xe.C10727i;
import xe.M;
import xe.N;
import ze.C11115c;
import ze.h;
import ze.k;
import ze.w;

@Metadata(d1 = {"\u0000Ä\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002BU\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ#\u0010\u001e\u001a\u00020\u00182\u0012\u0010\u001d\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001c0\u001b\"\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0013\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0 ¢\u0006\u0004\b\u001d\u0010!J\u0015\u0010$\u001a\u00020\u00182\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u00020\u00182\u0006\u0010#\u001a\u00020&H\u0002¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\u00020\u00182\u0006\u0010#\u001a\u00020&H\u0002¢\u0006\u0004\b)\u0010(J\u0017\u0010*\u001a\u00020\u00182\u0006\u0010#\u001a\u00020&H\u0002¢\u0006\u0004\b*\u0010(J\u000f\u0010+\u001a\u00020\u0018H\u0002¢\u0006\u0004\b+\u0010\u001aJ\u0017\u0010-\u001a\u00020\u00182\u0006\u0010#\u001a\u00020,H\u0002¢\u0006\u0004\b-\u0010.J\u0017\u00100\u001a\u00020\u00182\u0006\u0010#\u001a\u00020/H\u0002¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\u0018H\u0002¢\u0006\u0004\b2\u0010\u001aJ\u0017\u00104\u001a\u00020\u00182\u0006\u0010#\u001a\u000203H\u0002¢\u0006\u0004\b4\u00105J\u0017\u00107\u001a\u00020\u00182\u0006\u0010#\u001a\u000206H\u0002¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020\u0018H\u0002¢\u0006\u0004\b9\u0010\u001aJ\u0017\u0010;\u001a\u00020\u00182\u0006\u0010#\u001a\u00020:H\u0002¢\u0006\u0004\b;\u0010<J\u0017\u0010>\u001a\u00020\u00182\u0006\u0010#\u001a\u00020=H\u0002¢\u0006\u0004\b>\u0010?J\u0018\u0010B\u001a\u00020\u00182\u0006\u0010A\u001a\u00020@H\u0082@¢\u0006\u0004\bB\u0010CJ\u000f\u0010D\u001a\u00020\u0018H\u0002¢\u0006\u0004\bD\u0010\u001aJ\u0017\u0010F\u001a\u00020\u00182\u0006\u0010#\u001a\u00020EH\u0002¢\u0006\u0004\bF\u0010GJ\u0017\u0010I\u001a\u00020\u00182\u0006\u0010#\u001a\u00020HH\u0002¢\u0006\u0004\bI\u0010JJ\u001d\u0010N\u001a\u00020\u00182\f\u0010M\u001a\b\u0012\u0004\u0012\u00020L0KH\u0002¢\u0006\u0004\bN\u0010OJ\u000f\u0010P\u001a\u00020\u0018H\u0002¢\u0006\u0004\bP\u0010\u001aJ\u000f\u0010Q\u001a\u00020\u0018H\u0002¢\u0006\u0004\bQ\u0010\u001aJ\u0017\u0010S\u001a\u00020\u00182\u0006\u0010#\u001a\u00020RH\u0002¢\u0006\u0004\bS\u0010TJ\u0017\u0010V\u001a\u00020\u00182\u0006\u0010#\u001a\u00020UH\u0002¢\u0006\u0004\bV\u0010WJ#\u0010\\\u001a\u00020\u00182\b\u0010Y\u001a\u0004\u0018\u00010X2\b\b\u0002\u0010[\u001a\u00020ZH\u0002¢\u0006\u0004\b\\\u0010]J9\u0010c\u001a\b\u0012\u0004\u0012\u00020b0K2\f\u0010^\u001a\b\u0012\u0004\u0012\u00020L0K2\u0014\u0010a\u001a\u0010\u0012\u0004\u0012\u00020L\u0012\u0004\u0012\u00020`\u0018\u00010_H\u0002¢\u0006\u0004\bc\u0010dJ\u001d\u0010e\u001a\u00020\u00182\f\u0010^\u001a\b\u0012\u0004\u0012\u00020L0KH\u0002¢\u0006\u0004\be\u0010OJ\u000f\u0010f\u001a\u00020\u0018H\u0002¢\u0006\u0004\bf\u0010\u001aJ-\u0010k\u001a\u00020\u00182\u0006\u0010h\u001a\u00020g2\u0006\u0010j\u001a\u00020i2\f\u0010M\u001a\b\u0012\u0004\u0012\u00020L0KH\u0002¢\u0006\u0004\bk\u0010lJ;\u0010n\u001a\u00020\u00182\u0006\u0010h\u001a\u00020g2\u0006\u0010j\u001a\u00020i2\f\u0010M\u001a\b\u0012\u0004\u0012\u00020L0K2\f\u0010m\u001a\b\u0012\u0004\u0012\u00020L0KH\u0002¢\u0006\u0004\bn\u0010oJ1\u0010s\u001a\u00020\u00182\u0006\u0010h\u001a\u00020g2\b\u0010q\u001a\u0004\u0018\u00010p2\u0006\u0010j\u001a\u00020i2\u0006\u0010r\u001a\u00020ZH\u0002¢\u0006\u0004\bs\u0010tJ3\u0010u\u001a\u00020\u00182\u0014\u0010q\u001a\u0010\u0012\u0004\u0012\u00020L\u0012\u0004\u0012\u00020`\u0018\u00010_2\f\u0010^\u001a\b\u0012\u0004\u0012\u00020L0KH\u0002¢\u0006\u0004\bu\u0010vJ\u000f\u0010w\u001a\u00020\u0018H\u0002¢\u0006\u0004\bw\u0010\u001aJ\u001d\u0010x\u001a\u00020\u00182\f\u0010a\u001a\b\u0012\u0004\u0012\u00020b0KH\u0002¢\u0006\u0004\bx\u0010OJ\u000f\u0010y\u001a\u00020\u0018H\u0002¢\u0006\u0004\by\u0010\u001aJ\u000f\u0010z\u001a\u00020\u0018H\u0002¢\u0006\u0004\bz\u0010\u001aJ\u001d\u0010{\u001a\u00020\u00182\f\u0010a\u001a\b\u0012\u0004\u0012\u00020b0KH\u0002¢\u0006\u0004\b{\u0010OJ\u001d\u0010|\u001a\u00020\u00182\f\u0010a\u001a\b\u0012\u0004\u0012\u00020b0KH\u0002¢\u0006\u0004\b|\u0010OJ\u000f\u0010}\u001a\u00020\u0018H\u0002¢\u0006\u0004\b}\u0010\u001aR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010~R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u007fR\u0015\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u000f\u0010\u0080\u0001R\u0015\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0011\u0010\u0081\u0001R\u0015\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0013\u0010\u0082\u0001R\u0015\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0015\u0010\u0083\u0001R\u001b\u0010\u0084\u0001\u001a\u0004\u0018\u00010@8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0085\u0001R\u0019\u0010\u0086\u0001\u001a\u00020Z8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0086\u0001\u0010\u0087\u0001R\u0019\u0010\u0088\u0001\u001a\u00020Z8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0087\u0001R\u0019\u0010\u0089\u0001\u001a\u00020Z8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u0087\u0001R\u001c\u0010\u008b\u0001\u001a\u0005\u0018\u00010\u008a\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u008c\u0001R\u001c\u0010\u008d\u0001\u001a\u0005\u0018\u00010\u008a\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008d\u0001\u0010\u008c\u0001R\u001c\u0010\u008e\u0001\u001a\u0005\u0018\u00010\u008a\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008e\u0001\u0010\u008c\u0001R\u001c\u0010\u008f\u0001\u001a\u0005\u0018\u00010\u008a\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008f\u0001\u0010\u008c\u0001R\u001c\u0010\u0090\u0001\u001a\u0005\u0018\u00010\u008a\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0090\u0001\u0010\u008c\u0001R\u0019\u0010\u0091\u0001\u001a\u00020Z8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0091\u0001\u0010\u0087\u0001R+\u0010\u0095\u0001\u001a\u0016\u0012\u0005\u0012\u00030\u0093\u00010\u0092\u0001j\n\u0012\u0005\u0012\u00030\u0093\u0001`\u0094\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0095\u0001\u0010\u0096\u0001R\u0019\u0010\u0097\u0001\u001a\u00020Z8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0097\u0001\u0010\u0087\u0001R\u0019\u0010\u0098\u0001\u001a\u00020Z8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0098\u0001\u0010\u0087\u0001R\u0019\u0010\u0099\u0001\u001a\u00020Z8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0099\u0001\u0010\u0087\u0001R\u001c\u0010\u009b\u0001\u001a\u0005\u0018\u00010\u009a\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009b\u0001\u0010\u009c\u0001R\u0018\u0010\u009e\u0001\u001a\u00030\u009d\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009e\u0001\u0010\u009f\u0001R\u001e\u0010¡\u0001\u001a\t\u0012\u0004\u0012\u00020\u001c0 \u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¡\u0001\u0010¢\u0001R\u0018\u0010¤\u0001\u001a\u00030£\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¤\u0001\u0010¥\u0001¨\u0006¦\u0001"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4ViewModel;", "Landroidx/lifecycle/w0;", "", "Lru/ozon/app/android/favorites/domain/favoritemanager/FavoriteManager;", "favoriteManager", "Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;", "dispatchersProvider", "LAe/h;", "", "userChangedFlow", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/pins/PinManager;", "pinManager", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/UpdateHotelsManager;", "updateHotelsManager", "Lru/ozon/app/android/travel/feature/hotels/map/shared/presentation/polygons/PolygonsRepository;", "polygonsRepository", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/analytics/AnalyticsHelper;", "analyticsHelper", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/MapLastParamsHelper;", "mapLastParamsHelper", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/pins/ViewedPinsStorage;", "viewedPinsStorage", "<init>", "(Lru/ozon/app/android/favorites/domain/favoritemanager/FavoriteManager;Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;LAe/h;Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/pins/PinManager;Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/UpdateHotelsManager;Lru/ozon/app/android/travel/feature/hotels/map/shared/presentation/polygons/PolygonsRepository;Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/analytics/AnalyticsHelper;Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/MapLastParamsHelper;Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/pins/ViewedPinsStorage;)V", "", "onCleared", "()V", "", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/MapAction;", "actions", "send", "([Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/MapAction;)V", "Lze/w;", "()Lze/w;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/MapEvent;", "event", "onEvent", "(Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/MapEvent;)V", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/MapEvent$OnBind;", "onBind", "(Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/MapEvent$OnBind;)V", "initState", "refreshState", "onRefresh", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/MapEvent$OnUpdate;", "onUpdate", "(Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/MapEvent$OnUpdate;)V", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/MapEvent$OnRemoveView;", "onRemoveView", "(Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/MapEvent$OnRemoveView;)V", "cancelAllJobs", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/MapEvent$OnMapReady;", "onMapReady", "(Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/MapEvent$OnMapReady;)V", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/MapEvent$OnMoveMap;", "onMoveMap", "(Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/MapEvent$OnMoveMap;)V", "onClickMap", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/MapEvent$OnClickPin;", "onClickPin", "(Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/MapEvent$OnClickPin;)V", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/MapEvent$OnClickCard;", "onClickCard", "(Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/MapEvent$OnClickCard;)V", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO;", "newVo", "syncPolygonsState", "(Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO;Lkotlin/coroutines/d;)Ljava/lang/Object;", "onClickPolygonPanel", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/MapEvent$OnClickPolygonBadge;", "onClickPolygonBadge", "(Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/MapEvent$OnClickPolygonBadge;)V", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/MapEvent$OnFinishDrawPins;", "onFinishDrawPins", "(Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/MapEvent$OnFinishDrawPins;)V", "", "", "pinsOnMap", "checkEmptyState", "(Ljava/util/List;)V", "onClickNotificationBar", "onSwipeCardDown", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/MapEvent$OnSlideImage;", "onSlideImage", "(Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/MapEvent$OnSlideImage;)V", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/MapEvent$OnSlideCard;", "onSlideCard", "(Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/MapEvent$OnSlideCard;)V", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO$Pin;", "selectedPin", "", "forceUpdate", "tryToShowCard", "(Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO$Pin;Z)V", "requiredIds", "", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO$Card;", "cards", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO$CardState;", "mapIdsToCardUiState", "(Ljava/util/List;Ljava/util/Map;)Ljava/util/List;", "downloadCards", "onStopPolling", "Lwe0/i;", "area", "", "zoom", "downloadPins", "(Lwe0/i;FLjava/util/List;)V", "polygonsOnMap", "fetchHotels", "(Lwe0/i;FLjava/util/List;Ljava/util/List;)V", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/FetchPinsActionResponseVO;", "update", "isNeedDrawPolygons", "fetchState", "(Lwe0/i;Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/FetchPinsActionResponseVO;FZ)V", "fetchCards", "(Ljava/util/Map;Ljava/util/List;)V", "invalidateCardsCache", "showCard", "showLoaderWithDelay", "hideLoader", "showCardsWithPriceLoader", "showCardsLoaderWithDelay", "hideCardLoader", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/pins/PinManager;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/UpdateHotelsManager;", "Lru/ozon/app/android/travel/feature/hotels/map/shared/presentation/polygons/PolygonsRepository;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/analytics/AnalyticsHelper;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/MapLastParamsHelper;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/pins/ViewedPinsStorage;", "vo", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO;", "isRefresh", "Z", "isRestore", "isMapReady", "Lxe/B0;", "downloadCardsJob", "Lxe/B0;", "downloadPinsJob", "fetchJob", "loaderJob", "cardLoaderJob", "isStopUpdates", "Ljava/util/Comparator;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO$Pin$InnerPin;", "Lkotlin/Comparator;", "comparatorForCardsRequest", "Ljava/util/Comparator;", "isPolling", "isEmptyState", "isProcessingPinClick", "Landroid/os/Parcelable;", "cardsRvState", "Landroid/os/Parcelable;", "Lxe/M;", "scope", "Lxe/M;", "Lze/h;", "actionChannel", "Lze/h;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/polygons/PolygonsManager;", "polygonManager", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/polygons/PolygonsManager;", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsMapInfoV4ViewModel extends w0 {

    @NotNull
    private final h<MapAction> actionChannel;

    @NotNull
    private final AnalyticsHelper analyticsHelper;
    private B0 cardLoaderJob;
    private Parcelable cardsRvState;

    @NotNull
    private final Comparator<HotelsMapInfoV4VO.Pin.InnerPin> comparatorForCardsRequest;
    private B0 downloadCardsJob;
    private B0 downloadPinsJob;
    private B0 fetchJob;
    private volatile boolean isEmptyState;
    private boolean isMapReady;
    private volatile boolean isPolling;
    private boolean isProcessingPinClick;
    private boolean isRefresh;
    private boolean isRestore;
    private boolean isStopUpdates;
    private B0 loaderJob;

    @NotNull
    private final MapLastParamsHelper mapLastParamsHelper;

    @NotNull
    private final PinManager pinManager;

    @NotNull
    private final PolygonsManager polygonManager;

    @NotNull
    private final PolygonsRepository polygonsRepository;

    @NotNull
    private final M scope;

    @NotNull
    private final UpdateHotelsManager updateHotelsManager;

    @NotNull
    private final ViewedPinsStorage viewedPinsStorage;
    private HotelsMapInfoV4VO vo;

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    @e(c = "ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.HotelsMapInfoV4ViewModel$1", f = "HotelsMapInfoV4ViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.HotelsMapInfoV4ViewModel$1, reason: invalid class name */
    static final class AnonymousClass1 extends j implements Function2<Long, d<? super Unit>, Object> {
        int label;

        AnonymousClass1(d<? super AnonymousClass1> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return HotelsMapInfoV4ViewModel.this.new AnonymousClass1(dVar);
        }

        public final Object invoke(long j11, d<? super Unit> dVar) {
            return ((AnonymousClass1) create(Long.valueOf(j11), dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            HotelsMapInfoV4ViewModel.this.invalidateCardsCache();
            return Unit.f71690a;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Long l11, d<? super Unit> dVar) {
            return invoke(l11.longValue(), dVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LAe/i;", "", "", "error", "", "<anonymous>", "(LAe/i;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 0, 0})
    @e(c = "ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.HotelsMapInfoV4ViewModel$2", f = "HotelsMapInfoV4ViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.HotelsMapInfoV4ViewModel$2, reason: invalid class name */
    static final class AnonymousClass2 extends j implements InterfaceC6511n<InterfaceC2397i<? super Long>, Throwable, d<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        AnonymousClass2(d<? super AnonymousClass2> dVar) {
            super(3, dVar);
        }

        @Override // fd.InterfaceC6511n
        public final Object invoke(InterfaceC2397i<? super Long> interfaceC2397i, Throwable th2, d<? super Unit> dVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(dVar);
            anonymousClass2.L$0 = interfaceC2397i;
            anonymousClass2.L$1 = th2;
            return anonymousClass2.invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            ThrowableExtKt.log((Throwable) this.L$1, ((InterfaceC2397i) this.L$0).getClass().getSimpleName().concat("_userChangedFlow"));
            return Unit.f71690a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "event", "Lru/ozon/app/android/favorites/domain/favoritemanager/model/FavoriteEvent;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @e(c = "ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.HotelsMapInfoV4ViewModel$3", f = "HotelsMapInfoV4ViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.HotelsMapInfoV4ViewModel$3, reason: invalid class name */
    static final class AnonymousClass3 extends j implements Function2<FavoriteEvent, d<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        AnonymousClass3(d<? super AnonymousClass3> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            AnonymousClass3 anonymousClass3 = HotelsMapInfoV4ViewModel.this.new AnonymousClass3(dVar);
            anonymousClass3.L$0 = obj;
            return anonymousClass3;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            boolean z11;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            FavoriteEvent favoriteEvent = (FavoriteEvent) this.L$0;
            if (favoriteEvent instanceof FavoriteAdd) {
                new MapAction.ToggleNotification(null);
                z11 = true;
            } else {
                if (!(favoriteEvent instanceof FavoriteRemove)) {
                    throw new o();
                }
                z11 = false;
            }
            HotelsMapInfoV4VO.Pin pinFavoriteStatus = HotelsMapInfoV4ViewModel.this.pinManager.setPinFavoriteStatus(HotelsMapInfoV4ViewModel.this.vo, String.valueOf(favoriteEvent.getSku()), z11);
            if (pinFavoriteStatus != null) {
                HotelsMapInfoV4ViewModel hotelsMapInfoV4ViewModel = HotelsMapInfoV4ViewModel.this;
                if (hotelsMapInfoV4ViewModel.isMapReady) {
                    hotelsMapInfoV4ViewModel.send(new MapAction.UpdatePin(pinFavoriteStatus));
                    AnalyticsHelper analyticsHelper = hotelsMapInfoV4ViewModel.analyticsHelper;
                    HotelsMapInfoV4VO hotelsMapInfoV4VO = hotelsMapInfoV4ViewModel.vo;
                    analyticsHelper.trackFavoriteChange(hotelsMapInfoV4VO != null ? hotelsMapInfoV4VO.getCards().get(pinFavoriteStatus.getId()) : null, pinFavoriteStatus, z11);
                }
            }
            return Unit.f71690a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FavoriteEvent favoriteEvent, d<? super Unit> dVar) {
            return ((AnonymousClass3) create(favoriteEvent, dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LAe/i;", "Lru/ozon/app/android/favorites/domain/favoritemanager/model/FavoriteEvent;", "", "error", "", "<anonymous>", "(LAe/i;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 0, 0})
    @e(c = "ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.HotelsMapInfoV4ViewModel$4", f = "HotelsMapInfoV4ViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.HotelsMapInfoV4ViewModel$4, reason: invalid class name */
    static final class AnonymousClass4 extends j implements InterfaceC6511n<InterfaceC2397i<? super FavoriteEvent>, Throwable, d<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        AnonymousClass4(d<? super AnonymousClass4> dVar) {
            super(3, dVar);
        }

        @Override // fd.InterfaceC6511n
        public final Object invoke(InterfaceC2397i<? super FavoriteEvent> interfaceC2397i, Throwable th2, d<? super Unit> dVar) {
            AnonymousClass4 anonymousClass4 = new AnonymousClass4(dVar);
            anonymousClass4.L$0 = interfaceC2397i;
            anonymousClass4.L$1 = th2;
            return anonymousClass4.invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            ThrowableExtKt.log((Throwable) this.L$1, ((InterfaceC2397i) this.L$0).getClass().getSimpleName().concat("_onFavoriteChangeFlow"));
            return Unit.f71690a;
        }
    }

    public HotelsMapInfoV4ViewModel(@NotNull FavoriteManager favoriteManager, @NotNull CoroutineDispatcherProvider dispatchersProvider, @NotNull InterfaceC2395h<Long> userChangedFlow, @NotNull PinManager pinManager, @NotNull UpdateHotelsManager updateHotelsManager, @NotNull PolygonsRepository polygonsRepository, @NotNull AnalyticsHelper analyticsHelper, @NotNull MapLastParamsHelper mapLastParamsHelper, @NotNull ViewedPinsStorage viewedPinsStorage) {
        Intrinsics.checkNotNullParameter(favoriteManager, "favoriteManager");
        Intrinsics.checkNotNullParameter(dispatchersProvider, "dispatchersProvider");
        Intrinsics.checkNotNullParameter(userChangedFlow, "userChangedFlow");
        Intrinsics.checkNotNullParameter(pinManager, "pinManager");
        Intrinsics.checkNotNullParameter(updateHotelsManager, "updateHotelsManager");
        Intrinsics.checkNotNullParameter(polygonsRepository, "polygonsRepository");
        Intrinsics.checkNotNullParameter(analyticsHelper, "analyticsHelper");
        Intrinsics.checkNotNullParameter(mapLastParamsHelper, "mapLastParamsHelper");
        Intrinsics.checkNotNullParameter(viewedPinsStorage, "viewedPinsStorage");
        this.pinManager = pinManager;
        this.updateHotelsManager = updateHotelsManager;
        this.polygonsRepository = polygonsRepository;
        this.analyticsHelper = analyticsHelper;
        this.mapLastParamsHelper = mapLastParamsHelper;
        this.viewedPinsStorage = viewedPinsStorage;
        final Comparator comparator = new Comparator() { // from class: ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.HotelsMapInfoV4ViewModel$special$$inlined$compareBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t2, T t11) {
                return Vc.a.b(Float.valueOf(((HotelsMapInfoV4VO.Pin.InnerPin) t2).getRank()), Float.valueOf(((HotelsMapInfoV4VO.Pin.InnerPin) t11).getRank()));
            }
        };
        this.comparatorForCardsRequest = new Comparator() { // from class: ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.HotelsMapInfoV4ViewModel$special$$inlined$thenBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t2, T t11) {
                int compare = comparator.compare(t2, t11);
                return compare != 0 ? compare : Vc.a.b(((HotelsMapInfoV4VO.Pin.InnerPin) t2).getId(), ((HotelsMapInfoV4VO.Pin.InnerPin) t11).getId());
            }
        };
        this.isPolling = true;
        C2862e g10 = N.g(x0.a(this), dispatchersProvider.getDefault());
        this.scope = g10;
        C11115c a11 = k.a(-2, 6, null);
        this.actionChannel = a11;
        this.polygonManager = new PolygonsManager(g10, a11, polygonsRepository, analyticsHelper);
        C2399j.C(new C(new C2408n0(userChangedFlow, new AnonymousClass1(null)), new AnonymousClass2(null)), g10);
        C2399j.C(new C(new C2408n0(favoriteManager.onFavoriteChangeFlow(), new AnonymousClass3(null)), new AnonymousClass4(null)), g10);
    }

    private final void cancelAllJobs() {
        B0 b02 = this.downloadPinsJob;
        if (b02 != null) {
            b02.j(null);
        }
        B0 b03 = this.fetchJob;
        if (b03 != null) {
            b03.j(null);
        }
        B0 b04 = this.downloadCardsJob;
        if (b04 != null) {
            b04.j(null);
        }
    }

    private final void checkEmptyState(List<String> pinsOnMap) {
        if (this.isEmptyState) {
            return;
        }
        if (this.isPolling || !pinsOnMap.isEmpty()) {
            send(new MapAction.ToggleNotification(null));
        } else {
            HotelsMapInfoV4VO hotelsMapInfoV4VO = this.vo;
            send(new MapAction.ToggleNotification(hotelsMapInfoV4VO != null ? hotelsMapInfoV4VO.getOutOfBoundsBar() : null));
        }
    }

    private final void downloadCards(List<String> requiredIds) {
        B0 b02 = this.downloadCardsJob;
        if (b02 != null) {
            b02.j(null);
        }
        this.downloadCardsJob = C10727i.c(this.scope, null, null, new HotelsMapInfoV4ViewModel$downloadCards$1(this, requiredIds, null), 3);
    }

    private final void downloadPins(i area, float zoom, List<String> pinsOnMap) {
        B0 b02 = this.downloadPinsJob;
        if (b02 != null) {
            b02.j(null);
        }
        if (this.isStopUpdates) {
            return;
        }
        this.downloadPinsJob = C10727i.c(this.scope, null, null, new HotelsMapInfoV4ViewModel$downloadPins$1(this, pinsOnMap, area, zoom, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fetchCards(Map<String, HotelsMapInfoV4VO.Card> update, List<String> requiredIds) {
        Map linkedHashMap;
        hideCardLoader();
        if (update == null || update.isEmpty()) {
            send(new MapAction.ToggleCard(null, null, 2, null));
            return;
        }
        List<HotelsMapInfoV4VO.CardState> mapIdsToCardUiState = mapIdsToCardUiState(requiredIds, update);
        if (this.pinManager.getPreviousSelectedPin() != null) {
            showCard(mapIdsToCardUiState);
        }
        HotelsMapInfoV4VO hotelsMapInfoV4VO = this.vo;
        if (hotelsMapInfoV4VO == null || (linkedHashMap = hotelsMapInfoV4VO.getCards()) == null) {
            linkedHashMap = new LinkedHashMap();
        }
        for (HotelsMapInfoV4VO.CardState cardState : mapIdsToCardUiState) {
            if (cardState instanceof HotelsMapInfoV4VO.Card) {
                HotelsMapInfoV4VO.Card card = (HotelsMapInfoV4VO.Card) cardState;
                if (card.getPrice() != null && !this.isPolling) {
                    linkedHashMap.put(card.getId(), cardState);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fetchHotels(i area, float zoom, List<String> pinsOnMap, List<String> polygonsOnMap) {
        B0 b02 = this.fetchJob;
        if (b02 != null) {
            b02.j(null);
        }
        this.fetchJob = C10727i.c(this.scope, null, null, new HotelsMapInfoV4ViewModel$fetchHotels$1(this, pinsOnMap, area, polygonsOnMap, zoom, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fetchState(i area, FetchPinsActionResponseVO update, float zoom, boolean isNeedDrawPolygons) {
        ConcurrentHashMap<String, HotelsMapInfoV4VO.Pin> concurrentHashMap;
        i iVar;
        ConcurrentHashMap<String, DistrictsVO.Polygon> polygons;
        HotelsMapInfoV4DTO.PinLimits pinLimits;
        if (update == null) {
            return;
        }
        HotelsMapInfoV4VO hotelsMapInfoV4VO = this.vo;
        if (hotelsMapInfoV4VO == null || (concurrentHashMap = hotelsMapInfoV4VO.getPins()) == null) {
            concurrentHashMap = new ConcurrentHashMap<>();
        }
        ConcurrentHashMap<String, HotelsMapInfoV4VO.Pin> concurrentHashMap2 = concurrentHashMap;
        HotelsMapInfoV4VO hotelsMapInfoV4VO2 = this.vo;
        int cachedPinIdsLimit = (hotelsMapInfoV4VO2 == null || (pinLimits = hotelsMapInfoV4VO2.getPinLimits()) == null) ? 20000 : pinLimits.getCachedPinIdsLimit();
        if (cachedPinIdsLimit < concurrentHashMap2.size()) {
            concurrentHashMap2.clear();
        }
        AtomAction nextAction = update.getNextAction();
        this.isPolling = (nextAction instanceof AtomAction.ComposerAction ? (AtomAction.ComposerAction) nextAction : null) != null;
        Iterator<Map.Entry<String, HotelsMapInfoV4VO.Pin>> it = update.getPins().entrySet().iterator();
        while (it.hasNext() && concurrentHashMap2.size() <= cachedPinIdsLimit) {
            Map.Entry<String, HotelsMapInfoV4VO.Pin> next = it.next();
            HotelsMapInfoV4VO.Pin pin = concurrentHashMap2.get(next.getKey());
            if (pin == null || pin.getCacheHash() != next.getValue().getCacheHash()) {
                HotelsMapInfoV4VO.Pin previousSelectedPin = this.pinManager.getPreviousSelectedPin();
                boolean d11 = Intrinsics.d(next.getKey(), previousSelectedPin != null ? previousSelectedPin.getId() : null);
                boolean z11 = pin != null && pin.getIsViewed();
                String key = next.getKey();
                HotelsMapInfoV4VO.Pin value = next.getValue();
                if (d11 || z11) {
                    value = null;
                }
                HotelsMapInfoV4VO.Pin pin2 = value;
                if (pin2 == null) {
                    pin2 = r15.copy((r35 & 1) != 0 ? r15.id : null, (r35 & 2) != 0 ? r15.rank : 0.0f, (r35 & 4) != 0 ? r15.coords : null, (r35 & 8) != 0 ? r15.geohash : 0L, (r35 & 16) != 0 ? r15.title : null, (r35 & 32) != 0 ? r15.price : null, (r35 & 64) != 0 ? r15.hasDiscount : false, (r35 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? r15.isFavorite : false, (r35 & 256) != 0 ? r15.isViewed : z11, (r35 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? r15.isSelected : d11, (r35 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? r15.isTop : false, (r35 & 2048) != 0 ? r15.sku : null, (r35 & 4096) != 0 ? r15.rightIconId : null, (r35 & 8192) != 0 ? r15.leftIconId : null, (r35 & 16384) != 0 ? r15.isIndivisiblePin : false, (r35 & 32768) != 0 ? next.getValue().innerIds : null);
                }
                concurrentHashMap2.put(key, pin2);
            }
        }
        HotelsMapInfoV4VO hotelsMapInfoV4VO3 = this.vo;
        if (hotelsMapInfoV4VO3 != null) {
            this.vo = HotelsMapInfoV4VO.copy$default(hotelsMapInfoV4VO3, 0L, null, null, null, null, null, new HotelsMapInfoV4VO.DownloadPinsAction(update.getNextAction(), update.getNextFetchInterval()), null, null, null, concurrentHashMap2, null, null, null, null, null, null, null, null, null, false, 2096063, null);
            DistrictsVO districts = hotelsMapInfoV4VO3.getDistricts();
            if (districts != null && (polygons = districts.getPolygons()) != null) {
                polygons.putAll(update.getPolygons());
            }
        }
        if (isNeedDrawPolygons) {
            iVar = area;
            this.polygonManager.togglePolygons(this.vo, iVar, zoom);
        } else {
            iVar = area;
        }
        HotelsMapInfoV4VO hotelsMapInfoV4VO4 = this.vo;
        if (hotelsMapInfoV4VO4 != null) {
            this.pinManager.clustering(hotelsMapInfoV4VO4.getPins(), iVar, hotelsMapInfoV4VO4.getPinsDisplaySettings().getLatitudeCellPxSize(), hotelsMapInfoV4VO4.getPinsDisplaySettings().getLongitudeCellPxSize(), Float.valueOf(zoom), new HotelsMapInfoV4ViewModel$fetchState$3$1(this));
        }
    }

    private final void hideCardLoader() {
        B0 b02 = this.cardLoaderJob;
        if (b02 != null) {
            b02.j(null);
        }
        this.cardLoaderJob = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void hideLoader() {
        B0 b02 = this.loaderJob;
        if (b02 != null) {
            b02.j(null);
        }
        this.loaderJob = null;
        send(new MapAction.ToggleLoader(false));
        this.analyticsHelper.trackLoaderStatus(false);
    }

    private final void initState(MapEvent.OnBind event) {
        if (!this.isRestore) {
            this.pinManager.setPriorityPinsInCluster(event.getVo().getPinsDisplaySettings());
            this.pinManager.toggleIndivisibleClusters(event.getVo().getIsNewVersion());
            C10727i.c(this.scope, null, null, new HotelsMapInfoV4ViewModel$initState$2(this, event, null), 3);
        } else {
            HotelsMapInfoV4VO hotelsMapInfoV4VO = this.vo;
            if (hotelsMapInfoV4VO != null) {
                send(new MapAction.InitState(hotelsMapInfoV4VO, this.mapLastParamsHelper.getCachedVisibleArea(), this.isRestore));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void invalidateCardsCache() {
        ConcurrentHashMap<String, HotelsMapInfoV4VO.Card> cards;
        HotelsMapInfoV4VO hotelsMapInfoV4VO = this.vo;
        if (hotelsMapInfoV4VO == null || (cards = hotelsMapInfoV4VO.getCards()) == null) {
            return;
        }
        cards.clear();
    }

    private final List<HotelsMapInfoV4VO.CardState> mapIdsToCardUiState(List<String> requiredIds, Map<String, HotelsMapInfoV4VO.Card> cards) {
        HotelsMapInfoV4VO.CardState copy$default;
        List<String> list = requiredIds;
        ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
        for (String str : list) {
            HotelsMapInfoV4VO.Card card = cards != null ? cards.get(str) : null;
            boolean z11 = requiredIds.size() > 1;
            if (card == null) {
                copy$default = new HotelsMapInfoV4VO.Loader(str, z11);
            } else if (card.getPrice() == null && this.isPolling) {
                copy$default = new HotelsMapInfoV4VO.PriceLoader(str, z11, card);
            } else if (card.getPrice() == null && card.getPriceText() == null) {
                this.isPolling = true;
                copy$default = new HotelsMapInfoV4VO.Loader(str, z11);
            } else {
                copy$default = HotelsMapInfoV4VO.Card.copy$default(card, null, z11, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, 524285, null);
            }
            arrayList.add(copy$default);
        }
        return arrayList;
    }

    private final void onBind(MapEvent.OnBind event) {
        this.isStopUpdates = false;
        this.analyticsHelper.setWidgetId(event.getVo().getId());
        this.analyticsHelper.setEvents(event.getVo().getTrackingEvents());
        this.analyticsHelper.setStartPoint(event.getVo().getCenterLatLng());
        this.analyticsHelper.setPinIcons(event.getVo().getPinTypes().getHighRanked().getDefault().getIcons(), event.getVo().getPinTypes().getHighRanked().getDefault().getFavoriteIcon());
        if (this.isRefresh) {
            refreshState(event);
        } else {
            initState(event);
        }
    }

    private final void onClickCard(MapEvent.OnClickCard event) {
        ConcurrentHashMap<String, HotelsMapInfoV4VO.Pin> pins;
        this.viewedPinsStorage.addViewedPin(event.getCard().getId());
        AnalyticsHelper analyticsHelper = this.analyticsHelper;
        HotelsMapInfoV4VO.Card card = event.getCard();
        HotelsMapInfoV4VO hotelsMapInfoV4VO = this.vo;
        analyticsHelper.trackCardClick(card, (hotelsMapInfoV4VO == null || (pins = hotelsMapInfoV4VO.getPins()) == null) ? null : pins.get(event.getCard().getId()));
    }

    private final void onClickMap() {
        HotelsMapInfoV4VO.Pin unselectPin = this.pinManager.unselectPin(this.vo);
        if (unselectPin != null) {
            send(new MapAction.UpdatePin(unselectPin), new MapAction.ToggleCard(null, null, 2, null));
        }
    }

    private final void onClickNotificationBar() {
        n visibleRegion;
        HotelsMapInfoV4VO hotelsMapInfoV4VO = this.vo;
        if (hotelsMapInfoV4VO == null || (visibleRegion = hotelsMapInfoV4VO.getVisibleRegion()) == null) {
            return;
        }
        send(new MapAction.Move(visibleRegion));
    }

    private final void onClickPin(MapEvent.OnClickPin event) {
        this.isProcessingPinClick = true;
        C10727i.c(this.scope, null, null, new HotelsMapInfoV4ViewModel$onClickPin$1(this, null), 3);
        HotelsMapInfoV4VO.Pin previousSelectedPin = this.pinManager.getPreviousSelectedPin();
        if (Intrinsics.d(previousSelectedPin != null ? previousSelectedPin.getId() : null, event.getPin().getId())) {
            return;
        }
        HotelsMapInfoV4VO.Pin unselectPin = this.pinManager.unselectPin(this.vo);
        if (unselectPin != null) {
            send(new MapAction.UpdatePin(unselectPin), new MapAction.ToggleCard(null, null, 2, null));
        }
        HotelsMapInfoV4VO.Pin selectPin = this.pinManager.selectPin(this.vo, event.getPin());
        if (selectPin == null) {
            return;
        }
        send(new MapAction.UpdatePin(selectPin));
        tryToShowCard$default(this, selectPin, false, 2, null);
        this.analyticsHelper.trackPinClick(selectPin);
    }

    private final void onClickPolygonBadge(MapEvent.OnClickPolygonBadge event) {
        this.analyticsHelper.trackPolygonBadgeClick(event.getTokenizedEvent());
    }

    private final void onClickPolygonPanel() {
        this.polygonManager.onClickPolygonPanel(this.vo, this.mapLastParamsHelper.getCachedVisibleArea(), this.mapLastParamsHelper.getCachedZoom(), new HotelsMapInfoV4ViewModel$onClickPolygonPanel$1(this));
    }

    private final void onFinishDrawPins(MapEvent.OnFinishDrawPins event) {
        if (this.isPolling) {
            downloadPins(event.getVisibleArea(), event.getZoom(), event.getPinsOnMap());
        } else {
            hideLoader();
        }
        checkEmptyState(event.getPinsOnMap());
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onMapReady(MapEvent.OnMapReady event) {
        HotelsMapInfoV4VO.Pin pin;
        ConcurrentHashMap<String, HotelsMapInfoV4VO.Pin> pins;
        HotelsMapInfoV4VO.Pin copy;
        HotelsMapInfoV4VO.Pin pin2;
        ConcurrentHashMap<String, HotelsMapInfoV4VO.Pin> pins2;
        this.isMapReady = true;
        this.analyticsHelper.trackMapView(event.getVisibleArea(), event.getCenterPoint());
        this.pinManager.onMapReady(event.getVisibleArea(), event.getZoom());
        this.mapLastParamsHelper.onMapReady(event.getVisibleArea(), event.getZoom());
        HotelsMapInfoV4VO.Pin previousSelectedPin = this.pinManager.getPreviousSelectedPin();
        if (previousSelectedPin != null) {
            HotelsMapInfoV4VO hotelsMapInfoV4VO = this.vo;
            if (((hotelsMapInfoV4VO == null || (pins2 = hotelsMapInfoV4VO.getPins()) == null) ? null : pins2.get(previousSelectedPin.getId())) != null) {
                pin = previousSelectedPin;
                if (pin != null) {
                    this.pinManager.resetSelectedPin();
                    send(new MapAction.ToggleCard(null, null, 2, null));
                } else {
                    HotelsMapInfoV4VO hotelsMapInfoV4VO2 = this.vo;
                    if (hotelsMapInfoV4VO2 != null && (pins = hotelsMapInfoV4VO2.getPins()) != null) {
                        String id2 = pin.getId();
                        boolean isPinViewed = this.viewedPinsStorage.isPinViewed(pin.getId());
                        HotelsMapInfoV4VO hotelsMapInfoV4VO3 = this.vo;
                        copy = pin.copy((r35 & 1) != 0 ? pin.id : null, (r35 & 2) != 0 ? pin.rank : 0.0f, (r35 & 4) != 0 ? pin.coords : null, (r35 & 8) != 0 ? pin.geohash : 0L, (r35 & 16) != 0 ? pin.title : null, (r35 & 32) != 0 ? pin.price : null, (r35 & 64) != 0 ? pin.hasDiscount : false, (r35 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? pin.isFavorite : (hotelsMapInfoV4VO3 == null || (pin2 = hotelsMapInfoV4VO3.getPins().get(pin.getId())) == null || !pin2.getIsFavorite()) ? false : true, (r35 & 256) != 0 ? pin.isViewed : isPinViewed, (r35 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? pin.isSelected : true, (r35 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? pin.isTop : false, (r35 & 2048) != 0 ? pin.sku : null, (r35 & 4096) != 0 ? pin.rightIconId : null, (r35 & 8192) != 0 ? pin.leftIconId : null, (r35 & 16384) != 0 ? pin.isIndivisiblePin : false, (r35 & 32768) != 0 ? pin.innerIds : null);
                        pins.put(id2, copy);
                    }
                    tryToShowCard(pin, true);
                }
                this.polygonManager.togglePolygons(this.vo, event.getVisibleArea(), event.getZoom());
                if (!this.isRestore) {
                    fetchHotels(event.getVisibleArea(), event.getZoom(), event.getPinsOnMap(), event.getPolygonsOnMap());
                    this.isRestore = false;
                    return;
                } else {
                    HotelsMapInfoV4VO hotelsMapInfoV4VO4 = this.vo;
                    if (hotelsMapInfoV4VO4 != null) {
                        this.pinManager.clustering(hotelsMapInfoV4VO4.getPins(), event.getVisibleArea(), hotelsMapInfoV4VO4.getPinsDisplaySettings().getLatitudeCellPxSize(), hotelsMapInfoV4VO4.getPinsDisplaySettings().getLongitudeCellPxSize(), Float.valueOf(event.getZoom()), new HotelsMapInfoV4ViewModel$onMapReady$1$1(this, pin));
                    }
                    downloadPins(event.getVisibleArea(), event.getZoom(), event.getPinsOnMap());
                    return;
                }
            }
        }
        pin = null;
        if (pin != null) {
        }
        this.polygonManager.togglePolygons(this.vo, event.getVisibleArea(), event.getZoom());
        if (!this.isRestore) {
        }
    }

    private final void onMoveMap(MapEvent.OnMoveMap event) {
        if (!this.isMapReady || this.isProcessingPinClick) {
            return;
        }
        this.mapLastParamsHelper.setVisibleArea(event.getVisibleArea());
        this.analyticsHelper.trackMapView(event.getVisibleArea(), event.getCenterPoint());
        if (this.mapLastParamsHelper.getCachedZoom() != event.getZoom()) {
            this.mapLastParamsHelper.setZoom(event.getZoom());
        }
        HotelsMapInfoV4VO hotelsMapInfoV4VO = this.vo;
        if (hotelsMapInfoV4VO != null) {
            HotelsMapInfoV4VO.Pin unselectPin = this.pinManager.unselectPin(hotelsMapInfoV4VO);
            if (unselectPin != null) {
                send(new MapAction.ToggleCard(null, null, 2, null), new MapAction.UpdatePin(unselectPin));
            }
            if (this.pinManager.detectLargeMove(event.getVisibleArea(), event.getZoom())) {
                this.polygonManager.togglePolygons(this.vo, event.getVisibleArea(), event.getZoom());
                this.pinManager.clustering(hotelsMapInfoV4VO.getPins(), event.getVisibleArea(), hotelsMapInfoV4VO.getPinsDisplaySettings().getLatitudeCellPxSize(), hotelsMapInfoV4VO.getPinsDisplaySettings().getLongitudeCellPxSize(), Float.valueOf(event.getZoom()), new HotelsMapInfoV4ViewModel$onMoveMap$1$2(this, event));
            }
        }
    }

    private final void onRefresh() {
        this.isRefresh = true;
        this.isEmptyState = false;
        cancelAllJobs();
        this.pinManager.resetSelectedPin();
        this.polygonManager.onRefresh();
    }

    private final void onRemoveView(MapEvent.OnRemoveView event) {
        this.cardsRvState = event.getCardsRvState();
        cancelAllJobs();
        this.isRefresh = false;
        this.isMapReady = false;
        this.isRestore = true;
        this.isProcessingPinClick = false;
        this.polygonManager.onStop();
    }

    private final void onSlideCard(MapEvent.OnSlideCard event) {
        this.analyticsHelper.trackCardView(event.getInfo(), this.pinManager.getPreviousSelectedPin());
    }

    private final void onSlideImage(MapEvent.OnSlideImage event) {
        this.analyticsHelper.trackSlideImage(event.getTokenizedEvent(), event.getImagePosition());
    }

    private final void onStopPolling() {
        this.isStopUpdates = true;
    }

    private final void onSwipeCardDown() {
        HotelsMapInfoV4VO.Pin unselectPin = this.pinManager.unselectPin(this.vo);
        if (unselectPin != null) {
            send(new MapAction.UpdatePin(unselectPin));
        }
    }

    private final void onUpdate(MapEvent.OnUpdate event) {
        WindowInsetsWrapper update = event.getUpdate();
        HotelsMapInfoV4VO hotelsMapInfoV4VO = this.vo;
        if (Intrinsics.d(update, hotelsMapInfoV4VO != null ? hotelsMapInfoV4VO.getInsetsWrapper() : null)) {
            return;
        }
        HotelsMapInfoV4VO hotelsMapInfoV4VO2 = this.vo;
        this.vo = hotelsMapInfoV4VO2 != null ? HotelsMapInfoV4VO.copy$default(hotelsMapInfoV4VO2, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, event.getUpdate(), null, null, null, false, 2031615, null) : null;
        send(new MapAction.UpdateInsets(event.getUpdate().getInsets()));
    }

    private final void refreshState(MapEvent.OnBind event) {
        this.isRefresh = false;
        C10727i.c(this.scope, null, null, new HotelsMapInfoV4ViewModel$refreshState$1(this, event, !Intrinsics.d(this.vo != null ? r0.getRegionHash() : null, event.getVo().getRegionHash()), null), 3);
    }

    private final void showCard(List<? extends HotelsMapInfoV4VO.CardState> cards) {
        if (this.isPolling) {
            send(new MapAction.ToggleCard(cards, this.cardsRvState));
        } else {
            ArrayList arrayList = new ArrayList();
            for (Object obj : cards) {
                if (((HotelsMapInfoV4VO.CardState) obj) instanceof HotelsMapInfoV4VO.Card) {
                    arrayList.add(obj);
                }
            }
            send(new MapAction.ToggleCard(arrayList, this.cardsRvState));
        }
        this.cardsRvState = null;
    }

    private final void showCardsLoaderWithDelay(List<? extends HotelsMapInfoV4VO.CardState> cards) {
        this.cardLoaderJob = C10727i.c(this.scope, null, null, new HotelsMapInfoV4ViewModel$showCardsLoaderWithDelay$1(this, cards, null), 3);
    }

    private final void showCardsWithPriceLoader(List<? extends HotelsMapInfoV4VO.CardState> cards) {
        send(new MapAction.ToggleCard(cards, null, 2, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showLoaderWithDelay() {
        this.loaderJob = C10727i.c(this.scope, null, null, new HotelsMapInfoV4ViewModel$showLoaderWithDelay$1(this, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object syncPolygonsState(HotelsMapInfoV4VO hotelsMapInfoV4VO, d<? super Unit> dVar) {
        HotelsMapInfoV4ViewModel$syncPolygonsState$1 hotelsMapInfoV4ViewModel$syncPolygonsState$1;
        int i11;
        HotelsMapInfoV4ViewModel hotelsMapInfoV4ViewModel;
        ConcurrentHashMap<String, DistrictsVO.Polygon> polygons;
        DistrictsVO districts;
        ConcurrentHashMap<String, DistrictsVO.Polygon> polygons2;
        DistrictsVO districts2;
        HotelsMapInfoV4VO hotelsMapInfoV4VO2 = hotelsMapInfoV4VO;
        if (dVar instanceof HotelsMapInfoV4ViewModel$syncPolygonsState$1) {
            hotelsMapInfoV4ViewModel$syncPolygonsState$1 = (HotelsMapInfoV4ViewModel$syncPolygonsState$1) dVar;
            int i12 = hotelsMapInfoV4ViewModel$syncPolygonsState$1.label;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                hotelsMapInfoV4ViewModel$syncPolygonsState$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = hotelsMapInfoV4ViewModel$syncPolygonsState$1.result;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = hotelsMapInfoV4ViewModel$syncPolygonsState$1.label;
                if (i11 != 0) {
                    s.b(obj);
                    PolygonsManager polygonsManager = this.polygonManager;
                    hotelsMapInfoV4ViewModel$syncPolygonsState$1.L$0 = this;
                    hotelsMapInfoV4ViewModel$syncPolygonsState$1.L$1 = hotelsMapInfoV4VO2;
                    hotelsMapInfoV4ViewModel$syncPolygonsState$1.label = 1;
                    obj = polygonsManager.isPolygonEnabled(hotelsMapInfoV4VO2, hotelsMapInfoV4ViewModel$syncPolygonsState$1);
                    if (obj == aVar) {
                        return aVar;
                    }
                    hotelsMapInfoV4ViewModel = this;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    hotelsMapInfoV4VO2 = (HotelsMapInfoV4VO) hotelsMapInfoV4ViewModel$syncPolygonsState$1.L$1;
                    hotelsMapInfoV4ViewModel = (HotelsMapInfoV4ViewModel) hotelsMapInfoV4ViewModel$syncPolygonsState$1.L$0;
                    s.b(obj);
                }
                HotelsMapInfoV4VO hotelsMapInfoV4VO3 = hotelsMapInfoV4VO2;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                HotelsMapInfoV4VO hotelsMapInfoV4VO4 = hotelsMapInfoV4ViewModel.vo;
                polygons = (hotelsMapInfoV4VO4 != null || (districts2 = hotelsMapInfoV4VO4.getDistricts()) == null) ? null : districts2.getPolygons();
                DistrictsVO districts3 = hotelsMapInfoV4VO3.getDistricts();
                HotelsMapInfoV4VO copy$default = HotelsMapInfoV4VO.copy$default(hotelsMapInfoV4VO3, 0L, null, null, null, null, null, null, null, null, null, null, null, districts3 != null ? DistrictsVOKt.setToggle(districts3, booleanValue) : null, null, null, null, null, null, null, null, false, 2093055, null);
                hotelsMapInfoV4ViewModel.vo = copy$default;
                if (polygons != null && copy$default != null && (districts = copy$default.getDistricts()) != null && (polygons2 = districts.getPolygons()) != null) {
                    polygons2.putAll(polygons);
                }
                return Unit.f71690a;
            }
        }
        hotelsMapInfoV4ViewModel$syncPolygonsState$1 = new HotelsMapInfoV4ViewModel$syncPolygonsState$1(this, dVar);
        Object obj2 = hotelsMapInfoV4ViewModel$syncPolygonsState$1.result;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = hotelsMapInfoV4ViewModel$syncPolygonsState$1.label;
        if (i11 != 0) {
        }
        HotelsMapInfoV4VO hotelsMapInfoV4VO32 = hotelsMapInfoV4VO2;
        boolean booleanValue2 = ((Boolean) obj2).booleanValue();
        HotelsMapInfoV4VO hotelsMapInfoV4VO42 = hotelsMapInfoV4ViewModel.vo;
        if (hotelsMapInfoV4VO42 != null) {
        }
        DistrictsVO districts32 = hotelsMapInfoV4VO32.getDistricts();
        HotelsMapInfoV4VO copy$default2 = HotelsMapInfoV4VO.copy$default(hotelsMapInfoV4VO32, 0L, null, null, null, null, null, null, null, null, null, null, null, districts32 != null ? DistrictsVOKt.setToggle(districts32, booleanValue2) : null, null, null, null, null, null, null, null, false, 2093055, null);
        hotelsMapInfoV4ViewModel.vo = copy$default2;
        if (polygons != null) {
            polygons2.putAll(polygons);
        }
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void tryToShowCard(HotelsMapInfoV4VO.Pin selectedPin, boolean forceUpdate) {
        Collection a02;
        ConcurrentHashMap<String, HotelsMapInfoV4VO.Pin> pins;
        if (selectedPin == null) {
            send(new MapAction.ToggleCard(null, null, 2, null));
            return;
        }
        if (selectedPin.getIsIndivisiblePin()) {
            List I02 = C7714v.I0(this.comparatorForCardsRequest, selectedPin.getInnerIds());
            a02 = new ArrayList(C7714v.z(I02, 10));
            Iterator it = I02.iterator();
            while (it.hasNext()) {
                a02.add(((HotelsMapInfoV4VO.Pin.InnerPin) it.next()).getId());
            }
        } else {
            a02 = C7714v.a0(selectedPin.getId());
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : a02) {
            String str = (String) obj;
            HotelsMapInfoV4VO hotelsMapInfoV4VO = this.vo;
            if (((hotelsMapInfoV4VO == null || (pins = hotelsMapInfoV4VO.getPins()) == null) ? null : pins.get(str)) != null) {
                arrayList.add(obj);
            }
        }
        HotelsMapInfoV4VO hotelsMapInfoV4VO2 = this.vo;
        List<HotelsMapInfoV4VO.CardState> mapIdsToCardUiState = mapIdsToCardUiState(arrayList, hotelsMapInfoV4VO2 != null ? hotelsMapInfoV4VO2.getCards() : null);
        if (forceUpdate) {
            downloadCards(arrayList);
            return;
        }
        List<HotelsMapInfoV4VO.CardState> list = mapIdsToCardUiState;
        boolean z11 = list instanceof Collection;
        if (!z11 || !list.isEmpty()) {
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                if (((HotelsMapInfoV4VO.CardState) it2.next()) instanceof HotelsMapInfoV4VO.Loader) {
                    showCardsLoaderWithDelay(mapIdsToCardUiState);
                    downloadCards(arrayList);
                    return;
                }
            }
        }
        if (!z11 || !list.isEmpty()) {
            Iterator<T> it3 = list.iterator();
            while (it3.hasNext()) {
                if (((HotelsMapInfoV4VO.CardState) it3.next()) instanceof HotelsMapInfoV4VO.PriceLoader) {
                    showCardsWithPriceLoader(mapIdsToCardUiState);
                    downloadCards(arrayList);
                    return;
                }
            }
        }
        showCard(mapIdsToCardUiState);
    }

    static /* synthetic */ void tryToShowCard$default(HotelsMapInfoV4ViewModel hotelsMapInfoV4ViewModel, HotelsMapInfoV4VO.Pin pin, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        hotelsMapInfoV4ViewModel.tryToShowCard(pin, z11);
    }

    @NotNull
    public final w<MapAction> actions() {
        return this.actionChannel;
    }

    @Override // androidx.lifecycle.w0
    protected void onCleared() {
        this.pinManager.onCleared();
        this.viewedPinsStorage.onCleared();
        super.onCleared();
    }

    public final void onEvent(@NotNull MapEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof MapEvent.OnBind) {
            onBind((MapEvent.OnBind) event);
            return;
        }
        if (event instanceof MapEvent.OnMapReady) {
            onMapReady((MapEvent.OnMapReady) event);
            return;
        }
        if (event instanceof MapEvent.OnMoveMap) {
            onMoveMap((MapEvent.OnMoveMap) event);
            return;
        }
        if (event instanceof MapEvent.OnClickCard) {
            onClickCard((MapEvent.OnClickCard) event);
            return;
        }
        if (event instanceof MapEvent.OnClickPin) {
            onClickPin((MapEvent.OnClickPin) event);
            return;
        }
        if (event instanceof MapEvent.OnClickPolygonBadge) {
            onClickPolygonBadge((MapEvent.OnClickPolygonBadge) event);
            return;
        }
        if (event instanceof MapEvent.OnUpdate) {
            onUpdate((MapEvent.OnUpdate) event);
            return;
        }
        if (event instanceof MapEvent.OnFinishDrawPins) {
            onFinishDrawPins((MapEvent.OnFinishDrawPins) event);
            return;
        }
        if (event instanceof MapEvent.OnSlideImage) {
            onSlideImage((MapEvent.OnSlideImage) event);
            return;
        }
        if (event instanceof MapEvent.OnSlideCard) {
            onSlideCard((MapEvent.OnSlideCard) event);
            return;
        }
        if (event instanceof MapEvent.OnRemoveView) {
            onRemoveView((MapEvent.OnRemoveView) event);
            return;
        }
        if (Intrinsics.d(event, MapEvent.OnRefresh.INSTANCE)) {
            onRefresh();
            return;
        }
        if (Intrinsics.d(event, MapEvent.OnClickMap.INSTANCE)) {
            onClickMap();
            return;
        }
        if (Intrinsics.d(event, MapEvent.OnClickPolygonPanel.INSTANCE)) {
            onClickPolygonPanel();
            return;
        }
        if (Intrinsics.d(event, MapEvent.OnClickNotificationBar.INSTANCE)) {
            onClickNotificationBar();
        } else if (Intrinsics.d(event, MapEvent.OnStopPollings.INSTANCE)) {
            onStopPolling();
        } else {
            if (!Intrinsics.d(event, MapEvent.OnSwipeCardDown.INSTANCE)) {
                throw new o();
            }
            onSwipeCardDown();
        }
    }

    public void send(@NotNull MapAction... actions) {
        Intrinsics.checkNotNullParameter(actions, "actions");
        C10727i.c(this.scope, null, null, new HotelsMapInfoV4ViewModel$send$1(actions, this, null), 3);
    }
}
