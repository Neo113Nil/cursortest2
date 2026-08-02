package X;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final C.a f13365a;

    /* renamed from: b, reason: collision with root package name */
    public final Function0 f13366b;

    public m(C.a vector, Function0 onVectorMutated) {
        Intrinsics.checkNotNullParameter(vector, "vector");
        Intrinsics.checkNotNullParameter(onVectorMutated, "onVectorMutated");
        this.f13365a = vector;
        this.f13366b = onVectorMutated;
    }

    public final C.a a() {
        return this.f13365a;
    }
}
