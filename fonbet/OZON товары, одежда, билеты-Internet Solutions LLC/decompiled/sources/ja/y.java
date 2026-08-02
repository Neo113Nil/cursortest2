package ja;

import com.vk.id.group.subscription.compose.ui.GroupSubscriptionSheetState;
import com.vk.id.onetap.compose.onetap.OneTapAnalytics;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes9.dex */
public final /* synthetic */ class y implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f69653a;

    public /* synthetic */ y(int i11) {
        this.f69653a = i11;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit showSheet$lambda$0;
        Unit oneTapPressed$lambda$14;
        switch (this.f69653a) {
            case 0:
                showSheet$lambda$0 = GroupSubscriptionSheetState.showSheet$lambda$0(((Boolean) obj).booleanValue());
                return showSheet$lambda$0;
            default:
                oneTapPressed$lambda$14 = OneTapAnalytics.oneTapPressed$lambda$14((Throwable) obj);
                return oneTapPressed$lambda$14;
        }
    }
}
