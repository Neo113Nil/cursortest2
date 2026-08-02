package ru.ozon.uni.android.ds.compose.modifier;

import D1.C2805i;
import androidx.lifecycle.J;
import e3.r;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.M;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class DSTrackViewAnalyticsNode$onObservedReadsChanged$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ M<J> $newLifecycleOwner;
    final /* synthetic */ DSTrackViewAnalyticsNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DSTrackViewAnalyticsNode$onObservedReadsChanged$1(M<J> m11, DSTrackViewAnalyticsNode dSTrackViewAnalyticsNode) {
        super(0);
        this.$newLifecycleOwner = m11;
        this.this$0 = dSTrackViewAnalyticsNode;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.Object] */
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$newLifecycleOwner.f71787a = C2805i.a(this.this$0, r.a());
        DSTrackViewAnalyticsNode dSTrackViewAnalyticsNode = this.this$0;
        dSTrackViewAnalyticsNode.callback = (Function1) C2805i.a(dSTrackViewAnalyticsNode, AnalyticsModifierKt.getLocalDSViewAnalyticsProvider());
    }
}
