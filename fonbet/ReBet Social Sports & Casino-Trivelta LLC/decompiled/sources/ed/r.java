package ed;

import android.content.Context;
import android.view.View;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.UIManagerHelper;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class r {
    public static final ReactContext a(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        return UIManagerHelper.getReactContext(view);
    }

    public static final int b(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return UIManagerHelper.getSurfaceId(context);
    }
}
