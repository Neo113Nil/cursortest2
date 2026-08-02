package ru.ozon.app.android.search.widgets.tapTags.v2.presentation.adapter;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.t;
import com.google.android.flexbox.FlexboxLayoutManager;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.search.R$id;
import ru.ozon.app.android.search.widgets.tapTags.v2.presentation.TapTagsV2View;
import ru.ozon.uni.android.controls.tag.TagButtonView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.tag.TagButtonDTO;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B)\u0012\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\"\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0016R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/search/widgets/tapTags/v2/presentation/adapter/TapTagV2Adapter;", "Landroidx/recyclerview/widget/t;", "Lru/ozon/uni/atoms/data/controls/tag/TagButtonDTO;", "Lru/ozon/app/android/search/widgets/tapTags/v2/presentation/adapter/TapTagV2ViewHolder;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "", "isRedesigned", "<init>", "(Lkotlin/jvm/functions/Function1;Z)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/search/widgets/tapTags/v2/presentation/adapter/TapTagV2ViewHolder;", "holder", "position", "onBindViewHolder", "(Lru/ozon/app/android/search/widgets/tapTags/v2/presentation/adapter/TapTagV2ViewHolder;I)V", "Lkotlin/jvm/functions/Function1;", "Z", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class TapTagV2Adapter extends t<TagButtonDTO, TapTagV2ViewHolder> {
    private final Function1<AtomAction, Unit> actionHandler;
    private final boolean isRedesigned;

    /* JADX WARN: Multi-variable type inference failed */
    public TapTagV2Adapter(Function1<? super AtomAction, Unit> function1, boolean z11) {
        super(new TapTagV2Callback());
        this.actionHandler = function1;
        this.isRedesigned = z11;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull TapTagV2ViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        TagButtonDTO item = getItem(position);
        Intrinsics.f(item);
        holder.bind(item, this.actionHandler);
        holder.itemView.setContentDescription(item.getText());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public TapTagV2ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        TagButtonView tagButtonView = new TagButtonView(context, null, 0, 0, 14, null);
        tagButtonView.setId(R$id.tapTagsV2Item);
        FlexboxLayoutManager.b bVar = new FlexboxLayoutManager.b(-2, -2);
        int redesigned_horizontal_item_padding = this.isRedesigned ? TapTagsV2View.INSTANCE.getREDESIGNED_HORIZONTAL_ITEM_PADDING() : TapTagsV2View.INSTANCE.getITEM_PADDING();
        ((ViewGroup.MarginLayoutParams) bVar).leftMargin = redesigned_horizontal_item_padding;
        ((ViewGroup.MarginLayoutParams) bVar).rightMargin = redesigned_horizontal_item_padding;
        ((ViewGroup.MarginLayoutParams) bVar).bottomMargin = this.isRedesigned ? TapTagsV2View.INSTANCE.getREDESIGNED_BOTTOM_PADDING() : TapTagsV2View.INSTANCE.getITEM_PADDING();
        ((ViewGroup.MarginLayoutParams) bVar).topMargin = TapTagsV2View.INSTANCE.getITEM_PADDING();
        tagButtonView.setLayoutParams(bVar);
        return new TapTagV2ViewHolder(tagButtonView);
    }
}
