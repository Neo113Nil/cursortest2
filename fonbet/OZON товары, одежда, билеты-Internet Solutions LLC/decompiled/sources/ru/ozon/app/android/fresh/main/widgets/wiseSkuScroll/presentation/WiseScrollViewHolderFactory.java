package ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.presentation;

import Xc.a;
import Xc.b;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.common.widgets.molecules.freshTile.presentation.FreshTileViewV2;
import ru.ozon.app.android.fresh.main.databinding.ItemWiseBannerBinding;
import ru.ozon.app.android.fresh.main.databinding.ItemWiseSkuScrollBeakBinding;
import ru.ozon.app.android.fresh.main.databinding.ItemWiseTileBinding;
import ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.WiseSkuScrollConstants;
import ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.di.WiseItemDependencyHolder;
import ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.presentation.holders.BindableViewHolder;
import ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.presentation.holders.WiseBeakViewHolder;
import ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.presentation.holders.WiseFreshTileViewHolder;
import ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.presentation.holders.WiseImageBannerHolder;
import ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.presentation.holders.WiseOldTileViewHolder;
import ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.presentation.holders.WiseVideoBannerHolder;
import ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.presentation.vo.WiseBannerVO;
import ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.presentation.vo.WiseFreshTileVO;
import ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.presentation.vo.WiseOldTileVO;
import ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.presentation.vo.WiseSkuScrollVO;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001 B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0015\u0010\u0016J+\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00120\n2\u0006\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001b¨\u0006!"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/presentation/WiseScrollViewHolderFactory;", "", "<init>", "()V", "Landroid/view/ViewGroup;", "parent", "", "isVideo", "Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/di/WiseItemDependencyHolder;", "dependencyHolder", "Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/presentation/holders/BindableViewHolder;", "createBannerHolder", "(Landroid/view/ViewGroup;ZLru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/di/WiseItemDependencyHolder;)Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/presentation/holders/BindableViewHolder;", "Landroid/content/Context;", "context", "Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/presentation/holders/WiseOldTileViewHolder;", "createTileHolder", "(Landroid/content/Context;Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/di/WiseItemDependencyHolder;)Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/presentation/holders/WiseOldTileViewHolder;", "Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/presentation/WiseSkuScrollElement;", "item", "", "getItemViewType", "(Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/presentation/WiseSkuScrollElement;)I", "viewType", "createHolder", "(ILandroid/view/ViewGroup;Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/di/WiseItemDependencyHolder;)Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/presentation/holders/BindableViewHolder;", "BANNER_WIDTH", "I", "TILE_WIDTH", "TILE_HEIGHT", "DEFAULT_PADDING", "BOTTOM_PADDING", "ViewHolderType", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class WiseScrollViewHolderFactory {

    @NotNull
    public static final WiseScrollViewHolderFactory INSTANCE = new WiseScrollViewHolderFactory();
    private static final int BANNER_WIDTH = ResourceExtKt.toPx(142);
    private static final int TILE_WIDTH = ResourceExtKt.toPx(121);
    private static final int TILE_HEIGHT = ResourceExtKt.toPx(273);
    private static final int DEFAULT_PADDING = ResourceExtKt.toPx(4);
    private static final int BOTTOM_PADDING = ResourceExtKt.toPx(8);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/presentation/WiseScrollViewHolderFactory$ViewHolderType;", "", "<init>", "(Ljava/lang/String;I)V", "IMAGE_BANNER", "VIDEO_BANNER", "TILE", "BEAK", "FRESH_TILE", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class ViewHolderType {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ ViewHolderType[] $VALUES;
        public static final ViewHolderType IMAGE_BANNER = new ViewHolderType("IMAGE_BANNER", 0);
        public static final ViewHolderType VIDEO_BANNER = new ViewHolderType("VIDEO_BANNER", 1);
        public static final ViewHolderType TILE = new ViewHolderType("TILE", 2);
        public static final ViewHolderType BEAK = new ViewHolderType("BEAK", 3);
        public static final ViewHolderType FRESH_TILE = new ViewHolderType("FRESH_TILE", 4);

        private static final /* synthetic */ ViewHolderType[] $values() {
            return new ViewHolderType[]{IMAGE_BANNER, VIDEO_BANNER, TILE, BEAK, FRESH_TILE};
        }

        static {
            ViewHolderType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private ViewHolderType(String str, int i11) {
        }

        public static ViewHolderType valueOf(String str) {
            return (ViewHolderType) Enum.valueOf(ViewHolderType.class, str);
        }

        public static ViewHolderType[] values() {
            return (ViewHolderType[]) $VALUES.clone();
        }
    }

    private WiseScrollViewHolderFactory() {
    }

    private final BindableViewHolder<?> createBannerHolder(ViewGroup parent, boolean isVideo, WiseItemDependencyHolder dependencyHolder) {
        ItemWiseBannerBinding inflate = ItemWiseBannerBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        RelativeLayout constraintLayout = inflate.getConstraintLayout();
        constraintLayout.setLayoutParams(new RelativeLayout.LayoutParams(BANNER_WIDTH, WiseSkuScrollConstants.INSTANCE.getBANNER_HEIGHT()));
        constraintLayout.setContentDescription("wiseSkuScrollBanner");
        Intrinsics.checkNotNullExpressionValue(inflate, "apply(...)");
        if (!isVideo) {
            return new WiseImageBannerHolder(inflate, dependencyHolder.getTokenizedAnalytics(), dependencyHolder.getActionHandler());
        }
        return new WiseVideoBannerHolder(inflate, dependencyHolder.getVideoController(), dependencyHolder.getExoManagerProvider(), dependencyHolder.getSetWiseSkuScrollObserver(), dependencyHolder.getGetPlayerPosition(), dependencyHolder.getSavePlayerPosition(), dependencyHolder.getTokenizedAnalytics(), dependencyHolder.getActionHandler());
    }

    private final WiseOldTileViewHolder createTileHolder(Context context, WiseItemDependencyHolder dependencyHolder) {
        ItemWiseTileBinding inflate = ItemWiseTileBinding.inflate(LayoutInflater.from(context));
        ConstraintLayout constraintLayout = inflate.getConstraintLayout();
        constraintLayout.setLayoutParams(new ConstraintLayout.b(TILE_WIDTH, TILE_HEIGHT));
        int i11 = DEFAULT_PADDING;
        constraintLayout.setPadding(i11, i11, i11, BOTTOM_PADDING);
        Intrinsics.checkNotNullExpressionValue(inflate, "apply(...)");
        Function1<AtomAction, Unit> actionHandler = dependencyHolder.getActionHandler();
        return new WiseOldTileViewHolder(inflate, dependencyHolder.getAddToCartButtonBinder(), dependencyHolder.getProductFavoriteDelegate(), dependencyHolder.getAnalyticDataProvider(), actionHandler, dependencyHolder.getTokenizedAnalytics(), 112);
    }

    @NotNull
    public final BindableViewHolder<WiseSkuScrollElement> createHolder(int viewType, @NotNull ViewGroup parent, @NotNull WiseItemDependencyHolder dependencyHolder) {
        BindableViewHolder createBannerHolder;
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(dependencyHolder, "dependencyHolder");
        if (viewType == ViewHolderType.IMAGE_BANNER.ordinal() || viewType == ViewHolderType.VIDEO_BANNER.ordinal()) {
            createBannerHolder = createBannerHolder(parent, viewType == ViewHolderType.VIDEO_BANNER.ordinal(), dependencyHolder);
        } else if (viewType == ViewHolderType.TILE.ordinal()) {
            Context context = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            createBannerHolder = createTileHolder(context, dependencyHolder);
        } else if (viewType == ViewHolderType.BEAK.ordinal()) {
            ItemWiseSkuScrollBeakBinding inflate = ItemWiseSkuScrollBeakBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
            Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
            createBannerHolder = new WiseBeakViewHolder(inflate, dependencyHolder.getRecyclerView(), dependencyHolder.getTokenizedAnalytics(), dependencyHolder.getActionHandler());
        } else {
            if (viewType != ViewHolderType.FRESH_TILE.ordinal()) {
                throw new IllegalArgumentException("There is no such WiseSkuScroll view holder");
            }
            FreshTileViewV2.Companion companion = FreshTileViewV2.INSTANCE;
            Context context2 = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            createBannerHolder = new WiseFreshTileViewHolder(FreshTileViewV2.Companion.createVertical$default(companion, context2, Integer.valueOf(WiseSkuScrollConstants.INSTANCE.getFRESH_TILE_WIDTH()), null, null, 12, null), dependencyHolder.getFreshTileDelegateV2Provider().invoke(), dependencyHolder.getOwnerProvider(), dependencyHolder.getActionHandler(), dependencyHolder.getFeatureCheckerProvider(), dependencyHolder.getTokenizedAnalytics());
        }
        Intrinsics.g(createBannerHolder, "null cannot be cast to non-null type ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.presentation.holders.BindableViewHolder<ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.presentation.WiseSkuScrollElement>");
        return createBannerHolder;
    }

    public final int getItemViewType(WiseSkuScrollElement item) {
        if (item instanceof WiseBannerVO) {
            return ((WiseBannerVO) item).getVideoUrl() != null ? ViewHolderType.VIDEO_BANNER.ordinal() : ViewHolderType.IMAGE_BANNER.ordinal();
        }
        if (item instanceof WiseOldTileVO) {
            return ViewHolderType.TILE.ordinal();
        }
        if (item instanceof WiseSkuScrollVO.BeakVO) {
            return ViewHolderType.BEAK.ordinal();
        }
        if (item instanceof WiseFreshTileVO) {
            return ViewHolderType.FRESH_TILE.ordinal();
        }
        return -1;
    }
}
