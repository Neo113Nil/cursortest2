package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.א, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0441 extends AbstractC0430 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: ﻏ, reason: contains not printable characters */
    public WeakReference f1251;

    /* renamed from: ﻐ, reason: contains not printable characters */
    public WeakReference f1252;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final WeakHashMap f1253 = new WeakHashMap();

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        try {
            synchronized (AbstractC0430.class) {
                try {
                    if (this.f1252 == null) {
                        this.f1252 = new WeakReference(activity);
                        AbstractC1008.m614(new C0457(activity));
                        AbstractC0430.class.notifyAll();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            Iterator it = m264().iterator();
            while (it.hasNext()) {
                ((InterfaceC0827) it.next()).onActivityCreated(activity, bundle);
            }
        } catch (Exception e) {
            AbstractC0356.m204(StringFog.decrypt("EH8E+Ld+ddAxdgjjtX5c9T5gH/+4d0vqMmEd87V3\n", "VxNrmtYSObk=\n"), StringFog.decrypt("ISvE6QzX+F9ENtjHHYP4Rw0tz8UMkvBFAT0=\n", "ZFm2hn73kTE=\n"), (Throwable) e, false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        ArrayList arrayList;
        try {
            synchronized (this) {
                arrayList = new ArrayList(this.f1224);
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((InterfaceC0827) it.next()).onActivityDestroyed(activity);
            }
        } catch (Exception e) {
            AbstractC0356.m204(StringFog.decrypt("71ECF8NocFTOWA4MwWhZccFOGRDMYU5uzU8bHMFh\n", "qD1tdaIEPD0=\n"), StringFog.decrypt("ubqb7QfhI/Xcp4fDFrUj7ZW8kMYQsj7pk7GM5g==\n", "/MjpgnXBSps=\n"), (Throwable) e, false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        ArrayList arrayList;
        try {
            synchronized (this) {
                arrayList = new ArrayList(this.f1224);
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((InterfaceC0827) it.next()).onActivityPaused(activity);
            }
        } catch (Exception e) {
            AbstractC0356.m204(StringFog.decrypt("iq4ahxfgABarpxacFeApM6SxAYAY6T4sqLADjBXp\n", "zcJ15XaMTH8=\n"), StringFog.decrypt("tjAYkWGj/1nTLQS/cPf/QZo2E65y9uVSlw==\n", "80Jq/hODljc=\n"), (Throwable) e, false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        ArrayList arrayList;
        try {
            this.f1252 = new WeakReference(activity);
            AbstractC1008.m614(new C0457(activity));
            synchronized (this) {
                arrayList = new ArrayList(this.f1224);
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((InterfaceC0827) it.next()).onActivityResumed(activity);
            }
        } catch (Exception e) {
            AbstractC0356.m204(StringFog.decrypt("Xh11GdSa3vt/FHkC1pr33nACbh7bk+DBfANsEtaT\n", "GXEae7X2kpI=\n"), StringFog.decrypt("wXgPNdHatYSkZRMbwI61nO1+BAjGiamH4W4=\n", "hAp9WqP63Oo=\n"), (Throwable) e, false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        ArrayList arrayList;
        try {
            synchronized (this) {
                arrayList = new ArrayList(this.f1224);
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((InterfaceC0827) it.next()).onActivitySaveInstanceState(activity, bundle);
            }
        } catch (Exception e) {
            AbstractC0356.m204(StringFog.decrypt("lcuT07FBqUC0wp/Is0GAZbvUiNS+SJd6t9WK2LNI\n", "0qf8sdAt5Sk=\n"), StringFog.decrypt("ItujGM64WFdHxr823+xYTw7dqCTd7lRwCdqlFtL7VGoTyKUS\n", "Z6nRd7yYMTk=\n"), (Throwable) e, false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        try {
            if (this.f1252 == null) {
                this.f1252 = new WeakReference(activity);
                AbstractC1008.m614(new C0457(activity));
            }
            synchronized (this) {
                this.f1253.put(activity, Boolean.TRUE);
            }
            Iterator it = m264().iterator();
            while (it.hasNext()) {
                ((InterfaceC0827) it.next()).onActivityStarted(activity);
            }
            if (activity.getLocalClassName().equals(StringFog.decrypt("8Dk74iEdiFTqZTLiJB+AWfYkeJk6GpVZwzo3tTEBsVL8Li+NNweIVvoiLw==\n", "k1ZWzFRz4SA=\n"))) {
                return;
            }
            synchronized (this) {
                try {
                    if (this.f1253.size() == 1 && !this.f1225) {
                        m273(activity);
                    }
                } finally {
                }
            }
        } catch (Exception e) {
            AbstractC0356.m204(StringFog.decrypt("Jhce1IWkhXIHHhLPh6SsVwgIBdOKrbtIBAkH34et\n", "YXtxtuTIyRs=\n"), StringFog.decrypt("JOEbALB7rNBB/AcuoS+syAjnEDy2OrfKBPc=\n", "YZNpb8Jbxb4=\n"), (Throwable) e, false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        int i;
        try {
            Iterator it = m264().iterator();
            while (it.hasNext()) {
                ((InterfaceC0827) it.next()).onActivityStopped(activity);
            }
            this.f1225 = activity.isChangingConfigurations();
            synchronized (this) {
                try {
                    if (!this.f1253.containsKey(activity) || activity.getLocalClassName().equals(StringFog.decrypt("hc36Yef8gOifkfNh4v6I5YPQuRr8+53lts72Nvfgue6J2u4O8eaA6o/W7g==\n", "5qKXT5KS6Zw=\n"))) {
                        i = -1;
                    } else {
                        this.f1253.remove(activity);
                        i = this.f1253.size();
                    }
                } finally {
                }
            }
            if (i <= -1 || i != 0 || this.f1225) {
                return;
            }
            m274(activity);
        } catch (Exception e) {
            AbstractC0356.m204(StringFog.decrypt("4a9r3hX6lRzApmfFF/q8Oc+wcNka86smw7Fy1Rfz\n", "psMEvHSW2XU=\n"), StringFog.decrypt("3SLEHgE2Znm4P9gwEGJmYfEkzyIHeX9n/TQ=\n", "mFC2cXMWDxc=\n"), (Throwable) e, false);
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0430
    /* renamed from: ﻛ */
    public final synchronized boolean mo263() {
        return this.f1253.size() > 0;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final void m273(Activity activity) {
        ArrayList arrayList;
        synchronized (this) {
            arrayList = new ArrayList(this.f1224);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((InterfaceC0827) it.next()).mo158(activity);
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0430
    /* renamed from: ﾒ */
    public final synchronized void mo266(Application application, Activity activity) {
        try {
            if (this.f1251 == null) {
                this.f1251 = new WeakReference(application);
                if (activity != null) {
                    this.f1252 = new WeakReference(activity);
                    AbstractC1008.m614(new C0457(activity));
                    synchronized (this) {
                        this.f1253.put(activity, Boolean.TRUE);
                    }
                }
                application.registerActivityLifecycleCallbacks(this);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0430
    /* renamed from: ﾒ */
    public final Activity mo265() {
        WeakReference weakReference = this.f1252;
        if (weakReference != null) {
            return (Activity) weakReference.get();
        }
        return null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m274(Activity activity) {
        ArrayList arrayList;
        synchronized (this) {
            arrayList = new ArrayList(this.f1224);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((InterfaceC0827) it.next()).mo159(activity);
        }
    }
}
