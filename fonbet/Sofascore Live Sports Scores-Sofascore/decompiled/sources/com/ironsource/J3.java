package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class J3 {
    private boolean a = true;
    private IronSourceError b = null;

    public void a(IronSourceError ironSourceError) {
        this.a = false;
        this.b = ironSourceError;
    }

    public boolean b() {
        return this.a;
    }

    public void c() {
        this.a = true;
        this.b = null;
    }

    public String toString() {
        boolean b = b();
        boolean z = this.a;
        if (b) {
            return com.appsflyer.internal.i.j("valid:", z);
        }
        return "valid:" + z + ", IronSourceError:" + this.b;
    }

    public IronSourceError a() {
        return this.b;
    }
}
