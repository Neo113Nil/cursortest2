package defpackage;

import com.ironsource.U3;
import com.unity3d.services.core.network.model.HttpRequest;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public abstract class yol {
    public static final TimeZone a;
    public static final String b;

    static {
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        timeZone.getClass();
        a = timeZone;
        b = StringsKt.W(StringsKt.V(jod.class.getName(), "okhttp3."), "Client");
    }

    public static final boolean a(jl9 jl9Var, jl9 jl9Var2) {
        jl9Var.getClass();
        return Intrinsics.c(jl9Var.d, jl9Var2.d) && jl9Var.e == jl9Var2.e && Intrinsics.c(jl9Var.a, jl9Var2.a);
    }

    public static final int b(String str, long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        if (j < 0) {
            hc5.f(str.concat(" < 0"));
            return 0;
        }
        long millis = timeUnit.toMillis(j);
        if (millis > 2147483647L) {
            ogj.h(str.concat(" too large"));
            return 0;
        }
        if (millis != 0 || j <= 0) {
            return (int) millis;
        }
        ogj.h(str.concat(" too small"));
        return 0;
    }

    public static final void c(Socket socket) {
        socket.getClass();
        try {
            socket.close();
        } catch (AssertionError e) {
            throw e;
        } catch (RuntimeException e2) {
            if (!Intrinsics.c(e2.getMessage(), "bio == null")) {
                throw e2;
            }
        } catch (Exception unused) {
        }
    }

    public static final String d(String str, Object... objArr) {
        Locale locale = Locale.US;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        return String.format(locale, str, Arrays.copyOf(copyOf, copyOf.length));
    }

    public static final long e(d2g d2gVar) {
        String a2 = d2gVar.f.a("Content-Length");
        if (a2 == null) {
            return -1L;
        }
        byte[] bArr = wol.a;
        try {
            return Long.parseLong(a2);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    public static final Charset f(l62 l62Var, Charset charset) {
        l62Var.getClass();
        charset.getClass();
        int c0 = l62Var.c0(wol.b);
        if (c0 == -1) {
            return charset;
        }
        if (c0 == 0) {
            return Charsets.UTF_8;
        }
        if (c0 == 1) {
            return Charsets.b;
        }
        if (c0 == 2) {
            Charsets.a.getClass();
            Charset charset2 = Charsets.f;
            if (charset2 != null) {
                return charset2;
            }
            Charset forName = Charset.forName("UTF-32LE");
            forName.getClass();
            Charsets.f = forName;
            return forName;
        }
        if (c0 == 3) {
            return Charsets.c;
        }
        if (c0 != 4) {
            ogj.b();
            return null;
        }
        Charsets.a.getClass();
        Charset charset3 = Charsets.g;
        if (charset3 != null) {
            return charset3;
        }
        Charset forName2 = Charset.forName("UTF-32BE");
        forName2.getClass();
        Charsets.g = forName2;
        return forName2;
    }

    public static final boolean g(cwh cwhVar, int i) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        timeUnit.getClass();
        long nanoTime = System.nanoTime();
        long c = cwhVar.timeout().e() ? cwhVar.timeout().c() - nanoTime : Long.MAX_VALUE;
        cwhVar.timeout().d(Math.min(c, timeUnit.toNanos(i)) + nanoTime);
        try {
            x52 x52Var = new x52();
            while (cwhVar.read(x52Var, 8192L) != -1) {
                x52Var.k();
            }
            if (c == Long.MAX_VALUE) {
                cwhVar.timeout().a();
                return true;
            }
            cwhVar.timeout().d(nanoTime + c);
            return true;
        } catch (InterruptedIOException unused) {
            if (c == Long.MAX_VALUE) {
                cwhVar.timeout().a();
                return false;
            }
            cwhVar.timeout().d(nanoTime + c);
            return false;
        } catch (Throwable th) {
            if (c == Long.MAX_VALUE) {
                cwhVar.timeout().a();
            } else {
                cwhVar.timeout().d(nanoTime + c);
            }
            throw th;
        }
    }

    public static final q89 h(List list) {
        ArrayList arrayList = new ArrayList(20);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            v79 v79Var = (v79) it.next();
            gc2 gc2Var = v79Var.a;
            gc2 gc2Var2 = v79Var.b;
            String w = gc2Var.w();
            String w2 = gc2Var2.w();
            arrayList.add(w);
            arrayList.add(StringsKt.l0(w2).toString());
        }
        return new q89((String[]) arrayList.toArray(new String[0]));
    }

    public static final String i(jl9 jl9Var, boolean z) {
        jl9Var.getClass();
        String str = jl9Var.d;
        int i = jl9Var.e;
        if (StringsKt.J(str, ":", false)) {
            str = dmi.j(']', U3.j.d, str);
        }
        if (!z) {
            String str2 = jl9Var.a;
            str2.getClass();
            if (i == (str2.equals("http") ? 80 : str2.equals(HttpRequest.DEFAULT_SCHEME) ? 443 : -1)) {
                return str;
            }
        }
        return str + ':' + i;
    }

    public static final List j(List list) {
        list.getClass();
        if (list.isEmpty()) {
            return km5.a;
        }
        if (list.size() == 1) {
            List singletonList = Collections.singletonList(list.get(0));
            singletonList.getClass();
            return singletonList;
        }
        Object[] array = list.toArray();
        array.getClass();
        List unmodifiableList = Collections.unmodifiableList(mh0.c(array));
        unmodifiableList.getClass();
        unmodifiableList.getClass();
        return unmodifiableList;
    }

    public static final List k(Object[] objArr) {
        if (objArr == null || objArr.length == 0) {
            return km5.a;
        }
        if (objArr.length == 1) {
            List singletonList = Collections.singletonList(objArr[0]);
            singletonList.getClass();
            return singletonList;
        }
        List unmodifiableList = Collections.unmodifiableList(mh0.c((Object[]) objArr.clone()));
        unmodifiableList.getClass();
        return unmodifiableList;
    }
}
