package com.sofascore.model;

import com.ironsource.U3;
import defpackage.dy4;
import defpackage.gz1;
import defpackage.iw8;
import defpackage.joa;
import defpackage.l98;
import defpackage.t5h;
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
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/sofascore/model/Country.$serializer", "Liw8;", "Lcom/sofascore/model/Country;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", U3.i.X, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/sofascore/model/Country;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/sofascore/model/Country;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
@wx4
/* loaded from: classes5.dex */
public final /* synthetic */ class Country$$serializer implements iw8 {

    @NotNull
    public static final Country$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        Country$$serializer country$$serializer = new Country$$serializer();
        INSTANCE = country$$serializer;
        uye uyeVar = new uye("com.sofascore.model.Country", country$$serializer, 7);
        uyeVar.j("mccList", false);
        uyeVar.j("iso2Alpha", true);
        uyeVar.j("iso3Alpha", false);
        uyeVar.j("ioc", false);
        uyeVar.j("name", false);
        uyeVar.j("channelIds", true);
        uyeVar.j("hasRegions", true);
        descriptor = uyeVar;
    }

    private Country$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.iw8
    @NotNull
    public final KSerializer[] childSerializers() {
        joa[] joaVarArr;
        joaVarArr = Country.$childSerializers;
        uhi uhiVar = uhi.a;
        return new KSerializer[]{joaVarArr[0].getValue(), uhiVar, l98.W(uhiVar), l98.W(uhiVar), uhiVar, joaVarArr[5].getValue(), gz1.a};
    }

    @Override // defpackage.dy4
    @NotNull
    public final Country deserialize(@NotNull Decoder decoder) {
        joa[] joaVarArr;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        uf3 b = decoder.b(serialDescriptor);
        joaVarArr = Country.$childSerializers;
        Country country = null;
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        List list = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        List list2 = null;
        while (z) {
            int o = b.o(serialDescriptor);
            switch (o) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    list = (List) b.w(serialDescriptor, 0, (dy4) joaVarArr[0].getValue(), list);
                    i |= 1;
                    break;
                case 1:
                    str = b.n(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    str2 = (String) b.i(serialDescriptor, 2, uhi.a, str2);
                    i |= 4;
                    break;
                case 3:
                    str3 = (String) b.i(serialDescriptor, 3, uhi.a, str3);
                    i |= 8;
                    break;
                case 4:
                    str4 = b.n(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    list2 = (List) b.w(serialDescriptor, 5, (dy4) joaVarArr[5].getValue(), list2);
                    i |= 32;
                    break;
                case 6:
                    z2 = b.B(serialDescriptor, 6);
                    i |= 64;
                    continue;
                default:
                    yhk.e(o);
                    return country;
            }
            country = null;
        }
        b.c(serialDescriptor);
        return new Country(i, list, str, str2, str3, str4, list2, z2, (t5h) null);
    }

    @Override // defpackage.dy4
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull Country value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        wf3 b = encoder.b(serialDescriptor);
        Country.write$Self$model_release(value, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.iw8
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
