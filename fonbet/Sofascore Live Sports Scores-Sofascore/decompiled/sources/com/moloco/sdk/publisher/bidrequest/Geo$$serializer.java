package com.moloco.sdk.publisher.bidrequest;

import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.ironsource.U3;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import defpackage.c88;
import defpackage.iw8;
import defpackage.l98;
import defpackage.uf3;
import defpackage.uhi;
import defpackage.uye;
import defpackage.wf3;
import defpackage.wx4;
import defpackage.yhk;
import defpackage.z8e;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/moloco/sdk/publisher/bidrequest/Geo.$serializer", "Liw8;", "Lcom/moloco/sdk/publisher/bidrequest/Geo;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", U3.i.X, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/moloco/sdk/publisher/bidrequest/Geo;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/moloco/sdk/publisher/bidrequest/Geo;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "moloco-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@wx4
/* loaded from: classes4.dex */
public /* synthetic */ class Geo$$serializer implements iw8 {
    public static final int $stable;

    @NotNull
    public static final Geo$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        Geo$$serializer geo$$serializer = new Geo$$serializer();
        INSTANCE = geo$$serializer;
        $stable = 8;
        uye uyeVar = new uye("com.moloco.sdk.publisher.bidrequest.Geo", geo$$serializer, 6);
        uyeVar.j("city", false);
        uyeVar.j("country", false);
        uyeVar.j(TtmlNode.TAG_REGION, false);
        uyeVar.j(InneractiveMediationDefs.KEY_ZIPCODE, false);
        uyeVar.j("latitude", false);
        uyeVar.j("longitude", false);
        descriptor = uyeVar;
    }

    private Geo$$serializer() {
    }

    @Override // defpackage.iw8
    @NotNull
    public final KSerializer[] childSerializers() {
        uhi uhiVar = uhi.a;
        KSerializer W = l98.W(uhiVar);
        KSerializer W2 = l98.W(uhiVar);
        KSerializer W3 = l98.W(uhiVar);
        KSerializer W4 = l98.W(uhiVar);
        c88 c88Var = c88.a;
        return new KSerializer[]{W, W2, W3, W4, l98.W(c88Var), l98.W(c88Var)};
    }

    @Override // defpackage.dy4
    @NotNull
    public final Geo deserialize(@NotNull Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        uf3 b = decoder.b(serialDescriptor);
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Float f = null;
        Float f2 = null;
        while (z) {
            int o = b.o(serialDescriptor);
            switch (o) {
                case -1:
                    z = false;
                    break;
                case 0:
                    str = (String) b.i(serialDescriptor, 0, uhi.a, str);
                    i |= 1;
                    break;
                case 1:
                    str2 = (String) b.i(serialDescriptor, 1, uhi.a, str2);
                    i |= 2;
                    break;
                case 2:
                    str3 = (String) b.i(serialDescriptor, 2, uhi.a, str3);
                    i |= 4;
                    break;
                case 3:
                    str4 = (String) b.i(serialDescriptor, 3, uhi.a, str4);
                    i |= 8;
                    break;
                case 4:
                    f = (Float) b.i(serialDescriptor, 4, c88.a, f);
                    i |= 16;
                    break;
                case 5:
                    f2 = (Float) b.i(serialDescriptor, 5, c88.a, f2);
                    i |= 32;
                    break;
                default:
                    yhk.e(o);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new Geo(i, str, str2, str3, str4, f, f2, null);
    }

    @Override // defpackage.dy4
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull Geo value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        wf3 b = encoder.b(serialDescriptor);
        Geo.write$Self$moloco_sdk_release(value, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.iw8
    @NotNull
    public /* bridge */ /* synthetic */ KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
