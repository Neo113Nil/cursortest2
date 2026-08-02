package ld;

import android.util.Log;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

/* renamed from: ld.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC5459a {

    /* renamed from: a, reason: collision with root package name */
    public static final TimeZone f55826a = TimeZone.getTimeZone("UTC");

    /* renamed from: b, reason: collision with root package name */
    public static final List f55827b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public static c f55828c;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f55829d;

    /* renamed from: ld.a$a, reason: collision with other inner class name */
    public static class C0802a implements c {
        @Override // ld.AbstractC5459a.c
        public void a(d dVar, String str, String str2, Throwable th2) {
            d dVar2;
            String a10 = AbstractC5460b.a(str);
            if (b(str) && (dVar2 = d.ERROR) == dVar) {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.US);
                simpleDateFormat.setTimeZone(AbstractC5459a.f55826a);
                Log.println(dVar2.f55835a, a10, "Time in UTC: " + simpleDateFormat.format(new Date()));
            }
            if (th2 != null) {
                str2 = str2 + com.zendesk.util.d.f42388b + Log.getStackTraceString(th2);
            }
            Iterator it = AbstractC5460b.c(str2, 4000).iterator();
            while (it.hasNext()) {
                Log.println(dVar == null ? d.INFO.f55835a : dVar.f55835a, a10, (String) it.next());
            }
        }

        public final boolean b(String str) {
            if (com.zendesk.util.d.a(str)) {
                return str.endsWith("Provider") || str.endsWith("Service");
            }
            return false;
        }
    }

    /* renamed from: ld.a$b */
    public static class b implements c {
        @Override // ld.AbstractC5459a.c
        public void a(d dVar, String str, String str2, Throwable th2) {
            StringBuilder sb2 = new StringBuilder(100);
            sb2.append("[");
            sb2.append(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.US).format(new Date()));
            sb2.append("]");
            sb2.append(" ");
            sb2.append(dVar == null ? AbstractC5460b.b(d.INFO.f55835a) : AbstractC5460b.b(dVar.f55835a));
            sb2.append("/");
            if (!com.zendesk.util.d.a(str)) {
                str = "UNKNOWN";
            }
            sb2.append(str);
            sb2.append(": ");
            sb2.append(str2);
            System.out.println(sb2.toString());
            if (th2 != null) {
                th2.printStackTrace(System.out);
            }
        }
    }

    /* renamed from: ld.a$c */
    public interface c {
        void a(d dVar, String str, String str2, Throwable th2);
    }

    /* renamed from: ld.a$d */
    public enum d {
        VERBOSE(2),
        DEBUG(3),
        INFO(4),
        WARN(5),
        ERROR(6);


        /* renamed from: a, reason: collision with root package name */
        public final int f55835a;

        d(int i10) {
            this.f55835a = i10;
        }
    }

    static {
        try {
            Class.forName("android.os.Build");
            f55828c = new C0802a();
        } catch (ClassNotFoundException unused) {
            if (f55828c == null) {
                f55828c = new b();
            }
        } catch (Throwable th2) {
            if (f55828c == null) {
                f55828c = new b();
            }
            throw th2;
        }
        f55829d = false;
    }

    public static void b(String str, String str2, Object... objArr) {
        g(d.DEBUG, str, str2, null, objArr);
    }

    public static void c(String str, String str2, Throwable th2, Object... objArr) {
        g(d.ERROR, str, str2, th2, objArr);
    }

    public static void d(String str, String str2, Object... objArr) {
        g(d.ERROR, str, str2, null, objArr);
    }

    public static void e(String str, String str2, Object... objArr) {
        g(d.INFO, str, str2, null, objArr);
    }

    public static boolean f() {
        return f55829d;
    }

    public static void g(d dVar, String str, String str2, Throwable th2, Object... objArr) {
        if (objArr != null && objArr.length > 0) {
            str2 = String.format(Locale.US, str2, objArr);
        }
        if (f55829d) {
            f55828c.a(dVar, str, str2, th2);
            Iterator it = f55827b.iterator();
            while (it.hasNext()) {
                ((c) it.next()).a(dVar, str, str2, th2);
            }
        }
    }

    public static void h(String str, String str2, Throwable th2, Object... objArr) {
        g(d.WARN, str, str2, th2, objArr);
    }

    public static void i(String str, String str2, Object... objArr) {
        g(d.WARN, str, str2, null, objArr);
    }
}
