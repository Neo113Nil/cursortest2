package com.moloco.sdk.internal.ortb.model;

import defpackage.iw8;
import defpackage.uf3;
import defpackage.uye;
import defpackage.wf3;
import defpackage.yhk;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final /* synthetic */ class i implements iw8 {
    public static final i a;
    public static final uye b;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public final class b {
        @NotNull
        public final KSerializer serializer() {
            return d0.a;
        }
    }

    static {
        i iVar = new i();
        a = iVar;
        uye uyeVar = new uye("com.moloco.sdk.internal.ortb.model.SeatBid", iVar, 1);
        uyeVar.j("bid", false);
        b = uyeVar;
    }

    @Override // defpackage.iw8
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{j.b[0]};
    }

    @Override // defpackage.dy4
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        uye uyeVar = b;
        uf3 b2 = decoder.b(uyeVar);
        KSerializer[] kSerializerArr = j.b;
        boolean z = true;
        int i = 0;
        List list = null;
        while (z) {
            int o = b2.o(uyeVar);
            if (o == -1) {
                z = false;
            } else {
                if (o != 0) {
                    yhk.e(o);
                    return null;
                }
                list = (List) b2.w(uyeVar, 0, kSerializerArr[0], list);
                i = 1;
            }
        }
        b2.c(uyeVar);
        return new j(i, list);
    }

    @Override // defpackage.dy4
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        j jVar = (j) obj;
        encoder.getClass();
        jVar.getClass();
        uye uyeVar = b;
        wf3 b2 = encoder.b(uyeVar);
        b2.f(uyeVar, 0, j.b[0], jVar.a);
        b2.c(uyeVar);
    }
}
