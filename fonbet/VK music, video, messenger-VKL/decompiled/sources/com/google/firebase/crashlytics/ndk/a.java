package com.google.firebase.crashlytics.ndk;

import android.content.Context;
import xsna.b9i;
import xsna.fng;
import xsna.h6k;
import xsna.lcg0;
import xsna.oir;
import xsna.sar;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes13.dex */
public final /* synthetic */ class a implements b9i {
    @Override // xsna.b9i
    public final Object c(lcg0 lcg0Var) {
        Context context = (Context) lcg0Var.a(Context.class);
        return new oir(new h6k(context, new JniNativeApi(context), new sar(context)), !(fng.e(context, "com.google.firebase.crashlytics.unity_version", "string") != 0));
    }
}
