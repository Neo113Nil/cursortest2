package com.google.android.gms.cast.framework.media;

import com.google.android.gms.cast.framework.media.RemoteMediaClient;
import com.google.android.gms.cast.internal.zzat;
import com.google.android.gms.common.api.Status;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class c implements zzat {
    public final /* synthetic */ e a;

    public c(e eVar) {
        this.a = eVar;
    }

    @Override // com.google.android.gms.cast.internal.zzat
    public final void a(String str, long j, long j2, long j3) {
        e eVar = this.a;
        try {
            eVar.a(new d(eVar, new Status(2103, null, null, null)));
        } catch (IllegalStateException unused) {
            RemoteMediaClient.k.c("Result already set when calling onRequestReplaced", new Object[0]);
        }
        Iterator it = eVar.q.h.iterator();
        while (it.hasNext()) {
            ((RemoteMediaClient.Callback) it.next()).p(j, j2, j3, str, 2103);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002d A[LOOP:0: B:8:0x0027->B:10:0x002d, LOOP_END] */
    @Override // com.google.android.gms.cast.internal.zzat
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(String str, long j, int i, Object obj, long j2, long j3) {
        int i2;
        Iterator it;
        e eVar = this.a;
        try {
            i2 = i;
        } catch (IllegalStateException unused) {
            i2 = i;
        }
        try {
            eVar.a(new f(new Status(i2, null, null, null)));
        } catch (IllegalStateException unused2) {
            RemoteMediaClient.k.c("Result already set when calling onRequestCompleted", new Object[0]);
            it = eVar.q.h.iterator();
            while (it.hasNext()) {
            }
        }
        it = eVar.q.h.iterator();
        while (it.hasNext()) {
            ((RemoteMediaClient.Callback) it.next()).p(j, j2, j3, str, i2);
            i2 = i;
        }
    }
}
