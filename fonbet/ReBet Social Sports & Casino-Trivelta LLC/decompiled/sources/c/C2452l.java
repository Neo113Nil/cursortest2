package c;

import com.twilio.voice.EventKeys;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: c.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2452l {

    /* renamed from: a, reason: collision with root package name */
    public final double f26617a;

    /* renamed from: b, reason: collision with root package name */
    public final double f26618b;

    /* renamed from: c, reason: collision with root package name */
    public final float f26619c;

    /* renamed from: d, reason: collision with root package name */
    public final long f26620d;

    /* renamed from: e, reason: collision with root package name */
    public final Double f26621e;

    /* renamed from: f, reason: collision with root package name */
    public final Float f26622f;

    /* renamed from: g, reason: collision with root package name */
    public final String f26623g;

    public C2452l(double d10, double d11, float f10, long j10, Double d12, Float f11, String str) {
        this.f26617a = d10;
        this.f26618b = d11;
        this.f26619c = f10;
        this.f26620d = j10;
        this.f26621e = d12;
        this.f26622f = f11;
        this.f26623g = str;
    }

    public final Map a() {
        return MapsKt.mapOf(TuplesKt.to("latitude", Double.valueOf(this.f26617a)), TuplesKt.to("longitude", Double.valueOf(this.f26618b)), TuplesKt.to("accuracy", Float.valueOf(this.f26619c)), TuplesKt.to(EventKeys.TIMESTAMP, Long.valueOf(this.f26620d)), TuplesKt.to("altitude", this.f26621e), TuplesKt.to("speed", this.f26622f), TuplesKt.to("provider", this.f26623g));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2452l)) {
            return false;
        }
        C2452l c2452l = (C2452l) obj;
        return Double.compare(this.f26617a, c2452l.f26617a) == 0 && Double.compare(this.f26618b, c2452l.f26618b) == 0 && Float.compare(this.f26619c, c2452l.f26619c) == 0 && this.f26620d == c2452l.f26620d && Intrinsics.areEqual((Object) this.f26621e, (Object) c2452l.f26621e) && Intrinsics.areEqual((Object) this.f26622f, (Object) c2452l.f26622f) && Intrinsics.areEqual(this.f26623g, c2452l.f26623g);
    }

    public final int hashCode() {
        int hashCode = (Long.hashCode(this.f26620d) + ((Float.hashCode(this.f26619c) + ((Double.hashCode(this.f26618b) + (Double.hashCode(this.f26617a) * 31)) * 31)) * 31)) * 31;
        Double d10 = this.f26621e;
        int hashCode2 = (hashCode + (d10 == null ? 0 : d10.hashCode())) * 31;
        Float f10 = this.f26622f;
        int hashCode3 = (hashCode2 + (f10 == null ? 0 : f10.hashCode())) * 31;
        String str = this.f26623g;
        return hashCode3 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "Location(latitude=" + this.f26617a + ", longitude=" + this.f26618b + ", accuracy=" + this.f26619c + ", timestamp=" + this.f26620d + ", altitude=" + this.f26621e + ", speed=" + this.f26622f + ", provider=" + this.f26623g + ')';
    }
}
