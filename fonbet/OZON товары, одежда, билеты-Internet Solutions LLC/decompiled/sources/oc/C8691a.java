package oc;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: oc.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C8691a extends RuntimeException {

    /* renamed from: a, reason: collision with root package name */
    private final List<Throwable> f78023a;

    /* renamed from: b, reason: collision with root package name */
    private final String f78024b;

    /* renamed from: c, reason: collision with root package name */
    private Throwable f78025c;

    /* renamed from: oc.a$a, reason: collision with other inner class name */
    static final class C1317a extends RuntimeException {
        @Override // java.lang.Throwable
        public final String getMessage() {
            return "Chain of Causes for CompositeException In Order Received =>";
        }
    }

    /* renamed from: oc.a$b */
    static abstract class b {
        abstract void a(String str);
    }

    /* renamed from: oc.a$c */
    static final class c extends b {

        /* renamed from: a, reason: collision with root package name */
        private final PrintStream f78026a;

        c(PrintStream printStream) {
            this.f78026a = printStream;
        }

        @Override // oc.C8691a.b
        final void a(String str) {
            this.f78026a.println((Object) str);
        }
    }

    /* renamed from: oc.a$d */
    static final class d extends b {

        /* renamed from: a, reason: collision with root package name */
        private final PrintWriter f78027a;

        d(PrintWriter printWriter) {
            this.f78027a = printWriter;
        }

        @Override // oc.C8691a.b
        final void a(String str) {
            this.f78027a.println((Object) str);
        }
    }

    public C8691a(Throwable... thArr) {
        this(Arrays.asList(thArr));
    }

    private static void a(StringBuilder sb2, Throwable th2, String str) {
        sb2.append(str);
        sb2.append(th2);
        sb2.append('\n');
        for (StackTraceElement stackTraceElement : th2.getStackTrace()) {
            sb2.append("\t\tat ");
            sb2.append(stackTraceElement);
            sb2.append('\n');
        }
        if (th2.getCause() != null) {
            sb2.append("\tCaused by: ");
            a(sb2, th2.getCause(), "");
        }
    }

    private void d(b bVar) {
        StringBuilder sb2 = new StringBuilder(UserVerificationMethods.USER_VERIFY_PATTERN);
        sb2.append(this);
        sb2.append('\n');
        for (StackTraceElement stackTraceElement : getStackTrace()) {
            sb2.append("\tat ");
            sb2.append(stackTraceElement);
            sb2.append('\n');
        }
        int i11 = 1;
        for (Throwable th2 : this.f78023a) {
            sb2.append("  ComposedException ");
            sb2.append(i11);
            sb2.append(" :\n");
            a(sb2, th2, "\t");
            i11++;
        }
        bVar.a(sb2.toString());
    }

    public final List<Throwable> b() {
        return this.f78023a;
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable getCause() {
        try {
            if (this.f78025c == null) {
                C1317a c1317a = new C1317a();
                HashSet hashSet = new HashSet();
                Iterator<Throwable> it = this.f78023a.iterator();
                C1317a c1317a2 = c1317a;
                while (it.hasNext()) {
                    Throwable next = it.next();
                    if (!hashSet.contains(next)) {
                        hashSet.add(next);
                        ArrayList arrayList = new ArrayList();
                        Throwable cause = next.getCause();
                        if (cause != null && cause != next) {
                            while (true) {
                                arrayList.add(cause);
                                Throwable cause2 = cause.getCause();
                                if (cause2 == null || cause2 == cause) {
                                    break;
                                }
                                cause = cause2;
                            }
                        }
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            Throwable th2 = (Throwable) it2.next();
                            if (hashSet.contains(th2)) {
                                next = new RuntimeException("Duplicate found in causal chain so cropping to prevent loop ...");
                            } else {
                                hashSet.add(th2);
                            }
                        }
                        try {
                            c1317a2.initCause(next);
                        } catch (Throwable unused) {
                        }
                        Throwable cause3 = c1317a2.getCause();
                        if (cause3 != null && c1317a2 != cause3) {
                            while (true) {
                                Throwable cause4 = cause3.getCause();
                                if (cause4 == null || cause4 == cause3) {
                                    break;
                                }
                                cause3 = cause4;
                            }
                            c1317a2 = cause3;
                        }
                    }
                }
                this.f78025c = c1317a;
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return this.f78025c;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f78024b;
    }

    @Override // java.lang.Throwable
    public final void printStackTrace() {
        printStackTrace(System.err);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintStream printStream) {
        d(new c(printStream));
    }

    public C8691a(List list) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Throwable th2 = (Throwable) it.next();
                if (th2 instanceof C8691a) {
                    linkedHashSet.addAll(((C8691a) th2).f78023a);
                } else if (th2 != null) {
                    linkedHashSet.add(th2);
                } else {
                    linkedHashSet.add(new NullPointerException("Throwable was null!"));
                }
            }
        } else {
            linkedHashSet.add(new NullPointerException("errors was null"));
        }
        if (!linkedHashSet.isEmpty()) {
            arrayList.addAll(linkedHashSet);
            List<Throwable> unmodifiableList = Collections.unmodifiableList(arrayList);
            this.f78023a = unmodifiableList;
            this.f78024b = unmodifiableList.size() + " exceptions occurred. ";
            return;
        }
        throw new IllegalArgumentException("errors is empty");
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintWriter printWriter) {
        d(new d(printWriter));
    }
}
