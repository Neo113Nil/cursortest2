package com.moloco.sdk.internal.ortb.model;

import defpackage.gz1;
import defpackage.iw8;
import defpackage.l98;
import defpackage.uf3;
import defpackage.uhi;
import defpackage.uye;
import defpackage.wf3;
import defpackage.yhk;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final /* synthetic */ class r implements iw8 {
    public static final r a;
    public static final uye b;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public final class b {
        @NotNull
        public final KSerializer serializer() {
            return u0.a;
        }
    }

    static {
        r rVar = new r();
        a = rVar;
        uye uyeVar = new uye("com.moloco.sdk.internal.ortb.model.AutoInline", rVar, 4);
        uyeVar.j("on_skip", false);
        uyeVar.j("event_link", false);
        uyeVar.j("click_through", true);
        uyeVar.j("force_fullscreen", true);
        b = uyeVar;
    }

    @Override // defpackage.iw8
    public final KSerializer[] childSerializers() {
        gz1 gz1Var = gz1.a;
        uhi uhiVar = uhi.a;
        return new KSerializer[]{gz1Var, uhiVar, l98.W(uhiVar), l98.W(gz1Var)};
    }

    @Override // defpackage.dy4
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        uye uyeVar = b;
        uf3 b2 = decoder.b(uyeVar);
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        String str = null;
        String str2 = null;
        Boolean bool = null;
        while (z) {
            int o = b2.o(uyeVar);
            if (o == -1) {
                z = false;
            } else if (o == 0) {
                z2 = b2.B(uyeVar, 0);
                i |= 1;
            } else if (o == 1) {
                str = b2.n(uyeVar, 1);
                i |= 2;
            } else if (o == 2) {
                str2 = (String) b2.i(uyeVar, 2, uhi.a, str2);
                i |= 4;
            } else {
                if (o != 3) {
                    yhk.e(o);
                    return null;
                }
                bool = (Boolean) b2.i(uyeVar, 3, gz1.a, bool);
                i |= 8;
            }
        }
        b2.c(uyeVar);
        return new s(i, z2, str, str2, bool);
    }

    @Override // defpackage.dy4
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        s sVar = (s) obj;
        encoder.getClass();
        sVar.getClass();
        uye uyeVar = b;
        wf3 b2 = encoder.b(uyeVar);
        boolean z = sVar.a;
        Boolean bool = sVar.d;
        String str = sVar.c;
        b2.x(uyeVar, 0, z);
        b2.y(uyeVar, 1, sVar.b);
        if (b2.o(uyeVar) || str != null) {
            b2.h(uyeVar, 2, uhi.a, str);
        }
        if (b2.o(uyeVar) || !Intrinsics.c(bool, Boolean.FALSE)) {
            b2.h(uyeVar, 3, gz1.a, bool);
        }
        b2.c(uyeVar);
    }
}
