package la;

import com.google.android.gms.internal.measurement.y3;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class k extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f19526b;

    /* renamed from: c, reason: collision with root package name */
    public m f19527c;

    /* renamed from: d, reason: collision with root package name */
    public int f19528d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m f19529e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(m mVar, Continuation continuation, int i5) {
        super(2, continuation);
        this.f19526b = i5;
        this.f19529e = mVar;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f19526b) {
            case 0:
                return new k(this.f19529e, continuation, 0);
            case 1:
                return new k(this.f19529e, continuation, 1);
            default:
                return new k(this.f19529e, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        eg.z zVar = (eg.z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f19526b) {
        }
        return ((k) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        m mVar;
        m mVar2;
        m mVar3;
        switch (this.f19526b) {
            case 0:
                lf.a aVar = lf.a.f20034a;
                int i5 = this.f19528d;
                String str = null;
                try {
                    if (i5 == 0) {
                        h8.b.B(obj);
                        m mVar4 = this.f19529e;
                        mVar4.getClass();
                        za.b bVar = (za.b) y3.m(za.b.class, null, 6);
                        this.f19527c = mVar4;
                        this.f19528d = 1;
                        Object a7 = bVar.a(500L, 86400000L, this);
                        if (a7 == aVar) {
                            return aVar;
                        }
                        mVar = mVar4;
                        obj = a7;
                    } else {
                        if (i5 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        mVar = this.f19527c;
                        h8.b.B(obj);
                    }
                    String str2 = (String) obj;
                    if (str2 != null) {
                        if (str2.length() == 0) {
                            str2 = null;
                        }
                        if (str2 != null && !StringsKt.H(str2)) {
                            str = str2;
                        }
                    }
                    mVar.f19544a = str;
                } catch (Exception unused) {
                }
                return Unit.f19194a;
            case 1:
                lf.a aVar2 = lf.a.f20034a;
                int i10 = this.f19528d;
                String str3 = null;
                try {
                    if (i10 == 0) {
                        h8.b.B(obj);
                        m mVar5 = this.f19529e;
                        mVar5.getClass();
                        za.k kVar = (za.k) y3.m(za.k.class, null, 6);
                        this.f19527c = mVar5;
                        this.f19528d = 1;
                        Object b10 = kVar.b(500L, this);
                        if (b10 == aVar2) {
                            return aVar2;
                        }
                        mVar2 = mVar5;
                        obj = b10;
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        mVar2 = this.f19527c;
                        h8.b.B(obj);
                    }
                    String str4 = (String) obj;
                    if (str4 != null) {
                        if (str4.length() == 0) {
                            str4 = null;
                        }
                        if (str4 != null && !StringsKt.H(str4)) {
                            str3 = str4;
                        }
                    }
                    mVar2.f19546c = str3;
                } catch (Exception unused2) {
                }
                return Unit.f19194a;
            default:
                lf.a aVar3 = lf.a.f20034a;
                int i11 = this.f19528d;
                String str5 = null;
                try {
                    if (i11 == 0) {
                        h8.b.B(obj);
                        m mVar6 = this.f19529e;
                        mVar6.getClass();
                        za.e eVar = (za.e) y3.m(za.e.class, null, 6);
                        this.f19527c = mVar6;
                        this.f19528d = 1;
                        Object b11 = eVar.b(500L, this);
                        if (b11 == aVar3) {
                            return aVar3;
                        }
                        mVar3 = mVar6;
                        obj = b11;
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        mVar3 = this.f19527c;
                        h8.b.B(obj);
                    }
                    String str6 = (String) obj;
                    if (str6 != null) {
                        if (str6.length() == 0) {
                            str6 = null;
                        }
                        if (str6 != null && !StringsKt.H(str6)) {
                            str5 = str6;
                        }
                    }
                    mVar3.f19545b = str5;
                } catch (Exception unused3) {
                }
                return Unit.f19194a;
        }
    }
}
