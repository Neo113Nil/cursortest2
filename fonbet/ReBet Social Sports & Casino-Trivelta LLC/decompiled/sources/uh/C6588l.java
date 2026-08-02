package uh;

import java.lang.ref.Reference;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Predicate;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import uh.C6588l;
import vh.AbstractC6691b;

/* renamed from: uh.l, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6588l implements InterfaceC6581e, AutoCloseable {

    /* renamed from: c, reason: collision with root package name */
    public static final Logger f66725c = Logger.getLogger(C6588l.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC6581e f66726a;

    /* renamed from: b, reason: collision with root package name */
    public final b f66727b = b.j();

    /* renamed from: uh.l$a */
    public static class a extends Throwable {

        /* renamed from: a, reason: collision with root package name */
        public final String f66728a;

        /* renamed from: b, reason: collision with root package name */
        public final long f66729b;

        /* renamed from: c, reason: collision with root package name */
        public final InterfaceC6579c f66730c;

        /* renamed from: d, reason: collision with root package name */
        public volatile boolean f66731d;

        public a(InterfaceC6579c interfaceC6579c) {
            super("Thread [" + Thread.currentThread().getName() + "] opened scope for " + interfaceC6579c + " here:");
            this.f66728a = Thread.currentThread().getName();
            this.f66729b = Thread.currentThread().getId();
            this.f66730c = interfaceC6579c;
        }
    }

    /* renamed from: uh.l$b */
    public static class b extends AbstractC6691b {

        /* renamed from: f, reason: collision with root package name */
        public final ConcurrentHashMap f66732f;

        public b(ConcurrentHashMap concurrentHashMap) {
            super(false, false, concurrentHashMap);
            this.f66732f = concurrentHashMap;
            Thread thread = new Thread(this);
            thread.setName("weak-ref-cleaner-strictcontextstorage");
            thread.setPriority(1);
            thread.setDaemon(true);
            thread.start();
        }

        public static /* synthetic */ boolean i(a aVar) {
            return !aVar.f66731d;
        }

        public static b j() {
            return new b(new ConcurrentHashMap());
        }

        public List k() {
            List list = (List) this.f66732f.values().stream().filter(new Predicate() { // from class: uh.m
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return C6588l.b.i((C6588l.a) obj);
                }
            }).collect(Collectors.toList());
            this.f66732f.clear();
            return list;
        }

        @Override // java.lang.Runnable
        public void run() {
            while (!Thread.interrupted()) {
                try {
                    Reference remove = remove();
                    a aVar = remove != null ? (a) this.f66732f.remove(remove) : null;
                    if (aVar != null && !aVar.f66731d) {
                        C6588l.f66725c.log(Level.SEVERE, "Scope garbage collected before being closed.", (Throwable) C6588l.U(aVar));
                    }
                } catch (InterruptedException unused) {
                    return;
                }
            }
        }
    }

    /* renamed from: uh.l$c */
    public final class c implements InterfaceC6587k {

        /* renamed from: a, reason: collision with root package name */
        public final InterfaceC6587k f66733a;

        /* renamed from: b, reason: collision with root package name */
        public final a f66734b;

        public c(InterfaceC6587k interfaceC6587k, a aVar) {
            this.f66733a = interfaceC6587k;
            this.f66734b = aVar;
            C6588l.this.f66727b.c(this, aVar);
        }

        @Override // uh.InterfaceC6587k, java.lang.AutoCloseable
        public void close() {
            this.f66734b.f66731d = true;
            C6588l.this.f66727b.e(this);
            StackTraceElement[] stackTrace = new Throwable().getStackTrace();
            for (int i10 = 0; i10 < stackTrace.length; i10++) {
                StackTraceElement stackTraceElement = stackTrace[i10];
                if (stackTraceElement.getClassName().equals(c.class.getName()) && stackTraceElement.getMethodName().equals("close")) {
                    int i11 = i10 + 2;
                    int i12 = i10 + 1;
                    if (i12 < stackTrace.length) {
                        StackTraceElement stackTraceElement2 = stackTrace[i12];
                        if (stackTraceElement2.getClassName().equals("kotlin.jdk7.AutoCloseableKt") && stackTraceElement2.getMethodName().equals("closeFinally") && i11 < stackTrace.length) {
                            i11 = i10 + 3;
                        }
                    }
                    if (stackTrace[i11].getMethodName().equals("invokeSuspend")) {
                        i11++;
                    }
                    if (i11 < stackTrace.length) {
                        StackTraceElement stackTraceElement3 = stackTrace[i11];
                        if (stackTraceElement3.getClassName().equals("kotlin.coroutines.jvm.internal.BaseContinuationImpl") && stackTraceElement3.getMethodName().equals("resumeWith")) {
                            throw new AssertionError("Attempting to close a Scope created by Context.makeCurrent from inside a Kotlin coroutine. This is not allowed. Use Context.asContextElement provided by opentelemetry-extension-kotlin instead of makeCurrent.");
                        }
                    } else {
                        continue;
                    }
                }
            }
            if (Thread.currentThread().getId() != this.f66734b.f66729b) {
                throw new IllegalStateException(String.format("Thread [%s] opened scope, but thread [%s] closed it", this.f66734b.f66728a, Thread.currentThread().getName()), this.f66734b);
            }
            this.f66733a.close();
        }

        public String toString() {
            String message = this.f66734b.getMessage();
            return message != null ? message : super.toString();
        }
    }

    public C6588l(InterfaceC6581e interfaceC6581e) {
        this.f66726a = interfaceC6581e;
    }

    public static AssertionError U(a aVar) {
        AssertionError assertionError = new AssertionError("Thread [" + aVar.f66728a + "] opened a scope of " + aVar.f66730c + " here:");
        assertionError.setStackTrace(aVar.getStackTrace());
        return assertionError;
    }

    public static C6588l w0(InterfaceC6581e interfaceC6581e) {
        return new C6588l(interfaceC6581e);
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        this.f66727b.a();
        List k10 = this.f66727b.k();
        if (k10.isEmpty()) {
            return;
        }
        if (k10.size() > 1) {
            f66725c.log(Level.SEVERE, "Multiple scopes leaked - first will be thrown as an error.");
            Iterator it = k10.iterator();
            while (it.hasNext()) {
                f66725c.log(Level.SEVERE, "Scope leaked", (Throwable) U((a) it.next()));
            }
        }
        throw U((a) k10.get(0));
    }

    @Override // uh.InterfaceC6581e
    public InterfaceC6579c current() {
        return this.f66726a.current();
    }

    @Override // uh.InterfaceC6581e
    public InterfaceC6587k r(InterfaceC6579c interfaceC6579c) {
        int i10;
        InterfaceC6587k r10 = this.f66726a.r(interfaceC6579c);
        a aVar = new a(interfaceC6579c);
        StackTraceElement[] stackTrace = aVar.getStackTrace();
        for (int i11 = 0; i11 < stackTrace.length; i11++) {
            StackTraceElement stackTraceElement = stackTrace[i11];
            if (stackTraceElement.getClassName().equals(InterfaceC6579c.class.getName()) && stackTraceElement.getMethodName().equals("makeCurrent") && (i10 = i11 + 2) < stackTrace.length) {
                StackTraceElement stackTraceElement2 = stackTrace[i10];
                if (stackTraceElement2.getClassName().equals("kotlin.coroutines.jvm.internal.BaseContinuationImpl") && stackTraceElement2.getMethodName().equals("resumeWith")) {
                    throw new AssertionError("Attempting to call Context.makeCurrent from inside a Kotlin coroutine. This is not allowed. Use Context.asContextElement provided by opentelemetry-extension-kotlin instead of makeCurrent.");
                }
            }
        }
        int i12 = 1;
        while (i12 < stackTrace.length) {
            String className = stackTrace[i12].getClassName();
            if (!className.startsWith("io.opentelemetry.api.") && !className.startsWith("io.opentelemetry.sdk.testing.context.SettableContextStorageProvider") && !className.startsWith("io.opentelemetry.context.")) {
                break;
            }
            i12++;
        }
        aVar.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i12, stackTrace.length));
        return new c(r10, aVar);
    }
}
