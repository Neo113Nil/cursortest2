package ih;

import com.google.android.gms.internal.measurement.d5;
import com.sports.insider.data.repository.room.live.LiveTable;
import gh.c;
import gh.h0;
import gh.i0;
import gh.n0;
import gh.o;
import gh.o0;
import gh.q0;
import gh.r;
import gh.r0;
import gh.u0;
import gh.v;
import gh.z;
import hh.e;
import io.appmetrica.analytics.BuildConfig;
import kh.p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import lh.h;
import okhttp3.Headers;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class a implements z {
    /* JADX WARN: Removed duplicated region for block: B:131:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x016a  */
    @Override // gh.z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final o0 a(h chain) {
        x5.h hVar;
        x5.h hVar2;
        i0 i0Var;
        o0 o0Var;
        int i5;
        int i10;
        x5.h hVar3;
        int i11;
        Headers headers;
        String str;
        Intrinsics.checkNotNullParameter(chain, "chain");
        p pVar = chain.f20089a;
        System.currentTimeMillis();
        i0 request = chain.f20093e;
        Intrinsics.checkNotNullParameter(request, "request");
        x5.h hVar4 = new x5.h(request, null, false);
        if (request != null) {
            c cVar = request.f10211f;
            if (cVar == null) {
                o oVar = c.f10122n;
                Headers headers2 = request.f10208c;
                oVar.getClass();
                Intrinsics.checkNotNullParameter(headers2, "headers");
                Intrinsics.checkNotNullParameter(oVar, "<this>");
                Intrinsics.checkNotNullParameter(headers2, "headers");
                int size = headers2.size();
                boolean z5 = true;
                String str2 = null;
                int i12 = 0;
                boolean z7 = false;
                boolean z10 = false;
                boolean z11 = false;
                boolean z12 = false;
                boolean z13 = false;
                boolean z14 = false;
                boolean z15 = false;
                boolean z16 = false;
                boolean z17 = true;
                int i13 = -1;
                int i14 = -1;
                int i15 = -1;
                int i16 = -1;
                while (i12 < size) {
                    String name = headers2.name(i12);
                    String value = headers2.value(i12);
                    if (kotlin.text.z.j(name, "Cache-Control", z5)) {
                        if (str2 == null) {
                            str2 = value;
                            i10 = 0;
                            while (i10 < value.length()) {
                                int length = value.length();
                                boolean z18 = z5;
                                int i17 = i10;
                                while (true) {
                                    if (i17 >= length) {
                                        hVar3 = hVar4;
                                        i17 = value.length();
                                        break;
                                    }
                                    hVar3 = hVar4;
                                    int i18 = length;
                                    if (StringsKt.B("=,;", value.charAt(i17))) {
                                        break;
                                    }
                                    i17++;
                                    hVar4 = hVar3;
                                    length = i18;
                                }
                                String substring = value.substring(i10, i17);
                                Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                                String obj = StringsKt.Z(substring).toString();
                                if (i17 != value.length()) {
                                    i11 = size;
                                    if (value.charAt(i17) != ',' && value.charAt(i17) != ';') {
                                        int i19 = i17 + 1;
                                        byte[] bArr = e.f10821a;
                                        Intrinsics.checkNotNullParameter(value, "<this>");
                                        int length2 = value.length();
                                        while (true) {
                                            if (i19 >= length2) {
                                                i19 = value.length();
                                                break;
                                            }
                                            char charAt = value.charAt(i19);
                                            int i20 = length2;
                                            if (charAt != ' ' && charAt != '\t') {
                                                break;
                                            }
                                            i19++;
                                            length2 = i20;
                                        }
                                        if (i19 >= value.length() || value.charAt(i19) != '\"') {
                                            headers = headers2;
                                            int length3 = value.length();
                                            int i21 = i19;
                                            while (true) {
                                                if (i21 >= length3) {
                                                    i21 = value.length();
                                                    break;
                                                }
                                                int i22 = length3;
                                                if (StringsKt.B(",;", value.charAt(i21))) {
                                                    break;
                                                }
                                                i21++;
                                                length3 = i22;
                                            }
                                            String substring2 = value.substring(i19, i21);
                                            Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
                                            int i23 = i21;
                                            str = StringsKt.Z(substring2).toString();
                                            i10 = i23;
                                        } else {
                                            int i24 = i19 + 1;
                                            headers = headers2;
                                            int F = StringsKt.F(value, '\"', i24, false, 4);
                                            str = value.substring(i24, F);
                                            Intrinsics.checkNotNullExpressionValue(str, "substring(...)");
                                            i10 = F + 1;
                                        }
                                        if (!"no-cache".equalsIgnoreCase(obj)) {
                                            z5 = z18;
                                            z7 = z5;
                                        } else if ("no-store".equalsIgnoreCase(obj)) {
                                            z5 = z18;
                                            z10 = z5;
                                        } else {
                                            if ("max-age".equalsIgnoreCase(obj)) {
                                                i13 = e.m(-1, str);
                                            } else if ("s-maxage".equalsIgnoreCase(obj)) {
                                                i14 = e.m(-1, str);
                                            } else if ("private".equalsIgnoreCase(obj)) {
                                                z5 = z18;
                                                z11 = z5;
                                            } else if (BuildConfig.SDK_BUILD_FLAVOR.equalsIgnoreCase(obj)) {
                                                z5 = z18;
                                                z12 = z5;
                                            } else if ("must-revalidate".equalsIgnoreCase(obj)) {
                                                z5 = z18;
                                                z13 = z5;
                                            } else if ("max-stale".equalsIgnoreCase(obj)) {
                                                i15 = e.m(Integer.MAX_VALUE, str);
                                            } else if ("min-fresh".equalsIgnoreCase(obj)) {
                                                i16 = e.m(-1, str);
                                            } else if ("only-if-cached".equalsIgnoreCase(obj)) {
                                                z5 = z18;
                                                z14 = z5;
                                            } else if ("no-transform".equalsIgnoreCase(obj)) {
                                                z5 = z18;
                                                z15 = z5;
                                            } else {
                                                z5 = z18;
                                                if ("immutable".equalsIgnoreCase(obj)) {
                                                    z16 = z5;
                                                }
                                            }
                                            z5 = z18;
                                        }
                                        hVar4 = hVar3;
                                        size = i11;
                                        headers2 = headers;
                                    }
                                } else {
                                    i11 = size;
                                }
                                headers = headers2;
                                i10 = i17 + 1;
                                str = null;
                                if (!"no-cache".equalsIgnoreCase(obj)) {
                                }
                                hVar4 = hVar3;
                                size = i11;
                                headers2 = headers;
                            }
                            i12++;
                            z5 = z5;
                            hVar4 = hVar4;
                            size = size;
                            headers2 = headers2;
                        }
                    } else if (!kotlin.text.z.j(name, "Pragma", z5)) {
                        i12++;
                        z5 = z5;
                        hVar4 = hVar4;
                        size = size;
                        headers2 = headers2;
                    }
                    z17 = false;
                    i10 = 0;
                    while (i10 < value.length()) {
                    }
                    i12++;
                    z5 = z5;
                    hVar4 = hVar4;
                    size = size;
                    headers2 = headers2;
                }
                hVar = hVar4;
                c cVar2 = new c(z7, z10, i13, i14, z11, z12, z13, i15, i16, z14, z15, z16, !z17 ? null : str2);
                request.f10211f = cVar2;
                cVar = cVar2;
            } else {
                hVar = hVar4;
            }
            if (cVar.j) {
                Object obj2 = null;
                hVar2 = new x5.h(obj2, obj2, false);
                i0Var = (i0) hVar2.f25409a;
                o0 o0Var2 = (o0) hVar2.f25410b;
                r rVar = pVar.f19141d;
                if (i0Var != null && o0Var2 == null) {
                    q0 q0Var = r0.f10297b;
                    v vVar = new v();
                    Intrinsics.checkNotNullParameter(request, "request");
                    h0 protocol = h0.f10199d;
                    Intrinsics.checkNotNullParameter(protocol, "protocol");
                    Intrinsics.checkNotNullParameter("Unsatisfiable Request (only-if-cached)", LiveTable.messageColumn);
                    long currentTimeMillis = System.currentTimeMillis();
                    if (request == null) {
                        throw new IllegalStateException("request == null");
                    }
                    o0 o0Var3 = new o0(request, protocol, "Unsatisfiable Request (only-if-cached)", 504, null, vVar.d(), q0Var, null, null, null, null, -1L, currentTimeMillis, null, u0.f10319b);
                    rVar.z(pVar, o0Var3);
                    return o0Var3;
                }
                if (i0Var != null) {
                    Intrinsics.checkNotNull(o0Var2);
                    n0 k6 = o0Var2.k();
                    o0 w10 = u6.h.w(o0Var2);
                    n0.b(w10, "cacheResponse");
                    k6.j = w10;
                    o0 a7 = k6.a();
                    rVar.b(pVar, a7);
                    return a7;
                }
                if (o0Var2 != null) {
                    rVar.a(pVar, o0Var2);
                }
                o0 b10 = chain.b(i0Var);
                if (o0Var2 == null) {
                    o0Var = null;
                } else {
                    if (b10.f10276d == 304) {
                        n0 k9 = o0Var2.k();
                        Headers headers3 = o0Var2.f10278f;
                        Headers headers4 = b10.f10278f;
                        v vVar2 = new v();
                        int size2 = headers3.size();
                        int i25 = 0;
                        while (i25 < size2) {
                            String name2 = headers3.name(i25);
                            String value2 = headers3.value(i25);
                            Headers headers5 = headers3;
                            if ("Warning".equalsIgnoreCase(name2)) {
                                i5 = size2;
                                if (kotlin.text.z.o(value2, "1", false)) {
                                    i25++;
                                    size2 = i5;
                                    headers3 = headers5;
                                }
                            } else {
                                i5 = size2;
                            }
                            if ("Content-Length".equalsIgnoreCase(name2) || "Content-Encoding".equalsIgnoreCase(name2) || "Content-Type".equalsIgnoreCase(name2) || !d5.A(name2) || headers4.get(name2) == null) {
                                vVar2.b(name2, value2);
                            }
                            i25++;
                            size2 = i5;
                            headers3 = headers5;
                        }
                        int size3 = headers4.size();
                        for (int i26 = 0; i26 < size3; i26++) {
                            String name3 = headers4.name(i26);
                            if (!"Content-Length".equalsIgnoreCase(name3) && !"Content-Encoding".equalsIgnoreCase(name3) && !"Content-Type".equalsIgnoreCase(name3) && d5.A(name3)) {
                                vVar2.b(name3, headers4.value(i26));
                            }
                        }
                        Headers headers6 = vVar2.d();
                        Intrinsics.checkNotNullParameter(headers6, "headers");
                        k9.f10262f = headers6.newBuilder();
                        k9.f10267l = b10.f10283l;
                        k9.f10268m = b10.f10284m;
                        o0 w11 = u6.h.w(o0Var2);
                        n0.b(w11, "cacheResponse");
                        k9.j = w11;
                        o0 w12 = u6.h.w(b10);
                        n0.b(w12, "networkResponse");
                        k9.f10265i = w12;
                        k9.a();
                        b10.f10279g.close();
                        Intrinsics.checkNotNull(null);
                        throw null;
                    }
                    o0Var = null;
                    e.b(o0Var2.f10279g);
                }
                Intrinsics.checkNotNull(b10);
                n0 k10 = b10.k();
                o0 w13 = o0Var2 != null ? u6.h.w(o0Var2) : o0Var;
                n0.b(w13, "cacheResponse");
                k10.j = w13;
                o0 w14 = u6.h.w(b10);
                n0.b(w14, "networkResponse");
                k10.f10265i = w14;
                return k10.a();
            }
        } else {
            hVar = hVar4;
        }
        hVar2 = hVar;
        i0Var = (i0) hVar2.f25409a;
        o0 o0Var22 = (o0) hVar2.f25410b;
        r rVar2 = pVar.f19141d;
        if (i0Var != null) {
        }
        if (i0Var != null) {
        }
    }
}
