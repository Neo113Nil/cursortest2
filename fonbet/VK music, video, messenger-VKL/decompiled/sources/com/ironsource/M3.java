package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* loaded from: classes13.dex */
public class M3 {
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
        if (b()) {
            return "valid:" + this.a;
        }
        return "valid:" + this.a + ", IronSourceError:" + this.b;
    }

    public IronSourceError a() {
        return this.b;
    }
}
