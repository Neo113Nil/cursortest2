package pd;

import eg.m0;
import j$.time.LocalDateTime;
import j$.time.ZoneOffset;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class c0 extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public boolean f21743b;

    /* renamed from: c, reason: collision with root package name */
    public int f21744c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f21745d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.sports.insider.ui.activities.a f21746e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f21747f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(boolean z5, com.sports.insider.ui.activities.a aVar, long j, Continuation continuation) {
        super(2, continuation);
        this.f21745d = z5;
        this.f21746e = aVar;
        this.f21747f = j;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new c0(this.f21745d, this.f21746e, this.f21747f, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c0) create((eg.z) obj, (Continuation) obj2)).invokeSuspend(Unit.f19194a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0094, code lost:
    
        if (r11 == r0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0096, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x006f, code lost:
    
        if (r11 == r0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0057, code lost:
    
        if (r11 == r0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0046, code lost:
    
        if (eg.c0.A(r11, r1, r10) == r0) goto L32;
     */
    @Override // mf.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        boolean booleanValue;
        lf.a aVar = lf.a.f20034a;
        int i5 = this.f21744c;
        boolean z5 = this.f21745d;
        if (i5 == 0) {
            h8.b.B(obj);
            if (!z5) {
                lg.e eVar = m0.f9201a;
                lg.d dVar = lg.d.f20063c;
                b0 b0Var = new b0(this.f21747f, null);
                this.f21744c = 1;
            }
        } else if (i5 == 1) {
            h8.b.B(obj);
        } else {
            if (i5 != 2) {
                if (i5 != 3) {
                    if (i5 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    return Unit.f19194a;
                }
                booleanValue = this.f21743b;
                h8.b.B(obj);
                boolean areEqual = Intrinsics.areEqual(obj, Boolean.TRUE);
                com.sports.insider.ui.activities.a aVar2 = this.f21746e;
                if (areEqual) {
                    this.f21743b = booleanValue;
                    this.f21744c = 4;
                    int i10 = com.sports.insider.ui.activities.a.G;
                    lg.e eVar2 = m0.f9201a;
                    Object A = eg.c0.A(lg.d.f20063c, new f0(booleanValue, z5, aVar2, null), this);
                    if (A != aVar) {
                        A = Unit.f19194a;
                    }
                } else {
                    int i11 = com.sports.insider.ui.activities.a.G;
                    if (z5) {
                        aVar2.A();
                    } else if (booleanValue) {
                        LocalDateTime now = LocalDateTime.now();
                        ZoneOffset zoneOffset = ZoneOffset.UTC;
                        if (now.toEpochSecond(zoneOffset) > com.sports.insider.ui.activities.a.F) {
                            com.sports.insider.ui.activities.a.F = LocalDateTime.now().plusHours(1L).toEpochSecond(zoneOffset);
                            aVar2.A();
                        }
                    } else {
                        int i12 = com.sports.insider.ui.activities.a.G;
                        if (LocalDateTime.now().toEpochSecond(ZoneOffset.UTC) > com.sports.insider.ui.activities.a.E) {
                            z.a();
                            aVar2.A();
                        }
                    }
                }
                return Unit.f19194a;
            }
            h8.b.B(obj);
            booleanValue = ((Boolean) obj).booleanValue();
            this.f21743b = booleanValue;
            this.f21744c = 3;
            int i13 = com.sports.insider.ui.activities.a.G;
            obj = new zc.j().b(this);
        }
        int i14 = com.sports.insider.ui.activities.a.G;
        io.sentry.util.network.b bVar = new io.sentry.util.network.b(7);
        this.f21744c = 2;
        obj = bVar.i(this);
    }
}
