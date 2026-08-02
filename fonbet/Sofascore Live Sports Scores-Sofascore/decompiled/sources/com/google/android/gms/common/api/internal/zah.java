package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.tasks.TaskCompletionSource;
import defpackage.q2n;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zah extends q2n {
    public final ListenerHolder.ListenerKey c;

    public zah(ListenerHolder.ListenerKey listenerKey, TaskCompletionSource taskCompletionSource) {
        super(4, taskCompletionSource);
        this.c = listenerKey;
    }

    @Override // com.google.android.gms.common.api.internal.zac
    public final Feature[] f(zabk zabkVar) {
        zacd zacdVar = (zacd) zabkVar.f.get(this.c);
        if (zacdVar == null) {
            return null;
        }
        return zacdVar.a.b;
    }

    @Override // com.google.android.gms.common.api.internal.zac
    public final boolean g(zabk zabkVar) {
        zacd zacdVar = (zacd) zabkVar.f.get(this.c);
        return zacdVar != null && zacdVar.a.c;
    }

    @Override // com.google.android.gms.common.api.internal.zac
    public final int h(zabk zabkVar) {
        zacd zacdVar = (zacd) zabkVar.f.get(this.c);
        if (zacdVar != null) {
            return zacdVar.a.d;
        }
        return -1;
    }

    @Override // defpackage.q2n
    public final void i(zabk zabkVar) {
        zacd zacdVar = (zacd) zabkVar.f.remove(this.c);
        if (zacdVar == null) {
            this.b.trySetResult(Boolean.FALSE);
            return;
        }
        zacdVar.b.b.b.u(zabkVar.b, this.b);
        zacdVar.a.a.b = null;
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final /* bridge */ /* synthetic */ void c(zaaa zaaaVar, boolean z) {
    }
}
