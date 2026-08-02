package ja;

import android.os.Bundle;
import com.sports.insider.data.room.general.table.predictions.PredictionTable;
import hc.f;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class c implements f {

    /* renamed from: a, reason: collision with root package name */
    public final int f18388a;

    /* renamed from: b, reason: collision with root package name */
    public final int f18389b;

    /* renamed from: c, reason: collision with root package name */
    public final int f18390c;

    /* renamed from: d, reason: collision with root package name */
    public final int f18391d;

    /* renamed from: e, reason: collision with root package name */
    public final String f18392e;

    /* renamed from: f, reason: collision with root package name */
    public final String f18393f;

    /* renamed from: g, reason: collision with root package name */
    public final String f18394g;

    /* renamed from: h, reason: collision with root package name */
    public final String f18395h;

    /* renamed from: i, reason: collision with root package name */
    public final String f18396i;
    public final int j;

    /* renamed from: k, reason: collision with root package name */
    public final String f18397k;

    /* renamed from: l, reason: collision with root package name */
    public final String f18398l;

    /* renamed from: m, reason: collision with root package name */
    public final Integer f18399m;

    /* renamed from: n, reason: collision with root package name */
    public final Integer f18400n;

    /* renamed from: o, reason: collision with root package name */
    public final Integer f18401o;

    /* renamed from: p, reason: collision with root package name */
    public final Integer f18402p;
    public final Integer q;

    /* renamed from: r, reason: collision with root package name */
    public final Integer f18403r;

    /* renamed from: s, reason: collision with root package name */
    public final String f18404s;

    /* renamed from: t, reason: collision with root package name */
    public final String f18405t;

    /* renamed from: u, reason: collision with root package name */
    public final String f18406u;

    /* renamed from: v, reason: collision with root package name */
    public final String f18407v;

    public c(int i5, int i10, int i11, int i12, String str, String str2, String str3, String str4, String str5, int i13, String str6, String str7, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, String str8, String str9, String str10, String str11) {
        this.f18388a = i5;
        this.f18389b = i10;
        this.f18390c = i11;
        this.f18391d = i12;
        this.f18392e = str;
        this.f18393f = str2;
        this.f18394g = str3;
        this.f18395h = str4;
        this.f18396i = str5;
        this.j = i13;
        this.f18397k = str6;
        this.f18398l = str7;
        this.f18399m = num;
        this.f18400n = num2;
        this.f18401o = num3;
        this.f18402p = num4;
        this.q = num5;
        this.f18403r = num6;
        this.f18404s = str8;
        this.f18405t = str9;
        this.f18406u = str10;
        this.f18407v = str11;
    }

    public final boolean a() {
        return ((long) this.f18389b) * 1000 <= System.currentTimeMillis();
    }

    @Override // hc.f
    public final boolean areContentsTheSame(Object obj) {
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof c)) {
            return super.equals(obj);
        }
        c cVar = (c) obj;
        return this.j == cVar.j && Intrinsics.areEqual(this.q, cVar.q) && Intrinsics.areEqual(this.f18406u, cVar.f18406u) && Intrinsics.areEqual(this.f18404s, cVar.f18404s) && Intrinsics.areEqual(this.f18399m, cVar.f18399m) && Intrinsics.areEqual(this.f18401o, cVar.f18401o) && Intrinsics.areEqual(this.f18403r, cVar.f18403r) && Intrinsics.areEqual(this.f18407v, cVar.f18407v) && Intrinsics.areEqual(this.f18405t, cVar.f18405t) && Intrinsics.areEqual(this.f18400n, cVar.f18400n) && Intrinsics.areEqual(this.f18402p, cVar.f18402p) && Intrinsics.areEqual(this.f18393f, cVar.f18393f) && Intrinsics.areEqual(this.f18395h, cVar.f18395h) && Intrinsics.areEqual(this.f18396i, cVar.f18396i) && this.f18391d == cVar.f18391d && Intrinsics.areEqual(this.f18394g, cVar.f18394g) && this.f18390c == cVar.f18390c && this.f18389b == cVar.f18389b && Intrinsics.areEqual(this.f18392e, cVar.f18392e);
    }

    @Override // hc.f
    public final boolean areItemsTheSame(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof c) {
            return this.f18388a == ((c) obj).f18388a;
        }
        return super.equals(obj);
    }

    public final String b() {
        String str = this.f18392e;
        return str == null ? "unknown" : str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f18388a == cVar.f18388a && this.f18389b == cVar.f18389b && this.f18390c == cVar.f18390c && this.f18391d == cVar.f18391d && Intrinsics.areEqual(this.f18392e, cVar.f18392e) && Intrinsics.areEqual(this.f18393f, cVar.f18393f) && Intrinsics.areEqual(this.f18394g, cVar.f18394g) && Intrinsics.areEqual(this.f18395h, cVar.f18395h) && Intrinsics.areEqual(this.f18396i, cVar.f18396i) && this.j == cVar.j && Intrinsics.areEqual(this.f18397k, cVar.f18397k) && Intrinsics.areEqual(this.f18398l, cVar.f18398l) && Intrinsics.areEqual(this.f18399m, cVar.f18399m) && Intrinsics.areEqual(this.f18400n, cVar.f18400n) && Intrinsics.areEqual(this.f18401o, cVar.f18401o) && Intrinsics.areEqual(this.f18402p, cVar.f18402p) && Intrinsics.areEqual(this.q, cVar.q) && Intrinsics.areEqual(this.f18403r, cVar.f18403r) && Intrinsics.areEqual(this.f18404s, cVar.f18404s) && Intrinsics.areEqual(this.f18405t, cVar.f18405t) && Intrinsics.areEqual(this.f18406u, cVar.f18406u) && Intrinsics.areEqual(this.f18407v, cVar.f18407v);
    }

    @Override // hc.f
    public final Object getChangePayload(Object obj) {
        int i5;
        Bundle bundle = null;
        if (obj == null) {
            return null;
        }
        if ((obj instanceof c) && (i5 = this.f18391d) != 1) {
            if (i5 != 2 && i5 != 3) {
                return null;
            }
            c cVar = (c) obj;
            int i10 = cVar.f18389b;
            String str = cVar.f18392e;
            if (!Intrinsics.areEqual(this.f18392e, str)) {
                bundle = new Bundle();
                bundle.putString(PredictionTable.statusColumn, str);
            }
            if (this.f18389b != i10) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                bundle.putInt(PredictionTable.startTimeColumn, i10);
            }
        }
        return bundle;
    }

    public final int hashCode() {
        int i5 = ((((((this.f18388a * 31) + this.f18389b) * 31) + this.f18390c) * 31) + this.f18391d) * 31;
        String str = this.f18392e;
        int hashCode = (i5 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f18393f;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f18394g;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f18395h;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f18396i;
        int hashCode5 = (((hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31) + this.j) * 31;
        String str6 = this.f18397k;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f18398l;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Integer num = this.f18399m;
        int hashCode8 = (hashCode7 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f18400n;
        int hashCode9 = (hashCode8 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f18401o;
        int hashCode10 = (hashCode9 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f18402p;
        int hashCode11 = (hashCode10 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.q;
        int hashCode12 = (hashCode11 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.f18403r;
        int hashCode13 = (hashCode12 + (num6 == null ? 0 : num6.hashCode())) * 31;
        String str8 = this.f18404s;
        int hashCode14 = (hashCode13 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.f18405t;
        int hashCode15 = (hashCode14 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.f18406u;
        int hashCode16 = (hashCode15 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.f18407v;
        return hashCode16 + (str11 != null ? str11.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PreviewPrediction(id=");
        sb2.append(this.f18388a);
        sb2.append(", startTime=");
        sb2.append(this.f18389b);
        sb2.append(", publication=");
        sb2.append(this.f18390c);
        sb2.append(", type=");
        sb2.append(this.f18391d);
        sb2.append(", status=");
        sb2.append(this.f18392e);
        sb2.append(", odds=");
        sb2.append(this.f18393f);
        sb2.append(", imageBackground=");
        sb2.append(this.f18394g);
        sb2.append(", oddsForecast=");
        sb2.append(this.f18395h);
        sb2.append(", forecast=");
        sb2.append(this.f18396i);
        sb2.append(", purchased=");
        sb2.append(this.j);
        sb2.append(", arrayKind=");
        sb2.append(this.f18397k);
        sb2.append(", forecasts=");
        sb2.append(this.f18398l);
        sb2.append(", scoreHome=");
        sb2.append(this.f18399m);
        sb2.append(", scoreGuest=");
        sb2.append(this.f18400n);
        sb2.append(", scoreHomeExtra=");
        sb2.append(this.f18401o);
        sb2.append(", scoreGuestExtra=");
        sb2.append(this.f18402p);
        sb2.append(", teamHomeId=");
        sb2.append(this.q);
        sb2.append(", teamGuestId=");
        sb2.append(this.f18403r);
        sb2.append(", teamHomeFlag=");
        sb2.append(this.f18404s);
        sb2.append(", teamGuestFlag=");
        sb2.append(this.f18405t);
        sb2.append(", teamHomeName=");
        sb2.append(this.f18406u);
        sb2.append(", teamGuestName=");
        return d9.e.k(sb2, this.f18407v, ')');
    }
}
