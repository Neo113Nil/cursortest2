package com.bumptech.glide.integration.okhttp3;

import defpackage.l2a;
import defpackage.ovf;
import defpackage.ptc;
import defpackage.qz8;
import defpackage.wj9;
import defpackage.yia;
import defpackage.yod;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Deprecated
/* loaded from: classes2.dex */
public class OkHttpGlideModule {
    public final void a(ovf ovfVar) {
        ArrayList H;
        yod yodVar = new yod(0);
        wj9 wj9Var = ovfVar.a;
        synchronized (wj9Var) {
            l2a l2aVar = (l2a) wj9Var.b;
            synchronized (l2aVar) {
                H = l2aVar.H();
                l2aVar.a(qz8.class, InputStream.class, yodVar);
            }
            Iterator it = H.iterator();
            while (it.hasNext()) {
                ((ptc) it.next()).getClass();
            }
            ((HashMap) ((yia) wj9Var.c).b).clear();
        }
    }
}
