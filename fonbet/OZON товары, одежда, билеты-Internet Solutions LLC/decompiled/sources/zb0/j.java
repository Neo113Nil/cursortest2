package zb0;

import Fm.C3051a;
import Sc.InterfaceC3999a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@InterfaceC3999a
/* loaded from: classes3.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    private final long f107504a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f107505b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f107506c;

    /* renamed from: d, reason: collision with root package name */
    private final String f107507d;

    /* renamed from: e, reason: collision with root package name */
    private final String f107508e;

    /* renamed from: f, reason: collision with root package name */
    private final String f107509f;

    /* renamed from: g, reason: collision with root package name */
    private final String f107510g;

    /* renamed from: h, reason: collision with root package name */
    private final Long f107511h;

    static {
        new j(0L, "", "", null, null, null, null, null);
    }

    public j(long j11, @NotNull String accessToken, @NotNull String refreshToken, String str, String str2, String str3, String str4, Long l11) {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        Intrinsics.checkNotNullParameter(refreshToken, "refreshToken");
        this.f107504a = j11;
        this.f107505b = accessToken;
        this.f107506c = refreshToken;
        this.f107507d = str;
        this.f107508e = str2;
        this.f107509f = str3;
        this.f107510g = str4;
        this.f107511h = l11;
    }

    @NotNull
    public final String a() {
        return this.f107505b;
    }

    public final long b() {
        return this.f107504a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f107504a == jVar.f107504a && Intrinsics.d(this.f107505b, jVar.f107505b) && Intrinsics.d(this.f107506c, jVar.f107506c) && Intrinsics.d(this.f107507d, jVar.f107507d) && Intrinsics.d(this.f107508e, jVar.f107508e) && Intrinsics.d(this.f107509f, jVar.f107509f) && Intrinsics.d(this.f107510g, jVar.f107510g) && Intrinsics.d(this.f107511h, jVar.f107511h);
    }

    public final int hashCode() {
        int a11 = G.g.a(G.g.a(Long.hashCode(this.f107504a) * 31, 31, this.f107505b), 31, this.f107506c);
        String str = this.f107507d;
        int hashCode = (a11 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f107508e;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f107509f;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f107510g;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l11 = this.f107511h;
        return hashCode4 + (l11 != null ? l11.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UserData(userId=");
        sb2.append(this.f107504a);
        sb2.append(", accessToken=");
        sb2.append(this.f107505b);
        sb2.append(", refreshToken=");
        sb2.append(this.f107506c);
        sb2.append(", idpToken=");
        sb2.append(this.f107507d);
        sb2.append(", sessionId=");
        sb2.append(this.f107508e);
        sb2.append(", sid=");
        sb2.append(this.f107509f);
        sb2.append(", productToken=");
        sb2.append(this.f107510g);
        sb2.append(", productUserId=");
        return C3051a.d(sb2, this.f107511h, ")");
    }
}
