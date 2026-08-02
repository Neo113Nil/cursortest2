package ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.pins;

import Tc.d;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kd.InterfaceC7663b;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.hotels.map.shared.data.MapExtKt;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.HotelsMapInfoV4VO;
import xe.E0;
import xe.InterfaceC10733l;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0007¢\u0006\u0004\b\u0002\u0010\u0003Jc\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\r2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0018\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\r0\f¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R0\u0010\u0017\u001a\u001e\u0012\u0004\u0012\u00020\u0011\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00060\u0015j\b\u0012\u0004\u0012\u00020\u0006`\u00160\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/pins/IndivisiblePinsDetector;", "", "<init>", "()V", "Ljava/util/concurrent/ConcurrentHashMap;", "", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO$Pin;", "pins", "Lkd/b;", "", "latitudeRange", "longitudeRange", "Lxe/l;", "", "continuation", "findIndivisiblePins", "(Ljava/util/concurrent/ConcurrentHashMap;Lkd/b;Lkd/b;Lxe/l;)Ljava/util/Map;", "", "indivisibleMask", "J", "", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "clusters", "Ljava/util/Map;", "Companion", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class IndivisiblePinsDetector {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private final long indivisibleMask = UtilsKt.createPrecisionMask(19, 19);

    @NotNull
    private final Map<Long, HashSet<HotelsMapInfoV4VO.Pin>> clusters = new LinkedHashMap();

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/pins/IndivisiblePinsDetector$Companion;", "", "<init>", "()V", "INDIVISIBLE_DISTANCE_IN_BITS", "", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @NotNull
    public final Map<String, HotelsMapInfoV4VO.Pin> findIndivisiblePins(@NotNull ConcurrentHashMap<String, HotelsMapInfoV4VO.Pin> pins, @NotNull InterfaceC7663b<Double> latitudeRange, @NotNull InterfaceC7663b<Double> longitudeRange, @NotNull InterfaceC10733l<? super Map<String, HotelsMapInfoV4VO.Pin>> continuation) {
        HotelsMapInfoV4VO.Pin copy;
        Intrinsics.checkNotNullParameter(pins, "pins");
        Intrinsics.checkNotNullParameter(latitudeRange, "latitudeRange");
        Intrinsics.checkNotNullParameter(longitudeRange, "longitudeRange");
        Intrinsics.checkNotNullParameter(continuation, "continuation");
        this.clusters.clear();
        for (Map.Entry<String, HotelsMapInfoV4VO.Pin> entry : pins.entrySet()) {
            E0.f(continuation.getContext());
            if (MapExtKt.isInVisibleArea(entry.getValue().getCoords(), latitudeRange, longitudeRange)) {
                long geohash = entry.getValue().getGeohash() & this.indivisibleMask;
                Map<Long, HashSet<HotelsMapInfoV4VO.Pin>> map = this.clusters;
                Long valueOf = Long.valueOf(geohash);
                HashSet<HotelsMapInfoV4VO.Pin> hashSet = map.get(valueOf);
                if (hashSet == null) {
                    hashSet = new HashSet<>();
                    map.put(valueOf, hashSet);
                }
                HashSet<HotelsMapInfoV4VO.Pin> hashSet2 = hashSet;
                hashSet2.add(entry.getValue());
                this.clusters.put(Long.valueOf(geohash), hashSet2);
            }
        }
        d builder = new d(this.clusters.size());
        Iterator<Map.Entry<Long, HashSet<HotelsMapInfoV4VO.Pin>>> it = this.clusters.entrySet().iterator();
        while (it.hasNext()) {
            HashSet<HotelsMapInfoV4VO.Pin> value = it.next().getValue();
            if (value.size() == 1) {
                HotelsMapInfoV4VO.Pin pin = (HotelsMapInfoV4VO.Pin) C7714v.J(value);
                builder.put(pin.getId(), pin);
            } else if (value.size() > 1) {
                Object J11 = C7714v.J(value);
                ArrayList arrayList = new ArrayList(value.size());
                boolean z11 = true;
                boolean z12 = false;
                int i11 = Integer.MAX_VALUE;
                for (HotelsMapInfoV4VO.Pin pin2 : value) {
                    if (pin2.getPrice() != null && pin2.getPrice().intValue() < i11) {
                        i11 = pin2.getPrice().intValue();
                        J11 = pin2;
                    }
                    if (!pin2.getIsViewed()) {
                        z11 = false;
                    }
                    if (pin2.getIsFavorite()) {
                        z12 = true;
                    }
                    arrayList.add(new HotelsMapInfoV4VO.Pin.InnerPin(pin2.getId(), pin2.getRank()));
                }
                HotelsMapInfoV4VO.Pin pin3 = (HotelsMapInfoV4VO.Pin) J11;
                Integer valueOf2 = Integer.valueOf(i11);
                if (i11 == Integer.MAX_VALUE) {
                    valueOf2 = null;
                }
                copy = pin3.copy((r35 & 1) != 0 ? pin3.id : null, (r35 & 2) != 0 ? pin3.rank : 0.0f, (r35 & 4) != 0 ? pin3.coords : null, (r35 & 8) != 0 ? pin3.geohash : 0L, (r35 & 16) != 0 ? pin3.title : null, (r35 & 32) != 0 ? pin3.price : valueOf2, (r35 & 64) != 0 ? pin3.hasDiscount : false, (r35 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? pin3.isFavorite : z12, (r35 & 256) != 0 ? pin3.isViewed : z11, (r35 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? pin3.isSelected : false, (r35 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? pin3.isTop : false, (r35 & 2048) != 0 ? pin3.sku : null, (r35 & 4096) != 0 ? pin3.rightIconId : null, (r35 & 8192) != 0 ? pin3.leftIconId : null, (r35 & 16384) != 0 ? pin3.isIndivisiblePin : true, (r35 & 32768) != 0 ? pin3.innerIds : arrayList);
                builder.put(copy.getId(), copy);
            }
        }
        Intrinsics.checkNotNullParameter(builder, "builder");
        return builder.u();
    }
}
