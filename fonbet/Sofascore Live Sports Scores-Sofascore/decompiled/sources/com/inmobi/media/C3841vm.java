package com.inmobi.media;

import com.inmobi.media.ads.nativeAd.MediaView;
import com.inmobi.media.ads.network.common.model.TrackingInfo;
import com.inmobi.media.ads.network.inmobiJson.model.JsonAssetObject;
import com.inmobi.media.ads.network.inmobiJson.model.NativeMedia;
import com.inmobi.media.ads.network.inmobiJson.model.NativeVideo;
import com.inmobi.media.ads.network.inmobiJson.model.VideoExperience;
import com.inmobi.media.core.config.models.AdConfig;
import defpackage.a70;
import defpackage.dmi;
import defpackage.km5;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.sq3;
import defpackage.y6a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.vm, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3841vm extends E6 {
    public final Rc c;
    public final String d;
    public final NativeVideo e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3841vm(Rc rc, AbstractC3406f1 abstractC3406f1) {
        super(rc, abstractC3406f1);
        rc.getClass();
        abstractC3406f1.getClass();
        this.c = rc;
        JsonAssetObject assetsObject = rc.b.getAssetsObject();
        NativeMedia media = assetsObject != null ? assetsObject.getMedia() : null;
        this.d = media != null ? media.getType() : null;
        this.e = media != null ? media.getVideo() : null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x0135, code lost:
    
        if (a(r8, r2) == r3) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x00af, code lost:
    
        if (r1 == r3) goto L86;
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    @Override // com.inmobi.media.E6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(rq3 rq3Var) {
        C3763sm c3763sm;
        int i;
        Pl pl;
        List<TrackingInfo> list;
        NativeVideo video;
        if (rq3Var instanceof C3763sm) {
            c3763sm = (C3763sm) rq3Var;
            int i2 = c3763sm.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c3763sm.d = i2 - Integer.MIN_VALUE;
                Object obj = c3763sm.b;
                Object obj2 = lu3.a;
                i = c3763sm.d;
                if (i != 0) {
                    y6a.M(obj);
                    InterfaceC3880x9 a = a();
                    if (a != null) {
                        ((C3906y9) a).a("VideoExperienceLoader", dmi.q("load called - mediaType: ", this.d));
                    }
                    if (!Intrinsics.c(this.d, "video")) {
                        InterfaceC3880x9 a2 = a();
                        if (a2 != null) {
                            ((C3906y9) a2).b("VideoExperienceLoader", dmi.q("Invalid Media Type - expected VIDEO, got: ", this.d));
                        }
                        return new J6();
                    }
                    NativeVideo nativeVideo = this.e;
                    if (nativeVideo == null) {
                        InterfaceC3880x9 a3 = a();
                        if (a3 != null) {
                            ((C3906y9) a3).b("VideoExperienceLoader", "Invalid Native Video - nativeVideo is null");
                        }
                        return new H6((short) 2361);
                    }
                    ArrayList a4 = H4.a("error", nativeVideo.getTrackers());
                    String vastTag = this.e.getVastTag();
                    c3763sm.d = 1;
                    obj = a(vastTag, a4, c3763sm);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                y6a.M(obj);
                                return obj;
                            }
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        pl = c3763sm.a;
                        y6a.M(obj);
                        String str = pl.a;
                        String str2 = pl.b;
                        int a5 = AbstractC3504im.a(pl.e);
                        ArrayList arrayList = pl.c;
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            Object next = it.next();
                            if (!(((Je) next) instanceof Nf)) {
                                arrayList2.add(next);
                            }
                        }
                        Jl jl = new Jl(str, str2, a5, arrayList2);
                        String str3 = pl.e;
                        ArrayList arrayList3 = pl.f;
                        ArrayList arrayList4 = pl.g;
                        AdConfig.VastVideoConfig vastVideo = this.c.a.b.a.b.getVastVideo();
                        VideoExperience experience = this.e.getExperience();
                        C3691q1 c3691q1 = this.c.a.b.a;
                        C3687pn c3687pn = new C3687pn(c3691q1.a.g, experience, c3691q1.b.getNative());
                        Rc rc = this.c;
                        rc.getClass();
                        C3328c0 c3328c0 = rc.a.a.d;
                        JsonAssetObject assetsObject = rc.b.getAssetsObject();
                        NativeMedia media = assetsObject != null ? assetsObject.getMedia() : null;
                        if (media == null || (video = media.getVideo()) == null || (list = video.getTrackers()) == null) {
                            list = km5.a;
                        }
                        Om om = new Om(str3, arrayList3, arrayList4, vastVideo, c3687pn, new C3582lm(jl, c3328c0, new Fn(list)), new Pn(this.c.a.b), new C3358d4(this.c.a.b));
                        c3763sm.a = null;
                        c3763sm.d = 3;
                        Object a6 = a(jl, om, c3763sm);
                        return a6 == obj2 ? obj2 : a6;
                    }
                    y6a.M(obj);
                }
                pl = (Pl) obj;
                if (pl != null) {
                    NativeVideo nativeVideo2 = this.e;
                    if (!(nativeVideo2 != null ? nativeVideo2.getRequired() : false)) {
                        return new J6();
                    }
                    InterfaceC3880x9 a7 = a();
                    if (a7 != null) {
                        ((C3906y9) a7).b("VideoExperienceLoader", "Vast Parse Failure - Video Required");
                    }
                    return new H6((short) 2360);
                }
                Rc rc2 = this.c;
                String str4 = pl.d;
                ArrayList arrayList5 = pl.c;
                ArrayList arrayList6 = new ArrayList();
                Iterator it2 = arrayList5.iterator();
                while (it2.hasNext()) {
                    Object next2 = it2.next();
                    if (Intrinsics.c(((Je) next2).b, "click")) {
                        arrayList6.add(next2);
                    }
                }
                rc2.e = new Kl(str4, arrayList6);
                ArrayList arrayList7 = pl.c;
                ArrayList arrayList8 = new ArrayList();
                Iterator it3 = arrayList7.iterator();
                while (it3.hasNext()) {
                    Object next3 = it3.next();
                    if (next3 instanceof Nf) {
                        arrayList8.add(next3);
                    }
                }
                c3763sm.a = pl;
                c3763sm.d = 2;
            }
        }
        c3763sm = new C3763sm(this, (sq3) rq3Var);
        Object obj3 = c3763sm.b;
        Object obj22 = lu3.a;
        i = c3763sm.d;
        if (i != 0) {
        }
        pl = (Pl) obj3;
        if (pl != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Jl jl, Om om, sq3 sq3Var) {
        C3789tm c3789tm;
        int i;
        try {
            if (sq3Var instanceof C3789tm) {
                c3789tm = (C3789tm) sq3Var;
                int i2 = c3789tm.d;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    c3789tm.d = i2 - Integer.MIN_VALUE;
                    Object obj = c3789tm.b;
                    lu3 lu3Var = lu3.a;
                    i = c3789tm.d;
                    if (i != 0) {
                        y6a.M(obj);
                        C3909yc c3909yc = (C3909yc) this.c.g.getValue();
                        InterfaceC3880x9 a = a();
                        if (a != null) {
                            ((C3906y9) a).a("VideoExperienceLoader", "onPrepareExperienceModelSuccess - loading video experience");
                        }
                        c3789tm.a = jl;
                        c3789tm.d = 1;
                        obj = c3909yc.a(om, c3789tm);
                        if (obj == lu3Var) {
                            return lu3Var;
                        }
                    } else {
                        if (i != 1) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        jl = c3789tm.a;
                        y6a.M(obj);
                    }
                    return new I6((MediaView) obj, jl);
                }
            }
            if (i != 0) {
            }
            return new I6((MediaView) obj, jl);
        } catch (Exception e) {
            InterfaceC3880x9 a2 = a();
            if (a2 != null) {
                ((C3906y9) a2).b("VideoExperienceLoader", dmi.q("onPrepareExperienceModelSuccess - exception during media load: ", e.getMessage()));
            }
            return a(e, jl);
        }
        c3789tm = new C3789tm(this, sq3Var);
        Object obj2 = c3789tm.b;
        lu3 lu3Var2 = lu3.a;
        i = c3789tm.d;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ArrayList arrayList, sq3 sq3Var) {
        C3815um c3815um;
        int i;
        try {
            if (sq3Var instanceof C3815um) {
                c3815um = (C3815um) sq3Var;
                int i2 = c3815um.c;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    c3815um.c = i2 - Integer.MIN_VALUE;
                    Object obj = c3815um.a;
                    lu3 lu3Var = lu3.a;
                    i = c3815um.c;
                    if (i != 0) {
                        y6a.M(obj);
                        InterfaceC3880x9 a = a();
                        if (a != null) {
                            ((C3906y9) a).a("VideoExperienceLoader", "parseVastTag - processing VAST tag with " + arrayList.size() + " error URLs");
                        }
                        C3479hm c3479hm = C3479hm.a;
                        C3870x c3870x = this.c.a;
                        c3815um.c = 1;
                        obj = c3479hm.a(str, c3870x, arrayList, c3815um);
                        if (obj == lu3Var) {
                            return lu3Var;
                        }
                    } else {
                        if (i != 1) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y6a.M(obj);
                    }
                    return (Pl) obj;
                }
            }
            if (i != 0) {
            }
            return (Pl) obj;
        } catch (Sl e) {
            InterfaceC3880x9 a2 = a();
            if (a2 != null) {
                ((C3906y9) a2).b("VideoExperienceLoader", dmi.q("parseVastTag - VAST parse exception: ", e.getMessage()));
            }
            return null;
        }
        c3815um = new C3815um(this, sq3Var);
        Object obj2 = c3815um.a;
        lu3 lu3Var2 = lu3.a;
        i = c3815um.c;
    }

    public final K6 a(Exception exc, Jl jl) {
        NativeVideo nativeVideo = this.e;
        if (nativeVideo != null ? nativeVideo.getRequired() : false) {
            InterfaceC3880x9 a = a();
            if (a != null) {
                ((C3906y9) a).b("VideoExperienceLoader", "Media Load Failure: " + exc);
            }
            return new H6((short) 2362);
        }
        return new J6(jl);
    }
}
