package U8;

import U8.c;
import android.content.ContentResolver;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.provider.Settings;
import com.giphy.sdk.core.models.Images;
import com.giphy.sdk.core.models.Media;
import com.giphy.sdk.ui.views.GPHVideoPlayerView;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.Timer;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public GPHVideoPlayerView f12122a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f12123b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f12124c;

    /* renamed from: e, reason: collision with root package name */
    public Timer f12126e;

    /* renamed from: f, reason: collision with root package name */
    public ContentObserver f12127f;

    /* renamed from: h, reason: collision with root package name */
    public boolean f12129h;

    /* renamed from: i, reason: collision with root package name */
    public AudioManager f12130i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f12131j;

    /* renamed from: k, reason: collision with root package name */
    public long f12132k;

    /* renamed from: l, reason: collision with root package name */
    public Media f12133l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f12134m;

    /* renamed from: d, reason: collision with root package name */
    public final Set f12125d = new LinkedHashSet();

    /* renamed from: g, reason: collision with root package name */
    public Media f12128g = new Media("", null, null, null, null, null, null, null, null, null, null, null, null, null, new Images(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1048575, null), null, null, null, null, null, null, null, null, false, false, false, false, false, false, false, false, false, null, null, null, false, null, null, null, null, null, -16386, 511, null);

    public static final class a extends ContentObserver {
        public a(Handler handler) {
            super(handler);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z10) {
            super.onChange(z10);
            b.x(b.this);
        }
    }

    public b(GPHVideoPlayerView gPHVideoPlayerView, boolean z10, boolean z11) {
        w();
        this.f12122a = gPHVideoPlayerView;
        this.f12123b = z10;
        t(z11);
    }

    public static /* synthetic */ void m(b bVar, Media media, boolean z10, GPHVideoPlayerView gPHVideoPlayerView, Boolean bool, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadMedia");
        }
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        if ((i10 & 4) != 0) {
            gPHVideoPlayerView = null;
        }
        if ((i10 & 8) != 0) {
            bool = null;
        }
        bVar.l(media, z10, gPHVideoPlayerView, bool);
    }

    public static final void x(b bVar) {
        AudioManager audioManager = bVar.f12130i;
        Intrinsics.checkNotNull(audioManager);
        float f10 = audioManager.getStreamVolume(3) > 0 ? 1.0f : 0.0f;
        bVar.f12131j = f10 == 0.0f;
        bVar.u(f10);
    }

    public abstract void b();

    public abstract long c();

    public abstract long d();

    public final Media e() {
        return this.f12128g;
    }

    public final boolean f() {
        return this.f12134m;
    }

    public final GPHVideoPlayerView g() {
        return this.f12122a;
    }

    public final boolean h() {
        return this.f12123b;
    }

    public final boolean i() {
        return this.f12124c;
    }

    public abstract float j();

    public abstract boolean k();

    public final synchronized void l(Media media, boolean z10, GPHVideoPlayerView gPHVideoPlayerView, Boolean bool) {
        GPHVideoPlayerView gPHVideoPlayerView2;
        try {
            Intrinsics.checkNotNullParameter(media, "media");
            if (bool != null) {
                this.f12123b = bool.booleanValue();
            }
            if (this.f12129h) {
                timber.log.a.b("Player is already destroyed!", new Object[0]);
                return;
            }
            timber.log.a.a("loadMedia " + media.getId() + ' ' + z10 + ' ' + gPHVideoPlayerView, new Object[0]);
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (gPHVideoPlayerView != null) {
                if (!Intrinsics.areEqual(gPHVideoPlayerView, this.f12122a) && (gPHVideoPlayerView2 = this.f12122a) != null) {
                    gPHVideoPlayerView2.m();
                }
                this.f12122a = gPHVideoPlayerView;
            }
            this.f12128g = media;
            Iterator it = this.f12125d.iterator();
            while (it.hasNext()) {
                ((Function1) it.next()).invoke(new c.e(media));
            }
            r();
            GPHVideoPlayerView gPHVideoPlayerView3 = this.f12122a;
            if (gPHVideoPlayerView3 == null) {
                throw new Exception("playerView must not be null");
            }
            this.f12134m = false;
            if (gPHVideoPlayerView3 != null) {
                gPHVideoPlayerView3.setVisibility(0);
            }
            this.f12133l = media;
            this.f12132k = 0L;
            GPHVideoPlayerView gPHVideoPlayerView4 = this.f12122a;
            Intrinsics.checkNotNull(gPHVideoPlayerView4);
            v(gPHVideoPlayerView4, z10);
            timber.log.a.a("loadMedia time=" + (SystemClock.elapsedRealtime() - elapsedRealtime), new Object[0]);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void n() {
        this.f12129h = true;
        y();
        q();
    }

    public final void o() {
        this.f12134m = true;
        GPHVideoPlayerView gPHVideoPlayerView = this.f12122a;
        if (gPHVideoPlayerView != null) {
            gPHVideoPlayerView.m();
        }
        if (this.f12128g.getId().length() > 0) {
            this.f12133l = this.f12128g;
        }
        this.f12132k = c();
        r();
    }

    public final void p() {
        this.f12134m = false;
        GPHVideoPlayerView gPHVideoPlayerView = this.f12122a;
        if (gPHVideoPlayerView != null) {
            gPHVideoPlayerView.n();
        }
        Media media = this.f12133l;
        if (media != null) {
            m(this, media, false, null, null, 14, null);
        }
    }

    public final void q() {
        r();
        this.f12122a = null;
    }

    public final void r() {
        z();
        b();
    }

    public abstract void s(long j10);

    public final void t(boolean z10) {
        Iterator it = this.f12125d.iterator();
        while (it.hasNext()) {
            ((Function1) it.next()).invoke(new c.b(z10));
        }
        this.f12124c = z10;
    }

    public abstract void u(float f10);

    public abstract void v(GPHVideoPlayerView gPHVideoPlayerView, boolean z10);

    public final void w() {
        GPHVideoPlayerView gPHVideoPlayerView = this.f12122a;
        if (gPHVideoPlayerView == null) {
            return;
        }
        Intrinsics.checkNotNull(gPHVideoPlayerView);
        Object systemService = gPHVideoPlayerView.getContext().getSystemService("audio");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        this.f12130i = (AudioManager) systemService;
        x(this);
        this.f12127f = new a(new Handler(Looper.getMainLooper()));
        GPHVideoPlayerView gPHVideoPlayerView2 = this.f12122a;
        Intrinsics.checkNotNull(gPHVideoPlayerView2);
        ContentResolver contentResolver = gPHVideoPlayerView2.getContext().getContentResolver();
        Uri uri = Settings.System.CONTENT_URI;
        ContentObserver contentObserver = this.f12127f;
        Intrinsics.checkNotNull(contentObserver);
        contentResolver.registerContentObserver(uri, true, contentObserver);
    }

    public final void y() {
        GPHVideoPlayerView gPHVideoPlayerView = this.f12122a;
        if (gPHVideoPlayerView == null || this.f12127f == null) {
            return;
        }
        Intrinsics.checkNotNull(gPHVideoPlayerView);
        ContentResolver contentResolver = gPHVideoPlayerView.getContext().getContentResolver();
        ContentObserver contentObserver = this.f12127f;
        Intrinsics.checkNotNull(contentObserver);
        contentResolver.unregisterContentObserver(contentObserver);
        this.f12127f = null;
    }

    public final void z() {
        Timer timer = this.f12126e;
        if (timer != null) {
            timer.cancel();
        }
    }
}
