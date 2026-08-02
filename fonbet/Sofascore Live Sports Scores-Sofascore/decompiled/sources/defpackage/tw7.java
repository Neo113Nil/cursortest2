package defpackage;

import android.content.Context;
import android.view.View;
import com.moloco.sdk.internal.a0;
import com.moloco.sdk.internal.k;
import com.moloco.sdk.internal.ortb.model.f;
import com.moloco.sdk.internal.ortb.model.n;
import com.moloco.sdk.internal.p;
import com.moloco.sdk.internal.q;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.s;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.f0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.f1;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.s0;
import com.sofascore.results.R;
import defpackage.wzb;
import defpackage.z88;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final /* synthetic */ class tw7 implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object n;

    public /* synthetic */ tw7(int i, Integer num, f fVar, n nVar, boolean z, int i2, int i3, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7) {
        this.b = i;
        this.f = num;
        this.g = fVar;
        this.h = nVar;
        this.c = z;
        this.d = i2;
        this.e = i3;
        this.i = num2;
        this.j = num3;
        this.k = num4;
        this.l = num5;
        this.m = num6;
        this.n = num7;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        f0 f0Var;
        int i = this.a;
        Object obj3 = this.n;
        Object obj4 = this.m;
        Object obj5 = this.l;
        Object obj6 = this.k;
        Object obj7 = this.j;
        Object obj8 = this.i;
        Object obj9 = this.h;
        Object obj10 = this.g;
        Object obj11 = this.f;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                l98.n((String) obj11, this.b, (String) obj10, (String) obj9, this.d, this.e, (String) obj8, (String) obj7, (String) obj6, (String) obj5, (dfj) obj4, (dfj) obj3, this.c, (of3) obj, aba.K(1));
                return Unit.a;
            default:
                Integer num = (Integer) obj11;
                f fVar = (f) obj10;
                n nVar = (n) obj9;
                final Integer num2 = (Integer) obj8;
                final Integer num3 = (Integer) obj7;
                final Integer num4 = (Integer) obj6;
                final Integer num5 = (Integer) obj5;
                Integer num6 = (Integer) obj4;
                Integer num7 = (Integer) obj3;
                Context context = (Context) obj;
                s sVar = (s) obj2;
                context.getClass();
                sVar.getClass();
                float f = context.getResources().getDisplayMetrics().density;
                final int i2 = (int) (this.b * f);
                final int intValue = num != null ? (int) (num.intValue() * f) : context.getResources().getDimensionPixelSize(R.dimen.moloco_banner_mute_button_size);
                final int i3 = this.d;
                final int i4 = this.e;
                ct8 ct8Var = new ct8() { // from class: com.moloco.sdk.internal.i
                    @Override // defpackage.ct8
                    public final Object invoke(Object obj12, Object obj13, Object obj14) {
                        Context context2 = (Context) obj12;
                        z88 z88Var = (z88) obj13;
                        z88 z88Var2 = (z88) obj14;
                        context2.getClass();
                        z88Var.getClass();
                        z88Var2.getClass();
                        int i5 = intValue;
                        int b = wzb.b(i5 * 0.6f);
                        Integer num8 = num2;
                        return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.e0(context2, z88Var, z88Var2, i3, R.drawable.moloco_volume_off, R.drawable.moloco_volume_on, i5, b, i4, i2, num8 != null ? num8.intValue() : context2.getColor(R.color.moloco_button_background));
                    }
                };
                ct8 ct8Var2 = fVar != null ? new ct8() { // from class: com.moloco.sdk.internal.j
                    @Override // defpackage.ct8
                    public final Object invoke(Object obj12, Object obj13, Object obj14) {
                        Context context2 = (Context) obj12;
                        z88 z88Var = (z88) obj13;
                        z88 z88Var2 = (z88) obj14;
                        context2.getClass();
                        z88Var.getClass();
                        z88Var2.getClass();
                        Integer num8 = num3;
                        num8.getClass();
                        int intValue2 = num8.intValue();
                        Integer num9 = num4;
                        num9.getClass();
                        return new s0(context2, z88Var, z88Var2, intValue2, num9.intValue(), (int) ((num5 != null ? r7.intValue() : 0) * context2.getResources().getDisplayMetrics().density));
                    }
                } : p.b;
                Function2 kVar = nVar != null ? new k(0, num6, num7) : q.b;
                if (this.c) {
                    mqi mqiVar = a0.a;
                    f0Var = null;
                } else {
                    f0Var = (f0) a0.a.getValue();
                }
                return (View) f1.d(null, ct8Var, ct8Var2, null, kVar, null, f0Var, null, false, null, 3345).invoke(context, sVar);
        }
    }

    public /* synthetic */ tw7(String str, int i, String str2, String str3, int i2, int i3, String str4, String str5, String str6, String str7, dfj dfjVar, dfj dfjVar2, boolean z, int i4) {
        this.f = str;
        this.b = i;
        this.g = str2;
        this.h = str3;
        this.d = i2;
        this.e = i3;
        this.i = str4;
        this.j = str5;
        this.k = str6;
        this.l = str7;
        this.m = dfjVar;
        this.n = dfjVar2;
        this.c = z;
    }
}
