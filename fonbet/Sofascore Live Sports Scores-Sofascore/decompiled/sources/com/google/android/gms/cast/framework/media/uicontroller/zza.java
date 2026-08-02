package com.google.android.gms.cast.framework.media.uicontroller;

import android.os.Bundle;
import android.text.format.DateUtils;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaLiveSeekableRange;
import com.google.android.gms.cast.MediaMetadata;
import com.google.android.gms.cast.MediaQueueItem;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.gms.cast.framework.media.RemoteMediaClient;
import com.google.android.gms.cast.internal.CastUtils;
import com.google.android.gms.cast.internal.zzar;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.ironsource.Ua;
import java.text.DateFormat;
import java.util.Date;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@ShowFirstParty
/* loaded from: classes3.dex */
public final class zza {
    public RemoteMediaClient a;

    private zza() {
    }

    public static zza a() {
        return new zza();
    }

    public static final String n(long j) {
        return j >= 0 ? DateUtils.formatElapsedTime(j / 1000) : "-".concat(String.valueOf(DateUtils.formatElapsedTime((-j) / 1000)));
    }

    public final int b() {
        MediaInfo mediaInfo;
        RemoteMediaClient remoteMediaClient = this.a;
        long j = 1;
        if (remoteMediaClient != null && remoteMediaClient.k()) {
            RemoteMediaClient remoteMediaClient2 = this.a;
            if (remoteMediaClient2.m()) {
                Long i = i();
                if (i != null) {
                    j = i.longValue();
                } else {
                    Long k = k();
                    j = k != null ? k.longValue() : Math.max(remoteMediaClient2.d(), 1L);
                }
            } else if (remoteMediaClient2.n()) {
                MediaQueueItem e = remoteMediaClient2.e();
                if (e != null && (mediaInfo = e.a) != null) {
                    j = Math.max(mediaInfo.e, 1L);
                }
            } else {
                j = Math.max(remoteMediaClient2.j(), 1L);
            }
        }
        return Math.max((int) (j - g()), 1);
    }

    public final int c() {
        RemoteMediaClient remoteMediaClient = this.a;
        if (remoteMediaClient != null && remoteMediaClient.k()) {
            RemoteMediaClient remoteMediaClient2 = this.a;
            if (remoteMediaClient2.m() || !remoteMediaClient2.n()) {
                int d = (int) (remoteMediaClient2.d() - g());
                if (remoteMediaClient2.B()) {
                    int e = e();
                    int f = f();
                    Pattern pattern = CastUtils.a;
                    d = Math.min(Math.max(d, e), f);
                }
                int b = b();
                Pattern pattern2 = CastUtils.a;
                return Math.min(Math.max(d, 0), b);
            }
        }
        return 0;
    }

    public final boolean d(long j) {
        RemoteMediaClient remoteMediaClient = this.a;
        if (remoteMediaClient != null && remoteMediaClient.k() && this.a.B()) {
            return (g() + ((long) f())) - j < Ua.s;
        }
        return false;
    }

    public final int e() {
        RemoteMediaClient remoteMediaClient = this.a;
        if (remoteMediaClient == null || !remoteMediaClient.k() || !this.a.m() || !this.a.B()) {
            return 0;
        }
        Long j = j();
        Preconditions.i(j);
        long longValue = j.longValue() - g();
        int b = b();
        Pattern pattern = CastUtils.a;
        return Math.min(Math.max((int) longValue, 0), b);
    }

    public final int f() {
        RemoteMediaClient remoteMediaClient = this.a;
        if (remoteMediaClient == null || !remoteMediaClient.k() || !this.a.m()) {
            return b();
        }
        if (!this.a.B()) {
            return 0;
        }
        Long k = k();
        Preconditions.i(k);
        long longValue = k.longValue() - g();
        int b = b();
        Pattern pattern = CastUtils.a;
        return Math.min(Math.max((int) longValue, 0), b);
    }

    public final long g() {
        RemoteMediaClient remoteMediaClient = this.a;
        if (remoteMediaClient == null || !remoteMediaClient.k() || !this.a.m()) {
            return 0L;
        }
        RemoteMediaClient remoteMediaClient2 = this.a;
        Long h = h();
        if (h != null) {
            return h.longValue();
        }
        Long j = j();
        return j != null ? j.longValue() : remoteMediaClient2.d();
    }

    public final Long h() {
        MediaInfo f;
        RemoteMediaClient remoteMediaClient = this.a;
        if (remoteMediaClient != null && remoteMediaClient.k() && this.a.m()) {
            RemoteMediaClient remoteMediaClient2 = this.a;
            MediaInfo f2 = remoteMediaClient2.f();
            RemoteMediaClient remoteMediaClient3 = this.a;
            MediaMetadata mediaMetadata = (remoteMediaClient3 == null || !remoteMediaClient3.k() || (f = this.a.f()) == null) ? null : f.d;
            if (f2 != null && mediaMetadata != null) {
                Bundle bundle = mediaMetadata.b;
                if (bundle.containsKey("com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_MEDIA") && (bundle.containsKey("com.google.android.gms.cast.metadata.SECTION_DURATION") || remoteMediaClient2.B())) {
                    MediaMetadata.a1(5, "com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_MEDIA");
                    return Long.valueOf(bundle.getLong("com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_MEDIA"));
                }
            }
        }
        return null;
    }

    public final Long i() {
        Long h;
        MediaInfo f;
        RemoteMediaClient remoteMediaClient = this.a;
        if (remoteMediaClient != null && remoteMediaClient.k() && this.a.m()) {
            RemoteMediaClient remoteMediaClient2 = this.a;
            MediaMetadata mediaMetadata = (remoteMediaClient2 == null || !remoteMediaClient2.k() || (f = this.a.f()) == null) ? null : f.d;
            if (mediaMetadata != null) {
                Bundle bundle = mediaMetadata.b;
                if (bundle.containsKey("com.google.android.gms.cast.metadata.SECTION_DURATION") && (h = h()) != null) {
                    long longValue = h.longValue();
                    MediaMetadata.a1(5, "com.google.android.gms.cast.metadata.SECTION_DURATION");
                    return Long.valueOf(bundle.getLong("com.google.android.gms.cast.metadata.SECTION_DURATION") + longValue);
                }
            }
        }
        return null;
    }

    public final Long j() {
        RemoteMediaClient remoteMediaClient;
        MediaStatus h;
        long j;
        MediaLiveSeekableRange mediaLiveSeekableRange;
        RemoteMediaClient remoteMediaClient2 = this.a;
        if (remoteMediaClient2 == null || !remoteMediaClient2.k() || !this.a.m() || !this.a.B() || (h = (remoteMediaClient = this.a).h()) == null || h.u == null) {
            return null;
        }
        synchronized (remoteMediaClient.a) {
            Preconditions.e("Must be called from the main thread.");
            zzar zzarVar = remoteMediaClient.c;
            MediaStatus mediaStatus = zzarVar.f;
            j = 0;
            if (mediaStatus != null && (mediaLiveSeekableRange = mediaStatus.u) != null) {
                long j2 = mediaLiveSeekableRange.a;
                j = mediaLiveSeekableRange.c ? zzarVar.g(1.0d, j2, -1L) : j2;
                if (mediaLiveSeekableRange.d) {
                    j = Math.min(j, mediaLiveSeekableRange.b);
                }
            }
        }
        return Long.valueOf(j);
    }

    public final Long k() {
        RemoteMediaClient remoteMediaClient;
        MediaStatus h;
        long j;
        MediaLiveSeekableRange mediaLiveSeekableRange;
        RemoteMediaClient remoteMediaClient2 = this.a;
        if (remoteMediaClient2 == null || !remoteMediaClient2.k() || !this.a.m() || !this.a.B() || (h = (remoteMediaClient = this.a).h()) == null || h.u == null) {
            return null;
        }
        synchronized (remoteMediaClient.a) {
            Preconditions.e("Must be called from the main thread.");
            zzar zzarVar = remoteMediaClient.c;
            MediaStatus mediaStatus = zzarVar.f;
            j = 0;
            if (mediaStatus != null && (mediaLiveSeekableRange = mediaStatus.u) != null) {
                long j2 = mediaLiveSeekableRange.b;
                j = !mediaLiveSeekableRange.d ? zzarVar.g(1.0d, j2, -1L) : j2;
            }
        }
        return Long.valueOf(j);
    }

    public final String l(long j) {
        RemoteMediaClient remoteMediaClient = this.a;
        if (remoteMediaClient == null || !remoteMediaClient.k()) {
            return null;
        }
        RemoteMediaClient remoteMediaClient2 = this.a;
        int i = 1;
        if (remoteMediaClient2 != null && remoteMediaClient2.k() && this.a.m() && m() != null) {
            i = 2;
        }
        if (i - 1 == 0) {
            return (remoteMediaClient2.m() && h() == null) ? n(j) : n(j - g());
        }
        Long m = m();
        Preconditions.i(m);
        return DateFormat.getTimeInstance().format(new Date(m.longValue() + j));
    }

    public final Long m() {
        MediaInfo f;
        RemoteMediaClient remoteMediaClient = this.a;
        if (remoteMediaClient == null || !remoteMediaClient.k() || !this.a.m() || (f = this.a.f()) == null) {
            return null;
        }
        long j = f.m;
        if (j != -1) {
            return Long.valueOf(j);
        }
        return null;
    }
}
