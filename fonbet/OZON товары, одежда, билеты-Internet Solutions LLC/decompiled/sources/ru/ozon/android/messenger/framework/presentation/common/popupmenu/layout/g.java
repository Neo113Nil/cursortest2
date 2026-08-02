package ru.ozon.android.messenger.framework.presentation.common.popupmenu.layout;

import android.view.ViewGroup;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.framework.presentation.common.popupmenu.layout.c;

/* loaded from: classes10.dex */
final class g extends AbstractC7737t implements Function1<ViewGroup.MarginLayoutParams, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.presentation.common.screenshot.a f90957b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ c.b f90958c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    g(ru.ozon.android.messenger.framework.presentation.common.screenshot.a aVar, c.b bVar) {
        super(1);
        this.f90957b = aVar;
        this.f90958c = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ViewGroup.MarginLayoutParams marginLayoutParams) {
        boolean z11;
        boolean z12;
        int i11;
        ViewGroup.MarginLayoutParams updateMarginLP = marginLayoutParams;
        Intrinsics.checkNotNullParameter(updateMarginLP, "$this$updateMarginLP");
        updateMarginLP.topMargin = this.f90957b.getTop();
        c.b bVar = this.f90958c;
        z11 = bVar.f90942a;
        if (z11) {
            i11 = ru.ozon.android.messenger.utils.e.f91911h;
            updateMarginLP.setMarginEnd(i11);
        } else {
            z12 = bVar.f90943b;
            updateMarginLP.setMarginStart(z12 ? ru.ozon.android.messenger.utils.e.f91916m : ru.ozon.android.messenger.utils.e.f91911h);
        }
        return Unit.f71690a;
    }
}
