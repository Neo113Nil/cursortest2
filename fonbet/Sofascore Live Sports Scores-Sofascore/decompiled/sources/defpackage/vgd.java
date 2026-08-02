package defpackage;

import com.sofascore.results.notifications.NotificationSettingsActivity;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class vgd implements b98 {
    public final /* synthetic */ int a;
    public final /* synthetic */ NotificationSettingsActivity b;

    public /* synthetic */ vgd(NotificationSettingsActivity notificationSettingsActivity, int i) {
        this.a = i;
        this.b = notificationSettingsActivity;
    }

    @Override // defpackage.b98
    public final Object emit(Object obj, rq3 rq3Var) {
        int i = this.a;
        NotificationSettingsActivity notificationSettingsActivity = this.b;
        rq3 rq3Var2 = null;
        switch (i) {
            case 0:
                j52 j52Var = (j52) obj;
                if (j52Var == null) {
                    yhk.s("null cannot be cast to non-null type com.sofascore.common.broadcastUtil.BroadcastEvent.NotificationSoundsImportSuccess");
                    break;
                } else {
                    int i2 = NotificationSettingsActivity.O;
                    khd Q = notificationSettingsActivity.Q();
                    xw3.L(un0.z(Q), null, null, new jhd(Q, rq3Var2, 1), 3);
                    break;
                }
            default:
                j52 j52Var2 = (j52) obj;
                if (j52Var2 == null) {
                    yhk.s("null cannot be cast to non-null type com.sofascore.common.broadcastUtil.BroadcastEvent.NotificationSoundsImportFail");
                    break;
                } else {
                    int i3 = NotificationSettingsActivity.O;
                    khd Q2 = notificationSettingsActivity.Q();
                    xw3.L(un0.z(Q2), null, null, new jhd(Q2, rq3Var2, 0), 3);
                    break;
                }
        }
        return null;
    }
}
