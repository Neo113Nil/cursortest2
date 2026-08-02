package com.google.android.gms.cast.framework.media;

import com.google.android.gms.cast.framework.media.RemoteMediaClient;
import com.google.android.gms.common.api.Status;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class d implements RemoteMediaClient.MediaChannelResult {
    public final /* synthetic */ Status a;

    public d(e eVar, Status status) {
        this.a = status;
        Objects.requireNonNull(eVar);
    }

    @Override // com.google.android.gms.common.api.Result
    public final Status getStatus() {
        return this.a;
    }
}
