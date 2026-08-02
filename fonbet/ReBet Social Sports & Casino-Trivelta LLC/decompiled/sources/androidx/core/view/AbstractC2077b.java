package androidx.core.view;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: androidx.core.view.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2077b {

    /* renamed from: a, reason: collision with root package name */
    public final Context f19184a;

    /* renamed from: b, reason: collision with root package name */
    public a f19185b;

    /* renamed from: c, reason: collision with root package name */
    public InterfaceC0363b f19186c;

    /* renamed from: androidx.core.view.b$a */
    public interface a {
    }

    /* renamed from: androidx.core.view.b$b, reason: collision with other inner class name */
    public interface InterfaceC0363b {
        void onActionProviderVisibilityChanged(boolean z10);
    }

    public AbstractC2077b(Context context) {
        this.f19184a = context;
    }

    public abstract boolean a();

    public abstract boolean b();

    public abstract View c(MenuItem menuItem);

    public abstract boolean d();

    public abstract void e(SubMenu subMenu);

    public abstract boolean f();

    public void g() {
        this.f19186c = null;
        this.f19185b = null;
    }

    public void h(a aVar) {
        this.f19185b = aVar;
    }

    public abstract void i(InterfaceC0363b interfaceC0363b);
}
