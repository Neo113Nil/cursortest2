package c;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: c.d0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2437d0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f26541a;

    /* renamed from: b, reason: collision with root package name */
    public final String f26542b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f26543c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f26544d;

    /* renamed from: e, reason: collision with root package name */
    public final Integer f26545e;

    public C2437d0(String str, String str2, Integer num, Integer num2, Integer num3) {
        this.f26541a = str;
        this.f26542b = str2;
        this.f26543c = num;
        this.f26544d = num2;
        this.f26545e = num3;
    }

    public final String a() {
        return this.f26542b;
    }

    public final Integer b() {
        return this.f26545e;
    }

    public final Integer c() {
        return this.f26543c;
    }

    public final Integer d() {
        return this.f26544d;
    }

    public final String e() {
        return this.f26541a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2437d0)) {
            return false;
        }
        C2437d0 c2437d0 = (C2437d0) obj;
        return Intrinsics.areEqual(this.f26541a, c2437d0.f26541a) && Intrinsics.areEqual(this.f26542b, c2437d0.f26542b) && Intrinsics.areEqual(this.f26543c, c2437d0.f26543c) && Intrinsics.areEqual(this.f26544d, c2437d0.f26544d) && Intrinsics.areEqual(this.f26545e, c2437d0.f26545e);
    }

    public final int hashCode() {
        String str = this.f26541a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f26542b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.f26543c;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f26544d;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f26545e;
        return hashCode4 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        return "WifiInfo(ssid=" + this.f26541a + ", bssid=" + this.f26542b + ", linkSpeed=" + this.f26543c + ", rssi=" + this.f26544d + ", frequency=" + this.f26545e + ')';
    }
}
