package ru.ozon.app.android.common.disclaimer.customActions;

import android.content.Context;
import gi.C6739a;
import gi.C6740b;
import hi.InterfaceC6958a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.account.di.AccountComponentApi;
import ru.ozon.app.android.account.eventBus.EmailActualizedEventBus;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/account/eventBus/EmailActualizedEventBus;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class ActualizeEmailActionHandler$emailActualizedEventBus$2 extends AbstractC7737t implements Function0<EmailActualizedEventBus> {
    final /* synthetic */ ActualizeEmailActionHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ActualizeEmailActionHandler$emailActualizedEventBus$2(ActualizeEmailActionHandler actualizeEmailActionHandler) {
        super(0);
        this.this$0 = actualizeEmailActionHandler;
    }

    @Override // kotlin.jvm.functions.Function0
    public final EmailActualizedEventBus invoke() {
        Context context;
        context = this.this$0.context;
        if (AccountComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component AccountComponentApi is not DiComponent");
        }
        C6740b dependencyStorage = C6739a.a(context, AccountComponentApi.class).getDependencyStorage();
        if (AccountComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component AccountComponentApi is not DiComponent");
        }
        return ((AccountComponentApi) dependencyStorage.b(AccountComponentApi.class)).getEmailActualizedEventBus();
    }
}
