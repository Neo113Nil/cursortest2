package com.google.android.gms.internal.cast;

import com.google.android.gms.cast.AdBreakClipInfo;
import com.google.android.gms.cast.AdBreakInfo;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.gms.cast.framework.CastSession;
import com.google.android.gms.cast.framework.media.RemoteMediaClient;
import com.google.android.gms.cast.framework.media.uicontroller.UIController;
import com.google.android.gms.cast.framework.media.widget.CastSeekBar;
import defpackage.bko;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzct extends UIController implements RemoteMediaClient.ProgressListener {
    public final CastSeekBar b;
    public final long c = 1000;
    public final com.google.android.gms.cast.framework.media.uicontroller.zza d;

    public zzct(CastSeekBar castSeekBar, com.google.android.gms.cast.framework.media.uicontroller.zza zzaVar) {
        this.b = castSeekBar;
        this.d = zzaVar;
        castSeekBar.setEnabled(false);
        castSeekBar.a(null);
        castSeekBar.d = null;
        castSeekBar.postInvalidate();
    }

    @Override // com.google.android.gms.cast.framework.media.uicontroller.UIController
    public final void a() {
        f();
    }

    @Override // com.google.android.gms.cast.framework.media.RemoteMediaClient.ProgressListener
    public final void b(long j, long j2) {
        h();
        g();
    }

    @Override // com.google.android.gms.cast.framework.media.uicontroller.UIController
    public final void d(CastSession castSession) {
        super.d(castSession);
        RemoteMediaClient remoteMediaClient = this.a;
        if (remoteMediaClient != null) {
            remoteMediaClient.b(this, this.c);
        }
        f();
    }

    @Override // com.google.android.gms.cast.framework.media.uicontroller.UIController
    public final void e() {
        RemoteMediaClient remoteMediaClient = this.a;
        if (remoteMediaClient != null) {
            remoteMediaClient.u(this);
        }
        this.a = null;
        f();
    }

    public final void f() {
        h();
        RemoteMediaClient remoteMediaClient = this.a;
        ArrayList arrayList = null;
        MediaInfo f = remoteMediaClient == null ? null : remoteMediaClient.f();
        CastSeekBar castSeekBar = this.b;
        if (remoteMediaClient == null || !remoteMediaClient.k() || remoteMediaClient.n() || f == null) {
            castSeekBar.a(null);
        } else {
            List list = f.i;
            List<AdBreakInfo> unmodifiableList = list == null ? null : Collections.unmodifiableList(list);
            if (unmodifiableList != null) {
                arrayList = new ArrayList();
                for (AdBreakInfo adBreakInfo : unmodifiableList) {
                    if (adBreakInfo != null) {
                        long j = adBreakInfo.a;
                        com.google.android.gms.cast.framework.media.uicontroller.zza zzaVar = this.d;
                        int b = j == -1000 ? zzaVar.b() : Math.min((int) (j - zzaVar.g()), zzaVar.b());
                        if (b >= 0) {
                            arrayList.add(new com.google.android.gms.cast.framework.media.widget.zza(b, (int) adBreakInfo.c, adBreakInfo.g));
                        }
                    }
                }
            }
            castSeekBar.a(arrayList);
        }
        g();
    }

    public final void g() {
        RemoteMediaClient remoteMediaClient = this.a;
        CastSeekBar castSeekBar = this.b;
        if (remoteMediaClient == null || !remoteMediaClient.q()) {
            castSeekBar.d = null;
            castSeekBar.postInvalidate();
            return;
        }
        int c = (int) remoteMediaClient.c();
        MediaStatus h = remoteMediaClient.h();
        AdBreakClipInfo Y0 = h != null ? h.Y0() : null;
        int i = Y0 != null ? (int) Y0.c : c;
        if (c < 0) {
            c = 0;
        }
        if (i < 0) {
            i = 1;
        }
        if (c > i) {
            i = c;
        }
        castSeekBar.d = new com.google.android.gms.cast.framework.media.widget.zzb(c, i);
        castSeekBar.postInvalidate();
    }

    public final void h() {
        RemoteMediaClient remoteMediaClient = this.a;
        CastSeekBar castSeekBar = this.b;
        if (remoteMediaClient == null || !remoteMediaClient.k() || remoteMediaClient.q()) {
            castSeekBar.setEnabled(false);
        } else {
            castSeekBar.setEnabled(true);
        }
        com.google.android.gms.cast.framework.media.widget.zze zzeVar = new com.google.android.gms.cast.framework.media.widget.zze();
        com.google.android.gms.cast.framework.media.uicontroller.zza zzaVar = this.d;
        zzeVar.a = zzaVar.c();
        zzeVar.b = zzaVar.b();
        zzeVar.c = (int) (-zzaVar.g());
        RemoteMediaClient remoteMediaClient2 = this.a;
        zzeVar.d = (remoteMediaClient2 != null && remoteMediaClient2.k() && remoteMediaClient2.B()) ? zzaVar.e() : zzaVar.c();
        RemoteMediaClient remoteMediaClient3 = this.a;
        zzeVar.e = (remoteMediaClient3 != null && remoteMediaClient3.k() && remoteMediaClient3.B()) ? zzaVar.f() : zzaVar.c();
        RemoteMediaClient remoteMediaClient4 = this.a;
        zzeVar.f = remoteMediaClient4 != null && remoteMediaClient4.k() && remoteMediaClient4.B();
        if (castSeekBar.b) {
            return;
        }
        com.google.android.gms.cast.framework.media.widget.zze zzeVar2 = new com.google.android.gms.cast.framework.media.widget.zze();
        zzeVar2.a = zzeVar.a;
        zzeVar2.b = zzeVar.b;
        zzeVar2.c = zzeVar.c;
        zzeVar2.d = zzeVar.d;
        zzeVar2.e = zzeVar.e;
        zzeVar2.f = zzeVar.f;
        castSeekBar.a = zzeVar2;
        castSeekBar.c = null;
        bko bkoVar = castSeekBar.f;
        if (bkoVar != null) {
            bkoVar.b(castSeekBar.getProgress(), false);
        }
        castSeekBar.postInvalidate();
    }
}
