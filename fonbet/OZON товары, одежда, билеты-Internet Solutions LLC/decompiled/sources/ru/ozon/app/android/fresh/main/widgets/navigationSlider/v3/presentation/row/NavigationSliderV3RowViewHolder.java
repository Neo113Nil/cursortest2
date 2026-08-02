package ru.ozon.app.android.fresh.main.widgets.navigationSlider.v3.presentation.row;

import Dc0.m;
import Dc0.n;
import Sc.o;
import W10.c;
import WZ.l;
import WZ.t;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7705l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.fresh.main.databinding.ItemRowNavSliderV3Binding;
import ru.ozon.app.android.fresh.main.widgets.navigationSlider.v3.data.NavigationSliderV3DTO;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B#\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0014\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0015\u0010\u0013J#\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u00022\n\u0010\u0018\u001a\u00060\u0016j\u0002`\u0017H\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ3\u0010!\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u00022\n\u0010\u001d\u001a\u00060\u001bj\u0002`\u001c2\u000e\u0010 \u001a\n\u0018\u00010\u001ej\u0004\u0018\u0001`\u001fH\u0016¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010#R\u0018\u0010\b\u001a\u00060\u0006j\u0002`\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010$R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010/\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010.R\u0014\u00101\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00104\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00106\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00105R\u0014\u00107\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u0010.R\u0014\u00108\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u0010.R\u0014\u00109\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010.R \u0010<\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020\u000e0:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\"\u0010?\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010>\u0012\u0004\u0012\u00020\u000e0:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010=¨\u0006@"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v3/presentation/row/NavigationSliderV3RowViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v3/presentation/row/NavigationSliderV3RowVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "<init>", "(Landroid/view/View;LWZ/l;Lru/ozon/app/android/composer/ComposerReferences;)V", "item", "", "prepareLayout", "(Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v3/presentation/row/NavigationSliderV3RowVO;)V", "defaultCorners", "applyBottomCorners", "()V", "applyTopCorners", "applyFullCorners", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v3/presentation/row/NavigationSliderV3RowVO;Ll20/d;)V", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "Lru/ozon/app/android/tools/ViewedPond;", "viewedPond", "trackView", "(Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v3/presentation/row/NavigationSliderV3RowVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Landroid/view/View;", "LWZ/l;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/fresh/main/databinding/ItemRowNavSliderV3Binding;", "binding", "Lru/ozon/app/android/fresh/main/databinding/ItemRowNavSliderV3Binding;", "Landroid/graphics/drawable/GradientDrawable;", "topBackgroundLayer", "Landroid/graphics/drawable/GradientDrawable;", "", "topPadding", "I", "bottomPadding", "", "corner", "F", "", "cornerRadii24", "[F", "cornerRadii0", "padding6", "padding8", "padding14", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v3/presentation/row/NavigationSliderV3ItemVO;", "itemListener", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class NavigationSliderV3RowViewHolder extends k<NavigationSliderV3RowVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final ItemRowNavSliderV3Binding binding;
    private final int bottomPadding;

    @NotNull
    private final View containerView;
    private final float corner;

    @NotNull
    private final float[] cornerRadii0;

    @NotNull
    private final float[] cornerRadii24;

    @NotNull
    private final Function1<NavigationSliderV3ItemVO, Unit> itemListener;
    private final int padding14;
    private final int padding6;
    private final int padding8;

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final GradientDrawable topBackgroundLayer;
    private final int topPadding;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[NavigationSliderV3DTO.Corners.values().length];
            try {
                iArr[NavigationSliderV3DTO.Corners.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NavigationSliderV3DTO.Corners.BOTTOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[NavigationSliderV3DTO.Corners.FULL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[NavigationSliderV3DTO.Corners.WITHOUT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigationSliderV3RowViewHolder(@NotNull View containerView, @NotNull l tokenizedAnalytics, @NotNull ComposerReferences refs) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(refs, "refs");
        this.containerView = containerView;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.refs = refs;
        ItemRowNavSliderV3Binding bind = ItemRowNavSliderV3Binding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        this.topBackgroundLayer = new GradientDrawable();
        this.topPadding = ResourceExtKt.toPx(16);
        this.bottomPadding = ResourceExtKt.toPx(16);
        this.corner = ResourceExtKt.toPxF(24);
        float[] fArr = new float[8];
        for (int i11 = 0; i11 < 8; i11++) {
            fArr[i11] = ResourceExtKt.toPxF(24);
        }
        this.cornerRadii24 = fArr;
        float[] fArr2 = new float[8];
        for (int i12 = 0; i12 < 8; i12++) {
            fArr2[i12] = 0.0f;
        }
        this.cornerRadii0 = fArr2;
        this.padding6 = ResourceExtKt.toPx(6);
        this.padding8 = ResourceExtKt.toPx(8);
        this.padding14 = ResourceExtKt.toPx(14);
        this.actionHandler = new ActionHandler.Builder(this.refs, this).buildHandler();
        this.itemListener = new NavigationSliderV3RowViewHolder$itemListener$1(this);
        this.binding.leftItem.setOnClickListener(new m(this, 15));
        this.binding.rightItem.setOnClickListener(new n(this, 17));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(NavigationSliderV3RowViewHolder navigationSliderV3RowViewHolder, View view) {
        Function1<NavigationSliderV3ItemVO, Unit> function1 = navigationSliderV3RowViewHolder.itemListener;
        NavigationSliderV3RowVO boundedData = navigationSliderV3RowViewHolder.getBoundedData();
        function1.invoke(boundedData != null ? boundedData.getLeftItem() : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(NavigationSliderV3RowViewHolder navigationSliderV3RowViewHolder, View view) {
        Function1<NavigationSliderV3ItemVO, Unit> function1 = navigationSliderV3RowViewHolder.itemListener;
        NavigationSliderV3RowVO boundedData = navigationSliderV3RowViewHolder.getBoundedData();
        function1.invoke(boundedData != null ? boundedData.getRightItem() : null);
    }

    private final void applyBottomCorners() {
        ViewExtKt.updatePadding$default(this.containerView, 0, 0, 0, this.bottomPadding, 7, null);
        View view = this.containerView;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.bottomMargin = this.padding8;
        view.setLayoutParams(marginLayoutParams);
        GradientDrawable gradientDrawable = this.topBackgroundLayer;
        float f7 = this.corner;
        gradientDrawable.setCornerRadii(new float[]{0.0f, 0.0f, 0.0f, 0.0f, f7, f7, f7, f7});
    }

    private final void applyFullCorners() {
        ViewExtKt.updatePadding$default(this.containerView, 0, this.topPadding, 0, this.bottomPadding, 5, null);
        this.topBackgroundLayer.setCornerRadii(this.cornerRadii24);
    }

    private final void applyTopCorners() {
        ViewExtKt.updatePadding$default(this.containerView, 0, this.topPadding, 0, 0, 13, null);
        GradientDrawable gradientDrawable = this.topBackgroundLayer;
        float f7 = this.corner;
        gradientDrawable.setCornerRadii(new float[]{f7, f7, f7, f7, 0.0f, 0.0f, 0.0f, 0.0f});
    }

    private final void defaultCorners(NavigationSliderV3RowVO item) {
        this.topBackgroundLayer.setCornerRadii(this.cornerRadii0);
        View view = this.containerView;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.bottomMargin = 0;
        view.setLayoutParams(marginLayoutParams);
        if (!C7705l.m(new NavigationSliderV3DTO.RowType[]{NavigationSliderV3DTO.RowType.SINGLE, NavigationSliderV3DTO.RowType.FIRST}, item.getRowType()) || item.getHasHeader()) {
            View view2 = this.containerView;
            int i11 = this.padding6;
            ViewExtKt.updatePadding$default(view2, 0, i11, 0, i11, 5, null);
        } else {
            ViewExtKt.updatePadding$default(this.containerView, 0, this.padding14, 0, this.padding6, 5, null);
        }
    }

    private final void prepareLayout(NavigationSliderV3RowVO item) {
        this.topBackgroundLayer.setColor(StyleParser.INSTANCE.parseColor(getContext(), item.getBackgroundColor(), R$color.oz_semantic_bg_secondary));
        this.binding.rowContainer.setBackground(this.topBackgroundLayer);
        defaultCorners(item);
        int i11 = WhenMappings.$EnumSwitchMapping$0[item.getCorners().ordinal()];
        if (i11 == 1) {
            applyTopCorners();
            return;
        }
        if (i11 == 2) {
            applyBottomCorners();
        } else if (i11 == 3) {
            applyFullCorners();
        } else {
            if (i11 != 4) {
                throw new o();
            }
            defaultCorners(item);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull NavigationSliderV3RowVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        prepareLayout(item);
        if (item.getRightItem() != null) {
            NavigationSliderV3ItemView rightItem = this.binding.rightItem;
            Intrinsics.checkNotNullExpressionValue(rightItem, "rightItem");
            ViewExtKt.show(rightItem);
            this.binding.rightItem.bindOrGone(item.getRightItem(), this.actionHandler);
        } else {
            NavigationSliderV3ItemView rightItem2 = this.binding.rightItem;
            Intrinsics.checkNotNullExpressionValue(rightItem2, "rightItem");
            ViewExtKt.gone(rightItem2);
        }
        this.binding.leftItem.bindOrGone(item.getLeftItem(), this.actionHandler);
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull NavigationSliderV3RowVO item, @NotNull c trackingData, f viewedPond) {
        t tokenizedEvent;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        super.trackView((NavigationSliderV3RowViewHolder) item, trackingData, viewedPond);
        t tokenizedEvent2 = item.getLeftItem().getTokenizedEvent();
        if (tokenizedEvent2 != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, tokenizedEvent2, null, 2, null);
        }
        NavigationSliderV3ItemVO rightItem = item.getRightItem();
        if (rightItem == null || (tokenizedEvent = rightItem.getTokenizedEvent()) == null) {
            return;
        }
        TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, tokenizedEvent, null, 2, null);
    }
}
