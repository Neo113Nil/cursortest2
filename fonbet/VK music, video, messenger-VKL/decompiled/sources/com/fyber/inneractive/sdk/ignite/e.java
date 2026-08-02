package com.fyber.inneractive.sdk.ignite;

import java.util.Iterator;

/* loaded from: classes12.dex */
public final class e implements r {
    public final /* synthetic */ h a;

    public e(h hVar) {
        this.a = hVar;
    }

    @Override // com.fyber.inneractive.sdk.ignite.r
    public final void a(String str, String str2) {
        Iterator it = this.a.h.iterator();
        while (it.hasNext()) {
            r rVar = (r) it.next();
            if (rVar != null) {
                rVar.a(str, str2);
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.ignite.r
    public final void b(String str) {
        Iterator it = this.a.h.iterator();
        while (it.hasNext()) {
            r rVar = (r) it.next();
            if (rVar != null) {
                rVar.b(str);
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.ignite.r
    public final void c(String str) {
        Iterator it = this.a.h.iterator();
        while (it.hasNext()) {
            r rVar = (r) it.next();
            if (rVar != null) {
                rVar.c(str);
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.ignite.r
    public final void a(String str, int i, double d) {
        Iterator it = this.a.h.iterator();
        while (it.hasNext()) {
            r rVar = (r) it.next();
            if (rVar != null) {
                rVar.a(str, i, d);
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.ignite.r
    public final void a(String str) {
        Iterator it = this.a.h.iterator();
        while (it.hasNext()) {
            r rVar = (r) it.next();
            if (rVar != null) {
                rVar.a(str);
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.ignite.r
    public final void a(String str, String str2, String str3) {
        Iterator it = this.a.h.iterator();
        while (it.hasNext()) {
            r rVar = (r) it.next();
            if (rVar != null) {
                rVar.a(str, str2, str3);
            }
        }
    }
}
