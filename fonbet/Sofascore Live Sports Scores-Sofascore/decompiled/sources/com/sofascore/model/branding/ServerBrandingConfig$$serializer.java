package com.sofascore.model.branding;

import com.ironsource.U3;
import defpackage.dy4;
import defpackage.iw8;
import defpackage.joa;
import defpackage.l98;
import defpackage.t5h;
import defpackage.uf3;
import defpackage.uye;
import defpackage.wf3;
import defpackage.wx4;
import defpackage.yhk;
import defpackage.z8e;
import java.util.Map;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/sofascore/model/branding/ServerBrandingConfig.$serializer", "Liw8;", "Lcom/sofascore/model/branding/ServerBrandingConfig;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", U3.i.X, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/sofascore/model/branding/ServerBrandingConfig;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/sofascore/model/branding/ServerBrandingConfig;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
@wx4
/* loaded from: classes5.dex */
public final /* synthetic */ class ServerBrandingConfig$$serializer implements iw8 {

    @NotNull
    public static final ServerBrandingConfig$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        ServerBrandingConfig$$serializer serverBrandingConfig$$serializer = new ServerBrandingConfig$$serializer();
        INSTANCE = serverBrandingConfig$$serializer;
        uye uyeVar = new uye("com.sofascore.model.branding.ServerBrandingConfig", serverBrandingConfig$$serializer, 8);
        uyeVar.j("teams", false);
        uyeVar.j("uniqueTournaments", false);
        uyeVar.j("oddsTab", false);
        uyeVar.j("mediaFeedTab", false);
        uyeVar.j("fantasyCompetitions", false);
        uyeVar.j("featuredUniqueTournaments", false);
        uyeVar.j("boostedOddsEvents", false);
        uyeVar.j("partnerEvents", true);
        descriptor = uyeVar;
    }

    private ServerBrandingConfig$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.iw8
    @NotNull
    public final KSerializer[] childSerializers() {
        joa[] joaVarArr;
        joaVarArr = ServerBrandingConfig.$childSerializers;
        return new KSerializer[]{joaVarArr[0].getValue(), joaVarArr[1].getValue(), joaVarArr[2].getValue(), l98.W(ServerMediaFeedTab$$serializer.INSTANCE), joaVarArr[4].getValue(), l98.W((KSerializer) joaVarArr[5].getValue()), l98.W((KSerializer) joaVarArr[6].getValue()), l98.W((KSerializer) joaVarArr[7].getValue())};
    }

    @Override // defpackage.dy4
    @NotNull
    public final ServerBrandingConfig deserialize(@NotNull Decoder decoder) {
        joa[] joaVarArr;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        uf3 b = decoder.b(serialDescriptor);
        joaVarArr = ServerBrandingConfig.$childSerializers;
        ServerBrandingConfig serverBrandingConfig = null;
        boolean z = true;
        Map map = null;
        Map map2 = null;
        Map map3 = null;
        Map map4 = null;
        ServerMediaFeedTab serverMediaFeedTab = null;
        Map map5 = null;
        Map map6 = null;
        Map map7 = null;
        int i = 0;
        while (z) {
            int o = b.o(serialDescriptor);
            switch (o) {
                case -1:
                    z = false;
                    break;
                case 0:
                    map2 = (Map) b.w(serialDescriptor, 0, (dy4) joaVarArr[0].getValue(), map2);
                    i |= 1;
                    break;
                case 1:
                    map3 = (Map) b.w(serialDescriptor, 1, (dy4) joaVarArr[1].getValue(), map3);
                    i |= 2;
                    break;
                case 2:
                    map4 = (Map) b.w(serialDescriptor, 2, (dy4) joaVarArr[2].getValue(), map4);
                    i |= 4;
                    break;
                case 3:
                    serverMediaFeedTab = (ServerMediaFeedTab) b.i(serialDescriptor, 3, ServerMediaFeedTab$$serializer.INSTANCE, serverMediaFeedTab);
                    i |= 8;
                    break;
                case 4:
                    map5 = (Map) b.w(serialDescriptor, 4, (dy4) joaVarArr[4].getValue(), map5);
                    i |= 16;
                    break;
                case 5:
                    map6 = (Map) b.i(serialDescriptor, 5, (dy4) joaVarArr[5].getValue(), map6);
                    i |= 32;
                    break;
                case 6:
                    map7 = (Map) b.i(serialDescriptor, 6, (dy4) joaVarArr[6].getValue(), map7);
                    i |= 64;
                    break;
                case 7:
                    map = (Map) b.i(serialDescriptor, 7, (dy4) joaVarArr[7].getValue(), map);
                    i |= 128;
                    break;
                default:
                    yhk.e(o);
                    return serverBrandingConfig;
            }
            serverBrandingConfig = null;
        }
        b.c(serialDescriptor);
        return new ServerBrandingConfig(i, map2, map3, map4, serverMediaFeedTab, map5, map6, map7, map, (t5h) null);
    }

    @Override // defpackage.dy4
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull ServerBrandingConfig value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        wf3 b = encoder.b(serialDescriptor);
        ServerBrandingConfig.write$Self$model_release(value, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.iw8
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
