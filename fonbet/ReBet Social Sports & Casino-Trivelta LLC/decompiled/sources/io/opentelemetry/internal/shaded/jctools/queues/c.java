package io.opentelemetry.internal.shaded.jctools.queues;

/* loaded from: classes3.dex */
public abstract class c {

    public interface a {
        int a();

        long b();

        long c();
    }

    public static boolean a(a aVar) {
        return aVar.c() >= aVar.b();
    }

    public static int b(int i10, long j10) {
        if (j10 < 0) {
            return 0;
        }
        if (i10 != -1 && j10 > i10) {
            return i10;
        }
        if (j10 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) j10;
    }

    public static int c(a aVar, int i10) {
        long c10 = aVar.c();
        while (true) {
            long b10 = aVar.b();
            long c11 = aVar.c();
            if (c10 == c11) {
                return b(aVar.a(), (b10 - c11) / i10);
            }
            c10 = c11;
        }
    }
}
