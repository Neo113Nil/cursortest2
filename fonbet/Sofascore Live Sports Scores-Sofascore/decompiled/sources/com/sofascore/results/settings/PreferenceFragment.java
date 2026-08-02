package com.sofascore.results.settings;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import androidx.preference.Preference;
import androidx.preference.PreferenceCategory;
import androidx.preference.PreferenceScreen;
import androidx.preference.SwitchPreference;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.l;
import com.sofascore.model.FirebaseBundle;
import com.sofascore.model.odds.OddsCountryProvider;
import com.sofascore.results.R;
import com.sofascore.results.base.BaseActivity;
import com.sofascore.results.dialog.SettingsBottomSheetModal;
import com.sofascore.results.dialog.SettingsItem;
import com.sofascore.results.helper.SofaBackupAgent;
import com.sofascore.results.settings.PreferenceFragment;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.a5f;
import defpackage.a70;
import defpackage.aba;
import defpackage.adc;
import defpackage.aef;
import defpackage.aik;
import defpackage.ao2;
import defpackage.bga;
import defpackage.ccd;
import defpackage.cp4;
import defpackage.cv;
import defpackage.d5f;
import defpackage.dla;
import defpackage.duf;
import defpackage.g5f;
import defpackage.gl0;
import defpackage.hi3;
import defpackage.hjg;
import defpackage.i31;
import defpackage.ia0;
import defpackage.k13;
import defpackage.k4f;
import defpackage.kb0;
import defpackage.ke0;
import defpackage.kp5;
import defpackage.kr9;
import defpackage.lnb;
import defpackage.mnc;
import defpackage.mz1;
import defpackage.n9e;
import defpackage.nv;
import defpackage.otk;
import defpackage.ph0;
import defpackage.px0;
import defpackage.su;
import defpackage.t1d;
import defpackage.u4f;
import defpackage.uic;
import defpackage.vfj;
import defpackage.vl;
import defpackage.wpb;
import defpackage.xld;
import defpackage.y6f;
import defpackage.z6f;
import defpackage.zu3;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.c;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/sofascore/results/settings/PreferenceFragment;", "Landroidx/preference/PreferenceFragmentCompat;", "Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PreferenceFragment extends Hilt_PreferenceFragment implements SharedPreferences.OnSharedPreferenceChangeListener {
    public SharedPreferences o;
    public String p;
    public long q;
    public final otk n = new otk(duf.a.getOrCreateKotlinClass(d5f.class), new u4f(this, 0), new u4f(this, 2), new u4f(this, 1));
    public final px0 r = new px0(9, this, false);

    public static void p(final PreferenceFragment preferenceFragment, final Preference preference, List list, List list2, final String str, final String str2, final String str3) {
        String str4;
        final ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        int i = 0;
        while (true) {
            Object obj = null;
            String str5 = "";
            if (!it.hasNext()) {
                String string = preferenceFragment.o().getString(str2, str3);
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next = it2.next();
                    if (Intrinsics.c(((SettingsItem) next).a, string)) {
                        obj = next;
                        break;
                    }
                }
                SettingsItem settingsItem = (SettingsItem) obj;
                if (settingsItem != null && (str4 = settingsItem.b) != null) {
                    str5 = str4;
                }
                preference.u(str5);
                preference.e = new k4f() { // from class: s4f
                    @Override // defpackage.k4f
                    public final void m(Preference preference2) {
                        SharedPreferences d;
                        PreferenceFragment preferenceFragment2 = PreferenceFragment.this;
                        String str6 = str;
                        String str7 = str2;
                        String str8 = str3;
                        ArrayList arrayList2 = arrayList;
                        Preference preference3 = preference;
                        FragmentActivity requireActivity = preferenceFragment2.requireActivity();
                        requireActivity.getClass();
                        vsc vscVar = new vsc(10, preferenceFragment2, preference3, str7);
                        str6.getClass();
                        str8.getClass();
                        SettingsBottomSheetModal settingsBottomSheetModal = new SettingsBottomSheetModal();
                        Bundle bundle = new Bundle();
                        bundle.putString("MODAL_TITLE", str6);
                        bundle.putString("MODAL_PREFERENCE_KEY", str7);
                        bundle.putString("MODAL_DEFAULT_VALUE", str8);
                        bundle.putParcelableArrayList("MODAL_ITEM_LIST", new ArrayList<>(arrayList2));
                        bundle.putString("MODAL_SELECTED_ITEM", null);
                        settingsBottomSheetModal.setArguments(bundle);
                        settingsBottomSheetModal.C = vscVar;
                        AppCompatActivity appCompatActivity = requireActivity instanceof AppCompatActivity ? (AppCompatActivity) requireActivity : null;
                        if (appCompatActivity != null) {
                            wca.x(appCompatActivity.getLifecycle()).b(new r1(settingsBottomSheetModal, appCompatActivity, null, 3));
                        }
                        if (str7.equals("PREF_HOME_SCREEN")) {
                            Context context = preference3.a;
                            context.getClass();
                            SharedPreferences sharedPreferences = uic.j;
                            if (sharedPreferences == null) {
                                Context applicationContext = context.getApplicationContext();
                                synchronized (uic.i) {
                                    d = a5f.d(applicationContext);
                                    uic.j = d;
                                }
                                d.getClass();
                                sharedPreferences = d;
                            }
                            SharedPreferences.Editor i2 = dmi.i(sharedPreferences, "PRIMARY_TAB_PROMPT_DISMISSED", true);
                            Unit unit = Unit.a;
                            i2.apply();
                        }
                    }
                };
                return;
            }
            Object next2 = it.next();
            int i2 = i + 1;
            if (i < 0) {
                b.q();
                throw null;
            }
            String str6 = (String) next2;
            if (i <= list2.size() - 1) {
                str5 = (String) list2.get(i);
            }
            arrayList.add(new SettingsItem(str6, str5));
            i = i2;
        }
    }

    @Override // androidx.preference.PreferenceFragmentCompat
    public final l k(PreferenceScreen preferenceScreen) {
        preferenceScreen.getClass();
        return new g5f(preferenceScreen);
    }

    /* JADX WARN: Code restructure failed: missing block: B:135:0x04ac, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.c(r2.getString("PREF_MANAGE_ODDS_ADDS_V2", "under_18"), "25_or_older") != false) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x0578, code lost:
    
        if (r2.getBoolean("IN_APP_PURCHASE_AVAILABLE", true) == false) goto L191;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x0536, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.c(r2.getString("PREF_MANAGE_ODDS_ADDS_V2", "under_18"), "25_or_older") != false) goto L175;
     */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0492  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x04b8  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0507  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0592  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x05e0  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x05ee  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0602  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0638  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0662  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0609  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x051a  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0551  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0584  */
    @Override // androidx.preference.PreferenceFragmentCompat
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(String str) {
        Preference preference;
        Preference preference2;
        int i;
        boolean z;
        Preference preference3;
        Preference j;
        Context requireContext;
        boolean z2;
        boolean z3;
        SharedPreferences d;
        Preference j2;
        SwitchPreference switchPreference;
        Bundle arguments;
        Bundle arguments2;
        k4f k4fVar;
        boolean z4;
        Object obj;
        Object obj2;
        List split$default;
        boolean z5;
        PreferenceFragment preferenceFragment = this;
        a5f a5fVar = preferenceFragment.b;
        if (a5fVar == null) {
            cp4.h("This should be called after super.onCreate.");
            return;
        }
        PreferenceScreen h = a5fVar.h(preferenceFragment.requireContext());
        Preference preference4 = h;
        if (str != null) {
            Preference z6 = h.z(str);
            boolean z7 = z6 instanceof PreferenceScreen;
            preference4 = z6;
            if (!z7) {
                a70.p(lnb.o("Preference object with key ", str, " is not a PreferenceScreen"));
                return;
            }
        }
        PreferenceScreen preferenceScreen = (PreferenceScreen) preference4;
        a5f a5fVar2 = preferenceFragment.b;
        PreferenceScreen preferenceScreen2 = (PreferenceScreen) a5fVar2.g;
        if (preferenceScreen != preferenceScreen2) {
            if (preferenceScreen2 != null) {
                preferenceScreen2.m();
            }
            a5fVar2.g = preferenceScreen;
            preferenceFragment.d = true;
            if (preferenceFragment.e) {
                gl0 gl0Var = preferenceFragment.g;
                if (!gl0Var.hasMessages(1)) {
                    gl0Var.obtainMessage(1).sendToTarget();
                }
            }
        }
        String str2 = y6f.a;
        Context requireContext2 = preferenceFragment.requireContext();
        requireContext2.getClass();
        preferenceFragment.p = y6f.a(requireContext2);
        PreferenceCategory preferenceCategory = (PreferenceCategory) preferenceFragment.j("odds_category");
        Preference j3 = preferenceFragment.j("PREF_MANAGE_ODDS_ADDS_V2");
        boolean hasMcc = zu3.V.hasMcc(Integer.valueOf(ke0.c));
        if (j3 != null) {
            if (hasMcc) {
                ia0 ia0Var = ia0.q;
                if (mz1.C()) {
                    z5 = true;
                    j3.v(z5);
                    String[] stringArray = preferenceFragment.getResources().getStringArray(R.array.manage_odds_ads_values);
                    stringArray.getClass();
                    List X = ph0.X(stringArray);
                    String[] stringArray2 = preferenceFragment.getResources().getStringArray(R.array.manage_odds_ads_entries);
                    stringArray2.getClass();
                    List X2 = ph0.X(stringArray2);
                    String string = preferenceFragment.getString(R.string.odds_and_ads_settings_title);
                    string.getClass();
                    p(preferenceFragment, j3, X, X2, string, "PREF_MANAGE_ODDS_ADDS_V2", "");
                    preference = j3;
                    Unit unit = Unit.a;
                }
            }
            z5 = false;
            j3.v(z5);
            String[] stringArray3 = preferenceFragment.getResources().getStringArray(R.array.manage_odds_ads_values);
            stringArray3.getClass();
            List X3 = ph0.X(stringArray3);
            String[] stringArray22 = preferenceFragment.getResources().getStringArray(R.array.manage_odds_ads_entries);
            stringArray22.getClass();
            List X22 = ph0.X(stringArray22);
            String string2 = preferenceFragment.getString(R.string.odds_and_ads_settings_title);
            string2.getClass();
            p(preferenceFragment, j3, X3, X22, string2, "PREF_MANAGE_ODDS_ADDS_V2", "");
            preference = j3;
            Unit unit2 = Unit.a;
        } else {
            preference = j3;
        }
        Preference j4 = preferenceFragment.j("PREF_HOME_SCREEN");
        ArrayList b = y6f.b();
        Context requireContext3 = preferenceFragment.requireContext();
        requireContext3.getClass();
        kp5 kp5Var = z6f.g;
        ArrayList arrayList = new ArrayList();
        for (Object obj3 : kp5Var) {
            if (((z6f) obj3).b) {
                arrayList.add(obj3);
            }
        }
        ArrayList arrayList2 = new ArrayList(k13.r(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(requireContext3.getString(((z6f) it.next()).a));
        }
        if (j4 != null) {
            String string3 = preferenceFragment.getString(R.string.pref_primary_tab_dialog_title);
            string3.getClass();
            p(preferenceFragment, j4, b, arrayList2, string3, "PREF_HOME_SCREEN", y6f.a);
            preference2 = j4;
            Unit unit3 = Unit.a;
        } else {
            preference2 = j4;
        }
        Preference j5 = preferenceFragment.j("PREF_FIRST_DAY_OF_WEEK");
        if (j5 != null) {
            String[] stringArray4 = preferenceFragment.getResources().getStringArray(R.array.first_day_of_week_values);
            stringArray4.getClass();
            List X4 = ph0.X(stringArray4);
            String[] stringArray5 = preferenceFragment.getResources().getStringArray(R.array.first_day_of_week_entries);
            stringArray5.getClass();
            List X5 = ph0.X(stringArray5);
            String string4 = preferenceFragment.getString(R.string.first_day_of_week);
            string4.getClass();
            p(preferenceFragment, j5, X4, X5, string4, "PREF_FIRST_DAY_OF_WEEK", "MONDAY");
            Unit unit4 = Unit.a;
        }
        List list = dla.a;
        Context requireContext4 = preferenceFragment.requireContext();
        requireContext4.getClass();
        ArrayList c = dla.c(requireContext4);
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = c.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (!Intrinsics.c((String) next, "qa")) {
                arrayList3.add(next);
            }
        }
        ArrayList arrayList4 = new ArrayList(k13.r(arrayList3, 10));
        Iterator it3 = arrayList3.iterator();
        while (true) {
            i = 6;
            if (!it3.hasNext()) {
                break;
            }
            String str3 = (String) it3.next();
            str3.getClass();
            split$default = StringsKt__StringsKt.split$default(dla.f(str3), new String[]{"-"}, false, 0, 6, null);
            Locale locale = split$default.size() == 1 ? new Locale((String) split$default.get(0)) : null;
            if (locale == null) {
                locale = new Locale((String) split$default.get(0), (String) split$default.get(1));
            }
            String displayName = str3.equals("qa") ? "QA" : locale.getDisplayName(locale);
            String f = dla.f(str3);
            displayName.getClass();
            arrayList4.add(new SettingsItem(f, displayName));
        }
        wpb wpbVar = new wpb(23);
        Collator collator = Collator.getInstance();
        collator.getClass();
        ArrayList U0 = CollectionsKt.U0(CollectionsKt.H0(arrayList4, new i31(i, wpbVar, collator)));
        String string5 = preferenceFragment.getString(R.string.system_language);
        string5.getClass();
        U0.add(0, new SettingsItem("", string5));
        Preference j6 = preferenceFragment.j("PREF_LANGUAGE_CODE");
        if (j6 != null) {
            String string6 = preferenceFragment.getString(R.string.choose_language);
            string6.getClass();
            String c2 = kb0.b().c();
            c2.getClass();
            if (c.v(c2, "he", false)) {
                c2 = "iw";
            }
            ArrayList arrayList5 = new ArrayList(k13.r(arrayList3, 10));
            Iterator it4 = arrayList3.iterator();
            while (it4.hasNext()) {
                arrayList5.add(dla.f((String) it4.next()));
            }
            Iterator it5 = arrayList5.iterator();
            while (true) {
                if (!it5.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it5.next();
                String str4 = (String) obj;
                if (Intrinsics.c(str4, c2) || Intrinsics.c(str4, StringsKt.h0(c2, "-"))) {
                    break;
                }
            }
            String str5 = (String) obj;
            if (str5 == null) {
                str5 = "";
            }
            String str6 = str5;
            Iterator it6 = U0.iterator();
            while (true) {
                if (it6.hasNext()) {
                    obj2 = it6.next();
                    if (Intrinsics.c(((SettingsItem) obj2).a, str6)) {
                        break;
                    }
                } else {
                    obj2 = null;
                    break;
                }
            }
            SettingsItem settingsItem = (SettingsItem) obj2;
            j6.u(settingsItem != null ? settingsItem.b : null);
            preferenceFragment = this;
            j6.e = new hi3(this, string6, U0, str6, j6, 4);
            Unit unit5 = Unit.a;
        }
        Preference j7 = preferenceFragment.j("PREF_CURRENCY");
        if (j7 != null) {
            String[] stringArray6 = preferenceFragment.getResources().getStringArray(R.array.currency_values);
            stringArray6.getClass();
            List X6 = ph0.X(stringArray6);
            String[] stringArray7 = preferenceFragment.getResources().getStringArray(R.array.currency_entries);
            stringArray7.getClass();
            List X7 = ph0.X(stringArray7);
            String string7 = preferenceFragment.getString(R.string.currency);
            string7.getClass();
            p(preferenceFragment, j7, X6, X7, string7, "PREF_CURRENCY", "EURO");
            Unit unit6 = Unit.a;
        }
        Preference j8 = preferenceFragment.j("PREF_MEASUREMENT_UNITS");
        if (j8 != null) {
            String[] stringArray8 = preferenceFragment.getResources().getStringArray(R.array.units_values);
            stringArray8.getClass();
            ArrayList arrayList6 = new ArrayList(ph0.Z(stringArray8));
            String[] stringArray9 = preferenceFragment.getResources().getStringArray(R.array.units_entries);
            stringArray9.getClass();
            ArrayList arrayList7 = new ArrayList(ph0.Z(stringArray9));
            String string8 = preferenceFragment.getString(R.string.profile_measurement_system);
            string8.getClass();
            p(preferenceFragment, j8, arrayList6, arrayList7, string8, "PREF_MEASUREMENT_UNITS", "EURO");
            Unit unit7 = Unit.a;
        }
        bga bgaVar = xld.a;
        Context requireContext5 = preferenceFragment.requireContext();
        requireContext5.getClass();
        boolean f2 = xld.f(requireContext5, preferenceFragment.o());
        Preference j9 = preferenceFragment.j("PREF_PROVIDER_ODDS");
        Context requireContext6 = preferenceFragment.requireContext();
        requireContext6.getClass();
        if (xld.e(requireContext6)) {
            PreferenceScreen preferenceScreen3 = (PreferenceScreen) preferenceFragment.j("preferences");
            if (preferenceScreen3 != null && preferenceCategory != null) {
                preferenceScreen3.B(preferenceCategory);
            }
            Unit unit8 = Unit.a;
        } else {
            Context requireContext7 = preferenceFragment.requireContext();
            requireContext7.getClass();
            List<OddsCountryProvider> b2 = xld.b(requireContext7);
            ArrayList arrayList8 = new ArrayList();
            ArrayList arrayList9 = new ArrayList();
            if (!b2.isEmpty()) {
                Iterator it7 = b2.iterator();
                while (it7.hasNext()) {
                    if (((OddsCountryProvider) it7.next()).getGroup() != null) {
                        z = true;
                        break;
                    }
                }
            }
            z = false;
            if (!z) {
                for (OddsCountryProvider oddsCountryProvider : b2) {
                    if (oddsCountryProvider.getBranded()) {
                        StringBuilder sb = new StringBuilder(oddsCountryProvider.getProvider().getName());
                        List<OddsCountryProvider> subProviders = oddsCountryProvider.getSubProviders();
                        if (subProviders != null) {
                            if (!subProviders.isEmpty()) {
                                for (OddsCountryProvider oddsCountryProvider2 : subProviders) {
                                    sb.append(", ");
                                    sb.append(oddsCountryProvider2.getProvider().getName());
                                }
                            }
                            Unit unit9 = Unit.a;
                        }
                        arrayList8.add(sb.toString());
                    } else {
                        String string9 = preferenceFragment.getString(R.string.default_odds);
                        string9.getClass();
                        arrayList8.add(string9);
                    }
                    arrayList9.add(oddsCountryProvider.getProvider().getName());
                }
            }
            if (j9 != null) {
                j9.v(f2 && !z && (!hasMcc || arrayList9.size() > 1));
                Unit unit10 = Unit.a;
            }
            if (j9 != null) {
                String string10 = preferenceFragment.getString(R.string.odds_provider);
                string10.getClass();
                p(preferenceFragment, j9, arrayList9, arrayList8, string10, "PREF_PROVIDER_ODDS", "");
                preference3 = j9;
                Unit unit11 = Unit.a;
                j = preferenceFragment.j("PREF_ODDS");
                if (j != null) {
                    if (!f2 || hasMcc) {
                        if (hasMcc) {
                            SharedPreferences o = preferenceFragment.o();
                            hjg hjgVar = cv.b;
                        }
                        z4 = false;
                        j.v(z4);
                        Unit unit12 = Unit.a;
                    }
                    z4 = true;
                    j.v(z4);
                    Unit unit122 = Unit.a;
                }
                if (j != null) {
                    String[] stringArray10 = preferenceFragment.getResources().getStringArray(R.array.odds_entries_values);
                    stringArray10.getClass();
                    List X8 = ph0.X(stringArray10);
                    String[] stringArray11 = preferenceFragment.getResources().getStringArray(R.array.odds_entries);
                    stringArray11.getClass();
                    List X9 = ph0.X(stringArray11);
                    String string11 = preferenceFragment.getString(R.string.odds_title);
                    string11.getClass();
                    p(preferenceFragment, j, X8, X9, string11, "PREF_ODDS", "DECIMAL");
                    Unit unit13 = Unit.a;
                }
                SwitchPreference switchPreference2 = (SwitchPreference) preferenceFragment.j("PREF_PROVIDER_ODDS_ENABLE");
                bga bgaVar2 = xld.a;
                requireContext = preferenceFragment.requireContext();
                requireContext.getClass();
                if (!xld.e(requireContext)) {
                    PreferenceScreen preferenceScreen4 = (PreferenceScreen) preferenceFragment.j("preferences");
                    if (preferenceScreen4 != null && switchPreference2 != null) {
                        preferenceScreen4.B(switchPreference2);
                    }
                    Unit unit14 = Unit.a;
                } else if (switchPreference2 != null) {
                    if (!f2 || hasMcc) {
                        if (hasMcc) {
                            SharedPreferences o2 = preferenceFragment.o();
                            hjg hjgVar2 = cv.b;
                        }
                        z2 = false;
                        switchPreference2.z(z2);
                        preferenceFragment = this;
                        switchPreference2.e = new adc(this, preference3, hasMcc, j, switchPreference2);
                        if (!hasMcc) {
                            Context requireContext8 = preferenceFragment.requireContext();
                            requireContext8.getClass();
                            SharedPreferences sharedPreferences = uic.j;
                            if (sharedPreferences == null) {
                                Context applicationContext = requireContext8.getApplicationContext();
                                synchronized (uic.i) {
                                    d = a5f.d(applicationContext);
                                    uic.j = d;
                                }
                                d.getClass();
                                sharedPreferences = d;
                            }
                        }
                        ia0 ia0Var2 = ia0.q;
                        if (mz1.C()) {
                            z3 = false;
                            switchPreference2.v(z3);
                            Unit unit15 = Unit.a;
                        }
                        z3 = true;
                        switchPreference2.v(z3);
                        Unit unit152 = Unit.a;
                    }
                    z2 = true;
                    switchPreference2.z(z2);
                    preferenceFragment = this;
                    switchPreference2.e = new adc(this, preference3, hasMcc, j, switchPreference2);
                    if (!hasMcc) {
                    }
                    ia0 ia0Var22 = ia0.q;
                    if (mz1.C()) {
                    }
                    z3 = true;
                    switchPreference2.v(z3);
                    Unit unit1522 = Unit.a;
                }
                j2 = preferenceFragment.j("PREF_THEME");
                if (j2 != null) {
                    String[] stringArray12 = preferenceFragment.getResources().getStringArray(R.array.app_theme_values);
                    stringArray12.getClass();
                    List X10 = ph0.X(stringArray12);
                    String[] stringArray13 = preferenceFragment.getResources().getStringArray(R.array.app_theme_entries);
                    stringArray13.getClass();
                    List X11 = ph0.X(stringArray13);
                    String string12 = preferenceFragment.getString(R.string.app_theme_title);
                    string12.getClass();
                    p(preferenceFragment, j2, X10, X11, string12, "PREF_THEME", vfj.b);
                    Unit unit16 = Unit.a;
                }
                Set set = aef.a;
                Context requireContext9 = preferenceFragment.requireContext();
                requireContext9.getClass();
                boolean h2 = aef.h(requireContext9);
                switchPreference = (SwitchPreference) preferenceFragment.j("PREF_PROMOTIONS_ENABLE");
                if (switchPreference != null) {
                    ia0 ia0Var3 = ia0.q;
                    switchPreference.v(!mz1.C());
                    Unit unit17 = Unit.a;
                }
                if (switchPreference != null) {
                    switchPreference.z(h2);
                    switchPreference.e = new kr9(preferenceFragment, 21);
                    Unit unit18 = Unit.a;
                }
                arguments = preferenceFragment.getArguments();
                if (!Intrinsics.c(arguments == null ? arguments.getString("open") : null, "openAdsOddsPreferences") && !((d5f) preferenceFragment.n.getValue()).b) {
                    if (preference != null) {
                        ((d5f) preferenceFragment.n.getValue()).b = true;
                        k4f k4fVar2 = preference.e;
                        if (k4fVar2 != null) {
                            k4fVar2.m(preference);
                            return;
                        }
                        return;
                    }
                    return;
                }
                arguments2 = preferenceFragment.getArguments();
                if (Intrinsics.c(arguments2 != null ? arguments2.getString("open") : null, "openPrimaryTabPreference") && !((d5f) preferenceFragment.n.getValue()).b && preference2 != null) {
                    ((d5f) preferenceFragment.n.getValue()).b = true;
                    k4fVar = preference2.e;
                    if (k4fVar != null) {
                        k4fVar.m(preference2);
                    }
                }
                Unit unit19 = Unit.a;
            }
        }
        preference3 = j9;
        j = preferenceFragment.j("PREF_ODDS");
        if (j != null) {
        }
        if (j != null) {
        }
        SwitchPreference switchPreference22 = (SwitchPreference) preferenceFragment.j("PREF_PROVIDER_ODDS_ENABLE");
        bga bgaVar22 = xld.a;
        requireContext = preferenceFragment.requireContext();
        requireContext.getClass();
        if (!xld.e(requireContext)) {
        }
        j2 = preferenceFragment.j("PREF_THEME");
        if (j2 != null) {
        }
        Set set2 = aef.a;
        Context requireContext92 = preferenceFragment.requireContext();
        requireContext92.getClass();
        boolean h22 = aef.h(requireContext92);
        switchPreference = (SwitchPreference) preferenceFragment.j("PREF_PROMOTIONS_ENABLE");
        if (switchPreference != null) {
        }
        if (switchPreference != null) {
        }
        arguments = preferenceFragment.getArguments();
        if (!Intrinsics.c(arguments == null ? arguments.getString("open") : null, "openAdsOddsPreferences")) {
        }
        arguments2 = preferenceFragment.getArguments();
        if (Intrinsics.c(arguments2 != null ? arguments2.getString("open") : null, "openPrimaryTabPreference")) {
            ((d5f) preferenceFragment.n.getValue()).b = true;
            k4fVar = preference2.e;
            if (k4fVar != null) {
            }
        }
        Unit unit192 = Unit.a;
    }

    public final SharedPreferences o() {
        SharedPreferences sharedPreferences = this.o;
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        Intrinsics.i("preferences");
        throw null;
    }

    @Override // androidx.preference.PreferenceFragmentCompat, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        boolean z = getParentFragmentManager().J() > 0;
        px0 px0Var = this.r;
        px0Var.f(z);
        requireActivity().getOnBackPressedDispatcher().a(this, px0Var);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        SharedPreferences g = this.b.g();
        if (g != null) {
            g.unregisterOnSharedPreferenceChangeListener(this);
        }
        FragmentActivity requireActivity = requireActivity();
        requireActivity.getClass();
        nv.U((BaseActivity) requireActivity, "PreferencesTab", System.currentTimeMillis() - this.q, new su(Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE, null, null));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        this.q = System.currentTimeMillis();
        SharedPreferences g = this.b.g();
        if (g != null) {
            g.registerOnSharedPreferenceChangeListener(this);
        }
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        int i;
        OddsCountryProvider oddsCountryProvider;
        if (sharedPreferences == null || str == null) {
            return;
        }
        Object obj = null;
        switch (str.hashCode()) {
            case -1377203890:
                if (str.equals("PREF_FIRST_DAY_OF_WEEK")) {
                    ke0.i = true;
                    return;
                }
                return;
            case -1361875504:
                if (!str.equals("PREF_MEASUREMENT_UNITS")) {
                    return;
                }
                break;
            case -228453235:
                if (str.equals("PREF_THEME")) {
                    Context requireContext = requireContext();
                    requireContext.getClass();
                    vfj.a(requireContext, new t1d(this, 14));
                    Map map = SofaBackupAgent.b;
                    aik.h0();
                    return;
                }
                return;
            case 694433174:
                if (str.equals("PREF_PROVIDER_ODDS")) {
                    String string = sharedPreferences.getString(str, "null");
                    bga bgaVar = xld.a;
                    Context requireContext2 = requireContext();
                    requireContext2.getClass();
                    Iterator it = xld.b(requireContext2).iterator();
                    do {
                        i = 17;
                        if (!it.hasNext()) {
                            bga bgaVar2 = xld.a;
                            Context requireContext3 = requireContext();
                            requireContext3.getClass();
                            n9e.u(requireContext3, new mnc(obj, i));
                            return;
                        }
                        oddsCountryProvider = (OddsCountryProvider) it.next();
                    } while (!Intrinsics.c(oddsCountryProvider.getProvider().getName(), string));
                    bga bgaVar3 = xld.a;
                    Context requireContext4 = requireContext();
                    requireContext4.getClass();
                    n9e.u(requireContext4, new mnc(oddsCountryProvider, i));
                    return;
                }
                return;
            case 1139355309:
                if (!str.equals("PREF_CURRENCY")) {
                    return;
                }
                break;
            case 1200633776:
                if (str.equals("PREF_HOME_SCREEN")) {
                    Map map2 = SofaBackupAgent.b;
                    aik.h0();
                    String string2 = sharedPreferences.getString(str, "");
                    if (Intrinsics.c(this.p, string2)) {
                        return;
                    }
                    ke0.k = true;
                    this.p = string2;
                    Context requireContext5 = requireContext();
                    requireContext5.getClass();
                    String str2 = this.p;
                    String str3 = str2 != null ? str2 : "";
                    FirebaseBundle firebaseBundle = new FirebaseBundle();
                    firebaseBundle.putString("choice", str3);
                    nv.N(requireContext5, firebaseBundle, "choose_main_screen");
                    return;
                }
                return;
            case 1516498368:
                if (!str.equals("PREF_ODDS")) {
                    return;
                }
                break;
            case 1893330540:
                if (str.equals("PREF_MANAGE_ODDS_ADDS_V2")) {
                    ccd ccdVar = vl.b;
                    String string3 = sharedPreferences.getString(str, "under_18");
                    ccdVar.getClass();
                    Iterator<E> it2 = vl.g.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            Object next = it2.next();
                            if (((vl) next).a.equals(string3)) {
                                obj = next;
                            }
                        }
                    }
                    vl vlVar = (vl) obj;
                    if (vlVar == null) {
                        vlVar = vl.e;
                    }
                    SharedPreferences.Editor edit = o().edit();
                    edit.getClass();
                    edit.putBoolean("PREF_PROVIDER_ODDS_ENABLE", vlVar == vl.c);
                    edit.apply();
                    return;
                }
                return;
            default:
                return;
        }
        Map map3 = SofaBackupAgent.b;
        aik.h0();
    }

    @Override // androidx.preference.PreferenceFragmentCompat, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        RecyclerView recyclerView = this.c;
        recyclerView.getClass();
        Context requireContext = requireContext();
        requireContext.getClass();
        recyclerView.setPaddingRelative(recyclerView.getPaddingStart(), recyclerView.getPaddingTop(), recyclerView.getPaddingEnd(), ao2.s(48, requireContext));
        aba.F(view);
    }

    public final void q(float f) {
        View view = getView();
        if (view != null) {
            view.animate().translationX(view.getMeasuredWidth() * f * 0.2f).setDuration(0L).start();
        }
    }
}
