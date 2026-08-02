package ru.ozon.app.android.fresh.feature.b2b.widgets.legals.addLegalInnMobile.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
/* synthetic */ class AddLegalInnMobileViewHolder$adapter$1 extends C7735q implements Function1<String, Unit> {
    AddLegalInnMobileViewHolder$adapter$1(Object obj) {
        super(1, obj, AddLegalInnMobileViewHolder.class, "onLegalClicked", "onLegalClicked(Ljava/lang/String;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        ((AddLegalInnMobileViewHolder) this.receiver).onLegalClicked(p02);
    }
}
