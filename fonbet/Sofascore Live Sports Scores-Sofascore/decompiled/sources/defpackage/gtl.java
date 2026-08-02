package defpackage;

import android.content.Context;
import android.content.Intent;
import com.blaze.blazesdk.delegates.BlazePlayerSourceDelegate;
import com.blaze.blazesdk.players.inline.BlazeBaseInlinePlayerContainer;
import com.blaze.blazesdk.shared.results.ErrorDomain;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class gtl implements rq4 {
    public final /* synthetic */ BlazeBaseInlinePlayerContainer a;
    public final /* synthetic */ Context b;

    public gtl(BlazeBaseInlinePlayerContainer blazeBaseInlinePlayerContainer, Context context) {
        this.a = blazeBaseInlinePlayerContainer;
        this.b = context;
    }

    @Override // defpackage.rq4
    public final void e(u6b u6bVar) {
        String str;
        u6bVar.getClass();
        u6bVar.getClass();
        BlazeBaseInlinePlayerContainer blazeBaseInlinePlayerContainer = this.a;
        Context context = this.b;
        blazeBaseInlinePlayerContainer.b(context);
        gzk gzkVar = gzk.a;
        str = blazeBaseInlinePlayerContainer.containerId;
        ErrorDomain errorDomain = ErrorDomain.CONTAINER;
        BlazePlayerSourceDelegate playerDelegate = blazeBaseInlinePlayerContainer.getPlayerDelegate();
        yql access$getInternalPlayerEventHandler = BlazeBaseInlinePlayerContainer.access$getInternalPlayerEventHandler(blazeBaseInlinePlayerContainer);
        str.getClass();
        errorDomain.getClass();
        Iterator it = gzk.b.iterator();
        while (it.hasNext()) {
            gzk.d(str, playerDelegate, errorDomain, (Intent) it.next(), this.b, access$getInternalPlayerEventHandler);
        }
        BlazeBaseInlinePlayerContainer.access$registerBroadcastReceivers(blazeBaseInlinePlayerContainer, context);
    }

    @Override // defpackage.rq4
    public final void onDestroy(u6b u6bVar) {
    }
}
