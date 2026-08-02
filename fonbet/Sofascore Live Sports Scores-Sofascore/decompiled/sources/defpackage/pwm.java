package defpackage;

import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import android.view.Surface;
import com.ironsource.U3;
import java.lang.reflect.Field;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class pwm implements qem {
    public lem a;
    public hem b;
    public dem c;
    public mem d;
    public gem e;
    public xdm f;
    public aem g;
    public boolean h = false;
    public final MediaPlayer i;
    public final gwm j;
    public htm k;
    public Surface l;
    public final Object m;
    public volatile boolean n;

    public pwm() {
        MediaPlayer mediaPlayer;
        Object obj = new Object();
        this.m = obj;
        synchronized (obj) {
            mediaPlayer = new MediaPlayer();
            this.i = mediaPlayer;
        }
        if (Build.VERSION.SDK_INT < 28) {
            try {
                Class<?> cls = Class.forName("android.media.MediaTimeProvider");
                Class<?> cls2 = Class.forName("android.media.SubtitleController");
                Class<?> cls3 = Class.forName("android.media.SubtitleController$Anchor");
                Object newInstance = cls2.getConstructor(Context.class, cls, Class.forName("android.media.SubtitleController$Listener")).newInstance(tem.a, null, null);
                Field declaredField = cls2.getDeclaredField("mHandler");
                declaredField.setAccessible(true);
                try {
                    declaredField.set(newInstance, new Handler());
                    declaredField.setAccessible(false);
                    mediaPlayer.getClass().getMethod("setSubtitleAnchor", cls2, cls3).invoke(mediaPlayer, newInstance, null);
                } catch (Throwable unused) {
                    declaredField.setAccessible(false);
                }
            } catch (Throwable unused2) {
            }
        }
        try {
            this.i.setAudioStreamType(3);
        } catch (Throwable unused3) {
        }
        this.j = new gwm(this);
        a();
    }

    public final void a() {
        MediaPlayer mediaPlayer = this.i;
        gwm gwmVar = this.j;
        mediaPlayer.setOnPreparedListener(gwmVar);
        mediaPlayer.setOnBufferingUpdateListener(gwmVar);
        mediaPlayer.setOnCompletionListener(gwmVar);
        mediaPlayer.setOnSeekCompleteListener(gwmVar);
        mediaPlayer.setOnVideoSizeChangedListener(gwmVar);
        mediaPlayer.setOnErrorListener(gwmVar);
        mediaPlayer.setOnInfoListener(gwmVar);
    }

    public final void b(long j, int i) {
        MediaPlayer mediaPlayer = this.i;
        if (i == 0) {
            mediaPlayer.seekTo((int) j, 0);
            return;
        }
        if (i == 1) {
            mediaPlayer.seekTo((int) j, 1);
            return;
        }
        if (i == 2) {
            mediaPlayer.seekTo((int) j, 2);
        } else if (i != 3) {
            mediaPlayer.seekTo((int) j);
        } else {
            mediaPlayer.seekTo((int) j, 3);
        }
    }

    public final void c(String str) {
        Uri parse = Uri.parse(str);
        String scheme = parse.getScheme();
        boolean isEmpty = TextUtils.isEmpty(scheme);
        MediaPlayer mediaPlayer = this.i;
        if (isEmpty || !scheme.equalsIgnoreCase(U3.i.b)) {
            mediaPlayer.setDataSource(str);
        } else {
            mediaPlayer.setDataSource(parse.getPath());
        }
    }

    public final void d() {
        this.a = null;
        this.c = null;
        this.b = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
    }

    public final void finalize() {
        super.finalize();
        try {
            Surface surface = this.l;
            if (surface != null) {
                surface.release();
                this.l = null;
            }
        } catch (Throwable unused) {
        }
    }
}
