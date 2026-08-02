package androidx.appcompat.view;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.b;
import java.util.ArrayList;
import q0.InterfaceMenuC6087a;
import q0.InterfaceMenuItemC6088b;
import z.r;

/* loaded from: classes.dex */
public class f extends ActionMode {

    /* renamed from: a, reason: collision with root package name */
    public final Context f16552a;

    /* renamed from: b, reason: collision with root package name */
    public final b f16553b;

    public static class a implements b.a {

        /* renamed from: a, reason: collision with root package name */
        public final ActionMode.Callback f16554a;

        /* renamed from: b, reason: collision with root package name */
        public final Context f16555b;

        /* renamed from: c, reason: collision with root package name */
        public final ArrayList f16556c = new ArrayList();

        /* renamed from: d, reason: collision with root package name */
        public final r f16557d = new r();

        public a(Context context, ActionMode.Callback callback) {
            this.f16555b = context;
            this.f16554a = callback;
        }

        @Override // androidx.appcompat.view.b.a
        public void a(b bVar) {
            this.f16554a.onDestroyActionMode(e(bVar));
        }

        @Override // androidx.appcompat.view.b.a
        public boolean b(b bVar, Menu menu) {
            return this.f16554a.onCreateActionMode(e(bVar), f(menu));
        }

        @Override // androidx.appcompat.view.b.a
        public boolean c(b bVar, MenuItem menuItem) {
            return this.f16554a.onActionItemClicked(e(bVar), new r.c(this.f16555b, (InterfaceMenuItemC6088b) menuItem));
        }

        @Override // androidx.appcompat.view.b.a
        public boolean d(b bVar, Menu menu) {
            return this.f16554a.onPrepareActionMode(e(bVar), f(menu));
        }

        public ActionMode e(b bVar) {
            int size = this.f16556c.size();
            for (int i10 = 0; i10 < size; i10++) {
                f fVar = (f) this.f16556c.get(i10);
                if (fVar != null && fVar.f16553b == bVar) {
                    return fVar;
                }
            }
            f fVar2 = new f(this.f16555b, bVar);
            this.f16556c.add(fVar2);
            return fVar2;
        }

        public final Menu f(Menu menu) {
            Menu menu2 = (Menu) this.f16557d.get(menu);
            if (menu2 != null) {
                return menu2;
            }
            r.e eVar = new r.e(this.f16555b, (InterfaceMenuC6087a) menu);
            this.f16557d.put(menu, eVar);
            return eVar;
        }
    }

    public f(Context context, b bVar) {
        this.f16552a = context;
        this.f16553b = bVar;
    }

    @Override // android.view.ActionMode
    public void finish() {
        this.f16553b.c();
    }

    @Override // android.view.ActionMode
    public View getCustomView() {
        return this.f16553b.d();
    }

    @Override // android.view.ActionMode
    public Menu getMenu() {
        return new r.e(this.f16552a, (InterfaceMenuC6087a) this.f16553b.e());
    }

    @Override // android.view.ActionMode
    public MenuInflater getMenuInflater() {
        return this.f16553b.f();
    }

    @Override // android.view.ActionMode
    public CharSequence getSubtitle() {
        return this.f16553b.g();
    }

    @Override // android.view.ActionMode
    public Object getTag() {
        return this.f16553b.h();
    }

    @Override // android.view.ActionMode
    public CharSequence getTitle() {
        return this.f16553b.i();
    }

    @Override // android.view.ActionMode
    public boolean getTitleOptionalHint() {
        return this.f16553b.j();
    }

    @Override // android.view.ActionMode
    public void invalidate() {
        this.f16553b.k();
    }

    @Override // android.view.ActionMode
    public boolean isTitleOptional() {
        return this.f16553b.l();
    }

    @Override // android.view.ActionMode
    public void setCustomView(View view) {
        this.f16553b.m(view);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(CharSequence charSequence) {
        this.f16553b.o(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTag(Object obj) {
        this.f16553b.p(obj);
    }

    @Override // android.view.ActionMode
    public void setTitle(CharSequence charSequence) {
        this.f16553b.r(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTitleOptionalHint(boolean z10) {
        this.f16553b.s(z10);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(int i10) {
        this.f16553b.n(i10);
    }

    @Override // android.view.ActionMode
    public void setTitle(int i10) {
        this.f16553b.q(i10);
    }
}
