package ru.ozon.app.android.composer.universalscreen.view;

import WZ.l;
import WZ.t;
import WZ.x;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l20.C7854a;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "tokenizedTrackingInfo", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class ComposerFragment$ComposeWidgetWrapper$dsViewAnalyticsHandler$1$1 extends AbstractC7737t implements Function1<TokenizedTrackingInfo, Unit> {
    final /* synthetic */ C7854a $item;
    final /* synthetic */ l $tokenizedAnalytics;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ComposerFragment$ComposeWidgetWrapper$dsViewAnalyticsHandler$1$1(C7854a c7854a, l lVar) {
        super(1);
        this.$item = c7854a;
        this.$tokenizedAnalytics = lVar;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(TokenizedTrackingInfo tokenizedTrackingInfo) {
        Intrinsics.checkNotNullParameter(tokenizedTrackingInfo, "tokenizedTrackingInfo");
        t d11 = x.d(U.i(new Pair("view", tokenizedTrackingInfo)), this.$item.c());
        if (d11 != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.$tokenizedAnalytics, d11, null, 2, null);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(TokenizedTrackingInfo tokenizedTrackingInfo) {
        invoke2(tokenizedTrackingInfo);
        return Unit.f71690a;
    }
}
