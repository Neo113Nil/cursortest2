package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.ng, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0359ng {

    /* renamed from: a, reason: collision with root package name */
    public final String f14361a;

    /* renamed from: b, reason: collision with root package name */
    public final long f14362b;

    /* renamed from: c, reason: collision with root package name */
    public final long f14363c;

    /* renamed from: d, reason: collision with root package name */
    public final EnumC0334mg f14364d;

    public C0359ng(byte[] bArr) {
        C0384og a7 = C0384og.a(bArr);
        this.f14361a = a7.f14419a;
        this.f14362b = a7.f14421c;
        this.f14363c = a7.f14420b;
        this.f14364d = a(a7.f14422d);
    }

    public final byte[] a() {
        C0384og c0384og = new C0384og();
        c0384og.f14419a = this.f14361a;
        c0384og.f14421c = this.f14362b;
        c0384og.f14420b = this.f14363c;
        int ordinal = this.f14364d.ordinal();
        int i5 = 1;
        if (ordinal != 1) {
            i5 = 2;
            if (ordinal != 2) {
                i5 = 0;
            }
        }
        c0384og.f14422d = i5;
        return MessageNano.toByteArray(c0384og);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0359ng.class == obj.getClass()) {
            C0359ng c0359ng = (C0359ng) obj;
            if (this.f14362b == c0359ng.f14362b && this.f14363c == c0359ng.f14363c && this.f14361a.equals(c0359ng.f14361a) && this.f14364d == c0359ng.f14364d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f14361a.hashCode() * 31;
        long j = this.f14362b;
        int i5 = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
        long j6 = this.f14363c;
        return this.f14364d.hashCode() + ((i5 + ((int) (j6 ^ (j6 >>> 32)))) * 31);
    }

    public final String toString() {
        return "ReferrerInfo{installReferrer='" + this.f14361a + "', referrerClickTimestampSeconds=" + this.f14362b + ", installBeginTimestampSeconds=" + this.f14363c + ", source=" + this.f14364d + '}';
    }

    public C0359ng(String str, long j, long j6, EnumC0334mg enumC0334mg) {
        this.f14361a = str;
        this.f14362b = j;
        this.f14363c = j6;
        this.f14364d = enumC0334mg;
    }

    public static EnumC0334mg a(int i5) {
        if (i5 == 1) {
            return EnumC0334mg.f14267c;
        }
        if (i5 != 2) {
            return EnumC0334mg.f14266b;
        }
        return EnumC0334mg.f14268d;
    }
}
