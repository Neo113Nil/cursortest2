package ru.ozon.app.android.search.widgets.searchResult.header.headerCompose.presentation;

import G.g;
import W10.c;
import WZ.l;
import WZ.t;
import android.app.Activity;
import android.content.Context;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.minifyLink.presentation.MinifyLinkViewModel;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class ShareIconKt$ShareIcon$1$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ Context $context;
    final /* synthetic */ SearchResultHeaderVI $item;
    final /* synthetic */ MinifyLinkViewModel $minifyLinkViewModel;
    final /* synthetic */ l $tokenizedAnalytics;
    final /* synthetic */ c $trackingData;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "shortLink", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.search.widgets.searchResult.header.headerCompose.presentation.ShareIconKt$ShareIcon$1$1$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function1<String, Unit> {
        final /* synthetic */ Context $context;
        final /* synthetic */ SearchResultHeaderVI $item;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(SearchResultHeaderVI searchResultHeaderVI, Context context) {
            super(1);
            this.$item = searchResultHeaderVI;
            this.$context = context;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(String shortLink) {
            Intrinsics.checkNotNullParameter(shortLink, "shortLink");
            String c11 = g.c(this.$item.getShareText(), " ", shortLink);
            Context context = this.$context;
            Intrinsics.g(context, "null cannot be cast to non-null type android.app.Activity");
            ShareIconKt.share((Activity) context, c11);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ShareIconKt$ShareIcon$1$1(SearchResultHeaderVI searchResultHeaderVI, MinifyLinkViewModel minifyLinkViewModel, c cVar, l lVar, Context context) {
        super(0);
        this.$item = searchResultHeaderVI;
        this.$minifyLinkViewModel = minifyLinkViewModel;
        this.$trackingData = cVar;
        this.$tokenizedAnalytics = lVar;
        this.$context = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        t tokenizedEvent = this.$item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processAnyEvents$default(this.$tokenizedAnalytics, tokenizedEvent, null, 2, null);
        }
        this.$minifyLinkViewModel.onClickShare(this.$item.getShareLink(), this.$trackingData, new AnonymousClass2(this.$item, this.$context));
    }
}
