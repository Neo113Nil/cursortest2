package androidx.lifecycle;

import Ph.InterfaceC1465n;
import androidx.lifecycle.AbstractC2185j;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"androidx/lifecycle/WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1", "Landroidx/lifecycle/p;", "Landroidx/lifecycle/s;", "source", "Landroidx/lifecycle/j$a;", "event", "", "k", "(Landroidx/lifecycle/s;Landroidx/lifecycle/j$a;)V", "lifecycle-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 implements InterfaceC2191p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC2185j.b f20368a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractC2185j f20369b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1465n f20370c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Function0 f20371d;

    @Override // androidx.lifecycle.InterfaceC2191p
    public void k(InterfaceC2193s source, AbstractC2185j.a event) {
        Object m147constructorimpl;
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event != AbstractC2185j.a.Companion.c(this.f20368a)) {
            if (event == AbstractC2185j.a.ON_DESTROY) {
                this.f20369b.d(this);
                InterfaceC1465n interfaceC1465n = this.f20370c;
                Result.Companion companion = Result.INSTANCE;
                interfaceC1465n.resumeWith(Result.m147constructorimpl(ResultKt.createFailure(new C2189n())));
                return;
            }
            return;
        }
        this.f20369b.d(this);
        InterfaceC1465n interfaceC1465n2 = this.f20370c;
        Function0 function0 = this.f20371d;
        try {
            Result.Companion companion2 = Result.INSTANCE;
            m147constructorimpl = Result.m147constructorimpl(function0.invoke());
        } catch (Throwable th2) {
            Result.Companion companion3 = Result.INSTANCE;
            m147constructorimpl = Result.m147constructorimpl(ResultKt.createFailure(th2));
        }
        interfaceC1465n2.resumeWith(m147constructorimpl);
    }
}
