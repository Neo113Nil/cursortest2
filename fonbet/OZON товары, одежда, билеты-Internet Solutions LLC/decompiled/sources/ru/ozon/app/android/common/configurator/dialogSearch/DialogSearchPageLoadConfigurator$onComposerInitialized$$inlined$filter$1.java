package ru.ozon.app.android.common.configurator.dialogSearch;

import L00.j;
import androidx.lifecycle.T;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "kotlin.jvm.PlatformType", "x", "", "invoke", "(Ljava/lang/Object;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes6.dex */
public final class DialogSearchPageLoadConfigurator$onComposerInitialized$$inlined$filter$1 extends AbstractC7737t implements Function1<j, Unit> {
    final /* synthetic */ T $result;
    final /* synthetic */ DialogSearchPageLoadConfigurator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogSearchPageLoadConfigurator$onComposerInitialized$$inlined$filter$1(T t2, DialogSearchPageLoadConfigurator dialogSearchPageLoadConfigurator) {
        super(1);
        this.$result = t2;
        this.this$0 = dialogSearchPageLoadConfigurator;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(j jVar) {
        m610invoke(jVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m610invoke(j jVar) {
        boolean isDialogSearchPage;
        isDialogSearchPage = this.this$0.isDialogSearchPage(jVar);
        if (isDialogSearchPage) {
            this.$result.setValue(jVar);
        }
    }
}
