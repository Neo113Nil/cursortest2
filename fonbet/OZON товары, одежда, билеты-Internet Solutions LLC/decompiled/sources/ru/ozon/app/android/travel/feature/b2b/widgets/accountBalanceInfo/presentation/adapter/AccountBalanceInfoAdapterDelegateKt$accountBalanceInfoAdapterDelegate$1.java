package ru.ozon.app.android.travel.feature.b2b.widgets.accountBalanceInfo.presentation.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.molecules.view.textInfoCells.TextInfoCellsView;
import ru.ozon.app.android.travel.utils.TypedViewBinding;

@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Lru/ozon/app/android/travel/utils/TypedViewBinding;", "Lru/ozon/app/android/travel/molecules/view/textInfoCells/TextInfoCellsView;", "<unused var>", "Landroid/view/LayoutInflater;", "root", "Landroid/view/ViewGroup;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class AccountBalanceInfoAdapterDelegateKt$accountBalanceInfoAdapterDelegate$1 extends AbstractC7737t implements Function2<LayoutInflater, ViewGroup, TypedViewBinding<TextInfoCellsView>> {
    final /* synthetic */ int $horizontalPadding;
    final /* synthetic */ RecyclerView.u $pool;
    final /* synthetic */ int $verticalPadding;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/travel/molecules/view/textInfoCells/TextInfoCellsView;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.travel.feature.b2b.widgets.accountBalanceInfo.presentation.adapter.AccountBalanceInfoAdapterDelegateKt$accountBalanceInfoAdapterDelegate$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function0<TextInfoCellsView> {
        final /* synthetic */ int $horizontalPadding;
        final /* synthetic */ RecyclerView.u $pool;
        final /* synthetic */ ViewGroup $root;
        final /* synthetic */ int $verticalPadding;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ViewGroup viewGroup, int i11, int i12, RecyclerView.u uVar) {
            super(0);
            this.$root = viewGroup;
            this.$horizontalPadding = i11;
            this.$verticalPadding = i12;
            this.$pool = uVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final TextInfoCellsView invoke() {
            Context context = this.$root.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            TextInfoCellsView textInfoCellsView = new TextInfoCellsView(context, null, 0, 6, null);
            int i11 = this.$horizontalPadding;
            int i12 = this.$verticalPadding;
            RecyclerView.u uVar = this.$pool;
            textInfoCellsView.setLayoutParams(new RecyclerView.p(-1, -2));
            textInfoCellsView.setNestedScrollingEnabled(false);
            textInfoCellsView.setPadding(i11, i12, i11, i12);
            textInfoCellsView.setRecycledViewPool(uVar);
            return textInfoCellsView;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AccountBalanceInfoAdapterDelegateKt$accountBalanceInfoAdapterDelegate$1(int i11, int i12, RecyclerView.u uVar) {
        super(2);
        this.$horizontalPadding = i11;
        this.$verticalPadding = i12;
        this.$pool = uVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final TypedViewBinding<TextInfoCellsView> invoke(LayoutInflater layoutInflater, ViewGroup root) {
        Intrinsics.checkNotNullParameter(layoutInflater, "<unused var>");
        Intrinsics.checkNotNullParameter(root, "root");
        return new TypedViewBinding<>(new AnonymousClass1(root, this.$horizontalPadding, this.$verticalPadding, this.$pool));
    }
}
