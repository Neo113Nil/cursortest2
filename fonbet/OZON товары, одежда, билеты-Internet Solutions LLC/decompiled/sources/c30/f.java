package c30;

import com.vk.id.internal.auth.AuthActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class f implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f56462a;

    public /* synthetic */ f(int i11) {
        this.f56462a = i11;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit onNewIntent$lambda$4;
        switch (this.f56462a) {
            case 0:
                L80.a.b("DeviceIdsProvider", "Error while open mirpay wallet connection " + ((sa0.d) obj).name());
                return Unit.f71690a;
            default:
                onNewIntent$lambda$4 = AuthActivity.onNewIntent$lambda$4((Throwable) obj);
                return onNewIntent$lambda$4;
        }
    }
}
