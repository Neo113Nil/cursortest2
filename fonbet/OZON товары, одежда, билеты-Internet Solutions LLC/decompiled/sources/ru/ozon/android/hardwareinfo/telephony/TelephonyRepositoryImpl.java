package ru.ozon.android.hardwareinfo.telephony;

import Sc.InterfaceC4008j;
import Sc.k;
import android.content.Context;
import android.telephony.TelephonyManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\nR#\u0010\u0011\u001a\n \f*\u0004\u0018\u00010\u000b0\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lru/ozon/android/hardwareinfo/telephony/TelephonyRepositoryImpl;", "Lru/ozon/android/hardwareinfo/telephony/TelephonyRepository;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "getNetworkOperatorName", "()Ljava/lang/String;", "getSimOperatorName", "Landroid/content/Context;", "Landroid/telephony/TelephonyManager;", "kotlin.jvm.PlatformType", "telephonyManager$delegate", "LSc/j;", "getTelephonyManager", "()Landroid/telephony/TelephonyManager;", "telephonyManager", "hardware-info_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TelephonyRepositoryImpl implements TelephonyRepository {

    @NotNull
    private final Context context;

    /* renamed from: telephonyManager$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j telephonyManager;

    public TelephonyRepositoryImpl(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.telephonyManager = k.b(new TelephonyRepositoryImpl$telephonyManager$2(this));
    }

    private final TelephonyManager getTelephonyManager() {
        return (TelephonyManager) this.telephonyManager.getValue();
    }

    @Override // ru.ozon.android.hardwareinfo.telephony.TelephonyRepository
    @NotNull
    public String getNetworkOperatorName() {
        String networkOperatorName = getTelephonyManager().getNetworkOperatorName();
        Intrinsics.checkNotNullExpressionValue(networkOperatorName, "getNetworkOperatorName(...)");
        return networkOperatorName;
    }

    @Override // ru.ozon.android.hardwareinfo.telephony.TelephonyRepository
    @NotNull
    public String getSimOperatorName() {
        String simOperatorName = getTelephonyManager().getSimOperatorName();
        Intrinsics.checkNotNullExpressionValue(simOperatorName, "getSimOperatorName(...)");
        return simOperatorName;
    }
}
