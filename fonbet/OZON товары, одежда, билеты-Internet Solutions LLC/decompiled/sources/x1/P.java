package x1;

import Sc.r;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import x1.S;
import xe.C10737n;
import xe.InterfaceC10733l;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$job$1", f = "SuspendingPointerInputFilter.kt", l = {774, 775}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class P extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f104840d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ long f104841e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ S.a<Object> f104842f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    P(long j11, S.a<Object> aVar, kotlin.coroutines.d<? super P> dVar) {
        super(2, dVar);
        this.f104841e = j11;
        this.f104842f = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
        return new P(this.f104841e, this.f104842f, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((P) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0034, code lost:
    
        if (xe.Y.b(1, r10) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0036, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002b, code lost:
    
        if (xe.Y.b(r4 - 1, r10) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(@NotNull Object obj) {
        InterfaceC10733l interfaceC10733l;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f104840d;
        long j11 = this.f104841e;
        if (i11 == 0) {
            Sc.s.b(obj);
            this.f104840d = 1;
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
                interfaceC10733l = ((S.a) this.f104842f).f104858c;
                if (interfaceC10733l != null) {
                    r.Companion companion = Sc.r.INSTANCE;
                    ((C10737n) interfaceC10733l).resumeWith(Sc.s.a(new C10641p(j11)));
                }
                return Unit.f71690a;
            }
            Sc.s.b(obj);
        }
        this.f104840d = 2;
    }
}
