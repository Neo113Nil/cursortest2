package hi0;

import Sc.s;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.time.b;
import xe.M;
import xe.N;
import xe.Y;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.tracker.coroutines.CoroutinesKt$repeatByInterval$1", f = "Coroutines.kt", l = {61, 62}, m = "invokeSuspend")
/* loaded from: classes7.dex */
final class e extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f65552d;

    /* renamed from: e, reason: collision with root package name */
    private /* synthetic */ Object f65553e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ long f65554f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ Function2<M, kotlin.coroutines.d<? super Unit>, Object> f65555g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    e(long j11, Function2<? super M, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, kotlin.coroutines.d<? super e> dVar) {
        super(2, dVar);
        this.f65554f = j11;
        this.f65555g = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        e eVar = new e(this.f65554f, this.f65555g, dVar);
        eVar.f65553e = obj;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((e) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x005e, code lost:
    
        if (((hi0.b.a.C1069a.C1070a) r8.f65555g).invoke(r1, r8) != r0) goto L7;
     */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0051  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x005e -> B:6:0x0015). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        M m11;
        M m12;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f65552d;
        long j11 = this.f65554f;
        if (i11 == 0) {
            s.b(obj);
            m11 = (M) this.f65553e;
            b.Companion companion = kotlin.time.b.INSTANCE;
            if (j11 < 0) {
                N.c(m11, new CancellationException("Interval is negative"));
                return Unit.f71690a;
            }
            N.e(m11);
            this.f65553e = m11;
            this.f65552d = 1;
            if (Y.c(j11, this) != aVar) {
            }
            return aVar;
        }
        if (i11 != 1) {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            m12 = (M) this.f65553e;
            s.b(obj);
            m11 = m12;
            N.e(m11);
            this.f65553e = m11;
            this.f65552d = 1;
            if (Y.c(j11, this) != aVar) {
                m12 = m11;
                this.f65553e = m12;
                this.f65552d = 2;
            }
            return aVar;
        }
        m12 = (M) this.f65553e;
        s.b(obj);
        this.f65553e = m12;
        this.f65552d = 2;
    }
}
