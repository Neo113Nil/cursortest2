package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.sofascore.results.notifications.ui.MuteNotificationsBottomSheet;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class u1d implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MuteNotificationsBottomSheet b;

    public /* synthetic */ u1d(MuteNotificationsBottomSheet muteNotificationsBottomSheet, int i) {
        this.a = i;
        this.b = muteNotificationsBottomSheet;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        SharedPreferences d;
        int i = this.a;
        MuteNotificationsBottomSheet muteNotificationsBottomSheet = this.b;
        switch (i) {
            case 0:
                Context requireContext = muteNotificationsBottomSheet.requireContext();
                requireContext.getClass();
                SharedPreferences sharedPreferences = uic.j;
                if (sharedPreferences == null) {
                    Context applicationContext = requireContext.getApplicationContext();
                    synchronized (uic.i) {
                        d = a5f.d(applicationContext);
                        uic.j = d;
                    }
                    d.getClass();
                    sharedPreferences = d;
                }
                return Long.valueOf(sharedPreferences.getLong("PREF_DISABLE_NOTIFICATION_TIME", 0L));
            default:
                Context requireContext2 = muteNotificationsBottomSheet.requireContext();
                requireContext2.getClass();
                wxf.f(4, requireContext2);
                ((khd) muteNotificationsBottomSheet.C.getValue()).t(ngd.a);
                muteNotificationsBottomSheet.j();
                return Unit.a;
        }
    }
}
