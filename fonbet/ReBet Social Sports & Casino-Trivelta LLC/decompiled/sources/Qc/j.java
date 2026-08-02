package Qc;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Log;
import com.twilio.voice.Constants;
import kotlin.jvm.internal.Intrinsics;
import n.AbstractC5596a;

/* loaded from: classes4.dex */
public abstract class j {
    public static final Drawable a(Context context, String str) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (str == null) {
            return null;
        }
        int identifier = context.getResources().getIdentifier(str, "drawable", context.getPackageName());
        if (identifier > 0) {
            return AbstractC5596a.b(context, identifier);
        }
        int identifier2 = context.getResources().getIdentifier(str, "drawable", Constants.PLATFORM_ANDROID);
        if (identifier2 > 0) {
            return AbstractC5596a.b(context, identifier2);
        }
        Log.w("SystemDrawable", "[RNScreens] Unable to resolve drawable resource with the name " + str);
        return null;
    }
}
