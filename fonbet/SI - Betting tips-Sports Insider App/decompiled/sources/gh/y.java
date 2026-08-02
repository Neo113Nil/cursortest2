package gh;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final String f10329a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10330b;

    /* renamed from: c, reason: collision with root package name */
    public final String f10331c;

    /* renamed from: d, reason: collision with root package name */
    public final String f10332d;

    /* renamed from: e, reason: collision with root package name */
    public final int f10333e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f10334f;

    /* renamed from: g, reason: collision with root package name */
    public final List f10335g;

    /* renamed from: h, reason: collision with root package name */
    public final String f10336h;

    /* renamed from: i, reason: collision with root package name */
    public final String f10337i;

    public y(String str, String str2, String str3, String str4, int i5, ArrayList arrayList, ArrayList arrayList2, String str5, String str6) {
        this.f10329a = str;
        this.f10330b = str2;
        this.f10331c = str3;
        this.f10332d = str4;
        this.f10333e = i5;
        this.f10334f = arrayList;
        this.f10335g = arrayList2;
        this.f10336h = str5;
        this.f10337i = str6;
    }

    public final String a() {
        if (this.f10331c.length() == 0) {
            return "";
        }
        int length = this.f10329a.length() + 3;
        String str = this.f10337i;
        String substring = str.substring(StringsKt.F(str, ':', length, false, 4) + 1, StringsKt.F(str, '@', 0, false, 6));
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return substring;
    }

    public final String b() {
        int length = this.f10329a.length() + 3;
        String str = this.f10337i;
        int F = StringsKt.F(str, '/', length, false, 4);
        String substring = str.substring(F, hh.e.c(F, str, "?#", str.length()));
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return substring;
    }

    public final ArrayList c() {
        int length = this.f10329a.length() + 3;
        String str = this.f10337i;
        int F = StringsKt.F(str, '/', length, false, 4);
        int c2 = hh.e.c(F, str, "?#", str.length());
        ArrayList arrayList = new ArrayList();
        while (F < c2) {
            int i5 = F + 1;
            int d10 = hh.e.d(str, '/', i5, c2);
            String substring = str.substring(i5, d10);
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            arrayList.add(substring);
            F = d10;
        }
        return arrayList;
    }

    public final String d() {
        if (this.f10335g == null) {
            return null;
        }
        String str = this.f10337i;
        int F = StringsKt.F(str, '?', 0, false, 6) + 1;
        String substring = str.substring(F, hh.e.d(str, '#', F, str.length()));
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return substring;
    }

    public final String e() {
        if (this.f10330b.length() == 0) {
            return "";
        }
        int length = this.f10329a.length() + 3;
        String str = this.f10337i;
        String substring = str.substring(length, hh.e.c(length, str, ":@", str.length()));
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return substring;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof y) && Intrinsics.areEqual(((y) obj).f10337i, this.f10337i);
    }

    public final x f(String link) {
        Intrinsics.checkNotNullParameter(link, "link");
        try {
            x xVar = new x();
            xVar.c(this, link);
            return xVar;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public final String g() {
        x f6 = f("/...");
        Intrinsics.checkNotNull(f6);
        f6.getClass();
        Intrinsics.checkNotNullParameter("", "username");
        f6.f10322b = vh.a.a("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", 123);
        Intrinsics.checkNotNullParameter("", "password");
        f6.f10323c = vh.a.a("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", 123);
        return f6.a().f10337i;
    }

    public final URI h() {
        String substring;
        String a7;
        x xVar = new x();
        String scheme = this.f10329a;
        xVar.f10321a = scheme;
        String e7 = e();
        Intrinsics.checkNotNullParameter(e7, "<set-?>");
        xVar.f10322b = e7;
        String a10 = a();
        Intrinsics.checkNotNullParameter(a10, "<set-?>");
        xVar.f10323c = a10;
        xVar.f10324d = this.f10332d;
        Intrinsics.checkNotNullParameter(scheme, "scheme");
        int i5 = Intrinsics.areEqual(scheme, "http") ? 80 : Intrinsics.areEqual(scheme, "https") ? 443 : -1;
        int i10 = this.f10333e;
        xVar.f10325e = i10 != i5 ? i10 : -1;
        ArrayList arrayList = xVar.f10326f;
        arrayList.clear();
        arrayList.addAll(c());
        String d10 = d();
        xVar.f10327g = (d10 == null || (a7 = vh.a.a(d10, 0, 0, " \"'<>#", 83)) == null) ? null : x.d(a7);
        if (this.f10336h == null) {
            substring = null;
        } else {
            String str = this.f10337i;
            substring = str.substring(StringsKt.F(str, '#', 0, false, 6) + 1);
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        }
        xVar.f10328h = substring;
        String str2 = xVar.f10324d;
        xVar.f10324d = str2 != null ? new Regex("[\"<>^`{|}]").replace(str2, "") : null;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.set(i11, vh.a.a((String) arrayList.get(i11), 0, 0, "[]", 99));
        }
        ArrayList arrayList2 = xVar.f10327g;
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i12 = 0; i12 < size2; i12++) {
                String str3 = (String) arrayList2.get(i12);
                arrayList2.set(i12, str3 != null ? vh.a.a(str3, 0, 0, "\\^`{|}", 67) : null);
            }
        }
        String str4 = xVar.f10328h;
        xVar.f10328h = str4 != null ? vh.a.a(str4, 0, 0, " \"#<>\\^`{|}", 35) : null;
        String xVar2 = xVar.toString();
        try {
            return new URI(xVar2);
        } catch (URISyntaxException e9) {
            try {
                URI create = URI.create(new Regex("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]").replace(xVar2, ""));
                Intrinsics.checkNotNull(create);
                return create;
            } catch (Exception unused) {
                throw new RuntimeException(e9);
            }
        }
    }

    public final int hashCode() {
        return this.f10337i.hashCode();
    }

    public final String toString() {
        return this.f10337i;
    }
}
