package ru.ozon.app.android.storage.debug;

import android.content.Context;
import gi.C6739a;
import gi.C6740b;
import hi.InterfaceC6958a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import pf0.InterfaceC8918a;
import pf0.h;
import ru.ozon.app.android.limb.Limb2ComponentApi;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lpf0/a;", "invoke", "()Lpf0/a;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes7.dex */
final class DebugToolsServiceImpl$extraHeadersRepository$2 extends AbstractC7737t implements Function0<InterfaceC8918a> {
    final /* synthetic */ DebugToolsServiceImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DebugToolsServiceImpl$extraHeadersRepository$2(DebugToolsServiceImpl debugToolsServiceImpl) {
        super(0);
        this.this$0 = debugToolsServiceImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public final InterfaceC8918a invoke() {
        Context context;
        context = this.this$0.context;
        if (Limb2ComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component Limb2ComponentApi is not DiComponent");
        }
        C6740b dependencyStorage = C6739a.a(context, Limb2ComponentApi.class).getDependencyStorage();
        if (Limb2ComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component Limb2ComponentApi is not DiComponent");
        }
        return ((h) ((Limb2ComponentApi) dependencyStorage.b(Limb2ComponentApi.class)).getOzonLimbDiStore().e(h.class)).x();
    }
}
