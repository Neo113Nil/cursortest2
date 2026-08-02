package ru.ozon.android.messenger.blocks.messagetext;

import android.view.View;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.framework.presentation.common.view.timestatus.TimeStatusView;

/* loaded from: classes10.dex */
final class p extends AbstractC7737t implements Function0<TimeStatusView> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ TextViewWithSlaveLayout f85896b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    p(TextViewWithSlaveLayout textViewWithSlaveLayout) {
        super(0);
        this.f85896b = textViewWithSlaveLayout;
    }

    @Override // kotlin.jvm.functions.Function0
    public final TimeStatusView invoke() {
        View childAt = this.f85896b.getChildAt(1);
        Intrinsics.g(childAt, "null cannot be cast to non-null type ru.ozon.android.messenger.framework.presentation.common.view.timestatus.TimeStatusView");
        return (TimeStatusView) childAt;
    }
}
