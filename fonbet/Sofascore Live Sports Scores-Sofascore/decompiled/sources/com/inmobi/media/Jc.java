package com.inmobi.media;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.media.AudioManager;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.inmobi.media.Jc;
import com.inmobi.media.core.config.models.AdConfig;
import com.ironsource.U3;
import defpackage.w1l;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Jc {
    public final GestureDetectorOnGestureListenerC3889xi a;
    public final InterfaceC3880x9 b;
    public C3805uc c;
    public C3624nc d;
    public C3624nc e;
    public C3624nc f;

    public Jc(GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi, InterfaceC3880x9 interfaceC3880x9) {
        this.a = gestureDetectorOnGestureListenerC3889xi;
        this.b = interfaceC3880x9;
    }

    public final void a(Activity activity, String str) {
        str.getClass();
        activity.getClass();
        InterfaceC3880x9 interfaceC3880x9 = this.b;
        if (interfaceC3880x9 != null) {
            ((C3906y9) interfaceC3880x9).c("MraidMediaProcessor", "doPlayMedia");
        }
        C3805uc c3805uc = new C3805uc(activity, this.b);
        this.c = c3805uc;
        c3805uc.setPlaybackData(str);
        ViewGroup viewGroup = (ViewGroup) activity.findViewById(R.id.content);
        RelativeLayout.LayoutParams c = w1l.c(-1, -1, 13);
        C3805uc c3805uc2 = this.c;
        if (c3805uc2 != null) {
            c3805uc2.setLayoutParams(c);
        }
        C3831vc c3831vc = new C3831vc(activity);
        c3831vc.setOnTouchListener(new defpackage.ab(4));
        c3831vc.setBackgroundColor(-16777216);
        c3831vc.addView(this.c);
        InterfaceC3880x9 interfaceC3880x92 = this.b;
        if (interfaceC3880x92 != null) {
            ((C3906y9) interfaceC3880x92).a("MraidMediaProcessor", "adding media view on top");
        }
        viewGroup.addView(c3831vc, new ViewGroup.LayoutParams(-1, -1));
        C3805uc c3805uc3 = this.c;
        if (c3805uc3 != null) {
            c3805uc3.setViewContainer(c3831vc);
        }
        C3805uc c3805uc4 = this.c;
        if (c3805uc4 != null) {
            c3805uc4.requestFocus();
        }
        C3805uc c3805uc5 = this.c;
        if (c3805uc5 != null) {
            c3805uc5.setOnKeyListener(new View.OnKeyListener() { // from class: rda
                @Override // android.view.View.OnKeyListener
                public final boolean onKey(View view, int i, KeyEvent keyEvent) {
                    return Jc.a(Jc.this, view, i, keyEvent);
                }
            });
        }
        C3805uc c3805uc6 = this.c;
        if (c3805uc6 != null) {
            c3805uc6.setListener(new Ic(this));
        }
        C3805uc c3805uc7 = this.c;
        if (c3805uc7 != null) {
            c3805uc7.a();
        }
    }

    public final void b(String str, boolean z) {
        InterfaceC3880x9 interfaceC3880x9 = this.b;
        if (interfaceC3880x9 != null) {
            ((C3906y9) interfaceC3880x9).c("MraidMediaProcessor", "fireHeadphonePluggedEvent");
        }
        GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi = this.a;
        if (gestureDetectorOnGestureListenerC3889xi != null) {
            gestureDetectorOnGestureListenerC3889xi.a(str, "fireHeadphonePluggedEvent(" + z + ");");
        }
    }

    public static boolean b() {
        Context context = AbstractC3424fj.a;
        if (context == null) {
            return false;
        }
        AudioManager audioManager = null;
        try {
            Object systemService = context.getSystemService("audio");
            if (!(systemService instanceof AudioManager)) {
                systemService = null;
            }
            audioManager = (AudioManager) systemService;
        } catch (Throwable unused) {
        }
        return audioManager != null && audioManager.isWiredHeadsetOn();
    }

    public static final boolean a(View view, MotionEvent motionEvent) {
        return true;
    }

    public static final boolean a(Jc jc, View view, int i, KeyEvent keyEvent) {
        if (4 != i || keyEvent.getAction() != 0) {
            return false;
        }
        C3805uc c3805uc = jc.c;
        if (c3805uc == null) {
            return true;
        }
        c3805uc.b();
        return true;
    }

    public final int a() {
        AdConfig.RenderingConfig renderingConfig;
        InterfaceC3880x9 interfaceC3880x9 = this.b;
        if (interfaceC3880x9 != null) {
            ((C3906y9) interfaceC3880x9).c("MraidMediaProcessor", U3.j.P);
        }
        Context context = AbstractC3424fj.a;
        if (context == null) {
            return -1;
        }
        GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi = this.a;
        if (((gestureDetectorOnGestureListenerC3889xi == null || (renderingConfig = gestureDetectorOnGestureListenerC3889xi.getRenderingConfig()) == null) ? false : renderingConfig.getEnablePubMuteControl()) && AbstractC3424fj.f) {
            return 0;
        }
        AudioManager audioManager = null;
        try {
            Object systemService = context.getSystemService("audio");
            if (!(systemService instanceof AudioManager)) {
                systemService = null;
            }
            audioManager = (AudioManager) systemService;
        } catch (Throwable unused) {
        }
        if (audioManager != null) {
            return audioManager.getStreamVolume(3);
        }
        return -1;
    }

    public final void a(String str, boolean z) {
        InterfaceC3880x9 interfaceC3880x9 = this.b;
        if (interfaceC3880x9 != null) {
            ((C3906y9) interfaceC3880x9).c("MraidMediaProcessor", "fireDeviceMuteChangeEvent");
        }
        GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi = this.a;
        if (gestureDetectorOnGestureListenerC3889xi != null) {
            gestureDetectorOnGestureListenerC3889xi.a(str, "fireDeviceMuteChangeEvent(" + z + ");");
        }
    }

    public final void a(String str, int i) {
        InterfaceC3880x9 interfaceC3880x9 = this.b;
        if (interfaceC3880x9 != null) {
            ((C3906y9) interfaceC3880x9).c("MraidMediaProcessor", "fireDeviceVolumeChangeEvent");
        }
        GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi = this.a;
        if (gestureDetectorOnGestureListenerC3889xi != null) {
            gestureDetectorOnGestureListenerC3889xi.a(str, "fireDeviceVolumeChangeEvent(" + i + ");");
        }
    }
}
