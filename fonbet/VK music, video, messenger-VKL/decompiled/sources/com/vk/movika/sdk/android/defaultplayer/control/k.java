package com.vk.movika.sdk.android.defaultplayer.control;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import com.vk.movika.sdk.base.model.props.ButtonProps;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.brm0;
import xsna.drm0;
import xsna.j8y;
import xsna.xn8;

/* loaded from: classes3.dex */
public final class k implements a {
    public final boolean a;
    public final p b;
    public com.vk.movika.sdk.android.defaultplayer.container.a c;
    public com.vk.movika.sdk.android.defaultplayer.interactive.c d;
    public final boolean e;

    public k(j8y j8yVar, Context context, com.vk.movika.sdk.base.model.g gVar, Typeface typeface, boolean z, boolean z2) {
        p pVar;
        Object obj;
        List<com.vk.movika.sdk.base.model.j> list = gVar.f;
        this.a = z2;
        String str = gVar.c;
        boolean z3 = false;
        if (brm0.w(drm0.p0(str).toString(), "Text", true)) {
            pVar = new u(context, 0);
            pVar.setFallbackBackgroundAlpha(ConnectivityTracker.DEFAULT_UPLINK_BITRATE);
            pVar.setFallbackTextColor("#FFFFFF");
        } else {
            pVar = new p(context);
        }
        this.b = pVar;
        boolean z4 = (str.equals("Text") && list.isEmpty()) ? false : true;
        this.e = z4;
        String str2 = gVar.g;
        pVar.setButtonProps(str2 != null ? (ButtonProps) j8yVar.a(xn8.a(ButtonProps.Companion.serializer()), str2) : null);
        pVar.setControlLayoutParams(gVar.e);
        pVar.setTypeface(typeface);
        pVar.setContentDescription(gVar.d);
        pVar.setFocusable(z && z4);
        if (z && z4) {
            z3 = true;
        }
        pVar.setFocusableInTouchMode(z3);
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (brm0.w(drm0.p0(((com.vk.movika.sdk.base.model.j) obj).a).toString(), "OnClick", true)) {
                    break;
                }
            }
        }
        com.vk.movika.sdk.base.model.j jVar = (com.vk.movika.sdk.base.model.j) obj;
        if (jVar != null) {
            this.b.setOnClickListener(new i(0, this, jVar));
        }
        if (z && this.e) {
            this.b.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.vk.movika.sdk.android.defaultplayer.control.j
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view, boolean z5) {
                    com.vk.movika.sdk.android.defaultplayer.interactive.c cVar;
                    if (!z5 || (cVar = k.this.d) == null) {
                        return;
                    }
                    cVar.d();
                }
            });
        }
        p pVar2 = this.b;
        p pVar3 = pVar2.getAnimateOnEnable() ? pVar2 : null;
        if (pVar3 != null) {
            pVar3.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            pVar3.animate().alpha(1.0f).setDuration(300L);
        }
    }

    @Override // com.vk.movika.sdk.android.defaultplayer.control.a
    public final void A0(com.vk.movika.sdk.android.defaultplayer.container.a aVar) {
        this.c = aVar;
    }

    @Override // com.vk.movika.sdk.android.defaultplayer.control.a
    public final View getView() {
        return this.b;
    }

    @Override // com.vk.movika.sdk.android.defaultplayer.control.a
    public final void q0() {
        if (this.e) {
            this.b.requestFocus();
        }
    }

    @Override // com.vk.movika.sdk.android.defaultplayer.control.a
    public final boolean r0() {
        return this.e;
    }

    @Override // com.vk.movika.sdk.android.defaultplayer.control.a
    public final boolean s0() {
        return this.e && this.b.hasFocus();
    }

    @Override // com.vk.movika.sdk.android.defaultplayer.control.a
    public final void t0(q qVar) {
        this.b.setOnTapListener(qVar);
    }

    @Override // com.vk.movika.sdk.android.defaultplayer.control.a
    public final View u0() {
        return null;
    }

    @Override // com.vk.movika.sdk.android.defaultplayer.control.a
    public final void v0(long j) {
        boolean z = this.a;
        if (z && z) {
            ValueAnimator valueAnimator = this.b.D;
            if (j != valueAnimator.getDuration()) {
                valueAnimator.setDuration(j);
            }
        }
    }

    @Override // com.vk.movika.sdk.android.defaultplayer.control.a
    public final void w0(com.vk.movika.sdk.android.defaultplayer.interactive.c cVar) {
        this.d = cVar;
    }

    @Override // com.vk.movika.sdk.android.defaultplayer.control.a
    public final void x0(boolean z) {
        p pVar = this.b;
        pVar.setInteractionEnabled(!z);
        ValueAnimator valueAnimator = pVar.D;
        if (this.a) {
            if (z) {
                valueAnimator.pause();
            } else if (!valueAnimator.isStarted()) {
                valueAnimator.start();
            } else if (valueAnimator.isPaused()) {
                valueAnimator.resume();
            }
        }
    }

    @Override // com.vk.movika.sdk.android.defaultplayer.control.a
    public final void y0() {
        this.b.setDrawFakeFocus(true);
    }

    @Override // com.vk.movika.sdk.android.defaultplayer.control.a
    public final void z0(long j) {
        if (this.a) {
            this.b.D.setCurrentPlayTime(j);
        }
    }
}
