package com.moloco.sdk.internal.publisher.nativead.ui;

import androidx.core.app.NotificationCompat;
import com.sofascore.results.R;
import defpackage.av8;
import defpackage.ft8;
import defpackage.l98;
import defpackage.m12;
import defpackage.nf3;
import defpackage.o3h;
import defpackage.oea;
import defpackage.of3;
import defpackage.utc;
import defpackage.uxf;
import defpackage.wnn;
import defpackage.xtc;
import defpackage.yqo;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class b implements ft8 {
    public static final b a = new b();

    @Override // defpackage.ft8
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i;
        m12 m12Var = (m12) obj;
        Boolean bool = (Boolean) obj2;
        boolean booleanValue = bool.booleanValue();
        Function0 function0 = (Function0) obj3;
        of3 of3Var = (of3) obj4;
        int intValue = ((Number) obj5).intValue();
        m12Var.getClass();
        function0.getClass();
        if ((intValue & 6) == 0) {
            i = (((av8) of3Var).g(m12Var) ? 4 : 2) | intValue;
        } else {
            i = intValue;
        }
        if ((intValue & 48) == 0) {
            i |= ((av8) of3Var).h(booleanValue) ? 32 : 16;
        }
        if ((intValue & 384) == 0) {
            i |= ((av8) of3Var).g(function0) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i & 1171) == 1170) {
            av8 av8Var = (av8) of3Var;
            if (av8Var.D()) {
                av8Var.W();
                return Unit.a;
            }
        }
        String v = oea.v(R.string.moloco_playback_control_parent_content_description, of3Var);
        String v2 = oea.v(R.string.moloco_playback_control_icon_content_description, of3Var);
        xtc b0 = l98.b0(m12Var.a(utc.a, uxf.j), 4.0f);
        av8 av8Var2 = (av8) of3Var;
        av8Var2.e0(277456883);
        boolean g = av8Var2.g(v);
        Object O = av8Var2.O();
        if (g || O == nf3.a) {
            O = new com.moloco.sdk.acm.db.e(v, 1);
            av8Var2.n0(O);
        }
        av8Var2.s(false);
        wnn.c(bool, o3h.a(b0, false, (Function1) O), null, yqo.y(1776469658, av8Var2, new a(0, function0, v2)), av8Var2, ((i >> 3) & 14) | 3072, 4);
        return Unit.a;
    }
}
