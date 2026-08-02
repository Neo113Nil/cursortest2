package com.vk.lists;

import com.vk.lists.c;

/* compiled from: PaginationHelper.java */
/* loaded from: classes3.dex */
public final class d implements Runnable {
    public final /* synthetic */ c b;

    public d(c cVar) {
        this.b = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        c.n nVar = this.b.q;
        if (nVar != null) {
            nVar.gl();
        }
    }
}
