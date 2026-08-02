package com.sofascore.model.mvvm.model;

import androidx.core.app.NotificationCompat;
import com.ironsource.U3;
import com.ironsource.mediationsdk.metadata.a;
import defpackage.a7a;
import defpackage.dy4;
import defpackage.gz1;
import defpackage.iw8;
import defpackage.joa;
import defpackage.l98;
import defpackage.lkb;
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
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/sofascore/model/mvvm/model/Venue.$serializer", "Liw8;", "Lcom/sofascore/model/mvvm/model/Venue;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", U3.i.X, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/sofascore/model/mvvm/model/Venue;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/sofascore/model/mvvm/model/Venue;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
@wx4
/* loaded from: classes5.dex */
public final /* synthetic */ class Venue$$serializer implements iw8 {

    @NotNull
    public static final Venue$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        Venue$$serializer venue$$serializer = new Venue$$serializer();
        INSTANCE = venue$$serializer;
        uye uyeVar = new uye("com.sofascore.model.mvvm.model.Venue", venue$$serializer, 14);
        uyeVar.j("id", false);
        uyeVar.j("slug", false);
        uyeVar.j("country", false);
        uyeVar.j("city", false);
        uyeVar.j("stadium", false);
        uyeVar.j("fieldTranslations", true);
        uyeVar.j("venueCoordinates", false);
        uyeVar.j("mainTeams", false);
        uyeVar.j("hidden", false);
        uyeVar.j("name", false);
        uyeVar.j("capacity", false);
        uyeVar.j("openedAtTimestamp", false);
        uyeVar.j("stadiumType", true);
        uyeVar.j("webUrl", true);
        descriptor = uyeVar;
    }

    private Venue$$serializer() {
    }

    @Override // defpackage.iw8
    @NotNull
    public final KSerializer[] childSerializers() {
        joa[] joaVarArr;
        joaVarArr = Venue.$childSerializers;
        a7a a7aVar = a7a.a;
        uhi uhiVar = uhi.a;
        return new KSerializer[]{a7aVar, uhiVar, l98.W(Country$$serializer.INSTANCE), City$$serializer.INSTANCE, Stadium$$serializer.INSTANCE, l98.W(FieldTranslations$$serializer.INSTANCE), l98.W(LatLonCoordinates$$serializer.INSTANCE), l98.W((KSerializer) joaVarArr[7].getValue()), l98.W(gz1.a), l98.W(uhiVar), l98.W(a7aVar), l98.W(lkb.a), l98.W((KSerializer) joaVarArr[12].getValue()), uhiVar};
    }

    @Override // defpackage.dy4
    @NotNull
    public final Venue deserialize(@NotNull Decoder decoder) {
        joa[] joaVarArr;
        int i;
        String str;
        int i2;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        uf3 b = decoder.b(serialDescriptor);
        joaVarArr = Venue.$childSerializers;
        Long l = null;
        Integer num = null;
        String str2 = null;
        Boolean bool = null;
        StadiumType stadiumType = null;
        List list = null;
        int i3 = 0;
        int i4 = 0;
        String str3 = null;
        Country country = null;
        City city = null;
        Stadium stadium = null;
        FieldTranslations fieldTranslations = null;
        LatLonCoordinates latLonCoordinates = null;
        boolean z = true;
        String str4 = null;
        while (z) {
            int o = b.o(serialDescriptor);
            switch (o) {
                case -1:
                    str = str3;
                    z = false;
                    str3 = str;
                case 0:
                    str = str3;
                    i3 |= 1;
                    i4 = b.l(serialDescriptor, 0);
                    str3 = str;
                case 1:
                    i = i4;
                    str3 = b.n(serialDescriptor, 1);
                    i3 |= 2;
                    i4 = i;
                case 2:
                    i2 = i4;
                    str = str3;
                    country = (Country) b.i(serialDescriptor, 2, Country$$serializer.INSTANCE, country);
                    i3 |= 4;
                    i4 = i2;
                    str3 = str;
                case 3:
                    i2 = i4;
                    str = str3;
                    city = (City) b.w(serialDescriptor, 3, City$$serializer.INSTANCE, city);
                    i3 |= 8;
                    i4 = i2;
                    str3 = str;
                case 4:
                    i2 = i4;
                    str = str3;
                    stadium = (Stadium) b.w(serialDescriptor, 4, Stadium$$serializer.INSTANCE, stadium);
                    i3 |= 16;
                    i4 = i2;
                    str3 = str;
                case 5:
                    i2 = i4;
                    str = str3;
                    fieldTranslations = (FieldTranslations) b.i(serialDescriptor, 5, FieldTranslations$$serializer.INSTANCE, fieldTranslations);
                    i3 |= 32;
                    i4 = i2;
                    str3 = str;
                case 6:
                    i2 = i4;
                    str = str3;
                    latLonCoordinates = (LatLonCoordinates) b.i(serialDescriptor, 6, LatLonCoordinates$$serializer.INSTANCE, latLonCoordinates);
                    i3 |= 64;
                    i4 = i2;
                    str3 = str;
                case 7:
                    i2 = i4;
                    str = str3;
                    list = (List) b.i(serialDescriptor, 7, (dy4) joaVarArr[7].getValue(), list);
                    i3 |= 128;
                    i4 = i2;
                    str3 = str;
                case 8:
                    i2 = i4;
                    str = str3;
                    bool = (Boolean) b.i(serialDescriptor, 8, gz1.a, bool);
                    i3 |= NotificationCompat.FLAG_LOCAL_ONLY;
                    i4 = i2;
                    str3 = str;
                case 9:
                    i2 = i4;
                    str = str3;
                    str2 = (String) b.i(serialDescriptor, 9, uhi.a, str2);
                    i3 |= 512;
                    i4 = i2;
                    str3 = str;
                case 10:
                    i2 = i4;
                    str = str3;
                    num = (Integer) b.i(serialDescriptor, 10, a7a.a, num);
                    i3 |= 1024;
                    i4 = i2;
                    str3 = str;
                case 11:
                    i2 = i4;
                    str = str3;
                    l = (Long) b.i(serialDescriptor, 11, lkb.a, l);
                    i3 |= a.o;
                    i4 = i2;
                    str3 = str;
                case 12:
                    i2 = i4;
                    str = str3;
                    stadiumType = (StadiumType) b.i(serialDescriptor, 12, (dy4) joaVarArr[12].getValue(), stadiumType);
                    i3 |= 4096;
                    i4 = i2;
                    str3 = str;
                case 13:
                    i = i4;
                    str4 = b.n(serialDescriptor, 13);
                    i3 |= 8192;
                    i4 = i;
                default:
                    yhk.e(o);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new Venue(i3, i4, str3, country, city, stadium, fieldTranslations, latLonCoordinates, list, bool, str2, num, l, stadiumType, str4, null);
    }

    @Override // defpackage.dy4
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull Venue value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        wf3 b = encoder.b(serialDescriptor);
        Venue.write$Self$model_release(value, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.iw8
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
