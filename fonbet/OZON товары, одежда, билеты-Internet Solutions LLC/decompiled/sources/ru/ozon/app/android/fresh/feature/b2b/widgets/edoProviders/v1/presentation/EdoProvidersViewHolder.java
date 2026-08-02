package ru.ozon.app.android.fresh.feature.b2b.widgets.edoProviders.v1.presentation;

import Vg.d;
import android.graphics.drawable.Drawable;
import android.widget.LinearLayout;
import androidx.core.content.a;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.fresh.feature.b2b.R$drawable;
import ru.ozon.app.android.fresh.feature.b2b.databinding.WidgetEdoProvidersBinding;
import ru.ozon.app.android.fresh.feature.b2b.utils.UtilsKt;
import ru.ozon.app.android.uikit.view.recycler.decoration.SkipLastDividerItemDecoration;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.cell.disclosure.disclosureTitleSubtitleCell.DisclosureTitleSubtitleCellView;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.cell.disclosureCell.DisclosureTitleSubtitleCellHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B#\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\u0010\t\u001a\u00060\u0007j\u0002`\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0012R \u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u000f0\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/edoProviders/v1/presentation/EdoProvidersViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/edoProviders/v1/presentation/EdoProvidersVO;", "Lru/ozon/app/android/fresh/feature/b2b/databinding/WidgetEdoProvidersBinding;", "binding", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "<init>", "(Lru/ozon/app/android/fresh/feature/b2b/databinding/WidgetEdoProvidersBinding;Lru/ozon/app/android/composer/ComposerReferences;LVg/d;)V", "item", "Ll20/d;", "info", "", "bind", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/edoProviders/v1/presentation/EdoProvidersVO;Ll20/d;)V", "Lru/ozon/app/android/fresh/feature/b2b/databinding/WidgetEdoProvidersBinding;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/edoProviders/v1/presentation/EdoProvidersItemsAdapter;", "itemsAdapter", "Lru/ozon/app/android/fresh/feature/b2b/widgets/edoProviders/v1/presentation/EdoProvidersItemsAdapter;", "Lru/ozon/app/android/uikit/view/recycler/decoration/SkipLastDividerItemDecoration;", "itemsBlockDecoration", "Lru/ozon/app/android/uikit/view/recycler/decoration/SkipLastDividerItemDecoration;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class EdoProvidersViewHolder extends k<EdoProvidersVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final WidgetEdoProvidersBinding binding;

    @NotNull
    private final EdoProvidersItemsAdapter itemsAdapter;

    @NotNull
    private final SkipLastDividerItemDecoration itemsBlockDecoration;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public EdoProvidersViewHolder(@NotNull WidgetEdoProvidersBinding binding, @NotNull ComposerReferences references, @NotNull d customActionHandlersStoreFactory) {
        super(r0);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        LinearLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(references, this).customActionHandlers(new EdoProvidersViewHolder$actionHandler$1(customActionHandlersStoreFactory)).buildHandler();
        this.actionHandler = buildHandler;
        EdoProvidersItemsAdapter edoProvidersItemsAdapter = new EdoProvidersItemsAdapter(buildHandler);
        this.itemsAdapter = edoProvidersItemsAdapter;
        SkipLastDividerItemDecoration skipLastDividerItemDecoration = new SkipLastDividerItemDecoration(getContext(), 1);
        Drawable drawable = a.getDrawable(getContext(), R$drawable.item_divider_edo_providers);
        if (drawable != null) {
            skipLastDividerItemDecoration.setDrawable(drawable);
        }
        this.itemsBlockDecoration = skipLastDividerItemDecoration;
        RecyclerView recyclerView = binding.recyclerView;
        recyclerView.setAdapter(edoProvidersItemsAdapter);
        recyclerView.addItemDecoration(skipLastDividerItemDecoration);
        DisclosureTitleSubtitleCellView cellButton = binding.cellButton;
        Intrinsics.checkNotNullExpressionValue(cellButton, "cellButton");
        UtilsKt.setColoredDrawableBackground(cellButton, R$color.bg_secondary, ResourceExtKt.toPxF(16));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull EdoProvidersVO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        WidgetEdoProvidersBinding widgetEdoProvidersBinding = this.binding;
        TextAtomV2View title = widgetEdoProvidersBinding.title;
        Intrinsics.checkNotNullExpressionValue(title, "title");
        TextHolderKt.bindOrGone$default(title, item.getTitle(), null, 2, null);
        DisclosureTitleSubtitleCellView cellButton = widgetEdoProvidersBinding.cellButton;
        Intrinsics.checkNotNullExpressionValue(cellButton, "cellButton");
        DisclosureTitleSubtitleCellHolderKt.bindOrGone(cellButton, item.getAddEdo(), this.actionHandler);
        this.itemsAdapter.submitList(item.getEdoInfoList());
    }
}
