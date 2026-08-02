package Aa;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;

/* loaded from: classes3.dex */
public final class f extends androidx.appcompat.view.menu.e {

    /* renamed from: A, reason: collision with root package name */
    public final Class f355A;

    /* renamed from: B, reason: collision with root package name */
    public final int f356B;

    /* renamed from: C, reason: collision with root package name */
    public final boolean f357C;

    public f(Context context, Class cls, int i10, boolean z10) {
        super(context);
        this.f355A = cls;
        this.f356B = i10;
        this.f357C = z10;
    }

    @Override // androidx.appcompat.view.menu.e
    public MenuItem a(int i10, int i11, int i12, CharSequence charSequence) {
        if (size() + 1 <= this.f356B) {
            i0();
            MenuItem a10 = super.a(i10, i11, i12, charSequence);
            h0();
            return a10;
        }
        String simpleName = this.f355A.getSimpleName();
        throw new IllegalArgumentException("Maximum number of items supported by " + simpleName + " is " + this.f356B + ". Limit can be checked with " + simpleName + "#getMaxItemCount()");
    }

    @Override // androidx.appcompat.view.menu.e, android.view.Menu
    public SubMenu addSubMenu(int i10, int i11, int i12, CharSequence charSequence) {
        if (this.f357C) {
            androidx.appcompat.view.menu.g gVar = (androidx.appcompat.view.menu.g) a(i10, i11, i12, charSequence);
            j jVar = new j(w(), this, gVar);
            gVar.x(jVar);
            return jVar;
        }
        throw new UnsupportedOperationException(this.f355A.getSimpleName() + " does not support submenus");
    }
}
