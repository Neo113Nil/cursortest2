package io.sentry.rrweb;

import io.sentry.C7212v0;
import io.sentry.ILogger;
import io.sentry.InterfaceC7131c1;
import io.sentry.rrweb.c;
import io.sentry.util.p;
import java.io.IOException;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private c f68420a;

    /* renamed from: b, reason: collision with root package name */
    private long f68421b;

    /* loaded from: classes10.dex */
    public static final class a {
        public static boolean a(@NotNull b bVar, @NotNull String str, @NotNull InterfaceC7131c1 interfaceC7131c1, @NotNull ILogger iLogger) throws Exception {
            if (str.equals("type")) {
                c cVar = (c) interfaceC7131c1.S(iLogger, new c.a());
                p.b(cVar, "");
                bVar.f68420a = cVar;
                return true;
            }
            if (!str.equals("timestamp")) {
                return false;
            }
            bVar.f68421b = interfaceC7131c1.nextLong();
            return true;
        }
    }

    /* renamed from: io.sentry.rrweb.b$b, reason: collision with other inner class name */
    /* loaded from: classes10.dex */
    public static final class C1119b {
        public static void a(@NotNull b bVar, @NotNull C7212v0 c7212v0, @NotNull ILogger iLogger) throws IOException {
            c7212v0.g("type");
            c7212v0.m(iLogger, bVar.f68420a);
            c7212v0.g("timestamp");
            c7212v0.l(bVar.f68421b);
        }
    }

    protected b(@NotNull c cVar) {
        this.f68420a = cVar;
        this.f68421b = System.currentTimeMillis();
    }

    public final long e() {
        return this.f68421b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f68421b == bVar.f68421b && this.f68420a == bVar.f68420a;
    }

    public final void f(long j11) {
        this.f68421b = j11;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f68420a, Long.valueOf(this.f68421b)});
    }

    protected b() {
        this(c.Custom);
    }
}
