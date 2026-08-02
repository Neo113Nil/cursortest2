package com.sports.insider.ui.onboarding;

import a2.f;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.lifecycle.d1;
import androidx.lifecycle.e0;
import androidx.lifecycle.g0;
import androidx.lifecycle.x;
import c4.o;
import c4.v;
import c4.y;
import com.google.android.gms.internal.measurement.y3;
import com.sports.insider.MyApp;
import com.sports.insider.R;
import com.sports.insider.ui.views.CustomButton;
import com.sports.insider.ui.views.SiGradientRView;
import com.sports.insider.ui.views.SiGradientView;
import eg.c0;
import gf.k;
import gf.t;
import i3.i;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import ke.b;
import ke.d;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import q4.e;
import q4.j;
import rc.b0;
import rc.c;
import rc.g;
import rd.a;
import u6.h;
import y1.d0;
import y1.r;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lcom/sports/insider/ui/onboarding/BoardSiAcademyFragment;", "Lrd/a;", "Lec/a;", "<init>", "()V", "Lke/d;", "navArgs", "Betting-123_googleProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBoardSiAcademyFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BoardSiAcademyFragment.kt\ncom/sports/insider/ui/onboarding/BoardSiAcademyFragment\n+ 2 FragmentNavArgsLazy.kt\nandroidx/navigation/fragment/FragmentNavArgsLazyKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 singletonImageLoaders.android.kt\ncoil3/SingletonImageLoaders_androidKt\n+ 5 singletonImageLoaders.android.kt\ncoil3/SingletonImageLoaders_androidKt$load$1\n*L\n1#1,495:1\n42#2,3:496\n1#3:499\n35#4,3:500\n17#4:503\n40#4,6:504\n52#4,2:510\n52#4,2:512\n52#4,2:514\n52#4,2:516\n35#4,3:518\n17#4:521\n38#4,6:522\n44#4,2:529\n35#4,3:531\n17#4:534\n38#4,6:535\n44#4,2:542\n35#4,3:544\n17#4:547\n40#4,6:548\n35#4,3:554\n17#4:557\n38#4,6:558\n44#4,2:565\n35#4,3:567\n17#4:570\n38#4,6:571\n44#4,2:578\n38#5:528\n38#5:541\n38#5:564\n38#5:577\n*S KotlinDebug\n*F\n+ 1 BoardSiAcademyFragment.kt\ncom/sports/insider/ui/onboarding/BoardSiAcademyFragment\n*L\n88#1:496,3\n129#1:500,3\n129#1:503\n129#1:504,6\n316#1:510,2\n317#1:512,2\n318#1:514,2\n319#1:516,2\n326#1:518,3\n326#1:521\n326#1:522,6\n326#1:529,2\n361#1:531,3\n361#1:534\n361#1:535,6\n361#1:542,2\n369#1:544,3\n369#1:547\n369#1:548,6\n377#1:554,3\n377#1:557\n377#1:558,6\n377#1:565,2\n405#1:567,3\n405#1:570\n405#1:571,6\n405#1:578,2\n326#1:528\n361#1:541\n377#1:564\n405#1:577\n*E\n"})
/* loaded from: classes.dex */
public final class BoardSiAcademyFragment extends a<ec.a> {

    /* renamed from: d, reason: collision with root package name */
    public d f6929d;

    /* renamed from: e, reason: collision with root package name */
    public int f6930e;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f6927b = new AtomicBoolean(false);

    /* renamed from: c, reason: collision with root package name */
    public final t f6928c = k.b(new id.a(9));

    /* renamed from: f, reason: collision with root package name */
    public final ge.d f6931f = new ge.d(this, 1);

    /* renamed from: g, reason: collision with root package name */
    public float f6932g = 1.0f;

    public static void H(int i5, Exception exc) {
        zc.d.b(4, String.valueOf(i5), exc);
    }

    @Override // rd.a
    public final b3.a F(LayoutInflater inflater, ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View inflate = inflater.inflate(R.layout.board_si_academy_layout, viewGroup, false);
        int i5 = R.id.btnNext;
        CustomButton customButton = (CustomButton) y3.j(R.id.btnNext, inflate);
        if (customButton != null) {
            i5 = R.id.desc;
            TextView textView = (TextView) y3.j(R.id.desc, inflate);
            if (textView != null) {
                i5 = R.id.ic_si_academy;
                AppCompatImageView appCompatImageView = (AppCompatImageView) y3.j(R.id.ic_si_academy, inflate);
                if (appCompatImageView != null) {
                    i5 = R.id.ic_si_academy_background;
                    AppCompatImageView appCompatImageView2 = (AppCompatImageView) y3.j(R.id.ic_si_academy_background, inflate);
                    if (appCompatImageView2 != null) {
                        i5 = R.id.ivBackground;
                        AppCompatImageView appCompatImageView3 = (AppCompatImageView) y3.j(R.id.ivBackground, inflate);
                        if (appCompatImageView3 != null) {
                            i5 = R.id.ivLogo;
                            AppCompatImageView appCompatImageView4 = (AppCompatImageView) y3.j(R.id.ivLogo, inflate);
                            if (appCompatImageView4 != null) {
                                i5 = R.id.shadow_light_bt_background;
                                if (((AppCompatImageView) y3.j(R.id.shadow_light_bt_background, inflate)) != null) {
                                    i5 = R.id.siGradient;
                                    SiGradientRView siGradientRView = (SiGradientRView) y3.j(R.id.siGradient, inflate);
                                    if (siGradientRView != null) {
                                        i5 = R.id.siGradientBack;
                                        if (((SiGradientView) y3.j(R.id.siGradientBack, inflate)) != null) {
                                            i5 = R.id.sub_title_desc;
                                            TextView textView2 = (TextView) y3.j(R.id.sub_title_desc, inflate);
                                            if (textView2 != null) {
                                                i5 = R.id.title_desc;
                                                TextView textView3 = (TextView) y3.j(R.id.title_desc, inflate);
                                                if (textView3 != null) {
                                                    ec.a aVar = new ec.a((FrameLayout) inflate, customButton, textView, appCompatImageView, appCompatImageView2, appCompatImageView3, appCompatImageView4, siGradientRView, textView2, textView3);
                                                    Intrinsics.checkNotNullExpressionValue(aVar, "inflate(...)");
                                                    return aVar;
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v6, types: [android.view.View[], java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r4v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [androidx.appcompat.widget.AppCompatImageView] */
    public final void G(int i5) {
        int i10 = 0;
        int i11 = 1;
        if (i5 == 0) {
            ec.a aVar = (ec.a) this.f22459a;
            if (aVar != null) {
                SiGradientRView siGradientRView = aVar.f8848h;
                siGradientRView.b(siGradientRView.f7908l, siGradientRView.f7910n, siGradientRView.q, siGradientRView.f7917v);
            }
            try {
                ec.a aVar2 = (ec.a) this.f22459a;
                if (aVar2 != null) {
                    AppCompatImageView appCompatImageView = aVar2.f8846f;
                    Integer valueOf = Integer.valueOf(R.drawable.football_player);
                    o a7 = y.a(appCompatImageView.getContext());
                    e eVar = new e(appCompatImageView.getContext());
                    eVar.f21940c = valueOf;
                    j.d(eVar, appCompatImageView);
                    ((v) a7).a(eVar.a());
                }
            } catch (Exception e7) {
                H(R.drawable.football_player, e7);
            }
            ec.a aVar3 = (ec.a) this.f22459a;
            ?? view = {aVar3 != null ? aVar3.f8844d : null, aVar3 != null ? aVar3.f8845e : 0};
            Intrinsics.checkNotNullParameter(view, "view");
            while (i10 < 2) {
                ?? r32 = view[i10];
                if (r32 != 0) {
                    r32.setVisibility(4);
                }
                i10++;
            }
            ec.a aVar4 = (ec.a) this.f22459a;
            if (aVar4 != null) {
                aVar4.j.setText(R.string.Victory_starts_here_1part);
            }
            ec.a aVar5 = (ec.a) this.f22459a;
            if (aVar5 != null) {
                aVar5.f8849i.setText(R.string.Victory_starts_here_2part);
            }
            ec.a aVar6 = (ec.a) this.f22459a;
            if (aVar6 != null) {
                aVar6.f8843c.setText(R.string.Sports_betting_has_never_been_so_successful_like_we_have);
            }
            ec.a aVar7 = (ec.a) this.f22459a;
            if (aVar7 != null) {
                CustomButton customButton = aVar7.f8842b;
                CharSequence text = getResources().getText(R.string.next);
                Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
                customButton.setButtonText(text);
                return;
            }
            return;
        }
        if (i5 != 1) {
            c0.t(d1.g(this), null, null, new b(this, r4, i10), 3);
            ec.a aVar8 = (ec.a) this.f22459a;
            if (aVar8 != null) {
                SiGradientRView siGradientRView2 = aVar8.f8848h;
                siGradientRView2.b(siGradientRView2.f7909m, siGradientRView2.f7908l, siGradientRView2.f7912p, siGradientRView2.f7916u);
            }
            try {
                ec.a aVar9 = (ec.a) this.f22459a;
                if (aVar9 != null) {
                    AppCompatImageView appCompatImageView2 = aVar9.f8846f;
                    Integer valueOf2 = Integer.valueOf(R.drawable.izuddin_helmi_adnan);
                    o a10 = y.a(appCompatImageView2.getContext());
                    e eVar2 = new e(appCompatImageView2.getContext());
                    eVar2.f21940c = valueOf2;
                    j.d(eVar2, appCompatImageView2);
                    ((v) a10).a(eVar2.a());
                }
            } catch (Exception e9) {
                H(R.drawable.izuddin_helmi_adnan, e9);
            }
            ec.a aVar10 = (ec.a) this.f22459a;
            View[] view2 = {aVar10 != null ? aVar10.f8844d : null, aVar10 != null ? aVar10.f8845e : null};
            Intrinsics.checkNotNullParameter(view2, "view");
            while (i10 < 2) {
                View view3 = view2[i10];
                if (view3 != null) {
                    view3.setVisibility(4);
                }
                i10++;
            }
            ec.a aVar11 = (ec.a) this.f22459a;
            if (aVar11 != null) {
                aVar11.j.setTextSize(37.0f);
            }
            ec.a aVar12 = (ec.a) this.f22459a;
            if (aVar12 != null) {
                aVar12.f8849i.setTextSize(37.0f);
                return;
            }
            return;
        }
        c0.t(d1.g(this), null, null, new b(this, r4, i11), 3);
        ec.a aVar13 = (ec.a) this.f22459a;
        View[] view4 = {aVar13 != null ? aVar13.f8844d : null, aVar13 != null ? aVar13.f8845e : null};
        Intrinsics.checkNotNullParameter(view4, "view");
        for (int i12 = 0; i12 < 2; i12++) {
            View view5 = view4[i12];
            if (view5 != null) {
                view5.setVisibility(0);
            }
        }
        ec.a aVar14 = (ec.a) this.f22459a;
        if (aVar14 != null) {
            SiGradientRView siGradientRView3 = aVar14.f8848h;
            siGradientRView3.b(siGradientRView3.f7911o, siGradientRView3.f7915t, siGradientRView3.f7914s, siGradientRView3.f7913r);
        }
        try {
            ec.a aVar15 = (ec.a) this.f22459a;
            if (aVar15 != null) {
                AppCompatImageView appCompatImageView3 = aVar15.f8846f;
                Integer valueOf3 = Integer.valueOf(R.drawable.happy_win_businessman);
                o a11 = y.a(appCompatImageView3.getContext());
                e eVar3 = new e(appCompatImageView3.getContext());
                eVar3.f21940c = valueOf3;
                j.d(eVar3, appCompatImageView3);
                ((v) a11).a(eVar3.a());
            }
        } catch (Exception e10) {
            H(R.drawable.happy_win_businessman, e10);
        }
        try {
            ec.a aVar16 = (ec.a) this.f22459a;
            if (aVar16 != null) {
                AppCompatImageView appCompatImageView4 = aVar16.f8844d;
                float f6 = this.f6932g;
                int i13 = (int) (38 * f6);
                int i14 = (int) (f6 * 35.53d);
                Integer valueOf4 = Integer.valueOf(R.drawable.ic_si_academy);
                o a12 = y.a(appCompatImageView4.getContext());
                e eVar4 = new e(appCompatImageView4.getContext());
                eVar4.f21940c = valueOf4;
                j.d(eVar4, appCompatImageView4);
                if (i13 > 0 && i14 > 0) {
                    eVar4.c(i13, i14);
                }
                ((v) a12).a(eVar4.a());
            }
        } catch (Exception e11) {
            H(R.drawable.ic_si_academy, e11);
        }
        try {
            ec.a aVar17 = (ec.a) this.f22459a;
            if (aVar17 != null) {
                AppCompatImageView appCompatImageView5 = aVar17.f8845e;
                Integer valueOf5 = Integer.valueOf(R.drawable.ic_si_academy_background);
                o a13 = y.a(appCompatImageView5.getContext());
                e eVar5 = new e(appCompatImageView5.getContext());
                eVar5.f21940c = valueOf5;
                j.d(eVar5, appCompatImageView5);
                ((v) a13).a(eVar5.a());
            }
        } catch (Exception e12) {
            H(R.drawable.ic_si_academy_background, e12);
        }
    }

    public final void I() {
        r r5 = a.a.r(this);
        d0 g10 = r5.f25625b.g();
        if (g10 != null && g10.f25543g.f3078a != R.id.allPredictionsFragment) {
            g10.l(R.id.allPredictionsFragment);
        }
        y1.a b10 = com.google.android.play.core.appupdate.b.b();
        Intrinsics.checkNotNullExpressionValue(b10, "actionGlobalAllPredictionsFragment(...)");
        r5.d(b10);
    }

    public final boolean J() {
        return ((g0) getLifecycle()).f2169d.a(x.f2256d);
    }

    public final void K(boolean z5) {
        AtomicBoolean atomicBoolean = this.f6927b;
        if (atomicBoolean.get() && z5) {
            return;
        }
        g gVar = (g) this.f6928c.getValue();
        gVar.getClass();
        jg.d dVar = MyApp.f6830c;
        c0.t(dVar, b0.b(), null, new je.a(gVar, z5, null, 3), 2);
        if (z5) {
            atomicBoolean.set(true);
            c0.t(dVar, null, null, new bd.b(2, null, 7), 3);
        }
    }

    public final void L(String tag) {
        g gVar = (g) this.f6928c.getValue();
        gVar.getClass();
        Intrinsics.checkNotNullParameter(tag, "tag");
        c0.t(MyApp.f6830c, b0.b(), null, new rc.d(gVar, tag, null, 0), 2);
    }

    @Override // rd.a, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f6931f.e();
        ec.a aVar = (ec.a) this.f22459a;
        if (aVar != null) {
            k2.x.s(aVar.f8847g).a();
        }
        ec.a aVar2 = (ec.a) this.f22459a;
        if (aVar2 != null) {
            k2.x.s(aVar2.f8846f).a();
        }
        ec.a aVar3 = (ec.a) this.f22459a;
        if (aVar3 != null) {
            k2.x.s(aVar3.f8844d).a();
        }
        ec.a aVar4 = (ec.a) this.f22459a;
        if (aVar4 != null) {
            k2.x.s(aVar4.f8845e).a();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        ec.a aVar = (ec.a) this.f22459a;
        if (aVar != null) {
            io.sentry.config.a.y(aVar.f8842b, 300L, new f(10, this));
        }
        g gVar = (g) this.f6928c.getValue();
        gVar.getClass();
        c0.t(MyApp.f6830c, b0.b(), null, new c(gVar, null, 8), 2);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        CustomButton customButton;
        super.onStop();
        ec.a aVar = (ec.a) this.f22459a;
        if (aVar == null || (customButton = aVar.f8842b) == null) {
            return;
        }
        customButton.setOnClickListener(null);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        ag.c navArgsClass = Reflection.getOrCreateKotlinClass(d.class);
        i argumentProducer = new i(2, this);
        Intrinsics.checkNotNullParameter(navArgsClass, "navArgsClass");
        Intrinsics.checkNotNullParameter(argumentProducer, "argumentProducer");
        Bundle bundle2 = (Bundle) argumentProducer.invoke();
        s.e eVar = y1.j.f25572b;
        Method method = (Method) eVar.get(navArgsClass);
        int i5 = 1;
        if (method == null) {
            method = h.k(navArgsClass).getMethod("fromBundle", (Class[]) Arrays.copyOf(y1.j.f25571a, 1));
            eVar.put(navArgsClass, method);
            Intrinsics.checkNotNullExpressionValue(method, "also(...)");
        }
        Object invoke = method.invoke(null, bundle2);
        Intrinsics.checkNotNull(invoke, "null cannot be cast to non-null type Args of androidx.navigation.NavArgsLazy");
        this.f6929d = (d) ((y1.i) invoke);
        e.d0 onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        e0 viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        onBackPressedDispatcher.a(viewLifecycleOwner, this.f6931f);
        c0.t(d1.g(this), null, null, new kd.e(new zc.k(), this, (Continuation) null, i5), 3);
        float f6 = getResources().getDisplayMetrics().density;
        if (f6 <= 0.0f) {
            f6 = 1.0f;
        }
        this.f6932g = f6;
        this.f6930e = 0;
        K(false);
        float f10 = this.f6932g;
        int i10 = (int) (81 * f10);
        int i11 = (int) (37 * f10);
        try {
            ec.a aVar = (ec.a) this.f22459a;
            if (aVar != null) {
                AppCompatImageView appCompatImageView = aVar.f8847g;
                Integer valueOf = Integer.valueOf(R.drawable.ic_app);
                o a7 = y.a(appCompatImageView.getContext());
                e eVar2 = new e(appCompatImageView.getContext());
                eVar2.f21940c = valueOf;
                j.d(eVar2, appCompatImageView);
                if (i10 > 0 && i11 > 0) {
                    eVar2.c(i10, i11);
                }
                ((v) a7).a(eVar2.a());
            }
        } catch (Exception e7) {
            H(R.drawable.ic_app, e7);
        }
        G(this.f6930e);
    }
}
