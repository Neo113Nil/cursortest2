package C3;

import android.content.Context;
import com.airbnb.lottie.utils.z;

/* loaded from: classes.dex */
public class c implements b {
    @Override // C3.b
    public a a(Context context) {
        return (context == null || z.f(context) != 0.0f) ? a.STANDARD_MOTION : a.REDUCED_MOTION;
    }
}
