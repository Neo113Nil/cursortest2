package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᵏ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0845 {

    /* renamed from: ﺙ, reason: contains not printable characters */
    public F f2786;

    /* renamed from: ﻏ, reason: contains not printable characters */
    public final ArrayList f2787 = new ArrayList();

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final Context f2788;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final AbstractC0433 f2789;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final C0306 f2790;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final C0298 f2791;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final C0918 f2792;

    public C0845(Context context, C0918 c0918, C0298 c0298, C0306 c0306, AbstractC0433 abstractC0433) {
        this.f2792 = c0918;
        this.f2791 = c0298;
        this.f2790 = c0306;
        this.f2789 = abstractC0433;
        this.f2788 = context.getApplicationContext();
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final void m511() {
        Iterator it = this.f2787.iterator();
        while (it.hasNext()) {
            C1102 c1102 = (C1102) it.next();
            C0987 c0987 = c1102.f3457;
            c0987.getClass();
            AbstractC1008.m610(new C1010(c0987));
            C0987 c09872 = c1102.f3457;
            c09872.getClass();
            AbstractC1008.m610(new C0988(c09872));
            C0987 c09873 = c1102.f3457;
            c09873.getClass();
            AbstractC1008.m610(new C0998(c09873));
            if (c1102.f3461 != null) {
                AbstractC0430 m262 = AbstractC0430.m262();
                C0474 c0474 = c1102.f3461;
                synchronized (m262) {
                    m262.f1224.remove(c0474);
                }
                c1102.f3461 = null;
            }
            C0785 c0785 = c1102.f3460;
            if (c0785 != null) {
                c0785.m449();
                c1102.f3460 = null;
            }
            c1102.f3462 = null;
        }
        AbstractC1008.m610(new C0966(this));
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final synchronized boolean m512() {
        return this.f2789.mo216();
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final String m513() {
        HashMap hashMap;
        String m268 = this.f2789.m268();
        String str = null;
        if (TextUtils.isEmpty(m268) || StringFog.decrypt("274DCGbw1g==\n", "nvBCSiq1kh4=\n").equals(m268) || StringFog.decrypt("GKEuEUdAVgM=\n", "XOh9UAUME0c=\n").equals(m268)) {
            return null;
        }
        C0918 c0918 = this.f2792;
        String m2682 = this.f2789.m268();
        if (c0918.f3071 == null) {
            JSONObject optJSONObject = c0918.f3078.optJSONObject(C0918.f3067);
            if (optJSONObject != null) {
                hashMap = new HashMap();
                Iterator<String> keys = optJSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    hashMap.put(next, optJSONObject.optString(next, null));
                }
            } else {
                hashMap = null;
            }
            if (hashMap != null) {
                ArrayList arrayList = new ArrayList(hashMap.keySet());
                Collections.sort(arrayList, new C0919());
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    String str2 = (String) it.next();
                    if (AbstractC1067.m635(m2682, str2) >= 0) {
                        str = (String) hashMap.get(str2);
                    }
                }
                c0918.f3071 = str;
            }
        }
        return c0918.f3071;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final synchronized ArrayList m514() {
        if (this.f2787 != null) {
            return new ArrayList(this.f2787);
        }
        return new ArrayList();
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final synchronized void m516() {
        if (this.f2789.mo216()) {
            Iterator it = m514().iterator();
            while (it.hasNext()) {
                C1102 c1102 = (C1102) it.next();
                this.f2792.m540().f3166.m566(c1102.f3466.f299.f3759, c1102);
            }
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final C0203 m515(C1183 c1183) {
        if (c1183 != null) {
            return new C0203(c1183, m515((C1183) this.f2792.m539().get(c1183.f3757)));
        }
        return null;
    }
}
