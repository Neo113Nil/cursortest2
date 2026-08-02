package ru.ozon.app.android.ugc.widgets.reviewsFilter.presentation.adapter;

import Sc.o;
import Xc.a;
import Xc.b;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.i;
import androidx.recyclerview.widget.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.ugc.core.widgets.selectionItemDescription.data.SelectionItemDescriptionDTO;
import ru.ozon.app.android.ugc.widgets.reviewsFilter.presentation.ReviewsFilterVO;
import ru.ozon.app.android.ugc.widgets.reviewsFilter.presentation.ReviewsFilterVO.ReviewsFilterItemVO;
import ru.ozon.app.android.ugc.widgets.reviewsFilter.presentation.adapter.vh.ReviewsFilterItemViewHolder;
import ru.ozon.app.android.ugc.widgets.reviewsFilter.presentation.adapter.vh.ReviewsFilterProductViewHolder;
import ru.ozon.app.android.ugc.widgets.reviewsFilter.presentation.adapter.vh.ReviewsFilterTitleViewHolder;
import ru.ozon.app.android.ugc.widgets.reviewsFilter.presentation.adapter.vh.ReviewsFilterVH;
import ru.ozon.uni.android.atom.aspect.AspectView;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0001\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0003:\u0002\u0018\u0019B\u001b\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\t\u0010\nJ%\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0015\u001a\u00020\u00072\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0011\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0015\u0010\u0016R \u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0017¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewsFilter/presentation/adapter/ReviewsFilterListAdapter;", "Lru/ozon/app/android/ugc/widgets/reviewsFilter/presentation/ReviewsFilterVO$ReviewsFilterItemVO;", "T", "Landroidx/recyclerview/widget/t;", "Lru/ozon/app/android/ugc/widgets/reviewsFilter/presentation/adapter/vh/ReviewsFilterVH;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/ugc/widgets/reviewsFilter/presentation/adapter/vh/ReviewsFilterVH;", "position", "getItemViewType", "(I)I", "holder", "onBindViewHolder", "(Lru/ozon/app/android/ugc/widgets/reviewsFilter/presentation/adapter/vh/ReviewsFilterVH;I)V", "Lkotlin/jvm/functions/Function1;", "DiffCallback", "ViewType", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ReviewsFilterListAdapter<T extends ReviewsFilterVO.ReviewsFilterItemVO> extends t<ReviewsFilterVO.ReviewsFilterItemVO, ReviewsFilterVH<T>> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\bÂ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewsFilter/presentation/adapter/ReviewsFilterListAdapter$DiffCallback;", "Landroidx/recyclerview/widget/i$d;", "Lru/ozon/app/android/ugc/widgets/reviewsFilter/presentation/ReviewsFilterVO$ReviewsFilterItemVO;", "<init>", "()V", "oldItem", "newItem", "", "areItemsTheSame", "(Lru/ozon/app/android/ugc/widgets/reviewsFilter/presentation/ReviewsFilterVO$ReviewsFilterItemVO;Lru/ozon/app/android/ugc/widgets/reviewsFilter/presentation/ReviewsFilterVO$ReviewsFilterItemVO;)Z", "areContentsTheSame", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class DiffCallback extends i.d<ReviewsFilterVO.ReviewsFilterItemVO> {

        @NotNull
        public static final DiffCallback INSTANCE = new DiffCallback();

        private DiffCallback() {
        }

        @Override // androidx.recyclerview.widget.i.d
        public boolean areContentsTheSame(@NotNull ReviewsFilterVO.ReviewsFilterItemVO oldItem, @NotNull ReviewsFilterVO.ReviewsFilterItemVO newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return Intrinsics.d(oldItem, newItem);
        }

        @Override // androidx.recyclerview.widget.i.d
        public boolean areItemsTheSame(@NotNull ReviewsFilterVO.ReviewsFilterItemVO oldItem, @NotNull ReviewsFilterVO.ReviewsFilterItemVO newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return oldItem.getId() == newItem.getId();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewsFilter/presentation/adapter/ReviewsFilterListAdapter$ViewType;", "", "<init>", "(Ljava/lang/String;I)V", SelectionItemDescriptionDTO.TITLE, "IMAGE", "ITEM", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class ViewType {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ ViewType[] $VALUES;
        public static final ViewType TITLE = new ViewType(SelectionItemDescriptionDTO.TITLE, 0);
        public static final ViewType IMAGE = new ViewType("IMAGE", 1);
        public static final ViewType ITEM = new ViewType("ITEM", 2);

        private static final /* synthetic */ ViewType[] $values() {
            return new ViewType[]{TITLE, IMAGE, ITEM};
        }

        static {
            ViewType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private ViewType(String str, int i11) {
        }

        public static ViewType valueOf(String str) {
            return (ViewType) Enum.valueOf(ViewType.class, str);
        }

        public static ViewType[] values() {
            return (ViewType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ReviewsFilterListAdapter(@NotNull Function1<? super AtomAction, Unit> actionHandler) {
        super(DiffCallback.INSTANCE);
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        this.actionHandler = actionHandler;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int getItemViewType(int position) {
        ReviewsFilterVO.ReviewsFilterItemVO item = getItem(position);
        if (item instanceof ReviewsFilterVO.ReviewsFilterItemVO.Item) {
            return ViewType.ITEM.ordinal();
        }
        if (item instanceof ReviewsFilterVO.ReviewsFilterItemVO.Image) {
            return ViewType.IMAGE.ordinal();
        }
        if (item instanceof ReviewsFilterVO.ReviewsFilterItemVO.Title) {
            return ViewType.TITLE.ordinal();
        }
        throw new o();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull ReviewsFilterVH<T> holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        ReviewsFilterVO.ReviewsFilterItemVO item = getItem(position);
        Intrinsics.g(item, "null cannot be cast to non-null type T of ru.ozon.app.android.ugc.widgets.reviewsFilter.presentation.adapter.ReviewsFilterListAdapter");
        holder.bind(item);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public ReviewsFilterVH<T> onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        AspectView aspectView = new AspectView(context, null, 0, 6, null);
        aspectView.setLayoutParams(new LinearLayout.LayoutParams(-2, Dimens.INSTANCE.getDP_56()));
        if (viewType == ViewType.TITLE.ordinal()) {
            return new ReviewsFilterTitleViewHolder(aspectView, this.actionHandler);
        }
        if (viewType == ViewType.IMAGE.ordinal()) {
            return new ReviewsFilterProductViewHolder(aspectView, this.actionHandler);
        }
        if (viewType == ViewType.ITEM.ordinal()) {
            return new ReviewsFilterItemViewHolder(aspectView, this.actionHandler);
        }
        throw new IllegalArgumentException(Ej.b.a(viewType, "Wrong viewType: "));
    }
}
