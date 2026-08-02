package ru.ozon.app.android.travel.feature.hotels.widgets.skiResortInfo.view.topics.trails;

import Bi.b;
import D40.a;
import Sc.o;
import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.graphics.drawable.shapes.RectShape;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Space;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.google.android.flexbox.FlexboxLayout;
import gk0.q;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.reflect.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.pikazon.glide.transformations.ImageTransformation;
import ru.ozon.app.android.travel.feature.hotels.R$id;
import ru.ozon.app.android.travel.feature.hotels.widgets.skiResortInfo.presentation.SkiResortInfoVO;
import ru.ozon.app.android.travel.utils.extensions.ConstraintLayoutExtensionsKt;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.image.CornerRadius;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.ButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\"\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020+0/J\b\u00101\u001a\u00020+H\u0002J\b\u00102\u001a\u00020+H\u0002J\u0014\u0010*\u001a\u00020+*\u00020\u00012\u0006\u0010,\u001a\u000203H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00188BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0019R\u001a\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u001d0\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020%X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020'X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020)X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00064"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/skiResortInfo/view/topics/trails/SkiResortInfoTrailsView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "dp4", "", "dp6", "dp8", "dp10", "dp12", "dp16", "dp20", "dp92", "textGuidePercent", "", "getTextGuidePercent", "()F", "textEndGuidePercent", "getTextEndGuidePercent", "detailItemGuidePercent", "getDetailItemGuidePercent", "isSmallScreen", "", "()Z", "cachedTrailItemViews", "", "cachedLiftTypeDetailItemViews", "Lru/ozon/app/android/travel/feature/hotels/widgets/skiResortInfo/view/topics/trails/SkiResortInfoTrailsIconWithTextView;", "itemsLL", "Landroid/widget/LinearLayout;", "mapFL", "Landroid/widget/FrameLayout;", "imageIV", "Landroidx/appcompat/widget/AppCompatImageView;", "buttonBV", "Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "headerTAV", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "liftTypeDetailItemsFL", "Lcom/google/android/flexbox/FlexboxLayout;", "bind", "", "item", "Lru/ozon/app/android/travel/feature/hotels/widgets/skiResortInfo/presentation/SkiResortInfoVO$TrailsVO;", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "addViews", "setupConstraints", "Lru/ozon/app/android/travel/feature/hotels/widgets/skiResortInfo/presentation/SkiResortInfoVO$TrailsVO$TrailItemVO;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SkiResortInfoTrailsView extends ConstraintLayout {

    @NotNull
    private final ButtonV3View buttonBV;

    @NotNull
    private final Map<Integer, SkiResortInfoTrailsIconWithTextView> cachedLiftTypeDetailItemViews;

    @NotNull
    private final Map<Integer, ConstraintLayout> cachedTrailItemViews;
    private final int dp10;
    private final int dp12;
    private final int dp16;
    private final int dp20;
    private final int dp4;
    private final int dp6;
    private final int dp8;
    private final int dp92;

    @NotNull
    private final TextAtomV2View headerTAV;

    @NotNull
    private final AppCompatImageView imageIV;

    @NotNull
    private final LinearLayout itemsLL;

    @NotNull
    private final FlexboxLayout liftTypeDetailItemsFL;

    @NotNull
    private final FrameLayout mapFL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SkiResortInfoTrailsView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        int px = ResourceExtKt.toPx(4, context);
        this.dp4 = px;
        this.dp6 = ResourceExtKt.toPx(6, context);
        int px2 = ResourceExtKt.toPx(8, context);
        this.dp8 = px2;
        this.dp10 = ResourceExtKt.toPx(10, context);
        this.dp12 = ResourceExtKt.toPx(12, context);
        int px3 = ResourceExtKt.toPx(16, context);
        this.dp16 = px3;
        int px4 = ResourceExtKt.toPx(20, context);
        this.dp20 = px4;
        int px5 = ResourceExtKt.toPx(92, context);
        this.dp92 = px5;
        this.cachedTrailItemViews = new LinkedHashMap();
        this.cachedLiftTypeDetailItemViews = new LinkedHashMap();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setId(R$id.skiResortInfoItemsLL);
        linearLayout.setLayoutParams(new ConstraintLayout.b(0, -2));
        linearLayout.setOrientation(1);
        this.itemsLL = linearLayout;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(R$id.skiResortInfoMapFL);
        ConstraintLayout.b bVar = new ConstraintLayout.b(0, -2);
        ((ViewGroup.MarginLayoutParams) bVar).topMargin = px4;
        frameLayout.setLayoutParams(bVar);
        this.mapFL = frameLayout;
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        appCompatImageView.setLayoutParams(new FrameLayout.LayoutParams(-1, px5));
        this.imageIV = appCompatImageView;
        q qVar = q.f64554a;
        ButtonV3View buttonV3View = (ButtonV3View) qVar.i(N.b(ButtonV3View.class), context);
        buttonV3View = buttonV3View == null ? new ButtonV3View(context, null, 0, 0, 14, null) : buttonV3View;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        buttonV3View.setLayoutParams(layoutParams);
        this.buttonBV = buttonV3View;
        TextAtomV2View textAtomV2View = (TextAtomV2View) qVar.g(N.b(TextAtomV2View.class), context);
        ConstraintLayout.b d11 = b.d(textAtomV2View, R$id.skiResortInfoHeaderTAV, -2, -2);
        ((ViewGroup.MarginLayoutParams) d11).topMargin = px3;
        textAtomV2View.setLayoutParams(d11);
        this.headerTAV = textAtomV2View;
        FlexboxLayout flexboxLayout = new FlexboxLayout(context);
        flexboxLayout.setId(R$id.skiResortInfoLiftTypeDetailItemsFL);
        ConstraintLayout.b bVar2 = new ConstraintLayout.b(0, -2);
        ((ViewGroup.MarginLayoutParams) bVar2).topMargin = px;
        flexboxLayout.setLayoutParams(bVar2);
        flexboxLayout.setAlignItems(2);
        flexboxLayout.setFlexWrap(1);
        flexboxLayout.setFlexDirection(0);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RectShape());
        shapeDrawable.getPaint().setColor(0);
        shapeDrawable.setIntrinsicHeight(px2);
        shapeDrawable.setIntrinsicWidth(px2);
        flexboxLayout.setDividerDrawable(shapeDrawable);
        flexboxLayout.setShowDivider(2);
        this.liftTypeDetailItemsFL = flexboxLayout;
        addViews();
        setupConstraints();
    }

    private final void addViews() {
        addView(this.itemsLL);
        addView(this.mapFL);
        FrameLayout frameLayout = this.mapFL;
        frameLayout.addView(this.imageIV);
        frameLayout.addView(this.buttonBV);
        addView(this.headerTAV);
        addView(this.liftTypeDetailItemsFL);
    }

    private final float getDetailItemGuidePercent() {
        return isSmallScreen() ? 0.18f : 0.17f;
    }

    private final float getTextEndGuidePercent() {
        return isSmallScreen() ? 0.314f : 0.343f;
    }

    private final float getTextGuidePercent() {
        return isSmallScreen() ? 0.29f : 0.3f;
    }

    private final boolean isSmallScreen() {
        return getResources().getDisplayMetrics().widthPixels <= 320;
    }

    private final void setupConstraints() {
        ConstraintLayoutExtensionsKt.applyConstraint(this, new SkiResortInfoTrailsView$setupConstraints$1(this));
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x019b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void bind(@NotNull SkiResortInfoVO.TrailsVO item, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        boolean z11;
        CornerRadius cornerRadius;
        int i11 = 0;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        if (this.cachedTrailItemViews.size() != item.getItems().size()) {
            this.itemsLL.removeAllViews();
            this.cachedTrailItemViews.clear();
        }
        int i12 = 0;
        for (Object obj : item.getItems()) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                C7714v.O0();
                throw null;
            }
            SkiResortInfoVO.TrailsVO.TrailItemVO trailItemVO = (SkiResortInfoVO.TrailsVO.TrailItemVO) obj;
            if (this.cachedTrailItemViews.get(Integer.valueOf(i12)) == null) {
                ConstraintLayout constraintLayout = new ConstraintLayout(getContext());
                ConstraintLayout.b bVar = new ConstraintLayout.b(-1, -2);
                ((ViewGroup.MarginLayoutParams) bVar).bottomMargin = i12 != C7714v.P(item.getItems()) ? this.dp12 : 0;
                constraintLayout.setLayoutParams(bVar);
                this.cachedTrailItemViews.put(Integer.valueOf(i12), constraintLayout);
                this.itemsLL.addView(constraintLayout);
                bind(constraintLayout, trailItemVO);
                Unit unit = Unit.f71690a;
            }
            i12 = i13;
        }
        FrameLayout frameLayout = this.mapFL;
        SkiResortInfoVO.TrailsVO.MapVO map = item.getMap();
        if (map != null) {
            String image = map.getImage().getImage();
            if (image == null || (cornerRadius = map.getImage().getCornerRadius()) == null) {
                return;
            }
            int px = cornerRadius.getPx();
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            ImageViewExtKt.load$default(this.imageIV, image, C7714v.b0(ImageTransformation.CenterCrop.INSTANCE, new ImageTransformation.RoundedCorners(ResourceExtKt.toPx(px, context), null, 2, null)), null, null, null, false, null, 124, null);
            ButtonV3HolderKt.bind(this.buttonBV, map.getButton(), actionHandler);
            z11 = true;
        } else {
            z11 = false;
        }
        frameLayout.setVisibility(z11 ? 0 : 8);
        TextHolderKt.bind$default(this.headerTAV, item.getHeader(), null, 2, null);
        if (item.getMap() != null) {
            ViewGroup.LayoutParams layoutParams = this.headerTAV.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            if ((marginLayoutParams != null ? marginLayoutParams.topMargin : 0) != this.dp16) {
                TextAtomV2View textAtomV2View = this.headerTAV;
                ViewGroup.LayoutParams layoutParams2 = textAtomV2View.getLayoutParams();
                if (layoutParams2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                marginLayoutParams2.topMargin = this.dp16;
                textAtomV2View.setLayoutParams(marginLayoutParams2);
                if (this.cachedLiftTypeDetailItemViews.size() != item.getLiftTypeDetailItems().size()) {
                    this.liftTypeDetailItemsFL.removeAllViews();
                    this.cachedLiftTypeDetailItemViews.clear();
                }
                for (Object obj2 : item.getLiftTypeDetailItems()) {
                    int i14 = i11 + 1;
                    if (i11 < 0) {
                        C7714v.O0();
                        throw null;
                    }
                    SkiResortInfoVO.TrailsVO.TrailLiftTypeDetailItemVO trailLiftTypeDetailItemVO = (SkiResortInfoVO.TrailsVO.TrailLiftTypeDetailItemVO) obj2;
                    if (this.cachedLiftTypeDetailItemViews.get(Integer.valueOf(i11)) == null) {
                        Context context2 = getContext();
                        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                        SkiResortInfoTrailsIconWithTextView skiResortInfoTrailsIconWithTextView = new SkiResortInfoTrailsIconWithTextView(context2);
                        skiResortInfoTrailsIconWithTextView.setLayoutParams(new FlexboxLayout.a(-2, -2));
                        this.cachedLiftTypeDetailItemViews.put(Integer.valueOf(i11), skiResortInfoTrailsIconWithTextView);
                        this.liftTypeDetailItemsFL.addView(skiResortInfoTrailsIconWithTextView);
                        skiResortInfoTrailsIconWithTextView.bind(trailLiftTypeDetailItemVO);
                        Unit unit2 = Unit.f71690a;
                    }
                    i11 = i14;
                }
            }
        }
        if (item.getMap() == null) {
            ViewGroup.LayoutParams layoutParams3 = this.headerTAV.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
            if ((marginLayoutParams3 != null ? marginLayoutParams3.topMargin : 0) != this.dp20) {
                TextAtomV2View textAtomV2View2 = this.headerTAV;
                ViewGroup.LayoutParams layoutParams4 = textAtomV2View2.getLayoutParams();
                if (layoutParams4 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams4;
                marginLayoutParams4.topMargin = this.dp20;
                textAtomV2View2.setLayoutParams(marginLayoutParams4);
            }
        }
        if (this.cachedLiftTypeDetailItemViews.size() != item.getLiftTypeDetailItems().size()) {
        }
        while (r1.hasNext()) {
        }
    }

    private final void bind(ConstraintLayout constraintLayout, SkiResortInfoVO.TrailsVO.TrailItemVO trailItemVO) {
        float detailItemGuidePercent;
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = constraintLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Integer parseColor = styleParser.parseColor(context, trailItemVO.getTrailColorToken());
        if (parseColor != null) {
            int intValue = parseColor.intValue();
            View view = new View(constraintLayout.getContext());
            view.setId(R$id.skiResortInfoTrailColorTokenV);
            int i11 = this.dp10;
            ConstraintLayout.b bVar = new ConstraintLayout.b(i11, i11);
            int i12 = R$id.skiResortInfoTextTAV;
            bVar.f41636i = i12;
            bVar.f41656t = 0;
            bVar.f41642l = i12;
            view.setLayoutParams(bVar);
            ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
            shapeDrawable.getPaint().setColor(intValue);
            view.setBackground(shapeDrawable);
            constraintLayout.addView(view);
        }
        int generateViewId = View.generateViewId();
        Guideline guideline = new Guideline(constraintLayout.getContext());
        ConstraintLayout.b a11 = a.a(guideline, generateViewId, 0, -2);
        int i13 = 1;
        a11.f41615V = 1;
        a11.f41624c = getTextGuidePercent();
        guideline.setLayoutParams(a11);
        constraintLayout.addView(guideline);
        q qVar = q.f64554a;
        d b11 = N.b(TextAtomV2View.class);
        Context context2 = constraintLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        View g10 = qVar.g(b11, context2);
        TextAtomV2View textAtomV2View = (TextAtomV2View) g10;
        ConstraintLayout.b d11 = b.d(textAtomV2View, R$id.skiResortInfoTextTAV, 0, -2);
        d11.f41636i = 0;
        d11.f41655s = R$id.skiResortInfoTrailColorTokenV;
        d11.f41658v = generateViewId;
        d11.f41642l = 0;
        ((ViewGroup.MarginLayoutParams) d11).leftMargin = this.dp6;
        textAtomV2View.setLayoutParams(d11);
        constraintLayout.addView(g10);
        TextHolderKt.bind$default(textAtomV2View, trailItemVO.getText(), null, 2, null);
        ArrayList arrayList = new ArrayList();
        int i14 = 0;
        for (Object obj : trailItemVO.getCategoryDetailItems()) {
            int i15 = i14 + 1;
            if (i14 >= 0) {
                SkiResortInfoVO.TrailsVO.TrailCategoryDetailItemVO trailCategoryDetailItemVO = (SkiResortInfoVO.TrailsVO.TrailCategoryDetailItemVO) obj;
                int generateViewId2 = View.generateViewId();
                Guideline guideline2 = new Guideline(constraintLayout.getContext());
                ConstraintLayout.b a12 = a.a(guideline2, generateViewId2, -2, -2);
                a12.f41615V = i13;
                if (i14 == 0) {
                    detailItemGuidePercent = getTextEndGuidePercent();
                } else {
                    detailItemGuidePercent = (getDetailItemGuidePercent() * i14) + getTextEndGuidePercent();
                }
                a12.f41624c = detailItemGuidePercent;
                guideline2.setLayoutParams(a12);
                constraintLayout.addView(guideline2);
                int generateViewId3 = View.generateViewId();
                arrayList.add(Integer.valueOf(generateViewId3));
                int intValue2 = i14 == 0 ? R$id.skiResortInfoTextTAV : ((Number) arrayList.get(i14 - 1)).intValue();
                ConstraintLayout.b bVar2 = new ConstraintLayout.b(0, -2);
                bVar2.f41636i = intValue2;
                bVar2.f41655s = generateViewId2;
                bVar2.f41642l = intValue2;
                if (trailCategoryDetailItemVO instanceof SkiResortInfoVO.TrailsVO.TrailCategoryDetailItemVO.Space) {
                    View space = new Space(constraintLayout.getContext());
                    space.setId(generateViewId3);
                    space.setLayoutParams(bVar2);
                    constraintLayout.addView(space);
                } else if (trailCategoryDetailItemVO instanceof SkiResortInfoVO.TrailsVO.TrailCategoryDetailItemVO.Content) {
                    Context context3 = constraintLayout.getContext();
                    Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                    SkiResortInfoTrailsIconWithTextView skiResortInfoTrailsIconWithTextView = new SkiResortInfoTrailsIconWithTextView(context3);
                    skiResortInfoTrailsIconWithTextView.setId(generateViewId3);
                    skiResortInfoTrailsIconWithTextView.setLayoutParams(bVar2);
                    constraintLayout.addView(skiResortInfoTrailsIconWithTextView);
                    skiResortInfoTrailsIconWithTextView.bind((SkiResortInfoVO.TrailsVO.TrailDetailItem) trailCategoryDetailItemVO);
                } else {
                    throw new o();
                }
                i14 = i15;
                i13 = 1;
            } else {
                C7714v.O0();
                throw null;
            }
        }
    }
}
