package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer;

import android.content.Context;
import android.content.Intent;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.e;
import defpackage.a70;
import defpackage.fdi;
import defpackage.jk0;
import defpackage.kn4;
import defpackage.lu3;
import defpackage.rd0;
import defpackage.sq3;
import defpackage.y6a;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class b {
    public static void b() {
        fdi fdiVar = StaticAdActivity.h;
        Boolean bool = Boolean.TRUE;
        fdiVar.getClass();
        fdiVar.m(null, bool);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x008c A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Context context, c cVar, com.moloco.sdk.internal.publisher.nativead.b bVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.a aVar, kn4 kn4Var, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.b bVar2, com.moloco.sdk.acm.recorder.c cVar2, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.b bVar3, sq3 sq3Var) {
        a aVar2;
        int i;
        try {
            if (sq3Var instanceof a) {
                aVar2 = (a) sq3Var;
                int i2 = aVar2.t;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    aVar2.t = i2 - Integer.MIN_VALUE;
                    Object obj = aVar2.r;
                    lu3 lu3Var = lu3.a;
                    i = aVar2.t;
                    Object obj2 = null;
                    Object[] objArr = 0;
                    Object[] objArr2 = 0;
                    Object[] objArr3 = 0;
                    Object[] objArr4 = 0;
                    Object[] objArr5 = 0;
                    Object[] objArr6 = 0;
                    Object[] objArr7 = 0;
                    if (i != 0) {
                        y6a.M(obj);
                        StaticAdActivity.i = bVar2;
                        StaticAdActivity.j = cVar2;
                        StaticAdActivity.k = bVar3;
                        StaticAdActivity.d = cVar;
                        StaticAdActivity.c = (e) kn4Var.c;
                        StaticAdActivity.f = bVar;
                        StaticAdActivity.g = aVar;
                        Intent intent = new Intent(context, (Class<?>) StaticAdActivity.class);
                        intent.putExtra("CLOSE_DELAY_SECONDS", kn4Var.a);
                        intent.setFlags(268435456);
                        context.startActivity(intent);
                        fdi fdiVar = StaticAdActivity.h;
                        jk0 jk0Var = new jk0(2, objArr == true ? 1 : 0, 7);
                        aVar2.t = 1;
                        obj = rd0.z(fdiVar, jk0Var, aVar2);
                        if (obj == lu3Var) {
                            return lu3Var;
                        }
                    } else {
                        if (i != 1) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y6a.M(obj);
                    }
                    ((Boolean) obj).getClass();
                    return Unit.a;
                }
            }
            if (i != 0) {
            }
            ((Boolean) obj).getClass();
            return Unit.a;
        } finally {
            fdi fdiVar2 = StaticAdActivity.h;
            Boolean bool = Boolean.FALSE;
            fdiVar2.getClass();
            fdiVar2.m(null, bool);
            StaticAdActivity.f = null;
            StaticAdActivity.g = null;
            StaticAdActivity.d = null;
            StaticAdActivity.c = null;
            StaticAdActivity.j = null;
            StaticAdActivity.k = null;
            StaticAdActivity staticAdActivity = StaticAdActivity.e;
            if (staticAdActivity != null) {
                staticAdActivity.finish();
            }
        }
        aVar2 = new a(this, sq3Var);
        Object obj3 = aVar2.r;
        lu3 lu3Var2 = lu3.a;
        i = aVar2.t;
        Object obj22 = null;
        Object[] objArr8 = 0;
        Object[] objArr22 = 0;
        Object[] objArr32 = 0;
        Object[] objArr42 = 0;
        Object[] objArr52 = 0;
        Object[] objArr62 = 0;
        Object[] objArr72 = 0;
    }
}
