package c;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class x0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f26719a;

    /* renamed from: b, reason: collision with root package name */
    public final String f26720b;

    /* renamed from: c, reason: collision with root package name */
    public final String f26721c;

    /* renamed from: d, reason: collision with root package name */
    public final String f26722d;

    /* renamed from: e, reason: collision with root package name */
    public final Long f26723e;

    /* renamed from: f, reason: collision with root package name */
    public final Long f26724f;

    /* renamed from: g, reason: collision with root package name */
    public final Long f26725g;

    public x0(String str, String str2, String str3, String str4, Long l10, Long l11, Long l12) {
        this.f26719a = str;
        this.f26720b = str2;
        this.f26721c = str3;
        this.f26722d = str4;
        this.f26723e = l10;
        this.f26724f = l11;
        this.f26725g = l12;
    }

    public final Long a() {
        return this.f26723e;
    }

    public final Long b() {
        return this.f26724f;
    }

    public final String c() {
        return this.f26719a;
    }

    public final String d() {
        return this.f26720b;
    }

    public final String e() {
        return this.f26722d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x0)) {
            return false;
        }
        x0 x0Var = (x0) obj;
        return Intrinsics.areEqual(this.f26719a, x0Var.f26719a) && Intrinsics.areEqual(this.f26720b, x0Var.f26720b) && Intrinsics.areEqual(this.f26721c, x0Var.f26721c) && Intrinsics.areEqual(this.f26722d, x0Var.f26722d) && Intrinsics.areEqual(this.f26723e, x0Var.f26723e) && Intrinsics.areEqual(this.f26724f, x0Var.f26724f) && Intrinsics.areEqual(this.f26725g, x0Var.f26725g);
    }

    public final Long f() {
        return this.f26725g;
    }

    public final String g() {
        return this.f26721c;
    }

    public final int hashCode() {
        String str = this.f26719a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f26720b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f26721c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f26722d;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l10 = this.f26723e;
        int hashCode5 = (hashCode4 + (l10 == null ? 0 : l10.hashCode())) * 31;
        Long l11 = this.f26724f;
        int hashCode6 = (hashCode5 + (l11 == null ? 0 : l11.hashCode())) * 31;
        Long l12 = this.f26725g;
        return hashCode6 + (l12 != null ? l12.hashCode() : 0);
    }

    public final String toString() {
        return "SoftwareInfo(buildFingerprint=" + this.f26719a + ", buildId=" + this.f26720b + ", language=" + this.f26721c + ", country=" + this.f26722d + ", appInstallTime=" + this.f26723e + ", appUpdateTime=" + this.f26724f + ", daysSinceInstall=" + this.f26725g + ')';
    }
}
