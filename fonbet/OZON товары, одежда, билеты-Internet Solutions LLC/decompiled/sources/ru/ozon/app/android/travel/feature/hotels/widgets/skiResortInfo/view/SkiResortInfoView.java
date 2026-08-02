package ru.ozon.app.android.travel.feature.hotels.widgets.skiResortInfo.view;

import D40.a;
import F3.G;
import Sc.o;
import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import gk0.q;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.hotels.R$id;
import ru.ozon.app.android.travel.feature.hotels.widgets.skiResortInfo.presentation.SkiResortInfoVO;
import ru.ozon.app.android.travel.feature.hotels.widgets.skiResortInfo.view.topics.trails.SkiResortInfoTrailsView;
import ru.ozon.app.android.travel.feature.hotels.widgets.skiResortInfo.view.topics.weather.SkiResortInfoWeatherView;
import ru.ozon.app.android.travel.molecules.utils.ShapeDrawableWithBorder;
import ru.ozon.app.android.travel.utils.extensions.ConstraintLayoutExtensionsKt;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.atom.image.Image;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.view.atoms.tabs.TabAtomView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.af.AtomsAdapter;
import ru.ozon.uni.atoms.af.layout.VerticalAtomsLayout;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.tabs.Tabs;
import ru.ozon.uni.atoms.v3.holders.image.ImageHolderKt;
import ru.ozon.uni.atoms.v3.holders.tabs.TabHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\"\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u0002002\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020.02J\b\u00104\u001a\u00020.H\u0002J\b\u00105\u001a\u00020.H\u0002J\b\u00106\u001a\u00020.H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"0 X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020$X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020&X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020(X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020*X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020,X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00067"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/skiResortInfo/view/SkiResortInfoView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "dp4", "", "dp10", "dp13", "dp16", "dpf20", "", "dpf24", "dp114", "isSmallScreen", "", "()Z", "titleGuidePercent", "getTitleGuidePercent", "()F", "titleTAV", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "titleGuidelineG", "Landroidx/constraintlayout/widget/Guideline;", "themeImageI", "Lru/ozon/uni/android/atom/image/Image;", "tabsTAV", "Lru/ozon/uni/android/uikit/view/atoms/tabs/TabAtomView;", "topicsFL", "Landroid/widget/FrameLayout;", "topicsViewsMap", "", "", "Landroid/view/View;", "aboutAtomsAdapter", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "aboutView", "Lru/ozon/uni/atoms/af/layout/VerticalAtomsLayout;", "trailsView", "Lru/ozon/app/android/travel/feature/hotels/widgets/skiResortInfo/view/topics/trails/SkiResortInfoTrailsView;", "weatherView", "Lru/ozon/app/android/travel/feature/hotels/widgets/skiResortInfo/view/topics/weather/SkiResortInfoWeatherView;", "shapeDrawableWithBorder", "Lru/ozon/app/android/travel/molecules/utils/ShapeDrawableWithBorder;", "bind", "", "item", "Lru/ozon/app/android/travel/feature/hotels/widgets/skiResortInfo/presentation/SkiResortInfoVO;", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "setupRoot", "addViews", "setupConstraints", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SkiResortInfoView extends ConstraintLayout {

    @NotNull
    private final AtomsAdapter aboutAtomsAdapter;

    @NotNull
    private final VerticalAtomsLayout aboutView;
    private final int dp10;
    private final int dp114;
    private final int dp13;
    private final int dp16;
    private final int dp4;
    private final float dpf20;
    private final float dpf24;

    @NotNull
    private final ShapeDrawableWithBorder shapeDrawableWithBorder;

    @NotNull
    private final TabAtomView tabsTAV;

    @NotNull
    private final Image themeImageI;

    @NotNull
    private final Guideline titleGuidelineG;

    @NotNull
    private final TextAtomV2View titleTAV;

    @NotNull
    private final FrameLayout topicsFL;

    @NotNull
    private final Map<String, View> topicsViewsMap;

    @NotNull
    private final SkiResortInfoTrailsView trailsView;

    @NotNull
    private final SkiResortInfoWeatherView weatherView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SkiResortInfoView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.dp4 = ResourceExtKt.toPx(4, context);
        this.dp10 = ResourceExtKt.toPx(10, context);
        this.dp13 = ResourceExtKt.toPx(13, context);
        this.dp16 = ResourceExtKt.toPx(16, context);
        this.dpf20 = ResourceExtKt.toPxF(20, context);
        this.dpf24 = ResourceExtKt.toPxF(24, context);
        int px = ResourceExtKt.toPx(114, context);
        this.dp114 = px;
        q qVar = q.f64554a;
        TextAtomV2View textAtomV2View = (TextAtomV2View) qVar.g(N.b(TextAtomV2View.class), context);
        G.g(textAtomV2View, R$id.skiResortInfoTitleTAV, 0, -2);
        this.titleTAV = textAtomV2View;
        Guideline guideline = new Guideline(context);
        ConstraintLayout.b a11 = a.a(guideline, R$id.skiResortInfoTitleGuidelineG, -2, -2);
        a11.f41615V = 1;
        a11.f41624c = getTitleGuidePercent();
        guideline.setLayoutParams(a11);
        this.titleGuidelineG = guideline;
        Image image = (Image) qVar.i(N.b(Image.class), context);
        image = image == null ? new Image(context, null, 0, 6, null) : image;
        image.setId(R$id.skiResortInfoImageI);
        image.setLayoutParams(new ConstraintLayout.b(px, px));
        this.themeImageI = image;
        TabAtomView tabAtomView = new TabAtomView(context, null, 0, 0, 14, null);
        tabAtomView.setId(R$id.skiResortInfoTabsTAV);
        tabAtomView.setLayoutParams(new ConstraintLayout.b(0, -2));
        this.tabsTAV = tabAtomView;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(R$id.skiResortInfoTopicsFL);
        frameLayout.setLayoutParams(new ConstraintLayout.b(0, -2));
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        float[] fArr = new float[8];
        for (int i11 = 0; i11 < 8; i11++) {
            fArr[i11] = this.dpf20;
        }
        shapeDrawable.setShape(new RoundRectShape(fArr, null, null));
        shapeDrawable.getPaint().setColor(ThemeExtKt.themeColor(context, R$attr.layerFloor1));
        frameLayout.setBackground(shapeDrawable);
        int i12 = this.dp16;
        frameLayout.setPadding(i12, i12, i12, i12);
        this.topicsFL = frameLayout;
        this.topicsViewsMap = new LinkedHashMap();
        AtomsAdapter atomsAdapter = new AtomsAdapter(null, null, null, null, 15, null);
        this.aboutAtomsAdapter = atomsAdapter;
        VerticalAtomsLayout verticalAtomsLayout = new VerticalAtomsLayout(context, null, 0, 6, null);
        verticalAtomsLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        verticalAtomsLayout.setAdapter(atomsAdapter);
        verticalAtomsLayout.setVisibility(8);
        this.aboutView = verticalAtomsLayout;
        SkiResortInfoTrailsView skiResortInfoTrailsView = new SkiResortInfoTrailsView(context);
        skiResortInfoTrailsView.setId(R$id.skiResortInfoTrailsView);
        skiResortInfoTrailsView.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        skiResortInfoTrailsView.setVisibility(8);
        this.trailsView = skiResortInfoTrailsView;
        SkiResortInfoWeatherView skiResortInfoWeatherView = new SkiResortInfoWeatherView(context);
        skiResortInfoWeatherView.setId(R$id.skiResortInfoWeatherView);
        skiResortInfoWeatherView.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        skiResortInfoWeatherView.setVisibility(8);
        this.weatherView = skiResortInfoWeatherView;
        Float valueOf = Float.valueOf(0.0f);
        float[] fArr2 = new float[8];
        for (int i13 = 0; i13 < 8; i13++) {
            fArr2[i13] = this.dpf24;
        }
        float[] fArr3 = new float[8];
        for (int i14 = 0; i14 < 8; i14++) {
            fArr3[i14] = this.dpf24;
        }
        this.shapeDrawableWithBorder = new ShapeDrawableWithBorder(context, valueOf, fArr2, fArr3);
        setupRoot();
        addViews();
        setupConstraints();
    }

    private final void addViews() {
        addView(this.titleTAV);
        addView(this.titleGuidelineG);
        addView(this.themeImageI);
        addView(this.tabsTAV);
        addView(this.topicsFL);
        FrameLayout frameLayout = this.topicsFL;
        frameLayout.addView(this.aboutView);
        frameLayout.addView(this.trailsView);
        frameLayout.addView(this.weatherView);
    }

    private final float getTitleGuidePercent() {
        return isSmallScreen() ? 0.71f : 0.61f;
    }

    private final boolean isSmallScreen() {
        return getResources().getDisplayMetrics().widthPixels <= 320;
    }

    private final void setupConstraints() {
        ConstraintLayoutExtensionsKt.applyConstraint(this, new SkiResortInfoView$setupConstraints$1(this));
    }

    private final void setupRoot() {
        setBackground(this.shapeDrawableWithBorder);
        setClipChildren(true);
    }

    public final void bind(@NotNull SkiResortInfoVO item, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Object obj;
        View view;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Object obj2 = null;
        ShapeDrawableWithBorder.setFillColor$default(this.shapeDrawableWithBorder, item.getBackgroundColor(), 0, 2, null);
        TextHolderKt.bind$default(this.titleTAV, item.getTitle(), null, 2, null);
        ImageHolderKt.bind$default(this.themeImageI, item.getThemeImage(), null, 2, null);
        TabHolderKt.bind(this.tabsTAV, item.getTabs(), actionHandler);
        for (SkiResortInfoVO.TopicVO topicVO : item.getTopics()) {
            SkiResortInfoVO.Content content = topicVO.getContent();
            if (content instanceof SkiResortInfoVO.AboutVO) {
                AtomsAdapter atomsAdapter = this.aboutAtomsAdapter;
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                atomsAdapter.bind(context, ((SkiResortInfoVO.AboutVO) content).getTexts());
                view = this.aboutView;
            } else if (content instanceof SkiResortInfoVO.TrailsVO) {
                this.trailsView.bind((SkiResortInfoVO.TrailsVO) content, actionHandler);
                view = this.trailsView;
            } else {
                if (!(content instanceof SkiResortInfoVO.WeatherVO)) {
                    throw new o();
                }
                this.weatherView.m1439bindLWEc1jk(((SkiResortInfoVO.WeatherVO) content).getItems());
                view = this.weatherView;
            }
            this.topicsViewsMap.put(topicVO.getId(), view);
        }
        Iterator<T> it = item.getTabs().getTabItems().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((Tabs.TabsItem) obj).isSelected()) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        Tabs.TabsItem tabsItem = (Tabs.TabsItem) obj;
        if (tabsItem != null) {
            Iterator<T> it2 = item.getTopics().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                String id2 = ((SkiResortInfoVO.TopicVO) next).getId();
                AtomActionDTO action = tabsItem.getAction();
                if (Intrinsics.d(id2, action != null ? action.getId() : null)) {
                    obj2 = next;
                    break;
                }
            }
            SkiResortInfoVO.TopicVO topicVO2 = (SkiResortInfoVO.TopicVO) obj2;
            if (topicVO2 != null) {
                Iterator<T> it3 = this.topicsViewsMap.entrySet().iterator();
                while (it3.hasNext()) {
                    Map.Entry entry = (Map.Entry) it3.next();
                    ((View) entry.getValue()).setVisibility(Intrinsics.d(topicVO2.getId(), (String) entry.getKey()) ? 0 : 8);
                }
            }
        }
    }
}
