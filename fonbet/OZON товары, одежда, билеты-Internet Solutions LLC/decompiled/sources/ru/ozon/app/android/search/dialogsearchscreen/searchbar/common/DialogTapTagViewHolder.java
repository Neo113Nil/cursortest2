package ru.ozon.app.android.search.dialogsearchscreen.searchbar.common;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.common.SearchUrlPrefetchService;
import ru.ozon.app.android.common.cache.handler.dialogSearch.DialogTapTagsCacheGroup;
import ru.ozon.app.android.search.widgets.dialogSearchBar.presentation.DialogSearchBarVO;
import ru.ozon.uni.android.controls.tag.TagButtonView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.tag.TagButtonDTO;
import ru.ozon.uni.atoms.v3.holders.controls.tag.TagButtonHolderKt;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010R\"\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0011R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/search/dialogsearchscreen/searchbar/common/DialogTapTagViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Lru/ozon/uni/android/controls/tag/TagButtonView;", "view", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "Lru/ozon/app/android/common/SearchUrlPrefetchService;", "searchUrlPrefetchService", "<init>", "(Lru/ozon/uni/android/controls/tag/TagButtonView;Lkotlin/jvm/functions/Function1;Lru/ozon/app/android/common/SearchUrlPrefetchService;)V", "Lru/ozon/app/android/search/widgets/dialogSearchBar/presentation/DialogSearchBarVO$TapTagVO;", "item", "bind", "(Lru/ozon/app/android/search/widgets/dialogSearchBar/presentation/DialogSearchBarVO$TapTagVO;)V", "Lru/ozon/uni/android/controls/tag/TagButtonView;", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/common/SearchUrlPrefetchService;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DialogTapTagViewHolder extends RecyclerView.C {
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final SearchUrlPrefetchService searchUrlPrefetchService;

    @NotNull
    private final TagButtonView view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DialogTapTagViewHolder(@NotNull TagButtonView view, Function1<? super AtomAction, Unit> function1, @NotNull SearchUrlPrefetchService searchUrlPrefetchService) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(searchUrlPrefetchService, "searchUrlPrefetchService");
        this.view = view;
        this.actionHandler = function1;
        this.searchUrlPrefetchService = searchUrlPrefetchService;
    }

    public final void bind(@NotNull DialogSearchBarVO.TapTagVO item) {
        TagButtonDTO item2;
        CommonControlSettings common;
        AtomActionDTO action;
        String link;
        Intrinsics.checkNotNullParameter(item, "item");
        if (item.getShouldPrefetch() && (item2 = item.getItem()) != null && (common = item2.getCommon()) != null && (action = common.getAction()) != null && (link = action.getLink()) != null) {
            SearchUrlPrefetchService.DefaultImpls.prefetch$default(this.searchUrlPrefetchService, link, DialogTapTagsCacheGroup.INSTANCE, false, 4, null);
        }
        TagButtonHolderKt.bindOrGone(this.view, item.getItem(), this.actionHandler);
    }
}
