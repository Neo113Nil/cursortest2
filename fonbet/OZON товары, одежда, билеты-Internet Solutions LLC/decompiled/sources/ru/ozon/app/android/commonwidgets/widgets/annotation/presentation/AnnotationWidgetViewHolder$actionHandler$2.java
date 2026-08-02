package ru.ozon.app.android.commonwidgets.widgets.annotation.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.action.sheet.AtomActionSheetHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.favorites.ui.atomactionsheethandlers.CreateFavoritesListDelegate;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "action", "Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class AnnotationWidgetViewHolder$actionHandler$2 extends AbstractC7737t implements Function1<AtomAction.ComposerAction, Unit> {
    final /* synthetic */ AnnotationWidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AnnotationWidgetViewHolder$actionHandler$2(AnnotationWidgetViewHolder annotationWidgetViewHolder) {
        super(1);
        this.this$0 = annotationWidgetViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AtomAction.ComposerAction composerAction) {
        invoke2(composerAction);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AtomAction.ComposerAction action) {
        CreateFavoritesListDelegate createFavoritesListDelegate;
        ComposerReferences composerReferences;
        Intrinsics.checkNotNullParameter(action, "action");
        if (Intrinsics.d(action.getId(), AtomActionSheetHandler.SheetAction.FAVORITE_CREATE_LIST.getId())) {
            createFavoritesListDelegate = this.this$0.createFavoritesListDelegate;
            composerReferences = this.this$0.refs;
            createFavoritesListDelegate.handle(action, composerReferences);
        }
    }
}
