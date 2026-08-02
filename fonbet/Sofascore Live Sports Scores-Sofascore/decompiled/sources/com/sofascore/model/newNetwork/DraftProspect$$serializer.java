package com.sofascore.model.newNetwork;

import com.ironsource.U3;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.Player$$serializer;
import com.sofascore.model.mvvm.model.Team;
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
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/sofascore/model/newNetwork/DraftProspect.$serializer", "Liw8;", "Lcom/sofascore/model/newNetwork/DraftProspect;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", U3.i.X, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/sofascore/model/newNetwork/DraftProspect;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/sofascore/model/newNetwork/DraftProspect;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
@wx4
/* loaded from: classes5.dex */
public final /* synthetic */ class DraftProspect$$serializer implements iw8 {

    @NotNull
    public static final DraftProspect$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        DraftProspect$$serializer draftProspect$$serializer = new DraftProspect$$serializer();
        INSTANCE = draftProspect$$serializer;
        uye uyeVar = new uye("com.sofascore.model.newNetwork.DraftProspect", draftProspect$$serializer, 8);
        uyeVar.j("firstName", false);
        uyeVar.j("lastName", false);
        uyeVar.j("teamName", false);
        uyeVar.j("isTopProspect", false);
        uyeVar.j("position", false);
        uyeVar.j("team", false);
        uyeVar.j(SearchResponseKt.PLAYER_ENTITY, false);
        uyeVar.j("id", false);
        descriptor = uyeVar;
    }

    private DraftProspect$$serializer() {
    }

    @Override // defpackage.iw8
    @NotNull
    public final KSerializer[] childSerializers() {
        joa[] joaVarArr;
        joaVarArr = DraftProspect.$childSerializers;
        uhi uhiVar = uhi.a;
        return new KSerializer[]{uhiVar, uhiVar, l98.W(uhiVar), gz1.a, uhiVar, l98.W((KSerializer) joaVarArr[5].getValue()), l98.W(Player$$serializer.INSTANCE), a7a.a};
    }

    @Override // defpackage.dy4
    @NotNull
    public final DraftProspect deserialize(@NotNull Decoder decoder) {
        joa[] joaVarArr;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        uf3 b = decoder.b(serialDescriptor);
        joaVarArr = DraftProspect.$childSerializers;
        DraftProspect draftProspect = null;
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        int i2 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Team team = null;
        Player player = null;
        while (z) {
            int o = b.o(serialDescriptor);
            switch (o) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    str = b.n(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    str2 = b.n(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    str3 = (String) b.i(serialDescriptor, 2, uhi.a, str3);
                    i |= 4;
                    break;
                case 3:
                    z2 = b.B(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    str4 = b.n(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    team = (Team) b.i(serialDescriptor, 5, (dy4) joaVarArr[5].getValue(), team);
                    i |= 32;
                    break;
                case 6:
                    player = (Player) b.i(serialDescriptor, 6, Player$$serializer.INSTANCE, player);
                    i |= 64;
                    break;
                case 7:
                    i2 = b.l(serialDescriptor, 7);
                    i |= 128;
                    continue;
                default:
                    yhk.e(o);
                    return draftProspect;
            }
            draftProspect = null;
        }
        b.c(serialDescriptor);
        return new DraftProspect(i, str, str2, str3, z2, str4, team, player, i2, null);
    }

    @Override // defpackage.dy4
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull DraftProspect value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        wf3 b = encoder.b(serialDescriptor);
        DraftProspect.write$Self$model_release(value, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.iw8
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
