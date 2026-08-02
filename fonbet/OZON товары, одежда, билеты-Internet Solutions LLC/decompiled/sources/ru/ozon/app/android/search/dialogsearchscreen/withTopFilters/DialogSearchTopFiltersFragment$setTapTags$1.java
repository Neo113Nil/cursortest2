package ru.ozon.app.android.search.dialogsearchscreen.withTopFilters;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/view/View;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class DialogSearchTopFiltersFragment$setTapTags$1 extends AbstractC7737t implements Function0<View> {
    final /* synthetic */ DialogSearchTopFiltersFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DialogSearchTopFiltersFragment$setTapTags$1(DialogSearchTopFiltersFragment dialogSearchTopFiltersFragment) {
        super(0);
        this.this$0 = dialogSearchTopFiltersFragment;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final View invoke() {
        CollapsingCoordinatorImpl collapsingCoordinatorImpl;
        collapsingCoordinatorImpl = this.this$0.collapsingCoordinator;
        if (collapsingCoordinatorImpl != null) {
            return collapsingCoordinatorImpl.getTagList();
        }
        return null;
    }
}
