package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.u;
import com.blaze.blazesdk.shared.BlazeSDK;
import com.blaze.blazesdk.widgets.ui.BlazeBaseWidget;
import defpackage.jul;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class cyl implements rq4 {
    public final /* synthetic */ BlazeBaseWidget a;

    public cyl(BlazeBaseWidget blazeBaseWidget) {
        this.a = blazeBaseWidget;
    }

    @Override // defpackage.rq4
    public final void e(u6b u6bVar) {
        u6bVar.getClass();
        try {
            u6bVar.getClass();
            BlazeBaseWidget blazeBaseWidget = this.a;
            blazeBaseWidget.getClass();
            blazeBaseWidget.k();
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
        }
    }

    @Override // defpackage.rq4
    public final void g(u6b u6bVar) {
        try {
            this.a.getClass();
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
            this.a.l = null;
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
        }
    }

    @Override // defpackage.rq4
    public final void onStart(u6b u6bVar) {
        u6bVar.getClass();
        try {
            BlazeBaseWidget blazeBaseWidget = this.a;
            blazeBaseWidget.getClass();
            blazeBaseWidget.getViewModel().d.e(u6bVar, blazeBaseWidget.o);
            blazeBaseWidget.getViewModel().n.e(u6bVar, blazeBaseWidget.p);
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
        }
    }

    @Override // defpackage.rq4
    public final void onStop(u6b u6bVar) {
        try {
            BlazeBaseWidget blazeBaseWidget = this.a;
            blazeBaseWidget.getClass();
            blazeBaseWidget.getViewModel().d.i(blazeBaseWidget.o);
            blazeBaseWidget.getViewModel().n.i(blazeBaseWidget.p);
            jul adapter$blazesdk_release = blazeBaseWidget.getAdapter$blazesdk_release();
            RecyclerView recyclerView = adapter$blazesdk_release.j;
            u findViewHolderForAdapterPosition = recyclerView != null ? recyclerView.findViewHolderForAdapterPosition(adapter$blazesdk_release.k) : null;
            jul.a aVar = findViewHolderForAdapterPosition instanceof jul.a ? (jul.a) findViewHolderForAdapterPosition : null;
            if (aVar != null) {
                aVar.c.b.stopAnimatedThumbnail();
            }
            adapter$blazesdk_release.k = -1;
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
        }
    }
}
