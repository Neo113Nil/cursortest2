package defpackage;

import com.inmobi.media.Ei;
import com.inmobi.media.Fi;
import com.inmobi.media.Yi;
import com.ironsource.C4432za;
import com.ironsource.sdk.controller.v;
import com.sofascore.common.widget.ScrollInterceptorHorizontalScrollView;
import com.unity3d.mediation.LevelPlayAdInfo;
import java.util.HashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class ti5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ti5(Fi fi, Yi yi, boolean z) {
        this.a = 0;
        this.c = fi;
        this.d = yi;
        this.b = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap hashMap;
        Integer num;
        int i = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        boolean z = this.b;
        switch (i) {
            case 0:
                Ei.a((Fi) obj2, (Yi) obj, z);
                break;
            case 1:
                dse dseVar = (dse) obj2;
                j22 j22Var = dseVar.h;
                i22 i22Var = (i22) obj;
                int width = z ? ((ScrollInterceptorHorizontalScrollView) j22Var.p).getChildAt(0).getWidth() : 0;
                hf9 hf9Var = (hf9) dseVar.f.d();
                if (hf9Var != null && (hashMap = hf9Var.d) != null && (num = (Integer) hashMap.get(i22Var.m.a)) != null) {
                    width = num.intValue();
                }
                ((ScrollInterceptorHorizontalScrollView) j22Var.p).scrollTo(width, 0);
                break;
            case 2:
                ((v.s) obj2).a(z, (String) obj);
                break;
            default:
                C4432za.a(z, (LevelPlayAdInfo) obj2, (C4432za) obj);
                break;
        }
    }

    public /* synthetic */ ti5(v.s sVar, boolean z, String str) {
        this.a = 2;
        this.c = sVar;
        this.b = z;
        this.d = str;
    }

    public /* synthetic */ ti5(boolean z, Object obj, Object obj2, int i) {
        this.a = i;
        this.b = z;
        this.c = obj;
        this.d = obj2;
    }
}
