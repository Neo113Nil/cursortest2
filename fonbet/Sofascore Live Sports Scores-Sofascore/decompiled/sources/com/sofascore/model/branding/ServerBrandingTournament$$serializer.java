package com.sofascore.model.branding;

import androidx.core.app.NotificationCompat;
import com.ironsource.U3;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.sofascore.model.buzzer.BuzzerConfigResponseKt;
import defpackage.a7a;
import defpackage.dy4;
import defpackage.gz1;
import defpackage.iw8;
import defpackage.joa;
import defpackage.l98;
import defpackage.uf3;
import defpackage.uhi;
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
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/sofascore/model/branding/ServerBrandingTournament.$serializer", "Liw8;", "Lcom/sofascore/model/branding/ServerBrandingTournament;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", U3.i.X, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/sofascore/model/branding/ServerBrandingTournament;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/sofascore/model/branding/ServerBrandingTournament;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
@wx4
/* loaded from: classes5.dex */
public final /* synthetic */ class ServerBrandingTournament$$serializer implements iw8 {

    @NotNull
    public static final ServerBrandingTournament$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        ServerBrandingTournament$$serializer serverBrandingTournament$$serializer = new ServerBrandingTournament$$serializer();
        INSTANCE = serverBrandingTournament$$serializer;
        uye uyeVar = new uye("com.sofascore.model.branding.ServerBrandingTournament", serverBrandingTournament$$serializer, 24);
        uyeVar.j("id", false);
        uyeVar.j("brand", false);
        uyeVar.j("eventList", false);
        uyeVar.j("standings", false);
        uyeVar.j("playerOfTheMatch", false);
        uyeVar.j(BuzzerConfigResponseKt.TEAM_OF_THE_WEEK, false);
        uyeVar.j("header", false);
        uyeVar.j("banner", false);
        uyeVar.j("details", false);
        uyeVar.j("oddsProviderId", false);
        uyeVar.j("forceOdds", false);
        uyeVar.j("standingsText", false);
        uyeVar.j("background", false);
        uyeVar.j(TtmlNode.ATTR_TTS_BACKGROUND_COLOR, false);
        uyeVar.j("takeoverImage", false);
        uyeVar.j("takeoverImageHeight", false);
        uyeVar.j("backgroundGradientColor", false);
        uyeVar.j("eventListColor", false);
        uyeVar.j("imageDisplayType", false);
        uyeVar.j("bannerHeight", false);
        uyeVar.j("adUnitHeight", false);
        uyeVar.j("appHeader", false);
        uyeVar.j("contentHeader", false);
        uyeVar.j("url", false);
        descriptor = uyeVar;
    }

    private ServerBrandingTournament$$serializer() {
    }

    @Override // defpackage.iw8
    @NotNull
    public final KSerializer[] childSerializers() {
        joa[] joaVarArr;
        joaVarArr = ServerBrandingTournament.$childSerializers;
        a7a a7aVar = a7a.a;
        gz1 gz1Var = gz1.a;
        KSerializer W = l98.W(gz1Var);
        KSerializer W2 = l98.W(gz1Var);
        KSerializer W3 = l98.W(gz1Var);
        KSerializer W4 = l98.W(gz1Var);
        KSerializer W5 = l98.W(gz1Var);
        KSerializer W6 = l98.W(gz1Var);
        KSerializer W7 = l98.W(gz1Var);
        KSerializer W8 = l98.W(a7aVar);
        KSerializer W9 = l98.W(gz1Var);
        KSerializer W10 = l98.W((KSerializer) joaVarArr[11].getValue());
        KSerializer W11 = l98.W(gz1Var);
        ServerBrandColors$$serializer serverBrandColors$$serializer = ServerBrandColors$$serializer.INSTANCE;
        return new KSerializer[]{a7aVar, ServerBrand$$serializer.INSTANCE, W, W2, W3, W4, W5, W6, W7, W8, W9, W10, W11, l98.W(serverBrandColors$$serializer), l98.W(gz1Var), l98.W(a7aVar), l98.W(ServerBrandingBackgroundColors$$serializer.INSTANCE), l98.W(serverBrandColors$$serializer), l98.W(ImageDisplayTypeSerializer.INSTANCE), l98.W(a7aVar), l98.W(a7aVar), l98.W(gz1Var), l98.W(gz1Var), l98.W(uhi.a)};
    }

    @Override // defpackage.dy4
    @NotNull
    public final ServerBrandingTournament deserialize(@NotNull Decoder decoder) {
        joa[] joaVarArr;
        Map map;
        Boolean bool;
        int i;
        Map map2;
        String str;
        Boolean bool2;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        uf3 b = decoder.b(serialDescriptor);
        joaVarArr = ServerBrandingTournament.$childSerializers;
        Map map3 = null;
        String str2 = null;
        Boolean bool3 = null;
        Boolean bool4 = null;
        Boolean bool5 = null;
        Integer num = null;
        int i2 = 0;
        ServerBrandColors serverBrandColors = null;
        Boolean bool6 = null;
        Integer num2 = null;
        ServerBrandingBackgroundColors serverBrandingBackgroundColors = null;
        ServerBrandColors serverBrandColors2 = null;
        ServerImageDisplayType serverImageDisplayType = null;
        Integer num3 = null;
        boolean z = true;
        int i3 = 0;
        ServerBrand serverBrand = null;
        Boolean bool7 = null;
        Boolean bool8 = null;
        Boolean bool9 = null;
        Boolean bool10 = null;
        Boolean bool11 = null;
        Boolean bool12 = null;
        Boolean bool13 = null;
        Integer num4 = null;
        Boolean bool14 = null;
        while (z) {
            int o = b.o(serialDescriptor);
            switch (o) {
                case -1:
                    map2 = map3;
                    str = str2;
                    bool2 = bool5;
                    z = false;
                    map3 = map2;
                    bool5 = bool2;
                    str2 = str;
                case 0:
                    map2 = map3;
                    str = str2;
                    bool2 = bool5;
                    i3 = b.l(serialDescriptor, 0);
                    i2 |= 1;
                    map3 = map2;
                    bool5 = bool2;
                    str2 = str;
                case 1:
                    map2 = map3;
                    str = str2;
                    bool2 = bool5;
                    serverBrand = (ServerBrand) b.w(serialDescriptor, 1, ServerBrand$$serializer.INSTANCE, serverBrand);
                    i2 |= 2;
                    bool7 = bool7;
                    map3 = map2;
                    bool5 = bool2;
                    str2 = str;
                case 2:
                    map2 = map3;
                    str = str2;
                    bool2 = bool5;
                    bool7 = (Boolean) b.i(serialDescriptor, 2, gz1.a, bool7);
                    i2 |= 4;
                    map3 = map2;
                    bool5 = bool2;
                    str2 = str;
                case 3:
                    map2 = map3;
                    str = str2;
                    bool2 = bool5;
                    bool8 = (Boolean) b.i(serialDescriptor, 3, gz1.a, bool8);
                    i2 |= 8;
                    map3 = map2;
                    bool5 = bool2;
                    str2 = str;
                case 4:
                    map2 = map3;
                    str = str2;
                    bool2 = bool5;
                    bool9 = (Boolean) b.i(serialDescriptor, 4, gz1.a, bool9);
                    i2 |= 16;
                    map3 = map2;
                    bool5 = bool2;
                    str2 = str;
                case 5:
                    map2 = map3;
                    str = str2;
                    bool2 = bool5;
                    bool10 = (Boolean) b.i(serialDescriptor, 5, gz1.a, bool10);
                    i2 |= 32;
                    map3 = map2;
                    bool5 = bool2;
                    str2 = str;
                case 6:
                    map2 = map3;
                    str = str2;
                    bool2 = bool5;
                    bool11 = (Boolean) b.i(serialDescriptor, 6, gz1.a, bool11);
                    i2 |= 64;
                    map3 = map2;
                    bool5 = bool2;
                    str2 = str;
                case 7:
                    map2 = map3;
                    str = str2;
                    bool2 = bool5;
                    bool12 = (Boolean) b.i(serialDescriptor, 7, gz1.a, bool12);
                    i2 |= 128;
                    map3 = map2;
                    bool5 = bool2;
                    str2 = str;
                case 8:
                    map2 = map3;
                    str = str2;
                    bool2 = bool5;
                    bool13 = (Boolean) b.i(serialDescriptor, 8, gz1.a, bool13);
                    i2 |= NotificationCompat.FLAG_LOCAL_ONLY;
                    map3 = map2;
                    bool5 = bool2;
                    str2 = str;
                case 9:
                    map2 = map3;
                    str = str2;
                    bool2 = bool5;
                    num4 = (Integer) b.i(serialDescriptor, 9, a7a.a, num4);
                    i2 |= 512;
                    map3 = map2;
                    bool5 = bool2;
                    str2 = str;
                case 10:
                    str = str2;
                    bool2 = bool5;
                    map2 = map3;
                    bool14 = (Boolean) b.i(serialDescriptor, 10, gz1.a, bool14);
                    i2 |= 1024;
                    map3 = map2;
                    bool5 = bool2;
                    str2 = str;
                case 11:
                    str = str2;
                    bool2 = bool5;
                    map3 = (Map) b.i(serialDescriptor, 11, (dy4) joaVarArr[11].getValue(), map3);
                    i2 |= a.o;
                    bool5 = bool2;
                    str2 = str;
                case 12:
                    str = str2;
                    bool5 = (Boolean) b.i(serialDescriptor, 12, gz1.a, bool5);
                    i2 |= 4096;
                    map3 = map3;
                    str2 = str;
                case 13:
                    map = map3;
                    bool = bool5;
                    serverBrandColors = (ServerBrandColors) b.i(serialDescriptor, 13, ServerBrandColors$$serializer.INSTANCE, serverBrandColors);
                    i2 |= 8192;
                    map3 = map;
                    bool5 = bool;
                case 14:
                    map = map3;
                    bool = bool5;
                    bool6 = (Boolean) b.i(serialDescriptor, 14, gz1.a, bool6);
                    i2 |= 16384;
                    map3 = map;
                    bool5 = bool;
                case 15:
                    map = map3;
                    bool = bool5;
                    num2 = (Integer) b.i(serialDescriptor, 15, a7a.a, num2);
                    i = 32768;
                    i2 |= i;
                    map3 = map;
                    bool5 = bool;
                case 16:
                    map = map3;
                    bool = bool5;
                    serverBrandingBackgroundColors = (ServerBrandingBackgroundColors) b.i(serialDescriptor, 16, ServerBrandingBackgroundColors$$serializer.INSTANCE, serverBrandingBackgroundColors);
                    i = C.DEFAULT_BUFFER_SEGMENT_SIZE;
                    i2 |= i;
                    map3 = map;
                    bool5 = bool;
                case 17:
                    map = map3;
                    bool = bool5;
                    serverBrandColors2 = (ServerBrandColors) b.i(serialDescriptor, 17, ServerBrandColors$$serializer.INSTANCE, serverBrandColors2);
                    i = 131072;
                    i2 |= i;
                    map3 = map;
                    bool5 = bool;
                case 18:
                    map = map3;
                    bool = bool5;
                    serverImageDisplayType = (ServerImageDisplayType) b.i(serialDescriptor, 18, ImageDisplayTypeSerializer.INSTANCE, serverImageDisplayType);
                    i = 262144;
                    i2 |= i;
                    map3 = map;
                    bool5 = bool;
                case 19:
                    map = map3;
                    bool = bool5;
                    num3 = (Integer) b.i(serialDescriptor, 19, a7a.a, num3);
                    i = 524288;
                    i2 |= i;
                    map3 = map;
                    bool5 = bool;
                case 20:
                    map = map3;
                    bool = bool5;
                    num = (Integer) b.i(serialDescriptor, 20, a7a.a, num);
                    i = ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                    i2 |= i;
                    map3 = map;
                    bool5 = bool;
                case 21:
                    map = map3;
                    bool = bool5;
                    bool4 = (Boolean) b.i(serialDescriptor, 21, gz1.a, bool4);
                    i = 2097152;
                    i2 |= i;
                    map3 = map;
                    bool5 = bool;
                case 22:
                    map = map3;
                    bool = bool5;
                    bool3 = (Boolean) b.i(serialDescriptor, 22, gz1.a, bool3);
                    i = 4194304;
                    i2 |= i;
                    map3 = map;
                    bool5 = bool;
                case 23:
                    map = map3;
                    bool = bool5;
                    str2 = (String) b.i(serialDescriptor, 23, uhi.a, str2);
                    i = 8388608;
                    i2 |= i;
                    map3 = map;
                    bool5 = bool;
                default:
                    yhk.e(o);
                    return null;
            }
        }
        String str3 = str2;
        Boolean bool15 = bool5;
        ServerBrand serverBrand2 = serverBrand;
        Boolean bool16 = bool7;
        b.c(serialDescriptor);
        Integer num5 = num4;
        Integer num6 = num3;
        Boolean bool17 = bool11;
        ServerBrandingBackgroundColors serverBrandingBackgroundColors2 = serverBrandingBackgroundColors;
        return new ServerBrandingTournament(i2, i3, serverBrand2, bool16, bool8, bool9, bool10, bool17, bool12, bool13, num5, bool14, map3, bool15, serverBrandColors, bool6, num2, serverBrandingBackgroundColors2, serverBrandColors2, serverImageDisplayType, num6, num, bool4, bool3, str3, null);
    }

    @Override // defpackage.dy4
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull ServerBrandingTournament value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        wf3 b = encoder.b(serialDescriptor);
        ServerBrandingTournament.write$Self$model_release(value, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.iw8
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
