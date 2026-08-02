package ru.ozon.fintech.features.camera.scanners.salute;

import G.g;
import N3.C3660k;
import android.graphics.Bitmap;
import android.graphics.RectF;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.features.camera.scanners.api.CameraScannerExtKt;
import ru.sberdevices.salutevision.SaluteVisionSdk;
import ru.sberdevices.salutevision.core.data.BarcodeFormat;
import ru.sberdevices.salutevision.core.data.BarcodeRecognition;
import ru.sberdevices.salutevision.core.data.BarcodeRecognitionInfo;
import ru.sberdevices.salutevision.core.data.SaluteVisionImage;
import ru.sberdevices.salutevision.core.data.SaluteVisionRecognition;
import ru.sberdevices.salutevision.multiscanner.Scanner;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lru/ozon/fintech/features/camera/scanners/salute/SaluteInteractor;", "", "<init>", "()V", "scannerSalute", "Lru/sberdevices/salutevision/multiscanner/Scanner;", "analyze", "Lru/ozon/fintech/features/camera/scanners/salute/SaluteInteractor$ScanResult;", "bitmap", "Landroid/graphics/Bitmap;", "ScanResult", "camera-scanners-salute_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SaluteInteractor {

    @NotNull
    private final Scanner scannerSalute;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, d2 = {"Lru/ozon/fintech/features/camera/scanners/salute/SaluteInteractor$ScanResult;", "", "qrData", "", "rawBytesBase64", "formatCode", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;I)V", "getQrData", "()Ljava/lang/String;", "getRawBytesBase64", "getFormatCode", "()I", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "camera-scanners-salute_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ScanResult {
        private final int formatCode;

        @NotNull
        private final String qrData;

        @NotNull
        private final String rawBytesBase64;

        public ScanResult(@NotNull String qrData, @NotNull String rawBytesBase64, int i11) {
            Intrinsics.checkNotNullParameter(qrData, "qrData");
            Intrinsics.checkNotNullParameter(rawBytesBase64, "rawBytesBase64");
            this.qrData = qrData;
            this.rawBytesBase64 = rawBytesBase64;
            this.formatCode = i11;
        }

        public static /* synthetic */ ScanResult copy$default(ScanResult scanResult, String str, String str2, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = scanResult.qrData;
            }
            if ((i12 & 2) != 0) {
                str2 = scanResult.rawBytesBase64;
            }
            if ((i12 & 4) != 0) {
                i11 = scanResult.formatCode;
            }
            return scanResult.copy(str, str2, i11);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getQrData() {
            return this.qrData;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getRawBytesBase64() {
            return this.rawBytesBase64;
        }

        /* renamed from: component3, reason: from getter */
        public final int getFormatCode() {
            return this.formatCode;
        }

        @NotNull
        public final ScanResult copy(@NotNull String qrData, @NotNull String rawBytesBase64, int formatCode) {
            Intrinsics.checkNotNullParameter(qrData, "qrData");
            Intrinsics.checkNotNullParameter(rawBytesBase64, "rawBytesBase64");
            return new ScanResult(qrData, rawBytesBase64, formatCode);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ScanResult)) {
                return false;
            }
            ScanResult scanResult = (ScanResult) other;
            return Intrinsics.d(this.qrData, scanResult.qrData) && Intrinsics.d(this.rawBytesBase64, scanResult.rawBytesBase64) && this.formatCode == scanResult.formatCode;
        }

        public final int getFormatCode() {
            return this.formatCode;
        }

        @NotNull
        public final String getQrData() {
            return this.qrData;
        }

        @NotNull
        public final String getRawBytesBase64() {
            return this.rawBytesBase64;
        }

        public int hashCode() {
            return Integer.hashCode(this.formatCode) + g.a(this.qrData.hashCode() * 31, 31, this.rawBytesBase64);
        }

        @NotNull
        public String toString() {
            return K00.b.e(this.formatCode, ")", C3660k.d("ScanResult(qrData=", this.qrData, ", rawBytesBase64=", this.rawBytesBase64, ", formatCode="));
        }
    }

    public SaluteInteractor() {
        System.loadLibrary("salutevision");
        System.loadLibrary("onnxruntime");
        this.scannerSalute = SaluteVisionSdk.Companion.createBarcodeScanner$default(SaluteVisionSdk.INSTANCE, null, 1, null);
    }

    public final ScanResult analyze(@NotNull Bitmap bitmap) throws Exception {
        Object obj;
        BarcodeRecognitionInfo info;
        byte[] rawBytes;
        BarcodeRecognitionInfo info2;
        BarcodeRecognitionInfo info3;
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Iterator<T> it = this.scannerSalute.read(new SaluteVisionImage(bitmap, 0, 2, null), (RectF) null).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((SaluteVisionRecognition) obj).getInfo() != null) {
                break;
            }
        }
        BarcodeRecognition barcodeRecognition = obj instanceof BarcodeRecognition ? (BarcodeRecognition) obj : null;
        BarcodeFormat format = (barcodeRecognition == null || (info3 = barcodeRecognition.getInfo()) == null) ? null : info3.getFormat();
        String text = (barcodeRecognition == null || (info2 = barcodeRecognition.getInfo()) == null) ? null : info2.getText();
        String encodeRawBytes = (barcodeRecognition == null || (info = barcodeRecognition.getInfo()) == null || (rawBytes = info.getRawBytes()) == null) ? null : CameraScannerExtKt.encodeRawBytes(rawBytes);
        if (format == null || text == null || encodeRawBytes == null) {
            return null;
        }
        return new ScanResult(text, encodeRawBytes, format.ordinal());
    }
}
