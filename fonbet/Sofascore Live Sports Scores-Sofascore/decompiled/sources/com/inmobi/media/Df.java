package com.inmobi.media;

import android.content.Context;
import com.inmobi.media.core.config.models.AdConfig;
import defpackage.a70;
import defpackage.hq4;
import defpackage.hs4;
import defpackage.lu3;
import defpackage.sq3;
import defpackage.xw3;
import defpackage.y6a;
import defpackage.z45;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Df {
    public static final Df a = new Df();
    public static final AtomicInteger b = new AtomicInteger(0);
    public static Gf c;

    /* JADX WARN: Removed duplicated region for block: B:12:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(sq3 sq3Var) {
        C3938zf c3938zf;
        Object obj;
        int i;
        AdConfig.OmidConfig omidConfig;
        Context context;
        if (sq3Var instanceof C3938zf) {
            c3938zf = (C3938zf) sq3Var;
            int i2 = c3938zf.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c3938zf.e = i2 - Integer.MIN_VALUE;
                obj = c3938zf.c;
                Object obj2 = lu3.a;
                i = c3938zf.e;
                if (i != 0) {
                    y6a.M(obj);
                    AdConfig.OmidConfig omidConfig2 = ((AdConfig) AbstractC3435g4.a.a(AdConfig.class)).getViewability().getOmidConfig();
                    Context context2 = AbstractC3424fj.a;
                    if (context2 == null) {
                        return Unit.a;
                    }
                    c3938zf.a = omidConfig2;
                    c3938zf.b = context2;
                    c3938zf.e = 1;
                    Object a2 = a(context2, omidConfig2, c3938zf);
                    if (a2 == obj2) {
                        return obj2;
                    }
                    omidConfig = omidConfig2;
                    obj = a2;
                    context = context2;
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    context = c3938zf.b;
                    omidConfig = c3938zf.a;
                    y6a.M(obj);
                }
                if (!((Boolean) obj).booleanValue()) {
                    return Unit.a;
                }
                b.set(2);
                xw3.L(L9.c, null, null, new Af(omidConfig, context, null), 3);
                return Unit.a;
            }
        }
        c3938zf = new C3938zf(this, sq3Var);
        obj = c3938zf.c;
        Object obj22 = lu3.a;
        i = c3938zf.e;
        if (i != 0) {
        }
        if (!((Boolean) obj).booleanValue()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Context context, AdConfig.OmidConfig omidConfig, sq3 sq3Var) {
        Cf cf;
        Object obj;
        int i;
        if (sq3Var instanceof Cf) {
            cf = (Cf) sq3Var;
            int i2 = cf.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cf.c = i2 - Integer.MIN_VALUE;
                obj = cf.a;
                lu3 lu3Var = lu3.a;
                i = cf.c;
                boolean z = true;
                if (i != 0) {
                    y6a.M(obj);
                    AtomicInteger atomicInteger = b;
                    if (atomicInteger.get() != 1 && atomicInteger.get() != 2) {
                        Gf gf = c;
                        if (gf == null) {
                            gf = new Gf(context);
                            c = gf;
                        }
                        cf.c = 1;
                        hs4 hs4Var = z45.a;
                        obj = xw3.R(hq4.c, new Ef(gf, omidConfig, null), cf);
                        if (obj == lu3Var) {
                            return lu3Var;
                        }
                    }
                    return Boolean.valueOf(z);
                }
                if (i != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                if (((Boolean) obj).booleanValue()) {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        }
        cf = new Cf(this, sq3Var);
        obj = cf.a;
        lu3 lu3Var2 = lu3.a;
        i = cf.c;
        boolean z2 = true;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
        return Boolean.valueOf(z2);
    }
}
