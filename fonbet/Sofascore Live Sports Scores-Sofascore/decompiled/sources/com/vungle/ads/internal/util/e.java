package com.vungle.ads.internal.util;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;
import android.webkit.WebView;
import defpackage.xka;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class e extends xka implements Function0 {
    public final /* synthetic */ View a;
    public final /* synthetic */ Function1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(WebView webView, i iVar) {
        super(0);
        this.a = webView;
        this.b = iVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        try {
            Bitmap createBitmap = Bitmap.createBitmap(this.a.getWidth(), this.a.getHeight(), Bitmap.Config.ARGB_8888);
            this.a.draw(new Canvas(createBitmap));
            this.b.invoke(createBitmap);
        } catch (Throwable th) {
            boolean z = u.a;
            t.a("BlackScreenDetector", "Bitmap capture failed", th);
            this.b.invoke(null);
        }
        return Unit.a;
    }
}
