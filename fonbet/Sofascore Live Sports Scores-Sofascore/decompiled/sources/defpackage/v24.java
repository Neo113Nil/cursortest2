package defpackage;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.g;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.f0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.k;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.o;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.r;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class v24 extends hoi implements ct8 {
    public final /* synthetic */ int r;
    public /* synthetic */ boolean s;
    public /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v24(int i, rq3 rq3Var, int i2) {
        super(i, rq3Var);
        this.r = i2;
    }

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = 3;
        switch (this.r) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                v24 v24Var = new v24(i, (rq3) obj3, 0);
                v24Var.s = booleanValue;
                v24Var.t = (ey4) obj2;
                return v24Var.invokeSuspend(Unit.a);
            case 1:
                boolean booleanValue2 = ((Boolean) obj2).booleanValue();
                v24 v24Var2 = new v24(i, (rq3) obj3, 1);
                v24Var2.t = (List) obj;
                v24Var2.s = booleanValue2;
                return v24Var2.invokeSuspend(Unit.a);
            case 2:
                boolean booleanValue3 = ((Boolean) obj).booleanValue();
                v24 v24Var3 = new v24(i, (rq3) obj3, 2);
                v24Var3.s = booleanValue3;
                v24Var3.t = (d) obj2;
                return v24Var3.invokeSuspend(Unit.a);
            case 3:
                boolean booleanValue4 = ((Boolean) obj).booleanValue();
                v24 v24Var4 = new v24(i, (rq3) obj3, i);
                v24Var4.s = booleanValue4;
                v24Var4.t = (g) obj2;
                return v24Var4.invokeSuspend(Unit.a);
            case 4:
                boolean booleanValue5 = ((Boolean) obj).booleanValue();
                v24 v24Var5 = new v24(i, (rq3) obj3, 4);
                v24Var5.s = booleanValue5;
                v24Var5.t = (f0) obj2;
                return v24Var5.invokeSuspend(Unit.a);
            case 5:
                boolean booleanValue6 = ((Boolean) obj).booleanValue();
                v24 v24Var6 = new v24(i, (rq3) obj3, 5);
                v24Var6.s = booleanValue6;
                v24Var6.t = (o) obj2;
                return v24Var6.invokeSuspend(Unit.a);
            case 6:
                boolean booleanValue7 = ((Boolean) obj).booleanValue();
                v24 v24Var7 = new v24(i, (rq3) obj3, 6);
                v24Var7.s = booleanValue7;
                v24Var7.t = (r) obj2;
                return v24Var7.invokeSuspend(Unit.a);
            default:
                boolean booleanValue8 = ((Boolean) obj2).booleanValue();
                v24 v24Var8 = new v24(i, (rq3) obj3, 7);
                v24Var8.t = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.d) obj;
                v24Var8.s = booleanValue8;
                return v24Var8.invokeSuspend(Unit.a);
        }
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        switch (this.r) {
            case 0:
                boolean z = this.s;
                ey4 ey4Var = (ey4) this.t;
                lu3 lu3Var = lu3.a;
                y6a.M(obj);
                return new s24(ey4Var, z);
            case 1:
                List list = (List) this.t;
                boolean z2 = this.s;
                lu3 lu3Var2 = lu3.a;
                y6a.M(obj);
                return Boolean.valueOf((list.isEmpty() || z2) ? false : true);
            case 2:
                lu3 lu3Var3 = lu3.a;
                y6a.M(obj);
                return new Pair(Boolean.valueOf(this.s), (d) this.t);
            case 3:
                lu3 lu3Var4 = lu3.a;
                y6a.M(obj);
                return new Pair(Boolean.valueOf(this.s), (g) this.t);
            case 4:
                lu3 lu3Var5 = lu3.a;
                y6a.M(obj);
                return new Pair(Boolean.valueOf(this.s), (f0) this.t);
            case 5:
                lu3 lu3Var6 = lu3.a;
                y6a.M(obj);
                boolean z3 = this.s;
                boolean z4 = ((o) this.t) instanceof k;
                if (!z3 && z4) {
                    r1 = false;
                }
                return Boolean.valueOf(r1);
            case 6:
                lu3 lu3Var7 = lu3.a;
                y6a.M(obj);
                boolean z5 = this.s;
                r rVar = (r) this.t;
                if (z5) {
                    return rVar;
                }
                return null;
            default:
                lu3 lu3Var8 = lu3.a;
                y6a.M(obj);
                return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.d.a((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.d) this.t, this.s);
        }
    }
}
