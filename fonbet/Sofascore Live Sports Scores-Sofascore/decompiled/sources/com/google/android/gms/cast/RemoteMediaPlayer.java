package com.google.android.gms.cast;

import com.google.android.gms.cast.Cast;
import com.google.android.gms.cast.internal.zzar;
import com.google.android.gms.common.api.Result;
import defpackage.x3f;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Deprecated
/* loaded from: classes3.dex */
public class RemoteMediaPlayer implements Cast.MessageReceivedCallback {
    public final zzar a;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Deprecated
    public interface MediaChannelResult extends Result {
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Deprecated
    public interface OnMetadataUpdatedListener {
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Deprecated
    public interface OnPreloadStatusUpdatedListener {
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Deprecated
    public interface OnQueueStatusUpdatedListener {
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Deprecated
    public interface OnStatusUpdatedListener {
    }

    static {
        String str = zzar.z;
    }

    public RemoteMediaPlayer() {
        zzar zzarVar = new zzar();
        this.a = zzarVar;
        zzarVar.h = new x3f(this, 10);
        c cVar = new c();
        cVar.a = 0L;
        zzarVar.c = cVar;
    }

    @Override // com.google.android.gms.cast.Cast.MessageReceivedCallback
    public final void a(String str) {
        this.a.e(str);
    }
}
