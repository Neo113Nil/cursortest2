package ru.ozon.fintech.features.camera.scanners.mlkit;

import Ca.C2737e;
import F70.a;
import Sc.InterfaceC4008j;
import Sc.k;
import Sc.n;
import Sc.o;
import W8.b;
import Z8.f;
import a9.C4962a;
import android.graphics.Bitmap;
import c9.C5769a;
import c9.InterfaceC5770b;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Tasks;
import com.google.mlkit.common.sdkinternal.h;
import d9.p;
import e9.C6320a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executors;
import k70.C7603d;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import q40.C8984a;
import q40.C8985b;
import ru.ozon.fintech.features.camera.scanners.api.CameraScanner;
import ru.ozon.fintech.features.camera.scanners.api.CameraScannerExtKt;
import ru.ozon.fintech.features.camera.scanners.api.CameraScannerMode;
import ru.ozon.fintech.features.camera.scanners.api.CameraScannerSource;
import ru.ozon.fintech.features.camera.scanners.api.CameraScannerType;
import ru.ozon.fintech.features.camera.scanners.api.DetectedData;
import ru.ozon.fintech.features.camera.scanners.mlkit.utils.DetectedPhoneHandler;
import ru.ozon.fintech.features.camera.scanners.mlkit.utils.bankcard.BankCardNumberDetector;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 82\u00020\u0001:\u00018B)\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u001f\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0012\u0010\u0010J'\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0019R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001b\u0010$\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R!\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00150\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010!\u001a\u0004\b&\u0010'R\u001b\u0010-\u001a\u00020)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010!\u001a\u0004\b+\u0010,R\u001b\u00102\u001a\u00020.8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u0010!\u001a\u0004\b0\u00101R\u001b\u00107\u001a\u0002038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b4\u0010!\u001a\u0004\b5\u00106¨\u00069"}, d2 = {"Lru/ozon/fintech/features/camera/scanners/mlkit/MlkitCameraScanner;", "Lru/ozon/fintech/features/camera/scanners/api/CameraScanner;", "", "", "barcodeFormats", "phoneRegex", "Lru/ozon/fintech/features/camera/scanners/api/CameraScannerMode;", "cameraScannerMode", "<init>", "(Ljava/util/List;Ljava/lang/String;Lru/ozon/fintech/features/camera/scanners/api/CameraScannerMode;)V", "La9/a;", "inputImage", "Lru/ozon/fintech/features/camera/scanners/api/CameraScannerSource;", "cameraScannerSource", "Lru/ozon/fintech/features/camera/scanners/api/DetectedData;", "processQR", "(La9/a;Lru/ozon/fintech/features/camera/scanners/api/CameraScannerSource;)Lru/ozon/fintech/features/camera/scanners/api/DetectedData;", "processBankCard", "processPhone", "Landroid/graphics/Bitmap;", "bitmap", "", "rotationDegrees", "process", "(Landroid/graphics/Bitmap;Lru/ozon/fintech/features/camera/scanners/api/CameraScannerSource;I)Lru/ozon/fintech/features/camera/scanners/api/DetectedData;", "Ljava/util/List;", "Ljava/lang/String;", "Lru/ozon/fintech/features/camera/scanners/api/CameraScannerMode;", "Lru/ozon/fintech/features/camera/scanners/mlkit/utils/DetectedPhoneHandler;", "detectedPhoneHandler", "Lru/ozon/fintech/features/camera/scanners/mlkit/utils/DetectedPhoneHandler;", "Lru/ozon/fintech/features/camera/scanners/mlkit/utils/bankcard/BankCardNumberDetector;", "bankCardNumberDetector$delegate", "LSc/j;", "getBankCardNumberDetector", "()Lru/ozon/fintech/features/camera/scanners/mlkit/utils/bankcard/BankCardNumberDetector;", "bankCardNumberDetector", "barcodeFormatsMLKit$delegate", "getBarcodeFormatsMLKit", "()Ljava/util/List;", "barcodeFormatsMLKit", "LW8/b;", "options$delegate", "getOptions", "()LW8/b;", "options", "LW8/a;", "scanner$delegate", "getScanner", "()LW8/a;", "scanner", "Lc9/b;", "textRecognizer$delegate", "getTextRecognizer", "()Lc9/b;", "textRecognizer", "Companion", "camera-scanners-mlkit_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MlkitCameraScanner implements CameraScanner {

    @NotNull
    private static final List<Integer> BARCODE_FORMATS;

    @NotNull
    private static final List<Integer> MIX_MODE_FORMATS;

    @NotNull
    private static final List<Integer> QR_CODE_FORMATS;

    /* renamed from: bankCardNumberDetector$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j bankCardNumberDetector;
    private final List<String> barcodeFormats;

    /* renamed from: barcodeFormatsMLKit$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j barcodeFormatsMLKit;

    @NotNull
    private final CameraScannerMode cameraScannerMode;

    @NotNull
    private final DetectedPhoneHandler detectedPhoneHandler;

    /* renamed from: options$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j options;
    private final String phoneRegex;

    /* renamed from: scanner$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j scanner;

    /* renamed from: textRecognizer$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j textRecognizer;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CameraScannerMode.values().length];
            try {
                iArr[CameraScannerMode.PHONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CameraScannerMode.QR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CameraScannerMode.BARCODE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CameraScannerMode.MIX_QR_BARCODE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CameraScannerMode.BANK_CARD.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        List<Integer> b02 = C7714v.b0(64, 32, 2, 1, 2048);
        BARCODE_FORMATS = b02;
        List<Integer> b03 = C7714v.b0(256, 4096, 16);
        QR_CODE_FORMATS = b03;
        MIX_MODE_FORMATS = C7714v.p0(b03, b02);
    }

    public MlkitCameraScanner(List<String> list, String str, @NotNull CameraScannerMode cameraScannerMode) {
        Intrinsics.checkNotNullParameter(cameraScannerMode, "cameraScannerMode");
        this.barcodeFormats = list;
        this.phoneRegex = str;
        this.cameraScannerMode = cameraScannerMode;
        this.detectedPhoneHandler = new DetectedPhoneHandler(str);
        n nVar = n.PUBLICATION;
        this.bankCardNumberDetector = k.a(nVar, new C8984a());
        this.barcodeFormatsMLKit = k.b(new C8985b(this, 0));
        this.options = k.a(nVar, new C7603d(this, 1));
        this.scanner = k.a(nVar, new a(this, 3));
        this.textRecognizer = k.a(nVar, new C2737e(1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BankCardNumberDetector bankCardNumberDetector_delegate$lambda$0() {
        return new BankCardNumberDetector();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static final List barcodeFormatsMLKit_delegate$lambda$2(MlkitCameraScanner mlkitCameraScanner) {
        Integer num;
        List<String> list = mlkitCameraScanner.barcodeFormats;
        if (list == null || list.isEmpty()) {
            return K.f71697a;
        }
        List<String> list2 = mlkitCameraScanner.barcodeFormats;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            String upperCase = ((String) it.next()).toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            switch (upperCase.hashCode()) {
                case -84093723:
                    if (upperCase.equals("CODE_128")) {
                        num = 1;
                        break;
                    }
                    num = null;
                    break;
                case 160877:
                    if (upperCase.equals("PDF_417")) {
                        num = 2048;
                        break;
                    }
                    num = null;
                    break;
                case 65737323:
                    if (upperCase.equals("EAN_8")) {
                        num = 64;
                        break;
                    }
                    num = null;
                    break;
                case 1659855352:
                    if (upperCase.equals("CODE_39")) {
                        num = 2;
                        break;
                    }
                    num = null;
                    break;
                case 2037856847:
                    if (upperCase.equals("EAN_13")) {
                        num = 32;
                        break;
                    }
                    num = null;
                    break;
                default:
                    num = null;
                    break;
            }
            if (num != null) {
                arrayList.add(num);
            }
        }
        return arrayList;
    }

    private final BankCardNumberDetector getBankCardNumberDetector() {
        return (BankCardNumberDetector) this.bankCardNumberDetector.getValue();
    }

    private final List<Integer> getBarcodeFormatsMLKit() {
        return (List) this.barcodeFormatsMLKit.getValue();
    }

    private final b getOptions() {
        return (b) this.options.getValue();
    }

    private final W8.a getScanner() {
        return (W8.a) this.scanner.getValue();
    }

    private final InterfaceC5770b getTextRecognizer() {
        return (InterfaceC5770b) this.textRecognizer.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b options_delegate$lambda$3(MlkitCameraScanner mlkitCameraScanner) {
        b.a aVar = new b.a();
        if (mlkitCameraScanner.cameraScannerMode != CameraScannerMode.BARCODE || mlkitCameraScanner.getBarcodeFormatsMLKit().isEmpty()) {
            int[] T02 = C7714v.T0(MIX_MODE_FORMATS);
            aVar.c(Arrays.copyOf(T02, T02.length), 0);
            aVar.b();
        } else if (mlkitCameraScanner.getBarcodeFormatsMLKit().size() > 1) {
            int intValue = ((Number) C7714v.K(mlkitCameraScanner.getBarcodeFormatsMLKit())).intValue();
            int[] T03 = C7714v.T0(mlkitCameraScanner.getBarcodeFormatsMLKit().subList(1, mlkitCameraScanner.getBarcodeFormatsMLKit().size()));
            aVar.c(Arrays.copyOf(T03, T03.length), intValue);
        } else {
            aVar.c(new int[0], ((Number) C7714v.K(mlkitCameraScanner.getBarcodeFormatsMLKit())).intValue());
        }
        aVar.d(Executors.newSingleThreadExecutor());
        return aVar.a();
    }

    private final DetectedData processBankCard(C4962a inputImage, CameraScannerSource cameraScannerSource) {
        CameraScannerSource cameraScannerSource2;
        DetectedData.Companion companion = DetectedData.INSTANCE;
        CameraScannerType cameraScannerType = CameraScannerType.MLKIT;
        DetectedData empty = companion.empty(cameraScannerSource, cameraScannerType);
        try {
            C5769a c5769a = (C5769a) Tasks.await(getTextRecognizer().N(inputImage));
            BankCardNumberDetector bankCardNumberDetector = getBankCardNumberDetector();
            Intrinsics.f(c5769a);
            String detect = bankCardNumberDetector.detect(c5769a);
            if (detect == null) {
                return empty;
            }
            cameraScannerSource2 = cameraScannerSource;
            try {
                return new DetectedData(null, null, null, null, detect, cameraScannerSource2, cameraScannerType);
            } catch (Exception e11) {
                e = e11;
                return new DetectedData(null, null, null, "bank card scan error " + e, null, cameraScannerSource2, CameraScannerType.MLKIT);
            }
        } catch (Exception e12) {
            e = e12;
            cameraScannerSource2 = cameraScannerSource;
        }
    }

    private final DetectedData processPhone(C4962a inputImage, CameraScannerSource cameraScannerSource) {
        CameraScannerSource cameraScannerSource2;
        Exception exc;
        DetectedData empty = DetectedData.INSTANCE.empty(cameraScannerSource, CameraScannerType.MLKIT);
        try {
            C5769a c5769a = (C5769a) Tasks.await(getTextRecognizer().N(inputImage));
            ArrayList arrayList = new ArrayList();
            Iterator<C5769a.e> it = c5769a.a().iterator();
            while (it.hasNext()) {
                try {
                    for (C5769a.b bVar : it.next().d()) {
                        L80.a.a("SCAN_FLOW", "line from block text - " + bVar.c());
                        String c11 = bVar.c();
                        Intrinsics.checkNotNullExpressionValue(c11, "getText(...)");
                        L80.a.a("SCAN_FLOW", "corrected text - " + defpackage.a.a(c11));
                        String c12 = bVar.c();
                        Intrinsics.checkNotNullExpressionValue(c12, "getText(...)");
                        arrayList.add(c12);
                        String c13 = bVar.c();
                        Intrinsics.checkNotNullExpressionValue(c13, "getText(...)");
                        arrayList.add(defpackage.a.a(c13));
                    }
                } catch (Exception e11) {
                    exc = e11;
                    cameraScannerSource2 = cameraScannerSource;
                    return new DetectedData(null, null, null, "phone scan error " + exc, null, cameraScannerSource2, CameraScannerType.MLKIT);
                }
            }
            List<String> handle = this.detectedPhoneHandler.handle(arrayList);
            if (arrayList.isEmpty()) {
                return empty;
            }
            cameraScannerSource2 = cameraScannerSource;
            try {
                return new DetectedData(null, null, handle, null, null, cameraScannerSource2, CameraScannerType.MLKIT);
            } catch (Exception e12) {
                e = e12;
                exc = e;
                return new DetectedData(null, null, null, "phone scan error " + exc, null, cameraScannerSource2, CameraScannerType.MLKIT);
            }
        } catch (Exception e13) {
            e = e13;
            cameraScannerSource2 = cameraScannerSource;
        }
    }

    private final DetectedData processQR(C4962a inputImage, CameraScannerSource cameraScannerSource) {
        X8.a aVar;
        Object obj;
        DetectedData empty = DetectedData.INSTANCE.empty(cameraScannerSource, CameraScannerType.MLKIT);
        try {
            List list = (List) Tasks.await(getScanner().N(inputImage));
            if (list != null) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    X8.a aVar2 = (X8.a) obj;
                    if (aVar2.b() != null || aVar2.c() != null) {
                        break;
                    }
                }
                aVar = (X8.a) obj;
            } else {
                aVar = null;
            }
            Integer valueOf = aVar != null ? Integer.valueOf(aVar.a()) : null;
            String c11 = aVar != null ? aVar.c() : null;
            byte[] b11 = aVar != null ? aVar.b() : null;
            if (c11 != null && c11.length() > 0 && b11 != null) {
                if ((!(b11.length == 0)) && valueOf != null) {
                    if (this.cameraScannerMode == CameraScannerMode.QR && QR_CODE_FORMATS.contains(valueOf)) {
                        L80.a.a("SCAN_FLOW", "ML QR text=" + aVar.c() + " raw=" + CameraScannerExtKt.encodeRawBytes(aVar.b()));
                        return new DetectedData(c11, CameraScannerExtKt.encodeRawBytes(b11), null, null, null, cameraScannerSource, CameraScannerType.MLKIT);
                    }
                    if (this.cameraScannerMode == CameraScannerMode.BARCODE && BARCODE_FORMATS.contains(valueOf)) {
                        L80.a.a("SCAN_FLOW", "ML BARCODE text=" + aVar.c() + " raw=" + CameraScannerExtKt.encodeRawBytes(aVar.b()));
                        return new DetectedData(c11, CameraScannerExtKt.encodeRawBytes(b11), null, null, null, cameraScannerSource, CameraScannerType.MLKIT);
                    }
                    if (this.cameraScannerMode == CameraScannerMode.MIX_QR_BARCODE && MIX_MODE_FORMATS.contains(valueOf)) {
                        L80.a.a("SCAN_FLOW", "ML MIX text=" + aVar.c() + " raw=" + CameraScannerExtKt.encodeRawBytes(aVar.b()));
                        return new DetectedData(c11, CameraScannerExtKt.encodeRawBytes(b11), null, null, null, cameraScannerSource, CameraScannerType.MLKIT);
                    }
                }
            }
        } catch (Exception unused) {
        }
        return empty;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final W8.a scanner_delegate$lambda$4(MlkitCameraScanner mlkitCameraScanner) {
        b options = mlkitCameraScanner.getOptions();
        Preconditions.checkNotNull(options, "You must provide a valid BarcodeScannerOptions.");
        return ((f) h.c().a(f.class)).a(options);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC5770b textRecognizer_delegate$lambda$5() {
        return ((p) h.c().a(p.class)).a(C6320a.f62040c);
    }

    @Override // ru.ozon.fintech.features.camera.scanners.api.CameraScanner
    @NotNull
    public DetectedData process(@NotNull Bitmap bitmap, @NotNull CameraScannerSource cameraScannerSource, int rotationDegrees) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(cameraScannerSource, "cameraScannerSource");
        C4962a a11 = C4962a.a(bitmap);
        Intrinsics.checkNotNullExpressionValue(a11, "fromBitmap(...)");
        int i11 = WhenMappings.$EnumSwitchMapping$0[this.cameraScannerMode.ordinal()];
        if (i11 == 1) {
            return processPhone(a11, cameraScannerSource);
        }
        if (i11 == 2 || i11 == 3 || i11 == 4) {
            return processQR(a11, cameraScannerSource);
        }
        if (i11 == 5) {
            return processBankCard(a11, cameraScannerSource);
        }
        throw new o();
    }

    @Override // ru.ozon.fintech.features.camera.scanners.api.CameraScanner
    public void shutdown() {
        CameraScanner.DefaultImpls.shutdown(this);
    }

    @Override // ru.ozon.fintech.features.camera.scanners.api.CameraScanner
    public void warmUp() {
        CameraScanner.DefaultImpls.warmUp(this);
    }
}
