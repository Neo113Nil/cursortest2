package com.vungle.ads.internal.network;

import com.ironsource.C4094gc;
import defpackage.ip5;
import defpackage.iw8;
import defpackage.z8e;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class e implements iw8 {
    public static final e a = new e();
    public static final /* synthetic */ ip5 b;

    static {
        ip5 ip5Var = new ip5("com.vungle.ads.internal.network.HttpMethod", 2);
        ip5Var.j(C4094gc.a, false);
        ip5Var.j(C4094gc.b, false);
        b = ip5Var;
    }

    @Override // defpackage.iw8
    public final KSerializer[] childSerializers() {
        return new KSerializer[0];
    }

    @Override // defpackage.dy4
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        return g.values()[decoder.f(b)];
    }

    @Override // defpackage.dy4
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        g gVar = (g) obj;
        encoder.getClass();
        gVar.getClass();
        encoder.j(b, gVar.ordinal());
    }

    @Override // defpackage.iw8
    public final KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
