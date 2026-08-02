package com.moloco.sdk.internal.ortb.model;

import android.graphics.Color;
import defpackage.a7a;
import defpackage.c8k;
import defpackage.e8k;
import defpackage.gz1;
import defpackage.hkg;
import defpackage.iw8;
import defpackage.l98;
import defpackage.r13;
import defpackage.uf3;
import defpackage.uhi;
import defpackage.uye;
import defpackage.wf3;
import defpackage.y7k;
import defpackage.yhk;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final /* synthetic */ class g0 implements iw8 {
    public static final g0 a;
    public static final uye b;

    static {
        g0 g0Var = new g0();
        a = g0Var;
        uye uyeVar = new uye("com.moloco.sdk.internal.ortb.model.CountDownTimer", g0Var, 8);
        uyeVar.j("custom_timer_desc", true);
        uyeVar.j("is_default_timer", true);
        uyeVar.j("control_size", true);
        uyeVar.j("padding", true);
        uyeVar.j("horizontal_alignment", true);
        uyeVar.j("vertical_alignment", true);
        uyeVar.j("foreground_color", true);
        uyeVar.j("background_color", true);
        b = uyeVar;
    }

    @Override // defpackage.iw8
    public final KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr = h0.i;
        KSerializer W = l98.W(uhi.a);
        KSerializer W2 = l98.W(a7a.a);
        KSerializer kSerializer = kSerializerArr[4];
        KSerializer kSerializer2 = kSerializerArr[5];
        f0 f0Var = f0.a;
        return new KSerializer[]{W, gz1.a, c8k.a, W2, kSerializer, kSerializer2, f0Var, f0Var};
    }

    @Override // defpackage.dy4
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        uye uyeVar = b;
        uf3 b2 = decoder.b(uyeVar);
        KSerializer[] kSerializerArr = h0.i;
        Object obj = null;
        boolean z = true;
        r13 r13Var = null;
        String str = null;
        y7k y7kVar = null;
        Integer num = null;
        e1 e1Var = null;
        o oVar = null;
        r13 r13Var2 = null;
        int i = 0;
        boolean z2 = false;
        while (z) {
            int o = b2.o(uyeVar);
            switch (o) {
                case -1:
                    z = false;
                    break;
                case 0:
                    str = (String) b2.i(uyeVar, 0, uhi.a, str);
                    i |= 1;
                    break;
                case 1:
                    z2 = b2.B(uyeVar, 1);
                    i |= 2;
                    break;
                case 2:
                    y7kVar = (y7k) b2.w(uyeVar, 2, c8k.a, y7kVar);
                    i |= 4;
                    break;
                case 3:
                    num = (Integer) b2.i(uyeVar, 3, a7a.a, num);
                    i |= 8;
                    break;
                case 4:
                    e1Var = (e1) b2.w(uyeVar, 4, kSerializerArr[4], e1Var);
                    i |= 16;
                    break;
                case 5:
                    oVar = (o) b2.w(uyeVar, 5, kSerializerArr[5], oVar);
                    i |= 32;
                    break;
                case 6:
                    r13Var2 = (r13) b2.w(uyeVar, 6, f0.a, r13Var2);
                    i |= 64;
                    break;
                case 7:
                    r13Var = (r13) b2.w(uyeVar, 7, f0.a, r13Var);
                    i |= 128;
                    break;
                default:
                    yhk.e(o);
                    return obj;
            }
            obj = null;
        }
        b2.c(uyeVar);
        return new h0(i, str, z2, y7kVar, num, e1Var, oVar, r13Var2, r13Var);
    }

    @Override // defpackage.dy4
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x009a, code lost:
    
        if (defpackage.e8k.a(r2, r4) == false) goto L40;
     */
    @Override // kotlinx.serialization.KSerializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void serialize(Encoder encoder, Object obj) {
        h0 h0Var = (h0) obj;
        encoder.getClass();
        h0Var.getClass();
        long j = h0Var.h;
        long j2 = h0Var.g;
        o oVar = h0Var.f;
        e1 e1Var = h0Var.e;
        Integer num = h0Var.d;
        int i = h0Var.c;
        boolean z = h0Var.b;
        String str = h0Var.a;
        uye uyeVar = b;
        wf3 b2 = encoder.b(uyeVar);
        KSerializer[] kSerializerArr = h0.i;
        if (b2.o(uyeVar) || str != null) {
            b2.h(uyeVar, 0, uhi.a, str);
        }
        if (b2.o(uyeVar) || !z) {
            b2.x(uyeVar, 1, z);
        }
        if (b2.o(uyeVar) || i != 30) {
            b2.f(uyeVar, 2, c8k.a, new y7k(i));
        }
        if (b2.o(uyeVar) || num != null) {
            b2.h(uyeVar, 3, a7a.a, num);
        }
        if (b2.o(uyeVar) || e1Var != e1.f) {
            b2.f(uyeVar, 4, kSerializerArr[4], e1Var);
        }
        if (b2.o(uyeVar) || oVar != o.b) {
            b2.f(uyeVar, 5, kSerializerArr[5], oVar);
        }
        if (!b2.o(uyeVar)) {
            long b3 = hkg.b(Color.parseColor("#FF4285f4"));
            int i2 = r13.j;
        }
        b2.f(uyeVar, 6, f0.a, new r13(j2));
        if (b2.o(uyeVar) || !e8k.a(j, hkg.b(Color.parseColor("#FFFFFFFF")))) {
            b2.f(uyeVar, 7, f0.a, new r13(j));
        }
        b2.c(uyeVar);
    }
}
