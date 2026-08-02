package ru.ozon.app.android.search.catalog.components.fullTextSearchHeaderV3.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.composer.ComposerReferences;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class FullTextSearchHeaderV3ViewHolder$bind$1$1 extends AbstractC7737t implements Function1<String, Unit> {
    final /* synthetic */ FullTextSearchHeaderV3ViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FullTextSearchHeaderV3ViewHolder$bind$1$1(FullTextSearchHeaderV3ViewHolder fullTextSearchHeaderV3ViewHolder) {
        super(1);
        this.this$0 = fullTextSearchHeaderV3ViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String it) {
        ComposerReferences composerReferences;
        Intrinsics.checkNotNullParameter(it, "it");
        composerReferences = this.this$0.refs;
        ComposerNavigator.DefaultImpls.openDeeplink$default(composerReferences.getNavigator(), it, null, 2, null);
    }
}
