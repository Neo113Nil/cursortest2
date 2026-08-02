package io.sentry;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class k2 implements r0, m3, e1, l1, m1, ILogger {

    /* renamed from: a, reason: collision with root package name */
    public static final k2 f16593a = new k2();

    /* renamed from: b, reason: collision with root package name */
    public static final k2 f16594b = new k2();

    /* renamed from: c, reason: collision with root package name */
    public static final k2 f16595c = new k2();

    /* renamed from: d, reason: collision with root package name */
    public static final k2 f16596d = new k2();

    @Override // io.sentry.m3
    /* renamed from: J */
    public l3 getF15935n() {
        return p2.f16718a;
    }

    @Override // io.sentry.ILogger
    public void b(b5 b5Var, Throwable th2, String str, Object... objArr) {
        PrintStream printStream = System.out;
        String format = String.format(str, objArr);
        String th3 = th2.toString();
        StringWriter stringWriter = new StringWriter();
        th2.printStackTrace(new PrintWriter(stringWriter));
        printStream.println(b5Var + ": " + format + " \n " + th3 + "\n" + stringWriter.toString());
    }

    @Override // io.sentry.ILogger
    public void e(b5 b5Var, String str, Throwable th2) {
        if (th2 == null) {
            h(b5Var, str, new Object[0]);
            return;
        }
        PrintStream printStream = System.out;
        String format = String.format(str, th2.toString());
        StringWriter stringWriter = new StringWriter();
        th2.printStackTrace(new PrintWriter(stringWriter));
        printStream.println(b5Var + ": " + format + "\n" + stringWriter.toString());
    }

    @Override // io.sentry.l1
    public j3 g(j6 j6Var, List list, b6 b6Var) {
        return null;
    }

    @Override // io.sentry.ILogger
    public void h(b5 b5Var, String str, Object... objArr) {
        System.out.println(b5Var + ": " + String.format(str, objArr));
    }

    @Override // io.sentry.ILogger
    public boolean i(b5 b5Var) {
        return true;
    }

    @Override // io.sentry.e1
    public boolean isClosed() {
        return false;
    }

    @Override // io.sentry.l1
    public boolean isRunning() {
        return false;
    }

    @Override // io.sentry.m1
    public io.sentry.transport.g j(b6 b6Var, io.sentry.internal.debugmeta.c cVar) {
        return new io.sentry.transport.c(b6Var, new e5.j(b6Var), b6Var.getTransportGate(), cVar);
    }

    @Override // io.sentry.m3
    public io.sentry.protocol.v k() {
        return io.sentry.protocol.v.f16922b;
    }

    @Override // io.sentry.e1
    public Future l(Runnable runnable, long j) {
        return new FutureTask(new i0(3));
    }

    @Override // io.sentry.e1
    public Future submit(Runnable runnable) {
        return new FutureTask(new i0(3));
    }

    @Override // io.sentry.m3
    public void c() {
    }

    @Override // io.sentry.l1
    public void close() {
    }

    @Override // io.sentry.e1
    public void f() {
    }

    @Override // io.sentry.l1
    public void start() {
    }

    @Override // io.sentry.m3
    public void stop() {
    }

    @Override // io.sentry.m3
    public void t() {
    }

    @Override // io.sentry.m3
    public void z() {
    }

    @Override // io.sentry.l1
    public void a(k1 k1Var) {
    }

    @Override // io.sentry.e1
    public void d(long j) {
    }

    @Override // io.sentry.m3
    public void n(Boolean bool) {
    }

    @Override // io.sentry.m3
    public void w(io.sentry.android.replay.d dVar) {
    }
}
