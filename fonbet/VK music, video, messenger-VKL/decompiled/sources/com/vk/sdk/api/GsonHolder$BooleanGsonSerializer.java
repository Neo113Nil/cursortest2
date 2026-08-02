package com.vk.sdk.api;

import xsna.a9y;
import xsna.b9y;
import xsna.epx;
import xsna.hay;
import xsna.tay;
import xsna.uay;
import xsna.z8y;

/* compiled from: GsonHolder.kt */
/* loaded from: classes5.dex */
public final class GsonHolder$BooleanGsonSerializer implements a9y<Boolean>, uay<Boolean> {
    @Override // xsna.a9y
    public final Object a(b9y b9yVar, z8y z8yVar) {
        if (!(b9yVar instanceof hay)) {
            return null;
        }
        String k = ((hay) b9yVar).k();
        return Boolean.valueOf(epx.f(k, "1") || epx.f(k, "true"));
    }

    @Override // xsna.uay
    public final b9y b(Object obj, tay tayVar) {
        return new hay(Integer.valueOf(((Boolean) obj).equals(Boolean.TRUE) ? 1 : 0));
    }
}
