package com.sofascore.model.newNetwork.newRankings;

import androidx.core.app.NotificationCompat;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.ironsource.U3;
import com.sofascore.model.mvvm.model.Category;
import com.sofascore.model.mvvm.model.Category$$serializer;
import com.sofascore.model.mvvm.model.Gender;
import com.sofascore.model.mvvm.model.GenderSerializer;
import com.sofascore.model.mvvm.model.Sport;
import com.sofascore.model.mvvm.model.Sport$$serializer;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.model.mvvm.model.UniqueTournament$$serializer;
import com.sofascore.model.network.response.SearchResponseKt;
import defpackage.a7a;
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
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/sofascore/model/newNetwork/newRankings/RankingType.$serializer", "Liw8;", "Lcom/sofascore/model/newNetwork/newRankings/RankingType;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", U3.i.X, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/sofascore/model/newNetwork/newRankings/RankingType;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/sofascore/model/newNetwork/newRankings/RankingType;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
@wx4
/* loaded from: classes5.dex */
public final /* synthetic */ class RankingType$$serializer implements iw8 {

    @NotNull
    public static final RankingType$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        RankingType$$serializer rankingType$$serializer = new RankingType$$serializer();
        INSTANCE = rankingType$$serializer;
        uye uyeVar = new uye("com.sofascore.model.newNetwork.newRankings.RankingType", rankingType$$serializer, 9);
        uyeVar.j("id", false);
        uyeVar.j("slug", false);
        uyeVar.j(SearchResponseKt.SPORT_ENTITY, false);
        uyeVar.j("category", false);
        uyeVar.j(SearchResponseKt.LEAGUE_ENTITY, false);
        uyeVar.j("name", false);
        uyeVar.j(InneractiveMediationDefs.KEY_GENDER, false);
        uyeVar.j("weightClass", false);
        uyeVar.j("lastUpdatedTimestamp", false);
        descriptor = uyeVar;
    }

    private RankingType$$serializer() {
    }

    @Override // defpackage.iw8
    @NotNull
    public final KSerializer[] childSerializers() {
        uhi uhiVar = uhi.a;
        return new KSerializer[]{a7a.a, uhiVar, Sport$$serializer.INSTANCE, l98.W(Category$$serializer.INSTANCE), l98.W(UniqueTournament$$serializer.INSTANCE), l98.W(uhiVar), l98.W(GenderSerializer.INSTANCE), l98.W(uhiVar), l98.W(lkb.a)};
    }

    @Override // defpackage.dy4
    @NotNull
    public final RankingType deserialize(@NotNull Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        uf3 b = decoder.b(serialDescriptor);
        RankingType rankingType = null;
        boolean z = true;
        Long l = null;
        String str = null;
        Sport sport = null;
        Category category = null;
        UniqueTournament uniqueTournament = null;
        String str2 = null;
        Gender gender = null;
        String str3 = null;
        int i = 0;
        int i2 = 0;
        while (z) {
            int o = b.o(serialDescriptor);
            switch (o) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    i2 = b.l(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    str = b.n(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    sport = (Sport) b.w(serialDescriptor, 2, Sport$$serializer.INSTANCE, sport);
                    i |= 4;
                    break;
                case 3:
                    category = (Category) b.i(serialDescriptor, 3, Category$$serializer.INSTANCE, category);
                    i |= 8;
                    break;
                case 4:
                    uniqueTournament = (UniqueTournament) b.i(serialDescriptor, 4, UniqueTournament$$serializer.INSTANCE, uniqueTournament);
                    i |= 16;
                    break;
                case 5:
                    str2 = (String) b.i(serialDescriptor, 5, uhi.a, str2);
                    i |= 32;
                    break;
                case 6:
                    gender = (Gender) b.i(serialDescriptor, 6, GenderSerializer.INSTANCE, gender);
                    i |= 64;
                    break;
                case 7:
                    str3 = (String) b.i(serialDescriptor, 7, uhi.a, str3);
                    i |= 128;
                    break;
                case 8:
                    l = (Long) b.i(serialDescriptor, 8, lkb.a, l);
                    i |= NotificationCompat.FLAG_LOCAL_ONLY;
                    break;
                default:
                    yhk.e(o);
                    return rankingType;
            }
            rankingType = null;
        }
        b.c(serialDescriptor);
        return new RankingType(i, i2, str, sport, category, uniqueTournament, str2, gender, str3, l, null);
    }

    @Override // defpackage.dy4
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull RankingType value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        wf3 b = encoder.b(serialDescriptor);
        RankingType.write$Self$model_release(value, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.iw8
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
