package ru.ozon.app.android.travel.feature.general.common.widgets.overlayButtons.v2.view;

import OD.a;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import gk0.q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.common.widgets.overlayButtons.v2.presentation.ButtonVO;
import ru.ozon.app.android.travel.feature.general.common.widgets.overlayButtons.v2.presentation.SettingsVO;
import ru.ozon.app.android.travel.molecules.extensions.DrawableExtensionsKt;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.indicator.ui.IndicatorView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.v3.holders.icon.IconHolderKt;
import ru.ozon.uni.atoms.v3.holders.indicator.IndicatorHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\"\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u00192\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n0\tJ\u0012\u0010\u001a\u001a\u00020\n2\b\u0010\u001b\u001a\u0004\u0018\u00010\u000fH\u0002J\u0014\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001b\u001a\u0004\u0018\u00010\u000fH\u0002J\u0010\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u000fH\u0002J\u0010\u0010 \u001a\u00020\n2\u0006\u0010!\u001a\u00020\rH\u0002R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n\u0018\u00010\tj\u0004\u0018\u0001`\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/overlayButtons/v2/view/OverlayButtonsV2ItemView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "atomAction", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/Function1;", "", "Lru/ozon/app/android/action/BuildedActionHandler;", "settingsCache", "Lru/ozon/app/android/travel/feature/general/common/widgets/overlayButtons/v2/presentation/SettingsVO;", "backgroundColorCache", "", "rippleColorCache", "icon", "Lru/ozon/uni/android/atom/icon/IconView;", "text", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "indicator", "Lru/ozon/uni/android/atom/indicator/ui/IndicatorView;", "bind", "item", "Lru/ozon/app/android/travel/feature/general/common/widgets/overlayButtons/v2/presentation/ButtonVO;", "bindRippleColor", "activeBackgroundColor", "getRippleDrawable", "Landroid/graphics/drawable/Drawable;", "bindBackgroundColor", "backgroundColor", "bindPaddings", "settings", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OverlayButtonsV2ItemView extends LinearLayout {
    private Function1<? super AtomAction, Unit> actionHandler;
    private AtomAction atomAction;

    @NotNull
    private String backgroundColorCache;

    @NotNull
    private final IconView icon;

    @NotNull
    private final IndicatorView indicator;
    private String rippleColorCache;
    private SettingsVO settingsCache;

    @NotNull
    private final TextAtomV2View text;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OverlayButtonsV2ItemView(@NotNull Context context) {
        super(context);
        Context context2;
        Intrinsics.checkNotNullParameter(context, "context");
        this.backgroundColorCache = UniColors.LAYER_FLOOR_1_INVERTED.getToken();
        q qVar = q.f64554a;
        IconView iconView = (IconView) qVar.i(N.b(IconView.class), context);
        if (iconView == null) {
            context2 = context;
            iconView = new IconView(context2, null, 0, 6, null);
        } else {
            context2 = context;
        }
        iconView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        addView(iconView);
        this.icon = iconView;
        View g10 = qVar.g(N.b(TextAtomV2View.class), context2);
        TextAtomV2View textAtomV2View = (TextAtomV2View) g10;
        textAtomV2View.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        textAtomV2View.setTextIsSelectable(false);
        addView(g10);
        this.text = textAtomV2View;
        IndicatorView indicatorView = (IndicatorView) qVar.i(N.b(IndicatorView.class), context2);
        Context context3 = context2;
        indicatorView = indicatorView == null ? new IndicatorView(context3, null, 0, 0, 14, null) : indicatorView;
        indicatorView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        addView(indicatorView);
        this.indicator = indicatorView;
        setOrientation(0);
        setGravity(16);
        setOnClickListener(new a(this, 5));
        setBackgroundColor(ThemeExtKt.themeColor(context3, R$attr.layerFloor1Inverted));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$6(OverlayButtonsV2ItemView overlayButtonsV2ItemView, View view) {
        Function1<? super AtomAction, Unit> function1;
        AtomAction atomAction = overlayButtonsV2ItemView.atomAction;
        if (atomAction == null || (function1 = overlayButtonsV2ItemView.actionHandler) == null) {
            return;
        }
        function1.invoke(atomAction);
    }

    private final void bindBackgroundColor(String backgroundColor) {
        int themeColor;
        if (Intrinsics.d(backgroundColor, this.backgroundColorCache)) {
            return;
        }
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Integer parseColor = styleParser.parseColor(context, backgroundColor);
        if (parseColor != null) {
            themeColor = parseColor.intValue();
        } else {
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            themeColor = ThemeExtKt.themeColor(context2, R$attr.layerFloor1Inverted);
        }
        setBackgroundColor(themeColor);
        this.backgroundColorCache = backgroundColor;
    }

    private final void bindPaddings(SettingsVO settings) {
        if (Intrinsics.d(settings, this.settingsCache)) {
            return;
        }
        setPadding(settings.getLeftPadding(), settings.getTopPadding(), settings.getRightPadding(), settings.getBottomPadding());
        this.settingsCache = settings;
    }

    private final void bindRippleColor(String activeBackgroundColor) {
        if (Intrinsics.d(activeBackgroundColor, this.rippleColorCache)) {
            return;
        }
        setForeground(getRippleDrawable(activeBackgroundColor));
        this.rippleColorCache = activeBackgroundColor;
    }

    private final Drawable getRippleDrawable(String activeBackgroundColor) {
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Integer parseColor = styleParser.parseColor(context, activeBackgroundColor);
        if (parseColor != null) {
            return DrawableExtensionsKt.contentlessRipple$default(parseColor.intValue(), 0.0f, 2, null);
        }
        return null;
    }

    public final void bind(@NotNull ButtonVO item, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        this.actionHandler = actionHandler;
        IconHolderKt.bind$default(this.icon, item.getIcon(), null, 2, null);
        TextHolderKt.bind$default(this.text, item.getText(), null, 2, null);
        IndicatorHolderKt.bindOrGone$default(this.indicator, item.getIndicator(), null, 2, null);
        CommonControlSettings commonControlSettings = item.getCommonControlSettings();
        AtomActionDTO action = commonControlSettings.getAction();
        this.atomAction = action != null ? AtomActionMapperKt.toAtomAction(action, commonControlSettings.getTrackingInfo()) : null;
        bindPaddings(item.getSettings());
        bindBackgroundColor(item.getBackgroundColor());
        bindRippleColor(item.getActiveBackgroundColor());
    }
}
