package com.inmobi.media;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.URLUtil;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.inmobi.media.ads.network.inmobiJson.model.Image;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.squareup.picasso.Picasso;
import defpackage.a70;
import defpackage.asf;
import defpackage.b1d;
import defpackage.dmi;
import defpackage.f1d;
import defpackage.fc6;
import defpackage.hq4;
import defpackage.hs4;
import defpackage.ivj;
import defpackage.ku3;
import defpackage.lu3;
import defpackage.me4;
import defpackage.r69;
import defpackage.rob;
import defpackage.sq3;
import defpackage.tub;
import defpackage.xw3;
import defpackage.y6a;
import defpackage.z45;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Vj extends AbstractC3640o2 {
    public final ku3 b;
    public final Wj c;
    public final b1d d;
    public final C3906y9 e;
    public final String f;
    public final C3322bk g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Vj(Context context, ku3 ku3Var, Wj wj, b1d b1dVar, C3906y9 c3906y9) {
        super(context);
        context.getClass();
        ku3Var.getClass();
        wj.getClass();
        b1dVar.getClass();
        this.b = ku3Var;
        this.c = wj;
        this.d = b1dVar;
        this.e = c3906y9;
        this.f = dmi.q("Static-Image-", fc6.C());
        int i = C3322bk.b;
        context.getClass();
        this.g = new C3322bk(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v0, types: [com.inmobi.media.Vj] */
    @Override // com.inmobi.media.AbstractC3640o2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(sq3 sq3Var) {
        Qj qj;
        int i;
        C3906y9 c3906y9;
        if (sq3Var instanceof Qj) {
            qj = (Qj) sq3Var;
            int i2 = qj.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qj.c = i2 - Integer.MIN_VALUE;
                Object obj = qj.a;
                lu3 lu3Var = lu3.a;
                i = qj.c;
                if (i != 0) {
                    y6a.M(obj);
                    C3906y9 c3906y92 = this.e;
                    if (c3906y92 != null) {
                        c3906y92.a("StaticExperienceManager", "load Called - imageAssets count: " + this.c.a.size());
                    }
                    Map a = Hk.a(this.c.b.a);
                    C3839vk c3839vk = C3839vk.a;
                    C3839vk.b("MainImageLoadStarted", a, EnumC3943zk.SDK);
                    List list = this.c.a;
                    ArrayList k = me4.k(list);
                    for (Object obj2 : list) {
                        Image image = (Image) obj2;
                        if (URLUtil.isHttpUrl(image.getUrl()) || URLUtil.isHttpsUrl(image.getUrl())) {
                            k.add(obj2);
                        }
                    }
                    if (k.isEmpty()) {
                        C3906y9 c3906y93 = this.e;
                        if (c3906y93 != null) {
                            c3906y93.a("StaticExperienceManager", "Sanitized Images Empty - no valid images to load");
                        }
                        LinkedHashMap q = tub.q(Hk.a(this.c.b.a));
                        q.put(IronSourceConstants.EVENTS_ERROR_CODE, (short) 2351);
                        C3839vk c3839vk2 = C3839vk.a;
                        C3839vk.b("MainImageLoadFailure", q, EnumC3943zk.SDK);
                        throw new C3702qc();
                    }
                    int size = k.size();
                    ArrayList arrayList = k;
                    if (size > 1) {
                        int a2 = G5.a();
                        int ordinal = G4.a().ordinal();
                        arrayList = ordinal != 2 ? ordinal != 3 ? CollectionsKt.H0(k, new Zj()) : a2 > 720 ? CollectionsKt.H0(k, new C3296ak()) : CollectionsKt.H0(k, new Xj(a2)) : CollectionsKt.H0(k, new Yj(a2));
                    }
                    C3322bk c3322bk = this.g;
                    qj.c = 1;
                    if (a(arrayList, c3322bk, qj) == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                c3906y9 = this.e;
                if (c3906y9 != null) {
                    c3906y9.a("StaticExperienceManager", "Static Load Success");
                }
                Map a3 = Hk.a(this.c.b.a);
                C3839vk c3839vk3 = C3839vk.a;
                C3839vk.b("MainImageLoadSuccess", a3, EnumC3943zk.SDK);
                return Unit.a;
            }
        }
        qj = new Qj(this, sq3Var);
        Object obj3 = qj.a;
        lu3 lu3Var2 = lu3.a;
        i = qj.c;
        if (i != 0) {
        }
        c3906y9 = this.e;
        if (c3906y9 != null) {
        }
        Map a32 = Hk.a(this.c.b.a);
        C3839vk c3839vk32 = C3839vk.a;
        C3839vk.b("MainImageLoadSuccess", a32, EnumC3943zk.SDK);
        return Unit.a;
    }

    @Override // com.inmobi.media.AbstractC3640o2
    public final void b() {
    }

    @Override // com.inmobi.media.AbstractC3640o2
    public final void a(f1d f1dVar) {
        f1dVar.getClass();
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a1, code lost:
    
        if (defpackage.xw3.R(r11, r0, r7) != r8) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(List list, ImageView imageView, sq3 sq3Var) {
        Rj rj;
        int i;
        ImageView imageView2;
        asf asfVar;
        List list2;
        if (sq3Var instanceof Rj) {
            rj = (Rj) sq3Var;
            int i2 = rj.f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rj.f = i2 - Integer.MIN_VALUE;
                Rj rj2 = rj;
                Object obj = rj2.d;
                lu3 lu3Var = lu3.a;
                i = rj2.f;
                if (i != 0) {
                    y6a.M(obj);
                    C3906y9 c3906y9 = this.e;
                    if (c3906y9 != null) {
                        c3906y9.a("StaticExperienceManager", "loadImagesIntoImageView - attempting to load " + list.size() + " images");
                    }
                    asf asfVar2 = new asf();
                    hs4 hs4Var = z45.a;
                    r69 r69Var = rob.a;
                    Tj tj = new Tj(this, null);
                    rj2.a = list;
                    rj2.b = imageView;
                    rj2.c = asfVar2;
                    rj2.f = 1;
                    obj = xw3.R(r69Var, tj, rj2);
                    if (obj != lu3Var) {
                        imageView2 = imageView;
                        asfVar = asfVar2;
                        list2 = list;
                    }
                    return lu3Var;
                }
                if (i != 1) {
                    if (i == 2) {
                        y6a.M(obj);
                        return Unit.a;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                asf asfVar3 = rj2.c;
                ImageView imageView3 = rj2.b;
                List list3 = rj2.a;
                y6a.M(obj);
                asfVar = asfVar3;
                list2 = list3;
                imageView2 = imageView3;
                Bitmap.Config config = (Bitmap.Config) obj;
                hs4 hs4Var2 = z45.a;
                hq4 hq4Var = hq4.c;
                Sj sj = new Sj(list2, this, asfVar, imageView2, config, null);
                rj2.a = null;
                rj2.b = null;
                rj2.c = null;
                rj2.f = 2;
            }
        }
        rj = new Rj(this, sq3Var);
        Rj rj22 = rj;
        Object obj2 = rj22.d;
        lu3 lu3Var2 = lu3.a;
        i = rj22.f;
        if (i != 0) {
        }
        Bitmap.Config config2 = (Bitmap.Config) obj2;
        hs4 hs4Var22 = z45.a;
        hq4 hq4Var2 = hq4.c;
        Sj sj2 = new Sj(list2, this, asfVar, imageView2, config2, null);
        rj22.a = null;
        rj22.b = null;
        rj22.c = null;
        rj22.f = 2;
    }

    @Override // com.inmobi.media.AbstractC3640o2
    public final Object a(FrameLayout frameLayout, C3883xc c3883xc) {
        hs4 hs4Var = z45.a;
        Object R = xw3.R(rob.a, new Pj(this, frameLayout, null), c3883xc);
        return R == lu3.a ? R : Unit.a;
    }

    @Override // com.inmobi.media.AbstractC3640o2
    public final void a() {
        ViewParent parent = this.g.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        Picasso picasso = C3447gg.a;
        C3447gg.b(this.a).cancelTag(this.f);
    }

    public final void a(ImageView imageView, Image image) {
        imageView.setOnClickListener(new ivj(5, this, image));
    }

    public static final void a(Vj vj, Image image, View view) {
        C3906y9 c3906y9 = vj.e;
        if (c3906y9 != null) {
            c3906y9.a("StaticExperienceManager", "Static Click Event");
        }
        xw3.L(vj.b, null, null, new Uj(image, vj, null), 3);
    }
}
