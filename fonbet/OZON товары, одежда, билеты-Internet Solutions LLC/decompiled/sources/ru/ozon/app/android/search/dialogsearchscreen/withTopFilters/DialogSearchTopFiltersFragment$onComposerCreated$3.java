package ru.ozon.app.android.search.dialogsearchscreen.withTopFilters;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.search.dialogsearchscreen.DialogSearchViewModel;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/uni/atoms/af/AtomAction;", "invoke", "(Lru/ozon/uni/atoms/af/AtomAction;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class DialogSearchTopFiltersFragment$onComposerCreated$3 extends AbstractC7737t implements Function1<AtomAction, Boolean> {
    final /* synthetic */ DialogSearchTopFiltersFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DialogSearchTopFiltersFragment$onComposerCreated$3(DialogSearchTopFiltersFragment dialogSearchTopFiltersFragment) {
        super(1);
        this.this$0 = dialogSearchTopFiltersFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(AtomAction it) {
        DialogSearchViewModel dialogSearchViewModel;
        Intrinsics.checkNotNullParameter(it, "it");
        if (!(it instanceof AtomAction.Click)) {
            if (!(it instanceof AtomAction.OpenComposerNestedPage)) {
                return Boolean.FALSE;
            }
            this.this$0.openFilters(((AtomAction.OpenComposerNestedPage) it).getLink());
            return Boolean.TRUE;
        }
        dialogSearchViewModel = this.this$0.viewModel;
        if (dialogSearchViewModel != null) {
            AtomAction.Click click = (AtomAction.Click) it;
            dialogSearchViewModel.handleTapTagAction(click, click.getId());
        }
        return Boolean.TRUE;
    }
}
