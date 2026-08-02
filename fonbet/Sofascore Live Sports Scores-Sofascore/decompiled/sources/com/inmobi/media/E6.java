package com.inmobi.media;

import android.content.Context;
import com.inmobi.media.ads.network.common.model.MetaInfo;
import com.inmobi.media.ads.network.common.model.OmSdkInfo;
import defpackage.a70;
import defpackage.hq4;
import defpackage.hs4;
import defpackage.lm5;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.sq3;
import defpackage.xw3;
import defpackage.y6a;
import defpackage.z45;
import java.util.List;
import java.util.Map;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public abstract class E6 {
    public final Rc a;
    public final AbstractC3406f1 b;

    public E6(Rc rc, AbstractC3406f1 abstractC3406f1) {
        rc.getClass();
        abstractC3406f1.getClass();
        this.a = rc;
        this.b = abstractC3406f1;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(List list, sq3 sq3Var) {
        D6 d6;
        int i;
        Object R;
        OmSdkInfo omSdkInfo;
        List list2;
        InterfaceC3880x9 a;
        String customReferenceData;
        if (sq3Var instanceof D6) {
            d6 = (D6) sq3Var;
            int i2 = d6.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                d6.e = i2 - Integer.MIN_VALUE;
                Object obj = d6.c;
                lu3 lu3Var = lu3.a;
                i = d6.e;
                if (i != 0) {
                    y6a.M(obj);
                    if (list.isEmpty()) {
                        InterfaceC3880x9 a2 = a();
                        if (a2 != null) {
                            ((C3906y9) a2).a("ExperienceLoader", "OMID trackers are empty");
                        }
                        return Unit.a;
                    }
                    MetaInfo metaInfo = this.a.a.b.d;
                    OmSdkInfo omsdkInfo = metaInfo != null ? metaInfo.getOmsdkInfo() : null;
                    boolean z = omsdkInfo != null && omsdkInfo.getOmidEnabled();
                    boolean omidEnabled = this.a.a.b.a.b.getViewability().getOmidConfig().getOmidEnabled();
                    if (!z || !omidEnabled) {
                        InterfaceC3880x9 a3 = a();
                        if (a3 != null) {
                            ((C3906y9) a3).a("ExperienceLoader", "OMID is not enabled");
                        }
                        return Unit.a;
                    }
                    Df df = Df.a;
                    d6.a = list;
                    d6.b = omsdkInfo;
                    d6.e = 1;
                    Context context = AbstractC3424fj.a;
                    if (context == null) {
                        R = "";
                    } else {
                        hs4 hs4Var = z45.a;
                        R = xw3.R(hq4.c, new Bf(context, null), d6);
                    }
                    if (R == lu3Var) {
                        return lu3Var;
                    }
                    omSdkInfo = omsdkInfo;
                    obj = R;
                    list2 = list;
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    omSdkInfo = d6.b;
                    List list3 = d6.a;
                    y6a.M(obj);
                    list2 = list3;
                }
                String str = (String) obj;
                String str2 = this.a.a.b.a.a.f;
                a = a();
                if (a != null) {
                    ((C3906y9) a).a("ExperienceLoader", "OM-SDK Session Initialize Called");
                }
                AbstractC3406f1 abstractC3406f1 = this.b;
                if (omSdkInfo != null || (r0 = omSdkInfo.getMacros()) == null) {
                    Map map = lm5.a;
                    map.getClass();
                }
                abstractC3406f1.a(str, list2, map, str2, (omSdkInfo != null || (customReferenceData = omSdkInfo.getCustomReferenceData()) == null) ? "" : customReferenceData, omSdkInfo == null && omSdkInfo.getIsolateVerificationScripts());
                return Unit.a;
            }
        }
        d6 = new D6(this, sq3Var);
        Object obj2 = d6.c;
        lu3 lu3Var2 = lu3.a;
        i = d6.e;
        if (i != 0) {
        }
        String str3 = (String) obj2;
        String str22 = this.a.a.b.a.a.f;
        a = a();
        if (a != null) {
        }
        AbstractC3406f1 abstractC3406f12 = this.b;
        if (omSdkInfo != null) {
        }
        Map map2 = lm5.a;
        map2.getClass();
        abstractC3406f12.a(str3, list2, map2, str22, (omSdkInfo != null || (customReferenceData = omSdkInfo.getCustomReferenceData()) == null) ? "" : customReferenceData, omSdkInfo == null && omSdkInfo.getIsolateVerificationScripts());
        return Unit.a;
    }

    public abstract Object a(rq3 rq3Var);

    public final InterfaceC3880x9 a() {
        return this.a.a.a.c;
    }
}
