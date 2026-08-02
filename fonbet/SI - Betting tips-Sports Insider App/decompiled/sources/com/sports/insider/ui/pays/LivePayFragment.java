package com.sports.insider.ui.pays;

import a2.q;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.d1;
import androidx.lifecycle.q0;
import c4.m;
import c4.o;
import c4.u;
import c4.v;
import com.google.android.gms.internal.measurement.y3;
import com.google.firebase.messaging.x;
import com.sports.insider.MyApp;
import com.sports.insider.R;
import com.sports.insider.ui.pays.LivePayFragment;
import com.sports.insider.ui.views.CustomGradientButton;
import com.sports.insider.ui.views.LivePrice;
import com.sports.insider.ui.views.ProfitViewV2;
import ec.c0;
import eg.m0;
import eg.t1;
import ge.d;
import gf.k;
import gf.t;
import h8.b;
import i3.i;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import le.j;
import le.p;
import le.z;
import mf.c;
import q4.e;
import q4.h;
import rd.a;
import ve.l0;
import ve.y;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t²\u0006\f\u0010\b\u001a\u00020\u00078\nX\u008a\u0084\u0002"}, d2 = {"Lcom/sports/insider/ui/pays/LivePayFragment;", "Lrd/a;", "Lec/c0;", "Lve/y;", "Lve/l0;", "<init>", "()V", "Lle/q;", "safeArgs", "Betting-123_googleProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLivePayFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LivePayFragment.kt\ncom/sports/insider/ui/pays/LivePayFragment\n+ 2 singletonImageLoaders.android.kt\ncoil3/SingletonImageLoaders_androidKt\n+ 3 FragmentNavArgsLazy.kt\nandroidx/navigation/fragment/FragmentNavArgsLazyKt\n*L\n1#1,336:1\n17#2:337\n42#3,3:338\n*S KotlinDebug\n*F\n+ 1 LivePayFragment.kt\ncom/sports/insider/ui/pays/LivePayFragment\n*L\n97#1:337\n206#1:338,3\n*E\n"})
/* loaded from: classes.dex */
public final class LivePayFragment extends a<c0> implements y, l0 {

    /* renamed from: b, reason: collision with root package name */
    public final j f6948b;

    /* renamed from: c, reason: collision with root package name */
    public final j f6949c;

    /* renamed from: d, reason: collision with root package name */
    public final j f6950d;

    /* renamed from: e, reason: collision with root package name */
    public final j f6951e;

    /* renamed from: f, reason: collision with root package name */
    public final t f6952f = k.b(new q(25, this));

    /* renamed from: g, reason: collision with root package name */
    public final d f6953g = new d(this, 4);

    /* JADX WARN: Type inference failed for: r0v0, types: [le.j] */
    /* JADX WARN: Type inference failed for: r0v1, types: [le.j] */
    /* JADX WARN: Type inference failed for: r0v2, types: [le.j] */
    /* JADX WARN: Type inference failed for: r0v3, types: [le.j] */
    public LivePayFragment() {
        final int i5 = 0;
        this.f6948b = new q0(this) { // from class: le.j

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LivePayFragment f19833b;

            {
                this.f19833b = this;
            }

            @Override // androidx.lifecycle.q0
            public final void a(Object obj) {
                ec.c0 c0Var;
                ec.c0 c0Var2;
                y1.c0 c0Var3;
                ec.c0 c0Var4;
                switch (i5) {
                    case 0:
                        Boolean bool = (Boolean) obj;
                        if (bool != null && (c0Var = (ec.c0) this.f19833b.f22459a) != null) {
                            c0Var.f8890f.set1RubWeekCloudPayment(bool.booleanValue());
                            break;
                        }
                        break;
                    case 1:
                        ic.e eVar = (ic.e) obj;
                        if (eVar != null && (c0Var2 = (ec.c0) this.f19833b.f22459a) != null) {
                            c0Var2.f8890f.setDetailsSecond(eVar);
                            break;
                        }
                        break;
                    case 2:
                        LivePayFragment livePayFragment = this.f19833b;
                        ic.i0 i0Var = (ic.i0) obj;
                        ic.f fVar = i0Var != null ? (ic.f) i0Var.a() : null;
                        ic.f fVar2 = fVar != null ? fVar : null;
                        if (fVar2 != null && (c0Var3 = fVar2.f11114a) != null) {
                            try {
                                a.a.r(livePayFragment).d(c0Var3);
                                break;
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        break;
                    default:
                        ic.e eVar2 = (ic.e) obj;
                        if (eVar2 != null && (c0Var4 = (ec.c0) this.f19833b.f22459a) != null) {
                            c0Var4.f8890f.setDetailsFirst(eVar2);
                            break;
                        }
                        break;
                }
            }
        };
        final int i10 = 1;
        this.f6949c = new q0(this) { // from class: le.j

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LivePayFragment f19833b;

            {
                this.f19833b = this;
            }

            @Override // androidx.lifecycle.q0
            public final void a(Object obj) {
                ec.c0 c0Var;
                ec.c0 c0Var2;
                y1.c0 c0Var3;
                ec.c0 c0Var4;
                switch (i10) {
                    case 0:
                        Boolean bool = (Boolean) obj;
                        if (bool != null && (c0Var = (ec.c0) this.f19833b.f22459a) != null) {
                            c0Var.f8890f.set1RubWeekCloudPayment(bool.booleanValue());
                            break;
                        }
                        break;
                    case 1:
                        ic.e eVar = (ic.e) obj;
                        if (eVar != null && (c0Var2 = (ec.c0) this.f19833b.f22459a) != null) {
                            c0Var2.f8890f.setDetailsSecond(eVar);
                            break;
                        }
                        break;
                    case 2:
                        LivePayFragment livePayFragment = this.f19833b;
                        ic.i0 i0Var = (ic.i0) obj;
                        ic.f fVar = i0Var != null ? (ic.f) i0Var.a() : null;
                        ic.f fVar2 = fVar != null ? fVar : null;
                        if (fVar2 != null && (c0Var3 = fVar2.f11114a) != null) {
                            try {
                                a.a.r(livePayFragment).d(c0Var3);
                                break;
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        break;
                    default:
                        ic.e eVar2 = (ic.e) obj;
                        if (eVar2 != null && (c0Var4 = (ec.c0) this.f19833b.f22459a) != null) {
                            c0Var4.f8890f.setDetailsFirst(eVar2);
                            break;
                        }
                        break;
                }
            }
        };
        final int i11 = 2;
        this.f6950d = new q0(this) { // from class: le.j

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LivePayFragment f19833b;

            {
                this.f19833b = this;
            }

            @Override // androidx.lifecycle.q0
            public final void a(Object obj) {
                ec.c0 c0Var;
                ec.c0 c0Var2;
                y1.c0 c0Var3;
                ec.c0 c0Var4;
                switch (i11) {
                    case 0:
                        Boolean bool = (Boolean) obj;
                        if (bool != null && (c0Var = (ec.c0) this.f19833b.f22459a) != null) {
                            c0Var.f8890f.set1RubWeekCloudPayment(bool.booleanValue());
                            break;
                        }
                        break;
                    case 1:
                        ic.e eVar = (ic.e) obj;
                        if (eVar != null && (c0Var2 = (ec.c0) this.f19833b.f22459a) != null) {
                            c0Var2.f8890f.setDetailsSecond(eVar);
                            break;
                        }
                        break;
                    case 2:
                        LivePayFragment livePayFragment = this.f19833b;
                        ic.i0 i0Var = (ic.i0) obj;
                        ic.f fVar = i0Var != null ? (ic.f) i0Var.a() : null;
                        ic.f fVar2 = fVar != null ? fVar : null;
                        if (fVar2 != null && (c0Var3 = fVar2.f11114a) != null) {
                            try {
                                a.a.r(livePayFragment).d(c0Var3);
                                break;
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        break;
                    default:
                        ic.e eVar2 = (ic.e) obj;
                        if (eVar2 != null && (c0Var4 = (ec.c0) this.f19833b.f22459a) != null) {
                            c0Var4.f8890f.setDetailsFirst(eVar2);
                            break;
                        }
                        break;
                }
            }
        };
        final int i12 = 3;
        this.f6951e = new q0(this) { // from class: le.j

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LivePayFragment f19833b;

            {
                this.f19833b = this;
            }

            @Override // androidx.lifecycle.q0
            public final void a(Object obj) {
                ec.c0 c0Var;
                ec.c0 c0Var2;
                y1.c0 c0Var3;
                ec.c0 c0Var4;
                switch (i12) {
                    case 0:
                        Boolean bool = (Boolean) obj;
                        if (bool != null && (c0Var = (ec.c0) this.f19833b.f22459a) != null) {
                            c0Var.f8890f.set1RubWeekCloudPayment(bool.booleanValue());
                            break;
                        }
                        break;
                    case 1:
                        ic.e eVar = (ic.e) obj;
                        if (eVar != null && (c0Var2 = (ec.c0) this.f19833b.f22459a) != null) {
                            c0Var2.f8890f.setDetailsSecond(eVar);
                            break;
                        }
                        break;
                    case 2:
                        LivePayFragment livePayFragment = this.f19833b;
                        ic.i0 i0Var = (ic.i0) obj;
                        ic.f fVar = i0Var != null ? (ic.f) i0Var.a() : null;
                        ic.f fVar2 = fVar != null ? fVar : null;
                        if (fVar2 != null && (c0Var3 = fVar2.f11114a) != null) {
                            try {
                                a.a.r(livePayFragment).d(c0Var3);
                                break;
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        break;
                    default:
                        ic.e eVar2 = (ic.e) obj;
                        if (eVar2 != null && (c0Var4 = (ec.c0) this.f19833b.f22459a) != null) {
                            c0Var4.f8890f.setDetailsFirst(eVar2);
                            break;
                        }
                        break;
                }
            }
        };
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0062 A[Catch: Exception -> 0x0070, TRY_LEAVE, TryCatch #0 {Exception -> 0x0070, blocks: (B:11:0x0025, B:12:0x005a, B:14:0x0062, B:22:0x0034), top: B:7:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0070 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object G(LivePayFragment livePayFragment, Context context, Integer num, c cVar) {
        p pVar;
        int i5;
        m image;
        try {
            if (cVar instanceof p) {
                pVar = (p) cVar;
                int i10 = pVar.f19904d;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    pVar.f19904d = i10 - Integer.MIN_VALUE;
                    Object obj = pVar.f19902b;
                    lf.a aVar = lf.a.f20034a;
                    i5 = pVar.f19904d;
                    if (i5 != 0) {
                        b.B(obj);
                        e eVar = new e(context);
                        eVar.f21940c = num;
                        q4.b bVar = q4.b.f21930c;
                        eVar.f21946i = bVar;
                        eVar.f21945h = bVar;
                        eVar.j = q4.b.f21931d;
                        h a7 = eVar.a();
                        o a10 = c4.y.a(context);
                        pVar.f19901a = context;
                        pVar.f19904d = 1;
                        obj = ((v) a10).c(a7, pVar);
                        if (obj == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i5 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        context = pVar.f19901a;
                        b.B(obj);
                    }
                    image = ((q4.k) obj).getImage();
                    if (image != null) {
                        return null;
                    }
                    Resources resources = context.getResources();
                    Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                    return c4.p.b(image, resources);
                }
            }
            if (i5 != 0) {
            }
            image = ((q4.k) obj).getImage();
            if (image != null) {
            }
        } catch (Exception unused) {
            return null;
        }
        pVar = new p(livePayFragment, cVar);
        Object obj2 = pVar.f19902b;
        lf.a aVar2 = lf.a.f20034a;
        i5 = pVar.f19904d;
    }

    @Override // rd.a
    public final b3.a F(LayoutInflater inflater, ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View inflate = inflater.inflate(R.layout.sub_live_fragment, viewGroup, false);
        int i5 = R.id.appCompatImageView;
        AppCompatImageView appCompatImageView = (AppCompatImageView) y3.j(R.id.appCompatImageView, inflate);
        if (appCompatImageView != null) {
            i5 = R.id.btnClose;
            FrameLayout frameLayout = (FrameLayout) y3.j(R.id.btnClose, inflate);
            if (frameLayout != null) {
                i5 = R.id.btnLive;
                CustomGradientButton customGradientButton = (CustomGradientButton) y3.j(R.id.btnLive, inflate);
                if (customGradientButton != null) {
                    i5 = R.id.head;
                    if (((FrameLayout) y3.j(R.id.head, inflate)) != null) {
                        i5 = R.id.linearLayout;
                        if (((LinearLayout) y3.j(R.id.linearLayout, inflate)) != null) {
                            i5 = R.id.panel_vip;
                            AppCompatImageView appCompatImageView2 = (AppCompatImageView) y3.j(R.id.panel_vip, inflate);
                            if (appCompatImageView2 != null) {
                                i5 = R.id.panelsPrice2;
                                LivePrice livePrice = (LivePrice) y3.j(R.id.panelsPrice2, inflate);
                                if (livePrice != null) {
                                    i5 = R.id.profits;
                                    ProfitViewV2 profitViewV2 = (ProfitViewV2) y3.j(R.id.profits, inflate);
                                    if (profitViewV2 != null) {
                                        i5 = R.id.space_nav_live;
                                        if (((FrameLayout) y3.j(R.id.space_nav_live, inflate)) != null) {
                                            i5 = R.id.status_space_live;
                                            FrameLayout frameLayout2 = (FrameLayout) y3.j(R.id.status_space_live, inflate);
                                            if (frameLayout2 != null) {
                                                i5 = R.id.title;
                                                TextView textView = (TextView) y3.j(R.id.title, inflate);
                                                if (textView != null) {
                                                    i5 = R.id.title_desc;
                                                    TextView textView2 = (TextView) y3.j(R.id.title_desc, inflate);
                                                    if (textView2 != null) {
                                                        c0 c0Var = new c0((ConstraintLayout) inflate, appCompatImageView, frameLayout, customGradientButton, appCompatImageView2, livePrice, profitViewV2, frameLayout2, textView, textView2);
                                                        Intrinsics.checkNotNullExpressionValue(c0Var, "inflate(...)");
                                                        return c0Var;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i5)));
    }

    public final z H() {
        return (z) this.f6952f.getValue();
    }

    @Override // rd.a, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f6953g.e();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        LivePrice livePrice;
        FrameLayout frameLayout;
        CustomGradientButton customGradientButton;
        super.onPause();
        c0 c0Var = (c0) this.f22459a;
        if (c0Var != null && (customGradientButton = c0Var.f8888d) != null) {
            customGradientButton.setOnClickListener(null);
        }
        c0 c0Var2 = (c0) this.f22459a;
        if (c0Var2 != null && (frameLayout = c0Var2.f8887c) != null) {
            frameLayout.setOnClickListener(null);
        }
        c0 c0Var3 = (c0) this.f22459a;
        if (c0Var3 == null || (livePrice = c0Var3.f8890f) == null) {
            return;
        }
        livePrice.setListenerCheckPrice(null);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        c0 c0Var = (c0) this.f22459a;
        if (c0Var != null) {
            final int i5 = 0;
            io.sentry.config.a.y(c0Var.f8887c, 600L, new Function1(this) { // from class: le.i

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ LivePayFragment f19821b;

                {
                    this.f19821b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    switch (i5) {
                        case 0:
                            this.f19821b.f6953g.b();
                            break;
                        default:
                            LivePayFragment livePayFragment = this.f19821b;
                            z H = livePayFragment.H();
                            androidx.fragment.app.p0 activity = livePayFragment.requireActivity();
                            Intrinsics.checkNotNullExpressionValue(activity, "requireActivity(...)");
                            H.getClass();
                            Intrinsics.checkNotNullParameter(activity, "activity");
                            if (H.f20013i) {
                                H.h(activity);
                            } else {
                                H.i(activity);
                            }
                            break;
                    }
                    return Unit.f19194a;
                }
            });
        }
        c0 c0Var2 = (c0) this.f22459a;
        if (c0Var2 != null) {
            final int i10 = 1;
            io.sentry.config.a.y(c0Var2.f8888d, 700L, new Function1(this) { // from class: le.i

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ LivePayFragment f19821b;

                {
                    this.f19821b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    switch (i10) {
                        case 0:
                            this.f19821b.f6953g.b();
                            break;
                        default:
                            LivePayFragment livePayFragment = this.f19821b;
                            z H = livePayFragment.H();
                            androidx.fragment.app.p0 activity = livePayFragment.requireActivity();
                            Intrinsics.checkNotNullExpressionValue(activity, "requireActivity(...)");
                            H.getClass();
                            Intrinsics.checkNotNullParameter(activity, "activity");
                            if (H.f20013i) {
                                H.h(activity);
                            } else {
                                H.i(activity);
                            }
                            break;
                    }
                    return Unit.f19194a;
                }
            });
        }
        c0 c0Var3 = (c0) this.f22459a;
        if (c0Var3 != null) {
            c0Var3.f8890f.setListenerCheckPrice(this);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        z H = H();
        H.getClass();
        x xVar = H.f20027y;
        u1.a i5 = d1.i(H);
        lg.e eVar = m0.f9201a;
        Continuation continuation = null;
        int i10 = 3;
        eg.c0.t(i5, jg.q.f18523a, null, new u(H, continuation, i10), 2);
        t1 t1Var = H.f20006b;
        if (t1Var != null) {
            t1Var.k(null);
        }
        H.f20006b = null;
        u1.a i11 = d1.i(H);
        lg.d dVar = lg.d.f20063c;
        eg.c0.t(i11, dVar, null, new le.y(H, continuation, 1), 2);
        eg.c0.t(d1.i(H), dVar, null, new le.y(H, continuation, 0), 2);
        xVar.getClass();
        jg.d dVar2 = MyApp.f6830c;
        H.f20009e = eg.c0.t(dVar2, dVar, null, new le.u(H, continuation, 4), 2);
        H.f20010f = eg.c0.t(dVar2, dVar, null, new le.u(H, continuation, i10), 2);
        x.H(xVar);
        eg.c0.t(d1.i(H), null, null, new le.u(H, continuation, 6), 3);
        c0 c0Var = (c0) this.f22459a;
        if (c0Var != null) {
            c0Var.f8891g.setListener(this);
        }
        H().f20012h.e(getViewLifecycleOwner(), this.f6950d);
        H().f20024v.e(getViewLifecycleOwner(), this.f6951e);
        H().f20025w.e(getViewLifecycleOwner(), this.f6949c);
        H().f20026x.e(getViewLifecycleOwner(), this.f6948b);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        z H = H();
        t1 t1Var = H.f20006b;
        if (t1Var != null) {
            t1Var.k(null);
        }
        H.f20006b = null;
        t1 t1Var2 = H.f20007c;
        if (t1Var2 != null) {
            t1Var2.k(null);
        }
        t1 t1Var3 = H.f20008d;
        if (t1Var3 != null) {
            t1Var3.k(null);
        }
        H.f20007c = null;
        H.f20008d = null;
        t1 t1Var4 = H.f20009e;
        if (t1Var4 != null) {
            t1Var4.k(null);
        }
        H.f20009e = null;
        t1 t1Var5 = H.f20010f;
        if (t1Var5 != null) {
            t1Var5.k(null);
        }
        H.f20010f = null;
        c0 c0Var = (c0) this.f22459a;
        if (c0Var != null) {
            c0Var.f8891g.setListener(null);
        }
        H().f20012h.i(this.f6950d);
        H().f20024v.i(this.f6951e);
        H().f20025w.i(this.f6949c);
        H().f20026x.i(this.f6948b);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        ag.c navArgsClass = Reflection.getOrCreateKotlinClass(le.q.class);
        i argumentProducer = new i(5, this);
        Intrinsics.checkNotNullParameter(navArgsClass, "navArgsClass");
        Intrinsics.checkNotNullParameter(argumentProducer, "argumentProducer");
        z H = H();
        Bundle bundle2 = (Bundle) argumentProducer.invoke();
        s.e eVar = y1.j.f25572b;
        Method method = (Method) eVar.get(navArgsClass);
        if (method == null) {
            method = u6.h.k(navArgsClass).getMethod("fromBundle", (Class[]) Arrays.copyOf(y1.j.f25571a, 1));
            eVar.put(navArgsClass, method);
            Intrinsics.checkNotNullExpressionValue(method, "also(...)");
        }
        Object invoke = method.invoke(null, bundle2);
        Intrinsics.checkNotNull(invoke, "null cannot be cast to non-null type Args of androidx.navigation.NavArgsLazy");
        H.f20014k = ((le.q) ((y1.i) invoke)).a();
        H.f20013i = false;
        eg.c0.t(d1.g(this), null, null, new androidx.lifecycle.o(this, view, (Continuation) null, 26), 3);
        z H2 = H();
        H2.f20027y.getClass();
        WeakReference weakReference = new WeakReference(new dd.a());
        if (((dd.a) weakReference.get()) == null) {
            weakReference = new WeakReference(new dd.a());
        }
        dd.a aVar = (dd.a) weakReference.get();
        if (aVar != null) {
            aVar.w().c("live_pay_screen_show", null);
            Unit unit = Unit.f19194a;
        }
        x.H(H2.f20027y);
    }
}
