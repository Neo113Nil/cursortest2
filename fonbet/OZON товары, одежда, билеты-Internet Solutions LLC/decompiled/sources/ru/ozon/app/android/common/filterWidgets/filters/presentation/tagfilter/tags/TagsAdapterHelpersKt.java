package ru.ozon.app.android.common.filterWidgets.filters.presentation.tagfilter.tags;

import android.content.Context;
import android.view.ViewGroup;
import com.google.android.flexbox.FlexboxLayoutManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.common.filterWidgets.filters.presentation.tagfilter.tags.TagsAdapter;
import ru.ozon.app.android.common.filterWidgets.filters.presentation.tagfilter.tags.viewholders.BaseTagViewHolder;
import ru.ozon.app.android.common.filterWidgets.filters.presentation.tagfilter.tags.viewholders.CrossColorTagViewHolder;
import ru.ozon.app.android.common.filterWidgets.filters.presentation.tagfilter.tags.viewholders.CrossTagViewHolder;
import ru.ozon.app.android.common.filterWidgets.filters.presentation.tagfilter.tags.viewholders.TagButtonItemViewHolder;
import ru.ozon.app.android.common.filterWidgets.filters.presentation.tagfilter.tags.viewholders.TagViewHolder;
import ru.ozon.app.android.storefront.filterWidgets.R$layout;
import ru.ozon.app.android.storefront.filterWidgets.databinding.WidgetFiltersTagFilterItemCrossColorTagBinding;
import ru.ozon.app.android.storefront.filterWidgets.databinding.WidgetFiltersTagFilterItemCrossTagBinding;
import ru.ozon.app.android.storefront.filterWidgets.databinding.WidgetFiltersTagFilterItemTagBinding;
import ru.ozon.uni.android.controls.tag.TagButtonView;
import ru.ozon.uni.android.uikit.extensions.view.ViewGroupExtKt;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.controls.tag.TagButtonDTO;
import ru.ozon.uni.atoms.data.tag.TagV3Atom;

@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000\u001a\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0001H\u0000¨\u0006\t"}, d2 = {"getTagViewType", "", "item", "Lru/ozon/uni/atoms/data/AtomDTO;", "createTagViewHolder", "Lru/ozon/app/android/common/filterWidgets/filters/presentation/tagfilter/tags/viewholders/BaseTagViewHolder;", "parent", "Landroid/view/ViewGroup;", "viewType", "filter-widgets_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class TagsAdapterHelpersKt {
    @NotNull
    public static final BaseTagViewHolder createTagViewHolder(@NotNull ViewGroup parent, int i11) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (i11 == R$layout.widget_filters_tag_filter_item_tag) {
            WidgetFiltersTagFilterItemTagBinding bind = WidgetFiltersTagFilterItemTagBinding.bind(ViewGroupExtKt.inflate(parent, i11));
            Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
            return new TagViewHolder(bind);
        }
        if (i11 == R$layout.widget_filters_tag_filter_item_cross_tag) {
            WidgetFiltersTagFilterItemCrossTagBinding bind2 = WidgetFiltersTagFilterItemCrossTagBinding.bind(ViewGroupExtKt.inflate(parent, i11));
            Intrinsics.checkNotNullExpressionValue(bind2, "bind(...)");
            return new CrossTagViewHolder(bind2);
        }
        if (i11 == R$layout.widget_filters_tag_filter_item_cross_color_tag) {
            WidgetFiltersTagFilterItemCrossColorTagBinding bind3 = WidgetFiltersTagFilterItemCrossColorTagBinding.bind(ViewGroupExtKt.inflate(parent, i11));
            Intrinsics.checkNotNullExpressionValue(bind3, "bind(...)");
            return new CrossColorTagViewHolder(bind3);
        }
        if (i11 != 0) {
            throw new IllegalArgumentException("invalid view type");
        }
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        TagButtonView tagButtonView = new TagButtonView(context, null, 0, 0, 14, null);
        FlexboxLayoutManager.b bVar = new FlexboxLayoutManager.b(-2, -2);
        TagsAdapter.Companion companion = TagsAdapter.INSTANCE;
        ((ViewGroup.MarginLayoutParams) bVar).leftMargin = companion.getDp4();
        ((ViewGroup.MarginLayoutParams) bVar).rightMargin = companion.getDp4();
        tagButtonView.setLayoutParams(bVar);
        return new TagButtonItemViewHolder(tagButtonView);
    }

    public static final int getTagViewType(@NotNull AtomDTO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        return item instanceof TagV3Atom.TagAtom ? R$layout.widget_filters_tag_filter_item_tag : item instanceof TagV3Atom.CrossTagAtom ? R$layout.widget_filters_tag_filter_item_cross_tag : item instanceof TagV3Atom.CrossColorTagAtom ? R$layout.widget_filters_tag_filter_item_cross_color_tag : item instanceof TagButtonDTO ? 0 : -1;
    }
}
