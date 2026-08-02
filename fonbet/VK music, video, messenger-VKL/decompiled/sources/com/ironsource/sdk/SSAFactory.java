package com.ironsource.sdk;

import android.app.Activity;
import android.content.Context;
import com.ironsource.InterfaceC4390je;
import com.ironsource.P9;

@Deprecated
/* loaded from: classes13.dex */
public class SSAFactory {
    public static InterfaceC4390je getPublisherInstance(Activity activity) throws Exception {
        return P9.b((Context) activity);
    }

    public static InterfaceC4390je getPublisherTestInstance(Activity activity, int i) throws Exception {
        return P9.a(activity, i);
    }
}
