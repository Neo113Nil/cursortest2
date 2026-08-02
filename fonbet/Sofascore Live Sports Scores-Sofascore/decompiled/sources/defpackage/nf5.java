package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.blaze.blazesdk.delegates.BlazePlayerSourceDelegate;
import com.blaze.blazesdk.shared.BlazeSDK;
import com.blaze.blazesdk.shared.results.ErrorDomain;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class nf5 extends BroadcastReceiver {
    public final /* synthetic */ String a;
    public final /* synthetic */ BlazePlayerSourceDelegate b;
    public final /* synthetic */ ErrorDomain c;
    public final /* synthetic */ yql d;

    public nf5(String str, BlazePlayerSourceDelegate blazePlayerSourceDelegate, ErrorDomain errorDomain, yql yqlVar) {
        this.a = str;
        this.b = blazePlayerSourceDelegate;
        this.c = errorDomain;
        this.d = yqlVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        try {
            gzk gzkVar = gzk.a;
            gzk.d(this.a, this.b, this.c, intent, BlazeSDK.INSTANCE.getCurrActivityOrApplicationContext$blazesdk_release(), this.d);
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
        }
    }
}
