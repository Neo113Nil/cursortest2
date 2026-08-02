package ru.ozon.app.android.travel.feature.general.booking.widgets.searchResultsNavTitle.v2.view;

import JG.b;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.widget.LinearLayout;
import gk0.q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.booking.widgets.searchResultsNavTitle.v2.presentation.SearchResultsNavTitleV2VO;
import ru.ozon.app.android.travel.utils.RoundedBackgroundProducer;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\"\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00142\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fJ\u0018\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0011H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/searchResultsNavTitle/v2/view/SearchResultsNavTitleV2View;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "radius", "", "titleView", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "subtitleView", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "clickAction", "backgroundColor", "", "bind", "item", "Lru/ozon/app/android/travel/feature/general/booking/widgets/searchResultsNavTitle/v2/presentation/SearchResultsNavTitleV2VO;", "createTextView", "topMargin", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SearchResultsNavTitleV2View extends LinearLayout {
    private Function1<? super AtomAction, Unit> actionHandler;
    private int backgroundColor;
    private AtomAction clickAction;
    private final float radius;

    @NotNull
    private final TextAtomV2View subtitleView;

    @NotNull
    private final TextAtomV2View titleView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchResultsNavTitleV2View(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        float pxF = ResourceExtKt.toPxF(20, context);
        this.radius = pxF;
        TextAtomV2View createTextView = createTextView(context, 0);
        this.titleView = createTextView;
        TextAtomV2View createTextView2 = createTextView(context, ResourceExtKt.toPx(2, context));
        this.subtitleView = createTextView2;
        this.backgroundColor = ThemeExtKt.themeColor(context, R$attr.layerFloor0);
        setOrientation(1);
        setGravity(17);
        addView(createTextView);
        addView(createTextView2);
        setBackground(new RoundedBackgroundProducer().produce(this.backgroundColor, pxF));
        setOnClickListener(new b(this, 6));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(SearchResultsNavTitleV2View searchResultsNavTitleV2View, View view) {
        Function1<? super AtomAction, Unit> function1;
        AtomAction atomAction = searchResultsNavTitleV2View.clickAction;
        if (atomAction == null || (function1 = searchResultsNavTitleV2View.actionHandler) == null) {
            return;
        }
        function1.invoke(atomAction);
    }

    private final TextAtomV2View createTextView(Context context, int topMargin) {
        TextAtomV2View textAtomV2View = (TextAtomV2View) q.f64554a.g(N.b(TextAtomV2View.class), context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(0, topMargin, 0, 0);
        textAtomV2View.setLayoutParams(layoutParams);
        textAtomV2View.setTextIsSelectable(false);
        return textAtomV2View;
    }

    public final void bind(@NotNull SearchResultsNavTitleV2VO item, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        int intValue;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        this.actionHandler = actionHandler;
        this.clickAction = item.getClickAction();
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Integer parseColor = styleParser.parseColor(context, item.getBackgroundColor());
        if (parseColor != null && (intValue = parseColor.intValue()) != this.backgroundColor) {
            this.backgroundColor = intValue;
            Drawable background = getBackground();
            ShapeDrawable shapeDrawable = background instanceof ShapeDrawable ? (ShapeDrawable) background : null;
            if (shapeDrawable != null) {
                shapeDrawable.getPaint().setColor(this.backgroundColor);
            }
        }
        TextHolderKt.bind$default(this.titleView, item.getTitle(), null, 2, null);
        TextHolderKt.bind$default(this.subtitleView, item.getSubtitle(), null, 2, null);
    }
}
