package com.ironsource.sdk;

import android.app.Activity;
import android.content.Context;
import com.ironsource.InterfaceC2494je;
import com.ironsource.O9;

@Deprecated
/* loaded from: classes4.dex */
public class SSAFactory {
    public static InterfaceC2494je getPublisherInstance(Activity activity) throws Exception {
        return O9.b((Context) activity);
    }

    public static InterfaceC2494je getPublisherTestInstance(Activity activity, int i) throws Exception {
        return O9.a(activity, i);
    }
}
