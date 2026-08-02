package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsModalTariffInfo.view;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsModalTariffInfo.presentation.HotelsModalTariffInfoVI;
import ru.ozon.app.android.travel.molecules.view.travelWidgetSettings.TravelWidgetSettingsExtKt;
import ru.ozon.app.android.travel.molecules.view.travelWidgetSettings.TravelWidgetSettingsVO;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikitsdk.ext.TextViewExtKt;
import ru.ozon.uni.core.UniColors;
import ru.ozon.uni.core.UniTextStyles;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rR\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsModalTariffInfo/view/HtmlBlockView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "backgroundSettings", "Lru/ozon/app/android/travel/molecules/view/travelWidgetSettings/TravelWidgetSettingsVO;", "htmlText", "Landroidx/appcompat/widget/AppCompatTextView;", "bind", "", "item", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsModalTariffInfo/presentation/HotelsModalTariffInfoVI$HtmlBlockWrapper;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HtmlBlockView extends FrameLayout {
    private TravelWidgetSettingsVO backgroundSettings;

    @NotNull
    private final AppCompatTextView htmlText;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HtmlBlockView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        AppCompatTextView appCompatTextView = new AppCompatTextView(context);
        appCompatTextView.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        appCompatTextView.setTextIsSelectable(false);
        this.htmlText = appCompatTextView;
        addView(appCompatTextView);
    }

    public final void bind(@NotNull HotelsModalTariffInfoVI.HtmlBlockWrapper item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.htmlText.setText(item.getHtmlString());
        AppCompatTextView appCompatTextView = this.htmlText;
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        appCompatTextView.setTextColor(styleParser.parseColor(context, item.getTextColor(), UniColors.TEXT_PRIMARY.getResId()));
        AppCompatTextView appCompatTextView2 = this.htmlText;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        Integer parseTextStyle = styleParser.parseTextStyle(item.getTypographyToken());
        TextViewExtKt.applyStyle(appCompatTextView2, context2, parseTextStyle != null ? parseTextStyle.intValue() : UniTextStyles.BODY_CONTROL_500_MEDIUM.getResId());
        TravelWidgetSettingsExtKt.updatePadding$default(this, item.getSettings().getPaddings(), 0, 0, 0, 0, 30, null);
        TravelWidgetSettingsExtKt.safeUpdateBackground(this, item.getSettings(), this.backgroundSettings, UniColors.CLEAR_LIGHT_KEY_0.getResId());
        this.backgroundSettings = item.getSettings();
    }
}
