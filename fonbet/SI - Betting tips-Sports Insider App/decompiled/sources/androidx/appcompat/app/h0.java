package androidx.appcompat.app;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.MenuItem;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class h0 {

    /* renamed from: a, reason: collision with root package name */
    public Object f257a;

    /* renamed from: b, reason: collision with root package name */
    public Object f258b;

    public h0(Bundle data, String type) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(data, "data");
        this.f257a = type;
        this.f258b = data;
    }

    public void c() {
        g0 g0Var = (g0) this.f257a;
        if (g0Var != null) {
            try {
                ((l0) this.f258b).f304k.unregisterReceiver(g0Var);
            } catch (IllegalArgumentException unused) {
            }
            this.f257a = null;
        }
    }

    public abstract IntentFilter d();

    public abstract int e();

    public MenuItem f(MenuItem menuItem) {
        if (!(menuItem instanceof i0.a)) {
            return menuItem;
        }
        i0.a aVar = (i0.a) menuItem;
        if (((s.n) this.f258b) == null) {
            this.f258b = new s.n(0);
        }
        MenuItem menuItem2 = (MenuItem) ((s.n) this.f258b).get(aVar);
        if (menuItem2 != null) {
            return menuItem2;
        }
        androidx.appcompat.view.menu.u uVar = new androidx.appcompat.view.menu.u((Context) this.f257a, aVar);
        ((s.n) this.f258b).put(aVar, uVar);
        return uVar;
    }

    public abstract void g();

    public void h() {
        c();
        IntentFilter d10 = d();
        if (d10.countActions() == 0) {
            return;
        }
        if (((g0) this.f257a) == null) {
            this.f257a = new g0(0, this);
        }
        ((l0) this.f258b).f304k.registerReceiver((g0) this.f257a, d10);
    }

    public h0(Context context) {
        this.f257a = context;
    }

    public h0(l0 l0Var) {
        this.f258b = l0Var;
    }
}
