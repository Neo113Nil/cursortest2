package defpackage;

import android.database.SQLException;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDialogFragment;
import androidx.compose.runtime.e;
import com.blaze.blazesdk.widgets.ui.BlazeBaseWidget;
import com.inmobi.media.Xh;
import com.sofascore.results.chat.fragment.AbstractChatFragment;
import com.sofascore.results.profile.UserProfileActivity;
import com.sofascore.results.referral.ReferralRedeemRewardBottomSheet;
import com.sofascore.results.referral.ReferralRewardAlreadyActiveBottomSheet;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class m1 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ m1(Object obj, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.b = z;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        b1d i;
        String str;
        AppCompatDialogFragment appCompatDialogFragment;
        int i2 = this.a;
        rq3 rq3Var = null;
        boolean z = this.b;
        Object obj = this.c;
        switch (i2) {
            case 0:
                AbstractChatFragment abstractChatFragment = (AbstractChatFragment) obj;
                fhc F = abstractChatFragment.F();
                F.l = z;
                F.notifyDataSetChanged();
                int i3 = abstractChatFragment.I;
                Integer valueOf = Integer.valueOf(i3);
                if (i3 == -1) {
                    valueOf = null;
                }
                int intValue = valueOf != null ? valueOf.intValue() : abstractChatFragment.F().getItemCount() - 1;
                krk krkVar = abstractChatFragment.l;
                krkVar.getClass();
                ((yn8) krkVar).l.scrollToPosition(intValue);
                krk krkVar2 = abstractChatFragment.l;
                krkVar2.getClass();
                tgj.E(((yn8) krkVar2).l, 0L, null, 7);
                return Unit.a;
            case 1:
                b1d b1dVar = (b1d) obj;
                if (z) {
                    b1dVar.b(Unit.a);
                }
                return Unit.a;
            case 2:
                int i4 = BlazeBaseWidget.q;
                ((BlazeBaseWidget) obj).getViewModel().j(z);
                return Unit.a;
            case 3:
                dk3 dk3Var = (dk3) obj;
                String str2 = z ? "reader" : "writer";
                StringBuilder sb = new StringBuilder();
                sb.append("Timed out attempting to acquire a " + str2 + " connection.");
                sb.append("\n\nWriter pool:\n");
                dk3Var.b.d(sb);
                sb.append("Reader pool:");
                sb.append('\n');
                dk3Var.a.d(sb);
                try {
                    b0a.R(5, sb.toString());
                    throw null;
                } catch (SQLException e) {
                    e.printStackTrace();
                    return Unit.a;
                }
            case 4:
                Function0 function0 = (Function0) obj;
                if (z) {
                    function0.invoke();
                }
                return Unit.a;
            case 5:
                i10 i10Var = (i10) obj;
                if (z && (i = i10Var.i()) != null) {
                    ((aeh) i).b(Unit.a);
                }
                return Unit.a;
            case 6:
                ce8 ce8Var = (ce8) obj;
                if (z) {
                    ce8.a(ce8Var);
                }
                return Unit.a;
            case 7:
                return e.c(z ? Integer.MAX_VALUE : llf.c(((g6i) obj).e.size() / 2, 5, 10));
            case 8:
                UserProfileActivity userProfileActivity = (UserProfileActivity) obj;
                int i5 = UserProfileActivity.S;
                im imVar = userProfileActivity.R().r;
                if (imVar != null && (str = imVar.g) != null) {
                    if (z) {
                        String str3 = userProfileActivity.R().t;
                        str3.getClass();
                        appCompatDialogFragment = new ReferralRewardAlreadyActiveBottomSheet();
                        appCompatDialogFragment.setArguments(fz8.C(fz8.H("ANALYTICS_TYPE", str3)));
                    } else {
                        String str4 = userProfileActivity.R().t;
                        str4.getClass();
                        AppCompatDialogFragment referralRedeemRewardBottomSheet = new ReferralRedeemRewardBottomSheet();
                        referralRedeemRewardBottomSheet.setArguments(fz8.C(fz8.H("ANALYTICS_TYPE", str4), fz8.H("PREF_REFERRAL_TOKEN", str)));
                        appCompatDialogFragment = referralRedeemRewardBottomSheet;
                    }
                    UserProfileActivity userProfileActivity2 = userProfileActivity instanceof AppCompatActivity ? userProfileActivity : null;
                    if (userProfileActivity2 != null) {
                        wca.x(userProfileActivity2.getLifecycle()).b(new r1(appCompatDialogFragment, userProfileActivity2, rq3Var, 3));
                    }
                }
                return Unit.a;
            default:
                return Xh.a((Xh) obj, z);
        }
    }

    public /* synthetic */ m1(boolean z, Object obj, int i) {
        this.a = i;
        this.b = z;
        this.c = obj;
    }
}
