package ja;

import j$.time.Instant;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b implements kc.b {

    /* renamed from: a, reason: collision with root package name */
    public final int f18364a;

    /* renamed from: b, reason: collision with root package name */
    public final int f18365b;

    /* renamed from: c, reason: collision with root package name */
    public final int f18366c;

    /* renamed from: d, reason: collision with root package name */
    public final int f18367d;

    /* renamed from: e, reason: collision with root package name */
    public final String f18368e;

    /* renamed from: f, reason: collision with root package name */
    public final String f18369f;

    /* renamed from: g, reason: collision with root package name */
    public final String f18370g;

    /* renamed from: h, reason: collision with root package name */
    public final int f18371h;

    /* renamed from: i, reason: collision with root package name */
    public final String f18372i;
    public final String j;

    /* renamed from: k, reason: collision with root package name */
    public final String f18373k;

    /* renamed from: l, reason: collision with root package name */
    public final String f18374l;

    /* renamed from: m, reason: collision with root package name */
    public final String f18375m;

    /* renamed from: n, reason: collision with root package name */
    public final String f18376n;

    /* renamed from: o, reason: collision with root package name */
    public final String f18377o;

    /* renamed from: p, reason: collision with root package name */
    public final String f18378p;
    public final Integer q;

    /* renamed from: r, reason: collision with root package name */
    public final Integer f18379r;

    /* renamed from: s, reason: collision with root package name */
    public final String f18380s;

    /* renamed from: t, reason: collision with root package name */
    public final String f18381t;

    /* renamed from: u, reason: collision with root package name */
    public final String f18382u;

    /* renamed from: v, reason: collision with root package name */
    public final String f18383v;

    /* renamed from: w, reason: collision with root package name */
    public final Integer f18384w;

    /* renamed from: x, reason: collision with root package name */
    public final Integer f18385x;

    /* renamed from: y, reason: collision with root package name */
    public final Integer f18386y;

    /* renamed from: z, reason: collision with root package name */
    public final Integer f18387z;

    public b(int i5, int i10, int i11, int i12, String str, String str2, String str3, int i13, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Integer num, Integer num2, String str12, String str13, String str14, String str15, Integer num3, Integer num4, Integer num5, Integer num6) {
        this.f18364a = i5;
        this.f18365b = i10;
        this.f18366c = i11;
        this.f18367d = i12;
        this.f18368e = str;
        this.f18369f = str2;
        this.f18370g = str3;
        this.f18371h = i13;
        this.f18372i = str4;
        this.j = str5;
        this.f18373k = str6;
        this.f18374l = str7;
        this.f18375m = str8;
        this.f18376n = str9;
        this.f18377o = str10;
        this.f18378p = str11;
        this.q = num;
        this.f18379r = num2;
        this.f18380s = str12;
        this.f18381t = str13;
        this.f18382u = str14;
        this.f18383v = str15;
        this.f18384w = num3;
        this.f18385x = num4;
        this.f18386y = num5;
        this.f18387z = num6;
    }

    @Override // kc.b
    public final String HHmmString() {
        return io.sentry.config.a.x(this.f18365b, "HH:mm");
    }

    @Override // kc.b
    public final String ddMMyyyyString() {
        return io.sentry.config.a.x(this.f18365b, "dd.MM.yyyy");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f18364a == bVar.f18364a && this.f18365b == bVar.f18365b && this.f18366c == bVar.f18366c && this.f18367d == bVar.f18367d && Intrinsics.areEqual(this.f18368e, bVar.f18368e) && Intrinsics.areEqual(this.f18369f, bVar.f18369f) && Intrinsics.areEqual(this.f18370g, bVar.f18370g) && this.f18371h == bVar.f18371h && Intrinsics.areEqual(this.f18372i, bVar.f18372i) && Intrinsics.areEqual(this.j, bVar.j) && Intrinsics.areEqual(this.f18373k, bVar.f18373k) && Intrinsics.areEqual(this.f18374l, bVar.f18374l) && Intrinsics.areEqual(this.f18375m, bVar.f18375m) && Intrinsics.areEqual(this.f18376n, bVar.f18376n) && Intrinsics.areEqual(this.f18377o, bVar.f18377o) && Intrinsics.areEqual(this.f18378p, bVar.f18378p) && Intrinsics.areEqual(this.q, bVar.q) && Intrinsics.areEqual(this.f18379r, bVar.f18379r) && Intrinsics.areEqual(this.f18380s, bVar.f18380s) && Intrinsics.areEqual(this.f18381t, bVar.f18381t) && Intrinsics.areEqual(this.f18382u, bVar.f18382u) && Intrinsics.areEqual(this.f18383v, bVar.f18383v) && Intrinsics.areEqual(this.f18384w, bVar.f18384w) && Intrinsics.areEqual(this.f18385x, bVar.f18385x) && Intrinsics.areEqual(this.f18386y, bVar.f18386y) && Intrinsics.areEqual(this.f18387z, bVar.f18387z);
    }

    @Override // kc.b
    public final String getAnalyticsFull() {
        return this.f18372i;
    }

    @Override // kc.b
    public final String getAnalyticsShort() {
        return this.j;
    }

    @Override // kc.b
    public final String getArrayKind() {
        return this.f18375m;
    }

    @Override // kc.b
    public final String getForecast() {
        return this.f18378p;
    }

    @Override // kc.b
    public final int getId() {
        return this.f18364a;
    }

    @Override // kc.b
    public final String getImageBackground() {
        return this.f18369f;
    }

    @Override // kc.b
    public final String getLeague() {
        return this.f18373k;
    }

    @Override // kc.b
    public final String getOdds() {
        return this.f18370g;
    }

    @Override // kc.b
    public final Integer getScoreGuest() {
        return this.f18385x;
    }

    @Override // kc.b
    public final Integer getScoreGuestExtra() {
        return this.f18387z;
    }

    @Override // kc.b
    public final Integer getScoreHome() {
        return this.f18384w;
    }

    @Override // kc.b
    public final Integer getScoreHomeExtra() {
        return this.f18386y;
    }

    @Override // kc.b
    public final int getStartTime() {
        return this.f18365b;
    }

    @Override // kc.b
    public final String getStatus() {
        return this.f18368e;
    }

    @Override // kc.b
    public final String getTeamGuestFlag() {
        return this.f18381t;
    }

    @Override // kc.b
    public final String getTeamGuestName() {
        return this.f18383v;
    }

    @Override // kc.b
    public final String getTeamHomeFlag() {
        return this.f18380s;
    }

    @Override // kc.b
    public final String getTeamHomeName() {
        return this.f18382u;
    }

    @Override // kc.b
    public final int getType() {
        return this.f18367d;
    }

    public final int hashCode() {
        int i5 = ((((((this.f18364a * 31) + this.f18365b) * 31) + this.f18366c) * 31) + this.f18367d) * 31;
        String str = this.f18368e;
        int hashCode = (i5 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f18369f;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f18370g;
        int hashCode3 = (((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.f18371h) * 31;
        String str4 = this.f18372i;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.j;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f18373k;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f18374l;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f18375m;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.f18376n;
        int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.f18377o;
        int hashCode10 = (hashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.f18378p;
        int hashCode11 = (hashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        Integer num = this.q;
        int hashCode12 = (hashCode11 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f18379r;
        int hashCode13 = (hashCode12 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str12 = this.f18380s;
        int hashCode14 = (hashCode13 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.f18381t;
        int hashCode15 = (hashCode14 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.f18382u;
        int hashCode16 = (hashCode15 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.f18383v;
        int hashCode17 = (hashCode16 + (str15 == null ? 0 : str15.hashCode())) * 31;
        Integer num3 = this.f18384w;
        int hashCode18 = (hashCode17 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f18385x;
        int hashCode19 = (hashCode18 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.f18386y;
        int hashCode20 = (hashCode19 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.f18387z;
        return hashCode20 + (num6 != null ? num6.hashCode() : 0);
    }

    @Override // kc.b
    public final boolean isMatchStarted() {
        return ((long) this.f18365b) <= Instant.now().getEpochSecond();
    }

    @Override // kc.b
    public final long startTimeMillisSecond() {
        return this.f18365b * 1000;
    }

    @Override // kc.b
    public final String statusPrediction() {
        String str = this.f18368e;
        return str == null ? "unknown" : str;
    }

    public final String toString() {
        return "PredictionView(id=" + this.f18364a + ", startTime=" + this.f18365b + ", publication=" + this.f18366c + ", type=" + this.f18367d + ", status=" + this.f18368e + ", imageBackground=" + this.f18369f + ", odds=" + this.f18370g + ", resultsIsViewed=" + this.f18371h + ", analyticsFull=" + this.f18372i + ", analyticsShort=" + this.j + ", league=" + this.f18373k + ", forecasts=" + this.f18374l + ", arrayKind=" + this.f18375m + ", arrayPrediction=" + this.f18376n + ", oddsForecast=" + this.f18377o + ", forecast=" + this.f18378p + ", teamHomeId=" + this.q + ", teamGuestId=" + this.f18379r + ", teamHomeFlag=" + this.f18380s + ", teamGuestFlag=" + this.f18381t + ", teamHomeName=" + this.f18382u + ", teamGuestName=" + this.f18383v + ", scoreHome=" + this.f18384w + ", scoreGuest=" + this.f18385x + ", scoreHomeExtra=" + this.f18386y + ", scoreGuestExtra=" + this.f18387z + ')';
    }
}
