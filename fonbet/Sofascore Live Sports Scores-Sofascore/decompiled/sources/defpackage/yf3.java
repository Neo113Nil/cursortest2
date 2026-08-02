package defpackage;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class yf3 extends RuntimeException {
    public final List a;
    public final String b;
    public fb3 c;

    public yf3(List list) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Throwable th = (Throwable) it.next();
                if (th instanceof yf3) {
                    linkedHashSet.addAll(((yf3) th).a);
                } else if (th != null) {
                    linkedHashSet.add(th);
                } else {
                    linkedHashSet.add(new NullPointerException("Throwable was null!"));
                }
            }
        } else {
            linkedHashSet.add(new NullPointerException("errors was null"));
        }
        if (linkedHashSet.isEmpty()) {
            a70.p("errors is empty");
            throw null;
        }
        arrayList.addAll(linkedHashSet);
        List unmodifiableList = Collections.unmodifiableList(arrayList);
        this.a = unmodifiableList;
        this.b = unmodifiableList.size() + " exceptions occurred. ";
    }

    public static void a(String str, StringBuilder sb, Throwable th) {
        sb.append(str);
        sb.append(th);
        sb.append('\n');
        for (StackTraceElement stackTraceElement : th.getStackTrace()) {
            sb.append("\t\tat ");
            sb.append(stackTraceElement);
            sb.append('\n');
        }
        if (th.getCause() != null) {
            sb.append("\tCaused by: ");
            a("", sb, th.getCause());
        }
    }

    public final void b(m6k m6kVar) {
        StringBuilder sb = new StringBuilder(128);
        sb.append(this);
        sb.append('\n');
        for (StackTraceElement stackTraceElement : getStackTrace()) {
            sb.append("\tat ");
            sb.append(stackTraceElement);
            sb.append('\n');
        }
        int i = 1;
        for (Throwable th : this.a) {
            wt3.u(i, "  ComposedException ", " :\n", sb);
            a("\t", sb, th);
            i++;
        }
        m6kVar.Z(sb.toString());
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable getCause() {
        fb3 fb3Var;
        try {
            fb3Var = this.c;
            if (fb3Var == null) {
                fb3Var = new fb3();
                HashSet hashSet = new HashSet();
                fb3 fb3Var2 = fb3Var;
                for (Throwable th : this.a) {
                    if (!hashSet.contains(th)) {
                        hashSet.add(th);
                        ArrayList arrayList = new ArrayList();
                        Throwable cause = th.getCause();
                        if (cause != null && cause != th) {
                            while (true) {
                                arrayList.add(cause);
                                Throwable cause2 = cause.getCause();
                                if (cause2 == null || cause2 == cause) {
                                    break;
                                }
                                cause = cause2;
                            }
                        }
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            Throwable th2 = (Throwable) it.next();
                            if (hashSet.contains(th2)) {
                                th = new RuntimeException("Duplicate found in causal chain so cropping to prevent loop ...");
                            } else {
                                hashSet.add(th2);
                            }
                        }
                        try {
                            fb3Var2.initCause(th);
                        } catch (Throwable unused) {
                        }
                        Throwable cause3 = fb3Var2.getCause();
                        if (cause3 != null && fb3Var2 != cause3) {
                            while (true) {
                                Throwable cause4 = cause3.getCause();
                                if (cause4 == null || cause4 == cause3) {
                                    break;
                                }
                                cause3 = cause4;
                            }
                            fb3Var2 = cause3;
                        }
                    }
                }
                this.c = fb3Var;
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return fb3Var;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.b;
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintStream printStream) {
        b(new xf3(printStream, 0));
    }

    @Override // java.lang.Throwable
    public final void printStackTrace() {
        printStackTrace(System.err);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintWriter printWriter) {
        b(new xf3(printWriter, 1));
    }

    public yf3(Throwable... thArr) {
        this(Arrays.asList(thArr));
    }
}
