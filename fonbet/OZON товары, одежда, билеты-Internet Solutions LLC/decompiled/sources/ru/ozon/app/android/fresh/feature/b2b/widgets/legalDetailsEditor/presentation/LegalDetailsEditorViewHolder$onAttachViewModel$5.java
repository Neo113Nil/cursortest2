package ru.ozon.app.android.fresh.feature.b2b.widgets.legalDetailsEditor.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.composer.ComposerReferences;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "deeplink", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class LegalDetailsEditorViewHolder$onAttachViewModel$5 extends AbstractC7737t implements Function1<String, Unit> {
    final /* synthetic */ LegalDetailsEditorViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LegalDetailsEditorViewHolder$onAttachViewModel$5(LegalDetailsEditorViewHolder legalDetailsEditorViewHolder) {
        super(1);
        this.this$0 = legalDetailsEditorViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String deeplink) {
        ComposerReferences composerReferences;
        ComposerReferences composerReferences2;
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        composerReferences = this.this$0.references;
        composerReferences.getNavigator().popBackStack();
        composerReferences2 = this.this$0.references;
        ComposerNavigator.DefaultImpls.openDeeplink$default(composerReferences2.getNavigator(), deeplink, null, 2, null);
    }
}
