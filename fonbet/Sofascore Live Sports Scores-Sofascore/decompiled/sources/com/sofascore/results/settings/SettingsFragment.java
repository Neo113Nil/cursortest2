package com.sofascore.results.settings;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.a;
import androidx.fragment.app.s;
import com.google.android.gms.internal.consent_sdk.zza;
import com.google.android.gms.internal.consent_sdk.zzj;
import com.ironsource.C4227o2;
import com.sofascore.local_persistance.UserAccount;
import com.sofascore.results.R;
import com.sofascore.results.ads.UpgradeSofascoreActivity;
import com.sofascore.results.feedback.FeedbackActivity;
import com.sofascore.results.mvvm.base.AbstractActivity;
import com.sofascore.results.notifications.NotificationSettingsActivity;
import com.sofascore.results.profile.edit.ProfileEditActivity;
import com.sofascore.results.profile.view.ProfileClickableRowView;
import com.sofascore.results.settings.about.AboutActivity;
import com.sofascore.results.settings.deleteAccount.DeleteAccountActivity;
import defpackage.a5f;
import defpackage.a70;
import defpackage.bea;
import defpackage.ce;
import defpackage.de;
import defpackage.e2f;
import defpackage.e6g;
import defpackage.h04;
import defpackage.hn;
import defpackage.i0;
import defpackage.ia0;
import defpackage.imf;
import defpackage.krk;
import defpackage.kv;
import defpackage.lnb;
import defpackage.mx9;
import defpackage.nq8;
import defpackage.nv;
import defpackage.ok3;
import defpackage.p4h;
import defpackage.pn;
import defpackage.qp8;
import defpackage.uic;
import defpackage.vjk;
import defpackage.yhk;
import defpackage.z8e;
import defpackage.zic;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/sofascore/results/settings/SettingsFragment;", "Lcom/sofascore/results/mvvm/base/AbstractFragment;", "Lqp8;", "Landroid/view/View$OnClickListener;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SettingsFragment extends Hilt_SettingsFragment<qp8> implements View.OnClickListener {
    public final de r;

    public SettingsFragment() {
        de registerForActivityResult = registerForActivityResult(new ce(3), new imf(this, 9));
        registerForActivityResult.getClass();
        this.r = registerForActivityResult;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0057 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0058 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean C() {
        boolean z;
        char c;
        zzj b = zza.a(requireContext()).b();
        synchronized (b.d) {
            z = b.g;
        }
        if (z) {
            String string = b.a.b.getString("privacy_options_requirement_status", "UNKNOWN");
            if (string == null) {
                yhk.s("Name is null");
            } else if (!string.equals("UNKNOWN")) {
                if (string.equals("NOT_REQUIRED")) {
                    c = 2;
                } else if (string.equals("REQUIRED")) {
                    c = 3;
                } else {
                    a70.p("No enum constant com.google.android.ump.ConsentInformation.PrivacyOptionsRequirementStatus.".concat(string));
                }
                return c == 3;
            }
            c = 0;
            if (c == 3) {
            }
        }
        c = 1;
        if (c == 3) {
        }
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final krk k() {
        View inflate = getLayoutInflater().inflate(R.layout.fragment_settings, (ViewGroup) null, false);
        int i = R.id.account;
        CardView cardView = (CardView) nq8.B(R.id.account, inflate);
        if (cardView != null) {
            i = R.id.button_about;
            ProfileClickableRowView profileClickableRowView = (ProfileClickableRowView) nq8.B(R.id.button_about, inflate);
            if (profileClickableRowView != null) {
                i = R.id.button_delete_account;
                TextView textView = (TextView) nq8.B(R.id.button_delete_account, inflate);
                if (textView != null) {
                    i = R.id.button_edit_profile;
                    ProfileClickableRowView profileClickableRowView2 = (ProfileClickableRowView) nq8.B(R.id.button_edit_profile, inflate);
                    if (profileClickableRowView2 != null) {
                        i = R.id.button_faq;
                        ProfileClickableRowView profileClickableRowView3 = (ProfileClickableRowView) nq8.B(R.id.button_faq, inflate);
                        if (profileClickableRowView3 != null) {
                            i = R.id.button_feedback;
                            ProfileClickableRowView profileClickableRowView4 = (ProfileClickableRowView) nq8.B(R.id.button_feedback, inflate);
                            if (profileClickableRowView4 != null) {
                                i = R.id.button_log_out;
                                ProfileClickableRowView profileClickableRowView5 = (ProfileClickableRowView) nq8.B(R.id.button_log_out, inflate);
                                if (profileClickableRowView5 != null) {
                                    i = R.id.button_notifications;
                                    ProfileClickableRowView profileClickableRowView6 = (ProfileClickableRowView) nq8.B(R.id.button_notifications, inflate);
                                    if (profileClickableRowView6 != null) {
                                        i = R.id.button_preferences;
                                        ProfileClickableRowView profileClickableRowView7 = (ProfileClickableRowView) nq8.B(R.id.button_preferences, inflate);
                                        if (profileClickableRowView7 != null) {
                                            i = R.id.button_privacy;
                                            ProfileClickableRowView profileClickableRowView8 = (ProfileClickableRowView) nq8.B(R.id.button_privacy, inflate);
                                            if (profileClickableRowView8 != null) {
                                                i = R.id.button_rate;
                                                ProfileClickableRowView profileClickableRowView9 = (ProfileClickableRowView) nq8.B(R.id.button_rate, inflate);
                                                if (profileClickableRowView9 != null) {
                                                    i = R.id.button_share;
                                                    ProfileClickableRowView profileClickableRowView10 = (ProfileClickableRowView) nq8.B(R.id.button_share, inflate);
                                                    if (profileClickableRowView10 != null) {
                                                        i = R.id.button_subscription;
                                                        ProfileClickableRowView profileClickableRowView11 = (ProfileClickableRowView) nq8.B(R.id.button_subscription, inflate);
                                                        if (profileClickableRowView11 != null) {
                                                            i = R.id.login_container;
                                                            CardView cardView2 = (CardView) nq8.B(R.id.login_container, inflate);
                                                            if (cardView2 != null) {
                                                                i = R.id.snackbar_anchor;
                                                                View B = nq8.B(R.id.snackbar_anchor, inflate);
                                                                if (B != null) {
                                                                    i = R.id.switch_tts;
                                                                    SwitchCompat switchCompat = (SwitchCompat) nq8.B(R.id.switch_tts, inflate);
                                                                    if (switchCompat != null) {
                                                                        return new qp8((FrameLayout) inflate, cardView, profileClickableRowView, textView, profileClickableRowView2, profileClickableRowView3, profileClickableRowView4, profileClickableRowView5, profileClickableRowView6, profileClickableRowView7, profileClickableRowView8, profileClickableRowView9, profileClickableRowView10, profileClickableRowView11, cardView2, B, switchCompat);
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
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        view.getClass();
        if (z8e.T(view, 1000L)) {
            int id = view.getId();
            int i = 0;
            if (id == R.id.button_subscription) {
                Context requireContext = requireContext();
                requireContext.getClass();
                nv.m0(requireContext, "subscription", "settings");
                int i2 = UpgradeSofascoreActivity.M;
                FragmentActivity requireActivity = requireActivity();
                requireActivity.getClass();
                e2f.k(requireActivity, false);
                return;
            }
            if (id == R.id.button_notifications) {
                Context requireContext2 = requireContext();
                requireContext2.getClass();
                nv.m0(requireContext2, C4227o2.x, "settings");
                int i3 = NotificationSettingsActivity.O;
                Context requireContext3 = requireContext();
                requireContext3.getClass();
                mx9.y(requireContext3);
                return;
            }
            if (id == R.id.button_preferences) {
                Context requireContext4 = requireContext();
                requireContext4.getClass();
                nv.m0(requireContext4, "preferences", "settings");
                s parentFragmentManager = getParentFragmentManager();
                parentFragmentManager.getClass();
                a aVar = new a(parentFragmentManager);
                aVar.d = R.anim.in_with_fade;
                aVar.e = R.anim.out_with_fade;
                aVar.f = R.anim.in_with_fade;
                aVar.g = R.anim.out_with_fade;
                aVar.i(R.id.container, aVar.h(PreferenceFragment.class, null), null, 1);
                aVar.c(null);
                aVar.f();
                return;
            }
            if (id == R.id.button_edit_profile) {
                Context requireContext5 = requireContext();
                requireContext5.getClass();
                nv.m0(requireContext5, "edit", "settings");
                ia0 ia0Var = ia0.q;
                UserAccount e = ok3.p().e();
                FragmentActivity activity = getActivity();
                if (activity != null) {
                    int i4 = ProfileEditActivity.L;
                    Context requireContext6 = requireContext();
                    requireContext6.getClass();
                    String id2 = e.getId();
                    id2.getClass();
                    Intent intent = new Intent(requireContext6, (Class<?>) ProfileEditActivity.class);
                    intent.putExtra("OPEN_PROFILE_ID", id2);
                    activity.startActivity(intent);
                    return;
                }
                return;
            }
            if (id == R.id.button_privacy) {
                FragmentActivity requireActivity2 = requireActivity();
                requireActivity2.getClass();
                zic.M(requireActivity2, 4);
                return;
            }
            if (id == R.id.button_share) {
                vjk[] vjkVarArr = vjk.a;
                Intent intent2 = new Intent("android.intent.action.SEND");
                intent2.setType("text/plain");
                intent2.putExtra("android.intent.extra.TEXT", "https://landing.sofascore.com/download/");
                startActivity(Intent.createChooser(intent2, getString(R.string.share_string)));
                Context requireContext7 = requireContext();
                requireContext7.getClass();
                nv.u0(requireContext7, null, "settings");
                return;
            }
            if (id == R.id.button_rate) {
                Context requireContext8 = requireContext();
                requireContext8.getClass();
                nv.m0(requireContext8, "rate_us", "settings");
                FragmentActivity requireActivity3 = requireActivity();
                requireActivity3.getClass();
                bea.G(requireActivity3, "https://play.google.com/store/apps/details?id=com.sofascore.results");
                return;
            }
            if (id == R.id.button_faq) {
                Context requireContext9 = requireContext();
                requireContext9.getClass();
                nv.m0(requireContext9, "FAQ", "settings");
                Context requireContext10 = requireContext();
                requireContext10.getClass();
                p4h.w(requireContext10, "https://sofascore.helpscoutdocs.com/");
                return;
            }
            if (id == R.id.button_feedback) {
                Context requireContext11 = requireContext();
                requireContext11.getClass();
                nv.m0(requireContext11, "give_feedback", "settings");
                int i5 = FeedbackActivity.M;
                Context requireContext12 = requireContext();
                requireContext12.getClass();
                requireContext12.startActivity(new Intent(requireContext12, (Class<?>) FeedbackActivity.class));
                return;
            }
            if (id == R.id.button_about) {
                Context requireContext13 = requireContext();
                requireContext13.getClass();
                nv.m0(requireContext13, "about_sofascore", "settings");
                int i6 = AboutActivity.O;
                Context requireContext14 = requireContext();
                requireContext14.getClass();
                requireContext14.startActivity(new Intent(requireContext14, (Class<?>) AboutActivity.class));
                return;
            }
            if (id != R.id.button_log_out) {
                if (id == R.id.button_delete_account) {
                    this.r.a(new Intent(requireContext(), (Class<?>) DeleteAccountActivity.class), null);
                    return;
                }
                return;
            }
            Context requireContext15 = requireContext();
            requireContext15.getClass();
            nv.z0(requireContext15, kv.CLICK, "logout_button", "user_profile");
            Context requireContext16 = requireContext();
            requireContext16.getClass();
            e6g e6gVar = new e6g(this, 17);
            AlertDialog h = lnb.h(R.style.RedesignDialog, requireContext16);
            h04 b = h04.b(LayoutInflater.from(requireContext16));
            b.d.setText(requireContext16.getString(R.string.sign_out_button));
            b.c.setText(requireContext16.getString(R.string.sign_out_confirmation));
            h.setView(b.b);
            h.setButton(-2, requireContext16.getString(R.string.cancel), new i0(h, 4));
            h.setButton(-1, requireContext16.getString(R.string.sign_out_button), new pn(e6gVar, i));
            h.show();
        }
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        SharedPreferences d;
        super.onResume();
        krk krkVar = this.l;
        krkVar.getClass();
        ProfileClickableRowView profileClickableRowView = ((qp8) krkVar).e;
        ia0 ia0Var = ia0.q;
        Boolean valueOf = Boolean.valueOf(ok3.p().e().getIsLoggedIn());
        Boolean bool = Boolean.TRUE;
        profileClickableRowView.setVisibility(valueOf.equals(bool) ? 0 : 8);
        krk krkVar2 = this.l;
        krkVar2.getClass();
        ((qp8) krkVar2).o.setVisibility(Boolean.valueOf(ok3.p().e().getIsLoggedIn()).equals(bool) ? 0 : 8);
        Context requireContext = requireContext();
        requireContext.getClass();
        SharedPreferences sharedPreferences = uic.j;
        if (sharedPreferences == null) {
            Context applicationContext = requireContext.getApplicationContext();
            synchronized (uic.i) {
                d = a5f.d(applicationContext);
                uic.j = d;
            }
            d.getClass();
            sharedPreferences = d;
        }
        boolean z = sharedPreferences.getBoolean("IN_APP_PURCHASE_AVAILABLE", true);
        krk krkVar3 = this.l;
        krkVar3.getClass();
        ((qp8) krkVar3).b.setVisibility((Boolean.valueOf(ok3.p().e().getIsLoggedIn()).equals(bool) || z || C()) ? 0 : 8);
        krk krkVar4 = this.l;
        krkVar4.getClass();
        ((qp8) krkVar4).n.setVisibility(z ? 0 : 8);
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final String p() {
        return "SettingsTab";
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final void s(View view, Bundle bundle) {
        SharedPreferences d;
        FragmentActivity activity = getActivity();
        AbstractActivity abstractActivity = activity instanceof AbstractActivity ? (AbstractActivity) activity : null;
        if (abstractActivity != null) {
            String string = getString(R.string.action_settings);
            string.getClass();
            abstractActivity.setTitle(string);
        }
        krk krkVar = this.l;
        krkVar.getClass();
        SwitchCompat switchCompat = ((qp8) krkVar).q;
        Context requireContext = requireContext();
        requireContext.getClass();
        SharedPreferences sharedPreferences = uic.j;
        if (sharedPreferences == null) {
            Context applicationContext = requireContext.getApplicationContext();
            synchronized (uic.i) {
                d = a5f.d(applicationContext);
                uic.j = d;
            }
            d.getClass();
            sharedPreferences = d;
        }
        switchCompat.setChecked(sharedPreferences.getBoolean("PREF_NOTIFICATION_TTS", false));
        switchCompat.setOnCheckedChangeListener(new hn(this, 3));
        krk krkVar2 = this.l;
        krkVar2.getClass();
        ((qp8) krkVar2).i.setOnClickListener(this);
        krk krkVar3 = this.l;
        krkVar3.getClass();
        ((qp8) krkVar3).j.setOnClickListener(this);
        krk krkVar4 = this.l;
        krkVar4.getClass();
        ((qp8) krkVar4).n.setOnClickListener(this);
        krk krkVar5 = this.l;
        krkVar5.getClass();
        ((qp8) krkVar5).e.setOnClickListener(this);
        krk krkVar6 = this.l;
        krkVar6.getClass();
        ((qp8) krkVar6).m.setOnClickListener(this);
        krk krkVar7 = this.l;
        krkVar7.getClass();
        ((qp8) krkVar7).l.setOnClickListener(this);
        krk krkVar8 = this.l;
        krkVar8.getClass();
        ((qp8) krkVar8).f.setOnClickListener(this);
        krk krkVar9 = this.l;
        krkVar9.getClass();
        ((qp8) krkVar9).g.setOnClickListener(this);
        krk krkVar10 = this.l;
        krkVar10.getClass();
        ProfileClickableRowView profileClickableRowView = ((qp8) krkVar10).k;
        profileClickableRowView.setVisibility(C() ? 0 : 8);
        profileClickableRowView.setOnClickListener(this);
        krk krkVar11 = this.l;
        krkVar11.getClass();
        ProfileClickableRowView profileClickableRowView2 = ((qp8) krkVar11).c;
        profileClickableRowView2.setOnClickListener(this);
        profileClickableRowView2.setInfoText("26.07.20");
        krk krkVar12 = this.l;
        krkVar12.getClass();
        ((qp8) krkVar12).h.setOnClickListener(this);
        krk krkVar13 = this.l;
        krkVar13.getClass();
        ((qp8) krkVar13).d.setOnClickListener(this);
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final void u() {
    }
}
