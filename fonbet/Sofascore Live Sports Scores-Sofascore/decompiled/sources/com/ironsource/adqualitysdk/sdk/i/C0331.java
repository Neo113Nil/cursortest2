package com.ironsource.adqualitysdk.sdk.i;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ˠ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0331 extends BroadcastReceiver {

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static final String f811 = StringFog.decrypt("9o+kVWNIfiDMi6RHXl92FtGctVA=\n", "uOrQIgw6FXM=\n");

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final Context f814;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public boolean f813 = false;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final HashSet f812 = new HashSet();

    public C0331(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f814 = applicationContext;
        AbstractC0420.m244(f811, StringFog.decrypt("jhGVtOfO8hKoBMGi/M/0Vr4VkrSu0vBRuB2XpfyO\n", "3XThwI6glTI=\n"));
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(StringFog.decrypt("FHuuMjnUknUbcL5uNdKYNVtWhQ4Y+LUPPEODFA/itRM0W40F\n", "dRXKQFa99ls=\n"));
        applicationContext.registerReceiver(this, intentFilter);
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static boolean m187(C0331 c0331, Context context) {
        c0331.getClass();
        NetworkInfo activeNetworkInfo = context != null ? ((ConnectivityManager) context.getSystemService(StringFog.decrypt("XGz+ceKnixlJauRm\n", "PwOQH4fE/3A=\n"))).getActiveNetworkInfo() : null;
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            return false;
        }
        AbstractC0420.m250(f811, StringFog.decrypt("TOdX3ADkQHs=\n", "AoIjq2+WK1s=\n") + activeNetworkInfo.getTypeName() + StringFog.decrypt("P4U4BLa4U7N6gnk=\n", "H+ZXatjdMMc=\n"));
        return true;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        AbstractC1008.m614(new C0338(this, intent, context));
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final void m188() {
        HashSet hashSet;
        synchronized (this) {
            hashSet = new HashSet(this.f812);
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((InterfaceC0795) it.next()).getClass();
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static void m186(C0331 c0331, boolean z) {
        synchronized (c0331) {
            c0331.f813 = z;
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final synchronized boolean m189() {
        return this.f813;
    }
}
