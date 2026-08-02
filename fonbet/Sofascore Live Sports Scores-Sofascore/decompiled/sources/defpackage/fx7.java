package defpackage;

import android.app.AlertDialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.google.android.material.button.MaterialButton;
import com.sofascore.results.R;
import com.sofascore.results.feed.FeedFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class fx7 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ FeedFragment b;

    public /* synthetic */ fx7(FeedFragment feedFragment, int i) {
        this.a = i;
        this.b = feedFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        SharedPreferences d;
        Object value;
        SharedPreferences d2;
        SharedPreferences d3;
        int i = 0;
        switch (this.a) {
            case 0:
                FeedFragment feedFragment = this.b;
                Context requireContext = feedFragment.requireContext();
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
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.getClass();
                edit.putInt("PREF_FEED_UPDATE_COUNTER", 0);
                edit.putLong("PREF_FEED_UPDATE_TIMESTAMP", -1L);
                Unit unit = Unit.a;
                edit.apply();
                ldk ldkVar = (ldk) feedFragment.v.getValue();
                Context requireContext2 = feedFragment.requireContext();
                requireContext2.getClass();
                ldkVar.a(requireContext2, feedFragment.w);
                return Unit.a;
            case 1:
                FragmentActivity requireActivity = this.b.requireActivity();
                requireActivity.getClass();
                return new ldk(requireActivity, R.id.main_coordinator_layout);
            default:
                FeedFragment feedFragment2 = this.b;
                Context requireContext3 = feedFragment2.requireContext();
                requireContext3.getClass();
                SharedPreferences sharedPreferences2 = uic.j;
                if (sharedPreferences2 == null) {
                    Context applicationContext2 = requireContext3.getApplicationContext();
                    synchronized (uic.i) {
                        d3 = a5f.d(applicationContext2);
                        uic.j = d3;
                    }
                    d3.getClass();
                    sharedPreferences2 = d3;
                }
                int i2 = sharedPreferences2.getInt("PREF_FEED_UPDATE_COUNTER", 0);
                Context requireContext4 = feedFragment2.requireContext();
                requireContext4.getClass();
                int i3 = i2 + 1;
                SharedPreferences sharedPreferences3 = uic.j;
                if (sharedPreferences3 == null) {
                    Context applicationContext3 = requireContext4.getApplicationContext();
                    synchronized (uic.i) {
                        d2 = a5f.d(applicationContext3);
                        uic.j = d2;
                    }
                    d2.getClass();
                    sharedPreferences3 = d2;
                }
                SharedPreferences.Editor edit2 = sharedPreferences3.edit();
                edit2.getClass();
                edit2.putInt("PREF_FEED_UPDATE_COUNTER", i3);
                edit2.putInt("PREF_FEED_UPDATE_ON_VERSION", 260720003);
                Unit unit2 = Unit.a;
                edit2.apply();
                fdi fdiVar = feedFragment2.C().m;
                do {
                    value = fdiVar.getValue();
                } while (!fdiVar.k(value, dy7.a((dy7) value, false, false, null, null, false, null, 1019)));
                Context requireContext5 = feedFragment2.requireContext();
                requireContext5.getClass();
                fx7 fx7Var = new fx7(feedFragment2, i);
                bk7 bk7Var = new bk7(feedFragment2, i2, 1);
                AlertDialog h = lnb.h(R.style.RedesignDialog, requireContext5);
                View inflate = LayoutInflater.from(requireContext5).inflate(R.layout.dialog_feed_update, (ViewGroup) null, false);
                int i4 = R.id.button_not_now;
                TextView textView = (TextView) nq8.B(R.id.button_not_now, inflate);
                if (textView != null) {
                    i4 = R.id.button_update;
                    MaterialButton materialButton = (MaterialButton) nq8.B(R.id.button_update, inflate);
                    if (materialButton != null) {
                        h.setView((LinearLayout) inflate);
                        z8e.a0(materialButton, 1000L, new mi(2, fx7Var, requireContext5, h));
                        z8e.a0(textView, 1000L, new mi(3, bk7Var, requireContext5, h));
                        h.setOnShowListener(new zn(requireContext5, 0));
                        h.setCancelable(false);
                        h.show();
                        return Unit.a;
                    }
                }
                yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i4)));
                return null;
        }
    }
}
