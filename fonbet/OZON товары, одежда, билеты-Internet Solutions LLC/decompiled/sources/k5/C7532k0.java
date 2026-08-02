package k5;

import android.content.Context;
import android.os.Build;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import androidx.annotation.NonNull;
import java.util.Iterator;
import java.util.List;

/* renamed from: k5.k0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C7532k0 extends D0<Om0.a> {

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    private final Context f70767e;

    C7532k0(@NonNull Context context) {
        super(Mm0.e.PhoneNumbers);
        this.f70767e = context;
    }

    @Override // k5.D0
    @NonNull
    protected final Om0.a s() throws D1 {
        if (Build.VERSION.SDK_INT < 28) {
            return new Om0.a();
        }
        Om0.a aVar = new Om0.a();
        Context context = this.f70767e;
        SubscriptionManager subscriptionManager = (SubscriptionManager) context.getSystemService("telephony_subscription_service");
        if (subscriptionManager != null) {
            if (!Gf.d.l(context, "android.permission.READ_PHONE_STATE")) {
                throw new C7502c2(EnumC7578w.READ_PHONE_STATE);
            }
            List<SubscriptionInfo> activeSubscriptionInfoList = subscriptionManager.getActiveSubscriptionInfoList();
            if (activeSubscriptionInfoList != null && activeSubscriptionInfoList.size() >= 2) {
                Iterator<SubscriptionInfo> it = activeSubscriptionInfoList.iterator();
                int i11 = 0;
                while (it.hasNext()) {
                    i11++;
                    aVar.put(String.valueOf(i11), it.next().getNumber());
                }
            }
        }
        return aVar;
    }
}
