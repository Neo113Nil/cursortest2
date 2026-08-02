package ie;

import ie.C7056e;
import kotlin.collections.K;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* renamed from: ie.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C7057f extends C7056e.i<Object> {

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ K f66278d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C7057f(C7056e c7056e, Function0 function0, K k11) {
        super(c7056e, function0);
        this.f66278d = k11;
    }

    @Override // ie.C7056e.g
    @NotNull
    protected final C7056e.n<Object> c(boolean z11) {
        return C7056e.n.d(this.f66278d);
    }
}
