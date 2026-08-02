package defpackage;

import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import androidx.fragment.app.FragmentActivity;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class wc extends eq3 {
    public static boolean b0(FragmentActivity fragmentActivity, String str) {
        int i = Build.VERSION.SDK_INT;
        if (i < 33 && TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return false;
        }
        if (i >= 32) {
            return fragmentActivity.shouldShowRequestPermissionRationale(str);
        }
        if (i != 31) {
            return fragmentActivity.shouldShowRequestPermissionRationale(str);
        }
        try {
            return ((Boolean) PackageManager.class.getMethod("shouldShowRequestPermissionRationale", String.class).invoke(fragmentActivity.getApplication().getPackageManager(), str)).booleanValue();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return fragmentActivity.shouldShowRequestPermissionRationale(str);
        }
    }
}
