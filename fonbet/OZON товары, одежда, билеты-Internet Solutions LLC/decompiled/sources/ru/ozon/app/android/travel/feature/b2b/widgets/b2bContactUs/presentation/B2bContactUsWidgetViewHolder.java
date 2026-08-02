package ru.ozon.app.android.travel.feature.b2b.widgets.b2bContactUs.presentation;

import Hv.a;
import android.content.Context;
import android.graphics.Outline;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.C5314e0;
import androidx.core.view.C5316f0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.travel.feature.b2b.databinding.WidgetB2bContactUsBinding;
import ru.ozon.app.android.travel.feature.b2b.widgets.b2bContactUs.presentation.B2bContactUsVO;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.af.AtomsAdapter;
import ru.ozon.uni.atoms.af.layout.VerticalAtomsLayout;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0001\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003:\u0001+B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0019\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u00022\n\u0010\u0018\u001a\u00060\u0016j\u0002`\u0017H\u0014¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R \u0010#\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\f0!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010)\u001a\u0004\u0018\u00010(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006,"}, d2 = {"Lru/ozon/app/android/travel/feature/b2b/widgets/b2bContactUs/presentation/B2bContactUsWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/travel/feature/b2b/widgets/b2bContactUs/presentation/B2bContactUsVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;)V", "Lru/ozon/app/android/travel/feature/b2b/widgets/b2bContactUs/presentation/B2bContactUsVO$BannerVO;", "item", "", "bindBanner", "(Lru/ozon/app/android/travel/feature/b2b/widgets/b2bContactUs/presentation/B2bContactUsVO$BannerVO;)V", "setUpCellsLayout", "()V", "view", "", "radius", "clipToOutline", "(Landroid/view/View;F)V", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/travel/feature/b2b/widgets/b2bContactUs/presentation/B2bContactUsVO;Ll20/d;)V", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "Lru/ozon/app/android/travel/feature/b2b/databinding/WidgetB2bContactUsBinding;", "binding", "Lru/ozon/app/android/travel/feature/b2b/databinding/WidgetB2bContactUsBinding;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "cellsAdapter", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "", "backgroundColor", "Ljava/lang/Integer;", "RoundedOutlineProvider", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class B2bContactUsWidgetViewHolder extends k<B2bContactUsVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;
    private final Integer backgroundColor;

    @NotNull
    private final WidgetB2bContactUsBinding binding;

    @NotNull
    private final AtomsAdapter cellsAdapter;

    @NotNull
    private final View containerView;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lru/ozon/app/android/travel/feature/b2b/widgets/b2bContactUs/presentation/B2bContactUsWidgetViewHolder$RoundedOutlineProvider;", "Landroid/view/ViewOutlineProvider;", "radius", "", "<init>", "(F)V", "getOutline", "", "view", "Landroid/view/View;", "outline", "Landroid/graphics/Outline;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class RoundedOutlineProvider extends ViewOutlineProvider {
        private final float radius;

        public RoundedOutlineProvider(float f7) {
            this.radius = f7;
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            if (view == null || outline == null) {
                return;
            }
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), this.radius);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B2bContactUsWidgetViewHolder(@NotNull View containerView, @NotNull ComposerReferences references) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(references, "references");
        this.containerView = containerView;
        WidgetB2bContactUsBinding bind = WidgetB2bContactUsBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        this.actionHandler = new ActionHandler.Builder(references, this).buildHandler();
        this.cellsAdapter = new AtomsAdapter(null, null, null, null, 15, null);
        Drawable background = this.itemView.getBackground();
        ColorDrawable colorDrawable = background instanceof ColorDrawable ? (ColorDrawable) background : null;
        this.backgroundColor = colorDrawable != null ? Integer.valueOf(colorDrawable.getColor()) : null;
        clipToOutline(containerView, ResourceExtKt.toPxF(20, getContext()));
        ConstraintLayout b2bContactUsBannerRoot = bind.b2bContactUsBannerRoot;
        Intrinsics.checkNotNullExpressionValue(b2bContactUsBannerRoot, "b2bContactUsBannerRoot");
        clipToOutline(b2bContactUsBannerRoot, ResourceExtKt.toPxF(16, getContext()));
        setUpCellsLayout();
    }

    private final void bindBanner(B2bContactUsVO.BannerVO item) {
        TextAtomView b2bContactUsBannerTitle = this.binding.b2bContactUsBannerTitle;
        Intrinsics.checkNotNullExpressionValue(b2bContactUsBannerTitle, "b2bContactUsBannerTitle");
        TextAtomHolderKt.bind$default(b2bContactUsBannerTitle, item.getTitle(), null, 2, null);
        TextAtomView b2bContactUsBannerSubtitle = this.binding.b2bContactUsBannerSubtitle;
        Intrinsics.checkNotNullExpressionValue(b2bContactUsBannerSubtitle, "b2bContactUsBannerSubtitle");
        TextAtomHolderKt.bindOrGone$default(b2bContactUsBannerSubtitle, item.getSubtitle(), null, 2, null);
        String darkImageUrl = ThemeExtKt.isDarkThemeActive(getContext()) ? item.getImageUrl().getDarkImageUrl() : item.getImageUrl().getLightImageUrl();
        AppCompatImageView b2bContactUsBannerLogo = this.binding.b2bContactUsBannerLogo;
        Intrinsics.checkNotNullExpressionValue(b2bContactUsBannerLogo, "b2bContactUsBannerLogo");
        ImageViewExtKt.load$default(b2bContactUsBannerLogo, darkImageUrl, null, null, null, null, false, null, 126, null);
        ConstraintLayout constraintLayout = this.binding.b2bContactUsBannerRoot;
        Drawable background = constraintLayout.getBackground();
        if (background != null) {
            StyleParser styleParser = StyleParser.INSTANCE;
            Context context = constraintLayout.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            background.setTint(styleParser.parseColor(context, item.getBackgroundColor(), UniColors.BG_MARKETING_PRIMARY.getResId()));
        }
        if (item.getAction() == null) {
            constraintLayout.setClickable(false);
            constraintLayout.setFocusable(false);
            constraintLayout.setOnClickListener(null);
        } else {
            constraintLayout.setClickable(true);
            constraintLayout.setFocusable(true);
            constraintLayout.setOnClickListener(new a(4, this, item));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindBanner$lambda$2$lambda$1(B2bContactUsWidgetViewHolder b2bContactUsWidgetViewHolder, B2bContactUsVO.BannerVO bannerVO, View view) {
        b2bContactUsWidgetViewHolder.actionHandler.invoke(bannerVO.getAction());
    }

    private final void clipToOutline(View view, float radius) {
        view.setClipToOutline(true);
        view.setOutlineProvider(new RoundedOutlineProvider(radius));
    }

    private final void setUpCellsLayout() {
        this.binding.b2bContactUsBannerCells.setAdapter(this.cellsAdapter);
        this.cellsAdapter.setOnAction(this.actionHandler);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull B2bContactUsVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        TextAtomView b2bContactUsTitle = this.binding.b2bContactUsTitle;
        Intrinsics.checkNotNullExpressionValue(b2bContactUsTitle, "b2bContactUsTitle");
        TextAtomHolderKt.bind$default(b2bContactUsTitle, item.getTitle(), null, 2, null);
        ConstraintLayout b2bContactUsBannerRoot = this.binding.b2bContactUsBannerRoot;
        Intrinsics.checkNotNullExpressionValue(b2bContactUsBannerRoot, "b2bContactUsBannerRoot");
        b2bContactUsBannerRoot.setVisibility(item.getIsBannerVisible() ? 0 : 8);
        B2bContactUsVO.BannerVO banner = item.getBanner();
        if (banner != null) {
            bindBanner(banner);
        }
        this.cellsAdapter.bind(getContext(), item.getCells());
        Integer num = this.backgroundColor;
        if (num != null) {
            int intValue = num.intValue();
            VerticalAtomsLayout b2bContactUsBannerCells = this.binding.b2bContactUsBannerCells;
            Intrinsics.checkNotNullExpressionValue(b2bContactUsBannerCells, "b2bContactUsBannerCells");
            C5314e0 c11 = C5316f0.c(b2bContactUsBannerCells);
            while (c11.hasNext()) {
                ViewExtKt.setBackgroundTint((View) c11.next(), intValue);
            }
        }
    }
}
