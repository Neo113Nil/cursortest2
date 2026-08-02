package ge;

import com.sports.insider.MyApp;
import eg.c0;
import eg.m0;
import eg.y;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class o extends mf.i implements vf.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f9984b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Throwable f9985c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(int i5, Continuation continuation, int i10) {
        super(i5, continuation);
        this.f9984b = i10;
    }

    @Override // vf.a
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Throwable th2 = (Throwable) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.f9984b) {
            case 0:
                o oVar = new o(3, continuation, 0);
                oVar.f9985c = th2;
                return oVar.invokeSuspend(Unit.f19194a);
            case 1:
                o oVar2 = new o(3, continuation, 1);
                oVar2.f9985c = th2;
                return oVar2.invokeSuspend(Unit.f19194a);
            case 2:
                o oVar3 = new o(3, continuation, 2);
                oVar3.f9985c = th2;
                return oVar3.invokeSuspend(Unit.f19194a);
            case 3:
                o oVar4 = new o(3, continuation, 3);
                oVar4.f9985c = th2;
                return oVar4.invokeSuspend(Unit.f19194a);
            case 4:
                o oVar5 = new o(3, continuation, 4);
                oVar5.f9985c = th2;
                return oVar5.invokeSuspend(Unit.f19194a);
            case 5:
                o oVar6 = new o(3, continuation, 5);
                oVar6.f9985c = th2;
                return oVar6.invokeSuspend(Unit.f19194a);
            case 6:
                o oVar7 = new o(3, continuation, 6);
                oVar7.f9985c = th2;
                return oVar7.invokeSuspend(Unit.f19194a);
            case 7:
                o oVar8 = new o(3, continuation, 7);
                oVar8.f9985c = th2;
                return oVar8.invokeSuspend(Unit.f19194a);
            case 8:
                o oVar9 = new o(3, continuation, 8);
                oVar9.f9985c = th2;
                return oVar9.invokeSuspend(Unit.f19194a);
            case 9:
                o oVar10 = new o(3, continuation, 9);
                oVar10.f9985c = th2;
                return oVar10.invokeSuspend(Unit.f19194a);
            case 10:
                o oVar11 = new o(3, continuation, 10);
                oVar11.f9985c = th2;
                return oVar11.invokeSuspend(Unit.f19194a);
            case 11:
                o oVar12 = new o(3, continuation, 11);
                oVar12.f9985c = th2;
                return oVar12.invokeSuspend(Unit.f19194a);
            case 12:
                o oVar13 = new o(3, continuation, 12);
                oVar13.f9985c = th2;
                return oVar13.invokeSuspend(Unit.f19194a);
            case 13:
                o oVar14 = new o(3, continuation, 13);
                oVar14.f9985c = th2;
                return oVar14.invokeSuspend(Unit.f19194a);
            case 14:
                o oVar15 = new o(3, continuation, 14);
                oVar15.f9985c = th2;
                return oVar15.invokeSuspend(Unit.f19194a);
            case 15:
                o oVar16 = new o(3, continuation, 15);
                oVar16.f9985c = th2;
                return oVar16.invokeSuspend(Unit.f19194a);
            case 16:
                o oVar17 = new o(3, continuation, 16);
                oVar17.f9985c = th2;
                return oVar17.invokeSuspend(Unit.f19194a);
            case 17:
                o oVar18 = new o(3, continuation, 17);
                oVar18.f9985c = th2;
                return oVar18.invokeSuspend(Unit.f19194a);
            case 18:
                o oVar19 = new o(3, continuation, 18);
                oVar19.f9985c = th2;
                return oVar19.invokeSuspend(Unit.f19194a);
            case 19:
                o oVar20 = new o(3, continuation, 19);
                oVar20.f9985c = th2;
                return oVar20.invokeSuspend(Unit.f19194a);
            case 20:
                o oVar21 = new o(3, continuation, 20);
                oVar21.f9985c = th2;
                return oVar21.invokeSuspend(Unit.f19194a);
            case 21:
                o oVar22 = new o(3, continuation, 21);
                oVar22.f9985c = th2;
                return oVar22.invokeSuspend(Unit.f19194a);
            default:
                o oVar23 = new o(3, continuation, 22);
                oVar23.f9985c = th2;
                return oVar23.invokeSuspend(Unit.f19194a);
        }
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f9984b) {
            case 0:
                Throwable th2 = this.f9985c;
                lf.a aVar = lf.a.f20034a;
                h8.b.B(obj);
                zc.d.b(4, "lvmFlow", th2);
                break;
            case 1:
                Throwable ex = this.f9985c;
                lf.a aVar2 = lf.a.f20034a;
                h8.b.B(obj);
                Intrinsics.checkNotNullParameter(ex, "ex");
                jg.d dVar = MyApp.f6830c;
                lg.e eVar = m0.f9201a;
                c0.t(dVar, lg.d.f20063c, null, new q4.r(ex, null, 18), 2);
                break;
            case 2:
                Throwable ex2 = this.f9985c;
                lf.a aVar3 = lf.a.f20034a;
                h8.b.B(obj);
                Intrinsics.checkNotNullParameter(ex2, "ex");
                jg.d dVar2 = MyApp.f6830c;
                lg.e eVar2 = m0.f9201a;
                c0.t(dVar2, lg.d.f20063c, null, new q4.r(ex2, null, 18), 2);
                break;
            case 3:
                Throwable ex3 = this.f9985c;
                lf.a aVar4 = lf.a.f20034a;
                h8.b.B(obj);
                Intrinsics.checkNotNullParameter(ex3, "ex");
                jg.d dVar3 = MyApp.f6830c;
                lg.e eVar3 = m0.f9201a;
                c0.t(dVar3, lg.d.f20063c, null, new q4.r(ex3, null, 18), 2);
                break;
            case 4:
                Throwable ex4 = this.f9985c;
                lf.a aVar5 = lf.a.f20034a;
                h8.b.B(obj);
                Intrinsics.checkNotNullParameter(ex4, "ex");
                jg.d dVar4 = MyApp.f6830c;
                lg.e eVar4 = m0.f9201a;
                c0.t(dVar4, lg.d.f20063c, null, new q4.r(ex4, null, 18), 2);
                break;
            case 5:
                Throwable ex5 = this.f9985c;
                lf.a aVar6 = lf.a.f20034a;
                h8.b.B(obj);
                Intrinsics.checkNotNullParameter(ex5, "ex");
                jg.d dVar5 = MyApp.f6830c;
                lg.e eVar5 = m0.f9201a;
                c0.t(dVar5, lg.d.f20063c, null, new q4.r(ex5, null, 18), 2);
                break;
            case 6:
                Throwable ex6 = this.f9985c;
                lf.a aVar7 = lf.a.f20034a;
                h8.b.B(obj);
                Intrinsics.checkNotNullParameter(ex6, "ex");
                jg.d dVar6 = MyApp.f6830c;
                lg.e eVar6 = m0.f9201a;
                c0.t(dVar6, lg.d.f20063c, null, new q4.r(ex6, null, 18), 2);
                break;
            case 7:
                Throwable ex7 = this.f9985c;
                lf.a aVar8 = lf.a.f20034a;
                h8.b.B(obj);
                Intrinsics.checkNotNullParameter(ex7, "ex");
                jg.d dVar7 = MyApp.f6830c;
                lg.e eVar7 = m0.f9201a;
                c0.t(dVar7, lg.d.f20063c, null, new q4.r(ex7, null, 18), 2);
                break;
            case 8:
                Throwable ex8 = this.f9985c;
                lf.a aVar9 = lf.a.f20034a;
                h8.b.B(obj);
                Intrinsics.checkNotNullParameter(ex8, "ex");
                jg.d dVar8 = MyApp.f6830c;
                lg.e eVar8 = m0.f9201a;
                c0.t(dVar8, lg.d.f20063c, null, new q4.r(ex8, null, 18), 2);
                break;
            case 9:
                Throwable ex9 = this.f9985c;
                lf.a aVar10 = lf.a.f20034a;
                h8.b.B(obj);
                Intrinsics.checkNotNullParameter(ex9, "ex");
                jg.d dVar9 = MyApp.f6830c;
                lg.e eVar9 = m0.f9201a;
                c0.t(dVar9, lg.d.f20063c, null, new q4.r(ex9, null, 18), 2);
                break;
            case 10:
                Throwable ex10 = this.f9985c;
                lf.a aVar11 = lf.a.f20034a;
                h8.b.B(obj);
                Intrinsics.checkNotNullParameter(ex10, "ex");
                jg.d dVar10 = MyApp.f6830c;
                lg.e eVar10 = m0.f9201a;
                c0.t(dVar10, lg.d.f20063c, null, new q4.r(ex10, null, 18), 2);
                break;
            case 11:
                Throwable ex11 = this.f9985c;
                lf.a aVar12 = lf.a.f20034a;
                h8.b.B(obj);
                Intrinsics.checkNotNullParameter(ex11, "ex");
                jg.d dVar11 = MyApp.f6830c;
                lg.e eVar11 = m0.f9201a;
                c0.t(dVar11, lg.d.f20063c, null, new q4.r(ex11, null, 18), 2);
                break;
            case 12:
                Throwable ex12 = this.f9985c;
                lf.a aVar13 = lf.a.f20034a;
                h8.b.B(obj);
                Intrinsics.checkNotNullParameter(ex12, "ex");
                jg.d dVar12 = MyApp.f6830c;
                lg.e eVar12 = m0.f9201a;
                c0.t(dVar12, lg.d.f20063c, null, new q4.r(ex12, null, 18), 2);
                break;
            case 13:
                Throwable ex13 = this.f9985c;
                lf.a aVar14 = lf.a.f20034a;
                h8.b.B(obj);
                Intrinsics.checkNotNullParameter(ex13, "ex");
                jg.d dVar13 = MyApp.f6830c;
                lg.e eVar13 = m0.f9201a;
                c0.t(dVar13, lg.d.f20063c, null, new q4.r(ex13, null, 18), 2);
                break;
            case 14:
                Throwable ex14 = this.f9985c;
                lf.a aVar15 = lf.a.f20034a;
                h8.b.B(obj);
                Intrinsics.checkNotNullParameter(ex14, "ex");
                jg.d dVar14 = MyApp.f6830c;
                lg.e eVar14 = m0.f9201a;
                c0.t(dVar14, lg.d.f20063c, null, new q4.r(ex14, null, 18), 2);
                break;
            case 15:
                Throwable ex15 = this.f9985c;
                lf.a aVar16 = lf.a.f20034a;
                h8.b.B(obj);
                Intrinsics.checkNotNullParameter(ex15, "ex");
                jg.d dVar15 = MyApp.f6830c;
                lg.e eVar15 = m0.f9201a;
                c0.t(dVar15, lg.d.f20063c, null, new q4.r(ex15, null, 18), 2);
                break;
            case 16:
                Throwable ex16 = this.f9985c;
                lf.a aVar17 = lf.a.f20034a;
                h8.b.B(obj);
                Intrinsics.checkNotNullParameter(ex16, "ex");
                jg.d dVar16 = MyApp.f6830c;
                lg.e eVar16 = m0.f9201a;
                c0.t(dVar16, lg.d.f20063c, null, new q4.r(ex16, null, 18), 2);
                break;
            case 17:
                Throwable ex17 = this.f9985c;
                lf.a aVar18 = lf.a.f20034a;
                h8.b.B(obj);
                Intrinsics.checkNotNullParameter(ex17, "ex");
                jg.d dVar17 = MyApp.f6830c;
                lg.e eVar17 = m0.f9201a;
                c0.t(dVar17, lg.d.f20063c, null, new q4.r(ex17, null, 18), 2);
                break;
            case 18:
                Throwable th3 = this.f9985c;
                lf.a aVar19 = lf.a.f20034a;
                h8.b.B(obj);
                y yVar = (y) getContext().r(y.f9241c);
                zc.a.a(yVar != null ? yVar.f9242b : null, th3);
                break;
            case 19:
                Throwable ex18 = this.f9985c;
                lf.a aVar20 = lf.a.f20034a;
                h8.b.B(obj);
                Intrinsics.checkNotNullParameter(ex18, "ex");
                jg.d dVar18 = MyApp.f6830c;
                lg.e eVar18 = m0.f9201a;
                c0.t(dVar18, lg.d.f20063c, null, new q4.r(ex18, null, 18), 2);
                break;
            case 20:
                Throwable th4 = this.f9985c;
                lf.a aVar21 = lf.a.f20034a;
                h8.b.B(obj);
                zc.a.a("ObserverProfile", th4);
                break;
            case 21:
                Throwable ex19 = this.f9985c;
                lf.a aVar22 = lf.a.f20034a;
                h8.b.B(obj);
                Intrinsics.checkNotNullParameter(ex19, "ex");
                jg.d dVar19 = MyApp.f6830c;
                lg.e eVar19 = m0.f9201a;
                c0.t(dVar19, lg.d.f20063c, null, new q4.r(ex19, null, 18), 2);
                break;
            default:
                Throwable ex20 = this.f9985c;
                lf.a aVar23 = lf.a.f20034a;
                h8.b.B(obj);
                Intrinsics.checkNotNullParameter(ex20, "ex");
                jg.d dVar20 = MyApp.f6830c;
                lg.e eVar20 = m0.f9201a;
                c0.t(dVar20, lg.d.f20063c, null, new q4.r(ex20, null, 18), 2);
                break;
        }
        return Unit.f19194a;
    }
}
