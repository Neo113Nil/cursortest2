package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.PriorityQueue;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ﻋ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C1115 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0926 f3503;

    public C1115(C0926 c0926) {
        this.f3503 = c0926;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m660(ArrayList arrayList) {
        JSONObject jSONObject;
        C0909 c0909;
        try {
            if (arrayList.isEmpty()) {
                C0926.m541(this.f3503);
                return;
            }
            PriorityQueue priorityQueue = new PriorityQueue();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                priorityQueue.add(new C0911((C0290) it.next()));
            }
            ArrayList arrayList2 = new ArrayList();
            for (C0911 c0911 = (C0911) priorityQueue.poll(); c0911 != null; c0911 = (C0911) priorityQueue.poll()) {
                C0926 c0926 = this.f3503;
                c0926.getClass();
                AbstractC0274 m142 = AbstractC0274.m142();
                synchronized (c0911) {
                    jSONObject = c0911.f3047.f531;
                }
                String optString = jSONObject.optString(StringFog.decrypt("Lr9qag==\n", "XtMNBF4Apyc=\n"));
                String str = c0926.f3091;
                C0346 c0346 = (C0346) m142;
                if (optString != null) {
                    c0909 = (C0909) c0346.mo152().get(optString);
                } else {
                    c0346.getClass();
                    c0909 = null;
                }
                if (c0909 != null && c0909.m532(str)) {
                    C0233 c0233 = this.f3503.f3103;
                    C0290 c0290 = c0911.f3047;
                    c0233.getClass();
                    C0358.m206().post(new C0235(c0233, c0290));
                }
                if (TextUtils.isEmpty(c0911.m533())) {
                    c0911.m538(this.f3503.f3102.f1176.m560());
                }
                arrayList2.add(c0911);
            }
            if (arrayList2.isEmpty()) {
                return;
            }
            C0926.m543(this.f3503, arrayList2, new C1116(this));
        } catch (Exception unused) {
            C0926.m541(this.f3503);
        }
    }
}
