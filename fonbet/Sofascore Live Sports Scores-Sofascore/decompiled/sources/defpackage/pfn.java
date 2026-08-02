package defpackage;

import com.google.android.gms.cast.framework.media.RemoteMediaClient;
import com.google.android.gms.cast.framework.media.e;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class pfn extends e {
    public final /* synthetic */ int r;
    public final /* synthetic */ long s;
    public final /* synthetic */ RemoteMediaClient t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pfn(RemoteMediaClient remoteMediaClient, int i, long j) {
        super(remoteMediaClient, false);
        this.r = i;
        this.s = j;
        Objects.requireNonNull(remoteMediaClient);
        this.t = remoteMediaClient;
    }

    @Override // com.google.android.gms.cast.framework.media.e
    public final void n() {
        this.t.c.d(o(), this.r, this.s, 0, null);
    }
}
