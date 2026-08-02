package q40;

import kotlin.jvm.functions.Function0;
import ru.ozon.fintech.features.camera.scanners.mlkit.MlkitCameraScanner;
import ru.ozon.fintech.features.camera.scanners.mlkit.utils.bankcard.BankCardNumberDetector;

/* renamed from: q40.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C8984a implements Function0 {
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        BankCardNumberDetector bankCardNumberDetector_delegate$lambda$0;
        bankCardNumberDetector_delegate$lambda$0 = MlkitCameraScanner.bankCardNumberDetector_delegate$lambda$0();
        return bankCardNumberDetector_delegate$lambda$0;
    }
}
