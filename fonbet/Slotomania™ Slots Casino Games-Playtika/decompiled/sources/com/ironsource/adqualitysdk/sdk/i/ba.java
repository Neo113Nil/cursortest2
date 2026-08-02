package com.ironsource.adqualitysdk.sdk.i;

import android.os.Handler;
import android.os.Looper;
import com.ironsource.adqualitysdk.sdk.i.az;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class ba {

    /* renamed from: ﾒ, reason: contains not printable characters */
    private Map<String, az> f658 = new HashMap();

    public interface d extends t {
    }

    public ba() {
        new Handler(Looper.getMainLooper());
    }

    /* renamed from: com.ironsource.adqualitysdk.sdk.i.ba$3, reason: invalid class name */
    final class AnonymousClass3 extends je {

        /* renamed from: ｋ, reason: contains not printable characters */
        private /* synthetic */ az.b f660;

        /* renamed from: ﾒ, reason: contains not printable characters */
        private /* synthetic */ String f662;

        AnonymousClass3(String str, az.b bVar) {
            this.f662 = str;
            this.f660 = bVar;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.je
        /* renamed from: ｋ */
        public final void mo5828() {
            az m6267 = ba.m6267(ba.this, this.f662);
            if (m6267 != null) {
                m6267.m6258(this.f660);
            }
        }
    }

    /* renamed from: com.ironsource.adqualitysdk.sdk.i.ba$5, reason: invalid class name */
    final class AnonymousClass5 extends je {

        /* renamed from: ﻐ, reason: contains not printable characters */
        private /* synthetic */ String f667;

        /* renamed from: ﻛ, reason: contains not printable characters */
        private /* synthetic */ az.a f668;

        AnonymousClass5(String str, az.a aVar) {
            this.f667 = str;
            this.f668 = aVar;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.je
        /* renamed from: ｋ */
        public final void mo5828() {
            az m6267 = ba.m6267(ba.this, this.f667);
            if (m6267 != null) {
                m6267.m6261(this.f668);
            }
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private boolean m6268(List<String> list) {
        for (String str : list) {
            Map<String, az> map = this.f658;
            az azVar = map != null ? map.get(str) : null;
            if (azVar == null || azVar.m6259() != az.a.f639) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    final void m6272(String str) {
        this.f658.put(str, new az(str));
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final synchronized boolean m6273(boolean z) {
        ArrayList arrayList = new ArrayList();
        if (z) {
            Iterator<String> it = ay.m6248().iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().toLowerCase());
            }
        } else {
            arrayList.add(ay.m6240().toLowerCase());
        }
        if (m6268(arrayList)) {
            if (m6269(arrayList)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private boolean m6269(List<String> list) {
        Map<String, az> map = this.f658;
        if (map != null && !map.isEmpty()) {
            for (String str : map.keySet()) {
                if (!list.contains(str)) {
                    Map<String, az> map2 = this.f658;
                    az azVar = map2 != null ? map2.get(str) : null;
                    if (azVar != null && azVar.m6259() == az.a.f639) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    final String m6271(String str) {
        Map<String, az> map = this.f658;
        az azVar = map != null ? map.get(str) : null;
        if (azVar != null) {
            return azVar.m6257();
        }
        return null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ az m6267(ba baVar, String str) {
        Map<String, az> map = baVar.f658;
        if (map != null) {
            return map.get(str);
        }
        return null;
    }
}
