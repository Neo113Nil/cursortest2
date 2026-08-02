package ru.ozon.mapsdk.common.geoproxy.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.Gson;
import he0.C6943a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.mapsdk.common.geoproxy.model.ActualBXTab;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000  2\u00020\u0001:\u0001 B)\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0013H\u0016J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J+\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u0013HÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006!"}, d2 = {"Lru/ozon/mapsdk/common/geoproxy/data/model/SimpleAnalyticModuleState;", "Landroid/os/Parcelable;", "actualBXTab", "Lru/ozon/mapsdk/common/geoproxy/model/ActualBXTab;", "priorityProviderConfig", "Lru/ozon/mapsdk/common/geoproxy/data/model/GeoProviderConfig;", "defaultProviderConfig", "<init>", "(Lru/ozon/mapsdk/common/geoproxy/model/ActualBXTab;Lru/ozon/mapsdk/common/geoproxy/data/model/GeoProviderConfig;Lru/ozon/mapsdk/common/geoproxy/data/model/GeoProviderConfig;)V", "getActualBXTab", "()Lru/ozon/mapsdk/common/geoproxy/model/ActualBXTab;", "getPriorityProviderConfig", "()Lru/ozon/mapsdk/common/geoproxy/data/model/GeoProviderConfig;", "getDefaultProviderConfig", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "", "describeContents", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "", "CREATOR", "mapsdk_fullFirebaseOpenglRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SimpleAnalyticModuleState implements Parcelable {

    /* renamed from: CREATOR, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final ActualBXTab actualBXTab;
    private final GeoProviderConfig defaultProviderConfig;
    private final GeoProviderConfig priorityProviderConfig;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u001d\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/mapsdk/common/geoproxy/data/model/SimpleAnalyticModuleState$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lru/ozon/mapsdk/common/geoproxy/data/model/SimpleAnalyticModuleState;", "<init>", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lru/ozon/mapsdk/common/geoproxy/data/model/SimpleAnalyticModuleState;", "mapsdk_fullFirebaseOpenglRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.mapsdk.common.geoproxy.data.model.SimpleAnalyticModuleState$CREATOR, reason: from kotlin metadata */
    public static final class Companion implements Parcelable.Creator<SimpleAnalyticModuleState> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public SimpleAnalyticModuleState createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            Gson a11 = C6943a.a();
            String readString = parcel.readString();
            Intrinsics.f(readString);
            Object d11 = a11.d(readString, SimpleAnalyticModuleState.class);
            Intrinsics.checkNotNullExpressionValue(d11, "fromJson(...)");
            return (SimpleAnalyticModuleState) d11;
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public SimpleAnalyticModuleState[] newArray(int size) {
            return new SimpleAnalyticModuleState[size];
        }
    }

    public SimpleAnalyticModuleState() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ SimpleAnalyticModuleState copy$default(SimpleAnalyticModuleState simpleAnalyticModuleState, ActualBXTab actualBXTab, GeoProviderConfig geoProviderConfig, GeoProviderConfig geoProviderConfig2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            actualBXTab = simpleAnalyticModuleState.actualBXTab;
        }
        if ((i11 & 2) != 0) {
            geoProviderConfig = simpleAnalyticModuleState.priorityProviderConfig;
        }
        if ((i11 & 4) != 0) {
            geoProviderConfig2 = simpleAnalyticModuleState.defaultProviderConfig;
        }
        return simpleAnalyticModuleState.copy(actualBXTab, geoProviderConfig, geoProviderConfig2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final ActualBXTab getActualBXTab() {
        return this.actualBXTab;
    }

    /* renamed from: component2, reason: from getter */
    public final GeoProviderConfig getPriorityProviderConfig() {
        return this.priorityProviderConfig;
    }

    /* renamed from: component3, reason: from getter */
    public final GeoProviderConfig getDefaultProviderConfig() {
        return this.defaultProviderConfig;
    }

    @NotNull
    public final SimpleAnalyticModuleState copy(@NotNull ActualBXTab actualBXTab, GeoProviderConfig priorityProviderConfig, GeoProviderConfig defaultProviderConfig) {
        Intrinsics.checkNotNullParameter(actualBXTab, "actualBXTab");
        return new SimpleAnalyticModuleState(actualBXTab, priorityProviderConfig, defaultProviderConfig);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SimpleAnalyticModuleState)) {
            return false;
        }
        SimpleAnalyticModuleState simpleAnalyticModuleState = (SimpleAnalyticModuleState) other;
        return this.actualBXTab == simpleAnalyticModuleState.actualBXTab && Intrinsics.d(this.priorityProviderConfig, simpleAnalyticModuleState.priorityProviderConfig) && Intrinsics.d(this.defaultProviderConfig, simpleAnalyticModuleState.defaultProviderConfig);
    }

    @NotNull
    public final ActualBXTab getActualBXTab() {
        return this.actualBXTab;
    }

    public final GeoProviderConfig getDefaultProviderConfig() {
        return this.defaultProviderConfig;
    }

    public final GeoProviderConfig getPriorityProviderConfig() {
        return this.priorityProviderConfig;
    }

    public int hashCode() {
        int hashCode = this.actualBXTab.hashCode() * 31;
        GeoProviderConfig geoProviderConfig = this.priorityProviderConfig;
        int hashCode2 = (hashCode + (geoProviderConfig == null ? 0 : geoProviderConfig.hashCode())) * 31;
        GeoProviderConfig geoProviderConfig2 = this.defaultProviderConfig;
        return hashCode2 + (geoProviderConfig2 != null ? geoProviderConfig2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "SimpleAnalyticModuleState(actualBXTab=" + this.actualBXTab + ", priorityProviderConfig=" + this.priorityProviderConfig + ", defaultProviderConfig=" + this.defaultProviderConfig + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(C6943a.a().k(this));
    }

    public SimpleAnalyticModuleState(@NotNull ActualBXTab actualBXTab, GeoProviderConfig geoProviderConfig, GeoProviderConfig geoProviderConfig2) {
        Intrinsics.checkNotNullParameter(actualBXTab, "actualBXTab");
        this.actualBXTab = actualBXTab;
        this.priorityProviderConfig = geoProviderConfig;
        this.defaultProviderConfig = geoProviderConfig2;
    }

    public /* synthetic */ SimpleAnalyticModuleState(ActualBXTab actualBXTab, GeoProviderConfig geoProviderConfig, GeoProviderConfig geoProviderConfig2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? ActualBXTab.NONE : actualBXTab, (i11 & 2) != 0 ? null : geoProviderConfig, (i11 & 4) != 0 ? null : geoProviderConfig2);
    }
}
