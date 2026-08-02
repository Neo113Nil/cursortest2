package ru.ozon.app.android.common.taglist.taglistv2.presentation.scrollingtaglist;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.common.taglist.common.TagListDecorator;
import ru.ozon.app.android.common.taglist.taglistv2.presentation.scrollingtaglist.rv.TagListRvAdapter;
import ru.ozon.app.android.common.ui.taglist.databinding.WidgetScrollingTagListBinding;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ#\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u00022\n\u0010\r\u001a\u00060\u000bj\u0002`\fH\u0014¢\u0006\u0004\b\u000f\u0010\u0010R#\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000e0\u00118\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0018\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/common/taglist/taglistv2/presentation/scrollingtaglist/ScrollingTagListViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/common/taglist/taglistv2/presentation/scrollingtaglist/ScrollingTagListVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "composerReferences", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;)V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "", "bind", "(Lru/ozon/app/android/common/taglist/taglistv2/presentation/scrollingtaglist/ScrollingTagListVO;Ll20/d;)V", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "getActionHandler", "()Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/common/taglist/taglistv2/presentation/scrollingtaglist/rv/TagListRvAdapter;", "tagListAdapter", "Lru/ozon/app/android/common/taglist/taglistv2/presentation/scrollingtaglist/rv/TagListRvAdapter;", "getTagListAdapter", "()Lru/ozon/app/android/common/taglist/taglistv2/presentation/scrollingtaglist/rv/TagListRvAdapter;", "Lru/ozon/app/android/common/ui/taglist/databinding/WidgetScrollingTagListBinding;", "binding", "Lru/ozon/app/android/common/ui/taglist/databinding/WidgetScrollingTagListBinding;", "taglist_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ScrollingTagListViewHolder extends k<ScrollingTagListVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final WidgetScrollingTagListBinding binding;

    @NotNull
    private final TagListRvAdapter tagListAdapter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollingTagListViewHolder(@NotNull View containerView, @NotNull ComposerReferences composerReferences) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(composerReferences, "composerReferences");
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(composerReferences, this).buildHandler();
        this.actionHandler = buildHandler;
        TagListRvAdapter tagListRvAdapter = new TagListRvAdapter(buildHandler, this);
        this.tagListAdapter = tagListRvAdapter;
        WidgetScrollingTagListBinding bind = WidgetScrollingTagListBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        RecyclerView recyclerView = bind.tagListRv;
        recyclerView.setAdapter(tagListRvAdapter);
        int i11 = 0;
        recyclerView.addItemDecoration(new TagListDecorator(i11, i11, 3, null));
        recyclerView.setItemAnimator(null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull ScrollingTagListVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.tagListAdapter.submitList(item.getTags());
    }
}
