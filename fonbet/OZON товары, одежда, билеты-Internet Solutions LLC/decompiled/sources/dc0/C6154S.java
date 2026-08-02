package dc0;

import Fm.C3051a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: dc0.S, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C6154S {

    /* renamed from: a, reason: collision with root package name */
    private final Long f61522a;

    /* renamed from: b, reason: collision with root package name */
    private final String f61523b;

    /* renamed from: c, reason: collision with root package name */
    private final String f61524c;

    /* renamed from: d, reason: collision with root package name */
    private final String f61525d;

    /* renamed from: e, reason: collision with root package name */
    private final String f61526e;

    /* renamed from: f, reason: collision with root package name */
    private final String f61527f;

    /* renamed from: g, reason: collision with root package name */
    private final String f61528g;

    /* renamed from: h, reason: collision with root package name */
    private final Long f61529h;

    public C6154S(Long l11, String str, String str2, String str3, String str4, String str5, String str6, Long l12) {
        this.f61522a = l11;
        this.f61523b = str;
        this.f61524c = str2;
        this.f61525d = str3;
        this.f61526e = str4;
        this.f61527f = str5;
        this.f61528g = str6;
        this.f61529h = l12;
    }

    public final String a() {
        return this.f61523b;
    }

    public final String b() {
        return this.f61525d;
    }

    public final String c() {
        return this.f61528g;
    }

    public final Long d() {
        return this.f61529h;
    }

    public final String e() {
        return this.f61524c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6154S)) {
            return false;
        }
        C6154S c6154s = (C6154S) obj;
        return Intrinsics.d(this.f61522a, c6154s.f61522a) && Intrinsics.d(this.f61523b, c6154s.f61523b) && Intrinsics.d(this.f61524c, c6154s.f61524c) && Intrinsics.d(this.f61525d, c6154s.f61525d) && Intrinsics.d(this.f61526e, c6154s.f61526e) && Intrinsics.d(this.f61527f, c6154s.f61527f) && Intrinsics.d(this.f61528g, c6154s.f61528g) && Intrinsics.d(this.f61529h, c6154s.f61529h);
    }

    public final String f() {
        return this.f61526e;
    }

    public final String g() {
        return this.f61527f;
    }

    public final Long h() {
        return this.f61522a;
    }

    public final int hashCode() {
        Long l11 = this.f61522a;
        int hashCode = (l11 == null ? 0 : l11.hashCode()) * 31;
        String str = this.f61523b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f61524c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f61525d;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f61526e;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f61527f;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f61528g;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Long l12 = this.f61529h;
        return hashCode7 + (l12 != null ? l12.hashCode() : 0);
    }

    public final boolean i() {
        Long l11 = this.f61522a;
        return l11 == null || l11.longValue() == 0;
    }

    public final boolean j() {
        Long l11 = this.f61522a;
        return l11 != null && l11.longValue() > 0;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UserData(userId=");
        sb2.append(this.f61522a);
        sb2.append(", accessToken=");
        sb2.append(this.f61523b);
        sb2.append(", refreshToken=");
        sb2.append(this.f61524c);
        sb2.append(", idpToken=");
        sb2.append(this.f61525d);
        sb2.append(", sessionId=");
        sb2.append(this.f61526e);
        sb2.append(", sid=");
        sb2.append(this.f61527f);
        sb2.append(", productToken=");
        sb2.append(this.f61528g);
        sb2.append(", productUserId=");
        return C3051a.d(sb2, this.f61529h, ")");
    }
}
