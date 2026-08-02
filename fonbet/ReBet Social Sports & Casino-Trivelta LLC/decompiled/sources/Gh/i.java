package Gh;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class i {

    /* renamed from: k, reason: collision with root package name */
    public static final a f4128k = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f4129a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f4130b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f4131c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f4132d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f4133e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f4134f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f4135g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f4136h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f4137i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f4138j;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final i a(JSONObject jSONObject) {
            return new i(jSONObject != null ? jSONObject.optBoolean("passed", false) : false, jSONObject != null ? jSONObject.optBoolean("bypassed", false) : false, jSONObject != null ? jSONObject.optBoolean("verified", false) : false, jSONObject != null ? jSONObject.optBoolean("proxy", false) : false, jSONObject != null ? jSONObject.optBoolean("mocked", false) : false, jSONObject != null ? jSONObject.optBoolean("compromised", false) : false, jSONObject != null ? jSONObject.optBoolean("jumped", false) : false, jSONObject != null ? jSONObject.optBoolean("sharing", false) : false, jSONObject != null ? jSONObject.optBoolean("inaccurate", false) : false, jSONObject != null ? jSONObject.optBoolean("blocked", false) : false);
        }

        public a() {
        }
    }

    public i(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19) {
        this.f4129a = z10;
        this.f4130b = z11;
        this.f4131c = z12;
        this.f4132d = z13;
        this.f4133e = z14;
        this.f4134f = z15;
        this.f4135g = z16;
        this.f4136h = z17;
        this.f4137i = z18;
        this.f4138j = z19;
    }

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.putOpt("passed", Boolean.valueOf(this.f4129a));
        jSONObject.putOpt("bypassed", Boolean.valueOf(this.f4130b));
        jSONObject.putOpt("verified", Boolean.valueOf(this.f4131c));
        jSONObject.putOpt("proxy", Boolean.valueOf(this.f4132d));
        jSONObject.putOpt("mocked", Boolean.valueOf(this.f4133e));
        jSONObject.putOpt("compromised", Boolean.valueOf(this.f4134f));
        jSONObject.putOpt("jumped", Boolean.valueOf(this.f4135g));
        jSONObject.putOpt("sharing", Boolean.valueOf(this.f4136h));
        jSONObject.putOpt("inaccurate", Boolean.valueOf(this.f4137i));
        jSONObject.putOpt("blocked", Boolean.valueOf(this.f4138j));
        return jSONObject;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f4129a == iVar.f4129a && this.f4130b == iVar.f4130b && this.f4131c == iVar.f4131c && this.f4132d == iVar.f4132d && this.f4133e == iVar.f4133e && this.f4134f == iVar.f4134f && this.f4135g == iVar.f4135g && this.f4136h == iVar.f4136h && this.f4137i == iVar.f4137i && this.f4138j == iVar.f4138j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v8, types: [boolean] */
    public int hashCode() {
        boolean z10 = this.f4129a;
        ?? r02 = z10;
        if (z10) {
            r02 = 1;
        }
        int i10 = r02 * 31;
        ?? r22 = this.f4130b;
        int i11 = r22;
        if (r22 != 0) {
            i11 = 1;
        }
        int i12 = (i10 + i11) * 31;
        ?? r23 = this.f4131c;
        int i13 = r23;
        if (r23 != 0) {
            i13 = 1;
        }
        int i14 = (i12 + i13) * 31;
        ?? r24 = this.f4132d;
        int i15 = r24;
        if (r24 != 0) {
            i15 = 1;
        }
        int i16 = (i14 + i15) * 31;
        ?? r25 = this.f4133e;
        int i17 = r25;
        if (r25 != 0) {
            i17 = 1;
        }
        int i18 = (i16 + i17) * 31;
        ?? r26 = this.f4134f;
        int i19 = r26;
        if (r26 != 0) {
            i19 = 1;
        }
        int i20 = (i18 + i19) * 31;
        ?? r27 = this.f4135g;
        int i21 = r27;
        if (r27 != 0) {
            i21 = 1;
        }
        int i22 = (i20 + i21) * 31;
        ?? r28 = this.f4136h;
        int i23 = r28;
        if (r28 != 0) {
            i23 = 1;
        }
        int i24 = (i22 + i23) * 31;
        ?? r29 = this.f4137i;
        int i25 = r29;
        if (r29 != 0) {
            i25 = 1;
        }
        int i26 = (i24 + i25) * 31;
        boolean z11 = this.f4138j;
        return i26 + (z11 ? 1 : z11 ? 1 : 0);
    }

    public String toString() {
        return "RadarFraud(passed=" + this.f4129a + ", bypassed=" + this.f4130b + ", verified=" + this.f4131c + ", proxy=" + this.f4132d + ", mocked=" + this.f4133e + ", compromised=" + this.f4134f + ", jumped=" + this.f4135g + ", sharing=" + this.f4136h + ", inaccurate=" + this.f4137i + ", blocked=" + this.f4138j + ')';
    }
}
