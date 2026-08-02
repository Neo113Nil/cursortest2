package ru.ozon.android.messenger.framework.presentation.common.view.timestatus;

import android.view.ViewGroup;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
final class h extends AbstractC7737t implements Function1<ViewGroup.MarginLayoutParams, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ boolean f91306b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ TimeStatusView f91307c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    h(boolean z11, TimeStatusView timeStatusView) {
        super(1);
        this.f91306b = z11;
        this.f91307c = timeStatusView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ViewGroup.MarginLayoutParams marginLayoutParams) {
        ViewGroup.MarginLayoutParams updateMarginLP = marginLayoutParams;
        Intrinsics.checkNotNullParameter(updateMarginLP, "$this$updateMarginLP");
        boolean z11 = this.f91306b;
        this.f91307c.getClass();
        updateMarginLP.rightMargin = z11 ? ru.ozon.android.messenger.utils.e.f91907d : ru.ozon.android.messenger.utils.e.f91905b;
        return Unit.f71690a;
    }
}
