package com.moloco.sdk.internal.ortb.model;

import defpackage.iw8;
import defpackage.l98;
import defpackage.uf3;
import defpackage.uhi;
import defpackage.uye;
import defpackage.wf3;
import defpackage.yhk;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final /* synthetic */ class v implements iw8 {
    public static final v a;
    public static final uye b;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public final class b {
        @NotNull
        public final KSerializer serializer() {
            return c1.a;
        }
    }

    static {
        v vVar = new v();
        a = vVar;
        uye uyeVar = new uye("com.moloco.sdk.internal.ortb.model.BannerClickMetaData", vVar, 2);
        uyeVar.j("click_tracking", true);
        uyeVar.j("click_through", true);
        b = uyeVar;
    }

    @Override // defpackage.iw8
    public final KSerializer[] childSerializers() {
        uhi uhiVar = uhi.a;
        return new KSerializer[]{l98.W(uhiVar), l98.W(uhiVar)};
    }

    @Override // defpackage.dy4
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        uye uyeVar = b;
        uf3 b2 = decoder.b(uyeVar);
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        while (z) {
            int o = b2.o(uyeVar);
            if (o == -1) {
                z = false;
            } else if (o == 0) {
                str = (String) b2.i(uyeVar, 0, uhi.a, str);
                i |= 1;
            } else {
                if (o != 1) {
                    yhk.e(o);
                    return null;
                }
                str2 = (String) b2.i(uyeVar, 1, uhi.a, str2);
                i |= 2;
            }
        }
        b2.c(uyeVar);
        return new w(i, str, str2);
    }

    @Override // defpackage.dy4
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        w wVar = (w) obj;
        encoder.getClass();
        wVar.getClass();
        String str = wVar.b;
        String str2 = wVar.a;
        uye uyeVar = b;
        wf3 b2 = encoder.b(uyeVar);
        if (b2.o(uyeVar) || str2 != null) {
            b2.h(uyeVar, 0, uhi.a, str2);
        }
        if (b2.o(uyeVar) || str != null) {
            b2.h(uyeVar, 1, uhi.a, str);
        }
        b2.c(uyeVar);
    }
}
