package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.net.Uri;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.services.UnityAdsConstants;
import defpackage.bnn;
import defpackage.fc6;
import defpackage.lv4;
import defpackage.psn;
import defpackage.q61;
import defpackage.qsn;
import defpackage.wt3;
import java.io.IOException;
import java.util.HashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzchj extends zzchl implements TextureView.SurfaceTextureListener, MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnVideoSizeChangedListener {
    public static final HashMap t;
    public final zzcmi c;
    public final zzcig d;
    public final boolean e;
    public final zzeaj f;
    public int g;
    public int h;
    public MediaPlayer i;
    public Uri j;
    public int k;
    public int l;
    public int m;
    public zzcid n;
    public final boolean o;
    public int p;
    public zzcht q;
    public boolean r;
    public Integer s;

    static {
        HashMap hashMap = new HashMap();
        t = hashMap;
        hashMap.put(-1004, "MEDIA_ERROR_IO");
        hashMap.put(-1007, "MEDIA_ERROR_MALFORMED");
        hashMap.put(-1010, "MEDIA_ERROR_UNSUPPORTED");
        hashMap.put(-110, "MEDIA_ERROR_TIMED_OUT");
        hashMap.put(3, "MEDIA_INFO_VIDEO_RENDERING_START");
        hashMap.put(100, "MEDIA_ERROR_SERVER_DIED");
        hashMap.put(1, "MEDIA_ERROR_UNKNOWN");
        hashMap.put(1, "MEDIA_INFO_UNKNOWN");
        hashMap.put(Integer.valueOf(IronSourceError.ERROR_NT_LOAD_AFTER_INIT_FAILED), "MEDIA_INFO_VIDEO_TRACK_LAGGING");
        hashMap.put(Integer.valueOf(IronSourceError.ERROR_NT_LOAD_AFTER_LONG_INITIATION), "MEDIA_INFO_BUFFERING_START");
        hashMap.put(Integer.valueOf(IronSourceError.ERROR_NT_INIT_FAILED_AFTER_LOAD), "MEDIA_INFO_BUFFERING_END");
        hashMap.put(800, "MEDIA_INFO_BAD_INTERLEAVING");
        hashMap.put(801, "MEDIA_INFO_NOT_SEEKABLE");
        hashMap.put(802, "MEDIA_INFO_METADATA_UPDATE");
        hashMap.put(901, "MEDIA_INFO_UNSUPPORTED_SUBTITLE");
        hashMap.put(902, "MEDIA_INFO_SUBTITLE_TIMED_OUT");
    }

    public zzchj(Context context, zzcmi zzcmiVar, boolean z, boolean z2, zzcig zzcigVar, zzeaj zzeajVar) {
        super(context);
        this.g = 0;
        this.h = 0;
        this.r = false;
        this.s = null;
        this.c = zzcmiVar;
        this.d = zzcigVar;
        this.o = z;
        this.e = z2;
        zzcigVar.a(this);
        this.f = zzeajVar;
    }

    public final void C() {
        SurfaceTexture surfaceTexture;
        zzeaj zzeajVar;
        com.google.android.gms.ads.internal.util.zze.zza("AdMediaPlayerView init MediaPlayer");
        SurfaceTexture surfaceTexture2 = getSurfaceTexture();
        if (this.j == null || surfaceTexture2 == null) {
            return;
        }
        D(false);
        try {
            com.google.android.gms.ads.internal.zzt.zzv();
            MediaPlayer mediaPlayer = new MediaPlayer();
            this.i = mediaPlayer;
            mediaPlayer.setOnBufferingUpdateListener(this);
            this.i.setOnCompletionListener(this);
            this.i.setOnErrorListener(this);
            this.i.setOnInfoListener(this);
            this.i.setOnPreparedListener(this);
            this.i.setOnVideoSizeChangedListener(this);
            this.m = 0;
            if (this.o) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.cf)).booleanValue() && (zzeajVar = this.f) != null) {
                    zzeai a = zzeajVar.a();
                    a.b("action", "svp_ampv");
                    a.c();
                }
                zzcid zzcidVar = new zzcid(getContext());
                this.n = zzcidVar;
                int width = getWidth();
                int height = getHeight();
                zzcidVar.m = width;
                zzcidVar.l = height;
                zzcidVar.o = surfaceTexture2;
                zzcid zzcidVar2 = this.n;
                zzcidVar2.start();
                if (zzcidVar2.o == null) {
                    surfaceTexture = null;
                } else {
                    try {
                        zzcidVar2.t.await();
                    } catch (InterruptedException unused) {
                    }
                    surfaceTexture = zzcidVar2.n;
                }
                if (surfaceTexture != null) {
                    surfaceTexture2 = surfaceTexture;
                } else {
                    this.n.b();
                    this.n = null;
                }
            }
            this.i.setDataSource(getContext(), this.j);
            com.google.android.gms.ads.internal.zzt.zzw();
            this.i.setSurface(new Surface(surfaceTexture2));
            this.i.setAudioStreamType(3);
            this.i.setScreenOnWhilePlaying(true);
            this.i.prepareAsync();
            F(1);
        } catch (IOException e) {
            e = e;
            zzo.zzj("Failed to initialize MediaPlayer at ".concat(String.valueOf(this.j)), e);
            onError(this.i, 1, 0);
        } catch (IllegalArgumentException e2) {
            e = e2;
            zzo.zzj("Failed to initialize MediaPlayer at ".concat(String.valueOf(this.j)), e);
            onError(this.i, 1, 0);
        } catch (IllegalStateException e3) {
            e = e3;
            zzo.zzj("Failed to initialize MediaPlayer at ".concat(String.valueOf(this.j)), e);
            onError(this.i, 1, 0);
        }
    }

    public final void D(boolean z) {
        com.google.android.gms.ads.internal.util.zze.zza("AdMediaPlayerView release");
        zzcid zzcidVar = this.n;
        if (zzcidVar != null) {
            zzcidVar.b();
            this.n = null;
        }
        MediaPlayer mediaPlayer = this.i;
        if (mediaPlayer != null) {
            mediaPlayer.reset();
            this.i.release();
            this.i = null;
            F(0);
            if (z) {
                this.h = 0;
            }
        }
    }

    public final boolean E() {
        int i;
        return (this.i == null || (i = this.g) == -1 || i == 0 || i == 1) ? false : true;
    }

    public final void F(int i) {
        zzcij zzcijVar = this.b;
        zzcig zzcigVar = this.d;
        if (i == 3) {
            zzcigVar.d();
            zzcijVar.d = true;
            zzcijVar.a();
        } else if (this.g == 3) {
            zzcigVar.m = false;
            zzcijVar.d = false;
            zzcijVar.a();
        }
        this.g = i;
    }

    @Override // com.google.android.gms.internal.ads.zzchl
    public final String h() {
        return "MediaPlayer".concat(true != this.o ? "" : " spherical");
    }

    @Override // com.google.android.gms.internal.ads.zzchl
    public final void i(zzcht zzchtVar) {
        this.q = zzchtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzchl
    public final void j(String str) {
        Uri parse = Uri.parse(str);
        zzbhr Y0 = zzbhr.Y0(parse);
        if (Y0 == null || Y0.a != null) {
            if (Y0 != null) {
                parse = Uri.parse(Y0.a);
            }
            this.j = parse;
            this.p = 0;
            C();
            requestLayout();
            invalidate();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchl
    public final void k() {
        com.google.android.gms.ads.internal.util.zze.zza("AdMediaPlayerView stop");
        MediaPlayer mediaPlayer = this.i;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            this.i.release();
            this.i = null;
            F(0);
            this.h = 0;
        }
        this.d.b();
    }

    @Override // com.google.android.gms.internal.ads.zzchl
    public final void l() {
        com.google.android.gms.ads.internal.util.zze.zza("AdMediaPlayerView play");
        if (E()) {
            this.i.start();
            F(3);
            this.a.c = true;
            com.google.android.gms.ads.internal.util.zzs.zza.post(new psn(this, 3));
        }
        this.h = 3;
    }

    @Override // com.google.android.gms.internal.ads.zzchl
    public final void m() {
        com.google.android.gms.ads.internal.util.zze.zza("AdMediaPlayerView pause");
        if (E() && this.i.isPlaying()) {
            this.i.pause();
            F(4);
            com.google.android.gms.ads.internal.util.zzs.zza.post(new psn(this, 4));
        }
        this.h = 4;
    }

    @Override // com.google.android.gms.internal.ads.zzchl
    public final int n() {
        if (E()) {
            return this.i.getDuration();
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzchl
    public final int o() {
        if (E()) {
            return this.i.getCurrentPosition();
        }
        return 0;
    }

    @Override // android.view.TextureView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setSurfaceTextureListener(this);
    }

    @Override // android.media.MediaPlayer.OnBufferingUpdateListener
    public final void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
        this.m = i;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        com.google.android.gms.ads.internal.util.zze.zza("AdMediaPlayerView completion");
        F(5);
        this.h = 5;
        com.google.android.gms.ads.internal.util.zzs.zza.post(new psn(this, 0));
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        Integer valueOf = Integer.valueOf(i);
        HashMap hashMap = t;
        String str = (String) hashMap.get(valueOf);
        String str2 = (String) hashMap.get(Integer.valueOf(i2));
        String o = fc6.o(new StringBuilder(String.valueOf(str).length() + 38 + String.valueOf(str2).length()), "AdMediaPlayerView MediaPlayer error: ", str, ":", str2);
        int i3 = com.google.android.gms.ads.internal.util.zze.zza;
        zzo.zzi(o);
        F(-1);
        this.h = -1;
        com.google.android.gms.ads.internal.util.zzs.zza.post(new lv4(20, this, str, str2));
        return true;
    }

    @Override // android.media.MediaPlayer.OnInfoListener
    public final boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
        Integer valueOf = Integer.valueOf(i);
        HashMap hashMap = t;
        String str = (String) hashMap.get(valueOf);
        String str2 = (String) hashMap.get(Integer.valueOf(i2));
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 37 + String.valueOf(str2).length());
        sb.append("AdMediaPlayerView MediaPlayer info: ");
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x005f, code lost:
    
        if (r1 > r6) goto L31;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i, int i2) {
        int i3;
        int defaultSize = View.getDefaultSize(this.k, i);
        int defaultSize2 = View.getDefaultSize(this.l, i2);
        if (this.k > 0 && this.l > 0 && this.n == null) {
            int mode = View.MeasureSpec.getMode(i);
            int size = View.MeasureSpec.getSize(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            int size2 = View.MeasureSpec.getSize(i2);
            if (mode == 1073741824) {
                if (mode2 == 1073741824) {
                    int i4 = this.k;
                    int i5 = i4 * size2;
                    int i6 = this.l;
                    int i7 = size * i6;
                    if (i5 < i7) {
                        defaultSize = i5 / i6;
                        defaultSize2 = size2;
                    } else {
                        if (i5 > i7) {
                            defaultSize2 = i7 / i4;
                            defaultSize = size;
                        }
                        defaultSize = size;
                        defaultSize2 = size2;
                    }
                } else {
                    mode = 1073741824;
                }
            }
            if (mode == 1073741824) {
                int i8 = (this.l * size) / this.k;
                if (mode2 != Integer.MIN_VALUE || i8 <= size2) {
                    defaultSize2 = i8;
                    defaultSize = size;
                }
                defaultSize = size;
                defaultSize2 = size2;
            } else {
                int i9 = this.k;
                if (mode2 == 1073741824) {
                    i3 = (i9 * size2) / this.l;
                    if (mode == Integer.MIN_VALUE) {
                    }
                } else {
                    int i10 = this.l;
                    if (mode2 != Integer.MIN_VALUE || i10 <= size2) {
                        size2 = i10;
                        i3 = i9;
                    } else {
                        i3 = (size2 * i9) / i10;
                    }
                    if (mode == Integer.MIN_VALUE && i3 > size) {
                        defaultSize2 = (i10 * size) / i9;
                        defaultSize = size;
                    }
                }
                defaultSize = i3;
                defaultSize2 = size2;
            }
        }
        setMeasuredDimension(defaultSize, defaultSize2);
        zzcid zzcidVar = this.n;
        if (zzcidVar != null) {
            zzcidVar.a(defaultSize, defaultSize2);
        }
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        com.google.android.gms.ads.internal.util.zze.zza("AdMediaPlayerView prepared");
        F(2);
        zzcig zzcigVar = this.d;
        if (zzcigVar.i && !zzcigVar.j) {
            zzbjn.a(zzcigVar.e, zzcigVar.d, "vfr2");
            zzcigVar.j = true;
        }
        com.google.android.gms.ads.internal.util.zzs.zza.post(new bnn(this, mediaPlayer, false, 5));
        this.k = mediaPlayer.getVideoWidth();
        this.l = mediaPlayer.getVideoHeight();
        int i = this.p;
        if (i != 0) {
            p(i);
        }
        if (this.e && E() && this.i.getCurrentPosition() > 0 && this.h != 3) {
            com.google.android.gms.ads.internal.util.zze.zza("AdMediaPlayerView nudging MediaPlayer");
            MediaPlayer mediaPlayer2 = this.i;
            if (mediaPlayer2 != null) {
                try {
                    mediaPlayer2.setVolume(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                } catch (IllegalStateException unused) {
                }
            } else {
                zzo.zzi("AdMediaPlayerView setMediaPlayerVolume() called before onPrepared().");
            }
            this.i.start();
            int currentPosition = this.i.getCurrentPosition();
            long a = com.google.android.gms.ads.internal.zzt.zzk().a();
            while (E() && this.i.getCurrentPosition() == currentPosition && com.google.android.gms.ads.internal.zzt.zzk().a() - a <= 250) {
            }
            this.i.pause();
            x();
        }
        int i2 = this.k;
        int i3 = this.l;
        StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 40 + String.valueOf(i3).length());
        sb.append("AdMediaPlayerView stream dimensions: ");
        sb.append(i2);
        sb.append(" x ");
        sb.append(i3);
        zzo.zzh(sb.toString());
        if (this.h == 3) {
            l();
        }
        x();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        com.google.android.gms.ads.internal.util.zze.zza("AdMediaPlayerView surface created");
        C();
        com.google.android.gms.ads.internal.util.zzs.zza.post(new psn(this, 1));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        com.google.android.gms.ads.internal.util.zze.zza("AdMediaPlayerView surface destroyed");
        MediaPlayer mediaPlayer = this.i;
        if (mediaPlayer != null && this.p == 0) {
            this.p = mediaPlayer.getCurrentPosition();
        }
        zzcid zzcidVar = this.n;
        if (zzcidVar != null) {
            zzcidVar.b();
        }
        com.google.android.gms.ads.internal.util.zzs.zza.post(new psn(this, 2));
        D(true);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        com.google.android.gms.ads.internal.util.zze.zza("AdMediaPlayerView surface changed");
        int i3 = this.h;
        int i4 = 0;
        boolean z = this.k == i && this.l == i2;
        if (this.i != null && i3 == 3 && z) {
            int i5 = this.p;
            if (i5 != 0) {
                p(i5);
            }
            l();
        }
        zzcid zzcidVar = this.n;
        if (zzcidVar != null) {
            zzcidVar.a(i, i2);
        }
        com.google.android.gms.ads.internal.util.zzs.zza.post(new qsn(this, i, i2, i4));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.d.c(this);
        this.a.a(surfaceTexture, this.q);
    }

    @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
    public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 35 + String.valueOf(i2).length());
        sb.append("AdMediaPlayerView size changed: ");
        sb.append(i);
        sb.append(" x ");
        sb.append(i2);
        com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
        this.k = mediaPlayer.getVideoWidth();
        int videoHeight = mediaPlayer.getVideoHeight();
        this.l = videoHeight;
        if (this.k == 0 || videoHeight == 0) {
            return;
        }
        requestLayout();
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 47);
        sb.append("AdMediaPlayerView window visibility changed to ");
        sb.append(i);
        com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
        com.google.android.gms.ads.internal.util.zzs.zza.post(new q61(this, i, 8));
        super.onWindowVisibilityChanged(i);
    }

    @Override // com.google.android.gms.internal.ads.zzchl
    public final void p(int i) {
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 23);
        sb.append("AdMediaPlayerView seek ");
        sb.append(i);
        com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
        if (!E()) {
            this.p = i;
        } else {
            this.i.seekTo(i);
            this.p = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchl
    public final void q(float f, float f2) {
        zzcid zzcidVar = this.n;
        if (zzcidVar != null) {
            zzcidVar.c(f, f2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchl
    public final int r() {
        MediaPlayer mediaPlayer = this.i;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoWidth();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzchl
    public final int s() {
        MediaPlayer mediaPlayer = this.i;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoHeight();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzchl
    public final long t() {
        if (this.s != null) {
            return (v() * this.m) / 100;
        }
        return -1L;
    }

    @Override // android.view.View
    public final String toString() {
        String name = zzchj.class.getName();
        String hexString = Integer.toHexString(hashCode());
        return wt3.m(name, "@", new StringBuilder(name.length() + 1 + String.valueOf(hexString).length()), hexString);
    }

    @Override // com.google.android.gms.internal.ads.zzchl
    public final long u() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzchl
    public final long v() {
        if (this.s != null) {
            return n() * this.s.intValue();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzchl
    public final int w() {
        if (E()) {
            return this.i.getMetrics().getInt("android.media.mediaplayer.dropped");
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzchl
    public final void x() {
        zzcij zzcijVar = this.b;
        boolean z = zzcijVar.e;
        float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        float f2 = z ? 0.0f : zzcijVar.f;
        if (zzcijVar.c) {
            f = f2;
        }
        MediaPlayer mediaPlayer = this.i;
        if (mediaPlayer != null) {
            try {
                mediaPlayer.setVolume(f, f);
            } catch (IllegalStateException unused) {
            }
        } else {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzi("AdMediaPlayerView setMediaPlayerVolume() called before onPrepared().");
        }
    }
}
