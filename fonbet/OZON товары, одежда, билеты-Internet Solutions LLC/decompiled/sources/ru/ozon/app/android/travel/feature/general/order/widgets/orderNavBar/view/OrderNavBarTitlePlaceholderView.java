package ru.ozon.app.android.travel.feature.general.order.widgets.orderNavBar.view;

import Bl.b;
import EE.a;
import android.animation.ArgbEvaluator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import androidx.core.view.C5314e0;
import androidx.core.view.C5316f0;
import androidx.recyclerview.widget.LinearLayoutManager;
import gk0.q;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.order.widgets.orderNavBar.presentation.OrderNavBarVO;
import ru.ozon.app.android.travel.utils.placeholder.NestedWidgetsManager;
import ru.ozon.app.android.travel.utils.placeholder.Placeholder;
import ru.ozon.app.android.travel.utils.placeholder.PlaceholderParser;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.composer.ui.widget.l;
import ru.ozon.uni.R$drawable;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.LayoutExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.IconButtonV3HolderKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000º\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 g2\u00020\u00012\u00020\u0002:\u0001gB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J?\u0010\u0011\u001a\u00020\u000f2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J1\u0010\u0019\u001a\u00020\u0013*\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ/\u0010!\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\u0013H\u0014¢\u0006\u0004\b!\u0010\"J7\u0010)\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\u00132\u0006\u0010&\u001a\u00020\u00132\u0006\u0010'\u001a\u00020\u00132\u0006\u0010(\u001a\u00020\u0013H\u0014¢\u0006\u0004\b)\u0010*J-\u0010-\u001a\u00020\u000f2\u001c\u0010,\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0004\u0012\u00020\u000f0+H\u0016¢\u0006\u0004\b-\u0010.J\u0017\u00101\u001a\u00020\u000f2\u0006\u00100\u001a\u00020/H\u0016¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\u000fH\u0016¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\u000fH\u0016¢\u0006\u0004\b5\u00104JO\u0010<\u001a\u00020\u000f2\f\u00106\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u00107\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u00109\u001a\u0002082\b\u0010;\u001a\u0004\u0018\u00010:2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0004\b<\u0010=J\u0015\u0010@\u001a\u00020\u000f2\u0006\u0010?\u001a\u00020>¢\u0006\u0004\b@\u0010AR`\u0010H\u001aN\u0012\u0004\u0012\u00020\u0013\u0012\u001c\u0012\u001a\u0012\b\u0012\u00060Dj\u0002`E0Cj\f\u0012\b\u0012\u00060Dj\u0002`E`F0Bj&\u0012\u0004\u0012\u00020\u0013\u0012\u001c\u0012\u001a\u0012\b\u0012\u00060Dj\u0002`E0Cj\f\u0012\b\u0012\u00060Dj\u0002`E`F`G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010K\u001a\u00020J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0016\u0010N\u001a\u00020M8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010OR\u0018\u0010Q\u001a\u0004\u0018\u00010P8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010S\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0018\u00109\u001a\u0004\u0018\u0001088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010UR \u0010Y\u001a\u000e\u0012\u0004\u0012\u00020W\u0012\u0004\u0012\u00020X0V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\u001a\u0010[\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R\u001a\u0010]\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010\\R\u0014\u0010^\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_R\u0014\u0010`\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010_R\u0014\u0010a\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010_R\u0016\u0010b\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010_R.\u0010,\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0004\u0012\u00020\u000f\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010cR\u0014\u0010e\u001a\u00020d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010f¨\u0006h"}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/orderNavBar/view/OrderNavBarTitlePlaceholderView;", "Landroid/widget/FrameLayout;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "buttons", "", "Landroid/view/View;", "viewSide", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "onAction", "bindButtons", "(Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "", "widthMeasureSpec", "heightMeasureSpec", "measureChild", "(II)I", "availableWidth", "measure", "(Ljava/util/List;III)I", "onMeasure", "(II)V", "width", "height", "oldw", "oldh", "onSizeChanged", "(IIII)V", "", "changed", "left", "top", "right", "bottom", "onLayout", "(ZIIII)V", "Lkotlin/Function2;", "onPlaceholderSizeChanged", "setOnSizeChangeListener", "(Lkotlin/jvm/functions/Function2;)V", "Ll10/i;", "container", "setupNestedWidgetManager", "(Ll10/i;)V", "onWidgetCreated", "()V", "onWidgetDestroyed", "leftButtons", "rightButtons", "Lru/ozon/app/android/travel/feature/general/order/widgets/orderNavBar/presentation/OrderNavBarVO$ButtonsColors;", "buttonsColors", "Lru/ozon/composer/ui/widget/l;", "viewItem", "bind", "(Ljava/util/List;Ljava/util/List;Lru/ozon/app/android/travel/feature/general/order/widgets/orderNavBar/presentation/OrderNavBarVO$ButtonsColors;Lru/ozon/composer/ui/widget/l;Lkotlin/jvm/functions/Function1;)V", "", "alpha", "onChangeAlpha", "(F)V", "Ljava/util/HashMap;", "Lru/ozon/composer/ui/widget/k;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Lkotlin/collections/HashMap;", "currentViewHolders", "Ljava/util/HashMap;", "Lru/ozon/app/android/travel/utils/placeholder/PlaceholderParser;", "placeholderParser", "Lru/ozon/app/android/travel/utils/placeholder/PlaceholderParser;", "Lru/ozon/app/android/travel/utils/placeholder/Placeholder;", "currentPlaceholder", "Lru/ozon/app/android/travel/utils/placeholder/Placeholder;", "Lru/ozon/app/android/travel/utils/placeholder/NestedWidgetsManager;", "nestedWidgetsManager", "Lru/ozon/app/android/travel/utils/placeholder/NestedWidgetsManager;", "titlePlaceholder", "Landroid/widget/FrameLayout;", "Lru/ozon/app/android/travel/feature/general/order/widgets/orderNavBar/presentation/OrderNavBarVO$ButtonsColors;", "", "", "Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", "iconButtonPool", "Ljava/util/Map;", "leftViews", "Ljava/util/List;", "rightViews", "dp2", "I", "dp6", "dp44", "maxHeight", "Lkotlin/jvm/functions/Function2;", "Landroid/animation/ArgbEvaluator;", "argbEvaluator", "Landroid/animation/ArgbEvaluator;", "Companion", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OrderNavBarTitlePlaceholderView extends FrameLayout {

    @NotNull
    private final ArgbEvaluator argbEvaluator;
    private OrderNavBarVO.ButtonsColors buttonsColors;

    @NotNull
    private Placeholder currentPlaceholder;

    @NotNull
    private final HashMap<Integer, k<c>> currentViewHolders;
    private final int dp2;
    private final int dp44;
    private final int dp6;

    @NotNull
    private final Map<String, IconButtonV3View> iconButtonPool;

    @NotNull
    private final List<View> leftViews;
    private int maxHeight;
    private NestedWidgetsManager nestedWidgetsManager;
    private Function2<? super Integer, ? super Integer, Unit> onPlaceholderSizeChanged;

    @NotNull
    private final PlaceholderParser placeholderParser;

    @NotNull
    private final List<View> rightViews;

    @NotNull
    private final FrameLayout titlePlaceholder;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/orderNavBar/view/OrderNavBarTitlePlaceholderView$Companion;", "", "<init>", "()V", "DEFAULT_NAV_ICON_TOKEN", "", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderNavBarTitlePlaceholderView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.currentViewHolders = new HashMap<>();
        this.placeholderParser = new PlaceholderParser(SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.currentPlaceholder = Placeholder.INSTANCE.getEMPTY();
        this.titlePlaceholder = new FrameLayout(context);
        this.iconButtonPool = new LinkedHashMap();
        this.leftViews = new ArrayList();
        this.rightViews = new ArrayList();
        int px = UiExtKt.toPx(2, context);
        this.dp2 = px;
        int px2 = UiExtKt.toPx(6, context);
        this.dp6 = px2;
        this.dp44 = UiExtKt.toPx(44, context);
        this.argbEvaluator = new ArgbEvaluator();
        setPadding(px2, 0, px2, px);
    }

    private final void bindButtons(List<IconButtonV3DTO> buttons, List<View> viewSide, Function1<? super AtomAction, Unit> onAction) {
        for (IconButtonV3DTO iconButtonV3DTO : buttons) {
            if (Intrinsics.d(iconButtonV3DTO.getIcon(), "ic_m_disclosure_back_filled")) {
                ImageButton imageButton = new ImageButton(getContext());
                int i11 = this.dp44;
                imageButton.setLayoutParams(new FrameLayout.LayoutParams(i11, i11));
                imageButton.setImageResource(R$drawable.ic_m_disclosure_back_filled);
                imageButton.setBackgroundColor(0);
                StyleParser styleParser = StyleParser.INSTANCE;
                Context context = imageButton.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                ThemeExtKt.tint(imageButton, Integer.valueOf(styleParser.parseColor(context, iconButtonV3DTO.getIconColor(), UniColors.GRAPHIC_TERTIARY.getResId())));
                viewSide.add(imageButton);
                imageButton.setOnClickListener(new a(7, iconButtonV3DTO, onAction));
                addView(imageButton);
            } else {
                IconButtonV3View remove = this.iconButtonPool.remove(iconButtonV3DTO.getIcon());
                if (remove == null && (remove = (IconButtonV3View) b.a(IconButtonV3View.class, "type", q.f64554a, null)) == null) {
                    Context context2 = getContext();
                    Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                    remove = new IconButtonV3View(context2, null, 0, 0, 14, null);
                }
                remove.setContentDescription(iconButtonV3DTO.getIcon());
                IconButtonV3HolderKt.bind(remove, iconButtonV3DTO, onAction);
                viewSide.add(remove);
                addView(remove);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindButtons$lambda$11$lambda$9$lambda$8(IconButtonV3DTO iconButtonV3DTO, Function1 function1, View view) {
        AtomAction atomAction;
        CommonControlSettings common = iconButtonV3DTO.getCommon();
        if (common == null || (atomAction = common.toAtomAction()) == null) {
            return;
        }
        function1.invoke(atomAction);
    }

    private final int measure(List<View> list, int i11, int i12, int i13) {
        int i14 = 0;
        for (View view : list) {
            measureChild(view, i11, i12);
            if (view.getMeasuredWidth() + i14 > i13) {
                ViewExtKt.gone(view);
            } else {
                ru.ozon.uni.android.uikitsdk.ext.ViewExtKt.show(view);
                i14 = view.getMeasuredWidth() + i14;
            }
            this.maxHeight = Math.max(this.maxHeight, view.getMeasuredHeight());
        }
        return i14;
    }

    private final int measureChild(int widthMeasureSpec, int heightMeasureSpec) {
        this.maxHeight = 0;
        int size = (View.MeasureSpec.getSize(widthMeasureSpec) - getPaddingRight()) - getPaddingLeft();
        int i11 = size / 2;
        measureChild(this.titlePlaceholder, View.MeasureSpec.makeMeasureSpec(size - (Math.max(measure(this.leftViews, widthMeasureSpec, heightMeasureSpec, i11), measure(this.rightViews, widthMeasureSpec, heightMeasureSpec, i11)) * 2), LinearLayoutManager.INVALID_OFFSET), heightMeasureSpec);
        int max = Math.max(this.maxHeight, this.titlePlaceholder.getMeasuredHeight());
        this.maxHeight = max;
        return max;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void bind(@NotNull List<IconButtonV3DTO> leftButtons, @NotNull List<IconButtonV3DTO> rightButtons, @NotNull OrderNavBarVO.ButtonsColors buttonsColors, l viewItem, @NotNull Function1<? super AtomAction, Unit> onAction) {
        Intrinsics.checkNotNullParameter(leftButtons, "leftButtons");
        Intrinsics.checkNotNullParameter(rightButtons, "rightButtons");
        Intrinsics.checkNotNullParameter(buttonsColors, "buttonsColors");
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        Iterator<View> it = C5316f0.b(this).iterator();
        while (true) {
            C5314e0 c5314e0 = (C5314e0) it;
            if (!c5314e0.hasNext()) {
                break;
            }
            View view = (View) c5314e0.next();
            if (view instanceof IconButtonV3View) {
                this.iconButtonPool.put(((IconButtonV3View) view).getContentDescription().toString(), view);
            }
        }
        removeAllViews();
        this.rightViews.clear();
        this.leftViews.clear();
        this.buttonsColors = buttonsColors;
        addView(this.titlePlaceholder);
        Placeholder parsePlaceholders = this.placeholderParser.parsePlaceholders(viewItem, this.currentPlaceholder);
        this.currentPlaceholder = parsePlaceholders;
        NestedWidgetsManager nestedWidgetsManager = this.nestedWidgetsManager;
        if (nestedWidgetsManager != null) {
            nestedWidgetsManager.addNestedWidgets(parsePlaceholders, this.currentViewHolders);
        }
        Iterator<View> it2 = C5316f0.b(this.titlePlaceholder).iterator();
        while (true) {
            C5314e0 c5314e02 = (C5314e0) it2;
            if (!c5314e02.hasNext()) {
                bindButtons(leftButtons, this.leftViews, onAction);
                bindButtons(rightButtons, this.rightViews, onAction);
                return;
            }
            View view2 = (View) c5314e02.next();
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            }
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.gravity = 17;
            view2.setLayoutParams(layoutParams2);
        }
    }

    public final void onChangeAlpha(float alpha) {
        OrderNavBarVO.ButtonsColors buttonsColors = this.buttonsColors;
        if (buttonsColors == null) {
            return;
        }
        ArgbEvaluator argbEvaluator = this.argbEvaluator;
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Integer valueOf = Integer.valueOf(styleParser.parseColorInt(context, buttonsColors.getCollapsed(), UniColors.GRAPHIC_TERTIARY.getResId()));
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        Object evaluate = argbEvaluator.evaluate(alpha, valueOf, Integer.valueOf(styleParser.parseColorInt(context2, buttonsColors.getExpanded(), UniColors.GRAPHIC_LIGHT_KEY.getResId())));
        Integer num = evaluate instanceof Integer ? (Integer) evaluate : null;
        Iterator<View> it = C5316f0.b(this).iterator();
        while (true) {
            C5314e0 c5314e0 = (C5314e0) it;
            if (!c5314e0.hasNext()) {
                return;
            }
            View view = (View) c5314e0.next();
            if (num != null) {
                int intValue = num.intValue();
                if (view instanceof IconButtonV3View) {
                    ((IconButtonV3View) view).setIconColor(intValue);
                    view.invalidate();
                } else if (view instanceof ImageButton) {
                    ThemeExtKt.tint((ImageView) view, Integer.valueOf(intValue));
                }
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        int paddingLeft = getPaddingLeft();
        int measuredWidth = getMeasuredWidth() - getPaddingRight();
        int measuredHeight = ((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) / 2;
        for (View view : this.leftViews) {
            LayoutExtKt.layoutLeftTop(view, paddingLeft, measuredHeight - (view.getMeasuredHeight() / 2));
            paddingLeft += view.getMeasuredWidth();
        }
        for (View view2 : this.rightViews) {
            LayoutExtKt.layoutRightTop(view2, measuredWidth, measuredHeight - (view2.getMeasuredHeight() / 2));
            measuredWidth -= view2.getMeasuredWidth();
        }
        int max = Math.max(paddingLeft, getMeasuredWidth() - measuredWidth);
        int measuredHeight2 = measuredHeight - (this.titlePlaceholder.getMeasuredHeight() / 2);
        this.titlePlaceholder.layout(max, measuredHeight2, getMeasuredWidth() - max, this.titlePlaceholder.getMeasuredHeight() + measuredHeight2);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        setMeasuredDimension(widthMeasureSpec, View.MeasureSpec.makeMeasureSpec(getPaddingTop() + getPaddingBottom() + measureChild(widthMeasureSpec, heightMeasureSpec), 1073741824));
    }

    @Override // android.view.View
    protected void onSizeChanged(int width, int height, int oldw, int oldh) {
        Function2<? super Integer, ? super Integer, Unit> function2 = this.onPlaceholderSizeChanged;
        if (function2 != null) {
            function2.invoke(Integer.valueOf(height), null);
        }
        super.onSizeChanged(width, height, oldw, oldh);
    }

    public void onWidgetCreated() {
        NestedWidgetsManager nestedWidgetsManager = this.nestedWidgetsManager;
        if (nestedWidgetsManager != null) {
            nestedWidgetsManager.setContainer(this.titlePlaceholder);
        }
    }

    public void onWidgetDestroyed() {
        NestedWidgetsManager nestedWidgetsManager = this.nestedWidgetsManager;
        if (nestedWidgetsManager != null) {
            nestedWidgetsManager.detachNestedViewHolders(this.currentViewHolders);
        }
        this.nestedWidgetsManager = null;
    }

    public void setOnSizeChangeListener(@NotNull Function2<? super Integer, ? super Integer, Unit> onPlaceholderSizeChanged) {
        Intrinsics.checkNotNullParameter(onPlaceholderSizeChanged, "onPlaceholderSizeChanged");
        this.onPlaceholderSizeChanged = onPlaceholderSizeChanged;
    }

    public void setupNestedWidgetManager(@NotNull i container) {
        Intrinsics.checkNotNullParameter(container, "container");
        this.nestedWidgetsManager = new NestedWidgetsManager(container, container.d0(), container.c0());
    }
}
