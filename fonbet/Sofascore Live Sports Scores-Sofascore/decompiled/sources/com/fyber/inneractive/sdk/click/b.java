package com.fyber.inneractive.sdk.click;

import defpackage.dmi;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class b {
    public final q a;
    public final Throwable b;
    public final String c;
    public final String d;
    public long e;
    public final ArrayList f = new ArrayList();

    public b(String str, q qVar, String str2, Exception exc) {
        this.d = str;
        this.a = qVar;
        this.c = str2;
        this.b = exc;
    }

    public final String toString() {
        q qVar = this.a;
        if (qVar == q.FAILED) {
            Throwable th = this.b;
            return dmi.q("Open result: Failed! error: ", th != null ? th.getMessage() : "none");
        }
        return "Open result: Success! target: " + qVar + " method: " + this.c;
    }
}
