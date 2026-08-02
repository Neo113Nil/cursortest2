package sa;

import com.vk.id.auth.VKIDAuthUiParams;
import com.vk.id.multibranding.OAuthListWidgetAnalytics;
import com.vk.id.onetap.compose.onetap.OneTapKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes9.dex */
public final /* synthetic */ class f implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f98442a;

    public /* synthetic */ f(int i11) {
        this.f98442a = i11;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit onAuthError$lambda$12;
        Unit OneTap$lambda$24$lambda$18$lambda$17;
        switch (this.f98442a) {
            case 0:
                onAuthError$lambda$12 = OAuthListWidgetAnalytics.onAuthError$lambda$12((Throwable) obj);
                return onAuthError$lambda$12;
            default:
                OneTap$lambda$24$lambda$18$lambda$17 = OneTapKt.OneTap$lambda$24$lambda$18$lambda$17((VKIDAuthUiParams.Builder) obj);
                return OneTap$lambda$24$lambda$18$lambda$17;
        }
    }
}
