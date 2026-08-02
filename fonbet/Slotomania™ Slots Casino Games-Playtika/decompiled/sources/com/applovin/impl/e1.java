package com.applovin.impl;

import android.app.Activity;
import android.content.Context;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes4.dex */
public class e1 extends u2 {
    private com.applovin.impl.sdk.l e;
    private List f;
    private final AtomicBoolean g;
    private List h;

    public enum a {
        RECENT_ADS,
        COUNT
    }

    public e1(Context context) {
        super(context);
        this.g = new AtomicBoolean();
        this.h = new ArrayList();
    }

    public void a(List list, com.applovin.impl.sdk.l lVar) {
        Activity w0;
        this.e = lVar;
        this.f = list;
        if (!(this.a instanceof Activity) && (w0 = lVar.w0()) != null) {
            this.a = w0;
        }
        if (list != null && this.g.compareAndSet(false, true)) {
            this.h = a(this.f);
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.e1$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                e1.this.notifyDataSetChanged();
            }
        });
    }

    @Override // com.applovin.impl.u2
    protected int b() {
        return a.COUNT.ordinal();
    }

    @Override // com.applovin.impl.u2
    protected List c(int i) {
        return this.h;
    }

    public List d() {
        return this.f;
    }

    public com.applovin.impl.sdk.l e() {
        return this.e;
    }

    public boolean f() {
        return this.h.size() == 0;
    }

    public void g() {
        this.g.compareAndSet(true, false);
    }

    public String toString() {
        return "CreativeDebuggerListAdapter{isInitialized=" + this.g.get() + "}";
    }

    @Override // com.applovin.impl.u2
    protected int d(int i) {
        return this.h.size();
    }

    @Override // com.applovin.impl.u2
    protected t2 e(int i) {
        return new x4("RECENT ADS");
    }

    private List a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new q1((r1) it.next(), this.a));
        }
        return arrayList;
    }
}
