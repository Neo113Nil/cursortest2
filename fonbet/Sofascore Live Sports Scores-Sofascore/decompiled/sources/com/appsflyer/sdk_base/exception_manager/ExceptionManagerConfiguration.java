package com.appsflyer.sdk_base.exception_manager;

import defpackage.mz1;
import defpackage.wv8;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0006\u0010\u0012\u001a\u00020\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\bHÆ\u0003J1\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, d2 = {"Lcom/appsflyer/sdk_base/exception_manager/ExceptionManagerConfiguration;", "", "sdkVersion", "", "min", "", "expire", "ttl", "", "<init>", "(Ljava/lang/String;IIJ)V", "getSdkVersion", "()Ljava/lang/String;", "getMin", "()I", "getExpire", "getTtl", "()J", "toStringifyJSON", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "sdk_base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class ExceptionManagerConfiguration {
    private final int expire;
    private final int min;

    @NotNull
    private final String sdkVersion;
    private final long ttl;

    public ExceptionManagerConfiguration(@NotNull String str, int i, int i2, long j) {
        str.getClass();
        this.sdkVersion = str;
        this.min = i;
        this.expire = i2;
        this.ttl = j;
    }

    public static /* synthetic */ ExceptionManagerConfiguration copy$default(ExceptionManagerConfiguration exceptionManagerConfiguration, String str, int i, int i2, long j, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = exceptionManagerConfiguration.sdkVersion;
        }
        if ((i3 & 2) != 0) {
            i = exceptionManagerConfiguration.min;
        }
        if ((i3 & 4) != 0) {
            i2 = exceptionManagerConfiguration.expire;
        }
        if ((i3 & 8) != 0) {
            j = exceptionManagerConfiguration.ttl;
        }
        int i4 = i2;
        return exceptionManagerConfiguration.copy(str, i, i4, j);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getSdkVersion() {
        return this.sdkVersion;
    }

    /* renamed from: component2, reason: from getter */
    public final int getMin() {
        return this.min;
    }

    /* renamed from: component3, reason: from getter */
    public final int getExpire() {
        return this.expire;
    }

    /* renamed from: component4, reason: from getter */
    public final long getTtl() {
        return this.ttl;
    }

    @NotNull
    public final ExceptionManagerConfiguration copy(@NotNull String sdkVersion, int min, int expire, long ttl) {
        sdkVersion.getClass();
        return new ExceptionManagerConfiguration(sdkVersion, min, expire, ttl);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExceptionManagerConfiguration)) {
            return false;
        }
        ExceptionManagerConfiguration exceptionManagerConfiguration = (ExceptionManagerConfiguration) other;
        return Intrinsics.c(this.sdkVersion, exceptionManagerConfiguration.sdkVersion) && this.min == exceptionManagerConfiguration.min && this.expire == exceptionManagerConfiguration.expire && this.ttl == exceptionManagerConfiguration.ttl;
    }

    public final int getExpire() {
        return this.expire;
    }

    public final int getMin() {
        return this.min;
    }

    @NotNull
    public final String getSdkVersion() {
        return this.sdkVersion;
    }

    public final long getTtl() {
        return this.ttl;
    }

    public int hashCode() {
        return Long.hashCode(this.ttl) + wv8.a(this.expire, wv8.a(this.min, this.sdkVersion.hashCode() * 31, 31), 31);
    }

    @NotNull
    public String toString() {
        String str = this.sdkVersion;
        int i = this.min;
        int i2 = this.expire;
        long j = this.ttl;
        StringBuilder q = mz1.q(i, "ExceptionManagerConfiguration(sdkVersion=", str, ", min=", ", expire=");
        q.append(i2);
        q.append(", ttl=");
        q.append(j);
        q.append(")");
        return q.toString();
    }

    @NotNull
    public final String toStringifyJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sdk_ver", this.sdkVersion);
            jSONObject.put("min", this.min);
            jSONObject.put("expire", this.expire);
            jSONObject.put("ttl", this.ttl);
        } catch (JSONException unused) {
        }
        String jSONObject2 = jSONObject.toString();
        jSONObject2.getClass();
        return jSONObject2;
    }
}
