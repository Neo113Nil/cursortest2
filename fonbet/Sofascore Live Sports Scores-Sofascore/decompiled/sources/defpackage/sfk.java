package defpackage;

import android.content.Intent;
import com.sofascore.local_persistance.UserAccount;
import com.sofascore.results.R;
import com.sofascore.results.profile.UserProfileActivity;
import com.sofascore.results.profile.edit.ProfileEditActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class sfk implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ UserProfileActivity b;
    public final /* synthetic */ UserAccount c;

    public /* synthetic */ sfk(UserProfileActivity userProfileActivity, UserAccount userAccount, int i) {
        this.a = i;
        this.b = userProfileActivity;
        this.c = userAccount;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        UserAccount userAccount = this.c;
        UserProfileActivity userProfileActivity = this.b;
        switch (i) {
            case 0:
                int i2 = UserProfileActivity.S;
                nv.m0(userProfileActivity, "edit", "own_profile");
                de deVar = userProfileActivity.Q;
                String id = userAccount.getId();
                id.getClass();
                Intent intent = new Intent(userProfileActivity, (Class<?>) ProfileEditActivity.class);
                intent.putExtra("OPEN_PROFILE_ID", id);
                deVar.a(intent, null);
                break;
            default:
                int i3 = UserProfileActivity.S;
                nv.u0(userProfileActivity, null, "profile");
                String id2 = userAccount.getId();
                id2.getClass();
                Intent intent2 = new Intent("android.intent.action.SEND");
                intent2.setType("text/plain");
                intent2.putExtra("android.intent.extra.TEXT", userProfileActivity.getString(R.string.share_link) + "/user/profile/" + id2);
                userProfileActivity.startActivity(Intent.createChooser(intent2, userProfileActivity.getString(R.string.share_string)));
                break;
        }
        return Unit.a;
    }
}
