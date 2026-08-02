package Gh;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: d, reason: collision with root package name */
    public static final a f4062d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final m f4063a;

    /* renamed from: b, reason: collision with root package name */
    public final Long f4064b;

    /* renamed from: c, reason: collision with root package name */
    public final String f4065c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final e a(JSONObject jSONObject) {
            return new e(m.f4152c.a(jSONObject != null ? jSONObject.optJSONObject("meta") : null), jSONObject != null ? Long.valueOf(jSONObject.optLong("googleCloudProjectNumber")) : null, jSONObject != null ? jSONObject.optString("nonce") : null);
        }

        public a() {
        }
    }

    public e(m meta, Long l10, String str) {
        Intrinsics.checkNotNullParameter(meta, "meta");
        this.f4063a = meta;
        this.f4064b = l10;
        this.f4065c = str;
    }

    public final Long a() {
        return this.f4064b;
    }

    public final m b() {
        return this.f4063a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.areEqual(this.f4063a, eVar.f4063a) && Intrinsics.areEqual(this.f4064b, eVar.f4064b) && Intrinsics.areEqual(this.f4065c, eVar.f4065c);
    }

    public int hashCode() {
        int hashCode = this.f4063a.hashCode() * 31;
        Long l10 = this.f4064b;
        int hashCode2 = (hashCode + (l10 == null ? 0 : l10.hashCode())) * 31;
        String str = this.f4065c;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "RadarConfig(meta=" + this.f4063a + ", googlePlayProjectNumber=" + this.f4064b + ", nonce=" + this.f4065c + ')';
    }
}
