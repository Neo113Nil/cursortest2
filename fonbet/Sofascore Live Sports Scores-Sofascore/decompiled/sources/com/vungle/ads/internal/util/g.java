package com.vungle.ads.internal.util;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.view.View;
import android.view.Window;
import android.webkit.WebView;
import com.vungle.ads.internal.util.g;
import defpackage.joa;
import defpackage.xka;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class g extends xka implements Function0 {
    public final /* synthetic */ View a;
    public final /* synthetic */ joa b;
    public final /* synthetic */ j c;
    public final /* synthetic */ Window d;
    public final /* synthetic */ Function1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(WebView webView, joa joaVar, j jVar, Window window, i iVar) {
        super(0);
        this.a = webView;
        this.b = joaVar;
        this.c = jVar;
        this.d = window;
        this.e = iVar;
    }

    public final void a() {
        final int width = this.a.getWidth();
        final int height = this.a.getHeight();
        int[] iArr = new int[2];
        this.a.getLocationInWindow(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        final Rect rect = new Rect(i, i2, i + width, i2 + height);
        com.vungle.ads.internal.executor.j jVar = ((com.vungle.ads.internal.executor.d) j.a(this.b)).c;
        final j jVar2 = this.c;
        final Window window = this.d;
        final Function1 function1 = this.e;
        jVar.execute(new Runnable() { // from class: lbm
            @Override // java.lang.Runnable
            public final void run() {
                g.a(width, height, jVar2, window, rect, function1);
            }
        });
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        a();
        return Unit.a;
    }

    public static final void a(int i, int i2, j jVar, Window window, Rect rect, Function1 function1) {
        Bitmap bitmap;
        jVar.getClass();
        rect.getClass();
        function1.getClass();
        try {
            bitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
            try {
                j.a(jVar, window, rect, bitmap, function1);
            } catch (Throwable th) {
                th = th;
                boolean z = u.a;
                t.a("BlackScreenDetector", "Bitmap creation failed", th);
                if (bitmap != null) {
                    bitmap.recycle();
                }
                function1.invoke(null);
            }
        } catch (Throwable th2) {
            th = th2;
            bitmap = null;
        }
    }
}
