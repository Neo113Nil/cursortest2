package ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.presentation.formBuilder;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.FormBlocksAdapter;
import ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.FormConfig;
import ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.fields.FieldAction;
import ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data.SplitDynamicElementVO;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/common/splitDynamicElements/presentation/formBuilder/FormBuilderVH;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Landroidx/recyclerview/widget/RecyclerView;", "view", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormConfig;", "config", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "onTitleAction", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/fields/FieldAction;", "onAction", "<init>", "(Landroidx/recyclerview/widget/RecyclerView;Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormConfig;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/checkoutcomposer/common/splitDynamicElements/data/SplitDynamicElementVO$Form;", "item", "bind", "(Lru/ozon/app/android/checkoutcomposer/common/splitDynamicElements/data/SplitDynamicElementVO$Form;)V", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBlocksAdapter;", "formBlocksAdapter", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBlocksAdapter;", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class FormBuilderVH extends RecyclerView.C {

    @NotNull
    private final FormBlocksAdapter formBlocksAdapter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FormBuilderVH(@NotNull RecyclerView view, @NotNull FormConfig config, @NotNull Function1<? super AtomAction, Unit> onTitleAction, @NotNull Function1<? super FieldAction, Unit> onAction) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(onTitleAction, "onTitleAction");
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        FormBlocksAdapter formBlocksAdapter = new FormBlocksAdapter(config, onTitleAction, onAction, false, null, 16, null);
        this.formBlocksAdapter = formBlocksAdapter;
        view.setAdapter(formBlocksAdapter);
        view.setLayoutManager(new LinearLayoutManager(view.getContext()));
    }

    public final void bind(@NotNull SplitDynamicElementVO.Form item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.formBlocksAdapter.submitList(item.getFormBlocks());
    }
}
