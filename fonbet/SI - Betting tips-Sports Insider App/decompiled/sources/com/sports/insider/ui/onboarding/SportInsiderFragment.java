package com.sports.insider.ui.onboarding;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.d1;
import androidx.lifecycle.e0;
import androidx.lifecycle.g0;
import c1.a1;
import com.google.android.gms.internal.measurement.y3;
import com.sports.insider.MyApp;
import com.sports.insider.R;
import com.sports.insider.ui.views.OopsButton;
import com.sports.insider.ui.views.SiGradientView;
import e.d0;
import ec.a0;
import eg.c0;
import eg.m0;
import eg.x;
import eg.y;
import ge.d;
import gf.k;
import gf.t;
import h8.b;
import java.util.HashMap;
import ke.u;
import ke.v;
import ke.w;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import lg.e;
import md.o;
import mf.c;
import oe.j;
import rc.r;
import rd.a;
import sc.g;
import sc.h;
import y1.b0;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/sports/insider/ui/onboarding/SportInsiderFragment;", "Lrd/a;", "Lec/a0;", "<init>", "()V", "Betting-123_googleProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SportInsiderFragment extends a<a0> {

    /* renamed from: b, reason: collision with root package name */
    public final t f6946b = k.b(new id.a(11));

    /* renamed from: c, reason: collision with root package name */
    public final d f6947c = new d(this, 3);

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0153, code lost:
    
        if (r17.H(r7, r1, r2) == r3) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0182, code lost:
    
        if (r17.H(r7, r1, r2) == r3) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x01ac, code lost:
    
        if (r17.H(r1, r6, r2) == r3) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x01d5, code lost:
    
        if (r17.H(r1, r6, r2) == r3) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x009e, code lost:
    
        if (r1 == r3) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x007c, code lost:
    
        if (r1 == r3) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object G(SportInsiderFragment sportInsiderFragment, c cVar) {
        ke.t tVar;
        int intValue;
        boolean z5;
        int i5;
        lg.d dVar;
        ?? r5;
        boolean z7;
        if (cVar instanceof ke.t) {
            tVar = (ke.t) cVar;
            int i10 = tVar.f19064f;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                tVar.f19064f = i10 - Integer.MIN_VALUE;
                Object obj = tVar.f19062d;
                lf.a aVar = lf.a.f20034a;
                int i11 = 1;
                int i12 = 3;
                int i13 = 2;
                Continuation continuation = null;
                switch (tVar.f19064f) {
                    case 0:
                        b.B(obj);
                        id.c cVar2 = new id.c(1);
                        tVar.f19064f = 1;
                        e eVar = m0.f9201a;
                        obj = c0.A(lg.d.f20063c, new androidx.lifecycle.b(cVar2, continuation, 24), tVar);
                        break;
                    case 1:
                        b.B(obj);
                        intValue = ((Number) obj).intValue();
                        r rVar = new r();
                        tVar.f19059a = intValue;
                        tVar.f19064f = 2;
                        e eVar2 = m0.f9201a;
                        obj = c0.A(lg.d.f20063c, new j(rVar, continuation, 21), tVar);
                        break;
                    case 2:
                        intValue = tVar.f19059a;
                        b.B(obj);
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        h hVar = (h) sportInsiderFragment.f6946b.getValue();
                        tVar.f19059a = intValue;
                        tVar.f19060b = booleanValue;
                        tVar.f19064f = 3;
                        hVar.getClass();
                        e eVar3 = m0.f9201a;
                        Object A = c0.A(lg.d.f20063c, new g(hVar, null), tVar);
                        if (A != aVar) {
                            int i14 = intValue;
                            z5 = booleanValue;
                            obj = A;
                            i5 = i14;
                            boolean booleanValue2 = ((Boolean) obj).booleanValue();
                            o oVar = new o(4);
                            jg.d dVar2 = MyApp.f6830c;
                            e eVar4 = m0.f9201a;
                            dVar = lg.d.f20063c;
                            y yVar = new y("setWorkRemoteConfigFetch");
                            dVar.getClass();
                            c0.t(dVar2, kotlin.coroutines.e.c(dVar, yVar), null, new q4.r(oVar, continuation, i11), 2);
                            tVar.f19059a = i5;
                            tVar.f19060b = z5;
                            tVar.f19061c = booleanValue2;
                            tVar.f19064f = 4;
                            if (c0.A(dVar, new a1(i13, continuation, i12), tVar) != aVar) {
                                r5 = z5;
                                z7 = booleanValue2;
                                c0.t(MyApp.f6830c, null, null, new rc.o(new r(), continuation, i13), 3);
                                if (!z7) {
                                    w wVar = new w();
                                    Integer valueOf = Integer.valueOf((int) r5);
                                    HashMap hashMap = wVar.f19069a;
                                    hashMap.put("startBoard", valueOf);
                                    hashMap.put("startAuthInApp", Integer.valueOf(i5));
                                    Intrinsics.checkNotNullExpressionValue(wVar, "setStartAuthInApp(...)");
                                    Integer num = new Integer(R.id.identifyFragment);
                                    tVar.f19059a = i5;
                                    tVar.f19060b = r5;
                                    tVar.f19061c = z7;
                                    tVar.f19064f = 5;
                                    break;
                                } else if (r5 == 0) {
                                    if (i5 <= 0) {
                                        y1.c0 aVar2 = new y1.a(R.id.action_sportInsiderFragment_to_allPredictionsFragment);
                                        Intrinsics.checkNotNullExpressionValue(aVar2, "actionSportInsiderFragme…lPredictionsFragment(...)");
                                        Integer num2 = new Integer(R.id.allPredictionsFragment);
                                        tVar.f19059a = i5;
                                        tVar.f19060b = r5;
                                        tVar.f19061c = z7;
                                        tVar.f19064f = 8;
                                        break;
                                    } else {
                                        y1.c0 aVar3 = new y1.a(R.id.action_sportInsiderFragment_to_authScreenFragment);
                                        Intrinsics.checkNotNullExpressionValue(aVar3, "actionSportInsiderFragme…ToAuthScreenFragment(...)");
                                        Integer num3 = new Integer(R.id.authScreenFragment);
                                        tVar.f19059a = i5;
                                        tVar.f19060b = r5;
                                        tVar.f19061c = z7;
                                        tVar.f19064f = 7;
                                        break;
                                    }
                                } else {
                                    v vVar = new v();
                                    vVar.f19068a.put("startAuthInApp", Integer.valueOf(i5));
                                    Intrinsics.checkNotNullExpressionValue(vVar, "setStartAuthInApp(...)");
                                    Integer num4 = new Integer(R.id.boardSiAcademyFragment);
                                    tVar.f19059a = i5;
                                    tVar.f19060b = r5;
                                    tVar.f19061c = z7;
                                    tVar.f19064f = 6;
                                    break;
                                }
                            }
                        }
                        return aVar;
                    case 3:
                        z5 = tVar.f19060b;
                        i5 = tVar.f19059a;
                        b.B(obj);
                        boolean booleanValue22 = ((Boolean) obj).booleanValue();
                        o oVar2 = new o(4);
                        jg.d dVar22 = MyApp.f6830c;
                        e eVar42 = m0.f9201a;
                        dVar = lg.d.f20063c;
                        y yVar2 = new y("setWorkRemoteConfigFetch");
                        dVar.getClass();
                        c0.t(dVar22, kotlin.coroutines.e.c(dVar, yVar2), null, new q4.r(oVar2, continuation, i11), 2);
                        tVar.f19059a = i5;
                        tVar.f19060b = z5;
                        tVar.f19061c = booleanValue22;
                        tVar.f19064f = 4;
                        if (c0.A(dVar, new a1(i13, continuation, i12), tVar) != aVar) {
                        }
                        return aVar;
                    case 4:
                        z7 = tVar.f19061c;
                        boolean z10 = tVar.f19060b;
                        i5 = tVar.f19059a;
                        b.B(obj);
                        r5 = z10;
                        c0.t(MyApp.f6830c, null, null, new rc.o(new r(), continuation, i13), 3);
                        if (!z7) {
                        }
                        return aVar;
                    case 5:
                        b.B(obj);
                        return Unit.f19194a;
                    case 6:
                        b.B(obj);
                        return Unit.f19194a;
                    case 7:
                        b.B(obj);
                        return Unit.f19194a;
                    case 8:
                        b.B(obj);
                        return Unit.f19194a;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        tVar = new ke.t(sportInsiderFragment, cVar);
        Object obj2 = tVar.f19062d;
        lf.a aVar4 = lf.a.f20034a;
        int i112 = 1;
        int i122 = 3;
        int i132 = 2;
        Continuation continuation2 = null;
        switch (tVar.f19064f) {
        }
    }

    @Override // rd.a
    public final b3.a F(LayoutInflater inflater, ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View inflate = inflater.inflate(R.layout.start_app_fragment, viewGroup, false);
        int i5 = R.id.btn_frame;
        OopsButton oopsButton = (OopsButton) y3.j(R.id.btn_frame, inflate);
        if (oopsButton != null) {
            i5 = R.id.siGradient;
            if (((SiGradientView) y3.j(R.id.siGradient, inflate)) != null) {
                a0 a0Var = new a0((FrameLayout) inflate, oopsButton);
                Intrinsics.checkNotNullExpressionValue(a0Var, "inflate(...)");
                return a0Var;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i5)));
    }

    public final Unit H(y1.c0 c0Var, Integer num, ke.t tVar) {
        x xVar = y.f9241c;
        try {
            if (((g0) getLifecycle()).f2169d.a(androidx.lifecycle.x.f2256d)) {
                y1.r r5 = a.a.r(this);
                b2.j jVar = r5.f25625b;
                b0 f6 = jVar.f();
                Integer num2 = f6 != null ? new Integer(f6.f25534b.f3017e) : null;
                if (num2 != null && num2.intValue() == R.id.sportInsiderFragment) {
                    int intValue = num.intValue();
                    if (jVar.g().f25543g.f3078a == R.id.sportInsiderFragment && jVar.g().f25543g.f3078a != intValue) {
                        jVar.g().l(intValue);
                    }
                    r5.d(c0Var);
                }
                a0 a0Var = (a0) this.f22459a;
                if (a0Var != null) {
                    a0Var.f8851b.setVisibility(0);
                }
            } else {
                y yVar = (y) tVar.getContext().r(xVar);
                zc.d.c("A navigateFragment:" + (yVar != null ? yVar.f9242b : null) + " isAtLeast State.STARTED " + num + " : " + I(), "navigateFragment");
                a0 a0Var2 = (a0) this.f22459a;
                if (a0Var2 != null) {
                    a0Var2.f8851b.setVisibility(0);
                }
            }
        } catch (Exception e7) {
            y yVar2 = (y) tVar.getContext().r(xVar);
            zc.d.b(4, "A:" + (yVar2 != null ? yVar2.f9242b : null) + ' ' + num + " : " + I(), e7);
            a0 a0Var3 = (a0) this.f22459a;
            if (a0Var3 != null) {
                a0Var3.f8851b.setVisibility(0);
            }
        }
        return Unit.f19194a;
    }

    public final String I() {
        int i5 = a.a.r(this).f25625b.g().f25543g.f3078a;
        if (R.id.sportInsiderFragment == i5) {
            return "A(" + i5 + ')';
        }
        if (R.id.identifyFragment == i5) {
            return "B(" + i5 + ')';
        }
        if (R.id.noEthernetFragment == i5) {
            return "C(" + i5 + ')';
        }
        if (R.id.boardSiAcademyFragment == i5) {
            return "D(" + i5 + ')';
        }
        if (R.id.authScreenFragment == i5) {
            return "E(" + i5 + ')';
        }
        if (R.id.allPredictionsFragment == i5) {
            return "F(" + i5 + ')';
        }
        return "other(" + i5 + ')';
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        c0.t(MyApp.f6830c, rc.b0.b(), null, new rc.c(new rc.g(), null, 13), 2);
        a0 a0Var = (a0) this.f22459a;
        if (a0Var != null) {
            a0Var.f8851b.setOnClickListener(new ke.e(1, this));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        OopsButton oopsButton;
        super.onStop();
        a0 a0Var = (a0) this.f22459a;
        if (a0Var == null || (oopsButton = a0Var.f8851b) == null) {
            return;
        }
        oopsButton.setOnClickListener(null);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        d0 onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        e0 viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        onBackPressedDispatcher.a(viewLifecycleOwner, this.f6947c);
        c0.t(d1.g(this), null, null, new u(this, null, 2), 3);
    }
}
