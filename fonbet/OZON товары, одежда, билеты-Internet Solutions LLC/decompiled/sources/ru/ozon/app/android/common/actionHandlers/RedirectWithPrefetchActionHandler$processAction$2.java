package ru.ozon.app.android.common.actionHandlers;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.composer.ComposerReferences;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class RedirectWithPrefetchActionHandler$processAction$2 extends AbstractC7737t implements Function1<String, Unit> {
    final /* synthetic */ ComposerReferences $composerReferences;
    final /* synthetic */ String $searchUrl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RedirectWithPrefetchActionHandler$processAction$2(ComposerReferences composerReferences, String str) {
        super(1);
        this.$composerReferences = composerReferences;
        this.$searchUrl = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        ComposerNavigator.DefaultImpls.openDeeplink$default(this.$composerReferences.getNavigator(), this.$searchUrl, null, 2, null);
        this.$composerReferences.getController().hideLoader();
    }
}
