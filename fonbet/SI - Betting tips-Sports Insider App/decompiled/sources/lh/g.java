package lh;

import gh.m;
import gh.n;
import gh.o;
import gh.o0;
import gh.y;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.z;
import okhttp3.Headers;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import okio.ByteString;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public abstract class g {
    static {
        ByteString.Companion companion = ByteString.INSTANCE;
        companion.encodeUtf8("\"\\");
        companion.encodeUtf8("\t ,=");
    }

    public static final boolean a(o0 o0Var) {
        Intrinsics.checkNotNullParameter(o0Var, "<this>");
        if (Intrinsics.areEqual(o0Var.f10273a.f10207b, "HEAD")) {
            return false;
        }
        int i5 = o0Var.f10276d;
        return (((i5 >= 100 && i5 < 200) || i5 == 204 || i5 == 304) && hh.g.e(o0Var) == -1 && !"chunked".equalsIgnoreCase(o0.c(o0Var, "Transfer-Encoding"))) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:118:0x01de, code lost:
    
        if (hh.d.f10820a.d(r0) == false) goto L100;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0241 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(o oVar, y url, Headers headers) {
        List cookies;
        List<String> list;
        n nVar;
        int i5;
        long j;
        String str;
        Intrinsics.checkNotNullParameter(oVar, "<this>");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(headers, "headers");
        if (oVar == o.f10271c) {
            return;
        }
        Pattern pattern = n.f10244k;
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(headers, "headers");
        List<String> values = headers.values("Set-Cookie");
        int size = values.size();
        int i10 = 0;
        int i11 = 0;
        ArrayList arrayList = null;
        while (i11 < size) {
            String setCookie = values.get(i11);
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(setCookie, "setCookie");
            long currentTimeMillis = System.currentTimeMillis();
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(setCookie, "setCookie");
            byte[] bArr = hh.e.f10821a;
            char c2 = ';';
            int d10 = hh.e.d(setCookie, ';', i10, setCookie.length());
            int d11 = hh.e.d(setCookie, '=', i10, d10);
            if (d11 == d10) {
                list = values;
                i5 = i10;
            } else {
                String n9 = hh.e.n(i10, d11, setCookie);
                if (n9.length() != 0 && hh.e.f(n9) == -1) {
                    String n10 = hh.e.n(d11 + 1, d10, setCookie);
                    if (hh.e.f(n10) == -1) {
                        int i12 = d10 + 1;
                        int length = setCookie.length();
                        long j6 = -1;
                        long j10 = 253402300799999L;
                        String str2 = null;
                        boolean z5 = false;
                        boolean z7 = true;
                        boolean z10 = false;
                        String str3 = null;
                        String str4 = null;
                        boolean z11 = false;
                        while (true) {
                            long j11 = LongCompanionObject.MAX_VALUE;
                            if (i12 < length) {
                                int d12 = hh.e.d(setCookie, c2, i12, length);
                                int d13 = hh.e.d(setCookie, '=', i12, d12);
                                String n11 = hh.e.n(i12, d13, setCookie);
                                String n12 = d13 < d12 ? hh.e.n(d13 + 1, d12, setCookie) : "";
                                List<String> list2 = values;
                                if (z.j(n11, "expires", true)) {
                                    try {
                                        j10 = m.b(n12.length(), n12);
                                        z10 = true;
                                    } catch (NumberFormatException | IllegalArgumentException unused) {
                                    }
                                } else if (z.j(n11, "max-age", true)) {
                                    try {
                                        long parseLong = Long.parseLong(n12);
                                        j6 = parseLong <= 0 ? Long.MIN_VALUE : parseLong;
                                    } catch (NumberFormatException e7) {
                                        if (!new Regex("-?\\d+").d(n12)) {
                                            throw e7;
                                        }
                                        if (z.o(n12, "-", false)) {
                                            j11 = Long.MIN_VALUE;
                                        }
                                        j6 = j11;
                                    }
                                    z10 = true;
                                } else if (z.j(n11, "domain", true)) {
                                    if (z.i(n12, ".", false)) {
                                        throw new IllegalArgumentException("Failed requirement.");
                                    }
                                    String b10 = hh.d.b(StringsKt.M(n12, "."));
                                    if (b10 == null) {
                                        throw new IllegalArgumentException();
                                    }
                                    str2 = b10;
                                    z7 = false;
                                } else if (z.j(n11, "path", true)) {
                                    str3 = n12;
                                } else if (z.j(n11, "secure", true)) {
                                    z11 = true;
                                } else if (z.j(n11, "httponly", true)) {
                                    z5 = true;
                                } else if (z.j(n11, "samesite", true)) {
                                    str4 = n12;
                                }
                                i12 = d12 + 1;
                                c2 = ';';
                                values = list2;
                            } else {
                                list = values;
                                if (j6 == Long.MIN_VALUE) {
                                    j = Long.MIN_VALUE;
                                } else if (j6 != -1) {
                                    if (j6 <= 9223372036854775L) {
                                        j11 = j6 * AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT;
                                    }
                                    long j12 = currentTimeMillis + j11;
                                    j = (j12 < currentTimeMillis || j12 > 253402300799999L) ? 253402300799999L : j12;
                                } else {
                                    j = j10;
                                }
                                String str5 = url.f10332d;
                                if (str2 == null) {
                                    str2 = str5;
                                } else if (!Intrinsics.areEqual(str5, str2)) {
                                    if (z.i(str5, str2, false) && str5.charAt((str5.length() - str2.length()) - 1) == '.') {
                                        Regex regex = hh.d.f10820a;
                                        Intrinsics.checkNotNullParameter(str5, "<this>");
                                    }
                                    i5 = 0;
                                }
                                if (str5.length() == str2.length() || PublicSuffixDatabase.f21367d.a(str2) != null) {
                                    String str6 = "/";
                                    String str7 = str3;
                                    i5 = 0;
                                    if (str7 == null || !z.o(str7, "/", false)) {
                                        String b11 = url.b();
                                        int J = StringsKt.J(b11, '/', 0, 6);
                                        if (J != 0) {
                                            str6 = b11.substring(0, J);
                                            Intrinsics.checkNotNullExpressionValue(str6, "substring(...)");
                                        }
                                        str = str6;
                                    } else {
                                        str = str7;
                                    }
                                    nVar = new n(n9, n10, j, str2, str, z11, z5, z10, z7, str4);
                                }
                            }
                        }
                    }
                }
                list = values;
                nVar = null;
                i5 = 0;
                if (nVar != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(nVar);
                }
                i11++;
                i10 = i5;
                values = list;
            }
            nVar = null;
            if (nVar != null) {
            }
            i11++;
            i10 = i5;
            values = list;
        }
        if (arrayList != null) {
            cookies = DesugarCollections.unmodifiableList(arrayList);
            Intrinsics.checkNotNullExpressionValue(cookies, "unmodifiableList(...)");
        } else {
            cookies = null;
        }
        if (cookies == null) {
            cookies = e0.f19204a;
        }
        if (cookies.isEmpty()) {
            return;
        }
        oVar.getClass();
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(cookies, "cookies");
    }
}
