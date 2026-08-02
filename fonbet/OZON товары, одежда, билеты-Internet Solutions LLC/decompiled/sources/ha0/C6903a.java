package ha0;

import S0.InterfaceC3978p0;
import com.vk.id.group.subscription.compose.ui.GroupSubscriptionSheetKt;
import com.vk.id.group.subscription.compose.ui.GroupSubscriptionSheetStatus;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ru.ozon.fintech.ui.labelV20.LabelV20WrapperView;
import z90.e;

/* renamed from: ha0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C6903a implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f65269a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f65270b;

    public /* synthetic */ C6903a(Object obj, int i11) {
        this.f65269a = i11;
        this.f65270b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String spanClickListener$lambda$1;
        Unit GroupSubscriptionSheet$lambda$24$lambda$23;
        switch (this.f65269a) {
            case 0:
                spanClickListener$lambda$1 = LabelV20WrapperView.spanClickListener$lambda$1((LabelV20WrapperView) this.f65270b, (String) obj);
                return spanClickListener$lambda$1;
            case 1:
                GroupSubscriptionSheet$lambda$24$lambda$23 = GroupSubscriptionSheetKt.GroupSubscriptionSheet$lambda$24$lambda$23((InterfaceC3978p0) this.f65270b, (GroupSubscriptionSheetStatus) obj);
                return GroupSubscriptionSheet$lambda$24$lambda$23;
            default:
                return e.i0((e) this.f65270b);
        }
    }
}
