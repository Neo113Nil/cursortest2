package com.google.android.gms.cast.framework.media;

import com.google.android.gms.cast.framework.media.RemoteMediaClient;
import com.google.android.gms.cast.internal.zzap;
import com.google.android.gms.cast.internal.zzat;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Iterator;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class e extends BasePendingResult {
    public c o;
    public final boolean p;
    public final /* synthetic */ RemoteMediaClient q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(RemoteMediaClient remoteMediaClient, boolean z) {
        super(null);
        Objects.requireNonNull(remoteMediaClient);
        this.q = remoteMediaClient;
        this.p = z;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ Result e(Status status) {
        return new d(this, status);
    }

    public abstract void n();

    public final zzat o() {
        c cVar = this.o;
        if (cVar != null) {
            return cVar;
        }
        c cVar2 = new c(this);
        this.o = cVar2;
        return cVar2;
    }

    public final void p() {
        if (!this.p) {
            RemoteMediaClient remoteMediaClient = this.q;
            Iterator it = remoteMediaClient.g.iterator();
            while (it.hasNext()) {
                ((RemoteMediaClient.Listener) it.next()).i();
            }
            Iterator it2 = remoteMediaClient.h.iterator();
            while (it2.hasNext()) {
                ((RemoteMediaClient.Callback) it2.next()).getClass();
            }
        }
        try {
            synchronized (this.q.a) {
                n();
            }
        } catch (zzap unused) {
            a(new d(this, new Status(2100, null, null, null)));
        }
    }
}
