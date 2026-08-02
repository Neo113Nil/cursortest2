package com.google.android.gms.internal.ads;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Build;
import defpackage.bmn;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbcp {
    public static final String[] e = {"android:establish_vpn_service", "android:establish_vpn_manager"};
    public long a;
    public long b;
    public long c;
    public boolean d;

    public static zzbcp a(Context context, Executor executor) {
        String[] strArr = e;
        zzbcp zzbcpVar = new zzbcp();
        zzbcpVar.a = 0L;
        zzbcpVar.b = 0L;
        zzbcpVar.c = -1L;
        zzbcpVar.d = false;
        if (Build.VERSION.SDK_INT >= 30) {
            try {
                ((AppOpsManager) context.getSystemService("appops")).startWatchingActive(strArr, executor, new bmn(zzbcpVar, 0));
            } catch (IllegalArgumentException | NoSuchMethodError unused) {
            }
        }
        return zzbcpVar;
    }
}
