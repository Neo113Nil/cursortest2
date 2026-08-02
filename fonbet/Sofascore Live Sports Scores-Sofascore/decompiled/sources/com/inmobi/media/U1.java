package com.inmobi.media;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import defpackage.nn0;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class U1 {
    public final Context a;
    public boolean b;
    public WeakReference c;
    public final AudioAttributes d;
    public AudioFocusRequest e;
    public AudioManager.OnAudioFocusChangeListener f;

    public U1(Context context) {
        context.getClass();
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        this.a = applicationContext;
        AudioAttributes build = new AudioAttributes.Builder().setUsage(1).setContentType(2).setLegacyStreamType(3).build();
        build.getClass();
        this.d = build;
    }

    public static final void a(U1 u1, int i) {
        T1 t1;
        T1 t12;
        WeakReference weakReference;
        T1 t13;
        if (i == -2) {
            u1.b = true;
            WeakReference weakReference2 = u1.c;
            if (weakReference2 == null || (t1 = (T1) weakReference2.get()) == null) {
                return;
            }
            t1.a();
            return;
        }
        if (i == -1) {
            u1.b = false;
            WeakReference weakReference3 = u1.c;
            if (weakReference3 == null || (t12 = (T1) weakReference3.get()) == null) {
                return;
            }
            t12.a();
            return;
        }
        if (i != 1) {
            return;
        }
        if (u1.b && (weakReference = u1.c) != null && (t13 = (T1) weakReference.get()) != null) {
            t13.b();
        }
        u1.b = false;
    }

    public final AudioManager.OnAudioFocusChangeListener b() {
        return new nn0(this, 1);
    }

    public final AudioFocusRequest c() {
        AudioFocusRequest.Builder audioAttributes = new AudioFocusRequest.Builder(2).setAudioAttributes(this.d);
        AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = this.f;
        onAudioFocusChangeListener.getClass();
        AudioFocusRequest build = audioAttributes.setOnAudioFocusChangeListener(onAudioFocusChangeListener, ((ExecutorC3520jc) AbstractC3851w6.e.getValue()).a).build();
        build.getClass();
        return build;
    }

    public final void d() {
        WeakReference weakReference = this.c;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.c = null;
        a();
        this.e = null;
        this.f = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0032 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0033 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean e() {
        AudioManager audioManager;
        int i;
        try {
            Object systemService = this.a.getSystemService("audio");
            audioManager = systemService instanceof AudioManager ? (AudioManager) systemService : null;
        } catch (Throwable unused) {
        }
        if (audioManager != null) {
            if (this.f == null) {
                this.f = b();
            }
            AudioFocusRequest audioFocusRequest = this.e;
            if (audioFocusRequest == null) {
                audioFocusRequest = c();
                this.e = audioFocusRequest;
            }
            if (audioFocusRequest != null) {
                i = audioManager.requestAudioFocus(audioFocusRequest);
                return i != 1;
            }
        }
        i = 0;
        if (i != 1) {
        }
    }

    public final void a() {
        AudioFocusRequest audioFocusRequest;
        this.b = false;
        try {
            Object systemService = this.a.getSystemService("audio");
            AudioManager audioManager = systemService instanceof AudioManager ? (AudioManager) systemService : null;
            if (audioManager == null || (audioFocusRequest = this.e) == null) {
                return;
            }
            audioManager.abandonAudioFocusRequest(audioFocusRequest);
        } catch (Throwable unused) {
        }
    }
}
