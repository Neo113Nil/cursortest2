package ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.fields.FieldAction;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B_\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00070\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\u001c\b\u0002\u0010\u0010\u001a\u0016\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\r¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001b\u0010\"\u001a\u00020\u00072\f\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001f¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010$R \u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010%R \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00070\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010%R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010&R(\u0010\u0010\u001a\u0016\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010'R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020 0(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBlocksAdapter;", "Landroidx/recyclerview/widget/RecyclerView$g;", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBlockVH;", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormConfig;", "formConfig", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "onTitleAction", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/fields/FieldAction;", "onAction", "", "isTopItemDecorationEnabled", "Lkotlin/Function2;", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "Landroid/view/View;", "onOnboardingShow", "<init>", "(Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormConfig;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZLkotlin/jvm/functions/Function2;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBlockVH;", "getItemCount", "()I", "holder", "position", "onBindViewHolder", "(Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBlockVH;I)V", "", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO;", "items", "submitList", "(Ljava/util/List;)V", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormConfig;", "Lkotlin/jvm/functions/Function1;", "Z", "Lkotlin/jvm/functions/Function2;", "", "blocks", "Ljava/util/List;", "suggestions-search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class FormBlocksAdapter extends RecyclerView.g<FormBlockVH> {

    @NotNull
    private final List<FormBuilderBlockVO> blocks;

    @NotNull
    private final FormConfig formConfig;
    private final boolean isTopItemDecorationEnabled;

    @NotNull
    private final Function1<FieldAction, Unit> onAction;
    private final Function2<OnBoardingDTO, View, Unit> onOnboardingShow;

    @NotNull
    private final Function1<AtomAction, Unit> onTitleAction;

    public /* synthetic */ FormBlocksAdapter(FormConfig formConfig, Function1 function1, Function1 function12, boolean z11, Function2 function2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(formConfig, function1, function12, (i11 & 8) != 0 ? true : z11, (i11 & 16) != 0 ? null : function2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* renamed from: getItemCount */
    public int getShimmersCount() {
        return this.blocks.size();
    }

    public final void submitList(@NotNull List<FormBuilderBlockVO> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.blocks.clear();
        this.blocks.addAll(items);
        notifyDataSetChanged();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FormBlocksAdapter(@NotNull FormConfig formConfig, @NotNull Function1<? super AtomAction, Unit> onTitleAction, @NotNull Function1<? super FieldAction, Unit> onAction, boolean z11, Function2<? super OnBoardingDTO, ? super View, Unit> function2) {
        Intrinsics.checkNotNullParameter(formConfig, "formConfig");
        Intrinsics.checkNotNullParameter(onTitleAction, "onTitleAction");
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        this.formConfig = formConfig;
        this.onTitleAction = onTitleAction;
        this.onAction = onAction;
        this.isTopItemDecorationEnabled = z11;
        this.onOnboardingShow = function2;
        this.blocks = new ArrayList();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull FormBlockVH holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bind(this.blocks.get(position));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public FormBlockVH onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        FormConfig formConfig = this.formConfig;
        Function1<AtomAction, Unit> function1 = this.onTitleAction;
        Function1<FieldAction, Unit> function12 = this.onAction;
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        FormBlockView formBlockView = new FormBlockView(context, null, 0, 0, 14, null);
        formBlockView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return new FormBlockVH(formConfig, formBlockView, function1, function12, this.onOnboardingShow, this.isTopItemDecorationEnabled);
    }
}
