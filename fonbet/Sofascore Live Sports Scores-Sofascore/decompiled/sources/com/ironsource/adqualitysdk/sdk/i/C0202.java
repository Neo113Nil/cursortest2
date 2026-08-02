package com.ironsource.adqualitysdk.sdk.i;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.Ĩ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0202 extends AbstractRunnableC0606 {

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final /* synthetic */ C1188 f294;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ ViewOnLayoutChangeListenerC0257 f295;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C0219 f296;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ ViewGroup f297;

    public C0202(C1188 c1188, ViewGroup viewGroup, C0219 c0219, ViewOnLayoutChangeListenerC0257 viewOnLayoutChangeListenerC0257) {
        this.f294 = c1188;
        this.f297 = viewGroup;
        this.f296 = c0219;
        this.f295 = viewOnLayoutChangeListenerC0257;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0606
    /* renamed from: ﾒ */
    public final void mo58() {
        C1188 c1188 = this.f294;
        ViewGroup viewGroup = this.f297;
        C0219 c0219 = this.f296;
        c1188.getClass();
        View.OnTouchListener m465 = AbstractC0807.m465(viewGroup);
        if (!(m465 instanceof ViewOnTouchListenerC0702)) {
            viewGroup.setOnTouchListener(new ViewOnTouchListenerC0702(m465, c0219));
        }
        int i = 0;
        while (true) {
            int childCount = this.f297.getChildCount();
            ViewGroup viewGroup2 = this.f297;
            if (i >= childCount) {
                viewGroup2.removeOnLayoutChangeListener(this.f295);
                this.f297.addOnLayoutChangeListener(this.f295);
                return;
            }
            View childAt = viewGroup2.getChildAt(i);
            boolean z = childAt instanceof ViewGroup;
            C1188 c11882 = this.f294;
            if (z) {
                ViewOnLayoutChangeListenerC0257 viewOnLayoutChangeListenerC0257 = this.f295;
                c11882.getClass();
                new Handler(Looper.getMainLooper()).post(new C0202(c11882, (ViewGroup) childAt, new C0219(c11882), viewOnLayoutChangeListenerC0257));
            } else {
                C0219 c02192 = this.f296;
                c11882.getClass();
                View.OnTouchListener m4652 = AbstractC0807.m465(childAt);
                if (!(m4652 instanceof ViewOnTouchListenerC0702)) {
                    childAt.setOnTouchListener(new ViewOnTouchListenerC0702(m4652, c02192));
                }
            }
            i++;
        }
    }
}
