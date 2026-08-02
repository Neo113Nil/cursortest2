package defpackage;

import android.telephony.TelephonyCallback;
import android.telephony.TelephonyDisplayInfo;
import com.google.android.gms.internal.ads.zzes;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class kbd extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ kbd(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    public final void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                int overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
                ((mbd) obj).f(overrideNetworkType == 3 || overrideNetworkType == 4 || overrideNetworkType == 5 ? 10 : 5);
                break;
            case 1:
                int overrideNetworkType2 = telephonyDisplayInfo.getOverrideNetworkType();
                ((nbd) obj).j(overrideNetworkType2 == 3 || overrideNetworkType2 == 4 || overrideNetworkType2 == 5 ? 10 : 5);
                break;
            default:
                int overrideNetworkType3 = telephonyDisplayInfo.getOverrideNetworkType();
                ((zzes) obj).d(true != (overrideNetworkType3 == 3 || overrideNetworkType3 == 4 || overrideNetworkType3 == 5) ? 5 : 10);
                break;
        }
    }
}
