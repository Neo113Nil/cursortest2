package ru.ozon.app.android.travel.feature.avia.widgets.aviaCheckTariffs.view;

import Am.C2438a;
import CX.a;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.widget.LinearLayout;
import androidx.core.graphics.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.reflect.m;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaCheckTariffs.data.AviaCheckTariffsDTO;
import ru.ozon.app.android.travel.molecules.extensions.DrawableExtensionsKt;
import ru.ozon.app.android.travel.utils.delegate.PreCreationViewPoolDelegate;
import ru.ozon.app.android.travel.utils.utils.RoundedOutlineProvider;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.v3.holders.icon.IconHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J(\u0010\u001a\u001a\u00020\u00172\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0016\u0010\u0014\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0015J\b\u0010\u001d\u001a\u00020\u0017H\u0002J(\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001c2\u0016\u0010\u0014\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0015H\u0002J\u0010\u0010\u001f\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\b\u0010 \u001a\u00020\u0017H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0014\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0019\u001a\u00020\u00078\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffs/view/AviaCheckTariffsShowMoreButtonView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "dp2", "", "dp8", "cornerRadius", "", "minClickAreaHeight", "text", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "getText", "()Lru/ozon/uni/android/atom/text/TextAtomV2View;", "text$delegate", "Lru/ozon/app/android/travel/utils/delegate/PreCreationViewPoolDelegate;", "icon", "Lru/ozon/uni/android/atom/icon/IconView;", "onAction", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "", "common", "cachedRippleColor", "bindOrGone", "data", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffs/data/AviaCheckTariffsDTO$ShowMoreButtonDTO;", "addViews", "bind", "updateRippleEffect", "increaseClickArea", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AviaCheckTariffsShowMoreButtonView extends LinearLayout {
    static final /* synthetic */ m<Object>[] $$delegatedProperties = {C2438a.c(AviaCheckTariffsShowMoreButtonView.class, "text", "getText()Lru/ozon/uni/android/atom/text/TextAtomV2View;", 0)};
    public static final int $stable = 8;
    private int cachedRippleColor;
    private CommonControlSettings common;
    private final float cornerRadius;
    private final int dp2;
    private final int dp8;

    @NotNull
    private final IconView icon;
    private final int minClickAreaHeight;
    private Function1<? super CommonControlSettings, Unit> onAction;

    /* renamed from: text$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate text;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AviaCheckTariffsShowMoreButtonView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        int px = ResourceExtKt.toPx(2, context);
        this.dp2 = px;
        int px2 = ResourceExtKt.toPx(8, context);
        this.dp8 = px2;
        float pxF = ResourceExtKt.toPxF(8, context);
        this.cornerRadius = pxF;
        this.minClickAreaHeight = ResourceExtKt.toPx(44, context);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.text = new PreCreationViewPoolDelegate(context2, N.b(TextAtomV2View.class), new AviaCheckTariffsShowMoreButtonView$special$$inlined$preCreationViewPool$default$1(this), new AviaCheckTariffsShowMoreButtonView$special$$inlined$preCreationViewPool$default$2());
        IconView iconView = new IconView(context, null, 0, 6, null);
        iconView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        this.icon = iconView;
        this.cachedRippleColor = ThemeExtKt.themeColor(context, R$attr.bgActionSecondary);
        addViews();
        setOrientation(0);
        setOutlineProvider(new RoundedOutlineProvider(pxF));
        setClipToOutline(true);
        setGravity(16);
        setPadding(px2, px, px, px);
        setOnClickListener(new a(this, 9));
        setForeground(DrawableExtensionsKt.contentlessRipple(this.cachedRippleColor, pxF));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$2(AviaCheckTariffsShowMoreButtonView aviaCheckTariffsShowMoreButtonView, View view) {
        Function1<? super CommonControlSettings, Unit> function1 = aviaCheckTariffsShowMoreButtonView.onAction;
        if (function1 != null) {
            function1.invoke(aviaCheckTariffsShowMoreButtonView.common);
        }
    }

    private final void addViews() {
        addView(getText());
        addView(this.icon);
    }

    private final void bind(AviaCheckTariffsDTO.ShowMoreButtonDTO data, Function1<? super CommonControlSettings, Unit> onAction) {
        this.onAction = onAction;
        this.common = data.getCommon();
        TextHolderKt.bind$default(getText(), data.getText(), null, 2, null);
        IconHolderKt.bind$default(this.icon, data.getIcon(), null, 2, null);
        TestInfo testInfo = data.getCommon().getTestInfo();
        setContentDescription(testInfo != null ? testInfo.getAutomatizationId() : null);
        updateRippleEffect(data);
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        setBackgroundColor(styleParser.parseColor(context, data.getBackgroundColor(), UniColors.LAYER_FLOOR_1.getResId()));
        increaseClickArea();
    }

    private final TextAtomV2View getText() {
        return (TextAtomV2View) this.text.getValue(this, $$delegatedProperties[0]);
    }

    private final void increaseClickArea() {
        if (!isLaidOut() || isLayoutRequested()) {
            addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: ru.ozon.app.android.travel.feature.avia.widgets.aviaCheckTariffs.view.AviaCheckTariffsShowMoreButtonView$increaseClickArea$$inlined$doOnLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(@NotNull View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    view.removeOnLayoutChangeListener(this);
                    Rect rect = new Rect();
                    AviaCheckTariffsShowMoreButtonView.this.getHitRect(rect);
                    int height = AviaCheckTariffsShowMoreButtonView.this.minClickAreaHeight - AviaCheckTariffsShowMoreButtonView.this.getHeight();
                    if (height > 0) {
                        rect.top -= height;
                        rect.bottom += height;
                        rect.right += height;
                        Object parent = AviaCheckTariffsShowMoreButtonView.this.getParent();
                        View view2 = parent instanceof View ? (View) parent : null;
                        if (view2 != null) {
                            view2.setTouchDelegate(new AviaCheckTariffsShowMoreButtonView$increaseClickArea$1$1(rect, AviaCheckTariffsShowMoreButtonView.this));
                        }
                    }
                }
            });
            return;
        }
        Rect rect = new Rect();
        getHitRect(rect);
        int height = this.minClickAreaHeight - getHeight();
        if (height > 0) {
            rect.top -= height;
            rect.bottom += height;
            rect.right += height;
            Object parent = getParent();
            View view = parent instanceof View ? (View) parent : null;
            if (view != null) {
                view.setTouchDelegate(new AviaCheckTariffsShowMoreButtonView$increaseClickArea$1$1(rect, this));
            }
        }
    }

    private final void updateRippleEffect(AviaCheckTariffsDTO.ShowMoreButtonDTO data) {
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int parseColor = styleParser.parseColor(context, data.getText().getTextColor(), UniColors.BG_ACTION_SECONDARY.getResId());
        if (this.cachedRippleColor == parseColor) {
            return;
        }
        this.cachedRippleColor = parseColor;
        setForeground(DrawableExtensionsKt.contentlessRipple(c.f(parseColor, 25), this.cornerRadius));
    }

    public final void bindOrGone(AviaCheckTariffsDTO.ShowMoreButtonDTO data, Function1<? super CommonControlSettings, Unit> onAction) {
        if (data == null) {
            setVisibility(8);
        } else {
            setVisibility(0);
            bind(data, onAction);
        }
    }
}
