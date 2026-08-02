package com.inmobi.media;

import android.content.Context;
import android.webkit.WebView;
import defpackage.h63;
import defpackage.joa;
import defpackage.ypa;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public abstract class D2 extends WebView {
    public final joa a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D2(Context context) {
        super(context);
        context.getClass();
        this.a = ypa.b(new h63(this, 14));
    }

    public static final C3468hb a(D2 d2) {
        return d2.d();
    }

    public abstract C3468hb d();

    @NotNull
    public final C3468hb getLandingPageHandler() {
        return (C3468hb) this.a.getValue();
    }
}
