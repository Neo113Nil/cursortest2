package ru.ozon.app.android.fresh.unsorted.widgets.imageBadgeList.presentation;

import Sc.InterfaceC4008j;
import Sc.k;
import W10.c;
import WZ.l;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.fresh.common.widgets.horizontalListWidget.AbstractHorizontalListViewHolder;
import ru.ozon.app.android.fresh.unsorted.widgets.imageBadgeList.domain.ImageBadgeListVO;
import ru.ozon.app.android.fresh.unsorted.widgets.imageBadgeList.presentation.adapter.ImageBadgeItemDecorator;
import ru.ozon.app.android.fresh.unsorted.widgets.imageBadgeList.presentation.adapter.ImageBadgeListAdapter;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B#\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0011\u0010\u0012J)\u0010\u0017\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0019R\u0018\u0010\b\u001a\u00060\u0006j\u0002`\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001aR\u001b\u0010 \u001a\u00020\u001b8TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR \u0010#\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00100!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/imageBadgeList/presentation/ImageBadgeListViewHolder;", "Lru/ozon/app/android/fresh/common/widgets/horizontalListWidget/AbstractHorizontalListViewHolder;", "Lru/ozon/app/android/fresh/unsorted/widgets/imageBadgeList/domain/ImageBadgeListVO;", "Lru/ozon/app/android/fresh/unsorted/widgets/imageBadgeList/domain/ImageBadgeListVO$ImageBadge;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "<init>", "(Landroidx/recyclerview/widget/RecyclerView;LWZ/l;Lru/ozon/app/android/composer/ComposerReferences;)V", "item", "Ll20/d;", "info", "", "bind", "(Lru/ozon/app/android/fresh/unsorted/widgets/imageBadgeList/domain/ImageBadgeListVO;Ll20/d;)V", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/fresh/unsorted/widgets/imageBadgeList/domain/ImageBadgeListVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Landroidx/recyclerview/widget/RecyclerView;", "LWZ/l;", "Lru/ozon/app/android/fresh/unsorted/widgets/imageBadgeList/presentation/adapter/ImageBadgeListAdapter;", "adapter$delegate", "LSc/j;", "getAdapter", "()Lru/ozon/app/android/fresh/unsorted/widgets/imageBadgeList/presentation/adapter/ImageBadgeListAdapter;", "adapter", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ImageBadgeListViewHolder extends AbstractHorizontalListViewHolder<ImageBadgeListVO, ImageBadgeListVO.ImageBadge> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    /* renamed from: adapter$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j adapter;

    @NotNull
    private final RecyclerView recyclerView;

    @NotNull
    private final l tokenizedAnalytics;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.fresh.unsorted.widgets.imageBadgeList.presentation.ImageBadgeListViewHolder$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function0<Integer> {
        AnonymousClass1() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function0
        public final Integer invoke() {
            ImageBadgeListVO.PaddingsVO paddings;
            ImageBadgeListVO imageBadgeListVO = (ImageBadgeListVO) ImageBadgeListViewHolder.this.getBoundData();
            return Integer.valueOf((imageBadgeListVO == null || (paddings = imageBadgeListVO.getPaddings()) == null) ? 0 : paddings.getBetween());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageBadgeListViewHolder(@NotNull RecyclerView recyclerView, @NotNull l tokenizedAnalytics, @NotNull ComposerReferences refs) {
        super(recyclerView, refs);
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(refs, "refs");
        this.recyclerView = recyclerView;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.adapter = k.b(new ImageBadgeListViewHolder$adapter$2(this));
        this.actionHandler = new ActionHandler.Builder(refs, this).buildHandler();
        recyclerView.addItemDecoration(new ImageBadgeItemDecorator(new AnonymousClass1()));
        recyclerView.setAdapter(getAdapter());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull ImageBadgeListVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        AbstractHorizontalListViewHolder.submitList$default(this, item.getItems(), item.getScrollState(), null, 4, null);
        ImageBadgeListVO.PaddingsVO paddings = item.getPaddings();
        this.recyclerView.setPadding(paddings.getLeft(), paddings.getTop(), paddings.getRight(), paddings.getBottom());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.app.android.fresh.common.widgets.horizontalListWidget.AbstractHorizontalListViewHolder
    @NotNull
    public t<ImageBadgeListVO.ImageBadge, ?> getAdapter() {
        return (ImageBadgeListAdapter) this.adapter.getValue();
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull ImageBadgeListVO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        super.trackView((ImageBadgeListViewHolder) item, trackingData, viewedPond);
        WZ.t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, tokenizedEvent, null, 2, null);
        }
    }
}
