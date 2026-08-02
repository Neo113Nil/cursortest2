package ru.ozon.app.android.payment.ui.fastPay.linkFastPay;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.composer.ConfiguratorReferences;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "isLoading", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.payment.ui.fastPay.linkFastPay.LinkFastPayConfigurator$onComposerInitialized$2", f = "LinkFastPayConfigurator.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class LinkFastPayConfigurator$onComposerInitialized$2 extends j implements Function2<Boolean, d<? super Unit>, Object> {
    final /* synthetic */ ConfiguratorReferences $references;
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ LinkFastPayConfigurator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LinkFastPayConfigurator$onComposerInitialized$2(LinkFastPayConfigurator linkFastPayConfigurator, ConfiguratorReferences configuratorReferences, d<? super LinkFastPayConfigurator$onComposerInitialized$2> dVar) {
        super(2, dVar);
        this.this$0 = linkFastPayConfigurator;
        this.$references = configuratorReferences;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        LinkFastPayConfigurator$onComposerInitialized$2 linkFastPayConfigurator$onComposerInitialized$2 = new LinkFastPayConfigurator$onComposerInitialized$2(this.this$0, this.$references, dVar);
        linkFastPayConfigurator$onComposerInitialized$2.Z$0 = ((Boolean) obj).booleanValue();
        return linkFastPayConfigurator$onComposerInitialized$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Boolean bool, d<? super Unit> dVar) {
        return invoke(bool.booleanValue(), dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        this.this$0.setLoaderState(this.Z$0, this.$references.getController());
        return Unit.f71690a;
    }

    public final Object invoke(boolean z11, d<? super Unit> dVar) {
        return ((LinkFastPayConfigurator$onComposerInitialized$2) create(Boolean.valueOf(z11), dVar)).invokeSuspend(Unit.f71690a);
    }
}
