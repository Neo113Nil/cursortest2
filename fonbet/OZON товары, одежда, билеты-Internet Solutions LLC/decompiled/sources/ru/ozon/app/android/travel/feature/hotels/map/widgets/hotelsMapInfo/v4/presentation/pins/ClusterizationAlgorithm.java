package ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.pins;

import Sc.r;
import Tc.d;
import Vc.a;
import android.content.Context;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.HotelsMapInfoV4VO;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.HotelsMapInfoV4VOKt;
import xe.E0;
import xe.InterfaceC10733l;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0010%\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0007\b \u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ1\u0010\u0016\u001a\u00020\f2\u0018\u0010\u0013\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u00100\u000f2\u0006\u0010\u0015\u001a\u00020\u0014H\u0004¢\u0006\u0004\b\u0016\u0010\u0017R*\u0010\u001a\u001a\u0012\u0012\u0004\u0012\u00020\u00120\u0018j\b\u0012\u0004\u0012\u00020\u0012`\u00198\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\"\u0010\u001e\u001a\u00020\u00068\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010$\u001a\u00020\u00068\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b$\u0010\u001f\u001a\u0004\b%\u0010!\"\u0004\b&\u0010#R$\u0010(\u001a\u0004\u0018\u00010'8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R$\u0010.\u001a\u0004\u0018\u00010'8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b.\u0010)\u001a\u0004\b/\u0010+\"\u0004\b0\u0010-R\u001a\u00101\u001a\u00020\u00068\u0004X\u0084\u0004¢\u0006\f\n\u0004\b1\u0010\u001f\u001a\u0004\b2\u0010!R\u001a\u00103\u001a\u00020\u00068\u0004X\u0084\u0004¢\u0006\f\n\u0004\b3\u0010\u001f\u001a\u0004\b4\u0010!R,\u00108\u001a\u0014\u0012\u0004\u0012\u000206\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001207058\u0004X\u0084\u0004¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R&\u0010<\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012058\u0004X\u0084\u0004¢\u0006\f\n\u0004\b<\u00109\u001a\u0004\b=\u0010;¨\u0006>"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/pins/ClusterizationAlgorithm;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "originalSize", "calculateClusterSize", "(I)I", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO$PinsDisplaySettings;", "settings", "", "setPriorityPinsInCluster", "(Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO$PinsDisplaySettings;)V", "Lxe/l;", "", "", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO$Pin;", "continuation", "", "areAllPinsPoints", "rankPinInClusters", "(Lxe/l;Z)V", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "comparator", "Ljava/util/Comparator;", "getComparator", "()Ljava/util/Comparator;", "priorityPinsCountMin", "I", "getPriorityPinsCountMin", "()I", "setPriorityPinsCountMin", "(I)V", "priorityPinsCountMax", "getPriorityPinsCountMax", "setPriorityPinsCountMax", "", "priorityPinsCountPercent", "Ljava/lang/Float;", "getPriorityPinsCountPercent", "()Ljava/lang/Float;", "setPriorityPinsCountPercent", "(Ljava/lang/Float;)V", "showHighRankedZoom", "getShowHighRankedZoom", "setShowHighRankedZoom", "screenWidth", "getScreenWidth", "screenHeight", "getScreenHeight", "", "", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/pins/ClusterCell;", "clusters", "Ljava/util/Map;", "getClusters", "()Ljava/util/Map;", "userTopPins", "getUserTopPins", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class ClusterizationAlgorithm {

    @NotNull
    private final Map<Long, ClusterCell<HotelsMapInfoV4VO.Pin>> clusters;

    @NotNull
    private final Comparator<HotelsMapInfoV4VO.Pin> comparator;
    private int priorityPinsCountMax;
    private int priorityPinsCountMin;
    private Float priorityPinsCountPercent;
    private final int screenHeight;
    private final int screenWidth;
    private Float showHighRankedZoom;

    @NotNull
    private final Map<String, HotelsMapInfoV4VO.Pin> userTopPins;

    public ClusterizationAlgorithm(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        final Comparator comparator = new Comparator() { // from class: ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.pins.ClusterizationAlgorithm$special$$inlined$compareBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t2, T t11) {
                return a.b(Float.valueOf(((HotelsMapInfoV4VO.Pin) t2).getRank()), Float.valueOf(((HotelsMapInfoV4VO.Pin) t11).getRank()));
            }
        };
        this.comparator = new Comparator() { // from class: ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.pins.ClusterizationAlgorithm$special$$inlined$thenBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t2, T t11) {
                int compare = comparator.compare(t2, t11);
                return compare != 0 ? compare : a.b(((HotelsMapInfoV4VO.Pin) t2).getId(), ((HotelsMapInfoV4VO.Pin) t11).getId());
            }
        };
        this.priorityPinsCountMin = 3;
        this.priorityPinsCountMax = Integer.MAX_VALUE;
        this.screenWidth = context.getResources().getDisplayMetrics().widthPixels;
        this.screenHeight = context.getResources().getDisplayMetrics().heightPixels;
        this.clusters = new LinkedHashMap();
        this.userTopPins = new LinkedHashMap();
    }

    private final int calculateClusterSize(int originalSize) {
        int i11 = this.priorityPinsCountMin;
        Float f7 = this.priorityPinsCountPercent;
        if (f7 == null) {
            return i11;
        }
        int floatValue = (int) (originalSize * f7.floatValue());
        int i12 = this.priorityPinsCountMin;
        if (floatValue < i12) {
            floatValue = i12;
        }
        int i13 = this.priorityPinsCountMax;
        return floatValue > i13 ? i13 : floatValue;
    }

    @NotNull
    protected final Map<Long, ClusterCell<HotelsMapInfoV4VO.Pin>> getClusters() {
        return this.clusters;
    }

    @NotNull
    protected final Comparator<HotelsMapInfoV4VO.Pin> getComparator() {
        return this.comparator;
    }

    protected final int getPriorityPinsCountMax() {
        return this.priorityPinsCountMax;
    }

    protected final int getScreenHeight() {
        return this.screenHeight;
    }

    protected final int getScreenWidth() {
        return this.screenWidth;
    }

    protected final Float getShowHighRankedZoom() {
        return this.showHighRankedZoom;
    }

    @NotNull
    protected final Map<String, HotelsMapInfoV4VO.Pin> getUserTopPins() {
        return this.userTopPins;
    }

    protected final void rankPinInClusters(@NotNull InterfaceC10733l<? super Map<String, HotelsMapInfoV4VO.Pin>> continuation, boolean areAllPinsPoints) {
        Intrinsics.checkNotNullParameter(continuation, "continuation");
        E0.f(continuation.getContext());
        d builder = new d(this.clusters.size() * this.priorityPinsCountMin);
        for (Map.Entry<Long, ClusterCell<HotelsMapInfoV4VO.Pin>> entry : this.clusters.entrySet()) {
            E0.f(continuation.getContext());
            if (entry.getValue().size() == 1) {
                HotelsMapInfoV4VO.Pin pin = (HotelsMapInfoV4VO.Pin) C7714v.L(entry.getValue());
                if (pin != null) {
                    String id2 = pin.getId();
                    pin.setTop(!areAllPinsPoints);
                    HotelsMapInfoV4VOKt.computeCacheHashAndZIndex(pin);
                    Unit unit = Unit.f71690a;
                }
            } else {
                int calculateClusterSize = calculateClusterSize(entry.getValue().getRequiredClusterSize());
                ClusterCell<HotelsMapInfoV4VO.Pin> value = entry.getValue();
                ArrayList arrayList = new ArrayList(C7714v.z(value, 10));
                int i11 = 0;
                for (HotelsMapInfoV4VO.Pin pin2 : value) {
                    int i12 = i11 + 1;
                    if (i11 < 0) {
                        C7714v.O0();
                        throw null;
                    }
                    HotelsMapInfoV4VO.Pin pin3 = pin2;
                    if (calculateClusterSize >= i11) {
                        String id3 = pin3.getId();
                        pin3.setTop(!areAllPinsPoints && i11 == 0);
                        HotelsMapInfoV4VOKt.computeCacheHashAndZIndex(pin3);
                        Unit unit2 = Unit.f71690a;
                        builder.put(id3, pin3);
                    }
                    arrayList.add(Unit.f71690a);
                    i11 = i12;
                }
            }
        }
        builder.putAll(this.userTopPins);
        Intrinsics.checkNotNullParameter(builder, "builder");
        d u11 = builder.u();
        r.Companion companion = r.INSTANCE;
        continuation.resumeWith(u11);
    }

    public final void setPriorityPinsInCluster(@NotNull HotelsMapInfoV4VO.PinsDisplaySettings settings) {
        Intrinsics.checkNotNullParameter(settings, "settings");
        Integer lowRankedPerCellMin = settings.getLowRankedPerCellMin();
        if (lowRankedPerCellMin != null) {
            this.priorityPinsCountMin = lowRankedPerCellMin.intValue();
        }
        Integer lowRankedPerCellMax = settings.getLowRankedPerCellMax();
        if (lowRankedPerCellMax != null) {
            this.priorityPinsCountMax = lowRankedPerCellMax.intValue();
        }
        this.priorityPinsCountPercent = Float.valueOf(settings.getLowRankedPercentPerCell());
        Float showHighRankedZoom = settings.getShowHighRankedZoom();
        if (showHighRankedZoom != null) {
            this.showHighRankedZoom = Float.valueOf(showHighRankedZoom.floatValue());
        }
    }
}
