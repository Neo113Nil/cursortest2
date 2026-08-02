package ru.ozon.app.android.fresh.main.widgets.scrollActionList.presentation;

import W10.c;
import WZ.l;
import android.os.Parcelable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.fresh.common.widgets.horizontalListWidget.AbstractHorizontalListViewHolder;
import ru.ozon.app.android.fresh.main.widgets.scrollActionList.domain.ScrollActionListVO;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B+\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0018\u001a\u00020\u00132\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001bH\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ'\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020\u001fH\u0014¢\u0006\u0004\b\u001d\u0010!J)\u0010&\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\"2\b\u0010%\u001a\u0004\u0018\u00010$H\u0016¢\u0006\u0004\b&\u0010'R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010(R\u0018\u0010\b\u001a\u00060\u0006j\u0002`\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010)R \u0010,\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u00130*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0018\u00101\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u001a\u00104\u001a\u0002038\u0014X\u0094\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107¨\u00068"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/scrollActionList/presentation/ScrollActionListRootViewHolder;", "Lru/ozon/app/android/fresh/common/widgets/horizontalListWidget/AbstractHorizontalListViewHolder;", "Lru/ozon/app/android/fresh/main/widgets/scrollActionList/domain/ScrollActionListVO;", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "", "shouldPreCreateViews", "<init>", "(Landroidx/recyclerview/widget/RecyclerView;LWZ/l;Lru/ozon/app/android/composer/ComposerReferences;Z)V", "Lru/ozon/app/android/fresh/main/widgets/scrollActionList/domain/ScrollActionListVO$PaddingsVO;", "paddings", "Landroid/os/Parcelable;", "newScrollState", "", "setupPaddings", "(Lru/ozon/app/android/fresh/main/widgets/scrollActionList/domain/ScrollActionListVO$PaddingsVO;Landroid/os/Parcelable;)V", "", "backgroundColor", "setBackgroundColor", "(Ljava/lang/String;)V", "item", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/fresh/main/widgets/scrollActionList/domain/ScrollActionListVO;Ll20/d;)V", "", "payload", "(Lru/ozon/app/android/fresh/main/widgets/scrollActionList/domain/ScrollActionListVO;Ll20/d;Ljava/lang/Object;)V", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/fresh/main/widgets/scrollActionList/domain/ScrollActionListVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Landroidx/recyclerview/widget/RecyclerView;", "LWZ/l;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/fresh/main/widgets/scrollActionList/presentation/ScrollActionItemDecorator;", "decorator", "Lru/ozon/app/android/fresh/main/widgets/scrollActionList/presentation/ScrollActionItemDecorator;", "oldItem", "Lru/ozon/app/android/fresh/main/widgets/scrollActionList/domain/ScrollActionListVO;", "Lru/ozon/app/android/fresh/main/widgets/scrollActionList/presentation/ScrollActionBadgeListAdapter;", "adapter", "Lru/ozon/app/android/fresh/main/widgets/scrollActionList/presentation/ScrollActionBadgeListAdapter;", "getAdapter", "()Lru/ozon/app/android/fresh/main/widgets/scrollActionList/presentation/ScrollActionBadgeListAdapter;", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ScrollActionListRootViewHolder extends AbstractHorizontalListViewHolder<ScrollActionListVO, BadgeDTO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final ScrollActionBadgeListAdapter adapter;

    @NotNull
    private final ScrollActionItemDecorator decorator;
    private ScrollActionListVO oldItem;

    @NotNull
    private final RecyclerView recyclerView;

    @NotNull
    private final l tokenizedAnalytics;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollActionListRootViewHolder(@NotNull RecyclerView recyclerView, @NotNull l tokenizedAnalytics, @NotNull ComposerReferences refs, boolean z11) {
        super(recyclerView, refs);
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(refs, "refs");
        this.recyclerView = recyclerView;
        this.tokenizedAnalytics = tokenizedAnalytics;
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(refs, this).buildHandler();
        this.actionHandler = buildHandler;
        ScrollActionItemDecorator scrollActionItemDecorator = new ScrollActionItemDecorator(new ScrollActionListRootViewHolder$decorator$1(this));
        this.decorator = scrollActionItemDecorator;
        this.adapter = new ScrollActionBadgeListAdapter(z11, buildHandler);
        recyclerView.setAdapter(getAdapter());
        recyclerView.addItemDecoration(scrollActionItemDecorator);
    }

    private final void setBackgroundColor(String backgroundColor) {
        this.recyclerView.setBackgroundColor(StyleParser.INSTANCE.parseColor(getContext(), backgroundColor, UniColors.LAYER_FLOOR_1.getResId()));
    }

    private final void setupPaddings(ScrollActionListVO.PaddingsVO paddings, Parcelable newScrollState) {
        this.recyclerView.setPadding(paddings.getHorizontal(), paddings.getTop(), paddings.getHorizontal(), paddings.getBottom());
        this.recyclerView.invalidateItemDecorations();
        if (newScrollState == null) {
            this.recyclerView.scrollToPosition(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.app.android.fresh.common.widgets.horizontalListWidget.AbstractHorizontalListViewHolder
    @NotNull
    public t<BadgeDTO, ?> getAdapter() {
        return this.adapter;
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull ScrollActionListVO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        super.trackView((ScrollActionListRootViewHolder) item, trackingData, viewedPond);
        WZ.t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, tokenizedEvent, null, 2, null);
        }
        this.recyclerView.setContentDescription("scrollActionListWidget");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull ScrollActionListVO item, @NotNull d info) {
        ScrollActionListRootViewHolder scrollActionListRootViewHolder;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        ScrollActionListVO scrollActionListVO = this.oldItem;
        if (scrollActionListVO != null && scrollActionListVO.getId() == item.getId()) {
            String backgroundColor = item.getBackgroundColor();
            ScrollActionListVO scrollActionListVO2 = this.oldItem;
            if (!Intrinsics.d(backgroundColor, scrollActionListVO2 != null ? scrollActionListVO2.getBackgroundColor() : null)) {
                setBackgroundColor(item.getBackgroundColor());
            }
            ScrollActionListVO.PaddingsVO paddings = item.getPaddings();
            ScrollActionListVO scrollActionListVO3 = this.oldItem;
            if (!Intrinsics.d(paddings, scrollActionListVO3 != null ? scrollActionListVO3.getPaddings() : null)) {
                setupPaddings(item.getPaddings(), item.getScrollState());
            }
            List<BadgeDTO> badges = item.getBadges();
            ScrollActionListVO scrollActionListVO4 = this.oldItem;
            if (Intrinsics.d(badges, scrollActionListVO4 != null ? scrollActionListVO4.getBadges() : null)) {
                Parcelable scrollState = item.getScrollState();
                ScrollActionListVO scrollActionListVO5 = this.oldItem;
                if (Intrinsics.d(scrollState, scrollActionListVO5 != null ? scrollActionListVO5.getScrollState() : null)) {
                    scrollActionListRootViewHolder = this;
                }
            }
            scrollActionListRootViewHolder = this;
            AbstractHorizontalListViewHolder.submitList$default(scrollActionListRootViewHolder, item.getBadges(), item.getScrollState(), null, 4, null);
        } else {
            scrollActionListRootViewHolder = this;
            setBackgroundColor(item.getBackgroundColor());
            setupPaddings(item.getPaddings(), item.getScrollState());
            AbstractHorizontalListViewHolder.submitList$default(scrollActionListRootViewHolder, item.getBadges(), item.getScrollState(), null, 4, null);
        }
        scrollActionListRootViewHolder.oldItem = item;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull ScrollActionListVO item, @NotNull d info, @NotNull Object payload) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(payload, "payload");
        ScrollActionListVO scrollActionListVO = payload instanceof ScrollActionListVO ? (ScrollActionListVO) payload : null;
        if (scrollActionListVO == null) {
            return;
        }
        this.oldItem = scrollActionListVO;
        bind(item, info);
    }
}
