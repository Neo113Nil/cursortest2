package p5;

import java.nio.ByteBuffer;
import n5.EnumC8444d;
import n5.q;
import org.jetbrains.annotations.NotNull;
import p5.h;
import sf.C9681g;
import v5.C10239m;

/* renamed from: p5.c, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C8858c implements h {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ByteBuffer f80216a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C10239m f80217b;

    /* renamed from: p5.c$a */
    public static final class a implements h.a<ByteBuffer> {
        @Override // p5.h.a
        public final h a(Object obj, C10239m c10239m) {
            return new C8858c((ByteBuffer) obj, c10239m);
        }
    }

    public C8858c(@NotNull ByteBuffer byteBuffer, @NotNull C10239m c10239m) {
        this.f80216a = byteBuffer;
        this.f80217b = c10239m;
    }

    @Override // p5.h
    public final Object a(@NotNull kotlin.coroutines.d<? super g> dVar) {
        ByteBuffer byteBuffer = this.f80216a;
        try {
            C9681g c9681g = new C9681g();
            c9681g.write(byteBuffer);
            byteBuffer.position(0);
            return new m(q.a(c9681g, this.f80217b.f()), null, EnumC8444d.MEMORY);
        } catch (Throwable th2) {
            byteBuffer.position(0);
            throw th2;
        }
    }
}
