package rf;

import java.net.ProtocolException;
import kotlin.Pair;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rf.n;

/* renamed from: rf.d, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C9265d implements n<Pair<? extends n<?>, ? extends Object>> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ n[] f83389a;

    C9265d(n[] nVarArr) {
        this.f83389a = nVarArr;
    }

    @Override // rf.n
    @NotNull
    public final j a(long j11, @NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return n.a.a(this, name, j11);
    }

    @Override // rf.n
    public final void b(r writer, Pair<? extends n<?>, ? extends Object> pair) {
        Pair<? extends n<?>, ? extends Object> value = pair;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(value, "value");
        n<?> a11 = value.a();
        Object b11 = value.b();
        if (a11 == null) {
            throw new NullPointerException("null cannot be cast to non-null type okhttp3.tls.internal.der.DerAdapter<kotlin.Any?>");
        }
        a11.b(writer, b11);
    }

    @Override // rf.n
    public final boolean c(@NotNull p header) {
        Intrinsics.checkNotNullParameter(header, "header");
        return true;
    }

    @Override // rf.n
    public final Pair<? extends n<?>, ? extends Object> d(q reader) {
        n nVar;
        Intrinsics.checkNotNullParameter(reader, "reader");
        p l11 = reader.l();
        if (l11 == null) {
            throw new ProtocolException("expected a value at " + reader);
        }
        n[] nVarArr = this.f83389a;
        int length = nVarArr.length;
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                nVar = null;
                break;
            }
            nVar = nVarArr[i11];
            if (nVar.c(l11)) {
                break;
            }
            i11++;
        }
        if (nVar != null) {
            return new Pair<>(nVar, nVar.d(reader));
        }
        throw new ProtocolException("expected a matching choice but was " + l11 + " at " + reader);
    }

    @NotNull
    public final String toString() {
        return C7705l.P(this.f83389a, " OR ", null, null, null, 62);
    }
}
