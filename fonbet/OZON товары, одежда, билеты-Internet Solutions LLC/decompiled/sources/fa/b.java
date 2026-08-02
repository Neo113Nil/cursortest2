package fa;

import We.E;
import com.vk.id.group.subscription.compose.analytics.GroupSubscriptionAnalytics;
import com.vk.id.internal.di.VKIDDepsProd;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ru.ozon.fintech.features.cbottomscreen.presentation.CbottomScreenFragment;
import v50.j;

/* loaded from: classes9.dex */
public final /* synthetic */ class b implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f63053a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f63054b;

    public /* synthetic */ b(Object obj, int i11) {
        this.f63053a = i11;
        this.f63054b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Unit SheetShown$lambda$1$lambda$0;
        E okHttpClient_delegate$lambda$7;
        switch (this.f63053a) {
            case 0:
                SheetShown$lambda$1$lambda$0 = GroupSubscriptionAnalytics.SheetShown$lambda$1$lambda$0((String) this.f63054b);
                return SheetShown$lambda$1$lambda$0;
            case 1:
                return ((CbottomScreenFragment) this.f63054b).getFactory();
            case 2:
                okHttpClient_delegate$lambda$7 = VKIDDepsProd.okHttpClient_delegate$lambda$7((VKIDDepsProd) this.f63054b);
                return okHttpClient_delegate$lambda$7;
            default:
                return j.d((j) this.f63054b);
        }
    }
}
