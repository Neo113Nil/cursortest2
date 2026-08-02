package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.i;
import androidx.core.view.C2102n0;

/* loaded from: classes.dex */
public interface D {
    void a(Drawable drawable);

    boolean b();

    boolean c();

    void collapseActionView();

    boolean d();

    void e(Menu menu, i.a aVar);

    boolean f();

    void g();

    Context getContext();

    CharSequence getTitle();

    boolean h();

    boolean i();

    void j(int i10);

    void k(CharSequence charSequence);

    Menu l();

    int m();

    C2102n0 n(int i10, long j10);

    ViewGroup o();

    void p(boolean z10);

    void q();

    void r(boolean z10);

    void s();

    void setIcon(int i10);

    void setIcon(Drawable drawable);

    void setTitle(CharSequence charSequence);

    void setVisibility(int i10);

    void setWindowCallback(Window.Callback callback);

    void setWindowTitle(CharSequence charSequence);

    void t(T t10);

    void u(int i10);

    void v(int i10);

    void w(i.a aVar, e.a aVar2);

    int x();

    void y();

    void z(Drawable drawable);
}
