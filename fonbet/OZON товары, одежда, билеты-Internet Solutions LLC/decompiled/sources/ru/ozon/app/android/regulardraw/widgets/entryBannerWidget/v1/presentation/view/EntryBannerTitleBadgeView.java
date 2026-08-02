package ru.ozon.app.android.regulardraw.widgets.entryBannerWidget.v1.presentation.view;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.content.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.regulardraw.R$drawable;
import ru.ozon.app.android.regulardraw.R$id;
import ru.ozon.app.android.regulardraw.widgets.entryBannerWidget.v1.presentation.Banner;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u0010\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0010\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0010\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0013H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v1/presentation/view/EntryBannerTitleBadgeView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "titleView", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "iconView", "Landroidx/appcompat/widget/AppCompatImageView;", "bind", "", "badge", "Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v1/presentation/Banner$Badge;", "bindTitle", "text", "Lru/ozon/uni/atoms/data/text/TextDTO;", "bindIcon", "icon", "", "bindBackgroundColor", "color", "Companion", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class EntryBannerTitleBadgeView extends LinearLayout {

    @NotNull
    private final Context context;

    @NotNull
    private final AppCompatImageView iconView;

    @NotNull
    private final TextAtomV2View titleView;
    public static final int $stable = 8;
    private static final int dp2 = ResourceExtKt.toPx(2);
    private static final int dp4 = ResourceExtKt.toPx(4);
    private static final int dp6 = ResourceExtKt.toPx(6);
    private static final int dp14 = ResourceExtKt.toPx(14);
    private static final int dp20 = ResourceExtKt.toPx(20);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EntryBannerTitleBadgeView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
        textAtomV2View.setId(R$id.entryBannerWidget_BannerView_TitleBadge_Title);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        marginLayoutParams.setMarginStart(dp6);
        int i11 = dp2;
        marginLayoutParams.topMargin = i11;
        marginLayoutParams.bottomMargin = i11;
        textAtomV2View.setLayoutParams(marginLayoutParams);
        textAtomV2View.setTextIsSelectable(false);
        this.titleView = textAtomV2View;
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        appCompatImageView.setId(R$id.entryBannerWidget_BannerView_TitleBadge_Icon);
        ViewGroup.MarginLayoutParams marginLayoutParams2 = new ViewGroup.MarginLayoutParams(dp14, dp20);
        marginLayoutParams2.topMargin = i11;
        marginLayoutParams2.bottomMargin = i11;
        marginLayoutParams2.setMarginEnd(dp4);
        appCompatImageView.setLayoutParams(marginLayoutParams2);
        this.iconView = appCompatImageView;
        setId(R$id.entryBannerWidget_BannerView_TitleBadge);
        setOrientation(0);
        setGravity(16);
        setBackground(a.getDrawable(context, R$drawable.bg_entry_banner_title_badge));
        addView(textAtomV2View);
        addView(appCompatImageView);
    }

    private final void bindBackgroundColor(String color) {
        ViewExtKt.setBackgroundTint(this, StyleParser.INSTANCE.parseColor(this.context, color, UniColors.BG_SECONDARY.getResId()));
    }

    private final void bindIcon(String icon) {
        ImageViewExtKt.load$default(this.iconView, icon, null, null, null, null, false, null, 126, null);
    }

    private final void bindTitle(TextDTO text) {
        TextHolderKt.bind$default(this.titleView, text, null, 2, null);
    }

    public final void bind(@NotNull Banner.Badge badge) {
        Intrinsics.checkNotNullParameter(badge, "badge");
        bindTitle(badge.getText());
        bindIcon(badge.getIcon());
        bindBackgroundColor(badge.getBackgroundColor());
    }
}
