package ru.ozon.app.android.warmup;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0019\u0012\u0010\u0010\u0002\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001b\u0010\u0002\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/ozon/app/android/warmup/WarmupInfo;", "", "dtosToWarmup", "", "Ljava/lang/Class;", "<init>", "(Ljava/util/List;)V", "getDtosToWarmup", "()Ljava/util/List;", "warmup_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class WarmupInfo {

    @NotNull
    private final List<Class<?>> dtosToWarmup;

    /* JADX WARN: Multi-variable type inference failed */
    public WarmupInfo(@NotNull List<? extends Class<?>> dtosToWarmup) {
        Intrinsics.checkNotNullParameter(dtosToWarmup, "dtosToWarmup");
        this.dtosToWarmup = dtosToWarmup;
    }

    @NotNull
    public final List<Class<?>> getDtosToWarmup() {
        return this.dtosToWarmup;
    }
}
