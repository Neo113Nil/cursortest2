package defpackage;

import android.app.Activity;
import android.app.PendingIntent;
import android.app.PictureInPictureParams;
import android.app.RemoteAction;
import android.content.Intent;
import android.graphics.Rect;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.util.Rational;
import android.view.View;
import com.blaze.blazesdk.shared.BlazeSDK;
import com.sofascore.results.R;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class t0m {
    public String a;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        new a(null);
    }

    public static PictureInPictureParams a(Activity activity, View view, boolean z) {
        Intent intent;
        Icon createWithResource;
        String str;
        int i;
        if (z) {
            intent = new Intent("com.blaze.blazesdk.pip.ACTION_PAUSE");
            intent.setPackage(activity.getPackageName());
            createWithResource = Icon.createWithResource(activity, R.drawable.blaze_drawable_ic_pip_pause);
            str = "Pause";
            i = 1002;
        } else {
            intent = new Intent("com.blaze.blazesdk.pip.ACTION_PLAY");
            intent.setPackage(activity.getPackageName());
            createWithResource = Icon.createWithResource(activity, R.drawable.blaze_drawable_ic_pip_play);
            str = "Play";
            i = 1001;
        }
        PictureInPictureParams.Builder actions = new PictureInPictureParams.Builder().setAspectRatio(new Rational(16, 9)).setActions(kotlin.collections.a.c(new RemoteAction(createWithResource, str, str, PendingIntent.getBroadcast(activity, i, intent, 201326592))));
        if (view != null) {
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            int i2 = iArr[0];
            actions.setSourceRectHint(new Rect(i2, iArr[1], view.getWidth() + i2, view.getHeight() + iArr[1]));
        }
        if (Build.VERSION.SDK_INT >= 31) {
            actions.setSeamlessResizeEnabled(true);
        }
        PictureInPictureParams build = actions.build();
        build.getClass();
        return build;
    }

    public static /* synthetic */ boolean enterPipMode$default(t0m t0mVar, Activity activity, View view, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            view = null;
        }
        if ((i & 4) != 0) {
            z = true;
        }
        return t0mVar.b(activity, view, z);
    }

    public final boolean b(Activity activity, View view, boolean z) {
        activity.getClass();
        try {
            activity.enterPictureInPictureMode(a(activity, view, z));
            this.a = null;
            return true;
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("System exception: ");
            String message = e.getMessage();
            if (message == null) {
                message = duf.a.getOrCreateKotlinClass(e.getClass()).getSimpleName();
            }
            sb.append(message);
            this.a = sb.toString();
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(e, null);
            return false;
        }
    }
}
