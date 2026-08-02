package defpackage;

import android.os.Build;
import android.widget.RemoteViews;
import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class rf0 {
    public static final rf0 a = new rf0();

    public final void a(@NotNull RemoteViews remoteViews, int i, @NotNull z25 z25Var) {
        remoteViews.getClass();
        if (Build.VERSION.SDK_INT >= 31) {
            remoteViews.setBoolean(i, "setClipToOutline", true);
            if (z25Var instanceof q25) {
                remoteViews.setViewOutlinePreferredRadius(i, ((q25) z25Var).a, 1);
                return;
            } else {
                pvd.z(z25Var.getClass().getCanonicalName(), "Rounded corners should not be ");
                return;
            }
        }
        throw new IllegalArgumentException(("setClipToOutline is only available on SDK 31 and higher").toString());
    }

    public final void b(@NotNull RemoteViews remoteViews, int i, @NotNull z25 z25Var) {
        if (z25Var instanceof x25) {
            remoteViews.setViewLayoutHeight(i, -2.0f, 0);
        } else if (z25Var instanceof r25) {
            remoteViews.setViewLayoutHeight(i, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0);
        } else if (z25Var instanceof q25) {
            remoteViews.setViewLayoutHeight(i, ((q25) z25Var).a, 1);
        } else {
            if (!Intrinsics.c(z25Var, s25.a)) {
                zzl.b();
                return;
            }
            remoteViews.setViewLayoutHeight(i, -1.0f, 0);
        }
        Unit unit = Unit.a;
    }

    public final void c(@NotNull RemoteViews remoteViews, int i, @NotNull z25 z25Var) {
        if (z25Var instanceof x25) {
            remoteViews.setViewLayoutWidth(i, -2.0f, 0);
        } else if (z25Var instanceof r25) {
            remoteViews.setViewLayoutWidth(i, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0);
        } else if (z25Var instanceof q25) {
            remoteViews.setViewLayoutWidth(i, ((q25) z25Var).a, 1);
        } else {
            if (!Intrinsics.c(z25Var, s25.a)) {
                zzl.b();
                return;
            }
            remoteViews.setViewLayoutWidth(i, -1.0f, 0);
        }
        Unit unit = Unit.a;
    }
}
