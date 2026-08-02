package ru.ozon.app.android.atoms.v3.holders.gradientbadge;

import Sc.InterfaceC3999a;
import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.gradientbadge.GradientBadge;
import ru.ozon.app.android.uikit.view.atoms.gradientbadge.GradientBadgeView;
import ru.ozon.uni.R$style;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.atoms.v3.AtomV3;
import ru.ozon.uni.atoms.v3.holders.WrappedAtomHolder;

@InterfaceC3999a
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB\u001b\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\fJ\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0014J\u000e\u0010\u0010\u001a\u00020\u0011*\u0004\u0018\u00010\u0012H\u0002¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/atoms/v3/holders/gradientbadge/GradientBadgeHolder;", "Lru/ozon/uni/atoms/v3/AtomV3;", "Lru/ozon/app/android/atoms/data/gradientbadge/GradientBadge;", "Lru/ozon/app/android/uikit/view/atoms/gradientbadge/GradientBadgeView;", "Lru/ozon/uni/atoms/v3/holders/WrappedAtomHolder;", "view", "atomContext", "", "<init>", "(Lru/ozon/app/android/uikit/view/atoms/gradientbadge/GradientBadgeView;Ljava/lang/String;)V", "context", "Landroid/content/Context;", "(Landroid/content/Context;Ljava/lang/String;)V", "onBind", "", "item", "map", "", "Lru/ozon/app/android/atoms/data/gradientbadge/GradientBadge$ThemeType;", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class GradientBadgeHolder extends AtomV3<GradientBadge, GradientBadgeView> implements WrappedAtomHolder {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GradientBadgeHolder(@NotNull GradientBadgeView view, String str) {
        super(view, str);
        Intrinsics.checkNotNullParameter(view, "view");
    }

    private final int map(GradientBadge.ThemeType themeType) {
        return themeType == GradientBadge.ThemeType.THEME_TYPE_M ? R$style.TextStyle_Body_L_Bold : R$style.TextStyle_Body_M_Bold_Mono;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GradientBadgeHolder(@NotNull Context context, String str) {
        this(new GradientBadgeView(context, null, 0, 6, null), str);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.uni.atoms.v3.AtomV3, ru.ozon.uni.atoms.af.Atom
    public void onBind(@NotNull GradientBadge item) {
        Intrinsics.checkNotNullParameter(item, "item");
        super.onBind((GradientBadgeHolder) item);
        GradientBadgeView containerView = getContainerView();
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = containerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        containerView.setPrimaryTextColor(styleParser.parseColor(context, item.getPrimaryTextColor(), StyleParser.OzColor.OZ_SEMANTIC_COLOR_TEXT_PRIMARY));
        Context context2 = containerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        containerView.setPrimaryTextBackgroundColor(styleParser.parseColor(context2, item.getPrimaryTextBackgroundColor(), StyleParser.OzColor.OZ_SEMANTIC_COLOR_BG_SECONDARY));
        Context context3 = containerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        containerView.setSecondaryTextColor(styleParser.parseColor(context3, item.getSecondaryTextColor(), StyleParser.OzColor.OZ_SEMANTIC_COLOR_TEXT_PRIMARY_NEGATIVE));
        Context context4 = containerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        containerView.setTertiaryTextColor(styleParser.parseColor(context4, item.getTertiaryTextColor(), StyleParser.OzColor.OZ_SEMANTIC_COLOR_CREDIT));
        containerView.setTexts(item.getPrimaryText(), item.getSecondaryText(), item.getTertiaryText());
        Context context5 = containerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
        Integer parseColor = styleParser.parseColor(context5, item.getGradientStart());
        Context context6 = containerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context6, "getContext(...)");
        containerView.setGradient(parseColor, styleParser.parseColor(context6, item.getGradientEnd()));
        containerView.setPrimaryStyle(map(item.getTheme()));
    }
}
