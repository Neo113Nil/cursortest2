package W9;

import android.content.Context;
import android.os.RemoteException;
import android.view.ViewGroup;
import com.google.android.gms.common.C3172e;
import com.google.android.gms.maps.GoogleMapOptions;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class l extends N9.a {

    /* renamed from: e, reason: collision with root package name */
    public final ViewGroup f13197e;

    /* renamed from: f, reason: collision with root package name */
    public final Context f13198f;

    /* renamed from: g, reason: collision with root package name */
    public N9.e f13199g;

    /* renamed from: h, reason: collision with root package name */
    public final GoogleMapOptions f13200h;

    /* renamed from: i, reason: collision with root package name */
    public final List f13201i = new ArrayList();

    public l(ViewGroup viewGroup, Context context, GoogleMapOptions googleMapOptions) {
        this.f13197e = viewGroup;
        this.f13198f = context;
        this.f13200h = googleMapOptions;
    }

    @Override // N9.a
    public final void a(N9.e eVar) {
        this.f13199g = eVar;
        p();
    }

    public final void o(e eVar) {
        if (b() != null) {
            ((k) b()).b(eVar);
        } else {
            this.f13201i.add(eVar);
        }
    }

    public final void p() {
        if (this.f13199g == null || b() != null) {
            return;
        }
        try {
            Context context = this.f13198f;
            d.a(context);
            X9.c L10 = X9.m.a(context, null).L(N9.d.i(context), this.f13200h);
            if (L10 == null) {
                return;
            }
            this.f13199g.a(new k(this.f13197e, L10));
            List list = this.f13201i;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((k) b()).b((e) it.next());
            }
            list.clear();
        } catch (RemoteException e10) {
            throw new Y9.f(e10);
        } catch (C3172e unused) {
        }
    }
}
