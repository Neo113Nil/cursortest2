package wj;

import B0.A0;
import Ej.p;
import We.K;
import We.L;
import We.M;
import We.z;
import bd.q;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.zip.GZIPOutputStream;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import sf.C9681g;
import sf.InterfaceC9683i;
import sf.t;
import uf.C10055b;

/* loaded from: classes10.dex */
public final class k {
    private static final byte[] a(String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        try {
            Charset UTF_8 = StandardCharsets.UTF_8;
            Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
            byte[] bytes = str.getBytes(UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            gZIPOutputStream.write(bytes);
            Unit unit = Unit.f71690a;
            gZIPOutputStream.close();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            Intrinsics.checkNotNullExpressionValue(byteArray, "toByteArray(...)");
            return byteArray;
        } finally {
        }
    }

    @NotNull
    public static final ArrayList b(@NotNull z headers, @NotNull List unsecuredHeaders, @NotNull List unsecuredCookies) {
        Pair pair;
        Pair pair2;
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(unsecuredHeaders, "unsecuredHeaders");
        Intrinsics.checkNotNullParameter(unsecuredCookies, "unsecuredCookies");
        ArrayList q02 = C7714v.q0("authorization", unsecuredHeaders);
        ArrayList arrayList = new ArrayList(C7714v.z(q02, 10));
        Iterator it = q02.iterator();
        while (it.hasNext()) {
            String lowerCase = ((String) it.next()).toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            arrayList.add(lowerCase);
        }
        ArrayList arrayList2 = new ArrayList(C7714v.z(headers, 10));
        Iterator<Pair<? extends String, ? extends String>> it2 = headers.iterator();
        while (it2.hasNext()) {
            Pair<? extends String, ? extends String> next = it2.next();
            String a11 = next.a();
            String value = next.b();
            String lowerCase2 = a11.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
            if (arrayList.contains(lowerCase2)) {
                pair2 = new Pair(a11, "[REDACTED]");
            } else {
                if (a11.equalsIgnoreCase("set-cookie") || a11.equalsIgnoreCase("cookie")) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    Intrinsics.checkNotNullParameter(unsecuredCookies, "unsecuredCookies");
                    ArrayList q03 = C7714v.q0("secure", unsecuredCookies);
                    ArrayList arrayList3 = new ArrayList(C7714v.z(q03, 10));
                    Iterator it3 = q03.iterator();
                    while (it3.hasNext()) {
                        arrayList3.add(new Regex(A0.b("(?i)([^=]*", (String) it3.next(), "[^=]*=)([^;]+)(;|$)")));
                    }
                    Iterator it4 = arrayList3.iterator();
                    while (it4.hasNext()) {
                        value = ((Regex) it4.next()).g(value, j.f104592b);
                    }
                    pair = new Pair(a11, value);
                } else {
                    pair = new Pair(a11, value);
                }
                pair2 = pair;
            }
            arrayList2.add(pair2);
        }
        return arrayList2;
    }

    @NotNull
    public static final byte[] c(K k11) {
        C9681g c9681g = new C9681g();
        if (k11 != null) {
            try {
                k11.writeTo(c9681g);
            } catch (Throwable th2) {
                p.b("Could not write reqBody: " + th2.getMessage());
            }
        }
        byte[] g02 = c9681g.g0();
        Charset UTF_8 = StandardCharsets.UTF_8;
        Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
        return a(new String(g02, UTF_8));
    }

    public static final byte[] d(@NotNull L response, @NotNull List<String> unsecuredBodyKeys) {
        String jsonString;
        Intrinsics.checkNotNullParameter(response, "response");
        Intrinsics.checkNotNullParameter(unsecuredBodyKeys, "unsecuredBodyKeys");
        String c11 = response.r().c("Content-Encoding");
        M c12 = response.c();
        if (c12 != null) {
            InterfaceC9683i source = c12.source();
            source.n(Long.MAX_VALUE);
            C9681g clone = source.f().clone();
            if (c11 == null) {
                jsonString = clone.t0(Charsets.UTF_8);
            } else {
                jsonString = q.d(new BufferedReader(new InputStreamReader(c11.equalsIgnoreCase("br") ? new C10055b(clone.a2()) : c11.equalsIgnoreCase("gzip") ? sf.z.d(new t(sf.z.k(clone.a2()))).a2() : clone.a2(), Charsets.UTF_8), 8192));
            }
        } else {
            jsonString = null;
        }
        if (jsonString == null || kotlin.text.h.K(jsonString)) {
            jsonString = null;
        } else {
            Intrinsics.checkNotNullParameter(jsonString, "jsonString");
            Intrinsics.checkNotNullParameter(unsecuredBodyKeys, "unsecuredBodyKeys");
            if (!unsecuredBodyKeys.isEmpty()) {
                List<String> list = unsecuredBodyKeys;
                ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(new Regex(U7.d.e((String) it.next(), "\"\\s*:\\s*(\\{[^}]*\\}|\\[[^]]*]|\"[^\"]*\"|\\d+|true|false)")));
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    jsonString = ((Regex) it2.next()).g(jsonString, i.f104591b);
                }
            }
        }
        if (jsonString != null) {
            return a(jsonString);
        }
        return null;
    }
}
