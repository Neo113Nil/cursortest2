package com.google.android.gms.ads;

import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzea;
import com.google.android.gms.ads.internal.client.zzfv;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.common.annotation.KeepForSdk;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class VideoController {

    @KeepForSdk
    public static final int PLAYBACK_STATE_ENDED = 3;

    @KeepForSdk
    public static final int PLAYBACK_STATE_PAUSED = 2;

    @KeepForSdk
    public static final int PLAYBACK_STATE_PLAYING = 1;

    @KeepForSdk
    public static final int PLAYBACK_STATE_READY = 5;

    @KeepForSdk
    public static final int PLAYBACK_STATE_UNKNOWN = 0;
    public final Object a = new Object();
    public zzea b;
    public VideoLifecycleCallbacks c;

    @KeepForSdk
    public int getPlaybackState() {
        synchronized (this.a) {
            zzea zzeaVar = this.b;
            if (zzeaVar == null) {
                return 0;
            }
            try {
                return zzeaVar.zzi();
            } catch (RemoteException e) {
                zzo.zzg("Unable to call getPlaybackState on video controller.", e);
                return 0;
            }
        }
    }

    @Nullable
    public VideoLifecycleCallbacks getVideoLifecycleCallbacks() {
        VideoLifecycleCallbacks videoLifecycleCallbacks;
        synchronized (this.a) {
            videoLifecycleCallbacks = this.c;
        }
        return videoLifecycleCallbacks;
    }

    public boolean hasVideoContent() {
        boolean z;
        synchronized (this.a) {
            z = this.b != null;
        }
        return z;
    }

    public boolean isClickToExpandEnabled() {
        synchronized (this.a) {
            zzea zzeaVar = this.b;
            if (zzeaVar == null) {
                return false;
            }
            try {
                return zzeaVar.zzp();
            } catch (RemoteException e) {
                zzo.zzg("Unable to call isClickToExpandEnabled.", e);
                return false;
            }
        }
    }

    public boolean isCustomControlsEnabled() {
        synchronized (this.a) {
            zzea zzeaVar = this.b;
            if (zzeaVar == null) {
                return false;
            }
            try {
                return zzeaVar.zzn();
            } catch (RemoteException e) {
                zzo.zzg("Unable to call isUsingCustomPlayerControls.", e);
                return false;
            }
        }
    }

    public boolean isMuted() {
        synchronized (this.a) {
            zzea zzeaVar = this.b;
            if (zzeaVar == null) {
                return true;
            }
            try {
                return zzeaVar.zzh();
            } catch (RemoteException e) {
                zzo.zzg("Unable to call isMuted on video controller.", e);
                return true;
            }
        }
    }

    public void mute(boolean z) {
        synchronized (this.a) {
            zzea zzeaVar = this.b;
            if (zzeaVar == null) {
                return;
            }
            try {
                zzeaVar.zzg(z);
            } catch (RemoteException e) {
                zzo.zzg("Unable to call mute on video controller.", e);
            }
        }
    }

    public void pause() {
        synchronized (this.a) {
            zzea zzeaVar = this.b;
            if (zzeaVar == null) {
                return;
            }
            try {
                zzeaVar.zzf();
            } catch (RemoteException e) {
                zzo.zzg("Unable to call pause on video controller.", e);
            }
        }
    }

    public void play() {
        synchronized (this.a) {
            zzea zzeaVar = this.b;
            if (zzeaVar == null) {
                return;
            }
            try {
                zzeaVar.zze();
            } catch (RemoteException e) {
                zzo.zzg("Unable to call play on video controller.", e);
            }
        }
    }

    public void setVideoLifecycleCallbacks(@Nullable VideoLifecycleCallbacks videoLifecycleCallbacks) {
        zzfv zzfvVar;
        synchronized (this.a) {
            this.c = videoLifecycleCallbacks;
            zzea zzeaVar = this.b;
            if (zzeaVar == null) {
                return;
            }
            if (videoLifecycleCallbacks == null) {
                zzfvVar = null;
            } else {
                try {
                    zzfvVar = new zzfv(videoLifecycleCallbacks);
                } catch (RemoteException e) {
                    zzo.zzg("Unable to call setVideoLifecycleCallbacks on video controller.", e);
                }
            }
            zzeaVar.zzl(zzfvVar);
        }
    }

    public void stop() {
        synchronized (this.a) {
            zzea zzeaVar = this.b;
            if (zzeaVar == null) {
                return;
            }
            try {
                zzeaVar.zzq();
            } catch (RemoteException e) {
                zzo.zzg("Unable to call stop on video controller.", e);
            }
        }
    }

    public final void zza(@Nullable zzea zzeaVar) {
        synchronized (this.a) {
            try {
                this.b = zzeaVar;
                VideoLifecycleCallbacks videoLifecycleCallbacks = this.c;
                if (videoLifecycleCallbacks != null) {
                    setVideoLifecycleCallbacks(videoLifecycleCallbacks);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Nullable
    public final zzea zzb() {
        zzea zzeaVar;
        synchronized (this.a) {
            zzeaVar = this.b;
        }
        return zzeaVar;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static abstract class VideoLifecycleCallbacks {
        public void onVideoEnd() {
        }

        public void onVideoPause() {
        }

        public void onVideoPlay() {
        }

        public void onVideoStart() {
        }

        public void onVideoMute(boolean z) {
        }
    }
}
