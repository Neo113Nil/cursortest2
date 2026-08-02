package ru.ozon.app.android.messenger.initializer;

import Lm0.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.android.messenger.api.b;
import ru.ozon.android.messenger.framework.navigation.action.e;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lru/ozon/android/messenger/framework/navigation/action/e;", "invoke", "()Lru/ozon/android/messenger/framework/navigation/action/e;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes6.dex */
final class MessengerActionHandlerImpl$messengerActionSender$2 extends AbstractC7737t implements Function0<e> {
    final /* synthetic */ MessengerActionHandlerImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MessengerActionHandlerImpl$messengerActionSender$2(MessengerActionHandlerImpl messengerActionHandlerImpl) {
        super(0);
        this.this$0 = messengerActionHandlerImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public final e invoke() {
        String str;
        try {
            b bVar = b.f83914a;
            str = this.this$0.namespace;
            bVar.getClass();
            return b.b(str).b();
        } catch (IllegalStateException e11) {
            a.f17149a.e(e11);
            return null;
        }
    }
}
