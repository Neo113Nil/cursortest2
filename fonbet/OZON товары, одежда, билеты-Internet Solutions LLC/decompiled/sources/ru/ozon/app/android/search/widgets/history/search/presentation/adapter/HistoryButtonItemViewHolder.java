package ru.ozon.app.android.search.widgets.history.search.presentation.adapter;

import android.view.View;
import androidx.core.view.C5314e0;
import androidx.core.view.C5316f0;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.common.SearchUrlPrefetchService;
import ru.ozon.app.android.common.cache.handler.suggest.SuggestCacheGroup;
import ru.ozon.app.android.search.widgets.history.search.presentation.HistoryItem;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.ButtonV3HolderKt;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J+\u0010\u000e\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0011¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/search/widgets/history/search/presentation/adapter/HistoryButtonItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "view", "Lru/ozon/app/android/common/SearchUrlPrefetchService;", "searchUrlPrefetchService", "<init>", "(Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;Lru/ozon/app/android/common/SearchUrlPrefetchService;)V", "Lru/ozon/app/android/search/widgets/history/search/presentation/HistoryItem$ButtonVO;", "item", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "bind", "(Lru/ozon/app/android/search/widgets/history/search/presentation/HistoryItem$ButtonVO;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "Lru/ozon/app/android/common/SearchUrlPrefetchService;", "Companion", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class HistoryButtonItemViewHolder extends RecyclerView.C {

    @NotNull
    private final SearchUrlPrefetchService searchUrlPrefetchService;

    @NotNull
    private final ButtonV3View view;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/search/widgets/history/search/presentation/adapter/HistoryButtonItemViewHolder$Companion;", "", "<init>", "()V", "TEXT_VIEW_CONTENT_DESCRIPTION", "", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HistoryButtonItemViewHolder(@NotNull ButtonV3View view, @NotNull SearchUrlPrefetchService searchUrlPrefetchService) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(searchUrlPrefetchService, "searchUrlPrefetchService");
        this.view = view;
        this.searchUrlPrefetchService = searchUrlPrefetchService;
    }

    public final void bind(@NotNull HistoryItem.ButtonVO item, Function1<? super AtomAction, Unit> actionHandler) {
        ButtonV3DTO button;
        CommonControlSettings common;
        AtomActionDTO action;
        String link;
        Intrinsics.checkNotNullParameter(item, "item");
        if (item.getShouldPrefetch() && (button = item.getButton()) != null && (common = button.getCommon()) != null && (action = common.getAction()) != null && (link = action.getLink()) != null) {
            SearchUrlPrefetchService.DefaultImpls.prefetch$default(this.searchUrlPrefetchService, link, SuggestCacheGroup.INSTANCE, false, 4, null);
        }
        ButtonV3View buttonV3View = this.view;
        ButtonV3DTO button2 = item.getButton();
        if (button2 == null) {
            button2 = null;
        }
        ButtonV3HolderKt.bindOrGone(buttonV3View, button2, actionHandler);
        Iterator<View> it = C5316f0.b(this.view).iterator();
        while (true) {
            C5314e0 c5314e0 = (C5314e0) it;
            if (!c5314e0.hasNext()) {
                return;
            } else {
                ((View) c5314e0.next()).setContentDescription("ButtonV3.titleLabel");
            }
        }
    }
}
