package com.unity3d.services.core.fid;

import android.content.Context;
import com.unity3d.services.core.reflection.GenericBridge;
import kotlin.Pair;
import xsna.on00;

/* compiled from: FIdStaticBridge.kt */
/* loaded from: classes14.dex */
public final class FIdStaticBridge extends GenericBridge {
    public FIdStaticBridge() {
        super(on00.f(new Pair(Constants.GET_INSTANCE, new Class[]{Context.class})), false);
    }

    @Override // com.unity3d.services.core.reflection.GenericBridge
    public String getClassName() {
        return Constants.Companion.getClassName();
    }

    public final FIdBridge getInstance(Context context) {
        Object callNonVoidMethod = callNonVoidMethod(Constants.GET_INSTANCE, null, context);
        if (callNonVoidMethod != null) {
            return new FIdBridge(callNonVoidMethod);
        }
        return null;
    }
}
