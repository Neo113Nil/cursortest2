package io.appmetrica.analytics.impl;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class S1 implements ActivityLifecycleListener {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f12839a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public volatile C0624y7 f12840b = null;

    public final void a(@NonNull C0624y7 c0624y7) {
        ArrayList a7;
        synchronized (this) {
            this.f12840b = c0624y7;
            a7 = a();
        }
        Iterator it = a7.iterator();
        while (it.hasNext()) {
            ((InterfaceC0024ae) it.next()).consume(c0624y7);
        }
    }

    public final void b() {
        C0040b4.l().f13376e.registerListener(this, ActivityEvent.CREATED);
    }

    public final void c() {
        C0040b4.l().f13376e.unregisterListener(this, ActivityEvent.CREATED);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener
    public final void onEvent(@NonNull Activity activity, @NonNull ActivityEvent activityEvent) {
        Intent intent = (Intent) SystemServiceUtils.accessSystemServiceSafely(activity, "getting intent", "activity", new Q1());
        String dataString = intent == null ? null : intent.getDataString();
        if (TextUtils.isEmpty(dataString)) {
            return;
        }
        R1 r12 = new R1(dataString);
        synchronized (this) {
            try {
                C0624y7 c0624y7 = this.f12840b;
                if (c0624y7 == null) {
                    this.f12839a.add(r12);
                } else {
                    ((C0651z9) C0040b4.l().f13374c.a()).f14990b.post(new P1(r12, c0624y7));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final synchronized ArrayList a() {
        ArrayList arrayList;
        arrayList = new ArrayList(this.f12839a);
        this.f12839a.clear();
        return arrayList;
    }
}
