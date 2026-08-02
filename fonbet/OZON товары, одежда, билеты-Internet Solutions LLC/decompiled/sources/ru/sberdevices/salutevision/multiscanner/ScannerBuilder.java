package ru.sberdevices.salutevision.multiscanner;

import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.sberdevices.salutevision.core.data.BarcodeFormat;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lru/sberdevices/salutevision/multiscanner/ScannerBuilder;", "", "()V", "Companion", "salutevision-mobile-public_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ScannerBuilder {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u0016\u0010\b\u001a\u00020\u00042\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¨\u0006\t"}, d2 = {"Lru/sberdevices/salutevision/multiscanner/ScannerBuilder$Companion;", "", "()V", "barcodeScannerGallery", "Lru/sberdevices/salutevision/multiscanner/Scanner;", "formats", "", "Lru/sberdevices/salutevision/core/data/BarcodeFormat;", "barcodeScannerWithDetector", "salutevision-mobile-public_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static Scanner barcodeScannerGallery$default(Companion companion, Set set, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                set = M.f71699a;
            }
            return companion.barcodeScannerGallery(set);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static Scanner barcodeScannerWithDetector$default(Companion companion, Set set, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                set = M.f71699a;
            }
            return companion.barcodeScannerWithDetector(set);
        }

        @NotNull
        public final Scanner barcodeScannerGallery(@NotNull Set<? extends BarcodeFormat> formats) {
            Intrinsics.checkNotNullParameter(formats, "formats");
            return new Scanner(ScannerWrapperBuilder.INSTANCE.barcodeGallery(formats));
        }

        @NotNull
        public final Scanner barcodeScannerWithDetector(@NotNull Set<? extends BarcodeFormat> formats) {
            Intrinsics.checkNotNullParameter(formats, "formats");
            return new Scanner(ScannerWrapperBuilder.INSTANCE.barcodeDetector(formats));
        }

        private Companion() {
        }
    }
}
