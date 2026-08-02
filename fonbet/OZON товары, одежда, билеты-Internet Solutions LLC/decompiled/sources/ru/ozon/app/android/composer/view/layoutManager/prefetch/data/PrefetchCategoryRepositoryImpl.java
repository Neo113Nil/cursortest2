package ru.ozon.app.android.composer.view.layoutManager.prefetch.data;

import Vc.a;
import android.app.ActivityManager;
import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.hardwareinfo.CpuInfo;
import ru.ozon.android.hardwareinfo.DeviceHardwareInfoProvider;
import ru.ozon.app.android.composer.view.layoutManager.prefetch.PrefetchCategory;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\t\n\u0002\b\u0002\b\u0001\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0002J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\tH\u0002J\u0010\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\fH\u0002J\u001e\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/composer/view/layoutManager/prefetch/data/PrefetchCategoryRepositoryImpl;", "Lru/ozon/app/android/composer/view/layoutManager/prefetch/data/PrefetchCategoryRepository;", "deviceHardwareInfoProvider", "Lru/ozon/android/hardwareinfo/DeviceHardwareInfoProvider;", "<init>", "(Lru/ozon/android/hardwareinfo/DeviceHardwareInfoProvider;)V", "getCategory", "Lru/ozon/app/android/composer/view/layoutManager/prefetch/PrefetchCategory;", "context", "Landroid/content/Context;", "getMemoryCategory", "getMemoryClass", "", "getCpuCountCategory", "cpuCoreCount", "getCpuFrequencyCategory", "frequencies", "", "", "Companion", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PrefetchCategoryRepositoryImpl implements PrefetchCategoryRepository {

    @NotNull
    private final DeviceHardwareInfoProvider deviceHardwareInfoProvider;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/composer/view/layoutManager/prefetch/data/PrefetchCategoryRepositoryImpl$Companion;", "", "<init>", "()V", "NORMAL_MEMORY_CLASS", "", "HIGH_MEMORY_CLASS", "HIGH_CPU_CORE_COUNT", "MIN_AVAILABLE_CORE_COUNT_FOR_FREQUENCY_CHECK", "NORMAL_CPU_FREQUENCY", "HIGH_CPU_FREQUENCY", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public PrefetchCategoryRepositoryImpl(@NotNull DeviceHardwareInfoProvider deviceHardwareInfoProvider) {
        Intrinsics.checkNotNullParameter(deviceHardwareInfoProvider, "deviceHardwareInfoProvider");
        this.deviceHardwareInfoProvider = deviceHardwareInfoProvider;
    }

    private final PrefetchCategory getCpuCountCategory(int cpuCoreCount) {
        return cpuCoreCount >= 8 ? PrefetchCategory.HIGH : PrefetchCategory.LOW;
    }

    private final PrefetchCategory getCpuFrequencyCategory(int cpuCoreCount, List<Long> frequencies) {
        long j11;
        if (cpuCoreCount <= 0) {
            return PrefetchCategory.LOW;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = frequencies.iterator();
        while (true) {
            j11 = 0;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((Number) next).longValue() > 0) {
                arrayList.add(next);
            }
        }
        if (arrayList.size() < 4) {
            return PrefetchCategory.LOW;
        }
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            j11 += ((Number) it2.next()).longValue();
        }
        long size = j11 / arrayList.size();
        return size >= 2000000 ? PrefetchCategory.HIGH : size >= 1700000 ? PrefetchCategory.NORMAL : PrefetchCategory.LOW;
    }

    private final PrefetchCategory getMemoryCategory(Context context) {
        int memoryClass = getMemoryClass(context);
        return memoryClass >= 256 ? PrefetchCategory.HIGH : memoryClass >= 192 ? PrefetchCategory.NORMAL : PrefetchCategory.LOW;
    }

    private final int getMemoryClass(Context context) {
        Object systemService = context.getSystemService("activity");
        Intrinsics.g(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        return ((ActivityManager) systemService).getMemoryClass();
    }

    @Override // ru.ozon.app.android.composer.view.layoutManager.prefetch.data.PrefetchCategoryRepository
    @NotNull
    public PrefetchCategory getCategory(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        CpuInfo cpu = this.deviceHardwareInfoProvider.getHardwareInfo().getCpu();
        int cores = cpu.getCores();
        PrefetchCategory a11 = getCpuCountCategory(cores);
        PrefetchCategory b11 = getCpuFrequencyCategory(cores, cpu.getFrequencies());
        PrefetchCategory c11 = getMemoryCategory(context);
        Intrinsics.checkNotNullParameter(a11, "a");
        Intrinsics.checkNotNullParameter(b11, "b");
        Intrinsics.checkNotNullParameter(c11, "c");
        return (PrefetchCategory) a.d(a11, a.d(b11, c11));
    }
}
