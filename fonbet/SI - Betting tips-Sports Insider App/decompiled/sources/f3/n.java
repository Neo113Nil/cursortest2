package f3;

import android.content.Context;
import androidx.lifecycle.p0;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import com.sports.insider.R;
import com.sports.insider.ui.onboarding.IdentifyFragment;
import hg.d1;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class n extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f9400b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ boolean f9401c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f9402d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(Object obj, Continuation continuation, int i5) {
        super(2, continuation);
        this.f9400b = i5;
        this.f9402d = obj;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f9400b) {
            case 0:
                n nVar = new n((Context) this.f9402d, continuation, 0);
                nVar.f9401c = ((Boolean) obj).booleanValue();
                return nVar;
            case 1:
                return new n((IdentifyFragment) this.f9402d, this.f9401c, continuation, 1);
            case 2:
                n nVar2 = new n((me.c0) this.f9402d, continuation, 2);
                nVar2.f9401c = ((Boolean) obj).booleanValue();
                return nVar2;
            case 3:
                return new n((oe.g) this.f9402d, this.f9401c, continuation, 3);
            default:
                return new n((te.l0) this.f9402d, this.f9401c, continuation, 4);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f9400b) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                break;
            case 2:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                break;
        }
        return ((n) create((eg.z) obj, (Continuation) obj2)).invokeSuspend(Unit.f19194a);
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        Integer valueOf;
        int i5 = this.f9400b;
        Object obj2 = this.f9402d;
        switch (i5) {
            case 0:
                lf.a aVar = lf.a.f20034a;
                h8.b.B(obj);
                n3.k.a((Context) obj2, RescheduleReceiver.class, this.f9401c);
                break;
            case 1:
                lf.a aVar2 = lf.a.f20034a;
                h8.b.B(obj);
                IdentifyFragment identifyFragment = (IdentifyFragment) obj2;
                ke.i iVar = identifyFragment.f6933b;
                boolean z5 = (iVar != null ? iVar.b() : 0) == 1;
                ke.i iVar2 = identifyFragment.f6933b;
                int a7 = iVar2 != null ? iVar2.a() : 0;
                if (this.f9401c) {
                    try {
                        if (((androidx.lifecycle.g0) identifyFragment.getLifecycle()).f2169d.a(androidx.lifecycle.x.f2256d)) {
                            y1.r r5 = a.a.r(identifyFragment);
                            y1.b0 f6 = r5.f25625b.f();
                            valueOf = f6 != null ? Integer.valueOf(f6.f25534b.f3017e) : null;
                            if (valueOf != null && valueOf.intValue() == R.id.identifyFragment) {
                                r5.d(identifyFragment.I());
                            }
                        }
                    } catch (IllegalArgumentException e7) {
                        ec.t tVar = (ec.t) identifyFragment.f22459a;
                        if (tVar != null) {
                            tVar.f9006b.setVisibility(0);
                        }
                        zc.d.b(4, "identifyToNoEthernet", e7);
                    }
                } else if (z5) {
                    try {
                        if (((androidx.lifecycle.g0) identifyFragment.getLifecycle()).f2169d.a(androidx.lifecycle.x.f2256d)) {
                            y1.r r6 = a.a.r(identifyFragment);
                            b2.j jVar = r6.f25625b;
                            if (jVar.g().f25543g.f3078a != R.id.boardSiAcademyFragment) {
                                jVar.g().l(R.id.boardSiAcademyFragment);
                            }
                            y1.b0 f10 = jVar.f();
                            valueOf = f10 != null ? Integer.valueOf(f10.f25534b.f3017e) : null;
                            if (valueOf != null && valueOf.intValue() == R.id.identifyFragment) {
                                ke.j jVar2 = new ke.j();
                                ke.i iVar3 = identifyFragment.f6933b;
                                jVar2.f19039a.put("startAuthInApp", Integer.valueOf(iVar3 != null ? iVar3.a() : 0));
                                Intrinsics.checkNotNullExpressionValue(jVar2, "setStartAuthInApp(...)");
                                r6.d(jVar2);
                            }
                        }
                    } catch (IllegalArgumentException e9) {
                        ec.t tVar2 = (ec.t) identifyFragment.f22459a;
                        if (tVar2 != null) {
                            tVar2.f9006b.setVisibility(0);
                        }
                        zc.d.b(4, "identifyToBoardSiAcademy", e9);
                    }
                } else if (a7 > 0) {
                    try {
                        if (((androidx.lifecycle.g0) identifyFragment.getLifecycle()).f2169d.a(androidx.lifecycle.x.f2256d)) {
                            y1.r r10 = a.a.r(identifyFragment);
                            b2.j jVar3 = r10.f25625b;
                            if (jVar3.g().f25543g.f3078a != R.id.authScreenFragment) {
                                jVar3.g().l(R.id.authScreenFragment);
                            }
                            y1.b0 f11 = jVar3.f();
                            valueOf = f11 != null ? Integer.valueOf(f11.f25534b.f3017e) : null;
                            if (valueOf != null && valueOf.intValue() == R.id.identifyFragment) {
                                y1.a aVar3 = new y1.a(R.id.action_identifyFragment_to_authScreenFragment);
                                Intrinsics.checkNotNullExpressionValue(aVar3, "actionIdentifyFragmentToAuthScreenFragment(...)");
                                r10.d(aVar3);
                            }
                        }
                    } catch (IllegalArgumentException e10) {
                        ec.t tVar3 = (ec.t) identifyFragment.f22459a;
                        if (tVar3 != null) {
                            tVar3.f9006b.setVisibility(0);
                        }
                        zc.d.b(4, "identifyToAuthScreen", e10);
                    }
                } else {
                    try {
                        if (((androidx.lifecycle.g0) identifyFragment.getLifecycle()).f2169d.a(androidx.lifecycle.x.f2256d)) {
                            y1.r r11 = a.a.r(identifyFragment);
                            b2.j jVar4 = r11.f25625b;
                            if (jVar4.g().f25543g.f3078a != R.id.allPredictionsFragment) {
                                jVar4.g().l(R.id.allPredictionsFragment);
                            }
                            y1.b0 f12 = jVar4.f();
                            valueOf = f12 != null ? Integer.valueOf(f12.f25534b.f3017e) : null;
                            if (valueOf != null && valueOf.intValue() == R.id.identifyFragment) {
                                y1.a aVar4 = new y1.a(R.id.action_identifyFragment_to_allPredictionsFragment);
                                Intrinsics.checkNotNullExpressionValue(aVar4, "actionIdentifyFragmentTo…lPredictionsFragment(...)");
                                r11.d(aVar4);
                            }
                        }
                    } catch (IllegalArgumentException e11) {
                        ec.t tVar4 = (ec.t) identifyFragment.f22459a;
                        if (tVar4 != null) {
                            tVar4.f9006b.setVisibility(0);
                        }
                        zc.d.b(4, "identifyToAllPredictions", e11);
                    }
                }
                break;
            case 2:
                boolean z7 = this.f9401c;
                lf.a aVar5 = lf.a.f20034a;
                h8.b.B(obj);
                me.c0 c0Var = (me.c0) obj2;
                d1 d1Var = c0Var.Z;
                Boolean valueOf2 = Boolean.valueOf(z7);
                d1Var.getClass();
                d1Var.k(null, valueOf2);
                d1 d1Var2 = c0Var.f20611a0;
                Integer num = new Integer(z7 ? R.drawable.ic_saved_24 : R.drawable.ic_un_saved_24);
                d1Var2.getClass();
                d1Var2.k(null, num);
                break;
            case 3:
                lf.a aVar6 = lf.a.f20034a;
                h8.b.B(obj);
                oe.g gVar = (oe.g) obj2;
                AtomicBoolean atomicBoolean = gVar.f21185d;
                boolean z10 = this.f9401c;
                atomicBoolean.set(z10);
                if (z10) {
                    gVar.f21191k.h("Update App");
                }
                break;
            default:
                lf.a aVar7 = lf.a.f20034a;
                h8.b.B(obj);
                te.l0 l0Var = (te.l0) obj2;
                l0Var.f23906k.j(Boolean.FALSE);
                p0 p0Var = l0Var.f23908m;
                boolean z11 = this.f9401c;
                p0Var.h(Boolean.valueOf((z11 || l0Var.f23903g == null) ? z11 : true));
                break;
        }
        return Unit.f19194a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(Object obj, boolean z5, Continuation continuation, int i5) {
        super(2, continuation);
        this.f9400b = i5;
        this.f9402d = obj;
        this.f9401c = z5;
    }
}
