package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.un, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0540un implements TempCacheStorage.Entry {

    /* renamed from: a, reason: collision with root package name */
    public final long f14756a;

    /* renamed from: b, reason: collision with root package name */
    public final String f14757b;

    /* renamed from: c, reason: collision with root package name */
    public final long f14758c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f14759d;

    public C0540un(long j, @NotNull String str, long j6, @NotNull byte[] bArr) {
        this.f14756a = j;
        this.f14757b = str;
        this.f14758c = j6;
        this.f14759d = bArr;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(C0540un.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.impl.db.storage.TempCacheEntry");
        }
        C0540un c0540un = (C0540un) obj;
        if (this.f14756a == c0540un.f14756a && Intrinsics.areEqual(this.f14757b, c0540un.f14757b) && this.f14758c == c0540un.f14758c) {
            return Arrays.equals(this.f14759d, c0540un.f14759d);
        }
        return false;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage.Entry
    @NotNull
    public final byte[] getData() {
        return this.f14759d;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage.Entry
    public final long getId() {
        return this.f14756a;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage.Entry
    @NotNull
    public final String getScope() {
        return this.f14757b;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage.Entry
    public final long getTimestamp() {
        return this.f14758c;
    }

    public final int hashCode() {
        long j = this.f14756a;
        int j6 = r4.k.j(((int) (j ^ (j >>> 32))) * 31, 31, this.f14757b);
        long j10 = this.f14758c;
        return Arrays.hashCode(this.f14759d) + ((((int) (j10 ^ (j10 >>> 32))) + j6) * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TempCacheEntry(id=");
        sb2.append(this.f14756a);
        sb2.append(", scope='");
        sb2.append(this.f14757b);
        sb2.append("', timestamp=");
        sb2.append(this.f14758c);
        sb2.append(", data=array[");
        return r4.k.n(sb2, this.f14759d.length, "])");
    }
}
