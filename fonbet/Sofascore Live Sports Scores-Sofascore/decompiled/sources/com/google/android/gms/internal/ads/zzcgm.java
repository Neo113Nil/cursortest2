package com.google.android.gms.internal.ads;

import defpackage.ddb;
import defpackage.ihe;
import defpackage.vlo;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzcgm {
    public static void a(ddb ddbVar, String str, Executor executor) {
        ddbVar.addListener(new vlo(0, ddbVar, new ihe(str, 1)), executor);
    }
}
