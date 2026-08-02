package dc0;

import Sc.InterfaceC4008j;
import Vb0.b;
import android.webkit.CookieManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: dc0.G, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
final class C6143G extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C6144H f61479b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C6143G(C6144H c6144h) {
        super(0);
        this.f61479b = c6144h;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        InterfaceC4008j interfaceC4008j;
        try {
            interfaceC4008j = this.f61479b.f61480a;
            CookieManager cookieManager = (CookieManager) interfaceC4008j.getValue();
            if (cookieManager == null) {
                return null;
            }
            cookieManager.flush();
            return Unit.f71690a;
        } catch (Throwable th2) {
            b.a.c(Vb0.b.f28514a, new RuntimeException("Cookie flush Error", th2));
            return Unit.f71690a;
        }
    }
}
