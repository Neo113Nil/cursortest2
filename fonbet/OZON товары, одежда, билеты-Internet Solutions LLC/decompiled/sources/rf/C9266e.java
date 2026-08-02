package rf;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rf.n;
import sf.C9684j;

/* renamed from: rf.e, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C9266e implements n<Object> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ AbstractC7737t f83390a;

    /* JADX WARN: Multi-variable type inference failed */
    C9266e(Function1 function1) {
        this.f83390a = (AbstractC7737t) function1;
    }

    @Override // rf.n
    @NotNull
    public final j a(long j11, @NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return n.a.a(this, name, j11);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.t] */
    @Override // rf.n
    public final void b(@NotNull r writer, Object obj) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        n nVar = (n) this.f83390a.invoke(writer.a());
        if (nVar != null) {
            nVar.b(writer, obj);
        } else {
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type okio.ByteString");
            }
            writer.l((C9684j) obj);
        }
    }

    @Override // rf.n
    public final boolean c(@NotNull p header) {
        Intrinsics.checkNotNullParameter(header, "header");
        return true;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.t] */
    @Override // rf.n
    public final Object d(@NotNull q reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        n nVar = (n) this.f83390a.invoke(reader.k());
        return nVar != null ? nVar.d(reader) : reader.s();
    }
}
