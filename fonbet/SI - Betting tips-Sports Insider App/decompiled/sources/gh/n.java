package gh;

import java.text.DateFormat;
import java.util.Date;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class n {

    /* renamed from: k, reason: collision with root package name */
    public static final Pattern f10244k = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* renamed from: l, reason: collision with root package name */
    public static final Pattern f10245l = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* renamed from: m, reason: collision with root package name */
    public static final Pattern f10246m = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* renamed from: n, reason: collision with root package name */
    public static final Pattern f10247n = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* renamed from: a, reason: collision with root package name */
    public final String f10248a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10249b;

    /* renamed from: c, reason: collision with root package name */
    public final long f10250c;

    /* renamed from: d, reason: collision with root package name */
    public final String f10251d;

    /* renamed from: e, reason: collision with root package name */
    public final String f10252e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f10253f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f10254g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f10255h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f10256i;
    public final String j;

    public n(String str, String str2, long j, String str3, String str4, boolean z5, boolean z7, boolean z10, boolean z11, String str5) {
        this.f10248a = str;
        this.f10249b = str2;
        this.f10250c = j;
        this.f10251d = str3;
        this.f10252e = str4;
        this.f10253f = z5;
        this.f10254g = z7;
        this.f10255h = z10;
        this.f10256i = z11;
        this.j = str5;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return Intrinsics.areEqual(nVar.f10248a, this.f10248a) && Intrinsics.areEqual(nVar.f10249b, this.f10249b) && nVar.f10250c == this.f10250c && Intrinsics.areEqual(nVar.f10251d, this.f10251d) && Intrinsics.areEqual(nVar.f10252e, this.f10252e) && nVar.f10253f == this.f10253f && nVar.f10254g == this.f10254g && nVar.f10255h == this.f10255h && nVar.f10256i == this.f10256i && Intrinsics.areEqual(nVar.j, this.j);
    }

    public final int hashCode() {
        int j = r4.k.j(r4.k.j(527, 31, this.f10248a), 31, this.f10249b);
        long j6 = this.f10250c;
        int j10 = (((((((r4.k.j(r4.k.j((j + ((int) (j6 ^ (j6 >>> 32)))) * 31, 31, this.f10251d), 31, this.f10252e) + (this.f10253f ? 1231 : 1237)) * 31) + (this.f10254g ? 1231 : 1237)) * 31) + (this.f10255h ? 1231 : 1237)) * 31) + (this.f10256i ? 1231 : 1237)) * 31;
        String str = this.j;
        return j10 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f10248a);
        sb2.append('=');
        sb2.append(this.f10249b);
        if (this.f10255h) {
            long j = this.f10250c;
            if (j == Long.MIN_VALUE) {
                sb2.append("; max-age=0");
            } else {
                sb2.append("; expires=");
                Date date = new Date(j);
                e6.g0 g0Var = lh.d.f20086a;
                Intrinsics.checkNotNullParameter(date, "<this>");
                String format = ((DateFormat) lh.d.f20086a.get()).format(date);
                Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                sb2.append(format);
            }
        }
        if (!this.f10256i) {
            sb2.append("; domain=");
            sb2.append(this.f10251d);
        }
        sb2.append("; path=");
        sb2.append(this.f10252e);
        if (this.f10253f) {
            sb2.append("; secure");
        }
        if (this.f10254g) {
            sb2.append("; httponly");
        }
        String str = this.j;
        if (str != null) {
            sb2.append("; samesite=");
            sb2.append(str);
        }
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        return sb3;
    }
}
