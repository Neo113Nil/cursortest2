package ve;

import android.content.Context;
import com.google.android.gms.internal.measurement.y3;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class p extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f24753b;

    /* renamed from: c, reason: collision with root package name */
    public int f24754c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f24755d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(Object obj, Continuation continuation, int i5) {
        super(2, continuation);
        this.f24753b = i5;
        this.f24755d = obj;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f24753b) {
            case 0:
                return new p((qe.a) this.f24755d, continuation, 0);
            case 1:
                return new p((qe.a) this.f24755d, continuation, 1);
            case 2:
                return new p((qe.a) this.f24755d, continuation, 2);
            case 3:
                return new p((me.d) this.f24755d, continuation, 3);
            case 4:
                return new p((me.d) this.f24755d, continuation, 4);
            case 5:
                return new p((me.d) this.f24755d, continuation, 5);
            case 6:
                return new p((me.d) this.f24755d, continuation, 6);
            case 7:
                return new p((qe.a) this.f24755d, continuation, 7);
            case 8:
                return new p((me.d) this.f24755d, continuation, 8);
            case 9:
                return new p((me.d) this.f24755d, continuation, 9);
            case 10:
                return new p((qe.a) this.f24755d, continuation, 10);
            case 11:
                return new p((qe.a) this.f24755d, continuation, 11);
            case 12:
                return new p((qe.b) this.f24755d, continuation, 12);
            case 13:
                return new p((qe.c) this.f24755d, continuation, 13);
            case 14:
                return new p((qe.a) this.f24755d, continuation, 14);
            case 15:
                return new p((s7.u) this.f24755d, continuation, 15);
            default:
                return new p((za.k) this.f24755d, continuation, 16);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        eg.z zVar = (eg.z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f24753b) {
        }
        return ((p) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f24753b) {
            case 0:
                lf.a aVar = lf.a.f20034a;
                int i5 = this.f24754c;
                if (i5 != 0) {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    return obj;
                }
                h8.b.B(obj);
                qe.a aVar2 = (qe.a) this.f24755d;
                this.f24754c = 1;
                Object invoke = aVar2.invoke(this);
                return invoke == aVar ? aVar : invoke;
            case 1:
                lf.a aVar3 = lf.a.f20034a;
                int i10 = this.f24754c;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    return obj;
                }
                h8.b.B(obj);
                qe.a aVar4 = (qe.a) this.f24755d;
                this.f24754c = 1;
                Object invoke2 = aVar4.invoke(this);
                return invoke2 == aVar3 ? aVar3 : invoke2;
            case 2:
                lf.a aVar5 = lf.a.f20034a;
                int i11 = this.f24754c;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    return obj;
                }
                h8.b.B(obj);
                qe.a aVar6 = (qe.a) this.f24755d;
                this.f24754c = 1;
                Object invoke3 = aVar6.invoke(this);
                return invoke3 == aVar5 ? aVar5 : invoke3;
            case 3:
                lf.a aVar7 = lf.a.f20034a;
                int i12 = this.f24754c;
                if (i12 != 0) {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    return obj;
                }
                h8.b.B(obj);
                me.d dVar = (me.d) this.f24755d;
                this.f24754c = 1;
                Object invoke4 = dVar.invoke(this);
                return invoke4 == aVar7 ? aVar7 : invoke4;
            case 4:
                lf.a aVar8 = lf.a.f20034a;
                int i13 = this.f24754c;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    return obj;
                }
                h8.b.B(obj);
                me.d dVar2 = (me.d) this.f24755d;
                this.f24754c = 1;
                Object invoke5 = dVar2.invoke(this);
                return invoke5 == aVar8 ? aVar8 : invoke5;
            case 5:
                lf.a aVar9 = lf.a.f20034a;
                int i14 = this.f24754c;
                if (i14 != 0) {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    return obj;
                }
                h8.b.B(obj);
                me.d dVar3 = (me.d) this.f24755d;
                this.f24754c = 1;
                Object invoke6 = dVar3.invoke(this);
                return invoke6 == aVar9 ? aVar9 : invoke6;
            case 6:
                lf.a aVar10 = lf.a.f20034a;
                int i15 = this.f24754c;
                if (i15 != 0) {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    return obj;
                }
                h8.b.B(obj);
                me.d dVar4 = (me.d) this.f24755d;
                this.f24754c = 1;
                Object invoke7 = dVar4.invoke(this);
                return invoke7 == aVar10 ? aVar10 : invoke7;
            case 7:
                lf.a aVar11 = lf.a.f20034a;
                int i16 = this.f24754c;
                if (i16 != 0) {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    return obj;
                }
                h8.b.B(obj);
                qe.a aVar12 = (qe.a) this.f24755d;
                this.f24754c = 1;
                Object invoke8 = aVar12.invoke(this);
                return invoke8 == aVar11 ? aVar11 : invoke8;
            case 8:
                lf.a aVar13 = lf.a.f20034a;
                int i17 = this.f24754c;
                if (i17 != 0) {
                    if (i17 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    return obj;
                }
                h8.b.B(obj);
                me.d dVar5 = (me.d) this.f24755d;
                this.f24754c = 1;
                Object invoke9 = dVar5.invoke(this);
                return invoke9 == aVar13 ? aVar13 : invoke9;
            case 9:
                lf.a aVar14 = lf.a.f20034a;
                int i18 = this.f24754c;
                if (i18 != 0) {
                    if (i18 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    return obj;
                }
                h8.b.B(obj);
                me.d dVar6 = (me.d) this.f24755d;
                this.f24754c = 1;
                Object invoke10 = dVar6.invoke(this);
                return invoke10 == aVar14 ? aVar14 : invoke10;
            case 10:
                lf.a aVar15 = lf.a.f20034a;
                int i19 = this.f24754c;
                if (i19 != 0) {
                    if (i19 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    return obj;
                }
                h8.b.B(obj);
                qe.a aVar16 = (qe.a) this.f24755d;
                this.f24754c = 1;
                Object invoke11 = aVar16.invoke(this);
                return invoke11 == aVar15 ? aVar15 : invoke11;
            case 11:
                lf.a aVar17 = lf.a.f20034a;
                int i20 = this.f24754c;
                if (i20 != 0) {
                    if (i20 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    return obj;
                }
                h8.b.B(obj);
                qe.a aVar18 = (qe.a) this.f24755d;
                this.f24754c = 1;
                Object invoke12 = aVar18.invoke(this);
                return invoke12 == aVar17 ? aVar17 : invoke12;
            case 12:
                lf.a aVar19 = lf.a.f20034a;
                int i21 = this.f24754c;
                if (i21 != 0) {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    return obj;
                }
                h8.b.B(obj);
                qe.b bVar = (qe.b) this.f24755d;
                this.f24754c = 1;
                Object invoke13 = bVar.invoke(this);
                return invoke13 == aVar19 ? aVar19 : invoke13;
            case 13:
                lf.a aVar20 = lf.a.f20034a;
                int i22 = this.f24754c;
                if (i22 != 0) {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    return obj;
                }
                h8.b.B(obj);
                qe.c cVar = (qe.c) this.f24755d;
                this.f24754c = 1;
                Object invoke14 = cVar.invoke(this);
                return invoke14 == aVar20 ? aVar20 : invoke14;
            case 14:
                lf.a aVar21 = lf.a.f20034a;
                int i23 = this.f24754c;
                if (i23 != 0) {
                    if (i23 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    return obj;
                }
                h8.b.B(obj);
                qe.a aVar22 = (qe.a) this.f24755d;
                this.f24754c = 1;
                Object invoke15 = aVar22.invoke(this);
                return invoke15 == aVar21 ? aVar21 : invoke15;
            case 15:
                lf.a aVar23 = lf.a.f20034a;
                int i24 = this.f24754c;
                if (i24 == 0) {
                    h8.b.B(obj);
                    pc.u uVar = (pc.u) y3.m(pc.u.class, null, 6);
                    this.f24754c = 1;
                    if (d9.e.c(uVar, this) == aVar23) {
                        return aVar23;
                    }
                } else {
                    if (i24 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return Unit.f19194a;
            default:
                lf.a aVar24 = lf.a.f20034a;
                int i25 = this.f24754c;
                Continuation continuation = null;
                try {
                    if (i25 == 0) {
                        h8.b.B(obj);
                        za.k kVar = (za.k) this.f24755d;
                        this.f24754c = 1;
                        ac.a a7 = za.k.a();
                        Context context = kVar.f25905a;
                        ((ac.d) a7).getClass();
                        obj = eg.c0.i(new ac.c(context, continuation, 0), this);
                        if (obj == aVar24) {
                            return aVar24;
                        }
                    } else {
                        if (i25 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h8.b.B(obj);
                    }
                    return (String) obj;
                } catch (Exception unused) {
                    return null;
                }
        }
    }
}
