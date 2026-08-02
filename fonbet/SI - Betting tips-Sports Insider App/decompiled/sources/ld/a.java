package ld;

import eg.z;
import io.sentry.hints.j;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import mf.i;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a extends i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f19677b;

    /* renamed from: c, reason: collision with root package name */
    public int f19678c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j f19679d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(j jVar, Continuation continuation, int i5) {
        super(2, continuation);
        this.f19677b = i5;
        this.f19679d = jVar;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f19677b) {
            case 0:
                return new a(this.f19679d, continuation, 0);
            case 1:
                return new a(this.f19679d, continuation, 1);
            case 2:
                return new a(this.f19679d, continuation, 2);
            case 3:
                return new a(this.f19679d, continuation, 3);
            case 4:
                return new a(this.f19679d, continuation, 4);
            case 5:
                return new a(this.f19679d, continuation, 5);
            case 6:
                return new a(this.f19679d, continuation, 6);
            default:
                return new a(this.f19679d, continuation, 7);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        z zVar = (z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f19677b) {
        }
        return ((a) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        List list;
        List list2;
        List list3;
        List list4;
        List list5;
        List list6;
        List list7;
        switch (this.f19677b) {
            case 0:
                lf.a aVar = lf.a.f20034a;
                int i5 = this.f19678c;
                if (i5 == 0) {
                    h8.b.B(obj);
                    this.f19678c = 1;
                    obj = j.r(this.f19679d, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                ga.b bVar = (ga.b) obj;
                if (bVar == null || (list = bVar.f9918g) == null) {
                    return null;
                }
                return (ga.a) CollectionsKt.firstOrNull(CollectionsKt.D(list));
            case 1:
                lf.a aVar2 = lf.a.f20034a;
                int i10 = this.f19678c;
                if (i10 == 0) {
                    h8.b.B(obj);
                    this.f19678c = 1;
                    obj = j.r(this.f19679d, this);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                ga.b bVar2 = (ga.b) obj;
                if (bVar2 == null || (list2 = bVar2.f9915d) == null) {
                    return null;
                }
                return (ga.a) CollectionsKt.firstOrNull(CollectionsKt.D(list2));
            case 2:
                lf.a aVar3 = lf.a.f20034a;
                int i11 = this.f19678c;
                if (i11 == 0) {
                    h8.b.B(obj);
                    this.f19678c = 1;
                    obj = j.r(this.f19679d, this);
                    if (obj == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                ga.b bVar3 = (ga.b) obj;
                if (bVar3 == null || (list3 = bVar3.f9916e) == null) {
                    return null;
                }
                return (ga.a) CollectionsKt.firstOrNull(CollectionsKt.D(list3));
            case 3:
                lf.a aVar4 = lf.a.f20034a;
                int i12 = this.f19678c;
                if (i12 == 0) {
                    h8.b.B(obj);
                    this.f19678c = 1;
                    obj = j.r(this.f19679d, this);
                    if (obj == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                ga.b bVar4 = (ga.b) obj;
                if (bVar4 == null || (list4 = bVar4.f9913b) == null) {
                    return null;
                }
                return (ga.a) CollectionsKt.firstOrNull(CollectionsKt.D(list4));
            case 4:
                lf.a aVar5 = lf.a.f20034a;
                int i13 = this.f19678c;
                if (i13 == 0) {
                    h8.b.B(obj);
                    this.f19678c = 1;
                    obj = j.r(this.f19679d, this);
                    if (obj == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                ga.b bVar5 = (ga.b) obj;
                if (bVar5 == null || (list5 = bVar5.f9917f) == null) {
                    return null;
                }
                return (ga.a) CollectionsKt.firstOrNull(CollectionsKt.D(list5));
            case 5:
                lf.a aVar6 = lf.a.f20034a;
                int i14 = this.f19678c;
                if (i14 == 0) {
                    h8.b.B(obj);
                    this.f19678c = 1;
                    obj = j.r(this.f19679d, this);
                    if (obj == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                ga.b bVar6 = (ga.b) obj;
                if (bVar6 == null || (list6 = bVar6.f9912a) == null) {
                    return null;
                }
                return (ga.a) CollectionsKt.firstOrNull(CollectionsKt.D(list6));
            case 6:
                lf.a aVar7 = lf.a.f20034a;
                int i15 = this.f19678c;
                if (i15 == 0) {
                    h8.b.B(obj);
                    this.f19678c = 1;
                    obj = j.r(this.f19679d, this);
                    if (obj == aVar7) {
                        return aVar7;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                ga.b bVar7 = (ga.b) obj;
                if (bVar7 == null || (list7 = bVar7.f9914c) == null) {
                    return null;
                }
                return (ga.a) CollectionsKt.firstOrNull(CollectionsKt.D(list7));
            default:
                lf.a aVar8 = lf.a.f20034a;
                int i16 = this.f19678c;
                boolean z5 = false;
                try {
                    if (i16 == 0) {
                        h8.b.B(obj);
                        j jVar = this.f19679d;
                        this.f19678c = 1;
                        obj = jVar.D(this);
                        if (obj == aVar8) {
                            return aVar8;
                        }
                    } else {
                        if (i16 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h8.b.B(obj);
                    }
                    if (obj != null) {
                        z5 = true;
                    }
                } catch (Exception unused) {
                }
                return Boolean.valueOf(z5);
        }
    }
}
