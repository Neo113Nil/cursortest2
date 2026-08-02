package ru.ozon.app.android.fresh.feature.b2b.widgets.legals.registration.presentation;

import F3.G;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.feature.b2b.R$id;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legals.registration.data.RegistrationDTO;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ConstraintSetExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010J\b\u0010\u0011\u001a\u00020\u000eH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/registration/presentation/BannerEdoCompactView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "bannerBackground", "Landroid/graphics/drawable/GradientDrawable;", "titleView", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "subtitleView", "imageView", "Landroid/widget/ImageView;", "bindOrGone", "", "banner", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/registration/data/RegistrationDTO$Banner;", "setupConstraints", "Companion", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})
/* loaded from: classes12.dex */
public final class BannerEdoCompactView extends ConstraintLayout {

    @NotNull
    private final GradientDrawable bannerBackground;

    @NotNull
    private final ImageView imageView;

    @NotNull
    private final TextAtomV2View subtitleView;

    @NotNull
    private final TextAtomV2View titleView;
    public static final int $stable = 8;
    private static final float backgroundCornerRadius = UiExtKt.toPxF(CornerRadius.RADIUS_500.getPx());
    private static final int imageHeight = UiExtKt.toPx(92);
    private static final int imageWidth = UiExtKt.toPx(90);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BannerEdoCompactView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(backgroundCornerRadius);
        this.bannerBackground = gradientDrawable;
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
        G.g(textAtomV2View, R$id.edoTitle, 0, -2);
        this.titleView = textAtomV2View;
        TextAtomV2View textAtomV2View2 = new TextAtomV2View(context, null, 0, 6, null);
        G.g(textAtomV2View2, R$id.edoSubtitle, 0, -2);
        this.subtitleView = textAtomV2View2;
        ImageView imageView = new ImageView(context);
        imageView.setId(R$id.edoImage);
        imageView.setLayoutParams(new ConstraintLayout.b(imageWidth, imageHeight));
        imageView.setContentDescription(null);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        this.imageView = imageView;
        setBackground(gradientDrawable);
        addView(textAtomV2View);
        addView(textAtomV2View2);
        addView(imageView);
        setupConstraints();
    }

    private final void setupConstraints() {
        d dVar = new d();
        dVar.p(this);
        ConstraintSetExtKt.startToStart$default(dVar, this.titleView.getId(), 0, 0, 4, null);
        ConstraintSetExtKt.endToStart$default(dVar, this.titleView.getId(), this.imageView.getId(), 0, 4, null);
        ConstraintSetExtKt.topToTop$default(dVar, this.titleView.getId(), 0, 0, 4, null);
        ConstraintSetExtKt.startToStart$default(dVar, this.subtitleView.getId(), 0, 0, 4, null);
        ConstraintSetExtKt.endToStart$default(dVar, this.subtitleView.getId(), this.imageView.getId(), 0, 4, null);
        ConstraintSetExtKt.topToBottom$default(dVar, this.subtitleView.getId(), this.titleView.getId(), 0, 4, null);
        ConstraintSetExtKt.bottomToBottom$default(dVar, this.subtitleView.getId(), 0, 0, 4, null);
        ConstraintSetExtKt.endToEnd$default(dVar, this.imageView.getId(), 0, 0, 4, null);
        ConstraintSetExtKt.topToTop$default(dVar, this.imageView.getId(), 0, 0, 4, null);
        ConstraintSetExtKt.bottomToBottom$default(dVar, this.imageView.getId(), 0, 0, 4, null);
        dVar.f(this);
    }

    public final void bindOrGone(RegistrationDTO.Banner banner) {
        ViewExtKt.showOrGone(this, Boolean.valueOf(banner != null));
        if (banner != null) {
            TextHolderKt.bind$default(this.titleView, banner.getTitle(), null, 2, null);
            TextHolderKt.bindOrGone$default(this.subtitleView, banner.getSubtitle(), null, 2, null);
            ImageViewExtKt.load$default(this.imageView, banner.getImage(), null, null, null, null, false, null, 126, null);
            GradientDrawable gradientDrawable = this.bannerBackground;
            StyleParser styleParser = StyleParser.INSTANCE;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            gradientDrawable.setColor(styleParser.parseColor(context, banner.getBackgroundColor(), R$color.bg_primary));
        }
    }
}
