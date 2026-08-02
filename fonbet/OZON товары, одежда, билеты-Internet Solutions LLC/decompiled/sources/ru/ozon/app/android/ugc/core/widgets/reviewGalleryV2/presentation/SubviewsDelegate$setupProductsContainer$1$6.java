package ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation;

import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
/* synthetic */ class SubviewsDelegate$setupProductsContainer$1$6 extends C7735q implements Function1<View, Unit> {
    public static final SubviewsDelegate$setupProductsContainer$1$6 INSTANCE = new SubviewsDelegate$setupProductsContainer$1$6();

    SubviewsDelegate$setupProductsContainer$1$6() {
        super(1, ViewExtKt.class, "gone", "gone(Landroid/view/View;)V", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(View view) {
        invoke2(view);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(View p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        ViewExtKt.gone(p02);
    }
}
