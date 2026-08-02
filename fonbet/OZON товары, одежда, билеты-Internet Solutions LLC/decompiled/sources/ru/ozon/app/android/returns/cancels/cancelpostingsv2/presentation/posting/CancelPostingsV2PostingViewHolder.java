package ru.ozon.app.android.returns.cancels.cancelpostingsv2.presentation.posting;

import DG.a;
import android.content.Context;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7705l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.returns.cancels.cancelpostingsv2.presentation.RefreshWithSelectedIdsHandler;
import ru.ozon.app.android.returns.cancels.cancelpostingsv2.presentation.posting.items.ItemsAdapter;
import ru.ozon.app.android.returns.cancels.databinding.WidgetCancelPostingsV2PostingBinding;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.af.AtomsAdapter;
import ru.ozon.uni.atoms.data.AtomDTO;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0011R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0012R \u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u000e0\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/returns/cancels/cancelpostingsv2/presentation/posting/CancelPostingsV2PostingViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/returns/cancels/cancelpostingsv2/presentation/posting/PostingVO;", "Lru/ozon/app/android/returns/cancels/databinding/WidgetCancelPostingsV2PostingBinding;", "binding", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/app/android/returns/cancels/cancelpostingsv2/presentation/RefreshWithSelectedIdsHandler;", "refreshWithSelectedIdsHandler", "<init>", "(Lru/ozon/app/android/returns/cancels/databinding/WidgetCancelPostingsV2PostingBinding;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/returns/cancels/cancelpostingsv2/presentation/RefreshWithSelectedIdsHandler;)V", "item", "Ll20/d;", "info", "", "bind", "(Lru/ozon/app/android/returns/cancels/cancelpostingsv2/presentation/posting/PostingVO;Ll20/d;)V", "Lru/ozon/app/android/returns/cancels/databinding/WidgetCancelPostingsV2PostingBinding;", "Lru/ozon/app/android/returns/cancels/cancelpostingsv2/presentation/RefreshWithSelectedIdsHandler;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/returns/cancels/cancelpostingsv2/presentation/posting/items/ItemsAdapter;", "itemsAdapter", "Lru/ozon/app/android/returns/cancels/cancelpostingsv2/presentation/posting/items/ItemsAdapter;", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "titleRowAdapter", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "cancels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CancelPostingsV2PostingViewHolder extends k<PostingVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final WidgetCancelPostingsV2PostingBinding binding;

    @NotNull
    private final ItemsAdapter itemsAdapter;

    @NotNull
    private final RefreshWithSelectedIdsHandler refreshWithSelectedIdsHandler;

    @NotNull
    private final AtomsAdapter titleRowAdapter;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CancelPostingsV2PostingViewHolder(@NotNull WidgetCancelPostingsV2PostingBinding binding, @NotNull ComposerReferences refs, @NotNull RefreshWithSelectedIdsHandler refreshWithSelectedIdsHandler) {
        super(r0);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(refreshWithSelectedIdsHandler, "refreshWithSelectedIdsHandler");
        ConstraintLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
        this.refreshWithSelectedIdsHandler = refreshWithSelectedIdsHandler;
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(refs, this).onClick(new CancelPostingsV2PostingViewHolder$actionHandler$1(this)).buildHandler();
        this.actionHandler = buildHandler;
        ItemsAdapter itemsAdapter = new ItemsAdapter();
        this.itemsAdapter = itemsAdapter;
        AtomsAdapter atomsAdapter = new AtomsAdapter(null, null, null, null, 15, null);
        atomsAdapter.setOnAction(buildHandler);
        this.titleRowAdapter = atomsAdapter;
        RecyclerView recyclerView = binding.itemsRv;
        recyclerView.setAdapter(itemsAdapter);
        recyclerView.setItemAnimator(null);
        binding.getConstraintLayout().setOnClickListener(new a(this, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$2(CancelPostingsV2PostingViewHolder cancelPostingsV2PostingViewHolder, View view) {
        AtomAction action;
        PostingVO boundedData = cancelPostingsV2PostingViewHolder.getBoundedData();
        if (boundedData == null || (action = boundedData.getAction()) == null) {
            return;
        }
        cancelPostingsV2PostingViewHolder.actionHandler.invoke(action);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull PostingVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.binding.checkboxV.setSelected(item.getIsSelected());
        this.binding.titleRowFlexAL.setAdapter(this.titleRowAdapter);
        AtomsAdapter atomsAdapter = this.titleRowAdapter;
        Context context = getContext();
        AtomDTO[] elements = {item.getTitleAtom(), item.getTitleBadge()};
        Intrinsics.checkNotNullParameter(elements, "elements");
        atomsAdapter.bind(context, C7705l.B(elements));
        this.itemsAdapter.submitList(item.getItems());
    }
}
