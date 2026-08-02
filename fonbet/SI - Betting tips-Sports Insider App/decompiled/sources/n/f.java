package n;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import androidx.appcompat.view.menu.c0;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class f extends ActionMode {

    /* renamed from: a, reason: collision with root package name */
    public final Context f20773a;

    /* renamed from: b, reason: collision with root package name */
    public final b f20774b;

    public f(Context context, b bVar) {
        this.f20773a = context;
        this.f20774b = bVar;
    }

    @Override // android.view.ActionMode
    public final void finish() {
        this.f20774b.a();
    }

    @Override // android.view.ActionMode
    public final View getCustomView() {
        return this.f20774b.b();
    }

    @Override // android.view.ActionMode
    public final Menu getMenu() {
        return new c0(this.f20773a, this.f20774b.c());
    }

    @Override // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        return this.f20774b.d();
    }

    @Override // android.view.ActionMode
    public final CharSequence getSubtitle() {
        return this.f20774b.e();
    }

    @Override // android.view.ActionMode
    public final Object getTag() {
        return this.f20774b.f20759a;
    }

    @Override // android.view.ActionMode
    public final CharSequence getTitle() {
        return this.f20774b.f();
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.f20774b.f20760b;
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.f20774b.g();
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
        return this.f20774b.h();
    }

    @Override // android.view.ActionMode
    public final void setCustomView(View view) {
        this.f20774b.i(view);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence) {
        this.f20774b.k(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTag(Object obj) {
        this.f20774b.f20759a = obj;
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence charSequence) {
        this.f20774b.m(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean z5) {
        this.f20774b.n(z5);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i5) {
        this.f20774b.j(i5);
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i5) {
        this.f20774b.l(i5);
    }
}
