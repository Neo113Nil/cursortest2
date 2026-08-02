package com.google.android.gms.internal.cast;

import androidx.annotation.Nullable;
import com.google.android.gms.cast.AdBreakClipInfo;
import com.google.android.gms.cast.AdBreakInfo;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.gms.cast.framework.media.widget.CastSeekBar;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import xsna.b901;
import xsna.dsz0;
import xsna.g0a;
import xsna.jn4;
import xsna.k201;
import xsna.lvf0;
import xsna.twp0;
import xsna.utz0;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
/* loaded from: classes12.dex */
public final class zzct extends twp0 implements lvf0.d {
    private final CastSeekBar zza;
    private final long zzb;
    private final utz0 zzc;

    public zzct(CastSeekBar castSeekBar, long j, utz0 utz0Var) {
        this.zza = castSeekBar;
        this.zzb = j;
        this.zzc = utz0Var;
        castSeekBar.setEnabled(false);
        castSeekBar.a(null);
        castSeekBar.e = null;
        castSeekBar.postInvalidate();
    }

    @Override // xsna.twp0
    @Nullable
    public final lvf0 getRemoteMediaClient() {
        return super.getRemoteMediaClient();
    }

    @Override // xsna.twp0
    public final void onMediaStatusUpdated() {
        zza();
    }

    @Override // xsna.lvf0.d
    public final void onProgressUpdated(long j, long j2) {
        zzc();
        zzb();
    }

    @Override // xsna.twp0
    public final void onSessionConnected(g0a g0aVar) {
        super.onSessionConnected(g0aVar);
        lvf0 remoteMediaClient = super.getRemoteMediaClient();
        if (remoteMediaClient != null) {
            remoteMediaClient.b(this, this.zzb);
        }
        zza();
    }

    @Override // xsna.twp0
    public final void onSessionEnded() {
        lvf0 remoteMediaClient = super.getRemoteMediaClient();
        if (remoteMediaClient != null) {
            remoteMediaClient.u(this);
        }
        super.onSessionEnded();
        zza();
    }

    public final void zza() {
        int min;
        zzc();
        lvf0 remoteMediaClient = super.getRemoteMediaClient();
        ArrayList arrayList = null;
        MediaInfo g = remoteMediaClient == null ? null : remoteMediaClient.g();
        if (remoteMediaClient == null || !remoteMediaClient.k() || remoteMediaClient.n() || g == null) {
            this.zza.a(null);
        } else {
            CastSeekBar castSeekBar = this.zza;
            List list = g.j;
            List<AdBreakInfo> unmodifiableList = list == null ? null : Collections.unmodifiableList(list);
            if (unmodifiableList != null) {
                arrayList = new ArrayList();
                for (AdBreakInfo adBreakInfo : unmodifiableList) {
                    if (adBreakInfo != null) {
                        long j = adBreakInfo.b;
                        if (j == -1000) {
                            min = this.zzc.a();
                        } else {
                            utz0 utz0Var = this.zzc;
                            min = Math.min((int) (j - utz0Var.f()), utz0Var.a());
                        }
                        if (min >= 0) {
                            arrayList.add(new dsz0(min, (int) adBreakInfo.d, adBreakInfo.h));
                        }
                    }
                }
            }
            castSeekBar.a(arrayList);
        }
        zzb();
    }

    public final void zzb() {
        lvf0 remoteMediaClient = super.getRemoteMediaClient();
        if (remoteMediaClient == null || !remoteMediaClient.q()) {
            CastSeekBar castSeekBar = this.zza;
            castSeekBar.e = null;
            castSeekBar.postInvalidate();
            return;
        }
        int c = (int) remoteMediaClient.c();
        MediaStatus h = remoteMediaClient.h();
        AdBreakClipInfo i = h != null ? h.i() : null;
        int i2 = i != null ? (int) i.d : c;
        if (c < 0) {
            c = 0;
        }
        if (i2 < 0) {
            i2 = 1;
        }
        CastSeekBar castSeekBar2 = this.zza;
        if (c > i2) {
            i2 = c;
        }
        castSeekBar2.e = new k201(c, i2);
        castSeekBar2.postInvalidate();
    }

    public final void zzc() {
        lvf0 remoteMediaClient = super.getRemoteMediaClient();
        if (remoteMediaClient == null || !remoteMediaClient.k() || remoteMediaClient.q()) {
            this.zza.setEnabled(false);
        } else {
            this.zza.setEnabled(true);
        }
        b901 b901Var = new b901();
        utz0 utz0Var = this.zzc;
        b901Var.a = utz0Var.b();
        b901Var.b = utz0Var.a();
        b901Var.c = (int) (-utz0Var.f());
        lvf0 remoteMediaClient2 = super.getRemoteMediaClient();
        b901Var.d = (remoteMediaClient2 != null && remoteMediaClient2.k() && remoteMediaClient2.C()) ? utz0Var.d() : utz0Var.b();
        lvf0 remoteMediaClient3 = super.getRemoteMediaClient();
        b901Var.e = (remoteMediaClient3 != null && remoteMediaClient3.k() && remoteMediaClient3.C()) ? utz0Var.e() : utz0Var.b();
        lvf0 remoteMediaClient4 = super.getRemoteMediaClient();
        b901Var.f = remoteMediaClient4 != null && remoteMediaClient4.k() && remoteMediaClient4.C();
        CastSeekBar castSeekBar = this.zza;
        if (castSeekBar.c) {
            return;
        }
        b901 b901Var2 = new b901();
        b901Var2.a = b901Var.a;
        b901Var2.b = b901Var.b;
        b901Var2.c = b901Var.c;
        b901Var2.d = b901Var.d;
        b901Var2.e = b901Var.e;
        b901Var2.f = b901Var.f;
        castSeekBar.b = b901Var2;
        castSeekBar.d = null;
        jn4 jn4Var = castSeekBar.g;
        if (jn4Var != null) {
            jn4Var.d(castSeekBar.getProgress(), false);
        }
        castSeekBar.postInvalidate();
    }
}
