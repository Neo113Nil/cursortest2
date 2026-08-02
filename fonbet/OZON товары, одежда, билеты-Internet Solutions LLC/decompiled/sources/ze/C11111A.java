package ze;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@kotlin.coroutines.jvm.internal.e(c = "kotlinx.coroutines.channels.TickerChannelsKt$ticker$3", f = "TickerChannels.kt", l = {68, 69}, m = "invokeSuspend")
/* renamed from: ze.A, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C11111A extends kotlin.coroutines.jvm.internal.j implements Function2<u<? super Unit>, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f108892d;

    /* renamed from: e, reason: collision with root package name */
    private /* synthetic */ Object f108893e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C f108894f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ long f108895g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ long f108896h;

    /* renamed from: ze.A$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f108897a;

        static {
            int[] iArr = new int[C.values().length];
            try {
                iArr[C.FIXED_PERIOD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[C.FIXED_DELAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f108897a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C11111A(C c11, long j11, long j12, kotlin.coroutines.d<? super C11111A> dVar) {
        super(2, dVar);
        this.f108894f = c11;
        this.f108895g = j11;
        this.f108896h = j12;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        C11111A c11111a = new C11111A(this.f108894f, this.f108895g, this.f108896h, dVar);
        c11111a.f108893e = obj;
        return c11111a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(u<? super Unit> uVar, kotlin.coroutines.d<? super Unit> dVar) {
        return ((C11111A) create(uVar, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0042, code lost:
    
        if (ze.C11112B.a(r10.f108895g, r10.f108896h, r8, r10) == r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005d, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005b, code lost:
    
        if (ze.C11112B.b(r10.f108895g, r10.f108896h, r5, r10) == r0) goto L20;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f108892d;
        if (i11 == 0) {
            Sc.s.b(obj);
            u uVar = (u) this.f108893e;
            int i12 = a.f108897a[this.f108894f.ordinal()];
            if (i12 == 1) {
                x k11 = uVar.k();
                this.f108892d = 1;
            } else {
                if (i12 != 2) {
                    throw new Sc.o();
                }
                x k12 = uVar.k();
                this.f108892d = 2;
            }
        } else if (i11 == 1) {
            Sc.s.b(obj);
        } else {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Sc.s.b(obj);
        }
        return Unit.f71690a;
    }
}
