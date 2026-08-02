package ru.ozon.fintech.features.offline.data.model.main;

import N3.C3660k;
import Pk0.a;
import androidx.annotation.Keep;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J)\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\f¨\u0006\u0016"}, d2 = {"Lru/ozon/fintech/features/offline/data/model/main/ClientData;", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "avatarUrl", "isPriviliged", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "getName", "()Ljava/lang/String;", "getAvatarUrl", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "offline_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ClientData {

    @i(name = "avatarUrl")
    private final String avatarUrl;

    @i(name = "isPriviliged")
    private final boolean isPriviliged;

    @i(name = AppMeasurementSdk.ConditionalUserProperty.NAME)
    @NotNull
    private final String name;

    public ClientData(@NotNull String name, String str, boolean z11) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.name = name;
        this.avatarUrl = str;
        this.isPriviliged = z11;
    }

    public static /* synthetic */ ClientData copy$default(ClientData clientData, String str, String str2, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = clientData.name;
        }
        if ((i11 & 2) != 0) {
            str2 = clientData.avatarUrl;
        }
        if ((i11 & 4) != 0) {
            z11 = clientData.isPriviliged;
        }
        return clientData.copy(str, str2, z11);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsPriviliged() {
        return this.isPriviliged;
    }

    @NotNull
    public final ClientData copy(@NotNull String name, String avatarUrl, boolean isPriviliged) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new ClientData(name, avatarUrl, isPriviliged);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ClientData)) {
            return false;
        }
        ClientData clientData = (ClientData) other;
        return Intrinsics.d(this.name, clientData.name) && Intrinsics.d(this.avatarUrl, clientData.avatarUrl) && this.isPriviliged == clientData.isPriviliged;
    }

    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        int hashCode = this.name.hashCode() * 31;
        String str = this.avatarUrl;
        return Boolean.hashCode(this.isPriviliged) + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final boolean isPriviliged() {
        return this.isPriviliged;
    }

    @NotNull
    public String toString() {
        String str = this.name;
        String str2 = this.avatarUrl;
        return a.a(")", C3660k.d("ClientData(name=", str, ", avatarUrl=", str2, ", isPriviliged="), this.isPriviliged);
    }
}
