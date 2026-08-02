package com.ironsource.adqualitysdk.sdk.i;

import android.view.View;
import com.ironsource.adqualitysdk.sdk.i.jo.AnonymousClass1;
import com.ironsource.adqualitysdk.sdk.i.jo.AnonymousClass2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public final class jp {

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static jp f2867;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private List<View> f2868 = new ArrayList();

    /* renamed from: ｋ, reason: contains not printable characters */
    private List<jv> f2869 = new ArrayList();

    /* renamed from: ﾒ, reason: contains not printable characters */
    private List<View> f2871 = new ArrayList();

    /* renamed from: ﾇ, reason: contains not printable characters */
    private iw f2870 = new iw() { // from class: com.ironsource.adqualitysdk.sdk.i.jp.4
        @Override // com.ironsource.adqualitysdk.sdk.i.iw
        /* renamed from: ｋ */
        public final void mo7412() {
            List<View> m8405 = ki.m8405();
            jp.this.f2871.clear();
            jp.this.f2871.addAll(jp.this.f2868);
            for (int i = 0; i < m8405.size(); i++) {
                View view = m8405.get(i);
                jp.this.f2871.remove(view);
                if (!jp.this.f2868.contains(view)) {
                    jp.this.f2868.add(view);
                    jp.this.m8263(view);
                }
            }
            for (int i2 = 0; i2 < jp.this.f2871.size(); i2++) {
                View view2 = (View) jp.this.f2871.get(i2);
                jp.this.f2868.remove(view2);
                jp.this.m8260(view2);
            }
            jp.this.f2871.clear();
        }
    };

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static synchronized jp m8258() {
        jp jpVar;
        synchronized (jp.class) {
            if (f2867 == null) {
                f2867 = new jp();
            }
            jpVar = f2867;
        }
        return jpVar;
    }

    private jp() {
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final void m8266(final jv jvVar) {
        synchronized (this) {
            this.f2869.add(jvVar);
        }
        p.m8557(jo.m8248().new AnonymousClass1(this.f2870));
        p.m8554(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.jp.2
            @Override // com.ironsource.adqualitysdk.sdk.i.je
            /* renamed from: ｋ */
            public final void mo5828() {
                Iterator it = jp.this.f2868.iterator();
                while (it.hasNext()) {
                    jvVar.mo5787((View) it.next());
                }
            }
        });
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final void m8265(jv jvVar) {
        synchronized (this) {
            this.f2869.remove(jvVar);
            if (this.f2869.size() == 0) {
                p.m8557(jo.m8248().new AnonymousClass2(this.f2870));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ﾇ, reason: contains not printable characters */
    public synchronized void m8263(View view) {
        Iterator<jv> it = this.f2869.iterator();
        while (it.hasNext()) {
            it.next().mo5787(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ｋ, reason: contains not printable characters */
    public synchronized void m8260(View view) {
        Iterator<jv> it = this.f2869.iterator();
        while (it.hasNext()) {
            it.next().mo5784(view);
        }
    }
}
