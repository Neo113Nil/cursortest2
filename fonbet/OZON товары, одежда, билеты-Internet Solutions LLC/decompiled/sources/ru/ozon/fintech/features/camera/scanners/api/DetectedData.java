package ru.ozon.fintech.features.camera.scanners.api;

import Cm.e;
import N3.C3660k;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 )2\u00020\u0001:\u0001)BQ\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\u0006\u0010\u001a\u001a\u00020\u001bJ\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010!\u001a\u00020\nHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\fHÆ\u0003Ja\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001J\u0013\u0010$\u001a\u00020\u001b2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006*"}, d2 = {"Lru/ozon/fintech/features/camera/scanners/api/DetectedData;", "", "qrString", "", "rawDataBase64", "phones", "", "scannerError", "bankCardNumber", "cameraScannerSource", "Lru/ozon/fintech/features/camera/scanners/api/CameraScannerSource;", "cameraScannerType", "Lru/ozon/fintech/features/camera/scanners/api/CameraScannerType;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lru/ozon/fintech/features/camera/scanners/api/CameraScannerSource;Lru/ozon/fintech/features/camera/scanners/api/CameraScannerType;)V", "getQrString", "()Ljava/lang/String;", "getRawDataBase64", "getPhones", "()Ljava/util/List;", "getScannerError", "getBankCardNumber", "getCameraScannerSource", "()Lru/ozon/fintech/features/camera/scanners/api/CameraScannerSource;", "getCameraScannerType", "()Lru/ozon/fintech/features/camera/scanners/api/CameraScannerType;", "hasData", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "Companion", "camera-scanners-api_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class DetectedData {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final String bankCardNumber;

    @NotNull
    private final CameraScannerSource cameraScannerSource;
    private final CameraScannerType cameraScannerType;
    private final List<String> phones;
    private final String qrString;
    private final String rawDataBase64;
    private final String scannerError;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t¨\u0006\n"}, d2 = {"Lru/ozon/fintech/features/camera/scanners/api/DetectedData$Companion;", "", "<init>", "()V", "empty", "Lru/ozon/fintech/features/camera/scanners/api/DetectedData;", "cameraScannerSource", "Lru/ozon/fintech/features/camera/scanners/api/CameraScannerSource;", "cameraScannerType", "Lru/ozon/fintech/features/camera/scanners/api/CameraScannerType;", "camera-scanners-api_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final DetectedData empty(@NotNull CameraScannerSource cameraScannerSource, CameraScannerType cameraScannerType) {
            Intrinsics.checkNotNullParameter(cameraScannerSource, "cameraScannerSource");
            return new DetectedData(null, null, null, null, null, cameraScannerSource, cameraScannerType);
        }

        private Companion() {
        }
    }

    public DetectedData(String str, String str2, List<String> list, String str3, String str4, @NotNull CameraScannerSource cameraScannerSource, CameraScannerType cameraScannerType) {
        Intrinsics.checkNotNullParameter(cameraScannerSource, "cameraScannerSource");
        this.qrString = str;
        this.rawDataBase64 = str2;
        this.phones = list;
        this.scannerError = str3;
        this.bankCardNumber = str4;
        this.cameraScannerSource = cameraScannerSource;
        this.cameraScannerType = cameraScannerType;
    }

    public static /* synthetic */ DetectedData copy$default(DetectedData detectedData, String str, String str2, List list, String str3, String str4, CameraScannerSource cameraScannerSource, CameraScannerType cameraScannerType, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = detectedData.qrString;
        }
        if ((i11 & 2) != 0) {
            str2 = detectedData.rawDataBase64;
        }
        if ((i11 & 4) != 0) {
            list = detectedData.phones;
        }
        if ((i11 & 8) != 0) {
            str3 = detectedData.scannerError;
        }
        if ((i11 & 16) != 0) {
            str4 = detectedData.bankCardNumber;
        }
        if ((i11 & 32) != 0) {
            cameraScannerSource = detectedData.cameraScannerSource;
        }
        if ((i11 & 64) != 0) {
            cameraScannerType = detectedData.cameraScannerType;
        }
        CameraScannerSource cameraScannerSource2 = cameraScannerSource;
        CameraScannerType cameraScannerType2 = cameraScannerType;
        String str5 = str4;
        List list2 = list;
        return detectedData.copy(str, str2, list2, str3, str5, cameraScannerSource2, cameraScannerType2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getQrString() {
        return this.qrString;
    }

    /* renamed from: component2, reason: from getter */
    public final String getRawDataBase64() {
        return this.rawDataBase64;
    }

    public final List<String> component3() {
        return this.phones;
    }

    /* renamed from: component4, reason: from getter */
    public final String getScannerError() {
        return this.scannerError;
    }

    /* renamed from: component5, reason: from getter */
    public final String getBankCardNumber() {
        return this.bankCardNumber;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final CameraScannerSource getCameraScannerSource() {
        return this.cameraScannerSource;
    }

    /* renamed from: component7, reason: from getter */
    public final CameraScannerType getCameraScannerType() {
        return this.cameraScannerType;
    }

    @NotNull
    public final DetectedData copy(String qrString, String rawDataBase64, List<String> phones, String scannerError, String bankCardNumber, @NotNull CameraScannerSource cameraScannerSource, CameraScannerType cameraScannerType) {
        Intrinsics.checkNotNullParameter(cameraScannerSource, "cameraScannerSource");
        return new DetectedData(qrString, rawDataBase64, phones, scannerError, bankCardNumber, cameraScannerSource, cameraScannerType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DetectedData)) {
            return false;
        }
        DetectedData detectedData = (DetectedData) other;
        return Intrinsics.d(this.qrString, detectedData.qrString) && Intrinsics.d(this.rawDataBase64, detectedData.rawDataBase64) && Intrinsics.d(this.phones, detectedData.phones) && Intrinsics.d(this.scannerError, detectedData.scannerError) && Intrinsics.d(this.bankCardNumber, detectedData.bankCardNumber) && this.cameraScannerSource == detectedData.cameraScannerSource && this.cameraScannerType == detectedData.cameraScannerType;
    }

    public final String getBankCardNumber() {
        return this.bankCardNumber;
    }

    @NotNull
    public final CameraScannerSource getCameraScannerSource() {
        return this.cameraScannerSource;
    }

    public final CameraScannerType getCameraScannerType() {
        return this.cameraScannerType;
    }

    public final List<String> getPhones() {
        return this.phones;
    }

    public final String getQrString() {
        return this.qrString;
    }

    public final String getRawDataBase64() {
        return this.rawDataBase64;
    }

    public final String getScannerError() {
        return this.scannerError;
    }

    public final boolean hasData() {
        String str;
        List<String> list;
        String str2 = this.qrString;
        return (str2 != null && str2.length() > 0) || ((str = this.rawDataBase64) != null && str.length() > 0) || ((list = this.phones) != null && (list.isEmpty() ^ true));
    }

    public int hashCode() {
        String str = this.qrString;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.rawDataBase64;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<String> list = this.phones;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this.scannerError;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.bankCardNumber;
        int hashCode5 = (this.cameraScannerSource.hashCode() + ((hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31)) * 31;
        CameraScannerType cameraScannerType = this.cameraScannerType;
        return hashCode5 + (cameraScannerType != null ? cameraScannerType.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.qrString;
        String str2 = this.rawDataBase64;
        List<String> list = this.phones;
        String str3 = this.scannerError;
        String str4 = this.bankCardNumber;
        CameraScannerSource cameraScannerSource = this.cameraScannerSource;
        CameraScannerType cameraScannerType = this.cameraScannerType;
        StringBuilder d11 = C3660k.d("DetectedData(qrString=", str, ", rawDataBase64=", str2, ", phones=");
        e.i(", scannerError=", str3, ", bankCardNumber=", d11, list);
        d11.append(str4);
        d11.append(", cameraScannerSource=");
        d11.append(cameraScannerSource);
        d11.append(", cameraScannerType=");
        d11.append(cameraScannerType);
        d11.append(")");
        return d11.toString();
    }
}
