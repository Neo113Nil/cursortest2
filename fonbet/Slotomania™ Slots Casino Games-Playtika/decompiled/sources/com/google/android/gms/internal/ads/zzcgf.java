package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.internal.partials.AdMobVideoBridge;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.h;
import io.sentry.rrweb.RRWebVideoEvent;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes8.dex */
public final class zzcgf extends zzcgh implements TextureView.SurfaceTextureListener, MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnVideoSizeChangedListener {
    private static final Map zzc;
    private final zzchb zzd;
    private final zzchc zze;
    private final boolean zzf;
    private final zzdyz zzg;
    private int zzh;
    private int zzi;
    private MediaPlayer zzj;
    private Uri zzk;
    private int zzl;
    private int zzm;
    private int zzn;
    private zzcgz zzo;
    private final boolean zzp;
    private int zzq;
    private zzcgg zzr;
    private boolean zzs;
    private Integer zzt;

    static {
        HashMap hashMap = new HashMap();
        zzc = hashMap;
        hashMap.put(-1004, "MEDIA_ERROR_IO");
        hashMap.put(-1007, "MEDIA_ERROR_MALFORMED");
        hashMap.put(-1010, "MEDIA_ERROR_UNSUPPORTED");
        hashMap.put(-110, "MEDIA_ERROR_TIMED_OUT");
        hashMap.put(3, "MEDIA_INFO_VIDEO_RENDERING_START");
        hashMap.put(100, "MEDIA_ERROR_SERVER_DIED");
        hashMap.put(1, "MEDIA_ERROR_UNKNOWN");
        hashMap.put(1, "MEDIA_INFO_UNKNOWN");
        hashMap.put(700, "MEDIA_INFO_VIDEO_TRACK_LAGGING");
        hashMap.put(701, "MEDIA_INFO_BUFFERING_START");
        hashMap.put(702, "MEDIA_INFO_BUFFERING_END");
        hashMap.put(800, "MEDIA_INFO_BAD_INTERLEAVING");
        hashMap.put(801, "MEDIA_INFO_NOT_SEEKABLE");
        hashMap.put(802, "MEDIA_INFO_METADATA_UPDATE");
        hashMap.put(Integer.valueOf(TypedValues.Custom.TYPE_FLOAT), "MEDIA_INFO_UNSUPPORTED_SUBTITLE");
        hashMap.put(Integer.valueOf(TypedValues.Custom.TYPE_COLOR), "MEDIA_INFO_SUBTITLE_TIMED_OUT");
    }

    public zzcgf(Context context, zzchb zzchbVar, boolean z, boolean z2, zzcha zzchaVar, zzchc zzchcVar, zzdyz zzdyzVar) {
        super(context);
        this.zzh = 0;
        this.zzi = 0;
        this.zzs = false;
        this.zzt = null;
        this.zzd = zzchbVar;
        this.zze = zzchcVar;
        this.zzp = z;
        this.zzf = z2;
        zzchcVar.zza(this);
        this.zzg = zzdyzVar;
    }

    private final void zzD() {
        zzdyz zzdyzVar;
        com.google.android.gms.ads.internal.util.zze.zza("AdMediaPlayerView init MediaPlayer");
        SurfaceTexture surfaceTexture = getSurfaceTexture();
        if (this.zzk == null || surfaceTexture == null) {
            return;
        }
        zzE(false);
        try {
            com.google.android.gms.ads.internal.zzt.zzv();
            MediaPlayer mediaPlayer = new MediaPlayer();
            this.zzj = mediaPlayer;
            mediaPlayer.setOnBufferingUpdateListener(this);
            this.zzj.setOnCompletionListener(this);
            this.zzj.setOnErrorListener(this);
            this.zzj.setOnInfoListener(this);
            this.zzj.setOnPreparedListener(this);
            this.zzj.setOnVideoSizeChangedListener(this);
            this.zzn = 0;
            if (this.zzp) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzoJ)).booleanValue() && (zzdyzVar = this.zzg) != null) {
                    zzdyy zza = zzdyzVar.zza();
                    zza.zzc("action", "svp_ampv");
                    zza.zzd();
                }
                zzcgz zzcgzVar = new zzcgz(getContext());
                this.zzo = zzcgzVar;
                zzcgzVar.zzb(surfaceTexture, getWidth(), getHeight());
                zzcgz zzcgzVar2 = this.zzo;
                zzcgzVar2.start();
                SurfaceTexture zze = zzcgzVar2.zze();
                if (zze != null) {
                    surfaceTexture = zze;
                } else {
                    this.zzo.zzd();
                    this.zzo = null;
                }
            }
            AdMobVideoBridge.MediaPlayerSetDataSource(this.zzj, getContext(), this.zzk);
            com.google.android.gms.ads.internal.zzt.zzw();
            AdMobVideoBridge.MediaPlayerSetSurface(this.zzj, new Surface(surfaceTexture));
            this.zzj.setAudioStreamType(3);
            this.zzj.setScreenOnWhilePlaying(true);
            this.zzj.prepareAsync();
            zzH(1);
        } catch (IOException | IllegalArgumentException | IllegalStateException e) {
            String valueOf = String.valueOf(this.zzk);
            String.valueOf(valueOf);
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to initialize MediaPlayer at ".concat(String.valueOf(valueOf)), e);
            onError(this.zzj, 1, 0);
        }
    }

    private final void zzE(boolean z) {
        com.google.android.gms.ads.internal.util.zze.zza("AdMediaPlayerView release");
        zzcgz zzcgzVar = this.zzo;
        if (zzcgzVar != null) {
            zzcgzVar.zzd();
            this.zzo = null;
        }
        MediaPlayer mediaPlayer = this.zzj;
        if (mediaPlayer != null) {
            mediaPlayer.reset();
            AdMobVideoBridge.MediaPlayerRelease(this.zzj);
            this.zzj = null;
            zzH(0);
            if (z) {
                this.zzi = 0;
            }
        }
    }

    private final boolean zzF() {
        int i;
        return (this.zzj == null || (i = this.zzh) == -1 || i == 0 || i == 1) ? false : true;
    }

    private final void zzG(float f) {
        MediaPlayer mediaPlayer = this.zzj;
        if (mediaPlayer != null) {
            try {
                mediaPlayer.setVolume(f, f);
            } catch (IllegalStateException unused) {
            }
        } else {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("AdMediaPlayerView setMediaPlayerVolume() called before onPrepared().");
        }
    }

    private final void zzH(int i) {
        if (i == 3) {
            this.zze.zze();
            this.zzb.zzd();
        } else if (this.zzh == 3) {
            this.zze.zzf();
            this.zzb.zze();
        }
        this.zzh = i;
    }

    @Override // com.google.android.gms.internal.ads.zzcgh, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch(h.h, this, me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // android.view.TextureView, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setSurfaceTextureListener(this);
    }

    @Override // android.media.MediaPlayer.OnBufferingUpdateListener
    public final void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
        this.zzn = i;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        Logger.d("AdMob|SafeDK: Execution> Lcom/google/android/gms/internal/ads/zzcgf;->onCompletion(Landroid/media/MediaPlayer;)V");
        CreativeInfoManager.onVideoCompleted(h.h, mediaPlayer, "media-player");
        safedk_zzcgf_onCompletion_f2a1820d702a7ee1008225a37013ebd6(mediaPlayer);
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        Map map = zzc;
        String str = (String) map.get(Integer.valueOf(i));
        String str2 = (String) map.get(Integer.valueOf(i2));
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 38 + String.valueOf(str2).length());
        sb.append("AdMediaPlayerView MediaPlayer error: ");
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        String sb2 = sb.toString();
        int i3 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi(sb2);
        zzH(-1);
        this.zzi = -1;
        com.google.android.gms.ads.internal.util.zzs.zza.post(new zzcfy(this, str, str2));
        return true;
    }

    @Override // android.media.MediaPlayer.OnInfoListener
    public final boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
        Map map = zzc;
        String str = (String) map.get(Integer.valueOf(i));
        String str2 = (String) map.get(Integer.valueOf(i2));
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 37 + String.valueOf(str2).length());
        sb.append("AdMediaPlayerView MediaPlayer info: ");
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x005e, code lost:
    
        if (r1 > r6) goto L30;
     */
    @Override // com.google.android.gms.internal.ads.zzcgh, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final void onMeasure(int i, int i2) {
        int i3;
        int defaultSize = getDefaultSize(this.zzl, i);
        int defaultSize2 = getDefaultSize(this.zzm, i2);
        if (this.zzl > 0 && this.zzm > 0 && this.zzo == null) {
            int mode = View.MeasureSpec.getMode(i);
            int size = View.MeasureSpec.getSize(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            int size2 = View.MeasureSpec.getSize(i2);
            if (mode == 1073741824) {
                if (mode2 == 1073741824) {
                    int i4 = this.zzl;
                    int i5 = i4 * size2;
                    int i6 = this.zzm;
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
                int i8 = (this.zzm * size) / this.zzl;
                if (mode2 != Integer.MIN_VALUE || i8 <= size2) {
                    defaultSize2 = i8;
                    defaultSize = size;
                }
                defaultSize = size;
                defaultSize2 = size2;
            } else {
                if (mode2 == 1073741824) {
                    i3 = (this.zzl * size2) / this.zzm;
                    if (mode == Integer.MIN_VALUE) {
                    }
                } else {
                    int i9 = this.zzl;
                    int i10 = this.zzm;
                    if (mode2 != Integer.MIN_VALUE || i10 <= size2) {
                        i3 = i9;
                        size2 = i10;
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
        zzcgz zzcgzVar = this.zzo;
        if (zzcgzVar != null) {
            zzcgzVar.zzc(defaultSize, defaultSize2);
        }
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        com.google.android.gms.ads.internal.util.zze.zza("AdMediaPlayerView prepared");
        zzH(2);
        this.zze.zzb();
        com.google.android.gms.ads.internal.util.zzs.zza.post(new zzcfw(this, mediaPlayer));
        this.zzl = mediaPlayer.getVideoWidth();
        this.zzm = mediaPlayer.getVideoHeight();
        int i = this.zzq;
        if (i != 0) {
            zzi(i);
        }
        if (this.zzf && zzF() && this.zzj.getCurrentPosition() > 0 && this.zzi != 3) {
            com.google.android.gms.ads.internal.util.zze.zza("AdMediaPlayerView nudging MediaPlayer");
            zzG(0.0f);
            AdMobVideoBridge.MediaPlayerStart(this.zzj);
            int currentPosition = this.zzj.getCurrentPosition();
            long currentTimeMillis = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
            while (zzF() && this.zzj.getCurrentPosition() == currentPosition && com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() - currentTimeMillis <= 250) {
            }
            AdMobVideoBridge.MediaPlayerPause(this.zzj);
            zzq();
        }
        int i2 = this.zzl;
        int i3 = this.zzm;
        StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 40 + String.valueOf(i3).length());
        sb.append("AdMediaPlayerView stream dimensions: ");
        sb.append(i2);
        sb.append(" x ");
        sb.append(i3);
        com.google.android.gms.ads.internal.util.client.zzo.zzh(sb.toString());
        if (this.zzi == 3) {
            zze();
        }
        zzq();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        com.google.android.gms.ads.internal.util.zze.zza("AdMediaPlayerView surface created");
        zzD();
        com.google.android.gms.ads.internal.util.zzs.zza.post(new zzcfz(this));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        com.google.android.gms.ads.internal.util.zze.zza("AdMediaPlayerView surface destroyed");
        MediaPlayer mediaPlayer = this.zzj;
        if (mediaPlayer != null && this.zzq == 0) {
            this.zzq = mediaPlayer.getCurrentPosition();
        }
        zzcgz zzcgzVar = this.zzo;
        if (zzcgzVar != null) {
            zzcgzVar.zzd();
        }
        com.google.android.gms.ads.internal.util.zzs.zza.post(new zzcgb(this));
        zzE(true);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        com.google.android.gms.ads.internal.util.zze.zza("AdMediaPlayerView surface changed");
        int i3 = this.zzi;
        boolean z = false;
        if (this.zzl == i && this.zzm == i2) {
            z = true;
        }
        if (this.zzj != null && i3 == 3 && z) {
            int i4 = this.zzq;
            if (i4 != 0) {
                zzi(i4);
            }
            zze();
        }
        zzcgz zzcgzVar = this.zzo;
        if (zzcgzVar != null) {
            zzcgzVar.zzc(i, i2);
        }
        com.google.android.gms.ads.internal.util.zzs.zza.post(new zzcga(this, i, i2));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.zze.zzd(this);
        this.zza.zzb(surfaceTexture, this.zzr);
    }

    @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
    public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 35 + String.valueOf(i2).length());
        sb.append("AdMediaPlayerView size changed: ");
        sb.append(i);
        sb.append(" x ");
        sb.append(i2);
        com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
        this.zzl = mediaPlayer.getVideoWidth();
        int videoHeight = mediaPlayer.getVideoHeight();
        this.zzm = videoHeight;
        if (this.zzl == 0 || videoHeight == 0) {
            return;
        }
        requestLayout();
    }

    @Override // android.view.View
    protected final void onWindowVisibilityChanged(final int i) {
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 47);
        sb.append("AdMediaPlayerView window visibility changed to ");
        sb.append(i);
        com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcge
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzcgf.this.zzr(i);
            }
        });
        super.onWindowVisibilityChanged(i);
    }

    public void safedk_zzcgf_onCompletion_f2a1820d702a7ee1008225a37013ebd6(MediaPlayer p0) {
        com.google.android.gms.ads.internal.util.zze.zza("AdMediaPlayerView completion");
        zzH(5);
        this.zzi = 5;
        com.google.android.gms.ads.internal.util.zzs.zza.post(new zzcfx(this));
    }

    @Override // android.view.View
    public final String toString() {
        String name = getClass().getName();
        String hexString = Integer.toHexString(hashCode());
        StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 1 + String.valueOf(hexString).length());
        sb.append(name);
        sb.append("@");
        sb.append(hexString);
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzcgh
    public final String zza() {
        return "MediaPlayer".concat(true != this.zzp ? "" : " spherical");
    }

    @Override // com.google.android.gms.internal.ads.zzcgh
    public final void zzb(zzcgg zzcggVar) {
        this.zzr = zzcggVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcgh
    public final void zzc(String str) {
        Uri parse = Uri.parse(str);
        zzbgp zza = zzbgp.zza(parse);
        if (zza == null || zza.zza != null) {
            if (zza != null) {
                parse = Uri.parse(zza.zza);
            }
            this.zzk = parse;
            this.zzq = 0;
            zzD();
            requestLayout();
            invalidate();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgh
    public final void zzd() {
        com.google.android.gms.ads.internal.util.zze.zza("AdMediaPlayerView stop");
        MediaPlayer mediaPlayer = this.zzj;
        if (mediaPlayer != null) {
            AdMobVideoBridge.MediaPlayerStop(mediaPlayer);
            AdMobVideoBridge.MediaPlayerRelease(this.zzj);
            this.zzj = null;
            zzH(0);
            this.zzi = 0;
        }
        this.zze.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzcgh
    public final void zze() {
        com.google.android.gms.ads.internal.util.zze.zza("AdMediaPlayerView play");
        if (zzF()) {
            AdMobVideoBridge.MediaPlayerStart(this.zzj);
            zzH(3);
            this.zza.zza();
            com.google.android.gms.ads.internal.util.zzs.zza.post(new zzcgc(this));
        }
        this.zzi = 3;
    }

    @Override // com.google.android.gms.internal.ads.zzcgh
    public final void zzf() {
        com.google.android.gms.ads.internal.util.zze.zza("AdMediaPlayerView pause");
        if (zzF() && this.zzj.isPlaying()) {
            AdMobVideoBridge.MediaPlayerPause(this.zzj);
            zzH(4);
            com.google.android.gms.ads.internal.util.zzs.zza.post(new zzcgd(this));
        }
        this.zzi = 4;
    }

    @Override // com.google.android.gms.internal.ads.zzcgh
    public final int zzg() {
        if (zzF()) {
            return this.zzj.getDuration();
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzcgh
    public final int zzh() {
        if (zzF()) {
            return this.zzj.getCurrentPosition();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcgh
    public final void zzi(int i) {
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 23);
        sb.append("AdMediaPlayerView seek ");
        sb.append(i);
        com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
        if (!zzF()) {
            this.zzq = i;
        } else {
            this.zzj.seekTo(i);
            this.zzq = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgh
    public final void zzj(float f, float f2) {
        zzcgz zzcgzVar = this.zzo;
        if (zzcgzVar != null) {
            zzcgzVar.zzf(f, f2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgh
    public final int zzk() {
        MediaPlayer mediaPlayer = this.zzj;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoWidth();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcgh
    public final int zzl() {
        MediaPlayer mediaPlayer = this.zzj;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoHeight();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcgh
    public final long zzm() {
        if (this.zzt != null) {
            return (zzo() * this.zzn) / 100;
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzcgh
    public final long zzn() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzcgh
    public final long zzo() {
        if (this.zzt != null) {
            return zzg() * this.zzt.intValue();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzcgh
    public final int zzp() {
        if (Build.VERSION.SDK_INT < 26 || !zzF()) {
            return -1;
        }
        return this.zzj.getMetrics().getInt("android.media.mediaplayer.dropped");
    }

    @Override // com.google.android.gms.internal.ads.zzcgh, com.google.android.gms.internal.ads.zzche
    public final void zzq() {
        zzG(this.zzb.zzc());
    }

    final /* synthetic */ void zzr(int i) {
        zzcgg zzcggVar = this.zzr;
        if (zzcggVar != null) {
            zzcggVar.onWindowVisibilityChanged(i);
        }
    }

    final /* synthetic */ void zzs(MediaPlayer mediaPlayer) {
        MediaFormat format;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzcB)).booleanValue() || this.zzd == null || mediaPlayer == null) {
            return;
        }
        try {
            MediaPlayer.TrackInfo[] trackInfo = mediaPlayer.getTrackInfo();
            if (trackInfo != null) {
                HashMap hashMap = new HashMap();
                for (MediaPlayer.TrackInfo trackInfo2 : trackInfo) {
                    if (trackInfo2 != null) {
                        int trackType = trackInfo2.getTrackType();
                        if (trackType == 1) {
                            MediaFormat format2 = trackInfo2.getFormat();
                            if (format2 != null) {
                                if (format2.containsKey("frame-rate")) {
                                    try {
                                        hashMap.put(RRWebVideoEvent.JsonKeys.FRAME_RATE, String.valueOf(format2.getFloat("frame-rate")));
                                    } catch (ClassCastException unused) {
                                        hashMap.put(RRWebVideoEvent.JsonKeys.FRAME_RATE, String.valueOf(format2.getInteger("frame-rate")));
                                    }
                                }
                                if (format2.containsKey("bitrate")) {
                                    Integer valueOf = Integer.valueOf(format2.getInteger("bitrate"));
                                    this.zzt = valueOf;
                                    hashMap.put("bitRate", String.valueOf(valueOf));
                                }
                                if (format2.containsKey("width") && format2.containsKey("height")) {
                                    int integer = format2.getInteger("width");
                                    int integer2 = format2.getInteger("height");
                                    StringBuilder sb = new StringBuilder(String.valueOf(integer).length() + 1 + String.valueOf(integer2).length());
                                    sb.append(integer);
                                    sb.append("x");
                                    sb.append(integer2);
                                    hashMap.put("resolution", sb.toString());
                                }
                                if (format2.containsKey("mime")) {
                                    hashMap.put("videoMime", format2.getString("mime"));
                                }
                                if (Build.VERSION.SDK_INT >= 30 && format2.containsKey("codecs-string")) {
                                    hashMap.put("videoCodec", format2.getString("codecs-string"));
                                }
                            }
                        } else if (trackType == 2 && (format = trackInfo2.getFormat()) != null) {
                            if (format.containsKey("mime")) {
                                hashMap.put("audioMime", format.getString("mime"));
                            }
                            if (Build.VERSION.SDK_INT >= 30 && format.containsKey("codecs-string")) {
                                hashMap.put("audioCodec", format.getString("codecs-string"));
                            }
                        }
                    }
                }
                if (hashMap.isEmpty()) {
                    return;
                }
                this.zzd.zze("onMetadataEvent", hashMap);
            }
        } catch (RuntimeException e) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "AdMediaPlayerView.reportMetadata");
        }
    }

    final /* synthetic */ zzcgg zzt() {
        return this.zzr;
    }

    final /* synthetic */ boolean zzu() {
        return this.zzs;
    }

    final /* synthetic */ void zzv(boolean z) {
        this.zzs = true;
    }
}
