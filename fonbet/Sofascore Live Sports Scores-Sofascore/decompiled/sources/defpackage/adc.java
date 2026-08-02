package defpackage;

import android.app.AlertDialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.view.LayoutInflater;
import androidx.preference.Preference;
import androidx.preference.SwitchPreference;
import com.sofascore.model.odds.OddsCountryProvider;
import com.sofascore.results.R;
import com.sofascore.results.settings.PreferenceFragment;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class adc implements wn3, k4f {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ adc(b10 b10Var, lfb lfbVar, m6c m6cVar, IOException iOException, boolean z) {
        this.b = b10Var;
        this.c = lfbVar;
        this.d = m6cVar;
        this.e = iOException;
        this.a = z;
    }

    @Override // defpackage.wn3
    public void accept(Object obj) {
        b10 b10Var = (b10) this.b;
        ((edc) obj).d(b10Var.b, (scc) b10Var.c, (lfb) this.c, (m6c) this.d, (IOException) this.e, this.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ea, code lost:
    
        if (r9 == false) goto L32;
     */
    @Override // defpackage.k4f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m(Preference preference) {
        kv kvVar;
        PreferenceFragment preferenceFragment = (PreferenceFragment) this.b;
        Preference preference2 = (Preference) this.c;
        Preference preference3 = (Preference) this.d;
        SwitchPreference switchPreference = (SwitchPreference) this.e;
        SwitchPreference switchPreference2 = (SwitchPreference) preference;
        ia0 ia0Var = ia0.q;
        boolean z = true;
        char c = 1;
        if (mz1.C()) {
            Context requireContext = preferenceFragment.requireContext();
            requireContext.getClass();
            kvVar = switchPreference2.M ? kv.SWITCH_ON : null;
            if (kvVar == null) {
                kvVar = kv.SWITCH_OFF;
            }
            nv.z0(requireContext, kvVar, "show_odds_not_subscriber", "settings");
            Context requireContext2 = preferenceFragment.requireContext();
            requireContext2.getClass();
            zbe zbeVar = new zbe(12, switchPreference, preferenceFragment);
            int i = 7;
            ate ateVar = new ate(switchPreference, i);
            AlertDialog h = lnb.h(R.style.RedesignDialog, requireContext2);
            h04 b = h04.b(LayoutInflater.from(requireContext2));
            b.d.setText(requireContext2.getString(R.string.settings_odds_subscribe_to_hide_title));
            b.c.setText(requireContext2.getString(R.string.settings_odds_subscribe_to_hide_description));
            h.setView(b.b);
            h.setButton(-2, requireContext2.getString(R.string.cancel), new h0(6, ateVar, h));
            h.setButton(-1, requireContext2.getString(R.string.learn_how_to_get_badges), new h0(i, zbeVar, h));
            h.setOnDismissListener(new j0(ateVar, c == true ? 1 : 0));
            h.show();
            return;
        }
        Context requireContext3 = preferenceFragment.requireContext();
        requireContext3.getClass();
        kvVar = switchPreference2.M ? kv.SWITCH_ON : null;
        if (kvVar == null) {
            kvVar = kv.SWITCH_OFF;
        }
        nv.z0(requireContext3, kvVar, "show_odds_subscriber", "settings");
        boolean z2 = this.a;
        if (preference2 != null) {
            Context requireContext4 = preferenceFragment.requireContext();
            requireContext4.getClass();
            List b2 = xld.b(requireContext4);
            if (!b2.isEmpty()) {
                Iterator it = b2.iterator();
                while (it.hasNext()) {
                    if (((OddsCountryProvider) it.next()).getGroup() != null) {
                        break;
                    }
                }
            }
            if (switchPreference2.M) {
            }
            z = false;
            preference2.v(z);
        }
        if (preference3 != null) {
            preference3.v(switchPreference2.M);
        }
        SharedPreferences.Editor edit = preferenceFragment.o().edit();
        edit.getClass();
        boolean z3 = switchPreference2.M;
        if (!z2) {
            edit.putBoolean("PREF_PROVIDER_ODDS_ENABLE", z3);
        } else if (z3) {
            hjg hjgVar = cv.b;
            edit.putString("PREF_MANAGE_ODDS_ADDS_V2", "25_or_older");
        } else {
            hjg hjgVar2 = cv.b;
            edit.putString("PREF_MANAGE_ODDS_ADDS_V2", "under_18");
        }
        edit.apply();
    }

    public /* synthetic */ adc(PreferenceFragment preferenceFragment, Preference preference, boolean z, Preference preference2, SwitchPreference switchPreference) {
        this.b = preferenceFragment;
        this.c = preference;
        this.a = z;
        this.d = preference2;
        this.e = switchPreference;
    }
}
