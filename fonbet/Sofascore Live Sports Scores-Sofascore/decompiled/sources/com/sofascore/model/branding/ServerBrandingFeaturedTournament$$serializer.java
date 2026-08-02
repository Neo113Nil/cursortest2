package com.sofascore.model.branding;

import androidx.core.app.NotificationCompat;
import com.ironsource.U3;
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
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/sofascore/model/branding/ServerBrandingFeaturedTournament.$serializer", "Liw8;", "Lcom/sofascore/model/branding/ServerBrandingFeaturedTournament;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", U3.i.X, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/sofascore/model/branding/ServerBrandingFeaturedTournament;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/sofascore/model/branding/ServerBrandingFeaturedTournament;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
@wx4
/* loaded from: classes5.dex */
public final /* synthetic */ class ServerBrandingFeaturedTournament$$serializer implements iw8 {

    @NotNull
    public static final ServerBrandingFeaturedTournament$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        ServerBrandingFeaturedTournament$$serializer serverBrandingFeaturedTournament$$serializer = new ServerBrandingFeaturedTournament$$serializer();
        INSTANCE = serverBrandingFeaturedTournament$$serializer;
        uye uyeVar = new uye("com.sofascore.model.branding.ServerBrandingFeaturedTournament", serverBrandingFeaturedTournament$$serializer, 11);
        uyeVar.j("id", false);
        uyeVar.j("brand", false);
        uyeVar.j("upperImageDisplayType", false);
        uyeVar.j("upperBannerHeight", false);
        uyeVar.j("upperAdUnitHeight", false);
        uyeVar.j("lowerImageDisplayType", false);
        uyeVar.j("lowerBannerHeight", false);
        uyeVar.j("lowerAdUnitHeight", false);
        uyeVar.j("playerOfTheMatch", false);
        uyeVar.j("timerImage", false);
        uyeVar.j("url", false);
        descriptor = uyeVar;
    }

    private ServerBrandingFeaturedTournament$$serializer() {
    }

    @Override // defpackage.iw8
    @NotNull
    public final KSerializer[] childSerializers() {
        a7a a7aVar = a7a.a;
        ImageDisplayTypeSerializer imageDisplayTypeSerializer = ImageDisplayTypeSerializer.INSTANCE;
        KSerializer W = l98.W(imageDisplayTypeSerializer);
        KSerializer W2 = l98.W(a7aVar);
        KSerializer W3 = l98.W(a7aVar);
        KSerializer W4 = l98.W(imageDisplayTypeSerializer);
        KSerializer W5 = l98.W(a7aVar);
        KSerializer W6 = l98.W(a7aVar);
        gz1 gz1Var = gz1.a;
        return new KSerializer[]{a7aVar, ServerBrand$$serializer.INSTANCE, W, W2, W3, W4, W5, W6, l98.W(gz1Var), l98.W(gz1Var), l98.W(uhi.a)};
    }

    @Override // defpackage.dy4
    @NotNull
    public final ServerBrandingFeaturedTournament deserialize(@NotNull Decoder decoder) {
        boolean z;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        uf3 b = decoder.b(serialDescriptor);
        String str = null;
        Boolean bool = null;
        boolean z2 = true;
        Boolean bool2 = null;
        int i = 0;
        int i2 = 0;
        ServerBrand serverBrand = null;
        ServerImageDisplayType serverImageDisplayType = null;
        Integer num = null;
        Integer num2 = null;
        ServerImageDisplayType serverImageDisplayType2 = null;
        Integer num3 = null;
        Integer num4 = null;
        while (z2) {
            int o = b.o(serialDescriptor);
            switch (o) {
                case -1:
                    z2 = false;
                    continue;
                case 0:
                    z = z2;
                    i2 = b.l(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    z = z2;
                    serverBrand = (ServerBrand) b.w(serialDescriptor, 1, ServerBrand$$serializer.INSTANCE, serverBrand);
                    i |= 2;
                    break;
                case 2:
                    z = z2;
                    serverImageDisplayType = (ServerImageDisplayType) b.i(serialDescriptor, 2, ImageDisplayTypeSerializer.INSTANCE, serverImageDisplayType);
                    i |= 4;
                    break;
                case 3:
                    z = z2;
                    num = (Integer) b.i(serialDescriptor, 3, a7a.a, num);
                    i |= 8;
                    break;
                case 4:
                    z = z2;
                    num2 = (Integer) b.i(serialDescriptor, 4, a7a.a, num2);
                    i |= 16;
                    break;
                case 5:
                    z = z2;
                    serverImageDisplayType2 = (ServerImageDisplayType) b.i(serialDescriptor, 5, ImageDisplayTypeSerializer.INSTANCE, serverImageDisplayType2);
                    i |= 32;
                    break;
                case 6:
                    z = z2;
                    num3 = (Integer) b.i(serialDescriptor, 6, a7a.a, num3);
                    i |= 64;
                    break;
                case 7:
                    z = z2;
                    num4 = (Integer) b.i(serialDescriptor, 7, a7a.a, num4);
                    i |= 128;
                    break;
                case 8:
                    z = z2;
                    bool2 = (Boolean) b.i(serialDescriptor, 8, gz1.a, bool2);
                    i |= NotificationCompat.FLAG_LOCAL_ONLY;
                    break;
                case 9:
                    z = z2;
                    bool = (Boolean) b.i(serialDescriptor, 9, gz1.a, bool);
                    i |= 512;
                    break;
                case 10:
                    z = z2;
                    str = (String) b.i(serialDescriptor, 10, uhi.a, str);
                    i |= 1024;
                    break;
                default:
                    yhk.e(o);
                    return null;
            }
            z2 = z;
        }
        b.c(serialDescriptor);
        return new ServerBrandingFeaturedTournament(i, i2, serverBrand, serverImageDisplayType, num, num2, serverImageDisplayType2, num3, num4, bool2, bool, str, null);
    }

    @Override // defpackage.dy4
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull ServerBrandingFeaturedTournament value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        wf3 b = encoder.b(serialDescriptor);
        ServerBrandingFeaturedTournament.write$Self$model_release(value, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.iw8
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
