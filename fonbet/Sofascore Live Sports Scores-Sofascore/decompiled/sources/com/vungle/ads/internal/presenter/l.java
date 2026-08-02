package com.vungle.ads.internal.presenter;

import android.webkit.WebView;
import defpackage.fn0;
import defpackage.xka;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class l extends xka implements Function0 {
    public final /* synthetic */ r a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(r rVar, long j, long j2) {
        super(0);
        this.a = rVar;
        this.b = j;
        this.c = j2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        com.vungle.ads.internal.ui.z zVar = this.a.d;
        long j = this.b;
        long j2 = this.c;
        WebView webView = zVar.m;
        if (webView != null) {
            StringBuilder sb = new StringBuilder("window.vungle.mraidBridgeExt.notifyAvailableDiskSpace(");
            sb.append(j);
            sb.append('-');
            zVar.a(webView, fn0.n(sb, j2, ')'));
        }
        return Unit.a;
    }
}
