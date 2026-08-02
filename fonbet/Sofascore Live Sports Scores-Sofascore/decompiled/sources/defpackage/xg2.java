package defpackage;

import android.app.AlertDialog;
import android.content.SharedPreferences;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.sofascore.model.Sports;
import com.sofascore.results.R;
import com.sofascore.results.calendar.CalendarView;
import com.sofascore.results.main.MainActivity;
import com.unity3d.services.UnityAdsConstants;
import java.util.Calendar;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class xg2 implements Animation.AnimationListener {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ CalendarView c;

    public xg2(CalendarView calendarView, boolean z) {
        this.c = calendarView;
        this.b = z;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        dg2 dg2Var;
        int i = this.a;
        boolean z = this.b;
        CalendarView calendarView = this.c;
        animation.getClass();
        switch (i) {
            case 0:
                Function0<Unit> onHideCallback = calendarView.getOnHideCallback();
                if (onHideCallback != null) {
                    onHideCallback.invoke();
                }
                if (!z || (dg2Var = calendarView.b) == null) {
                    return;
                }
                MainActivity mainActivity = (MainActivity) ((bka) dg2Var).b;
                boolean z2 = MainActivity.n0;
                if (!Intrinsics.c(mainActivity.S(), Sports.MMA)) {
                    Set set = wyh.a;
                    if (!wyh.m(mainActivity.S()) && mainActivity.A().getBoolean("PREF_DOUBLE_SWIPE_DIALOG_FIRST_TIME", true)) {
                        AlertDialog create = new AlertDialog.Builder(mainActivity, R.style.RedesignDialog).create();
                        View inflate = LayoutInflater.from(mainActivity).inflate(R.layout.dialog_double_swipe, (ViewGroup) null, false);
                        int i2 = R.id.animation_view;
                        if (((LottieAnimationView) nq8.B(R.id.animation_view, inflate)) != null) {
                            i2 = R.id.dialog_follow_text;
                            if (((TextView) nq8.B(R.id.dialog_follow_text, inflate)) != null) {
                                create.setCanceledOnTouchOutside(false);
                                create.setView((ScrollView) inflate);
                                create.setButton(-1, mainActivity.getString(R.string.close_window_button), new on(0));
                                create.show();
                                SharedPreferences.Editor edit = mainActivity.A().edit();
                                edit.getClass();
                                edit.putBoolean("PREF_DOUBLE_SWIPE_DIALOG_FIRST_TIME", false);
                                edit.apply();
                            }
                        }
                        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
                        return;
                    }
                }
                if (mainActivity.W().l.size() > 0) {
                    mainActivity.V().v.j(Boolean.FALSE);
                    zqb V = mainActivity.V();
                    Calendar calendar = ke0.a;
                    calendar.getClass();
                    V.j0.j(new pn3(calendar));
                    V.o(calendar);
                    return;
                }
                return;
            default:
                AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                alphaAnimation.setDuration(200L);
                alphaAnimation.setAnimationListener(new xg2(calendarView, z));
                nr1 nr1Var = calendarView.a;
                if (nr1Var == null) {
                    Intrinsics.i("binding");
                    throw null;
                }
                ((LinearLayout) nr1Var.f).setVisibility(8);
                nr1 nr1Var2 = calendarView.a;
                if (nr1Var2 == null) {
                    Intrinsics.i("binding");
                    throw null;
                }
                ((LinearLayout) nr1Var2.c).startAnimation(alphaAnimation);
                nr1 nr1Var3 = calendarView.a;
                if (nr1Var3 == null) {
                    Intrinsics.i("binding");
                    throw null;
                }
                LinearLayout linearLayout = (LinearLayout) nr1Var3.c;
                linearLayout.getClass();
                linearLayout.setVisibility(8);
                return;
        }
    }

    public xg2(boolean z, CalendarView calendarView) {
        this.b = z;
        this.c = calendarView;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
