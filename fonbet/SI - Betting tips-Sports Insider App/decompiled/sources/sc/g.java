package sc;

import eg.c0;
import eg.m0;
import eg.z;
import j$.time.Instant;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import rc.m;
import rc.r;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class g extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public long f23447b;

    /* renamed from: c, reason: collision with root package name */
    public long f23448c;

    /* renamed from: d, reason: collision with root package name */
    public int f23449d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h f23450e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, Continuation continuation) {
        super(2, continuation);
        this.f23450e = hVar;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new g(this.f23450e, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((z) obj, (Continuation) obj2)).invokeSuspend(Unit.f19194a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x003c, code lost:
    
        if (r10 == r0) goto L15;
     */
    @Override // mf.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        long j;
        long j6;
        lf.a aVar = lf.a.f20034a;
        int i5 = this.f23449d;
        h hVar = this.f23450e;
        boolean z5 = true;
        z5 = true;
        if (i5 == 0) {
            h8.b.B(obj);
            r b10 = hVar.b();
            this.f23449d = 1;
            b10.getClass();
            lg.e eVar = m0.f9201a;
            obj = c0.A(lg.d.f20063c, new m(b10, null, z5 ? 1 : 0), this);
        } else {
            if (i5 != 1) {
                if (i5 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j6 = this.f23448c;
                j = this.f23447b;
                h8.b.B(obj);
                if (((Boolean) obj).booleanValue() && j > j6) {
                    z5 = false;
                }
                return Boolean.valueOf(z5);
            }
            h8.b.B(obj);
        }
        long longValue = ((Number) obj).longValue();
        long epochSecond = Instant.now().getEpochSecond();
        this.f23447b = longValue;
        this.f23448c = epochSecond;
        this.f23449d = 2;
        obj = hVar.e(this);
        if (obj != aVar) {
            j = longValue;
            j6 = epochSecond;
            if (((Boolean) obj).booleanValue()) {
                z5 = false;
            }
            return Boolean.valueOf(z5);
        }
        return aVar;
    }
}
