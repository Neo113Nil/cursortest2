package k60;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ru.ozon.fintech.features.camera.scanners.salute.SaluteCameraScanner;

/* loaded from: classes3.dex */
public final /* synthetic */ class d implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f70941a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f70942b;

    public /* synthetic */ d(Object obj, int i11) {
        this.f70941a = i11;
        this.f70942b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit shutdown$lambda$3;
        switch (this.f70941a) {
            case 0:
                return g.h((g) this.f70942b, (sa0.d) obj);
            case 1:
                shutdown$lambda$3 = SaluteCameraScanner.shutdown$lambda$3((SaluteCameraScanner) this.f70942b, (Throwable) obj);
                return shutdown$lambda$3;
            default:
                return z90.e.g0((z90.e) this.f70942b);
        }
    }
}
