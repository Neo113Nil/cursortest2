package ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreviewV2.presentation;

import Sc.InterfaceC4008j;
import android.annotation.SuppressLint;
import android.content.Context;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.pdp.utils.MarginItemDecoration;
import ru.ozon.app.android.ugc.core.R$id;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.ButtonV3HolderKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J+\u0010\f\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u001b\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\u001a\u0004\b\u0017\u0010\u0018*\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreviewV2/presentation/ReviewGalleryPreviewView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "dto", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "bindShowMoreButton", "(Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lkotlin/jvm/functions/Function1;)V", "LSc/j;", "Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "showMoreButtonDelegate", "LSc/j;", "Landroidx/recyclerview/widget/RecyclerView;", "itemsRecycler", "Landroidx/recyclerview/widget/RecyclerView;", "getItemsRecycler", "()Landroidx/recyclerview/widget/RecyclerView;", "getShowMoreButtonView", "()Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "getShowMoreButtonView$delegate", "(Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreviewV2/presentation/ReviewGalleryPreviewView;)Ljava/lang/Object;", "showMoreButtonView", "Companion", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})
/* loaded from: classes2.dex */
public final class ReviewGalleryPreviewView extends LinearLayout {
    private static final int ITEMS_RECYCLER_EDGES_SIZE;
    private static final int ITEMS_RECYCLER_SEPARATOR_SIZE;

    @NotNull
    private final RecyclerView itemsRecycler;

    @NotNull
    private final InterfaceC4008j<ButtonV3View> showMoreButtonDelegate;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreviewV2/presentation/ReviewGalleryPreviewView$Companion;", "", "<init>", "()V", "ITEMS_RECYCLER_SEPARATOR_SIZE", "", "getITEMS_RECYCLER_SEPARATOR_SIZE", "()I", "ITEMS_RECYCLER_EDGES_SIZE", "getITEMS_RECYCLER_EDGES_SIZE", "getItemsRecycler", "Landroidx/recyclerview/widget/RecyclerView;", "context", "Landroid/content/Context;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getITEMS_RECYCLER_EDGES_SIZE() {
            return ReviewGalleryPreviewView.ITEMS_RECYCLER_EDGES_SIZE;
        }

        public final int getITEMS_RECYCLER_SEPARATOR_SIZE() {
            return ReviewGalleryPreviewView.ITEMS_RECYCLER_SEPARATOR_SIZE;
        }

        @NotNull
        public final RecyclerView getItemsRecycler(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            RecyclerView recyclerView = new RecyclerView(context);
            recyclerView.setId(R$id.reviewGalleryPreviewItems);
            recyclerView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            recyclerView.setLayoutManager(new LinearLayoutManager(context, 0, false));
            Companion companion = ReviewGalleryPreviewView.INSTANCE;
            recyclerView.addItemDecoration(new MarginItemDecoration(companion.getITEMS_RECYCLER_SEPARATOR_SIZE(), companion.getITEMS_RECYCLER_EDGES_SIZE()));
            recyclerView.setNestedScrollingEnabled(false);
            recyclerView.setItemAnimator(null);
            recyclerView.setHasFixedSize(true);
            return recyclerView;
        }

        private Companion() {
        }
    }

    static {
        Dimens dimens = Dimens.INSTANCE;
        ITEMS_RECYCLER_SEPARATOR_SIZE = dimens.getDP_4();
        ITEMS_RECYCLER_EDGES_SIZE = dimens.getDP_16();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewGalleryPreviewView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.showMoreButtonDelegate = LazyUtilsKt.unsafeLazy(new ReviewGalleryPreviewView$showMoreButtonDelegate$1(context, this));
        RecyclerView itemsRecycler = INSTANCE.getItemsRecycler(context);
        addView(itemsRecycler);
        this.itemsRecycler = itemsRecycler;
        setOrientation(1);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        setBackgroundColor(androidx.core.content.a.getColor(context, UniColors.LAYER_FLOOR_1.getResId()));
    }

    private final ButtonV3View getShowMoreButtonView() {
        return this.showMoreButtonDelegate.getValue();
    }

    public final void bindShowMoreButton(ButtonV3DTO dto, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        if (this.showMoreButtonDelegate.isInitialized()) {
            ButtonV3HolderKt.bindOrGone(getShowMoreButtonView(), dto, actionHandler);
        } else if (dto != null) {
            ButtonV3HolderKt.bind(getShowMoreButtonView(), dto, actionHandler);
        }
    }

    @NotNull
    public final RecyclerView getItemsRecycler() {
        return this.itemsRecycler;
    }
}
