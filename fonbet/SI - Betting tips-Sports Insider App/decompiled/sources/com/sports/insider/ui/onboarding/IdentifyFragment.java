package com.sports.insider.ui.onboarding;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.d1;
import androidx.lifecycle.e0;
import com.google.android.gms.internal.measurement.y3;
import com.sports.insider.MyApp;
import com.sports.insider.R;
import com.sports.insider.ui.views.OopsButton;
import com.sports.insider.ui.views.SiGradientView;
import e.d0;
import ec.t;
import eg.c0;
import eg.m0;
import eg.y;
import f3.n;
import gf.k;
import h8.b;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import jg.q;
import ke.f;
import ke.g;
import ke.i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import lg.d;
import lg.e;
import mf.c;
import rc.b0;
import rd.a;
import sc.h;
import y1.j;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lcom/sports/insider/ui/onboarding/IdentifyFragment;", "Lrd/a;", "Lec/t;", "<init>", "()V", "Lke/i;", "navArgs", "Betting-123_googleProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nIdentifyFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IdentifyFragment.kt\ncom/sports/insider/ui/onboarding/IdentifyFragment\n+ 2 FragmentNavArgsLazy.kt\nandroidx/navigation/fragment/FragmentNavArgsLazyKt\n*L\n1#1,240:1\n42#2,3:241\n*S KotlinDebug\n*F\n+ 1 IdentifyFragment.kt\ncom/sports/insider/ui/onboarding/IdentifyFragment\n*L\n50#1:241,3\n*E\n"})
/* loaded from: classes.dex */
public final class IdentifyFragment extends a<t> {

    /* renamed from: b, reason: collision with root package name */
    public i f6933b;

    /* renamed from: d, reason: collision with root package name */
    public String f6935d;

    /* renamed from: e, reason: collision with root package name */
    public Integer f6936e;

    /* renamed from: c, reason: collision with root package name */
    public final gf.t f6934c = k.b(new id.a(10));

    /* renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f6937f = new AtomicBoolean(false);

    /* renamed from: g, reason: collision with root package name */
    public final f f6938g = new f(0, true);

    /* JADX WARN: Code restructure failed: missing block: B:18:0x006c, code lost:
    
        if (eg.c0.A(r2, r6, r0) != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006e, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0054, code lost:
    
        if (r8 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object G(IdentifyFragment identifyFragment, c cVar) {
        g gVar;
        int i5;
        if (cVar instanceof g) {
            gVar = (g) cVar;
            int i10 = gVar.f19034c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                gVar.f19034c = i10 - Integer.MIN_VALUE;
                Object obj = gVar.f19032a;
                lf.a aVar = lf.a.f20034a;
                i5 = gVar.f19034c;
                Continuation continuation = null;
                int i11 = 1;
                if (i5 != 0) {
                    b.B(obj);
                    h hVar = (h) identifyFragment.f6934c.getValue();
                    gVar.f19034c = 1;
                    hVar.getClass();
                    e eVar = m0.f9201a;
                    obj = c0.A(d.f20063c, new sc.g(hVar, null), gVar);
                } else {
                    if (i5 != 1) {
                        if (i5 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        b.B(obj);
                        return Unit.f19194a;
                    }
                    b.B(obj);
                }
                boolean booleanValue = ((Boolean) obj).booleanValue();
                e eVar2 = m0.f9201a;
                fg.e eVar3 = q.f18523a;
                n nVar = new n(identifyFragment, booleanValue, continuation, i11);
                gVar.f19034c = 2;
            }
        }
        gVar = new g(identifyFragment, cVar);
        Object obj2 = gVar.f19032a;
        lf.a aVar2 = lf.a.f20034a;
        i5 = gVar.f19034c;
        Continuation continuation2 = null;
        int i112 = 1;
        if (i5 != 0) {
        }
        boolean booleanValue2 = ((Boolean) obj2).booleanValue();
        e eVar22 = m0.f9201a;
        fg.e eVar32 = q.f18523a;
        n nVar2 = new n(identifyFragment, booleanValue2, continuation2, i112);
        gVar.f19034c = 2;
    }

    public static final Object H(IdentifyFragment identifyFragment, mf.i iVar) {
        e eVar = m0.f9201a;
        d dVar = d.f20063c;
        y yVar = new y("toAuthServer");
        dVar.getClass();
        Object A = c0.A(kotlin.coroutines.e.c(dVar, yVar), new kd.e(identifyFragment, (Continuation) null, 2), iVar);
        return A == lf.a.f20034a ? A : Unit.f19194a;
    }

    @Override // rd.a
    public final b3.a F(LayoutInflater inflater, ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View inflate = inflater.inflate(R.layout.identify_fragment, viewGroup, false);
        int i5 = R.id.btn_frame;
        OopsButton oopsButton = (OopsButton) y3.j(R.id.btn_frame, inflate);
        if (oopsButton != null) {
            i5 = R.id.siGradient;
            if (((SiGradientView) y3.j(R.id.siGradient, inflate)) != null) {
                t tVar = new t((FrameLayout) inflate, oopsButton);
                Intrinsics.checkNotNullExpressionValue(tVar, "inflate(...)");
                return tVar;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i5)));
    }

    public final ke.k I() {
        ke.k kVar = new ke.k();
        String str = this.f6935d;
        HashMap hashMap = kVar.f19040a;
        hashMap.put("eMsgKey", str);
        hashMap.put("stateKey", null);
        Integer num = this.f6936e;
        hashMap.put("httpCode", Integer.valueOf(num != null ? num.intValue() : -1));
        i iVar = this.f6933b;
        hashMap.put("startBoard", Integer.valueOf(iVar != null ? iVar.b() : 0));
        i iVar2 = this.f6933b;
        hashMap.put("startAuthInApp", Integer.valueOf(iVar2 != null ? iVar2.a() : 0));
        Intrinsics.checkNotNullExpressionValue(kVar, "setStartAuthInApp(...)");
        return kVar;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        t tVar = (t) this.f22459a;
        if (tVar != null) {
            tVar.f9006b.setOnClickListener(new ke.e(0, this));
        }
        c0.t(MyApp.f6830c, b0.b(), null, new rc.c(new rc.g(), null, 11), 2);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        OopsButton oopsButton;
        super.onStop();
        t tVar = (t) this.f22459a;
        if (tVar == null || (oopsButton = tVar.f9006b) == null) {
            return;
        }
        oopsButton.setOnClickListener(null);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        ag.c navArgsClass = Reflection.getOrCreateKotlinClass(i.class);
        i3.i argumentProducer = new i3.i(3, this);
        Intrinsics.checkNotNullParameter(navArgsClass, "navArgsClass");
        Intrinsics.checkNotNullParameter(argumentProducer, "argumentProducer");
        Bundle bundle2 = (Bundle) argumentProducer.invoke();
        s.e eVar = j.f25572b;
        Method method = (Method) eVar.get(navArgsClass);
        if (method == null) {
            method = u6.h.k(navArgsClass).getMethod("fromBundle", (Class[]) Arrays.copyOf(j.f25571a, 1));
            eVar.put(navArgsClass, method);
            Intrinsics.checkNotNullExpressionValue(method, "also(...)");
        }
        Object invoke = method.invoke(null, bundle2);
        Intrinsics.checkNotNull(invoke, "null cannot be cast to non-null type Args of androidx.navigation.NavArgsLazy");
        this.f6933b = (i) ((y1.i) invoke);
        d0 onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        e0 viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        onBackPressedDispatcher.a(viewLifecycleOwner, this.f6938g);
        c0.t(d1.g(this), null, null, new ke.h(this, null, 2), 3);
    }
}
