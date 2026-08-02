package kotlin.coroutines.jvm.internal;

import kotlin.jvm.internal.InterfaceC7733o;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public abstract class i extends h implements InterfaceC7733o<Object> {
    private final int arity;

    public i(int i11, kotlin.coroutines.d<Object> dVar) {
        super(dVar);
        this.arity = i11;
    }

    @Override // kotlin.jvm.internal.InterfaceC7733o
    public int getArity() {
        return this.arity;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        String j11 = N.j(this);
        Intrinsics.checkNotNullExpressionValue(j11, "renderLambdaToString(...)");
        return j11;
    }
}
