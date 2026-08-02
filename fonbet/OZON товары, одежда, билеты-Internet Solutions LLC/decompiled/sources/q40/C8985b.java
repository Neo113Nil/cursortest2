package q40;

import java.util.List;
import kotlin.jvm.functions.Function0;
import ru.ozon.fintech.features.camera.scanners.mlkit.MlkitCameraScanner;
import ru.ozon.fintech.features.camera.ui.tips.TextTipsView;
import ru.ozon.fintech.features.camera.ui.tips.TextTipsView$fadeAnimationListener$2$1;

/* renamed from: q40.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C8985b implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f81622a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f81623b;

    public /* synthetic */ C8985b(Object obj, int i11) {
        this.f81622a = i11;
        this.f81623b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        List barcodeFormatsMLKit_delegate$lambda$2;
        TextTipsView$fadeAnimationListener$2$1 fadeAnimationListener_delegate$lambda$0;
        switch (this.f81622a) {
            case 0:
                barcodeFormatsMLKit_delegate$lambda$2 = MlkitCameraScanner.barcodeFormatsMLKit_delegate$lambda$2((MlkitCameraScanner) this.f81623b);
                return barcodeFormatsMLKit_delegate$lambda$2;
            default:
                fadeAnimationListener_delegate$lambda$0 = TextTipsView.fadeAnimationListener_delegate$lambda$0((TextTipsView) this.f81623b);
                return fadeAnimationListener_delegate$lambda$0;
        }
    }
}
