package la;

import com.sports.insider.MyApp;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class n extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f19548b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f19549c;

    /* renamed from: d, reason: collision with root package name */
    public String f19550d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f19551e;

    /* renamed from: f, reason: collision with root package name */
    public int f19552f;

    /* renamed from: g, reason: collision with root package name */
    public Object f19553g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f19554h;

    /* renamed from: i, reason: collision with root package name */
    public Object f19555i;
    public final /* synthetic */ Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(List list, o oVar, String str, Continuation continuation) {
        super(2, continuation);
        this.j = list;
        this.f19554h = oVar;
        this.f19551e = str;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f19548b) {
            case 0:
                return new n((List) this.j, (o) this.f19554h, this.f19551e, continuation);
            default:
                return new n((md.d) this.f19554h, this.f19550d, this.f19551e, (String) this.f19555i, this.f19552f, (hg.m0) this.j, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        eg.z zVar = (eg.z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f19548b) {
        }
        return ((n) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        Iterator it;
        int i5;
        String str;
        o oVar;
        ye.a aVar;
        Object e7;
        gh.b0 b0Var;
        int i10 = this.f19548b;
        Object obj2 = this.j;
        Object obj3 = this.f19554h;
        String str2 = this.f19551e;
        switch (i10) {
            case 0:
                Object obj4 = lf.a.f20034a;
                int i11 = this.f19552f;
                if (i11 == 0) {
                    h8.b.B(obj);
                    it = ((List) obj2).iterator();
                    i5 = 0;
                    str = str2;
                    oVar = (o) obj3;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i5 = this.f19549c;
                    it = (Iterator) this.f19555i;
                    String str3 = this.f19550d;
                    oVar = (o) this.f19553g;
                    h8.b.B(obj);
                    str = str3;
                }
                while (it.hasNext()) {
                    nc.a aVar2 = (nc.a) it.next();
                    oVar.getClass();
                    fb.b bVar = new fb.b();
                    int id2 = aVar2.getId();
                    String name = aVar2.getName();
                    String logo = aVar2.getLogo();
                    this.f19553g = oVar;
                    this.f19550d = str;
                    this.f19555i = it;
                    this.f19549c = i5;
                    this.f19552f = 1;
                    lg.e eVar = eg.m0.f9201a;
                    Object A = eg.c0.A(lg.d.f20063c, new androidx.lifecycle.u0(bVar, id2, name, logo, str, (Continuation) null), this);
                    if (A != lf.a.f20034a) {
                        A = Unit.f19194a;
                    }
                    if (A == obj4) {
                        return obj4;
                    }
                }
                return Unit.f19194a;
            default:
                String str4 = this.f19550d;
                int i12 = this.f19552f;
                md.d dVar = (md.d) obj3;
                lf.a aVar3 = lf.a.f20034a;
                int i13 = this.f19549c;
                Continuation continuation = null;
                try {
                } catch (Exception e9) {
                    ex = e9;
                    j1 a7 = md.d.a();
                    this.f19553g = ex;
                    this.f19549c = 3;
                    a7.getClass();
                    if (j1.f(i12, -1, this) == aVar3) {
                        return aVar3;
                    }
                }
                if (i13 == 0) {
                    h8.b.B(obj);
                    File file = (str4 == null || str2 == null) ? null : new File(StringsKt.M(str4, "file:/"));
                    j1 a10 = md.d.a();
                    String str5 = (String) this.f19555i;
                    String name2 = file != null ? file.getName() : null;
                    if (file != null) {
                        if (str2 != null) {
                            Regex regex = gh.b0.f10117d;
                            b0Var = gh.a0.b(str2);
                        } else {
                            b0Var = null;
                        }
                        Integer num = new Integer(i12);
                        ic.f0 type = ic.f0.f11115a;
                        Intrinsics.checkNotNullParameter(file, "<this>");
                        Intrinsics.checkNotNullParameter(type, "type");
                        aVar = new ye.a(b0Var, file, (hg.m0) obj2, num);
                    } else {
                        aVar = null;
                    }
                    Boolean valueOf = Boolean.valueOf(Intrinsics.areEqual(str2, "application/json"));
                    this.f19553g = null;
                    this.f19549c = 1;
                    e7 = a10.e(str5, name2, aVar, valueOf, "1.2.44.123", 123, this);
                    if (e7 == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i13 != 1) {
                        if (i13 == 2) {
                            h8.b.B(obj);
                            return Unit.f19194a;
                        }
                        if (i13 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ex = (Exception) this.f19553g;
                        h8.b.B(obj);
                        Intrinsics.checkNotNullParameter(ex, "ex");
                        jg.d dVar2 = MyApp.f6830c;
                        lg.e eVar2 = eg.m0.f9201a;
                        eg.c0.t(dVar2, lg.d.f20063c, null, new q4.r(ex, continuation, 18), 2);
                        return Unit.f19194a;
                    }
                    h8.b.B(obj);
                    e7 = obj;
                }
                this.f19553g = null;
                this.f19549c = 2;
                if (dVar.b((ka.c) e7, i12, str4, this) == aVar3) {
                    return aVar3;
                }
                return Unit.f19194a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(md.d dVar, String str, String str2, String str3, int i5, hg.m0 m0Var, Continuation continuation) {
        super(2, continuation);
        this.f19554h = dVar;
        this.f19550d = str;
        this.f19551e = str2;
        this.f19555i = str3;
        this.f19552f = i5;
        this.j = m0Var;
    }
}
