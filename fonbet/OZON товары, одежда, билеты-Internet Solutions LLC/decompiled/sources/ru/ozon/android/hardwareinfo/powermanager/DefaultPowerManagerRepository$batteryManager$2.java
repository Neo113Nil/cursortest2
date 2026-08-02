package ru.ozon.android.hardwareinfo.powermanager;

import android.content.Context;
import android.os.BatteryManager;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "Landroid/os/BatteryManager;", "kotlin.jvm.PlatformType", "invoke", "()Landroid/os/BatteryManager;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class DefaultPowerManagerRepository$batteryManager$2 extends AbstractC7737t implements Function0<BatteryManager> {
    final /* synthetic */ DefaultPowerManagerRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DefaultPowerManagerRepository$batteryManager$2(DefaultPowerManagerRepository defaultPowerManagerRepository) {
        super(0);
        this.this$0 = defaultPowerManagerRepository;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final BatteryManager invoke() {
        Context context;
        context = this.this$0.context;
        return (BatteryManager) context.getSystemService(BatteryManager.class);
    }
}
