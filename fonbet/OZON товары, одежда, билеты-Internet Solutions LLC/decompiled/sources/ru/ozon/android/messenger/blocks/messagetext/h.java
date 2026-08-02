package ru.ozon.android.messenger.blocks.messagetext;

import android.view.ViewGroup;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
final class h extends AbstractC7737t implements Function1<ViewGroup.MarginLayoutParams, Unit> {

    /* renamed from: b, reason: collision with root package name */
    public static final h f85876b = new h(1);

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ViewGroup.MarginLayoutParams marginLayoutParams) {
        ViewGroup.MarginLayoutParams updateMarginLP = marginLayoutParams;
        Intrinsics.checkNotNullParameter(updateMarginLP, "$this$updateMarginLP");
        updateMarginLP.setMarginStart(0);
        return Unit.f71690a;
    }
}
