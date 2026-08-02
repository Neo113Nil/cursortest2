package ru.ozon.app.android.search.catalog.components.categorylogos.presentation;

import Ej.b;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "action", "Lru/ozon/uni/atoms/af/AtomAction;", "invoke", "(Lru/ozon/uni/atoms/af/AtomAction;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class CategoryLogosWidgetViewHolder$actionHandler$1 extends AbstractC7737t implements Function1<AtomAction, Boolean> {
    final /* synthetic */ CategoryLogosWidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CategoryLogosWidgetViewHolder$actionHandler$1(CategoryLogosWidgetViewHolder categoryLogosWidgetViewHolder) {
        super(1);
        this.this$0 = categoryLogosWidgetViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(AtomAction action) {
        boolean z11;
        ComposerReferences composerReferences;
        Intrinsics.checkNotNullParameter(action, "action");
        if (action instanceof AtomAction.OpenComposerNestedPage) {
            composerReferences = this.this$0.composerReferences;
            AtomAction.OpenComposerNestedPage openComposerNestedPage = (AtomAction.OpenComposerNestedPage) action;
            ComposerNavigator.DefaultImpls.openDeeplinkInBottomSheet$default(composerReferences.getNavigator(), b.a(openComposerNestedPage.hashCode(), "Nested_BottomSheet_Fragment_"), openComposerNestedPage.getLink(), null, null, null, 28, null);
            z11 = true;
        } else {
            z11 = false;
        }
        return Boolean.valueOf(z11);
    }
}
