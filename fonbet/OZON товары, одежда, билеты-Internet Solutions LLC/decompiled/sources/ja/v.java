package ja;

import S0.InterfaceC3978p0;
import com.vk.id.group.subscription.compose.ui.GroupSubscriptionSheetKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ru.ozon.fintech.ui.textatomV20.TextAtomV20WrapperView;

/* loaded from: classes9.dex */
public final /* synthetic */ class v implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f69635a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f69636b;

    public /* synthetic */ v(Object obj, int i11) {
        this.f69635a = i11;
        this.f69636b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit GroupSubscriptionSheet$lambda$26$lambda$25;
        String spanClickListener$lambda$1;
        switch (this.f69635a) {
            case 0:
                GroupSubscriptionSheet$lambda$26$lambda$25 = GroupSubscriptionSheetKt.GroupSubscriptionSheet$lambda$26$lambda$25((InterfaceC3978p0) this.f69636b, ((Boolean) obj).booleanValue());
                return GroupSubscriptionSheet$lambda$26$lambda$25;
            case 1:
                spanClickListener$lambda$1 = TextAtomV20WrapperView.spanClickListener$lambda$1((TextAtomV20WrapperView) this.f69636b, (String) obj);
                return spanClickListener$lambda$1;
            default:
                return z90.e.f0((z90.e) this.f69636b);
        }
    }
}
