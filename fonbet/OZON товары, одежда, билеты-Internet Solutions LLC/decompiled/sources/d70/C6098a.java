package d70;

import com.vk.id.group.subscription.common.fail.VKIDGroupSubscriptionFail;
import com.vk.id.group.subscription.compose.ui.GroupSubscriptionSheetKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.fintech.features.offline.data.model.transfer.BankInfo;

/* renamed from: d70.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C6098a implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f61214a;

    public /* synthetic */ C6098a(int i11) {
        this.f61214a = i11;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit GroupSubscriptionSheet$lambda$3$lambda$2;
        switch (this.f61214a) {
            case 0:
                BankInfo it = (BankInfo) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(Intrinsics.d(it.getId(), "100000000273"));
            default:
                GroupSubscriptionSheet$lambda$3$lambda$2 = GroupSubscriptionSheetKt.GroupSubscriptionSheet$lambda$3$lambda$2((VKIDGroupSubscriptionFail) obj);
                return GroupSubscriptionSheet$lambda$3$lambda$2;
        }
    }
}
