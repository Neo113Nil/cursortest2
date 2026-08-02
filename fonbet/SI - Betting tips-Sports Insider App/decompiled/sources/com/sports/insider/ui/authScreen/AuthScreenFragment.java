package com.sports.insider.ui.authScreen;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.d1;
import androidx.lifecycle.e0;
import androidx.lifecycle.g0;
import androidx.lifecycle.q0;
import c4.o;
import c4.v;
import c4.w;
import com.google.android.gms.internal.measurement.y3;
import com.google.android.material.textview.MaterialTextView;
import com.google.android.play.core.appupdate.b;
import com.sports.insider.R;
import com.sports.insider.ui.authScreen.AuthScreenFragment;
import ec.c;
import eg.c0;
import eg.m0;
import eg.t1;
import eg.y;
import gf.k;
import gf.t;
import gf.u;
import hg.t0;
import java.util.concurrent.atomic.AtomicBoolean;
import ke.f;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import oe.j;
import qd.a;
import qd.e;
import qd.g;
import qd.h;
import rc.x;
import y1.b0;
import y1.d0;
import y1.r;
import zc.d;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/sports/insider/ui/authScreen/AuthScreenFragment;", "Lqd/e;", "Lec/c;", "<init>", "()V", "Betting-123_googleProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAuthScreenFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AuthScreenFragment.kt\ncom/sports/insider/ui/authScreen/AuthScreenFragment\n+ 2 singletonImageLoaders.android.kt\ncoil3/SingletonImageLoaders_androidKt\n+ 3 singletonImageLoaders.android.kt\ncoil3/SingletonImageLoaders_androidKt$load$1\n*L\n1#1,166:1\n35#2,3:167\n17#2:170\n40#2,6:171\n35#2,3:177\n17#2:180\n38#2,6:181\n44#2,2:188\n35#2,3:190\n17#2:193\n40#2,6:194\n52#2,2:200\n52#2,2:202\n52#2,2:204\n38#3:187\n*S KotlinDebug\n*F\n+ 1 AuthScreenFragment.kt\ncom/sports/insider/ui/authScreen/AuthScreenFragment\n*L\n71#1:167,3\n71#1:170\n71#1:171,6\n75#1:177,3\n75#1:180\n75#1:181,6\n75#1:188,2\n76#1:190,3\n76#1:193\n76#1:194,6\n162#1:200,2\n163#1:202,2\n164#1:204,2\n75#1:187\n*E\n"})
/* loaded from: classes.dex */
public final class AuthScreenFragment extends e<c> {

    /* renamed from: g, reason: collision with root package name */
    public final a f6902g;

    /* renamed from: h, reason: collision with root package name */
    public final a f6903h;

    /* renamed from: i, reason: collision with root package name */
    public final a f6904i;
    public final a j;

    /* renamed from: k, reason: collision with root package name */
    public final a f6905k;

    /* renamed from: f, reason: collision with root package name */
    public final t f6901f = k.b(new me.a(11, this));

    /* renamed from: l, reason: collision with root package name */
    public final f f6906l = new f(1, true);

    /* JADX WARN: Type inference failed for: r0v2, types: [qd.a] */
    /* JADX WARN: Type inference failed for: r0v3, types: [qd.a] */
    /* JADX WARN: Type inference failed for: r0v4, types: [qd.a] */
    /* JADX WARN: Type inference failed for: r0v5, types: [qd.a] */
    /* JADX WARN: Type inference failed for: r0v6, types: [qd.a] */
    public AuthScreenFragment() {
        final int i5 = 0;
        this.f6902g = new q0(this) { // from class: qd.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AuthScreenFragment f22096b;

            {
                this.f22096b = this;
            }

            @Override // androidx.lifecycle.q0
            public final void a(Object obj) {
                switch (i5) {
                    case 0:
                        Boolean bool = (Boolean) obj;
                        ec.c cVar = (ec.c) this.f22096b.f22459a;
                        if (cVar != null) {
                            cVar.f8879c.setVisibility(Intrinsics.areEqual(bool, Boolean.TRUE) ? 0 : 4);
                            break;
                        }
                        break;
                    case 1:
                        String str = (String) obj;
                        AuthScreenFragment authScreenFragment = this.f22096b;
                        ec.c cVar2 = (ec.c) authScreenFragment.f22459a;
                        if (cVar2 != null) {
                            cVar2.f8884h.setText(str);
                        }
                        ec.c cVar3 = (ec.c) authScreenFragment.f22459a;
                        if (cVar3 != null) {
                            cVar3.f8884h.setVisibility(str != null ? 0 : 4);
                            break;
                        }
                        break;
                    case 2:
                        String str2 = (String) obj;
                        ec.c cVar4 = (ec.c) this.f22096b.f22459a;
                        if (cVar4 != null) {
                            cVar4.f8883g.setText(str2);
                            break;
                        }
                        break;
                    case 3:
                        String str3 = (String) obj;
                        ec.c cVar5 = (ec.c) this.f22096b.f22459a;
                        if (cVar5 != null) {
                            cVar5.f8880d.setText(str3);
                            break;
                        }
                        break;
                    default:
                        String str4 = (String) obj;
                        ec.c cVar6 = (ec.c) this.f22096b.f22459a;
                        if (cVar6 != null) {
                            cVar6.f8878b.setText(str4);
                            break;
                        }
                        break;
                }
            }
        };
        final int i10 = 1;
        this.f6903h = new q0(this) { // from class: qd.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AuthScreenFragment f22096b;

            {
                this.f22096b = this;
            }

            @Override // androidx.lifecycle.q0
            public final void a(Object obj) {
                switch (i10) {
                    case 0:
                        Boolean bool = (Boolean) obj;
                        ec.c cVar = (ec.c) this.f22096b.f22459a;
                        if (cVar != null) {
                            cVar.f8879c.setVisibility(Intrinsics.areEqual(bool, Boolean.TRUE) ? 0 : 4);
                            break;
                        }
                        break;
                    case 1:
                        String str = (String) obj;
                        AuthScreenFragment authScreenFragment = this.f22096b;
                        ec.c cVar2 = (ec.c) authScreenFragment.f22459a;
                        if (cVar2 != null) {
                            cVar2.f8884h.setText(str);
                        }
                        ec.c cVar3 = (ec.c) authScreenFragment.f22459a;
                        if (cVar3 != null) {
                            cVar3.f8884h.setVisibility(str != null ? 0 : 4);
                            break;
                        }
                        break;
                    case 2:
                        String str2 = (String) obj;
                        ec.c cVar4 = (ec.c) this.f22096b.f22459a;
                        if (cVar4 != null) {
                            cVar4.f8883g.setText(str2);
                            break;
                        }
                        break;
                    case 3:
                        String str3 = (String) obj;
                        ec.c cVar5 = (ec.c) this.f22096b.f22459a;
                        if (cVar5 != null) {
                            cVar5.f8880d.setText(str3);
                            break;
                        }
                        break;
                    default:
                        String str4 = (String) obj;
                        ec.c cVar6 = (ec.c) this.f22096b.f22459a;
                        if (cVar6 != null) {
                            cVar6.f8878b.setText(str4);
                            break;
                        }
                        break;
                }
            }
        };
        final int i11 = 2;
        this.f6904i = new q0(this) { // from class: qd.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AuthScreenFragment f22096b;

            {
                this.f22096b = this;
            }

            @Override // androidx.lifecycle.q0
            public final void a(Object obj) {
                switch (i11) {
                    case 0:
                        Boolean bool = (Boolean) obj;
                        ec.c cVar = (ec.c) this.f22096b.f22459a;
                        if (cVar != null) {
                            cVar.f8879c.setVisibility(Intrinsics.areEqual(bool, Boolean.TRUE) ? 0 : 4);
                            break;
                        }
                        break;
                    case 1:
                        String str = (String) obj;
                        AuthScreenFragment authScreenFragment = this.f22096b;
                        ec.c cVar2 = (ec.c) authScreenFragment.f22459a;
                        if (cVar2 != null) {
                            cVar2.f8884h.setText(str);
                        }
                        ec.c cVar3 = (ec.c) authScreenFragment.f22459a;
                        if (cVar3 != null) {
                            cVar3.f8884h.setVisibility(str != null ? 0 : 4);
                            break;
                        }
                        break;
                    case 2:
                        String str2 = (String) obj;
                        ec.c cVar4 = (ec.c) this.f22096b.f22459a;
                        if (cVar4 != null) {
                            cVar4.f8883g.setText(str2);
                            break;
                        }
                        break;
                    case 3:
                        String str3 = (String) obj;
                        ec.c cVar5 = (ec.c) this.f22096b.f22459a;
                        if (cVar5 != null) {
                            cVar5.f8880d.setText(str3);
                            break;
                        }
                        break;
                    default:
                        String str4 = (String) obj;
                        ec.c cVar6 = (ec.c) this.f22096b.f22459a;
                        if (cVar6 != null) {
                            cVar6.f8878b.setText(str4);
                            break;
                        }
                        break;
                }
            }
        };
        final int i12 = 3;
        this.j = new q0(this) { // from class: qd.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AuthScreenFragment f22096b;

            {
                this.f22096b = this;
            }

            @Override // androidx.lifecycle.q0
            public final void a(Object obj) {
                switch (i12) {
                    case 0:
                        Boolean bool = (Boolean) obj;
                        ec.c cVar = (ec.c) this.f22096b.f22459a;
                        if (cVar != null) {
                            cVar.f8879c.setVisibility(Intrinsics.areEqual(bool, Boolean.TRUE) ? 0 : 4);
                            break;
                        }
                        break;
                    case 1:
                        String str = (String) obj;
                        AuthScreenFragment authScreenFragment = this.f22096b;
                        ec.c cVar2 = (ec.c) authScreenFragment.f22459a;
                        if (cVar2 != null) {
                            cVar2.f8884h.setText(str);
                        }
                        ec.c cVar3 = (ec.c) authScreenFragment.f22459a;
                        if (cVar3 != null) {
                            cVar3.f8884h.setVisibility(str != null ? 0 : 4);
                            break;
                        }
                        break;
                    case 2:
                        String str2 = (String) obj;
                        ec.c cVar4 = (ec.c) this.f22096b.f22459a;
                        if (cVar4 != null) {
                            cVar4.f8883g.setText(str2);
                            break;
                        }
                        break;
                    case 3:
                        String str3 = (String) obj;
                        ec.c cVar5 = (ec.c) this.f22096b.f22459a;
                        if (cVar5 != null) {
                            cVar5.f8880d.setText(str3);
                            break;
                        }
                        break;
                    default:
                        String str4 = (String) obj;
                        ec.c cVar6 = (ec.c) this.f22096b.f22459a;
                        if (cVar6 != null) {
                            cVar6.f8878b.setText(str4);
                            break;
                        }
                        break;
                }
            }
        };
        final int i13 = 4;
        this.f6905k = new q0(this) { // from class: qd.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AuthScreenFragment f22096b;

            {
                this.f22096b = this;
            }

            @Override // androidx.lifecycle.q0
            public final void a(Object obj) {
                switch (i13) {
                    case 0:
                        Boolean bool = (Boolean) obj;
                        ec.c cVar = (ec.c) this.f22096b.f22459a;
                        if (cVar != null) {
                            cVar.f8879c.setVisibility(Intrinsics.areEqual(bool, Boolean.TRUE) ? 0 : 4);
                            break;
                        }
                        break;
                    case 1:
                        String str = (String) obj;
                        AuthScreenFragment authScreenFragment = this.f22096b;
                        ec.c cVar2 = (ec.c) authScreenFragment.f22459a;
                        if (cVar2 != null) {
                            cVar2.f8884h.setText(str);
                        }
                        ec.c cVar3 = (ec.c) authScreenFragment.f22459a;
                        if (cVar3 != null) {
                            cVar3.f8884h.setVisibility(str != null ? 0 : 4);
                            break;
                        }
                        break;
                    case 2:
                        String str2 = (String) obj;
                        ec.c cVar4 = (ec.c) this.f22096b.f22459a;
                        if (cVar4 != null) {
                            cVar4.f8883g.setText(str2);
                            break;
                        }
                        break;
                    case 3:
                        String str3 = (String) obj;
                        ec.c cVar5 = (ec.c) this.f22096b.f22459a;
                        if (cVar5 != null) {
                            cVar5.f8880d.setText(str3);
                            break;
                        }
                        break;
                    default:
                        String str4 = (String) obj;
                        ec.c cVar6 = (ec.c) this.f22096b.f22459a;
                        if (cVar6 != null) {
                            cVar6.f8878b.setText(str4);
                            break;
                        }
                        break;
                }
            }
        };
    }

    @Override // rd.a
    public final b3.a F(LayoutInflater inflater, ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View inflate = inflater.inflate(R.layout.fragment_auth_screen, viewGroup, false);
        int i5 = R.id.btn_auth;
        MaterialTextView materialTextView = (MaterialTextView) y3.j(R.id.btn_auth, inflate);
        if (materialTextView != null) {
            i5 = R.id.btn_close;
            AppCompatImageView appCompatImageView = (AppCompatImageView) y3.j(R.id.btn_close, inflate);
            if (appCompatImageView != null) {
                i5 = R.id.btn_frame;
                if (((FrameLayout) y3.j(R.id.btn_frame, inflate)) != null) {
                    i5 = R.id.check_spam;
                    TextView textView = (TextView) y3.j(R.id.check_spam, inflate);
                    if (textView != null) {
                        i5 = R.id.ivBackground;
                        AppCompatImageView appCompatImageView2 = (AppCompatImageView) y3.j(R.id.ivBackground, inflate);
                        if (appCompatImageView2 != null) {
                            i5 = R.id.ivLogo;
                            AppCompatImageView appCompatImageView3 = (AppCompatImageView) y3.j(R.id.ivLogo, inflate);
                            if (appCompatImageView3 != null) {
                                i5 = R.id.sub_title_desc;
                                TextView textView2 = (TextView) y3.j(R.id.sub_title_desc, inflate);
                                if (textView2 != null) {
                                    i5 = R.id.title_desc;
                                    TextView textView3 = (TextView) y3.j(R.id.title_desc, inflate);
                                    if (textView3 != null) {
                                        c cVar = new c((ConstraintLayout) inflate, materialTextView, appCompatImageView, textView, appCompatImageView2, appCompatImageView3, textView2, textView3);
                                        Intrinsics.checkNotNullExpressionValue(cVar, "inflate(...)");
                                        return cVar;
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

    @Override // qd.e
    public final void H(String authPlatformToken) {
        if (authPlatformToken == null) {
            J().getClass();
            t0 t0Var = x.f22455a;
            Intrinsics.checkNotNullParameter("google authorization error", "msg");
            x.f22455a.b(new u(null, 500, "google authorization error"));
            return;
        }
        if (Intrinsics.areEqual(authPlatformToken, this.f22106b)) {
            J().e();
            return;
        }
        h J = J();
        J.getClass();
        Intrinsics.checkNotNullParameter(authPlatformToken, "authPlatformToken");
        u1.a i5 = d1.i(J);
        w wVar = zc.a.f25907a;
        y yVar = new y("signIn");
        wVar.getClass();
        c0.t(i5, kotlin.coroutines.e.c(wVar, yVar), null, new j(J, authPlatformToken, (Continuation) null, 18), 2);
    }

    public final h J() {
        return (h) this.f6901f.getValue();
    }

    public final void K() {
        try {
            if (!((g0) getLifecycle()).f2169d.a(androidx.lifecycle.x.f2256d)) {
                d.c("AuthScreenFragment isNotAtLeast State.STARTED", "toStrip");
                return;
            }
            r r5 = a.a.r(this);
            d0 g10 = r5.f25625b.g();
            if (g10 != null && g10.f25543g.f3078a != R.id.allPredictionsFragment) {
                g10.l(R.id.allPredictionsFragment);
            }
            b0 f6 = r5.f25625b.f();
            Integer valueOf = f6 != null ? Integer.valueOf(f6.f25534b.f3017e) : null;
            if (valueOf != null && valueOf.intValue() == R.id.authScreenFragment) {
                y1.a aVar = new y1.a(R.id.action_authScreenFragment_to_allPredictionsFragment);
                Intrinsics.checkNotNullExpressionValue(aVar, "actionAuthScreenFragment…lPredictionsFragment(...)");
                r5.d(aVar);
                return;
            }
            y1.a b10 = b.b();
            Intrinsics.checkNotNullExpressionValue(b10, "actionGlobalAllPredictionsFragment(...)");
            r5.d(b10);
        } catch (Exception unused) {
            J().e();
            if (!((g0) getLifecycle()).f2169d.a(androidx.lifecycle.x.f2256d)) {
                d.c("AuthScreenFragment isNotAtLeast State.STARTED", "toStrip");
                return;
            }
            r r6 = a.a.r(this);
            d0 g11 = r6.f25625b.g();
            if (g11 != null && g11.f25543g.f3078a != R.id.allPredictionsFragment) {
                g11.l(R.id.allPredictionsFragment);
            }
            y1.a b11 = b.b();
            Intrinsics.checkNotNullExpressionValue(b11, "actionGlobalAllPredictionsFragment(...)");
            r6.d(b11);
        }
    }

    @Override // rd.a, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f6906l.e();
        c cVar = (c) this.f22459a;
        if (cVar != null) {
            k2.x.s(cVar.f8882f).a();
        }
        c cVar2 = (c) this.f22459a;
        if (cVar2 != null) {
            k2.x.s(cVar2.f8881e).a();
        }
        c cVar3 = (c) this.f22459a;
        if (cVar3 != null) {
            k2.x.s(cVar3.f8879c).a();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        h J = J();
        t1 t1Var = J.f22116c;
        if (t1Var != null) {
            t1Var.k(null);
        }
        J.f22116c = null;
        c0.t(d1.i(J), null, null, new qd.f(J, null, 0), 3);
        c0.t(d1.i(J), null, null, new g(J, null, 2), 3);
        J().f22127o.e(getViewLifecycleOwner(), this.f6902g);
        J().f22123k.e(getViewLifecycleOwner(), this.f6903h);
        J().f22124l.e(getViewLifecycleOwner(), this.f6904i);
        J().f22125m.e(getViewLifecycleOwner(), this.j);
        J().f22126n.e(getViewLifecycleOwner(), this.f6905k);
        c cVar = (c) this.f22459a;
        if (cVar != null) {
            final int i5 = 0;
            io.sentry.config.a.y(cVar.f8879c, 600L, new Function1(this) { // from class: qd.b

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ AuthScreenFragment f22098b;

                {
                    this.f22098b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    int i10 = i5;
                    AuthScreenFragment authScreenFragment = this.f22098b;
                    switch (i10) {
                        case 0:
                            h J2 = authScreenFragment.J();
                            J2.getClass();
                            u1.a i11 = d1.i(J2);
                            lg.e eVar = m0.f9201a;
                            c0.t(i11, lg.d.f20063c, null, new g(J2, null, 1), 2);
                            authScreenFragment.K();
                            break;
                        default:
                            AtomicBoolean atomicBoolean = authScreenFragment.J().f22115b;
                            if (atomicBoolean == null || !atomicBoolean.get()) {
                                authScreenFragment.G();
                            } else {
                                authScreenFragment.K();
                            }
                            break;
                    }
                    return Unit.f19194a;
                }
            });
        }
        c cVar2 = (c) this.f22459a;
        if (cVar2 != null) {
            final int i10 = 1;
            io.sentry.config.a.y(cVar2.f8878b, 600L, new Function1(this) { // from class: qd.b

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ AuthScreenFragment f22098b;

                {
                    this.f22098b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    int i102 = i10;
                    AuthScreenFragment authScreenFragment = this.f22098b;
                    switch (i102) {
                        case 0:
                            h J2 = authScreenFragment.J();
                            J2.getClass();
                            u1.a i11 = d1.i(J2);
                            lg.e eVar = m0.f9201a;
                            c0.t(i11, lg.d.f20063c, null, new g(J2, null, 1), 2);
                            authScreenFragment.K();
                            break;
                        default:
                            AtomicBoolean atomicBoolean = authScreenFragment.J().f22115b;
                            if (atomicBoolean == null || !atomicBoolean.get()) {
                                authScreenFragment.G();
                            } else {
                                authScreenFragment.K();
                            }
                            break;
                    }
                    return Unit.f19194a;
                }
            });
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        h J = J();
        t1 t1Var = J.f22116c;
        if (t1Var != null) {
            t1Var.k(null);
        }
        J.f22116c = null;
        J().f22127o.i(this.f6902g);
        J().f22123k.i(this.f6903h);
        J().f22124l.i(this.f6904i);
        J().f22125m.i(this.j);
        J().f22126n.i(this.f6905k);
        c cVar = (c) this.f22459a;
        if (cVar != null) {
            cVar.f8879c.setOnClickListener(null);
        }
        c cVar2 = (c) this.f22459a;
        if (cVar2 != null) {
            cVar2.f8878b.setOnClickListener(null);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        if (J().j != null) {
            new io.sentry.hints.j(6).E("open_reg");
        }
        e.d0 onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        e0 viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        onBackPressedDispatcher.a(viewLifecycleOwner, this.f6906l);
        c cVar = (c) this.f22459a;
        if (cVar != null) {
            AppCompatImageView appCompatImageView = cVar.f8882f;
            Integer valueOf = Integer.valueOf(R.drawable.ic_app);
            o a7 = c4.y.a(appCompatImageView.getContext());
            q4.e eVar = new q4.e(appCompatImageView.getContext());
            eVar.f21940c = valueOf;
            q4.j.d(eVar, appCompatImageView);
            int o3 = io.sentry.config.a.o(86);
            if (o3 > 0) {
                eVar.c(o3, o3);
            }
            ((v) a7).a(eVar.a());
        }
        c cVar2 = (c) this.f22459a;
        if (cVar2 != null) {
            AppCompatImageView appCompatImageView2 = cVar2.f8881e;
            Integer valueOf2 = Integer.valueOf(R.drawable.girl_bet);
            o a10 = c4.y.a(appCompatImageView2.getContext());
            q4.e eVar2 = new q4.e(appCompatImageView2.getContext());
            eVar2.f21940c = valueOf2;
            q4.j.d(eVar2, appCompatImageView2);
            ((v) a10).a(eVar2.a());
        }
        c cVar3 = (c) this.f22459a;
        if (cVar3 != null) {
            AppCompatImageView appCompatImageView3 = cVar3.f8879c;
            Integer valueOf3 = Integer.valueOf(R.drawable.ic_cross_inside_circle);
            o a11 = c4.y.a(appCompatImageView3.getContext());
            q4.e eVar3 = new q4.e(appCompatImageView3.getContext());
            eVar3.f21940c = valueOf3;
            q4.j.d(eVar3, appCompatImageView3);
            int o4 = io.sentry.config.a.o(36);
            if (o4 > 0) {
                eVar3.c(o4, o4);
            }
            ((v) a11).a(eVar3.a());
        }
    }
}
