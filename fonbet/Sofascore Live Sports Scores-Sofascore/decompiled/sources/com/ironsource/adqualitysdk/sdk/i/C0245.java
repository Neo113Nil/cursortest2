package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.RelativeLayout;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.Ƭ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0245 extends RelativeLayout {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C1188 f456;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0245(C1188 c1188, Context context) {
        super(context);
        this.f456 = c1188;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        C1188.m667(this.f456, motionEvent);
        return super.onInterceptTouchEvent(motionEvent);
    }
}
