package defpackage;

import com.google.android.gms.cast.MediaStatus;
import com.google.android.gms.cast.framework.CastSession;
import com.google.android.gms.cast.framework.media.RemoteMediaClient;
import com.google.android.gms.internal.cast.zzcp;
import com.google.android.gms.internal.cast.zzcq;
import com.google.android.gms.internal.cast.zzs;
import com.google.android.gms.internal.cast.zzt;
import com.google.android.gms.internal.cast.zzy;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class m2p extends RemoteMediaClient.Callback {
    public final /* synthetic */ CastSession a;

    public m2p(CastSession castSession) {
        Objects.requireNonNull(castSession);
        this.a = castSession;
    }

    @Override // com.google.android.gms.cast.framework.media.RemoteMediaClient.Callback
    public final void l() {
        CastSession castSession = this.a;
        RemoteMediaClient remoteMediaClient = castSession.j;
        MediaStatus h = remoteMediaClient != null ? remoteMediaClient.h() : null;
        n1p n1pVar = castSession.m;
        if (n1pVar == null || h == null) {
            return;
        }
        m4n b = ((zzy) n1pVar.b).b();
        zzt zztVar = new zzt(new zzs(h));
        zzt zztVar2 = b.m;
        if (zztVar2 == null || zztVar2.a != 2) {
            zztVar.c = b.h;
            b.m = zztVar;
        }
    }

    @Override // com.google.android.gms.cast.framework.media.RemoteMediaClient.Callback
    public final void p(long j, long j2, long j3, String str, int i) {
        n1p n1pVar = this.a.m;
        if (n1pVar != null) {
            m4n b = ((zzy) n1pVar.b).b();
            zzcp zzcpVar = new zzcp(str);
            zzcpVar.b = j;
            zzcpVar.c = i;
            zzcpVar.d = j2;
            zzcpVar.e = j3;
            zzcq zzcqVar = new zzcq(zzcpVar);
            zzcqVar.f = b.h;
            b.d.add(zzcqVar);
        }
    }
}
