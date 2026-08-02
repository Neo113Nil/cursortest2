package com.mbridge.msdk.thrid.okhttp.internal.http;

import com.mbridge.msdk.thrid.okhttp.a0;
import com.mbridge.msdk.thrid.okhttp.l;
import com.mbridge.msdk.thrid.okhttp.r;
import com.mbridge.msdk.thrid.okhttp.s;
import java.util.List;
import ru.ok.android.commons.http.Http;

/* compiled from: HttpHeaders.java */
/* loaded from: classes14.dex */
public final class e {
    private static final com.mbridge.msdk.thrid.okio.f a = com.mbridge.msdk.thrid.okio.f.c("\"\\");
    private static final com.mbridge.msdk.thrid.okio.f b = com.mbridge.msdk.thrid.okio.f.c("\t ,=");

    public static long a(a0 a0Var) {
        return a(a0Var.m());
    }

    public static boolean b(a0 a0Var) {
        if (a0Var.s().e().equals("HEAD")) {
            return false;
        }
        int k = a0Var.k();
        return (((k >= 100 && k < 200) || k == 204 || k == 304) && a(a0Var) == -1 && !"chunked".equalsIgnoreCase(a0Var.b("Transfer-Encoding"))) ? false : true;
    }

    public static long a(r rVar) {
        return a(rVar.b(Http.Header.CONTENT_LENGTH));
    }

    private static long a(String str) {
        if (str == null) {
            return -1L;
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    public static void a(l lVar, s sVar, r rVar) {
        if (lVar == l.a) {
            return;
        }
        List<com.mbridge.msdk.thrid.okhttp.k> a2 = com.mbridge.msdk.thrid.okhttp.k.a(sVar, rVar);
        if (a2.isEmpty()) {
            return;
        }
        lVar.a(sVar, a2);
    }

    public static int b(String str, int i) {
        char charAt;
        while (i < str.length() && ((charAt = str.charAt(i)) == ' ' || charAt == '\t')) {
            i++;
        }
        return i;
    }

    public static int a(String str, int i, String str2) {
        while (i < str.length() && str2.indexOf(str.charAt(i)) == -1) {
            i++;
        }
        return i;
    }

    public static int a(String str, int i) {
        try {
            long parseLong = Long.parseLong(str);
            if (parseLong > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            if (parseLong < 0) {
                return 0;
            }
            return (int) parseLong;
        } catch (NumberFormatException unused) {
            return i;
        }
    }
}
