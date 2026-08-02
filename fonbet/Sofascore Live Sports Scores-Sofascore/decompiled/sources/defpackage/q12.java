package defpackage;

import android.content.Context;
import android.widget.LinearLayout;
import com.ironsource.C4243p0;
import com.ironsource.D3;
import com.ironsource.Va;
import com.ironsource.sdk.controller.v;
import com.sofascore.common.widget.ScrollInterceptorHorizontalScrollView;
import com.vungle.ads.internal.network.q;
import com.vungle.ads.internal.network.r;
import java.util.HashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class q12 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ q12(v.s sVar, boolean z, String str, String str2) {
        this.a = 5;
        this.c = sVar;
        this.b = z;
        this.d = str;
        this.e = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap hashMap;
        Integer num;
        int i = this.a;
        int i2 = 0;
        Object obj = this.e;
        Object obj2 = this.d;
        boolean z = this.b;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                ScrollInterceptorHorizontalScrollView scrollInterceptorHorizontalScrollView = (ScrollInterceptorHorizontalScrollView) ((p12) obj3).g;
                yzc yzcVar = (yzc) obj2;
                m22 m22Var = (m22) obj;
                int width = z ? scrollInterceptorHorizontalScrollView.getChildAt(0).getWidth() : 0;
                hf9 hf9Var = (hf9) yzcVar.d();
                if (hf9Var != null && (hashMap = hf9Var.d) != null && (num = (Integer) hashMap.get(m22Var.a)) != null) {
                    width = num.intValue();
                }
                scrollInterceptorHorizontalScrollView.scrollTo(width, 0);
                break;
            case 1:
                tug tugVar = (tug) obj3;
                kse kseVar = (kse) obj2;
                LinearLayout linearLayout = kseVar.a;
                kse kseVar2 = (kse) obj;
                if (z) {
                    Context context = linearLayout.getContext();
                    context.getClass();
                    tugVar.e(context);
                }
                Integer c = tugVar.c();
                if (c != null) {
                    i2 = c.intValue();
                } else {
                    Context context2 = linearLayout.getContext();
                    context2.getClass();
                    if (hkg.c0(context2)) {
                        i2 = kseVar.b.getWidth();
                    }
                }
                kseVar.e.setScrollX(i2);
                i2a.E(kseVar2, i2);
                break;
            case 2:
                ((q8h) obj3).b.e((nx3) obj2, ((v36) obj).a, z);
                break;
            case 3:
                Va.a.a((C4243p0) obj3, (String) obj2, (D3) obj, z);
                break;
            case 4:
                r.a((r) obj3, (q) obj2, (String) obj, z);
                break;
            default:
                ((v.s) obj3).a(z, (String) obj2, (String) obj);
                break;
        }
    }

    public /* synthetic */ q12(Object obj, Object obj2, Object obj3, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = z;
    }

    public /* synthetic */ q12(boolean z, Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = z;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }
}
