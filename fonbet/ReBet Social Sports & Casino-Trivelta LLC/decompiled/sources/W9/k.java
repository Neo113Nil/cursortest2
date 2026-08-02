package W9;

import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.common.internal.AbstractC3191o;

/* loaded from: classes2.dex */
public final class k implements N9.c {

    /* renamed from: a, reason: collision with root package name */
    public final ViewGroup f13194a;

    /* renamed from: b, reason: collision with root package name */
    public final X9.c f13195b;

    /* renamed from: c, reason: collision with root package name */
    public View f13196c;

    public k(ViewGroup viewGroup, X9.c cVar) {
        this.f13195b = (X9.c) AbstractC3191o.m(cVar);
        this.f13194a = (ViewGroup) AbstractC3191o.m(viewGroup);
    }

    @Override // N9.c
    public final void a() {
        try {
            this.f13195b.a();
        } catch (RemoteException e10) {
            throw new Y9.f(e10);
        }
    }

    public final void b(e eVar) {
        try {
            this.f13195b.B(new j(this, eVar));
        } catch (RemoteException e10) {
            throw new Y9.f(e10);
        }
    }

    @Override // N9.c
    public final void f(Bundle bundle) {
        try {
            Bundle bundle2 = new Bundle();
            X9.l.b(bundle, bundle2);
            X9.c cVar = this.f13195b;
            cVar.f(bundle2);
            X9.l.b(bundle2, bundle);
            this.f13196c = (View) N9.d.g(cVar.getView());
            ViewGroup viewGroup = this.f13194a;
            viewGroup.removeAllViews();
            viewGroup.addView(this.f13196c);
        } catch (RemoteException e10) {
            throw new Y9.f(e10);
        }
    }

    @Override // N9.c
    public final void h() {
        try {
            this.f13195b.h();
        } catch (RemoteException e10) {
            throw new Y9.f(e10);
        }
    }

    @Override // N9.c
    public final void onLowMemory() {
        try {
            this.f13195b.onLowMemory();
        } catch (RemoteException e10) {
            throw new Y9.f(e10);
        }
    }

    @Override // N9.c
    public final void onResume() {
        try {
            this.f13195b.onResume();
        } catch (RemoteException e10) {
            throw new Y9.f(e10);
        }
    }
}
