package ru.ozon.fintech.features.camera.domain.scanner.bankcard;

import Sc.InterfaceC4008j;
import Sc.k;
import Sc.n;
import android.graphics.Matrix;
import android.util.Size;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.K;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.features.camera.domain.scanner.MobScannerConfig;
import ru.ozon.fintech.features.camera.domain.scanner.base.FintechBaseImageAnalyzer;
import ru.ozon.fintech.features.camera.scanners.api.CameraScanner;
import ru.ozon.fintech.features.camera.scanners.api.CameraScannerFactory;
import ru.ozon.fintech.features.camera.scanners.api.CameraScannerMode;
import ru.ozon.fintech.features.camera.scanners.api.CameraScannerType;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\nR'\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b8TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lru/ozon/fintech/features/camera/domain/scanner/bankcard/BankCardAnalyzer;", "Lru/ozon/fintech/features/camera/domain/scanner/base/FintechBaseImageAnalyzer;", "LR30/a;", "appCoroutineScopes", "Lru/ozon/fintech/features/camera/domain/scanner/MobScannerConfig;", "mobScannerConfig", "Lru/ozon/fintech/features/camera/scanners/api/CameraScannerFactory;", "cameraScannerFactory", "<init>", "(LR30/a;Lru/ozon/fintech/features/camera/domain/scanner/MobScannerConfig;Lru/ozon/fintech/features/camera/scanners/api/CameraScannerFactory;)V", "Lru/ozon/fintech/features/camera/scanners/api/CameraScannerFactory;", "", "Lru/ozon/fintech/features/camera/scanners/api/CameraScannerType;", "Lru/ozon/fintech/features/camera/scanners/api/CameraScanner;", "scanners$delegate", "LSc/j;", "getScanners", "()Ljava/util/Map;", "scanners", "camera_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BankCardAnalyzer extends FintechBaseImageAnalyzer {

    @NotNull
    private final CameraScannerFactory cameraScannerFactory;

    /* renamed from: scanners$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j scanners;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BankCardAnalyzer(@NotNull R30.a appCoroutineScopes, @NotNull final MobScannerConfig mobScannerConfig, @NotNull CameraScannerFactory cameraScannerFactory) {
        super(appCoroutineScopes, mobScannerConfig);
        Intrinsics.checkNotNullParameter(appCoroutineScopes, "appCoroutineScopes");
        Intrinsics.checkNotNullParameter(mobScannerConfig, "mobScannerConfig");
        Intrinsics.checkNotNullParameter(cameraScannerFactory, "cameraScannerFactory");
        this.cameraScannerFactory = cameraScannerFactory;
        this.scanners = k.a(n.PUBLICATION, new Function0() { // from class: ru.ozon.fintech.features.camera.domain.scanner.bankcard.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Map scanners_delegate$lambda$1;
                scanners_delegate$lambda$1 = BankCardAnalyzer.scanners_delegate$lambda$1(MobScannerConfig.this, this);
                return scanners_delegate$lambda$1;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map scanners_delegate$lambda$1(MobScannerConfig mobScannerConfig, BankCardAnalyzer bankCardAnalyzer) {
        CameraScannerType cameraScannerType;
        CameraScanner provide;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> it = mobScannerConfig.getBankCardScanners().iterator();
        while (it.hasNext()) {
            try {
                String upperCase = ((String) it.next()).toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                cameraScannerType = CameraScannerType.valueOf(upperCase);
            } catch (Exception unused) {
                cameraScannerType = null;
            }
            CameraScannerType cameraScannerType2 = cameraScannerType;
            if (cameraScannerType2 != null && (provide = bankCardAnalyzer.cameraScannerFactory.provide(cameraScannerType2, CameraScannerMode.BANK_CARD, K.f71697a, null, false, 0L)) != null) {
                linkedHashMap.put(cameraScannerType2, provide);
            }
        }
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
}
