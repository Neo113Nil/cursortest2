package defpackage;

import android.content.Intent;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.sofascore.results.profile.ProfileActivity;
import com.sofascore.results.profile.ProfileDetailsActivity;
import com.sofascore.results.profile.predictions.ProfilePredictionsActivity;
import com.sofascore.results.profile.view.WeeklyStreaksExplanationModal;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class n8f implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ProfileActivity b;

    public /* synthetic */ n8f(ProfileActivity profileActivity, int i) {
        this.a = i;
        this.b = profileActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        ProfileActivity profileActivity = this.b;
        switch (i) {
            case 0:
                int i2 = ProfileActivity.Q;
                WeeklyStreaksExplanationModal weeklyStreaksExplanationModal = new WeeklyStreaksExplanationModal();
                weeklyStreaksExplanationModal.setArguments(fz8.C(fz8.J("VISITING_PROFILE", true)));
                rq3 rq3Var = null;
                ProfileActivity profileActivity2 = profileActivity instanceof AppCompatActivity ? profileActivity : null;
                if (profileActivity2 != null) {
                    wca.x(profileActivity2.getLifecycle()).b(new r1(weeklyStreaksExplanationModal, profileActivity2, rq3Var, 3));
                    break;
                }
                break;
            case 1:
                int i3 = ProfileActivity.Q;
                nv.m0(profileActivity, "editor", "other_profile");
                String str = (String) profileActivity.M.getValue();
                Intent intent = new Intent(profileActivity, (Class<?>) ProfileDetailsActivity.class);
                intent.putExtra("screen_name", "profile_editor");
                intent.putExtra("OPEN_PROFILE_ID", str);
                profileActivity.startActivity(intent);
                break;
            case 2:
                int i4 = ProfileActivity.Q;
                nv.m0(profileActivity, "predictions", "other_profile");
                String str2 = (String) profileActivity.M.getValue();
                Intent intent2 = new Intent(profileActivity, (Class<?>) ProfilePredictionsActivity.class);
                intent2.putExtra("OPEN_PROFILE_ID", str2);
                profileActivity.startActivity(intent2);
                break;
            case 3:
                int i5 = ProfileActivity.Q;
                nv.m0(profileActivity, "contributions", "other_profile");
                String str3 = (String) profileActivity.M.getValue();
                Intent intent3 = new Intent(profileActivity, (Class<?>) ProfileDetailsActivity.class);
                intent3.putExtra("screen_name", "contribution_performance");
                intent3.putExtra("OPEN_PROFILE_ID", str3);
                profileActivity.startActivity(intent3);
                break;
            default:
                int i6 = ProfileActivity.Q;
                nv.m0(profileActivity, "following", "other_profile");
                String str4 = (String) profileActivity.M.getValue();
                Intent intent4 = new Intent(profileActivity, (Class<?>) ProfileDetailsActivity.class);
                intent4.putExtra("screen_name", "ProfileFollowingFragment");
                intent4.putExtra("OPEN_PROFILE_ID", str4);
                profileActivity.startActivity(intent4);
                break;
        }
    }
}
