package defpackage;

import android.app.RemoteAction;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.view.View;
import android.view.textclassifier.TextClassification;
import android.widget.Magnifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class tla implements pla, rie, vje {
    public static final tla a = new tla();
    public static final tla b = new tla();
    public static final tla c = new tla();

    public static Typeface h(String str, wg8 wg8Var, int i) {
        if (i == 0 && Intrinsics.c(wg8Var, wg8.g) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        return Typeface.create(str == null ? Typeface.DEFAULT : Typeface.create(str, 0), wg8Var.a, i == 1);
    }

    public static void i(iq3 iq3Var, Context context, s8j s8jVar) {
        if (context == null) {
            return;
        }
        int i = s8jVar.c;
        TextClassification textClassification = s8jVar.b;
        if (i < 0) {
            q8i q8iVar = new q8i(textClassification, 24);
            Drawable icon = textClassification.getIcon();
            iq3.b(iq3Var, q8iVar, icon != null ? new tc3(-1123224187, new g31(icon, 9), true) : null, new deh(26, context, textClassification), 6);
        } else {
            RemoteAction remoteAction = textClassification.getActions().get(i);
            iq3.b(iq3Var, new q8i(remoteAction, 25), ((i == 0) || remoteAction.shouldShowIcon()) ? new tc3(-1261173016, new g31(remoteAction, 10), true) : null, new w1i(remoteAction, 16), 6);
        }
    }

    @Override // defpackage.rie
    public boolean a() {
        return false;
    }

    @Override // defpackage.rie
    public qie b(View view, boolean z, long j, float f, float f2, boolean z2, kx4 kx4Var, float f3) {
        return new sie(new Magnifier(view));
    }

    @Override // defpackage.pla
    public Object c(n29 n29Var, rq3 rq3Var) {
        return Bitmap.createBitmap(new sla(n29Var));
    }

    public void d(Drawable drawable, of3 of3Var, int i) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(257732500);
        int i2 = (av8Var.i(drawable) ? 4 : 2) | i;
        if (av8Var.T(i2 & 1, (i2 & 3) != 2)) {
            xtc l = bkh.l(utc.a, jq3.e);
            boolean i3 = av8Var.i(drawable);
            Object O = av8Var.O();
            if (i3 || O == nf3.a) {
                O = new g2i(drawable, 24);
                av8Var.n0(O);
            }
            e12.a(0, av8Var, td4.X(l, (Function1) O));
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new s5h(this, drawable, i, 23);
        }
    }

    @Override // defpackage.vje
    public Typeface e(mw8 mw8Var, wg8 wg8Var, int i) {
        return h(mw8Var.f, wg8Var, i);
    }

    @Override // defpackage.vje
    public Typeface f(int i, wg8 wg8Var) {
        return h(null, wg8Var, i);
    }

    public void g(final Icon icon, of3 of3Var, final int i) {
        eqf u;
        Function2 function2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(2116504409);
        int i2 = (av8Var.i(icon) ? 4 : 2) | i;
        final int i3 = 0;
        final int i4 = 1;
        if (av8Var.T(i2 & 1, (i2 & 19) != 18)) {
            Context context = (Context) av8Var.k(nz.b);
            boolean g = av8Var.g(icon) | av8Var.g(context);
            Object O = av8Var.O();
            if (g || O == nf3.a) {
                O = icon.loadDrawable(context);
                av8Var.n0(O);
            }
            Drawable drawable = (Drawable) O;
            if (drawable == null) {
                u = av8Var.u();
                if (u != null) {
                    function2 = new Function2(this, icon, i, i3) { // from class: l8j
                        public final /* synthetic */ int a;
                        public final /* synthetic */ tla b;
                        public final /* synthetic */ Icon c;

                        {
                            this.a = i3;
                            this.b = this;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int i5 = this.a;
                            Icon icon2 = this.c;
                            tla tlaVar = this.b;
                            of3 of3Var2 = (of3) obj;
                            ((Integer) obj2).getClass();
                            switch (i5) {
                                case 0:
                                    tlaVar.g(icon2, of3Var2, aba.K(49));
                                    break;
                                default:
                                    tlaVar.g(icon2, of3Var2, aba.K(49));
                                    break;
                            }
                            return Unit.a;
                        }
                    };
                    u.d = function2;
                }
                return;
            }
            d(drawable, av8Var, 48);
        } else {
            av8Var.W();
        }
        u = av8Var.u();
        if (u != null) {
            function2 = new Function2(this, icon, i, i4) { // from class: l8j
                public final /* synthetic */ int a;
                public final /* synthetic */ tla b;
                public final /* synthetic */ Icon c;

                {
                    this.a = i4;
                    this.b = this;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i5 = this.a;
                    Icon icon2 = this.c;
                    tla tlaVar = this.b;
                    of3 of3Var2 = (of3) obj;
                    ((Integer) obj2).getClass();
                    switch (i5) {
                        case 0:
                            tlaVar.g(icon2, of3Var2, aba.K(49));
                            break;
                        default:
                            tlaVar.g(icon2, of3Var2, aba.K(49));
                            break;
                    }
                    return Unit.a;
                }
            };
            u.d = function2;
        }
    }
}
