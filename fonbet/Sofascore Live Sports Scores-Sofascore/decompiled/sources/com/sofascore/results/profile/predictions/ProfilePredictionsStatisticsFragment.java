package com.sofascore.results.profile.predictions;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import com.sofascore.results.R;
import com.sofascore.results.profile.view.ProfilePredictionStatisticsView;
import defpackage.aaf;
import defpackage.bte;
import defpackage.duf;
import defpackage.ebf;
import defpackage.eqb;
import defpackage.faf;
import defpackage.joa;
import defpackage.krk;
import defpackage.nq8;
import defpackage.otk;
import defpackage.vce;
import defpackage.x2e;
import defpackage.yhk;
import defpackage.ypa;
import defpackage.ysa;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/sofascore/results/profile/predictions/ProfilePredictionsStatisticsFragment;", "Lcom/sofascore/results/mvvm/base/AbstractFragment;", "Lfaf;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ProfilePredictionsStatisticsFragment extends Hilt_ProfilePredictionsStatisticsFragment<faf> {
    public final otk r;
    public boolean s;

    public ProfilePredictionsStatisticsFragment() {
        joa a = ypa.a(ysa.c, new vce(new vce(this, 16), 17));
        this.r = new otk(duf.a.getOrCreateKotlinClass(ebf.class), new x2e(a, 21), new bte(this, a, 3), new x2e(a, 22));
        this.s = true;
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final krk k() {
        View inflate = getLayoutInflater().inflate(R.layout.profile_prediction_statistics_fragment, (ViewGroup) null, false);
        int i = R.id.all_time;
        ProfilePredictionStatisticsView profilePredictionStatisticsView = (ProfilePredictionStatisticsView) nq8.B(R.id.all_time, inflate);
        if (profilePredictionStatisticsView != null) {
            i = R.id.container;
            LinearLayout linearLayout = (LinearLayout) nq8.B(R.id.container, inflate);
            if (linearLayout != null) {
                i = R.id.last_30_days;
                ProfilePredictionStatisticsView profilePredictionStatisticsView2 = (ProfilePredictionStatisticsView) nq8.B(R.id.last_30_days, inflate);
                if (profilePredictionStatisticsView2 != null) {
                    return new faf((ScrollView) inflate, profilePredictionStatisticsView, linearLayout, profilePredictionStatisticsView2);
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final String p() {
        return "StatisticsTab";
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final void s(View view, Bundle bundle) {
        l();
        otk otkVar = this.r;
        String str = ((ebf) otkVar.getValue()).i ? "own_profile" : "other_profile";
        this.i.b = str;
        ((ebf) otkVar.getValue()).g.e(getViewLifecycleOwner(), new eqb(17, new aaf(1, this, str)));
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final void u() {
    }
}
