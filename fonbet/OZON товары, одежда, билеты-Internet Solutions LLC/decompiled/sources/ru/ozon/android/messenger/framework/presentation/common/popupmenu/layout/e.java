package ru.ozon.android.messenger.framework.presentation.common.popupmenu.layout;

import android.view.ViewGroup;
import android.widget.LinearLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.framework.presentation.common.popupmenu.layout.c;

/* loaded from: classes10.dex */
final class e extends AbstractC7737t implements Function1<ViewGroup.MarginLayoutParams, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ c.a f90950b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.presentation.common.screenshot.a f90951c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ LinearLayout f90952d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    e(c.a aVar, ru.ozon.android.messenger.framework.presentation.common.screenshot.a aVar2, LinearLayout linearLayout) {
        super(1);
        this.f90950b = aVar;
        this.f90951c = aVar2;
        this.f90952d = linearLayout;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ViewGroup.MarginLayoutParams marginLayoutParams) {
        boolean z11;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        int i11;
        int i12;
        boolean z12;
        int i13;
        int i14;
        int i15;
        ViewGroup.MarginLayoutParams updateMarginLP = marginLayoutParams;
        Intrinsics.checkNotNullParameter(updateMarginLP, "$this$updateMarginLP");
        c.a aVar = this.f90950b;
        z11 = aVar.f90935a;
        LinearLayout linearLayout = this.f90952d;
        ru.ozon.android.messenger.framework.presentation.common.screenshot.a aVar2 = this.f90951c;
        if (z11) {
            ViewGroup.LayoutParams layoutParams = aVar2.getLayoutParams();
            marginLayoutParams2 = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            int height = (marginLayoutParams2 != null ? marginLayoutParams2.topMargin : 0) - linearLayout.getHeight();
            i15 = ru.ozon.android.messenger.utils.e.f91908e;
            i12 = height - i15;
        } else {
            ViewGroup.LayoutParams layoutParams2 = aVar2.getLayoutParams();
            marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
            int height2 = aVar2.getHeight() + (marginLayoutParams2 != null ? marginLayoutParams2.topMargin : 0);
            i11 = ru.ozon.android.messenger.utils.e.f91908e;
            i12 = i11 + height2;
        }
        updateMarginLP.topMargin = i12;
        z12 = aVar.f90936b;
        if (z12) {
            ViewGroup.LayoutParams layoutParams3 = aVar2.getLayoutParams();
            i14 = (aVar2.getWidth() + (layoutParams3 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams3).getMarginStart() : 0)) - linearLayout.getWidth();
        } else {
            ViewGroup.LayoutParams layoutParams4 = aVar2.getLayoutParams();
            int marginStart = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams4).getMarginStart() : 0;
            i13 = aVar.f90937c;
            i14 = i13 + marginStart;
        }
        updateMarginLP.setMarginStart(i14);
        return Unit.f71690a;
    }
}
