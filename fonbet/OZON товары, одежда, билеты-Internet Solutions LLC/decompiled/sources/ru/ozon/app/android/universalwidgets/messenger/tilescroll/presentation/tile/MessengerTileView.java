package ru.ozon.app.android.universalwidgets.messenger.tilescroll.presentation.tile;

import CX.b;
import Sc.InterfaceC4008j;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.C5314e0;
import androidx.core.view.C5316f0;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.K;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.product.addToCart.presentation.AddToCartButtonView;
import ru.ozon.app.android.product.common.TileThemeConfigVO;
import ru.ozon.app.android.product.molecules.blur.presentation.BlurMoleculeView;
import ru.ozon.app.android.product.tileContentItems.TileContentItemsAdapter;
import ru.ozon.app.android.product.tileContentItems.vo.TileContentItem;
import ru.ozon.app.android.universalwidgets.R$id;
import ru.ozon.app.android.universalwidgets.messenger.tilescroll.TileScrollMappingCompatKt;
import ru.ozon.app.android.universalwidgets.messenger.tilescroll.presentation.model.TileScrollBlockVO;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.smalltile.presentation.SmallTileViewBuilder;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.smalltile.presentation.view.SmallTileAdultImageView;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.smalltile.presentation.view.TileContentItemDecoration;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;

@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 >2\u00020\u0001:\u0001>B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\n\u0010\bJ\u001f\u0010\u000f\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0016\u001a\u00020\u00062\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010!\u001a\u00020 8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010&\u001a\u00020%8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001d\u0010,\u001a\b\u0012\u0004\u0012\u00020+0*8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0014\u00101\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00104\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00107\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u001b\u0010=\u001a\u0002098BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b:\u0010-\u001a\u0004\b;\u0010<¨\u0006?"}, d2 = {"Lru/ozon/app/android/universalwidgets/messenger/tilescroll/presentation/tile/MessengerTileView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "disabledSelectedText", "()V", "onAttachedToWindow", "onDetachedFromWindow", "Lru/ozon/app/android/universalwidgets/messenger/tilescroll/presentation/model/TileScrollBlockVO$TileVO$ImageComponent$SmallTileAdultImageModel;", "imageModel", "Lru/ozon/app/android/product/common/TileThemeConfigVO;", "theme", "bindImage", "(Lru/ozon/app/android/universalwidgets/messenger/tilescroll/presentation/model/TileScrollBlockVO$TileVO$ImageComponent$SmallTileAdultImageModel;Lru/ozon/app/android/product/common/TileThemeConfigVO;)V", "", "Lru/ozon/app/android/product/tileContentItems/vo/TileContentItem;", "stateInfo", "", "height", "bindStateInfo", "(Ljava/util/List;Ljava/lang/Integer;)V", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "badgeDTO", "bindBadge", "(Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;)V", "", "radius", "setCornerRadius", "(F)V", "Lru/ozon/app/android/product/addToCart/presentation/AddToCartButtonView;", "button", "Lru/ozon/app/android/product/addToCart/presentation/AddToCartButtonView;", "getButton", "()Lru/ozon/app/android/product/addToCart/presentation/AddToCartButtonView;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/smalltile/presentation/view/SmallTileAdultImageView;", "adultIv", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/smalltile/presentation/view/SmallTileAdultImageView;", "getAdultIv", "()Lru/ozon/app/android/universalwidgets/widgets/uw/sku/smalltile/presentation/view/SmallTileAdultImageView;", "LSc/j;", "Lru/ozon/app/android/product/molecules/blur/presentation/BlurMoleculeView;", "blurMoleculeView", "LSc/j;", "getBlurMoleculeView", "()LSc/j;", "Lru/ozon/uni/android/atom/badge/BadgeView;", "badgeView", "Lru/ozon/uni/android/atom/badge/BadgeView;", "Landroidx/recyclerview/widget/RecyclerView;", "infoListRv", "Landroidx/recyclerview/widget/RecyclerView;", "Lru/ozon/app/android/product/tileContentItems/TileContentItemsAdapter;", "tileContentItemsAdapter", "Lru/ozon/app/android/product/tileContentItems/TileContentItemsAdapter;", "Landroid/graphics/drawable/GradientDrawable;", "rootTileBackground$delegate", "getRootTileBackground", "()Landroid/graphics/drawable/GradientDrawable;", "rootTileBackground", "Companion", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})
/* loaded from: classes2.dex */
public final class MessengerTileView extends ConstraintLayout {
    private static final int minWidthSize = ResourceExtKt.toPx(100);
    private static final float roundCornerRadiusF = UiExtKt.toPxF(12);

    @NotNull
    private final SmallTileAdultImageView adultIv;

    @NotNull
    private final BadgeView badgeView;

    @NotNull
    private final InterfaceC4008j<BlurMoleculeView> blurMoleculeView;

    @NotNull
    private final AddToCartButtonView button;

    @NotNull
    private final RecyclerView infoListRv;

    /* renamed from: rootTileBackground$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j rootTileBackground;

    @NotNull
    private final TileContentItemsAdapter tileContentItemsAdapter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MessengerTileView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        SmallTileViewBuilder smallTileViewBuilder = SmallTileViewBuilder.INSTANCE;
        this.button = smallTileViewBuilder.buildButton(this);
        SmallTileAdultImageView buildImageView = smallTileViewBuilder.buildImageView(this);
        this.adultIv = buildImageView;
        this.blurMoleculeView = buildImageView.getBlurMoleculeView();
        this.badgeView = smallTileViewBuilder.buildBadge(this);
        RecyclerView buildInfoList = smallTileViewBuilder.buildInfoList(this);
        this.infoListRv = buildInfoList;
        this.tileContentItemsAdapter = new TileContentItemsAdapter(null, 1, 0 == true ? 1 : 0);
        this.rootTileBackground = LazyUtilsKt.unsafeLazy(new MessengerTileView$rootTileBackground$2(context));
        setId(R$id.rootLl);
        setClickable(true);
        setFocusable(true);
        setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        setMinimumWidth(minWidthSize);
        setBackground(getRootTileBackground());
        buildInfoList.addItemDecoration(new TileContentItemDecoration());
        buildInfoList.setOnTouchListener(new b(this, 0));
    }

    private final void disabledSelectedText() {
        Iterator<View> it = C5316f0.b(this.infoListRv).iterator();
        while (true) {
            C5314e0 c5314e0 = (C5314e0) it;
            if (!c5314e0.hasNext()) {
                return;
            }
            View view = (View) c5314e0.next();
            if (view instanceof TextAtomV2View) {
                ((TextAtomV2View) view).setTextIsSelectable(false);
            }
        }
    }

    private final GradientDrawable getRootTileBackground() {
        return (GradientDrawable) this.rootTileBackground.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean lambda$1$lambda$0(MessengerTileView messengerTileView, View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() != 1) {
            return false;
        }
        messengerTileView.performClick();
        return true;
    }

    public final void bindBadge(BadgeDTO badgeDTO) {
        BadgeHolderKt.bindOrGone$default(this.badgeView, badgeDTO, (Function1) null, 2, (Object) null);
    }

    public final void bindImage(@NotNull TileScrollBlockVO.TileVO.ImageComponent.SmallTileAdultImageModel imageModel, TileThemeConfigVO theme) {
        Intrinsics.checkNotNullParameter(imageModel, "imageModel");
        this.adultIv.bind(TileScrollMappingCompatKt.toTileScrollModel(imageModel), theme);
    }

    public final void bindStateInfo(List<? extends TileContentItem> stateInfo, Integer height) {
        TileContentItemsAdapter tileContentItemsAdapter = this.tileContentItemsAdapter;
        if (stateInfo == null) {
            stateInfo = K.f71697a;
        }
        tileContentItemsAdapter.submitList(stateInfo);
        if (height != null && height.intValue() > -1 && this.infoListRv.getLayoutParams().height != height.intValue()) {
            RecyclerView recyclerView = this.infoListRv;
            ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
            ((ViewGroup.MarginLayoutParams) bVar).height = height.intValue();
            recyclerView.setLayoutParams(bVar);
        }
        disabledSelectedText();
    }

    @NotNull
    public final SmallTileAdultImageView getAdultIv() {
        return this.adultIv;
    }

    @NotNull
    public final InterfaceC4008j<BlurMoleculeView> getBlurMoleculeView() {
        return this.blurMoleculeView;
    }

    @NotNull
    public final AddToCartButtonView getButton() {
        return this.button;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.infoListRv.setAdapter(this.tileContentItemsAdapter);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        this.infoListRv.setAdapter(null);
        super.onDetachedFromWindow();
    }

    public final void setCornerRadius(float radius) {
        getRootTileBackground().setCornerRadius(radius);
    }
}
