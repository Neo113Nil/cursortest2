package ru.ozon.android.hardwareinfo;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\b\n\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/android/hardwareinfo/CpuInfo;", "", "cores", "", "maxFrequency", "", "frequencies", "", "<init>", "(ILjava/lang/Long;Ljava/util/List;)V", "getCores", "()I", "getMaxFrequency", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getFrequencies", "()Ljava/util/List;", "hardware-info_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CpuInfo {
    private final int cores;

    @NotNull
    private final List<Long> frequencies;
    private final Long maxFrequency;

    public CpuInfo(int i11, Long l11, @NotNull List<Long> frequencies) {
        Intrinsics.checkNotNullParameter(frequencies, "frequencies");
        this.cores = i11;
        this.maxFrequency = l11;
        this.frequencies = frequencies;
    }

    public final int getCores() {
        return this.cores;
    }

    @NotNull
    public final List<Long> getFrequencies() {
        return this.frequencies;
    }

    public final Long getMaxFrequency() {
        return this.maxFrequency;
    }
}
