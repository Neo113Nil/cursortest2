package ru.ozon.app.android.utils.livedata;

import androidx.lifecycle.P;
import androidx.lifecycle.T;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* JADX INFO: Add missing generic type declarations: [T] */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "T", "it", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Object;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class LiveDataOperatorsKt$first$1<T> extends AbstractC7737t implements Function1<T, Unit> {
    final /* synthetic */ T<T> $mediator;
    final /* synthetic */ P<T> $this_first;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LiveDataOperatorsKt$first$1(T<T> t2, P<T> p11) {
        super(1);
        this.$mediator = t2;
        this.$this_first = p11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
        invoke2((LiveDataOperatorsKt$first$1<T>) obj);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(T t2) {
        this.$mediator.setValue(t2);
        this.$mediator.b(this.$this_first);
    }
}
