package c;

import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: c.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2471x {

    /* renamed from: a, reason: collision with root package name */
    public final String f26714a;

    /* renamed from: b, reason: collision with root package name */
    public final String f26715b;

    /* renamed from: c, reason: collision with root package name */
    public final String f26716c;

    /* renamed from: d, reason: collision with root package name */
    public final String f26717d;

    /* renamed from: e, reason: collision with root package name */
    public final String f26718e;

    public C2471x(String str, String str2, String str3, String str4, String str5) {
        this.f26714a = str;
        this.f26715b = str2;
        this.f26716c = str3;
        this.f26717d = str4;
        this.f26718e = str5;
    }

    public final Map a() {
        return MapsKt.mapOf(TuplesKt.to("carrier_name", this.f26714a), TuplesKt.to("carrier_country", this.f26715b), TuplesKt.to("sim_country", this.f26716c), TuplesKt.to("network_type", this.f26717d), TuplesKt.to("sim_state", this.f26718e));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2471x)) {
            return false;
        }
        C2471x c2471x = (C2471x) obj;
        return Intrinsics.areEqual(this.f26714a, c2471x.f26714a) && Intrinsics.areEqual(this.f26715b, c2471x.f26715b) && Intrinsics.areEqual(this.f26716c, c2471x.f26716c) && Intrinsics.areEqual(this.f26717d, c2471x.f26717d) && Intrinsics.areEqual(this.f26718e, c2471x.f26718e);
    }

    public final int hashCode() {
        String str = this.f26714a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f26715b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f26716c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f26717d;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f26718e;
        return hashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        return "SimCard(carrier_name=" + this.f26714a + ", carrier_country=" + this.f26715b + ", sim_country=" + this.f26716c + ", network_type=" + this.f26717d + ", sim_state=" + this.f26718e + ')';
    }
}
