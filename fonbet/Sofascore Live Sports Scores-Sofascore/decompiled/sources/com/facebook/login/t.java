package com.facebook.login;

import com.ironsource.C4227o2;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class t {
    public final w a() {
        if (w.d == null) {
            synchronized (this) {
                w.d = new w();
                Unit unit = Unit.a;
            }
        }
        w wVar = w.d;
        if (wVar != null) {
            return wVar;
        }
        Intrinsics.i(C4227o2.p);
        throw null;
    }
}
