package androidx.appcompat.app;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class p0 implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final View f336a;

    /* renamed from: b, reason: collision with root package name */
    public final String f337b;

    /* renamed from: c, reason: collision with root package name */
    public Method f338c;

    /* renamed from: d, reason: collision with root package name */
    public Context f339d;

    public p0(View view, String str) {
        this.f336a = view;
        this.f337b = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        Method method;
        if (this.f338c == null) {
            View view2 = this.f336a;
            Context context = view2.getContext();
            while (true) {
                String str2 = this.f337b;
                if (context == null) {
                    int id2 = view2.getId();
                    if (id2 == -1) {
                        str = "";
                    } else {
                        str = " with id '" + view2.getContext().getResources().getResourceEntryName(id2) + "'";
                    }
                    StringBuilder p10 = d9.e.p("Could not find method ", str2, "(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
                    p10.append(view2.getClass());
                    p10.append(str);
                    throw new IllegalStateException(p10.toString());
                }
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(str2, View.class)) != null) {
                        this.f338c = method;
                        this.f339d = context;
                    }
                } catch (NoSuchMethodException unused) {
                }
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
        }
        try {
            this.f338c.invoke(this.f339d, view);
        } catch (IllegalAccessException e7) {
            throw new IllegalStateException("Could not execute non-public method for android:onClick", e7);
        } catch (InvocationTargetException e9) {
            throw new IllegalStateException("Could not execute method for android:onClick", e9);
        }
    }
}
