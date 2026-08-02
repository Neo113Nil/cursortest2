package defpackage;

import android.app.Activity;
import android.view.View;
import com.blaze.blazesdk.style.players.moments.BlazeMomentsPlayerStyle;
import java.lang.ref.WeakReference;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class hrl {
    public final BlazeMomentsPlayerStyle a;
    public final WeakReference b;
    public final WeakReference c;
    public final u4a d;

    public hrl(@NotNull Activity activity, @NotNull View view, @NotNull BlazeMomentsPlayerStyle blazeMomentsPlayerStyle, boolean z) {
        activity.getClass();
        view.getClass();
        blazeMomentsPlayerStyle.getClass();
        this.a = blazeMomentsPlayerStyle;
        this.b = new WeakReference(activity);
        this.c = new WeakReference(view);
        this.d = u4a.e;
    }
}
