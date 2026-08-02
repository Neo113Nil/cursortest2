package Gh;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class r implements Comparable {

    /* renamed from: b, reason: collision with root package name */
    public static final a f4179b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final JSONObject f4180a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final r a(JSONObject json) {
            Intrinsics.checkNotNullParameter(json, "json");
            JSONObject optJSONObject = json.optJSONObject("replayParams");
            Intrinsics.checkNotNullExpressionValue(optJSONObject, "json.optJSONObject(REPLAY_PARAMS)");
            return new r(optJSONObject);
        }

        public a() {
        }
    }

    public r(JSONObject replayParams) {
        Intrinsics.checkNotNullParameter(replayParams, "replayParams");
        this.f4180a = replayParams;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(r other) {
        Intrinsics.checkNotNullParameter(other, "other");
        String jSONObject = this.f4180a.toString();
        String jSONObject2 = other.f4180a.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject2, "other.replayParams.toString()");
        return jSONObject.compareTo(jSONObject2);
    }

    public final JSONObject b() {
        return this.f4180a;
    }

    public final JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.putOpt("replayParams", this.f4180a);
        return jSONObject;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r) && Intrinsics.areEqual(this.f4180a, ((r) obj).f4180a);
    }

    public int hashCode() {
        return this.f4180a.hashCode();
    }

    public String toString() {
        return "RadarReplay(replayParams=" + this.f4180a + ')';
    }
}
