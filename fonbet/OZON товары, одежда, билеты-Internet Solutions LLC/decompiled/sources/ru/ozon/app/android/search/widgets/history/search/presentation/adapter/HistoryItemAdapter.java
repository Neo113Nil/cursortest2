package ru.ozon.app.android.search.widgets.history.search.presentation.adapter;

import Sc.o;
import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.t;
import com.google.android.flexbox.FlexboxLayoutManager;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.common.SearchUrlPrefetchService;
import ru.ozon.app.android.search.widgets.history.search.presentation.HistoryItem;
import ru.ozon.app.android.search.widgets.history.search.presentation.HistoryView;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.controls.tag.TagButtonView;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0006\b\u0001\u0018\u0000  2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001 B'\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001eR\"\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001f¨\u0006!"}, d2 = {"Lru/ozon/app/android/search/widgets/history/search/presentation/adapter/HistoryItemAdapter;", "Landroidx/recyclerview/widget/t;", "Lru/ozon/app/android/search/widgets/history/search/presentation/HistoryItem;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Lru/ozon/app/android/common/SearchUrlPrefetchService;", "searchUrlPrefetchService", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "<init>", "(Lru/ozon/app/android/common/SearchUrlPrefetchService;Lkotlin/jvm/functions/Function1;)V", "Lcom/google/android/flexbox/FlexboxLayoutManager$b;", "getFlexboxLayoutParams", "()Lcom/google/android/flexbox/FlexboxLayoutManager$b;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$C;", "holder", "position", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$C;I)V", "getItemViewType", "(I)I", "", "getItemId", "(I)J", "Lru/ozon/app/android/common/SearchUrlPrefetchService;", "Lkotlin/jvm/functions/Function1;", "Companion", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class HistoryItemAdapter extends t<HistoryItem, RecyclerView.C> {
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final SearchUrlPrefetchService searchUrlPrefetchService;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/search/widgets/history/search/presentation/adapter/HistoryItemAdapter$Companion;", "", "<init>", "()V", "HISTORY_BUTTON", "", "HISTORY_TAG", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HistoryItemAdapter(@NotNull SearchUrlPrefetchService searchUrlPrefetchService, Function1<? super AtomAction, Unit> function1) {
        super(new HistoryItemCallback());
        Intrinsics.checkNotNullParameter(searchUrlPrefetchService, "searchUrlPrefetchService");
        this.searchUrlPrefetchService = searchUrlPrefetchService;
        this.actionHandler = function1;
    }

    private final FlexboxLayoutManager.b getFlexboxLayoutParams() {
        FlexboxLayoutManager.b bVar = new FlexboxLayoutManager.b(-2, -2);
        HistoryView.Companion companion = HistoryView.INSTANCE;
        ((ViewGroup.MarginLayoutParams) bVar).bottomMargin = companion.getHISTORY_ITEM_PADDING();
        ((ViewGroup.MarginLayoutParams) bVar).leftMargin = companion.getHISTORY_ITEM_PADDING();
        ((ViewGroup.MarginLayoutParams) bVar).rightMargin = companion.getHISTORY_ITEM_PADDING();
        ((ViewGroup.MarginLayoutParams) bVar).topMargin = companion.getHISTORY_ITEM_PADDING();
        return bVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public long getItemId(int position) {
        HistoryItem item = getItem(position);
        if (item instanceof HistoryItem.ButtonVO) {
            return ((HistoryItem.ButtonVO) item).getId();
        }
        if (item instanceof HistoryItem.TagButtonVO) {
            return ((HistoryItem.TagButtonVO) item).getId();
        }
        throw new o();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int getItemViewType(int position) {
        HistoryItem item = getItem(position);
        if (item instanceof HistoryItem.ButtonVO) {
            return 1;
        }
        if (item instanceof HistoryItem.TagButtonVO) {
            return 2;
        }
        throw new o();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull RecyclerView.C holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        HistoryItem item = getItem(position);
        if (holder instanceof HistoryButtonItemViewHolder) {
            Intrinsics.g(item, "null cannot be cast to non-null type ru.ozon.app.android.search.widgets.history.search.presentation.HistoryItem.ButtonVO");
            ((HistoryButtonItemViewHolder) holder).bind((HistoryItem.ButtonVO) item, this.actionHandler);
        } else if (holder instanceof HistoryTagButtonItemViewHolder) {
            Intrinsics.g(item, "null cannot be cast to non-null type ru.ozon.app.android.search.widgets.history.search.presentation.HistoryItem.TagButtonVO");
            ((HistoryTagButtonItemViewHolder) holder).bind((HistoryItem.TagButtonVO) item, this.actionHandler);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public RecyclerView.C onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (viewType == 1) {
            Context context = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            ButtonV3View buttonV3View = new ButtonV3View(context, null, 0, 0, 14, null);
            buttonV3View.setLayoutParams(getFlexboxLayoutParams());
            return new HistoryButtonItemViewHolder(buttonV3View, this.searchUrlPrefetchService);
        }
        if (viewType != 2) {
            throw new IllegalArgumentException("invalid viewHolder type");
        }
        Context context2 = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        TagButtonView tagButtonView = new TagButtonView(context2, null, 0, 0, 14, null);
        tagButtonView.setLayoutParams(getFlexboxLayoutParams());
        return new HistoryTagButtonItemViewHolder(tagButtonView, this.searchUrlPrefetchService);
    }
}
