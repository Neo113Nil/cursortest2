package defpackage;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class mz8 extends Exception {
    public static final StackTraceElement[] f = new StackTraceElement[0];
    public final List a;
    public pia b;
    public int c;
    public Class d;
    public final String e;

    public mz8(String str, List list) {
        this.e = str;
        setStackTrace(f);
        this.a = list;
    }

    public static void a(Throwable th, ArrayList arrayList) {
        if (th instanceof mz8) {
            Iterator it = ((mz8) th).a.iterator();
            while (it.hasNext()) {
                a((Throwable) it.next(), arrayList);
            }
        } else if (th != null) {
            arrayList.add(th);
        }
    }

    public static void b(List list, lz8 lz8Var) {
        int size = list.size();
        int i = 0;
        while (i < size) {
            lz8Var.append("Cause (");
            int i2 = i + 1;
            lz8Var.append(String.valueOf(i2));
            lz8Var.append(" of ");
            lz8Var.append(String.valueOf(size));
            lz8Var.append("): ");
            Throwable th = (Throwable) list.get(i);
            if (th instanceof mz8) {
                ((mz8) th).d(lz8Var);
            } else {
                c(th, lz8Var);
            }
            i = i2;
        }
    }

    public static void c(Throwable th, Appendable appendable) {
        try {
            appendable.append(th.getClass().toString()).append(": ").append(th.getMessage()).append('\n');
        } catch (IOException unused) {
            is8.h(th);
        }
    }

    public final void d(Appendable appendable) {
        c(this, appendable);
        try {
            b(this.a, new lz8(appendable));
        } catch (IOException e) {
            is8.h(e);
        }
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder(71);
        sb.append(this.e);
        String str3 = "";
        if (this.d != null) {
            str = ", " + this.d;
        } else {
            str = "";
        }
        sb.append(str);
        int i = this.c;
        if (i != 0) {
            str2 = ", ".concat(i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "MEMORY_CACHE" : "RESOURCE_DISK_CACHE" : "DATA_DISK_CACHE" : "REMOTE" : "LOCAL");
        } else {
            str2 = "";
        }
        sb.append(str2);
        if (this.b != null) {
            str3 = ", " + this.b;
        }
        sb.append(str3);
        ArrayList arrayList = new ArrayList();
        a(this, arrayList);
        if (arrayList.isEmpty()) {
            return sb.toString();
        }
        if (arrayList.size() == 1) {
            sb.append("\nThere was 1 root cause:");
        } else {
            sb.append("\nThere were ");
            sb.append(arrayList.size());
            sb.append(" root causes:");
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Throwable th = (Throwable) it.next();
            sb.append('\n');
            sb.append(th.getClass().getName());
            sb.append('(');
            sb.append(th.getMessage());
            sb.append(')');
        }
        sb.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb.toString();
    }

    @Override // java.lang.Throwable
    public final void printStackTrace() {
        d(System.err);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintStream printStream) {
        d(printStream);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintWriter printWriter) {
        d(printWriter);
    }

    public mz8(String str) {
        this(str, Collections.EMPTY_LIST);
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        return this;
    }
}
