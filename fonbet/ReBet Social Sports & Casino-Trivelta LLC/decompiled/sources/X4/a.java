package X4;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Q5.b f13535a;

    /* renamed from: b, reason: collision with root package name */
    public final String f13536b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f13537c;

    /* renamed from: d, reason: collision with root package name */
    public final Map f13538d;

    public a(Q5.b severity, String message, Map map, Map map2) {
        Intrinsics.checkNotNullParameter(severity, "severity");
        Intrinsics.checkNotNullParameter(message, "message");
        this.f13535a = severity;
        this.f13536b = message;
        this.f13537c = map;
        this.f13538d = map2;
    }

    public final Map a() {
        return this.f13537c;
    }

    public final Map b() {
        return this.f13538d;
    }

    public final String c() {
        return this.f13536b;
    }

    public final Q5.b d() {
        return this.f13535a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.areEqual(this.f13535a, aVar.f13535a) && Intrinsics.areEqual(this.f13536b, aVar.f13536b) && Intrinsics.areEqual(this.f13537c, aVar.f13537c) && Intrinsics.areEqual(this.f13538d, aVar.f13538d);
    }

    public int hashCode() {
        int hashCode = ((this.f13535a.hashCode() * 31) + this.f13536b.hashCode()) * 31;
        Map map = this.f13537c;
        int hashCode2 = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
        Map map2 = this.f13538d;
        return hashCode2 + (map2 != null ? map2.hashCode() : 0);
    }

    public String toString() {
        return "CustomLogDetails(severity=" + this.f13535a + ", message=" + this.f13536b + ", data=" + this.f13537c + ", labels=" + this.f13538d + ")";
    }
}
