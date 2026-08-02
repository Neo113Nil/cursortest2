package kotlin.sequences;

import java.util.Iterator;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class m implements Sequence<Object> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ kotlin.coroutines.jvm.internal.i f71931a;

    /* JADX WARN: Multi-variable type inference failed */
    public m(Function2 function2) {
        this.f71931a = (kotlin.coroutines.jvm.internal.i) function2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.coroutines.jvm.internal.i, kotlin.jvm.functions.Function2] */
    @Override // kotlin.sequences.Sequence
    public final Iterator<Object> iterator() {
        return l.s(this.f71931a);
    }
}
