package com.ironsource.sdk;

import android.app.Activity;
import android.content.Context;
import com.ironsource.InterfaceC4132ie;
import com.ironsource.O9;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Deprecated
/* loaded from: classes4.dex */
public class SSAFactory {
    public static InterfaceC4132ie getPublisherInstance(Activity activity) throws Exception {
        return O9.b((Context) activity);
    }

    public static InterfaceC4132ie getPublisherTestInstance(Activity activity, int i) throws Exception {
        return O9.a(activity, i);
    }
}
