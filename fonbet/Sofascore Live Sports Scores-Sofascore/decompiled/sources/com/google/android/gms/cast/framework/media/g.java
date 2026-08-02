package com.google.android.gms.cast.framework.media;

import com.google.android.gms.cast.MediaQueueItem;
import com.google.android.gms.cast.framework.media.RemoteMediaClient;
import com.google.android.gms.cast.internal.zzao;
import com.google.android.gms.internal.cast.zzfk;
import defpackage.scg;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class g implements zzao {
    public final /* synthetic */ RemoteMediaClient a;

    public /* synthetic */ g(RemoteMediaClient remoteMediaClient) {
        this.a = remoteMediaClient;
    }

    @Override // com.google.android.gms.cast.internal.zzao
    public final void c(int[] iArr) {
        Iterator it = this.a.h.iterator();
        while (it.hasNext()) {
            ((RemoteMediaClient.Callback) it.next()).q(iArr);
        }
    }

    @Override // com.google.android.gms.cast.internal.zzao
    public final void d(MediaQueueItem[] mediaQueueItemArr) {
        Iterator it = this.a.h.iterator();
        while (it.hasNext()) {
            ((RemoteMediaClient.Callback) it.next()).u(mediaQueueItemArr);
        }
    }

    @Override // com.google.android.gms.cast.internal.zzao
    public final void e(int i, ArrayList arrayList, ArrayList arrayList2) {
        Iterator it = this.a.h.iterator();
        while (it.hasNext()) {
            ((RemoteMediaClient.Callback) it.next()).v(i, arrayList, arrayList2);
        }
    }

    @Override // com.google.android.gms.cast.internal.zzao
    public final void j(int i, int[] iArr) {
        Iterator it = this.a.h.iterator();
        while (it.hasNext()) {
            ((RemoteMediaClient.Callback) it.next()).r(i, iArr);
        }
    }

    @Override // com.google.android.gms.cast.internal.zzao
    public final void k(int[] iArr) {
        Iterator it = this.a.h.iterator();
        while (it.hasNext()) {
            ((RemoteMediaClient.Callback) it.next()).s(iArr);
        }
    }

    @Override // com.google.android.gms.cast.internal.zzao
    public final void m(int[] iArr) {
        Iterator it = this.a.h.iterator();
        while (it.hasNext()) {
            ((RemoteMediaClient.Callback) it.next()).t(iArr);
        }
    }

    @Override // com.google.android.gms.cast.internal.zzao
    public final void zza() {
        RemoteMediaClient remoteMediaClient = this.a;
        for (h hVar : remoteMediaClient.j.values()) {
            if (remoteMediaClient.k() && !hVar.d) {
                RemoteMediaClient remoteMediaClient2 = hVar.e;
                zzfk zzfkVar = remoteMediaClient2.b;
                scg scgVar = hVar.c;
                zzfkVar.removeCallbacks(scgVar);
                hVar.d = true;
                remoteMediaClient2.b.postDelayed(scgVar, hVar.b);
            } else if (!remoteMediaClient.k() && hVar.d) {
                hVar.e.b.removeCallbacks(hVar.c);
                hVar.d = false;
            }
            if (hVar.d && (remoteMediaClient.l() || remoteMediaClient.A() || remoteMediaClient.o() || remoteMediaClient.n())) {
                remoteMediaClient.H(hVar.a);
            }
        }
        Iterator it = remoteMediaClient.g.iterator();
        while (it.hasNext()) {
            ((RemoteMediaClient.Listener) it.next()).l();
        }
        Iterator it2 = remoteMediaClient.h.iterator();
        while (it2.hasNext()) {
            ((RemoteMediaClient.Callback) it2.next()).l();
        }
    }

    @Override // com.google.android.gms.cast.internal.zzao
    public final void zzb() {
        RemoteMediaClient remoteMediaClient = this.a;
        Iterator it = remoteMediaClient.g.iterator();
        while (it.hasNext()) {
            ((RemoteMediaClient.Listener) it.next()).g();
        }
        Iterator it2 = remoteMediaClient.h.iterator();
        while (it2.hasNext()) {
            ((RemoteMediaClient.Callback) it2.next()).h();
        }
    }

    @Override // com.google.android.gms.cast.internal.zzao
    public final void zzc() {
        RemoteMediaClient remoteMediaClient = this.a;
        Iterator it = remoteMediaClient.g.iterator();
        while (it.hasNext()) {
            ((RemoteMediaClient.Listener) it.next()).h();
        }
        Iterator it2 = remoteMediaClient.h.iterator();
        while (it2.hasNext()) {
            ((RemoteMediaClient.Callback) it2.next()).j();
        }
    }

    @Override // com.google.android.gms.cast.internal.zzao
    public final void zzd() {
        RemoteMediaClient remoteMediaClient = this.a;
        Iterator it = remoteMediaClient.g.iterator();
        while (it.hasNext()) {
            ((RemoteMediaClient.Listener) it.next()).j();
        }
        Iterator it2 = remoteMediaClient.h.iterator();
        while (it2.hasNext()) {
            ((RemoteMediaClient.Callback) it2.next()).i();
        }
    }

    @Override // com.google.android.gms.cast.internal.zzao
    public final void zze() {
        RemoteMediaClient remoteMediaClient = this.a;
        Iterator it = remoteMediaClient.g.iterator();
        while (it.hasNext()) {
            ((RemoteMediaClient.Listener) it.next()).b();
        }
        Iterator it2 = remoteMediaClient.h.iterator();
        while (it2.hasNext()) {
            ((RemoteMediaClient.Callback) it2.next()).g();
        }
    }

    @Override // com.google.android.gms.cast.internal.zzao
    public final void zzf() {
        Iterator it = this.a.h.iterator();
        while (it.hasNext()) {
            ((RemoteMediaClient.Callback) it.next()).getClass();
        }
    }

    @Override // com.google.android.gms.cast.internal.zzao
    public final void zzm() {
        Iterator it = this.a.h.iterator();
        while (it.hasNext()) {
            ((RemoteMediaClient.Callback) it.next()).w();
        }
    }
}
