package com.ironsource.adqualitysdk.sdk.i;

import android.R;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ț, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0260 implements Y {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C1188 f480;

    public C0260(C1188 c1188) {
        this.f480 = c1188;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.Y
    /* renamed from: ﾒ */
    public final void mo76(View view) {
        boolean z;
        C0808 m476 = C0808.m476();
        synchronized (m476) {
            z = m476.f2599;
        }
        if (z) {
            this.f480.m669();
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getContext() instanceof Activity) {
                ViewGroup viewGroup2 = (ViewGroup) ((Activity) viewGroup.getContext()).findViewById(R.id.content);
                this.f480.getClass();
                if (viewGroup2 != null) {
                    ViewGroup viewGroup3 = viewGroup2;
                    while (true) {
                        ViewParent parent = viewGroup2.getParent();
                        if (parent != viewGroup) {
                            if (!(parent instanceof ViewGroup)) {
                                break;
                            }
                            viewGroup3 = viewGroup2;
                            viewGroup2 = (ViewGroup) parent;
                        } else if (viewGroup3 != viewGroup2) {
                            viewGroup = viewGroup3;
                        }
                    }
                    viewGroup = viewGroup2;
                }
            }
            C1188 c1188 = this.f480;
            c1188.getClass();
            C1188.m668(c1188, viewGroup, new ViewOnLayoutChangeListenerC0257(c1188, viewGroup));
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.Y
    /* renamed from: ﾇ */
    public final void mo75(View view) {
    }
}
