package com.sports.insider.ui.pays;

import a2.q;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
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
import c4.p;
import c4.v;
import c4.y;
import com.google.android.gms.internal.measurement.y3;
import com.sports.insider.R;
import com.sports.insider.domain.entity.CustomTypefaceSpan;
import com.sports.insider.ui.pays.VipAccessFragment;
import com.sports.insider.ui.views.CustomButton;
import com.sports.insider.ui.views.ProfitView;
import ec.d0;
import eg.c0;
import eg.t1;
import ge.d;
import gf.k;
import gf.t;
import h8.b;
import i3.i;
import java.util.Arrays;
import kh.g;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import le.f1;
import le.g2;
import le.l2;
import le.m2;
import mf.c;
import q4.e;
import q4.h;
import rd.a;
import ve.g0;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b²\u0006\f\u0010\u0007\u001a\u00020\u00068\nX\u008a\u0084\u0002"}, d2 = {"Lcom/sports/insider/ui/pays/VipAccessFragment;", "Lrd/a;", "Lec/d0;", "Lve/g0;", "<init>", "()V", "Lle/m2;", "navArgs", "Betting-123_googleProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nVipAccessFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VipAccessFragment.kt\ncom/sports/insider/ui/pays/VipAccessFragment\n+ 2 singletonImageLoaders.android.kt\ncoil3/SingletonImageLoaders_androidKt\n+ 3 FragmentNavArgsLazy.kt\nandroidx/navigation/fragment/FragmentNavArgsLazyKt\n*L\n1#1,349:1\n17#2:350\n42#3,3:351\n*S KotlinDebug\n*F\n+ 1 VipAccessFragment.kt\ncom/sports/insider/ui/pays/VipAccessFragment\n*L\n81#1:350\n149#1:351,3\n*E\n"})
/* loaded from: classes.dex */
public final class VipAccessFragment extends a<d0> implements g0 {

    /* renamed from: c, reason: collision with root package name */
    public final g2 f6972c;

    /* renamed from: d, reason: collision with root package name */
    public final g2 f6973d;

    /* renamed from: b, reason: collision with root package name */
    public final t f6971b = k.b(new q(26, this));

    /* renamed from: e, reason: collision with root package name */
    public final d f6974e = new d(this, 7);

    /* JADX WARN: Type inference failed for: r0v2, types: [le.g2] */
    /* JADX WARN: Type inference failed for: r0v3, types: [le.g2] */
    public VipAccessFragment() {
        final int i5 = 0;
        this.f6972c = new q0(this) { // from class: le.g2

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ VipAccessFragment f19796b;

            {
                this.f19796b = this;
            }

            /* JADX WARN: Code restructure failed: missing block: B:32:0x007c, code lost:
            
                if (r1.equals("pt") == false) goto L45;
             */
            /* JADX WARN: Code restructure failed: missing block: B:33:0x0091, code lost:
            
                r1 = "Activa";
             */
            /* JADX WARN: Code restructure failed: missing block: B:38:0x008e, code lost:
            
                if (r1.equals("es") == false) goto L45;
             */
            @Override // androidx.lifecycle.q0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void a(Object obj) {
                y1.c0 c0Var;
                CharSequence charSequence;
                switch (i5) {
                    case 0:
                        VipAccessFragment vipAccessFragment = this.f19796b;
                        ic.i0 i0Var = (ic.i0) obj;
                        ic.f fVar = i0Var != null ? (ic.f) i0Var.a() : null;
                        ic.f fVar2 = fVar != null ? fVar : null;
                        if (fVar2 != null && (c0Var = fVar2.f11114a) != null) {
                            try {
                                a.a.r(vipAccessFragment).d(c0Var);
                                break;
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        break;
                    default:
                        VipAccessFragment vipAccessFragment2 = this.f19796b;
                        Pair pair = (Pair) obj;
                        ec.d0 d0Var = (ec.d0) vipAccessFragment2.f22459a;
                        if (d0Var != null) {
                            CustomButton customButton = d0Var.f8923f;
                            h H = vipAccessFragment2.H();
                            String str = pair != null ? (String) pair.f19192a : null;
                            String str2 = pair != null ? (String) pair.f19193b : null;
                            wc.e eVar = H.f19797f;
                            eVar.getClass();
                            if (da.r.c()) {
                                String str3 = gc.d.f9945a;
                                String c2 = d2.i.c();
                                int hashCode = c2.hashCode();
                                if (hashCode != 3201) {
                                    if (hashCode == 3246) {
                                        break;
                                    } else if (hashCode != 3276) {
                                        if (hashCode == 3588) {
                                            break;
                                        } else if (hashCode != 3651) {
                                            if (hashCode == 3710 && c2.equals("tr")) {
                                                charSequence = "Aktif";
                                            }
                                        } else if (c2.equals("ru")) {
                                            charSequence = "Активна";
                                        }
                                    } else if (c2.equals("fr")) {
                                        charSequence = "Actif";
                                    }
                                } else if (c2.equals("de")) {
                                    charSequence = "Aktiv";
                                }
                                charSequence = "Active";
                            } else if (((Boolean) wc.d0.b().f21708h.getValue()).booleanValue()) {
                                String str4 = gc.d.f9945a;
                                String c8 = d2.i.c();
                                int hashCode2 = c8.hashCode();
                                if (hashCode2 != 3201) {
                                    if (hashCode2 != 3246) {
                                        if (hashCode2 != 3276) {
                                            if (hashCode2 != 3588) {
                                                if (hashCode2 != 3651) {
                                                    if (hashCode2 == 3710 && c8.equals("tr")) {
                                                        charSequence = "Doğrulama olmadan etkin";
                                                    }
                                                } else if (c8.equals("ru")) {
                                                    charSequence = "Активна без верификации";
                                                }
                                            } else if (c8.equals("pt")) {
                                                charSequence = "Ativo sem verificação";
                                            }
                                        } else if (c8.equals("fr")) {
                                            charSequence = "Actif sans vérification";
                                        }
                                    } else if (c8.equals("es")) {
                                        charSequence = "Activo sin verificación";
                                    }
                                } else if (c8.equals("de")) {
                                    charSequence = "Aktiv ohne Verifizierung";
                                }
                                charSequence = "Active without verification";
                            } else if (str == null) {
                                eVar.o().getClass();
                                charSequence = zc.k.h(R.string.get_vip_access_to_behind_def);
                            } else {
                                eVar.o().getClass();
                                String h10 = zc.k.h(R.string.get_vip_access_to_behind);
                                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                                String format = String.format(h10, Arrays.copyOf(new Object[]{str}, 1));
                                Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                                StringBuilder source = new StringBuilder(format);
                                if (str2 != null) {
                                    source.append(" ");
                                    source.append(str2);
                                }
                                int length = h10.length() + 3;
                                eVar.o().getClass();
                                CustomTypefaceSpan typefaceRegular = zc.k.d();
                                zc.d dVar = eVar.f25078f;
                                int parseColor = Color.parseColor("#D7D7D7");
                                dVar.getClass();
                                Intrinsics.checkNotNullParameter(source, "source");
                                Intrinsics.checkNotNullParameter(typefaceRegular, "typefaceRegular");
                                try {
                                    int length2 = source.length();
                                    SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(source);
                                    Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(...)");
                                    try {
                                        valueOf.setSpan(typefaceRegular, length, length2, 18);
                                    } catch (Exception unused2) {
                                    }
                                    try {
                                        valueOf.setSpan(new ForegroundColorSpan(parseColor), length, length2, 18);
                                    } catch (Exception unused3) {
                                    }
                                    try {
                                        valueOf.setSpan(new StrikethroughSpan(), length, length2, 18);
                                    } catch (Exception unused4) {
                                    }
                                    try {
                                        valueOf.setSpan(new AbsoluteSizeSpan(io.sentry.config.a.o(12)), length, length2, 18);
                                    } catch (Exception unused5) {
                                    }
                                    charSequence = valueOf;
                                } catch (Exception unused6) {
                                    charSequence = source;
                                }
                            }
                            customButton.setButtonText(charSequence);
                            break;
                        }
                        break;
                }
            }
        };
        final int i10 = 1;
        this.f6973d = new q0(this) { // from class: le.g2

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ VipAccessFragment f19796b;

            {
                this.f19796b = this;
            }

            /* JADX WARN: Code restructure failed: missing block: B:32:0x007c, code lost:
            
                if (r1.equals("pt") == false) goto L45;
             */
            /* JADX WARN: Code restructure failed: missing block: B:33:0x0091, code lost:
            
                r1 = "Activa";
             */
            /* JADX WARN: Code restructure failed: missing block: B:38:0x008e, code lost:
            
                if (r1.equals("es") == false) goto L45;
             */
            @Override // androidx.lifecycle.q0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void a(Object obj) {
                y1.c0 c0Var;
                CharSequence charSequence;
                switch (i10) {
                    case 0:
                        VipAccessFragment vipAccessFragment = this.f19796b;
                        ic.i0 i0Var = (ic.i0) obj;
                        ic.f fVar = i0Var != null ? (ic.f) i0Var.a() : null;
                        ic.f fVar2 = fVar != null ? fVar : null;
                        if (fVar2 != null && (c0Var = fVar2.f11114a) != null) {
                            try {
                                a.a.r(vipAccessFragment).d(c0Var);
                                break;
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        break;
                    default:
                        VipAccessFragment vipAccessFragment2 = this.f19796b;
                        Pair pair = (Pair) obj;
                        ec.d0 d0Var = (ec.d0) vipAccessFragment2.f22459a;
                        if (d0Var != null) {
                            CustomButton customButton = d0Var.f8923f;
                            h H = vipAccessFragment2.H();
                            String str = pair != null ? (String) pair.f19192a : null;
                            String str2 = pair != null ? (String) pair.f19193b : null;
                            wc.e eVar = H.f19797f;
                            eVar.getClass();
                            if (da.r.c()) {
                                String str3 = gc.d.f9945a;
                                String c2 = d2.i.c();
                                int hashCode = c2.hashCode();
                                if (hashCode != 3201) {
                                    if (hashCode == 3246) {
                                        break;
                                    } else if (hashCode != 3276) {
                                        if (hashCode == 3588) {
                                            break;
                                        } else if (hashCode != 3651) {
                                            if (hashCode == 3710 && c2.equals("tr")) {
                                                charSequence = "Aktif";
                                            }
                                        } else if (c2.equals("ru")) {
                                            charSequence = "Активна";
                                        }
                                    } else if (c2.equals("fr")) {
                                        charSequence = "Actif";
                                    }
                                } else if (c2.equals("de")) {
                                    charSequence = "Aktiv";
                                }
                                charSequence = "Active";
                            } else if (((Boolean) wc.d0.b().f21708h.getValue()).booleanValue()) {
                                String str4 = gc.d.f9945a;
                                String c8 = d2.i.c();
                                int hashCode2 = c8.hashCode();
                                if (hashCode2 != 3201) {
                                    if (hashCode2 != 3246) {
                                        if (hashCode2 != 3276) {
                                            if (hashCode2 != 3588) {
                                                if (hashCode2 != 3651) {
                                                    if (hashCode2 == 3710 && c8.equals("tr")) {
                                                        charSequence = "Doğrulama olmadan etkin";
                                                    }
                                                } else if (c8.equals("ru")) {
                                                    charSequence = "Активна без верификации";
                                                }
                                            } else if (c8.equals("pt")) {
                                                charSequence = "Ativo sem verificação";
                                            }
                                        } else if (c8.equals("fr")) {
                                            charSequence = "Actif sans vérification";
                                        }
                                    } else if (c8.equals("es")) {
                                        charSequence = "Activo sin verificación";
                                    }
                                } else if (c8.equals("de")) {
                                    charSequence = "Aktiv ohne Verifizierung";
                                }
                                charSequence = "Active without verification";
                            } else if (str == null) {
                                eVar.o().getClass();
                                charSequence = zc.k.h(R.string.get_vip_access_to_behind_def);
                            } else {
                                eVar.o().getClass();
                                String h10 = zc.k.h(R.string.get_vip_access_to_behind);
                                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                                String format = String.format(h10, Arrays.copyOf(new Object[]{str}, 1));
                                Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                                StringBuilder source = new StringBuilder(format);
                                if (str2 != null) {
                                    source.append(" ");
                                    source.append(str2);
                                }
                                int length = h10.length() + 3;
                                eVar.o().getClass();
                                CustomTypefaceSpan typefaceRegular = zc.k.d();
                                zc.d dVar = eVar.f25078f;
                                int parseColor = Color.parseColor("#D7D7D7");
                                dVar.getClass();
                                Intrinsics.checkNotNullParameter(source, "source");
                                Intrinsics.checkNotNullParameter(typefaceRegular, "typefaceRegular");
                                try {
                                    int length2 = source.length();
                                    SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(source);
                                    Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(...)");
                                    try {
                                        valueOf.setSpan(typefaceRegular, length, length2, 18);
                                    } catch (Exception unused2) {
                                    }
                                    try {
                                        valueOf.setSpan(new ForegroundColorSpan(parseColor), length, length2, 18);
                                    } catch (Exception unused3) {
                                    }
                                    try {
                                        valueOf.setSpan(new StrikethroughSpan(), length, length2, 18);
                                    } catch (Exception unused4) {
                                    }
                                    try {
                                        valueOf.setSpan(new AbsoluteSizeSpan(io.sentry.config.a.o(12)), length, length2, 18);
                                    } catch (Exception unused5) {
                                    }
                                    charSequence = valueOf;
                                } catch (Exception unused6) {
                                    charSequence = source;
                                }
                            }
                            customButton.setButtonText(charSequence);
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
    public static final Object G(VipAccessFragment vipAccessFragment, Context context, Integer num, c cVar) {
        l2 l2Var;
        int i5;
        m image;
        try {
            if (cVar instanceof l2) {
                l2Var = (l2) cVar;
                int i10 = l2Var.f19875d;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    l2Var.f19875d = i10 - Integer.MIN_VALUE;
                    Object obj = l2Var.f19873b;
                    lf.a aVar = lf.a.f20034a;
                    i5 = l2Var.f19875d;
                    if (i5 != 0) {
                        b.B(obj);
                        e eVar = new e(context);
                        eVar.f21940c = num;
                        q4.b bVar = q4.b.f21930c;
                        eVar.f21946i = bVar;
                        eVar.f21945h = bVar;
                        eVar.j = q4.b.f21931d;
                        h a7 = eVar.a();
                        o a10 = y.a(context);
                        l2Var.f19872a = context;
                        l2Var.f19875d = 1;
                        obj = ((v) a10).c(a7, l2Var);
                        if (obj == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i5 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        context = l2Var.f19872a;
                        b.B(obj);
                    }
                    image = ((q4.k) obj).getImage();
                    if (image != null) {
                        return null;
                    }
                    Resources resources = context.getResources();
                    Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                    return p.b(image, resources);
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
        l2Var = new l2(vipAccessFragment, cVar);
        Object obj2 = l2Var.f19873b;
        lf.a aVar2 = lf.a.f20034a;
        i5 = l2Var.f19875d;
    }

    @Override // rd.a
    public final b3.a F(LayoutInflater inflater, ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View inflate = inflater.inflate(R.layout.vip_access_fragment, viewGroup, false);
        int i5 = R.id.appCompatImageView;
        AppCompatImageView appCompatImageView = (AppCompatImageView) y3.j(R.id.appCompatImageView, inflate);
        if (appCompatImageView != null) {
            i5 = R.id.btnClose;
            FrameLayout frameLayout = (FrameLayout) y3.j(R.id.btnClose, inflate);
            if (frameLayout != null) {
                i5 = R.id.head;
                FrameLayout frameLayout2 = (FrameLayout) y3.j(R.id.head, inflate);
                if (frameLayout2 != null) {
                    i5 = R.id.ivCrossClose;
                    AppCompatImageView appCompatImageView2 = (AppCompatImageView) y3.j(R.id.ivCrossClose, inflate);
                    if (appCompatImageView2 != null) {
                        i5 = R.id.launchSubsDiamond;
                        CustomButton customButton = (CustomButton) y3.j(R.id.launchSubsDiamond, inflate);
                        if (customButton != null) {
                            i5 = R.id.panel_vip;
                            AppCompatImageView appCompatImageView3 = (AppCompatImageView) y3.j(R.id.panel_vip, inflate);
                            if (appCompatImageView3 != null) {
                                i5 = R.id.profits;
                                ProfitView profitView = (ProfitView) y3.j(R.id.profits, inflate);
                                if (profitView != null) {
                                    i5 = R.id.shadow_light_bt_background;
                                    AppCompatImageView appCompatImageView4 = (AppCompatImageView) y3.j(R.id.shadow_light_bt_background, inflate);
                                    if (appCompatImageView4 != null) {
                                        i5 = R.id.space_nav;
                                        if (((FrameLayout) y3.j(R.id.space_nav, inflate)) != null) {
                                            i5 = R.id.status_space_diamond;
                                            FrameLayout frameLayout3 = (FrameLayout) y3.j(R.id.status_space_diamond, inflate);
                                            if (frameLayout3 != null) {
                                                i5 = R.id.subTitleDiamond;
                                                TextView textView = (TextView) y3.j(R.id.subTitleDiamond, inflate);
                                                if (textView != null) {
                                                    i5 = R.id.titleDiamond;
                                                    TextView textView2 = (TextView) y3.j(R.id.titleDiamond, inflate);
                                                    if (textView2 != null) {
                                                        i5 = R.id.titleLayout;
                                                        if (((LinearLayout) y3.j(R.id.titleLayout, inflate)) != null) {
                                                            d0 d0Var = new d0((ConstraintLayout) inflate, appCompatImageView, frameLayout, frameLayout2, appCompatImageView2, customButton, appCompatImageView3, profitView, appCompatImageView4, frameLayout3, textView, textView2);
                                                            Intrinsics.checkNotNullExpressionValue(d0Var, "inflate(...)");
                                                            return d0Var;
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
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i5)));
    }

    public final le.h H() {
        return (le.h) this.f6971b.getValue();
    }

    @Override // rd.a, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f6974e.e();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        H().k();
        le.h H = H();
        H.f19768e.e(getViewLifecycleOwner(), this.f6972c);
        H.f19805o.e(getViewLifecycleOwner(), this.f6973d);
        d0 d0Var = (d0) this.f22459a;
        if (d0Var != null) {
            final int i5 = 0;
            io.sentry.config.a.y(d0Var.f8923f, 600L, new Function1(this) { // from class: le.h2

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ VipAccessFragment f19819b;

                {
                    this.f19819b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    switch (i5) {
                        case 0:
                            VipAccessFragment vipAccessFragment = this.f19819b;
                            h H2 = vipAccessFragment.H();
                            androidx.fragment.app.p0 activity = vipAccessFragment.requireActivity();
                            Intrinsics.checkNotNullExpressionValue(activity, "requireActivity(...)");
                            H2.getClass();
                            Intrinsics.checkNotNullParameter(activity, "activity");
                            H2.f19797f.getClass();
                            if (!da.r.c() && (!da.r.d() || !da.r.f())) {
                                H2.i().getClass();
                                Continuation continuation = null;
                                if (((Boolean) wc.d0.b().f21708h.getValue()).booleanValue()) {
                                    eg.c0.t(androidx.lifecycle.d1.i(H2), null, null, new b(H2, continuation, 5), 3);
                                } else {
                                    H2.q(H2.f19806p);
                                    eg.c0.t(androidx.lifecycle.d1.i(H2), null, null, new androidx.lifecycle.o(H2, activity, continuation, 24), 3);
                                }
                            }
                            break;
                        default:
                            this.f19819b.f6974e.b();
                            break;
                    }
                    return Unit.f19194a;
                }
            });
        }
        d0 d0Var2 = (d0) this.f22459a;
        if (d0Var2 != null) {
            final int i10 = 1;
            io.sentry.config.a.y(d0Var2.f8920c, 600L, new Function1(this) { // from class: le.h2

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ VipAccessFragment f19819b;

                {
                    this.f19819b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    switch (i10) {
                        case 0:
                            VipAccessFragment vipAccessFragment = this.f19819b;
                            h H2 = vipAccessFragment.H();
                            androidx.fragment.app.p0 activity = vipAccessFragment.requireActivity();
                            Intrinsics.checkNotNullExpressionValue(activity, "requireActivity(...)");
                            H2.getClass();
                            Intrinsics.checkNotNullParameter(activity, "activity");
                            H2.f19797f.getClass();
                            if (!da.r.c() && (!da.r.d() || !da.r.f())) {
                                H2.i().getClass();
                                Continuation continuation = null;
                                if (((Boolean) wc.d0.b().f21708h.getValue()).booleanValue()) {
                                    eg.c0.t(androidx.lifecycle.d1.i(H2), null, null, new b(H2, continuation, 5), 3);
                                } else {
                                    H2.q(H2.f19806p);
                                    eg.c0.t(androidx.lifecycle.d1.i(H2), null, null, new androidx.lifecycle.o(H2, activity, continuation, 24), 3);
                                }
                            }
                            break;
                        default:
                            this.f19819b.f6974e.b();
                            break;
                    }
                    return Unit.f19194a;
                }
            });
        }
        d0 d0Var3 = (d0) this.f22459a;
        if (d0Var3 != null) {
            d0Var3.f8925h.setListener(this);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        le.h H = H();
        H.l();
        t1 t1Var = H.f19800i;
        if (t1Var != null) {
            t1Var.k(null);
        }
        H.f19800i = null;
        t1 t1Var2 = H.j;
        if (t1Var2 != null) {
            t1Var2.k(null);
        }
        H.j = null;
        t1 t1Var3 = H.f19801k;
        if (t1Var3 != null) {
            t1Var3.k(null);
        }
        H.f19801k = null;
        t1 t1Var4 = H.f19802l;
        if (t1Var4 != null) {
            t1Var4.k(null);
        }
        H.f19802l = null;
        le.h H2 = H();
        H2.f19768e.i(this.f6972c);
        H2.f19805o.i(this.f6973d);
        d0 d0Var = (d0) this.f22459a;
        if (d0Var != null) {
            d0Var.f8920c.setOnClickListener(null);
            d0Var.f8923f.setOnClickListener(null);
        }
        d0 d0Var2 = (d0) this.f22459a;
        if (d0Var2 != null) {
            d0Var2.f8925h.setListener(null);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        g gVar = new g(Reflection.getOrCreateKotlinClass(m2.class), new i(8, this));
        le.h H = H();
        int a7 = ((m2) gVar.getValue()).a();
        int c2 = ((m2) gVar.getValue()).c();
        String b10 = ((m2) gVar.getValue()).b();
        ((m2) gVar.getValue()).d();
        H.f19765b = a7;
        H.f19799h = c2;
        H.f19798g = b10;
        wc.e eVar = H.f19797f;
        eVar.getClass();
        new cd.d().c("diamond_screen_show", null);
        wc.d0.i(eVar);
        c0.t(d1.g(this), null, null, new androidx.lifecycle.o(this, view, (Continuation) null, 29), 3);
    }

    @Override // ve.g0
    public final void y(int i5) {
        if (i5 == 6) {
            f1.m(H(), getContext());
        }
    }
}
