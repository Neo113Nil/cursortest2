package rc;

import com.google.android.gms.internal.measurement.y3;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class p extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f22432b;

    /* renamed from: c, reason: collision with root package name */
    public int f22433c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f22434d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r f22435e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(String str, r rVar, Continuation continuation, int i5) {
        super(2, continuation);
        this.f22432b = i5;
        this.f22434d = str;
        this.f22435e = rVar;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f22432b) {
            case 0:
                return new p(this.f22434d, this.f22435e, continuation, 0);
            default:
                return new p(this.f22434d, this.f22435e, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        eg.z zVar = (eg.z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f22432b) {
        }
        return ((p) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    @Override // mf.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        boolean booleanValue;
        boolean booleanValue2;
        switch (this.f22432b) {
            case 0:
                lf.a aVar = lf.a.f20034a;
                int i5 = this.f22433c;
                if (i5 == 0) {
                    h8.b.B(obj);
                    if (Intrinsics.areEqual(this.f22434d, zc.f.f25915f.getLanguage())) {
                        this.f22433c = 1;
                        if (((yb.m) y3.m(yb.m.class, null, 6)).d("passed_live_en", this) == aVar) {
                            return aVar;
                        }
                        this.f22433c = 2;
                        obj = ((yb.m) y3.m(yb.m.class, null, 6)).d("passed_live_ru", this);
                        if (obj == aVar) {
                        }
                        booleanValue = ((Boolean) obj).booleanValue();
                    } else {
                        this.f22433c = 3;
                        if (((yb.m) y3.m(yb.m.class, null, 6)).d("passed_live_ru", this) == aVar) {
                            return aVar;
                        }
                        this.f22433c = 4;
                        obj = ((yb.m) y3.m(yb.m.class, null, 6)).d("passed_live_en", this);
                        if (obj == aVar) {
                        }
                        booleanValue = ((Boolean) obj).booleanValue();
                    }
                } else if (i5 == 1) {
                    h8.b.B(obj);
                    this.f22433c = 2;
                    obj = ((yb.m) y3.m(yb.m.class, null, 6)).d("passed_live_ru", this);
                    if (obj == aVar) {
                        return aVar;
                    }
                    booleanValue = ((Boolean) obj).booleanValue();
                } else if (i5 == 2) {
                    h8.b.B(obj);
                    booleanValue = ((Boolean) obj).booleanValue();
                } else if (i5 == 3) {
                    h8.b.B(obj);
                    this.f22433c = 4;
                    obj = ((yb.m) y3.m(yb.m.class, null, 6)).d("passed_live_en", this);
                    if (obj == aVar) {
                        return aVar;
                    }
                    booleanValue = ((Boolean) obj).booleanValue();
                } else {
                    if (i5 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    booleanValue = ((Boolean) obj).booleanValue();
                }
                return Boolean.valueOf(booleanValue);
            default:
                lf.a aVar2 = lf.a.f20034a;
                int i10 = this.f22433c;
                if (i10 == 0) {
                    h8.b.B(obj);
                    if (Intrinsics.areEqual(this.f22434d, zc.f.f25915f.getLanguage())) {
                        io.sentry.hints.j jVar = new io.sentry.hints.j(25);
                        this.f22433c = 1;
                        obj = jVar.F("passed_live_ru", "passed_live_en", this);
                        if (obj == aVar2) {
                            return aVar2;
                        }
                        booleanValue2 = ((Boolean) obj).booleanValue();
                    } else {
                        io.sentry.hints.j jVar2 = new io.sentry.hints.j(25);
                        this.f22433c = 2;
                        obj = jVar2.F("passed_live_en", "passed_live_ru", this);
                        if (obj == aVar2) {
                            return aVar2;
                        }
                        booleanValue2 = ((Boolean) obj).booleanValue();
                    }
                } else if (i10 == 1) {
                    h8.b.B(obj);
                    booleanValue2 = ((Boolean) obj).booleanValue();
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    booleanValue2 = ((Boolean) obj).booleanValue();
                }
                return Boolean.valueOf(booleanValue2);
        }
    }
}
