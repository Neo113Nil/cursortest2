package com.bumptech.glide.load.engine;

import android.util.Log;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class q extends Exception {
    private static final StackTraceElement[] EMPTY_ELEMENTS = new StackTraceElement[0];
    private static final long serialVersionUID = 1;

    /* renamed from: a, reason: collision with root package name */
    public final List f29903a;

    /* renamed from: b, reason: collision with root package name */
    public com.bumptech.glide.load.g f29904b;

    /* renamed from: c, reason: collision with root package name */
    public com.bumptech.glide.load.a f29905c;

    /* renamed from: d, reason: collision with root package name */
    public Class f29906d;

    /* renamed from: e, reason: collision with root package name */
    public String f29907e;

    /* renamed from: f, reason: collision with root package name */
    public Exception f29908f;

    public q(String str) {
        this(str, Collections.EMPTY_LIST);
    }

    public static void b(List list, Appendable appendable) {
        try {
            c(list, appendable);
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static void c(List list, Appendable appendable) {
        int size = list.size();
        int i10 = 0;
        while (i10 < size) {
            int i11 = i10 + 1;
            appendable.append("Cause (").append(String.valueOf(i11)).append(" of ").append(String.valueOf(size)).append("): ");
            Throwable th2 = (Throwable) list.get(i10);
            if (th2 instanceof q) {
                ((q) th2).h(appendable);
            } else {
                d(th2, appendable);
            }
            i10 = i11;
        }
    }

    public static void d(Throwable th2, Appendable appendable) {
        try {
            appendable.append(th2.getClass().toString()).append(": ").append(th2.getMessage()).append('\n');
        } catch (IOException unused) {
            throw new RuntimeException(th2);
        }
    }

    public final void a(Throwable th2, List list) {
        if (!(th2 instanceof q)) {
            list.add(th2);
            return;
        }
        Iterator it = ((q) th2).e().iterator();
        while (it.hasNext()) {
            a((Throwable) it.next(), list);
        }
    }

    public List e() {
        return this.f29903a;
    }

    public List f() {
        ArrayList arrayList = new ArrayList();
        a(this, arrayList);
        return arrayList;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        return this;
    }

    public void g(String str) {
        List f10 = f();
        int size = f10.size();
        int i10 = 0;
        while (i10 < size) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Root cause (");
            int i11 = i10 + 1;
            sb2.append(i11);
            sb2.append(" of ");
            sb2.append(size);
            sb2.append(")");
            Log.i(str, sb2.toString(), (Throwable) f10.get(i10));
            i10 = i11;
        }
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        StringBuilder sb2 = new StringBuilder(71);
        sb2.append(this.f29907e);
        sb2.append(this.f29906d != null ? ", " + this.f29906d : "");
        sb2.append(this.f29905c != null ? ", " + this.f29905c : "");
        sb2.append(this.f29904b != null ? ", " + this.f29904b : "");
        List<Throwable> f10 = f();
        if (f10.isEmpty()) {
            return sb2.toString();
        }
        if (f10.size() == 1) {
            sb2.append("\nThere was 1 root cause:");
        } else {
            sb2.append("\nThere were ");
            sb2.append(f10.size());
            sb2.append(" root causes:");
        }
        for (Throwable th2 : f10) {
            sb2.append('\n');
            sb2.append(th2.getClass().getName());
            sb2.append('(');
            sb2.append(th2.getMessage());
            sb2.append(')');
        }
        sb2.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb2.toString();
    }

    public final void h(Appendable appendable) {
        d(this, appendable);
        b(e(), new a(appendable));
    }

    public void i(com.bumptech.glide.load.g gVar, com.bumptech.glide.load.a aVar) {
        j(gVar, aVar, null);
    }

    public void j(com.bumptech.glide.load.g gVar, com.bumptech.glide.load.a aVar, Class cls) {
        this.f29904b = gVar;
        this.f29905c = aVar;
        this.f29906d = cls;
    }

    public void k(Exception exc) {
        this.f29908f = exc;
    }

    @Override // java.lang.Throwable
    public void printStackTrace() {
        printStackTrace(System.err);
    }

    public q(String str, Throwable th2) {
        this(str, Collections.singletonList(th2));
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) {
        h(printStream);
    }

    public q(String str, List list) {
        this.f29907e = str;
        setStackTrace(EMPTY_ELEMENTS);
        this.f29903a = list;
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) {
        h(printWriter);
    }

    public static final class a implements Appendable {

        /* renamed from: a, reason: collision with root package name */
        public final Appendable f29909a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f29910b = true;

        public a(Appendable appendable) {
            this.f29909a = appendable;
        }

        public final CharSequence a(CharSequence charSequence) {
            return charSequence == null ? "" : charSequence;
        }

        @Override // java.lang.Appendable
        public Appendable append(char c10) {
            if (this.f29910b) {
                this.f29910b = false;
                this.f29909a.append("  ");
            }
            this.f29910b = c10 == '\n';
            this.f29909a.append(c10);
            return this;
        }

        @Override // java.lang.Appendable
        public Appendable append(CharSequence charSequence) {
            CharSequence a10 = a(charSequence);
            return append(a10, 0, a10.length());
        }

        @Override // java.lang.Appendable
        public Appendable append(CharSequence charSequence, int i10, int i11) {
            CharSequence a10 = a(charSequence);
            boolean z10 = false;
            if (this.f29910b) {
                this.f29910b = false;
                this.f29909a.append("  ");
            }
            if (a10.length() > 0 && a10.charAt(i11 - 1) == '\n') {
                z10 = true;
            }
            this.f29910b = z10;
            this.f29909a.append(a10, i10, i11);
            return this;
        }
    }
}
