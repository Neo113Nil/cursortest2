package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.sofascore.results.event.EventActivity;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class ar5 extends ouk {
    public final /* synthetic */ EventActivity a;

    public ar5(EventActivity eventActivity) {
        this.a = eventActivity;
    }

    @Override // defpackage.ouk
    public final void c(int i) {
        if (i == rd6.d.ordinal()) {
            EventActivity eventActivity = this.a;
            SharedPreferences sharedPreferences = uic.j;
            if (sharedPreferences == null) {
                Context applicationContext = eventActivity.getApplicationContext();
                synchronized (uic.i) {
                    sharedPreferences = a5f.d(applicationContext);
                    uic.j = sharedPreferences;
                }
                sharedPreferences.getClass();
            }
            int i2 = sharedPreferences.getInt("PREF_AI_TAB_OPEN_COUNT", 0) + 1;
            SharedPreferences sharedPreferences2 = uic.j;
            if (sharedPreferences2 == null) {
                Context applicationContext2 = eventActivity.getApplicationContext();
                synchronized (uic.i) {
                    sharedPreferences2 = a5f.d(applicationContext2);
                    uic.j = sharedPreferences2;
                }
                sharedPreferences2.getClass();
            }
            n9e.u(eventActivity, new we7(i2, sharedPreferences2.getLong("PREF_AI_TAB_FIRST_OPEN_TIMESTAMP", 0L), 1));
        }
    }
}
