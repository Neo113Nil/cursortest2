package k70;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import n70.EnumC8449a;
import ru.ozon.fintech.features.camera.scanners.mlkit.MlkitCameraScanner;

/* renamed from: k70.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C7603d implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f71051a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f71052b;

    public /* synthetic */ C7603d(Object obj, int i11) {
        this.f71051a = i11;
        this.f71052b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        W8.b options_delegate$lambda$3;
        switch (this.f71051a) {
            case 0:
                ((ru.ozon.fintech.features.offline.presentation.select.a) this.f71052b).M0(EnumC8449a.TRANSFER_WITHOUT_INTERNET);
                return Unit.f71690a;
            default:
                options_delegate$lambda$3 = MlkitCameraScanner.options_delegate$lambda$3((MlkitCameraScanner) this.f71052b);
                return options_delegate$lambda$3;
        }
    }
}
