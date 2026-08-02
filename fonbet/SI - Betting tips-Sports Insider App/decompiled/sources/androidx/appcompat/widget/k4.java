package androidx.appcompat.widget;

import android.content.Context;
import android.view.View;
import android.view.Window;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class k4 implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.appcompat.view.menu.a f808a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m4 f809b;

    public k4(m4 m4Var) {
        this.f809b = m4Var;
        Context context = m4Var.f821a.getContext();
        CharSequence charSequence = m4Var.f828h;
        androidx.appcompat.view.menu.a aVar = new androidx.appcompat.view.menu.a();
        aVar.f435e = 4096;
        aVar.f437g = 4096;
        aVar.f441l = null;
        aVar.f442m = null;
        aVar.f443n = false;
        aVar.f444o = false;
        aVar.f445p = 16;
        aVar.f439i = context;
        aVar.f431a = charSequence;
        this.f808a = aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        m4 m4Var = this.f809b;
        Window.Callback callback = m4Var.f830k;
        if (callback == null || !m4Var.f831l) {
            return;
        }
        callback.onMenuItemSelected(0, this.f808a);
    }
}
