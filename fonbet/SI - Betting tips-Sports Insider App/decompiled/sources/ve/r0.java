package ve;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import com.sports.insider.ui.views.SwitchButton;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class r0 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SwitchButton f24826a;

    public r0(SwitchButton switchButton) {
        this.f24826a = switchButton;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        Object animatedValue = animation.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((Float) animatedValue).floatValue();
        SwitchButton switchButton = this.f24826a;
        int i5 = switchButton.f7951d;
        ArgbEvaluator argbEvaluator = switchButton.f7962l0;
        int i10 = switchButton.j0;
        if (i10 == switchButton.f7954g) {
            p0 p0Var = switchButton.f7955g0;
            Intrinsics.checkNotNull(p0Var);
            p0 p0Var2 = switchButton.f7957h0;
            Intrinsics.checkNotNull(p0Var2);
            Integer valueOf = Integer.valueOf(p0Var2.f24758c);
            p0 p0Var3 = switchButton.f7959i0;
            Intrinsics.checkNotNull(p0Var3);
            Object evaluate = argbEvaluator.evaluate(floatValue, valueOf, Integer.valueOf(p0Var3.f24758c));
            Intrinsics.checkNotNull(evaluate, "null cannot be cast to non-null type kotlin.Int");
            p0Var.f24758c = ((Integer) evaluate).intValue();
            p0 p0Var4 = switchButton.f7955g0;
            Intrinsics.checkNotNull(p0Var4);
            p0 p0Var5 = switchButton.f7957h0;
            Intrinsics.checkNotNull(p0Var5);
            float f6 = p0Var5.f24759d;
            p0 p0Var6 = switchButton.f7959i0;
            Intrinsics.checkNotNull(p0Var6);
            float f10 = p0Var6.f24759d;
            p0 p0Var7 = switchButton.f7957h0;
            Intrinsics.checkNotNull(p0Var7);
            p0Var4.f24759d = d9.e.w(f10, p0Var7.f24759d, floatValue, f6);
            if (switchButton.j0 != i5) {
                p0 p0Var8 = switchButton.f7955g0;
                Intrinsics.checkNotNull(p0Var8);
                p0 p0Var9 = switchButton.f7957h0;
                Intrinsics.checkNotNull(p0Var9);
                float f11 = p0Var9.f24756a;
                p0 p0Var10 = switchButton.f7959i0;
                Intrinsics.checkNotNull(p0Var10);
                float f12 = p0Var10.f24756a;
                p0 p0Var11 = switchButton.f7957h0;
                Intrinsics.checkNotNull(p0Var11);
                p0Var8.f24756a = d9.e.w(f12, p0Var11.f24756a, floatValue, f11);
            }
            p0 p0Var12 = switchButton.f7955g0;
            Intrinsics.checkNotNull(p0Var12);
            p0 p0Var13 = switchButton.f7957h0;
            Intrinsics.checkNotNull(p0Var13);
            Integer valueOf2 = Integer.valueOf(p0Var13.f24757b);
            p0 p0Var14 = switchButton.f7959i0;
            Intrinsics.checkNotNull(p0Var14);
            Object evaluate2 = argbEvaluator.evaluate(floatValue, valueOf2, Integer.valueOf(p0Var14.f24757b));
            Intrinsics.checkNotNull(evaluate2, "null cannot be cast to non-null type kotlin.Int");
            p0Var12.f24757b = ((Integer) evaluate2).intValue();
        } else if (i10 == switchButton.f7953f) {
            p0 p0Var15 = switchButton.f7955g0;
            Intrinsics.checkNotNull(p0Var15);
            p0 p0Var16 = switchButton.f7957h0;
            Intrinsics.checkNotNull(p0Var16);
            Integer valueOf3 = Integer.valueOf(p0Var16.f24758c);
            p0 p0Var17 = switchButton.f7959i0;
            Intrinsics.checkNotNull(p0Var17);
            Object evaluate3 = argbEvaluator.evaluate(floatValue, valueOf3, Integer.valueOf(p0Var17.f24758c));
            Intrinsics.checkNotNull(evaluate3, "null cannot be cast to non-null type kotlin.Int");
            p0Var15.f24758c = ((Integer) evaluate3).intValue();
            p0 p0Var18 = switchButton.f7955g0;
            Intrinsics.checkNotNull(p0Var18);
            p0 p0Var19 = switchButton.f7957h0;
            Intrinsics.checkNotNull(p0Var19);
            float f13 = p0Var19.f24759d;
            p0 p0Var20 = switchButton.f7959i0;
            Intrinsics.checkNotNull(p0Var20);
            float f14 = p0Var20.f24759d;
            p0 p0Var21 = switchButton.f7957h0;
            Intrinsics.checkNotNull(p0Var21);
            p0Var18.f24759d = d9.e.w(f14, p0Var21.f24759d, floatValue, f13);
            if (switchButton.j0 != i5) {
                p0 p0Var22 = switchButton.f7955g0;
                Intrinsics.checkNotNull(p0Var22);
                p0 p0Var23 = switchButton.f7957h0;
                Intrinsics.checkNotNull(p0Var23);
                float f15 = p0Var23.f24756a;
                p0 p0Var24 = switchButton.f7959i0;
                Intrinsics.checkNotNull(p0Var24);
                float f16 = p0Var24.f24756a;
                p0 p0Var25 = switchButton.f7957h0;
                Intrinsics.checkNotNull(p0Var25);
                p0Var22.f24756a = d9.e.w(f16, p0Var25.f24756a, floatValue, f15);
            }
            p0 p0Var26 = switchButton.f7955g0;
            Intrinsics.checkNotNull(p0Var26);
            p0 p0Var27 = switchButton.f7957h0;
            Intrinsics.checkNotNull(p0Var27);
            Integer valueOf4 = Integer.valueOf(p0Var27.f24757b);
            p0 p0Var28 = switchButton.f7959i0;
            Intrinsics.checkNotNull(p0Var28);
            Object evaluate4 = argbEvaluator.evaluate(floatValue, valueOf4, Integer.valueOf(p0Var28.f24757b));
            Intrinsics.checkNotNull(evaluate4, "null cannot be cast to non-null type kotlin.Int");
            p0Var26.f24757b = ((Integer) evaluate4).intValue();
        } else if (i10 == i5) {
            p0 p0Var29 = switchButton.f7955g0;
            Intrinsics.checkNotNull(p0Var29);
            p0 p0Var30 = switchButton.f7957h0;
            Intrinsics.checkNotNull(p0Var30);
            Integer valueOf5 = Integer.valueOf(p0Var30.f24758c);
            p0 p0Var31 = switchButton.f7959i0;
            Intrinsics.checkNotNull(p0Var31);
            Object evaluate5 = argbEvaluator.evaluate(floatValue, valueOf5, Integer.valueOf(p0Var31.f24758c));
            Intrinsics.checkNotNull(evaluate5, "null cannot be cast to non-null type kotlin.Int");
            p0Var29.f24758c = ((Integer) evaluate5).intValue();
            p0 p0Var32 = switchButton.f7955g0;
            Intrinsics.checkNotNull(p0Var32);
            p0 p0Var33 = switchButton.f7957h0;
            Intrinsics.checkNotNull(p0Var33);
            float f17 = p0Var33.f24759d;
            p0 p0Var34 = switchButton.f7959i0;
            Intrinsics.checkNotNull(p0Var34);
            float f18 = p0Var34.f24759d;
            p0 p0Var35 = switchButton.f7957h0;
            Intrinsics.checkNotNull(p0Var35);
            p0Var32.f24759d = d9.e.w(f18, p0Var35.f24759d, floatValue, f17);
            if (switchButton.j0 != i5) {
                p0 p0Var36 = switchButton.f7955g0;
                Intrinsics.checkNotNull(p0Var36);
                p0 p0Var37 = switchButton.f7957h0;
                Intrinsics.checkNotNull(p0Var37);
                float f19 = p0Var37.f24756a;
                p0 p0Var38 = switchButton.f7959i0;
                Intrinsics.checkNotNull(p0Var38);
                float f20 = p0Var38.f24756a;
                p0 p0Var39 = switchButton.f7957h0;
                Intrinsics.checkNotNull(p0Var39);
                p0Var36.f24756a = d9.e.w(f20, p0Var39.f24756a, floatValue, f19);
            }
            p0 p0Var40 = switchButton.f7955g0;
            Intrinsics.checkNotNull(p0Var40);
            p0 p0Var41 = switchButton.f7957h0;
            Intrinsics.checkNotNull(p0Var41);
            Integer valueOf6 = Integer.valueOf(p0Var41.f24757b);
            p0 p0Var42 = switchButton.f7959i0;
            Intrinsics.checkNotNull(p0Var42);
            Object evaluate6 = argbEvaluator.evaluate(floatValue, valueOf6, Integer.valueOf(p0Var42.f24757b));
            Intrinsics.checkNotNull(evaluate6, "null cannot be cast to non-null type kotlin.Int");
            p0Var40.f24757b = ((Integer) evaluate6).intValue();
        } else if (i10 == switchButton.f7956h) {
            p0 p0Var43 = switchButton.f7955g0;
            Intrinsics.checkNotNull(p0Var43);
            p0 p0Var44 = switchButton.f7957h0;
            Intrinsics.checkNotNull(p0Var44);
            float f21 = p0Var44.f24756a;
            p0 p0Var45 = switchButton.f7959i0;
            Intrinsics.checkNotNull(p0Var45);
            float f22 = p0Var45.f24756a;
            p0 p0Var46 = switchButton.f7957h0;
            Intrinsics.checkNotNull(p0Var46);
            p0Var43.f24756a = d9.e.w(f22, p0Var46.f24756a, floatValue, f21);
            p0 p0Var47 = switchButton.f7955g0;
            Intrinsics.checkNotNull(p0Var47);
            float f23 = p0Var47.f24756a;
            float f24 = switchButton.I;
            float f25 = (f23 - f24) / (switchButton.J - f24);
            p0 p0Var48 = switchButton.f7955g0;
            Intrinsics.checkNotNull(p0Var48);
            Object evaluate7 = argbEvaluator.evaluate(f25, Integer.valueOf(switchButton.f7978u), Integer.valueOf(switchButton.f7980v));
            Intrinsics.checkNotNull(evaluate7, "null cannot be cast to non-null type kotlin.Int");
            p0Var48.f24757b = ((Integer) evaluate7).intValue();
            p0 p0Var49 = switchButton.f7955g0;
            Intrinsics.checkNotNull(p0Var49);
            p0Var49.f24759d = switchButton.f7961l * f25;
            p0 p0Var50 = switchButton.f7955g0;
            Intrinsics.checkNotNull(p0Var50);
            Object evaluate8 = argbEvaluator.evaluate(f25, 0, Integer.valueOf(switchButton.f7983x));
            Intrinsics.checkNotNull(evaluate8, "null cannot be cast to non-null type kotlin.Int");
            p0Var50.f24758c = ((Integer) evaluate8).intValue();
        }
        switchButton.postInvalidate();
    }
}
