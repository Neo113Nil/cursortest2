package com.blaze.blazesdk.initialization;

import android.app.Application;
import android.content.Context;
import com.blaze.blazesdk.shared.BlazeSDK;
import defpackage.b8f;
import defpackage.cx0;
import defpackage.evl;
import defpackage.iwl;
import defpackage.k3a;
import defpackage.p1m;
import defpackage.tjm;
import defpackage.vnm;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/blaze/blazesdk/initialization/BlazeApplicationContentProviderInitializer;", "Lk3a;", "", "<init>", "()V", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BlazeApplicationContentProviderInitializer implements k3a {
    @Override // defpackage.k3a
    public final Object create(Context context) {
        context.getClass();
        try {
            Context applicationContext = context.getApplicationContext();
            Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
            if (application != null) {
                BlazeSDK blazeSDK = BlazeSDK.INSTANCE;
                blazeSDK.setApplication$blazesdk_release(application);
                vnm.b = application;
                p1m.b(application);
                evl.dispatchOnIO$default(blazeSDK, null, new cx0(null), 1, null);
                application.registerActivityLifecycleCallbacks(iwl.a);
                b8f.i.f.a(tjm.a);
            }
        } catch (Exception e) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(e, null);
        }
        return Unit.a;
    }

    @Override // defpackage.k3a
    public final List dependencies() {
        return new ArrayList();
    }
}
