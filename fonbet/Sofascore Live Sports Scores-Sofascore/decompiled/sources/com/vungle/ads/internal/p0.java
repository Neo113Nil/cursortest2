package com.vungle.ads.internal;

import android.content.Context;
import android.view.MotionEvent;
import com.vungle.ads.TpatError;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.joa;
import defpackage.ypa;
import defpackage.ysa;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.text.Regex;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class p0 {
    public static final String d = Pattern.quote("{{{req_width}}}");
    public static final String e = Pattern.quote("{{{req_height}}}");
    public static final String f = Pattern.quote("{{{width}}}");
    public static final String g = Pattern.quote("{{{height}}}");
    public static final String h = Pattern.quote("{{{down_x}}}");
    public static final String i = Pattern.quote("{{{down_y}}}");
    public static final String j = Pattern.quote("{{{up_x}}}");
    public static final String k = Pattern.quote("{{{up_y}}}");
    public final Context a;
    public final com.vungle.ads.internal.model.h0 b;
    public final l0 c;

    public p0(Context context, com.vungle.ads.internal.model.h0 h0Var) {
        context.getClass();
        h0Var.getClass();
        this.a = context;
        this.b = h0Var;
        this.c = new l0(new m0(Integer.MIN_VALUE, Integer.MIN_VALUE), new m0(Integer.MIN_VALUE, Integer.MIN_VALUE));
    }

    public final void a(MotionEvent motionEvent) {
        motionEvent.getClass();
        if (this.b.z()) {
            int action = motionEvent.getAction();
            if (action == 0) {
                this.c.a(new m0((int) motionEvent.getX(), (int) motionEvent.getY()));
                return;
            }
            if (action != 1) {
                return;
            }
            this.c.b(new m0((int) motionEvent.getX(), (int) motionEvent.getY()));
            if (this.c.c()) {
                List<String> a = com.vungle.ads.internal.model.h0.a(this.b, "video.clickCoordinates", (String) null, 6);
                if (a == null || a.isEmpty()) {
                    new TpatError(Sdk.SDKError.Reason.EMPTY_TPAT_ERROR, "Empty urls for tpat: video.clickCoordinates").setLogEntry$vungle_ads_release(this.b.q()).logErrorNoReturnValue$vungle_ads_release();
                    return;
                }
                int d2 = this.b.d();
                Context context = this.a;
                int a2 = d2 == 0 ? new n0(context).b.widthPixels : com.vungle.ads.internal.util.a0.a(context, d2);
                int a3 = this.b.a();
                Context context2 = this.a;
                int a4 = a3 == 0 ? new n0(context2).b.heightPixels : com.vungle.ads.internal.util.a0.a(context2, a3);
                int d3 = this.b.d();
                Context context3 = this.a;
                int a5 = d3 == 0 ? new n0(context3).b.widthPixels : com.vungle.ads.internal.util.a0.a(context3, d3);
                int a6 = this.b.a();
                Context context4 = this.a;
                int a7 = a6 == 0 ? new n0(context4).b.heightPixels : com.vungle.ads.internal.util.a0.a(context4, a6);
                joa a8 = ypa.a(ysa.a, new o0(this.a));
                for (String str : a) {
                    String str2 = d;
                    str2.getClass();
                    String replace = new Regex(str2).replace(str, String.valueOf(a2));
                    String str3 = e;
                    str3.getClass();
                    String replace2 = new Regex(str3).replace(replace, String.valueOf(a4));
                    String str4 = f;
                    str4.getClass();
                    String replace3 = new Regex(str4).replace(replace2, String.valueOf(a5));
                    String str5 = g;
                    str5.getClass();
                    String replace4 = new Regex(str5).replace(replace3, String.valueOf(a7));
                    String str6 = h;
                    str6.getClass();
                    String replace5 = new Regex(str6).replace(replace4, String.valueOf(this.c.a().a()));
                    String str7 = i;
                    str7.getClass();
                    String replace6 = new Regex(str7).replace(replace5, String.valueOf(this.c.a().b()));
                    String str8 = j;
                    str8.getClass();
                    String replace7 = new Regex(str8).replace(replace6, String.valueOf(this.c.b().a()));
                    String str9 = k;
                    str9.getClass();
                    ((com.vungle.ads.internal.network.r) a8.getValue()).a(new com.vungle.ads.internal.network.p(new Regex(str9).replace(replace7, String.valueOf(this.c.b().b()))).b("coordinate").a(), false);
                }
            }
        }
    }
}
