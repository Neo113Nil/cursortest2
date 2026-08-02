package J8;

import android.app.Service;
import android.content.Context;
import android.view.ContextThemeWrapper;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final e f5969a = new e();

    public final boolean a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (context instanceof ContextThemeWrapper) {
            context = ((ContextThemeWrapper) context).getBaseContext();
        }
        return Service.class.isInstance(context);
    }
}
