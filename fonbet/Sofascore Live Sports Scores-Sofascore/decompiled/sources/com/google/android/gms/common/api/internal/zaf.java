package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.tasks.TaskCompletionSource;
import defpackage.q2n;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zaf extends q2n {
    public final zacd c;

    public zaf(zacd zacdVar, TaskCompletionSource taskCompletionSource) {
        super(3, taskCompletionSource);
        this.c = zacdVar;
    }

    @Override // com.google.android.gms.common.api.internal.zac
    public final Feature[] f(zabk zabkVar) {
        return this.c.a.b;
    }

    @Override // com.google.android.gms.common.api.internal.zac
    public final boolean g(zabk zabkVar) {
        return this.c.a.c;
    }

    @Override // com.google.android.gms.common.api.internal.zac
    public final int h(zabk zabkVar) {
        return this.c.a.d;
    }

    @Override // defpackage.q2n
    public final void i(zabk zabkVar) {
        zacd zacdVar = this.c;
        c cVar = zacdVar.a;
        cVar.a(zabkVar.b, this.b);
        ListenerHolder.ListenerKey listenerKey = cVar.a.b;
        if (listenerKey != null) {
            zabkVar.f.put(listenerKey, zacdVar);
        }
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final /* bridge */ /* synthetic */ void c(zaaa zaaaVar, boolean z) {
    }
}
