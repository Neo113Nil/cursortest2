package defpackage;

import android.app.sdksandbox.sdkprovider.SdkSandboxController;
import android.content.Context;
import android.os.Bundle;
import android.os.Process;
import android.os.RemoteException;
import android.os.ext.SdkExtensions;
import com.google.android.gms.internal.ads.zzasl;
import com.google.android.gms.internal.ads.zzasp;
import com.google.android.gms.internal.ads.zzbez;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class mjn extends zzasl {
    public int a = 0;
    public final Context b;
    public final String c;
    public zzbez d;
    public ljn e;

    public mjn(Context context) {
        this.b = context.getApplicationContext();
        this.c = (!o62.b() || SdkExtensions.getExtensionVersion(34) < 8) ? context.getPackageName() : Process.isSdkSandbox() ? ((SdkSandboxController) context.getSystemService(SdkSandboxController.class)).getClientPackageName() : context.getPackageName();
    }

    public final boolean a() {
        return (this.a != 2 || this.d == null || this.e == null) ? false : true;
    }

    public final zzasp b() {
        if (!a()) {
            a70.r("Service not connected. Please start a connection before using the service.");
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putString("package_name", this.c);
        try {
            return new zzasp(this.d.u(bundle));
        } catch (RemoteException e) {
            this.a = 0;
            throw e;
        }
    }
}
