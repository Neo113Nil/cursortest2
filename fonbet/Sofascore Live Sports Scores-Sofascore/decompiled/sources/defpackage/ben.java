package defpackage;

import com.google.android.gms.cast.framework.media.RemoteMediaClient;
import com.google.android.gms.cast.framework.media.e;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class ben extends e {
    public final /* synthetic */ int r;
    public final /* synthetic */ RemoteMediaClient s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ben(RemoteMediaClient remoteMediaClient, int i) {
        super(remoteMediaClient, false);
        this.r = i;
        Objects.requireNonNull(remoteMediaClient);
        this.s = remoteMediaClient;
    }

    @Override // com.google.android.gms.cast.framework.media.e
    public final void n() {
        this.s.c.d(o(), 0, -1L, 0, Integer.valueOf(this.r));
    }
}
