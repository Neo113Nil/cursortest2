package ru.ozon.android.hardwareinfo;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lru/ozon/android/hardwareinfo/HardwareInfo;", "", "cpu", "Lru/ozon/android/hardwareinfo/CpuInfo;", "totalRam", "", "<init>", "(Lru/ozon/android/hardwareinfo/CpuInfo;Ljava/lang/Long;)V", "getCpu", "()Lru/ozon/android/hardwareinfo/CpuInfo;", "getTotalRam", "()Ljava/lang/Long;", "Ljava/lang/Long;", "hardware-info_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class HardwareInfo {

    @NotNull
    private final CpuInfo cpu;
    private final Long totalRam;

    public HardwareInfo(@NotNull CpuInfo cpu, Long l11) {
        Intrinsics.checkNotNullParameter(cpu, "cpu");
        this.cpu = cpu;
        this.totalRam = l11;
    }

    @NotNull
    public final CpuInfo getCpu() {
        return this.cpu;
    }

    public final Long getTotalRam() {
        return this.totalRam;
    }
}
