package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;
import com.ironsource.InterfaceC4060ee;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.sofascore.results.R;
import com.sofascore.results.profile.LoginScreenActivity;
import com.sofascore.results.service.SyncWorker;
import com.sofascore.results.service.WeeklyChallengeWorker;
import java.util.Calendar;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class hjb implements b98 {
    public final /* synthetic */ int a;
    public final /* synthetic */ LoginScreenActivity b;

    public /* synthetic */ hjb(LoginScreenActivity loginScreenActivity, int i) {
        this.a = i;
        this.b = loginScreenActivity;
    }

    @Override // defpackage.b98
    public final Object emit(Object obj, rq3 rq3Var) {
        int i = this.a;
        LoginScreenActivity loginScreenActivity = this.b;
        switch (i) {
            case 0:
                j52 j52Var = (j52) obj;
                if (j52Var == null) {
                    yhk.s("null cannot be cast to non-null type com.sofascore.common.broadcastUtil.BroadcastEvent.LoginSuccess");
                    break;
                } else {
                    int i2 = LoginScreenActivity.M;
                    loginScreenActivity.N().k(true, false);
                    rgh rghVar = loginScreenActivity.L;
                    String string = loginScreenActivity.getString(R.string.sync_favourites);
                    string.getClass();
                    rghVar.e(string);
                    ktd A = mha.A(new ktd(SyncWorker.class));
                    mha.y(A);
                    Context applicationContext = loginScreenActivity.getApplicationContext();
                    applicationContext.getClass();
                    xbl d = xbl.d(applicationContext);
                    d.getClass();
                    d.b("SyncWorker-".concat(""), nf6.a, (ltd) A.a());
                    break;
                }
            case 1:
                j52 j52Var2 = (j52) obj;
                if (j52Var2 == null) {
                    yhk.s("null cannot be cast to non-null type com.sofascore.common.broadcastUtil.BroadcastEvent.LoginFail");
                    break;
                } else {
                    int i3 = LoginScreenActivity.M;
                    loginScreenActivity.N().k(false, true);
                    loginScreenActivity.L.a();
                    Calendar calendar = ke0.a;
                    ke0.g(loginScreenActivity, loginScreenActivity.getString(R.string.login_failed), 0);
                    loginScreenActivity.finish();
                    break;
                }
            case 2:
                j52 j52Var3 = (j52) obj;
                if (j52Var3 == null) {
                    yhk.s("null cannot be cast to non-null type com.sofascore.common.broadcastUtil.BroadcastEvent.LoginFailAccountDeleted");
                    break;
                } else {
                    int i4 = LoginScreenActivity.M;
                    LoginScreenActivity loginScreenActivity2 = this.b;
                    loginScreenActivity2.N().k(false, true);
                    loginScreenActivity2.L.a();
                    int i5 = l94.C;
                    LinearLayout linearLayout = loginScreenActivity2.M().a;
                    linearLayout.getClass();
                    String string2 = loginScreenActivity2.getString(R.string.account_deleted_message);
                    string2.getClass();
                    wxf.x(loginScreenActivity2, linearLayout, string2, loginScreenActivity2.getColor(R.color.surface_1), loginScreenActivity2.getColor(R.color.surface_T), null, IronSourceError.ERROR_CAPPING_VALIDATION_FAILED, null, InterfaceC4060ee.c.g).i();
                    break;
                }
            default:
                j52 j52Var4 = (j52) obj;
                if (j52Var4 == null) {
                    yhk.s("null cannot be cast to non-null type com.sofascore.common.broadcastUtil.BroadcastEvent.SyncSuccess");
                    break;
                } else {
                    loginScreenActivity.L.a();
                    String type = loginScreenActivity.D().getType();
                    Intent intent = loginScreenActivity.getIntent();
                    intent.getClass();
                    nv.W(loginScreenActivity, type, intent);
                    Bundle extras = loginScreenActivity.getIntent().getExtras();
                    if (extras != null) {
                        loginScreenActivity.setResult(-1, new Intent().putExtras(extras));
                    } else {
                        loginScreenActivity.setResult(-1);
                    }
                    xw3.L(wca.x(loginScreenActivity.getLifecycle()), null, null, new ppa(loginScreenActivity, null, 5), 3);
                    if (loginScreenActivity.D().getLeaderboardId() != 0) {
                        Context applicationContext2 = loginScreenActivity.getApplicationContext();
                        applicationContext2.getClass();
                        ktd A2 = mha.A(new ktd(WeeklyChallengeWorker.class));
                        mha.y(A2);
                        vxd.h(applicationContext2).b("WeeklyChallengeWorker-".concat(""), nf6.a, (ltd) A2.a());
                    }
                    break;
                }
        }
        return null;
    }
}
