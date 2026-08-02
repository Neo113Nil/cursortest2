package com.fyber.inneractive.sdk.response;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.r0;
import com.fyber.inneractive.sdk.util.IAlog;
import defpackage.ogj;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class b {
    public e a;
    public String b;
    public j c;
    public boolean d = true;

    public abstract e a();

    public final e a(String str) {
        this.d = str != null;
        e eVar = this.a;
        eVar.getClass();
        eVar.c = System.currentTimeMillis();
        this.c.a(this);
        String a = this.c.a();
        this.a.h = a;
        r0 a2 = com.fyber.inneractive.sdk.config.a.a(this.b);
        IAlog.a("%sGot unit config for unitId: %s from config manager", IAlog.a(this), this.b);
        IAlog.a("%s%s", IAlog.a(this), a2);
        if (this.d) {
            a(str, a2);
        } else if (this instanceof l) {
            a(a, a2);
        } else {
            h hVar = new h(a);
            if (hVar.a) {
                String str2 = hVar.b;
                if (str2 == null || TextUtils.isEmpty(str2.trim())) {
                    ogj.k("empty ad content detected. failing fast.");
                    return null;
                }
                a(str2, a2);
            }
        }
        return this.a;
    }

    public abstract void a(String str, r0 r0Var);

    public boolean b() {
        return this instanceof c;
    }
}
