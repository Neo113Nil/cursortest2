package defpackage;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Rect;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.google.android.material.chip.Chip;
import com.sofascore.model.Sports;
import com.sofascore.results.R;
import com.sofascore.results.base.BaseActivity;
import com.sofascore.results.event.boxscore.EventBoxScoreFragment;
import com.sofascore.results.helper.SofaBackupAgent;
import com.sofascore.results.settings.SettingsFragment;
import com.sofascore.results.stagesport.fragments.details.StageDetailsRankingFragment;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class hn implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ hn(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        SharedPreferences d;
        SharedPreferences d2;
        SharedPreferences d3;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                BaseActivity baseActivity = (BaseActivity) obj;
                SharedPreferences sharedPreferences = uic.j;
                if (sharedPreferences == null) {
                    Context applicationContext = baseActivity.getApplicationContext();
                    synchronized (uic.i) {
                        d = a5f.d(applicationContext);
                        uic.j = d;
                    }
                    d.getClass();
                    sharedPreferences = d;
                }
                SharedPreferences.Editor i2 = dmi.i(sharedPreferences, "PREF_NOTIFICATIONS_DISABLED_DIALOG_DO_NOT_SHOW_AGAIN", z);
                Unit unit = Unit.a;
                i2.apply();
                return;
            case 1:
                Rect rect = Chip.w;
                CompoundButton.OnCheckedChangeListener onCheckedChangeListener = ((Chip) obj).i;
                if (onCheckedChangeListener != null) {
                    onCheckedChangeListener.onCheckedChanged(compoundButton, z);
                    return;
                }
                return;
            case 2:
                EventBoxScoreFragment eventBoxScoreFragment = (EventBoxScoreFragment) obj;
                compoundButton.getClass();
                Context requireContext = eventBoxScoreFragment.requireContext();
                requireContext.getClass();
                SharedPreferences sharedPreferences2 = uic.j;
                if (sharedPreferences2 == null) {
                    Context applicationContext2 = requireContext.getApplicationContext();
                    synchronized (uic.i) {
                        d2 = a5f.d(applicationContext2);
                        uic.j = d2;
                    }
                    d2.getClass();
                    sharedPreferences2 = d2;
                }
                SharedPreferences.Editor i3 = dmi.i(sharedPreferences2, "LINEUPS_VIEW_MODE_LONG", z);
                Unit unit2 = Unit.a;
                i3.apply();
                eventBoxScoreFragment.G().m(z, !Intrinsics.c(ok3.s(eventBoxScoreFragment.E()), Sports.VOLLEYBALL));
                eventBoxScoreFragment.K(z);
                Map map = SofaBackupAgent.b;
                aik.h0();
                int color = eventBoxScoreFragment.requireContext().getColor(z ? R.color.primary_default : R.color.n_lv_3);
                krk krkVar = eventBoxScoreFragment.l;
                krkVar.getClass();
                TextView textView = ((a22) krkVar).c.c;
                ObjectAnimator ofArgb = ObjectAnimator.ofArgb(textView, "textColor", textView.getCurrentTextColor(), color);
                ofArgb.setDuration(500L);
                ofArgb.start();
                return;
            case 3:
                SettingsFragment settingsFragment = (SettingsFragment) obj;
                compoundButton.getClass();
                Context requireContext2 = settingsFragment.requireContext();
                requireContext2.getClass();
                SharedPreferences sharedPreferences3 = uic.j;
                if (sharedPreferences3 == null) {
                    Context applicationContext3 = requireContext2.getApplicationContext();
                    synchronized (uic.i) {
                        d3 = a5f.d(applicationContext3);
                        uic.j = d3;
                    }
                    d3.getClass();
                    sharedPreferences3 = d3;
                }
                SharedPreferences.Editor i4 = dmi.i(sharedPreferences3, "PREF_NOTIFICATION_TTS", z);
                Unit unit3 = Unit.a;
                i4.apply();
                Context requireContext3 = settingsFragment.requireContext();
                requireContext3.getClass();
                kv kvVar = z ? kv.SWITCH_ON : null;
                if (kvVar == null) {
                    kvVar = kv.SWITCH_OFF;
                }
                nv.z0(requireContext3, kvVar, "text_to_speech", "settings");
                return;
            default:
                StageDetailsRankingFragment stageDetailsRankingFragment = (StageDetailsRankingFragment) obj;
                compoundButton.getClass();
                q3i D = stageDetailsRankingFragment.D();
                D.l = z;
                D.m = z ? 0 : null;
                D.m();
                Context requireContext4 = stageDetailsRankingFragment.requireContext();
                requireContext4.getClass();
                nv.z0(requireContext4, z ? kv.SWITCH_ON : kv.SWITCH_OFF, "standings_appearance", "motorsport_standings");
                return;
        }
    }
}
