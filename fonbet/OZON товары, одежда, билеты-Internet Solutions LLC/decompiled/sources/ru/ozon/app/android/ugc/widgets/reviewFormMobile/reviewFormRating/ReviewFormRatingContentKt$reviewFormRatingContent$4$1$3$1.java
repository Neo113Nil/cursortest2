package ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormRating;

import UZ.d;
import WZ.e;
import WZ.g;
import WZ.l;
import WZ.t;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.composer.compose.widget.i;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "ratingValue", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ReviewFormRatingContentKt$reviewFormRatingContent$4$1$3$1 extends AbstractC7737t implements Function1<Float, Unit> {
    final /* synthetic */ InterfaceC7851b $controller;
    final /* synthetic */ i<ReviewFormRatingVO> $this_content;
    final /* synthetic */ l $tokenizedAnalytics;
    final /* synthetic */ Function2<String, Float, Unit> $updateRating;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ReviewFormRatingContentKt$reviewFormRatingContent$4$1$3$1(i<ReviewFormRatingVO> iVar, Function2<? super String, ? super Float, Unit> function2, InterfaceC7851b interfaceC7851b, l lVar) {
        super(1);
        this.$this_content = iVar;
        this.$updateRating = function2;
        this.$controller = interfaceC7851b;
        this.$tokenizedAnalytics = lVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g invoke$lambda$1$lambda$0(float f7, UZ.a aVar, g params) {
        Intrinsics.checkNotNullParameter(aVar, "<unused var>");
        Intrinsics.checkNotNullParameter(params, "params");
        return g.a(params, U.i(new Pair("properties_rating", Float.valueOf(f7))), null, 2);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Float f7) {
        invoke(f7.floatValue());
        return Unit.f71690a;
    }

    public final void invoke(final float f7) {
        t ratingTokenizedEvent = this.$this_content.b().getRatingTokenizedEvent();
        if (ratingTokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processClickEvents(this.$tokenizedAnalytics, ratingTokenizedEvent, new e() { // from class: ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormRating.a
                @Override // WZ.e
                public final g modifyParams(UZ.a aVar, g gVar) {
                    g invoke$lambda$1$lambda$0;
                    invoke$lambda$1$lambda$0 = ReviewFormRatingContentKt$reviewFormRatingContent$4$1$3$1.invoke$lambda$1$lambda$0(f7, (d) aVar, gVar);
                    return invoke$lambda$1$lambda$0;
                }
            });
        }
        this.$updateRating.invoke(this.$this_content.b().getUploadKey(), Float.valueOf(f7));
        this.$controller.update(new ProductRateUpdate(f7));
    }
}
