package com.sofascore.model.crowdsourcing;

import androidx.core.app.NotificationCompat;
import com.ironsource.U3;
import com.sofascore.model.crowdsourcing.CrowdsourcingIncidentType;
import com.sofascore.model.crowdsourcing.EventSuggest;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.Player$$serializer;
import com.sofascore.model.network.response.SearchResponseKt;
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
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/sofascore/model/crowdsourcing/EventSuggest.IncidentSuggest.CardSuggest.$serializer", "Liw8;", "Lcom/sofascore/model/crowdsourcing/EventSuggest$IncidentSuggest$CardSuggest;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", U3.i.X, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/sofascore/model/crowdsourcing/EventSuggest$IncidentSuggest$CardSuggest;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/sofascore/model/crowdsourcing/EventSuggest$IncidentSuggest$CardSuggest;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
@wx4
/* loaded from: classes5.dex */
public final /* synthetic */ class EventSuggest$IncidentSuggest$CardSuggest$$serializer implements iw8 {

    @NotNull
    public static final EventSuggest$IncidentSuggest$CardSuggest$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        EventSuggest$IncidentSuggest$CardSuggest$$serializer eventSuggest$IncidentSuggest$CardSuggest$$serializer = new EventSuggest$IncidentSuggest$CardSuggest$$serializer();
        INSTANCE = eventSuggest$IncidentSuggest$CardSuggest$$serializer;
        uye uyeVar = new uye("eventCardSuggest", eventSuggest$IncidentSuggest$CardSuggest$$serializer, 10);
        uyeVar.j("id", false);
        uyeVar.j("status", false);
        uyeVar.j("validated", false);
        uyeVar.j(SearchResponseKt.PLAYER_ENTITY, false);
        uyeVar.j("name", false);
        uyeVar.j("cardType", false);
        uyeVar.j("playerTeam", false);
        uyeVar.j("time", false);
        uyeVar.j("addedTime", false);
        uyeVar.j("applied", false);
        descriptor = uyeVar;
    }

    private EventSuggest$IncidentSuggest$CardSuggest$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.iw8
    @NotNull
    public final KSerializer[] childSerializers() {
        joa[] joaVarArr;
        joaVarArr = EventSuggest.IncidentSuggest.CardSuggest.$childSerializers;
        a7a a7aVar = a7a.a;
        gz1 gz1Var = gz1.a;
        return new KSerializer[]{a7aVar, joaVarArr[1].getValue(), gz1Var, l98.W(Player$$serializer.INSTANCE), l98.W(uhi.a), joaVarArr[5].getValue(), joaVarArr[6].getValue(), l98.W(a7aVar), l98.W(a7aVar), l98.W(gz1Var)};
    }

    @Override // defpackage.dy4
    @NotNull
    public final EventSuggest.IncidentSuggest.CardSuggest deserialize(@NotNull Decoder decoder) {
        joa[] joaVarArr;
        joa[] joaVarArr2;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        uf3 b = decoder.b(serialDescriptor);
        joaVarArr = EventSuggest.IncidentSuggest.CardSuggest.$childSerializers;
        Boolean bool = null;
        Integer num = null;
        boolean z = true;
        Integer num2 = null;
        int i = 0;
        int i2 = 0;
        SuggestStatus suggestStatus = null;
        boolean z2 = false;
        Player player = null;
        String str = null;
        CrowdsourcingIncidentType.Card card = null;
        TeamSide teamSide = null;
        while (z) {
            int o = b.o(serialDescriptor);
            switch (o) {
                case -1:
                    joaVarArr2 = joaVarArr;
                    z = false;
                    break;
                case 0:
                    joaVarArr2 = joaVarArr;
                    i2 = b.l(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    joaVarArr2 = joaVarArr;
                    suggestStatus = (SuggestStatus) b.w(serialDescriptor, 1, (dy4) joaVarArr2[1].getValue(), suggestStatus);
                    i |= 2;
                    break;
                case 2:
                    joaVarArr2 = joaVarArr;
                    z2 = b.B(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    joaVarArr2 = joaVarArr;
                    player = (Player) b.i(serialDescriptor, 3, Player$$serializer.INSTANCE, player);
                    i |= 8;
                    break;
                case 4:
                    joaVarArr2 = joaVarArr;
                    str = (String) b.i(serialDescriptor, 4, uhi.a, str);
                    i |= 16;
                    break;
                case 5:
                    joaVarArr2 = joaVarArr;
                    card = (CrowdsourcingIncidentType.Card) b.w(serialDescriptor, 5, (dy4) joaVarArr2[5].getValue(), card);
                    i |= 32;
                    break;
                case 6:
                    joaVarArr2 = joaVarArr;
                    teamSide = (TeamSide) b.w(serialDescriptor, 6, (dy4) joaVarArr2[6].getValue(), teamSide);
                    i |= 64;
                    break;
                case 7:
                    joaVarArr2 = joaVarArr;
                    num2 = (Integer) b.i(serialDescriptor, 7, a7a.a, num2);
                    i |= 128;
                    break;
                case 8:
                    joaVarArr2 = joaVarArr;
                    num = (Integer) b.i(serialDescriptor, 8, a7a.a, num);
                    i |= NotificationCompat.FLAG_LOCAL_ONLY;
                    break;
                case 9:
                    joaVarArr2 = joaVarArr;
                    bool = (Boolean) b.i(serialDescriptor, 9, gz1.a, bool);
                    i |= 512;
                    break;
                default:
                    yhk.e(o);
                    return null;
            }
            joaVarArr = joaVarArr2;
        }
        b.c(serialDescriptor);
        return new EventSuggest.IncidentSuggest.CardSuggest(i, i2, suggestStatus, z2, player, str, card, teamSide, num2, num, bool, null);
    }

    @Override // defpackage.dy4
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull EventSuggest.IncidentSuggest.CardSuggest value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        wf3 b = encoder.b(serialDescriptor);
        EventSuggest.IncidentSuggest.CardSuggest.write$Self$model_release(value, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.iw8
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
