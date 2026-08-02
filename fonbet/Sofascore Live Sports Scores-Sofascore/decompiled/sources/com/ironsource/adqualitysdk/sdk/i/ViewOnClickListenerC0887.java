package com.ironsource.adqualitysdk.sdk.i;

import android.view.View;
import com.ironsource.adqualitysdk.sdk.StringFog;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ṛ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class ViewOnClickListenerC0887 extends AbstractC0201 implements View.OnClickListener {

    /* renamed from: ｋ, reason: contains not printable characters */
    public static final String f2908 = StringFog.decrypt("5HP3PDY5i1bCbsA1MT+SXs5+2yI+Lo9o\n", "qx20UF9a4Bo=\n");

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final InterfaceC0905 f2909;

    public ViewOnClickListenerC0887(View.OnClickListener onClickListener, InterfaceC0905 interfaceC0905) {
        super(onClickListener);
        this.f2909 = interfaceC0905;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        try {
            this.f2909.mo531(this, view);
        } catch (Throwable th) {
            AbstractC0356.m204(f2908, StringFog.decrypt("egim6XTU5bYfF4DkSp3/rFoUsfQmm+KbUxO37Q==\n", "P3rUhgb0jNg=\n"), th, false);
        }
        Object obj = this.f293;
        if (obj != null) {
            ((View.OnClickListener) obj).onClick(view);
        }
    }
}
