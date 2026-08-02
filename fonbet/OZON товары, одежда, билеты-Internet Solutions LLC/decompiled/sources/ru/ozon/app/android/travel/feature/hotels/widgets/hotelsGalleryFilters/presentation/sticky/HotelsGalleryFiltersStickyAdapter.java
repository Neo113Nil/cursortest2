package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFilters.presentation.sticky;

import WZ.l;
import WZ.t;
import android.content.Context;
import android.view.ViewGroup;
import androidx.lifecycle.J;
import androidx.recyclerview.widget.i;
import gk0.q;
import java.util.ArrayList;
import java.util.List;
import jk0.i;
import jk0.j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFilters.presentation.HotelsGalleryFiltersVI;
import ru.ozon.uni.android.controls.tag.TagButtonView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.tag.TagButtonDTO;
import ru.ozon.uni.atoms.v3.holders.controls.tag.TagButtonHolderKt;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002'(B3\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u001a\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\t0\u0006\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u001b\u001a\u00020\t2\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\u0010\u001a\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001d\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010\u001f\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0007¢\u0006\u0004\b\u001f\u0010\u001eR(\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\t0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010 R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010!R\u0016\u0010\"\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010$\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010&\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010%¨\u0006)"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFilters/presentation/sticky/HotelsGalleryFiltersStickyAdapter;", "Ljk0/i;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFilters/presentation/HotelsGalleryFiltersVI$StickyFiltersItem;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFilters/presentation/sticky/HotelsGalleryFiltersStickyAdapter$StickyFilterViewHolder;", "Landroidx/lifecycle/J;", "lifecycleOwner", "Lkotlin/Function2;", "", "Lru/ozon/uni/atoms/af/AtomAction;", "", "onStickyItemClick", "LWZ/l;", "tokenizedAnalytics", "<init>", "(Landroidx/lifecycle/J;Lkotlin/jvm/functions/Function2;LWZ/l;)V", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFilters/presentation/sticky/HotelsGalleryFiltersStickyAdapter$StickyFilterViewHolder;", "holder", "position", "onBindViewHolder", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFilters/presentation/sticky/HotelsGalleryFiltersStickyAdapter$StickyFilterViewHolder;I)V", "Lru/ozon/uni/atoms/data/controls/tag/TagButtonDTO;", "selected", "default", "setSelectionStyles", "(Lru/ozon/uni/atoms/data/controls/tag/TagButtonDTO;Lru/ozon/uni/atoms/data/controls/tag/TagButtonDTO;)V", "setInitialSelectedPosition", "(I)V", "setSelectedItem", "Lkotlin/jvm/functions/Function2;", "LWZ/l;", "selectedPosition", "I", "selectedTagButton", "Lru/ozon/uni/atoms/data/controls/tag/TagButtonDTO;", "defaultTagButton", "DiffCallback", "StickyFilterViewHolder", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsGalleryFiltersStickyAdapter extends i<HotelsGalleryFiltersVI.StickyFiltersItem, StickyFilterViewHolder> {
    private TagButtonDTO defaultTagButton;

    @NotNull
    private final Function2<Integer, AtomAction, Unit> onStickyItemClick;
    private int selectedPosition;
    private TagButtonDTO selectedTagButton;

    @NotNull
    private final l tokenizedAnalytics;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFilters/presentation/sticky/HotelsGalleryFiltersStickyAdapter$DiffCallback;", "Landroidx/recyclerview/widget/i$d;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFilters/presentation/HotelsGalleryFiltersVI$StickyFiltersItem;", "<init>", "()V", "oldItem", "newItem", "", "areItemsTheSame", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFilters/presentation/HotelsGalleryFiltersVI$StickyFiltersItem;Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFilters/presentation/HotelsGalleryFiltersVI$StickyFiltersItem;)Z", "areContentsTheSame", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class DiffCallback extends i.d<HotelsGalleryFiltersVI.StickyFiltersItem> {

        @NotNull
        public static final DiffCallback INSTANCE = new DiffCallback();

        private DiffCallback() {
        }

        @Override // androidx.recyclerview.widget.i.d
        public boolean areContentsTheSame(@NotNull HotelsGalleryFiltersVI.StickyFiltersItem oldItem, @NotNull HotelsGalleryFiltersVI.StickyFiltersItem newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return Intrinsics.d(oldItem, newItem);
        }

        @Override // androidx.recyclerview.widget.i.d
        public boolean areItemsTheSame(@NotNull HotelsGalleryFiltersVI.StickyFiltersItem oldItem, @NotNull HotelsGalleryFiltersVI.StickyFiltersItem newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return oldItem.getId() == newItem.getId();
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0001\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u001a\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00070\u0004\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0005¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012R(\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00070\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0013R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0014R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0017\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFilters/presentation/sticky/HotelsGalleryFiltersStickyAdapter$StickyFilterViewHolder;", "Ljk0/j;", "Lru/ozon/uni/android/controls/tag/TagButtonView;", "view", "Lkotlin/Function2;", "", "Lru/ozon/uni/atoms/af/AtomAction;", "", "onItemClick", "LWZ/l;", "tokenizedAnalytics", "<init>", "(Lru/ozon/uni/android/controls/tag/TagButtonView;Lkotlin/jvm/functions/Function2;LWZ/l;)V", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFilters/presentation/HotelsGalleryFiltersVI$StickyFiltersItem;", "item", "position", "bind", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFilters/presentation/HotelsGalleryFiltersVI$StickyFiltersItem;I)V", "Lru/ozon/uni/android/controls/tag/TagButtonView;", "Lkotlin/jvm/functions/Function2;", "LWZ/l;", "boundData", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFilters/presentation/HotelsGalleryFiltersVI$StickyFiltersItem;", "currentPosition", "I", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class StickyFilterViewHolder extends j {
        private HotelsGalleryFiltersVI.StickyFiltersItem boundData;
        private int currentPosition;

        @NotNull
        private final Function2<Integer, AtomAction, Unit> onItemClick;

        @NotNull
        private final l tokenizedAnalytics;

        @NotNull
        private final TagButtonView view;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public StickyFilterViewHolder(@NotNull TagButtonView view, @NotNull Function2<? super Integer, ? super AtomAction, Unit> onItemClick, @NotNull l tokenizedAnalytics) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(onItemClick, "onItemClick");
            Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
            this.view = view;
            this.onItemClick = onItemClick;
            this.tokenizedAnalytics = tokenizedAnalytics;
            this.currentPosition = -1;
        }

        public final void bind(@NotNull HotelsGalleryFiltersVI.StickyFiltersItem item, int position) {
            t tokenizedEvent;
            Intrinsics.checkNotNullParameter(item, "item");
            this.currentPosition = position;
            this.boundData = item;
            TagButtonHolderKt.bind(this.view, item.getTagButton(), new HotelsGalleryFiltersStickyAdapter$StickyFilterViewHolder$bind$1(this));
            HotelsGalleryFiltersVI.StickyFiltersItem stickyFiltersItem = this.boundData;
            if (stickyFiltersItem == null || stickyFiltersItem.getIsViewEventSent()) {
                return;
            }
            HotelsGalleryFiltersVI.StickyFiltersItem stickyFiltersItem2 = this.boundData;
            if (stickyFiltersItem2 != null && (tokenizedEvent = stickyFiltersItem2.getTokenizedEvent()) != null) {
                TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, tokenizedEvent, null, 2, null);
            }
            HotelsGalleryFiltersVI.StickyFiltersItem stickyFiltersItem3 = this.boundData;
            if (stickyFiltersItem3 != null) {
                stickyFiltersItem3.setViewEventSent(true);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HotelsGalleryFiltersStickyAdapter(@NotNull J lifecycleOwner, @NotNull Function2<? super Integer, ? super AtomAction, Unit> onStickyItemClick, @NotNull l tokenizedAnalytics) {
        super(DiffCallback.INSTANCE, lifecycleOwner, null, 4, null);
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(onStickyItemClick, "onStickyItemClick");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.onStickyItemClick = onStickyItemClick;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.selectedPosition = -1;
    }

    public final void setInitialSelectedPosition(int position) {
        this.selectedPosition = position;
    }

    public final void setSelectedItem(int position) {
        int i11 = this.selectedPosition;
        if (i11 == position) {
            return;
        }
        this.selectedPosition = position;
        List<HotelsGalleryFiltersVI.StickyFiltersItem> currentList = getCurrentList();
        Intrinsics.checkNotNullExpressionValue(currentList, "getCurrentList(...)");
        List<HotelsGalleryFiltersVI.StickyFiltersItem> list = currentList;
        ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
        int i12 = 0;
        for (Object obj : list) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                C7714v.O0();
                throw null;
            }
            HotelsGalleryFiltersVI.StickyFiltersItem stickyFiltersItem = (HotelsGalleryFiltersVI.StickyFiltersItem) obj;
            if (i12 == position) {
                stickyFiltersItem = stickyFiltersItem.withSelected(true, this.selectedTagButton, this.defaultTagButton);
            } else if (i12 == i11) {
                stickyFiltersItem = stickyFiltersItem.withSelected(false, this.selectedTagButton, this.defaultTagButton);
            }
            arrayList.add(stickyFiltersItem);
            i12 = i13;
        }
        if (arrayList.equals(getCurrentList())) {
            return;
        }
        submitList(arrayList);
    }

    public final void setSelectionStyles(TagButtonDTO selected, TagButtonDTO r22) {
        this.selectedTagButton = selected;
        this.defaultTagButton = r22;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull StickyFilterViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        HotelsGalleryFiltersVI.StickyFiltersItem item = getItem(position);
        Intrinsics.checkNotNullExpressionValue(item, "getItem(...)");
        holder.bind(item, position);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public StickyFilterViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        TagButtonView tagButtonView = (TagButtonView) q.f64554a.i(N.b(TagButtonView.class), parent.getContext());
        if (tagButtonView == null) {
            Context context = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            tagButtonView = new TagButtonView(context, null, 0, 0, 14, null);
        }
        tagButtonView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        return new StickyFilterViewHolder(tagButtonView, this.onStickyItemClick, this.tokenizedAnalytics);
    }
}
