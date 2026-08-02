package ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.searchsheet;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
/* synthetic */ class SearchSheetViewModelImpl$bindInitial$3 extends C7735q implements Function1<List<? extends SuggestVO>, Unit> {
    SearchSheetViewModelImpl$bindInitial$3(Object obj) {
        super(1, obj, SearchSheetViewModelImpl.class, "updateList", "updateList(Ljava/util/List;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(List<? extends SuggestVO> list) {
        invoke2((List<SuggestVO>) list);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(List<SuggestVO> p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        ((SearchSheetViewModelImpl) this.receiver).updateList(p02);
    }
}
