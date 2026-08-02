package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigMetaInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class Kg implements RemoteConfigMetaInfo {

    /* renamed from: a, reason: collision with root package name */
    public final long f12477a;

    /* renamed from: b, reason: collision with root package name */
    public final long f12478b;

    public Kg(long j, long j6) {
        this.f12477a = j;
        this.f12478b = j6;
    }

    @NotNull
    public final Kg a(long j, long j6) {
        return new Kg(j, j6);
    }

    public final long b() {
        return this.f12478b;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Kg)) {
            return false;
        }
        Kg kg = (Kg) obj;
        return this.f12477a == kg.f12477a && this.f12478b == kg.f12478b;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigMetaInfo
    public final long getFirstSendTime() {
        return this.f12477a;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigMetaInfo
    public final long getLastUpdateTime() {
        return this.f12478b;
    }

    public final int hashCode() {
        long j = this.f12477a;
        int i5 = ((int) (j ^ (j >>> 32))) * 31;
        long j6 = this.f12478b;
        return ((int) ((j6 >>> 32) ^ j6)) + i5;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RemoteConfigMetaInfoModel(firstSendTime=");
        sb2.append(this.f12477a);
        sb2.append(", lastUpdateTime=");
        return d9.e.j(sb2, this.f12478b, ')');
    }

    public final long a() {
        return this.f12477a;
    }

    public static Kg a(Kg kg, long j, long j6, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            j = kg.f12477a;
        }
        if ((i5 & 2) != 0) {
            j6 = kg.f12478b;
        }
        kg.getClass();
        return new Kg(j, j6);
    }
}
