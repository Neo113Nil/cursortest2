package K9;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.common.internal.AbstractC3191o;

/* loaded from: classes2.dex */
public abstract class g {
    private static final String[] zza = {"android.", "com.android.", "dalvik.", "java.", "javax."};

    public static boolean a(Context context, Throwable th2) {
        try {
            AbstractC3191o.m(context);
            AbstractC3191o.m(th2);
            return false;
        } catch (Exception e10) {
            Log.e("CrashUtils", "Error adding exception to DropBox!", e10);
            return false;
        }
    }
}
