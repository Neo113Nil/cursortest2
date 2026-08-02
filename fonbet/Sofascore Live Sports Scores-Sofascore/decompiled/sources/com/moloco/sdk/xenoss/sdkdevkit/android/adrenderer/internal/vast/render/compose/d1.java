package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.sofascore.results.R;
import defpackage.av8;
import defpackage.n7g;
import defpackage.oea;
import defpackage.of3;
import defpackage.p23;
import defpackage.q23;
import defpackage.t3e;
import defpackage.tc3;
import defpackage.yqo;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class d1 implements Function2 {
    public static final d1 b = new d1(0);
    public static final d1 c = new d1(1);
    public static final d1 d = new d1(2);
    public static final d1 e = new d1(3);
    public static final d1 f = new d1(4);
    public static final d1 g = new d1(5);
    public static final d1 h = new d1(6);
    public final /* synthetic */ int a;

    public /* synthetic */ d1(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Number) obj2).intValue();
                av8 av8Var = (av8) ((of3) obj);
                av8Var.e0(-1165352185);
                tc3 a = f1.a(0L, 0L, 0L, null, null, 0L, null, null, av8Var, IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE);
                av8Var.s(false);
                return a;
            case 1:
                ((Number) obj2).intValue();
                av8 av8Var2 = (av8) ((of3) obj);
                av8Var2.e0(1971947846);
                tc3 c2 = s.c(null, null, 0L, 0L, 0L, null, null, av8Var2, 255);
                av8Var2.s(false);
                return c2;
            case 2:
                ((Number) obj2).intValue();
                av8 av8Var3 = (av8) ((of3) obj);
                av8Var3.e0(489092871);
                tc3 b2 = f1.b(null, null, 0L, 0L, 0L, null, null, av8Var3, 255);
                av8Var3.s(false);
                return b2;
            case 3:
                ((Number) obj2).intValue();
                av8 av8Var4 = (av8) ((of3) obj);
                av8Var4.e0(-462412988);
                av8Var4.e0(-926425258);
                n7g n7gVar = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.d;
                tc3 y = yqo.y(432764356, av8Var4, new z0(new t3e(4.0f, 4.0f, 4.0f, 4.0f), oea.v(R.string.com_moloco_sdk_xenoss_player_learn_more, av8Var4), ((p23) av8Var4.k(q23.a)).b()));
                av8Var4.s(false);
                av8Var4.s(false);
                return y;
            case 4:
                ((Number) obj2).intValue();
                av8 av8Var5 = (av8) ((of3) obj);
                av8Var5.e0(-185458362);
                tc3 c3 = f1.c(null, null, 0L, av8Var5, 7);
                av8Var5.s(false);
                return c3;
            case 5:
                ((Number) obj2).intValue();
                av8 av8Var6 = (av8) ((of3) obj);
                av8Var6.e0(1409102370);
                tc3 d2 = s.d(null, null, av8Var6, 3);
                av8Var6.s(false);
                return d2;
            default:
                ((Number) obj2).intValue();
                av8 av8Var7 = (av8) ((of3) obj);
                av8Var7.e0(-1364519647);
                av8Var7.s(false);
                return null;
        }
    }
}
