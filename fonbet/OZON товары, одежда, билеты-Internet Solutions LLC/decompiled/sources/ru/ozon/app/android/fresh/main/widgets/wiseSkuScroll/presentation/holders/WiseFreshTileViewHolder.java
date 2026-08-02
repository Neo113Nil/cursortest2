package ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.presentation.holders;

import WZ.l;
import a00.C4911f;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.common.flags.FreshWiseSkuScrollDynamicHeightEnabled;
import ru.ozon.app.android.fresh.common.widgets.molecules.freshTile.FreshTileDelegateV2;
import ru.ozon.app.android.fresh.common.widgets.molecules.freshTile.presentation.FreshTileViewV2;
import ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.presentation.vo.WiseFreshTileVO;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 #2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001#BS\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0010\u0010\n\u001a\f\u0012\b\u0012\u00060\bj\u0002`\t0\u0007\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0007\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0017\u0010\u0016J'\u0010\u001c\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u00022\u000e\u0010\u001b\u001a\n\u0018\u00010\u0019j\u0004\u0018\u0001`\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001e\u0010\u0016R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001fR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010 R\u001e\u0010\n\u001a\f\u0012\b\u0012\u00060\bj\u0002`\t0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010!R \u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\"R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010!¨\u0006$"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/presentation/holders/WiseFreshTileViewHolder;", "Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/presentation/holders/BindableViewHolder;", "Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/presentation/vo/WiseFreshTileVO;", "Lru/ozon/app/android/fresh/common/widgets/molecules/freshTile/presentation/FreshTileViewV2;", "containerView", "Lru/ozon/app/android/fresh/common/widgets/molecules/freshTile/FreshTileDelegateV2;", "freshTileDelegate", "Lkotlin/Function0;", "La00/f;", "Lru/ozon/app/android/composer/OwnerContainer;", "ownerProvider", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "customActionHandler", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureCheckerProvider", "LWZ/l;", "tokenizedAnalytics", "<init>", "(Lru/ozon/app/android/fresh/common/widgets/molecules/freshTile/presentation/FreshTileViewV2;Lru/ozon/app/android/fresh/common/widgets/molecules/freshTile/FreshTileDelegateV2;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;LWZ/l;)V", "attachDelegate", "()V", "onAttach", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "bind", "(Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/presentation/vo/WiseFreshTileVO;Ll20/d;)V", "onRecycle", "Lru/ozon/app/android/fresh/common/widgets/molecules/freshTile/presentation/FreshTileViewV2;", "Lru/ozon/app/android/fresh/common/widgets/molecules/freshTile/FreshTileDelegateV2;", "Lkotlin/jvm/functions/Function0;", "Lkotlin/jvm/functions/Function1;", "Companion", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class WiseFreshTileViewHolder extends BindableViewHolder<WiseFreshTileVO> {

    @NotNull
    private final FreshTileViewV2 containerView;

    @NotNull
    private final Function1<AtomAction, Unit> customActionHandler;

    @NotNull
    private final Function0<FeatureChecker> featureCheckerProvider;

    @NotNull
    private final FreshTileDelegateV2 freshTileDelegate;

    @NotNull
    private final Function0<C4911f> ownerProvider;

    @NotNull
    private static final Companion Companion = new Companion(null);
    private static final int COMBO_TILE_HEIGHT = ResourceExtKt.toPx(204);
    private static final int DEFAULT_TILE_HEIGHT = ResourceExtKt.toPx(260);
    private static final int BANNER_TILE_HEIGHT = ResourceExtKt.toPx(273);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/presentation/holders/WiseFreshTileViewHolder$Companion;", "", "<init>", "()V", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public WiseFreshTileViewHolder(@NotNull FreshTileViewV2 containerView, @NotNull FreshTileDelegateV2 freshTileDelegate, @NotNull Function0<C4911f> ownerProvider, @NotNull Function1<? super AtomAction, Unit> customActionHandler, @NotNull Function0<? extends FeatureChecker> featureCheckerProvider, @NotNull l tokenizedAnalytics) {
        super(containerView, tokenizedAnalytics, customActionHandler);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(freshTileDelegate, "freshTileDelegate");
        Intrinsics.checkNotNullParameter(ownerProvider, "ownerProvider");
        Intrinsics.checkNotNullParameter(customActionHandler, "customActionHandler");
        Intrinsics.checkNotNullParameter(featureCheckerProvider, "featureCheckerProvider");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.containerView = containerView;
        this.freshTileDelegate = freshTileDelegate;
        this.ownerProvider = ownerProvider;
        this.customActionHandler = customActionHandler;
        this.featureCheckerProvider = featureCheckerProvider;
    }

    private final void attachDelegate() {
        this.freshTileDelegate.onAttach(getLifecycle(), this.ownerProvider, new WiseFreshTileViewHolder$attachDelegate$1(this), this.customActionHandler, new WiseFreshTileViewHolder$attachDelegate$2(this), new WiseFreshTileViewHolder$attachDelegate$3(this));
    }

    @Override // jk0.j
    public void onAttach() {
        super.onAttach();
        attachDelegate();
    }

    @Override // jk0.j
    public void onRecycle() {
        super.onRecycle();
        this.freshTileDelegate.onDetach();
    }

    @Override // ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.presentation.holders.BindableViewHolder
    public void bind(@NotNull WiseFreshTileVO item, d widgetInfo) {
        Intrinsics.checkNotNullParameter(item, "item");
        super.bind((WiseFreshTileViewHolder) item, widgetInfo);
        boolean isEnabled = this.featureCheckerProvider.invoke().isEnabled(FreshWiseSkuScrollDynamicHeightEnabled.INSTANCE);
        FreshTileViewV2 freshTileViewV2 = this.containerView;
        ViewGroup.LayoutParams layoutParams = freshTileViewV2.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        if (isEnabled) {
            layoutParams.height = -2;
        } else {
            layoutParams.height = item.getIsCombo() ? COMBO_TILE_HEIGHT : item.getHasBanner() ? BANNER_TILE_HEIGHT : DEFAULT_TILE_HEIGHT;
        }
        freshTileViewV2.setLayoutParams(layoutParams);
        attachDelegate();
        this.freshTileDelegate.setState(item);
    }
}
