package ru.ozon.app.android.search.dialogsearchscreen.searchbar.filter;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.search.dialogsearchscreen.searchbar.common.DialogTagButtonViewHolder;
import ru.ozon.app.android.search.dialogsearchscreen.searchbar.common.DialogTagItemCallback;
import ru.ozon.uni.android.controls.tag.TagButtonView;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.tag.TagButtonDTO;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001b\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/search/dialogsearchscreen/searchbar/filter/DialogFilterTagsAdapter;", "Landroidx/recyclerview/widget/t;", "Lru/ozon/uni/atoms/data/controls/tag/TagButtonDTO;", "Lru/ozon/app/android/search/dialogsearchscreen/searchbar/common/DialogTagButtonViewHolder;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/search/dialogsearchscreen/searchbar/common/DialogTagButtonViewHolder;", "holder", "position", "onBindViewHolder", "(Lru/ozon/app/android/search/dialogsearchscreen/searchbar/common/DialogTagButtonViewHolder;I)V", "Lkotlin/jvm/functions/Function1;", "layoutMargin", "I", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DialogFilterTagsAdapter extends t<TagButtonDTO, DialogTagButtonViewHolder> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;
    private final int layoutMargin;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DialogFilterTagsAdapter(@NotNull Function1<? super AtomAction, Unit> actionHandler) {
        super(new DialogTagItemCallback());
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        this.actionHandler = actionHandler;
        this.layoutMargin = ResourceExtKt.toPx(6);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull DialogTagButtonViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        TagButtonDTO item = getItem(position);
        Intrinsics.g(item, "null cannot be cast to non-null type ru.ozon.uni.atoms.data.controls.tag.TagButtonDTO");
        holder.bind(item);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public DialogTagButtonViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        TagButtonView tagButtonView = new TagButtonView(context, null, 0, 0, 14, null);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        marginLayoutParams.rightMargin = this.layoutMargin;
        tagButtonView.setLayoutParams(marginLayoutParams);
        return new DialogTagButtonViewHolder(tagButtonView, this.actionHandler);
    }
}
