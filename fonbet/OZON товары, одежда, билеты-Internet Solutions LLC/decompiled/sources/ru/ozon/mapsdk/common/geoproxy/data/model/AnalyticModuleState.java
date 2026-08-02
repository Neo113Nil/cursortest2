package ru.ozon.mapsdk.common.geoproxy.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.Gson;
import he0.C6943a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.mapsdk.common.geoproxy.model.ActualBXTab;
import we0.C10543B;
import we0.m;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0086\b\u0018\u0000 92\u00020\u0001:\u00019BS\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b#\u0010\"J\\\u0010$\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010'\u001a\u00020&HÖ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b)\u0010\u0018J\u001a\u0010,\u001a\u00020\t2\b\u0010+\u001a\u0004\u0018\u00010*HÖ\u0003¢\u0006\u0004\b,\u0010-R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010\u001aR\u001f\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u00100\u001a\u0004\b1\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u00102\u001a\u0004\b3\u0010\u001eR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u00104\u001a\u0004\b5\u0010 R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u00106\u001a\u0004\b7\u0010\"R\u0019\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\r\u00106\u001a\u0004\b8\u0010\"¨\u0006:"}, d2 = {"Lru/ozon/mapsdk/common/geoproxy/data/model/AnalyticModuleState;", "Landroid/os/Parcelable;", "Lwe0/m;", "lastKnownPoint", "", "Lwe0/B;", "polygons", "Lru/ozon/mapsdk/common/geoproxy/model/ActualBXTab;", "actualBXTab", "", "everBeenOutsidePolygons", "Lru/ozon/mapsdk/common/geoproxy/data/model/GeoProviderConfig;", "priorityProviderConfig", "defaultProviderConfig", "<init>", "(Lwe0/m;Ljava/util/List;Lru/ozon/mapsdk/common/geoproxy/model/ActualBXTab;Ljava/lang/Boolean;Lru/ozon/mapsdk/common/geoproxy/data/model/GeoProviderConfig;Lru/ozon/mapsdk/common/geoproxy/data/model/GeoProviderConfig;)V", "Landroid/os/Parcel;", "parcel", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lwe0/m;", "component2", "()Ljava/util/List;", "component3", "()Lru/ozon/mapsdk/common/geoproxy/model/ActualBXTab;", "component4", "()Ljava/lang/Boolean;", "component5", "()Lru/ozon/mapsdk/common/geoproxy/data/model/GeoProviderConfig;", "component6", "copy", "(Lwe0/m;Ljava/util/List;Lru/ozon/mapsdk/common/geoproxy/model/ActualBXTab;Ljava/lang/Boolean;Lru/ozon/mapsdk/common/geoproxy/data/model/GeoProviderConfig;Lru/ozon/mapsdk/common/geoproxy/data/model/GeoProviderConfig;)Lru/ozon/mapsdk/common/geoproxy/data/model/AnalyticModuleState;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lwe0/m;", "getLastKnownPoint", "Ljava/util/List;", "getPolygons", "Lru/ozon/mapsdk/common/geoproxy/model/ActualBXTab;", "getActualBXTab", "Ljava/lang/Boolean;", "getEverBeenOutsidePolygons", "Lru/ozon/mapsdk/common/geoproxy/data/model/GeoProviderConfig;", "getPriorityProviderConfig", "getDefaultProviderConfig", "CREATOR", "mapsdk_fullFirebaseOpenglRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class AnalyticModuleState implements Parcelable {

    /* renamed from: CREATOR, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final ActualBXTab actualBXTab;
    private final GeoProviderConfig defaultProviderConfig;
    private final Boolean everBeenOutsidePolygons;
    private final m lastKnownPoint;
    private final List<C10543B> polygons;
    private final GeoProviderConfig priorityProviderConfig;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u001d\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/mapsdk/common/geoproxy/data/model/AnalyticModuleState$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lru/ozon/mapsdk/common/geoproxy/data/model/AnalyticModuleState;", "<init>", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lru/ozon/mapsdk/common/geoproxy/data/model/AnalyticModuleState;", "mapsdk_fullFirebaseOpenglRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.mapsdk.common.geoproxy.data.model.AnalyticModuleState$CREATOR, reason: from kotlin metadata */
    public static final class Companion implements Parcelable.Creator<AnalyticModuleState> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public AnalyticModuleState createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            Gson a11 = C6943a.a();
            String readString = parcel.readString();
            Intrinsics.f(readString);
            Object d11 = a11.d(readString, AnalyticModuleState.class);
            Intrinsics.checkNotNullExpressionValue(d11, "fromJson(...)");
            return (AnalyticModuleState) d11;
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public AnalyticModuleState[] newArray(int size) {
            return new AnalyticModuleState[size];
        }
    }

    public AnalyticModuleState() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ AnalyticModuleState copy$default(AnalyticModuleState analyticModuleState, m mVar, List list, ActualBXTab actualBXTab, Boolean bool, GeoProviderConfig geoProviderConfig, GeoProviderConfig geoProviderConfig2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            mVar = analyticModuleState.lastKnownPoint;
        }
        if ((i11 & 2) != 0) {
            list = analyticModuleState.polygons;
        }
        if ((i11 & 4) != 0) {
            actualBXTab = analyticModuleState.actualBXTab;
        }
        if ((i11 & 8) != 0) {
            bool = analyticModuleState.everBeenOutsidePolygons;
        }
        if ((i11 & 16) != 0) {
            geoProviderConfig = analyticModuleState.priorityProviderConfig;
        }
        if ((i11 & 32) != 0) {
            geoProviderConfig2 = analyticModuleState.defaultProviderConfig;
        }
        GeoProviderConfig geoProviderConfig3 = geoProviderConfig;
        GeoProviderConfig geoProviderConfig4 = geoProviderConfig2;
        return analyticModuleState.copy(mVar, list, actualBXTab, bool, geoProviderConfig3, geoProviderConfig4);
    }

    /* renamed from: component1, reason: from getter */
    public final m getLastKnownPoint() {
        return this.lastKnownPoint;
    }

    public final List<C10543B> component2() {
        return this.polygons;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final ActualBXTab getActualBXTab() {
        return this.actualBXTab;
    }

    /* renamed from: component4, reason: from getter */
    public final Boolean getEverBeenOutsidePolygons() {
        return this.everBeenOutsidePolygons;
    }

    /* renamed from: component5, reason: from getter */
    public final GeoProviderConfig getPriorityProviderConfig() {
        return this.priorityProviderConfig;
    }

    /* renamed from: component6, reason: from getter */
    public final GeoProviderConfig getDefaultProviderConfig() {
        return this.defaultProviderConfig;
    }

    @NotNull
    public final AnalyticModuleState copy(m lastKnownPoint, List<C10543B> polygons, @NotNull ActualBXTab actualBXTab, Boolean everBeenOutsidePolygons, GeoProviderConfig priorityProviderConfig, GeoProviderConfig defaultProviderConfig) {
        Intrinsics.checkNotNullParameter(actualBXTab, "actualBXTab");
        return new AnalyticModuleState(lastKnownPoint, polygons, actualBXTab, everBeenOutsidePolygons, priorityProviderConfig, defaultProviderConfig);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AnalyticModuleState)) {
            return false;
        }
        AnalyticModuleState analyticModuleState = (AnalyticModuleState) other;
        return Intrinsics.d(this.lastKnownPoint, analyticModuleState.lastKnownPoint) && Intrinsics.d(this.polygons, analyticModuleState.polygons) && this.actualBXTab == analyticModuleState.actualBXTab && Intrinsics.d(this.everBeenOutsidePolygons, analyticModuleState.everBeenOutsidePolygons) && Intrinsics.d(this.priorityProviderConfig, analyticModuleState.priorityProviderConfig) && Intrinsics.d(this.defaultProviderConfig, analyticModuleState.defaultProviderConfig);
    }

    @NotNull
    public final ActualBXTab getActualBXTab() {
        return this.actualBXTab;
    }

    public final GeoProviderConfig getDefaultProviderConfig() {
        return this.defaultProviderConfig;
    }

    public final Boolean getEverBeenOutsidePolygons() {
        return this.everBeenOutsidePolygons;
    }

    public final m getLastKnownPoint() {
        return this.lastKnownPoint;
    }

    public final List<C10543B> getPolygons() {
        return this.polygons;
    }

    public final GeoProviderConfig getPriorityProviderConfig() {
        return this.priorityProviderConfig;
    }

    public int hashCode() {
        m mVar = this.lastKnownPoint;
        int hashCode = (mVar == null ? 0 : mVar.hashCode()) * 31;
        List<C10543B> list = this.polygons;
        int hashCode2 = (this.actualBXTab.hashCode() + ((hashCode + (list == null ? 0 : list.hashCode())) * 31)) * 31;
        Boolean bool = this.everBeenOutsidePolygons;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        GeoProviderConfig geoProviderConfig = this.priorityProviderConfig;
        int hashCode4 = (hashCode3 + (geoProviderConfig == null ? 0 : geoProviderConfig.hashCode())) * 31;
        GeoProviderConfig geoProviderConfig2 = this.defaultProviderConfig;
        return hashCode4 + (geoProviderConfig2 != null ? geoProviderConfig2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "AnalyticModuleState(lastKnownPoint=" + this.lastKnownPoint + ", polygons=" + this.polygons + ", actualBXTab=" + this.actualBXTab + ", everBeenOutsidePolygons=" + this.everBeenOutsidePolygons + ", priorityProviderConfig=" + this.priorityProviderConfig + ", defaultProviderConfig=" + this.defaultProviderConfig + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(C6943a.a().k(this));
    }

    public AnalyticModuleState(m mVar, List<C10543B> list, @NotNull ActualBXTab actualBXTab, Boolean bool, GeoProviderConfig geoProviderConfig, GeoProviderConfig geoProviderConfig2) {
        Intrinsics.checkNotNullParameter(actualBXTab, "actualBXTab");
        this.lastKnownPoint = mVar;
        this.polygons = list;
        this.actualBXTab = actualBXTab;
        this.everBeenOutsidePolygons = bool;
        this.priorityProviderConfig = geoProviderConfig;
        this.defaultProviderConfig = geoProviderConfig2;
    }

    public /* synthetic */ AnalyticModuleState(m mVar, List list, ActualBXTab actualBXTab, Boolean bool, GeoProviderConfig geoProviderConfig, GeoProviderConfig geoProviderConfig2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : mVar, (i11 & 2) != 0 ? null : list, (i11 & 4) != 0 ? ActualBXTab.NONE : actualBXTab, (i11 & 8) != 0 ? null : bool, (i11 & 16) != 0 ? null : geoProviderConfig, (i11 & 32) != 0 ? null : geoProviderConfig2);
    }
}
