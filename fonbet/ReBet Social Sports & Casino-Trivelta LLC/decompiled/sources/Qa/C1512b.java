package Qa;

import android.os.IBinder;
import android.os.IInterface;
import java.util.Iterator;
import java.util.List;

/* renamed from: Qa.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1512b extends H {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ IBinder f9572g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ServiceConnectionC1515e f9573h;

    public C1512b(ServiceConnectionC1515e serviceConnectionC1515e, IBinder iBinder) {
        this.f9573h = serviceConnectionC1515e;
        this.f9572g = iBinder;
    }

    @Override // Qa.H
    public final void b() {
        N n10;
        List list;
        List list2;
        n10 = this.f9573h.f9575a.f9585i;
        this.f9573h.f9575a.f9590n = (IInterface) n10.a(this.f9572g);
        C1516f.r(this.f9573h.f9575a);
        this.f9573h.f9575a.f9583g = false;
        list = this.f9573h.f9575a.f9580d;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        list2 = this.f9573h.f9575a.f9580d;
        list2.clear();
    }
}
