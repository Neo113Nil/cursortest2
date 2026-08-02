package u9;

import android.graphics.BlendModeColorFilter;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import android.view.View;
import com.google.firebase.messaging.u;
import com.logrocket.core.graphics.n;
import java.lang.reflect.Field;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final Field f24072a;

    /* renamed from: b, reason: collision with root package name */
    public static final Field f24073b;

    /* renamed from: c, reason: collision with root package name */
    public static final boolean f24074c;

    static {
        Field field;
        Field field2 = null;
        boolean z5 = false;
        try {
            field = aa.k.a(PorterDuffColorFilter.class, "mColor");
            try {
                field2 = aa.k.a(PorterDuffColorFilter.class, "mMode");
                z5 = true;
            } catch (ClassNotFoundException | NoSuchFieldException unused) {
            }
        } catch (ClassNotFoundException | NoSuchFieldException unused2) {
            field = null;
        }
        f24072a = field;
        f24073b = field2;
        f24074c = z5;
    }

    public static void a(View view, n nVar, ColorFilter colorFilter) {
        if (colorFilter == null) {
            return;
        }
        if (view != null) {
            nVar.e(com.logrocket.core.graphics.c.compositeWidth, Integer.valueOf(view.getWidth()));
            nVar.e(com.logrocket.core.graphics.c.compositeHeight, Integer.valueOf(view.getHeight()));
        }
        boolean z5 = colorFilter instanceof PorterDuffColorFilter;
        com.logrocket.core.graphics.c cVar = com.logrocket.core.graphics.c.compositeType;
        com.logrocket.core.graphics.c cVar2 = com.logrocket.core.graphics.c.colorFilterColor;
        if (z5) {
            PorterDuffColorFilter porterDuffColorFilter = (PorterDuffColorFilter) colorFilter;
            if (f24074c) {
                try {
                    nVar.e(cVar2, Integer.valueOf(f24072a.getInt(porterDuffColorFilter)));
                    Object obj = f24073b.get(porterDuffColorFilter);
                    int h10 = obj instanceof PorterDuff.Mode ? m4.g.h((PorterDuff.Mode) obj) : 0;
                    if (h10 != 0) {
                        nVar.e(cVar, Integer.valueOf(r4.k.c(h10)));
                    }
                } catch (IllegalAccessException unused) {
                }
            }
        }
        if (Build.VERSION.SDK_INT < 29 || !(colorFilter instanceof BlendModeColorFilter)) {
            return;
        }
        BlendModeColorFilter blendModeColorFilter = (BlendModeColorFilter) colorFilter;
        nVar.e(cVar2, Integer.valueOf(blendModeColorFilter.getColor()));
        nVar.e(cVar, Integer.valueOf(r4.k.c(u.c(blendModeColorFilter.getMode()))));
    }
}
