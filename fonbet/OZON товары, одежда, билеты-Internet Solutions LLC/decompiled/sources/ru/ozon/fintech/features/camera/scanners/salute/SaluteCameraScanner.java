package ru.ozon.fintech.features.camera.scanners.salute;

import N3.C3660k;
import Sc.InterfaceC4008j;
import Sc.k;
import Sc.n;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.graphics.Bitmap;
import android.os.IBinder;
import bd.h;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.d;
import kotlin.coroutines.g;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;
import kotlin.time.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.features.camera.scanners.api.CameraScanner;
import ru.ozon.fintech.features.camera.scanners.api.CameraScannerMode;
import ru.ozon.fintech.features.camera.scanners.api.CameraScannerSource;
import ru.ozon.fintech.features.camera.scanners.api.CameraScannerType;
import ru.ozon.fintech.features.camera.scanners.api.DetectedData;
import ru.ozon.fintech.features.camera.scanners.ipc.ISaluteQrAnalyzer;
import ru.ozon.fintech.features.camera.scanners.salute.SaluteInteractor;
import ru.ozon.fintech.features.camera.scanners.service.SaluteQrService;
import ru.sberdevices.salutevision.core.data.BarcodeFormat;
import ve.EnumC10311b;
import xe.B0;
import xe.C10720e0;
import xe.C10727i;
import xe.H0;
import xe.M;
import xe.N;
import xe.X0;
import xe.Y;
import xe.f1;

@Metadata(d1 = {"\u0000\u0087\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0006*\u0001H\u0018\u0000 K2\u00020\u0001:\u0002KLB5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J/\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J/\u0010\u001a\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004H\u0002¢\u0006\u0004\b\u001a\u0010\u0019J\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u000f*\u00020\u001bH\u0002¢\u0006\u0004\b\u0010\u0010\u001cJE\u0010 \u001a\u0004\u0018\u00010\u00172\b\u0010\u001d\u001a\u0004\u0018\u00010\u00052\b\u0010\u001e\u001a\u0004\u0018\u00010\u00052\b\u0010\u001f\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0015\u001a\u00020\u00142\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004H\u0002¢\u0006\u0004\b \u0010!J\"\u0010%\u001a\u0004\u0018\u00010$2\u0006\u0010\"\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\u000bH\u0082@¢\u0006\u0004\b%\u0010&J\u0017\u0010*\u001a\u00020)2\u0006\u0010(\u001a\u00020'H\u0002¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020'H\u0002¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020)H\u0016¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020)H\u0016¢\u0006\u0004\b0\u0010/J'\u00102\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u00101\u001a\u00020\u001bH\u0016¢\u0006\u0004\b2\u00103R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00104R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00105R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00106R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u00107R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u00108R\u001b\u0010>\u001a\u0002098BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u001b\u0010C\u001a\u00020?8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b@\u0010;\u001a\u0004\bA\u0010BR\u0018\u0010E\u001a\u0004\u0018\u00010D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0016\u0010G\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u00107R\u0014\u0010I\u001a\u00020H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010J¨\u0006M"}, d2 = {"Lru/ozon/fintech/features/camera/scanners/salute/SaluteCameraScanner;", "Lru/ozon/fintech/features/camera/scanners/api/CameraScanner;", "Landroid/content/Context;", "context", "", "", "barcodeFormats", "Lru/ozon/fintech/features/camera/scanners/api/CameraScannerMode;", "cameraScannerMode", "", "separateProcess", "", "processTimeout", "<init>", "(Landroid/content/Context;Ljava/util/List;Lru/ozon/fintech/features/camera/scanners/api/CameraScannerMode;ZJ)V", "Lru/sberdevices/salutevision/core/data/BarcodeFormat;", "toBarcodeFormat", "(Ljava/util/List;)Ljava/util/List;", "Landroid/graphics/Bitmap;", "bitmap", "Lru/ozon/fintech/features/camera/scanners/api/CameraScannerSource;", "cameraScannerSource", "barcodeFormatsSalute", "Lru/ozon/fintech/features/camera/scanners/api/DetectedData;", "handleBySeparateProcess", "(Landroid/graphics/Bitmap;Lru/ozon/fintech/features/camera/scanners/api/CameraScannerSource;Ljava/util/List;)Lru/ozon/fintech/features/camera/scanners/api/DetectedData;", "handleBySameProcess", "", "(I)Lru/sberdevices/salutevision/core/data/BarcodeFormat;", "qrData", "rawDataBase64", "format", "handleScannerResult", "(Ljava/lang/String;Ljava/lang/String;Lru/sberdevices/salutevision/core/data/BarcodeFormat;Lru/ozon/fintech/features/camera/scanners/api/CameraScannerSource;Ljava/util/List;)Lru/ozon/fintech/features/camera/scanners/api/DetectedData;", "path", "timeoutMs", "Lru/ozon/fintech/features/camera/scanners/salute/SaluteCameraScanner$ServiceScannerResult;", "submitAndAwait", "(Ljava/lang/String;JLkotlin/coroutines/d;)Ljava/lang/Object;", "Ljava/io/File;", "file", "", "clean", "(Ljava/io/File;)V", "createFolderIfNeed", "()Ljava/io/File;", "warmUp", "()V", "shutdown", "rotationDegrees", "process", "(Landroid/graphics/Bitmap;Lru/ozon/fintech/features/camera/scanners/api/CameraScannerSource;I)Lru/ozon/fintech/features/camera/scanners/api/DetectedData;", "Landroid/content/Context;", "Ljava/util/List;", "Lru/ozon/fintech/features/camera/scanners/api/CameraScannerMode;", "Z", "J", "Lxe/M;", "cleanScope$delegate", "LSc/j;", "getCleanScope", "()Lxe/M;", "cleanScope", "Lru/ozon/fintech/features/camera/scanners/salute/SaluteInteractor;", "saluteInteractor$delegate", "getSaluteInteractor", "()Lru/ozon/fintech/features/camera/scanners/salute/SaluteInteractor;", "saluteInteractor", "Lru/ozon/fintech/features/camera/scanners/ipc/ISaluteQrAnalyzer;", "service", "Lru/ozon/fintech/features/camera/scanners/ipc/ISaluteQrAnalyzer;", "bound", "ru/ozon/fintech/features/camera/scanners/salute/SaluteCameraScanner$connection$1", "connection", "Lru/ozon/fintech/features/camera/scanners/salute/SaluteCameraScanner$connection$1;", "Companion", "ServiceScannerResult", "camera-scanners-salute_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SaluteCameraScanner implements CameraScanner {

    @NotNull
    private static final List<BarcodeFormat> BARCODE_FORMATS_SALUTE;

    @NotNull
    private static final String EXT_JPG = ".jpg";

    @NotNull
    private static final String FOLDER_NAME = "/imgTmp/";

    @NotNull
    private static final List<BarcodeFormat> MIX_MODE_FORMATS_SALUTE;

    @NotNull
    private static final List<BarcodeFormat> QR_CODE_FORMATS_SALUTE;

    @NotNull
    private static final String TAG = "SALUTE_SCANNER";

    @NotNull
    private final List<String> barcodeFormats;
    private boolean bound;

    @NotNull
    private final CameraScannerMode cameraScannerMode;

    /* renamed from: cleanScope$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j cleanScope;

    @NotNull
    private final SaluteCameraScanner$connection$1 connection;

    @NotNull
    private final Context context;
    private final long processTimeout;

    /* renamed from: saluteInteractor$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j saluteInteractor;
    private final boolean separateProcess;
    private volatile ISaluteQrAnalyzer service;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class EntriesMappings {
        public static final /* synthetic */ Xc.a<BarcodeFormat> entries$0 = Xc.b.a(BarcodeFormat.values());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0082\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\rJ2\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, d2 = {"Lru/ozon/fintech/features/camera/scanners/salute/SaluteCameraScanner$ServiceScannerResult;", "", "qrData", "", "rawDataBase64", "barcodeFormatOrdinal", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getQrData", "()Ljava/lang/String;", "getRawDataBase64", "getBarcodeFormatOrdinal", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lru/ozon/fintech/features/camera/scanners/salute/SaluteCameraScanner$ServiceScannerResult;", "equals", "", "other", "hashCode", "toString", "camera-scanners-salute_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final /* data */ class ServiceScannerResult {
        private final Integer barcodeFormatOrdinal;
        private final String qrData;
        private final String rawDataBase64;

        public ServiceScannerResult(String str, String str2, Integer num) {
            this.qrData = str;
            this.rawDataBase64 = str2;
            this.barcodeFormatOrdinal = num;
        }

        public static /* synthetic */ ServiceScannerResult copy$default(ServiceScannerResult serviceScannerResult, String str, String str2, Integer num, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = serviceScannerResult.qrData;
            }
            if ((i11 & 2) != 0) {
                str2 = serviceScannerResult.rawDataBase64;
            }
            if ((i11 & 4) != 0) {
                num = serviceScannerResult.barcodeFormatOrdinal;
            }
            return serviceScannerResult.copy(str, str2, num);
        }

        /* renamed from: component1, reason: from getter */
        public final String getQrData() {
            return this.qrData;
        }

        /* renamed from: component2, reason: from getter */
        public final String getRawDataBase64() {
            return this.rawDataBase64;
        }

        /* renamed from: component3, reason: from getter */
        public final Integer getBarcodeFormatOrdinal() {
            return this.barcodeFormatOrdinal;
        }

        @NotNull
        public final ServiceScannerResult copy(String qrData, String rawDataBase64, Integer barcodeFormatOrdinal) {
            return new ServiceScannerResult(qrData, rawDataBase64, barcodeFormatOrdinal);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ServiceScannerResult)) {
                return false;
            }
            ServiceScannerResult serviceScannerResult = (ServiceScannerResult) other;
            return Intrinsics.d(this.qrData, serviceScannerResult.qrData) && Intrinsics.d(this.rawDataBase64, serviceScannerResult.rawDataBase64) && Intrinsics.d(this.barcodeFormatOrdinal, serviceScannerResult.barcodeFormatOrdinal);
        }

        public final Integer getBarcodeFormatOrdinal() {
            return this.barcodeFormatOrdinal;
        }

        public final String getQrData() {
            return this.qrData;
        }

        public final String getRawDataBase64() {
            return this.rawDataBase64;
        }

        public int hashCode() {
            String str = this.qrData;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.rawDataBase64;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            Integer num = this.barcodeFormatOrdinal;
            return hashCode2 + (num != null ? num.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.qrData;
            String str2 = this.rawDataBase64;
            return Ep.a.c(C3660k.d("ServiceScannerResult(qrData=", str, ", rawDataBase64=", str2, ", barcodeFormatOrdinal="), this.barcodeFormatOrdinal, ")");
        }
    }

    static {
        List<BarcodeFormat> b02 = C7714v.b0(BarcodeFormat.QR_CODE, BarcodeFormat.AZTEC, BarcodeFormat.DATA_MATRIX);
        QR_CODE_FORMATS_SALUTE = b02;
        List<BarcodeFormat> b03 = C7714v.b0(BarcodeFormat.EAN_8, BarcodeFormat.EAN_13, BarcodeFormat.CODE_39, BarcodeFormat.CODE_128, BarcodeFormat.PDF_417);
        BARCODE_FORMATS_SALUTE = b03;
        MIX_MODE_FORMATS_SALUTE = C7714v.p0(b02, b03);
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [ru.ozon.fintech.features.camera.scanners.salute.SaluteCameraScanner$connection$1] */
    public SaluteCameraScanner(@NotNull Context context, @NotNull List<String> barcodeFormats, @NotNull CameraScannerMode cameraScannerMode, boolean z11, long j11) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(barcodeFormats, "barcodeFormats");
        Intrinsics.checkNotNullParameter(cameraScannerMode, "cameraScannerMode");
        this.context = context;
        this.barcodeFormats = barcodeFormats;
        this.cameraScannerMode = cameraScannerMode;
        this.separateProcess = z11;
        this.processTimeout = j11;
        n nVar = n.PUBLICATION;
        this.cleanScope = k.a(nVar, new a());
        this.saluteInteractor = k.a(nVar, new b());
        this.connection = new ServiceConnection() { // from class: ru.ozon.fintech.features.camera.scanners.salute.SaluteCameraScanner$connection$1
            @Override // android.content.ServiceConnection
            public void onServiceConnected(ComponentName name, IBinder binder) {
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(binder, "binder");
                L80.a.a("SALUTE_SCANNER", "onServiceConnected");
                SaluteCameraScanner.this.service = ISaluteQrAnalyzer.Stub.asInterface(binder);
                SaluteCameraScanner.this.bound = true;
            }

            @Override // android.content.ServiceConnection
            public void onServiceDisconnected(ComponentName name) {
                Intrinsics.checkNotNullParameter(name, "name");
                L80.a.a("SALUTE_SCANNER", "onServiceDisconnected");
                SaluteCameraScanner.this.service = null;
                SaluteCameraScanner.this.bound = false;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void clean(File file) {
        L80.a.a(TAG, "clean for " + file.getPath());
        if (file.isDirectory() && file.exists()) {
            h.h(file);
        }
        if (file.isFile() && file.exists()) {
            file.delete();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final M cleanScope_delegate$lambda$0() {
        B0 b11 = X0.b();
        C10720e0 c10720e0 = C10720e0.f105451a;
        return N.a(CoroutineContext.Element.a.d(He.b.f10879b, (H0) b11));
    }

    private final File createFolderIfNeed() {
        File file = new File(this.context.getFilesDir(), FOLDER_NAME);
        if (file.exists() || file.mkdirs()) {
            return file;
        }
        throw new IllegalStateException(Nk.a.b("Cannot create dir: ", file.getAbsolutePath()));
    }

    private final M getCleanScope() {
        return (M) this.cleanScope.getValue();
    }

    private final SaluteInteractor getSaluteInteractor() {
        return (SaluteInteractor) this.saluteInteractor.getValue();
    }

    private final DetectedData handleBySameProcess(Bitmap bitmap, CameraScannerSource cameraScannerSource, List<? extends BarcodeFormat> barcodeFormatsSalute) {
        SaluteInteractor.ScanResult scanResult;
        L80.a.a(TAG, "handleBySameProcess");
        try {
            scanResult = getSaluteInteractor().analyze(bitmap);
        } catch (Exception e11) {
            L80.a.c(TAG, "handleBySameProcess try/catch", e11);
            scanResult = null;
        }
        DetectedData handleScannerResult = handleScannerResult(scanResult != null ? scanResult.getQrData() : null, scanResult != null ? scanResult.getRawBytesBase64() : null, scanResult != null ? toBarcodeFormat(scanResult.getFormatCode()) : null, cameraScannerSource, barcodeFormatsSalute);
        L80.a.a(TAG, "handleBySameProcess result " + handleScannerResult);
        return handleScannerResult;
    }

    private final DetectedData handleBySeparateProcess(Bitmap bitmap, CameraScannerSource cameraScannerSource, List<? extends BarcodeFormat> barcodeFormatsSalute) {
        L80.a.a(TAG, "handleBySeparateProcess");
        DetectedData detectedData = null;
        try {
            File file = new File(createFolderIfNeed(), System.currentTimeMillis() + EXT_JPG);
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                fileOutputStream.flush();
                fileOutputStream.close();
                Unit unit = Unit.f71690a;
                fileOutputStream.close();
                ServiceScannerResult serviceScannerResult = (ServiceScannerResult) C10727i.d(g.f71771a, new SaluteCameraScanner$handleBySeparateProcess$2(this, file, null));
                if (serviceScannerResult != null) {
                    M cleanScope = getCleanScope();
                    C10720e0 c10720e0 = C10720e0.f105451a;
                    C10727i.c(cleanScope, He.b.f10879b, null, new SaluteCameraScanner$handleBySeparateProcess$3$1(this, file, null), 2);
                    String qrData = serviceScannerResult.getQrData();
                    String rawDataBase64 = serviceScannerResult.getRawDataBase64();
                    Integer barcodeFormatOrdinal = serviceScannerResult.getBarcodeFormatOrdinal();
                    detectedData = handleScannerResult(qrData, rawDataBase64, barcodeFormatOrdinal != null ? toBarcodeFormat(barcodeFormatOrdinal.intValue()) : null, cameraScannerSource, barcodeFormatsSalute);
                }
            } finally {
            }
        } catch (Exception e11) {
            L80.a.c(TAG, "handleBySeparateProcess try/catch", e11);
        }
        L80.a.a(TAG, "handleBySeparateProcess result " + detectedData);
        return detectedData;
    }

    private final DetectedData handleScannerResult(String qrData, String rawDataBase64, BarcodeFormat format, CameraScannerSource cameraScannerSource, List<? extends BarcodeFormat> barcodeFormatsSalute) {
        if (format == null || qrData == null || rawDataBase64 == null) {
            return null;
        }
        if (this.cameraScannerMode == CameraScannerMode.QR && QR_CODE_FORMATS_SALUTE.contains(format)) {
            L80.a.a(TAG, "SALUTE QR format=" + format + " text=" + qrData + " rawBytes=" + rawDataBase64);
            return new DetectedData(qrData, rawDataBase64, null, null, null, cameraScannerSource, CameraScannerType.SALUTE);
        }
        if (this.cameraScannerMode != CameraScannerMode.BARCODE || !BARCODE_FORMATS_SALUTE.contains(format)) {
            if (this.cameraScannerMode != CameraScannerMode.MIX_QR_BARCODE || !MIX_MODE_FORMATS_SALUTE.contains(format)) {
                return null;
            }
            L80.a.a(TAG, "SALUTE MIX format=" + format + " text=" + qrData + " rawBytes=" + rawDataBase64);
            return new DetectedData(qrData, rawDataBase64, null, null, null, cameraScannerSource, CameraScannerType.SALUTE);
        }
        if (barcodeFormatsSalute.isEmpty()) {
            L80.a.a(TAG, "SALUTE BARCODE ALL format=" + format + " text=" + qrData + " rawBytes=" + rawDataBase64);
            return new DetectedData(qrData, rawDataBase64, null, null, null, cameraScannerSource, CameraScannerType.SALUTE);
        }
        if (!barcodeFormatsSalute.contains(format)) {
            return null;
        }
        L80.a.a(TAG, "SALUTE BARCODE format=" + format + " text=" + qrData + " rawBytes=" + rawDataBase64);
        return new DetectedData(qrData, rawDataBase64, null, null, null, cameraScannerSource, CameraScannerType.SALUTE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SaluteInteractor saluteInteractor_delegate$lambda$2() {
        return new SaluteInteractor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit shutdown$lambda$3(SaluteCameraScanner saluteCameraScanner, Throwable th2) {
        N.c(saluteCameraScanner.getCleanScope(), null);
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object submitAndAwait(String str, long j11, d<? super ServiceScannerResult> dVar) {
        b.Companion companion = kotlin.time.b.INSTANCE;
        long h11 = c.h(j11, EnumC10311b.MILLISECONDS);
        return f1.b(Y.e(h11), new SaluteCameraScanner$submitAndAwait$2(this, str, null), dVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final List<BarcodeFormat> toBarcodeFormat(List<String> list) {
        BarcodeFormat barcodeFormat;
        List<String> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return K.f71697a;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            String upperCase = ((String) it.next()).toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            switch (upperCase.hashCode()) {
                case -84093723:
                    if (upperCase.equals("CODE_128")) {
                        barcodeFormat = BarcodeFormat.CODE_128;
                        break;
                    }
                    barcodeFormat = null;
                    break;
                case 160877:
                    if (upperCase.equals("PDF_417")) {
                        barcodeFormat = BarcodeFormat.PDF_417;
                        break;
                    }
                    barcodeFormat = null;
                    break;
                case 65737323:
                    if (upperCase.equals("EAN_8")) {
                        barcodeFormat = BarcodeFormat.EAN_8;
                        break;
                    }
                    barcodeFormat = null;
                    break;
                case 1659855352:
                    if (upperCase.equals("CODE_39")) {
                        barcodeFormat = BarcodeFormat.CODE_39;
                        break;
                    }
                    barcodeFormat = null;
                    break;
                case 2037856847:
                    if (upperCase.equals("EAN_13")) {
                        barcodeFormat = BarcodeFormat.EAN_13;
                        break;
                    }
                    barcodeFormat = null;
                    break;
                default:
                    barcodeFormat = null;
                    break;
            }
            if (barcodeFormat != null) {
                arrayList.add(barcodeFormat);
            }
        }
        return arrayList;
    }

    @Override // ru.ozon.fintech.features.camera.scanners.api.CameraScanner
    @NotNull
    public DetectedData process(@NotNull Bitmap bitmap, @NotNull CameraScannerSource cameraScannerSource, int rotationDegrees) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(cameraScannerSource, "cameraScannerSource");
        List<BarcodeFormat> barcodeFormat = toBarcodeFormat(this.barcodeFormats);
        DetectedData handleBySeparateProcess = this.separateProcess ? handleBySeparateProcess(bitmap, cameraScannerSource, barcodeFormat) : handleBySameProcess(bitmap, cameraScannerSource, barcodeFormat);
        if (handleBySeparateProcess == null) {
            handleBySeparateProcess = DetectedData.INSTANCE.empty(cameraScannerSource, CameraScannerType.SALUTE);
        }
        L80.a.a(TAG, "process detectedData " + handleBySeparateProcess);
        return handleBySeparateProcess;
    }

    @Override // ru.ozon.fintech.features.camera.scanners.api.CameraScanner
    public void shutdown() {
        L80.a.a(TAG, "SaluteCameraScanner: shutdown");
        if (this.separateProcess && this.bound) {
            try {
                try {
                    L80.a.a(TAG, "try unbindService");
                    this.context.unbindService(this.connection);
                } catch (Exception e11) {
                    L80.a.c(TAG, "shutdown try/catch", e11);
                }
                ((H0) C10727i.c(getCleanScope(), null, null, new SaluteCameraScanner$shutdown$1(this, null), 3)).y(new k60.d(this, 1));
            } finally {
                this.bound = false;
                this.service = null;
            }
        }
    }

    @Override // ru.ozon.fintech.features.camera.scanners.api.CameraScanner
    public void warmUp() {
        L80.a.a(TAG, "SaluteCameraScanner: warmUp");
        if (!this.separateProcess || this.bound) {
            return;
        }
        L80.a.a(TAG, "try bindService");
        this.context.bindService(new Intent(this.context, (Class<?>) SaluteQrService.class), this.connection, 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final BarcodeFormat toBarcodeFormat(int i11) {
        return (BarcodeFormat) EntriesMappings.entries$0.get(i11);
    }
}
