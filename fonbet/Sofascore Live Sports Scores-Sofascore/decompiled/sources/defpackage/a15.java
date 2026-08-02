package defpackage;

import android.net.nsd.NsdManager;
import android.net.nsd.NsdServiceInfo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class a15 implements NsdManager.RegistrationListener {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;

    public a15(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // android.net.nsd.NsdManager.RegistrationListener
    public final void onRegistrationFailed(NsdServiceInfo nsdServiceInfo, int i) {
        nsdServiceInfo.getClass();
        b15.a(this.b);
    }

    @Override // android.net.nsd.NsdManager.RegistrationListener
    public final void onServiceRegistered(NsdServiceInfo nsdServiceInfo) {
        nsdServiceInfo.getClass();
        if (this.a.equals(nsdServiceInfo.getServiceName())) {
            return;
        }
        b15.a(this.b);
    }

    @Override // android.net.nsd.NsdManager.RegistrationListener
    public final void onServiceUnregistered(NsdServiceInfo nsdServiceInfo) {
        nsdServiceInfo.getClass();
    }

    @Override // android.net.nsd.NsdManager.RegistrationListener
    public final void onUnregistrationFailed(NsdServiceInfo nsdServiceInfo, int i) {
        nsdServiceInfo.getClass();
    }
}
