package Gh;

import io.radar.sdk.N0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class m {

    /* renamed from: c, reason: collision with root package name */
    public static final a f4152c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final N0 f4153a;

    /* renamed from: b, reason: collision with root package name */
    public final y f4154b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final m a(JSONObject jSONObject) {
            JSONObject optJSONObject = jSONObject != null ? jSONObject.optJSONObject("trackingOptions") : null;
            return new m(optJSONObject != null ? N0.f49715u.a(optJSONObject) : null, y.f4201n.a(jSONObject != null ? jSONObject.optJSONObject("sdkConfiguration") : null));
        }

        public a() {
        }
    }

    public m(N0 n02, y yVar) {
        this.f4153a = n02;
        this.f4154b = yVar;
    }

    public final N0 a() {
        return this.f4153a;
    }

    public final y b() {
        return this.f4154b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return Intrinsics.areEqual(this.f4153a, mVar.f4153a) && Intrinsics.areEqual(this.f4154b, mVar.f4154b);
    }

    public int hashCode() {
        N0 n02 = this.f4153a;
        int hashCode = (n02 == null ? 0 : n02.hashCode()) * 31;
        y yVar = this.f4154b;
        return hashCode + (yVar != null ? yVar.hashCode() : 0);
    }

    public String toString() {
        return "RadarMeta(remoteTrackingOptions=" + this.f4153a + ", sdkConfiguration=" + this.f4154b + ')';
    }
}
