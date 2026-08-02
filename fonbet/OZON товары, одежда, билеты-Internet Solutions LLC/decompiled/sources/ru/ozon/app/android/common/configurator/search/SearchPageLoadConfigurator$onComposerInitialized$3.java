package ru.ozon.app.android.common.configurator.search;

import L00.j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
/* synthetic */ class SearchPageLoadConfigurator$onComposerInitialized$3 extends C7735q implements Function1<j, Unit> {
    SearchPageLoadConfigurator$onComposerInitialized$3(Object obj) {
        super(1, obj, SearchPageLoadConfigurator.class, "onSearchPageLoaded", "onSearchPageLoaded(Lru/ozon/composer/network/api/ComposerResponse;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(j jVar) {
        invoke2(jVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(j p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        ((SearchPageLoadConfigurator) this.receiver).onSearchPageLoaded(p02);
    }
}
