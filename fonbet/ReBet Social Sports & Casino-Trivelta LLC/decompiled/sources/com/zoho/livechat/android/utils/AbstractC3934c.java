package com.zoho.livechat.android.utils;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import com.zoho.livechat.android.provider.MobilistenInitProvider;
import com.zoho.livechat.android.utils.AbstractC3935d;
import java.util.Timer;
import java.util.TimerTask;

/* renamed from: com.zoho.livechat.android.utils.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3934c {

    /* renamed from: a, reason: collision with root package name */
    public static String f44507a;

    /* renamed from: b, reason: collision with root package name */
    public static MediaPlayer f44508b;

    /* renamed from: c, reason: collision with root package name */
    public static Timer f44509c;

    /* renamed from: d, reason: collision with root package name */
    public static TimerTask f44510d;

    /* renamed from: e, reason: collision with root package name */
    public static final Handler f44511e = new Handler(Looper.getMainLooper());

    /* renamed from: f, reason: collision with root package name */
    public static final Object f44512f = new Object();

    /* renamed from: g, reason: collision with root package name */
    public static String f44513g = null;

    /* renamed from: com.zoho.livechat.android.utils.c$a */
    public class a extends Thread {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f44514a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f44515b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Uri f44516c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f44517d;

        /* renamed from: com.zoho.livechat.android.utils.c$a$a, reason: collision with other inner class name */
        public class C0646a implements MediaPlayer.OnPreparedListener {
            public C0646a() {
            }

            @Override // android.media.MediaPlayer.OnPreparedListener
            public void onPrepared(MediaPlayer mediaPlayer) {
                int i10 = a.this.f44515b;
                if (i10 == -1) {
                    i10 = 0;
                }
                mediaPlayer.seekTo(i10);
                mediaPlayer.start();
                String unused = AbstractC3934c.f44507a = a.this.f44514a;
                AbstractC3934c.f44513g = a.this.f44517d;
                AbstractC3934c.p();
            }
        }

        public a(String str, int i10, Uri uri, String str2) {
            this.f44514a = str;
            this.f44515b = i10;
            this.f44516c = uri;
            this.f44517d = str2;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            if (this.f44514a.equals(AbstractC3934c.f44507a) && AbstractC3934c.f44508b != null) {
                if (this.f44515b == -1) {
                    AbstractC3934c.f44508b.pause();
                    AbstractC3934c.q();
                    return;
                } else {
                    AbstractC3934c.f44508b.seekTo(this.f44515b);
                    AbstractC3934c.f44508b.start();
                    AbstractC3934c.q();
                    AbstractC3934c.p();
                    return;
                }
            }
            AbstractC3934c.i();
            try {
                MediaPlayer unused = AbstractC3934c.f44508b = new MediaPlayer();
                AbstractC3934c.f44508b.setAudioStreamType(3);
                AbstractC3934c.f44508b.setDataSource(MobilistenInitProvider.k(), this.f44516c);
                AbstractC3934c.f44508b.setOnPreparedListener(new C0646a());
                AbstractC3934c.f44508b.prepareAsync();
            } catch (Exception e10) {
                LiveChatUtil.log(e10);
            }
        }
    }

    /* renamed from: com.zoho.livechat.android.utils.c$b */
    public class b extends TimerTask {

        /* renamed from: com.zoho.livechat.android.utils.c$b$a */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                AbstractC3935d.a aVar;
                if (AbstractC3934c.f44507a != null) {
                    aVar = AbstractC3935d.a(AbstractC3934c.f44507a);
                } else {
                    AbstractC3934c.i();
                    aVar = null;
                }
                if (aVar != null) {
                    aVar.a(AbstractC3935d.b(AbstractC3934c.f44507a), AbstractC3934c.f44508b == null);
                }
                if (AbstractC3934c.f44508b == null) {
                    String unused = AbstractC3934c.f44507a = null;
                    AbstractC3934c.f44513g = null;
                }
            }
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            if (AbstractC3934c.f44508b == null || !AbstractC3934c.f44508b.isPlaying()) {
                AbstractC3935d.d(AbstractC3934c.f44507a, -1);
                AbstractC3934c.i();
            } else {
                AbstractC3935d.d(AbstractC3934c.f44507a, AbstractC3935d.b(AbstractC3934c.f44507a) + 10);
            }
            AbstractC3934c.f44511e.post(new a());
        }
    }

    public static void i() {
        if (f44508b != null) {
            q();
            f44508b.reset();
            r(-1);
            f44508b = null;
            f44513g = null;
        }
    }

    public static String j() {
        return f44507a;
    }

    public static void k(String str, String str2, Uri uri, int i10) {
        new a(str2, i10, uri, str).start();
    }

    public static void l() {
        f44510d = new b();
    }

    public static boolean m(String str) {
        MediaPlayer mediaPlayer;
        return str.equals(f44507a) && (mediaPlayer = f44508b) != null && mediaPlayer.isPlaying();
    }

    public static void n(String str) {
        String str2 = f44513g;
        if (str2 == null || !str2.equals(str)) {
            return;
        }
        i();
    }

    public static void o() {
        MediaPlayer mediaPlayer = f44508b;
        if (mediaPlayer != null) {
            mediaPlayer.pause();
            q();
            f44508b = null;
            f44513g = null;
        }
    }

    public static void p() {
        synchronized (f44512f) {
            f44509c = new Timer();
            l();
            f44509c.schedule(f44510d, 0L, 10L);
        }
    }

    public static void q() {
        final AbstractC3935d.a a10;
        synchronized (f44512f) {
            try {
                String str = f44507a;
                if (str != null && f44508b != null && (a10 = AbstractC3935d.a(str)) != null) {
                    final boolean isPlaying = f44508b.isPlaying();
                    final int b10 = AbstractC3935d.b(f44507a);
                    f44511e.post(new Runnable() { // from class: com.zoho.livechat.android.utils.b
                        @Override // java.lang.Runnable
                        public final void run() {
                            AbstractC3935d.a.this.a(b10, !isPlaying);
                        }
                    });
                }
                Timer timer = f44509c;
                if (timer != null) {
                    timer.cancel();
                    f44509c.purge();
                    f44510d.cancel();
                    f44509c = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void r(int i10) {
        AbstractC3935d.d(f44507a, i10);
    }
}
