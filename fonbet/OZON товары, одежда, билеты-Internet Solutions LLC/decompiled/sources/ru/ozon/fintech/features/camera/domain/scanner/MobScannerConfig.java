package ru.ozon.fintech.features.camera.domain.scanner;

import B0.C2454a;
import B90.C2616s;
import G.g;
import Kk.C3532b;
import Pk0.c;
import androidx.annotation.Keep;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b \b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0001-Bk\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0011\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010#\u001a\u00020\tHÆ\u0003J\t\u0010$\u001a\u00020\u000bHÆ\u0003J\t\u0010%\u001a\u00020\tHÆ\u0003J\t\u0010&\u001a\u00020\u000eHÆ\u0003J\t\u0010'\u001a\u00020\u000bHÆ\u0003J}\u0010(\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000bHÆ\u0001J\u0013\u0010)\u001a\u00020\u000e2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020\tHÖ\u0001J\t\u0010,\u001a\u00020\u0004HÖ\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u001e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\f\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018R\u0016\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\u000f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001a¨\u0006."}, d2 = {"Lru/ozon/fintech/features/camera/domain/scanner/MobScannerConfig;", "", "qrScanners", "", "", "phoneScanners", "bankCardScanners", "disabledSalute", "maxSize", "", "scannerQueueDebounce", "", "sharpnessThreshold", "separateSaluteProcess", "", "separateProcessTimeout", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;IJIZJ)V", "getQrScanners", "()Ljava/util/List;", "getPhoneScanners", "getBankCardScanners", "getDisabledSalute", "getMaxSize", "()I", "getScannerQueueDebounce", "()J", "getSharpnessThreshold", "getSeparateSaluteProcess", "()Z", "getSeparateProcessTimeout", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "Companion", "camera_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class MobScannerConfig {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final MobScannerConfig DEFAULT = new MobScannerConfig(C7714v.a0("MLKIT"), C7714v.a0("MLKIT"), C7714v.a0("MLKIT"), K.f71697a, 2000, 150, 15, false, 0);

    @i(name = "bankCardScanners")
    @NotNull
    private final List<String> bankCardScanners;

    @i(name = "disabledSalute")
    private final List<String> disabledSalute;

    @i(name = "maxSize")
    private final int maxSize;

    @i(name = "phoneScanners")
    @NotNull
    private final List<String> phoneScanners;

    @i(name = "qrScanners")
    @NotNull
    private final List<String> qrScanners;

    @i(name = "scannerQueueDebounce")
    private final long scannerQueueDebounce;

    @i(name = "separateProcessTimeout")
    private final long separateProcessTimeout;

    @i(name = "separateSaluteProcess")
    private final boolean separateSaluteProcess;

    @i(name = "sharpnessThreshold")
    private final int sharpnessThreshold;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/fintech/features/camera/domain/scanner/MobScannerConfig$Companion;", "", "<init>", "()V", "DEFAULT", "Lru/ozon/fintech/features/camera/domain/scanner/MobScannerConfig;", "getDEFAULT", "()Lru/ozon/fintech/features/camera/domain/scanner/MobScannerConfig;", "camera_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final MobScannerConfig getDEFAULT() {
            return MobScannerConfig.DEFAULT;
        }

        private Companion() {
        }
    }

    public MobScannerConfig(@NotNull List<String> qrScanners, @NotNull List<String> phoneScanners, @NotNull List<String> bankCardScanners, List<String> list, int i11, long j11, int i12, boolean z11, long j12) {
        Intrinsics.checkNotNullParameter(qrScanners, "qrScanners");
        Intrinsics.checkNotNullParameter(phoneScanners, "phoneScanners");
        Intrinsics.checkNotNullParameter(bankCardScanners, "bankCardScanners");
        this.qrScanners = qrScanners;
        this.phoneScanners = phoneScanners;
        this.bankCardScanners = bankCardScanners;
        this.disabledSalute = list;
        this.maxSize = i11;
        this.scannerQueueDebounce = j11;
        this.sharpnessThreshold = i12;
        this.separateSaluteProcess = z11;
        this.separateProcessTimeout = j12;
    }

    public static /* synthetic */ MobScannerConfig copy$default(MobScannerConfig mobScannerConfig, List list, List list2, List list3, List list4, int i11, long j11, int i12, boolean z11, long j12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            list = mobScannerConfig.qrScanners;
        }
        if ((i13 & 2) != 0) {
            list2 = mobScannerConfig.phoneScanners;
        }
        if ((i13 & 4) != 0) {
            list3 = mobScannerConfig.bankCardScanners;
        }
        if ((i13 & 8) != 0) {
            list4 = mobScannerConfig.disabledSalute;
        }
        if ((i13 & 16) != 0) {
            i11 = mobScannerConfig.maxSize;
        }
        if ((i13 & 32) != 0) {
            j11 = mobScannerConfig.scannerQueueDebounce;
        }
        if ((i13 & 64) != 0) {
            i12 = mobScannerConfig.sharpnessThreshold;
        }
        if ((i13 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            z11 = mobScannerConfig.separateSaluteProcess;
        }
        if ((i13 & 256) != 0) {
            j12 = mobScannerConfig.separateProcessTimeout;
        }
        long j13 = j11;
        List list5 = list4;
        int i14 = i11;
        List list6 = list3;
        return mobScannerConfig.copy(list, list2, list6, list5, i14, j13, i12, z11, j12);
    }

    @NotNull
    public final List<String> component1() {
        return this.qrScanners;
    }

    @NotNull
    public final List<String> component2() {
        return this.phoneScanners;
    }

    @NotNull
    public final List<String> component3() {
        return this.bankCardScanners;
    }

    public final List<String> component4() {
        return this.disabledSalute;
    }

    /* renamed from: component5, reason: from getter */
    public final int getMaxSize() {
        return this.maxSize;
    }

    /* renamed from: component6, reason: from getter */
    public final long getScannerQueueDebounce() {
        return this.scannerQueueDebounce;
    }

    /* renamed from: component7, reason: from getter */
    public final int getSharpnessThreshold() {
        return this.sharpnessThreshold;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getSeparateSaluteProcess() {
        return this.separateSaluteProcess;
    }

    /* renamed from: component9, reason: from getter */
    public final long getSeparateProcessTimeout() {
        return this.separateProcessTimeout;
    }

    @NotNull
    public final MobScannerConfig copy(@NotNull List<String> qrScanners, @NotNull List<String> phoneScanners, @NotNull List<String> bankCardScanners, List<String> disabledSalute, int maxSize, long scannerQueueDebounce, int sharpnessThreshold, boolean separateSaluteProcess, long separateProcessTimeout) {
        Intrinsics.checkNotNullParameter(qrScanners, "qrScanners");
        Intrinsics.checkNotNullParameter(phoneScanners, "phoneScanners");
        Intrinsics.checkNotNullParameter(bankCardScanners, "bankCardScanners");
        return new MobScannerConfig(qrScanners, phoneScanners, bankCardScanners, disabledSalute, maxSize, scannerQueueDebounce, sharpnessThreshold, separateSaluteProcess, separateProcessTimeout);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MobScannerConfig)) {
            return false;
        }
        MobScannerConfig mobScannerConfig = (MobScannerConfig) other;
        return Intrinsics.d(this.qrScanners, mobScannerConfig.qrScanners) && Intrinsics.d(this.phoneScanners, mobScannerConfig.phoneScanners) && Intrinsics.d(this.bankCardScanners, mobScannerConfig.bankCardScanners) && Intrinsics.d(this.disabledSalute, mobScannerConfig.disabledSalute) && this.maxSize == mobScannerConfig.maxSize && this.scannerQueueDebounce == mobScannerConfig.scannerQueueDebounce && this.sharpnessThreshold == mobScannerConfig.sharpnessThreshold && this.separateSaluteProcess == mobScannerConfig.separateSaluteProcess && this.separateProcessTimeout == mobScannerConfig.separateProcessTimeout;
    }

    @NotNull
    public final List<String> getBankCardScanners() {
        return this.bankCardScanners;
    }

    public final List<String> getDisabledSalute() {
        return this.disabledSalute;
    }

    public final int getMaxSize() {
        return this.maxSize;
    }

    @NotNull
    public final List<String> getPhoneScanners() {
        return this.phoneScanners;
    }

    @NotNull
    public final List<String> getQrScanners() {
        return this.qrScanners;
    }

    public final long getScannerQueueDebounce() {
        return this.scannerQueueDebounce;
    }

    public final long getSeparateProcessTimeout() {
        return this.separateProcessTimeout;
    }

    public final boolean getSeparateSaluteProcess() {
        return this.separateSaluteProcess;
    }

    public final int getSharpnessThreshold() {
        return this.sharpnessThreshold;
    }

    public int hashCode() {
        int b11 = g.b(g.b(this.qrScanners.hashCode() * 31, 31, this.phoneScanners), 31, this.bankCardScanners);
        List<String> list = this.disabledSalute;
        return Long.hashCode(this.separateProcessTimeout) + C3532b.a(C2454a.a(this.sharpnessThreshold, c.a(C2454a.a(this.maxSize, (b11 + (list == null ? 0 : list.hashCode())) * 31, 31), 31, this.scannerQueueDebounce), 31), 31, this.separateSaluteProcess);
    }

    @NotNull
    public String toString() {
        List<String> list = this.qrScanners;
        List<String> list2 = this.phoneScanners;
        List<String> list3 = this.bankCardScanners;
        List<String> list4 = this.disabledSalute;
        int i11 = this.maxSize;
        long j11 = this.scannerQueueDebounce;
        int i12 = this.sharpnessThreshold;
        boolean z11 = this.separateSaluteProcess;
        long j12 = this.separateProcessTimeout;
        StringBuilder d11 = Fj.c.d("MobScannerConfig(qrScanners=", list, ", phoneScanners=", ", bankCardScanners=", list2);
        C2616s.g(", disabledSalute=", ", maxSize=", d11, list3, list4);
        d11.append(i11);
        d11.append(", scannerQueueDebounce=");
        d11.append(j11);
        d11.append(", sharpnessThreshold=");
        d11.append(i12);
        d11.append(", separateSaluteProcess=");
        d11.append(z11);
        d11.append(", separateProcessTimeout=");
        d11.append(j12);
        d11.append(")");
        return d11.toString();
    }

    public /* synthetic */ MobScannerConfig(List list, List list2, List list3, List list4, int i11, long j11, int i12, boolean z11, long j12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, list2, (i13 & 4) != 0 ? C7714v.a0("MLKIT") : list3, list4, i11, j11, i12, z11, j12);
    }
}
