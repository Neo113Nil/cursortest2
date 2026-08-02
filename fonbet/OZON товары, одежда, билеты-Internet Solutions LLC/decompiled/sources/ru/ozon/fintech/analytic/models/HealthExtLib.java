package ru.ozon.fintech.analytic.models;

import An.C2439a;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0015"}, d2 = {"Lru/ozon/fintech/analytic/models/HealthExtLib;", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "ver", "", "", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getName", "()Ljava/lang/String;", "getVer", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "fintech-analytic_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class HealthExtLib {

    @i(name = AppMeasurementSdk.ConditionalUserProperty.NAME)
    @NotNull
    private final String name;

    @i(name = "ver")
    @NotNull
    private final List<Integer> ver;

    public HealthExtLib(@NotNull String name, @NotNull List<Integer> ver) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(ver, "ver");
        this.name = name;
        this.ver = ver;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HealthExtLib copy$default(HealthExtLib healthExtLib, String str, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = healthExtLib.name;
        }
        if ((i11 & 2) != 0) {
            list = healthExtLib.ver;
        }
        return healthExtLib.copy(str, list);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final List<Integer> component2() {
        return this.ver;
    }

    @NotNull
    public final HealthExtLib copy(@NotNull String name, @NotNull List<Integer> ver) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(ver, "ver");
        return new HealthExtLib(name, ver);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HealthExtLib)) {
            return false;
        }
        HealthExtLib healthExtLib = (HealthExtLib) other;
        return Intrinsics.d(this.name, healthExtLib.name) && Intrinsics.d(this.ver, healthExtLib.ver);
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final List<Integer> getVer() {
        return this.ver;
    }

    public int hashCode() {
        return this.ver.hashCode() + (this.name.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return C2439a.a("HealthExtLib(name=", this.name, ", ver=", ")", this.ver);
    }
}
