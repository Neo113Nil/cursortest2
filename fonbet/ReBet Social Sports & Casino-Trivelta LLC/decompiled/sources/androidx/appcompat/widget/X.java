package androidx.appcompat.widget;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class X extends ContextWrapper {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f17234c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static ArrayList f17235d;

    /* renamed from: a, reason: collision with root package name */
    public final Resources f17236a;

    /* renamed from: b, reason: collision with root package name */
    public final Resources.Theme f17237b;

    public X(Context context) {
        super(context);
        if (!k0.d()) {
            this.f17236a = new Z(this, context.getResources());
            this.f17237b = null;
            return;
        }
        k0 k0Var = new k0(this, context.getResources());
        this.f17236a = k0Var;
        Resources.Theme newTheme = k0Var.newTheme();
        this.f17237b = newTheme;
        newTheme.setTo(context.getTheme());
    }

    public static boolean a(Context context) {
        return ((context instanceof X) || (context.getResources() instanceof Z) || (context.getResources() instanceof k0) || !k0.d()) ? false : true;
    }

    public static Context b(Context context) {
        if (!a(context)) {
            return context;
        }
        synchronized (f17234c) {
            try {
                ArrayList arrayList = f17235d;
                if (arrayList == null) {
                    f17235d = new ArrayList();
                } else {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        WeakReference weakReference = (WeakReference) f17235d.get(size);
                        if (weakReference == null || weakReference.get() == null) {
                            f17235d.remove(size);
                        }
                    }
                    for (int size2 = f17235d.size() - 1; size2 >= 0; size2--) {
                        WeakReference weakReference2 = (WeakReference) f17235d.get(size2);
                        X x10 = weakReference2 != null ? (X) weakReference2.get() : null;
                        if (x10 != null && x10.getBaseContext() == context) {
                            return x10;
                        }
                    }
                }
                X x11 = new X(context);
                f17235d.add(new WeakReference(x11));
                return x11;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return this.f17236a.getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return this.f17236a;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f17237b;
        return theme == null ? super.getTheme() : theme;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i10) {
        Resources.Theme theme = this.f17237b;
        if (theme == null) {
            super.setTheme(i10);
        } else {
            theme.applyStyle(i10, true);
        }
    }
}
