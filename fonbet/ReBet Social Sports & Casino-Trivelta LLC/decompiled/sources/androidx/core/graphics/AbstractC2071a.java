package androidx.core.graphics;

import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import androidx.core.graphics.AbstractC2073c;

/* renamed from: androidx.core.graphics.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2071a {

    /* renamed from: androidx.core.graphics.a$a, reason: collision with other inner class name */
    public static class C0361a {
        public static ColorFilter a(int i10, Object obj) {
            return new BlendModeColorFilter(i10, (BlendMode) obj);
        }
    }

    public static ColorFilter a(int i10, EnumC2072b enumC2072b) {
        if (Build.VERSION.SDK_INT >= 29) {
            Object a10 = AbstractC2073c.b.a(enumC2072b);
            if (a10 != null) {
                return C0361a.a(i10, a10);
            }
            return null;
        }
        PorterDuff.Mode a11 = AbstractC2073c.a(enumC2072b);
        if (a11 != null) {
            return new PorterDuffColorFilter(i10, a11);
        }
        return null;
    }
}
