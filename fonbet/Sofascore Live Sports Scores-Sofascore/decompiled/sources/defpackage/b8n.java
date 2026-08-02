package defpackage;

import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class b8n implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qfn b;

    public /* synthetic */ b8n(qfn qfnVar, AbstractSafeParcelable abstractSafeParcelable, int i) {
        this.a = i;
        this.b = qfnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        qfn qfnVar = this.b;
        switch (i) {
            case 0:
                qfnVar.S1("onNotificationReceived");
                break;
            case 1:
                qfnVar.S1("onEntityUpdate");
                break;
            case 2:
                qfnVar.S1("onPeerConnected");
                break;
            default:
                qfnVar.S1("onPeerDisconnected");
                break;
        }
    }
}
