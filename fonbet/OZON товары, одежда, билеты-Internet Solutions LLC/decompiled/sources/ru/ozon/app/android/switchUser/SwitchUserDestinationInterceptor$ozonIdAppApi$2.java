package ru.ozon.app.android.switchUser;

import Ob0.a;
import android.content.Context;
import gi.C6739a;
import gi.C6740b;
import hi.InterfaceC6958a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.network.di.NetworkOzonIdComponentApi;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LOb0/a;", "invoke", "()LOb0/a;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes7.dex */
final class SwitchUserDestinationInterceptor$ozonIdAppApi$2 extends AbstractC7737t implements Function0<a> {
    final /* synthetic */ SwitchUserDestinationInterceptor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SwitchUserDestinationInterceptor$ozonIdAppApi$2(SwitchUserDestinationInterceptor switchUserDestinationInterceptor) {
        super(0);
        this.this$0 = switchUserDestinationInterceptor;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final a invoke() {
        Context context;
        context = this.this$0.context;
        if (NetworkOzonIdComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NetworkOzonIdComponentApi is not DiComponent");
        }
        C6740b dependencyStorage = C6739a.a(context, NetworkOzonIdComponentApi.class).getDependencyStorage();
        if (NetworkOzonIdComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NetworkOzonIdComponentApi is not DiComponent");
        }
        return ((NetworkOzonIdComponentApi) dependencyStorage.b(NetworkOzonIdComponentApi.class)).getOzonIdAppApi();
    }
}
