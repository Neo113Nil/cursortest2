package ru.ozon.android.hardwareinfo.telephony;

import android.content.Context;
import android.telephony.TelephonyManager;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "Landroid/telephony/TelephonyManager;", "kotlin.jvm.PlatformType", "invoke", "()Landroid/telephony/TelephonyManager;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class TelephonyRepositoryImpl$telephonyManager$2 extends AbstractC7737t implements Function0<TelephonyManager> {
    final /* synthetic */ TelephonyRepositoryImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TelephonyRepositoryImpl$telephonyManager$2(TelephonyRepositoryImpl telephonyRepositoryImpl) {
        super(0);
        this.this$0 = telephonyRepositoryImpl;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final TelephonyManager invoke() {
        Context context;
        context = this.this$0.context;
        return (TelephonyManager) context.getSystemService(TelephonyManager.class);
    }
}
