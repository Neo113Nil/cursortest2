package com.vk.log;

import android.util.Log;
import com.ironsource.X3;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.android.utils.Logger;
import xsna.asp;
import xsna.bpn0;
import xsna.c100;
import xsna.e43;
import xsna.e5j;
import xsna.epx;
import xsna.gzs;
import xsna.hb8;
import xsna.hu2;
import xsna.igq;
import xsna.ihg;
import xsna.izs;
import xsna.jar;
import xsna.m9r;
import xsna.mnh0;
import xsna.nky;
import xsna.qi80;
import xsna.qky;
import xsna.rl3;
import xsna.rwe;
import xsna.t33;
import xsna.tdj;
import xsna.tsk;
import xsna.uar;
import xsna.urd0;
import xsna.v7r;
import xsna.vu5;
import xsna.wir;
import xsna.xkg0;
import xsna.y4g;
import xsna.z100;
import xsna.zrp;

/* compiled from: L.kt */
/* loaded from: classes.dex */
public final class L {
    public static final L a = new L();
    public static final Set<LogType> b = rl3.y0(new LogType[]{LogType.e, LogType.w});
    public static boolean c;
    public static ArrayList d;
    public static y4g e;
    public static m9r f;
    public static z100 g;
    public static v7r h;
    public static final ArrayList<a> i;
    public static final bpn0 j;
    public static final bpn0 k;
    public static final bpn0 l;
    public static xkg0 m;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: L.kt */
    public static final class LogType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ LogType[] $VALUES;
        public static final LogType d;
        public static final LogType e;
        public static final LogType i;
        public static final LogType v;
        public static final LogType w;

        /* compiled from: L.kt */
        /* loaded from: classes3.dex */
        public static final /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[LogType.values().length];
                try {
                    iArr[LogType.v.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[LogType.d.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[LogType.i.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[LogType.w.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[LogType.e.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        static {
            LogType logType = new LogType("v", 0);
            v = logType;
            LogType logType2 = new LogType("d", 1);
            d = logType2;
            LogType logType3 = new LogType("i", 2);
            i = logType3;
            LogType logType4 = new LogType(Logger.METHOD_W, 3);
            w = logType4;
            LogType logType5 = new LogType(Logger.METHOD_E, 4);
            e = logType5;
            LogType[] logTypeArr = {logType, logType2, logType3, logType4, logType5};
            $VALUES = logTypeArr;
            $ENTRIES = new asp(logTypeArr);
        }

        public LogType() {
            throw null;
        }

        public static LogType valueOf(String str) {
            return (LogType) Enum.valueOf(LogType.class, str);
        }

        public static LogType[] values() {
            return (LogType[]) $VALUES.clone();
        }

        public final int h() {
            int i2 = a.$EnumSwitchMapping$0[ordinal()];
            if (i2 == 1) {
                return 2;
            }
            if (i2 == 2) {
                return 3;
            }
            if (i2 == 3) {
                return 4;
            }
            if (i2 == 4) {
                return 5;
            }
            if (i2 == 5) {
                return 6;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* compiled from: L.kt */
    public interface a {
        void a(String str, boolean z);

        void b(String str);
    }

    /* compiled from: L.kt */
    /* loaded from: classes3.dex */
    public static final class b {
        public final String a;
        public final String b;
        public final String c;
        public final int d;

        public b(String str, String str2, String str3, int i) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = i;
        }

        public final String a() {
            return this.a;
        }

        public final int b() {
            return this.d;
        }

        public final String c() {
            return this.c;
        }

        public final String d() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c) && this.d == bVar.d;
        }

        public final int hashCode() {
            return Integer.hashCode(this.d) + urd0.a(urd0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("LocationInfo(className=");
            sb.append(this.a);
            sb.append(", threadName=");
            sb.append(this.b);
            sb.append(", methodName=");
            sb.append(this.c);
            sb.append(", lineNumber=");
            return vu5.b(sb, this.d, ')');
        }
    }

    static {
        LoggerOutputTarget.Companion.getClass();
        d = e43.a(LoggerOutputTarget.NONE);
        i = new ArrayList<>();
        j = new bpn0(new ihg(3));
        k = new bpn0(new rwe(2));
        l = new bpn0(new hb8(2));
    }

    public static final void A(Object... objArr) {
        u(a, LogType.v, Arrays.copyOf(objArr, objArr.length));
    }

    public static final void B(String str, String str2, Throwable th) {
        w(a, LogType.w, th, new Object[]{str, str2}, null, null, 24);
    }

    public static final void C(String str, Throwable th) {
        w(a, LogType.w, th, new Object[]{str}, null, null, 24);
    }

    public static final void D(String str, gzs<? extends Object> gzsVar) {
        L l2 = a;
        l2.getClass();
        if (m(LoggerOutputTarget.NONE)) {
            return;
        }
        u(l2, LogType.w, new Object[]{str, gzsVar.invoke()});
    }

    public static final void E(Throwable th, Object... objArr) {
        w(a, LogType.w, th, Arrays.copyOf(objArr, objArr.length), null, null, 24);
    }

    public static final void F(gzs<? extends Object> gzsVar) {
        L l2 = a;
        l2.getClass();
        if (m(LoggerOutputTarget.NONE)) {
            return;
        }
        u(l2, LogType.w, new Object[]{gzsVar.invoke()});
    }

    public static final void G(String... strArr) {
        u(a, LogType.w, Arrays.copyOf(strArr, strArr.length));
    }

    public static final boolean a() {
        a.getClass();
        z100 z100Var = g;
        if (z100Var == null) {
            z100Var = null;
        }
        if (!z100Var.h.getBoolean("isStartLogging", false)) {
            return false;
        }
        z100 z100Var2 = g;
        if (z100Var2 == null) {
            z100Var2 = null;
        }
        String str = z100Var2.d.b;
        Iterator<a> it = i.iterator();
        while (it.hasNext()) {
            it.next().b(str);
        }
        z100 z100Var3 = g;
        if (z100Var3 == null) {
            z100Var3 = null;
        }
        if (!z100Var3.c) {
            return true;
        }
        v7r v7rVar = h;
        v7r v7rVar2 = v7rVar != null ? v7rVar : null;
        ((ExecutorService) v7rVar2.b.b.getValue()).execute(new tsk(v7rVar2, 1));
        return true;
    }

    public static com.vk.log.b b(String str, boolean z) {
        if (!c) {
            Log.println(6, "L", "Create extra logger before L is initialized!".concat(mnh0.A(new Exception())));
            return new c();
        }
        z100 z100Var = g;
        if (z100Var == null) {
            z100Var = null;
        }
        jar jarVar = z100Var.d;
        m9r m9rVar = f;
        return new igq(new qi80(m9rVar != null ? m9rVar : null), jarVar, str, new qky(z));
    }

    public static final void c(String str, gzs<? extends Object> gzsVar) {
        L l2 = a;
        l2.getClass();
        if (m(LoggerOutputTarget.NONE)) {
            return;
        }
        u(l2, LogType.d, new Object[]{str, gzsVar.invoke()});
    }

    public static final void d(gzs<? extends Object> gzsVar) {
        L l2 = a;
        l2.getClass();
        if (m(LoggerOutputTarget.NONE)) {
            return;
        }
        u(l2, LogType.d, new Object[]{gzsVar.invoke()});
    }

    public static final void e(Object... objArr) {
        u(a, LogType.d, Arrays.copyOf(objArr, objArr.length));
    }

    public static final void f(String str, String str2, Throwable th) {
        w(a, LogType.e, th, new Object[]{str, str2}, null, null, 24);
    }

    public static final void g(String str, Throwable th) {
        w(a, LogType.e, th, new Object[]{str}, null, null, 24);
    }

    public static final void h(String str, gzs<? extends Object> gzsVar) {
        L l2 = a;
        l2.getClass();
        if (m(LoggerOutputTarget.NONE)) {
            return;
        }
        u(l2, LogType.e, new Object[]{str, gzsVar.invoke()});
    }

    public static final void i(Throwable th) {
        w(a, LogType.e, th, new Object[0], null, null, 24);
    }

    public static final void j(Throwable th, Object... objArr) {
        w(a, LogType.e, th, Arrays.copyOf(objArr, objArr.length), null, null, 24);
    }

    public static final void k(gzs<? extends Object> gzsVar) {
        L l2 = a;
        l2.getClass();
        if (m(LoggerOutputTarget.NONE)) {
            return;
        }
        u(l2, LogType.e, new Object[]{gzsVar.invoke()});
    }

    public static final void l(String... strArr) {
        u(a, LogType.e, Arrays.copyOf(strArr, strArr.length));
    }

    public static boolean m(LoggerOutputTarget loggerOutputTarget) {
        LoggerOutputTarget.a aVar = LoggerOutputTarget.Companion;
        ArrayList arrayList = d;
        aVar.getClass();
        return LoggerOutputTarget.a.a(arrayList, loggerOutputTarget);
    }

    public static final void n(String str, gzs<? extends Object> gzsVar) {
        L l2 = a;
        l2.getClass();
        if (m(LoggerOutputTarget.NONE)) {
            return;
        }
        u(l2, LogType.i, new Object[]{str, gzsVar.invoke()});
    }

    public static final void o(gzs<? extends Object> gzsVar) {
        L l2 = a;
        l2.getClass();
        if (m(LoggerOutputTarget.NONE)) {
            return;
        }
        u(l2, LogType.i, new Object[]{gzsVar.invoke()});
    }

    public static final void p(Object... objArr) {
        u(a, LogType.i, Arrays.copyOf(objArr, objArr.length));
    }

    public static final boolean q() {
        LoggerOutputTarget.a aVar = LoggerOutputTarget.Companion;
        ArrayList arrayList = d;
        aVar.getClass();
        return LoggerOutputTarget.a.a(arrayList, LoggerOutputTarget.RING_FILE) || LoggerOutputTarget.a.a(arrayList, LoggerOutputTarget.LOGCAT);
    }

    public static final void r(LogType logType, String str, String str2) {
        a.getClass();
        x(logType, str, str2, null);
    }

    public static final void s(LogType logType, String str, String str2, Throwable th) {
        a.getClass();
        x(logType, str, str2, th);
    }

    public static void u(L l2, LogType logType, Object[] objArr) {
        l2.getClass();
        l2.t(logType, objArr, (izs) l.getValue());
    }

    public static final void v(LogType logType, String str, Throwable th, Object... objArr) {
        w(a, logType, th, Arrays.copyOf(objArr, objArr.length), str, null, 16);
    }

    public static void w(L l2, final LogType logType, final Throwable th, final Object[] objArr, String str, izs izsVar, int i2) {
        final StackTraceElement stackTraceElement;
        if ((i2 & 8) != 0) {
            str = L.class.getName();
        }
        if ((i2 & 16) != 0) {
            l2.getClass();
            izsVar = (izs) l.getValue();
        }
        final izs izsVar2 = izsVar;
        l2.getClass();
        if (m(LoggerOutputTarget.NONE)) {
            return;
        }
        if (!c) {
            String Z = rl3.Z(objArr, " | ", null, null, new nky(), 30);
            int h2 = logType.h();
            StringBuilder a2 = t33.a("Log logEx before init L!\nMessage: ", Z, "\nError: ");
            a2.append(th != null ? mnh0.A(th) : null);
            Log.println(h2, "L", a2.toString());
            return;
        }
        final Thread currentThread = Thread.currentThread();
        StackTraceElement[] stackTrace = currentThread.getStackTrace();
        boolean z = false;
        int i3 = 0;
        while (true) {
            if (i3 >= stackTrace.length) {
                stackTraceElement = null;
                break;
            }
            int i4 = i3 + 1;
            try {
                StackTraceElement stackTraceElement2 = stackTrace[i3];
                if (epx.f(stackTraceElement2.getClassName(), str)) {
                    z = true;
                }
                if (z && !epx.f(stackTraceElement2.getClassName(), str)) {
                    stackTraceElement = stackTraceElement2;
                    break;
                }
                i3 = i4;
            } catch (ArrayIndexOutOfBoundsException e2) {
                throw new NoSuchElementException(e2.getMessage());
            }
        }
        if (stackTraceElement != null) {
            str = stackTraceElement.getClassName();
        }
        final String str2 = str;
        ((ExecutorService) j.getValue()).execute(new Runnable() { // from class: xsna.oky
            @Override // java.lang.Runnable
            public final void run() {
                String str3;
                String str4;
                L l3 = L.a;
                String name = currentThread.getName();
                StackTraceElement stackTraceElement3 = stackTraceElement;
                if (stackTraceElement3 == null || (str3 = stackTraceElement3.getMethodName()) == null) {
                    str3 = "unknown";
                }
                L.b bVar = new L.b(str2, name, str3, stackTraceElement3 != null ? stackTraceElement3.getLineNumber() : 0);
                Object[] objArr2 = objArr;
                Object[] copyOf = Arrays.copyOf(objArr2, objArr2.length);
                l3.getClass();
                StringBuilder sb = (StringBuilder) L.k.getValue();
                sb.setLength(0);
                sb.append(X3.j.d + bVar.d() + "] " + bVar.c() + ':' + bVar.b() + ' ');
                int length = copyOf.length;
                int i5 = 0;
                while (true) {
                    if (i5 >= length) {
                        break;
                    }
                    Object obj = copyOf[i5];
                    if (obj instanceof CharSequence) {
                        CharSequence charSequence = (CharSequence) obj;
                        if (charSequence.length() > 4096) {
                            obj = charSequence.subSequence(0, 4096).toString();
                        }
                    }
                    bpn0 bpn0Var = L.k;
                    StringBuilder sb2 = (StringBuilder) bpn0Var.getValue();
                    sb2.append(obj);
                    sb2.append(" ");
                    if (((StringBuilder) bpn0Var.getValue()).length() >= 4096) {
                        ((StringBuilder) bpn0Var.getValue()).append(" ...(strip long data, more then 4096 bytes) ");
                        break;
                    }
                    i5++;
                }
                z100 z100Var = L.g;
                if (z100Var == null) {
                    z100Var = null;
                }
                String str5 = z100Var.d.a;
                String a3 = bVar.a();
                String j0 = drm0.j0(a3, ".", a3);
                if (j0.equals(a3)) {
                    if (brm0.B(a3, str5, false) && a3.length() > str5.length()) {
                        a3 = a3.substring(str5.length() + 1);
                    }
                    str4 = a3;
                } else {
                    str4 = j0;
                }
                String str6 = (String) izsVar2.invoke(((StringBuilder) L.k.getValue()).toString());
                L.LogType logType2 = L.LogType.this;
                Throwable th2 = th;
                if (th2 == null) {
                    y4g y4gVar = L.e;
                    (y4gVar != null ? y4gVar : null).b(logType2, str4, str6, false);
                } else {
                    y4g y4gVar2 = L.e;
                    (y4gVar2 == null ? null : y4gVar2).a(logType2, str4, str6, th2, false);
                }
            }
        });
    }

    public static void x(LogType logType, String str, String str2, Throwable th) {
        String str3 = (String) ((izs) l.getValue()).invoke(str2);
        if (m(LoggerOutputTarget.NONE)) {
            return;
        }
        if (!c) {
            int h2 = logType.h();
            StringBuilder a2 = t33.a("Log logExCustom before init L!\nMessage: ", str3, "\nError: ");
            a2.append(th != null ? mnh0.A(th) : null);
            Log.println(h2, str, a2.toString());
            return;
        }
        if (th == null) {
            y4g y4gVar = e;
            (y4gVar != null ? y4gVar : null).b(logType, str, str3, false);
        } else {
            y4g y4gVar2 = e;
            (y4gVar2 != null ? y4gVar2 : null).a(logType, str, str3, th, false);
        }
    }

    public static final void y(ArrayList arrayList) {
        d = arrayList;
        y4g y4gVar = e;
        if (y4gVar == null) {
            y4gVar = null;
        }
        y4gVar.c();
        a.getClass();
        if (m(LoggerOutputTarget.NONE)) {
            return;
        }
        if (m(LoggerOutputTarget.CONSOLE)) {
            y4g y4gVar2 = e;
            if (y4gVar2 == null) {
                y4gVar2 = null;
            }
            y4gVar2.b.add(new e5j());
        }
        if (m(LoggerOutputTarget.LOGCAT)) {
            y4g y4gVar3 = e;
            if (y4gVar3 == null) {
                y4gVar3 = null;
            }
            z100 z100Var = g;
            jar jarVar = (z100Var == null ? null : z100Var).d;
            m9r m9rVar = f;
            if (m9rVar == null) {
                m9rVar = null;
            }
            if (z100Var == null) {
                z100Var = null;
            }
            y4gVar3.b.add(new uar(jarVar, new c100(m9rVar, z100Var.e)));
        }
        if (m(LoggerOutputTarget.RING_FILE)) {
            m9r m9rVar2 = f;
            if (m9rVar2 == null) {
                m9rVar2 = null;
            }
            z100 z100Var2 = g;
            if (z100Var2 == null) {
                z100Var2 = null;
            }
            xkg0 xkg0Var = new xkg0(m9rVar2, z100Var2.f);
            m = xkg0Var;
            y4g y4gVar4 = e;
            if (y4gVar4 == null) {
                y4gVar4 = null;
            }
            z100 z100Var3 = g;
            if (z100Var3 == null) {
                z100Var3 = null;
            }
            y4gVar4.b.add(new uar(z100Var3.d, xkg0Var));
        }
        if (m(LoggerOutputTarget.EXTERNAL)) {
            z100 z100Var4 = g;
            if (z100Var4 == null) {
                z100Var4 = null;
            }
            hu2 hu2Var = z100Var4.i;
            y4g y4gVar5 = e;
            if (y4gVar5 == null) {
                y4gVar5 = null;
            }
            y4gVar5.b.add(new wir());
        }
        boolean q = q();
        z100 z100Var5 = g;
        tdj.b((z100Var5 != null ? z100Var5 : null).h, "isStartLogging", q);
    }

    public static String z() {
        z100 z100Var = g;
        if (z100Var == null) {
            z100Var = null;
        }
        if (z100Var.c) {
            v7r v7rVar = h;
            if (v7rVar == null) {
                v7rVar = null;
            }
            String file = v7rVar.c.toString();
            if (v7rVar.a(file)) {
                return file;
            }
        }
        return null;
    }

    public final void t(LogType logType, Object[] objArr, izs<? super String, String> izsVar) {
        w(this, logType, null, Arrays.copyOf(objArr, objArr.length), null, izsVar, 8);
    }

    /* compiled from: L.kt */
    /* loaded from: classes3.dex */
    public static final class c implements com.vk.log.b {
        @Override // com.vk.log.b
        public final void a(LogType logType, String str, Throwable th, boolean z, izs<? super String, String> izsVar) {
            if (th == null) {
                th = new Exception("UninitializedExtraLogger!");
            }
            L.w(L.a, LogType.e, th, Arrays.copyOf(new Object[]{str}, 1), null, izsVar, 8);
        }

        @Override // com.vk.log.b
        public final void release() {
        }
    }
}
