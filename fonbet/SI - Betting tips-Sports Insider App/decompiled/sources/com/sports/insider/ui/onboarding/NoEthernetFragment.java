package com.sports.insider.ui.onboarding;

import a2.q;
import ag.c;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.p0;
import androidx.lifecycle.d1;
import androidx.lifecycle.e0;
import androidx.lifecycle.g0;
import androidx.lifecycle.q0;
import com.google.android.gms.internal.measurement.y3;
import com.sports.insider.MyApp;
import com.sports.insider.R;
import com.sports.insider.ui.onboarding.NoEthernetFragment;
import ec.u;
import eg.c0;
import eg.t1;
import ge.d;
import gf.k;
import gf.t;
import i3.i;
import java.lang.reflect.Method;
import java.util.Arrays;
import k2.x;
import ke.l;
import ke.m;
import ke.s;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.d0;
import me.y;
import oe.g;
import rc.b0;
import rd.a;
import s.e;
import u6.h;
import y1.j;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lcom/sports/insider/ui/onboarding/NoEthernetFragment;", "Lrd/a;", "Lec/u;", "<init>", "()V", "Lke/s;", "navArgs", "Betting-123_googleProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nNoEthernetFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NoEthernetFragment.kt\ncom/sports/insider/ui/onboarding/NoEthernetFragment\n+ 2 FragmentNavArgsLazy.kt\nandroidx/navigation/fragment/FragmentNavArgsLazyKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 singletonImageLoaders.android.kt\ncoil3/SingletonImageLoaders_androidKt\n*L\n1#1,215:1\n42#2,3:216\n1#3:219\n52#4,2:220\n*S KotlinDebug\n*F\n+ 1 NoEthernetFragment.kt\ncom/sports/insider/ui/onboarding/NoEthernetFragment\n*L\n44#1:216,3\n213#1:220,2\n*E\n"})
/* loaded from: classes.dex */
public final class NoEthernetFragment extends a<u> {

    /* renamed from: c, reason: collision with root package name */
    public s f6940c;

    /* renamed from: e, reason: collision with root package name */
    public final l f6942e;

    /* renamed from: f, reason: collision with root package name */
    public final l f6943f;

    /* renamed from: g, reason: collision with root package name */
    public final l f6944g;

    /* renamed from: b, reason: collision with root package name */
    public final d f6939b = new d(this, 2);

    /* renamed from: d, reason: collision with root package name */
    public final t f6941d = k.b(new q(22, this));

    /* renamed from: h, reason: collision with root package name */
    public final m f6945h = new m(0);

    /* JADX WARN: Type inference failed for: r0v3, types: [ke.l] */
    /* JADX WARN: Type inference failed for: r0v4, types: [ke.l] */
    /* JADX WARN: Type inference failed for: r0v5, types: [ke.l] */
    public NoEthernetFragment() {
        final int i5 = 0;
        this.f6942e = new q0(this) { // from class: ke.l

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NoEthernetFragment f19042b;

            {
                this.f19042b = this;
            }

            @Override // androidx.lifecycle.q0
            public final void a(Object obj) {
                ec.u uVar;
                switch (i5) {
                    case 0:
                        String str = (String) obj;
                        ec.u uVar2 = (ec.u) this.f19042b.f22459a;
                        if (uVar2 != null) {
                            TextView textView = uVar2.j;
                            if (str == null) {
                                str = "";
                            }
                            textView.setText(str);
                            break;
                        }
                        break;
                    case 1:
                        String str2 = (String) obj;
                        ec.u uVar3 = (ec.u) this.f19042b.f22459a;
                        if (uVar3 != null) {
                            TextView textView2 = uVar3.f9015i;
                            if (str2 == null) {
                                str2 = "";
                            }
                            textView2.setText(str2);
                            break;
                        }
                        break;
                    default:
                        Boolean bool = (Boolean) obj;
                        NoEthernetFragment noEthernetFragment = this.f19042b;
                        ec.u uVar4 = (ec.u) noEthernetFragment.f22459a;
                        boolean isEnabled = uVar4 != null ? uVar4.f9010d.isEnabled() : false;
                        if (!Intrinsics.areEqual(Boolean.valueOf(isEnabled), bool) && (uVar = (ec.u) noEthernetFragment.f22459a) != null) {
                            FrameLayout frameLayout = uVar.f9010d;
                            if (bool != null) {
                                isEnabled = bool.booleanValue();
                            }
                            frameLayout.setEnabled(isEnabled);
                            break;
                        }
                        break;
                }
            }
        };
        final int i10 = 1;
        this.f6943f = new q0(this) { // from class: ke.l

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NoEthernetFragment f19042b;

            {
                this.f19042b = this;
            }

            @Override // androidx.lifecycle.q0
            public final void a(Object obj) {
                ec.u uVar;
                switch (i10) {
                    case 0:
                        String str = (String) obj;
                        ec.u uVar2 = (ec.u) this.f19042b.f22459a;
                        if (uVar2 != null) {
                            TextView textView = uVar2.j;
                            if (str == null) {
                                str = "";
                            }
                            textView.setText(str);
                            break;
                        }
                        break;
                    case 1:
                        String str2 = (String) obj;
                        ec.u uVar3 = (ec.u) this.f19042b.f22459a;
                        if (uVar3 != null) {
                            TextView textView2 = uVar3.f9015i;
                            if (str2 == null) {
                                str2 = "";
                            }
                            textView2.setText(str2);
                            break;
                        }
                        break;
                    default:
                        Boolean bool = (Boolean) obj;
                        NoEthernetFragment noEthernetFragment = this.f19042b;
                        ec.u uVar4 = (ec.u) noEthernetFragment.f22459a;
                        boolean isEnabled = uVar4 != null ? uVar4.f9010d.isEnabled() : false;
                        if (!Intrinsics.areEqual(Boolean.valueOf(isEnabled), bool) && (uVar = (ec.u) noEthernetFragment.f22459a) != null) {
                            FrameLayout frameLayout = uVar.f9010d;
                            if (bool != null) {
                                isEnabled = bool.booleanValue();
                            }
                            frameLayout.setEnabled(isEnabled);
                            break;
                        }
                        break;
                }
            }
        };
        final int i11 = 2;
        this.f6944g = new q0(this) { // from class: ke.l

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NoEthernetFragment f19042b;

            {
                this.f19042b = this;
            }

            @Override // androidx.lifecycle.q0
            public final void a(Object obj) {
                ec.u uVar;
                switch (i11) {
                    case 0:
                        String str = (String) obj;
                        ec.u uVar2 = (ec.u) this.f19042b.f22459a;
                        if (uVar2 != null) {
                            TextView textView = uVar2.j;
                            if (str == null) {
                                str = "";
                            }
                            textView.setText(str);
                            break;
                        }
                        break;
                    case 1:
                        String str2 = (String) obj;
                        ec.u uVar3 = (ec.u) this.f19042b.f22459a;
                        if (uVar3 != null) {
                            TextView textView2 = uVar3.f9015i;
                            if (str2 == null) {
                                str2 = "";
                            }
                            textView2.setText(str2);
                            break;
                        }
                        break;
                    default:
                        Boolean bool = (Boolean) obj;
                        NoEthernetFragment noEthernetFragment = this.f19042b;
                        ec.u uVar4 = (ec.u) noEthernetFragment.f22459a;
                        boolean isEnabled = uVar4 != null ? uVar4.f9010d.isEnabled() : false;
                        if (!Intrinsics.areEqual(Boolean.valueOf(isEnabled), bool) && (uVar = (ec.u) noEthernetFragment.f22459a) != null) {
                            FrameLayout frameLayout = uVar.f9010d;
                            if (bool != null) {
                                isEnabled = bool.booleanValue();
                            }
                            frameLayout.setEnabled(isEnabled);
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
        View inflate = inflater.inflate(R.layout.no_ethernet_layout, viewGroup, false);
        int i5 = R.id.btn_check_update;
        FrameLayout frameLayout = (FrameLayout) y3.j(R.id.btn_check_update, inflate);
        if (frameLayout != null) {
            i5 = R.id.btn_ping_google;
            FrameLayout frameLayout2 = (FrameLayout) y3.j(R.id.btn_ping_google, inflate);
            if (frameLayout2 != null) {
                i5 = R.id.btn_reload;
                FrameLayout frameLayout3 = (FrameLayout) y3.j(R.id.btn_reload, inflate);
                if (frameLayout3 != null) {
                    i5 = R.id.btn_support;
                    FrameLayout frameLayout4 = (FrameLayout) y3.j(R.id.btn_support, inflate);
                    if (frameLayout4 != null) {
                        i5 = R.id.title_icon;
                        AppCompatImageView appCompatImageView = (AppCompatImageView) y3.j(R.id.title_icon, inflate);
                        if (appCompatImageView != null) {
                            i5 = R.id.tvCheckUpdate;
                            TextView textView = (TextView) y3.j(R.id.tvCheckUpdate, inflate);
                            if (textView != null) {
                                i5 = R.id.tv_description;
                                TextView textView2 = (TextView) y3.j(R.id.tv_description, inflate);
                                if (textView2 != null) {
                                    i5 = R.id.tv_error;
                                    TextView textView3 = (TextView) y3.j(R.id.tv_error, inflate);
                                    if (textView3 != null) {
                                        i5 = R.id.tv_ping_google;
                                        TextView textView4 = (TextView) y3.j(R.id.tv_ping_google, inflate);
                                        if (textView4 != null) {
                                            i5 = R.id.tvRetry;
                                            TextView textView5 = (TextView) y3.j(R.id.tvRetry, inflate);
                                            if (textView5 != null) {
                                                i5 = R.id.tvSupport;
                                                TextView textView6 = (TextView) y3.j(R.id.tvSupport, inflate);
                                                if (textView6 != null) {
                                                    u uVar = new u((ConstraintLayout) inflate, frameLayout, frameLayout2, frameLayout3, frameLayout4, appCompatImageView, textView, textView2, textView3, textView4, textView5, textView6);
                                                    Intrinsics.checkNotNullExpressionValue(uVar, "inflate(...)");
                                                    return uVar;
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

    public final g G() {
        return (g) this.f6941d.getValue();
    }

    @Override // rd.a, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        AppCompatImageView appCompatImageView;
        super.onDestroyView();
        u uVar = (u) this.f22459a;
        if (uVar == null || (appCompatImageView = uVar.f9012f) == null) {
            return;
        }
        x.s(appCompatImageView).a();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        FrameLayout frameLayout3;
        FrameLayout frameLayout4;
        super.onPause();
        u uVar = (u) this.f22459a;
        if (uVar != null && (frameLayout4 = uVar.f9010d) != null) {
            frameLayout4.setOnClickListener(null);
        }
        u uVar2 = (u) this.f22459a;
        if (uVar2 != null && (frameLayout3 = uVar2.f9009c) != null) {
            frameLayout3.setOnClickListener(null);
        }
        u uVar3 = (u) this.f22459a;
        if (uVar3 != null && (frameLayout2 = uVar3.f9011e) != null) {
            frameLayout2.setOnClickListener(null);
        }
        u uVar4 = (u) this.f22459a;
        if (uVar4 == null || (frameLayout = uVar4.f9008b) == null) {
            return;
        }
        frameLayout.setOnClickListener(null);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        u uVar = (u) this.f22459a;
        if (uVar != null) {
            final int i5 = 0;
            io.sentry.config.a.y(uVar.f9010d, 600L, new Function1(this) { // from class: ke.n

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ NoEthernetFragment f19045b;

                {
                    this.f19045b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    switch (i5) {
                        case 0:
                            NoEthernetFragment noEthernetFragment = this.f19045b;
                            try {
                                if (((g0) noEthernetFragment.getLifecycle()).f2169d.a(androidx.lifecycle.x.f2256d)) {
                                    c0.t(MyApp.f6830c, b0.b(), null, new rc.c(new rc.g(), null, 9), 2);
                                    a.a.r(noEthernetFragment).e();
                                }
                            } catch (Exception e7) {
                                zc.d.b(4, "NoEthernetFragment backClick", e7);
                            }
                            break;
                        case 1:
                            this.f19045b.G().f();
                            break;
                        case 2:
                            NoEthernetFragment noEthernetFragment2 = this.f19045b;
                            oe.g G = noEthernetFragment2.G();
                            Context context = noEthernetFragment2.getContext();
                            Continuation continuation = null;
                            Context applicationContext = context != null ? context.getApplicationContext() : null;
                            s sVar = noEthernetFragment2.f6940c;
                            G.getClass();
                            c0.t(MyApp.f6830c, null, null, new y(sVar, applicationContext, continuation, 1), 3);
                            break;
                        default:
                            p0 activity = this.f19045b.getActivity();
                            com.sports.insider.ui.activities.a aVar = activity instanceof com.sports.insider.ui.activities.a ? (com.sports.insider.ui.activities.a) activity : null;
                            if (aVar != null) {
                                c0.t(d1.g(aVar), com.sports.insider.ui.activities.a.v(), null, new pd.c0(true, aVar, 0L, null), 2);
                            }
                            break;
                    }
                    return Unit.f19194a;
                }
            });
        }
        u uVar2 = (u) this.f22459a;
        if (uVar2 != null) {
            final int i10 = 1;
            io.sentry.config.a.y(uVar2.f9009c, 600L, new Function1(this) { // from class: ke.n

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ NoEthernetFragment f19045b;

                {
                    this.f19045b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    switch (i10) {
                        case 0:
                            NoEthernetFragment noEthernetFragment = this.f19045b;
                            try {
                                if (((g0) noEthernetFragment.getLifecycle()).f2169d.a(androidx.lifecycle.x.f2256d)) {
                                    c0.t(MyApp.f6830c, b0.b(), null, new rc.c(new rc.g(), null, 9), 2);
                                    a.a.r(noEthernetFragment).e();
                                }
                            } catch (Exception e7) {
                                zc.d.b(4, "NoEthernetFragment backClick", e7);
                            }
                            break;
                        case 1:
                            this.f19045b.G().f();
                            break;
                        case 2:
                            NoEthernetFragment noEthernetFragment2 = this.f19045b;
                            oe.g G = noEthernetFragment2.G();
                            Context context = noEthernetFragment2.getContext();
                            Continuation continuation = null;
                            Context applicationContext = context != null ? context.getApplicationContext() : null;
                            s sVar = noEthernetFragment2.f6940c;
                            G.getClass();
                            c0.t(MyApp.f6830c, null, null, new y(sVar, applicationContext, continuation, 1), 3);
                            break;
                        default:
                            p0 activity = this.f19045b.getActivity();
                            com.sports.insider.ui.activities.a aVar = activity instanceof com.sports.insider.ui.activities.a ? (com.sports.insider.ui.activities.a) activity : null;
                            if (aVar != null) {
                                c0.t(d1.g(aVar), com.sports.insider.ui.activities.a.v(), null, new pd.c0(true, aVar, 0L, null), 2);
                            }
                            break;
                    }
                    return Unit.f19194a;
                }
            });
        }
        u uVar3 = (u) this.f22459a;
        if (uVar3 != null) {
            final int i11 = 2;
            io.sentry.config.a.y(uVar3.f9011e, 600L, new Function1(this) { // from class: ke.n

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ NoEthernetFragment f19045b;

                {
                    this.f19045b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    switch (i11) {
                        case 0:
                            NoEthernetFragment noEthernetFragment = this.f19045b;
                            try {
                                if (((g0) noEthernetFragment.getLifecycle()).f2169d.a(androidx.lifecycle.x.f2256d)) {
                                    c0.t(MyApp.f6830c, b0.b(), null, new rc.c(new rc.g(), null, 9), 2);
                                    a.a.r(noEthernetFragment).e();
                                }
                            } catch (Exception e7) {
                                zc.d.b(4, "NoEthernetFragment backClick", e7);
                            }
                            break;
                        case 1:
                            this.f19045b.G().f();
                            break;
                        case 2:
                            NoEthernetFragment noEthernetFragment2 = this.f19045b;
                            oe.g G = noEthernetFragment2.G();
                            Context context = noEthernetFragment2.getContext();
                            Continuation continuation = null;
                            Context applicationContext = context != null ? context.getApplicationContext() : null;
                            s sVar = noEthernetFragment2.f6940c;
                            G.getClass();
                            c0.t(MyApp.f6830c, null, null, new y(sVar, applicationContext, continuation, 1), 3);
                            break;
                        default:
                            p0 activity = this.f19045b.getActivity();
                            com.sports.insider.ui.activities.a aVar = activity instanceof com.sports.insider.ui.activities.a ? (com.sports.insider.ui.activities.a) activity : null;
                            if (aVar != null) {
                                c0.t(d1.g(aVar), com.sports.insider.ui.activities.a.v(), null, new pd.c0(true, aVar, 0L, null), 2);
                            }
                            break;
                    }
                    return Unit.f19194a;
                }
            });
        }
        u uVar4 = (u) this.f22459a;
        if (uVar4 != null) {
            final int i12 = 3;
            io.sentry.config.a.y(uVar4.f9008b, 600L, new Function1(this) { // from class: ke.n

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ NoEthernetFragment f19045b;

                {
                    this.f19045b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    switch (i12) {
                        case 0:
                            NoEthernetFragment noEthernetFragment = this.f19045b;
                            try {
                                if (((g0) noEthernetFragment.getLifecycle()).f2169d.a(androidx.lifecycle.x.f2256d)) {
                                    c0.t(MyApp.f6830c, b0.b(), null, new rc.c(new rc.g(), null, 9), 2);
                                    a.a.r(noEthernetFragment).e();
                                }
                            } catch (Exception e7) {
                                zc.d.b(4, "NoEthernetFragment backClick", e7);
                            }
                            break;
                        case 1:
                            this.f19045b.G().f();
                            break;
                        case 2:
                            NoEthernetFragment noEthernetFragment2 = this.f19045b;
                            oe.g G = noEthernetFragment2.G();
                            Context context = noEthernetFragment2.getContext();
                            Continuation continuation = null;
                            Context applicationContext = context != null ? context.getApplicationContext() : null;
                            s sVar = noEthernetFragment2.f6940c;
                            G.getClass();
                            c0.t(MyApp.f6830c, null, null, new y(sVar, applicationContext, continuation, 1), 3);
                            break;
                        default:
                            p0 activity = this.f19045b.getActivity();
                            com.sports.insider.ui.activities.a aVar = activity instanceof com.sports.insider.ui.activities.a ? (com.sports.insider.ui.activities.a) activity : null;
                            if (aVar != null) {
                                c0.t(d1.g(aVar), com.sports.insider.ui.activities.a.v(), null, new pd.c0(true, aVar, 0L, null), 2);
                            }
                            break;
                    }
                    return Unit.f19194a;
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0194  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onStart() {
        String sb2;
        Context context;
        we.a aVar;
        super.onStart();
        g G = G();
        s sVar = this.f6940c;
        androidx.lifecycle.p0 p0Var = G.f21191k;
        Continuation continuation = null;
        Integer valueOf = sVar != null ? Integer.valueOf(sVar.b()) : null;
        String str = "The server is temporarily unavailable";
        if (valueOf == null) {
            sb2 = null;
        } else if (valueOf.intValue() == 204 || valueOf.intValue() == 602 || valueOf.intValue() == 607 || valueOf.intValue() == 601 || valueOf.intValue() == 603 || valueOf.intValue() == 600) {
            StringBuilder sb3 = new StringBuilder("httpCode");
            sb3.append(sVar.b());
            sb3.append(";");
            String a7 = sVar.a();
            if (a7 != null && a7.length() > 0) {
                sb3.append(d0.z(200, a7));
            }
            sb2 = sb3.toString();
        } else if (valueOf.intValue() == 608) {
            sb2 = "Secure SSL connection error.";
        } else if (valueOf.intValue() == 605) {
            sb2 = "The server response timeout has been exceeded, try again";
        } else if (valueOf.intValue() == 606) {
            sb2 = "An error detected by the SSL subsystem during connection establishment. The Internet Security Research Group (IRG Root X1/X2) system certificate is expired or missing on the device.";
        } else if (valueOf.intValue() == 502 || valueOf.intValue() == 504) {
            sb2 = "The server is temporarily unavailable";
        } else if (valueOf.intValue() == 604) {
            sb2 = "Error: There is no internet connection";
        } else {
            sb2 = "Other" + sVar.b();
        }
        c0.t(MyApp.f6830c, b0.b(), null, new rc.d(new rc.g(), sb2, null, 1), 2);
        c0.t(d1.i(G), null, null, new oe.d(G, continuation, 7), 3);
        me.b0 b0Var = new me.b0(G, System.currentTimeMillis());
        G.f21186e = b0Var;
        b0Var.start();
        if (sVar != null) {
            if (G.f21185d.get()) {
                p0Var.h("Update App");
                context = getContext();
                if (context != null) {
                    g G2 = G();
                    G2.getClass();
                    Intrinsics.checkNotNullParameter(context, "context");
                    G2.f21190i = new we.a(context);
                }
                G().f21191k.e(getViewLifecycleOwner(), this.f6943f);
                G().j.e(getViewLifecycleOwner(), this.f6942e);
                G().f21189h.e(getViewLifecycleOwner(), this.f6944g);
                aVar = G().f21190i;
                if (aVar != null) {
                    aVar.e(getViewLifecycleOwner(), this.f6945h);
                }
                G().f();
            }
            int b10 = sVar.b();
            if (b10 != 502 && b10 != 504) {
                if (b10 != 608) {
                    switch (b10) {
                        case 604:
                            str = "Error: There is no internet connection";
                            break;
                        case 605:
                            str = "The server response timeout has been exceeded, try again";
                            break;
                        case 606:
                            str = "An error detected by the SSL subsystem during connection establishment. The Internet Security Research Group (IRG Root X1/X2) system certificate is expired or missing on the device.";
                            break;
                        default:
                            str = "";
                            break;
                    }
                } else {
                    str = "Secure SSL connection error.";
                }
            }
            p0Var.h(str);
        }
        c0.t(d1.i(G), lg.d.f20063c, null, new oe.d(G, continuation, 8), 2);
        context = getContext();
        if (context != null) {
        }
        G().f21191k.e(getViewLifecycleOwner(), this.f6943f);
        G().j.e(getViewLifecycleOwner(), this.f6942e);
        G().f21189h.e(getViewLifecycleOwner(), this.f6944g);
        aVar = G().f21190i;
        if (aVar != null) {
        }
        G().f();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        g G = G();
        me.b0 b0Var = G.f21186e;
        if (b0Var != null) {
            b0Var.cancel();
        }
        G.f21186e = null;
        t1 t1Var = G.f21192l;
        if (t1Var != null) {
            t1Var.k(null);
        }
        G.f21192l = null;
        we.a aVar = G.f21190i;
        if (aVar != null) {
            aVar.k();
        }
        G.f21190i = null;
        G().f21191k.i(this.f6943f);
        G().j.i(this.f6942e);
        G().f21189h.i(this.f6944g);
        we.a aVar2 = G().f21190i;
        if (aVar2 != null) {
            aVar2.i(this.f6945h);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        c navArgsClass = Reflection.getOrCreateKotlinClass(s.class);
        i argumentProducer = new i(4, this);
        Intrinsics.checkNotNullParameter(navArgsClass, "navArgsClass");
        Intrinsics.checkNotNullParameter(argumentProducer, "argumentProducer");
        Bundle bundle2 = (Bundle) argumentProducer.invoke();
        e eVar = j.f25572b;
        Method method = (Method) eVar.get(navArgsClass);
        if (method == null) {
            method = h.k(navArgsClass).getMethod("fromBundle", (Class[]) Arrays.copyOf(j.f25571a, 1));
            eVar.put(navArgsClass, method);
            Intrinsics.checkNotNullExpressionValue(method, "also(...)");
        }
        Object invoke = method.invoke(null, bundle2);
        Intrinsics.checkNotNull(invoke, "null cannot be cast to non-null type Args of androidx.navigation.NavArgsLazy");
        this.f6940c = (s) ((y1.i) invoke);
        e.d0 onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        e0 viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        onBackPressedDispatcher.a(viewLifecycleOwner, this.f6939b);
        c0.t(d1.g(this), null, null, new ke.q(this, null, 2), 3);
    }
}
