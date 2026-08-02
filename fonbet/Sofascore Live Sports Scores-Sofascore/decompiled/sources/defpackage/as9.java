package defpackage;

import android.content.Context;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.compose.runtime.e;
import androidx.fragment.app.FragmentActivity;
import com.sofascore.model.mvvm.model.Country;
import com.sofascore.model.mvvm.model.Gender;
import com.sofascore.model.mvvm.model.Stage;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.profile.UserBadge;
import com.sofascore.results.R;
import com.sofascore.results.base.BaseActivity;
import com.unity3d.services.UnityAdsConstants;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract class as9 {
    public static final boolean a = !new Regex("[0-9]+\\.[0-9]+\\.[0-9]").f("26.07.20");
    public static final e1d b = e.f(Boolean.FALSE);

    public static final void a(ImageView imageView) {
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        imageView.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
    }

    public static final void b(ImageView imageView, Integer num, String str) {
        String str2;
        nt9 a2;
        imageView.getClass();
        String str3 = null;
        if (num != null) {
            str2 = vxd.j(num.intValue(), (Intrinsics.c(uaa.c, "api.sofascore.com/") ? "https://img.sofascore.com/" : dmi.q("https://", uaa.c)).concat("api/v1/"), "category/", "/image");
        } else {
            str2 = null;
        }
        apf a3 = ajh.a(imageView.getContext());
        ht9 ht9Var = new ht9(imageView.getContext());
        ht9Var.c = str2;
        vt9.f(ht9Var, imageView);
        if (str != null) {
            ht9Var.f = str;
            ht9Var.i = str;
        }
        Context context = imageView.getContext();
        context.getClass();
        wt9 I = rfo.I(imageView);
        if (I != null && (a2 = I.a()) != null) {
            str3 = a2.e;
        }
        z8e.Q(ht9Var, context, R.drawable.ic_flag_placeholder, str3, Integer.valueOf(R.color.neutral_default));
        a3.a(ht9Var.a());
    }

    public static void c(ImageView imageView, String str, boolean z, String str2, int i) {
        String str3;
        nt9 a2;
        if ((i & 2) != 0) {
            z = false;
        }
        String str4 = null;
        if ((i & 4) != 0) {
            str2 = null;
        }
        imageView.getClass();
        if (str != null) {
            Locale locale = Locale.US;
            locale.getClass();
            String upperCase = str.toUpperCase(locale);
            upperCase.getClass();
            str3 = fc6.n((Intrinsics.c(uaa.c, "api.sofascore.com/") ? "https://img.sofascore.com/" : dmi.q("https://", uaa.c)).concat("api/v1/"), "country/", upperCase, "/flag");
        } else {
            str3 = null;
        }
        apf a3 = ajh.a(imageView.getContext());
        ht9 ht9Var = new ht9(imageView.getContext());
        ht9Var.c = str3;
        vt9.f(ht9Var, imageView);
        if (str2 != null) {
            ht9Var.f = str2;
            ht9Var.i = str2;
        }
        if (!z) {
            Context context = imageView.getContext();
            context.getClass();
            wt9 I = rfo.I(imageView);
            if (I != null && (a2 = I.a()) != null) {
                str4 = a2.e;
            }
            z8e.Q(ht9Var, context, R.drawable.ic_flag_placeholder, str4, Integer.valueOf(R.color.neutral_default));
            imageView.setVisibility(0);
        }
        ht9Var.e = new yih(imageView, z, imageView);
        a3.a(ht9Var.a());
    }

    public static final void d(ImageView imageView, int i, Gender gender, boolean z) {
        nt9 a2;
        imageView.getClass();
        int i2 = gender == Gender.Female ? R.drawable.mma_women_placeholder : R.drawable.mma_men_placeholder;
        String R = pco.R(i);
        apf a3 = ajh.a(imageView.getContext());
        ht9 ht9Var = new ht9(imageView.getContext());
        ht9Var.c = R;
        vt9.f(ht9Var, imageView);
        Context context = imageView.getContext();
        context.getClass();
        wt9 I = rfo.I(imageView);
        z8e.Q(ht9Var, context, i2, (I == null || (a2 = I.a()) == null) ? null : a2.e, null);
        if (z) {
            awj[] awjVarArr = {new urh()};
            sl6 sl6Var = st9.a;
            st9.b(ht9Var, ph0.X(awjVarArr));
        }
        a3.a(ht9Var.a());
    }

    public static final void e(ImageView imageView, String str, boolean z) {
        nt9 a2;
        apf a3 = ajh.a(imageView.getContext());
        ht9 ht9Var = new ht9(imageView.getContext());
        ht9Var.c = str;
        vt9.f(ht9Var, imageView);
        Context context = imageView.getContext();
        context.getClass();
        wt9 I = rfo.I(imageView);
        z8e.Q(ht9Var, context, R.drawable.player_photo_placeholder, (I == null || (a2 = I.a()) == null) ? null : a2.e, null);
        st9.b(ht9Var, ph0.x(new awj[]{new urh(), z ? new h39() : null}));
        a3.a(ht9Var.a());
    }

    public static final void f(ImageView imageView, String str, Drawable drawable) {
        nt9 a2;
        apf a3 = ajh.a(imageView.getContext());
        ht9 ht9Var = new ht9(imageView.getContext());
        ht9Var.c = str;
        vt9.f(ht9Var, imageView);
        Context context = imageView.getContext();
        context.getClass();
        wt9 I = rfo.I(imageView);
        z8e.R(ht9Var, context, drawable, (I == null || (a2 = I.a()) == null) ? null : a2.e, null);
        a3.a(ht9Var.a());
    }

    public static final void g(ImageView imageView, int i) {
        nt9 a2;
        imageView.getClass();
        String K = pco.K(i);
        apf a3 = ajh.a(imageView.getContext());
        ht9 ht9Var = new ht9(imageView.getContext());
        ht9Var.c = K;
        vt9.f(ht9Var, imageView);
        Context context = imageView.getContext();
        context.getClass();
        wt9 I = rfo.I(imageView);
        z8e.Q(ht9Var, context, R.drawable.manager_photo_placeholder, (I == null || (a2 = I.a()) == null) ? null : a2.e, null);
        awj[] awjVarArr = {new urh()};
        sl6 sl6Var = st9.a;
        st9.b(ht9Var, ph0.X(awjVarArr));
        a3.a(ht9Var.a());
    }

    public static final void h(ImageView imageView, int i) {
        nt9 a2;
        Integer valueOf = Integer.valueOf(i);
        apf a3 = ajh.a(imageView.getContext());
        ht9 ht9Var = new ht9(imageView.getContext());
        ht9Var.c = valueOf;
        vt9.f(ht9Var, imageView);
        Context context = imageView.getContext();
        context.getClass();
        wt9 I = rfo.I(imageView);
        z8e.R(ht9Var, context, null, (I == null || (a2 = I.a()) == null) ? null : a2.e, null);
        awj[] awjVarArr = {new ty1(5.0f, 1.0f, 0, 4)};
        sl6 sl6Var = st9.a;
        st9.b(ht9Var, ph0.X(awjVarArr));
        a3.a(ht9Var.a());
    }

    public static final void i(ImageView imageView, String str) {
        nt9 a2;
        str.getClass();
        apf a3 = ajh.a(imageView.getContext());
        ht9 ht9Var = new ht9(imageView.getContext());
        ht9Var.c = str;
        vt9.f(ht9Var, imageView);
        Context context = imageView.getContext();
        context.getClass();
        wt9 I = rfo.I(imageView);
        z8e.R(ht9Var, context, null, (I == null || (a2 = I.a()) == null) ? null : a2.e, null);
        awj[] awjVarArr = {new ty1(5.0f, 1.0f, 0, 4)};
        sl6 sl6Var = st9.a;
        st9.b(ht9Var, ph0.X(awjVarArr));
        a3.a(ht9Var.a());
    }

    public static final void j(ImageView imageView, int i) {
        nt9 a2;
        Integer valueOf = Integer.valueOf(i);
        apf a3 = ajh.a(imageView.getContext());
        ht9 ht9Var = new ht9(imageView.getContext());
        ht9Var.c = valueOf;
        vt9.f(ht9Var, imageView);
        Context context = imageView.getContext();
        context.getClass();
        wt9 I = rfo.I(imageView);
        z8e.R(ht9Var, context, null, (I == null || (a2 = I.a()) == null) ? null : a2.e, null);
        Context context2 = imageView.getContext();
        context2.getClass();
        float s = ao2.s(8, context2);
        imageView.getContext().getClass();
        awj[] awjVarArr = {new t7g(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, s, ao2.s(8, r6)), new ty1(15.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, 6)};
        sl6 sl6Var = st9.a;
        st9.b(ht9Var, ph0.X(awjVarArr));
        a3.a(ht9Var.a());
    }

    public static final void k(ImageView imageView, int i) {
        nt9 a2;
        imageView.getClass();
        String j = vxd.j(i, pco.F(), "odds/provider/", "/logo");
        apf a3 = ajh.a(imageView.getContext());
        ht9 ht9Var = new ht9(imageView.getContext());
        ht9Var.c = j;
        vt9.f(ht9Var, imageView);
        wt9 I = rfo.I(imageView);
        ht9Var.c((I == null || (a2 = I.a()) == null) ? null : a2.e);
        ht9Var.q = jrg.b;
        a3.a(ht9Var.a());
    }

    public static final void l(ImageView imageView, int i, ty1 ty1Var) {
        nt9 a2;
        g6b lifecycle;
        imageView.getClass();
        eoh eohVar = (eoh) b;
        boolean booleanValue = ((Boolean) eohVar.getValue()).booleanValue();
        boolean z = a;
        String M = (booleanValue && i == 12994 && z) ? "https://userimage.sofascore.com/ca464615b00248daf4f30df1cb2caddc.jpg" : pco.M(i);
        fsf fsfVar = new fsf();
        int i2 = 0;
        rq3 rq3Var = null;
        if (i == 12994 && !((Boolean) eohVar.getValue()).booleanValue() && z) {
            Context context = imageView.getContext();
            context.getClass();
            FragmentActivity K = hkg.K(context);
            BaseActivity baseActivity = K instanceof BaseActivity ? (BaseActivity) K : null;
            if (baseActivity != null) {
                fsfVar.a = xw3.L(wca.x(baseActivity.getLifecycle()), null, null, new yp7(baseActivity, imageView, rq3Var, 17), 3);
            }
            if (imageView.isAttachedToWindow()) {
                u6b w = qha.w(imageView);
                if (w != null && (lifecycle = w.getLifecycle()) != null) {
                    lifecycle.a(new zr9(lifecycle, fsfVar, 0));
                }
            } else {
                imageView.addOnAttachStateChangeListener(new yr9(imageView, imageView, fsfVar, i2));
            }
        }
        apf a3 = ajh.a(imageView.getContext());
        ht9 ht9Var = new ht9(imageView.getContext());
        ht9Var.c = M;
        vt9.f(ht9Var, imageView);
        Context context2 = imageView.getContext();
        context2.getClass();
        wt9 I = rfo.I(imageView);
        z8e.Q(ht9Var, context2, R.drawable.player_photo_placeholder, (I == null || (a2 = I.a()) == null) ? null : a2.e, null);
        st9.b(ht9Var, ph0.x(new awj[]{ty1Var, new urh()}));
        a3.a(ht9Var.a());
    }

    public static final void m(ImageView imageView, int i) {
        nt9 a2;
        imageView.getClass();
        String j = vxd.j(i, (Intrinsics.c(uaa.c, "api.sofascore.com/") ? "https://img.sofascore.com/" : dmi.q("https://", uaa.c)).concat("api/v1/"), "referee/", "/image");
        apf a3 = ajh.a(imageView.getContext());
        ht9 ht9Var = new ht9(imageView.getContext());
        ht9Var.c = j;
        vt9.f(ht9Var, imageView);
        Context context = imageView.getContext();
        context.getClass();
        wt9 I = rfo.I(imageView);
        z8e.Q(ht9Var, context, R.drawable.player_photo_placeholder, (I == null || (a2 = I.a()) == null) ? null : a2.e, null);
        awj[] awjVarArr = {new urh()};
        sl6 sl6Var = st9.a;
        st9.b(ht9Var, ph0.X(awjVarArr));
        a3.a(ht9Var.a());
    }

    public static final void n(ImageView imageView, Stage stage, boolean z) {
        nt9 a2;
        imageView.getClass();
        stage.getClass();
        String Q = pco.Q(stage.getId(), z);
        apf a3 = ajh.a(imageView.getContext());
        ht9 ht9Var = new ht9(imageView.getContext());
        ht9Var.c = Q;
        vt9.f(ht9Var, imageView);
        int id = stage.getId();
        StringBuilder sb = new StringBuilder();
        sb.append(id);
        sb.append(z);
        String sb2 = sb.toString();
        ht9Var.f = sb2;
        ht9Var.i = sb2;
        Context context = imageView.getContext();
        context.getClass();
        wt9 I = rfo.I(imageView);
        z8e.Q(ht9Var, context, R.drawable.ic_flag_placeholder, (I == null || (a2 = I.a()) == null) ? null : a2.e, null);
        ht9Var.e = new hcc(10, stage, imageView, sb2);
        a3.a(ht9Var.a());
    }

    public static void o(ImageView imageView, int i) {
        nt9 a2;
        imageView.getClass();
        String R = pco.R(i);
        apf a3 = ajh.a(imageView.getContext());
        ht9 ht9Var = new ht9(imageView.getContext());
        ht9Var.c = R;
        vt9.f(ht9Var, imageView);
        Context context = imageView.getContext();
        context.getClass();
        wt9 I = rfo.I(imageView);
        z8e.Q(ht9Var, context, R.drawable.team_logo_placeholder, (I == null || (a2 = I.a()) == null) ? null : a2.e, Integer.valueOf(R.color.neutral_default));
        a3.a(ht9Var.a());
    }

    public static final void p(ImageView imageView, Team team, boolean z) {
        team.getClass();
        imageView.setVisibility(team.getType() != 2 ? 0 : 8);
        aik.Q(imageView).a();
        int type = team.getType();
        if (type == 0) {
            o(imageView, team.getId());
            return;
        }
        if (type != 1) {
            return;
        }
        if (!z) {
            imageView.setVisibility(8);
        } else {
            Country country = team.getCountry();
            c(imageView, country != null ? country.getAlpha2() : null, false, null, 6);
        }
    }

    public static final void q(ImageView imageView, Integer num, int i, Integer num2) {
        nt9 a2;
        imageView.getClass();
        Context context = imageView.getContext();
        context.getClass();
        String I = pco.I(i, num, hkg.b0(context));
        String str = I + "-" + num2;
        apf a3 = ajh.a(imageView.getContext());
        ht9 ht9Var = new ht9(imageView.getContext());
        ht9Var.c = I;
        vt9.f(ht9Var, imageView);
        ht9Var.f = str;
        ht9Var.i = str;
        if (num2 != null) {
            ht9Var.e = new ejg(imageView, num2, str);
        }
        Context context2 = imageView.getContext();
        context2.getClass();
        wt9 I2 = rfo.I(imageView);
        z8e.Q(ht9Var, context2, R.drawable.cup_logo_placeholder, (I2 == null || (a2 = I2.a()) == null) ? null : a2.e, Integer.valueOf(R.color.neutral_default));
        a3.a(ht9Var.a());
    }

    public static void r(ImageView imageView, UserBadge userBadge, int i) {
        boolean z = (i & 4) == 0;
        Integer num = null;
        int i2 = R.drawable.ic_moderator_badge;
        if (z) {
            if (userBadge != null) {
                if (userBadge != UserBadge.MODERATOR) {
                    i2 = 0;
                }
                num = Integer.valueOf(i2);
            }
        } else if (userBadge != null) {
            int i3 = u9f.a[userBadge.ordinal()];
            if (i3 != 1) {
                i2 = i3 != 2 ? i3 != 3 ? i3 != 4 ? 0 : R.drawable.ic_top_predictors_badge : R.drawable.ic_top_contributor_badge : R.drawable.ic_top_editor_badge;
            }
            num = Integer.valueOf(i2);
        }
        imageView.setVisibility(num == null ? 8 : 0);
        if (num != null) {
            imageView.setImageResource(num.intValue());
        }
    }

    public static final void s(ImageView imageView, String str) {
        nt9 a2;
        if (str == null) {
            str = "";
        }
        String z = pco.z(str);
        apf a3 = ajh.a(imageView.getContext());
        ht9 ht9Var = new ht9(imageView.getContext());
        ht9Var.c = z;
        vt9.f(ht9Var, imageView);
        Context context = imageView.getContext();
        context.getClass();
        wt9 I = rfo.I(imageView);
        z8e.Q(ht9Var, context, R.drawable.player_photo_placeholder, (I == null || (a2 = I.a()) == null) ? null : a2.e, null);
        awj[] awjVarArr = {new urh()};
        sl6 sl6Var = st9.a;
        st9.b(ht9Var, ph0.X(awjVarArr));
        a3.a(ht9Var.a());
    }

    public static void t(ImageView imageView, String str) {
        nt9 a2;
        apf a3 = ajh.a(imageView.getContext());
        ht9 ht9Var = new ht9(imageView.getContext());
        ht9Var.c = str;
        vt9.f(ht9Var, imageView);
        Context context = imageView.getContext();
        context.getClass();
        wt9 I = rfo.I(imageView);
        z8e.Q(ht9Var, context, R.drawable.player_photo_placeholder, (I == null || (a2 = I.a()) == null) ? null : a2.e, null);
        awj[] awjVarArr = {new urh()};
        sl6 sl6Var = st9.a;
        st9.b(ht9Var, ph0.X(awjVarArr));
        a3.a(ht9Var.a());
    }
}
