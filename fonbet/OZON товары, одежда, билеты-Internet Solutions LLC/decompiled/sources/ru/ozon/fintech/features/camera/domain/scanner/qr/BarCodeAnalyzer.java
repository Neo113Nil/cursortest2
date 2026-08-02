package ru.ozon.fintech.features.camera.domain.scanner.qr;

import Sc.InterfaceC4008j;
import Sc.k;
import Sc.n;
import android.graphics.Matrix;
import android.os.Build;
import android.util.Size;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.K;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.features.camera.domain.scanner.MobScannerConfig;
import ru.ozon.fintech.features.camera.domain.scanner.base.FintechBaseImageAnalyzer;
import ru.ozon.fintech.features.camera.scanners.api.CameraScanner;
import ru.ozon.fintech.features.camera.scanners.api.CameraScannerFactory;
import ru.ozon.fintech.features.camera.scanners.api.CameraScannerMode;
import ru.ozon.fintech.features.camera.scanners.api.CameraScannerType;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010R\u001c\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0011R'\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u00128TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lru/ozon/fintech/features/camera/domain/scanner/qr/BarCodeAnalyzer;", "Lru/ozon/fintech/features/camera/domain/scanner/base/FintechBaseImageAnalyzer;", "Lru/ozon/fintech/features/camera/scanners/api/CameraScannerMode;", "cameraScannerMode", "Lru/ozon/fintech/features/camera/scanners/api/CameraScannerFactory;", "cameraScannerFactory", "", "", "barcodeFormats", "LR30/a;", "appCoroutineScopes", "Lru/ozon/fintech/features/camera/domain/scanner/MobScannerConfig;", "mobScannerConfig", "<init>", "(Lru/ozon/fintech/features/camera/scanners/api/CameraScannerMode;Lru/ozon/fintech/features/camera/scanners/api/CameraScannerFactory;Ljava/util/List;LR30/a;Lru/ozon/fintech/features/camera/domain/scanner/MobScannerConfig;)V", "Lru/ozon/fintech/features/camera/scanners/api/CameraScannerMode;", "Lru/ozon/fintech/features/camera/scanners/api/CameraScannerFactory;", "Ljava/util/List;", "", "Lru/ozon/fintech/features/camera/scanners/api/CameraScannerType;", "Lru/ozon/fintech/features/camera/scanners/api/CameraScanner;", "scanners$delegate", "LSc/j;", "getScanners", "()Ljava/util/Map;", "scanners", "camera_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BarCodeAnalyzer extends FintechBaseImageAnalyzer {
    private final List<String> barcodeFormats;

    @NotNull
    private final CameraScannerFactory cameraScannerFactory;

    @NotNull
    private final CameraScannerMode cameraScannerMode;

    /* renamed from: scanners$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j scanners;

    public /* synthetic */ BarCodeAnalyzer(CameraScannerMode cameraScannerMode, CameraScannerFactory cameraScannerFactory, List list, R30.a aVar, MobScannerConfig mobScannerConfig, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? CameraScannerMode.QR : cameraScannerMode, cameraScannerFactory, list, aVar, mobScannerConfig);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map scanners_delegate$lambda$1(MobScannerConfig mobScannerConfig, BarCodeAnalyzer barCodeAnalyzer) {
        CameraScannerType cameraScannerType;
        List<String> disabledSalute;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> it = mobScannerConfig.getQrScanners().iterator();
        while (it.hasNext()) {
            try {
                String upperCase = ((String) it.next()).toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                cameraScannerType = CameraScannerType.valueOf(upperCase);
            } catch (Exception unused) {
                cameraScannerType = null;
            }
            CameraScannerType cameraScannerType2 = cameraScannerType;
            if (cameraScannerType2 != null) {
                if (cameraScannerType2 == CameraScannerType.SALUTE) {
                    String MODEL = Build.MODEL;
                    Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
                    if (MODEL.length() > 0 && (disabledSalute = mobScannerConfig.getDisabledSalute()) != null && (!disabledSalute.isEmpty()) && mobScannerConfig.getDisabledSalute().contains(MODEL)) {
                    }
                }
                CameraScannerFactory cameraScannerFactory = barCodeAnalyzer.cameraScannerFactory;
                CameraScannerMode cameraScannerMode = barCodeAnalyzer.cameraScannerMode;
                List<String> list = barCodeAnalyzer.barcodeFormats;
                if (list == null) {
                    list = K.f71697a;
                }
                CameraScanner provide = cameraScannerFactory.provide(cameraScannerType2, cameraScannerMode, list, null, mobScannerConfig.getSeparateSaluteProcess(), mobScannerConfig.getSeparateProcessTimeout());
                if (provide != null) {
                    linkedHashMap.put(cameraScannerType2, provide);
                }
            }
        }
        L80.a.a("SCAN_FLOW", "init scanners (size: " + linkedHashMap.size() + ")");
        return linkedHashMap;
    }

    @Override // ru.ozon.fintech.features.camera.domain.scanner.base.FintechBaseImageAnalyzer, androidx.camera.core.h.a
    public /* bridge */ /* synthetic */ Size getDefaultTargetResolution() {
        return null;
    }

    @Override // ru.ozon.fintech.features.camera.domain.scanner.base.FintechBaseImageAnalyzer
    @NotNull
    protected Map<CameraScannerType, CameraScanner> getScanners() {
        return (Map) this.scanners.getValue();
    }

    @Override // ru.ozon.fintech.features.camera.domain.scanner.base.FintechBaseImageAnalyzer
    public /* bridge */ /* synthetic */ int getTargetCoordinateSystem() {
        return 0;
    }

    @Override // ru.ozon.fintech.features.camera.domain.scanner.base.FintechBaseImageAnalyzer
    public /* bridge */ /* synthetic */ void updateTransform(Matrix matrix) {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BarCodeAnalyzer(@NotNull CameraScannerMode cameraScannerMode, @NotNull CameraScannerFactory cameraScannerFactory, List<String> list, @NotNull R30.a appCoroutineScopes, @NotNull final MobScannerConfig mobScannerConfig) {
        super(appCoroutineScopes, mobScannerConfig);
        Intrinsics.checkNotNullParameter(cameraScannerMode, "cameraScannerMode");
        Intrinsics.checkNotNullParameter(cameraScannerFactory, "cameraScannerFactory");
        Intrinsics.checkNotNullParameter(appCoroutineScopes, "appCoroutineScopes");
        Intrinsics.checkNotNullParameter(mobScannerConfig, "mobScannerConfig");
        this.cameraScannerMode = cameraScannerMode;
        this.cameraScannerFactory = cameraScannerFactory;
        this.barcodeFormats = list;
        this.scanners = k.a(n.PUBLICATION, new Function0() { // from class: ru.ozon.fintech.features.camera.domain.scanner.qr.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Map scanners_delegate$lambda$1;
                scanners_delegate$lambda$1 = BarCodeAnalyzer.scanners_delegate$lambda$1(MobScannerConfig.this, this);
                return scanners_delegate$lambda$1;
            }
        });
    }
}
