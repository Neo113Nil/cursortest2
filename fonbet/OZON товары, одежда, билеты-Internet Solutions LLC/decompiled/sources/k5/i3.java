package k5;

import android.annotation.SuppressLint;
import android.content.Context;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import androidx.annotation.NonNull;
import java.util.HashSet;
import java.util.List;
import spay.sdk.api.ErrorCode;

/* loaded from: classes8.dex */
public final class i3 extends D0<Om0.a> {

    /* renamed from: e, reason: collision with root package name */
    private final Context f70755e;

    /* renamed from: f, reason: collision with root package name */
    private final TelephonyManager f70756f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    private final HashSet f70757g;

    i3(@NonNull HashSet hashSet, @NonNull Context context) {
        super(Mm0.e.PhoneInfo);
        this.f70756f = (TelephonyManager) context.getApplicationContext().getSystemService("phone");
        this.f70757g = hashSet;
        this.f70755e = context;
    }

    @Override // k5.D0
    @NonNull
    @SuppressLint({"MissingPermission"})
    protected final Om0.a s() throws D1 {
        String str;
        String str2;
        String str3;
        Om0.a aVar = new Om0.a();
        Mm0.e eVar = Mm0.e.IMEI;
        HashSet hashSet = this.f70757g;
        boolean contains = hashSet.contains(eVar);
        TelephonyManager telephonyManager = this.f70756f;
        String str4 = ErrorCode.PHONE_NUMBER_NOT_TRANSFERRED_ERROR_CODE;
        if (contains) {
            try {
                str = telephonyManager.getPhoneCount() == 2 ? telephonyManager.getImei(0) : telephonyManager.getImei();
            } catch (Throwable unused) {
                str = ErrorCode.PHONE_NUMBER_NOT_TRANSFERRED_ERROR_CODE;
            }
            if (str == null || str.isEmpty()) {
                str = ErrorCode.PHONE_NUMBER_NOT_TRANSFERRED_ERROR_CODE;
            }
            aVar.put("IMEI", str);
        }
        if (hashSet.contains(Mm0.e.IMSI)) {
            try {
                str2 = telephonyManager.getSubscriberId();
            } catch (Throwable unused2) {
                str2 = ErrorCode.PHONE_NUMBER_NOT_TRANSFERRED_ERROR_CODE;
            }
            if (str2 == null || str2.isEmpty()) {
                str2 = ErrorCode.PHONE_NUMBER_NOT_TRANSFERRED_ERROR_CODE;
            }
            aVar.put("IMSI", str2);
        }
        if (hashSet.contains(Mm0.e.SIM)) {
            try {
                List<SubscriptionInfo> activeSubscriptionInfoList = SubscriptionManager.from(this.f70755e).getActiveSubscriptionInfoList();
                str3 = !activeSubscriptionInfoList.isEmpty() ? activeSubscriptionInfoList.get(0).getIccId() : telephonyManager.getSimSerialNumber();
            } catch (Throwable unused3) {
                str3 = ErrorCode.PHONE_NUMBER_NOT_TRANSFERRED_ERROR_CODE;
            }
            if (str3 != null && !str3.isEmpty()) {
                str4 = str3;
            }
            aVar.put("SIM", str4);
        }
        return aVar;
    }
}
