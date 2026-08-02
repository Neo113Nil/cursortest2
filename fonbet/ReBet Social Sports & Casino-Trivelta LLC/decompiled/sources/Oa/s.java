package Oa;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* loaded from: classes3.dex */
public final class s implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t f8593a;

    public /* synthetic */ s(t tVar, r rVar) {
        this.f8593a = tVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        i iVar;
        iVar = this.f8593a.f8596b;
        iVar.d("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        t tVar = this.f8593a;
        tVar.c().post(new p(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        i iVar;
        iVar = this.f8593a.f8596b;
        iVar.d("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        t tVar = this.f8593a;
        tVar.c().post(new q(this));
    }
}
