package ru.ozon.app.android.common.configurator.dialogSearch;

import A00.a;
import androidx.lifecycle.T;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "kotlin.jvm.PlatformType", "x", "", "invoke", "(Ljava/lang/Object;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes6.dex */
public final class DialogSearchPageLoadConfigurator$firstLoadCompleted$2$invoke$$inlined$filterIsInstance$1 extends AbstractC7737t implements Function1 {
    final /* synthetic */ T $result;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogSearchPageLoadConfigurator$firstLoadCompleted$2$invoke$$inlined$filterIsInstance$1(T t2) {
        super(1);
        this.$result = t2;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m609invoke(obj);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m609invoke(Object obj) {
        if (obj instanceof a.o) {
            this.$result.setValue(obj);
        }
    }
}
