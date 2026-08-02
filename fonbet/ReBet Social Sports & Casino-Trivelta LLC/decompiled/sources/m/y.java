package m;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.widget.D;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.e0;
import androidx.core.view.AbstractC2082d0;
import java.util.ArrayList;
import m.LayoutInflaterFactory2C5486h;

/* loaded from: classes.dex */
public class y extends AbstractC5479a {

    /* renamed from: a, reason: collision with root package name */
    public final D f56054a;

    /* renamed from: b, reason: collision with root package name */
    public final Window.Callback f56055b;

    /* renamed from: c, reason: collision with root package name */
    public final LayoutInflaterFactory2C5486h.g f56056c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f56057d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f56058e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f56059f;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f56060g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public final Runnable f56061h = new a();

    /* renamed from: i, reason: collision with root package name */
    public final Toolbar.h f56062i;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            y.this.H();
        }
    }

    public class b implements Toolbar.h {
        public b() {
        }

        @Override // androidx.appcompat.widget.Toolbar.h
        public boolean onMenuItemClick(MenuItem menuItem) {
            return y.this.f56055b.onMenuItemSelected(0, menuItem);
        }
    }

    public final class c implements i.a {

        /* renamed from: a, reason: collision with root package name */
        public boolean f56065a;

        public c() {
        }

        @Override // androidx.appcompat.view.menu.i.a
        public void a(androidx.appcompat.view.menu.e eVar, boolean z10) {
            if (this.f56065a) {
                return;
            }
            this.f56065a = true;
            y.this.f56054a.s();
            y.this.f56055b.onPanelClosed(108, eVar);
            this.f56065a = false;
        }

        @Override // androidx.appcompat.view.menu.i.a
        public boolean b(androidx.appcompat.view.menu.e eVar) {
            y.this.f56055b.onMenuOpened(108, eVar);
            return true;
        }
    }

    public final class d implements e.a {
        public d() {
        }

        @Override // androidx.appcompat.view.menu.e.a
        public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.e.a
        public void b(androidx.appcompat.view.menu.e eVar) {
            if (y.this.f56054a.f()) {
                y.this.f56055b.onPanelClosed(108, eVar);
            } else if (y.this.f56055b.onPreparePanel(0, null, eVar)) {
                y.this.f56055b.onMenuOpened(108, eVar);
            }
        }
    }

    public class e implements LayoutInflaterFactory2C5486h.g {
        public e() {
        }

        @Override // m.LayoutInflaterFactory2C5486h.g
        public boolean a(int i10) {
            if (i10 != 0) {
                return false;
            }
            y yVar = y.this;
            if (yVar.f56057d) {
                return false;
            }
            yVar.f56054a.g();
            y.this.f56057d = true;
            return false;
        }

        @Override // m.LayoutInflaterFactory2C5486h.g
        public View onCreatePanelView(int i10) {
            if (i10 == 0) {
                return new View(y.this.f56054a.getContext());
            }
            return null;
        }
    }

    public y(Toolbar toolbar, CharSequence charSequence, Window.Callback callback) {
        b bVar = new b();
        this.f56062i = bVar;
        x0.f.g(toolbar);
        e0 e0Var = new e0(toolbar, false);
        this.f56054a = e0Var;
        this.f56055b = (Window.Callback) x0.f.g(callback);
        e0Var.setWindowCallback(callback);
        toolbar.setOnMenuItemClickListener(bVar);
        e0Var.setWindowTitle(charSequence);
        this.f56056c = new e();
    }

    @Override // m.AbstractC5479a
    public void B(CharSequence charSequence) {
        this.f56054a.k(charSequence);
    }

    @Override // m.AbstractC5479a
    public void C(int i10) {
        D d10 = this.f56054a;
        d10.setTitle(i10 != 0 ? d10.getContext().getText(i10) : null);
    }

    @Override // m.AbstractC5479a
    public void D(CharSequence charSequence) {
        this.f56054a.setTitle(charSequence);
    }

    @Override // m.AbstractC5479a
    public void E(CharSequence charSequence) {
        this.f56054a.setWindowTitle(charSequence);
    }

    public final Menu G() {
        if (!this.f56058e) {
            this.f56054a.w(new c(), new d());
            this.f56058e = true;
        }
        return this.f56054a.l();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void H() {
        Menu G10 = G();
        androidx.appcompat.view.menu.e eVar = G10 instanceof androidx.appcompat.view.menu.e ? (androidx.appcompat.view.menu.e) G10 : null;
        if (eVar != null) {
            eVar.i0();
        }
        try {
            G10.clear();
            if (this.f56055b.onCreatePanelMenu(0, G10)) {
                if (!this.f56055b.onPreparePanel(0, null, G10)) {
                }
                if (eVar == null) {
                    eVar.h0();
                    return;
                }
                return;
            }
            G10.clear();
            if (eVar == null) {
            }
        } catch (Throwable th2) {
            if (eVar != null) {
                eVar.h0();
            }
            throw th2;
        }
    }

    public void I(int i10, int i11) {
        this.f56054a.j((i10 & i11) | ((~i11) & this.f56054a.x()));
    }

    @Override // m.AbstractC5479a
    public boolean f() {
        return this.f56054a.c();
    }

    @Override // m.AbstractC5479a
    public boolean g() {
        if (!this.f56054a.i()) {
            return false;
        }
        this.f56054a.collapseActionView();
        return true;
    }

    @Override // m.AbstractC5479a
    public void h(boolean z10) {
        if (z10 == this.f56059f) {
            return;
        }
        this.f56059f = z10;
        if (this.f56060g.size() <= 0) {
            return;
        }
        android.support.v4.media.session.b.a(this.f56060g.get(0));
        throw null;
    }

    @Override // m.AbstractC5479a
    public int i() {
        return this.f56054a.x();
    }

    @Override // m.AbstractC5479a
    public Context j() {
        return this.f56054a.getContext();
    }

    @Override // m.AbstractC5479a
    public void k() {
        this.f56054a.setVisibility(8);
    }

    @Override // m.AbstractC5479a
    public boolean l() {
        this.f56054a.o().removeCallbacks(this.f56061h);
        AbstractC2082d0.d0(this.f56054a.o(), this.f56061h);
        return true;
    }

    @Override // m.AbstractC5479a
    public void m(Configuration configuration) {
        super.m(configuration);
    }

    @Override // m.AbstractC5479a
    public void n() {
        this.f56054a.o().removeCallbacks(this.f56061h);
    }

    @Override // m.AbstractC5479a
    public boolean o(int i10, KeyEvent keyEvent) {
        Menu G10 = G();
        if (G10 == null) {
            return false;
        }
        G10.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return G10.performShortcut(i10, keyEvent, 0);
    }

    @Override // m.AbstractC5479a
    public boolean p(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            q();
        }
        return true;
    }

    @Override // m.AbstractC5479a
    public boolean q() {
        return this.f56054a.d();
    }

    @Override // m.AbstractC5479a
    public void r(Drawable drawable) {
        this.f56054a.a(drawable);
    }

    @Override // m.AbstractC5479a
    public void t(boolean z10) {
        I(z10 ? 4 : 0, 4);
    }

    @Override // m.AbstractC5479a
    public void u(boolean z10) {
        I(z10 ? 2 : 0, 2);
    }

    @Override // m.AbstractC5479a
    public void v(boolean z10) {
        I(z10 ? 8 : 0, 8);
    }

    @Override // m.AbstractC5479a
    public void w(int i10) {
        this.f56054a.v(i10);
    }

    @Override // m.AbstractC5479a
    public void x(Drawable drawable) {
        this.f56054a.z(drawable);
    }

    @Override // m.AbstractC5479a
    public void z(Drawable drawable) {
        this.f56054a.setIcon(drawable);
    }

    @Override // m.AbstractC5479a
    public void A(boolean z10) {
    }

    @Override // m.AbstractC5479a
    public void s(boolean z10) {
    }

    @Override // m.AbstractC5479a
    public void y(boolean z10) {
    }
}
