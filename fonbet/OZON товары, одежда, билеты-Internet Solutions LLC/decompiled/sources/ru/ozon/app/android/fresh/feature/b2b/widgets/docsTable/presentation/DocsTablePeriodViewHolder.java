package ru.ozon.app.android.fresh.feature.b2b.widgets.docsTable.presentation;

import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.core.content.a;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.feature.b2b.R$drawable;
import ru.ozon.app.android.fresh.feature.b2b.databinding.WidgetDocsPeriodItemBinding;
import ru.ozon.app.android.fresh.feature.b2b.widgets.docsTable.presentation.DocsTableVO;
import ru.ozon.app.android.uikit.view.recycler.decoration.SkipLastDividerItemDecoration;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000eR \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/docsTable/presentation/DocsTablePeriodViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Lru/ozon/app/android/fresh/feature/b2b/databinding/WidgetDocsPeriodItemBinding;", "binding", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "<init>", "(Lru/ozon/app/android/fresh/feature/b2b/databinding/WidgetDocsPeriodItemBinding;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/fresh/feature/b2b/widgets/docsTable/presentation/DocsTableVO$Period;", "item", "bind", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/docsTable/presentation/DocsTableVO$Period;)V", "Lru/ozon/app/android/fresh/feature/b2b/databinding/WidgetDocsPeriodItemBinding;", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/docsTable/presentation/DocsTableItemsAdapter;", "docsTableItemsAdapter", "Lru/ozon/app/android/fresh/feature/b2b/widgets/docsTable/presentation/DocsTableItemsAdapter;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DocsTablePeriodViewHolder extends RecyclerView.C {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final WidgetDocsPeriodItemBinding binding;

    @NotNull
    private final DocsTableItemsAdapter docsTableItemsAdapter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DocsTablePeriodViewHolder(@NotNull WidgetDocsPeriodItemBinding binding, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        super(binding.getConstraintLayout());
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        this.binding = binding;
        this.actionHandler = actionHandler;
        DocsTableItemsAdapter docsTableItemsAdapter = new DocsTableItemsAdapter(actionHandler);
        this.docsTableItemsAdapter = docsTableItemsAdapter;
        RecyclerView recyclerView = binding.recyclerView;
        SkipLastDividerItemDecoration skipLastDividerItemDecoration = new SkipLastDividerItemDecoration(recyclerView.getContext(), 1);
        Drawable drawable = a.getDrawable(recyclerView.getContext(), R$drawable.item_divider_docs_table);
        if (drawable != null) {
            skipLastDividerItemDecoration.setDrawable(drawable);
        }
        recyclerView.addItemDecoration(skipLastDividerItemDecoration);
        recyclerView.setAdapter(docsTableItemsAdapter);
    }

    public final void bind(@NotNull DocsTableVO.Period item) {
        Intrinsics.checkNotNullParameter(item, "item");
        WidgetDocsPeriodItemBinding widgetDocsPeriodItemBinding = this.binding;
        TextAtomV2View title = widgetDocsPeriodItemBinding.title;
        Intrinsics.checkNotNullExpressionValue(title, "title");
        TextHolderKt.bindOrGone$default(title, item.getTitle(), null, 2, null);
        View separator = widgetDocsPeriodItemBinding.separator;
        Intrinsics.checkNotNullExpressionValue(separator, "separator");
        TextAtomV2View title2 = widgetDocsPeriodItemBinding.title;
        Intrinsics.checkNotNullExpressionValue(title2, "title");
        separator.setVisibility(title2.getVisibility() == 0 ? 0 : 8);
        this.docsTableItemsAdapter.submitList(item.getItems());
    }
}
