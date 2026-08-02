package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast;

import com.ironsource.Y1;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import defpackage.a70;
import defpackage.glf;
import defpackage.hoi;
import defpackage.ku3;
import defpackage.lu3;
import defpackage.mqi;
import defpackage.rq3;
import defpackage.y6a;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.Regex;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class e1 extends hoi implements Function2 {
    public final /* synthetic */ List A;
    public final /* synthetic */ com.moloco.sdk.internal.services.events.c B;
    public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.core.services.g C;
    public final /* synthetic */ f1 D;
    public final /* synthetic */ List E;
    public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.e0 F;
    public final /* synthetic */ Integer G;
    public final /* synthetic */ String H;
    public com.moloco.sdk.internal.services.events.c r;
    public com.moloco.sdk.xenoss.sdkdevkit.android.core.services.g s;
    public f1 t;
    public List u;
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.e0 v;
    public Integer w;
    public String x;
    public Iterator y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(List list, com.moloco.sdk.internal.services.events.c cVar, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.g gVar, f1 f1Var, List list2, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.e0 e0Var, Integer num, String str, rq3 rq3Var) {
        super(2, rq3Var);
        this.A = list;
        this.B = cVar;
        this.C = gVar;
        this.D = f1Var;
        this.E = list2;
        this.F = e0Var;
        this.G = num;
        this.H = str;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new e1(this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((e1) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0093  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0057 -> B:6:0x0091). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0059 -> B:6:0x0091). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0080 -> B:5:0x0087). Please report as a decompilation issue!!! */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Integer num;
        String str;
        com.moloco.sdk.xenoss.sdkdevkit.android.core.services.g gVar;
        f1 f1Var;
        List list;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.e0 e0Var;
        Iterator it;
        com.moloco.sdk.internal.services.events.c cVar;
        String str2;
        e1 e1Var = this;
        lu3 lu3Var = lu3.a;
        int i = e1Var.z;
        if (i == 0) {
            y6a.M(obj);
            Iterator it2 = e1Var.A.iterator();
            com.moloco.sdk.internal.services.events.c cVar2 = e1Var.B;
            com.moloco.sdk.xenoss.sdkdevkit.android.core.services.g gVar2 = e1Var.C;
            f1 f1Var2 = e1Var.D;
            List list2 = e1Var.E;
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.e0 e0Var2 = e1Var.F;
            num = e1Var.G;
            str = e1Var.H;
            gVar = gVar2;
            f1Var = f1Var2;
            list = list2;
            e0Var = e0Var2;
            it = it2;
            cVar = cVar2;
            if (it.hasNext()) {
            }
        } else {
            if (i != 1) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            Iterator it3 = e1Var.y;
            String str3 = e1Var.x;
            Integer num2 = e1Var.w;
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.e0 e0Var3 = e1Var.v;
            List list3 = e1Var.u;
            f1 f1Var3 = e1Var.t;
            com.moloco.sdk.xenoss.sdkdevkit.android.core.services.g gVar3 = e1Var.s;
            com.moloco.sdk.internal.services.events.c cVar3 = e1Var.r;
            y6a.M(obj);
            com.moloco.sdk.internal.services.events.c cVar4 = cVar3;
            str = str3;
            Object b = obj;
            e0Var = e0Var3;
            list = list3;
            f1Var = f1Var3;
            gVar = gVar3;
            it = it3;
            String str4 = (String) b;
            num = num2;
            cVar = cVar4;
            Integer num3 = e0Var == null ? new Integer(e0Var.a) : null;
            mqi mqiVar = g1.a;
            glf.a.getClass();
            String format = String.format("%08d", Arrays.copyOf(new Object[]{Integer.valueOf(glf.b.e(1, 99999999))}, 1));
            if (num3 != null) {
                str4 = g1.b.replace(str4, num3.toString());
            }
            if (num != null) {
                str4 = g1.g.replace(g1.h.replace(g1.c.replace(str4, g1.a(num.intValue())), g1.a(num.intValue())), Y1.f);
            }
            if (str != null) {
                Regex regex = g1.e;
                try {
                } catch (Exception unused) {
                    str2 = "";
                }
                str2 = URLEncoder.encode(str, C.UTF8_NAME);
                str4 = regex.replace(str4, str2);
            }
            f1Var.a.a(g1.f.replace(g1.d.replace(str4, format), ""));
            e1Var = this;
            if (it.hasNext()) {
                str4 = (String) it.next();
                if (cVar != null && gVar != null) {
                    long currentTimeMillis = System.currentTimeMillis();
                    e1Var.r = cVar;
                    e1Var.s = gVar;
                    e1Var.t = f1Var;
                    e1Var.u = list;
                    e1Var.v = e0Var;
                    e1Var.w = num;
                    e1Var.x = str;
                    e1Var.y = it;
                    e1Var.z = 1;
                    b = cVar.b(currentTimeMillis, new com.moloco.sdk.xenoss.sdkdevkit.android.core.services.e(gVar, null, null, list), str4, e1Var);
                    if (b == lu3Var) {
                        return lu3Var;
                    }
                    cVar4 = cVar;
                    it3 = it;
                    num2 = num;
                    e0Var3 = e0Var;
                    list3 = list;
                    f1Var3 = f1Var;
                    gVar3 = gVar;
                    e0Var = e0Var3;
                    list = list3;
                    f1Var = f1Var3;
                    gVar = gVar3;
                    it = it3;
                    String str42 = (String) b;
                    num = num2;
                    cVar = cVar4;
                }
                if (e0Var == null) {
                }
                mqi mqiVar2 = g1.a;
                glf.a.getClass();
                String format2 = String.format("%08d", Arrays.copyOf(new Object[]{Integer.valueOf(glf.b.e(1, 99999999))}, 1));
                if (num3 != null) {
                }
                if (num != null) {
                }
                if (str != null) {
                }
                f1Var.a.a(g1.f.replace(g1.d.replace(str42, format2), ""));
                e1Var = this;
                if (it.hasNext()) {
                    return Unit.a;
                }
            }
        }
    }
}
