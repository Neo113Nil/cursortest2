package c;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class G {

    /* renamed from: a, reason: collision with root package name */
    public final String f26419a;

    /* renamed from: b, reason: collision with root package name */
    public final String f26420b;

    /* renamed from: c, reason: collision with root package name */
    public final long f26421c;

    /* renamed from: d, reason: collision with root package name */
    public final String f26422d;

    /* renamed from: e, reason: collision with root package name */
    public final Map f26423e;

    /* renamed from: f, reason: collision with root package name */
    public final String f26424f;

    /* renamed from: g, reason: collision with root package name */
    public final String f26425g;

    /* renamed from: h, reason: collision with root package name */
    public final String f26426h;

    /* renamed from: i, reason: collision with root package name */
    public final String f26427i;

    public G(String sessionId, String deviceFingerprint, long j10, String str, Map map, String str2, String str3, String str4, String str5) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(deviceFingerprint, "deviceFingerprint");
        this.f26419a = sessionId;
        this.f26420b = deviceFingerprint;
        this.f26421c = j10;
        this.f26422d = str;
        this.f26423e = map;
        this.f26424f = str2;
        this.f26425g = str3;
        this.f26426h = str4;
        this.f26427i = str5;
    }

    public final String a() {
        return this.f26425g;
    }

    public final String b() {
        return this.f26422d;
    }

    public final Map c() {
        return this.f26423e;
    }

    public final String d() {
        return this.f26420b;
    }

    public final String e() {
        return this.f26426h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G)) {
            return false;
        }
        G g10 = (G) obj;
        return Intrinsics.areEqual(this.f26419a, g10.f26419a) && Intrinsics.areEqual(this.f26420b, g10.f26420b) && this.f26421c == g10.f26421c && Intrinsics.areEqual(this.f26422d, g10.f26422d) && Intrinsics.areEqual(this.f26423e, g10.f26423e) && Intrinsics.areEqual(this.f26424f, g10.f26424f) && Intrinsics.areEqual(this.f26425g, g10.f26425g) && Intrinsics.areEqual(this.f26426h, g10.f26426h) && Intrinsics.areEqual(this.f26427i, g10.f26427i);
    }

    public final String f() {
        return this.f26424f;
    }

    public final String g() {
        return this.f26419a;
    }

    public final long h() {
        return this.f26421c;
    }

    public final int hashCode() {
        int hashCode = (Long.hashCode(this.f26421c) + ((this.f26420b.hashCode() + (this.f26419a.hashCode() * 31)) * 31)) * 31;
        String str = this.f26422d;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Map map = this.f26423e;
        int hashCode3 = (hashCode2 + (map == null ? 0 : map.hashCode())) * 31;
        String str2 = this.f26424f;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f26425g;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f26426h;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f26427i;
        return hashCode6 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String i() {
        return this.f26427i;
    }

    public final String toString() {
        return "VerificationRequest(sessionId=" + this.f26419a + ", deviceFingerprint=" + this.f26420b + ", timestamp=" + this.f26421c + ", attestationToken=" + this.f26422d + ", deviceData=" + this.f26423e + ", reason=" + this.f26424f + ", appVersion=" + this.f26425g + ", errorType=" + this.f26426h + ", verisoulSessionId=" + this.f26427i + ')';
    }
}
