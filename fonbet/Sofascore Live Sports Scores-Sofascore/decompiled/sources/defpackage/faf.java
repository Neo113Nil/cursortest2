package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import com.sofascore.results.profile.view.ProfilePredictionStatisticsView;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class faf implements krk {
    public final ScrollView a;
    public final ProfilePredictionStatisticsView b;
    public final LinearLayout c;
    public final ProfilePredictionStatisticsView d;

    public faf(ScrollView scrollView, ProfilePredictionStatisticsView profilePredictionStatisticsView, LinearLayout linearLayout, ProfilePredictionStatisticsView profilePredictionStatisticsView2) {
        this.a = scrollView;
        this.b = profilePredictionStatisticsView;
        this.c = linearLayout;
        this.d = profilePredictionStatisticsView2;
    }

    @Override // defpackage.krk
    public final View getRoot() {
        return this.a;
    }
}
