package ru.ozon.app.android.universalwidgets.widgets.uw.sku.tilescroll.ui.banner;

import Go.e;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tilescroll.data.TileScrollVO;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tilescroll.ui.utils.CustomSizeGradientUtils;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tilescroll.ui.utils.TileScrollBannerViewBuilder;
import ru.ozon.uni.android.atom.image.Image;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.ButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.image.ImageHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J/\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u000b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u000b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019R*\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R0\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u000b\u0018\u00010!8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u00100\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0018\u00102\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010.R\u0018\u00104\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0018\u00107\u001a\u0004\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010:\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;¨\u0006<"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilescroll/ui/banner/TileScrollBannerView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "width", "height", "oldw", "oldh", "", "onSizeChanged", "(IIII)V", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilescroll/data/TileScrollVO$ItemVO$BannerVO;", "item", "bindBanner", "(Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilescroll/data/TileScrollVO$ItemVO$BannerVO;)V", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "bindTitle", "(Lru/ozon/uni/atoms/data/text/TextDTO;)V", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilescroll/data/TileScrollVO$ItemVO$BannerVO$BottomBannerItem;", "model", "bindBottomItem", "(Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilescroll/data/TileScrollVO$ItemVO$BannerVO$BottomBannerItem;)V", "Lkotlin/Function0;", "onItemClicked", "Lkotlin/jvm/functions/Function0;", "getOnItemClicked", "()Lkotlin/jvm/functions/Function0;", "setOnItemClicked", "(Lkotlin/jvm/functions/Function0;)V", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "getActionHandler", "()Lkotlin/jvm/functions/Function1;", "setActionHandler", "(Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilescroll/ui/utils/TileScrollBannerViewBuilder;", "builder", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilescroll/ui/utils/TileScrollBannerViewBuilder;", "Lru/ozon/uni/android/atom/image/Image;", "bannerView", "Lru/ozon/uni/android/atom/image/Image;", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "titleView", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "logoView", "Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "buttonView", "Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "", "currentCornerRoundPx", "Ljava/lang/Float;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilescroll/ui/utils/CustomSizeGradientUtils;", "gradientDrawable", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilescroll/ui/utils/CustomSizeGradientUtils;", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})
/* loaded from: classes2.dex */
public final class TileScrollBannerView extends ConstraintLayout {
    private Function1<? super AtomAction, Unit> actionHandler;

    @NotNull
    private final Image bannerView;

    @NotNull
    private final TileScrollBannerViewBuilder builder;
    private ButtonV3View buttonView;
    private Float currentCornerRoundPx;

    @NotNull
    private final CustomSizeGradientUtils gradientDrawable;
    private Image logoView;
    private Function0<Unit> onItemClicked;
    private TextAtomV2View titleView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TileScrollBannerView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        TileScrollBannerViewBuilder tileScrollBannerViewBuilder = new TileScrollBannerViewBuilder(this);
        this.builder = tileScrollBannerViewBuilder;
        this.bannerView = tileScrollBannerViewBuilder.buildBanner();
        this.gradientDrawable = new CustomSizeGradientUtils();
        setId(View.generateViewId());
        setClickable(true);
        setFocusable(true);
        setClipToOutline(true);
        setLayoutParams(new ViewGroup.LayoutParams(-2, -1));
        setOnClickListener(new e(this, 12));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(TileScrollBannerView tileScrollBannerView, View view) {
        Function0<Unit> function0 = tileScrollBannerView.onItemClicked;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final void bindBanner(@NotNull final TileScrollVO.ItemVO.BannerVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (!Intrinsics.c(item.getCornerRoundPx(), this.currentCornerRoundPx)) {
            setOutlineProvider(new ViewOutlineProvider() { // from class: ru.ozon.app.android.universalwidgets.widgets.uw.sku.tilescroll.ui.banner.TileScrollBannerView$bindBanner$1
                @Override // android.view.ViewOutlineProvider
                public void getOutline(View view, Outline outline) {
                    Intrinsics.checkNotNullParameter(view, "view");
                    Intrinsics.checkNotNullParameter(outline, "outline");
                    Float cornerRoundPx = TileScrollVO.ItemVO.BannerVO.this.getCornerRoundPx();
                    if (cornerRoundPx != null) {
                        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), cornerRoundPx.floatValue());
                    }
                    this.currentCornerRoundPx = TileScrollVO.ItemVO.BannerVO.this.getCornerRoundPx();
                }
            });
        }
        ImageHolderKt.bindOrGone$default(this.bannerView, item.getBannerImage(), null, 2, null);
        if (item.getGradientModel() == null) {
            return;
        }
        this.gradientDrawable.updateModel(item.getGradientModel());
        this.bannerView.setForeground(this.gradientDrawable);
    }

    public final void bindBottomItem(TileScrollVO.ItemVO.BannerVO.BottomBannerItem model) {
        if (model instanceof TileScrollVO.ItemVO.BannerVO.BottomBannerItem.Button) {
            ButtonV3View buttonV3View = this.buttonView;
            if (buttonV3View == null) {
                buttonV3View = this.builder.buildButton();
                this.buttonView = buttonV3View;
            }
            ButtonV3HolderKt.bindOrGone(buttonV3View, ((TileScrollVO.ItemVO.BannerVO.BottomBannerItem.Button) model).getAtom(), this.actionHandler);
            Image image = this.logoView;
            if (image != null) {
                image.setVisibility(8);
                return;
            }
            return;
        }
        if (model instanceof TileScrollVO.ItemVO.BannerVO.BottomBannerItem.Image) {
            Image image2 = this.logoView;
            if (image2 == null) {
                image2 = this.builder.buildLogo();
                this.logoView = image2;
            }
            ImageHolderKt.bindOrGone$default(image2, ((TileScrollVO.ItemVO.BannerVO.BottomBannerItem.Image) model).getAtom(), null, 2, null);
            ButtonV3View buttonV3View2 = this.buttonView;
            if (buttonV3View2 != null) {
                buttonV3View2.setVisibility(8);
            }
        }
    }

    public final void bindTitle(TextDTO title) {
        if (title != null) {
            this.titleView = this.builder.buildTitle();
        }
        TextAtomV2View textAtomV2View = this.titleView;
        if (textAtomV2View != null) {
            TextHolderKt.bindOrGone$default(textAtomV2View, title, null, 2, null);
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int width, int height, int oldw, int oldh) {
        this.gradientDrawable.updateSize(getMeasuredWidth(), getMeasuredHeight());
    }

    public final void setActionHandler(Function1<? super AtomAction, Unit> function1) {
        this.actionHandler = function1;
    }

    public final void setOnItemClicked(Function0<Unit> function0) {
        this.onItemClicked = function0;
    }
}
