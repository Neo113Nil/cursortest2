package na;

import android.view.View;
import com.vk.id.internal.auth.AuthActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.fintech.ui.utils.CbottomExtKt;

/* loaded from: classes9.dex */
public final /* synthetic */ class d implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f76713a;

    public /* synthetic */ d(int i11) {
        this.f76713a = i11;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit onSaveInstanceState$lambda$10;
        int applyCbottomBackground$lambda$5;
        switch (this.f76713a) {
            case 0:
                onSaveInstanceState$lambda$10 = AuthActivity.onSaveInstanceState$lambda$10((Throwable) obj);
                return onSaveInstanceState$lambda$10;
            case 1:
                applyCbottomBackground$lambda$5 = CbottomExtKt.applyCbottomBackground$lambda$5((Integer) obj);
                return Integer.valueOf(applyCbottomBackground$lambda$5);
            default:
                View it = (View) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return Unit.f71690a;
        }
    }
}
