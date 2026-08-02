package com.sofascore.results.profile.predictions;

import android.os.Bundle;
import androidx.viewpager2.widget.ViewPager2;
import com.sofascore.common.mvvm.UnderlinedToolbar;
import com.sofascore.results.R;
import com.sofascore.results.mvvm.base.AbstractActivity;
import com.sofascore.results.profile.predictions.ProfilePredictionsActivity;
import defpackage.abf;
import defpackage.bti;
import defpackage.hkg;
import defpackage.joa;
import defpackage.sy0;
import defpackage.ypa;
import defpackage.ysa;
import defpackage.zaf;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/sofascore/results/profile/predictions/ProfilePredictionsActivity;", "Lcom/sofascore/results/mvvm/base/AbstractActivity;", "<init>", "()V", "haf", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ProfilePredictionsActivity extends Hilt_ProfilePredictionsActivity {
    public static final /* synthetic */ int N = 0;
    public final joa K;
    public final joa L;
    public final joa M;

    public ProfilePredictionsActivity() {
        final int i = 0;
        Function0 function0 = new Function0(this) { // from class: gaf
            public final /* synthetic */ ProfilePredictionsActivity b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                ProfilePredictionsActivity profilePredictionsActivity = this.b;
                switch (i2) {
                    case 0:
                        int i3 = ProfilePredictionsActivity.N;
                        return bti.a(profilePredictionsActivity.getLayoutInflater());
                    case 1:
                        int i4 = ProfilePredictionsActivity.N;
                        return profilePredictionsActivity.getIntent().getStringExtra("OPEN_PROFILE_ID");
                    default:
                        int i5 = ProfilePredictionsActivity.N;
                        return new abf(profilePredictionsActivity, profilePredictionsActivity.Q().i, profilePredictionsActivity.Q().g, (String) profilePredictionsActivity.L.getValue());
                }
            }
        };
        ysa ysaVar = ysa.c;
        this.K = ypa.a(ysaVar, function0);
        final int i2 = 1;
        this.L = ypa.a(ysaVar, new Function0(this) { // from class: gaf
            public final /* synthetic */ ProfilePredictionsActivity b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                ProfilePredictionsActivity profilePredictionsActivity = this.b;
                switch (i22) {
                    case 0:
                        int i3 = ProfilePredictionsActivity.N;
                        return bti.a(profilePredictionsActivity.getLayoutInflater());
                    case 1:
                        int i4 = ProfilePredictionsActivity.N;
                        return profilePredictionsActivity.getIntent().getStringExtra("OPEN_PROFILE_ID");
                    default:
                        int i5 = ProfilePredictionsActivity.N;
                        return new abf(profilePredictionsActivity, profilePredictionsActivity.Q().i, profilePredictionsActivity.Q().g, (String) profilePredictionsActivity.L.getValue());
                }
            }
        });
        final int i3 = 2;
        this.M = ypa.a(ysaVar, new Function0(this) { // from class: gaf
            public final /* synthetic */ ProfilePredictionsActivity b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                ProfilePredictionsActivity profilePredictionsActivity = this.b;
                switch (i22) {
                    case 0:
                        int i32 = ProfilePredictionsActivity.N;
                        return bti.a(profilePredictionsActivity.getLayoutInflater());
                    case 1:
                        int i4 = ProfilePredictionsActivity.N;
                        return profilePredictionsActivity.getIntent().getStringExtra("OPEN_PROFILE_ID");
                    default:
                        int i5 = ProfilePredictionsActivity.N;
                        return new abf(profilePredictionsActivity, profilePredictionsActivity.Q().i, profilePredictionsActivity.Q().g, (String) profilePredictionsActivity.L.getValue());
                }
            }
        });
    }

    public final bti Q() {
        return (bti) this.K.getValue();
    }

    @Override // com.sofascore.results.mvvm.base.AbstractActivity, com.sofascore.results.base.BaseActivity, com.sofascore.results.base.Hilt_BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(Q().a);
        H((UnderlinedToolbar) Q().h.c);
        String string = getString(((String) this.L.getValue()) != null ? R.string.profile_visiting_predictions : R.string.profile_my_predictions);
        string.getClass();
        setTitle(string);
        AbstractActivity.O(Q().g, Integer.valueOf(hkg.X(this)), getColor(R.color.on_color_primary));
        Q().c.setBackground(sy0.a);
        ViewPager2 viewPager2 = Q().i;
        joa joaVar = this.M;
        viewPager2.setAdapter((abf) joaVar.getValue());
        ((abf) joaVar.getValue()).x(zaf.c);
    }

    @Override // com.sofascore.results.base.BaseActivity
    public final String u() {
        return "PredictionsScreen";
    }

    @Override // com.sofascore.results.mvvm.base.AbstractActivity
    public final void N() {
    }
}
