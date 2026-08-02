package com.inmobi.media;

import com.inmobi.media.ads.nativeAd.MediaView;
import com.inmobi.media.ads.network.common.model.AdVerification;
import com.inmobi.media.ads.network.common.model.MetaInfo;
import com.inmobi.media.ads.network.common.model.OmSdkInfo;
import com.inmobi.media.ads.network.inmobiJson.model.JsonAssetObject;
import com.inmobi.media.ads.network.inmobiJson.model.NativeImage;
import com.inmobi.media.ads.network.inmobiJson.model.NativeMedia;
import defpackage.a70;
import defpackage.dmi;
import defpackage.k13;
import defpackage.km5;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.sq3;
import defpackage.y6a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Oj extends E6 {
    public final Rc c;
    public final String d;
    public final NativeImage e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Oj(Rc rc, AbstractC3406f1 abstractC3406f1) {
        super(rc, abstractC3406f1);
        NativeMedia media;
        NativeMedia media2;
        rc.getClass();
        abstractC3406f1.getClass();
        this.c = rc;
        JsonAssetObject assetsObject = rc.b.getAssetsObject();
        NativeImage nativeImage = null;
        this.d = (assetsObject == null || (media2 = assetsObject.getMedia()) == null) ? null : media2.getType();
        JsonAssetObject assetsObject2 = rc.b.getAssetsObject();
        if (assetsObject2 != null && (media = assetsObject2.getMedia()) != null) {
            nativeImage = media.getImage();
        }
        this.e = nativeImage;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x011e, code lost:
    
        if (r11 != r1) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0120, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00e8, code lost:
    
        if (r11 == r1) goto L61;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0111 A[Catch: Exception -> 0x0030, TryCatch #0 {Exception -> 0x0030, blocks: (B:11:0x002b, B:12:0x0121, B:20:0x010b, B:22:0x0111, B:23:0x0118), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /* JADX WARN: Type inference failed for: r10v0, types: [com.inmobi.media.E6, com.inmobi.media.Oj] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v7, types: [km5] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.util.ArrayList] */
    @Override // com.inmobi.media.E6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(rq3 rq3Var) {
        Nj nj;
        int i;
        ?? r2;
        OmSdkInfo omsdkInfo;
        List<AdVerification> adVerifications;
        InterfaceC3880x9 a;
        try {
            if (rq3Var instanceof Nj) {
                nj = (Nj) rq3Var;
                int i2 = nj.c;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    nj.c = i2 - Integer.MIN_VALUE;
                    Object obj = nj.a;
                    lu3 lu3Var = lu3.a;
                    i = nj.c;
                    if (i != 0) {
                        y6a.M(obj);
                        InterfaceC3880x9 a2 = a();
                        if (a2 != null) {
                            ((C3906y9) a2).a("StaticExperienceLoader", dmi.q("load called - mediaType: ", this.d));
                        }
                        if (!Intrinsics.c(this.d, "static")) {
                            InterfaceC3880x9 a3 = a();
                            if (a3 != null) {
                                ((C3906y9) a3).b("StaticExperienceLoader", dmi.q("Invalid Media Type - expected STATIC, got: ", this.d));
                            }
                            return new J6();
                        }
                        if (this.e == null) {
                            InterfaceC3880x9 a4 = a();
                            if (a4 != null) {
                                ((C3906y9) a4).b("StaticExperienceLoader", "Invalid Native Image - nativeImage is null");
                            }
                            return new H6((short) 2361);
                        }
                        nj.c = 1;
                        MetaInfo metaInfo = this.c.a.b.d;
                        if (metaInfo == null || (omsdkInfo = metaInfo.getOmsdkInfo()) == null || (adVerifications = omsdkInfo.getAdVerifications()) == null) {
                            r2 = 0;
                        } else {
                            r2 = new ArrayList(k13.r(adVerifications, 10));
                            for (AdVerification adVerification : adVerifications) {
                                r2.add(new Nf(adVerification.getVendor(), adVerification.getVerificationParams(), adVerification.getJavascriptResource()));
                            }
                        }
                        if (r2 == 0) {
                            r2 = km5.a;
                        }
                        Object a5 = a(r2, nj);
                        if (a5 != lu3.a) {
                            a5 = Unit.a;
                        }
                    } else {
                        if (i != 1) {
                            if (i == 2) {
                                y6a.M(obj);
                                return new I6((MediaView) obj, null);
                            }
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y6a.M(obj);
                    }
                    Wj wj = new Wj(this.e.getAssets(), new C3348ck(this.c.a.b));
                    C3909yc c3909yc = (C3909yc) this.c.g.getValue();
                    a = a();
                    if (a != null) {
                        ((C3906y9) a).a("StaticExperienceLoader", "load - loading static experience via MediaViewManager");
                    }
                    nj.c = 2;
                    obj = c3909yc.a(wj, nj);
                }
            }
            if (i != 0) {
            }
            Wj wj2 = new Wj(this.e.getAssets(), new C3348ck(this.c.a.b));
            C3909yc c3909yc2 = (C3909yc) this.c.g.getValue();
            a = a();
            if (a != null) {
            }
            nj.c = 2;
            obj = c3909yc2.a(wj2, nj);
        } catch (Exception e) {
            InterfaceC3880x9 a6 = a();
            if (a6 != null) {
                ((C3906y9) a6).b("StaticExperienceLoader", dmi.q("load - exception during media view load: ", e.getMessage()));
            }
            return a(e);
        }
        nj = new Nj(this, (sq3) rq3Var);
        Object obj2 = nj.a;
        lu3 lu3Var2 = lu3.a;
        i = nj.c;
    }

    public final K6 a(Exception exc) {
        NativeImage nativeImage = this.e;
        if (nativeImage != null && nativeImage.getRequired()) {
            InterfaceC3880x9 a = a();
            if (a != null) {
                ((C3906y9) a).b("StaticExperienceLoader", "Static Load Failure: " + exc);
            }
            return new H6((short) 2362);
        }
        return new J6();
    }
}
