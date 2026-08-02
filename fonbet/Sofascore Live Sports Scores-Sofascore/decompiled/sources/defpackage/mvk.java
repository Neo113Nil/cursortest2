package defpackage;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.Field;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public class mvk extends tz9 {
    public static boolean h = true;
    public static boolean i = true;
    public static boolean j = true;
    public static boolean k = true;

    public void o0(View view, int i2, int i3, int i4, int i5) {
        if (j) {
            try {
                zrj.f(view, i2, i3, i4, i5);
            } catch (NoSuchMethodError unused) {
                j = false;
            }
        }
    }

    public void p0(int i2, View view) {
        if (Build.VERSION.SDK_INT != 28) {
            if (k) {
                try {
                    zrj.h(i2, view);
                    return;
                } catch (NoSuchMethodError unused) {
                    k = false;
                    return;
                }
            }
            return;
        }
        if (!tz9.g) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                tz9.f = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused2) {
            }
            tz9.g = true;
        }
        Field field = tz9.f;
        if (field != null) {
            try {
                tz9.f.setInt(view, (field.getInt(view) & (-13)) | i2);
            } catch (IllegalAccessException unused3) {
            }
        }
    }

    public void q0(View view, Matrix matrix) {
        if (h) {
            try {
                zrj.j(view, matrix);
            } catch (NoSuchMethodError unused) {
                h = false;
            }
        }
    }

    public void r0(ViewGroup viewGroup, Matrix matrix) {
        if (i) {
            try {
                zrj.k(viewGroup, matrix);
            } catch (NoSuchMethodError unused) {
                i = false;
            }
        }
    }
}
