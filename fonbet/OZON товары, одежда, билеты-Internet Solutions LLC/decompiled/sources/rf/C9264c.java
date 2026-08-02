package rf;

import java.net.ProtocolException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import rf.n;

/* renamed from: rf.c, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C9264c implements n<Object> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Pair[] f83388a;

    C9264c(Pair[] pairArr) {
        this.f83388a = pairArr;
    }

    @Override // rf.n
    @NotNull
    public final j a(long j11, @NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return n.a.a(this, name, j11);
    }

    @Override // rf.n
    public final void b(@NotNull r writer, Object obj) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        for (Pair pair : this.f83388a) {
            kotlin.reflect.d dVar = (kotlin.reflect.d) pair.a();
            n nVar = (n) pair.b();
            if (dVar.A(obj) || (obj == null && dVar.equals(N.b(Unit.class)))) {
                if (nVar == null) {
                    throw new NullPointerException("null cannot be cast to non-null type okhttp3.tls.internal.der.DerAdapter<kotlin.Any?>");
                }
                nVar.b(writer, obj);
                return;
            }
        }
    }

    @Override // rf.n
    public final boolean c(@NotNull p header) {
        Intrinsics.checkNotNullParameter(header, "header");
        return true;
    }

    @Override // rf.n
    public final Object d(@NotNull q reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        p l11 = reader.l();
        if (l11 == null) {
            throw new ProtocolException("expected a value at " + reader);
        }
        for (Pair pair : this.f83388a) {
            n nVar = (n) pair.b();
            if (nVar.c(l11)) {
                return nVar.d(reader);
            }
        }
        throw new ProtocolException("expected any but was " + l11 + " at " + reader);
    }
}
