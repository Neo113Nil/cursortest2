package com.vungle.ads.internal.task;

import android.os.Bundle;
import com.vungle.ads.internal.util.t;
import com.vungle.ads.internal.util.u;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class f implements Cloneable {
    public final String a;
    public boolean b;
    public long c;
    public Bundle d;
    public int e;

    public f(String str) {
        str.getClass();
        this.a = str;
        this.d = new Bundle();
        this.e = 2;
    }

    public final f a() {
        try {
            Object clone = super.clone();
            clone.getClass();
            return (f) clone;
        } catch (CloneNotSupportedException e) {
            boolean z = u.a;
            t.a("JobInfo", "Cannot copy JobInfo " + this, e);
            return null;
        }
    }

    public final long b() {
        return this.c;
    }

    public final Bundle c() {
        return this.d;
    }

    public final Object clone() {
        return super.clone();
    }

    public final String d() {
        return this.a;
    }

    public final int e() {
        return this.e;
    }

    public final boolean f() {
        return this.b;
    }

    public final void g() {
        this.c = 0L;
    }

    public final f a(Bundle bundle) {
        bundle.getClass();
        this.d = bundle;
        return this;
    }
}
