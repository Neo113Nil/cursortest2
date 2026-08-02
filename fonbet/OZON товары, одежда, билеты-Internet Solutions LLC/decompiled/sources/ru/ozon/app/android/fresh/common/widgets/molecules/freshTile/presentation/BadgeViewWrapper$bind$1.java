package ru.ozon.app.android.fresh.common.widgets.molecules.freshTile.presentation;

import android.graphics.drawable.GradientDrawable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroid/graphics/drawable/GradientDrawable;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class BadgeViewWrapper$bind$1 extends AbstractC7737t implements Function1<GradientDrawable, Unit> {
    public static final BadgeViewWrapper$bind$1 INSTANCE = new BadgeViewWrapper$bind$1();

    BadgeViewWrapper$bind$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(GradientDrawable gradientDrawable) {
        invoke2(gradientDrawable);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(GradientDrawable updateDrawableBackground) {
        Intrinsics.checkNotNullParameter(updateDrawableBackground, "$this$updateDrawableBackground");
        updateDrawableBackground.setCornerRadius(100.0f);
    }
}
