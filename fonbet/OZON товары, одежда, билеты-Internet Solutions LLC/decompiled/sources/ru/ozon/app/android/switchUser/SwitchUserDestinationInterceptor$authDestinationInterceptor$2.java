package ru.ozon.app.android.switchUser;

import android.content.Context;
import gi.C6739a;
import gi.C6740b;
import hi.InterfaceC6958a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.navigation.interceptors.AuthDestinationInterceptor;
import ru.ozon.app.android.switchUser.di.SwitchUserDependencies;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/navigation/interceptors/AuthDestinationInterceptor;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class SwitchUserDestinationInterceptor$authDestinationInterceptor$2 extends AbstractC7737t implements Function0<AuthDestinationInterceptor> {
    final /* synthetic */ SwitchUserDestinationInterceptor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SwitchUserDestinationInterceptor$authDestinationInterceptor$2(SwitchUserDestinationInterceptor switchUserDestinationInterceptor) {
        super(0);
        this.this$0 = switchUserDestinationInterceptor;
    }

    @Override // kotlin.jvm.functions.Function0
    public final AuthDestinationInterceptor invoke() {
        Context context;
        context = this.this$0.context;
        if (SwitchUserDependencies.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component SwitchUserDependencies is not DiComponent");
        }
        C6740b dependencyStorage = C6739a.a(context, SwitchUserDependencies.class).getDependencyStorage();
        if (SwitchUserDependencies.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component SwitchUserDependencies is not DiComponent");
        }
        return ((SwitchUserDependencies) dependencyStorage.b(SwitchUserDependencies.class)).getAuthDestinationInterceptor();
    }
}
