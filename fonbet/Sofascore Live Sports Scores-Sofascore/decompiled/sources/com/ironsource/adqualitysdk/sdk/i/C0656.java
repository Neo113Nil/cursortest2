package com.ironsource.adqualitysdk.sdk.i;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᒥ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0656 {

    /* renamed from: ﱡ, reason: contains not printable characters */
    public static C0656 f2249;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final Context f2255;

    /* renamed from: ﻏ, reason: contains not printable characters */
    public static final String f2251 = StringFog.decrypt("/opmoYxNuA3TgWahk3uHA9yEYqWS\n", "suUFwOAPymI=\n");

    /* renamed from: ﺙ, reason: contains not printable characters */
    public static final Object f2250 = new Object();

    /* renamed from: ﾒ, reason: contains not printable characters */
    public boolean f2256 = true;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final HashMap f2254 = new HashMap();

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final HashMap f2253 = new HashMap();

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final ArrayList f2252 = new ArrayList();

    public C0656(Context context) {
        this.f2255 = context;
        new HandlerC0661(this, context.getMainLooper());
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final void m397() {
        synchronized (this.f2254) {
            try {
                Iterator it = new HashMap(this.f2254).keySet().iterator();
                while (it.hasNext()) {
                    m400((BroadcastReceiver) it.next());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final synchronized void m398() {
        this.f2256 = false;
        m397();
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m400(BroadcastReceiver broadcastReceiver) {
        synchronized (this.f2254) {
            try {
                ArrayList arrayList = (ArrayList) this.f2254.remove(broadcastReceiver);
                if (arrayList == null) {
                    return;
                }
                for (int i = 0; i < arrayList.size(); i++) {
                    IntentFilter intentFilter = (IntentFilter) arrayList.get(i);
                    for (int i2 = 0; i2 < intentFilter.countActions(); i2++) {
                        String action = intentFilter.getAction(i2);
                        ArrayList arrayList2 = (ArrayList) this.f2253.get(action);
                        if (arrayList2 != null) {
                            if (arrayList2.size() > 0) {
                                if (arrayList2.get(0) != null) {
                                    throw new ClassCastException();
                                }
                                throw null;
                            }
                            if (arrayList2.size() <= 0) {
                                this.f2253.remove(action);
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final synchronized void m399() {
        this.f2256 = true;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static C0656 m396(Context context) {
        C0656 c0656;
        synchronized (f2250) {
            try {
                c0656 = f2249;
                if (c0656 == null) {
                    c0656 = new C0656(context.getApplicationContext());
                    f2249 = c0656;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0656;
    }
}
