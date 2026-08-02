package Oa;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.IInterface;

/* loaded from: classes3.dex */
public final class n extends j {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f8589b;

    public n(t tVar) {
        this.f8589b = tVar;
    }

    @Override // Oa.j
    public final void a() {
        IInterface iInterface;
        i iVar;
        Context context;
        ServiceConnection serviceConnection;
        t tVar = this.f8589b;
        iInterface = tVar.f8607m;
        if (iInterface != null) {
            iVar = tVar.f8596b;
            iVar.d("Unbind from service.", new Object[0]);
            t tVar2 = this.f8589b;
            context = tVar2.f8595a;
            serviceConnection = tVar2.f8606l;
            context.unbindService(serviceConnection);
            this.f8589b.f8601g = false;
            this.f8589b.f8607m = null;
            this.f8589b.f8606l = null;
        }
        this.f8589b.t();
    }
}
