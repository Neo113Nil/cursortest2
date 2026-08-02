package com.sofascore.model.odds;

import androidx.core.app.NotificationCompat;
import com.ironsource.U3;
import com.ironsource.mediationsdk.metadata.a;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import defpackage.a7a;
import defpackage.dy4;
import defpackage.gz1;
import defpackage.h75;
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
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/sofascore/model/odds/OddsCountryProvider.$serializer", "Liw8;", "Lcom/sofascore/model/odds/OddsCountryProvider;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", U3.i.X, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/sofascore/model/odds/OddsCountryProvider;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/sofascore/model/odds/OddsCountryProvider;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
@wx4
/* loaded from: classes5.dex */
public final /* synthetic */ class OddsCountryProvider$$serializer implements iw8 {

    @NotNull
    public static final OddsCountryProvider$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        OddsCountryProvider$$serializer oddsCountryProvider$$serializer = new OddsCountryProvider$$serializer();
        INSTANCE = oddsCountryProvider$$serializer;
        uye uyeVar = new uye("com.sofascore.model.odds.OddsCountryProvider", oddsCountryProvider$$serializer, 18);
        uyeVar.j(IronSourceConstants.EVENTS_PROVIDER, false);
        uyeVar.j("branded", false);
        uyeVar.j("featuredOddsType", false);
        uyeVar.j("defaultBetSlipLink", false);
        uyeVar.j("betSlipLink", false);
        uyeVar.j("group", false);
        uyeVar.j("fallbackProvider", false);
        uyeVar.j("oddsOffset", false);
        uyeVar.j("impressionCostEncrypted", false);
        uyeVar.j("sort", false);
        uyeVar.j("weight", false);
        uyeVar.j("oddsMayDiffer", false);
        uyeVar.j("signupLink", false);
        uyeVar.j("featuredUniqueTournamentId", false);
        uyeVar.j("featuredOddsDisplayArea", false);
        uyeVar.j("type", false);
        uyeVar.j("subProviders", true);
        uyeVar.j("impressionCostDecrypted", true);
        descriptor = uyeVar;
    }

    private OddsCountryProvider$$serializer() {
    }

    @Override // defpackage.iw8
    @NotNull
    public final KSerializer[] childSerializers() {
        joa[] joaVarArr;
        joaVarArr = OddsCountryProvider.$childSerializers;
        OddsProvider$$serializer oddsProvider$$serializer = OddsProvider$$serializer.INSTANCE;
        gz1 gz1Var = gz1.a;
        uhi uhiVar = uhi.a;
        KSerializer W = l98.W(uhiVar);
        a7a a7aVar = a7a.a;
        KSerializer W2 = l98.W(a7aVar);
        KSerializer W3 = l98.W(oddsProvider$$serializer);
        h75 h75Var = h75.a;
        return new KSerializer[]{oddsProvider$$serializer, gz1Var, uhiVar, W, uhiVar, W2, W3, l98.W(h75Var), l98.W(uhiVar), l98.W(a7aVar), a7aVar, l98.W(gz1Var), l98.W(uhiVar), l98.W(a7aVar), l98.W(FeaturedOddsDisplayAreaSerializer.INSTANCE), l98.W(uhiVar), l98.W((KSerializer) joaVarArr[16].getValue()), h75Var};
    }

    @Override // defpackage.dy4
    @NotNull
    public final OddsCountryProvider deserialize(@NotNull Decoder decoder) {
        joa[] joaVarArr;
        OddsProvider oddsProvider;
        String str;
        String str2;
        OddsProvider oddsProvider2;
        OddsProvider oddsProvider3;
        int i;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        uf3 b = decoder.b(serialDescriptor);
        joaVarArr = OddsCountryProvider.$childSerializers;
        double d = 0.0d;
        String str3 = null;
        Boolean bool = null;
        Integer num = null;
        String str4 = null;
        Integer num2 = null;
        OddsProvider oddsProvider4 = null;
        Double d2 = null;
        int i2 = 0;
        OddsProvider oddsProvider5 = null;
        FeaturedOddsDisplayArea featuredOddsDisplayArea = null;
        String str5 = null;
        String str6 = null;
        List list = null;
        Integer num3 = null;
        boolean z = true;
        boolean z2 = false;
        int i3 = 0;
        String str7 = null;
        String str8 = null;
        while (z) {
            int o = b.o(serialDescriptor);
            switch (o) {
                case -1:
                    str = str3;
                    z = false;
                    str3 = str;
                case 0:
                    String str9 = str3;
                    str2 = str6;
                    oddsProvider5 = (OddsProvider) b.w(serialDescriptor, 0, OddsProvider$$serializer.INSTANCE, oddsProvider5);
                    i2 |= 1;
                    str3 = str9;
                    str6 = str2;
                case 1:
                    str = str3;
                    oddsProvider2 = oddsProvider5;
                    z2 = b.B(serialDescriptor, 1);
                    i2 |= 2;
                    oddsProvider5 = oddsProvider2;
                    str3 = str;
                case 2:
                    str = str3;
                    oddsProvider2 = oddsProvider5;
                    str7 = b.n(serialDescriptor, 2);
                    i2 |= 4;
                    oddsProvider5 = oddsProvider2;
                    str3 = str;
                case 3:
                    oddsProvider2 = oddsProvider5;
                    str = str3;
                    str6 = (String) b.i(serialDescriptor, 3, uhi.a, str6);
                    i2 |= 8;
                    oddsProvider5 = oddsProvider2;
                    str3 = str;
                case 4:
                    oddsProvider = oddsProvider5;
                    str8 = b.n(serialDescriptor, 4);
                    i2 |= 16;
                    oddsProvider5 = oddsProvider;
                case 5:
                    oddsProvider3 = oddsProvider5;
                    str2 = str6;
                    num3 = (Integer) b.i(serialDescriptor, 5, a7a.a, num3);
                    i2 |= 32;
                    oddsProvider5 = oddsProvider3;
                    str6 = str2;
                case 6:
                    oddsProvider3 = oddsProvider5;
                    str2 = str6;
                    oddsProvider4 = (OddsProvider) b.i(serialDescriptor, 6, OddsProvider$$serializer.INSTANCE, oddsProvider4);
                    i2 |= 64;
                    oddsProvider5 = oddsProvider3;
                    str6 = str2;
                case 7:
                    oddsProvider3 = oddsProvider5;
                    str2 = str6;
                    d2 = (Double) b.i(serialDescriptor, 7, h75.a, d2);
                    i2 |= 128;
                    oddsProvider5 = oddsProvider3;
                    str6 = str2;
                case 8:
                    oddsProvider3 = oddsProvider5;
                    str2 = str6;
                    str4 = (String) b.i(serialDescriptor, 8, uhi.a, str4);
                    i2 |= NotificationCompat.FLAG_LOCAL_ONLY;
                    oddsProvider5 = oddsProvider3;
                    str6 = str2;
                case 9:
                    oddsProvider3 = oddsProvider5;
                    str2 = str6;
                    num = (Integer) b.i(serialDescriptor, 9, a7a.a, num);
                    i2 |= 512;
                    oddsProvider5 = oddsProvider3;
                    str6 = str2;
                case 10:
                    oddsProvider = oddsProvider5;
                    i3 = b.l(serialDescriptor, 10);
                    i2 |= 1024;
                    oddsProvider5 = oddsProvider;
                case 11:
                    oddsProvider3 = oddsProvider5;
                    str2 = str6;
                    bool = (Boolean) b.i(serialDescriptor, 11, gz1.a, bool);
                    i2 |= a.o;
                    oddsProvider5 = oddsProvider3;
                    str6 = str2;
                case 12:
                    oddsProvider3 = oddsProvider5;
                    str2 = str6;
                    str3 = (String) b.i(serialDescriptor, 12, uhi.a, str3);
                    i2 |= 4096;
                    oddsProvider5 = oddsProvider3;
                    str6 = str2;
                case 13:
                    oddsProvider3 = oddsProvider5;
                    str2 = str6;
                    num2 = (Integer) b.i(serialDescriptor, 13, a7a.a, num2);
                    i2 |= 8192;
                    oddsProvider5 = oddsProvider3;
                    str6 = str2;
                case 14:
                    oddsProvider3 = oddsProvider5;
                    str2 = str6;
                    featuredOddsDisplayArea = (FeaturedOddsDisplayArea) b.i(serialDescriptor, 14, FeaturedOddsDisplayAreaSerializer.INSTANCE, featuredOddsDisplayArea);
                    i2 |= 16384;
                    oddsProvider5 = oddsProvider3;
                    str6 = str2;
                case 15:
                    oddsProvider3 = oddsProvider5;
                    str2 = str6;
                    str5 = (String) b.i(serialDescriptor, 15, uhi.a, str5);
                    i = 32768;
                    i2 |= i;
                    oddsProvider5 = oddsProvider3;
                    str6 = str2;
                case 16:
                    oddsProvider3 = oddsProvider5;
                    str2 = str6;
                    list = (List) b.i(serialDescriptor, 16, (dy4) joaVarArr[16].getValue(), list);
                    i = C.DEFAULT_BUFFER_SEGMENT_SIZE;
                    i2 |= i;
                    oddsProvider5 = oddsProvider3;
                    str6 = str2;
                case 17:
                    oddsProvider = oddsProvider5;
                    d = b.D(serialDescriptor, 17);
                    i2 |= 131072;
                    oddsProvider5 = oddsProvider;
                default:
                    yhk.e(o);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new OddsCountryProvider(i2, oddsProvider5, z2, str7, str6, str8, num3, oddsProvider4, d2, str4, num, i3, bool, str3, num2, featuredOddsDisplayArea, str5, list, d, null);
    }

    @Override // defpackage.dy4
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull OddsCountryProvider value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        wf3 b = encoder.b(serialDescriptor);
        OddsCountryProvider.write$Self$model_release(value, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.iw8
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
