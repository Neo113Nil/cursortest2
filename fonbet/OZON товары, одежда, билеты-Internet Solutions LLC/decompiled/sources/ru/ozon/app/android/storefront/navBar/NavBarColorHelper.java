package ru.ozon.app.android.storefront.navBar;

import android.content.Context;
import android.graphics.Color;
import androidx.core.content.res.g;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.navBar.NavBarColors;
import ru.ozon.app.android.storefront.navBar.NavBarVO;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.uikit.common.StyleParser;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\f\u001a\u00020\r2\u000e\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\u0012J\b\u0010\u0013\u001a\u0004\u0018\u00010\bJ\b\u0010\u0014\u001a\u0004\u0018\u00010\bJ\u0012\u0010\u0015\u001a\u00020\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0010H\u0002J\u0014\u0010\u0017\u001a\u0004\u0018\u00010\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0010H\u0002J\u0010\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\nH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/storefront/navBar/NavBarColorHelper;", "", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "navBarColors", "", "Lru/ozon/app/android/storefront/navBar/NavBarColors;", "defaultColor", "", "defaultIconColor", "parseNavBarColors", "", "states", "", "Lru/ozon/app/android/storefront/navBar/NavBarVO$State;", "isExpanded", "", "defaultColors", "expandedColors", "parseDefaultNavBarColors", "state", "parseExpandedNavBarColors", "isColorDark", "color", "Companion", "nav-bar_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class NavBarColorHelper {

    @NotNull
    private final Context context;
    private final int defaultColor;
    private final int defaultIconColor;

    @NotNull
    private final List<NavBarColors> navBarColors;

    public NavBarColorHelper(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.navBarColors = new ArrayList();
        this.defaultColor = g.b(context.getResources(), R$color.oz_semantic_bg_secondary, context.getTheme());
        this.defaultIconColor = g.b(context.getResources(), R$color.oz_semantic_text_primary, context.getTheme());
    }

    private final boolean isColorDark(int color) {
        return ((double) 1) - (((((double) Color.blue(color)) * 0.114d) + ((((double) Color.green(color)) * 0.587d) + (((double) Color.red(color)) * 0.299d))) / ((double) 255)) >= 0.5d;
    }

    private final NavBarColors parseDefaultNavBarColors(NavBarVO.State state) {
        StyleParser styleParser = StyleParser.INSTANCE;
        Integer parseColor = styleParser.parseColor(this.context, state != null ? state.getIconColor() : null);
        int intValue = parseColor != null ? parseColor.intValue() : this.defaultIconColor;
        Integer parseColor2 = styleParser.parseColor(this.context, state != null ? state.getBackgroundColor() : null);
        int intValue2 = parseColor2 != null ? parseColor2.intValue() : this.defaultColor;
        return new NavBarColors.Default(intValue2, intValue2, intValue, isColorDark(intValue2));
    }

    private final NavBarColors parseExpandedNavBarColors(NavBarVO.State state) {
        if (!(state instanceof NavBarVO.State.Expanded)) {
            return null;
        }
        StyleParser styleParser = StyleParser.INSTANCE;
        NavBarVO.State.Expanded expanded = (NavBarVO.State.Expanded) state;
        Integer parseColor = styleParser.parseColor(this.context, expanded.getIconColor());
        return new NavBarColors.Expanded(0, 0, parseColor != null ? parseColor.intValue() : this.defaultIconColor, Intrinsics.d(expanded.getStatusBarStyle(), "dark"), styleParser.parseColor(this.context, expanded.getScrimColor()));
    }

    public final NavBarColors defaultColors() {
        Object Q11 = C7714v.Q(0, this.navBarColors);
        if (!(((NavBarColors) Q11) instanceof NavBarColors.Default)) {
            Q11 = null;
        }
        return (NavBarColors) Q11;
    }

    public final NavBarColors expandedColors() {
        Object Q11 = C7714v.Q(1, this.navBarColors);
        if (!(((NavBarColors) Q11) instanceof NavBarColors.Expanded)) {
            Q11 = null;
        }
        return (NavBarColors) Q11;
    }

    public final void parseNavBarColors(@NotNull List<? extends NavBarVO.State> states, boolean isExpanded) {
        Intrinsics.checkNotNullParameter(states, "states");
        NavBarColors parseDefaultNavBarColors = parseDefaultNavBarColors((NavBarVO.State) C7714v.Q(0, states));
        NavBarColors parseExpandedNavBarColors = parseExpandedNavBarColors(isExpanded ? (NavBarVO.State) C7714v.Q(1, states) : null);
        this.navBarColors.clear();
        this.navBarColors.add(parseDefaultNavBarColors);
        this.navBarColors.add(parseExpandedNavBarColors);
    }
}
