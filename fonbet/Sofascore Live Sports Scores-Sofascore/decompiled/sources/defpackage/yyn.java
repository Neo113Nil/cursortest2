package defpackage;

import com.google.android.gms.internal.ads.zzdgq;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class yyn implements Runnable {
    public final /* synthetic */ int a;
    public final WeakReference b;

    public /* synthetic */ yyn(zzdgq zzdgqVar, int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = new WeakReference(zzdgqVar);
                break;
            default:
                this.b = new WeakReference(zzdgqVar);
                break;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        WeakReference weakReference = this.b;
        switch (i) {
            case 0:
                zzdgq zzdgqVar = (zzdgq) weakReference.get();
                if (zzdgqVar != null) {
                    zzdgqVar.p0(fff.h);
                    break;
                }
                break;
            default:
                zzdgq zzdgqVar2 = (zzdgq) weakReference.get();
                if (zzdgqVar2 != null) {
                    zzdgqVar2.p0(dff.f);
                    break;
                }
                break;
        }
    }
}
