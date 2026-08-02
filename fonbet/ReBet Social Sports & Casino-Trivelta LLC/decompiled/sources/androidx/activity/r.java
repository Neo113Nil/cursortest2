package androidx.activity;

import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.view.View;
import android.view.Window;
import androidx.activity.J;
import com.plaid.internal.EnumC3631g;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    public static final int f16418a = Color.argb(EnumC3631g.SDK_ASSET_ILLUSTRATION_EMPTY_SVG_VALUE, 255, 255, 255);

    /* renamed from: b, reason: collision with root package name */
    public static final int f16419b = Color.argb(128, 27, 27, 27);

    /* renamed from: c, reason: collision with root package name */
    public static B f16420c;

    public static final void a(ComponentActivity componentActivity) {
        Intrinsics.checkNotNullParameter(componentActivity, "<this>");
        c(componentActivity, null, null, 3, null);
    }

    public static final void b(ComponentActivity componentActivity, J statusBarStyle, J navigationBarStyle) {
        Intrinsics.checkNotNullParameter(componentActivity, "<this>");
        Intrinsics.checkNotNullParameter(statusBarStyle, "statusBarStyle");
        Intrinsics.checkNotNullParameter(navigationBarStyle, "navigationBarStyle");
        View decorView = componentActivity.getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "window.decorView");
        Function1 b10 = statusBarStyle.b();
        Resources resources = decorView.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "view.resources");
        boolean booleanValue = ((Boolean) b10.invoke(resources)).booleanValue();
        Function1 b11 = navigationBarStyle.b();
        Resources resources2 = decorView.getResources();
        Intrinsics.checkNotNullExpressionValue(resources2, "view.resources");
        boolean booleanValue2 = ((Boolean) b11.invoke(resources2)).booleanValue();
        B b12 = f16420c;
        if (b12 == null) {
            int i10 = Build.VERSION.SDK_INT;
            b12 = i10 >= 30 ? new z() : i10 >= 29 ? new y() : i10 >= 28 ? new v() : i10 >= 26 ? new t() : new s();
        }
        B b13 = b12;
        Window window = componentActivity.getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "window");
        b13.b(statusBarStyle, navigationBarStyle, window, decorView, booleanValue, booleanValue2);
        Window window2 = componentActivity.getWindow();
        Intrinsics.checkNotNullExpressionValue(window2, "window");
        b13.a(window2);
    }

    public static /* synthetic */ void c(ComponentActivity componentActivity, J j10, J j11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = J.a.b(J.f16360e, 0, 0, null, 4, null);
        }
        if ((i10 & 2) != 0) {
            j11 = J.a.b(J.f16360e, f16418a, f16419b, null, 4, null);
        }
        b(componentActivity, j10, j11);
    }
}
