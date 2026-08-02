package c;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: c.r0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2464r0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f26660a;

    /* renamed from: b, reason: collision with root package name */
    public final String f26661b;

    /* renamed from: c, reason: collision with root package name */
    public final String f26662c;

    /* renamed from: d, reason: collision with root package name */
    public final String f26663d;

    /* renamed from: e, reason: collision with root package name */
    public final String f26664e;

    public C2464r0(String str, String str2, String str3, String str4, String str5) {
        this.f26660a = str;
        this.f26661b = str2;
        this.f26662c = str3;
        this.f26663d = str4;
        this.f26664e = str5;
    }

    public final String a() {
        return this.f26661b;
    }

    public final String b() {
        return this.f26660a;
    }

    public final String c() {
        return this.f26663d;
    }

    public final String d() {
        return this.f26662c;
    }

    public final String e() {
        return this.f26664e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2464r0)) {
            return false;
        }
        C2464r0 c2464r0 = (C2464r0) obj;
        return Intrinsics.areEqual(this.f26660a, c2464r0.f26660a) && Intrinsics.areEqual(this.f26661b, c2464r0.f26661b) && Intrinsics.areEqual(this.f26662c, c2464r0.f26662c) && Intrinsics.areEqual(this.f26663d, c2464r0.f26663d) && Intrinsics.areEqual(this.f26664e, c2464r0.f26664e);
    }

    public final int hashCode() {
        String str = this.f26660a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f26661b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f26662c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f26663d;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f26664e;
        return hashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        return "SimCardInfo(carrierName=" + this.f26660a + ", carrierCountry=" + this.f26661b + ", simCountry=" + this.f26662c + ", networkType=" + this.f26663d + ", simState=" + this.f26664e + ')';
    }
}
