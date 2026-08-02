package io.sentry.android.core.internal.threaddump;

import io.sentry.F3;
import io.sentry.protocol.C4800b;
import okhttp3.internal.ws.RealWebSocket;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public C4800b f51047a;

    public static Long d(String str) {
        try {
            return Long.valueOf(Long.parseLong(str.trim()));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static Double f(String str) {
        String trim = str.trim();
        if (trim.equals("0")) {
            return Double.valueOf(0.0d);
        }
        if (trim.endsWith("ms")) {
            return Double.valueOf(Double.parseDouble(trim.substring(0, trim.length() - 2)));
        }
        if (trim.endsWith("ns")) {
            return Double.valueOf(Double.parseDouble(trim.substring(0, trim.length() - 2)) / 1000000.0d);
        }
        if (trim.endsWith("us")) {
            return Double.valueOf(Double.parseDouble(trim.substring(0, trim.length() - 2)) / 1000.0d);
        }
        if (trim.endsWith("s")) {
            return Double.valueOf(Double.parseDouble(trim.substring(0, trim.length() - 1)) * 1000.0d);
        }
        return null;
    }

    public C4800b a() {
        return this.f51047a;
    }

    public final C4800b b() {
        if (this.f51047a == null) {
            this.f51047a = new C4800b();
        }
        return this.f51047a;
    }

    public void c(String str) {
        if (str.startsWith("Free memory until OOME ")) {
            b().n(e(str.substring(23)));
            return;
        }
        if (str.startsWith("Free memory until GC ")) {
            b().m(e(str.substring(21)));
            return;
        }
        if (str.startsWith("Free memory ")) {
            b().l(e(str.substring(12)));
            return;
        }
        if (str.startsWith("Total memory ")) {
            b().v(e(str.substring(13)));
            return;
        }
        if (str.startsWith("Max memory ")) {
            b().u(e(str.substring(11)));
            return;
        }
        if (str.startsWith("Total time waiting for GC to complete: ")) {
            b().t(f(str.substring(39)));
            return;
        }
        if (str.startsWith("Total GC time: ")) {
            b().s(f(str.substring(15)));
            return;
        }
        if (str.startsWith("Total GC count: ")) {
            b().r(d(str.substring(16)));
            return;
        }
        if (str.startsWith("Total blocking GC time: ")) {
            b().p(f(str.substring(24)));
        } else if (str.startsWith("Total blocking GC count: ")) {
            b().o(d(str.substring(25)));
        } else if (str.startsWith("Total pre-OOME GC count: ")) {
            b().q(d(str.substring(25)));
        }
    }

    public final Long e(String str) {
        String trim = str.trim();
        if (trim.endsWith("GB")) {
            return Long.valueOf(Long.parseLong(trim.substring(0, trim.length() - 2)) * 1073741824);
        }
        if (trim.endsWith("MB")) {
            return Long.valueOf(Long.parseLong(trim.substring(0, trim.length() - 2)) * F3.MAX_EVENT_SIZE_BYTES);
        }
        if (trim.endsWith("KB")) {
            return Long.valueOf(Long.parseLong(trim.substring(0, trim.length() - 2)) * RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE);
        }
        if (trim.endsWith("B")) {
            return Long.valueOf(Long.parseLong(trim.substring(0, trim.length() - 1)));
        }
        return null;
    }
}
