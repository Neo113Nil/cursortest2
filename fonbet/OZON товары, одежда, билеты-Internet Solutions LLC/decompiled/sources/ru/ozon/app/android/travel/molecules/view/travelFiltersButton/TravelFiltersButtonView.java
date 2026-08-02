package ru.ozon.app.android.travel.molecules.view.travelFiltersButton;

import Sc.o;
import WZ.t;
import Xc.a;
import Xc.b;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import gk0.q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.travel.molecules.view.travelFiltersButton.TravelFiltersButtonVO;
import ru.ozon.app.android.travel.ui.molecules.R$styleable;
import ru.ozon.app.android.travel.utils.RoundedBackgroundProducer;
import ru.ozon.app.android.travel.utils.extensions.ConstraintLayoutExtensionsKt;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001-B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ7\u0010\u0013\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u000b2 \u0010\u0012\u001a\u001c\u0012\u0004\u0012\u00020\u000e\u0012\f\u0012\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u0010\u0012\u0004\u0012\u00020\u00110\r¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001c\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001eR\u0014\u0010 \u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001bR\u0014\u0010!\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001eR\u0014\u0010\"\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u001eR\u0014\u0010#\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u001eR\u0014\u0010$\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u001eR\u0014\u0010%\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u001eR\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010,\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010+¨\u0006."}, d2 = {"Lru/ozon/app/android/travel/molecules/view/travelFiltersButton/TravelFiltersButtonView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Lru/ozon/app/android/travel/molecules/view/travelFiltersButton/TravelFiltersButtonVO;", "item", "Lkotlin/Function2;", "Lru/ozon/uni/atoms/af/AtomAction;", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "", "onAction", "bind", "(Lru/ozon/app/android/travel/molecules/view/travelFiltersButton/TravelFiltersButtonVO;Lkotlin/jvm/functions/Function2;)V", "Lru/ozon/app/android/travel/molecules/view/travelFiltersButton/TravelFiltersButtonView$CounterPosition;", "counterPosition", "setCounterPosition", "(Lru/ozon/app/android/travel/molecules/view/travelFiltersButton/TravelFiltersButtonView$CounterPosition;)V", "", "biasRightTop", "F", "biasRight", "dp4", "I", "dp8", "dp10", "dp14", "dp15", "dp16", "dp20", "dp24", "Landroidx/appcompat/widget/AppCompatImageView;", "travelFiltersButtonIconIv", "Landroidx/appcompat/widget/AppCompatImageView;", "Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "travelFiltersButtonLabelTav", "Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "travelFiltersButtonCounterTav", "CounterPosition", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TravelFiltersButtonView extends ConstraintLayout {
    private final float biasRight;
    private final float biasRightTop;
    private final float dp10;
    private final int dp14;
    private final int dp15;
    private final int dp16;
    private final int dp20;
    private final int dp24;
    private final int dp4;
    private final int dp8;

    @NotNull
    private final TextAtomView travelFiltersButtonCounterTav;

    @NotNull
    private final AppCompatImageView travelFiltersButtonIconIv;

    @NotNull
    private final TextAtomView travelFiltersButtonLabelTav;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/travel/molecules/view/travelFiltersButton/TravelFiltersButtonView$CounterPosition;", "", "<init>", "(Ljava/lang/String;I)V", "RIGHT", "RIGHT_TOP", "RIGHT_TOP_OVERLAY", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class CounterPosition {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ CounterPosition[] $VALUES;
        public static final CounterPosition RIGHT = new CounterPosition("RIGHT", 0);
        public static final CounterPosition RIGHT_TOP = new CounterPosition("RIGHT_TOP", 1);
        public static final CounterPosition RIGHT_TOP_OVERLAY = new CounterPosition("RIGHT_TOP_OVERLAY", 2);

        private static final /* synthetic */ CounterPosition[] $values() {
            return new CounterPosition[]{RIGHT, RIGHT_TOP, RIGHT_TOP_OVERLAY};
        }

        static {
            CounterPosition[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private CounterPosition(String str, int i11) {
        }

        public static CounterPosition valueOf(String str) {
            return (CounterPosition) Enum.valueOf(CounterPosition.class, str);
        }

        public static CounterPosition[] values() {
            return (CounterPosition[]) $VALUES.clone();
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CounterPosition.values().length];
            try {
                iArr[CounterPosition.RIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CounterPosition.RIGHT_TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CounterPosition.RIGHT_TOP_OVERLAY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TravelFiltersButtonView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$13$lambda$12(TravelFiltersButtonVO travelFiltersButtonVO, Function2 function2, View view) {
        AtomAction atomAction = travelFiltersButtonVO.getAtomAction();
        if (atomAction != null) {
            function2.invoke(atomAction, travelFiltersButtonVO.getClickEvent());
        }
    }

    public final void bind(@NotNull TravelFiltersButtonVO item, @NotNull Function2<? super AtomAction, ? super t, Unit> onAction) {
        String automatizationId;
        Paint paint;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        AppCompatImageView appCompatImageView = this.travelFiltersButtonIconIv;
        ImageViewExtKt.load$default(appCompatImageView, item.getIcon().getImage(), null, null, null, null, false, null, 126, null);
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = appCompatImageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ThemeExtKt.tint(appCompatImageView, styleParser.parseColor(context, item.getIcon().getTintColor()));
        TextAtomHolderKt.bindOrGone$default(this.travelFiltersButtonLabelTav, item.getLabel(), null, 2, null);
        TextAtomView textAtomView = this.travelFiltersButtonCounterTav;
        TravelFiltersButtonVO.CountBadge countBadge = item.getCountBadge();
        TextAtomHolderKt.bindOrGone$default(textAtomView, countBadge != null ? countBadge.getText() : null, null, 2, null);
        Context context2 = textAtomView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        TravelFiltersButtonVO.CountBadge countBadge2 = item.getCountBadge();
        Integer parseColor = styleParser.parseColor(context2, countBadge2 != null ? countBadge2.getBackgroundColor() : null);
        if (parseColor != null) {
            int intValue = parseColor.intValue();
            Drawable background = textAtomView.getBackground();
            ShapeDrawable shapeDrawable = background instanceof ShapeDrawable ? (ShapeDrawable) background : null;
            if (shapeDrawable != null && (paint = shapeDrawable.getPaint()) != null) {
                paint.setColor(intValue);
            }
        }
        setOnClickListener(new ED.a(4, item, onAction));
        TestInfo testInfo = item.getTestInfo();
        if (testInfo == null || (automatizationId = testInfo.getAutomatizationId()) == null) {
            return;
        }
        setContentDescription(automatizationId);
    }

    public final void setCounterPosition(@NotNull CounterPosition counterPosition) {
        Intrinsics.checkNotNullParameter(counterPosition, "counterPosition");
        int i11 = WhenMappings.$EnumSwitchMapping$0[counterPosition.ordinal()];
        if (i11 == 1) {
            d dVar = new d();
            dVar.p(this);
            dVar.f0(this.biasRight, this.travelFiltersButtonIconIv.getId());
            ConstraintLayoutExtensionsKt.startToEnd(dVar, this.travelFiltersButtonCounterTav, this.travelFiltersButtonLabelTav, this.dp8);
            ConstraintLayoutExtensionsKt.topToTop(dVar, this.travelFiltersButtonCounterTav, this.travelFiltersButtonIconIv);
            dVar.e0(this.travelFiltersButtonCounterTav.getId(), 4, 0);
            dVar.f(this);
            return;
        }
        if (i11 == 2) {
            d dVar2 = new d();
            dVar2.p(this);
            dVar2.f0(this.biasRightTop, this.travelFiltersButtonIconIv.getId());
            ConstraintLayoutExtensionsKt.startToStart(dVar2, this.travelFiltersButtonCounterTav, this.travelFiltersButtonIconIv, this.dp16);
            dVar2.e0(this.travelFiltersButtonCounterTav.getId(), 4, this.dp20);
            dVar2.o(this.travelFiltersButtonCounterTav.getId(), 3);
            dVar2.f(this);
            return;
        }
        if (i11 != 3) {
            throw new o();
        }
        d dVar3 = new d();
        dVar3.p(this);
        dVar3.f0(this.biasRightTop, this.travelFiltersButtonIconIv.getId());
        ConstraintLayoutExtensionsKt.startToStart(dVar3, this.travelFiltersButtonCounterTav, this.travelFiltersButtonIconIv, this.dp15);
        dVar3.e0(this.travelFiltersButtonCounterTav.getId(), 4, this.dp14);
        dVar3.o(this.travelFiltersButtonCounterTav.getId(), 3);
        dVar3.f(this);
    }

    public /* synthetic */ TravelFiltersButtonView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TravelFiltersButtonView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        this.biasRightTop = 1.0f;
        this.biasRight = 0.5f;
        int px = ResourceExtKt.toPx(4, context);
        this.dp4 = px;
        int px2 = ResourceExtKt.toPx(8, context);
        this.dp8 = px2;
        float pxF = ResourceExtKt.toPxF(10, context);
        this.dp10 = pxF;
        this.dp14 = ResourceExtKt.toPx(14, context);
        this.dp15 = ResourceExtKt.toPx(15, context);
        int px3 = ResourceExtKt.toPx(16, context);
        this.dp16 = px3;
        this.dp20 = ResourceExtKt.toPx(20, context);
        int px4 = ResourceExtKt.toPx(24, context);
        this.dp24 = px4;
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        appCompatImageView.setId(View.generateViewId());
        ConstraintLayout.b bVar = new ConstraintLayout.b(px4, px4);
        bVar.f41656t = 0;
        bVar.f41642l = 0;
        bVar.f41636i = 0;
        appCompatImageView.setLayoutParams(bVar);
        this.travelFiltersButtonIconIv = appCompatImageView;
        q qVar = q.f64554a;
        TextAtomView textAtomView = (TextAtomView) qVar.g(N.b(TextAtomView.class), context);
        textAtomView.setId(View.generateViewId());
        ConstraintLayout.b bVar2 = new ConstraintLayout.b(-2, -2);
        bVar2.setMarginStart(px2);
        bVar2.f41655s = appCompatImageView.getId();
        bVar2.f41636i = appCompatImageView.getId();
        bVar2.f41642l = appCompatImageView.getId();
        textAtomView.setLayoutParams(bVar2);
        textAtomView.setVisibility(8);
        this.travelFiltersButtonLabelTav = textAtomView;
        TextAtomView textAtomView2 = (TextAtomView) qVar.g(N.b(TextAtomView.class), context);
        textAtomView2.setId(View.generateViewId());
        ConstraintLayout.b bVar3 = new ConstraintLayout.b(-2, -2);
        bVar3.setMarginStart(px2);
        bVar3.f41655s = textAtomView.getId();
        bVar3.f41636i = appCompatImageView.getId();
        bVar3.f41642l = appCompatImageView.getId();
        bVar3.f41594A = px;
        textAtomView2.setLayoutParams(bVar3);
        textAtomView2.setBackground(new RoundedBackgroundProducer().produce(0, pxF));
        textAtomView2.setGravity(17);
        textAtomView2.setMinWidth(px3);
        textAtomView2.setMinHeight(px3);
        ViewExtKt.updatePadding$default(textAtomView2, px, 0, px, 0, 10, null);
        textAtomView2.setVisibility(8);
        this.travelFiltersButtonCounterTav = textAtomView2;
        addView(appCompatImageView);
        addView(textAtomView);
        addView(textAtomView2);
        CounterPosition counterPosition = CounterPosition.RIGHT;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R$styleable.TravelFiltersButtonView, 0, 0);
            try {
                int i13 = obtainStyledAttributes.getInt(R$styleable.TravelFiltersButtonView_tfbvCounterPosition, counterPosition.ordinal());
                CounterPosition counterPosition2 = CounterPosition.RIGHT_TOP;
                counterPosition = i13 == counterPosition2.ordinal() ? counterPosition2 : counterPosition;
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        if (counterPosition == CounterPosition.RIGHT_TOP) {
            setCounterPosition(counterPosition);
        }
    }
}
