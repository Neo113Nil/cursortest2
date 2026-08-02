package ru.ozon.app.android.travel.feature.hotels.widgets.skiResortInfo.view.topics.weather;

import D40.a;
import F3.G;
import android.content.Context;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import gk0.q;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.hotels.R$id;
import ru.ozon.app.android.travel.feature.hotels.widgets.skiResortInfo.presentation.SkiResortInfoVO;
import ru.ozon.app.android.travel.utils.extensions.ConstraintLayoutExtensionsKt;
import ru.ozon.uni.android.atom.image.Image;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.v3.holders.image.ImageHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fJ\b\u0010 \u001a\u00020\u001dH\u0002J\b\u0010!\u001a\u00020\u001dH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/skiResortInfo/view/topics/weather/SkiResortInfoWeatherItemView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "dp6", "", "dp8", "dp32", "monthGuidePercent", "", "getMonthGuidePercent", "()F", "tempGuidePercent", "getTempGuidePercent", "isSmallScreen", "", "()Z", "imageI", "Lru/ozon/uni/android/atom/image/Image;", "monthTAV", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "monthGuidelineG", "Landroidx/constraintlayout/widget/Guideline;", "tempTAV", "tempGuidelineG", "snowDepthTAV", "bind", "", "item", "Lru/ozon/app/android/travel/feature/hotels/widgets/skiResortInfo/presentation/SkiResortInfoVO$WeatherVO$WeatherItemVO;", "addViews", "setupConstraints", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SkiResortInfoWeatherItemView extends ConstraintLayout {
    private final int dp32;
    private final int dp6;
    private final int dp8;

    @NotNull
    private final Image imageI;

    @NotNull
    private final Guideline monthGuidelineG;

    @NotNull
    private final TextAtomV2View monthTAV;

    @NotNull
    private final TextAtomV2View snowDepthTAV;

    @NotNull
    private final Guideline tempGuidelineG;

    @NotNull
    private final TextAtomV2View tempTAV;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SkiResortInfoWeatherItemView(@NotNull Context context) {
        super(context);
        Context context2;
        Intrinsics.checkNotNullParameter(context, "context");
        this.dp6 = ResourceExtKt.toPx(6, context);
        this.dp8 = ResourceExtKt.toPx(8, context);
        int px = ResourceExtKt.toPx(32, context);
        this.dp32 = px;
        q qVar = q.f64554a;
        Image image = (Image) qVar.i(N.b(Image.class), context);
        if (image == null) {
            context2 = context;
            image = new Image(context2, null, 0, 6, null);
        } else {
            context2 = context;
        }
        image.setId(R$id.skiResortInfoImageI);
        image.setLayoutParams(new ConstraintLayout.b(px, px));
        this.imageI = image;
        TextAtomV2View textAtomV2View = (TextAtomV2View) qVar.g(N.b(TextAtomV2View.class), context2);
        G.g(textAtomV2View, R$id.skiResortInfoMonthTAV, 0, -2);
        this.monthTAV = textAtomV2View;
        Guideline guideline = new Guideline(context2);
        ConstraintLayout.b a11 = a.a(guideline, R$id.skiResortInfoMonthGuidelineG, -2, -2);
        a11.f41615V = 1;
        a11.f41624c = getMonthGuidePercent();
        guideline.setLayoutParams(a11);
        this.monthGuidelineG = guideline;
        TextAtomV2View textAtomV2View2 = (TextAtomV2View) qVar.g(N.b(TextAtomV2View.class), context2);
        G.g(textAtomV2View2, R$id.skiResortInfoTempTAV, 0, -2);
        this.tempTAV = textAtomV2View2;
        Guideline guideline2 = new Guideline(context2);
        ConstraintLayout.b a12 = a.a(guideline2, R$id.skiResortInfoTempGuidelineG, -2, -2);
        a12.f41615V = 1;
        a12.f41624c = getTempGuidePercent();
        guideline2.setLayoutParams(a12);
        this.tempGuidelineG = guideline2;
        TextAtomV2View textAtomV2View3 = (TextAtomV2View) qVar.g(N.b(TextAtomV2View.class), context2);
        G.g(textAtomV2View3, R$id.skiResortInfoSnowDepthTAV, 0, -2);
        this.snowDepthTAV = textAtomV2View3;
        addViews();
        setupConstraints();
    }

    private final void addViews() {
        addView(this.imageI);
        addView(this.monthTAV);
        addView(this.monthGuidelineG);
        addView(this.tempTAV);
        addView(this.tempGuidelineG);
        addView(this.snowDepthTAV);
    }

    private final float getMonthGuidePercent() {
        return isSmallScreen() ? 0.36f : 0.32f;
    }

    private final float getTempGuidePercent() {
        return isSmallScreen() ? 0.68f : 0.73f;
    }

    private final boolean isSmallScreen() {
        return getResources().getDisplayMetrics().widthPixels <= 320;
    }

    private final void setupConstraints() {
        ConstraintLayoutExtensionsKt.applyConstraint(this, new SkiResortInfoWeatherItemView$setupConstraints$1(this));
    }

    public final void bind(@NotNull SkiResortInfoVO.WeatherVO.WeatherItemVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        ImageHolderKt.bind$default(this.imageI, item.getImage(), null, 2, null);
        TextHolderKt.bind$default(this.monthTAV, item.getMonth(), null, 2, null);
        TextHolderKt.bind$default(this.tempTAV, item.getTemp(), null, 2, null);
        TextHolderKt.bind$default(this.snowDepthTAV, item.getSnowDepth(), null, 2, null);
    }
}
