package com.vk.core.ui.themes;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcelable;
import android.util.SparseIntArray;
import android.view.View;
import android.webkit.WebView;
import android.widget.ProgressBar;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.vk.common.presentation.base.view.swiperefreshlayout.SwipeDrawableRefreshLayout;
import com.vk.core.view.components.spinner.VkSpinner;
import com.vk.metrics.eventtracking.b;
import com.vkontakte.android.R;
import java.util.ArrayList;
import org.chromium.support_lib_boundary.util.Features;
import xsna.abg0;
import xsna.dhr0;
import xsna.g3p0;
import xsna.ggx0;
import xsna.hp30;
import xsna.i0q0;
import xsna.mix0;
import xsna.ohx0;
import xsna.ppo0;
import xsna.reh0;
import xsna.scs;
import xsna.too0;
import xsna.tv9;
import xsna.yei0;
import xsna.zq70;

/* compiled from: ThemeBinder.kt */
/* loaded from: classes.dex */
public final class a {
    public static final PorterDuff.Mode[] b = {PorterDuff.Mode.CLEAR, PorterDuff.Mode.SRC, PorterDuff.Mode.DST, PorterDuff.Mode.SRC_OVER, PorterDuff.Mode.DST_OVER, PorterDuff.Mode.SRC_IN, PorterDuff.Mode.DST_IN, PorterDuff.Mode.SRC_OUT, PorterDuff.Mode.DST_OUT, PorterDuff.Mode.SRC_ATOP, PorterDuff.Mode.DST_ATOP, PorterDuff.Mode.XOR, PorterDuff.Mode.DARKEN, PorterDuff.Mode.LIGHTEN, PorterDuff.Mode.MULTIPLY, PorterDuff.Mode.SCREEN, PorterDuff.Mode.ADD, PorterDuff.Mode.OVERLAY};
    public final ArrayList<ppo0> a = new ArrayList<>();

    /* compiled from: ThemeBinder.kt */
    /* renamed from: com.vk.core.ui.themes.a$a, reason: collision with other inner class name */
    /* loaded from: classes17.dex */
    public static final /* synthetic */ class C0793a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ThemeKeyAttributes.values().length];
            try {
                iArr[ThemeKeyAttributes.TEXT_COLOR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ThemeKeyAttributes.HINT_TEXT_COLOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ThemeKeyAttributes.TEXT_COLOR_STATE_LIST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ThemeKeyAttributes.TITLE_COLOR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ThemeKeyAttributes.BACKGROUND.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ThemeKeyAttributes.BACKGROUND_TINT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ThemeKeyAttributes.BACKGROUND_RES.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ThemeKeyAttributes.IMAGE_DRAWABLE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[ThemeKeyAttributes.BACKGROUND_DRAWABLE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[ThemeKeyAttributes.IMAGE_COLOR_FILTER_MODE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[ThemeKeyAttributes.IMAGE_COLOR_FILTER.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[ThemeKeyAttributes.IMAGE_TINT.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[ThemeKeyAttributes.CONTENT_SCRIM.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[ThemeKeyAttributes.DRAWABLE_TINT.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static void a(View view, int i, ThemeKeyAttributes themeKeyAttributes) {
        SparseIntArray sparseIntArray = view.getTag(R.id.theme_tag_key) != null ? (SparseIntArray) view.getTag(R.id.theme_tag_key) : new SparseIntArray();
        sparseIntArray.append(themeKeyAttributes.h(), i);
        view.setTag(R.id.theme_tag_key, sparseIntArray);
    }

    public static void b(SwipeDrawableRefreshLayout swipeDrawableRefreshLayout) {
        abg0 abg0Var = dhr0.t;
        swipeDrawableRefreshLayout.setColorSchemeColors(abg0Var.c(R.attr.vk_ui_icon_accent));
        swipeDrawableRefreshLayout.setProgressBackgroundColorSchemeColor(abg0Var.c(R.attr.vk_ui_background_modal));
        i0q0.f(new yei0(swipeDrawableRefreshLayout, 7));
    }

    public static void c(SwipeRefreshLayout swipeRefreshLayout) {
        abg0 abg0Var = dhr0.t;
        swipeRefreshLayout.setColorSchemeColors(abg0Var.c(R.attr.vk_ui_icon_accent));
        swipeRefreshLayout.setProgressBackgroundColorSchemeColor(abg0Var.c(R.attr.vk_ui_background_modal));
        i0q0.f(new hp30(swipeRefreshLayout, 24));
    }

    public static boolean d(Toolbar toolbar, int i) {
        if (i == R.attr.vk_legacy_header_background || i == R.attr.vk_ui_header_background || i == R.attr.vk_ui_header_background) {
            g3p0.b(toolbar);
            return true;
        }
        if (i != R.attr.vk_legacy_header_alternate_background && i != R.attr.vk_ui_background_modal && i != R.attr.vk_ui_background_modal) {
            return false;
        }
        g3p0.c(toolbar);
        return true;
    }

    public static void e(View view) {
        if (view instanceof SwipeRefreshLayout) {
            c((SwipeRefreshLayout) view);
            return;
        }
        if (view instanceof SwipeDrawableRefreshLayout) {
            b((SwipeDrawableRefreshLayout) view);
            return;
        }
        if (view instanceof VkSpinner) {
            return;
        }
        if (view instanceof ProgressBar) {
            ProgressBar progressBar = (ProgressBar) view;
            if (progressBar instanceof VkSpinner) {
                return;
            }
            try {
                ColorStateList colorStateList = new ColorStateList(new int[][]{new int[]{0}}, new int[]{dhr0.t.c(R.attr.vk_ui_icon_tertiary)});
                if (progressBar.getIndeterminateDrawable() != null) {
                    progressBar.setIndeterminateTintList(colorStateList);
                    return;
                }
                return;
            } catch (NullPointerException unused) {
                return;
            }
        }
        if (!(view instanceof RecyclerView)) {
            if (view instanceof WebView) {
                f((WebView) view);
                return;
            }
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (!(adapter instanceof scs)) {
            RecyclerView.o layoutManager = recyclerView.getLayoutManager();
            Parcelable onSaveInstanceState = layoutManager != null ? layoutManager.onSaveInstanceState() : null;
            recyclerView.setAdapter(null);
            recyclerView.getRecycledViewPool().clear();
            recyclerView.swapAdapter(adapter, true);
            if (onSaveInstanceState != null) {
                layoutManager.onRestoreInstanceState(onSaveInstanceState);
            }
        }
        int itemDecorationCount = recyclerView.getItemDecorationCount();
        boolean z = false;
        for (int i = 0; i < itemDecorationCount; i++) {
            Object itemDecorationAt = recyclerView.getItemDecorationAt(i);
            if (itemDecorationAt instanceof too0) {
                ((too0) itemDecorationAt).Ng();
                z = true;
            }
        }
        if (z) {
            if (recyclerView.isComputingLayout()) {
                recyclerView.post(new tv9(recyclerView, 13));
            } else {
                recyclerView.invalidateItemDecorations();
            }
        }
        reh0.a(recyclerView);
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void f(WebView webView) {
        Object b2;
        if (zq70.C(Features.GET_WEB_VIEW_CLIENT)) {
            try {
                b2 = mix0.b(webView);
            } catch (Throwable th) {
                b.a.q(th);
            }
            if (b2 != null) {
                int a = b2 instanceof ggx0 ? ((ggx0) b2).a() : 0;
                if (zq70.C(Features.FORCE_DARK)) {
                    ohx0.a(webView.getSettings(), a);
                }
                if (zq70.C("FORCE_DARK_STRATEGY")) {
                    ohx0.b(webView.getSettings());
                }
            }
            reh0.a(webView);
        }
        b2 = null;
        if (b2 != null) {
        }
        reh0.a(webView);
    }
}
