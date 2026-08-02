package ru.ozon.app.android.fresh.feature.b2b.widgets.faq.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.fresh.feature.b2b.widgets.faq.data.FaqAnswerExpandedInfo;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
/* synthetic */ class FaqViewHolder$itemsAdapter$1 extends C7735q implements Function1<FaqAnswerExpandedInfo, Unit> {
    FaqViewHolder$itemsAdapter$1(Object obj) {
        super(1, obj, FaqViewModel.class, "updateFaqExpandedInfoList", "updateFaqExpandedInfoList(Lru/ozon/app/android/fresh/feature/b2b/widgets/faq/data/FaqAnswerExpandedInfo;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(FaqAnswerExpandedInfo faqAnswerExpandedInfo) {
        invoke2(faqAnswerExpandedInfo);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(FaqAnswerExpandedInfo p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        ((FaqViewModel) this.receiver).updateFaqExpandedInfoList(p02);
    }
}
