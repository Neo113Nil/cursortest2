package u4;

import android.app.Activity;
import android.app.PendingIntent;
import android.app.PictureInPictureParams;
import android.content.pm.ActivityInfo;
import android.graphics.Rect;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Process;
import android.util.Rational;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.AbstractC2185j;
import androidx.media3.exoplayer.ExoPlayer;
import com.facebook.react.uimanager.ThemedReactContext;
import com.plaid.internal.EnumC3631g;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import t4.C6441a;
import w4.C6704c;
import x0.InterfaceC6772a;

/* renamed from: u4.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6518y {

    /* renamed from: a, reason: collision with root package name */
    public static final C6518y f66137a = new C6518y();

    public static final Runnable d(ThemedReactContext context, final W view) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(view, "view");
        final ComponentActivity a10 = AbstractC6519z.a(context);
        final InterfaceC6772a interfaceC6772a = new InterfaceC6772a() { // from class: u4.w
            @Override // x0.InterfaceC6772a
            public final void accept(Object obj) {
                C6518y.e(W.this, a10, (androidx.core.app.w) obj);
            }
        };
        final Runnable runnable = new Runnable() { // from class: u4.x
            @Override // java.lang.Runnable
            public final void run() {
                C6518y.f(W.this);
            }
        };
        a10.addOnPictureInPictureModeChangedListener(interfaceC6772a);
        if (Build.VERSION.SDK_INT < 31) {
            a10.addOnUserLeaveHintListener(runnable);
        }
        return new Runnable() { // from class: u4.v
            @Override // java.lang.Runnable
            public final void run() {
                C6518y.g(ComponentActivity.this, interfaceC6772a, runnable);
            }
        };
    }

    public static final void e(W w10, ComponentActivity componentActivity, androidx.core.app.w info) {
        Intrinsics.checkNotNullParameter(info, "info");
        w10.setIsInPictureInPicture(info.a());
        if (info.a() || componentActivity.getLifecycle().b() != AbstractC2185j.b.f20392c || w10.f66072y2) {
            return;
        }
        w10.setPausedModifier(true);
    }

    public static final void f(W w10) {
        if (w10.f66065v) {
            w10.f1();
        }
    }

    public static final void g(ComponentActivity componentActivity, InterfaceC6772a interfaceC6772a, Runnable runnable) {
        componentActivity.removeOnPictureInPictureModeChangedListener(interfaceC6772a);
        componentActivity.removeOnUserLeaveHintListener(runnable);
    }

    public static final void h(ThemedReactContext context, PictureInPictureParams.Builder builder, boolean z10) {
        PictureInPictureParams build;
        Intrinsics.checkNotNullParameter(context, "context");
        if (builder == null || Build.VERSION.SDK_INT < 31) {
            return;
        }
        builder.setAutoEnterEnabled(z10);
        C6518y c6518y = f66137a;
        build = builder.build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        c6518y.t(context, build);
    }

    public static final void i(ThemedReactContext context, PictureInPictureParams.Builder builder, C6704c receiver, boolean z10) {
        PictureInPictureParams build;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(receiver, "receiver");
        if (builder == null || Build.VERSION.SDK_INT < 26) {
            return;
        }
        builder.setActions(q(context, z10, receiver));
        C6518y c6518y = f66137a;
        build = builder.build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        c6518y.t(context, build);
    }

    public static final void j(ThemedReactContext context, PictureInPictureParams.Builder builder, C6505k playerView) {
        PictureInPictureParams build;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(playerView, "playerView");
        if (builder == null || Build.VERSION.SDK_INT < 26) {
            return;
        }
        builder.setSourceRectHint(l(playerView));
        C6518y c6518y = f66137a;
        build = builder.build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        c6518y.t(context, build);
    }

    public static final Rational k(ExoPlayer player) {
        Intrinsics.checkNotNullParameter(player, "player");
        Rational rational = new Rational(player.Z().f24529a, player.Z().f24530b);
        Rational rational2 = new Rational(EnumC3631g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_03_VALUE, 100);
        Rational rational3 = new Rational(100, EnumC3631g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_03_VALUE);
        return rational.floatValue() > rational2.floatValue() ? rational2 : rational.floatValue() < rational3.floatValue() ? rational3 : rational;
    }

    public static final Rect l(C6505k c6505k) {
        Rect rect = new Rect();
        c6505k.getGlobalVisibleRect(rect);
        int[] iArr = new int[2];
        c6505k.getLocationOnScreen(iArr);
        int i10 = rect.bottom - rect.top;
        int i11 = iArr[1];
        rect.top = i11;
        rect.bottom = i11 + i10;
        return rect;
    }

    public static final void p(ThemedReactContext context, PictureInPictureParams pictureInPictureParams) {
        Intrinsics.checkNotNullParameter(context, "context");
        C6518y c6518y = f66137a;
        if (c6518y.r(context)) {
            if (!c6518y.s() || pictureInPictureParams == null) {
                try {
                    AbstractC6519z.a(context).enterPictureInPictureMode();
                    return;
                } catch (IllegalStateException e10) {
                    C6441a.b("PictureInPictureUtil", e10.toString());
                    return;
                }
            }
            try {
                AbstractC6519z.a(context).enterPictureInPictureMode(pictureInPictureParams);
            } catch (IllegalStateException e11) {
                C6441a.b("PictureInPictureUtil", e11.toString());
            }
        }
    }

    public static final ArrayList q(ThemedReactContext context, boolean z10, C6704c receiver) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(receiver, "receiver");
        PendingIntent a10 = receiver.a(z10);
        Icon createWithResource = Icon.createWithResource(context, z10 ? androidx.media3.ui.V.f22271c : androidx.media3.ui.V.f22270b);
        Intrinsics.checkNotNullExpressionValue(createWithResource, "createWithResource(...)");
        String str = z10 ? "play" : "pause";
        AbstractC6512s.a();
        return CollectionsKt.arrayListOf(r.a(createWithResource, str, str, a10));
    }

    public final boolean m() {
        return true;
    }

    public final boolean n(ThemedReactContext themedReactContext) {
        boolean z10;
        ActivityInfo activityInfo;
        ComponentActivity a10 = AbstractC6519z.a(themedReactContext);
        if (a10 == null) {
            return false;
        }
        try {
            activityInfo = a10.getPackageManager().getActivityInfo(a10.getComponentName(), 128);
            Intrinsics.checkNotNullExpressionValue(activityInfo, "getActivityInfo(...)");
        } catch (Exception unused) {
        }
        if ((activityInfo.flags & 4194304) != 0) {
            z10 = true;
            return z10 && a10.getPackageManager().hasSystemFeature("android.software.picture_in_picture");
        }
        z10 = false;
        if (z10) {
            return false;
        }
    }

    public final boolean o(ThemedReactContext themedReactContext) {
        Activity currentActivity = themedReactContext.getCurrentActivity();
        if (currentActivity == null) {
            return false;
        }
        int i10 = Build.VERSION.SDK_INT;
        return i10 >= 26 ? androidx.core.app.f.b(currentActivity, "android:picture_in_picture", Process.myUid(), currentActivity.getPackageName()) == 0 : i10 < 26;
    }

    public final boolean r(ThemedReactContext themedReactContext) {
        return m() && n(themedReactContext) && o(themedReactContext);
    }

    public final boolean s() {
        return Build.VERSION.SDK_INT >= 26;
    }

    public final void t(ThemedReactContext themedReactContext, PictureInPictureParams pictureInPictureParams) {
        if (s() && r(themedReactContext)) {
            try {
                AbstractC6519z.a(themedReactContext).setPictureInPictureParams(pictureInPictureParams);
            } catch (IllegalStateException e10) {
                C6441a.b("PictureInPictureUtil", e10.toString());
            }
        }
    }
}
