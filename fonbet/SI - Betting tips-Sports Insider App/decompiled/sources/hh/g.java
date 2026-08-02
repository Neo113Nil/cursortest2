package hh;

import gh.g0;
import gh.o0;
import gh.v;
import gh.y;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import j$.util.DesugarCollections;
import j$.util.DesugarTimeZone;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.collections.e0;
import kotlin.collections.o;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import okhttp3.Headers;
import okio.Buffer;
import okio.BufferedSource;
import okio.Source;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final TimeZone f10825a;

    /* renamed from: b, reason: collision with root package name */
    public static final String f10826b;

    static {
        TimeZone timeZone = DesugarTimeZone.getTimeZone("GMT");
        Intrinsics.checkNotNull(timeZone);
        f10825a = timeZone;
        String name = g0.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        f10826b = StringsKt.N(StringsKt.M(name, "okhttp3."), "Client");
    }

    public static final boolean a(y yVar, y other) {
        Intrinsics.checkNotNullParameter(yVar, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return Intrinsics.areEqual(yVar.f10332d, other.f10332d) && yVar.f10333e == other.f10333e && Intrinsics.areEqual(yVar.f10329a, other.f10329a);
    }

    public static final int b(long j) {
        TimeUnit unit = TimeUnit.MILLISECONDS;
        Intrinsics.checkNotNullParameter("timeout", "name");
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (j < 0) {
            throw new IllegalStateException("timeout < 0".toString());
        }
        long millis = unit.toMillis(j);
        if (millis > 2147483647L) {
            throw new IllegalArgumentException("timeout too large".toString());
        }
        if (millis != 0 || j <= 0) {
            return (int) millis;
        }
        throw new IllegalArgumentException("timeout too small".toString());
    }

    public static final void c(Socket socket) {
        Intrinsics.checkNotNullParameter(socket, "<this>");
        try {
            socket.close();
        } catch (AssertionError e7) {
            throw e7;
        } catch (RuntimeException e9) {
            if (!Intrinsics.areEqual(e9.getMessage(), "bio == null")) {
                throw e9;
            }
        } catch (Exception unused) {
        }
    }

    public static final String d(String format, Object... args) {
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(args, "args");
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        Locale locale = Locale.US;
        Object[] copyOf = Arrays.copyOf(args, args.length);
        String format2 = String.format(locale, format, Arrays.copyOf(copyOf, copyOf.length));
        Intrinsics.checkNotNullExpressionValue(format2, "format(...)");
        return format2;
    }

    public static final long e(o0 o0Var) {
        Intrinsics.checkNotNullParameter(o0Var, "<this>");
        String str = o0Var.f10278f.get("Content-Length");
        if (str != null) {
            byte[] bArr = e.f10821a;
            Intrinsics.checkNotNullParameter(str, "<this>");
            try {
                return Long.parseLong(str);
            } catch (NumberFormatException unused) {
            }
        }
        return -1L;
    }

    public static final Charset f(BufferedSource bufferedSource, Charset charset) {
        Intrinsics.checkNotNullParameter(bufferedSource, "<this>");
        Intrinsics.checkNotNullParameter(charset, "default");
        int select = bufferedSource.select(e.f10822b);
        if (select == -1) {
            return charset;
        }
        if (select == 0) {
            return Charsets.UTF_8;
        }
        if (select == 1) {
            return Charsets.f19239b;
        }
        if (select == 2) {
            Charsets.f19238a.getClass();
            Charset charset2 = Charsets.f19242e;
            if (charset2 != null) {
                return charset2;
            }
            Charset forName = Charset.forName("UTF-32LE");
            Intrinsics.checkNotNullExpressionValue(forName, "forName(...)");
            Charsets.f19242e = forName;
            return forName;
        }
        if (select == 3) {
            return Charsets.f19240c;
        }
        if (select != 4) {
            throw new AssertionError();
        }
        Charsets.f19238a.getClass();
        Charset charset3 = Charsets.f19243f;
        if (charset3 != null) {
            return charset3;
        }
        Charset forName2 = Charset.forName("UTF-32BE");
        Intrinsics.checkNotNullExpressionValue(forName2, "forName(...)");
        Charsets.f19243f = forName2;
        return forName2;
    }

    public static final boolean g(Source source, int i5) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        Intrinsics.checkNotNullParameter(source, "<this>");
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        long nanoTime = System.nanoTime();
        long deadlineNanoTime = source.getTimeout().getHasDeadline() ? source.getTimeout().deadlineNanoTime() - nanoTime : Long.MAX_VALUE;
        source.getTimeout().deadlineNanoTime(Math.min(deadlineNanoTime, timeUnit.toNanos(i5)) + nanoTime);
        try {
            Buffer buffer = new Buffer();
            while (source.read(buffer, 8192L) != -1) {
                buffer.clear();
            }
            if (deadlineNanoTime == LongCompanionObject.MAX_VALUE) {
                source.getTimeout().clearDeadline();
                return true;
            }
            source.getTimeout().deadlineNanoTime(nanoTime + deadlineNanoTime);
            return true;
        } catch (InterruptedIOException unused) {
            if (deadlineNanoTime == LongCompanionObject.MAX_VALUE) {
                source.getTimeout().clearDeadline();
                return false;
            }
            source.getTimeout().deadlineNanoTime(nanoTime + deadlineNanoTime);
            return false;
        } catch (Throwable th2) {
            if (deadlineNanoTime == LongCompanionObject.MAX_VALUE) {
                source.getTimeout().clearDeadline();
            } else {
                source.getTimeout().deadlineNanoTime(nanoTime + deadlineNanoTime);
            }
            throw th2;
        }
    }

    public static final Headers h(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        v vVar = new v();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            nh.d dVar = (nh.d) it.next();
            vVar.b(dVar.f20934a.utf8(), dVar.f20935b.utf8());
        }
        return vVar.d();
    }

    public static final String i(y yVar, boolean z5) {
        Intrinsics.checkNotNullParameter(yVar, "<this>");
        String str = yVar.f10332d;
        int i5 = yVar.f10333e;
        if (StringsKt.A(str, StringUtils.PROCESS_POSTFIX_DELIMITER, false)) {
            str = d9.e.e(']', "[", str);
        }
        if (!z5) {
            String scheme = yVar.f10329a;
            Intrinsics.checkNotNullParameter(scheme, "scheme");
            if (i5 == (Intrinsics.areEqual(scheme, "http") ? 80 : Intrinsics.areEqual(scheme, "https") ? 443 : -1)) {
                return str;
            }
        }
        return str + ':' + i5;
    }

    public static final List j(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (list.isEmpty()) {
            return e0.f19204a;
        }
        if (list.size() == 1) {
            List singletonList = Collections.singletonList(list.get(0));
            Intrinsics.checkNotNullExpressionValue(singletonList, "singletonList(...)");
            return singletonList;
        }
        Object[] array = list.toArray();
        Intrinsics.checkNotNullExpressionValue(array, "toArray(...)");
        List unmodifiableList = DesugarCollections.unmodifiableList(o.c(array));
        Intrinsics.checkNotNullExpressionValue(unmodifiableList, "unmodifiableList(...)");
        Intrinsics.checkNotNull(unmodifiableList, "null cannot be cast to non-null type kotlin.collections.List<T of okhttp3.internal._UtilJvmKt.toImmutableList>");
        return unmodifiableList;
    }

    public static final List k(Object[] objArr) {
        if (objArr == null || objArr.length == 0) {
            return e0.f19204a;
        }
        if (objArr.length == 1) {
            List singletonList = Collections.singletonList(objArr[0]);
            Intrinsics.checkNotNullExpressionValue(singletonList, "singletonList(...)");
            return singletonList;
        }
        List unmodifiableList = DesugarCollections.unmodifiableList(o.c((Object[]) objArr.clone()));
        Intrinsics.checkNotNullExpressionValue(unmodifiableList, "unmodifiableList(...)");
        return unmodifiableList;
    }
}
