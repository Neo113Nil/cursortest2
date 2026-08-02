package com.ironsource.adqualitysdk.sdk.i;

import android.view.MotionEvent;
import android.view.View;
import com.ironsource.adqualitysdk.sdk.StringFog;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᓴ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class ViewOnTouchListenerC0702 extends AbstractC0201 implements View.OnTouchListener {

    /* renamed from: ｋ, reason: contains not printable characters */
    public static final String f2376 = StringFog.decrypt("YMM8sFinubFG3hy6Q6GjuUrOB61MsL6P\n", "L61o3y3E0f0=\n");

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final InterfaceC0726 f2377;

    public ViewOnTouchListenerC0702(View.OnTouchListener onTouchListener, InterfaceC0726 interfaceC0726) {
        super(onTouchListener);
        this.f2377 = interfaceC0726;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        try {
            this.f2377.mo132(this, view, motionEvent);
        } catch (Throwable th) {
            AbstractC0356.m204(f2376, StringFog.decrypt("B/8FmZV5VOVi4COUqzBO/yfjEoTHNlPfLfgUng==\n", "Qo139udZPYs=\n"), th, false);
        }
        Object obj = this.f293;
        if (obj != null) {
            return ((View.OnTouchListener) obj).onTouch(view, motionEvent);
        }
        return false;
    }
}
