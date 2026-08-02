package com.mbridge.msdk.config.component.status;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.ironsource.U3;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class d {
    private SharedPreferences a;
    private final List<String> b = new ArrayList();
    private final List<com.mbridge.msdk.config.component.status.a> c = new CopyOnWriteArrayList();
    SharedPreferences.OnSharedPreferenceChangeListener d = new a();

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class a implements SharedPreferences.OnSharedPreferenceChangeListener {
        public a() {
        }

        @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
        public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
            if (d.this.a == null || !d.this.a.contains(str)) {
                return;
            }
            com.mbridge.msdk.config.component.base.b bVar = new com.mbridge.msdk.config.component.base.b();
            bVar.b("916006");
            HashMap hashMap = new HashMap();
            try {
                Object obj = d.this.a.getAll().get(str);
                hashMap.put(com.mbridge.msdk.config.component.common.util.c.c(U3.i.W), str);
                hashMap.put(com.mbridge.msdk.config.component.common.util.c.c(U3.i.X), obj);
            } catch (Exception unused) {
                hashMap.put(com.mbridge.msdk.config.component.common.util.c.c(U3.i.W), str);
                hashMap.put(com.mbridge.msdk.config.component.common.util.c.c(U3.i.X), d.this.a.getString(str, ""));
            }
            if (d.this.b.isEmpty()) {
                bVar.a(hashMap);
                d.this.a(bVar);
            } else if (d.this.b.contains(str)) {
                bVar.a(hashMap);
                d.this.a(bVar);
            }
        }
    }

    public d(String str) {
        Context d = com.mbridge.msdk.foundation.controller.c.n().d();
        if (d == null) {
            return;
        }
        Context applicationContext = d.getApplicationContext();
        if (TextUtils.isEmpty(str)) {
            str = applicationContext.getPackageName() + "_preferences";
        }
        SharedPreferences sharedPreferences = applicationContext.getSharedPreferences(str, 0);
        this.a = sharedPreferences;
        if (sharedPreferences != null) {
            sharedPreferences.registerOnSharedPreferenceChangeListener(this.d);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.mbridge.msdk.config.component.base.b bVar) {
        try {
            Iterator<com.mbridge.msdk.config.component.status.a> it = this.c.iterator();
            while (it.hasNext()) {
                it.next().a(bVar);
            }
        } catch (Throwable th) {
            q0.b("PreferencePublisher", th.getMessage());
        }
    }

    public void b(com.mbridge.msdk.config.component.status.a aVar) {
        if (aVar != null) {
            this.c.remove(aVar);
        }
    }

    public void a(com.mbridge.msdk.config.component.status.a aVar) {
        if (aVar != null) {
            this.c.add(aVar);
        }
    }

    public void a(List<String> list) {
        if (list != null) {
            this.b.addAll(list);
        }
    }
}
