package ru.ozon.app.android.ugc.core.widgets.singlereview.header.badgeItemsList;

import Sc.o;
import android.content.Context;
import android.view.ViewGroup;
import androidx.lifecycle.B;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.i;
import androidx.recyclerview.widget.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.timerMolecule.presentation.TimerDelegate;
import ru.ozon.app.android.timerMolecule.presentation.TimerDelegateImpl;
import ru.ozon.app.android.ugc.core.widgets.singlereview.header.badgeItemsList.SingleReviewBadgeItemsListVO;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u0000 22\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003234B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0019\u0010\u0018J+\u0010\u001d\u001a\u00020\u00102\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u001a2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u001aH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ9\u0010&\u001a\u00020\u00102\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001f2\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00100!2\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'R$\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u0010\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010(R\u0018\u0010%\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010)R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010*R*\u0010,\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010+8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101¨\u00065"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/singlereview/header/badgeItemsList/SingleReviewBadgeItemsAdapter;", "Landroidx/recyclerview/widget/t;", "Lru/ozon/app/android/ugc/core/widgets/singlereview/header/badgeItemsList/SingleReviewBadgeItemsListVO$BadgeItem;", "Landroidx/recyclerview/widget/RecyclerView$C;", "<init>", "()V", "", "position", "getItemViewType", "(I)I", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$C;", "holder", "", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$C;I)V", "onViewRecycled", "(Landroidx/recyclerview/widget/RecyclerView$C;)V", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "onAttachedToRecyclerView", "(Landroidx/recyclerview/widget/RecyclerView;)V", "onDetachedFromRecyclerView", "", "previousList", "currentList", "onCurrentListChanged", "(Ljava/util/List;Ljava/util/List;)V", "", "items", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Landroidx/lifecycle/B;", "lifecycleScope", "submit", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/lifecycle/B;)V", "Lkotlin/jvm/functions/Function1;", "Landroidx/lifecycle/B;", "Landroidx/recyclerview/widget/RecyclerView;", "Lkotlin/Function0;", "onTimerFinished", "Lkotlin/jvm/functions/Function0;", "getOnTimerFinished", "()Lkotlin/jvm/functions/Function0;", "setOnTimerFinished", "(Lkotlin/jvm/functions/Function0;)V", "Companion", "BadgeViewHolder", "TimerViewHolder", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SingleReviewBadgeItemsAdapter extends t<SingleReviewBadgeItemsListVO.BadgeItem, RecyclerView.C> {
    private Function1<? super AtomAction, Unit> actionHandler;
    private B lifecycleScope;
    private Function0<Unit> onTimerFinished;
    private RecyclerView recyclerView;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    private static final i.d<SingleReviewBadgeItemsListVO.BadgeItem> BadgeItemDiffer = new i.d<SingleReviewBadgeItemsListVO.BadgeItem>() { // from class: ru.ozon.app.android.ugc.core.widgets.singlereview.header.badgeItemsList.SingleReviewBadgeItemsAdapter$Companion$BadgeItemDiffer$1
        @Override // androidx.recyclerview.widget.i.d
        public boolean areContentsTheSame(SingleReviewBadgeItemsListVO.BadgeItem oldItem, SingleReviewBadgeItemsListVO.BadgeItem newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            if ((oldItem instanceof SingleReviewBadgeItemsListVO.BadgeItem.BadgeContent) && (newItem instanceof SingleReviewBadgeItemsListVO.BadgeItem.BadgeContent)) {
                SingleReviewBadgeItemsListVO.BadgeItem.BadgeContent badgeContent = (SingleReviewBadgeItemsListVO.BadgeItem.BadgeContent) oldItem;
                SingleReviewBadgeItemsListVO.BadgeItem.BadgeContent badgeContent2 = (SingleReviewBadgeItemsListVO.BadgeItem.BadgeContent) newItem;
                return Intrinsics.d(badgeContent.getBadge().getText(), badgeContent2.getBadge().getText()) && badgeContent.getBadge().getStyle() == badgeContent2.getBadge().getStyle();
            }
            if ((oldItem instanceof SingleReviewBadgeItemsListVO.BadgeItem.TimerContent) && (newItem instanceof SingleReviewBadgeItemsListVO.BadgeItem.TimerContent)) {
                return Intrinsics.d(((SingleReviewBadgeItemsListVO.BadgeItem.TimerContent) oldItem).getTimer(), ((SingleReviewBadgeItemsListVO.BadgeItem.TimerContent) newItem).getTimer());
            }
            return false;
        }

        @Override // androidx.recyclerview.widget.i.d
        public boolean areItemsTheSame(SingleReviewBadgeItemsListVO.BadgeItem oldItem, SingleReviewBadgeItemsListVO.BadgeItem newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return ((oldItem instanceof SingleReviewBadgeItemsListVO.BadgeItem.BadgeContent) && (newItem instanceof SingleReviewBadgeItemsListVO.BadgeItem.BadgeContent)) ? Intrinsics.d(((SingleReviewBadgeItemsListVO.BadgeItem.BadgeContent) oldItem).getBadge().getText(), ((SingleReviewBadgeItemsListVO.BadgeItem.BadgeContent) newItem).getBadge().getText()) : (oldItem instanceof SingleReviewBadgeItemsListVO.BadgeItem.TimerContent) && (newItem instanceof SingleReviewBadgeItemsListVO.BadgeItem.TimerContent);
        }
    };

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/singlereview/header/badgeItemsList/SingleReviewBadgeItemsAdapter$BadgeViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Lru/ozon/uni/android/atom/badge/BadgeView;", "badgeView", "<init>", "(Lru/ozon/uni/android/atom/badge/BadgeView;)V", "Lru/ozon/uni/android/atom/badge/BadgeView;", "getBadgeView", "()Lru/ozon/uni/android/atom/badge/BadgeView;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class BadgeViewHolder extends RecyclerView.C {

        @NotNull
        private final BadgeView badgeView;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BadgeViewHolder(@NotNull BadgeView badgeView) {
            super(badgeView);
            Intrinsics.checkNotNullParameter(badgeView, "badgeView");
            this.badgeView = badgeView;
        }

        @NotNull
        public final BadgeView getBadgeView() {
            return this.badgeView;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/singlereview/header/badgeItemsList/SingleReviewBadgeItemsAdapter$Companion;", "", "<init>", "()V", "", "VIEW_TYPE_BADGE", "I", "VIEW_TYPE_TIMER", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/singlereview/header/badgeItemsList/SingleReviewBadgeItemsAdapter$TimerViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "timerView", "<init>", "(Lru/ozon/app/android/ugc/core/widgets/singlereview/header/badgeItemsList/SingleReviewBadgeItemsAdapter;Lru/ozon/uni/android/atom/text/TextAtomV2View;)V", "Lru/ozon/app/android/ugc/core/widgets/singlereview/header/badgeItemsList/SingleReviewBadgeItemsListVO$BadgeItem$TimerContent;", "item", "", "bind", "(Lru/ozon/app/android/ugc/core/widgets/singlereview/header/badgeItemsList/SingleReviewBadgeItemsListVO$BadgeItem$TimerContent;)V", "clear", "()V", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "Lru/ozon/app/android/timerMolecule/presentation/TimerDelegateImpl;", "timerDelegate", "Lru/ozon/app/android/timerMolecule/presentation/TimerDelegateImpl;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private final class TimerViewHolder extends RecyclerView.C {
        final /* synthetic */ SingleReviewBadgeItemsAdapter this$0;

        @NotNull
        private final TimerDelegateImpl timerDelegate;

        @NotNull
        private final TextAtomV2View timerView;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TimerViewHolder(@NotNull SingleReviewBadgeItemsAdapter singleReviewBadgeItemsAdapter, TextAtomV2View timerView) {
            super(timerView);
            Intrinsics.checkNotNullParameter(timerView, "timerView");
            this.this$0 = singleReviewBadgeItemsAdapter;
            this.timerView = timerView;
            this.timerDelegate = new TimerDelegateImpl();
        }

        public final void bind(@NotNull SingleReviewBadgeItemsListVO.BadgeItem.TimerContent item) {
            Intrinsics.checkNotNullParameter(item, "item");
            TimerDelegate.DefaultImpls.bindOrGone$default(this.timerDelegate, this.timerView, item.getTimer(), null, 4, null);
            B b11 = this.this$0.lifecycleScope;
            if (b11 != null) {
                TimerDelegate.DefaultImpls.onAttach$default(this.timerDelegate, this.timerView, b11, null, new SingleReviewBadgeItemsAdapter$TimerViewHolder$bind$1$1(this.this$0), 4, null);
            }
            this.timerView.setClickable(false);
            this.timerView.setTextIsSelectable(false);
        }

        public final void clear() {
            this.timerDelegate.onClear();
        }
    }

    public SingleReviewBadgeItemsAdapter() {
        super(BadgeItemDiffer);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int getItemViewType(int position) {
        SingleReviewBadgeItemsListVO.BadgeItem item = getItem(position);
        if (item instanceof SingleReviewBadgeItemsListVO.BadgeItem.BadgeContent) {
            return 0;
        }
        if (item instanceof SingleReviewBadgeItemsListVO.BadgeItem.TimerContent) {
            return 1;
        }
        throw new o();
    }

    public final Function0<Unit> getOnTimerFinished() {
        return this.onTimerFinished;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onAttachedToRecyclerView(@NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        this.recyclerView = recyclerView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull RecyclerView.C holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        SingleReviewBadgeItemsListVO.BadgeItem item = getItem(position);
        if (item instanceof SingleReviewBadgeItemsListVO.BadgeItem.BadgeContent) {
            BadgeHolderKt.bind(((BadgeViewHolder) holder).getBadgeView(), ((SingleReviewBadgeItemsListVO.BadgeItem.BadgeContent) item).getBadge(), this.actionHandler);
        } else {
            if (!(item instanceof SingleReviewBadgeItemsListVO.BadgeItem.TimerContent)) {
                throw new o();
            }
            ((TimerViewHolder) holder).bind((SingleReviewBadgeItemsListVO.BadgeItem.TimerContent) item);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public RecyclerView.C onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (viewType == 1) {
            Context context = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            TextAtomV2View textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
            textAtomV2View.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            return new TimerViewHolder(this, textAtomV2View);
        }
        Context context2 = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        BadgeView badgeView = new BadgeView(context2, null, 0, 0, 14, null);
        badgeView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return new BadgeViewHolder(badgeView);
    }

    @Override // androidx.recyclerview.widget.t
    public void onCurrentListChanged(@NotNull List<SingleReviewBadgeItemsListVO.BadgeItem> previousList, @NotNull List<SingleReviewBadgeItemsListVO.BadgeItem> currentList) {
        Intrinsics.checkNotNullParameter(previousList, "previousList");
        Intrinsics.checkNotNullParameter(currentList, "currentList");
        super.onCurrentListChanged(previousList, currentList);
        RecyclerView recyclerView = this.recyclerView;
        if (recyclerView != null) {
            recyclerView.invalidateItemDecorations();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onDetachedFromRecyclerView(@NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        super.onDetachedFromRecyclerView(recyclerView);
        this.recyclerView = null;
        this.actionHandler = null;
        this.lifecycleScope = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onViewRecycled(@NotNull RecyclerView.C holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        super.onViewRecycled(holder);
        if (holder instanceof TimerViewHolder) {
            ((TimerViewHolder) holder).clear();
        }
    }

    public final void setOnTimerFinished(Function0<Unit> function0) {
        this.onTimerFinished = function0;
    }

    public final void submit(List<? extends SingleReviewBadgeItemsListVO.BadgeItem> items, @NotNull Function1<? super AtomAction, Unit> actionHandler, @NotNull B lifecycleScope) {
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(lifecycleScope, "lifecycleScope");
        this.actionHandler = actionHandler;
        this.lifecycleScope = lifecycleScope;
        submitList(items);
    }
}
