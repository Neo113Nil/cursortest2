package ru.ozon.app.android.fresh.unsorted.widgets.navBar.presentation;

import Ax.ViewOnClickListenerC2451a;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import androidx.appcompat.app.g;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.Q0;
import androidx.fragment.app.r;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l10.t;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.unsorted.databinding.WidgetExpressNavBarBinding;
import ru.ozon.uni.android.uikit.common.StyleParser;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000f\b\u0001\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001a\u0010\u0017J\u0017\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010!\u001a\u00020\u00152\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\"R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010#R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010$R$\u0010%\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010\u0017¨\u0006*"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/navBar/presentation/ExpressNavBarColorsHelper;", "", "Lru/ozon/app/android/fresh/unsorted/databinding/WidgetExpressNavBarBinding;", "binding", "Landroidx/appcompat/widget/Toolbar;", "composerToolbar", "Ll10/t;", "container", "<init>", "(Lru/ozon/app/android/fresh/unsorted/databinding/WidgetExpressNavBarBinding;Landroidx/appcompat/widget/Toolbar;Ll10/t;)V", "Landroid/content/Context;", "context", "Lru/ozon/app/android/fresh/unsorted/widgets/navBar/presentation/ExpressNavBarVO;", "item", "Lru/ozon/app/android/fresh/unsorted/widgets/navBar/presentation/ExpressNavBarColors;", "parseNavBarColors", "(Landroid/content/Context;Lru/ozon/app/android/fresh/unsorted/widgets/navBar/presentation/ExpressNavBarVO;)Lru/ozon/app/android/fresh/unsorted/widgets/navBar/presentation/ExpressNavBarColors;", "", "canHandleBackStack", "()Z", "colors", "", "setNavBarColor", "(Lru/ozon/app/android/fresh/unsorted/widgets/navBar/presentation/ExpressNavBarColors;)V", "setNavBarNavigationIcon", "(Landroid/content/Context;)V", "setStatusBarFlags", "", "color", "isColorDark", "(I)Z", "applyColors$widgets_unsorted_prodGoogleAllVendorsRelease", "(Landroid/content/Context;Lru/ozon/app/android/fresh/unsorted/widgets/navBar/presentation/ExpressNavBarVO;)V", "applyColors", "Lru/ozon/app/android/fresh/unsorted/databinding/WidgetExpressNavBarBinding;", "Landroidx/appcompat/widget/Toolbar;", "Ll10/t;", "navBarColors", "Lru/ozon/app/android/fresh/unsorted/widgets/navBar/presentation/ExpressNavBarColors;", "getNavBarColors", "()Lru/ozon/app/android/fresh/unsorted/widgets/navBar/presentation/ExpressNavBarColors;", "setNavBarColors", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ExpressNavBarColorsHelper {

    @NotNull
    private final WidgetExpressNavBarBinding binding;
    private final Toolbar composerToolbar;

    @NotNull
    private final t container;
    private ExpressNavBarColors navBarColors;

    public ExpressNavBarColorsHelper(@NotNull WidgetExpressNavBarBinding binding, Toolbar toolbar, @NotNull t container) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(container, "container");
        this.binding = binding;
        this.composerToolbar = toolbar;
        this.container = container;
    }

    private final boolean canHandleBackStack() {
        return this.container.h().getParentFragmentManager().l0() > 1;
    }

    private final boolean isColorDark(int color) {
        return ((double) 1) - (((((double) Color.blue(color)) * 0.114d) + ((((double) Color.green(color)) * 0.587d) + (((double) Color.red(color)) * 0.299d))) / ((double) 255)) >= 0.5d;
    }

    private final ExpressNavBarColors parseNavBarColors(Context context, ExpressNavBarVO item) {
        StyleParser styleParser = StyleParser.INSTANCE;
        int parseColor = styleParser.parseColor(context, item.getNavBarTintColor(), StyleParser.OzColor.OZ_SEMANTIC_COLOR_BG_PRIMARY);
        return new ExpressNavBarColors(parseColor, parseColor, Intrinsics.d(item.getNavTintColor(), item.getNavBarTintColor()) ? styleParser.parseColor(context, (String) null, StyleParser.OzColor.OZ_SEMANTIC_COLOR_TEXT_PRIMARY) : styleParser.parseColor(context, item.getNavTintColor(), StyleParser.OzColor.OZ_SEMANTIC_COLOR_TEXT_PRIMARY), isColorDark(parseColor), Intrinsics.d(item.getHideSystemBackButton(), Boolean.FALSE) && canHandleBackStack());
    }

    private final void setNavBarColor(ExpressNavBarColors colors) {
        Toolbar toolbar = this.composerToolbar;
        if (toolbar != null) {
            toolbar.setBackgroundColor(colors.getBackgroundColor());
        }
        this.container.g().getWindow().setStatusBarColor(colors.getStatusBarColor());
    }

    private final void setNavBarNavigationIcon(Context context) {
        Drawable navigationIcon;
        Toolbar toolbar = this.composerToolbar;
        if (toolbar == null || (navigationIcon = toolbar.getNavigationIcon()) == null) {
            return;
        }
        ImageView imageView = new ImageView(context);
        imageView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        imageView.setImageDrawable(navigationIcon);
        imageView.setOnClickListener(new ViewOnClickListenerC2451a(this, 0));
        this.binding.leftContainer.addView(imageView, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setNavBarNavigationIcon$lambda$2$lambda$1(ExpressNavBarColorsHelper expressNavBarColorsHelper, View view) {
        Context context = expressNavBarColorsHelper.binding.getConstraintLayout().getContext();
        g gVar = context instanceof g ? (g) context : null;
        if (gVar != null) {
            gVar.onSupportNavigateUp();
        }
    }

    private final void setStatusBarFlags(ExpressNavBarColors colors) {
        Window window;
        r a11 = this.container.a();
        if (a11 == null || (window = a11.getWindow()) == null) {
            return;
        }
        View decorView = window.getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "getDecorView(...)");
        Q0 q02 = new Q0(decorView, window);
        if (colors.getIsBgColorDark()) {
            q02.e(false);
            q02.d(false);
        } else {
            q02.e(true);
            q02.d(true);
        }
    }

    public final void applyColors$widgets_unsorted_prodGoogleAllVendorsRelease(@NotNull Context context, @NotNull ExpressNavBarVO item) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(item, "item");
        ExpressNavBarColors parseNavBarColors = parseNavBarColors(context, item);
        setStatusBarFlags(parseNavBarColors);
        setNavBarColor(parseNavBarColors);
        if (parseNavBarColors.getShouldShowBackButton()) {
            setNavBarNavigationIcon(context);
        }
        this.navBarColors = parseNavBarColors;
    }

    public final ExpressNavBarColors getNavBarColors() {
        return this.navBarColors;
    }
}
