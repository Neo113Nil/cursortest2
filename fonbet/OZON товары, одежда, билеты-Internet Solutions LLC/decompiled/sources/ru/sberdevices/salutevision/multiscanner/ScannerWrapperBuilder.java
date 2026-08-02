package ru.sberdevices.salutevision.multiscanner;

import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.sberdevices.salutevision.core.data.BarcodeFormat;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lru/sberdevices/salutevision/multiscanner/ScannerWrapperBuilder;", "", "()V", "Companion", "salutevision-mobile-public_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ScannerWrapperBuilder {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u0016\u0010\b\u001a\u00020\u00042\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u001f\u0010\t\u001a\u00020\n2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b2\u0006\u0010\f\u001a\u00020\rH\u0083 J\u001f\u0010\u000e\u001a\u00020\n2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b2\u0006\u0010\f\u001a\u00020\rH\u0083 ¨\u0006\u000f"}, d2 = {"Lru/sberdevices/salutevision/multiscanner/ScannerWrapperBuilder$Companion;", "", "()V", "barcodeDetector", "Lru/sberdevices/salutevision/multiscanner/ScannerWrapper;", "formats", "", "Lru/sberdevices/salutevision/core/data/BarcodeFormat;", "barcodeGallery", "barcodeGalleryNative", "", "", "tryCutted", "", "barcodeWithDetectorNative", "salutevision-mobile-public_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static ScannerWrapper barcodeDetector$default(Companion companion, Set set, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                set = M.f71699a;
            }
            return companion.barcodeDetector(set);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static ScannerWrapper barcodeGallery$default(Companion companion, Set set, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                set = M.f71699a;
            }
            return companion.barcodeGallery(set);
        }

        private final long barcodeGalleryNative(BarcodeFormat[] barcodeFormatArr, boolean z11) {
            return ScannerWrapperBuilder.barcodeGalleryNative(barcodeFormatArr, z11);
        }

        private final long barcodeWithDetectorNative(BarcodeFormat[] barcodeFormatArr, boolean z11) {
            return ScannerWrapperBuilder.barcodeWithDetectorNative(barcodeFormatArr, z11);
        }

        @NotNull
        public final ScannerWrapper barcodeDetector(@NotNull Set<? extends BarcodeFormat> formats) {
            Intrinsics.checkNotNullParameter(formats, "formats");
            return new ScannerWrapper(barcodeWithDetectorNative((BarcodeFormat[]) formats.toArray(new BarcodeFormat[0]), false));
        }

        @NotNull
        public final ScannerWrapper barcodeGallery(@NotNull Set<? extends BarcodeFormat> formats) {
            Intrinsics.checkNotNullParameter(formats, "formats");
            return new ScannerWrapper(barcodeGalleryNative((BarcodeFormat[]) formats.toArray(new BarcodeFormat[0]), false));
        }

        private Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final native long barcodeGalleryNative(BarcodeFormat[] barcodeFormatArr, boolean z11);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native long barcodeWithDetectorNative(BarcodeFormat[] barcodeFormatArr, boolean z11);
}
