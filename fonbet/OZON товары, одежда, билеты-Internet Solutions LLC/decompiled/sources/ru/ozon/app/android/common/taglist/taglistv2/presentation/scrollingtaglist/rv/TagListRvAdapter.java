package ru.ozon.app.android.common.taglist.taglistv2.presentation.scrollingtaglist.rv;

import android.view.ViewGroup;
import androidx.lifecycle.J;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.common.ui.taglist.R$layout;
import ru.ozon.app.android.uikit.view.recycler.adapter.lifecycle.LifecycleListAdapter;
import ru.ozon.uni.android.uikit.extensions.view.ViewGroupExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.tag.TagV3Atom;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B#\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0014\u0010\u0015R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/common/taglist/taglistv2/presentation/scrollingtaglist/rv/TagListRvAdapter;", "Lru/ozon/app/android/uikit/view/recycler/adapter/lifecycle/LifecycleListAdapter;", "Lru/ozon/uni/atoms/data/tag/TagV3Atom$TagAtom;", "Lru/ozon/app/android/common/taglist/taglistv2/presentation/scrollingtaglist/rv/TagRvItemViewHolder;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "Landroidx/lifecycle/J;", "lifecycleOwner", "<init>", "(Lkotlin/jvm/functions/Function1;Landroidx/lifecycle/J;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/common/taglist/taglistv2/presentation/scrollingtaglist/rv/TagRvItemViewHolder;", "holder", "position", "onBindViewHolder", "(Lru/ozon/app/android/common/taglist/taglistv2/presentation/scrollingtaglist/rv/TagRvItemViewHolder;I)V", "Lkotlin/jvm/functions/Function1;", "taglist_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class TagListRvAdapter extends LifecycleListAdapter<TagV3Atom.TagAtom, TagRvItemViewHolder> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TagListRvAdapter(@NotNull Function1<? super AtomAction, Unit> actionHandler, @NotNull J lifecycleOwner) {
        super(new TagAtomDiffUtil(), lifecycleOwner, null, 4, null);
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        this.actionHandler = actionHandler;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull TagRvItemViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        TagV3Atom.TagAtom item = getItem(position);
        Intrinsics.checkNotNullExpressionValue(item, "getItem(...)");
        holder.bindHolder(item, this.actionHandler);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public TagRvItemViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new TagRvItemViewHolder(ViewGroupExtKt.inflate(parent, R$layout.tag_item_view));
    }
}
