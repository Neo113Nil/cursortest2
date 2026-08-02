package ru.ozon.app.android.regulardraw.utils;

import Vg.c;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Path;
import android.graphics.Rect;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.r;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7705l;
import kotlin.collections.C7714v;
import kotlin.collections.M;
import kotlin.collections.e0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import l10.t;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.custom.CustomActionHandler;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.common.actionHandlers.shareLink.ShareLinkActionHandler;
import ru.ozon.app.android.platform.customActionHandlers.composerActionWithAction.ComposerActionWithActionHandler;
import ru.ozon.app.android.storefront.actionHandlers.CloseMiniappActionHandler;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.LayoutExtKt;

@Metadata(d1 = {"\u0000`\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0006\u001a\u0015\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n\u001a'\u0010\u0011\u001a\u00020\u000f*\u00020\u000b2\u0006\u0010\r\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0004\b\u0011\u0010\u0012\u001a'\u0010\u0013\u001a\u00020\u000f*\u00020\u000b2\u0006\u0010\r\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0004\b\u0013\u0010\u0012\u001a!\u0010\u0017\u001a\u00020\u000f*\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0003¢\u0006\u0004\b\u0017\u0010\u0018\u001a1\u0010!\u001a\u00020 2\n\u0010\u001b\u001a\u00060\u0019j\u0002`\u001a2\u0016\b\u0002\u0010\u001f\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u001e0\u001d0\u001c¢\u0006\u0004\b!\u0010\"\u001a\u001b\u0010%\u001a\u00020$*\u00020\u00002\u0006\u0010#\u001a\u00020\u0000H\u0000¢\u0006\u0004\b%\u0010&\"\u001a\u0010'\u001a\u00020\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"(\u0010+\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u001e0\u001d0\u001c8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.¨\u0006/"}, d2 = {"", "Landroid/content/Context;", "context", "", "parseColor", "(Ljava/lang/String;Landroid/content/Context;)I", "(ILandroid/content/Context;)I", "Ll10/t;", "container", "getStatusBarHeight", "(Ll10/t;)I", "Landroid/graphics/Canvas;", "Landroid/graphics/Path;", "path", "Lkotlin/Function0;", "", "lambda", "drawWithClip", "(Landroid/graphics/Canvas;Landroid/graphics/Path;Lkotlin/jvm/functions/Function0;)V", "drawWithClipOut", "Landroid/view/View;", "left", "centerY", "layoutLeftCenter", "(Landroid/view/View;II)V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "", "Ljava/lang/Class;", "Lru/ozon/app/android/action/custom/CustomActionHandler;", "additionalSupportedActionsSet", "LVg/c;", "getDefaultActionHandlers", "(Lk20/g;Ljava/util/Set;)LVg/c;", "paramName", "", "getQueryParamValueFromPageInfo", "(Ljava/lang/String;Ljava/lang/String;)Z", "statusBarDefaultHeight", "I", "getStatusBarDefaultHeight", "()I", "DEFAULT_SUPPORTED_ACTIONS", "Ljava/util/Set;", "getDEFAULT_SUPPORTED_ACTIONS", "()Ljava/util/Set;", "regulardraw_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class UtilKt {

    @NotNull
    private static final Set<Class<? extends CustomActionHandler>> DEFAULT_SUPPORTED_ACTIONS;
    private static final int statusBarDefaultHeight = ResourceExtKt.toPx(25);

    static {
        Class[] elements = {CloseMiniappActionHandler.class, ComposerActionWithActionHandler.class, ShareLinkActionHandler.class};
        Intrinsics.checkNotNullParameter(elements, "elements");
        DEFAULT_SUPPORTED_ACTIONS = C7705l.j0(elements);
    }

    public static final void drawWithClip(@NotNull Canvas canvas, @NotNull Path path, @NotNull Function0<Unit> lambda) {
        Intrinsics.checkNotNullParameter(canvas, "<this>");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(lambda, "lambda");
        int saveLayer = canvas.saveLayer(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), null);
        canvas.clipPath(path);
        lambda.invoke();
        canvas.restoreToCount(saveLayer);
    }

    public static final void drawWithClipOut(@NotNull Canvas canvas, @NotNull Path path, @NotNull Function0<Unit> lambda) {
        Intrinsics.checkNotNullParameter(canvas, "<this>");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(lambda, "lambda");
        int saveLayer = canvas.saveLayer(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), null);
        canvas.clipOutPath(path);
        lambda.invoke();
        canvas.restoreToCount(saveLayer);
    }

    @NotNull
    public static final c getDefaultActionHandlers(@NotNull C7475g storage, @NotNull Set<? extends Class<? extends CustomActionHandler>> additionalSupportedActionsSet) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(additionalSupportedActionsSet, "additionalSupportedActionsSet");
        return ((CustomActionHandlersComponentApi) storage.getComponent(CustomActionHandlersComponentApi.class)).getCustomActionHandlersStoreFactory().create(e0.f(DEFAULT_SUPPORTED_ACTIONS, additionalSupportedActionsSet));
    }

    public static c getDefaultActionHandlers$default(C7475g c7475g, Set set, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            set = M.f71699a;
        }
        return getDefaultActionHandlers(c7475g, set);
    }

    public static final boolean getQueryParamValueFromPageInfo(@NotNull String str, @NotNull String paramName) {
        String str2;
        Object obj;
        Boolean t02;
        List m11;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(paramName, "paramName");
        String str3 = (String) C7714v.Q(1, h.m(str, new String[]{"?"}, 0, 6));
        if (str3 != null) {
            Iterator it = h.m(str3, new String[]{"&"}, 0, 6).iterator();
            while (true) {
                str2 = null;
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (h.e0((String) obj, paramName + "=", false)) {
                    break;
                }
            }
            String str4 = (String) obj;
            if (str4 != null && (m11 = h.m(str4, new String[]{"="}, 0, 6)) != null) {
                str2 = (String) C7714v.Q(1, m11);
            }
            if (str2 != null && (t02 = h.t0(str2)) != null) {
                return t02.booleanValue();
            }
        }
        return false;
    }

    public static final int getStatusBarHeight(@NotNull t container) {
        Resources resources;
        Resources resources2;
        Window window;
        View decorView;
        Intrinsics.checkNotNullParameter(container, "container");
        Rect rect = new Rect();
        r a11 = container.a();
        if (a11 != null && (window = a11.getWindow()) != null && (decorView = window.getDecorView()) != null) {
            decorView.getWindowVisibleDisplayFrame(rect);
        }
        int i11 = rect.top;
        if (i11 != 0) {
            return i11;
        }
        ComponentCallbacksC5392m b11 = container.b();
        int i12 = 0;
        int identifier = (b11 == null || (resources2 = b11.getResources()) == null) ? 0 : resources2.getIdentifier("status_bar_height", "dimen", "android");
        ComponentCallbacksC5392m b12 = container.b();
        if (b12 != null && (resources = b12.getResources()) != null) {
            i12 = resources.getDimensionPixelSize(identifier);
        }
        return i12 != 0 ? i12 : statusBarDefaultHeight;
    }

    public static final void layoutLeftCenter(@NotNull View view, int i11, int i12) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        LayoutExtKt.layoutLeftTop(view, i11, i12 - (view.getMeasuredHeight() / 2));
    }

    public static final int parseColor(@NotNull String str, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Integer parseColor = StyleParser.INSTANCE.parseColor(context, str);
        return parseColor != null ? parseColor.intValue() : Color.parseColor("#000000");
    }

    public static final int parseColor(int i11, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return context.getColor(i11);
    }
}
