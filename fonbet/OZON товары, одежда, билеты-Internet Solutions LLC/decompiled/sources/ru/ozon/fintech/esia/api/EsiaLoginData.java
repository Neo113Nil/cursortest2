package ru.ozon.fintech.esia.api;

import G.g;
import N3.C3660k;
import Nh.a;
import androidx.annotation.Keep;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\tHÆ\u0003JM\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\tHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006!"}, d2 = {"Lru/ozon/fintech/esia/api/EsiaLoginData;", "", "clientId", "", "clientSecret", "time", "state", "permissions", "scope", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getClientId", "()Ljava/lang/String;", "getClientSecret", "getTime", "getState", "getPermissions", "getScope", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "esia-api_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class EsiaLoginData {

    @NotNull
    private final String clientId;

    @NotNull
    private final String clientSecret;
    private final String permissions;

    @NotNull
    private final List<String> scope;

    @NotNull
    private final String state;

    @NotNull
    private final String time;

    public EsiaLoginData(@NotNull String clientId, @NotNull String clientSecret, @NotNull String time, @NotNull String state, String str, @NotNull List<String> scope) {
        Intrinsics.checkNotNullParameter(clientId, "clientId");
        Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
        Intrinsics.checkNotNullParameter(time, "time");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.time = time;
        this.state = state;
        this.permissions = str;
        this.scope = scope;
    }

    public static /* synthetic */ EsiaLoginData copy$default(EsiaLoginData esiaLoginData, String str, String str2, String str3, String str4, String str5, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = esiaLoginData.clientId;
        }
        if ((i11 & 2) != 0) {
            str2 = esiaLoginData.clientSecret;
        }
        if ((i11 & 4) != 0) {
            str3 = esiaLoginData.time;
        }
        if ((i11 & 8) != 0) {
            str4 = esiaLoginData.state;
        }
        if ((i11 & 16) != 0) {
            str5 = esiaLoginData.permissions;
        }
        if ((i11 & 32) != 0) {
            list = esiaLoginData.scope;
        }
        String str6 = str5;
        List list2 = list;
        return esiaLoginData.copy(str, str2, str3, str4, str6, list2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getClientId() {
        return this.clientId;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getClientSecret() {
        return this.clientSecret;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getTime() {
        return this.time;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getState() {
        return this.state;
    }

    /* renamed from: component5, reason: from getter */
    public final String getPermissions() {
        return this.permissions;
    }

    @NotNull
    public final List<String> component6() {
        return this.scope;
    }

    @NotNull
    public final EsiaLoginData copy(@NotNull String clientId, @NotNull String clientSecret, @NotNull String time, @NotNull String state, String permissions, @NotNull List<String> scope) {
        Intrinsics.checkNotNullParameter(clientId, "clientId");
        Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
        Intrinsics.checkNotNullParameter(time, "time");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(scope, "scope");
        return new EsiaLoginData(clientId, clientSecret, time, state, permissions, scope);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EsiaLoginData)) {
            return false;
        }
        EsiaLoginData esiaLoginData = (EsiaLoginData) other;
        return Intrinsics.d(this.clientId, esiaLoginData.clientId) && Intrinsics.d(this.clientSecret, esiaLoginData.clientSecret) && Intrinsics.d(this.time, esiaLoginData.time) && Intrinsics.d(this.state, esiaLoginData.state) && Intrinsics.d(this.permissions, esiaLoginData.permissions) && Intrinsics.d(this.scope, esiaLoginData.scope);
    }

    @NotNull
    public final String getClientId() {
        return this.clientId;
    }

    @NotNull
    public final String getClientSecret() {
        return this.clientSecret;
    }

    public final String getPermissions() {
        return this.permissions;
    }

    @NotNull
    public final List<String> getScope() {
        return this.scope;
    }

    @NotNull
    public final String getState() {
        return this.state;
    }

    @NotNull
    public final String getTime() {
        return this.time;
    }

    public int hashCode() {
        int a11 = g.a(g.a(g.a(this.clientId.hashCode() * 31, 31, this.clientSecret), 31, this.time), 31, this.state);
        String str = this.permissions;
        return this.scope.hashCode() + ((a11 + (str == null ? 0 : str.hashCode())) * 31);
    }

    @NotNull
    public String toString() {
        String str = this.clientId;
        String str2 = this.clientSecret;
        String str3 = this.time;
        String str4 = this.state;
        String str5 = this.permissions;
        List<String> list = this.scope;
        StringBuilder d11 = C3660k.d("EsiaLoginData(clientId=", str, ", clientSecret=", str2, ", time=");
        a.h(d11, str3, ", state=", str4, ", permissions=");
        d11.append(str5);
        d11.append(", scope=");
        d11.append(list);
        d11.append(")");
        return d11.toString();
    }
}
