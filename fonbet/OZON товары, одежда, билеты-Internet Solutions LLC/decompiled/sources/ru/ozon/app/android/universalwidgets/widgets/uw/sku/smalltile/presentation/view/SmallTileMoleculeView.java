package ru.ozon.app.android.universalwidgets.widgets.uw.sku.smalltile.presentation.view;

import QI.a;
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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.product.addToCart.presentation.AddToCartButtonView;
import ru.ozon.app.android.product.common.TileThemeConfigVO;
import ru.ozon.app.android.product.molecules.blur.presentation.BlurMoleculeView;
import ru.ozon.app.android.product.tileContentItems.TileContentItemsAdapter;
import ru.ozon.app.android.product.tileContentItems.vo.TileContentItem;
import ru.ozon.app.android.universalwidgets.R$id;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.smalltile.presentation.SmallTileViewBuilder;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.smalltile.presentation.vo.SmallTileAdultImageModel;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;

@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 D2\u00020\u0001:\u0001DB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\n\u0010\bJ\u001f\u0010\u000f\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0016\u001a\u00020\u00062\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\u00062\b\u0010!\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b\"\u0010#R\u0017\u0010%\u001a\u00020$8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010*\u001a\u00020)8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u001d\u00100\u001a\b\u0012\u0004\u0012\u00020/0.8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0014\u00105\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u00108\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010;\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010=\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0018\u0010?\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010B\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010C¨\u0006E"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/smalltile/presentation/view/SmallTileMoleculeView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "disabledSelectedText", "()V", "onAttachedToWindow", "onDetachedFromWindow", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/smalltile/presentation/vo/SmallTileAdultImageModel;", "imageModel", "Lru/ozon/app/android/product/common/TileThemeConfigVO;", "theme", "bindImage", "(Lru/ozon/app/android/universalwidgets/widgets/uw/sku/smalltile/presentation/vo/SmallTileAdultImageModel;Lru/ozon/app/android/product/common/TileThemeConfigVO;)V", "", "Lru/ozon/app/android/product/tileContentItems/vo/TileContentItem;", "stateInfo", "", "height", "bindStateInfo", "(Ljava/util/List;Ljava/lang/Integer;)V", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "badgeDTO", "bindBadge", "(Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;)V", "", "radius", "setCornerRadius", "(F)V", "", "islandBackgroundColor", "bindBackgroundColor", "(Ljava/lang/String;)V", "Lru/ozon/app/android/product/addToCart/presentation/AddToCartButtonView;", "button", "Lru/ozon/app/android/product/addToCart/presentation/AddToCartButtonView;", "getButton", "()Lru/ozon/app/android/product/addToCart/presentation/AddToCartButtonView;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/smalltile/presentation/view/SmallTileAdultImageView;", "adultIv", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/smalltile/presentation/view/SmallTileAdultImageView;", "getAdultIv", "()Lru/ozon/app/android/universalwidgets/widgets/uw/sku/smalltile/presentation/view/SmallTileAdultImageView;", "LSc/j;", "Lru/ozon/app/android/product/molecules/blur/presentation/BlurMoleculeView;", "blurMoleculeView", "LSc/j;", "getBlurMoleculeView", "()LSc/j;", "Lru/ozon/uni/android/atom/badge/BadgeView;", "badgeView", "Lru/ozon/uni/android/atom/badge/BadgeView;", "Landroidx/recyclerview/widget/RecyclerView;", "infoListRv", "Landroidx/recyclerview/widget/RecyclerView;", "Lru/ozon/app/android/product/tileContentItems/TileContentItemsAdapter;", "tileContentItemsAdapter", "Lru/ozon/app/android/product/tileContentItems/TileContentItemsAdapter;", "defaultColor", "I", "cachedBackgroundColorToken", "Ljava/lang/String;", "Landroid/graphics/drawable/GradientDrawable;", "rootTileBackground", "Landroid/graphics/drawable/GradientDrawable;", "Companion", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})
/* loaded from: classes2.dex */
public final class SmallTileMoleculeView extends ConstraintLayout {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
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
    private String cachedBackgroundColorToken;
    private final int defaultColor;

    @NotNull
    private final RecyclerView infoListRv;

    @NotNull
    private final GradientDrawable rootTileBackground;

    @NotNull
    private final TileContentItemsAdapter tileContentItemsAdapter;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/smalltile/presentation/view/SmallTileMoleculeView$Companion;", "", "<init>", "()V", "minWidthSize", "", "getMinWidthSize", "()I", "roundCornerRadiusF", "", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getMinWidthSize() {
            return SmallTileMoleculeView.minWidthSize;
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SmallTileMoleculeView(@NotNull Context context) {
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
        int themeColor = ThemeExtKt.themeColor(context, R$attr.layerFloor1);
        this.defaultColor = themeColor;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(roundCornerRadiusF);
        gradientDrawable.setColor(themeColor);
        this.rootTileBackground = gradientDrawable;
        setId(R$id.rootLl);
        setClickable(true);
        setFocusable(true);
        setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        setMinimumWidth(minWidthSize);
        setBackground(gradientDrawable);
        buildInfoList.addItemDecoration(new TileContentItemDecoration());
        buildInfoList.setOnTouchListener(new a(this, 2));
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean lambda$2$lambda$1(SmallTileMoleculeView smallTileMoleculeView, View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() != 1) {
            return false;
        }
        smallTileMoleculeView.performClick();
        return true;
    }

    public final void bindBackgroundColor(String islandBackgroundColor) {
        int i11;
        if (Intrinsics.d(islandBackgroundColor, this.cachedBackgroundColorToken)) {
            return;
        }
        this.cachedBackgroundColorToken = islandBackgroundColor;
        if (islandBackgroundColor != null) {
            StyleParser styleParser = StyleParser.INSTANCE;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            Integer parseColor = styleParser.parseColor(context, islandBackgroundColor);
            if (parseColor != null) {
                i11 = parseColor.intValue();
                this.rootTileBackground.setColor(i11);
            }
        }
        i11 = this.defaultColor;
        this.rootTileBackground.setColor(i11);
    }

    public final void bindBadge(BadgeDTO badgeDTO) {
        BadgeHolderKt.bindOrGone$default(this.badgeView, badgeDTO, (Function1) null, 2, (Object) null);
    }

    public final void bindImage(@NotNull SmallTileAdultImageModel imageModel, TileThemeConfigVO theme) {
        Intrinsics.checkNotNullParameter(imageModel, "imageModel");
        this.adultIv.bind(imageModel, theme);
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
        this.rootTileBackground.setCornerRadius(radius);
    }
}
