package ru.ozon.app.android.search.dialogsearchscreen.searchbar.tapTags;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.t;
import com.google.android.flexbox.FlexboxLayoutManager;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.common.SearchUrlPrefetchService;
import ru.ozon.app.android.search.dialogsearchscreen.searchbar.common.DialogTapTagCallback;
import ru.ozon.app.android.search.dialogsearchscreen.searchbar.common.DialogTapTagViewHolder;
import ru.ozon.app.android.search.widgets.dialogSearchBar.presentation.DialogSearchBarVO;
import ru.ozon.uni.android.controls.tag.TagButtonView;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B+\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0018R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0019R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001c¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/search/dialogsearchscreen/searchbar/tapTags/DialogTapTagsAdapter;", "Landroidx/recyclerview/widget/t;", "Lru/ozon/app/android/search/widgets/dialogSearchBar/presentation/DialogSearchBarVO$TapTagVO;", "Lru/ozon/app/android/search/dialogsearchscreen/searchbar/common/DialogTapTagViewHolder;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "Lru/ozon/app/android/common/SearchUrlPrefetchService;", "searchUrlPrefetchService", "", "isRedesignedSearchBar", "<init>", "(Lkotlin/jvm/functions/Function1;Lru/ozon/app/android/common/SearchUrlPrefetchService;Z)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/search/dialogsearchscreen/searchbar/common/DialogTapTagViewHolder;", "holder", "position", "onBindViewHolder", "(Lru/ozon/app/android/search/dialogsearchscreen/searchbar/common/DialogTapTagViewHolder;I)V", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/common/SearchUrlPrefetchService;", "Z", "dp6", "I", "dp8", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DialogTapTagsAdapter extends t<DialogSearchBarVO.TapTagVO, DialogTapTagViewHolder> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;
    private final int dp6;
    private final int dp8;
    private final boolean isRedesignedSearchBar;

    @NotNull
    private final SearchUrlPrefetchService searchUrlPrefetchService;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DialogTapTagsAdapter(@NotNull Function1<? super AtomAction, Unit> actionHandler, @NotNull SearchUrlPrefetchService searchUrlPrefetchService, boolean z11) {
        super(new DialogTapTagCallback());
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(searchUrlPrefetchService, "searchUrlPrefetchService");
        this.actionHandler = actionHandler;
        this.searchUrlPrefetchService = searchUrlPrefetchService;
        this.isRedesignedSearchBar = z11;
        this.dp6 = ResourceExtKt.toPx(6);
        this.dp8 = ResourceExtKt.toPx(8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull DialogTapTagViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        DialogSearchBarVO.TapTagVO item = getItem(position);
        Intrinsics.g(item, "null cannot be cast to non-null type ru.ozon.app.android.search.widgets.dialogSearchBar.presentation.DialogSearchBarVO.TapTagVO");
        holder.bind(item);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public DialogTapTagViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        TagButtonView tagButtonView = new TagButtonView(context, null, 0, 0, 14, null);
        FlexboxLayoutManager.b bVar = new FlexboxLayoutManager.b(-2, -2);
        int i11 = this.isRedesignedSearchBar ? this.dp6 : this.dp8;
        ((ViewGroup.MarginLayoutParams) bVar).rightMargin = i11;
        ((ViewGroup.MarginLayoutParams) bVar).bottomMargin = i11;
        tagButtonView.setLayoutParams(bVar);
        return new DialogTapTagViewHolder(tagButtonView, this.actionHandler, this.searchUrlPrefetchService);
    }
}
