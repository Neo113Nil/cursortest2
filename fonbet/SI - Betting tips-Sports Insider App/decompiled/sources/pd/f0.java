package pd;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class f0 extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f21763b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f21764c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f21765d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.sports.insider.ui.activities.a f21766e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(boolean z5, boolean z7, com.sports.insider.ui.activities.a aVar, Continuation continuation) {
        super(2, continuation);
        this.f21764c = z5;
        this.f21765d = z7;
        this.f21766e = aVar;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        f0 f0Var = new f0(this.f21764c, this.f21765d, this.f21766e, continuation);
        f0Var.f21763b = obj;
        return f0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((f0) create((eg.z) obj, (Continuation) obj2)).invokeSuspend(Unit.f19194a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001d, code lost:
    
        if (j$.time.LocalDateTime.now().toEpochSecond(j$.time.ZoneOffset.UTC) > com.sports.insider.ui.activities.a.E) goto L6;
     */
    @Override // mf.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        eg.z zVar = (eg.z) this.f21763b;
        lf.a aVar = lf.a.f20034a;
        h8.b.B(obj);
        boolean z5 = this.f21765d;
        if (!z5) {
            int i5 = com.sports.insider.ui.activities.a.G;
        }
        com.sports.insider.ui.activities.a aVar2 = this.f21766e;
        w7.m b10 = ((com.google.android.play.core.appupdate.e) aVar2.B.getValue()).b();
        io.sentry.android.core.internal.gestures.c cVar = new io.sentry.android.core.internal.gestures.c(17, new d0(this.f21764c ? 1 : 0, aVar2, zVar, z5));
        b10.getClass();
        b10.e(w7.h.f24980a, cVar);
        b10.d(new com.google.firebase.messaging.v(z5, aVar2));
        return Unit.f19194a;
    }
}
