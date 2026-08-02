package com.vungle.ads.internal.util;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.webkit.WebView;
import defpackage.uu1;
import defpackage.xka;
import defpackage.ypa;
import defpackage.ysa;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class i extends xka implements Function1 {
    public final /* synthetic */ View a;
    public final /* synthetic */ j b;
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(WebView webView, j jVar, int i) {
        super(1);
        this.a = webView;
        this.b = jVar;
        this.c = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0028, code lost:
    
        if (r5 != null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x005d, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(j jVar, Bitmap bitmap, int i) {
        Function2 function2;
        Function2 function22;
        jVar.getClass();
        try {
            jVar.getClass();
            Pair a = j.a(bitmap, i);
            int intValue = ((Number) a.a).intValue();
            String str = (String) a.b;
            function22 = jVar.a;
            if (function22 != null) {
                function22.invoke(Integer.valueOf(intValue), str);
            }
        } catch (Throwable th) {
            try {
                boolean z = u.a;
                t.a("BlackScreenDetector", "Black screen detection failed", th);
                function2 = jVar.a;
                if (function2 != null) {
                    function2.invoke(-1, "Internal calculation error: " + th.getMessage());
                }
            } finally {
                if (bitmap != null) {
                    bitmap.recycle();
                }
                jVar.a = null;
            }
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((Bitmap) obj);
        return Unit.a;
    }

    public final void a(Bitmap bitmap) {
        Context context = this.a.getContext();
        context.getClass();
        ((com.vungle.ads.internal.executor.d) ((com.vungle.ads.internal.executor.a) ypa.a(ysa.a, new h(context)).getValue())).d().execute(new uu1(this.b, bitmap, this.c, 13));
    }
}
