package com.google.android.gms.cast.framework.media;

import android.util.SparseIntArray;
import com.google.android.gms.cast.MediaQueueItem;
import com.google.android.gms.cast.framework.media.MediaQueue;
import com.google.android.gms.cast.framework.media.RemoteMediaClient;
import com.google.android.gms.cast.internal.CastUtils;
import defpackage.lnb;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzn extends RemoteMediaClient.Callback {
    public final /* synthetic */ MediaQueue a;

    public zzn(MediaQueue mediaQueue) {
        this.a = mediaQueue;
    }

    @Override // com.google.android.gms.cast.framework.media.RemoteMediaClient.Callback
    public final void l() {
        MediaQueue mediaQueue = this.a;
        long d = mediaQueue.d();
        if (d != mediaQueue.b) {
            mediaQueue.b = d;
            mediaQueue.a();
            if (mediaQueue.b != 0) {
                mediaQueue.b();
            }
        }
    }

    @Override // com.google.android.gms.cast.framework.media.RemoteMediaClient.Callback
    public final void q(int[] iArr) {
        ArrayList e = CastUtils.e(iArr);
        MediaQueue mediaQueue = this.a;
        if (mediaQueue.d.equals(e)) {
            return;
        }
        mediaQueue.e();
        mediaQueue.f.evictAll();
        mediaQueue.g.clear();
        mediaQueue.d = e;
        mediaQueue.c();
        mediaQueue.g();
        mediaQueue.f();
    }

    @Override // com.google.android.gms.cast.framework.media.RemoteMediaClient.Callback
    public final void r(int i, int[] iArr) {
        int i2;
        MediaQueue mediaQueue = this.a;
        if (i == 0) {
            i2 = mediaQueue.d.size();
        } else {
            i2 = mediaQueue.e.get(i, -1);
            if (i2 == -1) {
                mediaQueue.b();
                return;
            }
        }
        MediaQueue mediaQueue2 = this.a;
        mediaQueue2.e();
        mediaQueue2.d.addAll(i2, CastUtils.e(iArr));
        mediaQueue2.c();
        Set set = mediaQueue2.m;
        synchronized (set) {
            try {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    ((MediaQueue.Callback) it.next()).getClass();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        mediaQueue2.f();
    }

    @Override // com.google.android.gms.cast.framework.media.RemoteMediaClient.Callback
    public final void s(int[] iArr) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            int length = iArr.length;
            MediaQueue mediaQueue = this.a;
            if (i >= length) {
                Collections.sort(arrayList);
                mediaQueue.e();
                CastUtils.d(arrayList);
                mediaQueue.h();
                mediaQueue.f();
                return;
            }
            int i2 = iArr[i];
            mediaQueue.f.remove(Integer.valueOf(i2));
            int i3 = mediaQueue.e.get(i2, -1);
            if (i3 == -1) {
                mediaQueue.b();
                return;
            }
            i = lnb.f(i3, arrayList, i, 1);
        }
    }

    @Override // com.google.android.gms.cast.framework.media.RemoteMediaClient.Callback
    public final void t(int[] iArr) {
        ArrayList arrayList = new ArrayList();
        for (int i : iArr) {
            MediaQueue mediaQueue = this.a;
            mediaQueue.f.remove(Integer.valueOf(i));
            SparseIntArray sparseIntArray = mediaQueue.e;
            int i2 = sparseIntArray.get(i, -1);
            if (i2 == -1) {
                mediaQueue.b();
                return;
            } else {
                sparseIntArray.delete(i);
                arrayList.add(Integer.valueOf(i2));
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        Collections.sort(arrayList);
        MediaQueue mediaQueue2 = this.a;
        mediaQueue2.e();
        mediaQueue2.d.removeAll(CastUtils.e(iArr));
        mediaQueue2.c();
        CastUtils.d(arrayList);
        Set set = mediaQueue2.m;
        synchronized (set) {
            try {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    ((MediaQueue.Callback) it.next()).getClass();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        mediaQueue2.f();
    }

    @Override // com.google.android.gms.cast.framework.media.RemoteMediaClient.Callback
    public final void u(MediaQueueItem[] mediaQueueItemArr) {
        HashSet hashSet = new HashSet();
        MediaQueue mediaQueue = this.a;
        ArrayList arrayList = mediaQueue.g;
        SparseIntArray sparseIntArray = mediaQueue.e;
        arrayList.clear();
        for (MediaQueueItem mediaQueueItem : mediaQueueItemArr) {
            int i = mediaQueueItem.b;
            mediaQueue.f.put(Integer.valueOf(i), mediaQueueItem);
            int i2 = sparseIntArray.get(i, -1);
            if (i2 == -1) {
                mediaQueue.b();
                return;
            }
            hashSet.add(Integer.valueOf(i2));
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            int i3 = sparseIntArray.get(((Integer) it.next()).intValue(), -1);
            if (i3 != -1) {
                hashSet.add(Integer.valueOf(i3));
            }
        }
        arrayList.clear();
        ArrayList arrayList2 = new ArrayList(hashSet);
        Collections.sort(arrayList2);
        mediaQueue.e();
        CastUtils.d(arrayList2);
        mediaQueue.h();
        mediaQueue.f();
    }

    @Override // com.google.android.gms.cast.framework.media.RemoteMediaClient.Callback
    public final void v(int i, ArrayList arrayList, ArrayList arrayList2) {
        ArrayList arrayList3 = new ArrayList();
        if (i == 0) {
            this.a.d.size();
        } else {
            boolean isEmpty = arrayList2.isEmpty();
            MediaQueue mediaQueue = this.a;
            if (isEmpty) {
                mediaQueue.a.c("Received a Queue Reordered message with an empty reordered items IDs list.", new Object[0]);
            } else {
                SparseIntArray sparseIntArray = mediaQueue.e;
                if (sparseIntArray.get(i, -1) == -1) {
                    sparseIntArray.get(((Integer) arrayList2.get(0)).intValue(), -1);
                }
            }
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            int intValue = ((Integer) it.next()).intValue();
            MediaQueue mediaQueue2 = this.a;
            int i2 = mediaQueue2.e.get(intValue, -1);
            if (i2 == -1) {
                mediaQueue2.b();
                return;
            }
            arrayList3.add(Integer.valueOf(i2));
        }
        MediaQueue mediaQueue3 = this.a;
        mediaQueue3.e();
        mediaQueue3.d = arrayList;
        mediaQueue3.c();
        Set set = mediaQueue3.m;
        synchronized (set) {
            try {
                Iterator it2 = set.iterator();
                while (it2.hasNext()) {
                    ((MediaQueue.Callback) it2.next()).getClass();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        mediaQueue3.f();
    }

    @Override // com.google.android.gms.cast.framework.media.RemoteMediaClient.Callback
    public final void w() {
        this.a.b();
    }
}
