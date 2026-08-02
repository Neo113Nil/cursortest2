package defpackage;

import android.content.Context;
import com.blaze.blazesdk.delegates.BlazePlayerInContainerDelegate;
import com.blaze.blazesdk.features.moments.container.BlazeMomentsPlayerContainer;
import com.blaze.blazesdk.shared.results.ErrorDomain;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class b3m implements rq4 {
    public final /* synthetic */ BlazeMomentsPlayerContainer a;
    public final /* synthetic */ Context b;

    public b3m(BlazeMomentsPlayerContainer blazeMomentsPlayerContainer, Context context) {
        this.a = blazeMomentsPlayerContainer;
        this.b = context;
    }

    @Override // defpackage.rq4
    public final void e(u6b u6bVar) {
        String containerId;
        BlazePlayerInContainerDelegate blazePlayerInContainerDelegate;
        u6bVar.getClass();
        u6bVar.getClass();
        BlazeMomentsPlayerContainer blazeMomentsPlayerContainer = this.a;
        Context context = this.b;
        blazeMomentsPlayerContainer.unregisterBroadcastReceivers(context);
        gzk gzkVar = gzk.a;
        containerId = blazeMomentsPlayerContainer.getContainerId();
        ErrorDomain errorDomain = ErrorDomain.CONTAINER;
        blazePlayerInContainerDelegate = blazeMomentsPlayerContainer.playerInContainerDelegate;
        gzk.handleUnhandledEvents$blazesdk_release$default(gzkVar, containerId, blazePlayerInContainerDelegate, errorDomain, this.b, null, 16, null);
        blazeMomentsPlayerContainer.registerBroadcastReceivers(context);
    }

    @Override // defpackage.rq4
    public final void g(u6b u6bVar) {
        this.a.unregisterBroadcastReceivers(this.b);
    }
}
