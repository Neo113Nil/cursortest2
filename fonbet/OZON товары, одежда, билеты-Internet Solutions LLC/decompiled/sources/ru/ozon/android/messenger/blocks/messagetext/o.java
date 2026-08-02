package ru.ozon.android.messenger.blocks.messagetext;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
final class o extends AbstractC7737t implements Function0<AppCompatTextView> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ TextViewWithSlaveLayout f85895b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    o(TextViewWithSlaveLayout textViewWithSlaveLayout) {
        super(0);
        this.f85895b = textViewWithSlaveLayout;
    }

    @Override // kotlin.jvm.functions.Function0
    public final AppCompatTextView invoke() {
        View childAt = this.f85895b.getChildAt(0);
        Intrinsics.g(childAt, "null cannot be cast to non-null type androidx.appcompat.widget.AppCompatTextView");
        return (AppCompatTextView) childAt;
    }
}
