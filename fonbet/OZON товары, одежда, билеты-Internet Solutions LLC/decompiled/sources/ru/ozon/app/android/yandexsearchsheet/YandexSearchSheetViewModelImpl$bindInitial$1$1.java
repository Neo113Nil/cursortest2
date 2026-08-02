package ru.ozon.app.android.yandexsearchsheet;

import He0.a;
import Sc.r;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
/* synthetic */ class YandexSearchSheetViewModelImpl$bindInitial$1$1 extends C7735q implements Function1<r<? extends List<? extends a>>, Unit> {
    YandexSearchSheetViewModelImpl$bindInitial$1$1(Object obj) {
        super(1, obj, YandexSearchSheetViewModelImpl.class, "updateSuggestions", "updateSuggestions(Lkotlin/Result;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(r<? extends List<? extends a>> rVar) {
        invoke2((r<? extends List<a>>) rVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(r<? extends List<a>> rVar) {
        ((YandexSearchSheetViewModelImpl) this.receiver).updateSuggestions(rVar);
    }
}
