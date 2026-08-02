package ru.ozon.android.hardwareinfo;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/android/hardwareinfo/HardwareInfo;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class DeviceInfoManagerImpl$hardwareInfo$2 extends AbstractC7737t implements Function0<HardwareInfo> {
    final /* synthetic */ DeviceInfoManagerImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DeviceInfoManagerImpl$hardwareInfo$2(DeviceInfoManagerImpl deviceInfoManagerImpl) {
        super(0);
        this.this$0 = deviceInfoManagerImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public final HardwareInfo invoke() {
        CpuInfo fetchCpuInfo;
        Long fetchTotalRam;
        fetchCpuInfo = this.this$0.fetchCpuInfo();
        fetchTotalRam = this.this$0.fetchTotalRam();
        return new HardwareInfo(fetchCpuInfo, fetchTotalRam);
    }
}
