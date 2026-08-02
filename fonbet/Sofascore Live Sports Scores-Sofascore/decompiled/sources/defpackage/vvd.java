package defpackage;

import com.ironsource.L6;
import java.net.URISyntaxException;
import java.nio.CharBuffer;
import java.time.Duration;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import javax.net.ssl.SSLContext;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class vvd {
    public final List a;
    public final List b;
    public final String c;
    public final SSLContext d;
    public final int e;
    public final Duration f;
    public final Duration g;
    public final Duration h;
    public final Duration i;
    public final Duration j;
    public final Duration k;
    public final Duration l;
    public final Duration m;
    public final yp5 n;
    public final bij o;
    public final i1 p;
    public final String q;
    public final boolean r;
    public ScheduledThreadPoolExecutor t;
    public ThreadPoolExecutor u;
    public ExecutorService v;
    public ExecutorService w;
    public static final Duration y = Duration.ofMillis(2000);
    public static final Duration z = Duration.ofMillis(100);
    public static final Duration A = Duration.ofMillis(1000);
    public static final Duration B = Duration.ofSeconds(2);
    public static final Duration C = Duration.ofMinutes(1);
    public static final Duration D = Duration.ofMinutes(2);
    public static final Duration E = Duration.ofSeconds(5);
    public static final Duration F = Duration.ofSeconds(2);
    public static final Duration G = Duration.ofMillis(50);
    public static final String H = soh.class.getCanonicalName();
    public static final ovd I = new ovd();
    public int x = 0;
    public final ReentrantLock s = new ReentrantLock();

    public vvd(qvd qvdVar) {
        this.a = Collections.unmodifiableList(qvdVar.a);
        this.b = Collections.unmodifiableList(qvdVar.b);
        this.c = qvdVar.c;
        this.d = qvdVar.d;
        this.e = qvdVar.e;
        this.f = qvdVar.f;
        this.g = qvdVar.g;
        this.h = qvdVar.h;
        this.i = qvdVar.i;
        this.j = qvdVar.j;
        this.k = qvdVar.k;
        this.l = qvdVar.l;
        this.m = qvdVar.m;
        this.r = qvdVar.o;
        this.n = qvdVar.p;
        this.o = qvdVar.q;
        this.p = qvdVar.r;
        this.q = qvdVar.s;
    }

    public static void a(CharBuffer charBuffer, String str, String str2, boolean z2, boolean z3) {
        if (z3) {
            charBuffer.append(',');
        }
        charBuffer.append('\"');
        charBuffer.append((CharSequence) str);
        charBuffer.append('\"');
        charBuffer.append(':');
        if (z2) {
            charBuffer.append('\"');
        }
        charBuffer.append((CharSequence) str2);
        if (z2) {
            charBuffer.append('\"');
        }
    }

    public final soh b() {
        soh sohVar;
        String str = H;
        String str2 = this.q;
        if (str2.equals(str)) {
            sohVar = this.j == null ? new soh() : new toh();
        } else {
            try {
                sohVar = (soh) Class.forName(str2).getConstructor(null).newInstance(null);
            } catch (Exception e) {
                ilg.k(e);
                return null;
            }
        }
        sohVar.a(this);
        return sohVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CharBuffer c(String str, byte[] bArr) {
        String str2;
        String str3;
        String str4;
        boolean z2;
        String rawUserInfo;
        CharBuffer allocate = CharBuffer.allocate(4096);
        allocate.append((CharSequence) "{");
        a(allocate, L6.q, "java", true, false);
        a(allocate, "version", l4d.a, true, true);
        String str5 = this.c;
        if (str5 != null) {
            a(allocate, "name", str5, true, true);
        }
        a(allocate, "protocol", "1", false, true);
        a(allocate, "verbose", String.valueOf(false), false, true);
        a(allocate, "pedantic", String.valueOf(false), false, true);
        a(allocate, "tls_required", String.valueOf(this.d != null), false, true);
        a(allocate, "echo", String.valueOf(true), false, true);
        a(allocate, "headers", String.valueOf(true), false, true);
        a(allocate, "no_responders", String.valueOf(true), false, true);
        String str6 = null;
        try {
            rawUserInfo = new v5d(str, null).a.getRawUserInfo();
        } catch (URISyntaxException unused) {
            str2 = null;
        }
        if (rawUserInfo != null) {
            int indexOf = rawUserInfo.indexOf(":");
            if (indexOf == -1) {
                str4 = ln5.a(rawUserInfo);
                str3 = null;
            } else {
                str2 = ln5.a(rawUserInfo.substring(0, indexOf));
                try {
                    str3 = ln5.a(rawUserInfo.substring(indexOf + 1));
                    str4 = null;
                } catch (URISyntaxException unused2) {
                    str3 = null;
                    str4 = null;
                    str6 = str2;
                    if (str6 != null) {
                    }
                    if (str3 == null) {
                    }
                    if (str4 != null) {
                    }
                    allocate.append((CharSequence) "}");
                    allocate.flip();
                    return allocate;
                }
                str6 = str2;
            }
        } else {
            str3 = null;
            str4 = null;
        }
        if (str6 != null) {
            int[] iArr = ln5.a;
            StringBuilder sb = new StringBuilder();
            int length = str6.length();
            int i = 0;
            while (i < length) {
                int i2 = length;
                char charAt = str6.charAt(i);
                String str7 = str6;
                if (charAt == '\f') {
                    sb.append("\\f");
                } else if (charAt == '\r') {
                    sb.append("\\r");
                } else if (charAt == '\"') {
                    sb.append("\\\"");
                } else if (charAt == '/') {
                    sb.append("\\/");
                } else if (charAt != '\\') {
                    switch (charAt) {
                        case '\b':
                            sb.append("\\b");
                            break;
                        case '\t':
                            sb.append("\\t");
                            break;
                        case '\n':
                            sb.append("\\n");
                            break;
                        default:
                            if (charAt >= ' ') {
                                sb.append(charAt);
                                break;
                            } else {
                                sb.append(String.format("\\u%04x", Integer.valueOf(charAt)));
                                break;
                            }
                    }
                } else {
                    sb.append("\\\\");
                }
                i++;
                length = i2;
                str6 = str7;
            }
            a(allocate, "user", sb.toString(), true, true);
        }
        if (str3 == null) {
            int[] iArr2 = ln5.a;
            StringBuilder sb2 = new StringBuilder();
            int length2 = str3.length();
            int i3 = 0;
            while (i3 < length2) {
                char charAt2 = str3.charAt(i3);
                String str8 = str3;
                if (charAt2 == '\f') {
                    sb2.append("\\f");
                } else if (charAt2 == '\r') {
                    sb2.append("\\r");
                } else if (charAt2 == '\"') {
                    sb2.append("\\\"");
                } else if (charAt2 == '/') {
                    sb2.append("\\/");
                } else if (charAt2 != '\\') {
                    switch (charAt2) {
                        case '\b':
                            sb2.append("\\b");
                            break;
                        case '\t':
                            sb2.append("\\t");
                            break;
                        case '\n':
                            sb2.append("\\n");
                            break;
                        default:
                            if (charAt2 >= ' ') {
                                sb2.append(charAt2);
                                break;
                            } else {
                                sb2.append(String.format("\\u%04x", Integer.valueOf(charAt2)));
                                break;
                            }
                    }
                } else {
                    sb2.append("\\\\");
                }
                i3++;
                str3 = str8;
            }
            z2 = true;
            a(allocate, "pass", sb2.toString(), true, true);
        } else {
            z2 = true;
        }
        if (str4 != null) {
            a(allocate, "auth_token", str4, z2, z2);
        }
        allocate.append((CharSequence) "}");
        allocate.flip();
        return allocate;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ExecutorService d() {
        boolean z2;
        ReentrantLock reentrantLock = this.s;
        reentrantLock.lock();
        try {
            ThreadPoolExecutor threadPoolExecutor = this.u;
            if (threadPoolExecutor != null) {
                if (threadPoolExecutor.isShutdown()) {
                }
                ThreadPoolExecutor threadPoolExecutor2 = this.u;
                reentrantLock.unlock();
                return threadPoolExecutor2;
            }
            String str = this.c;
            char[] cArr = dkk.a;
            if (str != null && !str.trim().isEmpty()) {
                z2 = false;
                if (z2) {
                    str = "nats";
                }
                this.u = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 500L, TimeUnit.MILLISECONDS, new SynchronousQueue(), new rvd(str, 0));
                ThreadPoolExecutor threadPoolExecutor22 = this.u;
                reentrantLock.unlock();
                return threadPoolExecutor22;
            }
            z2 = true;
            if (z2) {
            }
            this.u = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 500L, TimeUnit.MILLISECONDS, new SynchronousQueue(), new rvd(str, 0));
            ThreadPoolExecutor threadPoolExecutor222 = this.u;
            reentrantLock.unlock();
            return threadPoolExecutor222;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
