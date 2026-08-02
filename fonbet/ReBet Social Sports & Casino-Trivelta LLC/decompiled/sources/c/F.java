package c;

import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class F {

    /* renamed from: a, reason: collision with root package name */
    public final String f26407a;

    /* renamed from: b, reason: collision with root package name */
    public final String f26408b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f26409c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f26410d;

    /* renamed from: e, reason: collision with root package name */
    public final Integer f26411e;

    public F(String str, String str2, Integer num, Integer num2, Integer num3) {
        this.f26407a = str;
        this.f26408b = str2;
        this.f26409c = num;
        this.f26410d = num2;
        this.f26411e = num3;
    }

    public final Map a() {
        return MapsKt.mapOf(TuplesKt.to("ssid", this.f26407a), TuplesKt.to("bssid", this.f26408b), TuplesKt.to("link_speed", this.f26409c), TuplesKt.to("rssi", this.f26410d), TuplesKt.to("frequency", this.f26411e));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof F)) {
            return false;
        }
        F f10 = (F) obj;
        return Intrinsics.areEqual(this.f26407a, f10.f26407a) && Intrinsics.areEqual(this.f26408b, f10.f26408b) && Intrinsics.areEqual(this.f26409c, f10.f26409c) && Intrinsics.areEqual(this.f26410d, f10.f26410d) && Intrinsics.areEqual(this.f26411e, f10.f26411e);
    }

    public final int hashCode() {
        String str = this.f26407a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f26408b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.f26409c;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f26410d;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f26411e;
        return hashCode4 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        return "Wifi(ssid=" + this.f26407a + ", bssid=" + this.f26408b + ", link_speed=" + this.f26409c + ", rssi=" + this.f26410d + ", frequency=" + this.f26411e + ')';
    }
}
