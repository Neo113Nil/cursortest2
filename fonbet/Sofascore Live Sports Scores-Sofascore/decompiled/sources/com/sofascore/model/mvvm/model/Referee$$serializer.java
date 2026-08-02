package com.sofascore.model.mvvm.model;

import androidx.core.app.NotificationCompat;
import com.ironsource.U3;
import com.ironsource.mediationsdk.metadata.a;
import com.sofascore.model.network.response.SearchResponseKt;
import defpackage.a7a;
import defpackage.gz1;
import defpackage.iw8;
import defpackage.l98;
import defpackage.lkb;
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
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/sofascore/model/mvvm/model/Referee.$serializer", "Liw8;", "Lcom/sofascore/model/mvvm/model/Referee;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", U3.i.X, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/sofascore/model/mvvm/model/Referee;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/sofascore/model/mvvm/model/Referee;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
@wx4
/* loaded from: classes5.dex */
public final /* synthetic */ class Referee$$serializer implements iw8 {

    @NotNull
    public static final Referee$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        Referee$$serializer referee$$serializer = new Referee$$serializer();
        INSTANCE = referee$$serializer;
        uye uyeVar = new uye("com.sofascore.model.mvvm.model.Referee", referee$$serializer, 14);
        uyeVar.j("id", false);
        uyeVar.j("name", false);
        uyeVar.j("slug", false);
        uyeVar.j("country", false);
        uyeVar.j("yellowCards", false);
        uyeVar.j("redCards", false);
        uyeVar.j("yellowRedCards", false);
        uyeVar.j("games", false);
        uyeVar.j("dateOfBirthTimestamp", false);
        uyeVar.j("firstLeagueDebutTimestamp", false);
        uyeVar.j(SearchResponseKt.SPORT_ENTITY, false);
        uyeVar.j("fieldTranslations", false);
        uyeVar.j("isRecent", true);
        uyeVar.j("webUrl", true);
        descriptor = uyeVar;
    }

    private Referee$$serializer() {
    }

    @Override // defpackage.iw8
    @NotNull
    public final KSerializer[] childSerializers() {
        a7a a7aVar = a7a.a;
        KSerializer W = l98.W(Country$$serializer.INSTANCE);
        KSerializer W2 = l98.W(a7aVar);
        KSerializer W3 = l98.W(a7aVar);
        KSerializer W4 = l98.W(a7aVar);
        KSerializer W5 = l98.W(a7aVar);
        lkb lkbVar = lkb.a;
        KSerializer W6 = l98.W(lkbVar);
        KSerializer W7 = l98.W(lkbVar);
        KSerializer W8 = l98.W(Sport$$serializer.INSTANCE);
        KSerializer W9 = l98.W(FieldTranslations$$serializer.INSTANCE);
        uhi uhiVar = uhi.a;
        return new KSerializer[]{a7aVar, uhiVar, uhiVar, W, W2, W3, W4, W5, W6, W7, W8, W9, gz1.a, uhiVar};
    }

    @Override // defpackage.dy4
    @NotNull
    public final Referee deserialize(@NotNull Decoder decoder) {
        boolean z;
        int i;
        boolean z2;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        uf3 b = decoder.b(serialDescriptor);
        FieldTranslations fieldTranslations = null;
        Sport sport = null;
        Long l = null;
        boolean z3 = true;
        Long l2 = null;
        int i2 = 0;
        int i3 = 0;
        String str = null;
        String str2 = null;
        Country country = null;
        Integer num = null;
        Integer num2 = null;
        Integer num3 = null;
        Integer num4 = null;
        boolean z4 = false;
        String str3 = null;
        while (z3) {
            int o = b.o(serialDescriptor);
            switch (o) {
                case -1:
                    i = i3;
                    z3 = false;
                    i3 = i;
                case 0:
                    z = z3;
                    i2 |= 1;
                    i3 = b.l(serialDescriptor, 0);
                    z3 = z;
                case 1:
                    z = z3;
                    str = b.n(serialDescriptor, 1);
                    i2 |= 2;
                    z3 = z;
                case 2:
                    z = z3;
                    str2 = b.n(serialDescriptor, 2);
                    i2 |= 4;
                    z3 = z;
                case 3:
                    z2 = z3;
                    i = i3;
                    country = (Country) b.i(serialDescriptor, 3, Country$$serializer.INSTANCE, country);
                    i2 |= 8;
                    z3 = z2;
                    i3 = i;
                case 4:
                    z2 = z3;
                    i = i3;
                    num = (Integer) b.i(serialDescriptor, 4, a7a.a, num);
                    i2 |= 16;
                    z3 = z2;
                    i3 = i;
                case 5:
                    z2 = z3;
                    i = i3;
                    num2 = (Integer) b.i(serialDescriptor, 5, a7a.a, num2);
                    i2 |= 32;
                    z3 = z2;
                    i3 = i;
                case 6:
                    z2 = z3;
                    i = i3;
                    num3 = (Integer) b.i(serialDescriptor, 6, a7a.a, num3);
                    i2 |= 64;
                    z3 = z2;
                    i3 = i;
                case 7:
                    z2 = z3;
                    i = i3;
                    num4 = (Integer) b.i(serialDescriptor, 7, a7a.a, num4);
                    i2 |= 128;
                    z3 = z2;
                    i3 = i;
                case 8:
                    z2 = z3;
                    i = i3;
                    l2 = (Long) b.i(serialDescriptor, 8, lkb.a, l2);
                    i2 |= NotificationCompat.FLAG_LOCAL_ONLY;
                    z3 = z2;
                    i3 = i;
                case 9:
                    z2 = z3;
                    i = i3;
                    l = (Long) b.i(serialDescriptor, 9, lkb.a, l);
                    i2 |= 512;
                    z3 = z2;
                    i3 = i;
                case 10:
                    z2 = z3;
                    i = i3;
                    sport = (Sport) b.i(serialDescriptor, 10, Sport$$serializer.INSTANCE, sport);
                    i2 |= 1024;
                    z3 = z2;
                    i3 = i;
                case 11:
                    z2 = z3;
                    i = i3;
                    fieldTranslations = (FieldTranslations) b.i(serialDescriptor, 11, FieldTranslations$$serializer.INSTANCE, fieldTranslations);
                    i2 |= a.o;
                    z3 = z2;
                    i3 = i;
                case 12:
                    z = z3;
                    z4 = b.B(serialDescriptor, 12);
                    i2 |= 4096;
                    z3 = z;
                case 13:
                    z = z3;
                    str3 = b.n(serialDescriptor, 13);
                    i2 |= 8192;
                    z3 = z;
                default:
                    yhk.e(o);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new Referee(i2, i3, str, str2, country, num, num2, num3, num4, l2, l, sport, fieldTranslations, z4, str3, null);
    }

    @Override // defpackage.dy4
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull Referee value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        wf3 b = encoder.b(serialDescriptor);
        Referee.write$Self$model_release(value, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.iw8
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
