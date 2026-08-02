package com.ironsource.adqualitysdk.sdk.i;

import android.os.SystemClock;
import android.view.MotionEvent;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.Calendar;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ć, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0198 extends AbstractRunnableC0606 {

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C1188 f291;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ MotionEvent f292;

    public C0198(C1188 c1188, MotionEvent motionEvent) {
        this.f291 = c1188;
        this.f292 = motionEvent;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0606
    /* renamed from: ﾒ */
    public final void mo58() {
        try {
            int round = Math.round(this.f292.getRawX());
            int round2 = Math.round(this.f292.getRawY());
            String str = AbstractC0416.f1206;
            if (round >= 0 && round2 >= 0 && round <= AbstractC0523.m346(AbstractC0416.m237(), false).optInt(AbstractC0416.f1199) && round2 <= AbstractC0523.m346(AbstractC0416.m237(), false).optInt(AbstractC0416.f1198)) {
                String str2 = AbstractC0370.f1112;
                C0520 c0520 = new C0520(round, round2, Calendar.getInstance().getTimeInMillis(), SystemClock.elapsedRealtime());
                C1188 c1188 = this.f291;
                synchronized (c1188) {
                    c1188.f3767 = c0520;
                }
                return;
            }
            AbstractC0420.m243(StringFog.decrypt("on5zXVSXWayQcXRzXIh5pot3bmxQiXuqhnc=\n", "5RIcPzX7DcM=\n"), StringFog.decrypt("6+QnA1djmcPa5SZATSaf0Nb9NwQfLInBn+Q0QF0sidvb+HIDUCyO0dblMxRaMMaVxA==\n", "v4tSYD9D/LU=\n") + round + StringFog.decrypt("CwE=\n", "JyGiGcTUArQ=\n") + round2 + StringFog.decrypt("cg==\n", "DwdJ5P3e6aQ=\n"));
        } catch (Throwable th) {
            AbstractC0356.m204(StringFog.decrypt("f5vHQ2ihH2dNlMBtYL4/bVaS2nJsvz1hW5I=\n", "OPeoIQnNSwg=\n"), StringFog.decrypt("/DaOjW9EdJaZK5K2chF+kA==\n", "uUT84h1kHfg=\n"), th, false);
        }
    }
}
