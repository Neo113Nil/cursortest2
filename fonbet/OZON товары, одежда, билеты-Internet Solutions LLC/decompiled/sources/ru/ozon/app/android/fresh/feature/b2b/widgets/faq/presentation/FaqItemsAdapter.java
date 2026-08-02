package ru.ozon.app.android.fresh.feature.b2b.widgets.faq.presentation;

import WZ.l;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.i;
import androidx.recyclerview.widget.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.feature.b2b.databinding.WidgetFaqItemBinding;
import ru.ozon.app.android.fresh.feature.b2b.widgets.faq.data.FaqAnswerExpandedInfo;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B7\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0015\u0010\u0016R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0017R \u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0017R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/faq/presentation/FaqItemsAdapter;", "Landroidx/recyclerview/widget/t;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/faq/data/FaqAnswerExpandedInfo;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/faq/presentation/FaqItemViewHolder;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "onAction", "onAnswerExpanded", "LWZ/l;", "tokenizedAnalytics", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;LWZ/l;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/fresh/feature/b2b/widgets/faq/presentation/FaqItemViewHolder;", "holder", "position", "onBindViewHolder", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/faq/presentation/FaqItemViewHolder;I)V", "Lkotlin/jvm/functions/Function1;", "LWZ/l;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class FaqItemsAdapter extends t<FaqAnswerExpandedInfo, FaqItemViewHolder> {

    @NotNull
    private final Function1<AtomAction, Unit> onAction;

    @NotNull
    private final Function1<FaqAnswerExpandedInfo, Unit> onAnswerExpanded;

    @NotNull
    private final l tokenizedAnalytics;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FaqItemsAdapter(@NotNull Function1<? super AtomAction, Unit> onAction, @NotNull Function1<? super FaqAnswerExpandedInfo, Unit> onAnswerExpanded, @NotNull l tokenizedAnalytics) {
        super(new i.d<FaqAnswerExpandedInfo>() { // from class: ru.ozon.app.android.fresh.feature.b2b.widgets.faq.presentation.FaqItemsAdapter.1
            @Override // androidx.recyclerview.widget.i.d
            public boolean areContentsTheSame(FaqAnswerExpandedInfo oldItem, FaqAnswerExpandedInfo newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return Intrinsics.d(oldItem.getFaqItem(), newItem.getFaqItem());
            }

            @Override // androidx.recyclerview.widget.i.d
            public boolean areItemsTheSame(FaqAnswerExpandedInfo oldItem, FaqAnswerExpandedInfo newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return Intrinsics.d(oldItem.getFaqItem(), newItem.getFaqItem());
            }
        });
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        Intrinsics.checkNotNullParameter(onAnswerExpanded, "onAnswerExpanded");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.onAction = onAction;
        this.onAnswerExpanded = onAnswerExpanded;
        this.tokenizedAnalytics = tokenizedAnalytics;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull FaqItemViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        FaqAnswerExpandedInfo item = getItem(position);
        Intrinsics.checkNotNullExpressionValue(item, "getItem(...)");
        holder.bind(item);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public FaqItemViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        WidgetFaqItemBinding inflate = WidgetFaqItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return new FaqItemViewHolder(inflate, this.onAction, this.onAnswerExpanded, this.tokenizedAnalytics);
    }
}
