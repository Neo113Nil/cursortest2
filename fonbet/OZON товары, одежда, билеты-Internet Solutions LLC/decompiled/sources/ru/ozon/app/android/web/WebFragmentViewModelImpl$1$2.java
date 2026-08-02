package ru.ozon.app.android.web;

import androidx.lifecycle.T;
import androidx.lifecycle.V;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.text.h;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class WebFragmentViewModelImpl$1$2 extends AbstractC7737t implements Function1<String, Unit> {
    final /* synthetic */ T<String> $this_apply;
    final /* synthetic */ WebFragmentViewModelImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WebFragmentViewModelImpl$1$2(T<String> t2, WebFragmentViewModelImpl webFragmentViewModelImpl) {
        super(1);
        this.$this_apply = t2;
        this.this$0 = webFragmentViewModelImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.f71690a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        V v11;
        T<String> t2 = this.$this_apply;
        if (str == null || h.K(str)) {
            v11 = this.this$0.defaultToolbarTitle;
            str = (String) v11.getValue();
        }
        t2.setValue(str);
    }
}
