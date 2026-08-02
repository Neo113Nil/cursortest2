package mf;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.FunctionBase;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class i extends c implements FunctionBase {

    /* renamed from: a, reason: collision with root package name */
    public final int f20707a;

    public i(int i5, Continuation continuation) {
        super(continuation);
        this.f20707a = i5;
    }

    @Override // kotlin.jvm.internal.FunctionBase
    public final int getArity() {
        return this.f20707a;
    }

    @Override // mf.a
    public final String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        String renderLambdaToString = Reflection.renderLambdaToString(this);
        Intrinsics.checkNotNullExpressionValue(renderLambdaToString, "renderLambdaToString(...)");
        return renderLambdaToString;
    }
}
