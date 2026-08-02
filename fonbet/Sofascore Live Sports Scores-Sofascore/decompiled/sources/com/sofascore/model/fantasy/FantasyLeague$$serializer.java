package com.sofascore.model.fantasy;

import androidx.core.app.NotificationCompat;
import com.ironsource.U3;
import com.sofascore.model.mvvm.model.Country;
import com.sofascore.model.mvvm.model.Country$$serializer;
import defpackage.a7a;
import defpackage.dy4;
import defpackage.iw8;
import defpackage.joa;
import defpackage.l98;
import defpackage.lkb;
import defpackage.t5h;
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
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/sofascore/model/fantasy/FantasyLeague.$serializer", "Liw8;", "Lcom/sofascore/model/fantasy/FantasyLeague;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", U3.i.X, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/sofascore/model/fantasy/FantasyLeague;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/sofascore/model/fantasy/FantasyLeague;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
@wx4
/* loaded from: classes5.dex */
public final /* synthetic */ class FantasyLeague$$serializer implements iw8 {

    @NotNull
    public static final FantasyLeague$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        FantasyLeague$$serializer fantasyLeague$$serializer = new FantasyLeague$$serializer();
        INSTANCE = fantasyLeague$$serializer;
        uye uyeVar = new uye("com.sofascore.model.fantasy.FantasyLeague", fantasyLeague$$serializer, 11);
        uyeVar.j("id", false);
        uyeVar.j("name", false);
        uyeVar.j("description", false);
        uyeVar.j("ownerId", false);
        uyeVar.j("startRoundId", false);
        uyeVar.j("totalPlayers", false);
        uyeVar.j("createdAtTimestamp", false);
        uyeVar.j("ownerNickname", false);
        uyeVar.j("country", false);
        uyeVar.j("type", false);
        uyeVar.j("gameType", true);
        descriptor = uyeVar;
    }

    private FantasyLeague$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.iw8
    @NotNull
    public final KSerializer[] childSerializers() {
        joa[] joaVarArr;
        joaVarArr = FantasyLeague.$childSerializers;
        a7a a7aVar = a7a.a;
        uhi uhiVar = uhi.a;
        return new KSerializer[]{a7aVar, uhiVar, l98.W(uhiVar), l98.W(uhiVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(lkb.a), l98.W(uhiVar), l98.W(Country$$serializer.INSTANCE), l98.W((KSerializer) joaVarArr[9].getValue()), joaVarArr[10].getValue()};
    }

    @Override // defpackage.dy4
    @NotNull
    public final FantasyLeague deserialize(@NotNull Decoder decoder) {
        joa[] joaVarArr;
        joa[] joaVarArr2;
        boolean z;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        uf3 b = decoder.b(serialDescriptor);
        joaVarArr = FantasyLeague.$childSerializers;
        FantasyLeagueGameType fantasyLeagueGameType = null;
        FantasyLeagueType fantasyLeagueType = null;
        Country country = null;
        boolean z2 = true;
        String str = null;
        int i = 0;
        int i2 = 0;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Integer num = null;
        Integer num2 = null;
        Long l = null;
        while (z2) {
            int o = b.o(serialDescriptor);
            switch (o) {
                case -1:
                    z2 = false;
                    continue;
                case 0:
                    joaVarArr2 = joaVarArr;
                    z = z2;
                    i2 = b.l(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    str2 = b.n(serialDescriptor, 1);
                    i |= 2;
                    joaVarArr = joaVarArr;
                    continue;
                case 2:
                    joaVarArr2 = joaVarArr;
                    z = z2;
                    str3 = (String) b.i(serialDescriptor, 2, uhi.a, str3);
                    i |= 4;
                    break;
                case 3:
                    joaVarArr2 = joaVarArr;
                    z = z2;
                    str4 = (String) b.i(serialDescriptor, 3, uhi.a, str4);
                    i |= 8;
                    break;
                case 4:
                    joaVarArr2 = joaVarArr;
                    z = z2;
                    num = (Integer) b.i(serialDescriptor, 4, a7a.a, num);
                    i |= 16;
                    break;
                case 5:
                    joaVarArr2 = joaVarArr;
                    z = z2;
                    num2 = (Integer) b.i(serialDescriptor, 5, a7a.a, num2);
                    i |= 32;
                    break;
                case 6:
                    joaVarArr2 = joaVarArr;
                    z = z2;
                    l = (Long) b.i(serialDescriptor, 6, lkb.a, l);
                    i |= 64;
                    break;
                case 7:
                    joaVarArr2 = joaVarArr;
                    z = z2;
                    str = (String) b.i(serialDescriptor, 7, uhi.a, str);
                    i |= 128;
                    break;
                case 8:
                    joaVarArr2 = joaVarArr;
                    z = z2;
                    country = (Country) b.i(serialDescriptor, 8, Country$$serializer.INSTANCE, country);
                    i |= NotificationCompat.FLAG_LOCAL_ONLY;
                    break;
                case 9:
                    joaVarArr2 = joaVarArr;
                    z = z2;
                    fantasyLeagueType = (FantasyLeagueType) b.i(serialDescriptor, 9, (dy4) joaVarArr2[9].getValue(), fantasyLeagueType);
                    i |= 512;
                    break;
                case 10:
                    joaVarArr2 = joaVarArr;
                    z = z2;
                    fantasyLeagueGameType = (FantasyLeagueGameType) b.w(serialDescriptor, 10, (dy4) joaVarArr2[10].getValue(), fantasyLeagueGameType);
                    i |= 1024;
                    break;
                default:
                    yhk.e(o);
                    return null;
            }
            joaVarArr = joaVarArr2;
            z2 = z;
        }
        b.c(serialDescriptor);
        return new FantasyLeague(i, i2, str2, str3, str4, num, num2, l, str, country, fantasyLeagueType, fantasyLeagueGameType, (t5h) null);
    }

    @Override // defpackage.dy4
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull FantasyLeague value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        wf3 b = encoder.b(serialDescriptor);
        FantasyLeague.write$Self$model_release(value, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.iw8
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
