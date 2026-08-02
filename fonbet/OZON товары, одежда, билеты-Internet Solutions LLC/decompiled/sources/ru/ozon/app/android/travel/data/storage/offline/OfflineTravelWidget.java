package ru.ozon.app.android.travel.data.storage.offline;

import B0.C2454a;
import G.g;
import N3.C3660k;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/travel/data/storage/offline/OfflineTravelWidget;", "", "vertical", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "version", "", "stateJson", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "getVertical", "()Ljava/lang/String;", "getName", "getVersion", "()I", "getStateJson", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "storage_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class OfflineTravelWidget {

    @NotNull
    private final String name;

    @NotNull
    private final String stateJson;
    private final int version;

    @NotNull
    private final String vertical;

    public OfflineTravelWidget(@NotNull String vertical, @NotNull String name, int i11, @NotNull String stateJson) {
        Intrinsics.checkNotNullParameter(vertical, "vertical");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(stateJson, "stateJson");
        this.vertical = vertical;
        this.name = name;
        this.version = i11;
        this.stateJson = stateJson;
    }

    public static /* synthetic */ OfflineTravelWidget copy$default(OfflineTravelWidget offlineTravelWidget, String str, String str2, int i11, String str3, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = offlineTravelWidget.vertical;
        }
        if ((i12 & 2) != 0) {
            str2 = offlineTravelWidget.name;
        }
        if ((i12 & 4) != 0) {
            i11 = offlineTravelWidget.version;
        }
        if ((i12 & 8) != 0) {
            str3 = offlineTravelWidget.stateJson;
        }
        return offlineTravelWidget.copy(str, str2, i11, str3);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getVertical() {
        return this.vertical;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component3, reason: from getter */
    public final int getVersion() {
        return this.version;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getStateJson() {
        return this.stateJson;
    }

    @NotNull
    public final OfflineTravelWidget copy(@NotNull String vertical, @NotNull String name, int version, @NotNull String stateJson) {
        Intrinsics.checkNotNullParameter(vertical, "vertical");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(stateJson, "stateJson");
        return new OfflineTravelWidget(vertical, name, version, stateJson);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OfflineTravelWidget)) {
            return false;
        }
        OfflineTravelWidget offlineTravelWidget = (OfflineTravelWidget) other;
        return Intrinsics.d(this.vertical, offlineTravelWidget.vertical) && Intrinsics.d(this.name, offlineTravelWidget.name) && this.version == offlineTravelWidget.version && Intrinsics.d(this.stateJson, offlineTravelWidget.stateJson);
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final String getStateJson() {
        return this.stateJson;
    }

    public final int getVersion() {
        return this.version;
    }

    @NotNull
    public final String getVertical() {
        return this.vertical;
    }

    public int hashCode() {
        return this.stateJson.hashCode() + C2454a.a(this.version, g.a(this.vertical.hashCode() * 31, 31, this.name), 31);
    }

    @NotNull
    public String toString() {
        String str = this.vertical;
        String str2 = this.name;
        int i11 = this.version;
        String str3 = this.stateJson;
        StringBuilder d11 = C3660k.d("OfflineTravelWidget(vertical=", str, ", name=", str2, ", version=");
        d11.append(i11);
        d11.append(", stateJson=");
        d11.append(str3);
        d11.append(")");
        return d11.toString();
    }
}
