package com.inmobi.media;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import defpackage.lm5;
import defpackage.p2g;
import defpackage.w2g;
import defpackage.yp8;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Lo {
    public final Xe a;
    public final C3667p3 b;
    public final long c;
    public Function0 d;
    public Ko e;
    public final Handler f;
    public Runnable g;

    public Lo(Xe xe, C3667p3 c3667p3, long j, Function0 function0) {
        xe.getClass();
        c3667p3.getClass();
        this.a = xe;
        this.b = c3667p3;
        this.c = j;
        this.d = function0;
        this.f = new Handler(Looper.getMainLooper());
    }

    public final void a() {
        Runnable runnable = this.g;
        if (runnable != null) {
            this.f.removeCallbacks(runnable);
        }
        this.g = null;
        try {
            p2g p2gVar = w2g.b;
            Ko ko = this.e;
            if (ko != null && !ko.a) {
                ko.stopLoading();
                ko.removeAllViews();
                ko.destroy();
            }
            Unit unit = Unit.a;
        } catch (Throwable unused) {
            p2g p2gVar2 = w2g.b;
        }
        this.e = null;
    }

    public final void b() {
        try {
            Context context = AbstractC3424fj.a;
            if (context != null) {
                Ko ko = new Ko(context);
                ko.setWebViewClient(this.b);
                ko.getSettings().setJavaScriptEnabled(true);
                ko.getSettings().setCacheMode(2);
                this.e = ko;
            }
            Ko ko2 = this.e;
            if (ko2 != null) {
                Xe xe = this.a;
                String a = AbstractC3446gf.a(xe.a, xe.d);
                Map<String, String> map = this.a.b;
                if (map == null) {
                    map = lm5.a;
                    map.getClass();
                }
                ko2.loadUrl(a, map);
            }
            long j = this.c;
            if (j > 0) {
                yp8 yp8Var = new yp8(this, 8);
                this.f.postDelayed(yp8Var, j);
                this.g = yp8Var;
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public static final void a(Lo lo) {
        String str = lo.a.a;
        lo.a();
        Function0 function0 = lo.d;
        if (function0 != null) {
            function0.invoke();
        }
        lo.d = null;
    }
}
