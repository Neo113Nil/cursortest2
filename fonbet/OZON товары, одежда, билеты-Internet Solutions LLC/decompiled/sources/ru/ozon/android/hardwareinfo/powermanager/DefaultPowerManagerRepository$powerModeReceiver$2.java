package ru.ozon.android.hardwareinfo.powermanager;

import Ae.x0;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\t\n\u0000\n\u0002\b\u0003*\u0001\u0001\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "ru/ozon/android/hardwareinfo/powermanager/DefaultPowerManagerRepository$powerModeReceiver$2$1", "invoke", "()Lru/ozon/android/hardwareinfo/powermanager/DefaultPowerManagerRepository$powerModeReceiver$2$1;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class DefaultPowerManagerRepository$powerModeReceiver$2 extends AbstractC7737t implements Function0<AnonymousClass1> {
    final /* synthetic */ DefaultPowerManagerRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DefaultPowerManagerRepository$powerModeReceiver$2(DefaultPowerManagerRepository defaultPowerManagerRepository) {
        super(0);
        this.this$0 = defaultPowerManagerRepository;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [ru.ozon.android.hardwareinfo.powermanager.DefaultPowerManagerRepository$powerModeReceiver$2$1] */
    @Override // kotlin.jvm.functions.Function0
    public final AnonymousClass1 invoke() {
        final DefaultPowerManagerRepository defaultPowerManagerRepository = this.this$0;
        return new BroadcastReceiver() { // from class: ru.ozon.android.hardwareinfo.powermanager.DefaultPowerManagerRepository$powerModeReceiver$2.1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                x0 powerModeFlow;
                Intrinsics.checkNotNullParameter(context, "context");
                powerModeFlow = DefaultPowerManagerRepository.this.getPowerModeFlow();
                powerModeFlow.tryEmit(Boolean.valueOf(DefaultPowerManagerRepository.this.readPowerSaveMode()));
            }
        };
    }
}
