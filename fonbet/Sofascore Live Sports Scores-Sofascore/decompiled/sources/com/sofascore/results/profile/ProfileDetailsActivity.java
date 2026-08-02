package com.sofascore.results.profile;

import android.os.Bundle;
import androidx.fragment.app.a;
import com.sofascore.results.R;
import com.sofascore.results.mvvm.base.AbstractActivity;
import com.sofascore.results.profile.ProfileDetailsActivity;
import com.sofascore.results.profile.contributionScreen.ContributionPerformanceFragment;
import com.sofascore.results.profile.editor.ProfileEditorFragment;
import com.sofascore.results.profile.following.ProfileFollowingFragment;
import defpackage.fz8;
import defpackage.joa;
import defpackage.ue;
import defpackage.ypa;
import defpackage.ysa;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/sofascore/results/profile/ProfileDetailsActivity;", "Lcom/sofascore/results/mvvm/base/AbstractActivity;", "<init>", "()V", "u8f", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ProfileDetailsActivity extends AbstractActivity {
    public static final /* synthetic */ int L = 0;
    public final joa J;
    public final joa K;

    public ProfileDetailsActivity() {
        final int i = 0;
        Function0 function0 = new Function0(this) { // from class: t8f
            public final /* synthetic */ ProfileDetailsActivity b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                ProfileDetailsActivity profileDetailsActivity = this.b;
                switch (i2) {
                    case 0:
                        int i3 = ProfileDetailsActivity.L;
                        return ue.a(profileDetailsActivity.getLayoutInflater());
                    default:
                        int i4 = ProfileDetailsActivity.L;
                        return profileDetailsActivity.getIntent().getStringExtra("screen_name");
                }
            }
        };
        ysa ysaVar = ysa.c;
        this.J = ypa.a(ysaVar, function0);
        final int i2 = 1;
        this.K = ypa.a(ysaVar, new Function0(this) { // from class: t8f
            public final /* synthetic */ ProfileDetailsActivity b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                ProfileDetailsActivity profileDetailsActivity = this.b;
                switch (i22) {
                    case 0:
                        int i3 = ProfileDetailsActivity.L;
                        return ue.a(profileDetailsActivity.getLayoutInflater());
                    default:
                        int i4 = ProfileDetailsActivity.L;
                        return profileDetailsActivity.getIntent().getStringExtra("screen_name");
                }
            }
        });
    }

    @Override // com.sofascore.results.mvvm.base.AbstractActivity, com.sofascore.results.base.BaseActivity, com.sofascore.results.base.Hilt_BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String str;
        String string;
        super.onCreate(bundle);
        joa joaVar = this.J;
        setContentView(((ue) joaVar.getValue()).a);
        String stringExtra = getIntent().getStringExtra("OPEN_PROFILE_ID");
        a aVar = new a(k());
        String str2 = (String) this.K.getValue();
        if (str2 != null) {
            int hashCode = str2.hashCode();
            if (hashCode != -1093135165) {
                if (hashCode != -1064469887) {
                    if (hashCode == -706061960 && str2.equals("ProfileFollowingFragment")) {
                        string = getString(R.string.favourites);
                        aVar.l(R.id.container, aVar.h(ProfileFollowingFragment.class, fz8.C(fz8.H("OPEN_PROFILE_ID", stringExtra))), null);
                        str = string;
                    }
                } else if (str2.equals("contribution_performance")) {
                    string = getString(R.string.contributions_tab_name);
                    aVar.l(R.id.container, aVar.h(ContributionPerformanceFragment.class, fz8.C(fz8.H("OPEN_PROFILE_ID", stringExtra))), null);
                    str = string;
                }
            } else if (str2.equals("profile_editor")) {
                string = getString(R.string.user_status_editor);
                aVar.l(R.id.container, aVar.h(ProfileEditorFragment.class, fz8.C(fz8.H("OPEN_PROFILE_ID", stringExtra))), null);
                str = string;
            }
            aVar.f();
            AbstractActivity.M(this, ((ue) joaVar.getValue()).b, str, null, null, 44);
        }
        finish();
        Unit unit = Unit.a;
        str = null;
        aVar.f();
        AbstractActivity.M(this, ((ue) joaVar.getValue()).b, str, null, null, 44);
    }

    @Override // com.sofascore.results.base.BaseActivity
    public final String u() {
        return "OtherProfileScreen";
    }

    @Override // com.sofascore.results.mvvm.base.AbstractActivity
    public final void N() {
    }
}
