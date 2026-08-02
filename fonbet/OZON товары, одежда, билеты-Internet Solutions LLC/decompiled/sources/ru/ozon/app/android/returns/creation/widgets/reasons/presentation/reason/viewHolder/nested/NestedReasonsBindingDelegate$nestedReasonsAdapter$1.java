package ru.ozon.app.android.returns.creation.widgets.reasons.presentation.reason.viewHolder.nested;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
/* synthetic */ class NestedReasonsBindingDelegate$nestedReasonsAdapter$1 extends C7735q implements Function2<Long, String, Unit> {
    NestedReasonsBindingDelegate$nestedReasonsAdapter$1(Object obj) {
        super(2, obj, NestedReasonsBindingDelegate.class, "onUpdateComment", "onUpdateComment(JLjava/lang/String;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Long l11, String str) {
        invoke(l11.longValue(), str);
        return Unit.f71690a;
    }

    public final void invoke(long j11, String p12) {
        Intrinsics.checkNotNullParameter(p12, "p1");
        ((NestedReasonsBindingDelegate) this.receiver).onUpdateComment(j11, p12);
    }
}
