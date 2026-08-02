package Oa;

import android.os.IBinder;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class p extends j {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ IBinder f8590b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s f8591c;

    public p(s sVar, IBinder iBinder) {
        this.f8591c = sVar;
        this.f8590b = iBinder;
    }

    @Override // Oa.j
    public final void a() {
        List list;
        List list2;
        this.f8591c.f8593a.f8607m = e.g(this.f8590b);
        t.n(this.f8591c.f8593a);
        this.f8591c.f8593a.f8601g = false;
        list = this.f8591c.f8593a.f8598d;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        list2 = this.f8591c.f8593a.f8598d;
        list2.clear();
    }
}
