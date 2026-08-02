package na;

import android.view.View;
import com.vk.id.internal.auth.AuthActivity;
import com.vk.id.onetap.compose.onetap.OneTapAnalytics;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: na.b, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final /* synthetic */ class C8479b implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f76710a;

    public /* synthetic */ C8479b(int i11) {
        this.f76710a = i11;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit onCreate$lambda$2;
        Unit userNotFound$lambda$4;
        switch (this.f76710a) {
            case 0:
                onCreate$lambda$2 = AuthActivity.onCreate$lambda$2((Throwable) obj);
                return onCreate$lambda$2;
            case 1:
                Intrinsics.checkNotNullParameter((View) obj, "<unused var>");
                return Unit.f71690a;
            default:
                userNotFound$lambda$4 = OneTapAnalytics.userNotFound$lambda$4((Throwable) obj);
                return userNotFound$lambda$4;
        }
    }
}
