package com.vk.common.api.generated;

import com.google.gson.Gson;
import xsna.a9y;
import xsna.b9y;
import xsna.bpn0;
import xsna.epx;
import xsna.hay;
import xsna.nd1;
import xsna.tay;
import xsna.uay;
import xsna.uv0;
import xsna.z8y;

/* compiled from: GsonHolder.kt */
/* loaded from: classes17.dex */
public final class GsonHolder {
    public static final bpn0 a = new bpn0(new nd1(16));

    /* compiled from: GsonHolder.kt */
    public static final class BooleanGsonSerializer implements a9y<Boolean>, uay<Boolean> {
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

    static {
        new bpn0(new uv0(16));
    }

    public static Gson a() {
        return (Gson) a.getValue();
    }
}
