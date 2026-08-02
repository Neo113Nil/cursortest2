package androidx.appcompat.widget;

import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class b2 {

    /* renamed from: a, reason: collision with root package name */
    public static final Method f706a;

    /* renamed from: b, reason: collision with root package name */
    public static final Method f707b;

    /* renamed from: c, reason: collision with root package name */
    public static final Method f708c;

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f709d;

    static {
        try {
            Class cls = Integer.TYPE;
            Class cls2 = Float.TYPE;
            Method declaredMethod = AbsListView.class.getDeclaredMethod("positionSelector", cls, View.class, Boolean.TYPE, cls2, cls2);
            f706a = declaredMethod;
            declaredMethod.setAccessible(true);
            Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", cls);
            f707b = declaredMethod2;
            declaredMethod2.setAccessible(true);
            Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", cls);
            f708c = declaredMethod3;
            declaredMethod3.setAccessible(true);
            f709d = true;
        } catch (NoSuchMethodException e7) {
            e7.printStackTrace();
        }
    }
}
