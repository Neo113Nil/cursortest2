package k4;

import com.google.common.collect.AbstractC5880y;
import j3.C7272n;
import m3.InterfaceC8068j;

/* loaded from: classes8.dex */
public interface o {

    /* loaded from: classes.dex */
    public interface a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f70474a = new C1154a();

        /* renamed from: k4.o$a$a, reason: collision with other inner class name */
        /* loaded from: classes8.dex */
        final class C1154a implements a {
            C1154a() {
            }

            @Override // k4.o.a
            public final int a(C7272n c7272n) {
                return 1;
            }

            @Override // k4.o.a
            public final o b(C7272n c7272n) {
                throw new IllegalStateException("This SubtitleParser.Factory doesn't support any formats.");
            }

            @Override // k4.o.a
            public final boolean e(C7272n c7272n) {
                return false;
            }
        }

        int a(C7272n c7272n);

        o b(C7272n c7272n);

        boolean e(C7272n c7272n);
    }

    public static class b {

        /* renamed from: c, reason: collision with root package name */
        private static final b f70475c = new b(-9223372036854775807L, false);

        /* renamed from: a, reason: collision with root package name */
        public final long f70476a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f70477b;

        private b(long j11, boolean z11) {
            this.f70476a = j11;
            this.f70477b = z11;
        }

        public static b b() {
            return f70475c;
        }

        public static b c(long j11) {
            return new b(j11, true);
        }
    }

    void a(byte[] bArr, int i11, int i12, b bVar, InterfaceC8068j<c> interfaceC8068j);

    default i b(int i11, int i12, byte[] bArr) {
        int i13 = AbstractC5880y.f59142c;
        AbstractC5880y.a aVar = new AbstractC5880y.a();
        a(bArr, 0, i12, b.f70475c, new C90.c(aVar));
        return new d(aVar.j());
    }

    default void reset() {
    }
}
