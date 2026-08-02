package Gh;

import io.radar.sdk.C4589c;
import java.util.Date;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class l implements Comparable {

    /* renamed from: e, reason: collision with root package name */
    public static final a f4147e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final C4589c.EnumC4599k f4148a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4149b;

    /* renamed from: c, reason: collision with root package name */
    public final C4589c.EnumC4600l f4150c;

    /* renamed from: d, reason: collision with root package name */
    public final Date f4151d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final l a(JSONObject json) {
            Intrinsics.checkNotNullParameter(json, "json");
            String levelString = json.optString("level");
            String typeString = json.optString("type");
            Intrinsics.checkNotNullExpressionValue(levelString, "levelString");
            C4589c.EnumC4599k valueOf = !StringsKt.isBlank(levelString) ? C4589c.EnumC4599k.valueOf(levelString) : C4589c.EnumC4599k.INFO;
            Intrinsics.checkNotNullExpressionValue(typeString, "typeString");
            C4589c.EnumC4600l valueOf2 = (StringsKt.isBlank(typeString) || Intrinsics.areEqual(typeString, "NONE")) ? null : C4589c.EnumC4600l.valueOf(typeString);
            String optString = json.optString("message");
            Date date = new Date(json.optLong("createdAt"));
            Intrinsics.checkNotNullExpressionValue(optString, "optString(MESSAGE)");
            return new l(valueOf, optString, valueOf2, date);
        }

        public a() {
        }
    }

    public l(C4589c.EnumC4599k level, String message, C4589c.EnumC4600l enumC4600l, Date createdAt) {
        Intrinsics.checkNotNullParameter(level, "level");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        this.f4148a = level;
        this.f4149b = message;
        this.f4150c = enumC4600l;
        this.f4151d = createdAt;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(l other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return this.f4151d.compareTo(other.f4151d);
    }

    public final Date b() {
        return this.f4151d;
    }

    public final JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.putOpt("createdAt", Long.valueOf(this.f4151d.getTime()));
        jSONObject.putOpt("level", this.f4148a.name());
        C4589c.EnumC4600l enumC4600l = this.f4150c;
        jSONObject.putOpt("type", enumC4600l != null ? enumC4600l.name() : null);
        jSONObject.putOpt("message", this.f4149b);
        return jSONObject;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f4148a == lVar.f4148a && Intrinsics.areEqual(this.f4149b, lVar.f4149b) && this.f4150c == lVar.f4150c && Intrinsics.areEqual(this.f4151d, lVar.f4151d);
    }

    public int hashCode() {
        int hashCode = ((this.f4148a.hashCode() * 31) + this.f4149b.hashCode()) * 31;
        C4589c.EnumC4600l enumC4600l = this.f4150c;
        return ((hashCode + (enumC4600l == null ? 0 : enumC4600l.hashCode())) * 31) + this.f4151d.hashCode();
    }

    public String toString() {
        return "RadarLog(level=" + this.f4148a + ", message=" + this.f4149b + ", type=" + this.f4150c + ", createdAt=" + this.f4151d + ')';
    }

    public /* synthetic */ l(C4589c.EnumC4599k enumC4599k, String str, C4589c.EnumC4600l enumC4600l, Date date, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(enumC4599k, str, enumC4600l, (i10 & 8) != 0 ? new Date() : date);
    }
}
