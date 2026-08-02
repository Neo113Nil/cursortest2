package defpackage;

import com.blaze.blazesdk.shared.BlazeSDK;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class p4m implements rq4 {
    public final /* synthetic */ ful a;

    public p4m(ful fulVar) {
        this.a = fulVar;
    }

    @Override // defpackage.rq4
    public final void e(u6b u6bVar) {
        u6bVar.getClass();
        try {
            this.a.s(u6bVar);
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
        }
    }

    @Override // defpackage.rq4
    public final void g(u6b u6bVar) {
        try {
            this.a.q(u6bVar);
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
        }
    }

    @Override // defpackage.rq4
    public final void i(u6b u6bVar) {
        u6bVar.getClass();
        try {
            u6bVar.getClass();
            this.a.getClass();
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
        }
    }

    @Override // defpackage.rq4
    public final void onDestroy(u6b u6bVar) {
        try {
            u6bVar.getLifecycle().d(this);
            ful fulVar = this.a;
            fulVar.e = null;
            fulVar.f(u6bVar);
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
        }
    }

    @Override // defpackage.rq4
    public final void onStart(u6b u6bVar) {
        u6bVar.getClass();
        try {
            u6bVar.getClass();
            this.a.getClass();
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
        }
    }

    @Override // defpackage.rq4
    public final void onStop(u6b u6bVar) {
        try {
            this.a.getClass();
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
        }
    }
}
