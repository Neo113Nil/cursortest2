package e2;

import com.google.common.collect.AbstractC3445z;
import e1.InterfaceC4148o;
import java.util.Objects;

/* loaded from: classes.dex */
public interface s {

    public interface a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f45617a = new C0659a();

        /* renamed from: e2.s$a$a, reason: collision with other inner class name */
        public class C0659a implements a {
            @Override // e2.s.a
            public boolean a(androidx.media3.common.a aVar) {
                return false;
            }

            @Override // e2.s.a
            public int b(androidx.media3.common.a aVar) {
                return 1;
            }

            @Override // e2.s.a
            public s c(androidx.media3.common.a aVar) {
                throw new IllegalStateException("This SubtitleParser.Factory doesn't support any formats.");
            }
        }

        boolean a(androidx.media3.common.a aVar);

        int b(androidx.media3.common.a aVar);

        s c(androidx.media3.common.a aVar);
    }

    public static class b {

        /* renamed from: c, reason: collision with root package name */
        public static final b f45618c = new b(-9223372036854775807L, false);

        /* renamed from: a, reason: collision with root package name */
        public final long f45619a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f45620b;

        public b(long j10, boolean z10) {
            this.f45619a = j10;
            this.f45620b = z10;
        }

        public static b b() {
            return f45618c;
        }

        public static b c(long j10) {
            return new b(j10, true);
        }
    }

    void a(byte[] bArr, int i10, int i11, b bVar, InterfaceC4148o interfaceC4148o);

    default InterfaceC4169k b(byte[] bArr, int i10, int i11) {
        final AbstractC3445z.a k10 = AbstractC3445z.k();
        b bVar = b.f45618c;
        Objects.requireNonNull(k10);
        a(bArr, i10, i11, bVar, new InterfaceC4148o() { // from class: e2.r
            @Override // e1.InterfaceC4148o
            public final void accept(Object obj) {
                AbstractC3445z.a.this.a((C4163e) obj);
            }
        });
        return new C4165g(k10.m());
    }

    int c();

    default void reset() {
    }
}
