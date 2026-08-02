package com.applovin.impl;

import android.content.Context;
import com.applovin.impl.f6;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public abstract class k5 implements Runnable {
    protected final com.applovin.impl.sdk.l a;
    protected final String b;
    protected final com.applovin.impl.sdk.p c;
    private final Context d;
    private String e;
    private boolean f;

    public k5(String str, com.applovin.impl.sdk.l lVar) {
        this(str, lVar, false, null);
    }

    public Context a() {
        return this.d;
    }

    public com.applovin.impl.sdk.l b() {
        return this.a;
    }

    public String c() {
        return this.b;
    }

    public boolean d() {
        return this.f;
    }

    public k5(String str, com.applovin.impl.sdk.l lVar, boolean z) {
        this(str, lVar, z, null);
    }

    public void a(String str) {
        this.e = str;
    }

    public ScheduledFuture b(final Thread thread, final long j) {
        if (j <= 0) {
            return null;
        }
        return this.a.s0().b(new u6(this.a, "timeout:" + this.b, new Runnable() { // from class: com.applovin.impl.k5$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                k5.this.a(thread, j);
            }
        }), f6.b.TIMEOUT, j);
    }

    public k5(String str, com.applovin.impl.sdk.l lVar, String str2) {
        this(str, lVar, false, str2);
    }

    public void a(boolean z) {
        this.f = z;
    }

    public k5(String str, com.applovin.impl.sdk.l lVar, boolean z, String str2) {
        this.b = str;
        this.a = lVar;
        this.c = lVar.Q();
        this.d = com.applovin.impl.sdk.l.p();
        this.f = z;
        this.e = str2;
    }

    public void a(Throwable th) {
        Map map = CollectionUtils.map("source", this.b);
        map.put("top_main_method", th.toString());
        map.put("details", StringUtils.emptyIfNull(this.e));
        this.a.E().d(f2.g1, map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Thread thread, long j) {
        HashMap<String, String> hashMap = CollectionUtils.hashMap("name", thread.getState().name());
        if (StringUtils.isValidString(this.e)) {
            hashMap.put("details", this.e);
        }
        this.a.E().a(f2.h1, this.b, hashMap);
        if (com.applovin.impl.sdk.p.a()) {
            this.c.k(this.b, "Task has been executing for over " + TimeUnit.MILLISECONDS.toSeconds(j) + " seconds");
        }
    }
}
