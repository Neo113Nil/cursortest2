package ru.ozon.fintech.features.installedapps.models;

import N3.C3660k;
import Pk0.a;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, d2 = {"Lru/ozon/fintech/features/installedapps/models/ServiceInfoCompact;", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "permission", "exported", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "getName", "()Ljava/lang/String;", "getPermission", "getExported", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "installed-apps_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ServiceInfoCompact {
    private final boolean exported;

    @NotNull
    private final String name;
    private final String permission;

    public ServiceInfoCompact(@NotNull String name, String str, boolean z11) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.name = name;
        this.permission = str;
        this.exported = z11;
    }

    public static /* synthetic */ ServiceInfoCompact copy$default(ServiceInfoCompact serviceInfoCompact, String str, String str2, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = serviceInfoCompact.name;
        }
        if ((i11 & 2) != 0) {
            str2 = serviceInfoCompact.permission;
        }
        if ((i11 & 4) != 0) {
            z11 = serviceInfoCompact.exported;
        }
        return serviceInfoCompact.copy(str, str2, z11);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPermission() {
        return this.permission;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getExported() {
        return this.exported;
    }

    @NotNull
    public final ServiceInfoCompact copy(@NotNull String name, String permission, boolean exported) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new ServiceInfoCompact(name, permission, exported);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ServiceInfoCompact)) {
            return false;
        }
        ServiceInfoCompact serviceInfoCompact = (ServiceInfoCompact) other;
        return Intrinsics.d(this.name, serviceInfoCompact.name) && Intrinsics.d(this.permission, serviceInfoCompact.permission) && this.exported == serviceInfoCompact.exported;
    }

    public final boolean getExported() {
        return this.exported;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final String getPermission() {
        return this.permission;
    }

    public int hashCode() {
        int hashCode = this.name.hashCode() * 31;
        String str = this.permission;
        return Boolean.hashCode(this.exported) + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    @NotNull
    public String toString() {
        String str = this.name;
        String str2 = this.permission;
        return a.a(")", C3660k.d("ServiceInfoCompact(name=", str, ", permission=", str2, ", exported="), this.exported);
    }
}
