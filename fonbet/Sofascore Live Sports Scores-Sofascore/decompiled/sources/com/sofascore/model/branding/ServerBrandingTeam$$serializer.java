package com.sofascore.model.branding;

import androidx.core.app.NotificationCompat;
import com.ironsource.U3;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import defpackage.a7a;
import defpackage.gz1;
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
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/sofascore/model/branding/ServerBrandingTeam.$serializer", "Liw8;", "Lcom/sofascore/model/branding/ServerBrandingTeam;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", U3.i.X, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/sofascore/model/branding/ServerBrandingTeam;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/sofascore/model/branding/ServerBrandingTeam;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
@wx4
/* loaded from: classes5.dex */
public final /* synthetic */ class ServerBrandingTeam$$serializer implements iw8 {

    @NotNull
    public static final ServerBrandingTeam$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        ServerBrandingTeam$$serializer serverBrandingTeam$$serializer = new ServerBrandingTeam$$serializer();
        INSTANCE = serverBrandingTeam$$serializer;
        uye uyeVar = new uye("com.sofascore.model.branding.ServerBrandingTeam", serverBrandingTeam$$serializer, 16);
        uyeVar.j("id", false);
        uyeVar.j("brand", false);
        uyeVar.j("banner", false);
        uyeVar.j("url", false);
        uyeVar.j("oddsProviderId", false);
        uyeVar.j("bannerHeight", false);
        uyeVar.j("adUnitHeight", false);
        uyeVar.j("imageDisplayType", false);
        uyeVar.j("header", false);
        uyeVar.j("appHeader", false);
        uyeVar.j("contentHeader", false);
        uyeVar.j("background", false);
        uyeVar.j("takeoverImage", false);
        uyeVar.j("takeoverImageHeight", false);
        uyeVar.j(TtmlNode.ATTR_TTS_BACKGROUND_COLOR, false);
        uyeVar.j("backgroundGradientColor", false);
        descriptor = uyeVar;
    }

    private ServerBrandingTeam$$serializer() {
    }

    @Override // defpackage.iw8
    @NotNull
    public final KSerializer[] childSerializers() {
        a7a a7aVar = a7a.a;
        gz1 gz1Var = gz1.a;
        return new KSerializer[]{a7aVar, ServerBrand$$serializer.INSTANCE, l98.W(gz1Var), l98.W(uhi.a), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(ImageDisplayTypeSerializer.INSTANCE), l98.W(gz1Var), l98.W(gz1Var), l98.W(gz1Var), l98.W(gz1Var), l98.W(gz1Var), l98.W(a7aVar), l98.W(ServerBrandColors$$serializer.INSTANCE), l98.W(ServerBrandingBackgroundColors$$serializer.INSTANCE)};
    }

    @Override // defpackage.dy4
    @NotNull
    public final ServerBrandingTeam deserialize(@NotNull Decoder decoder) {
        String str;
        Integer num;
        Boolean bool;
        String str2;
        Integer num2;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        uf3 b = decoder.b(serialDescriptor);
        Boolean bool2 = null;
        Boolean bool3 = null;
        Boolean bool4 = null;
        Boolean bool5 = null;
        Boolean bool6 = null;
        int i = 0;
        Integer num3 = null;
        ServerBrandColors serverBrandColors = null;
        ServerBrandingBackgroundColors serverBrandingBackgroundColors = null;
        String str3 = null;
        Integer num4 = null;
        Integer num5 = null;
        Integer num6 = null;
        ServerImageDisplayType serverImageDisplayType = null;
        boolean z = true;
        int i2 = 0;
        ServerBrand serverBrand = null;
        Boolean bool7 = null;
        while (z) {
            int o = b.o(serialDescriptor);
            switch (o) {
                case -1:
                    bool = bool2;
                    str2 = str3;
                    num2 = num4;
                    z = false;
                    str3 = str2;
                    num4 = num2;
                    bool2 = bool;
                case 0:
                    bool = bool2;
                    str2 = str3;
                    num2 = num4;
                    i2 = b.l(serialDescriptor, 0);
                    i |= 1;
                    str3 = str2;
                    num4 = num2;
                    bool2 = bool;
                case 1:
                    bool = bool2;
                    str2 = str3;
                    num2 = num4;
                    serverBrand = (ServerBrand) b.w(serialDescriptor, 1, ServerBrand$$serializer.INSTANCE, serverBrand);
                    i |= 2;
                    bool7 = bool7;
                    str3 = str2;
                    num4 = num2;
                    bool2 = bool;
                case 2:
                    bool = bool2;
                    num2 = num4;
                    str2 = str3;
                    bool7 = (Boolean) b.i(serialDescriptor, 2, gz1.a, bool7);
                    i |= 4;
                    str3 = str2;
                    num4 = num2;
                    bool2 = bool;
                case 3:
                    bool = bool2;
                    num2 = num4;
                    str3 = (String) b.i(serialDescriptor, 3, uhi.a, str3);
                    i |= 8;
                    num4 = num2;
                    bool2 = bool;
                case 4:
                    bool = bool2;
                    num4 = (Integer) b.i(serialDescriptor, 4, a7a.a, num4);
                    i |= 16;
                    str3 = str3;
                    bool2 = bool;
                case 5:
                    str = str3;
                    num = num4;
                    num5 = (Integer) b.i(serialDescriptor, 5, a7a.a, num5);
                    i |= 32;
                    str3 = str;
                    num4 = num;
                case 6:
                    str = str3;
                    num = num4;
                    num6 = (Integer) b.i(serialDescriptor, 6, a7a.a, num6);
                    i |= 64;
                    str3 = str;
                    num4 = num;
                case 7:
                    str = str3;
                    num = num4;
                    serverImageDisplayType = (ServerImageDisplayType) b.i(serialDescriptor, 7, ImageDisplayTypeSerializer.INSTANCE, serverImageDisplayType);
                    i |= 128;
                    str3 = str;
                    num4 = num;
                case 8:
                    str = str3;
                    num = num4;
                    bool6 = (Boolean) b.i(serialDescriptor, 8, gz1.a, bool6);
                    i |= NotificationCompat.FLAG_LOCAL_ONLY;
                    str3 = str;
                    num4 = num;
                case 9:
                    str = str3;
                    num = num4;
                    bool4 = (Boolean) b.i(serialDescriptor, 9, gz1.a, bool4);
                    i |= 512;
                    str3 = str;
                    num4 = num;
                case 10:
                    str = str3;
                    num = num4;
                    bool3 = (Boolean) b.i(serialDescriptor, 10, gz1.a, bool3);
                    i |= 1024;
                    str3 = str;
                    num4 = num;
                case 11:
                    str = str3;
                    num = num4;
                    bool2 = (Boolean) b.i(serialDescriptor, 11, gz1.a, bool2);
                    i |= a.o;
                    str3 = str;
                    num4 = num;
                case 12:
                    str = str3;
                    num = num4;
                    bool5 = (Boolean) b.i(serialDescriptor, 12, gz1.a, bool5);
                    i |= 4096;
                    str3 = str;
                    num4 = num;
                case 13:
                    str = str3;
                    num = num4;
                    num3 = (Integer) b.i(serialDescriptor, 13, a7a.a, num3);
                    i |= 8192;
                    str3 = str;
                    num4 = num;
                case 14:
                    str = str3;
                    num = num4;
                    serverBrandColors = (ServerBrandColors) b.i(serialDescriptor, 14, ServerBrandColors$$serializer.INSTANCE, serverBrandColors);
                    i |= 16384;
                    str3 = str;
                    num4 = num;
                case 15:
                    str = str3;
                    num = num4;
                    serverBrandingBackgroundColors = (ServerBrandingBackgroundColors) b.i(serialDescriptor, 15, ServerBrandingBackgroundColors$$serializer.INSTANCE, serverBrandingBackgroundColors);
                    i |= 32768;
                    str3 = str;
                    num4 = num;
                default:
                    yhk.e(o);
                    return null;
            }
        }
        String str4 = str3;
        Integer num7 = num4;
        ServerBrand serverBrand2 = serverBrand;
        Boolean bool8 = bool7;
        b.c(serialDescriptor);
        return new ServerBrandingTeam(i, i2, serverBrand2, bool8, str4, num7, num5, num6, serverImageDisplayType, bool6, bool4, bool3, bool2, bool5, num3, serverBrandColors, serverBrandingBackgroundColors, null);
    }

    @Override // defpackage.dy4
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull ServerBrandingTeam value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        wf3 b = encoder.b(serialDescriptor);
        ServerBrandingTeam.write$Self$model_release(value, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.iw8
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
