package com.inmobi.media;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.VideoView;
import defpackage.lnb;
import defpackage.q2m;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.uc, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3805uc extends VideoView implements MediaPlayer.OnCompletionListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnErrorListener, Application.ActivityLifecycleCallbacks {
    public final InterfaceC3880x9 a;
    public C3753sc b;
    public ViewGroup c;
    public InterfaceC3779tc d;
    public boolean e;
    public final WeakReference f;
    public int g;
    public String h;
    public String i;
    public int j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3805uc(Activity activity, InterfaceC3880x9 interfaceC3880x9) {
        super(activity);
        activity.getClass();
        this.a = interfaceC3880x9;
        setZOrderOnTop(true);
        setFocusable(true);
        setFocusableInTouchMode(true);
        if (Build.VERSION.SDK_INT < 28) {
            setDrawingCacheEnabled(true);
        }
        this.g = 100;
        this.j = -1;
        this.k = 0;
        this.f = new WeakReference(activity);
        Context context = AbstractC3424fj.a;
        activity.getApplication().unregisterActivityLifecycleCallbacks(this);
        activity.getApplication().registerActivityLifecycleCallbacks(this);
    }

    public static final void a(C3805uc c3805uc, MediaPlayer mediaPlayer, int i, int i2) {
        InterfaceC3880x9 interfaceC3880x9 = c3805uc.a;
        if (interfaceC3880x9 != null) {
            ((C3906y9) interfaceC3880x9).a("MediaRenderView", ">>> onVideoSizeChanged");
        }
        if (c3805uc.b == null) {
            C3753sc c3753sc = new C3753sc(c3805uc.getContext());
            c3805uc.b = c3753sc;
            c3753sc.setAnchorView(c3805uc);
            c3805uc.setMediaController(c3805uc.b);
            c3805uc.requestLayout();
            c3805uc.requestFocus();
        }
    }

    public final void b() {
        InterfaceC3880x9 interfaceC3880x9 = this.a;
        if (interfaceC3880x9 != null) {
            ((C3906y9) interfaceC3880x9).a("MediaRenderView", "Release the media render view");
        }
        stopPlayback();
        ViewGroup viewGroup = this.c;
        if (viewGroup != null) {
            ViewParent parent = viewGroup.getParent();
            ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup2 != null) {
                viewGroup2.removeView(this.c);
            }
            ViewParent parent2 = getParent();
            ViewGroup viewGroup3 = parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null;
            if (viewGroup3 != null) {
                viewGroup3.removeView(this);
            }
            setBackgroundColor(0);
            this.c = null;
        }
        setMediaController(null);
        this.b = null;
        InterfaceC3779tc interfaceC3779tc = this.d;
        if (interfaceC3779tc != null) {
            InterfaceC3880x9 interfaceC3880x92 = ((Ic) interfaceC3779tc).a.b;
            if (interfaceC3880x92 != null) {
                ((C3906y9) interfaceC3880x92).a("MraidMediaProcessor", ">>> onPlayerCompleted");
            }
            ViewGroup viewContainer = getViewContainer();
            if (viewContainer != null) {
                ViewParent parent3 = viewContainer.getParent();
                ViewGroup viewGroup4 = parent3 instanceof ViewGroup ? (ViewGroup) parent3 : null;
                if (viewGroup4 != null) {
                    viewGroup4.removeView(viewContainer);
                }
            }
            setViewContainer(null);
        }
    }

    public final int getCurrentAudioVolume() {
        return this.g;
    }

    @Override // android.view.View
    @Nullable
    public final String getId() {
        return this.h;
    }

    @Nullable
    public final InterfaceC3779tc getListener() {
        return this.d;
    }

    public final int getMCurrentPosition() {
        return this.k;
    }

    @Nullable
    public final String getPlaybackUrl() {
        return this.i;
    }

    public final int getPreviousPosition() {
        return this.j;
    }

    @Nullable
    public final ViewGroup getViewContainer() {
        return this.c;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        activity.getClass();
        activity.getApplication().unregisterActivityLifecycleCallbacks(this);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        activity.getClass();
        bundle.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        activity.getClass();
        if (this.f.get() == null || !Intrinsics.c(this.f.get(), activity)) {
            return;
        }
        this.e = false;
        start();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        activity.getClass();
        Activity activity2 = (Activity) this.f.get();
        if (activity2 == null || !activity2.equals(activity)) {
            return;
        }
        this.e = true;
        if (getCurrentPosition() != 0) {
            this.k = getCurrentPosition();
        }
        pause();
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        mediaPlayer.getClass();
        InterfaceC3880x9 interfaceC3880x9 = this.a;
        if (interfaceC3880x9 != null) {
            ((C3906y9) interfaceC3880x9).a("MediaRenderView", ">>> onCompletion");
        }
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        mediaPlayer.getClass();
        InterfaceC3880x9 interfaceC3880x9 = this.a;
        if (interfaceC3880x9 != null) {
            ((C3906y9) interfaceC3880x9).b("MediaRenderView", lnb.j(i, i2, ">>> onError (", ", ", ")"));
        }
        b();
        return false;
    }

    @Override // android.widget.VideoView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        getHolder().setSizeFromLayout();
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        InterfaceC3880x9 interfaceC3880x9;
        mediaPlayer.getClass();
        InterfaceC3880x9 interfaceC3880x92 = this.a;
        if (interfaceC3880x92 != null) {
            ((C3906y9) interfaceC3880x92).a("MediaRenderView", ">>> onPrepared");
        }
        mediaPlayer.setOnVideoSizeChangedListener(new q2m(this, 2));
        int i = this.k;
        if (i < getDuration()) {
            this.k = i;
            seekTo(i);
        }
        InterfaceC3779tc interfaceC3779tc = this.d;
        if (interfaceC3779tc != null && (interfaceC3880x9 = ((Ic) interfaceC3779tc).a.b) != null) {
            ((C3906y9) interfaceC3880x9).a("MraidMediaProcessor", ">>> onPlayerPrepared");
        }
        start();
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        Context context;
        view.getClass();
        super.onVisibilityChanged(view, i);
        InterfaceC3880x9 interfaceC3880x9 = this.a;
        if (interfaceC3880x9 != null) {
            ((C3906y9) interfaceC3880x9).a("MediaRenderView", lnb.k(i, ">>> onVisibilityChanged (", ")"));
        }
        if (i != 0 || (context = AbstractC3424fj.a) == null) {
            return;
        }
        setBackground(new BitmapDrawable(context.getResources(), (Bitmap) null));
    }

    @Override // android.view.SurfaceView, android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        InterfaceC3880x9 interfaceC3880x9 = this.a;
        if (interfaceC3880x9 != null) {
            ((C3906y9) interfaceC3880x9).a("MediaRenderView", lnb.k(i, ">>> onWindowVisibilityChanged (", ")"));
        }
    }

    @Override // android.widget.VideoView, android.widget.MediaController.MediaPlayerControl
    public final void pause() {
        InterfaceC3880x9 interfaceC3880x9 = this.a;
        if (interfaceC3880x9 != null) {
            ((C3906y9) interfaceC3880x9).a("MediaRenderView", "Pause media playback");
        }
        super.pause();
    }

    public final void setCurrentAudioVolume(int i) {
        this.g = i;
    }

    public final void setId(@Nullable String str) {
        this.h = str;
    }

    public final void setListener(@Nullable InterfaceC3779tc interfaceC3779tc) {
        this.d = interfaceC3779tc;
    }

    public final void setMCurrentPosition(int i) {
        this.k = i;
    }

    public final void setPlaybackData(@NotNull String str) {
        String str2;
        str.getClass();
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        bytes.getClass();
        StringBuilder sb = new StringBuilder();
        for (byte b : bytes) {
            if (((byte) (b & Byte.MIN_VALUE)) > 0) {
                sb.append("%");
                char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
                sb.append(new String(new char[]{cArr[(b >> 4) & 15], cArr[(byte) (b & 15)]}));
            } else {
                sb.append((char) b);
            }
        }
        try {
            byte[] bytes2 = sb.toString().getBytes(Charsets.UTF_8);
            bytes2.getClass();
            str2 = new String(bytes2, Charsets.e);
        } catch (UnsupportedEncodingException unused) {
            str2 = "";
        }
        this.i = str2;
        this.h = "anonymous";
    }

    public final void setPlaybackUrl(@Nullable String str) {
        this.i = str;
    }

    public final void setPreviousPosition(int i) {
        this.j = i;
    }

    public final void setViewContainer(@Nullable ViewGroup viewGroup) {
        this.c = viewGroup;
    }

    @Override // android.widget.VideoView, android.widget.MediaController.MediaPlayerControl
    public final void start() {
        if (this.e) {
            return;
        }
        InterfaceC3880x9 interfaceC3880x9 = this.a;
        if (interfaceC3880x9 != null) {
            ((C3906y9) interfaceC3880x9).a("MediaRenderView", "Start media playback");
        }
        super.start();
    }

    public final void setAudioMuted(boolean z) {
    }

    public final void setPlayerPrepared(boolean z) {
    }

    public final void a() {
        setVideoPath(this.i);
        setOnCompletionListener(this);
        setOnPreparedListener(this);
        setOnErrorListener(this);
        if (this.b == null) {
            C3753sc c3753sc = new C3753sc(getContext());
            this.b = c3753sc;
            c3753sc.setAnchorView(this);
            setMediaController(this.b);
        }
    }
}
