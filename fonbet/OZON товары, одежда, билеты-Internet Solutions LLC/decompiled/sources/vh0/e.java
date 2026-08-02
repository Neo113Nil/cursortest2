package vh0;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.push.sdk.external.service.RemoteMessage;

/* loaded from: classes3.dex */
final class e extends AbstractC7737t implements Function1<Object, Boolean> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ AbstractC7737t f102941b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ RemoteMessage f102942c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    e(Function1<Object, Boolean> function1, RemoteMessage remoteMessage) {
        super(1);
        this.f102941b = (AbstractC7737t) function1;
        this.f102942c = remoteMessage;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.t] */
    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(Object obj) {
        boolean z11;
        try {
            z11 = ((Boolean) this.f102941b.invoke(obj)).booleanValue();
        } catch (Throwable th2) {
            Lm0.a.f17149a.e(th2);
            int i11 = sh0.b.f98783c;
            sh0.b.b("OzonPushProcessorInteractor", this.f102942c, th2, null, new d(th2), 8);
            z11 = false;
        }
        return Boolean.valueOf(z11);
    }
}
