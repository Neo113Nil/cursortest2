package c;

import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: c.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2460p {

    /* renamed from: a, reason: collision with root package name */
    public final String f26649a;

    /* renamed from: b, reason: collision with root package name */
    public final String f26650b;

    /* renamed from: c, reason: collision with root package name */
    public final String f26651c;

    public C2460p(String str, String connection_type, String str2) {
        Intrinsics.checkNotNullParameter(connection_type, "connection_type");
        this.f26649a = str;
        this.f26650b = connection_type;
        this.f26651c = str2;
    }

    public final Map a() {
        return MapsKt.mapOf(TuplesKt.to("wifi_ssid", this.f26649a), TuplesKt.to("connection_type", this.f26650b), TuplesKt.to("ip_address", this.f26651c));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2460p)) {
            return false;
        }
        C2460p c2460p = (C2460p) obj;
        return Intrinsics.areEqual(this.f26649a, c2460p.f26649a) && Intrinsics.areEqual(this.f26650b, c2460p.f26650b) && Intrinsics.areEqual(this.f26651c, c2460p.f26651c);
    }

    public final int hashCode() {
        String str = this.f26649a;
        int hashCode = (this.f26650b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31;
        String str2 = this.f26651c;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "Network(wifi_ssid=" + this.f26649a + ", connection_type=" + this.f26650b + ", ip_address=" + this.f26651c + ')';
    }
}
