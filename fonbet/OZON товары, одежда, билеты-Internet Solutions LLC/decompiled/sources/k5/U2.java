package k5;

import android.content.Context;
import android.os.Build;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import androidx.annotation.NonNull;
import java.util.List;

/* loaded from: classes8.dex */
public final class U2 extends D0<Om0.a> {

    /* renamed from: e, reason: collision with root package name */
    private final Context f70662e;

    U2(@NonNull Context context) {
        super(Mm0.e.PhoneESimInfo);
        this.f70662e = context;
    }

    @Override // k5.D0
    @NonNull
    protected final Om0.a s() throws D1 {
        boolean isEmbedded;
        int i11 = Build.VERSION.SDK_INT;
        Context context = this.f70662e;
        if (i11 < 28) {
            Om0.a aVar = new Om0.a();
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (telephonyManager != null && telephonyManager.getSimState() == 5) {
                aVar.put("sim1", Boolean.FALSE);
            }
            return aVar;
        }
        Om0.a aVar2 = new Om0.a();
        SubscriptionManager subscriptionManager = (SubscriptionManager) context.getSystemService("telephony_subscription_service");
        if (subscriptionManager != null) {
            if (!Gf.d.l(context, "android.permission.READ_PHONE_STATE")) {
                throw new C7502c2(EnumC7578w.READ_PHONE_STATE);
            }
            List<SubscriptionInfo> activeSubscriptionInfoList = subscriptionManager.getActiveSubscriptionInfoList();
            if (activeSubscriptionInfoList != null && activeSubscriptionInfoList.size() != 0) {
                int i12 = 0;
                for (SubscriptionInfo subscriptionInfo : activeSubscriptionInfoList) {
                    i12++;
                    String format = String.format("sim%d", Integer.valueOf(i12));
                    isEmbedded = subscriptionInfo.isEmbedded();
                    aVar2.put(format, Boolean.valueOf(isEmbedded));
                }
            }
        }
        return aVar2;
    }
}
