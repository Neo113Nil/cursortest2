package defpackage;

import com.blaze.blazesdk.players.models.B;
import com.blaze.blazesdk.players.models.F;
import com.blaze.blazesdk.shared.models.BlazeEntryPointTriggerSource;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class gxl {
    public static final B a(BlazeEntryPointTriggerSource blazeEntryPointTriggerSource) {
        F f;
        blazeEntryPointTriggerSource.getClass();
        int i = ptl.a[blazeEntryPointTriggerSource.ordinal()];
        if (i == 1) {
            f = F.NOTIFICATION;
        } else if (i == 2) {
            f = F.DEEPLINK;
        } else {
            if (i != 3) {
                zzl.b();
                return null;
            }
            f = F.ENTRYPOINT;
        }
        return new B(f, null, null, null, null, null, 62, null);
    }
}
