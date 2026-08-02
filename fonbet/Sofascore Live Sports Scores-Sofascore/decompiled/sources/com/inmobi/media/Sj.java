package com.inmobi.media;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.inmobi.media.ads.network.inmobiJson.model.Image;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.squareup.picasso.Picasso;
import defpackage.asf;
import defpackage.fc6;
import defpackage.hoi;
import defpackage.kdc;
import defpackage.ku3;
import defpackage.lu3;
import defpackage.p2g;
import defpackage.rq3;
import defpackage.tub;
import defpackage.u2g;
import defpackage.w2g;
import defpackage.y6a;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Sj extends hoi implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ List b;
    public final /* synthetic */ Vj c;
    public final /* synthetic */ asf d;
    public final /* synthetic */ ImageView e;
    public final /* synthetic */ Bitmap.Config f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Sj(List list, Vj vj, asf asfVar, ImageView imageView, Bitmap.Config config, rq3 rq3Var) {
        super(2, rq3Var);
        this.b = list;
        this.c = vj;
        this.d = asfVar;
        this.e = imageView;
        this.f = config;
    }

    public static final void a(Vj vj, ImageView imageView, Pair pair) {
        C3906y9 c3906y9 = vj.e;
        if (c3906y9 != null) {
            c3906y9.a("StaticExperienceManager", "loadImagesIntoImageView - setting bitmap to ImageView");
        }
        vj.a(imageView, (Image) pair.b);
        imageView.setImageBitmap((Bitmap) pair.a);
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        Sj sj = new Sj(this.b, this.c, this.d, this.e, this.f, rq3Var);
        sj.a = obj;
        return sj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((Sj) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        Pair pair;
        Object u2gVar;
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        List list = this.b;
        Vj vj = this.c;
        Bitmap.Config config = this.f;
        asf asfVar = this.d;
        Iterator it = list.iterator();
        do {
            pair = null;
            if (!it.hasNext()) {
                break;
            }
            Image image = (Image) it.next();
            C3906y9 c3906y9 = vj.e;
            if (c3906y9 != null) {
                c3906y9.a("StaticExperienceManager", "loadImagesIntoImageView - trying to load image from URL: " + image.getUrl());
            }
            try {
                p2g p2gVar = w2g.b;
                Picasso picasso = C3447gg.a;
                u2gVar = C3447gg.b(vj.a).load(image.getUrl()).tag(vj.f).transform(new C3318bg(config)).get();
            } catch (Throwable th) {
                p2g p2gVar2 = w2g.b;
                u2gVar = new u2g(th);
            }
            Throwable a = w2g.a(u2gVar);
            if (a != null) {
                C3906y9 c3906y92 = vj.e;
                if (c3906y92 != null) {
                    c3906y92.a("StaticExperienceManager", fc6.n("Bitmap Failure ", image.getUrl(), " ", a.getMessage()));
                }
                if (a instanceof C3623nb) {
                    asfVar.a = true;
                }
            }
            if (u2gVar instanceof u2g) {
                u2gVar = null;
            }
            Bitmap bitmap = (Bitmap) u2gVar;
            if (bitmap != null) {
                pair = new Pair(bitmap, image);
            }
        } while (pair == null);
        if (pair != null) {
            ImageView imageView = this.e;
            return Boolean.valueOf(imageView.post(new kdc(16, this.c, imageView, pair)));
        }
        C3906y9 c3906y93 = this.c.e;
        if (c3906y93 != null) {
            c3906y93.b("StaticExperienceManager", "Bitmap Load Failure - no images could be loaded");
        }
        Vj vj2 = this.c;
        boolean z = this.d.a;
        vj2.getClass();
        short s = z ? (short) 81 : (short) 82;
        LinkedHashMap q = tub.q(Hk.a(vj2.c.b.a));
        q.put(IronSourceConstants.EVENTS_ERROR_CODE, Short.valueOf(s));
        C3839vk c3839vk = C3839vk.a;
        C3839vk.b("MainImageLoadFailure", q, EnumC3943zk.SDK);
        throw new C3702qc();
    }
}
