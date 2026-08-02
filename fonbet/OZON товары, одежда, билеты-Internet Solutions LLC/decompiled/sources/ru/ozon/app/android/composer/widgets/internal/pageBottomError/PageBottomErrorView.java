package ru.ozon.app.android.composer.widgets.internal.pageBottomError;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.R$string;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.data.common.Rounds;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.data.text.TextPreset;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import ru.ozon.uni.core.repository.UniTheme;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u000bH\u0002J\b\u0010\f\u001a\u00020\rH\u0002¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/composer/widgets/internal/pageBottomError/PageBottomErrorView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "createErrorTextView", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "createRefreshBtn", "Lru/ozon/uni/android/atom/badge/BadgeView;", "Companion", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PageBottomErrorView extends LinearLayout {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private static final int DP_4 = UiExtKt.toPx(4);
    private static final int DP_8 = UiExtKt.toPx(8);
    private static final int DP_10 = UiExtKt.toPx(10);
    private static final int VIEW_HEIGHT = UiExtKt.toPx(64);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/composer/widgets/internal/pageBottomError/PageBottomErrorView$Companion;", "", "<init>", "()V", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ PageBottomErrorView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    private final TextAtomV2View createErrorTextView() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
        textAtomV2View.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        OzonSpannableString ozonSpannableString = OzonSpannableStringKt.toOzonSpannableString(StringProvider.getString(R$string.page_bottom_error_no_internet_connection));
        TextDTO.TextAlignment textAlignment = TextDTO.TextAlignment.CENTER;
        TextPreset textPreset = TextPreset.PRESET_CUSTOM;
        UniTheme uniTheme = UniTheme.INSTANCE;
        TextHolderKt.bind$default(textAtomV2View, new TextDTO(ozonSpannableString, textAlignment, null, null, null, null, textPreset, uniTheme.getTypographyTokens().getCompact400Large().getId(), uniTheme.getColorTokens().getTextOriginalpriceAvailable().getId(), null, null, null, null, false, null, null, null, null, null, 523836, null), null, 2, null);
        textAtomV2View.setTextIsSelectable(false);
        addView(textAtomV2View);
        return textAtomV2View;
    }

    private final BadgeView createRefreshBtn() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        BadgeView badgeView = new BadgeView(context, null, 0, 0, 14, null);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.topMargin = DP_4;
        badgeView.setLayoutParams(layoutParams);
        String string = StringProvider.getString(R$string.refresh);
        BadgeDTO.Style style = BadgeDTO.Style.CUSTOM;
        UniTheme uniTheme = UniTheme.INSTANCE;
        BadgeHolderKt.bind$default(badgeView, new BadgeDTO(string, null, BadgeDTO.BadgeSize.SIZE_500, style, new BadgeDTO.CustomStyle(new BadgeDTO.CustomBackground(uniTheme.getColorTokens().getBgLightKey().getId(), null, 2, null), null, uniTheme.getColorTokens().getTextDarkKey().getId(), null, null, 26, null), null, null, null, null, null, null, Rounds.ROUND_DEFAULT, 2018, null), (Function1) null, 2, (Object) null);
        addView(badgeView);
        return badgeView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageBottomErrorView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        setOrientation(1);
        setGravity(1);
        setLayoutParams(new ViewGroup.LayoutParams(-1, VIEW_HEIGHT));
        setPadding(0, DP_8, 0, DP_10);
        Integer parseColor = StyleParser.INSTANCE.parseColor(context, UniTheme.INSTANCE.getColorTokens().getClearLightKey0().getId());
        if (parseColor != null) {
            setBackgroundColor(parseColor.intValue());
        }
        createErrorTextView();
        createRefreshBtn();
    }
}
