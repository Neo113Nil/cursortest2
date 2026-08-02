package cf;

import C.o0;
import I0.C3173b;
import We.C4859a;
import We.O;
import cf.C5824e;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes6.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    private final long f57144a;

    /* renamed from: b, reason: collision with root package name */
    private final bf.c f57145b;

    /* renamed from: c, reason: collision with root package name */
    private final k f57146c;

    /* renamed from: d, reason: collision with root package name */
    private final ConcurrentLinkedQueue<j> f57147d;

    /* renamed from: e, reason: collision with root package name */
    private final int f57148e;

    public l(@NotNull bf.e taskRunner, int i11, long j11) {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        this.f57148e = i11;
        this.f57144a = timeUnit.toNanos(j11);
        this.f57145b = taskRunner.h();
        this.f57146c = new k(this, o0.c(new StringBuilder(), Ye.b.f34906g, " ConnectionPool"));
        this.f57147d = new ConcurrentLinkedQueue<>();
        if (j11 <= 0) {
            throw new IllegalArgumentException(C3173b.b(j11, "keepAliveDuration <= 0: ").toString());
        }
    }

    private final int e(j jVar, long j11) {
        p002if.j jVar2;
        byte[] bArr = Ye.b.f34900a;
        ArrayList k11 = jVar.k();
        int i11 = 0;
        while (i11 < k11.size()) {
            Reference reference = (Reference) k11.get(i11);
            if (reference.get() != null) {
                i11++;
            } else {
                String str = "A connection to " + jVar.x().a().l() + " was leaked. Did you forget to close a response body?";
                p002if.j.f66400c.getClass();
                jVar2 = p002if.j.f66398a;
                jVar2.l(((C5824e.b) reference).a(), str);
                k11.remove(i11);
                jVar.z();
                if (k11.isEmpty()) {
                    jVar.y(j11 - this.f57144a);
                    return 0;
                }
            }
        }
        return k11.size();
    }

    public final boolean a(@NotNull C4859a address, @NotNull C5824e call, List<O> list, boolean z11) {
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(call, "call");
        Iterator<j> it = this.f57147d.iterator();
        while (it.hasNext()) {
            j connection = it.next();
            Intrinsics.checkNotNullExpressionValue(connection, "connection");
            synchronized (connection) {
                if (z11) {
                    try {
                        if (!connection.s()) {
                            Unit unit = Unit.f71690a;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (connection.q(address, list)) {
                    call.c(connection);
                    return true;
                }
                Unit unit2 = Unit.f71690a;
            }
        }
        return false;
    }

    public final long b(long j11) {
        Iterator<j> it = this.f57147d.iterator();
        int i11 = 0;
        long j12 = Long.MIN_VALUE;
        j jVar = null;
        int i12 = 0;
        while (it.hasNext()) {
            j connection = it.next();
            Intrinsics.checkNotNullExpressionValue(connection, "connection");
            synchronized (connection) {
                try {
                    if (e(connection, j11) > 0) {
                        i12++;
                    } else {
                        i11++;
                        long l11 = j11 - connection.l();
                        if (l11 > j12) {
                            Unit unit = Unit.f71690a;
                            jVar = connection;
                            j12 = l11;
                        } else {
                            Unit unit2 = Unit.f71690a;
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        long j13 = this.f57144a;
        if (j12 < j13 && i11 <= this.f57148e) {
            if (i11 > 0) {
                return j13 - j12;
            }
            if (i12 > 0) {
                return j13;
            }
            return -1L;
        }
        Intrinsics.f(jVar);
        synchronized (jVar) {
            if (!jVar.k().isEmpty()) {
                return 0L;
            }
            if (jVar.l() + j12 != j11) {
                return 0L;
            }
            jVar.z();
            this.f57147d.remove(jVar);
            Ye.b.f(jVar.A());
            if (this.f57147d.isEmpty()) {
                this.f57145b.a();
            }
            return 0L;
        }
    }

    public final boolean c(@NotNull j connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        byte[] bArr = Ye.b.f34900a;
        boolean m11 = connection.m();
        bf.c cVar = this.f57145b;
        if (!m11 && this.f57148e != 0) {
            cVar.j(this.f57146c, 0L);
            return false;
        }
        connection.z();
        ConcurrentLinkedQueue<j> concurrentLinkedQueue = this.f57147d;
        concurrentLinkedQueue.remove(connection);
        if (concurrentLinkedQueue.isEmpty()) {
            cVar.a();
        }
        return true;
    }

    public final void d() {
        Socket socket;
        Iterator<j> it = this.f57147d.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "connections.iterator()");
        while (it.hasNext()) {
            j connection = it.next();
            Intrinsics.checkNotNullExpressionValue(connection, "connection");
            synchronized (connection) {
                if (connection.k().isEmpty()) {
                    it.remove();
                    connection.z();
                    socket = connection.A();
                } else {
                    socket = null;
                }
            }
            if (socket != null) {
                Ye.b.f(socket);
            }
        }
        if (this.f57147d.isEmpty()) {
            this.f57145b.a();
        }
    }

    public final void f(@NotNull j connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        byte[] bArr = Ye.b.f34900a;
        this.f57147d.add(connection);
        this.f57145b.j(this.f57146c, 0L);
    }
}
