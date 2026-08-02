package ru.ozon.app.android.initializers.inappupdate;

import Ld0.c;
import ei0.InterfaceC6369b;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LLd0/c;", "<unused var>", "Lei0/b;", "invoke", "(LLd0/c;)Lei0/b;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes6.dex */
final class OzonInAppUpdateInitializer$init$1$1 extends AbstractC7737t implements Function1<c, InterfaceC6369b> {
    final /* synthetic */ OzonInAppUpdateInitializer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OzonInAppUpdateInitializer$init$1$1(OzonInAppUpdateInitializer ozonInAppUpdateInitializer) {
        super(1);
        this.this$0 = ozonInAppUpdateInitializer;
    }

    @Override // kotlin.jvm.functions.Function1
    public final InterfaceC6369b invoke(c cVar) {
        InterfaceC6369b interfaceC6369b;
        Intrinsics.checkNotNullParameter(cVar, "<unused var>");
        interfaceC6369b = this.this$0.ozonTracker;
        return interfaceC6369b;
    }
}
