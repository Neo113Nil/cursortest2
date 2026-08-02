package com.sofascore.results.profile.edit;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.fragment.app.a;
import com.sofascore.results.R;
import com.sofascore.results.mvvm.base.AbstractActivity;
import defpackage.ate;
import defpackage.duf;
import defpackage.f9f;
import defpackage.mme;
import defpackage.mqi;
import defpackage.nq8;
import defpackage.otk;
import defpackage.p15;
import defpackage.v8f;
import defpackage.yhk;
import defpackage.ypa;
import defpackage.z3f;
import defpackage.zzc;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sofascore/results/profile/edit/ProfileEditActivity;", "Lcom/sofascore/results/mvvm/base/AbstractActivity;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ProfileEditActivity extends AbstractActivity {
    public static final /* synthetic */ int L = 0;
    public final otk J = new otk(duf.a.getOrCreateKotlinClass(f9f.class), new v8f(this, 1), new v8f(this, 0), new v8f(this, 2));
    public final mqi K = ypa.b(new ate(this, 12));

    @Override // com.sofascore.results.mvvm.base.AbstractActivity, com.sofascore.results.base.BaseActivity, com.sofascore.results.base.Hilt_BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View inflate = getLayoutInflater().inflate(R.layout.activity_edit_profile, (ViewGroup) null, false);
        int i = R.id.container;
        if (((FrameLayout) nq8.B(R.id.container, inflate)) != null) {
            View B = nq8.B(R.id.toolbar, inflate);
            if (B != null) {
                z3f b = z3f.b(B);
                setContentView((LinearLayout) inflate);
                AbstractActivity.M(this, b, getString(R.string.edit_profile), null, null, 44);
                String str = (String) this.K.getValue();
                if (str != null) {
                    a aVar = new a(k());
                    ProfileEditFragment profileEditFragment = new ProfileEditFragment();
                    Bundle bundle2 = new Bundle();
                    bundle2.putSerializable("OPEN_PROFILE_ID", str);
                    profileEditFragment.setArguments(bundle2);
                    aVar.l(R.id.container, profileEditFragment, null);
                    aVar.f();
                }
                zzc zzcVar = ((f9f) this.J.getValue()).l;
                p15 p15Var = new p15(new mme(this, 10), 1);
                zzcVar.getClass();
                zzcVar.a.e(this, p15Var);
                return;
            }
            i = R.id.toolbar;
        }
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
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

    @Override // com.sofascore.results.base.BaseActivity
    public final String u() {
        return "EditProfileScreen";
    }

    @Override // com.sofascore.results.mvvm.base.AbstractActivity
    public final void N() {
    }
}
