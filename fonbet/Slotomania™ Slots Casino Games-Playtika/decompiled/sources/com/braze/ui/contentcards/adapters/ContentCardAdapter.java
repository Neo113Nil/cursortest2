package com.braze.ui.contentcards.adapters;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.ViewGroup;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.braze.models.cards.Card;
import com.braze.support.BrazeLogger;
import com.braze.ui.contentcards.handlers.IContentCardsViewBindingHandler;
import com.braze.ui.contentcards.listeners.IContentCardsActionListener;
import com.braze.ui.contentcards.managers.BrazeContentCardsManager;
import com.braze.ui.contentcards.recycler.ItemTouchHelperAdapter;
import com.braze.ui.contentcards.view.ContentCardViewHolder;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ironsource.X3;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ContentCardAdapter.kt */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u00017B+\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\u0012\u0010\u0019\u001a\u0004\u0018\u00010\n2\u0006\u0010\u001a\u001a\u00020\u001bH\u0007J\b\u0010\u001c\u001a\u00020\u001bH\u0016J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001bH\u0016J\u0010\u0010 \u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u001bH\u0016J\u0010\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u001bH\u0007J\u000e\u0010$\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u001bJ\u0010\u0010%\u001a\u00020\"2\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0010\u0010&\u001a\u00020\"2\u0006\u0010\u001f\u001a\u00020\u001bH\u0016J\u0012\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\nH\u0007J\u0006\u0010*\u001a\u00020(J\u0018\u0010+\u001a\u00020(2\u0006\u0010,\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u001bH\u0016J\u0018\u0010-\u001a\u00020\u00022\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020\u001bH\u0016J\u0010\u00101\u001a\u00020(2\u0006\u0010\u001f\u001a\u00020\u001bH\u0016J\u0010\u00102\u001a\u00020(2\u0006\u00103\u001a\u00020\u0002H\u0016J\u0010\u00104\u001a\u00020(2\u0006\u00103\u001a\u00020\u0002H\u0016J\u0014\u00105\u001a\u00020(2\f\u00106\u001a\b\u0012\u0004\u0012\u00020\n0\u0011R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R0\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00120\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00068"}, d2 = {"Lcom/braze/ui/contentcards/adapters/ContentCardAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/braze/ui/contentcards/view/ContentCardViewHolder;", "Lcom/braze/ui/contentcards/recycler/ItemTouchHelperAdapter;", "context", "Landroid/content/Context;", "layoutManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "cardData", "", "Lcom/braze/models/cards/Card;", "contentCardsViewBindingHandler", "Lcom/braze/ui/contentcards/handlers/IContentCardsViewBindingHandler;", "(Landroid/content/Context;Landroidx/recyclerview/widget/LinearLayoutManager;Ljava/util/List;Lcom/braze/ui/contentcards/handlers/IContentCardsViewBindingHandler;)V", "handler", "Landroid/os/Handler;", "impressedCardIds", "", "", "getImpressedCardIds", "()Ljava/util/List;", "setImpressedCardIds", "(Ljava/util/List;)V", "impressedCardIdsInternal", "", "getCardAtIndex", FirebaseAnalytics.Param.INDEX, "", "getItemCount", "getItemId", "", X3.i.L, "getItemViewType", "isAdapterPositionOnScreen", "", "adapterPosition", "isControlCardAtPosition", "isInvalidIndex", "isItemDismissable", "logImpression", "", "card", "markOnScreenCardsAsRead", "onBindViewHolder", "viewHolder", "onCreateViewHolder", "viewGroup", "Landroid/view/ViewGroup;", "viewType", "onItemDismiss", "onViewAttachedToWindow", "holder", "onViewDetachedFromWindow", "replaceCards", "newCardData", "CardListDiffCallback", "android-sdk-ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public class ContentCardAdapter extends RecyclerView.Adapter<ContentCardViewHolder> implements ItemTouchHelperAdapter {
    private final List<Card> cardData;
    private final IContentCardsViewBindingHandler contentCardsViewBindingHandler;
    private final Context context;
    private final Handler handler;
    private Set<String> impressedCardIdsInternal;
    private final LinearLayoutManager layoutManager;

    public ContentCardAdapter(Context context, LinearLayoutManager layoutManager, List<Card> cardData, IContentCardsViewBindingHandler contentCardsViewBindingHandler) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(layoutManager, "layoutManager");
        Intrinsics.checkNotNullParameter(cardData, "cardData");
        Intrinsics.checkNotNullParameter(contentCardsViewBindingHandler, "contentCardsViewBindingHandler");
        this.context = context;
        this.layoutManager = layoutManager;
        this.cardData = cardData;
        this.contentCardsViewBindingHandler = contentCardsViewBindingHandler;
        this.handler = new Handler(Looper.getMainLooper());
        this.impressedCardIdsInternal = new LinkedHashSet();
        setHasStableIds(true);
    }

    public final List<String> getImpressedCardIds() {
        return CollectionsKt.toList(this.impressedCardIdsInternal);
    }

    public final void setImpressedCardIds(List<String> impressedCardIds) {
        Intrinsics.checkNotNullParameter(impressedCardIds, "impressedCardIds");
        this.impressedCardIdsInternal = CollectionsKt.toMutableSet(impressedCardIds);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public ContentCardViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
        return this.contentCardsViewBindingHandler.onCreateViewHolder(this.context, this.cardData, viewGroup, viewType);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(ContentCardViewHolder viewHolder, int position) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        this.contentCardsViewBindingHandler.onBindViewHolder(this.context, this.cardData, viewHolder, position);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        return this.contentCardsViewBindingHandler.getItemViewType(this.context, this.cardData, position);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.cardData.size();
    }

    @Override // com.braze.ui.contentcards.recycler.ItemTouchHelperAdapter
    public void onItemDismiss(final int position) {
        if (isInvalidIndex(position)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.contentcards.adapters.ContentCardAdapter$onItemDismiss$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    List list;
                    StringBuilder append = new StringBuilder("Cannot dismiss card at index: ").append(position).append(" in cards list of size: ");
                    list = this.cardData;
                    return append.append(list.size()).toString();
                }
            }, 3, (Object) null);
            return;
        }
        Card remove = this.cardData.remove(position);
        remove.setDismissed(true);
        notifyItemRemoved(position);
        IContentCardsActionListener contentCardsActionListener = BrazeContentCardsManager.INSTANCE.getInstance().getContentCardsActionListener();
        if (contentCardsActionListener == null) {
            return;
        }
        contentCardsActionListener.onContentCardDismissed(this.context, remove);
    }

    @Override // com.braze.ui.contentcards.recycler.ItemTouchHelperAdapter
    public boolean isItemDismissable(int position) {
        if (this.cardData.isEmpty() || isInvalidIndex(position)) {
            return false;
        }
        return this.cardData.get(position).getIsDismissibleByUser();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewAttachedToWindow(ContentCardViewHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        super.onViewAttachedToWindow((ContentCardAdapter) holder);
        if (this.cardData.isEmpty()) {
            return;
        }
        final int bindingAdapterPosition = holder.getBindingAdapterPosition();
        if (bindingAdapterPosition == -1 || !isAdapterPositionOnScreen(bindingAdapterPosition)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.contentcards.adapters.ContentCardAdapter$onViewAttachedToWindow$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "The card at position " + bindingAdapterPosition + " isn't on screen or does not have a valid adapter position. Not logging impression.";
                }
            }, 2, (Object) null);
        } else {
            logImpression(getCardAtIndex(bindingAdapterPosition));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewDetachedFromWindow(ContentCardViewHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        super.onViewDetachedFromWindow((ContentCardAdapter) holder);
        if (this.cardData.isEmpty()) {
            return;
        }
        final int bindingAdapterPosition = holder.getBindingAdapterPosition();
        if (bindingAdapterPosition == -1 || !isAdapterPositionOnScreen(bindingAdapterPosition)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.contentcards.adapters.ContentCardAdapter$onViewDetachedFromWindow$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "The card at position " + bindingAdapterPosition + " isn't on screen or does not have a valid adapter position. Not marking as read.";
                }
            }, 2, (Object) null);
            return;
        }
        Card cardAtIndex = getCardAtIndex(bindingAdapterPosition);
        if (cardAtIndex == null || cardAtIndex.getIsIndicatorHighlightedInternal()) {
            return;
        }
        cardAtIndex.setIndicatorHighlighted(true);
        this.handler.post(new Runnable() { // from class: com.braze.ui.contentcards.adapters.ContentCardAdapter$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                ContentCardAdapter.m5209onViewDetachedFromWindow$lambda0(ContentCardAdapter.this, bindingAdapterPosition);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onViewDetachedFromWindow$lambda-0, reason: not valid java name */
    public static final void m5209onViewDetachedFromWindow$lambda0(ContentCardAdapter this$0, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.notifyItemChanged(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int position) {
        String id;
        Card cardAtIndex = getCardAtIndex(position);
        if (cardAtIndex == null || (id = cardAtIndex.getId()) == null) {
            return 0L;
        }
        return id.hashCode();
    }

    public final synchronized void replaceCards(List<? extends Card> newCardData) {
        Intrinsics.checkNotNullParameter(newCardData, "newCardData");
        DiffUtil.DiffResult calculateDiff = DiffUtil.calculateDiff(new CardListDiffCallback(this.cardData, newCardData));
        Intrinsics.checkNotNullExpressionValue(calculateDiff, "calculateDiff(diffCallback)");
        this.cardData.clear();
        this.cardData.addAll(newCardData);
        calculateDiff.dispatchUpdatesTo(this);
    }

    public final void markOnScreenCardsAsRead() {
        if (this.cardData.isEmpty()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.contentcards.adapters.ContentCardAdapter$markOnScreenCardsAsRead$1
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Card list is empty. Not marking on-screen cards as read.";
                }
            }, 3, (Object) null);
            return;
        }
        final int findFirstVisibleItemPosition = this.layoutManager.findFirstVisibleItemPosition();
        final int findLastVisibleItemPosition = this.layoutManager.findLastVisibleItemPosition();
        if (findFirstVisibleItemPosition < 0 || findLastVisibleItemPosition < 0) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.contentcards.adapters.ContentCardAdapter$markOnScreenCardsAsRead$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Not marking all on-screen cards as read. Either the first or last index is negative. First visible: " + findFirstVisibleItemPosition + " . Last visible: " + findLastVisibleItemPosition;
                }
            }, 3, (Object) null);
            return;
        }
        if (findFirstVisibleItemPosition <= findLastVisibleItemPosition) {
            int i = findFirstVisibleItemPosition;
            while (true) {
                int i2 = i + 1;
                Card cardAtIndex = getCardAtIndex(i);
                if (cardAtIndex != null) {
                    cardAtIndex.setIndicatorHighlighted(true);
                }
                if (i == findLastVisibleItemPosition) {
                    break;
                } else {
                    i = i2;
                }
            }
        }
        this.handler.post(new Runnable() { // from class: com.braze.ui.contentcards.adapters.ContentCardAdapter$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                ContentCardAdapter.m5208markOnScreenCardsAsRead$lambda1(findLastVisibleItemPosition, findFirstVisibleItemPosition, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: markOnScreenCardsAsRead$lambda-1, reason: not valid java name */
    public static final void m5208markOnScreenCardsAsRead$lambda1(int i, int i2, ContentCardAdapter this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.notifyItemRangeChanged(i2, (i - i2) + 1);
    }

    public final boolean isControlCardAtPosition(int adapterPosition) {
        Card cardAtIndex = getCardAtIndex(adapterPosition);
        return cardAtIndex != null && cardAtIndex.isControl();
    }

    public final Card getCardAtIndex(final int index) {
        if (isInvalidIndex(index)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.contentcards.adapters.ContentCardAdapter$getCardAtIndex$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    List list;
                    StringBuilder append = new StringBuilder("Cannot return card at index: ").append(index).append(" in cards list of size: ");
                    list = this.cardData;
                    return append.append(list.size()).toString();
                }
            }, 3, (Object) null);
            return null;
        }
        return this.cardData.get(index);
    }

    public final boolean isAdapterPositionOnScreen(int adapterPosition) {
        return Math.min(this.layoutManager.findFirstVisibleItemPosition(), this.layoutManager.findFirstCompletelyVisibleItemPosition()) <= adapterPosition && adapterPosition <= Math.max(this.layoutManager.findLastVisibleItemPosition(), this.layoutManager.findLastCompletelyVisibleItemPosition());
    }

    public final void logImpression(final Card card) {
        if (card == null) {
            return;
        }
        if (!this.impressedCardIdsInternal.contains(card.getId())) {
            card.logImpression();
            this.impressedCardIdsInternal.add(card.getId());
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.contentcards.adapters.ContentCardAdapter$logImpression$1
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return Intrinsics.stringPlus("Logged impression for card ", Card.this.getId());
                }
            }, 2, (Object) null);
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.contentcards.adapters.ContentCardAdapter$logImpression$2
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return Intrinsics.stringPlus("Already counted impression for card ", Card.this.getId());
                }
            }, 2, (Object) null);
        }
        if (card.getWasViewedInternal()) {
            return;
        }
        card.setViewed(true);
    }

    private final boolean isInvalidIndex(int index) {
        return index < 0 || index >= this.cardData.size();
    }

    /* compiled from: ContentCardAdapter.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B!\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0018\u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0018\u0010\r\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0002J\b\u0010\u000e\u001a\u00020\nH\u0016J\b\u0010\u000f\u001a\u00020\nH\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/braze/ui/contentcards/adapters/ContentCardAdapter$CardListDiffCallback;", "Landroidx/recyclerview/widget/DiffUtil$Callback;", "oldCards", "", "Lcom/braze/models/cards/Card;", "newCards", "(Ljava/util/List;Ljava/util/List;)V", "areContentsTheSame", "", "oldItemPosition", "", "newItemPosition", "areItemsTheSame", "doItemsShareIds", "getNewListSize", "getOldListSize", "android-sdk-ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    private static final class CardListDiffCallback extends DiffUtil.Callback {
        private final List<Card> newCards;
        private final List<Card> oldCards;

        /* JADX WARN: Multi-variable type inference failed */
        public CardListDiffCallback(List<? extends Card> oldCards, List<? extends Card> newCards) {
            Intrinsics.checkNotNullParameter(oldCards, "oldCards");
            Intrinsics.checkNotNullParameter(newCards, "newCards");
            this.oldCards = oldCards;
            this.newCards = newCards;
        }

        @Override // androidx.recyclerview.widget.DiffUtil.Callback
        public int getOldListSize() {
            return this.oldCards.size();
        }

        @Override // androidx.recyclerview.widget.DiffUtil.Callback
        public int getNewListSize() {
            return this.newCards.size();
        }

        @Override // androidx.recyclerview.widget.DiffUtil.Callback
        public boolean areItemsTheSame(int oldItemPosition, int newItemPosition) {
            return doItemsShareIds(oldItemPosition, newItemPosition);
        }

        @Override // androidx.recyclerview.widget.DiffUtil.Callback
        public boolean areContentsTheSame(int oldItemPosition, int newItemPosition) {
            return doItemsShareIds(oldItemPosition, newItemPosition);
        }

        private final boolean doItemsShareIds(int oldItemPosition, int newItemPosition) {
            return Intrinsics.areEqual(this.oldCards.get(oldItemPosition).getId(), this.newCards.get(newItemPosition).getId());
        }
    }
}
