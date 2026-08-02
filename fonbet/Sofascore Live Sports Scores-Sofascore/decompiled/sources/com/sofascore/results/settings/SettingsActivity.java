package com.sofascore.results.settings;

import android.os.Bundle;
import android.view.MenuItem;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.a;
import com.sofascore.results.R;
import com.sofascore.results.mvvm.base.AbstractActivity;
import com.sofascore.results.settings.PreferenceFragment;
import com.sofascore.results.settings.SettingsActivity;
import defpackage.cp8;
import defpackage.e6g;
import defpackage.fp8;
import defpackage.mqi;
import defpackage.p2g;
import defpackage.px0;
import defpackage.u2g;
import defpackage.ue;
import defpackage.w2g;
import defpackage.ypa;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sofascore/results/settings/SettingsActivity;", "Lcom/sofascore/results/mvvm/base/AbstractActivity;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SettingsActivity extends AbstractActivity {
    public static final /* synthetic */ int L = 0;
    public final mqi J = ypa.b(new e6g(this, 16));
    public final px0 K = new px0(this, 11);

    /* JADX WARN: Removed duplicated region for block: B:13:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0099 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008e  */
    @Override // com.sofascore.results.mvvm.base.AbstractActivity, com.sofascore.results.base.BaseActivity, com.sofascore.results.base.Hilt_BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCreate(Bundle bundle) {
        String string;
        Object u2gVar;
        super.onCreate(bundle);
        mqi mqiVar = this.J;
        setContentView(((ue) mqiVar.getValue()).a);
        String stringExtra = getIntent().getStringExtra("open");
        if (stringExtra != null) {
            int hashCode = stringExtra.hashCode();
            if (hashCode != -935617458) {
                if (hashCode == 154562126 && stringExtra.equals("openPreferences")) {
                    string = getString(R.string.profile_preferences);
                }
            } else if (stringExtra.equals("openAdsOddsPreferences")) {
                string = getString(R.string.profile_preferences);
            }
            String str = string;
            str.getClass();
            AbstractActivity.M(this, ((ue) mqiVar.getValue()).b, str, null, null, 44);
            a aVar = new a(k());
            if (getIntent().getStringExtra("open") == null) {
                aVar.l(R.id.container, aVar.h(PreferenceFragment.class, getIntent().getExtras()), null);
            } else {
                aVar.l(R.id.container, aVar.h(SettingsFragment.class, null), null);
            }
            if (bundle != null) {
                try {
                    p2g p2gVar = w2g.b;
                    u2gVar = k().K(bundle, "savedFragmentKey");
                } catch (Throwable th) {
                    p2g p2gVar2 = w2g.b;
                    u2gVar = new u2g(th);
                }
                if (u2gVar instanceof u2g) {
                    u2gVar = null;
                }
                Fragment fragment = (Fragment) u2gVar;
                if (fragment != null) {
                    aVar.i(R.id.container, fragment, null, 1);
                }
            }
            aVar.f();
            k().o.add(new cp8() { // from class: cah
                @Override // defpackage.cp8
                public final void onBackStackChanged() {
                    SettingsActivity settingsActivity = SettingsActivity.this;
                    settingsActivity.K.f(settingsActivity.k().J() > 0);
                    List f = settingsActivity.k().c.f();
                    f.getClass();
                    String string2 = ((Fragment) CollectionsKt.j0(f)) instanceof PreferenceFragment ? settingsActivity.getString(R.string.profile_preferences) : settingsActivity.getString(R.string.action_settings);
                    string2.getClass();
                    settingsActivity.setTitle(string2);
                }
            });
            getOnBackPressedDispatcher().a(this, this.K);
        }
        string = getString(R.string.action_settings);
        String str2 = string;
        str2.getClass();
        AbstractActivity.M(this, ((ue) mqiVar.getValue()).b, str2, null, null, 44);
        a aVar2 = new a(k());
        if (getIntent().getStringExtra("open") == null) {
        }
        if (bundle != null) {
        }
        aVar2.f();
        k().o.add(new cp8() { // from class: cah
            @Override // defpackage.cp8
            public final void onBackStackChanged() {
                SettingsActivity settingsActivity = SettingsActivity.this;
                settingsActivity.K.f(settingsActivity.k().J() > 0);
                List f = settingsActivity.k().c.f();
                f.getClass();
                String string2 = ((Fragment) CollectionsKt.j0(f)) instanceof PreferenceFragment ? settingsActivity.getString(R.string.profile_preferences) : settingsActivity.getString(R.string.action_settings);
                string2.getClass();
                settingsActivity.setTitle(string2);
            }
        });
        getOnBackPressedDispatcher().a(this, this.K);
    }

    @Override // com.sofascore.results.base.BaseActivity, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.getClass();
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        getOnBackPressedDispatcher().c();
        return true;
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        super.onSaveInstanceState(bundle);
        if (k().c.f().size() > 1) {
            fp8 k = k();
            List f = k().c.f();
            f.getClass();
            k.Y(bundle, "savedFragmentKey", (Fragment) CollectionsKt.h0(f));
        }
    }

    @Override // com.sofascore.results.base.BaseActivity
    public final String u() {
        return "SettingsScreen";
    }

    @Override // com.sofascore.results.mvvm.base.AbstractActivity
    public final void N() {
    }
}
