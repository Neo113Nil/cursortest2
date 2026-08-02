package ru.ozon.uni.android.uikit.extensions.view;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.fragment.app.ComponentCallbacksC5392m;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0002\u0010\u0005\u001a\u0011\u0010\b\u001a\u00020\u0007*\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroid/app/Activity;", "Landroid/view/ViewGroup;", "getRootView", "(Landroid/app/Activity;)Landroid/view/ViewGroup;", "Landroidx/fragment/app/m;", "(Landroidx/fragment/app/m;)Landroid/view/ViewGroup;", "Landroid/content/Context;", "Landroid/graphics/Point;", "getAppUsableScreenSize", "(Landroid/content/Context;)Landroid/graphics/Point;", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ContextExtKt {
    @NotNull
    public static final Point getAppUsableScreenSize(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Object systemService = context.getSystemService("window");
        Intrinsics.g(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        return point;
    }

    public static final ViewGroup getRootView(Activity activity) {
        if (activity == null || activity.getWindow() == null) {
            return null;
        }
        View decorView = activity.getWindow().getDecorView();
        Intrinsics.g(decorView, "null cannot be cast to non-null type android.view.ViewGroup");
        return (ViewGroup) decorView;
    }

    public static final ViewGroup getRootView(ComponentCallbacksC5392m componentCallbacksC5392m) {
        View view;
        View rootView = (componentCallbacksC5392m == null || (view = componentCallbacksC5392m.getView()) == null) ? null : view.getRootView();
        if (rootView instanceof ViewGroup) {
            return (ViewGroup) rootView;
        }
        return null;
    }
}
