package ru.ozon.app.android.emptyscreen;

import G.g;
import N3.C3660k;
import Pk0.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0015\u0010\u000bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0019\u0010\u000b¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/emptyscreen/OfflineWidget;", "", "", "vertical", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "version", "state", "<init>", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getVertical", "getName", "J", "getVersion", "()J", "getState", "emptyscreen_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class OfflineWidget {

    @NotNull
    private final String name;

    @NotNull
    private final String state;
    private final long version;

    @NotNull
    private final String vertical;

    public OfflineWidget(@NotNull String vertical, @NotNull String name, long j11, @NotNull String state) {
        Intrinsics.checkNotNullParameter(vertical, "vertical");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(state, "state");
        this.vertical = vertical;
        this.name = name;
        this.version = j11;
        this.state = state;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OfflineWidget)) {
            return false;
        }
        OfflineWidget offlineWidget = (OfflineWidget) other;
        return Intrinsics.d(this.vertical, offlineWidget.vertical) && Intrinsics.d(this.name, offlineWidget.name) && this.version == offlineWidget.version && Intrinsics.d(this.state, offlineWidget.state);
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final String getState() {
        return this.state;
    }

    public final long getVersion() {
        return this.version;
    }

    @NotNull
    public final String getVertical() {
        return this.vertical;
    }

    public int hashCode() {
        return this.state.hashCode() + c.a(g.a(this.vertical.hashCode() * 31, 31, this.name), 31, this.version);
    }

    @NotNull
    public String toString() {
        String str = this.vertical;
        String str2 = this.name;
        long j11 = this.version;
        String str3 = this.state;
        StringBuilder d11 = C3660k.d("OfflineWidget(vertical=", str, ", name=", str2, ", version=");
        d11.append(j11);
        d11.append(", state=");
        d11.append(str3);
        d11.append(")");
        return d11.toString();
    }
}
