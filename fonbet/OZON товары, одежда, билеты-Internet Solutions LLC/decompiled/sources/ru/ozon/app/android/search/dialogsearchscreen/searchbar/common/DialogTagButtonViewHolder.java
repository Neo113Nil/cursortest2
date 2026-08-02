package ru.ozon.app.android.search.dialogsearchscreen.searchbar.common;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.controls.tag.TagButtonView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.tag.TagButtonDTO;
import ru.ozon.uni.atoms.v3.holders.controls.tag.TagButtonHolderKt;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000eR\"\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/search/dialogsearchscreen/searchbar/common/DialogTagButtonViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Lru/ozon/uni/android/controls/tag/TagButtonView;", "view", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "<init>", "(Lru/ozon/uni/android/controls/tag/TagButtonView;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/uni/atoms/data/controls/tag/TagButtonDTO;", "item", "bind", "(Lru/ozon/uni/atoms/data/controls/tag/TagButtonDTO;)V", "Lru/ozon/uni/android/controls/tag/TagButtonView;", "Lkotlin/jvm/functions/Function1;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DialogTagButtonViewHolder extends RecyclerView.C {
    public static final int $stable = TagButtonView.$stable;
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final TagButtonView view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DialogTagButtonViewHolder(@NotNull TagButtonView view, Function1<? super AtomAction, Unit> function1) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        this.view = view;
        this.actionHandler = function1;
    }

    public final void bind(@NotNull TagButtonDTO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        TagButtonHolderKt.bindOrGone(this.view, item, this.actionHandler);
    }
}
